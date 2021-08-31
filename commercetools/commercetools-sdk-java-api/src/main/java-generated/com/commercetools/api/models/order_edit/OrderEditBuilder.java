
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderEditBuilder implements Builder<OrderEdit> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    @Nullable
    private String key;

    private com.commercetools.api.models.order.OrderReference resource;

    private java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> stagedActions;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    private com.commercetools.api.models.order_edit.OrderEditResult result;

    @Nullable
    private String comment;

    public OrderEditBuilder id(final String id) {
        this.id = id;
        return this;
    }

    public OrderEditBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    public OrderEditBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public OrderEditBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    public OrderEditBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    public OrderEditBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    public OrderEditBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    public OrderEditBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public OrderEditBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    public OrderEditBuilder resource(final com.commercetools.api.models.order.OrderReference resource) {
        this.resource = resource;
        return this;
    }

    public OrderEditBuilder stagedActions(
            final com.commercetools.api.models.order.StagedOrderUpdateAction... stagedActions) {
        this.stagedActions = new ArrayList<>(Arrays.asList(stagedActions));
        return this;
    }

    public OrderEditBuilder stagedActions(
            final java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> stagedActions) {
        this.stagedActions = stagedActions;
        return this;
    }

    public OrderEditBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    public OrderEditBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    public OrderEditBuilder result(final com.commercetools.api.models.order_edit.OrderEditResult result) {
        this.result = result;
        return this;
    }

    public OrderEditBuilder comment(@Nullable final String comment) {
        this.comment = comment;
        return this;
    }

    public String getId() {
        return this.id;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public com.commercetools.api.models.order.OrderReference getResource() {
        return this.resource;
    }

    public java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> getStagedActions() {
        return this.stagedActions;
    }

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    public com.commercetools.api.models.order_edit.OrderEditResult getResult() {
        return this.result;
    }

    @Nullable
    public String getComment() {
        return this.comment;
    }

    public OrderEdit build() {
        Objects.requireNonNull(id, OrderEdit.class + ": id is missing");
        Objects.requireNonNull(version, OrderEdit.class + ": version is missing");
        Objects.requireNonNull(createdAt, OrderEdit.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, OrderEdit.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(resource, OrderEdit.class + ": resource is missing");
        Objects.requireNonNull(stagedActions, OrderEdit.class + ": stagedActions is missing");
        Objects.requireNonNull(result, OrderEdit.class + ": result is missing");
        return new OrderEditImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, resource,
            stagedActions, custom, result, comment);
    }

    /**
     * builds OrderEdit without checking for non null required values
     */
    public OrderEdit buildUnchecked() {
        return new OrderEditImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, resource,
            stagedActions, custom, result, comment);
    }

    public static OrderEditBuilder of() {
        return new OrderEditBuilder();
    }

    public static OrderEditBuilder of(final OrderEdit template) {
        OrderEditBuilder builder = new OrderEditBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.key = template.getKey();
        builder.resource = template.getResource();
        builder.stagedActions = template.getStagedActions();
        builder.custom = template.getCustom();
        builder.result = template.getResult();
        builder.comment = template.getComment();
        return builder;
    }

}
