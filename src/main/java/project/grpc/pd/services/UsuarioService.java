package project.grpc.pd.services;

import io.grpc.stub.StreamObserver;
import project.grpc.pd.protos.Usuario;
import project.grpc.pd.protos.UserIdRequest;
import project.grpc.pd.protos.UserResponse;
import project.grpc.pd.protos.UsuarioProtoGrpc.UsuarioProtoImplBase;

public class UsuarioService extends UsuarioProtoImplBase{
	
	public void usuarioPorId (UserIdRequest idRequest, StreamObserver<UserResponse> userResponse) {
		Integer id = idRequest.getId();
		UserResponse.Builder reply = UserResponse.newBuilder();
		Usuario user = Usuario.newBuilder().setId(id).setNome("Wellington PLF").build();
		reply.setUser(user);
		userResponse.onNext(reply.build());
		userResponse.onCompleted();
	}
}
