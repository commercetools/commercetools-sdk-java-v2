package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.ShippingRateInput;
import com.commercetools.api.models.cart.ScoreShippingRateInputImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ScoreShippingRateInputImpl.class)
public interface ScoreShippingRateInput extends ShippingRateInput {

    
    @NotNull
    @JsonProperty("score")
    public Double getScore();

    public void setScore(final Double score);

    public static ScoreShippingRateInputImpl of(){
        return new ScoreShippingRateInputImpl();
    }
    

    public static ScoreShippingRateInputImpl of(final ScoreShippingRateInput template) {
        ScoreShippingRateInputImpl instance = new ScoreShippingRateInputImpl();
        instance.setScore(template.getScore());
        return instance;
    }

    default <T> T withScoreShippingRateInput(Function<ScoreShippingRateInput, T> helper) {
        return helper.apply(this);
    }
}
