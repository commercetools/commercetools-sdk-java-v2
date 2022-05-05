
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
@JsonDeserialize(as = CartValueTierImpl.class)
public interface CartValueTier extends ShippingRatePriceTier {

    String CART_VALUE = "CartValue";

    @NotNull
    @JsonProperty("minimumCentAmount")
    public Long getMinimumCentAmount();

    /**
    *  <p>Draft type that stores amounts in cent precision for the specified currency.</p>
    *  <p>For storing money values in fractions of the minor unit in a currency, use <a href="ctp:api:type:HighPrecisionMoneyDraft">HighPrecisionMoneyDraft</a> instead.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("price")
    public Money getPrice();

    @JsonProperty("isMatching")
    public Boolean getIsMatching();

    public void setMinimumCentAmount(final Long minimumCentAmount);

    public void setPrice(final Money price);

    public void setIsMatching(final Boolean isMatching);

    public static CartValueTier of() {
        return new CartValueTierImpl();
    }

    public static CartValueTier of(final CartValueTier template) {
        CartValueTierImpl instance = new CartValueTierImpl();
        instance.setMinimumCentAmount(template.getMinimumCentAmount());
        instance.setPrice(template.getPrice());
        instance.setIsMatching(template.getIsMatching());
        return instance;
    }

    public static CartValueTierBuilder builder() {
        return CartValueTierBuilder.of();
    }

    public static CartValueTierBuilder builder(final CartValueTier template) {
        return CartValueTierBuilder.of(template);
    }

    default <T> T withCartValueTier(Function<CartValueTier, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartValueTier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartValueTier>() {
            @Override
            public String toString() {
                return "TypeReference<CartValueTier>";
            }
        };
    }
}
