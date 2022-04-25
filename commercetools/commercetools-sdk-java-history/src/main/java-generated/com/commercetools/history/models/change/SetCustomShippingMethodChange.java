
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.CustomShippingMethodChangeValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetCustomShippingMethodChangeImpl.class)
public interface SetCustomShippingMethodChange extends Change {

    String SET_CUSTOM_SHIPPING_METHOD_CHANGE = "SetCustomShippingMethodChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setCustomShippingMethod</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public CustomShippingMethodChangeValue getNextValue();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public CustomShippingMethodChangeValue getPreviousValue();

    public void setChange(final String change);

    public void setNextValue(final CustomShippingMethodChangeValue nextValue);

    public void setPreviousValue(final CustomShippingMethodChangeValue previousValue);

    public static SetCustomShippingMethodChange of() {
        return new SetCustomShippingMethodChangeImpl();
    }

    public static SetCustomShippingMethodChange of(final SetCustomShippingMethodChange template) {
        SetCustomShippingMethodChangeImpl instance = new SetCustomShippingMethodChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetCustomShippingMethodChangeBuilder builder() {
        return SetCustomShippingMethodChangeBuilder.of();
    }

    public static SetCustomShippingMethodChangeBuilder builder(final SetCustomShippingMethodChange template) {
        return SetCustomShippingMethodChangeBuilder.of(template);
    }

    default <T> T withSetCustomShippingMethodChange(Function<SetCustomShippingMethodChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetCustomShippingMethodChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetCustomShippingMethodChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetCustomShippingMethodChange>";
            }
        };
    }
}
