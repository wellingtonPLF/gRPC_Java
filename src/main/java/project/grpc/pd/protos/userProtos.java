// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: userProto.proto

package project.grpc.pd.protos;

public final class userProtos {
  private userProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_usuarioProto_Usuario_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_usuarioProto_Usuario_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_usuarioProto_UserIdRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_usuarioProto_UserIdRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_usuarioProto_UserResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_usuarioProto_UserResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017userProto.proto\022\014usuarioProto\"#\n\007Usuar" +
      "io\022\n\n\002id\030\001 \001(\005\022\014\n\004nome\030\002 \001(\t\"\033\n\rUserIdRe" +
      "quest\022\n\n\002id\030\001 \001(\005\"3\n\014UserResponse\022#\n\004use" +
      "r\030\001 \001(\0132\025.usuarioProto.Usuario2Y\n\014Usuari" +
      "oProto\022I\n\014usuarioPorId\022\033.usuarioProto.Us" +
      "erIdRequest\032\032.usuarioProto.UserResponse\"" +
      "\000B&\n\026project.grpc.pd.protosB\nuserProtosP" +
      "\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_usuarioProto_Usuario_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_usuarioProto_Usuario_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_usuarioProto_Usuario_descriptor,
        new java.lang.String[] { "Id", "Nome", });
    internal_static_usuarioProto_UserIdRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_usuarioProto_UserIdRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_usuarioProto_UserIdRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_usuarioProto_UserResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_usuarioProto_UserResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_usuarioProto_UserResponse_descriptor,
        new java.lang.String[] { "User", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
