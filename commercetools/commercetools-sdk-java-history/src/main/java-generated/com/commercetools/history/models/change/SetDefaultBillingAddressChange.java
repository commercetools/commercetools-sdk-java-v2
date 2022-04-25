
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
@JsonDeserialize(as = SetDefaultBillingAddressChangeImpl.class)
public interface SetDefaultBillingAddressChange extends Change {

    String SET_DEFAULT_BILLING_ADDRESS_CHANGE = "SetDefaultBillingAddressChange";

    /**
    *  <p>Update action for <code>setDefaultBillingAddress</code> action.</p>
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

    public static SetDefaultBillingAddressChange of() {
        return new SetDefaultBillingAddressChangeImpl();
    }

    public static SetDefaultBillingAddressChange of(final SetDefaultBillingAddressChange template) {
        SetDefaultBillingAddressChangeImpl instance = new SetDefaultBillingAddressChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetDefaultBillingAddressChangeBuilder builder() {
        return SetDefaultBillingAddressChangeBuilder.of();
    }

    public static SetDefaultBillingAddressChangeBuilder builder(final SetDefaultBillingAddressChange template) {
        return SetDefaultBillingAddressChangeBuilder.of(template);
    }

    default <T> T withSetDefaultBillingAddressChange(Function<SetDefaultBillingAddressChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetDefaultBillingAddressChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetDefaultBillingAddressChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetDefaultBillingAddressChange>";
            }
        };
    }
}
