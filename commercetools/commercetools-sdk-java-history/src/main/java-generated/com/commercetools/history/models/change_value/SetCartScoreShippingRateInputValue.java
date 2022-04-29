
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Shape of the cart score shipping input rate value.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetCartScoreShippingRateInputValueImpl.class)
public interface SetCartScoreShippingRateInputValue {

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @JsonProperty("score")
    public Integer getScore();

    public void setType(final String type);

    public void setScore(final Integer score);

    public static SetCartScoreShippingRateInputValue of() {
        return new SetCartScoreShippingRateInputValueImpl();
    }

    public static SetCartScoreShippingRateInputValue of(final SetCartScoreShippingRateInputValue template) {
        SetCartScoreShippingRateInputValueImpl instance = new SetCartScoreShippingRateInputValueImpl();
        instance.setType(template.getType());
        instance.setScore(template.getScore());
        return instance;
    }

    public static SetCartScoreShippingRateInputValueBuilder builder() {
        return SetCartScoreShippingRateInputValueBuilder.of();
    }

    public static SetCartScoreShippingRateInputValueBuilder builder(final SetCartScoreShippingRateInputValue template) {
        return SetCartScoreShippingRateInputValueBuilder.of(template);
    }

    default <T> T withSetCartScoreShippingRateInputValue(Function<SetCartScoreShippingRateInputValue, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetCartScoreShippingRateInputValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetCartScoreShippingRateInputValue>() {
            @Override
            public String toString() {
                return "TypeReference<SetCartScoreShippingRateInputValue>";
            }
        };
    }
}
