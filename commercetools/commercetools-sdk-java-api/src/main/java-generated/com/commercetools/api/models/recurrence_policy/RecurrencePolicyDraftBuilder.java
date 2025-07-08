
package com.commercetools.api.models.recurrence_policy;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurrencePolicyDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurrencePolicyDraft recurrencePolicyDraft = RecurrencePolicyDraft.builder()
 *             .key("{key}")
 *             .schedule(scheduleBuilder -> scheduleBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurrencePolicyDraftBuilder implements Builder<RecurrencePolicyDraft> {

    private String key;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    private com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleDraft schedule;

    /**
     *  <p>User-defined unique identifier for the RecurrencePolicy.</p>
     * @param key value to be set
     * @return Builder
     */

    public RecurrencePolicyDraftBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Name of the RecurrencePolicy.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public RecurrencePolicyDraftBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the RecurrencePolicy.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public RecurrencePolicyDraftBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the RecurrencePolicy.</p>
     * @param name value to be set
     * @return Builder
     */

    public RecurrencePolicyDraftBuilder name(@Nullable final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Description of the RecurrencePolicy.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public RecurrencePolicyDraftBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Description of the RecurrencePolicy.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public RecurrencePolicyDraftBuilder withDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Description of the RecurrencePolicy.</p>
     * @param description value to be set
     * @return Builder
     */

    public RecurrencePolicyDraftBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Schedule where the recurrence is defined.</p>
     * @param schedule value to be set
     * @return Builder
     */

    public RecurrencePolicyDraftBuilder schedule(
            final com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleDraft schedule) {
        this.schedule = schedule;
        return this;
    }

    /**
     *  <p>Schedule where the recurrence is defined.</p>
     * @param builder function to build the schedule value
     * @return Builder
     */

    public RecurrencePolicyDraftBuilder schedule(
            Function<com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleDraftBuilder, Builder<? extends com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleDraft>> builder) {
        this.schedule = builder
                .apply(com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>User-defined unique identifier for the RecurrencePolicy.</p>
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
     *  <p>Schedule where the recurrence is defined.</p>
     * @return schedule
     */

    public com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleDraft getSchedule() {
        return this.schedule;
    }

    /**
     * builds RecurrencePolicyDraft with checking for non-null required values
     * @return RecurrencePolicyDraft
     */
    public RecurrencePolicyDraft build() {
        Objects.requireNonNull(key, RecurrencePolicyDraft.class + ": key is missing");
        Objects.requireNonNull(schedule, RecurrencePolicyDraft.class + ": schedule is missing");
        return new RecurrencePolicyDraftImpl(key, name, description, schedule);
    }

    /**
     * builds RecurrencePolicyDraft without checking for non-null required values
     * @return RecurrencePolicyDraft
     */
    public RecurrencePolicyDraft buildUnchecked() {
        return new RecurrencePolicyDraftImpl(key, name, description, schedule);
    }

    /**
     * factory method for an instance of RecurrencePolicyDraftBuilder
     * @return builder
     */
    public static RecurrencePolicyDraftBuilder of() {
        return new RecurrencePolicyDraftBuilder();
    }

    /**
     * create builder for RecurrencePolicyDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurrencePolicyDraftBuilder of(final RecurrencePolicyDraft template) {
        RecurrencePolicyDraftBuilder builder = new RecurrencePolicyDraftBuilder();
        builder.key = template.getKey();
        builder.name = template.getName();
        builder.description = template.getDescription();
        builder.schedule = template.getSchedule();
        return builder;
    }

}
