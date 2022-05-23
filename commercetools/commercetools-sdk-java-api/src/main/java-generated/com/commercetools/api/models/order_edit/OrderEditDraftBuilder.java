
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   OrderEditDraft orderEditDraft = OrderEditDraft.builder()
           .resource(resourceBuilder -> resourceBuilder)
           .build()
 </code></pre>
 </div>
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
     *  <p>User-defined unique identifier for the OrderEdit.</p>
     */

    public OrderEditDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>The order to be updated with this edit.</p>
     */

    public OrderEditDraftBuilder resource(
            Function<com.commercetools.api.models.order.OrderReferenceBuilder, com.commercetools.api.models.order.OrderReferenceBuilder> builder) {
        this.resource = builder.apply(com.commercetools.api.models.order.OrderReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The order to be updated with this edit.</p>
     */

    public OrderEditDraftBuilder resource(final com.commercetools.api.models.order.OrderReference resource) {
        this.resource = resource;
        return this;
    }

    /**
     *  <p>The actions to apply to <code>resource</code>.</p>
     */

    public OrderEditDraftBuilder stagedActions(
            @Nullable final com.commercetools.api.models.order.StagedOrderUpdateAction... stagedActions) {
        this.stagedActions = new ArrayList<>(Arrays.asList(stagedActions));
        return this;
    }

    /**
     *  <p>The actions to apply to <code>resource</code>.</p>
     */

    public OrderEditDraftBuilder stagedActions(
            @Nullable final java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> stagedActions) {
        this.stagedActions = stagedActions;
        return this;
    }

    /**
     *  <p>The actions to apply to <code>resource</code>.</p>
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
     *  <p>The actions to apply to <code>resource</code>.</p>
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
     *  <p>The actions to apply to <code>resource</code>.</p>
     */

    public OrderEditDraftBuilder withStagedActions(
            Function<com.commercetools.api.models.order.StagedOrderUpdateActionBuilder, Builder<? extends com.commercetools.api.models.order.StagedOrderUpdateAction>> builder) {
        this.stagedActions = new ArrayList<>();
        this.stagedActions
                .add(builder.apply(com.commercetools.api.models.order.StagedOrderUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The custom fields.</p>
     */

    public OrderEditDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The custom fields.</p>
     */

    public OrderEditDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>This field can be used to add additional textual information regarding the edit.</p>
     */

    public OrderEditDraftBuilder comment(@Nullable final String comment) {
        this.comment = comment;
        return this;
    }

    /**
     *  <p>When set to <code>true</code> the edit is applied on the Order without persisting it.</p>
     */

    public OrderEditDraftBuilder dryRun(@Nullable final Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public com.commercetools.api.models.order.OrderReference getResource() {
        return this.resource;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> getStagedActions() {
        return this.stagedActions;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    @Nullable
    public String getComment() {
        return this.comment;
    }

    @Nullable
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public OrderEditDraft build() {
        Objects.requireNonNull(resource, OrderEditDraft.class + ": resource is missing");
        return new OrderEditDraftImpl(key, resource, stagedActions, custom, comment, dryRun);
    }

    /**
     * builds OrderEditDraft without checking for non null required values
     */
    public OrderEditDraft buildUnchecked() {
        return new OrderEditDraftImpl(key, resource, stagedActions, custom, comment, dryRun);
    }

    public static OrderEditDraftBuilder of() {
        return new OrderEditDraftBuilder();
    }

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
