
package com.commercetools.api.models.variant;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantBulkUpdateBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantBulkUpdate variantBulkUpdate = VariantBulkUpdate.builder()
 *             .plusItems(itemsBuilder -> itemsBuilder)
 *             .plusActions(actionsBuilder -> actionsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantBulkUpdateBuilder implements Builder<VariantBulkUpdate> {

    private java.util.List<com.commercetools.api.models.variant.VariantBulkUpdateItem> items;

    private java.util.List<com.commercetools.api.models.variant.VariantUpdateAction> actions;

    /**
     *  <p>List of Variants to update. Each item must identify the Variant by <code>id</code> or <code>key</code>.</p>
     * @param items value to be set
     * @return Builder
     */

    public VariantBulkUpdateBuilder items(final com.commercetools.api.models.variant.VariantBulkUpdateItem... items) {
        this.items = new ArrayList<>(Arrays.asList(items));
        return this;
    }

    /**
     *  <p>List of Variants to update. Each item must identify the Variant by <code>id</code> or <code>key</code>.</p>
     * @param items value to be set
     * @return Builder
     */

    public VariantBulkUpdateBuilder items(
            final java.util.List<com.commercetools.api.models.variant.VariantBulkUpdateItem> items) {
        this.items = items;
        return this;
    }

    /**
     *  <p>List of Variants to update. Each item must identify the Variant by <code>id</code> or <code>key</code>.</p>
     * @param items value to be set
     * @return Builder
     */

    public VariantBulkUpdateBuilder plusItems(
            final com.commercetools.api.models.variant.VariantBulkUpdateItem... items) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.addAll(Arrays.asList(items));
        return this;
    }

    /**
     *  <p>List of Variants to update. Each item must identify the Variant by <code>id</code> or <code>key</code>.</p>
     * @param builder function to build the items value
     * @return Builder
     */

    public VariantBulkUpdateBuilder plusItems(
            Function<com.commercetools.api.models.variant.VariantBulkUpdateItemBuilder, com.commercetools.api.models.variant.VariantBulkUpdateItemBuilder> builder) {
        if (this.items == null) {
            this.items = new ArrayList<>();
        }
        this.items.add(builder.apply(com.commercetools.api.models.variant.VariantBulkUpdateItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>List of Variants to update. Each item must identify the Variant by <code>id</code> or <code>key</code>.</p>
     * @param builder function to build the items value
     * @return Builder
     */

    public VariantBulkUpdateBuilder withItems(
            Function<com.commercetools.api.models.variant.VariantBulkUpdateItemBuilder, com.commercetools.api.models.variant.VariantBulkUpdateItemBuilder> builder) {
        this.items = new ArrayList<>();
        this.items.add(builder.apply(com.commercetools.api.models.variant.VariantBulkUpdateItemBuilder.of()).build());
        return this;
    }

    /**
     *  <p>List of Variants to update. Each item must identify the Variant by <code>id</code> or <code>key</code>.</p>
     * @param builder function to build the items value
     * @return Builder
     */

    public VariantBulkUpdateBuilder addItems(
            Function<com.commercetools.api.models.variant.VariantBulkUpdateItemBuilder, com.commercetools.api.models.variant.VariantBulkUpdateItem> builder) {
        return plusItems(builder.apply(com.commercetools.api.models.variant.VariantBulkUpdateItemBuilder.of()));
    }

    /**
     *  <p>List of Variants to update. Each item must identify the Variant by <code>id</code> or <code>key</code>.</p>
     * @param builder function to build the items value
     * @return Builder
     */

    public VariantBulkUpdateBuilder setItems(
            Function<com.commercetools.api.models.variant.VariantBulkUpdateItemBuilder, com.commercetools.api.models.variant.VariantBulkUpdateItem> builder) {
        return items(builder.apply(com.commercetools.api.models.variant.VariantBulkUpdateItemBuilder.of()));
    }

    /**
     *  <p>The update action to apply to each Variant. Only <a href="https://docs.commercetools.com/apis/ctp:api:type:VariantPublishAction" rel="nofollow">Publish</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:VariantUnpublishAction" rel="nofollow">Unpublish</a> actions are supported. An empty array results in a no-op: all items are returned as successful with no changes applied.</p>
     * @param actions value to be set
     * @return Builder
     */

    public VariantBulkUpdateBuilder actions(final com.commercetools.api.models.variant.VariantUpdateAction... actions) {
        this.actions = new ArrayList<>(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>The update action to apply to each Variant. Only <a href="https://docs.commercetools.com/apis/ctp:api:type:VariantPublishAction" rel="nofollow">Publish</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:VariantUnpublishAction" rel="nofollow">Unpublish</a> actions are supported. An empty array results in a no-op: all items are returned as successful with no changes applied.</p>
     * @param actions value to be set
     * @return Builder
     */

    public VariantBulkUpdateBuilder actions(
            final java.util.List<com.commercetools.api.models.variant.VariantUpdateAction> actions) {
        this.actions = actions;
        return this;
    }

    /**
     *  <p>The update action to apply to each Variant. Only <a href="https://docs.commercetools.com/apis/ctp:api:type:VariantPublishAction" rel="nofollow">Publish</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:VariantUnpublishAction" rel="nofollow">Unpublish</a> actions are supported. An empty array results in a no-op: all items are returned as successful with no changes applied.</p>
     * @param actions value to be set
     * @return Builder
     */

    public VariantBulkUpdateBuilder plusActions(
            final com.commercetools.api.models.variant.VariantUpdateAction... actions) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.addAll(Arrays.asList(actions));
        return this;
    }

    /**
     *  <p>The update action to apply to each Variant. Only <a href="https://docs.commercetools.com/apis/ctp:api:type:VariantPublishAction" rel="nofollow">Publish</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:VariantUnpublishAction" rel="nofollow">Unpublish</a> actions are supported. An empty array results in a no-op: all items are returned as successful with no changes applied.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public VariantBulkUpdateBuilder plusActions(
            Function<com.commercetools.api.models.variant.VariantUpdateActionBuilder, Builder<? extends com.commercetools.api.models.variant.VariantUpdateAction>> builder) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(builder.apply(com.commercetools.api.models.variant.VariantUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The update action to apply to each Variant. Only <a href="https://docs.commercetools.com/apis/ctp:api:type:VariantPublishAction" rel="nofollow">Publish</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:VariantUnpublishAction" rel="nofollow">Unpublish</a> actions are supported. An empty array results in a no-op: all items are returned as successful with no changes applied.</p>
     * @param builder function to build the actions value
     * @return Builder
     */

    public VariantBulkUpdateBuilder withActions(
            Function<com.commercetools.api.models.variant.VariantUpdateActionBuilder, Builder<? extends com.commercetools.api.models.variant.VariantUpdateAction>> builder) {
        this.actions = new ArrayList<>();
        this.actions.add(builder.apply(com.commercetools.api.models.variant.VariantUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>List of Variants to update. Each item must identify the Variant by <code>id</code> or <code>key</code>.</p>
     * @return items
     */

    public java.util.List<com.commercetools.api.models.variant.VariantBulkUpdateItem> getItems() {
        return this.items;
    }

    /**
     *  <p>The update action to apply to each Variant. Only <a href="https://docs.commercetools.com/apis/ctp:api:type:VariantPublishAction" rel="nofollow">Publish</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:VariantUnpublishAction" rel="nofollow">Unpublish</a> actions are supported. An empty array results in a no-op: all items are returned as successful with no changes applied.</p>
     * @return actions
     */

    public java.util.List<com.commercetools.api.models.variant.VariantUpdateAction> getActions() {
        return this.actions;
    }

    /**
     * builds VariantBulkUpdate with checking for non-null required values
     * @return VariantBulkUpdate
     */
    public VariantBulkUpdate build() {
        Objects.requireNonNull(items, VariantBulkUpdate.class + ": items is missing");
        Objects.requireNonNull(actions, VariantBulkUpdate.class + ": actions is missing");
        return new VariantBulkUpdateImpl(items, actions);
    }

    /**
     * builds VariantBulkUpdate without checking for non-null required values
     * @return VariantBulkUpdate
     */
    public VariantBulkUpdate buildUnchecked() {
        return new VariantBulkUpdateImpl(items, actions);
    }

    /**
     * factory method for an instance of VariantBulkUpdateBuilder
     * @return builder
     */
    public static VariantBulkUpdateBuilder of() {
        return new VariantBulkUpdateBuilder();
    }

    /**
     * create builder for VariantBulkUpdate instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantBulkUpdateBuilder of(final VariantBulkUpdate template) {
        VariantBulkUpdateBuilder builder = new VariantBulkUpdateBuilder();
        builder.items = template.getItems();
        builder.actions = template.getActions();
        return builder;
    }

}
