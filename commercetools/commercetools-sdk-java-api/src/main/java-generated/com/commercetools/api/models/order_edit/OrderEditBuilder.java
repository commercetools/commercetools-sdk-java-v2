
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderEditBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderEdit orderEdit = OrderEdit.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .plusStagedActions(stagedActionsBuilder -> stagedActionsBuilder)
 *             .result(resultBuilder -> resultBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderEditBuilder implements Builder<OrderEdit> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private String key;

    private com.commercetools.api.models.order.OrderReference resource;

    private java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> stagedActions;

    private com.commercetools.api.models.order_edit.OrderEditResult result;

    @Nullable
    private String comment;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    /**
     *  <p>Unique identifier of the Order Edit.</p>
     * @param id value to be set
     * @return Builder
     */

    public OrderEditBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the Order Edit.</p>
     * @param version value to be set
     * @return Builder
     */

    public OrderEditBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Order Edit was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public OrderEditBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Order Edit was last updated.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public OrderEditBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the Order Edit.</p>
     * @param key value to be set
     * @return Builder
     */

    public OrderEditBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Reference to the Order updated with this edit.</p>
     * @param builder function to build the resource value
     * @return Builder
     */

    public OrderEditBuilder resource(
            Function<com.commercetools.api.models.order.OrderReferenceBuilder, com.commercetools.api.models.order.OrderReferenceBuilder> builder) {
        this.resource = builder.apply(com.commercetools.api.models.order.OrderReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Reference to the Order updated with this edit.</p>
     * @param builder function to build the resource value
     * @return Builder
     */

    public OrderEditBuilder withResource(
            Function<com.commercetools.api.models.order.OrderReferenceBuilder, com.commercetools.api.models.order.OrderReference> builder) {
        this.resource = builder.apply(com.commercetools.api.models.order.OrderReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the Order updated with this edit.</p>
     * @param resource value to be set
     * @return Builder
     */

    public OrderEditBuilder resource(final com.commercetools.api.models.order.OrderReference resource) {
        this.resource = resource;
        return this;
    }

    /**
     *  <p>Update actions applied to the Order referenced by <code>resource</code>.</p>
     * @param stagedActions value to be set
     * @return Builder
     */

    public OrderEditBuilder stagedActions(
            final com.commercetools.api.models.order.StagedOrderUpdateAction... stagedActions) {
        this.stagedActions = new ArrayList<>(Arrays.asList(stagedActions));
        return this;
    }

    /**
     *  <p>Update actions applied to the Order referenced by <code>resource</code>.</p>
     * @param stagedActions value to be set
     * @return Builder
     */

    public OrderEditBuilder stagedActions(
            final java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> stagedActions) {
        this.stagedActions = stagedActions;
        return this;
    }

    /**
     *  <p>Update actions applied to the Order referenced by <code>resource</code>.</p>
     * @param stagedActions value to be set
     * @return Builder
     */

    public OrderEditBuilder plusStagedActions(
            final com.commercetools.api.models.order.StagedOrderUpdateAction... stagedActions) {
        if (this.stagedActions == null) {
            this.stagedActions = new ArrayList<>();
        }
        this.stagedActions.addAll(Arrays.asList(stagedActions));
        return this;
    }

    /**
     *  <p>Update actions applied to the Order referenced by <code>resource</code>.</p>
     * @param builder function to build the stagedActions value
     * @return Builder
     */

    public OrderEditBuilder plusStagedActions(
            Function<com.commercetools.api.models.order.StagedOrderUpdateActionBuilder, Builder<? extends com.commercetools.api.models.order.StagedOrderUpdateAction>> builder) {
        if (this.stagedActions == null) {
            this.stagedActions = new ArrayList<>();
        }
        this.stagedActions
                .add(builder.apply(com.commercetools.api.models.order.StagedOrderUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Update actions applied to the Order referenced by <code>resource</code>.</p>
     * @param builder function to build the stagedActions value
     * @return Builder
     */

    public OrderEditBuilder withStagedActions(
            Function<com.commercetools.api.models.order.StagedOrderUpdateActionBuilder, Builder<? extends com.commercetools.api.models.order.StagedOrderUpdateAction>> builder) {
        this.stagedActions = new ArrayList<>();
        this.stagedActions
                .add(builder.apply(com.commercetools.api.models.order.StagedOrderUpdateActionBuilder.of()).build());
        return this;
    }

    /**
     *  <p>For applied edits, it's a summary of the changes on the Order. For unapplied edits, it's a preview of the changes.</p>
     * @param result value to be set
     * @return Builder
     */

    public OrderEditBuilder result(final com.commercetools.api.models.order_edit.OrderEditResult result) {
        this.result = result;
        return this;
    }

    /**
     *  <p>For applied edits, it's a summary of the changes on the Order. For unapplied edits, it's a preview of the changes.</p>
     * @param builder function to build the result value
     * @return Builder
     */

    public OrderEditBuilder result(
            Function<com.commercetools.api.models.order_edit.OrderEditResultBuilder, Builder<? extends com.commercetools.api.models.order_edit.OrderEditResult>> builder) {
        this.result = builder.apply(com.commercetools.api.models.order_edit.OrderEditResultBuilder.of()).build();
        return this;
    }

    /**
     *  <p>User-defined information regarding the Order Edit.</p>
     * @param comment value to be set
     * @return Builder
     */

    public OrderEditBuilder comment(@Nullable final String comment) {
        this.comment = comment;
        return this;
    }

    /**
     *  <p>Custom Fields of the Order Edit.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public OrderEditBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields of the Order Edit.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public OrderEditBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFields> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields of the Order Edit.</p>
     * @param custom value to be set
     * @return Builder
     */

    public OrderEditBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>IDs and references that last modified the OrderEdit.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public OrderEditBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that last modified the OrderEdit.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public OrderEditBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that last modified the OrderEdit.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public OrderEditBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>IDs and references that created the OrderEdit.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public OrderEditBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that created the OrderEdit.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public OrderEditBuilder withCreatedBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that created the OrderEdit.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public OrderEditBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Unique identifier of the Order Edit.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the Order Edit.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the Order Edit was initially created.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the Order Edit was last updated.</p>
     * @return lastModifiedAt
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>User-defined unique identifier of the Order Edit.</p>
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
     *  <p>Update actions applied to the Order referenced by <code>resource</code>.</p>
     * @return stagedActions
     */

    public java.util.List<com.commercetools.api.models.order.StagedOrderUpdateAction> getStagedActions() {
        return this.stagedActions;
    }

    /**
     *  <p>For applied edits, it's a summary of the changes on the Order. For unapplied edits, it's a preview of the changes.</p>
     * @return result
     */

    public com.commercetools.api.models.order_edit.OrderEditResult getResult() {
        return this.result;
    }

    /**
     *  <p>User-defined information regarding the Order Edit.</p>
     * @return comment
     */

    @Nullable
    public String getComment() {
        return this.comment;
    }

    /**
     *  <p>Custom Fields of the Order Edit.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    /**
     *  <p>IDs and references that last modified the OrderEdit.</p>
     * @return lastModifiedBy
     */

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>IDs and references that created the OrderEdit.</p>
     * @return createdBy
     */

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     * builds OrderEdit with checking for non-null required values
     * @return OrderEdit
     */
    public OrderEdit build() {
        Objects.requireNonNull(id, OrderEdit.class + ": id is missing");
        Objects.requireNonNull(version, OrderEdit.class + ": version is missing");
        Objects.requireNonNull(createdAt, OrderEdit.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, OrderEdit.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(resource, OrderEdit.class + ": resource is missing");
        Objects.requireNonNull(stagedActions, OrderEdit.class + ": stagedActions is missing");
        Objects.requireNonNull(result, OrderEdit.class + ": result is missing");
        return new OrderEditImpl(id, version, createdAt, lastModifiedAt, key, resource, stagedActions, result, comment,
            custom, lastModifiedBy, createdBy);
    }

    /**
     * builds OrderEdit without checking for non-null required values
     * @return OrderEdit
     */
    public OrderEdit buildUnchecked() {
        return new OrderEditImpl(id, version, createdAt, lastModifiedAt, key, resource, stagedActions, result, comment,
            custom, lastModifiedBy, createdBy);
    }

    /**
     * factory method for an instance of OrderEditBuilder
     * @return builder
     */
    public static OrderEditBuilder of() {
        return new OrderEditBuilder();
    }

    /**
     * create builder for OrderEdit instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderEditBuilder of(final OrderEdit template) {
        OrderEditBuilder builder = new OrderEditBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.key = template.getKey();
        builder.resource = template.getResource();
        builder.stagedActions = template.getStagedActions();
        builder.result = template.getResult();
        builder.comment = template.getComment();
        builder.custom = template.getCustom();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        return builder;
    }

}
