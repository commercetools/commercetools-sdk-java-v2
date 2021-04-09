
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
@JsonDeserialize(as = SetAddressChangeImpl.class)
public interface SetAddressChange extends Change {

    String SET_ADDRESS_CHANGE = "SetAddressChange";

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

    public static SetAddressChange of() {
        return new SetAddressChangeImpl();
    }

    public static SetAddressChange of(final SetAddressChange template) {
        SetAddressChangeImpl instance = new SetAddressChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetAddressChangeBuilder builder() {
        return SetAddressChangeBuilder.of();
    }

    public static SetAddressChangeBuilder builder(final SetAddressChange template) {
        return SetAddressChangeBuilder.of(template);
    }

    default <T> T withSetAddressChange(Function<SetAddressChange, T> helper) {
        return helper.apply(this);
    }
}
