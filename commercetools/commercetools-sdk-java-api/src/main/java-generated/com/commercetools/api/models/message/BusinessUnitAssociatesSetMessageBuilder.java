
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitAssociatesSetMessageBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAssociatesSetMessage businessUnitAssociatesSetMessage = BusinessUnitAssociatesSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .plusAssociates(associatesBuilder -> associatesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitAssociatesSetMessageBuilder implements Builder<BusinessUnitAssociatesSetMessage> {

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

    private java.util.List<com.commercetools.api.models.business_unit.Associate> associates;

    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     * @param id value to be set
     * @return Builder
     */

    public BusinessUnitAssociatesSetMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     * @param version value to be set
     * @return Builder
     */

    public BusinessUnitAssociatesSetMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public BusinessUnitAssociatesSetMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Value of <code>createdAt</code>.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public BusinessUnitAssociatesSetMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Message.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public BusinessUnitAssociatesSetMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Message.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public BusinessUnitAssociatesSetMessageBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Message.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public BusinessUnitAssociatesSetMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>IDs and references that created the Message.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public BusinessUnitAssociatesSetMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that created the Message.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public BusinessUnitAssociatesSetMessageBuilder withCreatedBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that created the Message.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public BusinessUnitAssociatesSetMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     * @param sequenceNumber value to be set
     * @return Builder
     */

    public BusinessUnitAssociatesSetMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @param resource value to be set
     * @return Builder
     */

    public BusinessUnitAssociatesSetMessageBuilder resource(
            final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @param builder function to build the resource value
     * @return Builder
     */

    public BusinessUnitAssociatesSetMessageBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     * @param resourceVersion value to be set
     * @return Builder
     */

    public BusinessUnitAssociatesSetMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param builder function to build the resourceUserProvidedIdentifiers value
     * @return Builder
     */

    public BusinessUnitAssociatesSetMessageBuilder resourceUserProvidedIdentifiers(
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

    public BusinessUnitAssociatesSetMessageBuilder withResourceUserProvidedIdentifiers(
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

    public BusinessUnitAssociatesSetMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    /**
     *  <p>The list of Associates that was updated on the Business Unit.</p>
     * @param associates value to be set
     * @return Builder
     */

    public BusinessUnitAssociatesSetMessageBuilder associates(
            final com.commercetools.api.models.business_unit.Associate... associates) {
        this.associates = new ArrayList<>(Arrays.asList(associates));
        return this;
    }

    /**
     *  <p>The list of Associates that was updated on the Business Unit.</p>
     * @param associates value to be set
     * @return Builder
     */

    public BusinessUnitAssociatesSetMessageBuilder associates(
            final java.util.List<com.commercetools.api.models.business_unit.Associate> associates) {
        this.associates = associates;
        return this;
    }

    /**
     *  <p>The list of Associates that was updated on the Business Unit.</p>
     * @param associates value to be set
     * @return Builder
     */

    public BusinessUnitAssociatesSetMessageBuilder plusAssociates(
            final com.commercetools.api.models.business_unit.Associate... associates) {
        if (this.associates == null) {
            this.associates = new ArrayList<>();
        }
        this.associates.addAll(Arrays.asList(associates));
        return this;
    }

    /**
     *  <p>The list of Associates that was updated on the Business Unit.</p>
     * @param builder function to build the associates value
     * @return Builder
     */

    public BusinessUnitAssociatesSetMessageBuilder plusAssociates(
            Function<com.commercetools.api.models.business_unit.AssociateBuilder, com.commercetools.api.models.business_unit.AssociateBuilder> builder) {
        if (this.associates == null) {
            this.associates = new ArrayList<>();
        }
        this.associates.add(builder.apply(com.commercetools.api.models.business_unit.AssociateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The list of Associates that was updated on the Business Unit.</p>
     * @param builder function to build the associates value
     * @return Builder
     */

    public BusinessUnitAssociatesSetMessageBuilder withAssociates(
            Function<com.commercetools.api.models.business_unit.AssociateBuilder, com.commercetools.api.models.business_unit.AssociateBuilder> builder) {
        this.associates = new ArrayList<>();
        this.associates.add(builder.apply(com.commercetools.api.models.business_unit.AssociateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The list of Associates that was updated on the Business Unit.</p>
     * @param builder function to build the associates value
     * @return Builder
     */

    public BusinessUnitAssociatesSetMessageBuilder addAssociates(
            Function<com.commercetools.api.models.business_unit.AssociateBuilder, com.commercetools.api.models.business_unit.Associate> builder) {
        return plusAssociates(builder.apply(com.commercetools.api.models.business_unit.AssociateBuilder.of()));
    }

    /**
     *  <p>The list of Associates that was updated on the Business Unit.</p>
     * @param builder function to build the associates value
     * @return Builder
     */

    public BusinessUnitAssociatesSetMessageBuilder setAssociates(
            Function<com.commercetools.api.models.business_unit.AssociateBuilder, com.commercetools.api.models.business_unit.Associate> builder) {
        return associates(builder.apply(com.commercetools.api.models.business_unit.AssociateBuilder.of()));
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
     *  <p>Reference to the resource on which the change or action was performed.</p>
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
     *  <p>The list of Associates that was updated on the Business Unit.</p>
     * @return associates
     */

    public java.util.List<com.commercetools.api.models.business_unit.Associate> getAssociates() {
        return this.associates;
    }

    /**
     * builds BusinessUnitAssociatesSetMessage with checking for non-null required values
     * @return BusinessUnitAssociatesSetMessage
     */
    public BusinessUnitAssociatesSetMessage build() {
        Objects.requireNonNull(id, BusinessUnitAssociatesSetMessage.class + ": id is missing");
        Objects.requireNonNull(version, BusinessUnitAssociatesSetMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, BusinessUnitAssociatesSetMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, BusinessUnitAssociatesSetMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber, BusinessUnitAssociatesSetMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, BusinessUnitAssociatesSetMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion,
            BusinessUnitAssociatesSetMessage.class + ": resourceVersion is missing");
        Objects.requireNonNull(associates, BusinessUnitAssociatesSetMessage.class + ": associates is missing");
        return new BusinessUnitAssociatesSetMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, associates);
    }

    /**
     * builds BusinessUnitAssociatesSetMessage without checking for non-null required values
     * @return BusinessUnitAssociatesSetMessage
     */
    public BusinessUnitAssociatesSetMessage buildUnchecked() {
        return new BusinessUnitAssociatesSetMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, associates);
    }

    /**
     * factory method for an instance of BusinessUnitAssociatesSetMessageBuilder
     * @return builder
     */
    public static BusinessUnitAssociatesSetMessageBuilder of() {
        return new BusinessUnitAssociatesSetMessageBuilder();
    }

    /**
     * create builder for BusinessUnitAssociatesSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitAssociatesSetMessageBuilder of(final BusinessUnitAssociatesSetMessage template) {
        BusinessUnitAssociatesSetMessageBuilder builder = new BusinessUnitAssociatesSetMessageBuilder();
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
        builder.associates = template.getAssociates();
        return builder;
    }

}
