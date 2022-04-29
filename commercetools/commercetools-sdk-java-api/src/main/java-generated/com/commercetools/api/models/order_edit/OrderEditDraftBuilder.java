
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
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

    public OrderEditDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    public OrderEditDraftBuilder resource(
            Function<com.commercetools.api.models.order.OrderReferenceBuilder, com.commercetools.api.models.order.OrderReferenceBuilder> builder) {
        this.resource = builder.apply(com.commercetools.api.models.order.OrderReferenceBuilder.of()).build();
        return this;
    }

    public OrderEditDraftBuilder resource(final com.commercetools.api.models.order.OrderReference resource) {
        this.resource = resource;
        return this;
    }

    public OrderEditDraftBuilder stagedActions(
            @Nullable final com.commercetools.api.models.order.StagedOrderUpdateAction... stagedActions) {
        this.stagedActions = new ArrayList<>(Arrays.asList(stagedActions));
        return this;
    }

    public OrderEditDraftBuilder stagedActions(
            @Nullable final java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> stagedActions) {
        this.stagedActions = stagedActions;
        return this;
    }

    public OrderEditDraftBuilder plusStagedActions(
            @Nullable final com.commercetools.api.models.order.StagedOrderUpdateAction... stagedActions) {
        if (this.stagedActions == null) {
            this.stagedActions = new ArrayList<>();
        }
        this.stagedActions.addAll(Arrays.asList(stagedActions));
        return this;
    }

    public OrderEditDraftBuilder plusStagedActions(
            Function<com.commercetools.api.models.order.StagedOrderUpdateActionBuilder, Builder<? extends com.commercetools.api.models.order.StagedOrderUpdateAction>> builder) {
        if (this.stagedActions == null) {
            this.stagedActions = new ArrayList<>();
        }
        this.stagedActions
                .add(builder.apply(com.commercetools.api.models.order.StagedOrderUpdateActionBuilder.of()).build());
        return this;
    }

    public OrderEditDraftBuilder withStagedActions(
            Function<com.commercetools.api.models.order.StagedOrderUpdateActionBuilder, Builder<? extends com.commercetools.api.models.order.StagedOrderUpdateAction>> builder) {
        this.stagedActions = new ArrayList<>();
        this.stagedActions
                .add(builder.apply(com.commercetools.api.models.order.StagedOrderUpdateActionBuilder.of()).build());
        return this;
    }

    public OrderEditDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    public OrderEditDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    public OrderEditDraftBuilder comment(@Nullable final String comment) {
        this.comment = comment;
        return this;
    }

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
