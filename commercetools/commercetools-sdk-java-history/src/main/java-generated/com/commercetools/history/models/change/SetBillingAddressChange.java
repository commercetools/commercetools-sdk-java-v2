
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
@JsonDeserialize(as = SetBillingAddressChangeImpl.class)
public interface SetBillingAddressChange extends Change {

    String SET_BILLING_ADDRESS_CHANGE = "SetBillingAddressChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setBillingAddress</code></p>
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

    public static SetBillingAddressChange of() {
        return new SetBillingAddressChangeImpl();
    }

    public static SetBillingAddressChange of(final SetBillingAddressChange template) {
        SetBillingAddressChangeImpl instance = new SetBillingAddressChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetBillingAddressChangeBuilder builder() {
        return SetBillingAddressChangeBuilder.of();
    }

    public static SetBillingAddressChangeBuilder builder(final SetBillingAddressChange template) {
        return SetBillingAddressChangeBuilder.of(template);
    }

    default <T> T withSetBillingAddressChange(Function<SetBillingAddressChange, T> helper) {
        return helper.apply(this);
    }
}
