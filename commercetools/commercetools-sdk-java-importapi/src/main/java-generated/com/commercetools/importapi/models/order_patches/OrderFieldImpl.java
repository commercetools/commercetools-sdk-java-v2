
package com.commercetools.importapi.models.order_patches;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>Order fields that needs to be added or updated.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OrderFieldImpl implements OrderField, ModelBase {

    private com.commercetools.importapi.models.order_patches.ReturnInfo addReturnInfo;

    private com.commercetools.importapi.models.order_patches.DeliveryParcel addParcelToDelivery;

    private java.util.List<com.commercetools.importapi.models.order_patches.DeliveryDraft> addDeliveries;

    private com.commercetools.importapi.models.order_patches.RemoveDeliveryDraft removeDelivery;

    private com.commercetools.importapi.models.order_patches.RemoveParcelFromDeliveryDraft removeParcelFromDelivery;

    private com.commercetools.importapi.models.order_patches.DeliveryAddressDraft setDeliveryAddress;

    private com.commercetools.importapi.models.order_patches.ParcelMeasurementDraft setParcelMeasurements;

    private com.commercetools.importapi.models.order_patches.ParcelTrackingData setParcelTrackingData;

    private java.util.List<com.commercetools.importapi.models.order_patches.ParcelItems> setParcelItems;

    @JsonCreator
    OrderFieldImpl(
            @JsonProperty("addReturnInfo") final com.commercetools.importapi.models.order_patches.ReturnInfo addReturnInfo,
            @JsonProperty("addParcelToDelivery") final com.commercetools.importapi.models.order_patches.DeliveryParcel addParcelToDelivery,
            @JsonProperty("addDeliveries") final java.util.List<com.commercetools.importapi.models.order_patches.DeliveryDraft> addDeliveries,
            @JsonProperty("removeDelivery") final com.commercetools.importapi.models.order_patches.RemoveDeliveryDraft removeDelivery,
            @JsonProperty("removeParcelFromDelivery") final com.commercetools.importapi.models.order_patches.RemoveParcelFromDeliveryDraft removeParcelFromDelivery,
            @JsonProperty("setDeliveryAddress") final com.commercetools.importapi.models.order_patches.DeliveryAddressDraft setDeliveryAddress,
            @JsonProperty("setParcelMeasurements") final com.commercetools.importapi.models.order_patches.ParcelMeasurementDraft setParcelMeasurements,
            @JsonProperty("setParcelTrackingData") final com.commercetools.importapi.models.order_patches.ParcelTrackingData setParcelTrackingData,
            @JsonProperty("setParcelItems") final java.util.List<com.commercetools.importapi.models.order_patches.ParcelItems> setParcelItems) {
        this.addReturnInfo = addReturnInfo;
        this.addParcelToDelivery = addParcelToDelivery;
        this.addDeliveries = addDeliveries;
        this.removeDelivery = removeDelivery;
        this.removeParcelFromDelivery = removeParcelFromDelivery;
        this.setDeliveryAddress = setDeliveryAddress;
        this.setParcelMeasurements = setParcelMeasurements;
        this.setParcelTrackingData = setParcelTrackingData;
        this.setParcelItems = setParcelItems;
    }

    public OrderFieldImpl() {
    }

    /**
    *  <p>Maps to <code>Order.returnInfo</code></p>
    */
    public com.commercetools.importapi.models.order_patches.ReturnInfo getAddReturnInfo() {
        return this.addReturnInfo;
    }

    /**
    *  <p>Maps to <code>Order.delivery</code></p>
    */
    public com.commercetools.importapi.models.order_patches.DeliveryParcel getAddParcelToDelivery() {
        return this.addParcelToDelivery;
    }

    /**
    *  <p>Maps to <code>Order.delivery</code></p>
    */
    public java.util.List<com.commercetools.importapi.models.order_patches.DeliveryDraft> getAddDeliveries() {
        return this.addDeliveries;
    }

    /**
    *  <p>Maps to <code>Order.removeDelivery</code></p>
    */
    public com.commercetools.importapi.models.order_patches.RemoveDeliveryDraft getRemoveDelivery() {
        return this.removeDelivery;
    }

    /**
    *  <p>Maps to <code>Order.removeParcelFromDelivery</code></p>
    */
    public com.commercetools.importapi.models.order_patches.RemoveParcelFromDeliveryDraft getRemoveParcelFromDelivery() {
        return this.removeParcelFromDelivery;
    }

    /**
    *  <p>Maps to <code>Order.addressDraft</code></p>
    */
    public com.commercetools.importapi.models.order_patches.DeliveryAddressDraft getSetDeliveryAddress() {
        return this.setDeliveryAddress;
    }

    /**
    *  <p>Maps to <code>Order.parcelMeasurements</code></p>
    */
    public com.commercetools.importapi.models.order_patches.ParcelMeasurementDraft getSetParcelMeasurements() {
        return this.setParcelMeasurements;
    }

    /**
    *  <p>Maps to <code>Order.parcelTrackingData</code></p>
    */
    public com.commercetools.importapi.models.order_patches.ParcelTrackingData getSetParcelTrackingData() {
        return this.setParcelTrackingData;
    }

    /**
    *  <p>Maps to <code>Order.parcelItems</code></p>
    */
    public java.util.List<com.commercetools.importapi.models.order_patches.ParcelItems> getSetParcelItems() {
        return this.setParcelItems;
    }

    public void setAddReturnInfo(final com.commercetools.importapi.models.order_patches.ReturnInfo addReturnInfo) {
        this.addReturnInfo = addReturnInfo;
    }

    public void setAddParcelToDelivery(
            final com.commercetools.importapi.models.order_patches.DeliveryParcel addParcelToDelivery) {
        this.addParcelToDelivery = addParcelToDelivery;
    }

    public void setAddDeliveries(
            final com.commercetools.importapi.models.order_patches.DeliveryDraft... addDeliveries) {
        this.addDeliveries = new ArrayList<>(Arrays.asList(addDeliveries));
    }

    public void setAddDeliveries(
            final java.util.List<com.commercetools.importapi.models.order_patches.DeliveryDraft> addDeliveries) {
        this.addDeliveries = addDeliveries;
    }

    public void setRemoveDelivery(
            final com.commercetools.importapi.models.order_patches.RemoveDeliveryDraft removeDelivery) {
        this.removeDelivery = removeDelivery;
    }

    public void setRemoveParcelFromDelivery(
            final com.commercetools.importapi.models.order_patches.RemoveParcelFromDeliveryDraft removeParcelFromDelivery) {
        this.removeParcelFromDelivery = removeParcelFromDelivery;
    }

    public void setSetDeliveryAddress(
            final com.commercetools.importapi.models.order_patches.DeliveryAddressDraft setDeliveryAddress) {
        this.setDeliveryAddress = setDeliveryAddress;
    }

    public void setSetParcelMeasurements(
            final com.commercetools.importapi.models.order_patches.ParcelMeasurementDraft setParcelMeasurements) {
        this.setParcelMeasurements = setParcelMeasurements;
    }

    public void setSetParcelTrackingData(
            final com.commercetools.importapi.models.order_patches.ParcelTrackingData setParcelTrackingData) {
        this.setParcelTrackingData = setParcelTrackingData;
    }

    public void setSetParcelItems(
            final com.commercetools.importapi.models.order_patches.ParcelItems... setParcelItems) {
        this.setParcelItems = new ArrayList<>(Arrays.asList(setParcelItems));
    }

    public void setSetParcelItems(
            final java.util.List<com.commercetools.importapi.models.order_patches.ParcelItems> setParcelItems) {
        this.setParcelItems = setParcelItems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderFieldImpl that = (OrderFieldImpl) o;

        return new EqualsBuilder().append(addReturnInfo, that.addReturnInfo)
                .append(addParcelToDelivery, that.addParcelToDelivery)
                .append(addDeliveries, that.addDeliveries)
                .append(removeDelivery, that.removeDelivery)
                .append(removeParcelFromDelivery, that.removeParcelFromDelivery)
                .append(setDeliveryAddress, that.setDeliveryAddress)
                .append(setParcelMeasurements, that.setParcelMeasurements)
                .append(setParcelTrackingData, that.setParcelTrackingData)
                .append(setParcelItems, that.setParcelItems)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(addReturnInfo)
                .append(addParcelToDelivery)
                .append(addDeliveries)
                .append(removeDelivery)
                .append(removeParcelFromDelivery)
                .append(setDeliveryAddress)
                .append(setParcelMeasurements)
                .append(setParcelTrackingData)
                .append(setParcelItems)
                .toHashCode();
    }

}
