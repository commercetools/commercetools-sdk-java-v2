
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
@JsonDeserialize(as = AddItemShippingAddressesChangeImpl.class)
public interface AddItemShippingAddressesChange extends Change {

    String ADD_ITEM_SHIPPING_ADDRESSES_CHANGE = "AddItemShippingAddressesChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>addItemShippingAddress</code></p>
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

    public static AddItemShippingAddressesChange of() {
        return new AddItemShippingAddressesChangeImpl();
    }

    public static AddItemShippingAddressesChange of(final AddItemShippingAddressesChange template) {
        AddItemShippingAddressesChangeImpl instance = new AddItemShippingAddressesChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static AddItemShippingAddressesChangeBuilder builder() {
        return AddItemShippingAddressesChangeBuilder.of();
    }

    public static AddItemShippingAddressesChangeBuilder builder(final AddItemShippingAddressesChange template) {
        return AddItemShippingAddressesChangeBuilder.of(template);
    }

    default <T> T withAddItemShippingAddressesChange(Function<AddItemShippingAddressesChange, T> helper) {
        return helper.apply(this);
    }
}
