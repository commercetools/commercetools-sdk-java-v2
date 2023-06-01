package com.commercetools.api.models.message;

import com.commercetools.api.models.customer.CustomerReference;
import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.message.OrderMessage;
import com.commercetools.api.models.message.OrderCustomerSetMessage;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderCustomerSetMessageBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCustomerSetMessage orderCustomerSetMessage = OrderCustomerSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderCustomerSetMessageBuilder implements Builder<OrderCustomerSetMessage> {

    
    
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
    
    
    @Nullable
    private com.commercetools.api.models.customer.CustomerReference customer;
    
    
    @Nullable
    private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;
    
    
    @Nullable
    private com.commercetools.api.models.customer.CustomerReference oldCustomer;
    
    
    @Nullable
    private com.commercetools.api.models.customer_group.CustomerGroupReference oldCustomerGroup;

    
    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     * @param id value to be set
     * @return Builder
     */
    
    public OrderCustomerSetMessageBuilder id( final String id) {
        this.id = id;
        return this;
    }
    
    
    
    
    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     * @param version value to be set
     * @return Builder
     */
    
    public OrderCustomerSetMessageBuilder version( final Long version) {
        this.version = version;
        return this;
    }
    
    
    
    
    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     * @param createdAt value to be set
     * @return Builder
     */
    
    public OrderCustomerSetMessageBuilder createdAt( final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    
    
    
    
    /**
     *  <p>Value of <code>createdAt</code>.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */
    
    public OrderCustomerSetMessageBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }
    
    
    
    
    /**
     *  <p>Value of <code>createdBy</code>.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */
    
    public OrderCustomerSetMessageBuilder lastModifiedBy(Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Value of <code>createdBy</code>.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */
    
    public OrderCustomerSetMessageBuilder withLastModifiedBy(Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Value of <code>createdBy</code>.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */
    
    public OrderCustomerSetMessageBuilder lastModifiedBy(@Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }
    
    
    
    
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */
    
    public OrderCustomerSetMessageBuilder createdBy(Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */
    
    public OrderCustomerSetMessageBuilder withCreatedBy(Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param createdBy value to be set
     * @return Builder
     */
    
    public OrderCustomerSetMessageBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }
    
    
    
    
    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     * @param sequenceNumber value to be set
     * @return Builder
     */
    
    public OrderCustomerSetMessageBuilder sequenceNumber( final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }
    
    
    
    
    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @param resource value to be set
     * @return Builder
     */
    
    public OrderCustomerSetMessageBuilder resource( final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }
    
    
    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @param builder function to build the resource value
     * @return Builder
     */
    
    public OrderCustomerSetMessageBuilder resource(Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }
                    
    
    
    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     * @param resourceVersion value to be set
     * @return Builder
     */
    
    public OrderCustomerSetMessageBuilder resourceVersion( final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }
    
    
    
    
    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param builder function to build the resourceUserProvidedIdentifiers value
     * @return Builder
     */
    
    public OrderCustomerSetMessageBuilder resourceUserProvidedIdentifiers(Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder.apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param builder function to build the resourceUserProvidedIdentifiers value
     * @return Builder
     */
    
    public OrderCustomerSetMessageBuilder withResourceUserProvidedIdentifiers(Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiers> builder) {
        this.resourceUserProvidedIdentifiers = builder.apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of());
        return this;
    }
                    
    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param resourceUserProvidedIdentifiers value to be set
     * @return Builder
     */
    
    public OrderCustomerSetMessageBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }
    
    
    
    
    /**
     *  <p>Customer on the Order after the Set Customer Id update action.</p>
     * @param builder function to build the customer value
     * @return Builder
     */
    
    public OrderCustomerSetMessageBuilder customer(Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReferenceBuilder> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Customer on the Order after the Set Customer Id update action.</p>
     * @param builder function to build the customer value
     * @return Builder
     */
    
    public OrderCustomerSetMessageBuilder withCustomer(Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReference> builder) {
        this.customer = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Customer on the Order after the Set Customer Id update action.</p>
     * @param customer value to be set
     * @return Builder
     */
    
    public OrderCustomerSetMessageBuilder customer(@Nullable final com.commercetools.api.models.customer.CustomerReference customer) {
        this.customer = customer;
        return this;
    }
    
    
    
    
    /**
     *  <p>CustomerGroup on the Order after the Set Customer Id update action.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */
    
    public OrderCustomerSetMessageBuilder customerGroup(Function<com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder, com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder> builder) {
        this.customerGroup = builder.apply(com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>CustomerGroup on the Order after the Set Customer Id update action.</p>
     * @param builder function to build the customerGroup value
     * @return Builder
     */
    
    public OrderCustomerSetMessageBuilder withCustomerGroup(Function<com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder, com.commercetools.api.models.customer_group.CustomerGroupReference> builder) {
        this.customerGroup = builder.apply(com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder.of());
        return this;
    }
                    
    /**
     *  <p>CustomerGroup on the Order after the Set Customer Id update action.</p>
     * @param customerGroup value to be set
     * @return Builder
     */
    
    public OrderCustomerSetMessageBuilder customerGroup(@Nullable final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
        this.customerGroup = customerGroup;
        return this;
    }
    
    
    
    
    /**
     *  <p>Customer on the Order before the Set Customer Id update action.</p>
     * @param builder function to build the oldCustomer value
     * @return Builder
     */
    
    public OrderCustomerSetMessageBuilder oldCustomer(Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReferenceBuilder> builder) {
        this.oldCustomer = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Customer on the Order before the Set Customer Id update action.</p>
     * @param builder function to build the oldCustomer value
     * @return Builder
     */
    
    public OrderCustomerSetMessageBuilder withOldCustomer(Function<com.commercetools.api.models.customer.CustomerReferenceBuilder, com.commercetools.api.models.customer.CustomerReference> builder) {
        this.oldCustomer = builder.apply(com.commercetools.api.models.customer.CustomerReferenceBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Customer on the Order before the Set Customer Id update action.</p>
     * @param oldCustomer value to be set
     * @return Builder
     */
    
    public OrderCustomerSetMessageBuilder oldCustomer(@Nullable final com.commercetools.api.models.customer.CustomerReference oldCustomer) {
        this.oldCustomer = oldCustomer;
        return this;
    }
    
    
    
    
    /**
     *  <p>CustomerGroup on the Order before the Set Customer Id update action.</p>
     * @param builder function to build the oldCustomerGroup value
     * @return Builder
     */
    
    public OrderCustomerSetMessageBuilder oldCustomerGroup(Function<com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder, com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder> builder) {
        this.oldCustomerGroup = builder.apply(com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>CustomerGroup on the Order before the Set Customer Id update action.</p>
     * @param builder function to build the oldCustomerGroup value
     * @return Builder
     */
    
    public OrderCustomerSetMessageBuilder withOldCustomerGroup(Function<com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder, com.commercetools.api.models.customer_group.CustomerGroupReference> builder) {
        this.oldCustomerGroup = builder.apply(com.commercetools.api.models.customer_group.CustomerGroupReferenceBuilder.of());
        return this;
    }
                    
    /**
     *  <p>CustomerGroup on the Order before the Set Customer Id update action.</p>
     * @param oldCustomerGroup value to be set
     * @return Builder
     */
    
    public OrderCustomerSetMessageBuilder oldCustomerGroup(@Nullable final com.commercetools.api.models.customer_group.CustomerGroupReference oldCustomerGroup) {
        this.oldCustomerGroup = oldCustomerGroup;
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
     *  <p>Customer on the Order after the Set Customer Id update action.</p>
     * @return customer
     */
    
    @Nullable
    public com.commercetools.api.models.customer.CustomerReference getCustomer(){
        return this.customer;
    }
    
    /**
     *  <p>CustomerGroup on the Order after the Set Customer Id update action.</p>
     * @return customerGroup
     */
    
    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup(){
        return this.customerGroup;
    }
    
    /**
     *  <p>Customer on the Order before the Set Customer Id update action.</p>
     * @return oldCustomer
     */
    
    @Nullable
    public com.commercetools.api.models.customer.CustomerReference getOldCustomer(){
        return this.oldCustomer;
    }
    
    /**
     *  <p>CustomerGroup on the Order before the Set Customer Id update action.</p>
     * @return oldCustomerGroup
     */
    
    @Nullable
    public com.commercetools.api.models.customer_group.CustomerGroupReference getOldCustomerGroup(){
        return this.oldCustomerGroup;
    }

    /**
     * builds OrderCustomerSetMessage with checking for non-null required values
     * @return OrderCustomerSetMessage
     */
    public OrderCustomerSetMessage build() {
        Objects.requireNonNull(id, OrderCustomerSetMessage.class + ": id is missing");
        Objects.requireNonNull(version, OrderCustomerSetMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, OrderCustomerSetMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, OrderCustomerSetMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber, OrderCustomerSetMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, OrderCustomerSetMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion, OrderCustomerSetMessage.class + ": resourceVersion is missing");
        return new OrderCustomerSetMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, customer, customerGroup, oldCustomer, oldCustomerGroup);
    }
    
    /**
     * builds OrderCustomerSetMessage without checking for non-null required values
     * @return OrderCustomerSetMessage
     */
    public OrderCustomerSetMessage buildUnchecked() {
        return new OrderCustomerSetMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, customer, customerGroup, oldCustomer, oldCustomerGroup);
    }

    /**
     * factory method for an instance of OrderCustomerSetMessageBuilder
     * @return builder 
     */
    public static OrderCustomerSetMessageBuilder of() {
        return new OrderCustomerSetMessageBuilder();
    }

    /**
     * create builder for OrderCustomerSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderCustomerSetMessageBuilder of(final OrderCustomerSetMessage template) {
        OrderCustomerSetMessageBuilder builder = new OrderCustomerSetMessageBuilder();
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
        builder.customer = template.getCustomer();
        builder.customerGroup = template.getCustomerGroup();
        builder.oldCustomer = template.getOldCustomer();
        builder.oldCustomerGroup = template.getOldCustomerGroup();
        return builder;
    }

}
