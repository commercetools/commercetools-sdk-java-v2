
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
@JsonDeserialize(as = CartClassificationTierImpl.class)
public interface CartClassificationTier extends ShippingRatePriceTier {

    String CART_CLASSIFICATION = "CartClassification";

    @NotNull
    @JsonProperty("value")
    public String getValue();

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

    public void setValue(final String value);

    public void setPrice(final Money price);

    public void setIsMatching(final Boolean isMatching);

    public static CartClassificationTier of() {
        return new CartClassificationTierImpl();
    }

    public static CartClassificationTier of(final CartClassificationTier template) {
        CartClassificationTierImpl instance = new CartClassificationTierImpl();
        instance.setValue(template.getValue());
        instance.setPrice(template.getPrice());
        instance.setIsMatching(template.getIsMatching());
        return instance;
    }

    public static CartClassificationTierBuilder builder() {
        return CartClassificationTierBuilder.of();
    }

    public static CartClassificationTierBuilder builder(final CartClassificationTier template) {
        return CartClassificationTierBuilder.of(template);
    }

    default <T> T withCartClassificationTier(Function<CartClassificationTier, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CartClassificationTier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartClassificationTier>() {
            @Override
            public String toString() {
                return "TypeReference<CartClassificationTier>";
            }
        };
    }
}
