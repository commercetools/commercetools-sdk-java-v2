
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceValidFromAndUntilSetMessageBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceValidFromAndUntilSetMessage standalonePriceValidFromAndUntilSetMessage = StandalonePriceValidFromAndUntilSetMessage.builder()
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
public class StandalonePriceValidFromAndUntilSetMessageBuilder
        implements Builder<StandalonePriceValidFromAndUntilSetMessage> {

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
    private java.time.ZonedDateTime validFrom;

    @Nullable
    private java.time.ZonedDateTime previousValidFrom;

    @Nullable
    private java.time.ZonedDateTime validUntil;

    @Nullable
    private java.time.ZonedDateTime previousValidUntil;

    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     * @param id value to be set
     * @return Builder
     */

    public StandalonePriceValidFromAndUntilSetMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     * @param version value to be set
     * @return Builder
     */

    public StandalonePriceValidFromAndUntilSetMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public StandalonePriceValidFromAndUntilSetMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Value of <code>createdAt</code>.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public StandalonePriceValidFromAndUntilSetMessageBuilder lastModifiedAt(
            final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Message.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public StandalonePriceValidFromAndUntilSetMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Message.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public StandalonePriceValidFromAndUntilSetMessageBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Message.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public StandalonePriceValidFromAndUntilSetMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>IDs and references that created the Message.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public StandalonePriceValidFromAndUntilSetMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that created the Message.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public StandalonePriceValidFromAndUntilSetMessageBuilder withCreatedBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that created the Message.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public StandalonePriceValidFromAndUntilSetMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     * @param sequenceNumber value to be set
     * @return Builder
     */

    public StandalonePriceValidFromAndUntilSetMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the resource on which the change or action was performed.</p>
     * @param resource value to be set
     * @return Builder
     */

    public StandalonePriceValidFromAndUntilSetMessageBuilder resource(
            final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the resource on which the change or action was performed.</p>
     * @param builder function to build the resource value
     * @return Builder
     */

    public StandalonePriceValidFromAndUntilSetMessageBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     * @param resourceVersion value to be set
     * @return Builder
     */

    public StandalonePriceValidFromAndUntilSetMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param builder function to build the resourceUserProvidedIdentifiers value
     * @return Builder
     */

    public StandalonePriceValidFromAndUntilSetMessageBuilder resourceUserProvidedIdentifiers(
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

    public StandalonePriceValidFromAndUntilSetMessageBuilder withResourceUserProvidedIdentifiers(
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

    public StandalonePriceValidFromAndUntilSetMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    /**
     *  <p>Value of <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> <code>validFrom</code> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceSetValidFromAndUntilAction" rel="nofollow">Set Valid From and Until</a> update action.</p>
     * @param validFrom value to be set
     * @return Builder
     */

    public StandalonePriceValidFromAndUntilSetMessageBuilder validFrom(
            @Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     *  <p>Value of <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> <code>validFrom</code> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceSetValidFromAndUntilAction" rel="nofollow">Set Valid From and Until</a> update action.</p>
     * @param previousValidFrom value to be set
     * @return Builder
     */

    public StandalonePriceValidFromAndUntilSetMessageBuilder previousValidFrom(
            @Nullable final java.time.ZonedDateTime previousValidFrom) {
        this.previousValidFrom = previousValidFrom;
        return this;
    }

    /**
     *  <p>Value of <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> <code>validUntil</code> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceSetValidFromAndUntilAction" rel="nofollow">Set Valid From and Until</a> update action.</p>
     * @param validUntil value to be set
     * @return Builder
     */

    public StandalonePriceValidFromAndUntilSetMessageBuilder validUntil(
            @Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     *  <p>Value of <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> <code>validUntil</code> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceSetValidFromAndUntilAction" rel="nofollow">Set Valid From and Until</a> update action.</p>
     * @param previousValidUntil value to be set
     * @return Builder
     */

    public StandalonePriceValidFromAndUntilSetMessageBuilder previousValidUntil(
            @Nullable final java.time.ZonedDateTime previousValidUntil) {
        this.previousValidUntil = previousValidUntil;
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
     *  <p>Value of <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> <code>validFrom</code> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceSetValidFromAndUntilAction" rel="nofollow">Set Valid From and Until</a> update action.</p>
     * @return validFrom
     */

    @Nullable
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    /**
     *  <p>Value of <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> <code>validFrom</code> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceSetValidFromAndUntilAction" rel="nofollow">Set Valid From and Until</a> update action.</p>
     * @return previousValidFrom
     */

    @Nullable
    public java.time.ZonedDateTime getPreviousValidFrom() {
        return this.previousValidFrom;
    }

    /**
     *  <p>Value of <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> <code>validUntil</code> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceSetValidFromAndUntilAction" rel="nofollow">Set Valid From and Until</a> update action.</p>
     * @return validUntil
     */

    @Nullable
    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    /**
     *  <p>Value of <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePrice" rel="nofollow">StandalonePrice</a> <code>validUntil</code> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:StandalonePriceSetValidFromAndUntilAction" rel="nofollow">Set Valid From and Until</a> update action.</p>
     * @return previousValidUntil
     */

    @Nullable
    public java.time.ZonedDateTime getPreviousValidUntil() {
        return this.previousValidUntil;
    }

    /**
     * builds StandalonePriceValidFromAndUntilSetMessage with checking for non-null required values
     * @return StandalonePriceValidFromAndUntilSetMessage
     */
    public StandalonePriceValidFromAndUntilSetMessage build() {
        Objects.requireNonNull(id, StandalonePriceValidFromAndUntilSetMessage.class + ": id is missing");
        Objects.requireNonNull(version, StandalonePriceValidFromAndUntilSetMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, StandalonePriceValidFromAndUntilSetMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt,
            StandalonePriceValidFromAndUntilSetMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber,
            StandalonePriceValidFromAndUntilSetMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, StandalonePriceValidFromAndUntilSetMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion,
            StandalonePriceValidFromAndUntilSetMessage.class + ": resourceVersion is missing");
        return new StandalonePriceValidFromAndUntilSetMessageImpl(id, version, createdAt, lastModifiedAt,
            lastModifiedBy, createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers,
            validFrom, previousValidFrom, validUntil, previousValidUntil);
    }

    /**
     * builds StandalonePriceValidFromAndUntilSetMessage without checking for non-null required values
     * @return StandalonePriceValidFromAndUntilSetMessage
     */
    public StandalonePriceValidFromAndUntilSetMessage buildUnchecked() {
        return new StandalonePriceValidFromAndUntilSetMessageImpl(id, version, createdAt, lastModifiedAt,
            lastModifiedBy, createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers,
            validFrom, previousValidFrom, validUntil, previousValidUntil);
    }

    /**
     * factory method for an instance of StandalonePriceValidFromAndUntilSetMessageBuilder
     * @return builder
     */
    public static StandalonePriceValidFromAndUntilSetMessageBuilder of() {
        return new StandalonePriceValidFromAndUntilSetMessageBuilder();
    }

    /**
     * create builder for StandalonePriceValidFromAndUntilSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceValidFromAndUntilSetMessageBuilder of(
            final StandalonePriceValidFromAndUntilSetMessage template) {
        StandalonePriceValidFromAndUntilSetMessageBuilder builder = new StandalonePriceValidFromAndUntilSetMessageBuilder();
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
        builder.validFrom = template.getValidFrom();
        builder.previousValidFrom = template.getPreviousValidFrom();
        builder.validUntil = template.getValidUntil();
        builder.previousValidUntil = template.getPreviousValidUntil();
        return builder;
    }

}
