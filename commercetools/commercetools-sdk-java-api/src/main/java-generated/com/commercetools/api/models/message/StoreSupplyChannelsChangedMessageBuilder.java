
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreSupplyChannelsChangedMessageBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreSupplyChannelsChangedMessage storeSupplyChannelsChangedMessage = StoreSupplyChannelsChangedMessage.builder()
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
public class StoreSupplyChannelsChangedMessageBuilder implements Builder<StoreSupplyChannelsChangedMessage> {

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
    private java.util.List<com.commercetools.api.models.channel.ChannelReference> addedSupplyChannels;

    @Nullable
    private java.util.List<com.commercetools.api.models.channel.ChannelReference> removedSupplyChannels;

    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     * @param id
     * @return Builder
     */

    public StoreSupplyChannelsChangedMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     * @param version
     * @return Builder
     */

    public StoreSupplyChannelsChangedMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     * @param createdAt
     * @return Builder
     */

    public StoreSupplyChannelsChangedMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Value of <code>createdAt</code>.</p>
     * @param lastModifiedAt
     * @return Builder
     */

    public StoreSupplyChannelsChangedMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Value of <code>createdBy</code>.</p>
     * @return Builder
     */

    public StoreSupplyChannelsChangedMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value of <code>createdBy</code>.</p>
     * @param lastModifiedBy
     * @return Builder
     */

    public StoreSupplyChannelsChangedMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return Builder
     */

    public StoreSupplyChannelsChangedMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param createdBy
     * @return Builder
     */

    public StoreSupplyChannelsChangedMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     * @param sequenceNumber
     * @return Builder
     */

    public StoreSupplyChannelsChangedMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @param resource
     * @return Builder
     */

