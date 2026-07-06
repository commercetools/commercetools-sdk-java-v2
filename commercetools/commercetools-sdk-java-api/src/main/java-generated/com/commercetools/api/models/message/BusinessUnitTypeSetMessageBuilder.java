
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitTypeSetMessageBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitTypeSetMessage businessUnitTypeSetMessage = BusinessUnitTypeSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .unitType(BusinessUnitType.COMPANY)
 *             .oldUnitType(BusinessUnitType.COMPANY)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitTypeSetMessageBuilder implements Builder<BusinessUnitTypeSetMessage> {

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
    private com.commercetools.api.models.business_unit.BusinessUnitKeyReference parentUnit;

    @Nullable
    private com.commercetools.api.models.business_unit.BusinessUnitKeyReference oldParentUnit;

    private com.commercetools.api.models.business_unit.BusinessUnitType unitType;

    private com.commercetools.api.models.business_unit.BusinessUnitType oldUnitType;

    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     * @param id value to be set
     * @return Builder
     */

    public BusinessUnitTypeSetMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     * @param version value to be set
     * @return Builder
     */

    public BusinessUnitTypeSetMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public BusinessUnitTypeSetMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Value of <code>createdAt</code>.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public BusinessUnitTypeSetMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Message.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public BusinessUnitTypeSetMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Message.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public BusinessUnitTypeSetMessageBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Message.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public BusinessUnitTypeSetMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>IDs and references that created the Message.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public BusinessUnitTypeSetMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that created the Message.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public BusinessUnitTypeSetMessageBuilder withCreatedBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that created the Message.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public BusinessUnitTypeSetMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     * @param sequenceNumber value to be set
     * @return Builder
     */

    public BusinessUnitTypeSetMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the resource on which the change or action was performed.</p>
     * @param resource value to be set
     * @return Builder
     */

    public BusinessUnitTypeSetMessageBuilder resource(final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the resource on which the change or action was performed.</p>
     * @param builder function to build the resource value
     * @return Builder
     */

    public BusinessUnitTypeSetMessageBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     * @param resourceVersion value to be set
     * @return Builder
     */

    public BusinessUnitTypeSetMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param builder function to build the resourceUserProvidedIdentifiers value
     * @return Builder
     */

    public BusinessUnitTypeSetMessageBuilder resourceUserProvidedIdentifiers(
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

    public BusinessUnitTypeSetMessageBuilder withResourceUserProvidedIdentifiers(
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

    public BusinessUnitTypeSetMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    /**
     *  <p>Parent unit of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetUnitTypeAction" rel="nofollow">Set Unit Type</a> update action.</p>
     * @param builder function to build the parentUnit value
     * @return Builder
     */

    public BusinessUnitTypeSetMessageBuilder parentUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder> builder) {
        this.parentUnit = builder.apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Parent unit of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetUnitTypeAction" rel="nofollow">Set Unit Type</a> update action.</p>
     * @param builder function to build the parentUnit value
     * @return Builder
     */

    public BusinessUnitTypeSetMessageBuilder withParentUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReference> builder) {
        this.parentUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Parent unit of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetUnitTypeAction" rel="nofollow">Set Unit Type</a> update action.</p>
     * @param parentUnit value to be set
     * @return Builder
     */

    public BusinessUnitTypeSetMessageBuilder parentUnit(
            @Nullable final com.commercetools.api.models.business_unit.BusinessUnitKeyReference parentUnit) {
        this.parentUnit = parentUnit;
        return this;
    }

    /**
     *  <p>Parent unit of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetUnitTypeAction" rel="nofollow">Set Unit Type</a> update action.</p>
     * @param builder function to build the oldParentUnit value
     * @return Builder
     */

    public BusinessUnitTypeSetMessageBuilder oldParentUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder> builder) {
        this.oldParentUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Parent unit of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetUnitTypeAction" rel="nofollow">Set Unit Type</a> update action.</p>
     * @param builder function to build the oldParentUnit value
     * @return Builder
     */

    public BusinessUnitTypeSetMessageBuilder withOldParentUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReference> builder) {
        this.oldParentUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Parent unit of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetUnitTypeAction" rel="nofollow">Set Unit Type</a> update action.</p>
     * @param oldParentUnit value to be set
     * @return Builder
     */

    public BusinessUnitTypeSetMessageBuilder oldParentUnit(
            @Nullable final com.commercetools.api.models.business_unit.BusinessUnitKeyReference oldParentUnit) {
        this.oldParentUnit = oldParentUnit;
        return this;
    }

    /**
     *  <p>Type of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetUnitTypeAction" rel="nofollow">Set Unit Type</a> update action.</p>
     * @param unitType value to be set
     * @return Builder
     */

    public BusinessUnitTypeSetMessageBuilder unitType(
            final com.commercetools.api.models.business_unit.BusinessUnitType unitType) {
        this.unitType = unitType;
        return this;
    }

    /**
     *  <p>Type of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetUnitTypeAction" rel="nofollow">Set Unit Type</a> update action.</p>
     * @param oldUnitType value to be set
     * @return Builder
     */

    public BusinessUnitTypeSetMessageBuilder oldUnitType(
            final com.commercetools.api.models.business_unit.BusinessUnitType oldUnitType) {
        this.oldUnitType = oldUnitType;
        return this;
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
     *  <p>Parent unit of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetUnitTypeAction" rel="nofollow">Set Unit Type</a> update action.</p>
     * @return parentUnit
     */

    @Nullable
    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getParentUnit() {
        return this.parentUnit;
    }

    /**
     *  <p>Parent unit of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetUnitTypeAction" rel="nofollow">Set Unit Type</a> update action.</p>
     * @return oldParentUnit
     */

    @Nullable
    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getOldParentUnit() {
        return this.oldParentUnit;
    }

    /**
     *  <p>Type of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetUnitTypeAction" rel="nofollow">Set Unit Type</a> update action.</p>
     * @return unitType
     */

    public com.commercetools.api.models.business_unit.BusinessUnitType getUnitType() {
        return this.unitType;
    }

    /**
     *  <p>Type of the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Unit</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetUnitTypeAction" rel="nofollow">Set Unit Type</a> update action.</p>
     * @return oldUnitType
     */

    public com.commercetools.api.models.business_unit.BusinessUnitType getOldUnitType() {
        return this.oldUnitType;
    }

    /**
     * builds BusinessUnitTypeSetMessage with checking for non-null required values
     * @return BusinessUnitTypeSetMessage
     */
    public BusinessUnitTypeSetMessage build() {
        Objects.requireNonNull(id, BusinessUnitTypeSetMessage.class + ": id is missing");
        Objects.requireNonNull(version, BusinessUnitTypeSetMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, BusinessUnitTypeSetMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, BusinessUnitTypeSetMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber, BusinessUnitTypeSetMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, BusinessUnitTypeSetMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion, BusinessUnitTypeSetMessage.class + ": resourceVersion is missing");
        Objects.requireNonNull(unitType, BusinessUnitTypeSetMessage.class + ": unitType is missing");
        Objects.requireNonNull(oldUnitType, BusinessUnitTypeSetMessage.class + ": oldUnitType is missing");
        return new BusinessUnitTypeSetMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, parentUnit, oldParentUnit,
            unitType, oldUnitType);
    }

    /**
     * builds BusinessUnitTypeSetMessage without checking for non-null required values
     * @return BusinessUnitTypeSetMessage
     */
    public BusinessUnitTypeSetMessage buildUnchecked() {
        return new BusinessUnitTypeSetMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, parentUnit, oldParentUnit,
            unitType, oldUnitType);
    }

    /**
     * factory method for an instance of BusinessUnitTypeSetMessageBuilder
     * @return builder
     */
    public static BusinessUnitTypeSetMessageBuilder of() {
        return new BusinessUnitTypeSetMessageBuilder();
    }

    /**
     * create builder for BusinessUnitTypeSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitTypeSetMessageBuilder of(final BusinessUnitTypeSetMessage template) {
        BusinessUnitTypeSetMessageBuilder builder = new BusinessUnitTypeSetMessageBuilder();
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
        builder.parentUnit = template.getParentUnit();
        builder.oldParentUnit = template.getOldParentUnit();
        builder.unitType = template.getUnitType();
        builder.oldUnitType = template.getOldUnitType();
        return builder;
    }

}
