
package com.commercetools.importapi.models.orders;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.importapi.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * CartClassificationTier
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartClassificationTier cartClassificationTier = CartClassificationTier.builder()
 *             .value("{value}")
 *             .price(priceBuilder -> priceBuilder)
 *             .plusTiers(tiersBuilder -> tiersBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CartClassification")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartClassificationTierImpl.class)
public interface CartClassificationTier extends ShippingRatePriceTier {

    /**
     * discriminator value for CartClassificationTier
     */
    String CART_CLASSIFICATION = "CartClassification";

    /**
     *
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public String getValue();

    /**
     *
     * @return price
     */
    @NotNull
    @Valid
    @JsonProperty("price")
    public Money getPrice();

    /**
     *
     * @return tiers
     */
    @NotNull
    @Valid
    @JsonProperty("tiers")
    public List<ShippingRatePriceTier> getTiers();

    /**
     *
     * @return isMatching
     */

    @JsonProperty("isMatching")
    public Boolean getIsMatching();

    /**
     * set value
     * @param value value to be set
     */

    public void setValue(final String value);

    /**
     * set price
     * @param price value to be set
     */

    public void setPrice(final Money price);

    /**
     * set tiers
     * @param tiers values to be set
     */

    @JsonIgnore
    public void setTiers(final ShippingRatePriceTier... tiers);

    /**
     * set tiers
     * @param tiers values to be set
     */

    public void setTiers(final List<ShippingRatePriceTier> tiers);

    /**
     * set isMatching
     * @param isMatching value to be set
     */

    public void setIsMatching(final Boolean isMatching);

    /**
     * factory method
     * @return instance of CartClassificationTier
     */
    public static CartClassificationTier of() {
        return new CartClassificationTierImpl();
    }

    /**
     * factory method to create a shallow copy CartClassificationTier
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartClassificationTier of(final CartClassificationTier template) {
        CartClassificationTierImpl instance = new CartClassificationTierImpl();
        instance.setValue(template.getValue());
        instance.setPrice(template.getPrice());
        instance.setTiers(template.getTiers());
        instance.setIsMatching(template.getIsMatching());
        return instance;
    }

    public CartClassificationTier copyDeep();

    /**
     * factory method to create a deep copy of CartClassificationTier
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartClassificationTier deepCopy(@Nullable final CartClassificationTier template) {
        if (template == null) {
            return null;
        }
        CartClassificationTierImpl instance = new CartClassificationTierImpl();
        instance.setValue(template.getValue());
        instance.setPrice(com.commercetools.importapi.models.common.Money.deepCopy(template.getPrice()));
        instance.setTiers(Optional.ofNullable(template.getTiers())
                .map(t -> t.stream()
                        .map(com.commercetools.importapi.models.orders.ShippingRatePriceTier::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setIsMatching(template.getIsMatching());
        return instance;
    }

    /**
     * builder factory method for CartClassificationTier
     * @return builder
     */
    public static CartClassificationTierBuilder builder() {
        return CartClassificationTierBuilder.of();
    }

    /**
     * create builder for CartClassificationTier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartClassificationTierBuilder builder(final CartClassificationTier template) {
        return CartClassificationTierBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartClassificationTier(Function<CartClassificationTier, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartClassificationTier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartClassificationTier>() {
            @Override
            public String toString() {
                return "TypeReference<CartClassificationTier>";
            }
        };
    }
}
