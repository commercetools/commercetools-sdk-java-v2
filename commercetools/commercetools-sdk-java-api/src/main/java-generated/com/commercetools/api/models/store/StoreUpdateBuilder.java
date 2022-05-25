
package com.commercetools.api.models.store;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreUpdate storeUpdate = StoreUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StoreUpdateBuilder implements Builder<StoreUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.store.StoreUpdateAction> actions;

    /**
     *
     */

    public StoreUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *
     */

    public StoreUpdateBuilder actions(final com.commercetools.api.models.store.StoreUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *
     */

    public StoreUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.store.StoreUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *
     */

    public StoreUpdateBuilder plusActions(final com.commercetools.api.models.store.StoreUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     *
     */

    public StoreUpdateBuilder plusActions(
            Function<com.commercetools.api.models.store.StoreUpdateActionBuilder, Builder<? extends com.commercetools.api.models.store.StoreUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(builder.apply(com.commercetools.api.models.store.StoreUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *
     */

    public StoreUpdateBuilder withActions(
            Function<com.commercetools.api.models.store.StoreUpdateActionBuilder, Builder<? extends com.commercetools.api.models.store.StoreUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(builder.apply(com.commercetools.api.models.store.StoreUpdateActionBuilder.of()).build());
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.store.StoreUpdateAction> getActions() {
        return this.actions;
    }

    public StoreUpdate build() {
        Objects.requireNonNull(version, StoreUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, StoreUpdate.class + ": actions is missing");
        return new StoreUpdateImpl(version, actions);
    }

    /**
     * builds StoreUpdate without checking for non null required values
     */
    public StoreUpdate buildUnchecked() {
        return new StoreUpdateImpl(version, actions);
    }

    public static StoreUpdateBuilder of() {
        return new StoreUpdateBuilder();
    }

    public static StoreUpdateBuilder of(final StoreUpdate template) {
        StoreUpdateBuilder builder = new StoreUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
