
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetCustomerEmailChangeImpl.class)
public interface SetCustomerEmailChange extends Change {

    String SET_CUSTOMER_EMAIL_CHANGE = "SetCustomerEmailChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>setCustomerEmail</code></p>
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

    public static SetCustomerEmailChange of() {
        return new SetCustomerEmailChangeImpl();
    }

    public static SetCustomerEmailChange of(final SetCustomerEmailChange template) {
        SetCustomerEmailChangeImpl instance = new SetCustomerEmailChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetCustomerEmailChangeBuilder builder() {
        return SetCustomerEmailChangeBuilder.of();
    }

    public static SetCustomerEmailChangeBuilder builder(final SetCustomerEmailChange template) {
        return SetCustomerEmailChangeBuilder.of(template);
    }

    default <T> T withSetCustomerEmailChange(Function<SetCustomerEmailChange, T> helper) {
        return helper.apply(this);
    }
}
