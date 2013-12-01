package com.dkdf.cableway.rfid;

import gnu.io.SerialPort;
import gnu.io.SerialPortEventListener;
import gnu.io.UnsupportedCommOperationException;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.TooManyListenersException;

/**
 * Created with IntelliJ IDEA.
 * User: Дмитрий
 * Date: 30.11.13
 * Time: 21:28
 * To change this template use File | Settings | File Templates.
 */
public class MyOwnComPort extends SerialPort
{
    @Override
    public void setSerialPortParams(int i, int i2, int i3, int i4) throws UnsupportedCommOperationException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getBaudRate() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getDataBits() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getStopBits() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getParity() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setFlowControlMode(int i) throws UnsupportedCommOperationException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getFlowControlMode() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isDTR() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setDTR(boolean b) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setRTS(boolean b) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isCTS() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isDSR() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isCD() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isRI() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isRTS() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void sendBreak(int i) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void addEventListener(SerialPortEventListener serialPortEventListener) throws TooManyListenersException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void removeEventListener() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void notifyOnDataAvailable(boolean b) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void notifyOnOutputEmpty(boolean b) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void notifyOnCTS(boolean b) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void notifyOnDSR(boolean b) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void notifyOnRingIndicator(boolean b) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void notifyOnCarrierDetect(boolean b) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void notifyOnOverrunError(boolean b) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void notifyOnParityError(boolean b) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void notifyOnFramingError(boolean b) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void notifyOnBreakInterrupt(boolean b) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public byte getParityErrorChar() throws UnsupportedCommOperationException {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean setParityErrorChar(byte b) throws UnsupportedCommOperationException {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public byte getEndOfInputChar() throws UnsupportedCommOperationException {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean setEndOfInputChar(byte b) throws UnsupportedCommOperationException {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean setUARTType(String s, boolean b) throws UnsupportedCommOperationException {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public String getUARTType() throws UnsupportedCommOperationException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean setBaudBase(int i) throws UnsupportedCommOperationException, IOException {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getBaudBase() throws UnsupportedCommOperationException, IOException {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean setDivisor(int i) throws UnsupportedCommOperationException, IOException {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getDivisor() throws UnsupportedCommOperationException, IOException {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean setLowLatency() throws UnsupportedCommOperationException {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean getLowLatency() throws UnsupportedCommOperationException {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean setCallOutHangup(boolean b) throws UnsupportedCommOperationException {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean getCallOutHangup() throws UnsupportedCommOperationException {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void enableReceiveFraming(int i) throws UnsupportedCommOperationException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void disableReceiveFraming() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isReceiveFramingEnabled() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getReceiveFramingByte() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void disableReceiveTimeout() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void enableReceiveTimeout(int i) throws UnsupportedCommOperationException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isReceiveTimeoutEnabled() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getReceiveTimeout() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void enableReceiveThreshold(int i) throws UnsupportedCommOperationException {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void disableReceiveThreshold() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getReceiveThreshold() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean isReceiveThresholdEnabled() {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setInputBufferSize(int i) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getInputBufferSize() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setOutputBufferSize(int i) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int getOutputBufferSize() {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public OutputStream getOutputStream() throws IOException {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}