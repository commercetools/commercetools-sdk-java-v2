package com.commercetools.importapi.models.orders;

import com.commercetools.importapi.models.orders.DeliveryItem;
import com.commercetools.importapi.models.orders.ParcelMeasurements;
import com.commercetools.importapi.models.orders.TrackingData;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ParcelImpl implements Parcel {

    private String id;

    private java.time.ZonedDateTime createdAt;

    private com.commercetools.importapi.models.orders.ParcelMeasurements measurements;

    private com.commercetools.importapi.models.orders.TrackingData trackingData;

    private java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> items;

    @JsonCreator
    ParcelImpl(@JsonProperty("id") final String id, @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("measurements") final com.commercetools.importapi.models.orders.ParcelMeasurements measurements, @JsonProperty("trackingData") final com.commercetools.importapi.models.orders.TrackingData trackingData, @JsonProperty("items") final java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> items) {
        this.id = id;
        this.createdAt = createdAt;
        this.measurements = measurements;
        this.trackingData = trackingData;
        this.items = items;
    }
    public ParcelImpl() {

    }


    public String getId(){
        return this.id;
    }


    public java.time.ZonedDateTime getCreatedAt(){
        return this.createdAt;
    }


    public com.commercetools.importapi.models.orders.ParcelMeasurements getMeasurements(){
        return this.measurements;
    }


    public com.commercetools.importapi.models.orders.TrackingData getTrackingData(){
        return this.trackingData;
    }


    public java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> getItems(){
        return this.items;
    }

    public void setId(final String id){
        this.id = id;
    }

    public void setCreatedAt(final java.time.ZonedDateTime createdAt){
        this.createdAt = createdAt;
    }

    public void setMeasurements(final com.commercetools.importapi.models.orders.ParcelMeasurements measurements){
        this.measurements = measurements;
    }

    public void setTrackingData(final com.commercetools.importapi.models.orders.TrackingData trackingData){
        this.trackingData = trackingData;
    }

    public void setItems(final java.util.List<com.commercetools.importapi.models.orders.DeliveryItem> items){
        this.items = items;
    }

}
