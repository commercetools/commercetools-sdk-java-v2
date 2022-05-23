
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
     <*  <p>Expected version of the StandalonePrice on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict error will be returned.</p>>
     */

    public StandalonePriceUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     <*  <p>Update actions to be performed on the StandalonePrice.</p>>
     */

    public StandalonePriceUpdateBuilder actions(
            final com.commercetools.api.models.standalone_price.StandalonePriceUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     <*  <p>Update actions to be performed on the StandalonePrice.</p>>
     */

    public StandalonePriceUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.standalone_price.StandalonePriceUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     <*  <p>Update actions to be performed on the StandalonePrice.</p>>
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
     <*  <p>Update actions to be performed on the StandalonePrice.</p>>
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
     <*  <p>Update actions to be performed on the StandalonePrice.</p>>
     */

    public StandalonePriceUpdateBuilder withActions(
            Function<com.commercetools.api.models.standalone_price.StandalonePriceUpdateActionBuilder, Builder<? extends com.commercetools.api.models.standalone_price.StandalonePriceUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(
            builder.apply(com.commercetools.api.models.standalone_price.StandalonePriceUpdateActionBuilder.of())
                    .build());
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.standalone_price.StandalonePriceUpdateAction> getActions() {
        return this.actions;
    }

    public StandalonePriceUpdate build() {
        Objects.requireNonNull(version, StandalonePriceUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, StandalonePriceUpdate.class + ": actions is missing");
        return new StandalonePriceUpdateImpl(version, actions);
    }

    /**
     * builds StandalonePriceUpdate without checking for non null required values
     */
    public StandalonePriceUpdate buildUnchecked() {
        return new StandalonePriceUpdateImpl(version, actions);
    }

    public static StandalonePriceUpdateBuilder of() {
        return new StandalonePriceUpdateBuilder();
    }

    public static StandalonePriceUpdateBuilder of(final StandalonePriceUpdate template) {
        StandalonePriceUpdateBuilder builder = new StandalonePriceUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
