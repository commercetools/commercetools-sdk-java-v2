
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.recurrence_policy.RecurrencePolicySchedule;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Set Schedule update action.</p>
 *
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
@io.vrap.rmf.base.client.utils.json.SubType("RecurringOrderScheduleSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringOrderScheduleSetMessageImpl.class)
public interface RecurringOrderScheduleSetMessage extends Message {

    /**
     * discriminator value for RecurringOrderScheduleSetMessage
     */
    String RECURRING_ORDER_SCHEDULE_SET = "RecurringOrderScheduleSet";

    /**
     *  <p>Schedule of the Recurring Order after the Set Schedule update action.</p>
     * @return recurrencePolicySchedule
     */
    @NotNull
    @Valid
    @JsonProperty("recurrencePolicySchedule")
    public RecurrencePolicySchedule getRecurrencePolicySchedule();

    /**
     *  <p>Schedule of the Recurring Order before the Set Schedule update action.</p>
     * @return oldRecurrencePolicySchedule
     */
    @NotNull
    @Valid
    @JsonProperty("oldRecurrencePolicySchedule")
    public RecurrencePolicySchedule getOldRecurrencePolicySchedule();

    /**
     *  <p>Schedule of the Recurring Order after the Set Schedule update action.</p>
     * @param recurrencePolicySchedule value to be set
     */

    public void setRecurrencePolicySchedule(final RecurrencePolicySchedule recurrencePolicySchedule);

    /**
     *  <p>Schedule of the Recurring Order before the Set Schedule update action.</p>
     * @param oldRecurrencePolicySchedule value to be set
     */

    public void setOldRecurrencePolicySchedule(final RecurrencePolicySchedule oldRecurrencePolicySchedule);

    /**
     * factory method
     * @return instance of RecurringOrderScheduleSetMessage
     */
    public static RecurringOrderScheduleSetMessage of() {
        return new RecurringOrderScheduleSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy RecurringOrderScheduleSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringOrderScheduleSetMessage of(final RecurringOrderScheduleSetMessage template) {
        RecurringOrderScheduleSetMessageImpl instance = new RecurringOrderScheduleSetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setRecurrencePolicySchedule(template.getRecurrencePolicySchedule());
        instance.setOldRecurrencePolicySchedule(template.getOldRecurrencePolicySchedule());
        return instance;
    }

    public RecurringOrderScheduleSetMessage copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrderScheduleSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrderScheduleSetMessage deepCopy(@Nullable final RecurringOrderScheduleSetMessage template) {
        if (template == null) {
            return null;
        }
        RecurringOrderScheduleSetMessageImpl instance = new RecurringOrderScheduleSetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setRecurrencePolicySchedule(com.commercetools.api.models.recurrence_policy.RecurrencePolicySchedule
                .deepCopy(template.getRecurrencePolicySchedule()));
        instance.setOldRecurrencePolicySchedule(com.commercetools.api.models.recurrence_policy.RecurrencePolicySchedule
                .deepCopy(template.getOldRecurrencePolicySchedule()));
        return instance;
    }

    /**
     * builder factory method for RecurringOrderScheduleSetMessage
     * @return builder
     */
    public static RecurringOrderScheduleSetMessageBuilder builder() {
        return RecurringOrderScheduleSetMessageBuilder.of();
    }

    /**
     * create builder for RecurringOrderScheduleSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderScheduleSetMessageBuilder builder(final RecurringOrderScheduleSetMessage template) {
        return RecurringOrderScheduleSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrderScheduleSetMessage(Function<RecurringOrderScheduleSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurringOrderScheduleSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurringOrderScheduleSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrderScheduleSetMessage>";
            }
        };
    }
}
