
package com.commercetools.api.models.common;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PriceTierBuilder
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
public class PriceTierBuilder implements Builder<PriceTier> {

    private Long minimumQuantity;

    private com.commercetools.api.models.common.TypedMoney value;

    /**
     *  <p>Minimum quantity this Price tier is valid for.</p>
     *  <p>The minimum quantity is always greater than or equal to 2. The base Price is interpreted as valid for a minimum quantity equal to 1.</p>
     * @param minimumQuantity value to be set
     * @return Builder
     */

    public PriceTierBuilder minimumQuantity(final Long minimumQuantity) {
        this.minimumQuantity = minimumQuantity;
        return this;
    }

    /**
     *  <p>Money value that applies when the <code>minimumQuantity</code> is greater than or equal to the LineItem <code>quantity</code>.</p>
     *  <p>The <code>currencyCode</code> of a Price tier is always the same as the <code>currencyCode</code> in the <code>value</code> of the related Price.</p>
     * @param value value to be set
     * @return Builder
     */

    public PriceTierBuilder value(final com.commercetools.api.models.common.TypedMoney value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Money value that applies when the <code>minimumQuantity</code> is greater than or equal to the LineItem <code>quantity</code>.</p>
     *  <p>The <code>currencyCode</code> of a Price tier is always the same as the <code>currencyCode</code> in the <code>value</code> of the related Price.</p>
     * @param builder function to build the value value
     * @return Builder
     */

    public PriceTierBuilder value(
            Function<com.commercetools.api.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.api.models.common.TypedMoney>> builder) {
        this.value = builder.apply(com.commercetools.api.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Minimum quantity this Price tier is valid for.</p>
     *  <p>The minimum quantity is always greater than or equal to 2. The base Price is interpreted as valid for a minimum quantity equal to 1.</p>
     * @return minimumQuantity
     */

    public Long getMinimumQuantity() {
        return this.minimumQuantity;
    }

    /**
     *  <p>Money value that applies when the <code>minimumQuantity</code> is greater than or equal to the LineItem <code>quantity</code>.</p>
     *  <p>The <code>currencyCode</code> of a Price tier is always the same as the <code>currencyCode</code> in the <code>value</code> of the related Price.</p>
     * @return value
     */

    public com.commercetools.api.models.common.TypedMoney getValue() {
        return this.value;
    }

    /**
     * builds PriceTier with checking for non-null required values
     * @return PriceTier
     */
    public PriceTier build() {
        Objects.requireNonNull(minimumQuantity, PriceTier.class + ": minimumQuantity is missing");
        Objects.requireNonNull(value, PriceTier.class + ": value is missing");
        return new PriceTierImpl(minimumQuantity, value);
    }

    /**
     * builds PriceTier without checking for non-null required values
     * @return PriceTier
     */
    public PriceTier buildUnchecked() {
        return new PriceTierImpl(minimumQuantity, value);
    }

    /**
     * factory method for an instance of PriceTierBuilder
     * @return builder
     */
    public static PriceTierBuilder of() {
        return new PriceTierBuilder();
    }

    /**
     * create builder for PriceTier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PriceTierBuilder of(final PriceTier template) {
        PriceTierBuilder builder = new PriceTierBuilder();
        builder.minimumQuantity = template.getMinimumQuantity();
        builder.value = template.getValue();
        return builder;
    }

}
