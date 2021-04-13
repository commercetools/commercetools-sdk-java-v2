
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
@JsonDeserialize(as = SetDefaultShippingAddressChangeImpl.class)
public interface SetDefaultShippingAddressChange extends Change {

    String SET_DEFAULT_SHIPPING_ADDRESS_CHANGE = "SetDefaultShippingAddressChange";

    /**
    *  <p>Update action for <code>setDefaultShippingAddress</code> action.</p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("type")
    public String getType();

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

    public static SetDefaultShippingAddressChange of() {
        return new SetDefaultShippingAddressChangeImpl();
    }

    public static SetDefaultShippingAddressChange of(final SetDefaultShippingAddressChange template) {
        SetDefaultShippingAddressChangeImpl instance = new SetDefaultShippingAddressChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetDefaultShippingAddressChangeBuilder builder() {
        return SetDefaultShippingAddressChangeBuilder.of();
    }

    public static SetDefaultShippingAddressChangeBuilder builder(final SetDefaultShippingAddressChange template) {
        return SetDefaultShippingAddressChangeBuilder.of(template);
    }

    default <T> T withSetDefaultShippingAddressChange(Function<SetDefaultShippingAddressChange, T> helper) {
        return helper.apply(this);
    }
}
