package com.poggs.opensource.tfl.countdown;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * A POJO to hold a flexible message
 *
 * @author pwh
 */
class FlexibleMessagePojo {

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
    public UUID messageUuid;
    public int messageType;
    public int messagePriority;
    public String messageText;
    public LocalDateTime startTime;
    public LocalDateTime endTime;

}
