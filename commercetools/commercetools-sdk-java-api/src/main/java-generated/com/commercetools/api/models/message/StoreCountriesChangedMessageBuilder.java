
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StoreCountriesChangedMessageBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StoreCountriesChangedMessage storeCountriesChangedMessage = StoreCountriesChangedMessage.builder()
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
public class StoreCountriesChangedMessageBuilder implements Builder<StoreCountriesChangedMessage> {

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
    private java.util.List<com.commercetools.api.models.store_country.StoreCountry> addedCountries;

    @Nullable
    private java.util.List<com.commercetools.api.models.store_country.StoreCountry> removedCountries;

    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     * @param id
     * @return Builder
     */

    public StoreCountriesChangedMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     * @param version
     * @return Builder
     */

    public StoreCountriesChangedMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     * @param createdAt
     * @return Builder
     */

    public StoreCountriesChangedMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Value of <code>createdAt</code>.</p>
     * @param lastModifiedAt
     * @return Builder
     */

    public StoreCountriesChangedMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Value of <code>createdBy</code>.</p>
     * @return Builder
     */

    public StoreCountriesChangedMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value of <code>createdBy</code>.</p>
     * @param lastModifiedBy
     * @return Builder
     */

    public StoreCountriesChangedMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return Builder
     */

    public StoreCountriesChangedMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param createdBy
     * @return Builder
     */

    public StoreCountriesChangedMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     * @param sequenceNumber
     * @return Builder
     */

    public StoreCountriesChangedMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @param resource
     * @return Builder
     */

    public StoreCountriesChangedMessageBuilder resource(final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @return Builder
     */

    public StoreCountriesChangedMessageBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     * @param resourceVersion
     * @return Builder
     */

    public StoreCountriesChangedMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @return Builder
     */

    public StoreCountriesChangedMessageBuilder resourceUserProvidedIdentifiers(
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

    public StoreCountriesChangedMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    /**
     *  <p>Countries added to the Store.</p>
     * @param addedCountries
     * @return Builder
     */

    public StoreCountriesChangedMessageBuilder addedCountries(
            @Nullable final com.commercetools.api.models.store_country.StoreCountry... addedCountries) {
        this.addedCountries = new ArrayList<>(Arrays.asList(addedCountries));
        return this;
    }

    /**
     *  <p>Countries added to the Store.</p>
     * @param addedCountries
     * @return Builder
     */

    public StoreCountriesChangedMessageBuilder addedCountries(
            @Nullable final java.util.List<com.commercetools.api.models.store_country.StoreCountry> addedCountries) {
        this.addedCountries = addedCountries;
        return this;
    }

    /**
     *  <p>Countries added to the Store.</p>
     * @param addedCountries
     * @return Builder
     */

    public StoreCountriesChangedMessageBuilder plusAddedCountries(
            @Nullable final com.commercetools.api.models.store_country.StoreCountry... addedCountries) {
        if (this.addedCountries == null) {
            this.addedCountries = new ArrayList<>();
        }
        this.addedCountries.addAll(Arrays.asList(addedCountries));
        return this;
    }

    /**
     *  <p>Countries added to the Store.</p>
     * @return Builder
     */

    public StoreCountriesChangedMessageBuilder plusAddedCountries(
            Function<com.commercetools.api.models.store_country.StoreCountryBuilder, com.commercetools.api.models.store_country.StoreCountryBuilder> builder) {
        if (this.addedCountries == null) {
            this.addedCountries = new ArrayList<>();
        }
        this.addedCountries
                .add(builder.apply(com.commercetools.api.models.store_country.StoreCountryBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Countries added to the Store.</p>
     * @return Builder
     */

    public StoreCountriesChangedMessageBuilder withAddedCountries(
            Function<com.commercetools.api.models.store_country.StoreCountryBuilder, com.commercetools.api.models.store_country.StoreCountryBuilder> builder) {
        this.addedCountries = new ArrayList<>();
        this.addedCountries
                .add(builder.apply(com.commercetools.api.models.store_country.StoreCountryBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Countries removed from the Store.</p>
     * @param removedCountries
     * @return Builder
     */

    public StoreCountriesChangedMessageBuilder removedCountries(
            @Nullable final com.commercetools.api.models.store_country.StoreCountry... removedCountries) {
        this.removedCountries = new ArrayList<>(Arrays.asList(removedCountries));
        return this;
    }

    /**
     *  <p>Countries removed from the Store.</p>
     * @param removedCountries
     * @return Builder
     */

    public StoreCountriesChangedMessageBuilder removedCountries(
            @Nullable final java.util.List<com.commercetools.api.models.store_country.StoreCountry> removedCountries) {
        this.removedCountries = removedCountries;
        return this;
    }

    /**
     *  <p>Countries removed from the Store.</p>
     * @param removedCountries
     * @return Builder
     */

    public StoreCountriesChangedMessageBuilder plusRemovedCountries(
            @Nullable final com.commercetools.api.models.store_country.StoreCountry... removedCountries) {
        if (this.removedCountries == null) {
            this.removedCountries = new ArrayList<>();
        }
        this.removedCountries.addAll(Arrays.asList(removedCountries));
        return this;
    }

    /**
     *  <p>Countries removed from the Store.</p>
     * @return Builder
     */

    public StoreCountriesChangedMessageBuilder plusRemovedCountries(
            Function<com.commercetools.api.models.store_country.StoreCountryBuilder, com.commercetools.api.models.store_country.StoreCountryBuilder> builder) {
        if (this.removedCountries == null) {
            this.removedCountries = new ArrayList<>();
        }
        this.removedCountries
                .add(builder.apply(com.commercetools.api.models.store_country.StoreCountryBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Countries removed from the Store.</p>
     * @return Builder
     */

    public StoreCountriesChangedMessageBuilder withRemovedCountries(
            Function<com.commercetools.api.models.store_country.StoreCountryBuilder, com.commercetools.api.models.store_country.StoreCountryBuilder> builder) {
        this.removedCountries = new ArrayList<>();
        this.removedCountries
                .add(builder.apply(com.commercetools.api.models.store_country.StoreCountryBuilder.of()).build());
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
    public java.util.List<com.commercetools.api.models.store_country.StoreCountry> getAddedCountries() {
        return this.addedCountries;
    }

    @Nullable
    public java.util.List<com.commercetools.api.models.store_country.StoreCountry> getRemovedCountries() {
        return this.removedCountries;
    }

    public StoreCountriesChangedMessage build() {
        Objects.requireNonNull(id, StoreCountriesChangedMessage.class + ": id is missing");
        Objects.requireNonNull(version, StoreCountriesChangedMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, StoreCountriesChangedMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, StoreCountriesChangedMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber, StoreCountriesChangedMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, StoreCountriesChangedMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion, StoreCountriesChangedMessage.class + ": resourceVersion is missing");
        return new StoreCountriesChangedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, addedCountries,
            removedCountries);
    }

    /**
     * builds StoreCountriesChangedMessage without checking for non null required values
     */
    public StoreCountriesChangedMessage buildUnchecked() {
        return new StoreCountriesChangedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, addedCountries,
            removedCountries);
    }

    public static StoreCountriesChangedMessageBuilder of() {
        return new StoreCountriesChangedMessageBuilder();
    }

    public static StoreCountriesChangedMessageBuilder of(final StoreCountriesChangedMessage template) {
        StoreCountriesChangedMessageBuilder builder = new StoreCountriesChangedMessageBuilder();
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
        builder.addedCountries = template.getAddedCountries();
        builder.removedCountries = template.getRemovedCountries();
        return builder;
    }

}
