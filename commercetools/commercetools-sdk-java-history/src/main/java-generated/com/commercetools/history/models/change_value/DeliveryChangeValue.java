
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Address;
import com.commercetools.history.models.common.DeliveryItem;
import com.commercetools.history.models.common.Parcel;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = DeliveryChangeValueImpl.class)
public interface DeliveryChangeValue {

    @NotNull
    @Valid
    @JsonProperty("items")
    public List<DeliveryItem> getItems();

    @NotNull
    @Valid
    @JsonProperty("address")
    public Address getAddress();

    @NotNull
    @Valid
    @JsonProperty("parcels")
    public List<Parcel> getParcels();

    @JsonIgnore
    public void setItems(final DeliveryItem... items);

    public void setItems(final List<DeliveryItem> items);

    public void setAddress(final Address address);

    @JsonIgnore
    public void setParcels(final Parcel... parcels);

    public void setParcels(final List<Parcel> parcels);

    public static DeliveryChangeValue of() {
        return new DeliveryChangeValueImpl();
    }

    public static DeliveryChangeValue of(final DeliveryChangeValue template) {
        DeliveryChangeValueImpl instance = new DeliveryChangeValueImpl();
        instance.setItems(template.getItems());
        instance.setAddress(template.getAddress());
        instance.setParcels(template.getParcels());
        return instance;
    }

    public static DeliveryChangeValueBuilder builder() {
        return DeliveryChangeValueBuilder.of();
    }

    public static DeliveryChangeValueBuilder builder(final DeliveryChangeValue template) {
        return DeliveryChangeValueBuilder.of(template);
    }

    default <T> T withDeliveryChangeValue(Function<DeliveryChangeValue, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<DeliveryChangeValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DeliveryChangeValue>() {
            @Override
            public String toString() {
                return "TypeReference<DeliveryChangeValue>";
            }
        };
    }
}
