
package com.commercetools.importapi.models.order_patches;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OrderFieldBuilder implements Builder<OrderField> {

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
            Function<com.commercetools.importapi.models.order_patches.ReturnInfoBuilder, com.commercetools.importapi.models.order_patches.ReturnInfoBuilder> builder) {
        this.addReturnInfo = builder.apply(com.commercetools.importapi.models.order_patches.ReturnInfoBuilder.of())
                .build();
        return this;
    }

    public OrderFieldBuilder addReturnInfo(
            @Nullable final com.commercetools.importapi.models.order_patches.ReturnInfo addReturnInfo) {
        this.addReturnInfo = addReturnInfo;
        return this;
    }

    public OrderFieldBuilder addParcelToDelivery(
            Function<com.commercetools.importapi.models.order_patches.DeliveryParcelBuilder, com.commercetools.importapi.models.order_patches.DeliveryParcelBuilder> builder) {
        this.addParcelToDelivery = builder
                .apply(com.commercetools.importapi.models.order_patches.DeliveryParcelBuilder.of())
                .build();
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

    public OrderFieldBuilder plusAddDeliveries(
            @Nullable final com.commercetools.importapi.models.order_patches.DeliveryDraft... addDeliveries) {
        if (this.addDeliveries == null) {
            this.addDeliveries = new ArrayList<>();
        }
        this.addDeliveries.addAll(Arrays.asList(addDeliveries));
        return this;
    }

    public OrderFieldBuilder plusAddDeliveries(
            Function<com.commercetools.importapi.models.order_patches.DeliveryDraftBuilder, com.commercetools.importapi.models.order_patches.DeliveryDraftBuilder> builder) {
        if (this.addDeliveries == null) {
            this.addDeliveries = new ArrayList<>();
        }
        this.addDeliveries
                .add(builder.apply(com.commercetools.importapi.models.order_patches.DeliveryDraftBuilder.of()).build());
        return this;
    }

    public OrderFieldBuilder withAddDeliveries(
            Function<com.commercetools.importapi.models.order_patches.DeliveryDraftBuilder, com.commercetools.importapi.models.order_patches.DeliveryDraftBuilder> builder) {
        this.addDeliveries = new ArrayList<>();
        this.addDeliveries
                .add(builder.apply(com.commercetools.importapi.models.order_patches.DeliveryDraftBuilder.of()).build());
        return this;
    }

    public OrderFieldBuilder removeDelivery(
            Function<com.commercetools.importapi.models.order_patches.RemoveDeliveryDraftBuilder, com.commercetools.importapi.models.order_patches.RemoveDeliveryDraftBuilder> builder) {
        this.removeDelivery = builder
                .apply(com.commercetools.importapi.models.order_patches.RemoveDeliveryDraftBuilder.of())
                .build();
        return this;
    }

    public OrderFieldBuilder removeDelivery(
            @Nullable final com.commercetools.importapi.models.order_patches.RemoveDeliveryDraft removeDelivery) {
        this.removeDelivery = removeDelivery;
        return this;
    }

    public OrderFieldBuilder removeParcelFromDelivery(
            Function<com.commercetools.importapi.models.order_patches.RemoveParcelFromDeliveryDraftBuilder, com.commercetools.importapi.models.order_patches.RemoveParcelFromDeliveryDraftBuilder> builder) {
        this.removeParcelFromDelivery = builder
                .apply(com.commercetools.importapi.models.order_patches.RemoveParcelFromDeliveryDraftBuilder.of())
                .build();
        return this;
    }

    public OrderFieldBuilder removeParcelFromDelivery(
            @Nullable final com.commercetools.importapi.models.order_patches.RemoveParcelFromDeliveryDraft removeParcelFromDelivery) {
        this.removeParcelFromDelivery = removeParcelFromDelivery;
        return this;
    }

    public OrderFieldBuilder setDeliveryAddress(
            Function<com.commercetools.importapi.models.order_patches.DeliveryAddressDraftBuilder, com.commercetools.importapi.models.order_patches.DeliveryAddressDraftBuilder> builder) {
        this.setDeliveryAddress = builder
                .apply(com.commercetools.importapi.models.order_patches.DeliveryAddressDraftBuilder.of())
                .build();
        return this;
    }

    public OrderFieldBuilder setDeliveryAddress(
            @Nullable final com.commercetools.importapi.models.order_patches.DeliveryAddressDraft setDeliveryAddress) {
        this.setDeliveryAddress = setDeliveryAddress;
        return this;
    }

    public OrderFieldBuilder setParcelMeasurements(
            Function<com.commercetools.importapi.models.order_patches.ParcelMeasurementDraftBuilder, com.commercetools.importapi.models.order_patches.ParcelMeasurementDraftBuilder> builder) {
        this.setParcelMeasurements = builder
                .apply(com.commercetools.importapi.models.order_patches.ParcelMeasurementDraftBuilder.of())
                .build();
        return this;
    }

    public OrderFieldBuilder setParcelMeasurements(
            @Nullable final com.commercetools.importapi.models.order_patches.ParcelMeasurementDraft setParcelMeasurements) {
        this.setParcelMeasurements = setParcelMeasurements;
        return this;
    }

    public OrderFieldBuilder setParcelTrackingData(
            Function<com.commercetools.importapi.models.order_patches.ParcelTrackingDataBuilder, com.commercetools.importapi.models.order_patches.ParcelTrackingDataBuilder> builder) {
        this.setParcelTrackingData = builder
                .apply(com.commercetools.importapi.models.order_patches.ParcelTrackingDataBuilder.of())
                .build();
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

    public OrderFieldBuilder plusSetParcelItems(
            @Nullable final com.commercetools.importapi.models.order_patches.ParcelItems... setParcelItems) {
        if (this.setParcelItems == null) {
            this.setParcelItems = new ArrayList<>();
        }
        this.setParcelItems.addAll(Arrays.asList(setParcelItems));
        return this;
    }

    public OrderFieldBuilder plusSetParcelItems(
            Function<com.commercetools.importapi.models.order_patches.ParcelItemsBuilder, com.commercetools.importapi.models.order_patches.ParcelItemsBuilder> builder) {
        if (this.setParcelItems == null) {
            this.setParcelItems = new ArrayList<>();
        }
        this.setParcelItems
                .add(builder.apply(com.commercetools.importapi.models.order_patches.ParcelItemsBuilder.of()).build());
        return this;
    }

    public OrderFieldBuilder withSetParcelItems(
            Function<com.commercetools.importapi.models.order_patches.ParcelItemsBuilder, com.commercetools.importapi.models.order_patches.ParcelItemsBuilder> builder) {
        this.setParcelItems = new ArrayList<>();
        this.setParcelItems
                .add(builder.apply(com.commercetools.importapi.models.order_patches.ParcelItemsBuilder.of()).build());
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

    /**
     * builds OrderField without checking for non null required values
     */
    public OrderField buildUnchecked() {
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
