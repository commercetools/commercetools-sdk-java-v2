
package com.commercetools.api.models.recurrence_policy;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurrencePolicyBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurrencePolicy recurrencePolicy = RecurrencePolicy.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .key("{key}")
 *             .schedule(scheduleBuilder -> scheduleBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurrencePolicyBuilder implements Builder<RecurrencePolicy> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    private String key;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    private com.commercetools.api.models.recurrence_policy.RecurrencePolicySchedule schedule;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    /**
     *  <p>Unique identifier of the RecurrencePolicy.</p>
     * @param id value to be set
     * @return Builder
     */

    public RecurrencePolicyBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the RecurrencePolicy.</p>
     * @param version value to be set
     * @return Builder
     */

    public RecurrencePolicyBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the RecurrencePolicy was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public RecurrencePolicyBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the RecurrencePolicy was last updated.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public RecurrencePolicyBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the RecurrencePolicy.</p>
     * @param key value to be set
     * @return Builder
     */

    public RecurrencePolicyBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Name of the RecurrencePolicy.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public RecurrencePolicyBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the RecurrencePolicy.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public RecurrencePolicyBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the RecurrencePolicy.</p>
     * @param name value to be set
     * @return Builder
     */

    public RecurrencePolicyBuilder name(@Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Description of the RecurrencePolicy.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public RecurrencePolicyBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Description of the RecurrencePolicy.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public RecurrencePolicyBuilder withDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Description of the RecurrencePolicy.</p>
     * @param description value to be set
     * @return Builder
     */

    public RecurrencePolicyBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Schedule of the RecurrencePolicy.</p>
     * @param schedule value to be set
     * @return Builder
     */

    public RecurrencePolicyBuilder schedule(
            final com.commercetools.api.models.recurrence_policy.RecurrencePolicySchedule schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     *  <p>Schedule of the RecurrencePolicy.</p>
     * @param builder function to build the schedule value
     * @return Builder
     */

    public RecurrencePolicyBuilder schedule(
            Function<com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleBuilder, Builder<? extends com.commercetools.api.models.recurrence_policy.RecurrencePolicySchedule>> builder) {
        this.schedule = builder
                .apply(com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>IDs and references that created the RecurrencePolicy.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public RecurrencePolicyBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that created the RecurrencePolicy.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public RecurrencePolicyBuilder withCreatedBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that created the RecurrencePolicy.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public RecurrencePolicyBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>IDs and references that last modified the RecurrencePolicy.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public RecurrencePolicyBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that last modified the RecurrencePolicy.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public RecurrencePolicyBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that last modified the RecurrencePolicy.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public RecurrencePolicyBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>Unique identifier of the RecurrencePolicy.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the RecurrencePolicy.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the RecurrencePolicy was initially created.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the RecurrencePolicy was last updated.</p>
     * @return lastModifiedAt
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>User-defined unique identifier of the RecurrencePolicy.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Name of the RecurrencePolicy.</p>
     * @return name
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>Description of the RecurrencePolicy.</p>
     * @return description
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>Schedule of the RecurrencePolicy.</p>
     * @return schedule
     */

    public com.commercetools.api.models.recurrence_policy.RecurrencePolicySchedule getSchedule() {
        return this.schedule;
    }

    /**
     *  <p>IDs and references that created the RecurrencePolicy.</p>
     * @return createdBy
     */

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>IDs and references that last modified the RecurrencePolicy.</p>
     * @return lastModifiedBy
     */

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     * builds RecurrencePolicy with checking for non-null required values
     * @return RecurrencePolicy
     */
    public RecurrencePolicy build() {
        Objects.requireNonNull(id, RecurrencePolicy.class + ": id is missing");
        Objects.requireNonNull(version, RecurrencePolicy.class + ": version is missing");
        Objects.requireNonNull(createdAt, RecurrencePolicy.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, RecurrencePolicy.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(key, RecurrencePolicy.class + ": key is missing");
        Objects.requireNonNull(schedule, RecurrencePolicy.class + ": schedule is missing");
        return new RecurrencePolicyImpl(id, version, createdAt, lastModifiedAt, key, name, description, schedule,
            createdBy, lastModifiedBy);
    }

    /**
     * builds RecurrencePolicy without checking for non-null required values
     * @return RecurrencePolicy
     */
    public RecurrencePolicy buildUnchecked() {
        return new RecurrencePolicyImpl(id, version, createdAt, lastModifiedAt, key, name, description, schedule,
            createdBy, lastModifiedBy);
    }

    /**
     * factory method for an instance of RecurrencePolicyBuilder
     * @return builder
     */
    public static RecurrencePolicyBuilder of() {
        return new RecurrencePolicyBuilder();
    }

    /**
     * create builder for RecurrencePolicy instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurrencePolicyBuilder of(final RecurrencePolicy template) {
        RecurrencePolicyBuilder builder = new RecurrencePolicyBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.key = template.getKey();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.schedule = template.getSchedule();
        builder.createdBy = template.getCreatedBy();
        builder.lastModifiedBy = template.getLastModifiedBy();
        return builder;
    }

}
