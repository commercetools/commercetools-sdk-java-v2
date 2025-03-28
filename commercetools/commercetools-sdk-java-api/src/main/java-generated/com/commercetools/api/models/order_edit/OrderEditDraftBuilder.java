
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderEditDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderEditDraft orderEditDraft = OrderEditDraft.builder()
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderEditDraftBuilder implements Builder<OrderEditDraft> {

    @Nullable
    private String key;

    private com.commercetools.api.models.order.OrderReference resource;

    @Nullable
    private java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> stagedActions;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @Nullable
    private String comment;

    @Nullable
    private Boolean dryRun;

    /**
     *  <p>User-defined unique identifier for the Order Edit.</p>
     * @param key value to be set
     * @return Builder
     */

    public OrderEditDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Reference to the Order updated with this edit.</p>
     * @param builder function to build the resource value
     * @return Builder
     */

    public OrderEditDraftBuilder resource(
            Function<com.commercetools.api.models.order.OrderReferenceBuilder, com.commercetools.api.models.order.OrderReferenceBuilder> builder) {
        this.resource = builder.apply(com.commercetools.api.models.order.OrderReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to the Order updated with this edit.</p>
     * @param builder function to build the resource value
     * @return Builder
     */

    public OrderEditDraftBuilder withResource(
            Function<com.commercetools.api.models.order.OrderReferenceBuilder, com.commercetools.api.models.order.OrderReference> builder) {
        this.resource = builder.apply(com.commercetools.api.models.order.OrderReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the Order updated with this edit.</p>
     * @param resource value to be set
     * @return Builder
     */

    public OrderEditDraftBuilder resource(final com.commercetools.api.models.order.OrderReference resource) {
        this.resource = resource;
        return this;
    }

    /**
     *  <p>Update actions to apply to the Order referenced in <code>resource</code>. Cannot be updated if the edit has been applied.</p>
     * @param stagedActions value to be set
     * @return Builder
     */

    public OrderEditDraftBuilder stagedActions(
            @Nullable final com.commercetools.api.models.order.StagedOrderUpdateAction... stagedActions) {
        this.stagedActions = new ArrayList<>(Arrays.asList(stagedActions));
        return this;
    }

    /**
     *  <p>Update actions to apply to the Order referenced in <code>resource</code>. Cannot be updated if the edit has been applied.</p>
     * @param stagedActions value to be set
     * @return Builder
     */

    public OrderEditDraftBuilder stagedActions(
            @Nullable final java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> stagedActions) {
        this.stagedActions = stagedActions;
        return this;
    }

    /**
     *  <p>Update actions to apply to the Order referenced in <code>resource</code>. Cannot be updated if the edit has been applied.</p>
     * @param stagedActions value to be set
     * @return Builder
     */

    public OrderEditDraftBuilder plusStagedActions(
            @Nullable final com.commercetools.api.models.order.StagedOrderUpdateAction... stagedActions) {
        if (this.stagedActions == null) {
            this.stagedActions = new ArrayList<>();
        }
        this.stagedActions.addAll(Arrays.asList(stagedActions));
        return this;
    }

    /**
     *  <p>Update actions to apply to the Order referenced in <code>resource</code>. Cannot be updated if the edit has been applied.</p>
     * @param builder function to build the stagedActions value
     * @return Builder
     */

    public OrderEditDraftBuilder plusStagedActions(
            Function<com.commercetools.api.models.order.StagedOrderUpdateActionBuilder, Builder<? extends com.commercetools.api.models.order.StagedOrderUpdateAction>> builder) {
        if (this.stagedActions == null) {
            this.stagedActions = new ArrayList<>();
        }
        this.stagedActions
                .add(builder.apply(com.commercetools.api.models.order.StagedOrderUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Update actions to apply to the Order referenced in <code>resource</code>. Cannot be updated if the edit has been applied.</p>
     * @param builder function to build the stagedActions value
     * @return Builder
     */

    public OrderEditDraftBuilder withStagedActions(
            Function<com.commercetools.api.models.order.StagedOrderUpdateActionBuilder, Builder<? extends com.commercetools.api.models.order.StagedOrderUpdateAction>> builder) {
        this.stagedActions = new ArrayList<>();
        this.stagedActions
                .add(builder.apply(com.commercetools.api.models.order.StagedOrderUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Custom Fields for the Order Edit.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public OrderEditDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the Order Edit.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public OrderEditDraftBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields for the Order Edit.</p>
     * @param custom value to be set
     * @return Builder
     */

    public OrderEditDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>User-defined description regarding the Order Edit.</p>
     * @param comment value to be set
     * @return Builder
     */

    public OrderEditDraftBuilder comment(@Nullable final String comment) {
        this.comment = comment;
        return this;
    }

    /**
     *  <p>Set to <code>true</code> if you want to preview the edited Order first without persisting it (dry run). A dry run allows checking for potential errors when trying to apply the <code>stagedActions</code>.</p>
     *  <p>Order API Extensions, if any, are also called in dry runs.</p>
     * @param dryRun value to be set
     * @return Builder
     */

    public OrderEditDraftBuilder dryRun(@Nullable final Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     *  <p>User-defined unique identifier for the Order Edit.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Reference to the Order updated with this edit.</p>
     * @return resource
     */

    public com.commercetools.api.models.order.OrderReference getResource() {
        return this.resource;
    }

    /**
     *  <p>Update actions to apply to the Order referenced in <code>resource</code>. Cannot be updated if the edit has been applied.</p>
     * @return stagedActions
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> getStagedActions() {
        return this.stagedActions;
    }

    /**
     *  <p>Custom Fields for the Order Edit.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     *  <p>User-defined description regarding the Order Edit.</p>
     * @return comment
     */

    @Nullable
    public String getComment() {
        return this.comment;
    }

    /**
     *  <p>Set to <code>true</code> if you want to preview the edited Order first without persisting it (dry run). A dry run allows checking for potential errors when trying to apply the <code>stagedActions</code>.</p>
     *  <p>Order API Extensions, if any, are also called in dry runs.</p>
     * @return dryRun
     */

    @Nullable
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * builds OrderEditDraft with checking for non-null required values
     * @return OrderEditDraft
     */
    public OrderEditDraft build() {
        Objects.requireNonNull(resource, OrderEditDraft.class + ": resource is missing");
        return new OrderEditDraftImpl(key, resource, stagedActions, custom, comment, dryRun);
    }

    /**
     * builds OrderEditDraft without checking for non-null required values
     * @return OrderEditDraft
     */
    public OrderEditDraft buildUnchecked() {
        return new OrderEditDraftImpl(key, resource, stagedActions, custom, comment, dryRun);
    }

    /**
     * factory method for an instance of OrderEditDraftBuilder
     * @return builder
     */
    public static OrderEditDraftBuilder of() {
        return new OrderEditDraftBuilder();
    }

    /**
     * create builder for OrderEditDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderEditDraftBuilder of(final OrderEditDraft template) {
        OrderEditDraftBuilder builder = new OrderEditDraftBuilder();
        builder.key = template.getKey();
        builder.resource = template.getResource();
        builder.stagedActions = template.getStagedActions();
        builder.custom = template.getCustom();
        builder.comment = template.getComment();
        builder.dryRun = template.getDryRun();
        return builder;
    }

}
