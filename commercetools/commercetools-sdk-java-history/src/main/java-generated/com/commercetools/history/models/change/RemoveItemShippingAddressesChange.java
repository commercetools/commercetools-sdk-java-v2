
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Address;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = RemoveItemShippingAddressesChangeImpl.class)
public interface RemoveItemShippingAddressesChange extends Change {

    String REMOVE_ITEM_SHIPPING_ADDRESSES_CHANGE = "RemoveItemShippingAddressesChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>removeItemShippingAddress</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Address getNextValue();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Address getPreviousValue();

    public void setChange(final String change);

    public void setNextValue(final Address nextValue);

    public void setPreviousValue(final Address previousValue);

    public static RemoveItemShippingAddressesChange of() {
        return new RemoveItemShippingAddressesChangeImpl();
    }

    public static RemoveItemShippingAddressesChange of(final RemoveItemShippingAddressesChange template) {
        RemoveItemShippingAddressesChangeImpl instance = new RemoveItemShippingAddressesChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static RemoveItemShippingAddressesChangeBuilder builder() {
        return RemoveItemShippingAddressesChangeBuilder.of();
    }

    public static RemoveItemShippingAddressesChangeBuilder builder(final RemoveItemShippingAddressesChange template) {
        return RemoveItemShippingAddressesChangeBuilder.of(template);
    }

    default <T> T withRemoveItemShippingAddressesChange(Function<RemoveItemShippingAddressesChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<RemoveItemShippingAddressesChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RemoveItemShippingAddressesChange>() {
            @Override
            public String toString() {
                return "TypeReference<RemoveItemShippingAddressesChange>";
            }
        };
    }
}
