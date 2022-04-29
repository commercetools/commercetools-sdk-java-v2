
package com.commercetools.importapi.models.order_patches;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.Address;
import com.commercetools.importapi.models.orders.DeliveryItem;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = DeliveryDraftImpl.class)
public interface DeliveryDraft {

    @NotNull
    @Valid
    @JsonProperty("items")
    public List<DeliveryItem> getItems();

    @Valid
    @JsonProperty("address")
    public Address getAddress();

    @NotNull
    @Valid
    @JsonProperty("parcels")
    public List<DeliveryParcelDraft> getParcels();

    @JsonIgnore
    public void setItems(final DeliveryItem... items);

    public void setItems(final List<DeliveryItem> items);

    public void setAddress(final Address address);

    @JsonIgnore
    public void setParcels(final DeliveryParcelDraft... parcels);

    public void setParcels(final List<DeliveryParcelDraft> parcels);

    public static DeliveryDraft of() {
        return new DeliveryDraftImpl();
    }

    public static DeliveryDraft of(final DeliveryDraft template) {
        DeliveryDraftImpl instance = new DeliveryDraftImpl();
        instance.setItems(template.getItems());
        instance.setAddress(template.getAddress());
        instance.setParcels(template.getParcels());
        return instance;
    }

    public static DeliveryDraftBuilder builder() {
        return DeliveryDraftBuilder.of();
    }

    public static DeliveryDraftBuilder builder(final DeliveryDraft template) {
        return DeliveryDraftBuilder.of(template);
    }

    default <T> T withDeliveryDraft(Function<DeliveryDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DeliveryDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DeliveryDraft>() {
            @Override
            public String toString() {
                return "TypeReference<DeliveryDraft>";
            }
        };
    }
}
