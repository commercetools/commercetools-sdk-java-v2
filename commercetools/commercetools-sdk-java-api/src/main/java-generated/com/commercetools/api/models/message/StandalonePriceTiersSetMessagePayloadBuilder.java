
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceTiersSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceTiersSetMessagePayload standalonePriceTiersSetMessagePayload = StandalonePriceTiersSetMessagePayload.builder()
 *             .plusTiers(tiersBuilder -> tiersBuilder)
 *             .plusPreviousTiers(previousTiersBuilder -> previousTiersBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceTiersSetMessagePayloadBuilder implements Builder<StandalonePriceTiersSetMessagePayload> {

    private java.util.List<com.commercetools.api.models.common.PriceTier> tiers;

    private java.util.List<com.commercetools.api.models.common.PriceTier> previousTiers;

    /**
     *  <p>The updated content of the field <code>tiers</code> of the affected StandalonePrice.</p>
     * @param tiers value to be set
     * @return Builder
     */

    public StandalonePriceTiersSetMessagePayloadBuilder tiers(
            final com.commercetools.api.models.common.PriceTier... tiers) {
        this.tiers = new ArrayList<>(Arrays.asList(tiers));
        return this;
    }

    /**
     *  <p>The updated content of the field <code>tiers</code> of the affected StandalonePrice.</p>
     * @param tiers value to be set
     * @return Builder
     */

    public StandalonePriceTiersSetMessagePayloadBuilder tiers(
            final java.util.List<com.commercetools.api.models.common.PriceTier> tiers) {
        this.tiers = tiers;
        return this;
    }

    /**
     *  <p>The updated content of the field <code>tiers</code> of the affected StandalonePrice.</p>
     * @param tiers value to be set
     * @return Builder
     */

    public StandalonePriceTiersSetMessagePayloadBuilder plusTiers(
            final com.commercetools.api.models.common.PriceTier... tiers) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers.addAll(Arrays.asList(tiers));
        return this;
    }

    /**
     *  <p>The updated content of the field <code>tiers</code> of the affected StandalonePrice.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */

    public StandalonePriceTiersSetMessagePayloadBuilder plusTiers(
            Function<com.commercetools.api.models.common.PriceTierBuilder, com.commercetools.api.models.common.PriceTierBuilder> builder) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers.add(builder.apply(com.commercetools.api.models.common.PriceTierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The updated content of the field <code>tiers</code> of the affected StandalonePrice.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */

    public StandalonePriceTiersSetMessagePayloadBuilder withTiers(
            Function<com.commercetools.api.models.common.PriceTierBuilder, com.commercetools.api.models.common.PriceTierBuilder> builder) {
        this.tiers = new ArrayList<>();
        this.tiers.add(builder.apply(com.commercetools.api.models.common.PriceTierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The updated content of the field <code>tiers</code> of the affected StandalonePrice.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */

    public StandalonePriceTiersSetMessagePayloadBuilder addTiers(
            Function<com.commercetools.api.models.common.PriceTierBuilder, com.commercetools.api.models.common.PriceTier> builder) {
        return plusTiers(builder.apply(com.commercetools.api.models.common.PriceTierBuilder.of()));
    }

    /**
     *  <p>The updated content of the field <code>tiers</code> of the affected StandalonePrice.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */

    public StandalonePriceTiersSetMessagePayloadBuilder setTiers(
            Function<com.commercetools.api.models.common.PriceTierBuilder, com.commercetools.api.models.common.PriceTier> builder) {
        return tiers(builder.apply(com.commercetools.api.models.common.PriceTierBuilder.of()));
    }

    /**
     *  <p>The previous content of the field <code>tiers</code> of the affected StandalonePrice.</p>
     * @param previousTiers value to be set
     * @return Builder
     */

    public StandalonePriceTiersSetMessagePayloadBuilder previousTiers(
            final com.commercetools.api.models.common.PriceTier... previousTiers) {
        this.previousTiers = new ArrayList<>(Arrays.asList(previousTiers));
        return this;
    }

    /**
     *  <p>The previous content of the field <code>tiers</code> of the affected StandalonePrice.</p>
     * @param previousTiers value to be set
     * @return Builder
     */

    public StandalonePriceTiersSetMessagePayloadBuilder previousTiers(
            final java.util.List<com.commercetools.api.models.common.PriceTier> previousTiers) {
        this.previousTiers = previousTiers;
        return this;
    }

    /**
     *  <p>The previous content of the field <code>tiers</code> of the affected StandalonePrice.</p>
     * @param previousTiers value to be set
     * @return Builder
     */

    public StandalonePriceTiersSetMessagePayloadBuilder plusPreviousTiers(
            final com.commercetools.api.models.common.PriceTier... previousTiers) {
        if (this.previousTiers == null) {
            this.previousTiers = new ArrayList<>();
        }
        this.previousTiers.addAll(Arrays.asList(previousTiers));
        return this;
    }

    /**
     *  <p>The previous content of the field <code>tiers</code> of the affected StandalonePrice.</p>
     * @param builder function to build the previousTiers value
     * @return Builder
     */

    public StandalonePriceTiersSetMessagePayloadBuilder plusPreviousTiers(
            Function<com.commercetools.api.models.common.PriceTierBuilder, com.commercetools.api.models.common.PriceTierBuilder> builder) {
        if (this.previousTiers == null) {
            this.previousTiers = new ArrayList<>();
        }
        this.previousTiers.add(builder.apply(com.commercetools.api.models.common.PriceTierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The previous content of the field <code>tiers</code> of the affected StandalonePrice.</p>
     * @param builder function to build the previousTiers value
     * @return Builder
     */

    public StandalonePriceTiersSetMessagePayloadBuilder withPreviousTiers(
            Function<com.commercetools.api.models.common.PriceTierBuilder, com.commercetools.api.models.common.PriceTierBuilder> builder) {
        this.previousTiers = new ArrayList<>();
        this.previousTiers.add(builder.apply(com.commercetools.api.models.common.PriceTierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The previous content of the field <code>tiers</code> of the affected StandalonePrice.</p>
     * @param builder function to build the previousTiers value
     * @return Builder
     */

    public StandalonePriceTiersSetMessagePayloadBuilder addPreviousTiers(
            Function<com.commercetools.api.models.common.PriceTierBuilder, com.commercetools.api.models.common.PriceTier> builder) {
        return plusPreviousTiers(builder.apply(com.commercetools.api.models.common.PriceTierBuilder.of()));
    }

    /**
     *  <p>The previous content of the field <code>tiers</code> of the affected StandalonePrice.</p>
     * @param builder function to build the previousTiers value
     * @return Builder
     */

    public StandalonePriceTiersSetMessagePayloadBuilder setPreviousTiers(
            Function<com.commercetools.api.models.common.PriceTierBuilder, com.commercetools.api.models.common.PriceTier> builder) {
        return previousTiers(builder.apply(com.commercetools.api.models.common.PriceTierBuilder.of()));
    }

    /**
     *  <p>The updated content of the field <code>tiers</code> of the affected StandalonePrice.</p>
     * @return tiers
     */

    public java.util.List<com.commercetools.api.models.common.PriceTier> getTiers() {
        return this.tiers;
    }

    /**
     *  <p>The previous content of the field <code>tiers</code> of the affected StandalonePrice.</p>
     * @return previousTiers
     */

    public java.util.List<com.commercetools.api.models.common.PriceTier> getPreviousTiers() {
        return this.previousTiers;
    }

    /**
     * builds StandalonePriceTiersSetMessagePayload with checking for non-null required values
     * @return StandalonePriceTiersSetMessagePayload
     */
    public StandalonePriceTiersSetMessagePayload build() {
        Objects.requireNonNull(tiers, StandalonePriceTiersSetMessagePayload.class + ": tiers is missing");
        Objects.requireNonNull(previousTiers,
            StandalonePriceTiersSetMessagePayload.class + ": previousTiers is missing");
        return new StandalonePriceTiersSetMessagePayloadImpl(tiers, previousTiers);
    }

    /**
     * builds StandalonePriceTiersSetMessagePayload without checking for non-null required values
     * @return StandalonePriceTiersSetMessagePayload
     */
    public StandalonePriceTiersSetMessagePayload buildUnchecked() {
        return new StandalonePriceTiersSetMessagePayloadImpl(tiers, previousTiers);
    }

    /**
     * factory method for an instance of StandalonePriceTiersSetMessagePayloadBuilder
     * @return builder
     */
    public static StandalonePriceTiersSetMessagePayloadBuilder of() {
        return new StandalonePriceTiersSetMessagePayloadBuilder();
    }

    /**
     * create builder for StandalonePriceTiersSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceTiersSetMessagePayloadBuilder of(
            final StandalonePriceTiersSetMessagePayload template) {
        StandalonePriceTiersSetMessagePayloadBuilder builder = new StandalonePriceTiersSetMessagePayloadBuilder();
        builder.tiers = template.getTiers();
        builder.previousTiers = template.getPreviousTiers();
        return builder;
    }

}
