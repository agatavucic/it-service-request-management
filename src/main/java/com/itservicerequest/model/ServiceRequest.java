package com.itservicerequest.model;

public class ServiceRequest {

    private int id;
    private int deviceId;
    private int userId;
    private int servicerId;
    private String description;
    private RequestStatus status;
    private String createdAt;

    public ServiceRequest(int id,
                          int deviceId,
                          int userId,
                          int servicerId,
                          String description,
                          RequestStatus status,
                          String createdAt) {

        this.id = id;
        this.deviceId = deviceId;
        this.userId = userId;
        this.servicerId = servicerId;
        this.description = description;
        this.status = status;
        this.createdAt = createdAt;
    }

    public int getId() {
        return id;
    }

    public int getDeviceId() {
        return deviceId;
    }

    public int getUserId() {
        return userId;
    }

    public int getServicerId() {
        return servicerId;
    }

    public String getDescription() {
        return description;
    }

    public RequestStatus getStatus() {
        return status;
    }

    public String getCreatedAt() {
        return createdAt;
    }
}
