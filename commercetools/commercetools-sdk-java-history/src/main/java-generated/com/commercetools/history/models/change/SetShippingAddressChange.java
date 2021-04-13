
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
@JsonDeserialize(as = SetShippingAddressChangeImpl.class)
public interface SetShippingAddressChange extends Change {

    String SET_SHIPPING_ADDRESS_CHANGE = "SetShippingAddressChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setShippingAddress</code></p>
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

    public static SetShippingAddressChange of() {
        return new SetShippingAddressChangeImpl();
    }

    public static SetShippingAddressChange of(final SetShippingAddressChange template) {
        SetShippingAddressChangeImpl instance = new SetShippingAddressChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetShippingAddressChangeBuilder builder() {
        return SetShippingAddressChangeBuilder.of();
    }

    public static SetShippingAddressChangeBuilder builder(final SetShippingAddressChange template) {
        return SetShippingAddressChangeBuilder.of(template);
    }

    default <T> T withSetShippingAddressChange(Function<SetShippingAddressChange, T> helper) {
        return helper.apply(this);
    }
}
