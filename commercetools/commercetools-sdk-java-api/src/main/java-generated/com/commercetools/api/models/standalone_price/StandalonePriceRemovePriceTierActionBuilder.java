
package com.commercetools.api.models.standalone_price;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceRemovePriceTierActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceRemovePriceTierAction standalonePriceRemovePriceTierAction = StandalonePriceRemovePriceTierAction.builder()
 *             .tierMinimumQuantity(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceRemovePriceTierActionBuilder implements Builder<StandalonePriceRemovePriceTierAction> {

    private Long tierMinimumQuantity;

    /**
     *  <p>The <code>minimumQuantity</code> of the PriceTier to be removed from the <code>tiers</code> field of the StandalonePrice.</p>
     * @param tierMinimumQuantity value to be set
     * @return Builder
     */

    public StandalonePriceRemovePriceTierActionBuilder tierMinimumQuantity(final Long tierMinimumQuantity) {
        this.tierMinimumQuantity = tierMinimumQuantity;
        return this;
    }

    /**
     *  <p>The <code>minimumQuantity</code> of the PriceTier to be removed from the <code>tiers</code> field of the StandalonePrice.</p>
     * @return tierMinimumQuantity
     */

    public Long getTierMinimumQuantity() {
        return this.tierMinimumQuantity;
    }

    /**
     * builds StandalonePriceRemovePriceTierAction with checking for non-null required values
     * @return StandalonePriceRemovePriceTierAction
     */
    public StandalonePriceRemovePriceTierAction build() {
        Objects.requireNonNull(tierMinimumQuantity,
            StandalonePriceRemovePriceTierAction.class + ": tierMinimumQuantity is missing");
        return new StandalonePriceRemovePriceTierActionImpl(tierMinimumQuantity);
    }

    /**
     * builds StandalonePriceRemovePriceTierAction without checking for non-null required values
     * @return StandalonePriceRemovePriceTierAction
     */
    public StandalonePriceRemovePriceTierAction buildUnchecked() {
        return new StandalonePriceRemovePriceTierActionImpl(tierMinimumQuantity);
    }

    /**
     * factory method for an instance of StandalonePriceRemovePriceTierActionBuilder
     * @return builder
     */
    public static StandalonePriceRemovePriceTierActionBuilder of() {
        return new StandalonePriceRemovePriceTierActionBuilder();
    }

    /**
     * create builder for StandalonePriceRemovePriceTierAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceRemovePriceTierActionBuilder of(final StandalonePriceRemovePriceTierAction template) {
        StandalonePriceRemovePriceTierActionBuilder builder = new StandalonePriceRemovePriceTierActionBuilder();
        builder.tierMinimumQuantity = template.getTierMinimumQuantity();
        return builder;
    }

}
