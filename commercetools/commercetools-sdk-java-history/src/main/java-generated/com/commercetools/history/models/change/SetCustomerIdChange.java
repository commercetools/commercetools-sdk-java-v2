
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetCustomerIdChangeImpl.class)
public interface SetCustomerIdChange extends Change {

    String SET_CUSTOMER_ID_CHANGE = "SetCustomerIdChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>setCustomerId</code></p>
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

    public static SetCustomerIdChange of() {
        return new SetCustomerIdChangeImpl();
    }

    public static SetCustomerIdChange of(final SetCustomerIdChange template) {
        SetCustomerIdChangeImpl instance = new SetCustomerIdChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetCustomerIdChangeBuilder builder() {
        return SetCustomerIdChangeBuilder.of();
    }

    public static SetCustomerIdChangeBuilder builder(final SetCustomerIdChange template) {
        return SetCustomerIdChangeBuilder.of(template);
    }

    default <T> T withSetCustomerIdChange(Function<SetCustomerIdChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetCustomerIdChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetCustomerIdChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetCustomerIdChange>";
            }
        };
    }
}
