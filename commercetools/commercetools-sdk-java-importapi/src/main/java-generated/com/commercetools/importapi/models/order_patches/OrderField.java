
package com.commercetools.importapi.models.order_patches;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Order fields that needs to be added or updated.</p>
 *
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
@JsonDeserialize(as = OrderFieldImpl.class)
public interface OrderField {

    /**
     *  <p>Maps to <code>Order.returnInfo</code></p>
     * @return addReturnInfo
     */
    @Valid
    @JsonProperty("addReturnInfo")
    public ReturnInfo getAddReturnInfo();

    /**
     *  <p>Maps to <code>Order.delivery</code></p>
     * @return addParcelToDelivery
     */
    @Valid
    @JsonProperty("addParcelToDelivery")
    public DeliveryParcel getAddParcelToDelivery();

    /**
     *  <p>Maps to <code>Order.delivery</code></p>
     * @return addDeliveries
     */
    @Valid
    @JsonProperty("addDeliveries")
    public List<DeliveryDraft> getAddDeliveries();

    /**
     *  <p>Maps to <code>Order.removeDelivery</code></p>
     * @return removeDelivery
     */
    @Valid
    @JsonProperty("removeDelivery")
    public RemoveDeliveryDraft getRemoveDelivery();

    /**
     *  <p>Maps to <code>Order.removeParcelFromDelivery</code></p>
     * @return removeParcelFromDelivery
     */
    @Valid
    @JsonProperty("removeParcelFromDelivery")
    public RemoveParcelFromDeliveryDraft getRemoveParcelFromDelivery();

    /**
     *  <p>Maps to <code>Order.addressDraft</code></p>
     * @return setDeliveryAddress
     */
    @Valid
    @JsonProperty("setDeliveryAddress")
    public DeliveryAddressDraft getSetDeliveryAddress();

    /**
     *  <p>Maps to <code>Order.parcelMeasurements</code></p>
     * @return setParcelMeasurements
     */
    @Valid
    @JsonProperty("setParcelMeasurements")
    public ParcelMeasurementDraft getSetParcelMeasurements();

    /**
     *  <p>Maps to <code>Order.parcelTrackingData</code></p>
     * @return setParcelTrackingData
     */
    @Valid
    @JsonProperty("setParcelTrackingData")
    public ParcelTrackingData getSetParcelTrackingData();

    /**
     *  <p>Maps to <code>Order.parcelItems</code></p>
     * @return setParcelItems
     */
    @Valid
    @JsonProperty("setParcelItems")
    public List<ParcelItems> getSetParcelItems();

    /**
     *  <p>Maps to <code>Order.returnInfo</code></p>
     * @param addReturnInfo value to be set
     */

    public void setAddReturnInfo(final ReturnInfo addReturnInfo);

    /**
     *  <p>Maps to <code>Order.delivery</code></p>
     * @param addParcelToDelivery value to be set
     */

    public void setAddParcelToDelivery(final DeliveryParcel addParcelToDelivery);

    /**
     *  <p>Maps to <code>Order.delivery</code></p>
     * @param addDeliveries values to be set
     */

    @JsonIgnore
    public void setAddDeliveries(final DeliveryDraft... addDeliveries);

    /**
     *  <p>Maps to <code>Order.delivery</code></p>
     * @param addDeliveries values to be set
     */

    public void setAddDeliveries(final List<DeliveryDraft> addDeliveries);

    /**
     *  <p>Maps to <code>Order.removeDelivery</code></p>
     * @param removeDelivery value to be set
     */

    public void setRemoveDelivery(final RemoveDeliveryDraft removeDelivery);

    /**
     *  <p>Maps to <code>Order.removeParcelFromDelivery</code></p>
     * @param removeParcelFromDelivery value to be set
     */

    public void setRemoveParcelFromDelivery(final RemoveParcelFromDeliveryDraft removeParcelFromDelivery);

    /**
     *  <p>Maps to <code>Order.addressDraft</code></p>
     * @param setDeliveryAddress value to be set
     */

    public void setSetDeliveryAddress(final DeliveryAddressDraft setDeliveryAddress);

    /**
     *  <p>Maps to <code>Order.parcelMeasurements</code></p>
     * @param setParcelMeasurements value to be set
     */

    public void setSetParcelMeasurements(final ParcelMeasurementDraft setParcelMeasurements);

    /**
     *  <p>Maps to <code>Order.parcelTrackingData</code></p>
     * @param setParcelTrackingData value to be set
     */

    public void setSetParcelTrackingData(final ParcelTrackingData setParcelTrackingData);

    /**
     *  <p>Maps to <code>Order.parcelItems</code></p>
     * @param setParcelItems values to be set
     */

    @JsonIgnore
    public void setSetParcelItems(final ParcelItems... setParcelItems);

    /**
     *  <p>Maps to <code>Order.parcelItems</code></p>
     * @param setParcelItems values to be set
     */

    public void setSetParcelItems(final List<ParcelItems> setParcelItems);

    /**
     * factory method
     * @return instance of OrderField
     */
    public static OrderField of() {
        return new OrderFieldImpl();
    }

    /**
     * factory method to copy an instance of OrderField
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderField of(final OrderField template) {
        OrderFieldImpl instance = new OrderFieldImpl();
        instance.setAddReturnInfo(template.getAddReturnInfo());
        instance.setAddParcelToDelivery(template.getAddParcelToDelivery());
        instance.setAddDeliveries(template.getAddDeliveries());
        instance.setRemoveDelivery(template.getRemoveDelivery());
        instance.setRemoveParcelFromDelivery(template.getRemoveParcelFromDelivery());
        instance.setSetDeliveryAddress(template.getSetDeliveryAddress());
        instance.setSetParcelMeasurements(template.getSetParcelMeasurements());
        instance.setSetParcelTrackingData(template.getSetParcelTrackingData());
        instance.setSetParcelItems(template.getSetParcelItems());
        return instance;
    }

    /**
     * builder factory method for OrderField
     * @return builder
     */
    public static OrderFieldBuilder builder() {
        return OrderFieldBuilder.of();
    }

    /**
     * create builder for OrderField instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderFieldBuilder builder(final OrderField template) {
        return OrderFieldBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderField(Function<OrderField, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderField> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderField>() {
            @Override
            public String toString() {
                return "TypeReference<OrderField>";
            }
        };
    }
}
