// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: userProto.proto

package project.grpc.pd.protos;

/**
 * <pre>
 * Responses
 * </pre>
 *
 * Protobuf type {@code usuarioProto.UserResponse}
 */
public  final class UserResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:usuarioProto.UserResponse)
    UserResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UserResponse.newBuilder() to construct.
  private UserResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UserResponse() {
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UserResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            project.grpc.pd.protos.Usuario.Builder subBuilder = null;
            if (user_ != null) {
              subBuilder = user_.toBuilder();
            }
            user_ = input.readMessage(project.grpc.pd.protos.Usuario.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(user_);
              user_ = subBuilder.buildPartial();
            }

            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return project.grpc.pd.protos.userProtos.internal_static_usuarioProto_UserResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return project.grpc.pd.protos.userProtos.internal_static_usuarioProto_UserResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            project.grpc.pd.protos.UserResponse.class, project.grpc.pd.protos.UserResponse.Builder.class);
  }

  public static final int USER_FIELD_NUMBER = 1;
  private project.grpc.pd.protos.Usuario user_;
  /**
   * <code>.usuarioProto.Usuario user = 1;</code>
   */
  public boolean hasUser() {
    return user_ != null;
  }
  /**
   * <code>.usuarioProto.Usuario user = 1;</code>
   */
  public project.grpc.pd.protos.Usuario getUser() {
    return user_ == null ? project.grpc.pd.protos.Usuario.getDefaultInstance() : user_;
  }
  /**
   * <code>.usuarioProto.Usuario user = 1;</code>
   */
  public project.grpc.pd.protos.UsuarioOrBuilder getUserOrBuilder() {
    return getUser();
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (user_ != null) {
      output.writeMessage(1, getUser());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (user_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getUser());
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof project.grpc.pd.protos.UserResponse)) {
      return super.equals(obj);
    }
    project.grpc.pd.protos.UserResponse other = (project.grpc.pd.protos.UserResponse) obj;

    boolean result = true;
    result = result && (hasUser() == other.hasUser());
    if (hasUser()) {
      result = result && getUser()
          .equals(other.getUser());
    }
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasUser()) {
      hash = (37 * hash) + USER_FIELD_NUMBER;
      hash = (53 * hash) + getUser().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static project.grpc.pd.protos.UserResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static project.grpc.pd.protos.UserResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static project.grpc.pd.protos.UserResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static project.grpc.pd.protos.UserResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static project.grpc.pd.protos.UserResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static project.grpc.pd.protos.UserResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static project.grpc.pd.protos.UserResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static project.grpc.pd.protos.UserResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static project.grpc.pd.protos.UserResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static project.grpc.pd.protos.UserResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static project.grpc.pd.protos.UserResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static project.grpc.pd.protos.UserResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(project.grpc.pd.protos.UserResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * <pre>
   * Responses
   * </pre>
   *
   * Protobuf type {@code usuarioProto.UserResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:usuarioProto.UserResponse)
      project.grpc.pd.protos.UserResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return project.grpc.pd.protos.userProtos.internal_static_usuarioProto_UserResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return project.grpc.pd.protos.userProtos.internal_static_usuarioProto_UserResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              project.grpc.pd.protos.UserResponse.class, project.grpc.pd.protos.UserResponse.Builder.class);
    }

    // Construct using project.grpc.pd.protos.UserResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (userBuilder_ == null) {
        user_ = null;
      } else {
        user_ = null;
        userBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return project.grpc.pd.protos.userProtos.internal_static_usuarioProto_UserResponse_descriptor;
    }

    @java.lang.Override
    public project.grpc.pd.protos.UserResponse getDefaultInstanceForType() {
      return project.grpc.pd.protos.UserResponse.getDefaultInstance();
    }

    @java.lang.Override
    public project.grpc.pd.protos.UserResponse build() {
      project.grpc.pd.protos.UserResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public project.grpc.pd.protos.UserResponse buildPartial() {
      project.grpc.pd.protos.UserResponse result = new project.grpc.pd.protos.UserResponse(this);
      if (userBuilder_ == null) {
        result.user_ = user_;
      } else {
        result.user_ = userBuilder_.build();
      }
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof project.grpc.pd.protos.UserResponse) {
        return mergeFrom((project.grpc.pd.protos.UserResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(project.grpc.pd.protos.UserResponse other) {
      if (other == project.grpc.pd.protos.UserResponse.getDefaultInstance()) return this;
      if (other.hasUser()) {
        mergeUser(other.getUser());
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      project.grpc.pd.protos.UserResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (project.grpc.pd.protos.UserResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private project.grpc.pd.protos.Usuario user_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        project.grpc.pd.protos.Usuario, project.grpc.pd.protos.Usuario.Builder, project.grpc.pd.protos.UsuarioOrBuilder> userBuilder_;
    /**
     * <code>.usuarioProto.Usuario user = 1;</code>
     */
    public boolean hasUser() {
      return userBuilder_ != null || user_ != null;
    }
    /**
     * <code>.usuarioProto.Usuario user = 1;</code>
     */
    public project.grpc.pd.protos.Usuario getUser() {
      if (userBuilder_ == null) {
        return user_ == null ? project.grpc.pd.protos.Usuario.getDefaultInstance() : user_;
      } else {
        return userBuilder_.getMessage();
      }
    }
    /**
     * <code>.usuarioProto.Usuario user = 1;</code>
     */
    public Builder setUser(project.grpc.pd.protos.Usuario value) {
      if (userBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        user_ = value;
        onChanged();
      } else {
        userBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.usuarioProto.Usuario user = 1;</code>
     */
    public Builder setUser(
        project.grpc.pd.protos.Usuario.Builder builderForValue) {
      if (userBuilder_ == null) {
        user_ = builderForValue.build();
        onChanged();
      } else {
        userBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.usuarioProto.Usuario user = 1;</code>
     */
    public Builder mergeUser(project.grpc.pd.protos.Usuario value) {
      if (userBuilder_ == null) {
        if (user_ != null) {
          user_ =
            project.grpc.pd.protos.Usuario.newBuilder(user_).mergeFrom(value).buildPartial();
        } else {
          user_ = value;
        }
        onChanged();
      } else {
        userBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.usuarioProto.Usuario user = 1;</code>
     */
    public Builder clearUser() {
      if (userBuilder_ == null) {
        user_ = null;
        onChanged();
      } else {
        user_ = null;
        userBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.usuarioProto.Usuario user = 1;</code>
     */
    public project.grpc.pd.protos.Usuario.Builder getUserBuilder() {
      
      onChanged();
      return getUserFieldBuilder().getBuilder();
    }
    /**
     * <code>.usuarioProto.Usuario user = 1;</code>
     */
    public project.grpc.pd.protos.UsuarioOrBuilder getUserOrBuilder() {
      if (userBuilder_ != null) {
        return userBuilder_.getMessageOrBuilder();
      } else {
        return user_ == null ?
            project.grpc.pd.protos.Usuario.getDefaultInstance() : user_;
      }
    }
    /**
     * <code>.usuarioProto.Usuario user = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        project.grpc.pd.protos.Usuario, project.grpc.pd.protos.Usuario.Builder, project.grpc.pd.protos.UsuarioOrBuilder> 
        getUserFieldBuilder() {
      if (userBuilder_ == null) {
        userBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            project.grpc.pd.protos.Usuario, project.grpc.pd.protos.Usuario.Builder, project.grpc.pd.protos.UsuarioOrBuilder>(
                getUser(),
                getParentForChildren(),
                isClean());
        user_ = null;
      }
      return userBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:usuarioProto.UserResponse)
  }

  // @@protoc_insertion_point(class_scope:usuarioProto.UserResponse)
  private static final project.grpc.pd.protos.UserResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new project.grpc.pd.protos.UserResponse();
  }

  public static project.grpc.pd.protos.UserResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserResponse>
      PARSER = new com.google.protobuf.AbstractParser<UserResponse>() {
    @java.lang.Override
    public UserResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UserResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UserResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public project.grpc.pd.protos.UserResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
