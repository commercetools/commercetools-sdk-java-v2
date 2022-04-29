
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
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderFieldImpl.class)
public interface OrderField {

    /**
    *  <p>Maps to <code>Order.returnInfo</code></p>
    */
    @Valid
    @JsonProperty("addReturnInfo")
    public ReturnInfo getAddReturnInfo();

    /**
    *  <p>Maps to <code>Order.delivery</code></p>
    */
    @Valid
    @JsonProperty("addParcelToDelivery")
    public DeliveryParcel getAddParcelToDelivery();

    /**
    *  <p>Maps to <code>Order.delivery</code></p>
    */
    @Valid
    @JsonProperty("addDeliveries")
    public List<DeliveryDraft> getAddDeliveries();

    /**
    *  <p>Maps to <code>Order.removeDelivery</code></p>
    */
    @Valid
    @JsonProperty("removeDelivery")
    public RemoveDeliveryDraft getRemoveDelivery();

    /**
    *  <p>Maps to <code>Order.removeParcelFromDelivery</code></p>
    */
    @Valid
    @JsonProperty("removeParcelFromDelivery")
    public RemoveParcelFromDeliveryDraft getRemoveParcelFromDelivery();

    /**
    *  <p>Maps to <code>Order.addressDraft</code></p>
    */
    @Valid
    @JsonProperty("setDeliveryAddress")
    public DeliveryAddressDraft getSetDeliveryAddress();

    /**
    *  <p>Maps to <code>Order.parcelMeasurements</code></p>
    */
    @Valid
    @JsonProperty("setParcelMeasurements")
    public ParcelMeasurementDraft getSetParcelMeasurements();

    /**
    *  <p>Maps to <code>Order.parcelTrackingData</code></p>
    */
    @Valid
    @JsonProperty("setParcelTrackingData")
    public ParcelTrackingData getSetParcelTrackingData();

    /**
    *  <p>Maps to <code>Order.parcelItems</code></p>
    */
    @Valid
    @JsonProperty("setParcelItems")
    public List<ParcelItems> getSetParcelItems();

    public void setAddReturnInfo(final ReturnInfo addReturnInfo);

    public void setAddParcelToDelivery(final DeliveryParcel addParcelToDelivery);

    @JsonIgnore
    public void setAddDeliveries(final DeliveryDraft... addDeliveries);

    public void setAddDeliveries(final List<DeliveryDraft> addDeliveries);

    public void setRemoveDelivery(final RemoveDeliveryDraft removeDelivery);

    public void setRemoveParcelFromDelivery(final RemoveParcelFromDeliveryDraft removeParcelFromDelivery);

    public void setSetDeliveryAddress(final DeliveryAddressDraft setDeliveryAddress);

    public void setSetParcelMeasurements(final ParcelMeasurementDraft setParcelMeasurements);

    public void setSetParcelTrackingData(final ParcelTrackingData setParcelTrackingData);

    @JsonIgnore
    public void setSetParcelItems(final ParcelItems... setParcelItems);

    public void setSetParcelItems(final List<ParcelItems> setParcelItems);

    public static OrderField of() {
        return new OrderFieldImpl();
    }

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

    public static OrderFieldBuilder builder() {
        return OrderFieldBuilder.of();
    }

    public static OrderFieldBuilder builder(final OrderField template) {
        return OrderFieldBuilder.of(template);
    }

    default <T> T withOrderField(Function<OrderField, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderField> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderField>() {
            @Override
            public String toString() {
                return "TypeReference<OrderField>";
            }
        };
    }
}
