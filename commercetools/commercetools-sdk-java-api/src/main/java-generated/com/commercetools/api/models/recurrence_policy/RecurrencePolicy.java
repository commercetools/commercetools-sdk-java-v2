
package com.commercetools.api.models.recurrence_policy;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * RecurrencePolicy
 *
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
@JsonDeserialize(as = RecurrencePolicyImpl.class)
public interface RecurrencePolicy extends BaseResource {

    /**
     *  <p>Unique identifier of the RecurrencePolicy.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the RecurrencePolicy.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>User-defined unique identifier of the RecurrencePolicy.</p>
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
     *  <p>Schedule of the RecurrencePolicy.</p>
     * @return schedule
     */
    @NotNull
    @Valid
    @JsonProperty("schedule")
    public RecurrencePolicySchedule getSchedule();

    /**
     *  <p>Date and time (UTC) the RecurrencePolicy was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>IDs and references that created the RecurrencePolicy.</p>
     * @return createdBy
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>Date and time (UTC) the RecurrencePolicy was last updated.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>IDs and references that last modified the RecurrencePolicy.</p>
     * @return lastModifiedBy
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>Unique identifier of the RecurrencePolicy.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Current version of the RecurrencePolicy.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>User-defined unique identifier of the RecurrencePolicy.</p>
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
     *  <p>Schedule of the RecurrencePolicy.</p>
     * @param schedule value to be set
     */

    public void setSchedule(final RecurrencePolicySchedule schedule);

    /**
     *  <p>Date and time (UTC) the RecurrencePolicy was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>IDs and references that created the RecurrencePolicy.</p>
     * @param createdBy value to be set
     */

    public void setCreatedBy(final CreatedBy createdBy);

    /**
     *  <p>Date and time (UTC) the RecurrencePolicy was last updated.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>IDs and references that last modified the RecurrencePolicy.</p>
     * @param lastModifiedBy value to be set
     */

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    /**
     * factory method
     * @return instance of RecurrencePolicy
     */
    public static RecurrencePolicy of() {
        return new RecurrencePolicyImpl();
    }

    /**
     * factory method to create a shallow copy RecurrencePolicy
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurrencePolicy of(final RecurrencePolicy template) {
        RecurrencePolicyImpl instance = new RecurrencePolicyImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setKey(template.getKey());
        instance.setName(template.getName());
        instance.setDescription(template.getDescription());
        instance.setSchedule(template.getSchedule());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        return instance;
    }

    public RecurrencePolicy copyDeep();

    /**
     * factory method to create a deep copy of RecurrencePolicy
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurrencePolicy deepCopy(@Nullable final RecurrencePolicy template) {
        if (template == null) {
            return null;
        }
        RecurrencePolicyImpl instance = new RecurrencePolicyImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setKey(template.getKey());
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getDescription()));
        instance.setSchedule(
            com.commercetools.api.models.recurrence_policy.RecurrencePolicySchedule.deepCopy(template.getSchedule()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        return instance;
    }

    /**
     * builder factory method for RecurrencePolicy
     * @return builder
     */
    public static RecurrencePolicyBuilder builder() {
        return RecurrencePolicyBuilder.of();
    }

    /**
     * create builder for RecurrencePolicy instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurrencePolicyBuilder builder(final RecurrencePolicy template) {
        return RecurrencePolicyBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurrencePolicy(Function<RecurrencePolicy, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurrencePolicy> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurrencePolicy>() {
            @Override
            public String toString() {
                return "TypeReference<RecurrencePolicy>";
            }
        };
    }
}
