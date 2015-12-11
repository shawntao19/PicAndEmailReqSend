/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morepicsendsq;

/**
 * 图片传输请求协议内容类
 *
 * @author 基地 杨宸
 */
public class PicDataReq {

    private int contentLength;

    private String serialNumber;
    private byte[] picData;

    public PicDataReq(String serialNumber, byte[] picData) {
        this.serialNumber = serialNumber;
        contentLength = picData.length;
        this.picData = picData;
    }

    public int getContentLength() {
        return contentLength;
    }

    public void setContentLength(int contentLength) {
        this.contentLength = contentLength;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public byte[] getPicData() {
        return picData;
    }

    public void setPicData(byte[] picData) {
        this.picData = picData;
    }

}
