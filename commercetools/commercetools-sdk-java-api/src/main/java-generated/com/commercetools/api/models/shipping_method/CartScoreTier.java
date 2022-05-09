
package com.commercetools.api.models.shipping_method;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CartScoreTierImpl.class)
public interface CartScoreTier extends ShippingRatePriceTier {

    String CART_SCORE = "CartScore";

    @NotNull
    @JsonProperty("score")
    public Double getScore();

    /**
    *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
    *  <p>For storing money values in fractions of the minor unit in a currency, use <a href="ctp:api:type:HighPrecisionMoneyDraft">HighPrecisionMoneyDraft</a> instead.</p>
    */
    @Valid
    @JsonProperty("price")
    public Money getPrice();

    @Valid
    @JsonProperty("priceFunction")
    public PriceFunction getPriceFunction();

    @JsonProperty("isMatching")
    public Boolean getIsMatching();

    public void setScore(final Double score);

    public void setPrice(final Money price);

    public void setPriceFunction(final PriceFunction priceFunction);

    public void setIsMatching(final Boolean isMatching);

    public static CartScoreTier of() {
        return new CartScoreTierImpl();
    }

    public static CartScoreTier of(final CartScoreTier template) {
        CartScoreTierImpl instance = new CartScoreTierImpl();
        instance.setScore(template.getScore());
        instance.setPrice(template.getPrice());
        instance.setPriceFunction(template.getPriceFunction());
        instance.setIsMatching(template.getIsMatching());
        return instance;
    }

    public static CartScoreTierBuilder builder() {
        return CartScoreTierBuilder.of();
    }

    public static CartScoreTierBuilder builder(final CartScoreTier template) {
        return CartScoreTierBuilder.of(template);
    }

    default <T> T withCartScoreTier(Function<CartScoreTier, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartScoreTier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartScoreTier>() {
            @Override
            public String toString() {
                return "TypeReference<CartScoreTier>";
            }
        };
    }
}
