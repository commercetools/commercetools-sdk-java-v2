
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>A price tier is selected instead of the default price when a certain quantity of the ProductVariant is added to a cart and ordered.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PriceTier priceTier = PriceTier.builder()
 *             .minimumQuantity(0.3)
 *             .value(valueBuilder -> valueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PriceTierImpl.class)
public interface PriceTier {

    /**
     *  <p>The minimum quantity this price tier is valid for.</p>
     * @return minimumQuantity
     */
    @NotNull
    @JsonProperty("minimumQuantity")
    public Long getMinimumQuantity();

    /**
     *  <p>The currency of a price tier is always the same as the currency of the base Price.</p>
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public TypedMoney getValue();

    /**
     *  <p>The minimum quantity this price tier is valid for.</p>
     * @param minimumQuantity value to be set
     */

    public void setMinimumQuantity(final Long minimumQuantity);

    /**
     *  <p>The currency of a price tier is always the same as the currency of the base Price.</p>
     * @param value value to be set
     */

    public void setValue(final TypedMoney value);

    /**
     * factory method
     * @return instance of PriceTier
     */
    public static PriceTier of() {
        return new PriceTierImpl();
    }

    /**
     * factory method to create a shallow copy PriceTier
     * @param template instance to be copied
     * @return copy instance
     */
    public static PriceTier of(final PriceTier template) {
        PriceTierImpl instance = new PriceTierImpl();
        instance.setMinimumQuantity(template.getMinimumQuantity());
        instance.setValue(template.getValue());
        return instance;
    }

    public PriceTier copyDeep();

    /**
     * factory method to create a deep copy of PriceTier
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PriceTier deepCopy(@Nullable final PriceTier template) {
        if (template == null) {
            return null;
        }
        PriceTierImpl instance = new PriceTierImpl();
        instance.setMinimumQuantity(template.getMinimumQuantity());
        instance.setValue(com.commercetools.importapi.models.common.TypedMoney.deepCopy(template.getValue()));
        return instance;
    }

    /**
     * builder factory method for PriceTier
     * @return builder
     */
    public static PriceTierBuilder builder() {
        return PriceTierBuilder.of();
    }

    /**
     * create builder for PriceTier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PriceTierBuilder builder(final PriceTier template) {
        return PriceTierBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPriceTier(Function<PriceTier, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PriceTier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PriceTier>() {
            @Override
            public String toString() {
                return "TypeReference<PriceTier>";
            }
        };
    }
}
