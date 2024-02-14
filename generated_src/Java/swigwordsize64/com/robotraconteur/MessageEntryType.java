/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (https://www.swig.org).
 * Version 4.1.1
 *
 * Do not make changes to this file unless you know what you are doing - modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.robotraconteur;

public enum MessageEntryType {
  MessageEntryType_Null(0),
  MessageEntryType_StreamOp(1),
  MessageEntryType_StreamOpRet,
  MessageEntryType_StreamCheckCapability,
  MessageEntryType_StreamCheckCapabilityRet,
  MessageEntryType_GetServiceDesc(101),
  MessageEntryType_GetServiceDescRet,
  MessageEntryType_ObjectTypeName,
  MessageEntryType_ObjectTypeNameRet,
  MessageEntryType_ServiceClosed,
  MessageEntryType_ServiceClosedRet,
  MessageEntryType_ConnectClient,
  MessageEntryType_ConnectClientRet,
  MessageEntryType_DisconnectClient,
  MessageEntryType_DisconnectClientRet,
  MessageEntryType_ConnectionTest,
  MessageEntryType_ConnectionTestRet,
  MessageEntryType_GetNodeInfo,
  MessageEntryType_GetNodeInfoRet,
  MessageEntryType_ReconnectClient,
  MessageEntryType_ReconnectClientRet,
  MessageEntryType_NodeCheckCapability,
  MessageEntryType_NodeCheckCapabilityRet,
  MessageEntryType_GetServiceAttributes,
  MessageEntryType_GetServiceAttributesRet,
  MessageEntryType_ConnectClientCombined,
  MessageEntryType_ConnectClientCombinedRet,
  MessageEntryType_EndpointCheckCapability(501),
  MessageEntryType_EndpointCheckCapabilityRet,
  MessageEntryType_ServiceCheckCapabilityReq(1101),
  MessageEntryType_ServiceCheckCapabilityRet,
  MessageEntryType_ClientKeepAliveReq(1105),
  MessageEntryType_ClientKeepAliveRet,
  MessageEntryType_ClientSessionOpReq(1107),
  MessageEntryType_ClientSessionOpRet,
  MessageEntryType_ServicePathReleasedReq,
  MessageEntryType_ServicePathReleasedRet,
  MessageEntryType_PropertyGetReq(1111),
  MessageEntryType_PropertyGetRes,
  MessageEntryType_PropertySetReq,
  MessageEntryType_PropertySetRes,
  MessageEntryType_FunctionCallReq(1121),
  MessageEntryType_FunctionCallRes,
  MessageEntryType_GeneratorNextReq,
  MessageEntryType_GeneratorNextRes,
  MessageEntryType_EventReq(1131),
  MessageEntryType_EventRes,
  MessageEntryType_PipePacket(1141),
  MessageEntryType_PipePacketRet,
  MessageEntryType_PipeConnectReq,
  MessageEntryType_PipeConnectRet,
  MessageEntryType_PipeDisconnectReq,
  MessageEntryType_PipeDisconnectRet,
  MessageEntryType_PipeClosed,
  MessageEntryType_PipeClosedRet,
  MessageEntryType_CallbackCallReq(1151),
  MessageEntryType_CallbackCallRet,
  MessageEntryType_WirePacket(1161),
  MessageEntryType_WirePacketRet,
  MessageEntryType_WireConnectReq,
  MessageEntryType_WireConnectRet,
  MessageEntryType_WireDisconnectReq,
  MessageEntryType_WireDisconnectRet,
  MessageEntryType_WireClosed,
  MessageEntryType_WireClosedRet,
  MessageEntryType_MemoryRead(1171),
  MessageEntryType_MemoryReadRet,
  MessageEntryType_MemoryWrite,
  MessageEntryType_MemoryWriteRet,
  MessageEntryType_MemoryGetParam,
  MessageEntryType_MemoryGetParamRet,
  MessageEntryType_WirePeekInValueReq(1181),
  MessageEntryType_WirePeekInValueRet,
  MessageEntryType_WirePeekOutValueReq,
  MessageEntryType_WirePeekOutValueRet,
  MessageEntryType_WirePokeOutValueReq,
  MessageEntryType_WirePokeOutValueRet,
  MessageEntryType_WireTransportOpReq(11161),
  MessageEntryType_WireTransportOpRet,
  MessageEntryType_WireTransportEvent,
  MessageEntryType_WireTransportEventRet;

  public final int swigValue() {
    return swigValue;
  }

  public static MessageEntryType swigToEnum(int swigValue) {
    MessageEntryType[] swigValues = MessageEntryType.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (MessageEntryType swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + MessageEntryType.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private MessageEntryType() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private MessageEntryType(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private MessageEntryType(MessageEntryType swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}
