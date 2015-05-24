// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/shadowgame/rpg/modules/protocol/dto/RequestDto_PROTO.proto

package com.shadowgame.rpg.modules.protobuf.dto;

public final class RequestDtoPROTO {
  private RequestDtoPROTO() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface RequestDtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional int32 sn = 1;
    /**
     * <code>optional int32 sn = 1;</code>
     *
     * <pre>
     **
     * 请求序号
     * </pre>
     */
    boolean hasSn();
    /**
     * <code>optional int32 sn = 1;</code>
     *
     * <pre>
     **
     * 请求序号
     * </pre>
     */
    int getSn();

    // optional string service = 2;
    /**
     * <code>optional string service = 2;</code>
     *
     * <pre>
     **
     * 服务类
     * </pre>
     */
    boolean hasService();
    /**
     * <code>optional string service = 2;</code>
     *
     * <pre>
     **
     * 服务类
     * </pre>
     */
    java.lang.String getService();
    /**
     * <code>optional string service = 2;</code>
     *
     * <pre>
     **
     * 服务类
     * </pre>
     */
    com.google.protobuf.ByteString
        getServiceBytes();

    // optional string method = 3;
    /**
     * <code>optional string method = 3;</code>
     *
     * <pre>
     **
     * 服务类中的方法
     * </pre>
     */
    boolean hasMethod();
    /**
     * <code>optional string method = 3;</code>
     *
     * <pre>
     **
     * 服务类中的方法
     * </pre>
     */
    java.lang.String getMethod();
    /**
     * <code>optional string method = 3;</code>
     *
     * <pre>
     **
     * 服务类中的方法
     * </pre>
     */
    com.google.protobuf.ByteString
        getMethodBytes();

