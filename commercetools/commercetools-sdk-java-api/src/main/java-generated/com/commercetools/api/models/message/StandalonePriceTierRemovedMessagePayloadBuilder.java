
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceTierRemovedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceTierRemovedMessagePayload standalonePriceTierRemovedMessagePayload = StandalonePriceTierRemovedMessagePayload.builder()
 *             .removedTier(removedTierBuilder -> removedTierBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceTierRemovedMessagePayloadBuilder
        implements Builder<StandalonePriceTierRemovedMessagePayload> {

    private com.commercetools.api.models.common.PriceTier removedTier;

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:PriceTier" rel="nofollow">Price Tier</a> that has been removed from the array field <code>tiers</code> for the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a>.</p>
     * @param builder function to build the removedTier value
     * @return Builder
     */

    public StandalonePriceTierRemovedMessagePayloadBuilder removedTier(
            Function<com.commercetools.api.models.common.PriceTierBuilder, com.commercetools.api.models.common.PriceTierBuilder> builder) {
        this.removedTier = builder.apply(com.commercetools.api.models.common.PriceTierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:PriceTier" rel="nofollow">Price Tier</a> that has been removed from the array field <code>tiers</code> for the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a>.</p>
     * @param builder function to build the removedTier value
     * @return Builder
     */

    public StandalonePriceTierRemovedMessagePayloadBuilder withRemovedTier(
            Function<com.commercetools.api.models.common.PriceTierBuilder, com.commercetools.api.models.common.PriceTier> builder) {
        this.removedTier = builder.apply(com.commercetools.api.models.common.PriceTierBuilder.of());
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:PriceTier" rel="nofollow">Price Tier</a> that has been removed from the array field <code>tiers</code> for the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a>.</p>
     * @param removedTier value to be set
     * @return Builder
     */

    public StandalonePriceTierRemovedMessagePayloadBuilder removedTier(
            final com.commercetools.api.models.common.PriceTier removedTier) {
        this.removedTier = removedTier;
        return this;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:PriceTier" rel="nofollow">Price Tier</a> that has been removed from the array field <code>tiers</code> for the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a>.</p>
     * @return removedTier
     */

    public com.commercetools.api.models.common.PriceTier getRemovedTier() {
        return this.removedTier;
    }

    /**
     * builds StandalonePriceTierRemovedMessagePayload with checking for non-null required values
     * @return StandalonePriceTierRemovedMessagePayload
     */
    public StandalonePriceTierRemovedMessagePayload build() {
        Objects.requireNonNull(removedTier,
            StandalonePriceTierRemovedMessagePayload.class + ": removedTier is missing");
        return new StandalonePriceTierRemovedMessagePayloadImpl(removedTier);
    }

    /**
     * builds StandalonePriceTierRemovedMessagePayload without checking for non-null required values
     * @return StandalonePriceTierRemovedMessagePayload
     */
    public StandalonePriceTierRemovedMessagePayload buildUnchecked() {
        return new StandalonePriceTierRemovedMessagePayloadImpl(removedTier);
    }

    /**
     * factory method for an instance of StandalonePriceTierRemovedMessagePayloadBuilder
     * @return builder
     */
    public static StandalonePriceTierRemovedMessagePayloadBuilder of() {
        return new StandalonePriceTierRemovedMessagePayloadBuilder();
    }

    /**
     * create builder for StandalonePriceTierRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceTierRemovedMessagePayloadBuilder of(
            final StandalonePriceTierRemovedMessagePayload template) {
        StandalonePriceTierRemovedMessagePayloadBuilder builder = new StandalonePriceTierRemovedMessagePayloadBuilder();
        builder.removedTier = template.getRemovedTier();
        return builder;
    }

}
