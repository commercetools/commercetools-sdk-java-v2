
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderEditDraftBuilder {

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
