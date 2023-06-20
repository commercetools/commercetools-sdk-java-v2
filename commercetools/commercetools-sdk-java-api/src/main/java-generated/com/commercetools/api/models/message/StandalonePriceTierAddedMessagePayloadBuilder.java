
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceTierAddedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceTierAddedMessagePayload standalonePriceTierAddedMessagePayload = StandalonePriceTierAddedMessagePayload.builder()
 *             .tier(tierBuilder -> tierBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceTierAddedMessagePayloadBuilder implements Builder<StandalonePriceTierAddedMessagePayload> {

    private com.commercetools.api.models.common.PriceTier tier;

    /**
     *  <p>The Price Tier that has been added to the array field <code>tiers</code> for the StandalonePrice.</p>
     * @param builder function to build the tier value
     * @return Builder
     */

    public StandalonePriceTierAddedMessagePayloadBuilder tier(
            Function<com.commercetools.api.models.common.PriceTierBuilder, com.commercetools.api.models.common.PriceTierBuilder> builder) {
        this.tier = builder.apply(com.commercetools.api.models.common.PriceTierBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Price Tier that has been added to the array field <code>tiers</code> for the StandalonePrice.</p>
     * @param builder function to build the tier value
     * @return Builder
     */

    public StandalonePriceTierAddedMessagePayloadBuilder withTier(
            Function<com.commercetools.api.models.common.PriceTierBuilder, com.commercetools.api.models.common.PriceTier> builder) {
        this.tier = builder.apply(com.commercetools.api.models.common.PriceTierBuilder.of());
        return this;
    }

    /**
     *  <p>The Price Tier that has been added to the array field <code>tiers</code> for the StandalonePrice.</p>
     * @param tier value to be set
     * @return Builder
     */

    public StandalonePriceTierAddedMessagePayloadBuilder tier(
            final com.commercetools.api.models.common.PriceTier tier) {
        this.tier = tier;
        return this;
    }

    /**
     *  <p>The Price Tier that has been added to the array field <code>tiers</code> for the StandalonePrice.</p>
     * @return tier
     */

    public com.commercetools.api.models.common.PriceTier getTier() {
        return this.tier;
    }

    /**
     * builds StandalonePriceTierAddedMessagePayload with checking for non-null required values
     * @return StandalonePriceTierAddedMessagePayload
     */
    public StandalonePriceTierAddedMessagePayload build() {
        Objects.requireNonNull(tier, StandalonePriceTierAddedMessagePayload.class + ": tier is missing");
        return new StandalonePriceTierAddedMessagePayloadImpl(tier);
    }

    /**
     * builds StandalonePriceTierAddedMessagePayload without checking for non-null required values
     * @return StandalonePriceTierAddedMessagePayload
     */
    public StandalonePriceTierAddedMessagePayload buildUnchecked() {
        return new StandalonePriceTierAddedMessagePayloadImpl(tier);
    }

    /**
     * factory method for an instance of StandalonePriceTierAddedMessagePayloadBuilder
     * @return builder
     */
    public static StandalonePriceTierAddedMessagePayloadBuilder of() {
        return new StandalonePriceTierAddedMessagePayloadBuilder();
    }

    /**
     * create builder for StandalonePriceTierAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceTierAddedMessagePayloadBuilder of(
            final StandalonePriceTierAddedMessagePayload template) {
        StandalonePriceTierAddedMessagePayloadBuilder builder = new StandalonePriceTierAddedMessagePayloadBuilder();
        builder.tier = template.getTier();
        return builder;
    }

}
