
package com.commercetools.importapi.models.order_patches;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderFieldBuilder {

    @Nullable
    private com.commercetools.importapi.models.order_patches.ReturnInfo addReturnInfo;

    @Nullable
    private com.commercetools.importapi.models.order_patches.DeliveryParcel addParcelToDelivery;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.order_patches.DeliveryDraft> addDeliveries;

    @Nullable
    private com.commercetools.importapi.models.order_patches.RemoveDeliveryDraft removeDelivery;

    @Nullable
    private com.commercetools.importapi.models.order_patches.RemoveParcelFromDeliveryDraft removeParcelFromDelivery;

    @Nullable
    private com.commercetools.importapi.models.order_patches.DeliveryAddressDraft setDeliveryAddress;

    @Nullable
    private com.commercetools.importapi.models.order_patches.ParcelMeasurementDraft setParcelMeasurements;

    @Nullable
    private com.commercetools.importapi.models.order_patches.ParcelTrackingData setParcelTrackingData;

    @Nullable
    private java.util.List<com.commercetools.importapi.models.order_patches.ParcelItems> setParcelItems;

    public OrderFieldBuilder addReturnInfo(
            @Nullable final com.commercetools.importapi.models.order_patches.ReturnInfo addReturnInfo) {
        this.addReturnInfo = addReturnInfo;
        return this;
    }

    public OrderFieldBuilder addParcelToDelivery(
            @Nullable final com.commercetools.importapi.models.order_patches.DeliveryParcel addParcelToDelivery) {
        this.addParcelToDelivery = addParcelToDelivery;
        return this;
    }

    public OrderFieldBuilder addDeliveries(
            @Nullable final com.commercetools.importapi.models.order_patches.DeliveryDraft... addDeliveries) {
        this.addDeliveries = new ArrayList<>(Arrays.asList(addDeliveries));
        return this;
    }

    public OrderFieldBuilder addDeliveries(
            @Nullable final java.util.List<com.commercetools.importapi.models.order_patches.DeliveryDraft> addDeliveries) {
        this.addDeliveries = addDeliveries;
        return this;
    }

    public OrderFieldBuilder removeDelivery(
            @Nullable final com.commercetools.importapi.models.order_patches.RemoveDeliveryDraft removeDelivery) {
        this.removeDelivery = removeDelivery;
        return this;
    }

    public OrderFieldBuilder removeParcelFromDelivery(
            @Nullable final com.commercetools.importapi.models.order_patches.RemoveParcelFromDeliveryDraft removeParcelFromDelivery) {
        this.removeParcelFromDelivery = removeParcelFromDelivery;
        return this;
    }

    public OrderFieldBuilder setDeliveryAddress(
            @Nullable final com.commercetools.importapi.models.order_patches.DeliveryAddressDraft setDeliveryAddress) {
        this.setDeliveryAddress = setDeliveryAddress;
        return this;
    }

    public OrderFieldBuilder setParcelMeasurements(
            @Nullable final com.commercetools.importapi.models.order_patches.ParcelMeasurementDraft setParcelMeasurements) {
        this.setParcelMeasurements = setParcelMeasurements;
        return this;
    }

    public OrderFieldBuilder setParcelTrackingData(
            @Nullable final com.commercetools.importapi.models.order_patches.ParcelTrackingData setParcelTrackingData) {
        this.setParcelTrackingData = setParcelTrackingData;
        return this;
    }

    public OrderFieldBuilder setParcelItems(
            @Nullable final com.commercetools.importapi.models.order_patches.ParcelItems... setParcelItems) {
        this.setParcelItems = new ArrayList<>(Arrays.asList(setParcelItems));
        return this;
    }

    public OrderFieldBuilder setParcelItems(
            @Nullable final java.util.List<com.commercetools.importapi.models.order_patches.ParcelItems> setParcelItems) {
        this.setParcelItems = setParcelItems;
        return this;
    }

    @Nullable
    public com.commercetools.importapi.models.order_patches.ReturnInfo getAddReturnInfo() {
        return this.addReturnInfo;
    }

    @Nullable
    public com.commercetools.importapi.models.order_patches.DeliveryParcel getAddParcelToDelivery() {
        return this.addParcelToDelivery;
    }

    @Nullable
    public java.util.List<com.commercetools.importapi.models.order_patches.DeliveryDraft> getAddDeliveries() {
        return this.addDeliveries;
    }

    @Nullable
    public com.commercetools.importapi.models.order_patches.RemoveDeliveryDraft getRemoveDelivery() {
        return this.removeDelivery;
    }

    @Nullable
    public com.commercetools.importapi.models.order_patches.RemoveParcelFromDeliveryDraft getRemoveParcelFromDelivery() {
        return this.removeParcelFromDelivery;
    }

    @Nullable
    public com.commercetools.importapi.models.order_patches.DeliveryAddressDraft getSetDeliveryAddress() {
        return this.setDeliveryAddress;
    }

    @Nullable
    public com.commercetools.importapi.models.order_patches.ParcelMeasurementDraft getSetParcelMeasurements() {
        return this.setParcelMeasurements;
    }

    @Nullable
    public com.commercetools.importapi.models.order_patches.ParcelTrackingData getSetParcelTrackingData() {
        return this.setParcelTrackingData;
    }

    @Nullable
    public java.util.List<com.commercetools.importapi.models.order_patches.ParcelItems> getSetParcelItems() {
        return this.setParcelItems;
    }

    public OrderField build() {
        return new OrderFieldImpl(addReturnInfo, addParcelToDelivery, addDeliveries, removeDelivery,
            removeParcelFromDelivery, setDeliveryAddress, setParcelMeasurements, setParcelTrackingData, setParcelItems);
    }

    public static OrderFieldBuilder of() {
        return new OrderFieldBuilder();
    }

    public static OrderFieldBuilder of(final OrderField template) {
        OrderFieldBuilder builder = new OrderFieldBuilder();
        builder.addReturnInfo = template.getAddReturnInfo();
        builder.addParcelToDelivery = template.getAddParcelToDelivery();
        builder.addDeliveries = template.getAddDeliveries();
        builder.removeDelivery = template.getRemoveDelivery();
        builder.removeParcelFromDelivery = template.getRemoveParcelFromDelivery();
        builder.setDeliveryAddress = template.getSetDeliveryAddress();
        builder.setParcelMeasurements = template.getSetParcelMeasurements();
        builder.setParcelTrackingData = template.getSetParcelTrackingData();
        builder.setParcelItems = template.getSetParcelItems();
        return builder;
    }

}
