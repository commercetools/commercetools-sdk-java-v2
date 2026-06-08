
package com.commercetools.history.models.common;

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
 *  <p>A Price tier is selected instead of the default Price when a certain quantity of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductVariant" rel="nofollow">ProductVariant</a> is <span>added to a Cart</span> and ordered. _For If no Price tier is found for the Order quantity, the base Price is used. A Price tier is applied for the entire quantity of a Product Variant put as <span>LineItem</span> in a Cart as soon as the minimum quantity for the Price tier is reached. The Price tier is applied per Line Item of the Product Variant. If, for example, the same Product Variant appears in the same Cart as several Line Items, (what can be achieved by different values of a Custom Field on the Line Items) for each Line Item the minimum quantity must be reached to get the Price tier.</p>
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
     *  <p>Minimum quantity this Price tier is valid for.</p>
     *  <p>The minimum quantity is always greater than or equal to 2. The base Price is interpreted as valid for a minimum quantity equal to 1. A <a href="https://docs.commercetools.com/apis/ctp:api:type:Price" rel="nofollow">Price</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> cannot contain more than one tier with the same <code>minimumQuantity</code>.</p>
     * @return minimumQuantity
     */
    @NotNull
    @JsonProperty("minimumQuantity")
    public Long getMinimumQuantity();

    /**
     *  <p>Money value that applies when the <code>minimumQuantity</code> is greater than or equal to the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> <code>quantity</code>.</p>
     *  <p>The <code>currencyCode</code> of a Price tier is always the same as the <code>currencyCode</code> in the <code>value</code> of the related Price.</p>
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public TypedMoney getValue();

    /**
     *  <p>Minimum quantity this Price tier is valid for.</p>
     *  <p>The minimum quantity is always greater than or equal to 2. The base Price is interpreted as valid for a minimum quantity equal to 1. A <a href="https://docs.commercetools.com/apis/ctp:api:type:Price" rel="nofollow">Price</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> cannot contain more than one tier with the same <code>minimumQuantity</code>.</p>
     * @param minimumQuantity value to be set
     */

    public void setMinimumQuantity(final Long minimumQuantity);

    /**
     *  <p>Money value that applies when the <code>minimumQuantity</code> is greater than or equal to the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> <code>quantity</code>.</p>
     *  <p>The <code>currencyCode</code> of a Price tier is always the same as the <code>currencyCode</code> in the <code>value</code> of the related Price.</p>
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
        instance.setValue(com.commercetools.history.models.common.TypedMoney.deepCopy(template.getValue()));
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
