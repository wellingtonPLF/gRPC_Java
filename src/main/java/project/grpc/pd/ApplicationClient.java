package project.grpc.pd;


import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;
import project.grpc.pd.protos.UserIdRequest;
import project.grpc.pd.protos.UserResponse;
import project.grpc.pd.protos.UsuarioProtoGrpc;

public class ApplicationClient {
  private static final Logger logger = Logger.getLogger(ApplicationClient.class.getName());

  private final UsuarioProtoGrpc.UsuarioProtoBlockingStub blockingStub;

  /** Construct client for accessing RouteGuide server using the existing channel. */
  public ApplicationClient(Channel channel) {
    blockingStub = UsuarioProtoGrpc.newBlockingStub(channel);
  }

  /**
   * Blocking unary call example.  Calls getHello and prints the response.
   */
  public void getUser(String first, String second) {
    info("*** Method: {0} {1}", first, second);
    UserIdRequest userRequest = UserIdRequest.newBuilder().setId(1).build();
    UserResponse userResponse = null;
    try {
      userResponse = this.blockingStub.usuarioPorId(userRequest);
      Integer idResponse = userResponse.getUser().getId();
      String nomeResponse = userResponse.getUser().getNome();
      info("\n=======================\nUser [ \n id: {0}, \n nome: {1}\n]"
      		+ "\n=======================", idResponse, nomeResponse);
    } catch (StatusRuntimeException e) {
      warning("RPC failed: {0}", e.getStatus());
    }
  }

  /** Issues several different requests and then exits. */
  public static void main(String[] args) throws InterruptedException {
    String target = "localhost:3335";
    if (args.length > 0) {
      if ("--help".equals(args[0])) {
        System.err.println("Usage: [target]");
        System.err.println("");
        System.err.println("  target  The server to connect to. Defaults to " + target);
        System.exit(1);
      }
      target = args[0];
    }
    if (args.length > 1) {
    	target = args[1];
    }

    ManagedChannel channel = ManagedChannelBuilder.forTarget(target).usePlaintext().build();
    try {
      ApplicationClient client = new ApplicationClient(channel);
      // Looking for a valid feature
      client.getUser("Is", "running...");

    } finally {
      channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
    }
  }

  private void info(String msg, Object... params) {
    logger.log(Level.INFO, msg, params);
  }

  private void warning(String msg, Object... params) {
    logger.log(Level.WARNING, msg, params);
  }
}