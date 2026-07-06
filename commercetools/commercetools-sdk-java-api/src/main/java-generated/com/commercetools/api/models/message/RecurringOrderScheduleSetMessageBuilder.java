
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringOrderScheduleSetMessageBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderScheduleSetMessage recurringOrderScheduleSetMessage = RecurringOrderScheduleSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .recurrencePolicySchedule(recurrencePolicyScheduleBuilder -> recurrencePolicyScheduleBuilder)
 *             .oldRecurrencePolicySchedule(oldRecurrencePolicyScheduleBuilder -> oldRecurrencePolicyScheduleBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderScheduleSetMessageBuilder implements Builder<RecurringOrderScheduleSetMessage> {

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

    private com.commercetools.api.models.recurrence_policy.RecurrencePolicySchedule recurrencePolicySchedule;

    private com.commercetools.api.models.recurrence_policy.RecurrencePolicySchedule oldRecurrencePolicySchedule;

    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     * @param id value to be set
     * @return Builder
     */

    public RecurringOrderScheduleSetMessageBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     * @param version value to be set
     * @return Builder
     */

    public RecurringOrderScheduleSetMessageBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public RecurringOrderScheduleSetMessageBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Value of <code>createdAt</code>.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public RecurringOrderScheduleSetMessageBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Message.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public RecurringOrderScheduleSetMessageBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Message.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public RecurringOrderScheduleSetMessageBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Message.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public RecurringOrderScheduleSetMessageBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>IDs and references that created the Message.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public RecurringOrderScheduleSetMessageBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that created the Message.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public RecurringOrderScheduleSetMessageBuilder withCreatedBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that created the Message.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public RecurringOrderScheduleSetMessageBuilder createdBy(
            @Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     * @param sequenceNumber value to be set
     * @return Builder
     */

    public RecurringOrderScheduleSetMessageBuilder sequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the resource on which the change or action was performed.</p>
     * @param resource value to be set
     * @return Builder
     */

    public RecurringOrderScheduleSetMessageBuilder resource(
            final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to the resource on which the change or action was performed.</p>
     * @param builder function to build the resource value
     * @return Builder
     */

    public RecurringOrderScheduleSetMessageBuilder resource(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.resource = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     * @param resourceVersion value to be set
     * @return Builder
     */

    public RecurringOrderScheduleSetMessageBuilder resourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
        return this;
    }

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param builder function to build the resourceUserProvidedIdentifiers value
     * @return Builder
     */

    public RecurringOrderScheduleSetMessageBuilder resourceUserProvidedIdentifiers(
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

    public RecurringOrderScheduleSetMessageBuilder withResourceUserProvidedIdentifiers(
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

    public RecurringOrderScheduleSetMessageBuilder resourceUserProvidedIdentifiers(
            @Nullable final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurrencePolicySchedule" rel="nofollow">Schedule</a> of the Recurring Order after the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetScheduleAction" rel="nofollow">Set Schedule</a> update action.</p>
     * @param recurrencePolicySchedule value to be set
     * @return Builder
     */

    public RecurringOrderScheduleSetMessageBuilder recurrencePolicySchedule(
            final com.commercetools.api.models.recurrence_policy.RecurrencePolicySchedule recurrencePolicySchedule) {
        this.recurrencePolicySchedule = recurrencePolicySchedule;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurrencePolicySchedule" rel="nofollow">Schedule</a> of the Recurring Order after the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetScheduleAction" rel="nofollow">Set Schedule</a> update action.</p>
     * @param builder function to build the recurrencePolicySchedule value
     * @return Builder
     */

    public RecurringOrderScheduleSetMessageBuilder recurrencePolicySchedule(
            Function<com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleBuilder, Builder<? extends com.commercetools.api.models.recurrence_policy.RecurrencePolicySchedule>> builder) {
        this.recurrencePolicySchedule = builder
                .apply(com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurrencePolicySchedule" rel="nofollow">Schedule</a> of the Recurring Order before the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetScheduleAction" rel="nofollow">Set Schedule</a> update action.</p>
     * @param oldRecurrencePolicySchedule value to be set
     * @return Builder
     */

    public RecurringOrderScheduleSetMessageBuilder oldRecurrencePolicySchedule(
            final com.commercetools.api.models.recurrence_policy.RecurrencePolicySchedule oldRecurrencePolicySchedule) {
        this.oldRecurrencePolicySchedule = oldRecurrencePolicySchedule;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurrencePolicySchedule" rel="nofollow">Schedule</a> of the Recurring Order before the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetScheduleAction" rel="nofollow">Set Schedule</a> update action.</p>
     * @param builder function to build the oldRecurrencePolicySchedule value
     * @return Builder
     */

    public RecurringOrderScheduleSetMessageBuilder oldRecurrencePolicySchedule(
            Function<com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleBuilder, Builder<? extends com.commercetools.api.models.recurrence_policy.RecurrencePolicySchedule>> builder) {
        this.oldRecurrencePolicySchedule = builder
                .apply(com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleBuilder.of())
                .build();
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
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurrencePolicySchedule" rel="nofollow">Schedule</a> of the Recurring Order after the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetScheduleAction" rel="nofollow">Set Schedule</a> update action.</p>
     * @return recurrencePolicySchedule
     */

    public com.commercetools.api.models.recurrence_policy.RecurrencePolicySchedule getRecurrencePolicySchedule() {
        return this.recurrencePolicySchedule;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurrencePolicySchedule" rel="nofollow">Schedule</a> of the Recurring Order before the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetScheduleAction" rel="nofollow">Set Schedule</a> update action.</p>
     * @return oldRecurrencePolicySchedule
     */

    public com.commercetools.api.models.recurrence_policy.RecurrencePolicySchedule getOldRecurrencePolicySchedule() {
        return this.oldRecurrencePolicySchedule;
    }

    /**
     * builds RecurringOrderScheduleSetMessage with checking for non-null required values
     * @return RecurringOrderScheduleSetMessage
     */
    public RecurringOrderScheduleSetMessage build() {
        Objects.requireNonNull(id, RecurringOrderScheduleSetMessage.class + ": id is missing");
        Objects.requireNonNull(version, RecurringOrderScheduleSetMessage.class + ": version is missing");
        Objects.requireNonNull(createdAt, RecurringOrderScheduleSetMessage.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, RecurringOrderScheduleSetMessage.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(sequenceNumber, RecurringOrderScheduleSetMessage.class + ": sequenceNumber is missing");
        Objects.requireNonNull(resource, RecurringOrderScheduleSetMessage.class + ": resource is missing");
        Objects.requireNonNull(resourceVersion,
            RecurringOrderScheduleSetMessage.class + ": resourceVersion is missing");
        Objects.requireNonNull(recurrencePolicySchedule,
            RecurringOrderScheduleSetMessage.class + ": recurrencePolicySchedule is missing");
        Objects.requireNonNull(oldRecurrencePolicySchedule,
            RecurringOrderScheduleSetMessage.class + ": oldRecurrencePolicySchedule is missing");
        return new RecurringOrderScheduleSetMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers,
            recurrencePolicySchedule, oldRecurrencePolicySchedule);
    }

    /**
     * builds RecurringOrderScheduleSetMessage without checking for non-null required values
     * @return RecurringOrderScheduleSetMessage
     */
    public RecurringOrderScheduleSetMessage buildUnchecked() {
        return new RecurringOrderScheduleSetMessageImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy,
            createdBy, sequenceNumber, resource, resourceVersion, resourceUserProvidedIdentifiers,
            recurrencePolicySchedule, oldRecurrencePolicySchedule);
    }

    /**
     * factory method for an instance of RecurringOrderScheduleSetMessageBuilder
     * @return builder
     */
    public static RecurringOrderScheduleSetMessageBuilder of() {
        return new RecurringOrderScheduleSetMessageBuilder();
    }

    /**
     * create builder for RecurringOrderScheduleSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderScheduleSetMessageBuilder of(final RecurringOrderScheduleSetMessage template) {
        RecurringOrderScheduleSetMessageBuilder builder = new RecurringOrderScheduleSetMessageBuilder();
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
        builder.recurrencePolicySchedule = template.getRecurrencePolicySchedule();
        builder.oldRecurrencePolicySchedule = template.getOldRecurrencePolicySchedule();
        return builder;
    }

}
