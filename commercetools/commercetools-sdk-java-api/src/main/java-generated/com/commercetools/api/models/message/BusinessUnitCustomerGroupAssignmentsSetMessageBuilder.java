
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitCustomerGroupAssignmentsSetMessageBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitCustomerGroupAssignmentsSetMessage businessUnitCustomerGroupAssignmentsSetMessage = BusinessUnitCustomerGroupAssignmentsSetMessage.builder()
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitCustomerGroupAssignmentsSetMessageBuilder
        implements Builder<BusinessUnitCustomerGroupAssignmentsSetMessage> {

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
    private java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignment> customerGroupAssignments;

    @Nullable
    private java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignment> oldCustomerGroupAssignments;

    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     * @param id value to be set
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentsSetMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     * @param version value to be set
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentsSetMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentsSetMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Value of <code>createdAt</code>.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentsSetMessageBuilder lastModifiedAt(
            final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Message.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentsSetMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Message.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentsSetMessageBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Message.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentsSetMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>IDs and references that created the Message.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentsSetMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that created the Message.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentsSetMessageBuilder withCreatedBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that created the Message.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentsSetMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     * @param sequenceNumber value to be set
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentsSetMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the resource on which the change or action was performed.</p>
     * @param resource value to be set
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentsSetMessageBuilder resource(
            final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the resource on which the change or action was performed.</p>
     * @param builder function to build the resource value
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentsSetMessageBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     * @param resourceVersion value to be set
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentsSetMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param builder function to build the resourceUserProvidedIdentifiers value
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentsSetMessageBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param builder function to build the resourceUserProvidedIdentifiers value
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentsSetMessageBuilder withResourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiers> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of());
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param resourceUserProvidedIdentifiers value to be set
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentsSetMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    /**
     *  <p>Customer Groups assigned to the Business Unit during the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param customerGroupAssignments value to be set
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentsSetMessageBuilder customerGroupAssignments(
            @Nullable final com.commercetools.api.models.customer.CustomerGroupAssignment... customerGroupAssignments) {
        this.customerGroupAssignments = new ArrayList<>(Arrays.asList(customerGroupAssignments));
        return this;
    }

    /**
     *  <p>Customer Groups assigned to the Business Unit during the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param customerGroupAssignments value to be set
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentsSetMessageBuilder customerGroupAssignments(
            @Nullable final java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignment> customerGroupAssignments) {
        this.customerGroupAssignments = customerGroupAssignments;
        return this;
    }

    /**
     *  <p>Customer Groups assigned to the Business Unit during the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param customerGroupAssignments value to be set
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentsSetMessageBuilder plusCustomerGroupAssignments(
            @Nullable final com.commercetools.api.models.customer.CustomerGroupAssignment... customerGroupAssignments) {
        if (this.customerGroupAssignments == null) {
            this.customerGroupAssignments = new ArrayList<>();
        }
        this.customerGroupAssignments.addAll(Arrays.asList(customerGroupAssignments));
        return this;
    }

    /**
     *  <p>Customer Groups assigned to the Business Unit during the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param builder function to build the customerGroupAssignments value
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentsSetMessageBuilder plusCustomerGroupAssignments(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder, com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder> builder) {
        if (this.customerGroupAssignments == null) {
            this.customerGroupAssignments = new ArrayList<>();
        }
        this.customerGroupAssignments
                .add(builder.apply(com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Customer Groups assigned to the Business Unit during the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param builder function to build the customerGroupAssignments value
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentsSetMessageBuilder withCustomerGroupAssignments(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder, com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder> builder) {
        this.customerGroupAssignments = new ArrayList<>();
        this.customerGroupAssignments
                .add(builder.apply(com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Customer Groups assigned to the Business Unit during the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param builder function to build the customerGroupAssignments value
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentsSetMessageBuilder addCustomerGroupAssignments(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder, com.commercetools.api.models.customer.CustomerGroupAssignment> builder) {
        return plusCustomerGroupAssignments(
            builder.apply(com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder.of()));
    }

    /**
     *  <p>Customer Groups assigned to the Business Unit during the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param builder function to build the customerGroupAssignments value
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentsSetMessageBuilder setCustomerGroupAssignments(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder, com.commercetools.api.models.customer.CustomerGroupAssignment> builder) {
        return customerGroupAssignments(
            builder.apply(com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder.of()));
    }

    /**
     *  <p>Customer Groups assigned to the Business Unit before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param oldCustomerGroupAssignments value to be set
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentsSetMessageBuilder oldCustomerGroupAssignments(
            @Nullable final com.commercetools.api.models.customer.CustomerGroupAssignment... oldCustomerGroupAssignments) {
        this.oldCustomerGroupAssignments = new ArrayList<>(Arrays.asList(oldCustomerGroupAssignments));
        return this;
    }

    /**
     *  <p>Customer Groups assigned to the Business Unit before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param oldCustomerGroupAssignments value to be set
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentsSetMessageBuilder oldCustomerGroupAssignments(
            @Nullable final java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignment> oldCustomerGroupAssignments) {
        this.oldCustomerGroupAssignments = oldCustomerGroupAssignments;
        return this;
    }

    /**
     *  <p>Customer Groups assigned to the Business Unit before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param oldCustomerGroupAssignments value to be set
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentsSetMessageBuilder plusOldCustomerGroupAssignments(
            @Nullable final com.commercetools.api.models.customer.CustomerGroupAssignment... oldCustomerGroupAssignments) {
        if (this.oldCustomerGroupAssignments == null) {
            this.oldCustomerGroupAssignments = new ArrayList<>();
        }
        this.oldCustomerGroupAssignments.addAll(Arrays.asList(oldCustomerGroupAssignments));
        return this;
    }

    /**
     *  <p>Customer Groups assigned to the Business Unit before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param builder function to build the oldCustomerGroupAssignments value
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentsSetMessageBuilder plusOldCustomerGroupAssignments(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder, com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder> builder) {
        if (this.oldCustomerGroupAssignments == null) {
            this.oldCustomerGroupAssignments = new ArrayList<>();
        }
        this.oldCustomerGroupAssignments
                .add(builder.apply(com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Customer Groups assigned to the Business Unit before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param builder function to build the oldCustomerGroupAssignments value
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentsSetMessageBuilder withOldCustomerGroupAssignments(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder, com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder> builder) {
        this.oldCustomerGroupAssignments = new ArrayList<>();
        this.oldCustomerGroupAssignments
                .add(builder.apply(com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Customer Groups assigned to the Business Unit before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param builder function to build the oldCustomerGroupAssignments value
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentsSetMessageBuilder addOldCustomerGroupAssignments(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder, com.commercetools.api.models.customer.CustomerGroupAssignment> builder) {
        return plusOldCustomerGroupAssignments(
            builder.apply(com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder.of()));
    }

    /**
     *  <p>Customer Groups assigned to the Business Unit before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @param builder function to build the oldCustomerGroupAssignments value
     * @return Builder
     */

    public BusinessUnitCustomerGroupAssignmentsSetMessageBuilder setOldCustomerGroupAssignments(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder, com.commercetools.api.models.customer.CustomerGroupAssignment> builder) {
        return oldCustomerGroupAssignments(
            builder.apply(com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder.of()));
    }

    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Value of <code>createdAt</code>.</p>
     * @return lastModifiedAt
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>IDs and references that last modified the Message.</p>
     * @return lastModifiedBy
     */

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>IDs and references that created the Message.</p>
     * @return createdBy
     */

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     * @return sequenceNumber
     */

    public Long getSequenceNumber() {
        return this.sequenceNumber;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the resource on which the change or action was performed.</p>
     * @return resource
     */

    public com.commercetools.api.models.common.Reference getResource() {
        return this.resource;
    }

    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     * @return resourceVersion
     */

    public Long getResourceVersion() {
        return this.resourceVersion;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @return resourceUserProvidedIdentifiers
     */

    @Nullable
    public com.commercetools.api.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers() {
        return this.resourceUserProvidedIdentifiers;
    }

    /**
     *  <p>Customer Groups assigned to the Business Unit during the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @return customerGroupAssignments
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignment> getCustomerGroupAssignments() {
        return this.customerGroupAssignments;
    }

    /**
     *  <p>Customer Groups assigned to the Business Unit before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetCustomerGroupAssignmentsAction" rel="nofollow">Set CustomerGroupAssignments</a> update action.</p>
     * @return oldCustomerGroupAssignments
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignment> getOldCustomerGroupAssignments() {
        return this.oldCustomerGroupAssignments;
    }

    /**
     * builds BusinessUnitCustomerGroupAssignmentsSetMessage with checking for non-null required values
     * @return BusinessUnitCustomerGroupAssignmentsSetMessage
     */
    public BusinessUnitCustomerGroupAssignmentsSetMessage build() {
        Objects.requireNonNull(id, BusinessUnitCustomerGroupAssignmentsSetMessage.class + ": id is missing");
        Objects.requireNonNull(version, BusinessUnitCustomerGroupAssignmentsSetMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt,
            BusinessUnitCustomerGroupAssignmentsSetMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt,
            BusinessUnitCustomerGroupAssignmentsSetMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber,
            BusinessUnitCustomerGroupAssignmentsSetMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource,
            BusinessUnitCustomerGroupAssignmentsSetMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion,
            BusinessUnitCustomerGroupAssignmentsSetMessage.class + ": resourceVersion is missing");
        return new BusinessUnitCustomerGroupAssignmentsSetMessageImpl(id, version, createdAt, lastModifiedAt,
            lastModifiedBy, createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers,
            customerGroupAssignments, oldCustomerGroupAssignments);
    }

    /**
     * builds BusinessUnitCustomerGroupAssignmentsSetMessage without checking for non-null required values
     * @return BusinessUnitCustomerGroupAssignmentsSetMessage
     */
    public BusinessUnitCustomerGroupAssignmentsSetMessage buildUnchecked() {
        return new BusinessUnitCustomerGroupAssignmentsSetMessageImpl(id, version, createdAt, lastModifiedAt,
            lastModifiedBy, createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers,
            customerGroupAssignments, oldCustomerGroupAssignments);
    }

    /**
     * factory method for an instance of BusinessUnitCustomerGroupAssignmentsSetMessageBuilder
     * @return builder
     */
    public static BusinessUnitCustomerGroupAssignmentsSetMessageBuilder of() {
        return new BusinessUnitCustomerGroupAssignmentsSetMessageBuilder();
    }

    /**
     * create builder for BusinessUnitCustomerGroupAssignmentsSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitCustomerGroupAssignmentsSetMessageBuilder of(
            final BusinessUnitCustomerGroupAssignmentsSetMessage template) {
        BusinessUnitCustomerGroupAssignmentsSetMessageBuilder builder = new BusinessUnitCustomerGroupAssignmentsSetMessageBuilder();
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
        builder.customerGroupAssignments = template.getCustomerGroupAssignments();
        builder.oldCustomerGroupAssignments = template.getOldCustomerGroupAssignments();
        return builder;
    }

}
