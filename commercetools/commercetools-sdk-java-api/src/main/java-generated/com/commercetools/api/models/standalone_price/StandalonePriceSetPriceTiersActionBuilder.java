
package com.commercetools.api.models.standalone_price;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceSetPriceTiersActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceSetPriceTiersAction standalonePriceSetPriceTiersAction = StandalonePriceSetPriceTiersAction.builder()
 *             .plusTiers(tiersBuilder -> tiersBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceSetPriceTiersActionBuilder implements Builder<StandalonePriceSetPriceTiersAction> {

    private java.util.List<com.commercetools.api.models.common.PriceTierDraft> tiers;

    /**
     *  <p>Value to set. If empty, any existing value will be removed. The <code>minimumQuantity</code> of the PriceTiers must be unique and greater than <code>1</code>, otherwise an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidFieldError" rel="nofollow">InvalidField</a> error is returned.</p>
     * @param tiers value to be set
     * @return Builder
     */

    public StandalonePriceSetPriceTiersActionBuilder tiers(
            final com.commercetools.api.models.common.PriceTierDraft... tiers) {
        this.tiers = new ArrayList<>(Arrays.asList(tiers));
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed. The <code>minimumQuantity</code> of the PriceTiers must be unique and greater than <code>1</code>, otherwise an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidFieldError" rel="nofollow">InvalidField</a> error is returned.</p>
     * @param tiers value to be set
     * @return Builder
     */

    public StandalonePriceSetPriceTiersActionBuilder tiers(
            final java.util.List<com.commercetools.api.models.common.PriceTierDraft> tiers) {
        this.tiers = tiers;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed. The <code>minimumQuantity</code> of the PriceTiers must be unique and greater than <code>1</code>, otherwise an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidFieldError" rel="nofollow">InvalidField</a> error is returned.</p>
     * @param tiers value to be set
     * @return Builder
     */

    public StandalonePriceSetPriceTiersActionBuilder plusTiers(
            final com.commercetools.api.models.common.PriceTierDraft... tiers) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers.addAll(Arrays.asList(tiers));
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed. The <code>minimumQuantity</code> of the PriceTiers must be unique and greater than <code>1</code>, otherwise an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidFieldError" rel="nofollow">InvalidField</a> error is returned.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */

    public StandalonePriceSetPriceTiersActionBuilder plusTiers(
            Function<com.commercetools.api.models.common.PriceTierDraftBuilder, com.commercetools.api.models.common.PriceTierDraftBuilder> builder) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers.add(builder.apply(com.commercetools.api.models.common.PriceTierDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed. The <code>minimumQuantity</code> of the PriceTiers must be unique and greater than <code>1</code>, otherwise an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidFieldError" rel="nofollow">InvalidField</a> error is returned.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */

    public StandalonePriceSetPriceTiersActionBuilder withTiers(
            Function<com.commercetools.api.models.common.PriceTierDraftBuilder, com.commercetools.api.models.common.PriceTierDraftBuilder> builder) {
        this.tiers = new ArrayList<>();
        this.tiers.add(builder.apply(com.commercetools.api.models.common.PriceTierDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed. The <code>minimumQuantity</code> of the PriceTiers must be unique and greater than <code>1</code>, otherwise an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidFieldError" rel="nofollow">InvalidField</a> error is returned.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */

    public StandalonePriceSetPriceTiersActionBuilder addTiers(
            Function<com.commercetools.api.models.common.PriceTierDraftBuilder, com.commercetools.api.models.common.PriceTierDraft> builder) {
        return plusTiers(builder.apply(com.commercetools.api.models.common.PriceTierDraftBuilder.of()));
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed. The <code>minimumQuantity</code> of the PriceTiers must be unique and greater than <code>1</code>, otherwise an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidFieldError" rel="nofollow">InvalidField</a> error is returned.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */

    public StandalonePriceSetPriceTiersActionBuilder setTiers(
            Function<com.commercetools.api.models.common.PriceTierDraftBuilder, com.commercetools.api.models.common.PriceTierDraft> builder) {
        return tiers(builder.apply(com.commercetools.api.models.common.PriceTierDraftBuilder.of()));
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed. The <code>minimumQuantity</code> of the PriceTiers must be unique and greater than <code>1</code>, otherwise an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidFieldError" rel="nofollow">InvalidField</a> error is returned.</p>
     * @return tiers
     */

    public java.util.List<com.commercetools.api.models.common.PriceTierDraft> getTiers() {
        return this.tiers;
    }

    /**
     * builds StandalonePriceSetPriceTiersAction with checking for non-null required values
     * @return StandalonePriceSetPriceTiersAction
     */
    public StandalonePriceSetPriceTiersAction build() {
        Objects.requireNonNull(tiers, StandalonePriceSetPriceTiersAction.class + ": tiers is missing");
        return new StandalonePriceSetPriceTiersActionImpl(tiers);
    }

    /**
     * builds StandalonePriceSetPriceTiersAction without checking for non-null required values
     * @return StandalonePriceSetPriceTiersAction
     */
    public StandalonePriceSetPriceTiersAction buildUnchecked() {
        return new StandalonePriceSetPriceTiersActionImpl(tiers);
    }

    /**
     * factory method for an instance of StandalonePriceSetPriceTiersActionBuilder
     * @return builder
     */
    public static StandalonePriceSetPriceTiersActionBuilder of() {
        return new StandalonePriceSetPriceTiersActionBuilder();
    }

    /**
     * create builder for StandalonePriceSetPriceTiersAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceSetPriceTiersActionBuilder of(final StandalonePriceSetPriceTiersAction template) {
        StandalonePriceSetPriceTiersActionBuilder builder = new StandalonePriceSetPriceTiersActionBuilder();
        builder.tiers = template.getTiers();
        return builder;
    }

}
