
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceValueChangedMessageBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceValueChangedMessage standalonePriceValueChangedMessage = StandalonePriceValueChangedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .value(valueBuilder -> valueBuilder)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceValueChangedMessageBuilder implements Builder<StandalonePriceValueChangedMessage> {

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

    private com.commercetools.api.models.common.Money value;

    private Boolean staged;

    @Nullable
    private com.commercetools.api.models.common.Money oldValue;

    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     * @param id
     * @return Builder
     */

    public StandalonePriceValueChangedMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     * @param version
     * @return Builder
     */

    public StandalonePriceValueChangedMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     * @param createdAt
     * @return Builder
     */

    public StandalonePriceValueChangedMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Value of <code>createdAt</code>.</p>
     * @param lastModifiedAt
     * @return Builder
     */

    public StandalonePriceValueChangedMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Value of <code>createdBy</code>.</p>
     * @return Builder
     */

    public StandalonePriceValueChangedMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value of <code>createdBy</code>.</p>
     * @param lastModifiedBy
     * @return Builder
     */

    public StandalonePriceValueChangedMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return Builder
     */

    public StandalonePriceValueChangedMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param createdBy
     * @return Builder
     */

    public StandalonePriceValueChangedMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     * @param sequenceNumber
     * @return Builder
     */

    public StandalonePriceValueChangedMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @param resource
     * @return Builder
     */

    public StandalonePriceValueChangedMessageBuilder resource(
            final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @return Builder
     */

    public StandalonePriceValueChangedMessageBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     * @param resourceVersion
     * @return Builder
     */

    public StandalonePriceValueChangedMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @return Builder
     */

    public StandalonePriceValueChangedMessageBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param resourceUserProvidedIdentifiers
     * @return Builder
     */

    public StandalonePriceValueChangedMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    /**
     *  <p>The new value of the updated StandalonePrice.</p>
     * @return Builder
     */

    public StandalonePriceValueChangedMessageBuilder value(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.value = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The new value of the updated StandalonePrice.</p>
     * @param value
     * @return Builder
     */

    public StandalonePriceValueChangedMessageBuilder value(final com.commercetools.api.models.common.Money value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Whether the new value was applied to the current or the staged representation of the StandalonePrice. Staged changes are stored on the StagedStandalonePrice.</p>
     * @param staged
     * @return Builder
     */

    public StandalonePriceValueChangedMessageBuilder staged(final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>The old value of the updated StandalonePrice. Present on Messages created after 3 February 2023. Optional for backwards compatibility.</p>
     * @return Builder
     */

    public StandalonePriceValueChangedMessageBuilder oldValue(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.oldValue = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The old value of the updated StandalonePrice. Present on Messages created after 3 February 2023. Optional for backwards compatibility.</p>
     * @param oldValue
     * @return Builder
     */

    public StandalonePriceValueChangedMessageBuilder oldValue(
            @Nullable final com.commercetools.api.models.common.Money oldValue) {
        this.oldValue = oldValue;
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

    public Long getSequenceNumber() {
        return this.sequenceNumber;
    }

    public com.commercetools.api.models.common.Reference getResource() {
        return this.resource;
    }

    public Long getResourceVersion() {
        return this.resourceVersion;
    }

    @Nullable
    public com.commercetools.api.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers() {
        return this.resourceUserProvidedIdentifiers;
    }

    public com.commercetools.api.models.common.Money getValue() {
        return this.value;
    }

    public Boolean getStaged() {
        return this.staged;
    }

    @Nullable
    public com.commercetools.api.models.common.Money getOldValue() {
        return this.oldValue;
    }

    public StandalonePriceValueChangedMessage build() {
        Objects.requireNonNull(id, StandalonePriceValueChangedMessage.class + ": id is missing");
        Objects.requireNonNull(version, StandalonePriceValueChangedMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, StandalonePriceValueChangedMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt,
            StandalonePriceValueChangedMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber,
            StandalonePriceValueChangedMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, StandalonePriceValueChangedMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion,
            StandalonePriceValueChangedMessage.class + ": resourceVersion is missing");
        Objects.requireNonNull(value, StandalonePriceValueChangedMessage.class + ": value is missing");
        Objects.requireNonNull(staged, StandalonePriceValueChangedMessage.class + ": staged is missing");
        return new StandalonePriceValueChangedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, value, staged,
            oldValue);
    }

    /**
     * builds StandalonePriceValueChangedMessage without checking for non null required values
     */
    public StandalonePriceValueChangedMessage buildUnchecked() {
        return new StandalonePriceValueChangedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, value, staged,
            oldValue);
    }

    public static StandalonePriceValueChangedMessageBuilder of() {
        return new StandalonePriceValueChangedMessageBuilder();
    }

    public static StandalonePriceValueChangedMessageBuilder of(final StandalonePriceValueChangedMessage template) {
        StandalonePriceValueChangedMessageBuilder builder = new StandalonePriceValueChangedMessageBuilder();
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
        builder.value = template.getValue();
        builder.staged = template.getStaged();
        builder.oldValue = template.getOldValue();
        return builder;
    }

}
