
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
     * @param id value to be set
     * @return Builder
     */

    public StoreCountriesChangedMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     * @param version value to be set
     * @return Builder
     */

    public StoreCountriesChangedMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public StoreCountriesChangedMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Value of <code>createdAt</code>.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public StoreCountriesChangedMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Message.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public StoreCountriesChangedMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Message.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public StoreCountriesChangedMessageBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Message.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public StoreCountriesChangedMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>IDs and references that created the Message.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public StoreCountriesChangedMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that created the Message.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public StoreCountriesChangedMessageBuilder withCreatedBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that created the Message.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public StoreCountriesChangedMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     * @param sequenceNumber value to be set
     * @return Builder
     */

    public StoreCountriesChangedMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the resource on which the change or action was performed.</p>
     * @param resource value to be set
     * @return Builder
     */

    public StoreCountriesChangedMessageBuilder resource(final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the resource on which the change or action was performed.</p>
     * @param builder function to build the resource value
     * @return Builder
     */

    public StoreCountriesChangedMessageBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     * @param resourceVersion value to be set
     * @return Builder
     */

    public StoreCountriesChangedMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param builder function to build the resourceUserProvidedIdentifiers value
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
     * @param builder function to build the resourceUserProvidedIdentifiers value
     * @return Builder
     */

    public StoreCountriesChangedMessageBuilder withResourceUserProvidedIdentifiers(
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

    public StoreCountriesChangedMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:StoreCountry" rel="nofollow">Countries</a> added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>.</p>
     * @param addedCountries value to be set
     * @return Builder
     */

    public StoreCountriesChangedMessageBuilder addedCountries(
            @Nullable final com.commercetools.api.models.store_country.StoreCountry... addedCountries) {
        this.addedCountries = new ArrayList<>(Arrays.asList(addedCountries));
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:StoreCountry" rel="nofollow">Countries</a> added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>.</p>
     * @param addedCountries value to be set
     * @return Builder
     */

    public StoreCountriesChangedMessageBuilder addedCountries(
            @Nullable final java.util.List<com.commercetools.api.models.store_country.StoreCountry> addedCountries) {
        this.addedCountries = addedCountries;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:StoreCountry" rel="nofollow">Countries</a> added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>.</p>
     * @param addedCountries value to be set
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
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:StoreCountry" rel="nofollow">Countries</a> added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>.</p>
     * @param builder function to build the addedCountries value
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
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:StoreCountry" rel="nofollow">Countries</a> added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>.</p>
     * @param builder function to build the addedCountries value
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
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:StoreCountry" rel="nofollow">Countries</a> added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>.</p>
     * @param builder function to build the addedCountries value
     * @return Builder
     */

    public StoreCountriesChangedMessageBuilder addAddedCountries(
            Function<com.commercetools.api.models.store_country.StoreCountryBuilder, com.commercetools.api.models.store_country.StoreCountry> builder) {
        return plusAddedCountries(builder.apply(com.commercetools.api.models.store_country.StoreCountryBuilder.of()));
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:StoreCountry" rel="nofollow">Countries</a> added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>.</p>
     * @param builder function to build the addedCountries value
     * @return Builder
     */

    public StoreCountriesChangedMessageBuilder setAddedCountries(
            Function<com.commercetools.api.models.store_country.StoreCountryBuilder, com.commercetools.api.models.store_country.StoreCountry> builder) {
        return addedCountries(builder.apply(com.commercetools.api.models.store_country.StoreCountryBuilder.of()));
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:StoreCountry" rel="nofollow">Countries</a> removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>.</p>
     * @param removedCountries value to be set
     * @return Builder
     */

    public StoreCountriesChangedMessageBuilder removedCountries(
            @Nullable final com.commercetools.api.models.store_country.StoreCountry... removedCountries) {
        this.removedCountries = new ArrayList<>(Arrays.asList(removedCountries));
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:StoreCountry" rel="nofollow">Countries</a> removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>.</p>
     * @param removedCountries value to be set
     * @return Builder
     */

    public StoreCountriesChangedMessageBuilder removedCountries(
            @Nullable final java.util.List<com.commercetools.api.models.store_country.StoreCountry> removedCountries) {
        this.removedCountries = removedCountries;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:StoreCountry" rel="nofollow">Countries</a> removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>.</p>
     * @param removedCountries value to be set
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
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:StoreCountry" rel="nofollow">Countries</a> removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>.</p>
     * @param builder function to build the removedCountries value
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
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:StoreCountry" rel="nofollow">Countries</a> removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>.</p>
     * @param builder function to build the removedCountries value
     * @return Builder
     */

    public StoreCountriesChangedMessageBuilder withRemovedCountries(
            Function<com.commercetools.api.models.store_country.StoreCountryBuilder, com.commercetools.api.models.store_country.StoreCountryBuilder> builder) {
        this.removedCountries = new ArrayList<>();
        this.removedCountries
                .add(builder.apply(com.commercetools.api.models.store_country.StoreCountryBuilder.of()).build());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:StoreCountry" rel="nofollow">Countries</a> removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>.</p>
     * @param builder function to build the removedCountries value
     * @return Builder
     */

    public StoreCountriesChangedMessageBuilder addRemovedCountries(
            Function<com.commercetools.api.models.store_country.StoreCountryBuilder, com.commercetools.api.models.store_country.StoreCountry> builder) {
        return plusRemovedCountries(builder.apply(com.commercetools.api.models.store_country.StoreCountryBuilder.of()));
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:StoreCountry" rel="nofollow">Countries</a> removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>.</p>
     * @param builder function to build the removedCountries value
     * @return Builder
     */

    public StoreCountriesChangedMessageBuilder setRemovedCountries(
            Function<com.commercetools.api.models.store_country.StoreCountryBuilder, com.commercetools.api.models.store_country.StoreCountry> builder) {
        return removedCountries(builder.apply(com.commercetools.api.models.store_country.StoreCountryBuilder.of()));
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
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:StoreCountry" rel="nofollow">Countries</a> added to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>.</p>
     * @return addedCountries
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.store_country.StoreCountry> getAddedCountries() {
        return this.addedCountries;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:StoreCountry" rel="nofollow">Countries</a> removed from the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>.</p>
     * @return removedCountries
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.store_country.StoreCountry> getRemovedCountries() {
        return this.removedCountries;
    }

    /**
     * builds StoreCountriesChangedMessage with checking for non-null required values
     * @return StoreCountriesChangedMessage
     */
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
     * builds StoreCountriesChangedMessage without checking for non-null required values
     * @return StoreCountriesChangedMessage
     */
    public StoreCountriesChangedMessage buildUnchecked() {
        return new StoreCountriesChangedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, addedCountries,
            removedCountries);
    }

    /**
     * factory method for an instance of StoreCountriesChangedMessageBuilder
     * @return builder
     */
    public static StoreCountriesChangedMessageBuilder of() {
        return new StoreCountriesChangedMessageBuilder();
    }

    /**
     * create builder for StoreCountriesChangedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
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
