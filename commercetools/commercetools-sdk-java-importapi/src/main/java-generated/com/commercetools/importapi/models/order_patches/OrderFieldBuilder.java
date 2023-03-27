
package com.commercetools.importapi.models.order_patches;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderFieldBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderField orderField = OrderField.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
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

    /**
     *  <p>Maps to <code>Order.returnInfo</code></p>
     * @param builder function to build the addReturnInfo value
     * @return Builder
     */

    public OrderFieldBuilder addReturnInfo(
            Function<com.commercetools.importapi.models.order_patches.ReturnInfoBuilder, com.commercetools.importapi.models.order_patches.ReturnInfoBuilder> builder) {
        this.addReturnInfo = builder.apply(com.commercetools.importapi.models.order_patches.ReturnInfoBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Maps to <code>Order.returnInfo</code></p>
     * @param addReturnInfo value to be set
     * @return Builder
     */

    public OrderFieldBuilder addReturnInfo(
            @Nullable final com.commercetools.importapi.models.order_patches.ReturnInfo addReturnInfo) {
        this.addReturnInfo = addReturnInfo;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.delivery</code></p>
     * @param builder function to build the addParcelToDelivery value
     * @return Builder
     */

    public OrderFieldBuilder addParcelToDelivery(
            Function<com.commercetools.importapi.models.order_patches.DeliveryParcelBuilder, com.commercetools.importapi.models.order_patches.DeliveryParcelBuilder> builder) {
        this.addParcelToDelivery = builder
                .apply(com.commercetools.importapi.models.order_patches.DeliveryParcelBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Maps to <code>Order.delivery</code></p>
     * @param addParcelToDelivery value to be set
     * @return Builder
     */

    public OrderFieldBuilder addParcelToDelivery(
            @Nullable final com.commercetools.importapi.models.order_patches.DeliveryParcel addParcelToDelivery) {
        this.addParcelToDelivery = addParcelToDelivery;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.delivery</code></p>
     * @param addDeliveries value to be set
     * @return Builder
     */

    public OrderFieldBuilder addDeliveries(
            @Nullable final com.commercetools.importapi.models.order_patches.DeliveryDraft... addDeliveries) {
        this.addDeliveries = new ArrayList<>(Arrays.asList(addDeliveries));
        return this;
    }

    /**
     *  <p>Maps to <code>Order.delivery</code></p>
     * @param addDeliveries value to be set
     * @return Builder
     */

    public OrderFieldBuilder addDeliveries(
            @Nullable final java.util.List<com.commercetools.importapi.models.order_patches.DeliveryDraft> addDeliveries) {
        this.addDeliveries = addDeliveries;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.delivery</code></p>
     * @param addDeliveries value to be set
     * @return Builder
     */

    public OrderFieldBuilder plusAddDeliveries(
            @Nullable final com.commercetools.importapi.models.order_patches.DeliveryDraft... addDeliveries) {
        if (this.addDeliveries == null) {
            this.addDeliveries = new ArrayList<>();
        }
        this.addDeliveries.addAll(Arrays.asList(addDeliveries));
        return this;
    }

    /**
     *  <p>Maps to <code>Order.delivery</code></p>
     * @param builder function to build the addDeliveries value
     * @return Builder
     */

    public OrderFieldBuilder plusAddDeliveries(
            Function<com.commercetools.importapi.models.order_patches.DeliveryDraftBuilder, com.commercetools.importapi.models.order_patches.DeliveryDraftBuilder> builder) {
        if (this.addDeliveries == null) {
            this.addDeliveries = new ArrayList<>();
        }
        this.addDeliveries
                .add(builder.apply(com.commercetools.importapi.models.order_patches.DeliveryDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>Order.delivery</code></p>
     * @param builder function to build the addDeliveries value
     * @return Builder
     */

    public OrderFieldBuilder withAddDeliveries(
            Function<com.commercetools.importapi.models.order_patches.DeliveryDraftBuilder, com.commercetools.importapi.models.order_patches.DeliveryDraftBuilder> builder) {
        this.addDeliveries = new ArrayList<>();
        this.addDeliveries
                .add(builder.apply(com.commercetools.importapi.models.order_patches.DeliveryDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>Order.removeDelivery</code></p>
     * @param builder function to build the removeDelivery value
     * @return Builder
     */

    public OrderFieldBuilder removeDelivery(
            Function<com.commercetools.importapi.models.order_patches.RemoveDeliveryDraftBuilder, com.commercetools.importapi.models.order_patches.RemoveDeliveryDraftBuilder> builder) {
        this.removeDelivery = builder
                .apply(com.commercetools.importapi.models.order_patches.RemoveDeliveryDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Maps to <code>Order.removeDelivery</code></p>
     * @param removeDelivery value to be set
     * @return Builder
     */

    public OrderFieldBuilder removeDelivery(
            @Nullable final com.commercetools.importapi.models.order_patches.RemoveDeliveryDraft removeDelivery) {
        this.removeDelivery = removeDelivery;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.removeParcelFromDelivery</code></p>
     * @param builder function to build the removeParcelFromDelivery value
     * @return Builder
     */

    public OrderFieldBuilder removeParcelFromDelivery(
            Function<com.commercetools.importapi.models.order_patches.RemoveParcelFromDeliveryDraftBuilder, com.commercetools.importapi.models.order_patches.RemoveParcelFromDeliveryDraftBuilder> builder) {
        this.removeParcelFromDelivery = builder
                .apply(com.commercetools.importapi.models.order_patches.RemoveParcelFromDeliveryDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Maps to <code>Order.removeParcelFromDelivery</code></p>
     * @param removeParcelFromDelivery value to be set
     * @return Builder
     */

    public OrderFieldBuilder removeParcelFromDelivery(
            @Nullable final com.commercetools.importapi.models.order_patches.RemoveParcelFromDeliveryDraft removeParcelFromDelivery) {
        this.removeParcelFromDelivery = removeParcelFromDelivery;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.addressDraft</code></p>
     * @param builder function to build the setDeliveryAddress value
     * @return Builder
     */

    public OrderFieldBuilder setDeliveryAddress(
            Function<com.commercetools.importapi.models.order_patches.DeliveryAddressDraftBuilder, com.commercetools.importapi.models.order_patches.DeliveryAddressDraftBuilder> builder) {
        this.setDeliveryAddress = builder
                .apply(com.commercetools.importapi.models.order_patches.DeliveryAddressDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Maps to <code>Order.addressDraft</code></p>
     * @param setDeliveryAddress value to be set
     * @return Builder
     */

    public OrderFieldBuilder setDeliveryAddress(
            @Nullable final com.commercetools.importapi.models.order_patches.DeliveryAddressDraft setDeliveryAddress) {
        this.setDeliveryAddress = setDeliveryAddress;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.parcelMeasurements</code></p>
     * @param builder function to build the setParcelMeasurements value
     * @return Builder
     */

    public OrderFieldBuilder setParcelMeasurements(
            Function<com.commercetools.importapi.models.order_patches.ParcelMeasurementDraftBuilder, com.commercetools.importapi.models.order_patches.ParcelMeasurementDraftBuilder> builder) {
        this.setParcelMeasurements = builder
                .apply(com.commercetools.importapi.models.order_patches.ParcelMeasurementDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Maps to <code>Order.parcelMeasurements</code></p>
     * @param setParcelMeasurements value to be set
     * @return Builder
     */

    public OrderFieldBuilder setParcelMeasurements(
            @Nullable final com.commercetools.importapi.models.order_patches.ParcelMeasurementDraft setParcelMeasurements) {
        this.setParcelMeasurements = setParcelMeasurements;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.parcelTrackingData</code></p>
     * @param builder function to build the setParcelTrackingData value
     * @return Builder
     */

    public OrderFieldBuilder setParcelTrackingData(
            Function<com.commercetools.importapi.models.order_patches.ParcelTrackingDataBuilder, com.commercetools.importapi.models.order_patches.ParcelTrackingDataBuilder> builder) {
        this.setParcelTrackingData = builder
                .apply(com.commercetools.importapi.models.order_patches.ParcelTrackingDataBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Maps to <code>Order.parcelTrackingData</code></p>
     * @param setParcelTrackingData value to be set
     * @return Builder
     */

    public OrderFieldBuilder setParcelTrackingData(
            @Nullable final com.commercetools.importapi.models.order_patches.ParcelTrackingData setParcelTrackingData) {
        this.setParcelTrackingData = setParcelTrackingData;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.parcelItems</code></p>
     * @param setParcelItems value to be set
     * @return Builder
     */

    public OrderFieldBuilder setParcelItems(
            @Nullable final com.commercetools.importapi.models.order_patches.ParcelItems... setParcelItems) {
        this.setParcelItems = new ArrayList<>(Arrays.asList(setParcelItems));
        return this;
    }

    /**
     *  <p>Maps to <code>Order.parcelItems</code></p>
     * @param setParcelItems value to be set
     * @return Builder
     */

    public OrderFieldBuilder setParcelItems(
            @Nullable final java.util.List<com.commercetools.importapi.models.order_patches.ParcelItems> setParcelItems) {
        this.setParcelItems = setParcelItems;
        return this;
    }

    /**
     *  <p>Maps to <code>Order.parcelItems</code></p>
     * @param setParcelItems value to be set
     * @return Builder
     */

    public OrderFieldBuilder plusSetParcelItems(
            @Nullable final com.commercetools.importapi.models.order_patches.ParcelItems... setParcelItems) {
        if (this.setParcelItems == null) {
            this.setParcelItems = new ArrayList<>();
        }
        this.setParcelItems.addAll(Arrays.asList(setParcelItems));
        return this;
    }

    /**
     *  <p>Maps to <code>Order.parcelItems</code></p>
     * @param builder function to build the setParcelItems value
     * @return Builder
     */

    public OrderFieldBuilder plusSetParcelItems(
            Function<com.commercetools.importapi.models.order_patches.ParcelItemsBuilder, com.commercetools.importapi.models.order_patches.ParcelItemsBuilder> builder) {
        if (this.setParcelItems == null) {
            this.setParcelItems = new ArrayList<>();
        }
        this.setParcelItems
                .add(builder.apply(com.commercetools.importapi.models.order_patches.ParcelItemsBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>Order.parcelItems</code></p>
     * @param builder function to build the setParcelItems value
     * @return Builder
     */

    public OrderFieldBuilder withSetParcelItems(
            Function<com.commercetools.importapi.models.order_patches.ParcelItemsBuilder, com.commercetools.importapi.models.order_patches.ParcelItemsBuilder> builder) {
        this.setParcelItems = new ArrayList<>();
        this.setParcelItems
                .add(builder.apply(com.commercetools.importapi.models.order_patches.ParcelItemsBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Maps to <code>Order.returnInfo</code></p>
     * @return addReturnInfo
     */

    @Nullable
    public com.commercetools.importapi.models.order_patches.ReturnInfo getAddReturnInfo() {
        return this.addReturnInfo;
    }

    /**
     *  <p>Maps to <code>Order.delivery</code></p>
     * @return addParcelToDelivery
     */

    @Nullable
    public com.commercetools.importapi.models.order_patches.DeliveryParcel getAddParcelToDelivery() {
        return this.addParcelToDelivery;
    }

    /**
     *  <p>Maps to <code>Order.delivery</code></p>
     * @return addDeliveries
     */

    @Nullable
    public java.util.List<com.commercetools.importapi.models.order_patches.DeliveryDraft> getAddDeliveries() {
        return this.addDeliveries;
    }

    /**
     *  <p>Maps to <code>Order.removeDelivery</code></p>
     * @return removeDelivery
     */

    @Nullable
    public com.commercetools.importapi.models.order_patches.RemoveDeliveryDraft getRemoveDelivery() {
        return this.removeDelivery;
    }

    /**
     *  <p>Maps to <code>Order.removeParcelFromDelivery</code></p>
     * @return removeParcelFromDelivery
     */

    @Nullable
    public com.commercetools.importapi.models.order_patches.RemoveParcelFromDeliveryDraft getRemoveParcelFromDelivery() {
        return this.removeParcelFromDelivery;
    }

    /**
     *  <p>Maps to <code>Order.addressDraft</code></p>
     * @return setDeliveryAddress
     */

    @Nullable
    public com.commercetools.importapi.models.order_patches.DeliveryAddressDraft getSetDeliveryAddress() {
        return this.setDeliveryAddress;
    }

    /**
     *  <p>Maps to <code>Order.parcelMeasurements</code></p>
     * @return setParcelMeasurements
     */

    @Nullable
    public com.commercetools.importapi.models.order_patches.ParcelMeasurementDraft getSetParcelMeasurements() {
        return this.setParcelMeasurements;
    }

    /**
     *  <p>Maps to <code>Order.parcelTrackingData</code></p>
     * @return setParcelTrackingData
     */

    @Nullable
    public com.commercetools.importapi.models.order_patches.ParcelTrackingData getSetParcelTrackingData() {
        return this.setParcelTrackingData;
    }

    /**
     *  <p>Maps to <code>Order.parcelItems</code></p>
     * @return setParcelItems
     */

    @Nullable
    public java.util.List<com.commercetools.importapi.models.order_patches.ParcelItems> getSetParcelItems() {
        return this.setParcelItems;
    }

    /**
     * builds OrderField with checking for non-null required values
     * @return OrderField
     */
    public OrderField build() {
        return new OrderFieldImpl(addReturnInfo, addParcelToDelivery, addDeliveries, removeDelivery,
            removeParcelFromDelivery, setDeliveryAddress, setParcelMeasurements, setParcelTrackingData, setParcelItems);
    }

    /**
     * builds OrderField without checking for non-null required values
     * @return OrderField
     */
    public OrderField buildUnchecked() {
        return new OrderFieldImpl(addReturnInfo, addParcelToDelivery, addDeliveries, removeDelivery,
            removeParcelFromDelivery, setDeliveryAddress, setParcelMeasurements, setParcelTrackingData, setParcelItems);
    }

    /**
     * factory method for an instance of OrderFieldBuilder
     * @return builder
     */
    public static OrderFieldBuilder of() {
        return new OrderFieldBuilder();
    }

    /**
     * create builder for OrderField instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
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
