
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringOrderFailedMessageBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderFailedMessage recurringOrderFailedMessage = RecurringOrderFailedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .cartId("{cartId}")
 *             .failedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .failureReason("{failureReason}")
 *             .orderScheduledAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderFailedMessageBuilder implements Builder<RecurringOrderFailedMessage> {

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

    private String cartId;

    private java.time.ZonedDateTime failedAt;

    private String failureReason;

    private java.time.ZonedDateTime orderScheduledAt;

    @Nullable
    private java.util.List<com.commercetools.api.models.error.RecurringOrderFailureError> errors;

    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     * @param id value to be set
     * @return Builder
     */

    public RecurringOrderFailedMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     * @param version value to be set
     * @return Builder
     */

    public RecurringOrderFailedMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public RecurringOrderFailedMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Value of <code>createdAt</code>.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public RecurringOrderFailedMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Message.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public RecurringOrderFailedMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Message.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public RecurringOrderFailedMessageBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Message.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public RecurringOrderFailedMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>IDs and references that created the Message.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public RecurringOrderFailedMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that created the Message.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public RecurringOrderFailedMessageBuilder withCreatedBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that created the Message.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public RecurringOrderFailedMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     * @param sequenceNumber value to be set
     * @return Builder
     */

    public RecurringOrderFailedMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the resource on which the change or action was performed.</p>
     * @param resource value to be set
     * @return Builder
     */

    public RecurringOrderFailedMessageBuilder resource(final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the resource on which the change or action was performed.</p>
     * @param builder function to build the resource value
     * @return Builder
     */

    public RecurringOrderFailedMessageBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     * @param resourceVersion value to be set
     * @return Builder
     */

    public RecurringOrderFailedMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param builder function to build the resourceUserProvidedIdentifiers value
     * @return Builder
     */

    public RecurringOrderFailedMessageBuilder resourceUserProvidedIdentifiers(
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

    public RecurringOrderFailedMessageBuilder withResourceUserProvidedIdentifiers(
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

    public RecurringOrderFailedMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    /**
     *  <p>ID of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> used in the failed Order creation attempt.</p>
     * @param cartId value to be set
     * @return Builder
     */

    public RecurringOrderFailedMessageBuilder cartId(final String cartId) {
        this.cartId = cartId;
        return this;
    }

    /**
     *  <p>Date and time (UTC) when the Order creation attempt failed.</p>
     * @param failedAt value to be set
     * @return Builder
     */

    public RecurringOrderFailedMessageBuilder failedAt(final java.time.ZonedDateTime failedAt) {
        this.failedAt = failedAt;
        return this;
    }

    /**
     *  <p>Description of why the Order creation failed, such as insufficient stock.</p>
     * @param failureReason value to be set
     * @return Builder
     */

    public RecurringOrderFailedMessageBuilder failureReason(final String failureReason) {
        this.failureReason = failureReason;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Order was scheduled to be created.</p>
     * @param orderScheduledAt value to be set
     * @return Builder
     */

    public RecurringOrderFailedMessageBuilder orderScheduledAt(final java.time.ZonedDateTime orderScheduledAt) {
        this.orderScheduledAt = orderScheduledAt;
        return this;
    }

    /**
     *  <p>Errors due to which the Order creation failed.</p>
     * @param errors value to be set
     * @return Builder
     */

    public RecurringOrderFailedMessageBuilder errors(
            @Nullable final com.commercetools.api.models.error.RecurringOrderFailureError... errors) {
        this.errors = new ArrayList<>(Arrays.asList(errors));
        return this;
    }

    /**
     *  <p>Errors due to which the Order creation failed.</p>
     * @param errors value to be set
     * @return Builder
     */

    public RecurringOrderFailedMessageBuilder errors(
            @Nullable final java.util.List<com.commercetools.api.models.error.RecurringOrderFailureError> errors) {
        this.errors = errors;
        return this;
    }

    /**
     *  <p>Errors due to which the Order creation failed.</p>
     * @param errors value to be set
     * @return Builder
     */

    public RecurringOrderFailedMessageBuilder plusErrors(
            @Nullable final com.commercetools.api.models.error.RecurringOrderFailureError... errors) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.addAll(Arrays.asList(errors));
        return this;
    }

    /**
     *  <p>Errors due to which the Order creation failed.</p>
     * @param builder function to build the errors value
     * @return Builder
     */

    public RecurringOrderFailedMessageBuilder plusErrors(
            Function<com.commercetools.api.models.error.RecurringOrderFailureErrorBuilder, com.commercetools.api.models.error.RecurringOrderFailureErrorBuilder> builder) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors
                .add(builder.apply(com.commercetools.api.models.error.RecurringOrderFailureErrorBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Errors due to which the Order creation failed.</p>
     * @param builder function to build the errors value
     * @return Builder
     */

    public RecurringOrderFailedMessageBuilder withErrors(
            Function<com.commercetools.api.models.error.RecurringOrderFailureErrorBuilder, com.commercetools.api.models.error.RecurringOrderFailureErrorBuilder> builder) {
        this.errors = new ArrayList<>();
        this.errors
                .add(builder.apply(com.commercetools.api.models.error.RecurringOrderFailureErrorBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Errors due to which the Order creation failed.</p>
     * @param builder function to build the errors value
     * @return Builder
     */

    public RecurringOrderFailedMessageBuilder addErrors(
            Function<com.commercetools.api.models.error.RecurringOrderFailureErrorBuilder, com.commercetools.api.models.error.RecurringOrderFailureError> builder) {
        return plusErrors(builder.apply(com.commercetools.api.models.error.RecurringOrderFailureErrorBuilder.of()));
    }

    /**
     *  <p>Errors due to which the Order creation failed.</p>
     * @param builder function to build the errors value
     * @return Builder
     */

    public RecurringOrderFailedMessageBuilder setErrors(
            Function<com.commercetools.api.models.error.RecurringOrderFailureErrorBuilder, com.commercetools.api.models.error.RecurringOrderFailureError> builder) {
        return errors(builder.apply(com.commercetools.api.models.error.RecurringOrderFailureErrorBuilder.of()));
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
     *  <p>ID of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> used in the failed Order creation attempt.</p>
     * @return cartId
     */

    public String getCartId() {
        return this.cartId;
    }

    /**
     *  <p>Date and time (UTC) when the Order creation attempt failed.</p>
     * @return failedAt
     */

    public java.time.ZonedDateTime getFailedAt() {
        return this.failedAt;
    }

    /**
     *  <p>Description of why the Order creation failed, such as insufficient stock.</p>
     * @return failureReason
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     *  <p>Date and time (UTC) the Order was scheduled to be created.</p>
     * @return orderScheduledAt
     */

    public java.time.ZonedDateTime getOrderScheduledAt() {
        return this.orderScheduledAt;
    }

    /**
     *  <p>Errors due to which the Order creation failed.</p>
     * @return errors
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.error.RecurringOrderFailureError> getErrors() {
        return this.errors;
    }

    /**
     * builds RecurringOrderFailedMessage with checking for non-null required values
     * @return RecurringOrderFailedMessage
     */
    public RecurringOrderFailedMessage build() {
        Objects.requireNonNull(id, RecurringOrderFailedMessage.class + ": id is missing");
        Objects.requireNonNull(version, RecurringOrderFailedMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, RecurringOrderFailedMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, RecurringOrderFailedMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber, RecurringOrderFailedMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, RecurringOrderFailedMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion, RecurringOrderFailedMessage.class + ": resourceVersion is missing");
        Objects.requireNonNull(cartId, RecurringOrderFailedMessage.class + ": cartId is missing");
        Objects.requireNonNull(failedAt, RecurringOrderFailedMessage.class + ": failedAt is missing");
        Objects.requireNonNull(failureReason, RecurringOrderFailedMessage.class + ": failureReason is missing");
        Objects.requireNonNull(orderScheduledAt, RecurringOrderFailedMessage.class + ": orderScheduledAt is missing");
        return new RecurringOrderFailedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, cartId, failedAt, failureReason,
            orderScheduledAt, errors);
    }

    /**
     * builds RecurringOrderFailedMessage without checking for non-null required values
     * @return RecurringOrderFailedMessage
     */
    public RecurringOrderFailedMessage buildUnchecked() {
        return new RecurringOrderFailedMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy,
            sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers, cartId, failedAt, failureReason,
            orderScheduledAt, errors);
    }

    /**
     * factory method for an instance of RecurringOrderFailedMessageBuilder
     * @return builder
     */
    public static RecurringOrderFailedMessageBuilder of() {
        return new RecurringOrderFailedMessageBuilder();
    }

    /**
     * create builder for RecurringOrderFailedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderFailedMessageBuilder of(final RecurringOrderFailedMessage template) {
        RecurringOrderFailedMessageBuilder builder = new RecurringOrderFailedMessageBuilder();
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
        builder.cartId = template.getCartId();
        builder.failedAt = template.getFailedAt();
        builder.failureReason = template.getFailureReason();
        builder.orderScheduledAt = template.getOrderScheduledAt();
        builder.errors = template.getErrors();
        return builder;
    }

}
