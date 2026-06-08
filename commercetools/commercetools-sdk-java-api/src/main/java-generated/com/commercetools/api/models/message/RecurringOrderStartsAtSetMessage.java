
package com.commercetools.api.models.message;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetStartsAtAction" rel="nofollow">Set Starts At</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderStartsAtSetMessage recurringOrderStartsAtSetMessage = RecurringOrderStartsAtSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .startsAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .oldStartsAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("RecurringOrderStartsAtSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringOrderStartsAtSetMessageImpl.class)
public interface RecurringOrderStartsAtSetMessage extends Message {

    /**
     * discriminator value for RecurringOrderStartsAtSetMessage
     */
    String RECURRING_ORDER_STARTS_AT_SET = "RecurringOrderStartsAtSet";

    /**
     *  <p>Start date and time of the Recurring Order after the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetStartsAtAction" rel="nofollow">Set Starts At</a> update action.</p>
     * @return startsAt
     */
    @NotNull
    @JsonProperty("startsAt")
    public ZonedDateTime getStartsAt();

    /**
     *  <p>Start date and time of the Recurring Order before the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetStartsAtAction" rel="nofollow">Set Starts At</a> update action.</p>
     * @return oldStartsAt
     */
    @NotNull
    @JsonProperty("oldStartsAt")
    public ZonedDateTime getOldStartsAt();

    /**
     *  <p>Start date and time of the Recurring Order after the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetStartsAtAction" rel="nofollow">Set Starts At</a> update action.</p>
     * @param startsAt value to be set
     */

    public void setStartsAt(final ZonedDateTime startsAt);

    /**
     *  <p>Start date and time of the Recurring Order before the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetStartsAtAction" rel="nofollow">Set Starts At</a> update action.</p>
     * @param oldStartsAt value to be set
     */

    public void setOldStartsAt(final ZonedDateTime oldStartsAt);

    /**
     * factory method
     * @return instance of RecurringOrderStartsAtSetMessage
     */
    public static RecurringOrderStartsAtSetMessage of() {
        return new RecurringOrderStartsAtSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy RecurringOrderStartsAtSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringOrderStartsAtSetMessage of(final RecurringOrderStartsAtSetMessage template) {
        RecurringOrderStartsAtSetMessageImpl instance = new RecurringOrderStartsAtSetMessageImpl();
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
        instance.setStartsAt(template.getStartsAt());
        instance.setOldStartsAt(template.getOldStartsAt());
        return instance;
    }

    public RecurringOrderStartsAtSetMessage copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrderStartsAtSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrderStartsAtSetMessage deepCopy(@Nullable final RecurringOrderStartsAtSetMessage template) {
        if (template == null) {
            return null;
        }
        RecurringOrderStartsAtSetMessageImpl instance = new RecurringOrderStartsAtSetMessageImpl();
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
        instance.setStartsAt(template.getStartsAt());
        instance.setOldStartsAt(template.getOldStartsAt());
        return instance;
    }

    /**
     * builder factory method for RecurringOrderStartsAtSetMessage
     * @return builder
     */
    public static RecurringOrderStartsAtSetMessageBuilder builder() {
        return RecurringOrderStartsAtSetMessageBuilder.of();
    }

    /**
     * create builder for RecurringOrderStartsAtSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderStartsAtSetMessageBuilder builder(final RecurringOrderStartsAtSetMessage template) {
        return RecurringOrderStartsAtSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrderStartsAtSetMessage(Function<RecurringOrderStartsAtSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurringOrderStartsAtSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurringOrderStartsAtSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrderStartsAtSetMessage>";
            }
        };
    }
}
