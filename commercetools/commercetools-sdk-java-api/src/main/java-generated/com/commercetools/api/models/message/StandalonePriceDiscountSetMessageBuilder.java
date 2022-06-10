
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StandalonePriceDiscountSetMessageBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StandalonePriceDiscountSetMessage standalonePriceDiscountSetMessage = StandalonePriceDiscountSetMessage.builder()
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
public class StandalonePriceDiscountSetMessageBuilder implements Builder<StandalonePriceDiscountSetMessage> {

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
    private com.commercetools.api.models.common.DiscountedPrice discounted;

    /**
     *  <p>Unique identifier of the Message.</p>
     */

    public StandalonePriceDiscountSetMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *
     */

    public StandalonePriceDiscountSetMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *
     */

    public StandalonePriceDiscountSetMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *
     */

    public StandalonePriceDiscountSetMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public StandalonePriceDiscountSetMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public StandalonePriceDiscountSetMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public StandalonePriceDiscountSetMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public StandalonePriceDiscountSetMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *
     */

    public StandalonePriceDiscountSetMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     *  <p>A Reference represents a loose reference to another resource in the same Project identified by its <code>id</code>. The <code>typeId</code> indicates the type of the referenced resource. Each resource type has its corresponding Reference type, like ChannelReference. A referenced resource can be embedded through Reference Expansion. The expanded reference is the value of an additional <code>obj</code> field then.</p>
     */

    public StandalonePriceDiscountSetMessageBuilder resource(
            final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    /**
     *  <p>A Reference represents a loose reference to another resource in the same Project identified by its <code>id</code>. The <code>typeId</code> indicates the type of the referenced resource. Each resource type has its corresponding Reference type, like ChannelReference. A referenced resource can be embedded through Reference Expansion. The expanded reference is the value of an additional <code>obj</code> field then.</p>
     */

    public StandalonePriceDiscountSetMessageBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public StandalonePriceDiscountSetMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
     *
     */

    public StandalonePriceDiscountSetMessageBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    /**
     *
     */

    public StandalonePriceDiscountSetMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    /**
     *  <p>The new <code>discounted</code> value of the updated StandalonePrice.</p>
     */

    public StandalonePriceDiscountSetMessageBuilder discounted(
            Function<com.commercetools.api.models.common.DiscountedPriceBuilder, com.commercetools.api.models.common.DiscountedPriceBuilder> builder) {
        this.discounted = builder.apply(com.commercetools.api.models.common.DiscountedPriceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The new <code>discounted</code> value of the updated StandalonePrice.</p>
     */

    public StandalonePriceDiscountSetMessageBuilder discounted(
            @Nullable final com.commercetools.api.models.common.DiscountedPrice discounted) {
        this.discounted = discounted;
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
    public com.commercetools.api.models.common.DiscountedPrice getDiscounted() {
        return this.discounted;
    }

    public StandalonePriceDiscountSetMessage build() {
        Objects.requireNonNull(id, StandalonePriceDiscountSetMessage.class + ": id is missing");
        Objects.requireNonNull(version, StandalonePriceDiscountSetMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, StandalonePriceDiscountSetMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, StandalonePriceDiscountSetMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber, StandalonePriceDiscountSetMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, StandalonePriceDiscountSetMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion,
            StandalonePriceDiscountSetMessage.class + ": resourceVersion is missing");
        return new StandalonePriceDiscountSetMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, discounted);
    }

    /**
     * builds StandalonePriceDiscountSetMessage without checking for non null required values
     */
    public StandalonePriceDiscountSetMessage buildUnchecked() {
        return new StandalonePriceDiscountSetMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, discounted);
    }

    public static StandalonePriceDiscountSetMessageBuilder of() {
        return new StandalonePriceDiscountSetMessageBuilder();
    }

    public static StandalonePriceDiscountSetMessageBuilder of(final StandalonePriceDiscountSetMessage template) {
        StandalonePriceDiscountSetMessageBuilder builder = new StandalonePriceDiscountSetMessageBuilder();
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
        builder.discounted = template.getDiscounted();
        return builder;
    }

}
