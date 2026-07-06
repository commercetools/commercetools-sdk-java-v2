
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceStagedChangesRemovedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceStagedChangesRemovedMessagePayload standalonePriceStagedChangesRemovedMessagePayload = StandalonePriceStagedChangesRemovedMessagePayload.builder()
 *             .stagedChanges(stagedChangesBuilder -> stagedChangesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceStagedChangesRemovedMessagePayloadBuilder
        implements Builder<StandalonePriceStagedChangesRemovedMessagePayload> {

    private com.commercetools.api.models.standalone_price.StagedStandalonePrice stagedChanges;

    /**
     *  <p>Removed changes of the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceRemoveStagedChangesAction" rel="nofollow">Remove Staged Changes</a> update action.</p>
     * @param builder function to build the stagedChanges value
     * @return Builder
     */

    public StandalonePriceStagedChangesRemovedMessagePayloadBuilder stagedChanges(
            Function<com.commercetools.api.models.standalone_price.StagedStandalonePriceBuilder, com.commercetools.api.models.standalone_price.StagedStandalonePriceBuilder> builder) {
        this.stagedChanges = builder
                .apply(com.commercetools.api.models.standalone_price.StagedStandalonePriceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Removed changes of the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceRemoveStagedChangesAction" rel="nofollow">Remove Staged Changes</a> update action.</p>
     * @param builder function to build the stagedChanges value
     * @return Builder
     */

    public StandalonePriceStagedChangesRemovedMessagePayloadBuilder withStagedChanges(
            Function<com.commercetools.api.models.standalone_price.StagedStandalonePriceBuilder, com.commercetools.api.models.standalone_price.StagedStandalonePrice> builder) {
        this.stagedChanges = builder
                .apply(com.commercetools.api.models.standalone_price.StagedStandalonePriceBuilder.of());
        return this;
    }

    /**
     *  <p>Removed changes of the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceRemoveStagedChangesAction" rel="nofollow">Remove Staged Changes</a> update action.</p>
     * @param stagedChanges value to be set
     * @return Builder
     */

    public StandalonePriceStagedChangesRemovedMessagePayloadBuilder stagedChanges(
            final com.commercetools.api.models.standalone_price.StagedStandalonePrice stagedChanges) {
        this.stagedChanges = stagedChanges;
        return this;
    }

    /**
     *  <p>Removed changes of the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceRemoveStagedChangesAction" rel="nofollow">Remove Staged Changes</a> update action.</p>
     * @return stagedChanges
     */

    public com.commercetools.api.models.standalone_price.StagedStandalonePrice getStagedChanges() {
        return this.stagedChanges;
    }

    /**
     * builds StandalonePriceStagedChangesRemovedMessagePayload with checking for non-null required values
     * @return StandalonePriceStagedChangesRemovedMessagePayload
     */
    public StandalonePriceStagedChangesRemovedMessagePayload build() {
        Objects.requireNonNull(stagedChanges,
            StandalonePriceStagedChangesRemovedMessagePayload.class + ": stagedChanges is missing");
        return new StandalonePriceStagedChangesRemovedMessagePayloadImpl(stagedChanges);
    }

    /**
     * builds StandalonePriceStagedChangesRemovedMessagePayload without checking for non-null required values
     * @return StandalonePriceStagedChangesRemovedMessagePayload
     */
    public StandalonePriceStagedChangesRemovedMessagePayload buildUnchecked() {
        return new StandalonePriceStagedChangesRemovedMessagePayloadImpl(stagedChanges);
    }

    /**
     * factory method for an instance of StandalonePriceStagedChangesRemovedMessagePayloadBuilder
     * @return builder
     */
    public static StandalonePriceStagedChangesRemovedMessagePayloadBuilder of() {
        return new StandalonePriceStagedChangesRemovedMessagePayloadBuilder();
    }

    /**
     * create builder for StandalonePriceStagedChangesRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceStagedChangesRemovedMessagePayloadBuilder of(
            final StandalonePriceStagedChangesRemovedMessagePayload template) {
        StandalonePriceStagedChangesRemovedMessagePayloadBuilder builder = new StandalonePriceStagedChangesRemovedMessagePayloadBuilder();
        builder.stagedChanges = template.getStagedChanges();
        return builder;
    }

}
