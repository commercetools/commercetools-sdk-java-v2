
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.order.DeliveryItem;
import com.commercetools.api.models.order.ParcelDraft;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderAddDeliveryActionImpl.class)
public interface StagedOrderAddDeliveryAction
        extends StagedOrderUpdateAction, com.commercetools.api.models.CustomizableDraft<StagedOrderAddDeliveryAction> {

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

    public static StagedOrderAddDeliveryAction of() {
        return new StagedOrderAddDeliveryActionImpl();
    }

    public static StagedOrderAddDeliveryAction of(final StagedOrderAddDeliveryAction template) {
        StagedOrderAddDeliveryActionImpl instance = new StagedOrderAddDeliveryActionImpl();
        instance.setItems(template.getItems());
        instance.setAddress(template.getAddress());
        instance.setParcels(template.getParcels());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public static StagedOrderAddDeliveryActionBuilder builder() {
        return StagedOrderAddDeliveryActionBuilder.of();
    }

    public static StagedOrderAddDeliveryActionBuilder builder(final StagedOrderAddDeliveryAction template) {
        return StagedOrderAddDeliveryActionBuilder.of(template);
    }

    default <T> T withStagedOrderAddDeliveryAction(Function<StagedOrderAddDeliveryAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderAddDeliveryAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderAddDeliveryAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderAddDeliveryAction>";
            }
        };
    }
}
