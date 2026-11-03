
package com.commercetools.api.models.message;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderRequestOrderNowAction" rel="nofollow">Request Order Now</a> update action. This Message is generated when the request is accepted, not when the Order is created. The resulting Order generates the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderCreatedFromRecurringOrderMessage" rel="nofollow">OrderCreatedFromRecurringOrder</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderNowRequestedMessage recurringOrderNowRequestedMessage = RecurringOrderNowRequestedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .requestedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("RecurringOrderNowRequested")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = RecurringOrderNowRequestedMessageImpl.class)
public interface RecurringOrderNowRequestedMessage extends Message {

    /**
     * discriminator value for RecurringOrderNowRequestedMessage
     */
    String RECURRING_ORDER_NOW_REQUESTED = "RecurringOrderNowRequested";

    /**
     *  <p>Date and time (UTC) the early Order was requested.</p>
     * @return requestedAt
     */
    @NotNull
    @JsonProperty("requestedAt")
    public ZonedDateTime getRequestedAt();

    /**
     *  <p>Note provided in the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderRequestOrderNowAction" rel="nofollow">Request Order Now</a> update action.</p>
     * @return reason
     */

    @JsonProperty("reason")
    public String getReason();

    /**
     *  <p>Date and time (UTC) the early Order was requested.</p>
     * @param requestedAt value to be set
     */

    public void setRequestedAt(final ZonedDateTime requestedAt);

    /**
     *  <p>Note provided in the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderRequestOrderNowAction" rel="nofollow">Request Order Now</a> update action.</p>
     * @param reason value to be set
     */

    public void setReason(final String reason);

    /**
     * factory method
     * @return instance of RecurringOrderNowRequestedMessage
     */
    public static RecurringOrderNowRequestedMessage of() {
        return new RecurringOrderNowRequestedMessageImpl();
    }

    /**
     * factory method to create a shallow copy RecurringOrderNowRequestedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static RecurringOrderNowRequestedMessage of(final RecurringOrderNowRequestedMessage template) {
        RecurringOrderNowRequestedMessageImpl instance = new RecurringOrderNowRequestedMessageImpl();
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
        instance.setRequestedAt(template.getRequestedAt());
        instance.setReason(template.getReason());
        return instance;
    }

    public RecurringOrderNowRequestedMessage copyDeep();

    /**
     * factory method to create a deep copy of RecurringOrderNowRequestedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static RecurringOrderNowRequestedMessage deepCopy(
            @Nullable final RecurringOrderNowRequestedMessage template) {
        if (template == null) {
            return null;
        }
        RecurringOrderNowRequestedMessageImpl instance = new RecurringOrderNowRequestedMessageImpl();
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
        instance.setRequestedAt(template.getRequestedAt());
        instance.setReason(template.getReason());
        return instance;
    }

    /**
     * builder factory method for RecurringOrderNowRequestedMessage
     * @return builder
     */
    public static RecurringOrderNowRequestedMessageBuilder builder() {
        return RecurringOrderNowRequestedMessageBuilder.of();
    }

    /**
     * create builder for RecurringOrderNowRequestedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderNowRequestedMessageBuilder builder(final RecurringOrderNowRequestedMessage template) {
        return RecurringOrderNowRequestedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withRecurringOrderNowRequestedMessage(Function<RecurringOrderNowRequestedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<RecurringOrderNowRequestedMessage> typeReference() {
        return new tools.jackson.core.type.TypeReference<RecurringOrderNowRequestedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<RecurringOrderNowRequestedMessage>";
            }
        };
    }
}
