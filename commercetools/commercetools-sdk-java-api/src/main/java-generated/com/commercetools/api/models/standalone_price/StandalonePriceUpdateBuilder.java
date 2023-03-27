
package com.commercetools.api.models.standalone_price;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceUpdate standalonePriceUpdate = StandalonePriceUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceUpdateBuilder implements Builder<StandalonePriceUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.standalone_price.StandalonePriceUpdateAction> actions;

    /**
     *  <p>Expected version of the StandalonePrice on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error is returned.</p>
     * @param version value to be set
     * @return Builder
     */

    public StandalonePriceUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the StandalonePrice.</p>
     * @param actions value to be set
     * @return Builder
     */

    public StandalonePriceUpdateBuilder actions(
            final com.commercetools.api.models.standalone_price.StandalonePriceUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the StandalonePrice.</p>
     * @param actions value to be set
     * @return Builder
     */

    public StandalonePriceUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.standalone_price.StandalonePriceUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the StandalonePrice.</p>
     * @param actions value to be set
     * @return Builder
     */

    public StandalonePriceUpdateBuilder plusActions(
            final com.commercetools.api.models.standalone_price.StandalonePriceUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the StandalonePrice.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public StandalonePriceUpdateBuilder plusActions(
            Function<com.commercetools.api.models.standalone_price.StandalonePriceUpdateActionBuilder, Builder<? extends com.commercetools.api.models.standalone_price.StandalonePriceUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(
            builder.apply(com.commercetools.api.models.standalone_price.StandalonePriceUpdateActionBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>Update actions to be performed on the StandalonePrice.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public StandalonePriceUpdateBuilder withActions(
            Function<com.commercetools.api.models.standalone_price.StandalonePriceUpdateActionBuilder, Builder<? extends com.commercetools.api.models.standalone_price.StandalonePriceUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(
            builder.apply(com.commercetools.api.models.standalone_price.StandalonePriceUpdateActionBuilder.of())
                    .build());
        return this;
    }

    /**
     *  <p>Expected version of the StandalonePrice on which the changes should be applied. If the expected version does not match the actual version, a ConcurrentModification error is returned.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Update actions to be performed on the StandalonePrice.</p>
     * @return actions
     */

    public java.util.List<com.commercetools.api.models.standalone_price.StandalonePriceUpdateAction> getActions() {
        return this.actions;
    }

    /**
     * builds StandalonePriceUpdate with checking for non-null required values
     * @return StandalonePriceUpdate
     */
    public StandalonePriceUpdate build() {
        Objects.requireNonNull(version, StandalonePriceUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, StandalonePriceUpdate.class + ": actions is missing");
        return new StandalonePriceUpdateImpl(version, actions);
    }

    /**
     * builds StandalonePriceUpdate without checking for non-null required values
     * @return StandalonePriceUpdate
     */
    public StandalonePriceUpdate buildUnchecked() {
        return new StandalonePriceUpdateImpl(version, actions);
    }

    /**
     * factory method for an instance of StandalonePriceUpdateBuilder
     * @return builder
     */
    public static StandalonePriceUpdateBuilder of() {
        return new StandalonePriceUpdateBuilder();
    }

    /**
     * create builder for StandalonePriceUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceUpdateBuilder of(final StandalonePriceUpdate template) {
        StandalonePriceUpdateBuilder builder = new StandalonePriceUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
