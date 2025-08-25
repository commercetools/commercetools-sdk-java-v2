
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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetExpiresAtAction" rel="nofollow">Set Expires At</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderExpiresAtSetMessage recurringOrderExpiresAtSetMessage = RecurringOrderExpiresAtSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .newExpiresAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .oldExpiresAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("RecurringOrderExpiresAtSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringOrderExpiresAtSetMessageImpl.class)
public interface RecurringOrderExpiresAtSetMessage extends Message {

    /**
     * discriminator value for RecurringOrderExpiresAtSetMessage
     */
    String RECURRING_ORDER_EXPIRES_AT_SET = "RecurringOrderExpiresAtSet";

    /**
     *  <p>Expiration date and time of the Recurring Order after the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetExpiresAtAction" rel="nofollow">Set Expires At</a> update action.</p>
     * @return newExpiresAt
     */
    @NotNull
    @JsonProperty("newExpiresAt")
    public ZonedDateTime getNewExpiresAt();

    /**
     *  <p>Expiration date and time of the Recurring Order before the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetExpiresAtAction" rel="nofollow">Set Expires At</a> update action.</p>
     * @return oldExpiresAt
     */
    @NotNull
    @JsonProperty("oldExpiresAt")
    public ZonedDateTime getOldExpiresAt();

    /**
     *  <p>Expiration date and time of the Recurring Order after the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetExpiresAtAction" rel="nofollow">Set Expires At</a> update action.</p>
     * @param newExpiresAt value to be set
     */

    public void setNewExpiresAt(final ZonedDateTime newExpiresAt);

    /**
     *  <p>Expiration date and time of the Recurring Order before the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetExpiresAtAction" rel="nofollow">Set Expires At</a> update action.</p>
     * @param oldExpiresAt value to be set
     */

    public void setOldExpiresAt(final ZonedDateTime oldExpiresAt);

    /**
     * factory method
     * @return instance of RecurringOrderExpiresAtSetMessage
     */
    public static RecurringOrderExpiresAtSetMessage of() {
        return new RecurringOrderExpiresAtSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy RecurringOrderExpiresAtSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringOrderExpiresAtSetMessage of(final RecurringOrderExpiresAtSetMessage template) {
        RecurringOrderExpiresAtSetMessageImpl instance = new RecurringOrderExpiresAtSetMessageImpl();
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
        instance.setNewExpiresAt(template.getNewExpiresAt());
        instance.setOldExpiresAt(template.getOldExpiresAt());
        return instance;
    }

    public RecurringOrderExpiresAtSetMessage copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrderExpiresAtSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrderExpiresAtSetMessage deepCopy(
            @Nullable final RecurringOrderExpiresAtSetMessage template) {
        if (template == null) {
            return null;
        }
        RecurringOrderExpiresAtSetMessageImpl instance = new RecurringOrderExpiresAtSetMessageImpl();
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
        instance.setNewExpiresAt(template.getNewExpiresAt());
        instance.setOldExpiresAt(template.getOldExpiresAt());
        return instance;
    }

    /**
     * builder factory method for RecurringOrderExpiresAtSetMessage
     * @return builder
     */
    public static RecurringOrderExpiresAtSetMessageBuilder builder() {
        return RecurringOrderExpiresAtSetMessageBuilder.of();
    }

    /**
     * create builder for RecurringOrderExpiresAtSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderExpiresAtSetMessageBuilder builder(final RecurringOrderExpiresAtSetMessage template) {
        return RecurringOrderExpiresAtSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrderExpiresAtSetMessage(Function<RecurringOrderExpiresAtSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<RecurringOrderExpiresAtSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<RecurringOrderExpiresAtSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrderExpiresAtSetMessage>";
            }
        };
    }
}
