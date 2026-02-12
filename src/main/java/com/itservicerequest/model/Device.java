package com.itservicerequest.model;

public class Device {
   private int id;
   private int userId;
   private String deviceType;
   private String serialNumber;
   private String manufacturer;

    public Device(int id, int userId, String deviceType, String serialNumber, String manufacturer) {
        this.id = id;
        this.userId = userId;
        this.deviceType = deviceType;
        this.serialNumber = serialNumber;
        this.manufacturer = manufacturer;
    }

    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public String getDeviceType() {
        return deviceType;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getManufacturer() {
        return manufacturer;
    }
}
