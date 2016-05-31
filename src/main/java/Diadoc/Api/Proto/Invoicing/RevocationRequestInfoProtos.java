// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Invoicing/RevocationRequestInfo.proto

package Diadoc.Api.Proto.Invoicing;

public final class RevocationRequestInfoProtos {
  private RevocationRequestInfoProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface RevocationRequestInfoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional string Comment = 1;
    boolean hasComment();
    String getComment();
    
    // optional .Diadoc.Api.Proto.Invoicing.Signer Signer = 2;
    boolean hasSigner();
    Diadoc.Api.Proto.Invoicing.SignerProtos.Signer getSigner();
    Diadoc.Api.Proto.Invoicing.SignerProtos.SignerOrBuilder getSignerOrBuilder();
  }
  public static final class RevocationRequestInfo extends
      com.google.protobuf.GeneratedMessage
      implements RevocationRequestInfoOrBuilder {
    // Use RevocationRequestInfo.newBuilder() to construct.
    private RevocationRequestInfo(Builder builder) {
      super(builder);
    }
    private RevocationRequestInfo(boolean noInit) {}
    
    private static final RevocationRequestInfo defaultInstance;
    public static RevocationRequestInfo getDefaultInstance() {
      return defaultInstance;
    }
    
    public RevocationRequestInfo getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Diadoc.Api.Proto.Invoicing.RevocationRequestInfoProtos.internal_static_Diadoc_Api_Proto_Invoicing_RevocationRequestInfo_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Diadoc.Api.Proto.Invoicing.RevocationRequestInfoProtos.internal_static_Diadoc_Api_Proto_Invoicing_RevocationRequestInfo_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional string Comment = 1;
    public static final int COMMENT_FIELD_NUMBER = 1;
    private java.lang.Object comment_;
    public boolean hasComment() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getComment() {
      java.lang.Object ref = comment_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          comment_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getCommentBytes() {
      java.lang.Object ref = comment_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        comment_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional .Diadoc.Api.Proto.Invoicing.Signer Signer = 2;
    public static final int SIGNER_FIELD_NUMBER = 2;
    private Diadoc.Api.Proto.Invoicing.SignerProtos.Signer signer_;
    public boolean hasSigner() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public Diadoc.Api.Proto.Invoicing.SignerProtos.Signer getSigner() {
      return signer_;
    }
    public Diadoc.Api.Proto.Invoicing.SignerProtos.SignerOrBuilder getSignerOrBuilder() {
      return signer_;
    }
    
    private void initFields() {
      comment_ = "";
      signer_ = Diadoc.Api.Proto.Invoicing.SignerProtos.Signer.getDefaultInstance();
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (hasSigner()) {
        if (!getSigner().isInitialized()) {
          memoizedIsInitialized = 0;
          return false;
        }
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getCommentBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeMessage(2, signer_);
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
          .computeBytesSize(1, getCommentBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, signer_);
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
    
    public static Diadoc.Api.Proto.Invoicing.RevocationRequestInfoProtos.RevocationRequestInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static Diadoc.Api.Proto.Invoicing.RevocationRequestInfoProtos.RevocationRequestInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static Diadoc.Api.Proto.Invoicing.RevocationRequestInfoProtos.RevocationRequestInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static Diadoc.Api.Proto.Invoicing.RevocationRequestInfoProtos.RevocationRequestInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static Diadoc.Api.Proto.Invoicing.RevocationRequestInfoProtos.RevocationRequestInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static Diadoc.Api.Proto.Invoicing.RevocationRequestInfoProtos.RevocationRequestInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static Diadoc.Api.Proto.Invoicing.RevocationRequestInfoProtos.RevocationRequestInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static Diadoc.Api.Proto.Invoicing.RevocationRequestInfoProtos.RevocationRequestInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static Diadoc.Api.Proto.Invoicing.RevocationRequestInfoProtos.RevocationRequestInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static Diadoc.Api.Proto.Invoicing.RevocationRequestInfoProtos.RevocationRequestInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(Diadoc.Api.Proto.Invoicing.RevocationRequestInfoProtos.RevocationRequestInfo prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements Diadoc.Api.Proto.Invoicing.RevocationRequestInfoProtos.RevocationRequestInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Diadoc.Api.Proto.Invoicing.RevocationRequestInfoProtos.internal_static_Diadoc_Api_Proto_Invoicing_RevocationRequestInfo_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Diadoc.Api.Proto.Invoicing.RevocationRequestInfoProtos.internal_static_Diadoc_Api_Proto_Invoicing_RevocationRequestInfo_fieldAccessorTable;
      }
      
      // Construct using Diadoc.Api.Proto.Invoicing.RevocationRequestInfoProtos.RevocationRequestInfo.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getSignerFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        comment_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        if (signerBuilder_ == null) {
          signer_ = Diadoc.Api.Proto.Invoicing.SignerProtos.Signer.getDefaultInstance();
        } else {
          signerBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Diadoc.Api.Proto.Invoicing.RevocationRequestInfoProtos.RevocationRequestInfo.getDescriptor();
      }
      
      public Diadoc.Api.Proto.Invoicing.RevocationRequestInfoProtos.RevocationRequestInfo getDefaultInstanceForType() {
        return Diadoc.Api.Proto.Invoicing.RevocationRequestInfoProtos.RevocationRequestInfo.getDefaultInstance();
      }
      
      public Diadoc.Api.Proto.Invoicing.RevocationRequestInfoProtos.RevocationRequestInfo build() {
        Diadoc.Api.Proto.Invoicing.RevocationRequestInfoProtos.RevocationRequestInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private Diadoc.Api.Proto.Invoicing.RevocationRequestInfoProtos.RevocationRequestInfo buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        Diadoc.Api.Proto.Invoicing.RevocationRequestInfoProtos.RevocationRequestInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public Diadoc.Api.Proto.Invoicing.RevocationRequestInfoProtos.RevocationRequestInfo buildPartial() {
        Diadoc.Api.Proto.Invoicing.RevocationRequestInfoProtos.RevocationRequestInfo result = new Diadoc.Api.Proto.Invoicing.RevocationRequestInfoProtos.RevocationRequestInfo(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.comment_ = comment_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        if (signerBuilder_ == null) {
          result.signer_ = signer_;
        } else {
          result.signer_ = signerBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Diadoc.Api.Proto.Invoicing.RevocationRequestInfoProtos.RevocationRequestInfo) {
          return mergeFrom((Diadoc.Api.Proto.Invoicing.RevocationRequestInfoProtos.RevocationRequestInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(Diadoc.Api.Proto.Invoicing.RevocationRequestInfoProtos.RevocationRequestInfo other) {
        if (other == Diadoc.Api.Proto.Invoicing.RevocationRequestInfoProtos.RevocationRequestInfo.getDefaultInstance()) return this;
        if (other.hasComment()) {
          setComment(other.getComment());
        }
        if (other.hasSigner()) {
          mergeSigner(other.getSigner());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (hasSigner()) {
          if (!getSigner().isInitialized()) {
            
            return false;
          }
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              comment_ = input.readBytes();
              break;
            }
            case 18: {
              Diadoc.Api.Proto.Invoicing.SignerProtos.Signer.Builder subBuilder = Diadoc.Api.Proto.Invoicing.SignerProtos.Signer.newBuilder();
              if (hasSigner()) {
                subBuilder.mergeFrom(getSigner());
              }
              input.readMessage(subBuilder, extensionRegistry);
              setSigner(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional string Comment = 1;
      private java.lang.Object comment_ = "";
      public boolean hasComment() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getComment() {
        java.lang.Object ref = comment_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          comment_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setComment(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        comment_ = value;
        onChanged();
        return this;
      }
      public Builder clearComment() {
        bitField0_ = (bitField0_ & ~0x00000001);
        comment_ = getDefaultInstance().getComment();
        onChanged();
        return this;
      }
      void setComment(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        comment_ = value;
        onChanged();
      }
      
      // optional .Diadoc.Api.Proto.Invoicing.Signer Signer = 2;
      private Diadoc.Api.Proto.Invoicing.SignerProtos.Signer signer_ = Diadoc.Api.Proto.Invoicing.SignerProtos.Signer.getDefaultInstance();
      private com.google.protobuf.SingleFieldBuilder<
          Diadoc.Api.Proto.Invoicing.SignerProtos.Signer, Diadoc.Api.Proto.Invoicing.SignerProtos.Signer.Builder, Diadoc.Api.Proto.Invoicing.SignerProtos.SignerOrBuilder> signerBuilder_;
      public boolean hasSigner() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public Diadoc.Api.Proto.Invoicing.SignerProtos.Signer getSigner() {
        if (signerBuilder_ == null) {
          return signer_;
        } else {
          return signerBuilder_.getMessage();
        }
      }
      public Builder setSigner(Diadoc.Api.Proto.Invoicing.SignerProtos.Signer value) {
        if (signerBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          signer_ = value;
          onChanged();
        } else {
          signerBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      public Builder setSigner(
          Diadoc.Api.Proto.Invoicing.SignerProtos.Signer.Builder builderForValue) {
        if (signerBuilder_ == null) {
          signer_ = builderForValue.build();
          onChanged();
        } else {
          signerBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      public Builder mergeSigner(Diadoc.Api.Proto.Invoicing.SignerProtos.Signer value) {
        if (signerBuilder_ == null) {
          if (((bitField0_ & 0x00000002) == 0x00000002) &&
              signer_ != Diadoc.Api.Proto.Invoicing.SignerProtos.Signer.getDefaultInstance()) {
            signer_ =
              Diadoc.Api.Proto.Invoicing.SignerProtos.Signer.newBuilder(signer_).mergeFrom(value).buildPartial();
          } else {
            signer_ = value;
          }
          onChanged();
        } else {
          signerBuilder_.mergeFrom(value);
        }
        bitField0_ |= 0x00000002;
        return this;
      }
      public Builder clearSigner() {
        if (signerBuilder_ == null) {
          signer_ = Diadoc.Api.Proto.Invoicing.SignerProtos.Signer.getDefaultInstance();
          onChanged();
        } else {
          signerBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      public Diadoc.Api.Proto.Invoicing.SignerProtos.Signer.Builder getSignerBuilder() {
        bitField0_ |= 0x00000002;
        onChanged();
        return getSignerFieldBuilder().getBuilder();
      }
      public Diadoc.Api.Proto.Invoicing.SignerProtos.SignerOrBuilder getSignerOrBuilder() {
        if (signerBuilder_ != null) {
          return signerBuilder_.getMessageOrBuilder();
        } else {
          return signer_;
        }
      }
      private com.google.protobuf.SingleFieldBuilder<
          Diadoc.Api.Proto.Invoicing.SignerProtos.Signer, Diadoc.Api.Proto.Invoicing.SignerProtos.Signer.Builder, Diadoc.Api.Proto.Invoicing.SignerProtos.SignerOrBuilder> 
          getSignerFieldBuilder() {
        if (signerBuilder_ == null) {
          signerBuilder_ = new com.google.protobuf.SingleFieldBuilder<
              Diadoc.Api.Proto.Invoicing.SignerProtos.Signer, Diadoc.Api.Proto.Invoicing.SignerProtos.Signer.Builder, Diadoc.Api.Proto.Invoicing.SignerProtos.SignerOrBuilder>(
                  signer_,
                  getParentForChildren(),
                  isClean());
          signer_ = null;
        }
        return signerBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:Diadoc.Api.Proto.Invoicing.RevocationRequestInfo)
    }
    
    static {
      defaultInstance = new RevocationRequestInfo(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:Diadoc.Api.Proto.Invoicing.RevocationRequestInfo)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_Diadoc_Api_Proto_Invoicing_RevocationRequestInfo_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Diadoc_Api_Proto_Invoicing_RevocationRequestInfo_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%Invoicing/RevocationRequestInfo.proto\022" +
      "\032Diadoc.Api.Proto.Invoicing\032\026Invoicing/S" +
      "igner.proto\"\\\n\025RevocationRequestInfo\022\017\n\007" +
      "Comment\030\001 \001(\t\0222\n\006Signer\030\002 \001(\0132\".Diadoc.A" +
      "pi.Proto.Invoicing.SignerB\035B\033RevocationR" +
      "equestInfoProtos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_Diadoc_Api_Proto_Invoicing_RevocationRequestInfo_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_Diadoc_Api_Proto_Invoicing_RevocationRequestInfo_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_Diadoc_Api_Proto_Invoicing_RevocationRequestInfo_descriptor,
              new java.lang.String[] { "Comment", "Signer", },
              Diadoc.Api.Proto.Invoicing.RevocationRequestInfoProtos.RevocationRequestInfo.class,
              Diadoc.Api.Proto.Invoicing.RevocationRequestInfoProtos.RevocationRequestInfo.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          Diadoc.Api.Proto.Invoicing.SignerProtos.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}