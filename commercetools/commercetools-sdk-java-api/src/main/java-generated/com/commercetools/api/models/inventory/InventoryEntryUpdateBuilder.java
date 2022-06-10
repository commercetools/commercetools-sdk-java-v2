
package com.commercetools.api.models.inventory;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryEntryUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntryUpdate inventoryEntryUpdate = InventoryEntryUpdate.builder()
 *             .version(0.3)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryEntryUpdateBuilder implements Builder<InventoryEntryUpdate> {

    private Long version;

    private java.util.List<com.commercetools.api.models.inventory.InventoryEntryUpdateAction> actions;

    /**
     *  <p>Expected version of the InventoryEntry on which the changes should be applied. If the expected version does not match the actual version, a 409 Conflict error will be returned.</p>
     */

    public InventoryEntryUpdateBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the InventoryEntry.</p>
     */

    public InventoryEntryUpdateBuilder actions(
            final com.commercetools.api.models.inventory.InventoryEntryUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the InventoryEntry.</p>
     */

    public InventoryEntryUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.inventory.InventoryEntryUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *  <p>Update actions to be performed on the InventoryEntry.</p>
     */

    public InventoryEntryUpdateBuilder plusActions(
            final com.commercetools.api.models.inventory.InventoryEntryUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>Update actions to be performed on the InventoryEntry.</p>
     */

    public InventoryEntryUpdateBuilder plusActions(
            Function<com.commercetools.api.models.inventory.InventoryEntryUpdateActionBuilder, Builder<? extends com.commercetools.api.models.inventory.InventoryEntryUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(
            builder.apply(com.commercetools.api.models.inventory.InventoryEntryUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Update actions to be performed on the InventoryEntry.</p>
     */

    public InventoryEntryUpdateBuilder withActions(
            Function<com.commercetools.api.models.inventory.InventoryEntryUpdateActionBuilder, Builder<? extends com.commercetools.api.models.inventory.InventoryEntryUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(
            builder.apply(com.commercetools.api.models.inventory.InventoryEntryUpdateActionBuilder.of()).build());
        return this;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.util.List<com.commercetools.api.models.inventory.InventoryEntryUpdateAction> getActions() {
        return this.actions;
    }

    public InventoryEntryUpdate build() {
        Objects.requireNonNull(version, InventoryEntryUpdate.class + ": version is missing");
        Objects.requireNonNull(actions, InventoryEntryUpdate.class + ": actions is missing");
        return new InventoryEntryUpdateImpl(version, actions);
    }

    /**
     * builds InventoryEntryUpdate without checking for non null required values
     */
    public InventoryEntryUpdate buildUnchecked() {
        return new InventoryEntryUpdateImpl(version, actions);
    }

    public static InventoryEntryUpdateBuilder of() {
        return new InventoryEntryUpdateBuilder();
    }

    public static InventoryEntryUpdateBuilder of(final InventoryEntryUpdate template) {
        InventoryEntryUpdateBuilder builder = new InventoryEntryUpdateBuilder();
        builder.version = template.getVersion();
        builder.actions = template.getActions();
        return builder;
    }

}
