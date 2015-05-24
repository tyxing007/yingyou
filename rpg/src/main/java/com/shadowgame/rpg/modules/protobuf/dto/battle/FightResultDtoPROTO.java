// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/shadowgame/rpg/modules/protocol/dto/battle/FightResultDto_PROTO.proto

package com.shadowgame.rpg.modules.protobuf.dto.battle;

public final class FightResultDtoPROTO {
  private FightResultDtoPROTO() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface FightResultDtoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {

    // optional int32 type = 1;
    /**
     * <code>optional int32 type = 1;</code>
     *
     * <pre>
     **
     * 攻击结果类型
     * 1扣血
     * 2闪避
     * 3抵抗
     * 4暴击
     * </pre>
     */
    boolean hasType();
    /**
     * <code>optional int32 type = 1;</code>
     *
     * <pre>
     **
     * 攻击结果类型
     * 1扣血
     * 2闪避
     * 3抵抗
     * 4暴击
     * </pre>
     */
    int getType();

    // optional int32 targetId = 2;
    /**
     * <code>optional int32 targetId = 2;</code>
     *
     * <pre>
     **
     * 目标武将id
     * </pre>
     */
    boolean hasTargetId();
    /**
     * <code>optional int32 targetId = 2;</code>
     *
     * <pre>
     **
     * 目标武将id
     * </pre>
     */
    int getTargetId();

    // optional int32 value = 3;
    /**
     * <code>optional int32 value = 3;</code>
     *
     * <pre>
     **
     * 扣血值
     * </pre>
     */
    boolean hasValue();
    /**
     * <code>optional int32 value = 3;</code>
     *
     * <pre>
     **
     * 扣血值
     * </pre>
     */
    int getValue();
  }
  /**
   * Protobuf type {@code com.shadowgame.rpg.modules.protocol.dto.battle.FightResultDto}
   *
   * <pre>
   **
   * 攻击结果
   * @author wcj10051891@gmail.com
   *字段列表:
   * //攻击结果类型
   *1扣血
   *2闪避
   *3抵抗
   *4暴击
   *int type
   * //目标武将id
   *int targetId
   * //扣血值
   *int value
   * </pre>
   */
  public static final class FightResultDto extends
      com.google.protobuf.GeneratedMessage
      implements FightResultDtoOrBuilder {
    // Use FightResultDto.newBuilder() to construct.
    private FightResultDto(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private FightResultDto(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final FightResultDto defaultInstance;
    public static FightResultDto getDefaultInstance() {
      return defaultInstance;
    }

    public FightResultDto getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private FightResultDto(
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
              type_ = input.readInt32();
              break;
            }
            case 16: {
              bitField0_ |= 0x00000002;
              targetId_ = input.readInt32();
              break;
            }
            case 24: {
              bitField0_ |= 0x00000004;
              value_ = input.readInt32();
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
      return com.shadowgame.rpg.modules.protobuf.dto.battle.FightResultDtoPROTO.internal_static_com_shadowgame_rpg_modules_protocol_dto_battle_FightResultDto_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.shadowgame.rpg.modules.protobuf.dto.battle.FightResultDtoPROTO.internal_static_com_shadowgame_rpg_modules_protocol_dto_battle_FightResultDto_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.shadowgame.rpg.modules.protobuf.dto.battle.FightResultDtoPROTO.FightResultDto.class, com.shadowgame.rpg.modules.protobuf.dto.battle.FightResultDtoPROTO.FightResultDto.Builder.class);
    }

    public static com.google.protobuf.Parser<FightResultDto> PARSER =
        new com.google.protobuf.AbstractParser<FightResultDto>() {
      public FightResultDto parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new FightResultDto(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<FightResultDto> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    // optional int32 type = 1;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    /**
     * <code>optional int32 type = 1;</code>
     *
     * <pre>
     **
     * 攻击结果类型
     * 1扣血
     * 2闪避
     * 3抵抗
     * 4暴击
     * </pre>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>optional int32 type = 1;</code>
     *
     * <pre>
     **
     * 攻击结果类型
     * 1扣血
     * 2闪避
     * 3抵抗
     * 4暴击
     * </pre>
     */
    public int getType() {
      return type_;
    }

    // optional int32 targetId = 2;
    public static final int TARGETID_FIELD_NUMBER = 2;
    private int targetId_;
    /**
     * <code>optional int32 targetId = 2;</code>
     *
     * <pre>
     **
     * 目标武将id
     * </pre>
     */
    public boolean hasTargetId() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional int32 targetId = 2;</code>
     *
     * <pre>
     **
     * 目标武将id
     * </pre>
     */
    public int getTargetId() {
      return targetId_;
    }

    // optional int32 value = 3;
    public static final int VALUE_FIELD_NUMBER = 3;
    private int value_;
    /**
     * <code>optional int32 value = 3;</code>
     *
     * <pre>
     **
     * 扣血值
     * </pre>
     */
    public boolean hasValue() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional int32 value = 3;</code>
     *
     * <pre>
     **
     * 扣血值
     * </pre>
     */
    public int getValue() {
      return value_;
    }

    private void initFields() {
      type_ = 0;
      targetId_ = 0;
      value_ = 0;
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
        output.writeInt32(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeInt32(2, targetId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeInt32(3, value_);
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
          .computeInt32Size(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, targetId_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(3, value_);
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

    public static com.shadowgame.rpg.modules.protobuf.dto.battle.FightResultDtoPROTO.FightResultDto parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.shadowgame.rpg.modules.protobuf.dto.battle.FightResultDtoPROTO.FightResultDto parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.shadowgame.rpg.modules.protobuf.dto.battle.FightResultDtoPROTO.FightResultDto parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.shadowgame.rpg.modules.protobuf.dto.battle.FightResultDtoPROTO.FightResultDto parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.shadowgame.rpg.modules.protobuf.dto.battle.FightResultDtoPROTO.FightResultDto parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.shadowgame.rpg.modules.protobuf.dto.battle.FightResultDtoPROTO.FightResultDto parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.shadowgame.rpg.modules.protobuf.dto.battle.FightResultDtoPROTO.FightResultDto parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.shadowgame.rpg.modules.protobuf.dto.battle.FightResultDtoPROTO.FightResultDto parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.shadowgame.rpg.modules.protobuf.dto.battle.FightResultDtoPROTO.FightResultDto parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.shadowgame.rpg.modules.protobuf.dto.battle.FightResultDtoPROTO.FightResultDto parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.shadowgame.rpg.modules.protobuf.dto.battle.FightResultDtoPROTO.FightResultDto prototype) {
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
     * Protobuf type {@code com.shadowgame.rpg.modules.protocol.dto.battle.FightResultDto}
     *
     * <pre>
     **
     * 攻击结果
     * @author wcj10051891@gmail.com
     *字段列表:
     * //攻击结果类型
     *1扣血
     *2闪避
     *3抵抗
     *4暴击
     *int type
     * //目标武将id
     *int targetId
     * //扣血值
     *int value
     * </pre>
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements com.shadowgame.rpg.modules.protobuf.dto.battle.FightResultDtoPROTO.FightResultDtoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.shadowgame.rpg.modules.protobuf.dto.battle.FightResultDtoPROTO.internal_static_com_shadowgame_rpg_modules_protocol_dto_battle_FightResultDto_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.shadowgame.rpg.modules.protobuf.dto.battle.FightResultDtoPROTO.internal_static_com_shadowgame_rpg_modules_protocol_dto_battle_FightResultDto_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.shadowgame.rpg.modules.protobuf.dto.battle.FightResultDtoPROTO.FightResultDto.class, com.shadowgame.rpg.modules.protobuf.dto.battle.FightResultDtoPROTO.FightResultDto.Builder.class);
      }

      // Construct using com.shadowgame.rpg.modules.protobuf.dto.battle.FightResultDtoPROTO.FightResultDto.newBuilder()
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
        type_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        targetId_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        value_ = 0;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.shadowgame.rpg.modules.protobuf.dto.battle.FightResultDtoPROTO.internal_static_com_shadowgame_rpg_modules_protocol_dto_battle_FightResultDto_descriptor;
      }

      public com.shadowgame.rpg.modules.protobuf.dto.battle.FightResultDtoPROTO.FightResultDto getDefaultInstanceForType() {
        return com.shadowgame.rpg.modules.protobuf.dto.battle.FightResultDtoPROTO.FightResultDto.getDefaultInstance();
      }

      public com.shadowgame.rpg.modules.protobuf.dto.battle.FightResultDtoPROTO.FightResultDto build() {
        com.shadowgame.rpg.modules.protobuf.dto.battle.FightResultDtoPROTO.FightResultDto result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.shadowgame.rpg.modules.protobuf.dto.battle.FightResultDtoPROTO.FightResultDto buildPartial() {
        com.shadowgame.rpg.modules.protobuf.dto.battle.FightResultDtoPROTO.FightResultDto result = new com.shadowgame.rpg.modules.protobuf.dto.battle.FightResultDtoPROTO.FightResultDto(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.targetId_ = targetId_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.value_ = value_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.shadowgame.rpg.modules.protobuf.dto.battle.FightResultDtoPROTO.FightResultDto) {
          return mergeFrom((com.shadowgame.rpg.modules.protobuf.dto.battle.FightResultDtoPROTO.FightResultDto)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.shadowgame.rpg.modules.protobuf.dto.battle.FightResultDtoPROTO.FightResultDto other) {
        if (other == com.shadowgame.rpg.modules.protobuf.dto.battle.FightResultDtoPROTO.FightResultDto.getDefaultInstance()) return this;
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasTargetId()) {
          setTargetId(other.getTargetId());
        }
        if (other.hasValue()) {
          setValue(other.getValue());
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
        com.shadowgame.rpg.modules.protobuf.dto.battle.FightResultDtoPROTO.FightResultDto parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.shadowgame.rpg.modules.protobuf.dto.battle.FightResultDtoPROTO.FightResultDto) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      // optional int32 type = 1;
      private int type_ ;
      /**
       * <code>optional int32 type = 1;</code>
       *
       * <pre>
       **
       * 攻击结果类型
       * 1扣血
       * 2闪避
       * 3抵抗
       * 4暴击
       * </pre>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>optional int32 type = 1;</code>
       *
       * <pre>
       **
       * 攻击结果类型
       * 1扣血
       * 2闪避
       * 3抵抗
       * 4暴击
       * </pre>
       */
      public int getType() {
        return type_;
      }
      /**
       * <code>optional int32 type = 1;</code>
       *
       * <pre>
       **
       * 攻击结果类型
       * 1扣血
       * 2闪避
       * 3抵抗
       * 4暴击
       * </pre>
       */
      public Builder setType(int value) {
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 type = 1;</code>
       *
       * <pre>
       **
       * 攻击结果类型
       * 1扣血
       * 2闪避
       * 3抵抗
       * 4暴击
       * </pre>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = 0;
        onChanged();
        return this;
      }

      // optional int32 targetId = 2;
      private int targetId_ ;
      /**
       * <code>optional int32 targetId = 2;</code>
       *
       * <pre>
       **
       * 目标武将id
       * </pre>
       */
      public boolean hasTargetId() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional int32 targetId = 2;</code>
       *
       * <pre>
       **
       * 目标武将id
       * </pre>
       */
      public int getTargetId() {
        return targetId_;
      }
      /**
       * <code>optional int32 targetId = 2;</code>
       *
       * <pre>
       **
       * 目标武将id
       * </pre>
       */
      public Builder setTargetId(int value) {
        bitField0_ |= 0x00000002;
        targetId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 targetId = 2;</code>
       *
       * <pre>
       **
       * 目标武将id
       * </pre>
       */
      public Builder clearTargetId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        targetId_ = 0;
        onChanged();
        return this;
      }

      // optional int32 value = 3;
      private int value_ ;
      /**
       * <code>optional int32 value = 3;</code>
       *
       * <pre>
       **
       * 扣血值
       * </pre>
       */
      public boolean hasValue() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional int32 value = 3;</code>
       *
       * <pre>
       **
       * 扣血值
       * </pre>
       */
      public int getValue() {
        return value_;
      }
      /**
       * <code>optional int32 value = 3;</code>
       *
       * <pre>
       **
       * 扣血值
       * </pre>
       */
      public Builder setValue(int value) {
        bitField0_ |= 0x00000004;
        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional int32 value = 3;</code>
       *
       * <pre>
       **
       * 扣血值
       * </pre>
       */
      public Builder clearValue() {
        bitField0_ = (bitField0_ & ~0x00000004);
        value_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:com.shadowgame.rpg.modules.protocol.dto.battle.FightResultDto)
    }

    static {
      defaultInstance = new FightResultDto(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:com.shadowgame.rpg.modules.protocol.dto.battle.FightResultDto)
  }

  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_com_shadowgame_rpg_modules_protocol_dto_battle_FightResultDto_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_com_shadowgame_rpg_modules_protocol_dto_battle_FightResultDto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nIcom/shadowgame/rpg/modules/protocol/dt" +
      "o/battle/FightResultDto_PROTO.proto\022.com" +
      ".shadowgame.rpg.modules.protocol.dto.bat" +
      "tle\"?\n\016FightResultDto\022\014\n\004type\030\001 \001(\005\022\020\n\010t" +
      "argetId\030\002 \001(\005\022\r\n\005value\030\003 \001(\005B0\n.com.shad" +
      "owgame.rpg.modules.protobuf.dto.battle"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_com_shadowgame_rpg_modules_protocol_dto_battle_FightResultDto_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_com_shadowgame_rpg_modules_protocol_dto_battle_FightResultDto_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_com_shadowgame_rpg_modules_protocol_dto_battle_FightResultDto_descriptor,
              new java.lang.String[] { "Type", "TargetId", "Value", });
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
