
package com.commercetools.importapi.models.common;

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

    private com.commercetools.importapi.models.common.TypedMoney value;

    /**
     *  <p>The minimum quantity this price tier is valid for.</p>
     * @param minimumQuantity value to be set
     * @return Builder
     */

    public PriceTierBuilder minimumQuantity(final Long minimumQuantity) {
        this.minimumQuantity = minimumQuantity;
        return this;
    }

    /**
     *  <p>The currency of a price tier is always the same as the currency of the base Price.</p>
     * @param value value to be set
     * @return Builder
     */

    public PriceTierBuilder value(final com.commercetools.importapi.models.common.TypedMoney value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>The currency of a price tier is always the same as the currency of the base Price.</p>
     * @param builder function to build the value value
     * @return Builder
     */

    public PriceTierBuilder value(
            Function<com.commercetools.importapi.models.common.TypedMoneyBuilder, Builder<? extends com.commercetools.importapi.models.common.TypedMoney>> builder) {
        this.value = builder.apply(com.commercetools.importapi.models.common.TypedMoneyBuilder.of()).build();
        return this;
    }

    public Long getMinimumQuantity() {
        return this.minimumQuantity;
    }

    public com.commercetools.importapi.models.common.TypedMoney getValue() {
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

    public static PriceTierBuilder of() {
        return new PriceTierBuilder();
    }

    public static PriceTierBuilder of(final PriceTier template) {
        PriceTierBuilder builder = new PriceTierBuilder();
        builder.minimumQuantity = template.getMinimumQuantity();
        builder.value = template.getValue();
        return builder;
    }

}
