
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>A Price tier is selected instead of the default Price when a certain quantity of the ProductVariant is added to a Cart and ordered. <em>For example: the Price can be lower if more than 10 items are ordered.</em> If no Price tier is found for the Order quantity, the base Price is used. A Price tier is applied for the entire quantity of a Product Variant put as LineItem in a Cart as soon as the minimum quantity for the Price tier is reached. The Price tier is applied per Line Item of the Product Variant. If, for example, the same Product Variant appears in the same Cart as several Line Items, (what can be achieved by different values of a Custom Field on the Line Items) for each Line Item the minimum quantity must be reached to get the Price tier.</p>
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
     *  <p>The minimum quantity is always greater than or equal to 2. The base Price is interpreted as valid for a minimum quantity equal to 1.</p>
     * @return minimumQuantity
     */
    @NotNull
    @JsonProperty("minimumQuantity")
    public Long getMinimumQuantity();

    /**
     *  <p>Money value that applies when the <code>minimumQuantity</code> is greater than or equal to the LineItem <code>quantity</code>.</p>
     *  <p>The <code>currencyCode</code> of a Price tier is always the same as the <code>currencyCode</code> in the <code>value</code> of the related Price.</p>
     * @return value
     */
    @NotNull
    @Valid
    @JsonProperty("value")
    public TypedMoney getValue();

    public void setMinimumQuantity(final Long minimumQuantity);

    public void setValue(final TypedMoney value);

    public static PriceTier of() {
        return new PriceTierImpl();
    }

    public static PriceTier of(final PriceTier template) {
        PriceTierImpl instance = new PriceTierImpl();
        instance.setMinimumQuantity(template.getMinimumQuantity());
        instance.setValue(template.getValue());
        return instance;
    }

    public static PriceTierBuilder builder() {
        return PriceTierBuilder.of();
    }

    public static PriceTierBuilder builder(final PriceTier template) {
        return PriceTierBuilder.of(template);
    }

    default <T> T withPriceTier(Function<PriceTier, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<PriceTier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PriceTier>() {
            @Override
            public String toString() {
                return "TypeReference<PriceTier>";
            }
        };
    }
}
