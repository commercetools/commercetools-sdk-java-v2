
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderAddDeliveryActionImpl.class)
public interface OrderAddDeliveryAction
        extends OrderUpdateAction, com.commercetools.api.models.CustomizableDraft<OrderAddDeliveryAction> {

    String ADD_DELIVERY = "addDelivery";

    @Valid
    @JsonProperty("items")
    public List<DeliveryItem> getItems();

    @Valid
    @JsonProperty("address")
    public BaseAddress getAddress();

    @Valid
    @JsonProperty("parcels")
    public List<ParcelDraft> getParcels();

    /**
    *  <p>Custom Fields for the Transaction.</p>
    */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    @JsonIgnore
    public void setItems(final DeliveryItem... items);

    public void setItems(final List<DeliveryItem> items);

    public void setAddress(final BaseAddress address);

    @JsonIgnore
    public void setParcels(final ParcelDraft... parcels);

    public void setParcels(final List<ParcelDraft> parcels);

    public void setCustom(final CustomFieldsDraft custom);

    public static OrderAddDeliveryAction of() {
        return new OrderAddDeliveryActionImpl();
    }

    public static OrderAddDeliveryAction of(final OrderAddDeliveryAction template) {
        OrderAddDeliveryActionImpl instance = new OrderAddDeliveryActionImpl();
        instance.setItems(template.getItems());
        instance.setAddress(template.getAddress());
        instance.setParcels(template.getParcels());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public static OrderAddDeliveryActionBuilder builder() {
        return OrderAddDeliveryActionBuilder.of();
    }

    public static OrderAddDeliveryActionBuilder builder(final OrderAddDeliveryAction template) {
        return OrderAddDeliveryActionBuilder.of(template);
    }

    default <T> T withOrderAddDeliveryAction(Function<OrderAddDeliveryAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderAddDeliveryAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderAddDeliveryAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderAddDeliveryAction>";
            }
        };
    }
}
