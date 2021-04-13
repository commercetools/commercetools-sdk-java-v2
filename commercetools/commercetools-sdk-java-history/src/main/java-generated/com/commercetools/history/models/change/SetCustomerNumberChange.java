
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetCustomerNumberChangeImpl.class)
public interface SetCustomerNumberChange extends Change {

    String SET_CUSTOMER_NUMBER_CHANGE = "SetCustomerNumberChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>setCustomerNumber</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("previousValue")
    public String getPreviousValue();

    @NotNull
    @JsonProperty("nextValue")
    public String getNextValue();

    public void setChange(final String change);

    public void setPreviousValue(final String previousValue);

    public void setNextValue(final String nextValue);

    public static SetCustomerNumberChange of() {
        return new SetCustomerNumberChangeImpl();
    }

    public static SetCustomerNumberChange of(final SetCustomerNumberChange template) {
        SetCustomerNumberChangeImpl instance = new SetCustomerNumberChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetCustomerNumberChangeBuilder builder() {
        return SetCustomerNumberChangeBuilder.of();
    }

    public static SetCustomerNumberChangeBuilder builder(final SetCustomerNumberChange template) {
        return SetCustomerNumberChangeBuilder.of(template);
    }

    default <T> T withSetCustomerNumberChange(Function<SetCustomerNumberChange, T> helper) {
        return helper.apply(this);
    }
}
