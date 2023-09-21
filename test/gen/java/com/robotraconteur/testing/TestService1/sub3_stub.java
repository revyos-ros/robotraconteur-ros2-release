//This file is automatically generated. DO NOT EDIT!
package com.robotraconteur.testing.TestService1;
import java.util.*;
import com.robotraconteur.*;
public class sub3_stub extends ServiceStub implements sub3, async_sub3 {
    public sub3_stub(WrappedServiceStub innerstub) {
        super(innerstub); 
    }
    public String get_ind() {
    return MessageElementUtil.unpackString(rr_innerstub.propertyGet("ind"));
    }
    public void set_ind(String value) {
    MessageElement m=null;
    try {
    m=MessageElementUtil.packString("value",value);
    rr_innerstub.propertySet("ind", m);
    }
    finally {
    if (m!=null) m.delete();
    }
    }
    public String get_data2() {
    return MessageElementUtil.unpackString(rr_innerstub.propertyGet("data2"));
    }
    public void set_data2(String value) {
    MessageElement m=null;
    try {
    m=MessageElementUtil.packString("value",value);
    rr_innerstub.propertySet("data2", m);
    }
    finally {
    if (m!=null) m.delete();
    }
    }
    public double get_data3() {
    return (MessageElementUtil.<double[]>castDataAndDispose(rr_innerstub.propertyGet("data3")))[0];
    }
    public void set_data3(double value) {
    MessageElement m=null;
    try {
    m=MessageElementUtil.<double[]>packArray("value",new double[] {value});
    rr_innerstub.propertySet("data3", m);
    }
    finally {
    if (m!=null) m.delete();
    }
    }
    public double add(double d) {
    vectorptr_messageelement rr_param=new vectorptr_messageelement();
    MessageElement rr_me=null;
    try {
    MessageElementUtil.addMessageElementDispose(rr_param, MessageElementUtil.<double[]>packArray("d",new double[] {d}));
    rr_me=rr_innerstub.functionCall("add",rr_param);
    return (MessageElementUtil.<double[]>castDataAndDispose(rr_me))[0];
    }
    finally {
    rr_param.delete();
    if (rr_me!=null) rr_me.delete();
    }
    }
    public void dispatchEvent(String rr_membername, vectorptr_messageelement rr_m) {
    }
    public MessageElement callbackCall(String rr_membername, vectorptr_messageelement rr_m) {
    throw new MemberNotFoundException("Member not found");
    }
    public void async_get_ind(Action2<String,RuntimeException> rr_handler, int rr_timeout)
    {
    rr_async_PropertyGet("ind",new rrend_async_get_ind(),rr_handler,rr_timeout);
    }
    protected class rrend_async_get_ind implements Action3<MessageElement,RuntimeException,Object> {
    public void action(MessageElement value ,RuntimeException err,Object param)
    {
    Action2<String,RuntimeException> rr_handler=(Action2<String,RuntimeException>)param;
    if (err!=null)
    {
    rr_handler.action("",err);
    return;
    }
    String rr_ret;
    try {
    rr_ret=MessageElementUtil.unpackString(value);
    } catch (RuntimeException err2) {
    rr_handler.action("",err2);
    return;
    }
    rr_handler.action(rr_ret,null);
    }
    }
    public void async_set_ind(String value, Action1<RuntimeException> rr_handler, int rr_timeout)
    {
    MessageElement m=null;
    try {
    m=MessageElementUtil.packString("value",value);
    rr_async_PropertySet("ind",m,new rrend_async_set_ind(),rr_handler,rr_timeout);
    }
    finally {
    if (m!=null) m.delete();
    }
    }
    protected class rrend_async_set_ind implements Action3<MessageElement,RuntimeException,Object> {
    public void action(MessageElement m ,RuntimeException err,Object param)
    {
    Action1<RuntimeException> rr_handler=(Action1<RuntimeException>)param;
    if (err!=null)
    {
    rr_handler.action(err);
    return;
    }
    rr_handler.action(null);
    }
    }
    public void async_get_data2(Action2<String,RuntimeException> rr_handler, int rr_timeout)
    {
    rr_async_PropertyGet("data2",new rrend_async_get_data2(),rr_handler,rr_timeout);
    }
    protected class rrend_async_get_data2 implements Action3<MessageElement,RuntimeException,Object> {
    public void action(MessageElement value ,RuntimeException err,Object param)
    {
    Action2<String,RuntimeException> rr_handler=(Action2<String,RuntimeException>)param;
    if (err!=null)
    {
    rr_handler.action("",err);
    return;
    }
    String rr_ret;
    try {
    rr_ret=MessageElementUtil.unpackString(value);
    } catch (RuntimeException err2) {
    rr_handler.action("",err2);
    return;
    }
    rr_handler.action(rr_ret,null);
    }
    }
    public void async_set_data2(String value, Action1<RuntimeException> rr_handler, int rr_timeout)
    {
    MessageElement m=null;
    try {
    m=MessageElementUtil.packString("value",value);
    rr_async_PropertySet("data2",m,new rrend_async_set_data2(),rr_handler,rr_timeout);
    }
    finally {
    if (m!=null) m.delete();
    }
    }
    protected class rrend_async_set_data2 implements Action3<MessageElement,RuntimeException,Object> {
    public void action(MessageElement m ,RuntimeException err,Object param)
    {
    Action1<RuntimeException> rr_handler=(Action1<RuntimeException>)param;
    if (err!=null)
    {
    rr_handler.action(err);
    return;
    }
    rr_handler.action(null);
    }
    }
    public void async_get_data3(Action2<Double,RuntimeException> rr_handler, int rr_timeout)
    {
    rr_async_PropertyGet("data3",new rrend_async_get_data3(),rr_handler,rr_timeout);
    }
    protected class rrend_async_get_data3 implements Action3<MessageElement,RuntimeException,Object> {
    public void action(MessageElement value ,RuntimeException err,Object param)
    {
    Action2<Double,RuntimeException> rr_handler=(Action2<Double,RuntimeException>)param;
    if (err!=null)
    {
    rr_handler.action(0.0,err);
    return;
    }
    Double rr_ret;
    try {
    rr_ret=(MessageElementUtil.<double[]>castDataAndDispose(value))[0];
    } catch (RuntimeException err2) {
    rr_handler.action(0.0,err2);
    return;
    }
    rr_handler.action(rr_ret,null);
    }
    }
    public void async_set_data3(double value, Action1<RuntimeException> rr_handler, int rr_timeout)
    {
    MessageElement m=null;
    try {
    m=MessageElementUtil.<double[]>packArray("value",new double[] {value});
    rr_async_PropertySet("data3",m,new rrend_async_set_data3(),rr_handler,rr_timeout);
    }
    finally {
    if (m!=null) m.delete();
    }
    }
    protected class rrend_async_set_data3 implements Action3<MessageElement,RuntimeException,Object> {
    public void action(MessageElement m ,RuntimeException err,Object param)
    {
    Action1<RuntimeException> rr_handler=(Action1<RuntimeException>)param;
    if (err!=null)
    {
    rr_handler.action(err);
    return;
    }
    rr_handler.action(null);
    }
    }
    public void async_add(double d,Action2<Double,RuntimeException> rr_handler,int rr_timeout)
    {
    vectorptr_messageelement rr_param=new vectorptr_messageelement();
    try {
    MessageElementUtil.addMessageElementDispose(rr_param,MessageElementUtil.<double[]>packArray("d",new double[] {d}));
    rr_async_FunctionCall("add",rr_param,new rrend_async_add(),rr_handler,rr_timeout);
    }
    finally {
    rr_param.delete();
    }
    }
    protected class rrend_async_add implements Action3<MessageElement,RuntimeException,Object> {
    public void action(MessageElement ret ,RuntimeException err,Object param)
    {
    Action2<Double,RuntimeException> rr_handler=(Action2<Double,RuntimeException>)param;
    if (err!=null)
    {
    rr_handler.action(0.0,err);
    return;
    }
    Double rr_ret;
    try {
    rr_ret=(MessageElementUtil.<double[]>castDataAndDispose(ret))[0];
    } catch (RuntimeException err2) {
    rr_handler.action(0.0,err2);
    return;
    }
    rr_handler.action(rr_ret, null);
    }
    }
}