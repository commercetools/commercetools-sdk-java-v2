
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceTiersSetMessageBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceTiersSetMessage standalonePriceTiersSetMessage = StandalonePriceTiersSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .plusTiers(tiersBuilder -> tiersBuilder)
 *             .plusPreviousTiers(previousTiersBuilder -> previousTiersBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StandalonePriceTiersSetMessageBuilder implements Builder<StandalonePriceTiersSetMessage> {

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

    private java.util.List<com.commercetools.api.models.common.PriceTier> tiers;

    private java.util.List<com.commercetools.api.models.common.PriceTier> previousTiers;

    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     * @param id value to be set
     * @return Builder
     */

    public StandalonePriceTiersSetMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     * @param version value to be set
     * @return Builder
     */

    public StandalonePriceTiersSetMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public StandalonePriceTiersSetMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Value of <code>createdAt</code>.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public StandalonePriceTiersSetMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Message.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public StandalonePriceTiersSetMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Message.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public StandalonePriceTiersSetMessageBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Message.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public StandalonePriceTiersSetMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>IDs and references that created the Message.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public StandalonePriceTiersSetMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that created the Message.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public StandalonePriceTiersSetMessageBuilder withCreatedBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that created the Message.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public StandalonePriceTiersSetMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     * @param sequenceNumber value to be set
     * @return Builder
     */

    public StandalonePriceTiersSetMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @param resource value to be set
     * @return Builder
     */

    public StandalonePriceTiersSetMessageBuilder resource(
            final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @param builder function to build the resource value
     * @return Builder
     */

    public StandalonePriceTiersSetMessageBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     * @param resourceVersion value to be set
     * @return Builder
     */

    public StandalonePriceTiersSetMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param builder function to build the resourceUserProvidedIdentifiers value
     * @return Builder
     */

    public StandalonePriceTiersSetMessageBuilder resourceUserProvidedIdentifiers(
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

    public StandalonePriceTiersSetMessageBuilder withResourceUserProvidedIdentifiers(
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

    public StandalonePriceTiersSetMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    /**
     *  <p>The updated content of the field <code>tiers</code> of the affected StandalonePrice.</p>
     * @param tiers value to be set
     * @return Builder
     */

    public StandalonePriceTiersSetMessageBuilder tiers(final com.commercetools.api.models.common.PriceTier... tiers) {
        this.tiers = new ArrayList<>(Arrays.asList(tiers));
        return this;
    }

    /**
     *  <p>The updated content of the field <code>tiers</code> of the affected StandalonePrice.</p>
     * @param tiers value to be set
     * @return Builder
     */

    public StandalonePriceTiersSetMessageBuilder tiers(
            final java.util.List<com.commercetools.api.models.common.PriceTier> tiers) {
        this.tiers = tiers;
        return this;
    }

    /**
     *  <p>The updated content of the field <code>tiers</code> of the affected StandalonePrice.</p>
     * @param tiers value to be set
     * @return Builder
     */

    public StandalonePriceTiersSetMessageBuilder plusTiers(
            final com.commercetools.api.models.common.PriceTier... tiers) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers.addAll(Arrays.asList(tiers));
        return this;
    }

    /**
     *  <p>The updated content of the field <code>tiers</code> of the affected StandalonePrice.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */

    public StandalonePriceTiersSetMessageBuilder plusTiers(
            Function<com.commercetools.api.models.common.PriceTierBuilder, com.commercetools.api.models.common.PriceTierBuilder> builder) {
        if (this.tiers == null) {
            this.tiers = new ArrayList<>();
        }
        this.tiers.add(builder.apply(com.commercetools.api.models.common.PriceTierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The updated content of the field <code>tiers</code> of the affected StandalonePrice.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */

    public StandalonePriceTiersSetMessageBuilder withTiers(
            Function<com.commercetools.api.models.common.PriceTierBuilder, com.commercetools.api.models.common.PriceTierBuilder> builder) {
        this.tiers = new ArrayList<>();
        this.tiers.add(builder.apply(com.commercetools.api.models.common.PriceTierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The updated content of the field <code>tiers</code> of the affected StandalonePrice.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */

    public StandalonePriceTiersSetMessageBuilder addTiers(
            Function<com.commercetools.api.models.common.PriceTierBuilder, com.commercetools.api.models.common.PriceTier> builder) {
        return plusTiers(builder.apply(com.commercetools.api.models.common.PriceTierBuilder.of()));
    }

    /**
     *  <p>The updated content of the field <code>tiers</code> of the affected StandalonePrice.</p>
     * @param builder function to build the tiers value
     * @return Builder
     */

    public StandalonePriceTiersSetMessageBuilder setTiers(
            Function<com.commercetools.api.models.common.PriceTierBuilder, com.commercetools.api.models.common.PriceTier> builder) {
        return tiers(builder.apply(com.commercetools.api.models.common.PriceTierBuilder.of()));
    }

    /**
     *  <p>The previous content of the field <code>tiers</code> of the affected StandalonePrice.</p>
     * @param previousTiers value to be set
     * @return Builder
     */

    public StandalonePriceTiersSetMessageBuilder previousTiers(
            final com.commercetools.api.models.common.PriceTier... previousTiers) {
        this.previousTiers = new ArrayList<>(Arrays.asList(previousTiers));
        return this;
    }

    /**
     *  <p>The previous content of the field <code>tiers</code> of the affected StandalonePrice.</p>
     * @param previousTiers value to be set
     * @return Builder
     */

    public StandalonePriceTiersSetMessageBuilder previousTiers(
            final java.util.List<com.commercetools.api.models.common.PriceTier> previousTiers) {
        this.previousTiers = previousTiers;
        return this;
    }

    /**
     *  <p>The previous content of the field <code>tiers</code> of the affected StandalonePrice.</p>
     * @param previousTiers value to be set
     * @return Builder
     */

    public StandalonePriceTiersSetMessageBuilder plusPreviousTiers(
            final com.commercetools.api.models.common.PriceTier... previousTiers) {
        if (this.previousTiers == null) {
            this.previousTiers = new ArrayList<>();
        }
        this.previousTiers.addAll(Arrays.asList(previousTiers));
        return this;
    }

    /**
     *  <p>The previous content of the field <code>tiers</code> of the affected StandalonePrice.</p>
     * @param builder function to build the previousTiers value
     * @return Builder
     */

    public StandalonePriceTiersSetMessageBuilder plusPreviousTiers(
            Function<com.commercetools.api.models.common.PriceTierBuilder, com.commercetools.api.models.common.PriceTierBuilder> builder) {
        if (this.previousTiers == null) {
            this.previousTiers = new ArrayList<>();
        }
        this.previousTiers.add(builder.apply(com.commercetools.api.models.common.PriceTierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The previous content of the field <code>tiers</code> of the affected StandalonePrice.</p>
     * @param builder function to build the previousTiers value
     * @return Builder
     */

    public StandalonePriceTiersSetMessageBuilder withPreviousTiers(
            Function<com.commercetools.api.models.common.PriceTierBuilder, com.commercetools.api.models.common.PriceTierBuilder> builder) {
        this.previousTiers = new ArrayList<>();
        this.previousTiers.add(builder.apply(com.commercetools.api.models.common.PriceTierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The previous content of the field <code>tiers</code> of the affected StandalonePrice.</p>
     * @param builder function to build the previousTiers value
     * @return Builder
     */

    public StandalonePriceTiersSetMessageBuilder addPreviousTiers(
            Function<com.commercetools.api.models.common.PriceTierBuilder, com.commercetools.api.models.common.PriceTier> builder) {
        return plusPreviousTiers(builder.apply(com.commercetools.api.models.common.PriceTierBuilder.of()));
    }

    /**
     *  <p>The previous content of the field <code>tiers</code> of the affected StandalonePrice.</p>
     * @param builder function to build the previousTiers value
     * @return Builder
     */

    public StandalonePriceTiersSetMessageBuilder setPreviousTiers(
            Function<com.commercetools.api.models.common.PriceTierBuilder, com.commercetools.api.models.common.PriceTier> builder) {
        return previousTiers(builder.apply(com.commercetools.api.models.common.PriceTierBuilder.of()));
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
     *  <p>The updated content of the field <code>tiers</code> of the affected StandalonePrice.</p>
     * @return tiers
     */

    public java.util.List<com.commercetools.api.models.common.PriceTier> getTiers() {
        return this.tiers;
    }

    /**
     *  <p>The previous content of the field <code>tiers</code> of the affected StandalonePrice.</p>
     * @return previousTiers
     */

    public java.util.List<com.commercetools.api.models.common.PriceTier> getPreviousTiers() {
        return this.previousTiers;
    }

    /**
     * builds StandalonePriceTiersSetMessage with checking for non-null required values
     * @return StandalonePriceTiersSetMessage
     */
    public StandalonePriceTiersSetMessage build() {
        Objects.requireNonNull(id, StandalonePriceTiersSetMessage.class + ": id is missing");
        Objects.requireNonNull(version, StandalonePriceTiersSetMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, StandalonePriceTiersSetMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, StandalonePriceTiersSetMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber, StandalonePriceTiersSetMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, StandalonePriceTiersSetMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion, StandalonePriceTiersSetMessage.class + ": resourceVersion is missing");
        Objects.requireNonNull(tiers, StandalonePriceTiersSetMessage.class + ": tiers is missing");
        Objects.requireNonNull(previousTiers, StandalonePriceTiersSetMessage.class + ": previousTiers is missing");
        return new StandalonePriceTiersSetMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, tiers, previousTiers);
    }

    /**
     * builds StandalonePriceTiersSetMessage without checking for non-null required values
     * @return StandalonePriceTiersSetMessage
     */
    public StandalonePriceTiersSetMessage buildUnchecked() {
        return new StandalonePriceTiersSetMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, tiers, previousTiers);
    }

    /**
     * factory method for an instance of StandalonePriceTiersSetMessageBuilder
     * @return builder
     */
    public static StandalonePriceTiersSetMessageBuilder of() {
        return new StandalonePriceTiersSetMessageBuilder();
    }

    /**
     * create builder for StandalonePriceTiersSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StandalonePriceTiersSetMessageBuilder of(final StandalonePriceTiersSetMessage template) {
        StandalonePriceTiersSetMessageBuilder builder = new StandalonePriceTiersSetMessageBuilder();
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
        builder.tiers = template.getTiers();
        builder.previousTiers = template.getPreviousTiers();
        return builder;
    }

}
