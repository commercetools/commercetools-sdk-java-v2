
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetCustomerGroupChangeImpl.class)
public interface SetCustomerGroupChange extends Change {

    String SET_CUSTOMER_GROUP_CHANGE = "SetCustomerGroupChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>setCustomerGroup</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public Reference getPreviousValue();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Reference getNextValue();

    public void setChange(final String change);

    public void setPreviousValue(final Reference previousValue);

    public void setNextValue(final Reference nextValue);

    public static SetCustomerGroupChange of() {
        return new SetCustomerGroupChangeImpl();
    }

    public static SetCustomerGroupChange of(final SetCustomerGroupChange template) {
        SetCustomerGroupChangeImpl instance = new SetCustomerGroupChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetCustomerGroupChangeBuilder builder() {
        return SetCustomerGroupChangeBuilder.of();
    }

    public static SetCustomerGroupChangeBuilder builder(final SetCustomerGroupChange template) {
        return SetCustomerGroupChangeBuilder.of(template);
    }

    default <T> T withSetCustomerGroupChange(Function<SetCustomerGroupChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetCustomerGroupChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetCustomerGroupChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetCustomerGroupChange>";
            }
        };
    }
}
