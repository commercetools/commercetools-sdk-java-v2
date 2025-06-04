
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomerEmailTokenCreatedMessageBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerEmailTokenCreatedMessage customerEmailTokenCreatedMessage = CustomerEmailTokenCreatedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .customerId("{customerId}")
 *             .expiresAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .invalidateOlderTokens(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerEmailTokenCreatedMessageBuilder implements Builder<CustomerEmailTokenCreatedMessage> {

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

    private String customerId;

    private java.time.ZonedDateTime expiresAt;

    @Nullable
    private String value;

    private Boolean invalidateOlderTokens;

    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     * @param id value to be set
     * @return Builder
     */

    public CustomerEmailTokenCreatedMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     * @param version value to be set
     * @return Builder
     */

    public CustomerEmailTokenCreatedMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public CustomerEmailTokenCreatedMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Value of <code>createdAt</code>.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public CustomerEmailTokenCreatedMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Message.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public CustomerEmailTokenCreatedMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Message.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public CustomerEmailTokenCreatedMessageBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Message.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public CustomerEmailTokenCreatedMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>IDs and references that created the Message.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public CustomerEmailTokenCreatedMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that created the Message.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public CustomerEmailTokenCreatedMessageBuilder withCreatedBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that created the Message.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public CustomerEmailTokenCreatedMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     * @param sequenceNumber value to be set
     * @return Builder
     */

    public CustomerEmailTokenCreatedMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @param resource value to be set
     * @return Builder
     */

    public CustomerEmailTokenCreatedMessageBuilder resource(
            final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @param builder function to build the resource value
     * @return Builder
     */

    public CustomerEmailTokenCreatedMessageBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     * @param resourceVersion value to be set
     * @return Builder
     */

    public CustomerEmailTokenCreatedMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param builder function to build the resourceUserProvidedIdentifiers value
     * @return Builder
     */

    public CustomerEmailTokenCreatedMessageBuilder resourceUserProvidedIdentifiers(
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

    public CustomerEmailTokenCreatedMessageBuilder withResourceUserProvidedIdentifiers(
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

    public CustomerEmailTokenCreatedMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    /**
     *  <p>Unique identifier of the Customer.</p>
     * @param customerId value to be set
     * @return Builder
     */

    public CustomerEmailTokenCreatedMessageBuilder customerId(final String customerId) {
        this.customerId = customerId;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the email token expires.</p>
     * @param expiresAt value to be set
     * @return Builder
     */

    public CustomerEmailTokenCreatedMessageBuilder expiresAt(final java.time.ZonedDateTime expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    /**
     *  <p>Value of the token, present only if the token's validity is 60 minutes or less.</p>
     * @param value value to be set
     * @return Builder
     */

    public CustomerEmailTokenCreatedMessageBuilder value(@Nullable final String value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>If <code>true</code>, all email tokens issued previously for the Customer are invalidated.</p>
     * @param invalidateOlderTokens value to be set
     * @return Builder
     */

    public CustomerEmailTokenCreatedMessageBuilder invalidateOlderTokens(final Boolean invalidateOlderTokens) {
        this.invalidateOlderTokens = invalidateOlderTokens;
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
     *  <p>Unique identifier of the Customer.</p>
     * @return customerId
     */

    public String getCustomerId() {
        return this.customerId;
    }

    /**
     *  <p>Date and time (UTC) the email token expires.</p>
     * @return expiresAt
     */

    public java.time.ZonedDateTime getExpiresAt() {
        return this.expiresAt;
    }

    /**
     *  <p>Value of the token, present only if the token's validity is 60 minutes or less.</p>
     * @return value
     */

    @Nullable
    public String getValue() {
        return this.value;
    }

    /**
     *  <p>If <code>true</code>, all email tokens issued previously for the Customer are invalidated.</p>
     * @return invalidateOlderTokens
     */

    public Boolean getInvalidateOlderTokens() {
        return this.invalidateOlderTokens;
    }

    /**
     * builds CustomerEmailTokenCreatedMessage with checking for non-null required values
     * @return CustomerEmailTokenCreatedMessage
     */
    public CustomerEmailTokenCreatedMessage build() {
        Objects.requireNonNull(id, CustomerEmailTokenCreatedMessage.class + ": id is missing");
        Objects.requireNonNull(version, CustomerEmailTokenCreatedMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, CustomerEmailTokenCreatedMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, CustomerEmailTokenCreatedMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber, CustomerEmailTokenCreatedMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, CustomerEmailTokenCreatedMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion,
            CustomerEmailTokenCreatedMessage.class + ": resourceVersion is missing");
        Objects.requireNonNull(customerId, CustomerEmailTokenCreatedMessage.class + ": customerId is missing");
        Objects.requireNonNull(expiresAt, CustomerEmailTokenCreatedMessage.class + ": expiresAt is missing");
        Objects.requireNonNull(invalidateOlderTokens,
            CustomerEmailTokenCreatedMessage.class + ": invalidateOlderTokens is missing");
        return new CustomerEmailTokenCreatedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, customerId,
            expiresAt, value, invalidateOlderTokens);
    }

    /**
     * builds CustomerEmailTokenCreatedMessage without checking for non-null required values
     * @return CustomerEmailTokenCreatedMessage
     */
    public CustomerEmailTokenCreatedMessage buildUnchecked() {
        return new CustomerEmailTokenCreatedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, customerId,
            expiresAt, value, invalidateOlderTokens);
    }

    /**
     * factory method for an instance of CustomerEmailTokenCreatedMessageBuilder
     * @return builder
     */
    public static CustomerEmailTokenCreatedMessageBuilder of() {
        return new CustomerEmailTokenCreatedMessageBuilder();
    }

    /**
     * create builder for CustomerEmailTokenCreatedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerEmailTokenCreatedMessageBuilder of(final CustomerEmailTokenCreatedMessage template) {
        CustomerEmailTokenCreatedMessageBuilder builder = new CustomerEmailTokenCreatedMessageBuilder();
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
        builder.customerId = template.getCustomerId();
        builder.expiresAt = template.getExpiresAt();
        builder.value = template.getValue();
        builder.invalidateOlderTokens = template.getInvalidateOlderTokens();
        return builder;
    }

}
