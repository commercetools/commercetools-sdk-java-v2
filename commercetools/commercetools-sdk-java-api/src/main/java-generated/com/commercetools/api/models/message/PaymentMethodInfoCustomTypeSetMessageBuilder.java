
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentMethodInfoCustomTypeSetMessageBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodInfoCustomTypeSetMessage paymentMethodInfoCustomTypeSetMessage = PaymentMethodInfoCustomTypeSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .customFields(customFieldsBuilder -> customFieldsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodInfoCustomTypeSetMessageBuilder implements Builder<PaymentMethodInfoCustomTypeSetMessage> {

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

    private com.commercetools.api.models.type.CustomFields customFields;

    @Nullable
    private String oldTypeId;

    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     * @param id value to be set
     * @return Builder
     */

    public PaymentMethodInfoCustomTypeSetMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     * @param version value to be set
     * @return Builder
     */

    public PaymentMethodInfoCustomTypeSetMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public PaymentMethodInfoCustomTypeSetMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Value of <code>createdAt</code>.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public PaymentMethodInfoCustomTypeSetMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Message.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public PaymentMethodInfoCustomTypeSetMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Message.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public PaymentMethodInfoCustomTypeSetMessageBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Message.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public PaymentMethodInfoCustomTypeSetMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>IDs and references that created the Message.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public PaymentMethodInfoCustomTypeSetMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that created the Message.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public PaymentMethodInfoCustomTypeSetMessageBuilder withCreatedBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that created the Message.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public PaymentMethodInfoCustomTypeSetMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     * @param sequenceNumber value to be set
     * @return Builder
     */

    public PaymentMethodInfoCustomTypeSetMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @param resource value to be set
     * @return Builder
     */

    public PaymentMethodInfoCustomTypeSetMessageBuilder resource(
            final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @param builder function to build the resource value
     * @return Builder
     */

    public PaymentMethodInfoCustomTypeSetMessageBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     * @param resourceVersion value to be set
     * @return Builder
     */

    public PaymentMethodInfoCustomTypeSetMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param builder function to build the resourceUserProvidedIdentifiers value
     * @return Builder
     */

    public PaymentMethodInfoCustomTypeSetMessageBuilder resourceUserProvidedIdentifiers(
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

    public PaymentMethodInfoCustomTypeSetMessageBuilder withResourceUserProvidedIdentifiers(
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

    public PaymentMethodInfoCustomTypeSetMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    /**
     *  <p>The Custom Fields that were set.</p>
     * @param builder function to build the customFields value
     * @return Builder
     */

    public PaymentMethodInfoCustomTypeSetMessageBuilder customFields(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.customFields = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Custom Fields that were set.</p>
     * @param builder function to build the customFields value
     * @return Builder
     */

    public PaymentMethodInfoCustomTypeSetMessageBuilder withCustomFields(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFields> builder) {
        this.customFields = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>The Custom Fields that were set.</p>
     * @param customFields value to be set
     * @return Builder
     */

    public PaymentMethodInfoCustomTypeSetMessageBuilder customFields(
            final com.commercetools.api.models.type.CustomFields customFields) {
        this.customFields = customFields;
        return this;
    }

    /**
     *  <p><code>id</code> of the previous Type. Absent if there was no previous Custom Type present.</p>
     * @param oldTypeId value to be set
     * @return Builder
     */

    public PaymentMethodInfoCustomTypeSetMessageBuilder oldTypeId(@Nullable final String oldTypeId) {
        this.oldTypeId = oldTypeId;
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
     *  <p>The Custom Fields that were set.</p>
     * @return customFields
     */

    public com.commercetools.api.models.type.CustomFields getCustomFields() {
        return this.customFields;
    }

    /**
     *  <p><code>id</code> of the previous Type. Absent if there was no previous Custom Type present.</p>
     * @return oldTypeId
     */

    @Nullable
    public String getOldTypeId() {
        return this.oldTypeId;
    }

    /**
     * builds PaymentMethodInfoCustomTypeSetMessage with checking for non-null required values
     * @return PaymentMethodInfoCustomTypeSetMessage
     */
    public PaymentMethodInfoCustomTypeSetMessage build() {
        Objects.requireNonNull(id, PaymentMethodInfoCustomTypeSetMessage.class + ": id is missing");
        Objects.requireNonNull(version, PaymentMethodInfoCustomTypeSetMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, PaymentMethodInfoCustomTypeSetMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt,
            PaymentMethodInfoCustomTypeSetMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber,
            PaymentMethodInfoCustomTypeSetMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, PaymentMethodInfoCustomTypeSetMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion,
            PaymentMethodInfoCustomTypeSetMessage.class + ": resourceVersion is missing");
        Objects.requireNonNull(customFields, PaymentMethodInfoCustomTypeSetMessage.class + ": customFields is missing");
        return new PaymentMethodInfoCustomTypeSetMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, customFields,
            oldTypeId);
    }

    /**
     * builds PaymentMethodInfoCustomTypeSetMessage without checking for non-null required values
     * @return PaymentMethodInfoCustomTypeSetMessage
     */
    public PaymentMethodInfoCustomTypeSetMessage buildUnchecked() {
        return new PaymentMethodInfoCustomTypeSetMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, customFields,
            oldTypeId);
    }

    /**
     * factory method for an instance of PaymentMethodInfoCustomTypeSetMessageBuilder
     * @return builder
     */
    public static PaymentMethodInfoCustomTypeSetMessageBuilder of() {
        return new PaymentMethodInfoCustomTypeSetMessageBuilder();
    }

    /**
     * create builder for PaymentMethodInfoCustomTypeSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodInfoCustomTypeSetMessageBuilder of(
            final PaymentMethodInfoCustomTypeSetMessage template) {
        PaymentMethodInfoCustomTypeSetMessageBuilder builder = new PaymentMethodInfoCustomTypeSetMessageBuilder();
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
        builder.customFields = template.getCustomFields();
        builder.oldTypeId = template.getOldTypeId();
        return builder;
    }

}
