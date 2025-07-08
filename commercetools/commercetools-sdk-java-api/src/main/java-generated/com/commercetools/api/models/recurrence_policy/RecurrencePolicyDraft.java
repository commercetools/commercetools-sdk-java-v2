
package com.commercetools.api.models.recurrence_policy;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * RecurrencePolicyDraft
 *
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
@JsonDeserialize(as = RecurrencePolicyDraftImpl.class)
public interface RecurrencePolicyDraft extends io.vrap.rmf.base.client.Draft<RecurrencePolicyDraft> {

    /**
     *  <p>User-defined unique identifier for the RecurrencePolicy.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Name of the RecurrencePolicy.</p>
     * @return name
     */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>Description of the RecurrencePolicy.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>Schedule where the recurrence is defined.</p>
     * @return schedule
     */
    @NotNull
    @Valid
    @JsonProperty("schedule")
    public RecurrencePolicyScheduleDraft getSchedule();

    /**
     *  <p>User-defined unique identifier for the RecurrencePolicy.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Name of the RecurrencePolicy.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>Description of the RecurrencePolicy.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     *  <p>Schedule where the recurrence is defined.</p>
     * @param schedule value to be set
     */

    public void setSchedule(final RecurrencePolicyScheduleDraft schedule);

    /**
     * factory method
     * @return instance of RecurrencePolicyDraft
     */
    public static RecurrencePolicyDraft of() {
        return new RecurrencePolicyDraftImpl();
    }

    /**
     * factory method to create a shallow copy RecurrencePolicyDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurrencePolicyDraft of(final RecurrencePolicyDraft template) {
        RecurrencePolicyDraftImpl instance = new RecurrencePolicyDraftImpl();
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setSchedule(template.getSchedule());
        return instance;
    }

    public RecurrencePolicyDraft copyDeep();

    /**
     * factory method to create a deep copy of RecurrencePolicyDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurrencePolicyDraft deepCopy(@Nullable final RecurrencePolicyDraft template) {
        if (template == null) {
            return null;
        }
        RecurrencePolicyDraftImpl instance = new RecurrencePolicyDraftImpl();
        instance.setKey(template.getKey());
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getDescription()));
        instance.setSchedule(com.commercetools.api.models.recurrence_policy.RecurrencePolicyScheduleDraft
                .deepCopy(template.getSchedule()));
        return instance;
    }

    /**
     * builder factory method for RecurrencePolicyDraft
     * @return builder
     */
    public static RecurrencePolicyDraftBuilder builder() {
        return RecurrencePolicyDraftBuilder.of();
    }

    /**
     * create builder for RecurrencePolicyDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurrencePolicyDraftBuilder builder(final RecurrencePolicyDraft template) {
        return RecurrencePolicyDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurrencePolicyDraft(Function<RecurrencePolicyDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurrencePolicyDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurrencePolicyDraft>() {
            @Override
            public String toString() {
                return "TypeReference<RecurrencePolicyDraft>";
            }
        };
    }
}
