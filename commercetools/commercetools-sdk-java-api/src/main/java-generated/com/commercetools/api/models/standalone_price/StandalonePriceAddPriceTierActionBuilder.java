
package com.commercetools.api.models.standalone_price;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceAddPriceTierActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceAddPriceTierAction standalonePriceAddPriceTierAction = StandalonePriceAddPriceTierAction.builder()
 *             .tier(tierBuilder -> tierBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceAddPriceTierActionBuilder implements Builder<StandalonePriceAddPriceTierAction> {

    private com.commercetools.api.models.common.PriceTierDraft tier;

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:PriceTier" rel="nofollow">PriceTier</a> to be added to the <code>tiers</code> field of the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a>. The action returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidFieldError" rel="nofollow">InvalidField</a> error in the following cases:</p>
     *  <ul>
     *   <li>Trying to add a PriceTier with <code>minimumQuantity</code> &lt; <code>2</code>.</li>
     *   <li>Trying to add a PriceTier with <code>minimumQuantity</code> that already exists for the StandalonePrice.</li>
     *  </ul>
     * @param builder function to build the tier value
     * @return Builder
     */

    public StandalonePriceAddPriceTierActionBuilder tier(
            Function<com.commercetools.api.models.common.PriceTierDraftBuilder, com.commercetools.api.models.common.PriceTierDraftBuilder> builder) {
        this.tier = builder.apply(com.commercetools.api.models.common.PriceTierDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:PriceTier" rel="nofollow">PriceTier</a> to be added to the <code>tiers</code> field of the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a>. The action returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidFieldError" rel="nofollow">InvalidField</a> error in the following cases:</p>
     *  <ul>
     *   <li>Trying to add a PriceTier with <code>minimumQuantity</code> &lt; <code>2</code>.</li>
     *   <li>Trying to add a PriceTier with <code>minimumQuantity</code> that already exists for the StandalonePrice.</li>
     *  </ul>
     * @param builder function to build the tier value
     * @return Builder
     */

    public StandalonePriceAddPriceTierActionBuilder withTier(
            Function<com.commercetools.api.models.common.PriceTierDraftBuilder, com.commercetools.api.models.common.PriceTierDraft> builder) {
        this.tier = builder.apply(com.commercetools.api.models.common.PriceTierDraftBuilder.of());
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:PriceTier" rel="nofollow">PriceTier</a> to be added to the <code>tiers</code> field of the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a>. The action returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidFieldError" rel="nofollow">InvalidField</a> error in the following cases:</p>
     *  <ul>
     *   <li>Trying to add a PriceTier with <code>minimumQuantity</code> &lt; <code>2</code>.</li>
     *   <li>Trying to add a PriceTier with <code>minimumQuantity</code> that already exists for the StandalonePrice.</li>
     *  </ul>
     * @param tier value to be set
     * @return Builder
     */

    public StandalonePriceAddPriceTierActionBuilder tier(
            final com.commercetools.api.models.common.PriceTierDraft tier) {
        this.tier = tier;
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:PriceTier" rel="nofollow">PriceTier</a> to be added to the <code>tiers</code> field of the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a>. The action returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidFieldError" rel="nofollow">InvalidField</a> error in the following cases:</p>
     *  <ul>
     *   <li>Trying to add a PriceTier with <code>minimumQuantity</code> &lt; <code>2</code>.</li>
     *   <li>Trying to add a PriceTier with <code>minimumQuantity</code> that already exists for the StandalonePrice.</li>
     *  </ul>
     * @return tier
     */

    public com.commercetools.api.models.common.PriceTierDraft getTier() {
        return this.tier;
    }

    /**
     * builds StandalonePriceAddPriceTierAction with checking for non-null required values
     * @return StandalonePriceAddPriceTierAction
     */
    public StandalonePriceAddPriceTierAction build() {
        Objects.requireNonNull(tier, StandalonePriceAddPriceTierAction.class + ": tier is missing");
        return new StandalonePriceAddPriceTierActionImpl(tier);
    }

    /**
     * builds StandalonePriceAddPriceTierAction without checking for non-null required values
     * @return StandalonePriceAddPriceTierAction
     */
    public StandalonePriceAddPriceTierAction buildUnchecked() {
        return new StandalonePriceAddPriceTierActionImpl(tier);
    }

    /**
     * factory method for an instance of StandalonePriceAddPriceTierActionBuilder
     * @return builder
     */
    public static StandalonePriceAddPriceTierActionBuilder of() {
        return new StandalonePriceAddPriceTierActionBuilder();
    }

    /**
     * create builder for StandalonePriceAddPriceTierAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceAddPriceTierActionBuilder of(final StandalonePriceAddPriceTierAction template) {
        StandalonePriceAddPriceTierActionBuilder builder = new StandalonePriceAddPriceTierActionBuilder();
        builder.tier = template.getTier();
        return builder;
    }

}
