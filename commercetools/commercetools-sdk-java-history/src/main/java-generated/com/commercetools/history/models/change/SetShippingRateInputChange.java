
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.SetCartClassificationShippingRateInputValue;
import com.commercetools.history.models.change_value.SetCartScoreShippingRateInputValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetShippingRateInputChangeImpl.class)
public interface SetShippingRateInputChange extends Change {

    String SET_SHIPPING_RATE_INPUT_CHANGE = "SetShippingRateInputChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>setShippingRateInput</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("nextValue")
    public Object getNextValue();

    @NotNull
    @JsonProperty("previousValue")
    public Object getPreviousValue();

    public void setChange(final String change);

    public void setNextValue(final SetCartClassificationShippingRateInputValue nextValue);

    public void setNextValue(final SetCartScoreShippingRateInputValue nextValue);

    public void setNextValue(final Object nextValue);

    public void setPreviousValue(final SetCartClassificationShippingRateInputValue previousValue);

    public void setPreviousValue(final SetCartScoreShippingRateInputValue previousValue);

    public void setPreviousValue(final Object previousValue);

    public static SetShippingRateInputChange of() {
        return new SetShippingRateInputChangeImpl();
    }

    public static SetShippingRateInputChange of(final SetShippingRateInputChange template) {
        SetShippingRateInputChangeImpl instance = new SetShippingRateInputChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static SetShippingRateInputChangeBuilder builder() {
        return SetShippingRateInputChangeBuilder.of();
    }

    public static SetShippingRateInputChangeBuilder builder(final SetShippingRateInputChange template) {
        return SetShippingRateInputChangeBuilder.of(template);
    }

    default <T> T withSetShippingRateInputChange(Function<SetShippingRateInputChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetShippingRateInputChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetShippingRateInputChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetShippingRateInputChange>";
            }
        };
    }
}
