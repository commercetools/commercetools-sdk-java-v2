
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.ShippingMethodChangeValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetShippingMethodChangeImpl.class)
public interface SetShippingMethodChange extends Change {

    String SET_SHIPPING_METHOD_CHANGE = "SetShippingMethodChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setShippingMethod</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public ShippingMethodChangeValue getNextValue();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public ShippingMethodChangeValue getPreviousValue();

    public void setChange(final String change);

    public void setNextValue(final ShippingMethodChangeValue nextValue);

    public void setPreviousValue(final ShippingMethodChangeValue previousValue);

    public static SetShippingMethodChange of() {
        return new SetShippingMethodChangeImpl();
    }

    public static SetShippingMethodChange of(final SetShippingMethodChange template) {
        SetShippingMethodChangeImpl instance = new SetShippingMethodChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetShippingMethodChangeBuilder builder() {
        return SetShippingMethodChangeBuilder.of();
    }

    public static SetShippingMethodChangeBuilder builder(final SetShippingMethodChange template) {
        return SetShippingMethodChangeBuilder.of(template);
    }

    default <T> T withSetShippingMethodChange(Function<SetShippingMethodChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetShippingMethodChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetShippingMethodChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetShippingMethodChange>";
            }
        };
    }
}
