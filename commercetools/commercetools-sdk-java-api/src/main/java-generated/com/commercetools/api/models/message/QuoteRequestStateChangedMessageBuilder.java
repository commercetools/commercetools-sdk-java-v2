
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QuoteRequestStateChangedMessageBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QuoteRequestStateChangedMessage quoteRequestStateChangedMessage = QuoteRequestStateChangedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .quoteRequestState(QuoteRequestState.SUBMITTED)
 *             .oldQuoteRequestState(QuoteRequestState.SUBMITTED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QuoteRequestStateChangedMessageBuilder implements Builder<QuoteRequestStateChangedMessage> {

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

    private com.commercetools.api.models.quote_request.QuoteRequestState quoteRequestState;

    private com.commercetools.api.models.quote_request.QuoteRequestState oldQuoteRequestState;

    /**
     *  <p>Unique identifier of the Message.</p>
     */

    public QuoteRequestStateChangedMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *
     */

    public QuoteRequestStateChangedMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *
     */

    public QuoteRequestStateChangedMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *
     */

    public QuoteRequestStateChangedMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public QuoteRequestStateChangedMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public QuoteRequestStateChangedMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public QuoteRequestStateChangedMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public QuoteRequestStateChangedMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *
     */

    public QuoteRequestStateChangedMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     *  <p>A Reference represents a loose reference to another resource in the same Project identified by its <code>id</code>. The <code>typeId</code> indicates the type of the referenced resource. Each resource type has its corresponding Reference type, like ChannelReference. A referenced resource can be embedded through Reference Expansion. The expanded reference is the value of an additional <code>obj</code> field then.</p>
     */

    public QuoteRequestStateChangedMessageBuilder resource(
            final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    /**
     *  <p>A Reference represents a loose reference to another resource in the same Project identified by its <code>id</code>. The <code>typeId</code> indicates the type of the referenced resource. Each resource type has its corresponding Reference type, like ChannelReference. A referenced resource can be embedded through Reference Expansion. The expanded reference is the value of an additional <code>obj</code> field then.</p>
     */

    public QuoteRequestStateChangedMessageBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *
     */

    public QuoteRequestStateChangedMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
     *
     */

    public QuoteRequestStateChangedMessageBuilder resourceUserProvidedIdentifiers(
            Function<com.commercetools.api.models.message.UserProvidedIdentifiersBuilder, com.commercetools.api.models.message.UserProvidedIdentifiersBuilder> builder) {
        this.resourceUserProvidedIdentifiers = builder
                .apply(com.commercetools.api.models.message.UserProvidedIdentifiersBuilder.of())
                .build();
        return this;
    }

    /**
     *
     */

    public QuoteRequestStateChangedMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    /**
     *  <p>Predefined states tracking the status of the Quote Request in the negotiation process.</p>
     */

    public QuoteRequestStateChangedMessageBuilder quoteRequestState(
            final com.commercetools.api.models.quote_request.QuoteRequestState quoteRequestState) {
        this.quoteRequestState = quoteRequestState;
        return this;
    }

    /**
     *  <p>Predefined states tracking the status of the Quote Request in the negotiation process.</p>
     */

    public QuoteRequestStateChangedMessageBuilder oldQuoteRequestState(
            final com.commercetools.api.models.quote_request.QuoteRequestState oldQuoteRequestState) {
        this.oldQuoteRequestState = oldQuoteRequestState;
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

    public com.commercetools.api.models.quote_request.QuoteRequestState getQuoteRequestState() {
        return this.quoteRequestState;
    }

    public com.commercetools.api.models.quote_request.QuoteRequestState getOldQuoteRequestState() {
        return this.oldQuoteRequestState;
    }

    public QuoteRequestStateChangedMessage build() {
        Objects.requireNonNull(id, QuoteRequestStateChangedMessage.class + ": id is missing");
        Objects.requireNonNull(version, QuoteRequestStateChangedMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, QuoteRequestStateChangedMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, QuoteRequestStateChangedMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber, QuoteRequestStateChangedMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, QuoteRequestStateChangedMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion, QuoteRequestStateChangedMessage.class + ": resourceVersion is missing");
        Objects.requireNonNull(quoteRequestState,
            QuoteRequestStateChangedMessage.class + ": quoteRequestState is missing");
        Objects.requireNonNull(oldQuoteRequestState,
            QuoteRequestStateChangedMessage.class + ": oldQuoteRequestState is missing");
        return new QuoteRequestStateChangedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, quoteRequestState,
            oldQuoteRequestState);
    }

    /**
     * builds QuoteRequestStateChangedMessage without checking for non null required values
     */
    public QuoteRequestStateChangedMessage buildUnchecked() {
        return new QuoteRequestStateChangedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, quoteRequestState,
            oldQuoteRequestState);
    }

    public static QuoteRequestStateChangedMessageBuilder of() {
        return new QuoteRequestStateChangedMessageBuilder();
    }

    public static QuoteRequestStateChangedMessageBuilder of(final QuoteRequestStateChangedMessage template) {
        QuoteRequestStateChangedMessageBuilder builder = new QuoteRequestStateChangedMessageBuilder();
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
        builder.quoteRequestState = template.getQuoteRequestState();
        builder.oldQuoteRequestState = template.getOldQuoteRequestState();
        return builder;
    }

}
