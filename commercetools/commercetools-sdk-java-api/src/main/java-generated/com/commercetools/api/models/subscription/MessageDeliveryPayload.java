
package com.commercetools.api.models.subscription;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>This payload is sent for a MessageSubscription.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MessageDeliveryPayload messageDeliveryPayload = MessageDeliveryPayload.builder()
 *             .projectKey("{projectKey}")
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resourceVersion(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MessageDeliveryPayloadImpl.class)
public interface MessageDeliveryPayload extends DeliveryPayload, MessageDeliveryPayloadMixin {

    /**
     * discriminator value for MessageDeliveryPayload
     */
    String MESSAGE = "Message";

    /**
     *  <p>Unique ID of the message.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Last seen version of the resource.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Date and time (UTC) the resource was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the resource was last modified.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>Used to ensure all messages of the resource are processed in correct order. The <code>sequenceNumber</code> of the next message of the resource is a successor of the <code>sequenceNumber</code> of the current message.</p>
     * @return sequenceNumber
     */
    @NotNull
    @JsonProperty("sequenceNumber")
    public Long getSequenceNumber();

    /**
     *  <p>Version of the resource on which the change was performed.</p>
     * @return resourceVersion
     */
    @NotNull
    @JsonProperty("resourceVersion")
    public Long getResourceVersion();

    /**
     *  <p>If the payload does not fit into the size limit or its format is not accepted by the messaging service, the <code>payloadNotIncluded</code> field is present.</p>
     * @return payloadNotIncluded
     */
    @Valid
    @JsonProperty("payloadNotIncluded")
    public PayloadNotIncluded getPayloadNotIncluded();

    /**
     *  <p>Unique ID of the message.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Last seen version of the resource.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Date and time (UTC) the resource was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Date and time (UTC) the resource was last modified.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>Used to ensure all messages of the resource are processed in correct order. The <code>sequenceNumber</code> of the next message of the resource is a successor of the <code>sequenceNumber</code> of the current message.</p>
     * @param sequenceNumber value to be set
     */

    public void setSequenceNumber(final Long sequenceNumber);

    /**
     *  <p>Version of the resource on which the change was performed.</p>
     * @param resourceVersion value to be set
     */

    public void setResourceVersion(final Long resourceVersion);

    /**
     *  <p>If the payload does not fit into the size limit or its format is not accepted by the messaging service, the <code>payloadNotIncluded</code> field is present.</p>
     * @param payloadNotIncluded value to be set
     */

    public void setPayloadNotIncluded(final PayloadNotIncluded payloadNotIncluded);

    /**
     * factory method
     * @return instance of MessageDeliveryPayload
     */
    public static MessageDeliveryPayload of() {
        return new MessageDeliveryPayloadImpl();
    }

    /**
     * factory method to create a shallow copy MessageDeliveryPayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static MessageDeliveryPayload of(final MessageDeliveryPayload template) {
        MessageDeliveryPayloadImpl instance = new MessageDeliveryPayloadImpl();
        instance.setProjectKey(template.getProjectKey());
        instance.setResource(template.getResource());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setPayloadNotIncluded(template.getPayloadNotIncluded());
        return instance;
    }

    /**
     * factory method to create a deep copy of MessageDeliveryPayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MessageDeliveryPayload deepCopy(@Nullable final MessageDeliveryPayload template) {
        if (template == null) {
            return null;
        }
        MessageDeliveryPayloadImpl instance = new MessageDeliveryPayloadImpl();
        instance.setProjectKey(template.getProjectKey());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setPayloadNotIncluded(
            com.commercetools.api.models.subscription.PayloadNotIncluded.deepCopy(template.getPayloadNotIncluded()));
        return instance;
    }

    /**
     * builder factory method for MessageDeliveryPayload
     * @return builder
     */
    public static MessageDeliveryPayloadBuilder builder() {
        return MessageDeliveryPayloadBuilder.of();
    }

    /**
     * create builder for MessageDeliveryPayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MessageDeliveryPayloadBuilder builder(final MessageDeliveryPayload template) {
        return MessageDeliveryPayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMessageDeliveryPayload(Function<MessageDeliveryPayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MessageDeliveryPayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MessageDeliveryPayload>() {
            @Override
            public String toString() {
                return "TypeReference<MessageDeliveryPayload>";
            }
        };
    }
}