    public StoreSupplyChannelsChangedMessageBuilder resource(
            final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @return Builder
     */

    public StoreSupplyChannelsChangedMessageBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     * @param resourceVersion
     * @return Builder
     */

    public StoreSupplyChannelsChangedMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @return Builder
     */

    public StoreSupplyChannelsChangedMessageBuilder resourceUserProvidedIdentifiers(
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

    public StoreSupplyChannelsChangedMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    /**
     *  <p>Inventory supply Channels that have been added to the Store.</p>
     * @param addedSupplyChannels
     * @return Builder
     */

    public StoreSupplyChannelsChangedMessageBuilder addedSupplyChannels(
            @Nullable final com.commercetools.api.models.channel.ChannelReference... addedSupplyChannels) {
        this.addedSupplyChannels = new ArrayList<>(Arrays.asList(addedSupplyChannels));
        return this;
    }

    /**
     *  <p>Inventory supply Channels that have been added to the Store.</p>
     * @param addedSupplyChannels
     * @return Builder
     */

    public StoreSupplyChannelsChangedMessageBuilder addedSupplyChannels(
            @Nullable final java.util.List<com.commercetools.api.models.channel.ChannelReference> addedSupplyChannels) {
        this.addedSupplyChannels = addedSupplyChannels;
        return this;
    }

    /**
     *  <p>Inventory supply Channels that have been added to the Store.</p>
     * @param addedSupplyChannels
     * @return Builder
     */

    public StoreSupplyChannelsChangedMessageBuilder plusAddedSupplyChannels(
            @Nullable final com.commercetools.api.models.channel.ChannelReference... addedSupplyChannels) {
        if (this.addedSupplyChannels == null) {
            this.addedSupplyChannels = new ArrayList<>();
        }
        this.addedSupplyChannels.addAll(Arrays.asList(addedSupplyChannels));
        return this;
    }

    /**
     *  <p>Inventory supply Channels that have been added to the Store.</p>
     * @return Builder
     */

    public StoreSupplyChannelsChangedMessageBuilder plusAddedSupplyChannels(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        if (this.addedSupplyChannels == null) {
            this.addedSupplyChannels = new ArrayList<>();
        }
        this.addedSupplyChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Inventory supply Channels that have been added to the Store.</p>
     * @return Builder
     */

    public StoreSupplyChannelsChangedMessageBuilder withAddedSupplyChannels(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.addedSupplyChannels = new ArrayList<>();
        this.addedSupplyChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Inventory supply Channels that have been removed from the Store.</p>
     * @param removedSupplyChannels
     * @return Builder
     */

    public StoreSupplyChannelsChangedMessageBuilder removedSupplyChannels(
            @Nullable final com.commercetools.api.models.channel.ChannelReference... removedSupplyChannels) {
        this.removedSupplyChannels = new ArrayList<>(Arrays.asList(removedSupplyChannels));
        return this;
    }

    /**
     *  <p>Inventory supply Channels that have been removed from the Store.</p>
     * @param removedSupplyChannels
     * @return Builder
     */

    public StoreSupplyChannelsChangedMessageBuilder removedSupplyChannels(
            @Nullable final java.util.List<com.commercetools.api.models.channel.ChannelReference> removedSupplyChannels) {
        this.removedSupplyChannels = removedSupplyChannels;
        return this;
    }

    /**
     *  <p>Inventory supply Channels that have been removed from the Store.</p>
     * @param removedSupplyChannels
     * @return Builder
     */

    public StoreSupplyChannelsChangedMessageBuilder plusRemovedSupplyChannels(
            @Nullable final com.commercetools.api.models.channel.ChannelReference... removedSupplyChannels) {
        if (this.removedSupplyChannels == null) {
            this.removedSupplyChannels = new ArrayList<>();
        }
        this.removedSupplyChannels.addAll(Arrays.asList(removedSupplyChannels));
        return this;
    }

    /**
     *  <p>Inventory supply Channels that have been removed from the Store.</p>
     * @return Builder
     */

    public StoreSupplyChannelsChangedMessageBuilder plusRemovedSupplyChannels(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        if (this.removedSupplyChannels == null) {
            this.removedSupplyChannels = new ArrayList<>();
        }
        this.removedSupplyChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Inventory supply Channels that have been removed from the Store.</p>
     * @return Builder
     */

    public StoreSupplyChannelsChangedMessageBuilder withRemovedSupplyChannels(
            Function<com.commercetools.api.models.channel.ChannelReferenceBuilder, com.commercetools.api.models.channel.ChannelReferenceBuilder> builder) {
        this.removedSupplyChannels = new ArrayList<>();
        this.removedSupplyChannels
                .add(builder.apply(com.commercetools.api.models.channel.ChannelReferenceBuilder.of()).build());
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

    @Nullable
    public java.util.List<com.commercetools.api.models.channel.ChannelReference> getAddedSupplyChannels() {
        return this.addedSupplyChannels;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.channel.ChannelReference> getRemovedSupplyChannels() {
        return this.removedSupplyChannels;
    }

    public StoreSupplyChannelsChangedMessage build() {
        Objects.requireNonNull(id, StoreSupplyChannelsChangedMessage.class + ": id is missing");
        Objects.requireNonNull(version, StoreSupplyChannelsChangedMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, StoreSupplyChannelsChangedMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, StoreSupplyChannelsChangedMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber, StoreSupplyChannelsChangedMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, StoreSupplyChannelsChangedMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion,
            StoreSupplyChannelsChangedMessage.class + ": resourceVersion is missing");
        return new StoreSupplyChannelsChangedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, addedSupplyChannels,
            removedSupplyChannels);
    }

    /**
     * builds StoreSupplyChannelsChangedMessage without checking for non null required values
     */
    public StoreSupplyChannelsChangedMessage buildUnchecked() {
        return new StoreSupplyChannelsChangedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, addedSupplyChannels,
            removedSupplyChannels);
    }

    public static StoreSupplyChannelsChangedMessageBuilder of() {
        return new StoreSupplyChannelsChangedMessageBuilder();
    }

    public static StoreSupplyChannelsChangedMessageBuilder of(final StoreSupplyChannelsChangedMessage template) {
        StoreSupplyChannelsChangedMessageBuilder builder = new StoreSupplyChannelsChangedMessageBuilder();
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
        builder.addedSupplyChannels = template.getAddedSupplyChannels();
        builder.removedSupplyChannels = template.getRemovedSupplyChannels();
        return builder;
    }

}
