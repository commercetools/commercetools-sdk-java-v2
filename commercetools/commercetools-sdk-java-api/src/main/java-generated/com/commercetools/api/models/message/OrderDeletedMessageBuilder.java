package com.commercetools.api.models.message;

import com.commercetools.api.models.message.OrderMessage;
import com.commercetools.api.models.order.Order;
import com.commercetools.api.models.message.OrderDeletedMessage;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderDeletedMessageBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderDeletedMessage orderDeletedMessage = OrderDeletedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .order(orderBuilder -> orderBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderDeletedMessageBuilder implements Builder<OrderDeletedMessage> {

    
    
    private String id;
    
    
    
    private Long version;
    
    
    
    private java.time.ZonedDateTime createdAt;
    
    
    
    private java.time.ZonedDateTime lastModifiedAt;
    
    
    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;
    
    
    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;
    
    
    
    private Long sequenceNumber;
    
    
    
    private com.commercetools.api.models.common.Reference resource;
    
    
    
    private Long resourceVersion;
    
    
    @Nullable
    private com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;
    
    
    
    private com.commercetools.api.models.order.Order order;

    
    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     * @param id value to be set
     * @return Builder
     */
    
    public OrderDeletedMessageBuilder id( final String id) {
        this.id = id;
        return this;
    }
    
    
    
    
    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     * @param version value to be set
     * @return Builder
     */
    
    public OrderDeletedMessageBuilder version( final Long version) {
        this.version = version;
        return this;
    }
    
    
    
    
    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     * @param createdAt value to be set
     * @return Builder
     */
    
    public OrderDeletedMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    
    
    
    /**
     *  <p>Value of <code>createdAt</code>.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */
    
    public OrderDeletedMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }
    
    
    
    
    /**
     *  <p>Value of <code>createdBy</code>.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */
    
    public OrderDeletedMessageBuilder lastModifiedBy(Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Value of <code>createdBy</code>.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */
    
    public OrderDeletedMessageBuilder withLastModifiedBy(Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Value of <code>createdBy</code>.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */
    
    public OrderDeletedMessageBuilder lastModifiedBy(@Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }
    
    
    
    
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */
    
    public OrderDeletedMessageBuilder createdBy(Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */
    
    public OrderDeletedMessageBuilder withCreatedBy(Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param createdBy value to be set
     * @return Builder
     */
    
    public OrderDeletedMessageBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    
    
    
    
    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     * @param sequenceNumber value to be set
     * @return Builder
     */
    
    public OrderDeletedMessageBuilder sequenceNumber( final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }
    
    
    
    
    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @param resource value to be set
     * @return Builder
     */
    
    public OrderDeletedMessageBuilder resource( final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }
    
    
    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @param builder function to build the resource value
     * @return Builder
     */
    
    public OrderDeletedMessageBuilder resource(Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }
                    
    
    
    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     * @param resourceVersion value to be set
     * @return Builder
     */
    
    public OrderDeletedMessageBuilder resourceVersion( final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }
    
    
    
    
    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param builder function to build the resourceUserProvidedIdentifiers value
     * @return Builder
     */
    
    public OrderDeletedMessageBuilder resourceUserProvidedIdentifiers(Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder.apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param builder function to build the resourceUserProvidedIdentifiers value
     * @return Builder
     */
    
    public OrderDeletedMessageBuilder withResourceUserProvidedIdentifiers(Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiers> builder) {
        this.resourceUserProvidedIdentifiers = builder.apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of());
        return this;
    }
                    
    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param resourceUserProvidedIdentifiers value to be set
     * @return Builder
     */
    
    public OrderDeletedMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }
    
    
    
    
    /**
     *  <p>Order that has been deleted.</p>
     * @param builder function to build the order value
     * @return Builder
     */
    
    public OrderDeletedMessageBuilder order(Function<com.commercetools.api.models.order.OrderBuilder, com.commercetools.api.models.order.OrderBuilder> builder) {
        this.order = builder.apply(com.commercetools.api.models.order.OrderBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Order that has been deleted.</p>
     * @param builder function to build the order value
     * @return Builder
     */
    
    public OrderDeletedMessageBuilder withOrder(Function<com.commercetools.api.models.order.OrderBuilder, com.commercetools.api.models.order.Order> builder) {
        this.order = builder.apply(com.commercetools.api.models.order.OrderBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Order that has been deleted.</p>
     * @param order value to be set
     * @return Builder
     */
    
    public OrderDeletedMessageBuilder order( final com.commercetools.api.models.order.Order order) {
        this.order = order;
        return this;
    }
    
    

    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     * @return id
     */
    
    
    public String getId(){
        return this.id;
    }
    
    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     * @return version
     */
    
    
    public Long getVersion(){
        return this.version;
    }
    
    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     * @return createdAt
     */
    
    
    public java.time.ZonedDateTime getCreatedAt(){
        return this.createdAt;
    }
    
    /**
     *  <p>Value of <code>createdAt</code>.</p>
     * @return lastModifiedAt
     */
    
    
    public java.time.ZonedDateTime getLastModifiedAt(){
        return this.lastModifiedAt;
    }
    
    /**
     *  <p>Value of <code>createdBy</code>.</p>
     * @return lastModifiedBy
     */
    
    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy(){
        return this.lastModifiedBy;
    }
    
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return createdBy
     */
    
    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy(){
        return this.createdBy;
    }
    
    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     * @return sequenceNumber
     */
    
    
    public Long getSequenceNumber(){
        return this.sequenceNumber;
    }
    
    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @return resource
     */
    
    
    public com.commercetools.api.models.common.Reference getResource(){
        return this.resource;
    }
    
    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     * @return resourceVersion
     */
    
    
    public Long getResourceVersion(){
        return this.resourceVersion;
    }
    
    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @return resourceUserProvidedIdentifiers
     */
    
    @Nullable
    public com.commercetools.api.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers(){
        return this.resourceUserProvidedIdentifiers;
    }
    
    /**
     *  <p>Order that has been deleted.</p>
     * @return order
     */
    
    
    public com.commercetools.api.models.order.Order getOrder(){
        return this.order;
    }

    /**
     * builds OrderDeletedMessage with checking for non-null required values
     * @return OrderDeletedMessage
     */
    public OrderDeletedMessage build() {
        Objects.requireNonNull(id, OrderDeletedMessage.class + ": id is missing");
        Objects.requireNonNull(version, OrderDeletedMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, OrderDeletedMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, OrderDeletedMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber, OrderDeletedMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, OrderDeletedMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion, OrderDeletedMessage.class + ": resourceVersion is missing");
        Objects.requireNonNull(order, OrderDeletedMessage.class + ": order is missing");
        return new OrderDeletedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, order);
    }
    
    /**
     * builds OrderDeletedMessage without checking for non-null required values
     * @return OrderDeletedMessage
     */
    public OrderDeletedMessage buildUnchecked() {
        return new OrderDeletedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, order);
    }

    /**
     * factory method for an instance of OrderDeletedMessageBuilder
     * @return builder 
     */
    public static OrderDeletedMessageBuilder of() {
        return new OrderDeletedMessageBuilder();
    }

    /**
     * create builder for OrderDeletedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderDeletedMessageBuilder of(final OrderDeletedMessage template) {
        OrderDeletedMessageBuilder builder = new OrderDeletedMessageBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.sequenceNumber = template.getSequenceNumber();
        builder.resource = template.getResource();
        builder.resourceVersion = template.getResourceVersion();
        builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
        builder.order = template.getOrder();
        return builder;
    }

}
