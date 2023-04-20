
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceStagedChangesAppliedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceStagedChangesAppliedMessagePayload standalonePriceStagedChangesAppliedMessagePayload = StandalonePriceStagedChangesAppliedMessagePayload.builder()
 *             .stagedChanges(stagedChangesBuilder -> stagedChangesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceStagedChangesAppliedMessagePayloadBuilder
        implements Builder<StandalonePriceStagedChangesAppliedMessagePayload> {

    private com.commercetools.api.models.standalone_price.StagedStandalonePrice stagedChanges;

    /**
     *  <p>Applied changes of the StandalonePrice after the Apply Staged Changes update action.</p>
     * @param builder function to build the stagedChanges value
     * @return Builder
     */

    public StandalonePriceStagedChangesAppliedMessagePayloadBuilder stagedChanges(
            Function<com.commercetools.api.models.standalone_price.StagedStandalonePriceBuilder, com.commercetools.api.models.standalone_price.StagedStandalonePriceBuilder> builder) {
        this.stagedChanges = builder
                .apply(com.commercetools.api.models.standalone_price.StagedStandalonePriceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Applied changes of the StandalonePrice after the Apply Staged Changes update action.</p>
     * @param builder function to build the stagedChanges value
     * @return Builder
     */

    public StandalonePriceStagedChangesAppliedMessagePayloadBuilder withStagedChanges(
            Function<com.commercetools.api.models.standalone_price.StagedStandalonePriceBuilder, com.commercetools.api.models.standalone_price.StagedStandalonePrice> builder) {
        this.stagedChanges = builder
                .apply(com.commercetools.api.models.standalone_price.StagedStandalonePriceBuilder.of());
        return this;
    }

    /**
     *  <p>Applied changes of the StandalonePrice after the Apply Staged Changes update action.</p>
     * @param stagedChanges value to be set
     * @return Builder
     */

    public StandalonePriceStagedChangesAppliedMessagePayloadBuilder stagedChanges(
            final com.commercetools.api.models.standalone_price.StagedStandalonePrice stagedChanges) {
        this.stagedChanges = stagedChanges;
        return this;
    }

    /**
     *  <p>Applied changes of the StandalonePrice after the Apply Staged Changes update action.</p>
     * @return stagedChanges
     */

    public com.commercetools.api.models.standalone_price.StagedStandalonePrice getStagedChanges() {
        return this.stagedChanges;
    }

    /**
     * builds StandalonePriceStagedChangesAppliedMessagePayload with checking for non-null required values
     * @return StandalonePriceStagedChangesAppliedMessagePayload
     */
    public StandalonePriceStagedChangesAppliedMessagePayload build() {
        Objects.requireNonNull(stagedChanges,
            StandalonePriceStagedChangesAppliedMessagePayload.class + ": stagedChanges is missing");
        return new StandalonePriceStagedChangesAppliedMessagePayloadImpl(stagedChanges);
    }

    /**
     * builds StandalonePriceStagedChangesAppliedMessagePayload without checking for non-null required values
     * @return StandalonePriceStagedChangesAppliedMessagePayload
     */
    public StandalonePriceStagedChangesAppliedMessagePayload buildUnchecked() {
        return new StandalonePriceStagedChangesAppliedMessagePayloadImpl(stagedChanges);
    }

    /**
     * factory method for an instance of StandalonePriceStagedChangesAppliedMessagePayloadBuilder
     * @return builder
     */
    public static StandalonePriceStagedChangesAppliedMessagePayloadBuilder of() {
        return new StandalonePriceStagedChangesAppliedMessagePayloadBuilder();
    }

    /**
     * create builder for StandalonePriceStagedChangesAppliedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceStagedChangesAppliedMessagePayloadBuilder of(
            final StandalonePriceStagedChangesAppliedMessagePayload template) {
        StandalonePriceStagedChangesAppliedMessagePayloadBuilder builder = new StandalonePriceStagedChangesAppliedMessagePayloadBuilder();
        builder.stagedChanges = template.getStagedChanges();
        return builder;
    }

}