    // optional string params = 4;
    /**
     * <code>optional string params = 4;</code>
     *
     * <pre>
     **
     * 参数列表:json数组，按照service方法的参数个数及类型一一匹配
     * </pre>
     */
    boolean hasParams();
    /**
     * <code>optional string params = 4;</code>
     *
     * <pre>
     **
     * 参数列表:json数组，按照service方法的参数个数及类型一一匹配
     * </pre>
     */
    java.lang.String getParams();
    /**
     * <code>optional string params = 4;</code>
     *
     * <pre>
     **
     * 参数列表:json数组，按照service方法的参数个数及类型一一匹配
     * </pre>
     */
    com.google.protobuf.ByteString
        getParamsBytes();
  }
  /**
   * Protobuf type {@code com.shadowgame.rpg.modules.protocol.dto.RequestDto}
   *
   * <pre>
   **
   * 请求
   * @author wcj10051891@gmail.com
   *字段列表:
   * //请求序号
   *int sn
   * //服务类
   *java.lang.String service
   * //服务类中的方法
   *java.lang.String method
   * //参数列表:json数组，按照service方法的参数个数及类型一一匹配
   *java.lang.String params
   * </pre>
   */
  public static final class RequestDto extends
      com.google.protobuf.GeneratedMessage
      implements RequestDtoOrBuilder {
    // Use RequestDto.newBuilder() to construct.
    private RequestDto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private RequestDto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final RequestDto defaultInstance;
    public static RequestDto getDefaultInstance() {
      return defaultInstance;
    }

    public RequestDto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private RequestDto(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
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
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              sn_ = input.readInt32();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              service_ = input.readBytes();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              method_ = input.readBytes();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              params_ = input.readBytes();
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.shadowgame.rpg.modules.protobuf.dto.RequestDtoPROTO.internal_static_com_shadowgame_rpg_modules_protocol_dto_RequestDto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.shadowgame.rpg.modules.protobuf.dto.RequestDtoPROTO.internal_static_com_shadowgame_rpg_modules_protocol_dto_RequestDto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.shadowgame.rpg.modules.protobuf.dto.RequestDtoPROTO.RequestDto.class, com.shadowgame.rpg.modules.protobuf.dto.RequestDtoPROTO.RequestDto.Builder.class);
    }

    public static com.google.protobuf.Parser<RequestDto> PARSER =
        new com.google.protobuf.AbstractParser<RequestDto>() {
      public RequestDto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RequestDto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<RequestDto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional int32 sn = 1;
    public static final int SN_FIELD_NUMBER = 1;
    private int sn_;
    /**
     * <code>optional int32 sn = 1;</code>
     *
     * <pre>
     **
     * 请求序号
     * </pre>
     */
    public boolean hasSn() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 sn = 1;</code>
     *
     * <pre>
     **
     * 请求序号
     * </pre>
     */
    public int getSn() {
      return sn_;
    }

    // optional string service = 2;
    public static final int SERVICE_FIELD_NUMBER = 2;
    private java.lang.Object service_;
    /**
     * <code>optional string service = 2;</code>
     *
     * <pre>
     **
     * 服务类
     * </pre>
     */
    public boolean hasService() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string service = 2;</code>
     *
     * <pre>
     **
     * 服务类
     * </pre>
     */
    public java.lang.String getService() {
      java.lang.Object ref = service_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          service_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string service = 2;</code>
     *
     * <pre>
     **
     * 服务类
     * </pre>
     */
    public com.google.protobuf.ByteString
        getServiceBytes() {
      java.lang.Object ref = service_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        service_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional string method = 3;
    public static final int METHOD_FIELD_NUMBER = 3;
    private java.lang.Object method_;
    /**
     * <code>optional string method = 3;</code>
     *
     * <pre>
     **
     * 服务类中的方法
     * </pre>
     */
    public boolean hasMethod() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string method = 3;</code>
     *
     * <pre>
     **
     * 服务类中的方法
     * </pre>
     */
    public java.lang.String getMethod() {
      java.lang.Object ref = method_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          method_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string method = 3;</code>
     *
     * <pre>
     **
     * 服务类中的方法
     * </pre>
     */
    public com.google.protobuf.ByteString
        getMethodBytes() {
      java.lang.Object ref = method_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        method_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    // optional string params = 4;
    public static final int PARAMS_FIELD_NUMBER = 4;
    private java.lang.Object params_;
    /**
     * <code>optional string params = 4;</code>
     *
     * <pre>
     **
     * 参数列表:json数组，按照service方法的参数个数及类型一一匹配
     * </pre>
     */
    public boolean hasParams() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional string params = 4;</code>
     *
     * <pre>
     **
     * 参数列表:json数组，按照service方法的参数个数及类型一一匹配
     * </pre>
     */
    public java.lang.String getParams() {
      java.lang.Object ref = params_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          params_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string params = 4;</code>
     *
     * <pre>
     **
     * 参数列表:json数组，按照service方法的参数个数及类型一一匹配
     * </pre>
     */
    public com.google.protobuf.ByteString
        getParamsBytes() {
      java.lang.Object ref = params_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        params_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      sn_ = 0;
      service_ = "";
      method_ = "";
      params_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, sn_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getServiceBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getMethodBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getParamsBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, sn_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getServiceBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getMethodBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getParamsBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.shadowgame.rpg.modules.protobuf.dto.RequestDtoPROTO.RequestDto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.shadowgame.rpg.modules.protobuf.dto.RequestDtoPROTO.RequestDto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.shadowgame.rpg.modules.protobuf.dto.RequestDtoPROTO.RequestDto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.shadowgame.rpg.modules.protobuf.dto.RequestDtoPROTO.RequestDto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.shadowgame.rpg.modules.protobuf.dto.RequestDtoPROTO.RequestDto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.shadowgame.rpg.modules.protobuf.dto.RequestDtoPROTO.RequestDto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.shadowgame.rpg.modules.protobuf.dto.RequestDtoPROTO.RequestDto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.shadowgame.rpg.modules.protobuf.dto.RequestDtoPROTO.RequestDto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.shadowgame.rpg.modules.protobuf.dto.RequestDtoPROTO.RequestDto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.shadowgame.rpg.modules.protobuf.dto.RequestDtoPROTO.RequestDto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.shadowgame.rpg.modules.protobuf.dto.RequestDtoPROTO.RequestDto prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code com.shadowgame.rpg.modules.protocol.dto.RequestDto}
     *
     * <pre>
     **
     * 请求
     * @author wcj10051891@gmail.com
     *字段列表:
     * //请求序号
     *int sn
     * //服务类
     *java.lang.String service
     * //服务类中的方法
     *java.lang.String method
     * //参数列表:json数组，按照service方法的参数个数及类型一一匹配
     *java.lang.String params
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.shadowgame.rpg.modules.protobuf.dto.RequestDtoPROTO.RequestDtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.shadowgame.rpg.modules.protobuf.dto.RequestDtoPROTO.internal_static_com_shadowgame_rpg_modules_protocol_dto_RequestDto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.shadowgame.rpg.modules.protobuf.dto.RequestDtoPROTO.internal_static_com_shadowgame_rpg_modules_protocol_dto_RequestDto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.shadowgame.rpg.modules.protobuf.dto.RequestDtoPROTO.RequestDto.class, com.shadowgame.rpg.modules.protobuf.dto.RequestDtoPROTO.RequestDto.Builder.class);
      }

      // Construct using com.shadowgame.rpg.modules.protobuf.dto.RequestDtoPROTO.RequestDto.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        sn_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        service_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        method_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        params_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.shadowgame.rpg.modules.protobuf.dto.RequestDtoPROTO.internal_static_com_shadowgame_rpg_modules_protocol_dto_RequestDto_descriptor;
      }

      public com.shadowgame.rpg.modules.protobuf.dto.RequestDtoPROTO.RequestDto getDefaultInstanceForType() {
        return com.shadowgame.rpg.modules.protobuf.dto.RequestDtoPROTO.RequestDto.getDefaultInstance();
      }

      public com.shadowgame.rpg.modules.protobuf.dto.RequestDtoPROTO.RequestDto build() {
        com.shadowgame.rpg.modules.protobuf.dto.RequestDtoPROTO.RequestDto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.shadowgame.rpg.modules.protobuf.dto.RequestDtoPROTO.RequestDto buildPartial() {
        com.shadowgame.rpg.modules.protobuf.dto.RequestDtoPROTO.RequestDto result = new com.shadowgame.rpg.modules.protobuf.dto.RequestDtoPROTO.RequestDto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.sn_ = sn_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.service_ = service_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.method_ = method_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.params_ = params_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.shadowgame.rpg.modules.protobuf.dto.RequestDtoPROTO.RequestDto) {
          return mergeFrom((com.shadowgame.rpg.modules.protobuf.dto.RequestDtoPROTO.RequestDto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.shadowgame.rpg.modules.protobuf.dto.RequestDtoPROTO.RequestDto other) {
        if (other == com.shadowgame.rpg.modules.protobuf.dto.RequestDtoPROTO.RequestDto.getDefaultInstance()) return this;
        if (other.hasSn()) {
          setSn(other.getSn());
        }
        if (other.hasService()) {
          bitField0_ |= 0x00000002;
          service_ = other.service_;
          onChanged();
        }
        if (other.hasMethod()) {
          bitField0_ |= 0x00000004;
          method_ = other.method_;
          onChanged();
        }
        if (other.hasParams()) {
          bitField0_ |= 0x00000008;
          params_ = other.params_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.shadowgame.rpg.modules.protobuf.dto.RequestDtoPROTO.RequestDto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.shadowgame.rpg.modules.protobuf.dto.RequestDtoPROTO.RequestDto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional int32 sn = 1;
      private int sn_ ;
      /**
       * <code>optional int32 sn = 1;</code>
       *
       * <pre>
       **
       * 请求序号
       * </pre>
       */
      public boolean hasSn() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 sn = 1;</code>
       *
       * <pre>
       **
       * 请求序号
       * </pre>
       */
      public int getSn() {
        return sn_;
      }
      /**
       * <code>optional int32 sn = 1;</code>
       *
       * <pre>
       **
       * 请求序号
       * </pre>
       */
      public Builder setSn(int value) {
        bitField0_ |= 0x00000001;
        sn_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 sn = 1;</code>
       *
       * <pre>
       **
       * 请求序号
       * </pre>
       */
      public Builder clearSn() {
        bitField0_ = (bitField0_ & ~0x00000001);
        sn_ = 0;
        onChanged();
        return this;
      }

      // optional string service = 2;
      private java.lang.Object service_ = "";
      /**
       * <code>optional string service = 2;</code>
       *
       * <pre>
       **
       * 服务类
       * </pre>
       */
      public boolean hasService() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string service = 2;</code>
       *
       * <pre>
       **
       * 服务类
       * </pre>
       */
      public java.lang.String getService() {
        java.lang.Object ref = service_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          service_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string service = 2;</code>
       *
       * <pre>
       **
       * 服务类
       * </pre>
       */
      public com.google.protobuf.ByteString
          getServiceBytes() {
        java.lang.Object ref = service_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          service_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string service = 2;</code>
       *
       * <pre>
       **
       * 服务类
       * </pre>
       */
      public Builder setService(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        service_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string service = 2;</code>
       *
       * <pre>
       **
       * 服务类
       * </pre>
       */
      public Builder clearService() {
        bitField0_ = (bitField0_ & ~0x00000002);
        service_ = getDefaultInstance().getService();
        onChanged();
        return this;
      }
      /**
       * <code>optional string service = 2;</code>
       *
       * <pre>
       **
       * 服务类
       * </pre>
       */
      public Builder setServiceBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        service_ = value;
        onChanged();
        return this;
      }

      // optional string method = 3;
      private java.lang.Object method_ = "";
      /**
       * <code>optional string method = 3;</code>
       *
       * <pre>
       **
       * 服务类中的方法
       * </pre>
       */
      public boolean hasMethod() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional string method = 3;</code>
       *
       * <pre>
       **
       * 服务类中的方法
       * </pre>
       */
      public java.lang.String getMethod() {
        java.lang.Object ref = method_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          method_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string method = 3;</code>
       *
       * <pre>
       **
       * 服务类中的方法
       * </pre>
       */
      public com.google.protobuf.ByteString
          getMethodBytes() {
        java.lang.Object ref = method_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          method_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string method = 3;</code>
       *
       * <pre>
       **
       * 服务类中的方法
       * </pre>
       */
      public Builder setMethod(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        method_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string method = 3;</code>
       *
       * <pre>
       **
       * 服务类中的方法
       * </pre>
       */
      public Builder clearMethod() {
        bitField0_ = (bitField0_ & ~0x00000004);
        method_ = getDefaultInstance().getMethod();
        onChanged();
        return this;
      }
      /**
       * <code>optional string method = 3;</code>
       *
       * <pre>
       **
       * 服务类中的方法
       * </pre>
       */
      public Builder setMethodBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        method_ = value;
        onChanged();
        return this;
      }

      // optional string params = 4;
      private java.lang.Object params_ = "";
      /**
       * <code>optional string params = 4;</code>
       *
       * <pre>
       **
       * 参数列表:json数组，按照service方法的参数个数及类型一一匹配
       * </pre>
       */
      public boolean hasParams() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional string params = 4;</code>
       *
       * <pre>
       **
       * 参数列表:json数组，按照service方法的参数个数及类型一一匹配
       * </pre>
       */
      public java.lang.String getParams() {
        java.lang.Object ref = params_;
        if (!(ref instanceof java.lang.String)) {
          java.lang.String s = ((com.google.protobuf.ByteString) ref)
              .toStringUtf8();
          params_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string params = 4;</code>
       *
       * <pre>
       **
       * 参数列表:json数组，按照service方法的参数个数及类型一一匹配
       * </pre>
       */
      public com.google.protobuf.ByteString
          getParamsBytes() {
        java.lang.Object ref = params_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          params_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string params = 4;</code>
       *
       * <pre>
       **
       * 参数列表:json数组，按照service方法的参数个数及类型一一匹配
       * </pre>
       */
      public Builder setParams(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        params_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string params = 4;</code>
       *
       * <pre>
       **
       * 参数列表:json数组，按照service方法的参数个数及类型一一匹配
       * </pre>
       */
      public Builder clearParams() {
        bitField0_ = (bitField0_ & ~0x00000008);
        params_ = getDefaultInstance().getParams();
        onChanged();
        return this;
      }
      /**
       * <code>optional string params = 4;</code>
       *
       * <pre>
       **
       * 参数列表:json数组，按照service方法的参数个数及类型一一匹配
       * </pre>
       */
      public Builder setParamsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        params_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.shadowgame.rpg.modules.protocol.dto.RequestDto)
    }

    static {
      defaultInstance = new RequestDto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.shadowgame.rpg.modules.protocol.dto.RequestDto)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_shadowgame_rpg_modules_protocol_dto_RequestDto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_shadowgame_rpg_modules_protocol_dto_RequestDto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>com/shadowgame/rpg/modules/protocol/dt" +
      "o/RequestDto_PROTO.proto\022\'com.shadowgame" +
      ".rpg.modules.protocol.dto\"I\n\nRequestDto\022" +
      "\n\n\002sn\030\001 \001(\005\022\017\n\007service\030\002 \001(\t\022\016\n\006method\030\003" +
      " \001(\t\022\016\n\006params\030\004 \001(\tB)\n\'com.shadowgame.r" +
      "pg.modules.protobuf.dto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_shadowgame_rpg_modules_protocol_dto_RequestDto_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_shadowgame_rpg_modules_protocol_dto_RequestDto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_shadowgame_rpg_modules_protocol_dto_RequestDto_descriptor,
              new java.lang.String[] { "Sn", "Service", "Method", "Params", });
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
