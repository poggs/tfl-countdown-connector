package com.poggs.opensource.tfl.countdown;

import java.time.LocalDateTime;

/**
 * A POJO to hold prediction data
 */
class PredictionPojo {

    public String stopPointName;
    public String stopId;
    public String stopCode1;
    public String stopCode2;
    public String stopPointType;
    public String towards;
    public int bearing;
    public String stopPointIndicator;
    public int stopPointState;
    public int latitude;
    public int longitude;
    public int visitNumber;
    public String lineId;
    public String lineName;
    public int directionId;
    public String destinationText;
    public String destinationName;
    public String vehicleId;
    public int tripId;
    public String registrationNumber;
    public LocalDateTime estimatedTime;
    public LocalDateTime expireTime;

}
