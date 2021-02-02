
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.order.DeliveryItem;
import com.commercetools.api.models.order.ParcelDraft;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = StagedOrderAddDeliveryActionImpl.class)
public interface StagedOrderAddDeliveryAction extends StagedOrderUpdateAction {

    String ADD_DELIVERY = "addDelivery";

    @Valid
    @JsonProperty("items")
    public List<DeliveryItem> getItems();

    @Valid
    @JsonProperty("address")
    public Address getAddress();

    @Valid
    @JsonProperty("parcels")
    public List<ParcelDraft> getParcels();

    @JsonIgnore
    public void setItems(final DeliveryItem... items);

    public void setItems(final List<DeliveryItem> items);

    public void setAddress(final Address address);

    @JsonIgnore
    public void setParcels(final ParcelDraft... parcels);

    public void setParcels(final List<ParcelDraft> parcels);

    public static StagedOrderAddDeliveryAction of() {
        return new StagedOrderAddDeliveryActionImpl();
    }

    public static StagedOrderAddDeliveryAction of(final StagedOrderAddDeliveryAction template) {
        StagedOrderAddDeliveryActionImpl instance = new StagedOrderAddDeliveryActionImpl();
        instance.setItems(template.getItems());
        instance.setAddress(template.getAddress());
        instance.setParcels(template.getParcels());
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
}
