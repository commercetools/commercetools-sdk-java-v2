
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
@JsonDeserialize(as = AddAddressChangeImpl.class)
public interface AddAddressChange extends Change {

    String ADD_ADDRESS_CHANGE = "AddAddressChange";

    /**
    *  <p>Update action for <code>setAddress</code> action.</p>
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

    public static AddAddressChange of() {
        return new AddAddressChangeImpl();
    }

    public static AddAddressChange of(final AddAddressChange template) {
        AddAddressChangeImpl instance = new AddAddressChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static AddAddressChangeBuilder builder() {
        return AddAddressChangeBuilder.of();
    }

    public static AddAddressChangeBuilder builder(final AddAddressChange template) {
        return AddAddressChangeBuilder.of(template);
    }

    default <T> T withAddAddressChange(Function<AddAddressChange, T> helper) {
        return helper.apply(this);
    }
}
