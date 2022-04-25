
package com.commercetools.importapi.models.order_patches;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.orders.DeliveryItem;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ParcelItemsImpl.class)
public interface ParcelItems {

    @NotNull
    @JsonProperty("parcelId")
    public String getParcelId();

    @Valid
    @JsonProperty("items")
    public List<DeliveryItem> getItems();

    public void setParcelId(final String parcelId);

    @JsonIgnore
    public void setItems(final DeliveryItem... items);

    public void setItems(final List<DeliveryItem> items);

    public static ParcelItems of() {
        return new ParcelItemsImpl();
    }

    public static ParcelItems of(final ParcelItems template) {
        ParcelItemsImpl instance = new ParcelItemsImpl();
        instance.setParcelId(template.getParcelId());
        instance.setItems(template.getItems());
        return instance;
    }

    public static ParcelItemsBuilder builder() {
        return ParcelItemsBuilder.of();
    }

    public static ParcelItemsBuilder builder(final ParcelItems template) {
        return ParcelItemsBuilder.of(template);
    }

    default <T> T withParcelItems(Function<ParcelItems, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ParcelItems> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ParcelItems>() {
            @Override
            public String toString() {
                return "TypeReference<ParcelItems>";
            }
        };
    }
}
