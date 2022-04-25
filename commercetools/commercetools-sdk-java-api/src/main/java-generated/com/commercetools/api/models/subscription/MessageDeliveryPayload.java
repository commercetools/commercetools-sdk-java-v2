
package com.commercetools.api.models.subscription;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MessageDeliveryPayloadImpl.class)
public interface MessageDeliveryPayload extends DeliveryPayload {

    String MESSAGE = "Message";

    @NotNull
    @JsonProperty("id")
    public String getId();

    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    @NotNull
    @JsonProperty("sequenceNumber")
    public Long getSequenceNumber();

    @NotNull
    @JsonProperty("resourceVersion")
    public Long getResourceVersion();

    @NotNull
    @Valid
    @JsonProperty("payloadNotIncluded")
    public PayloadNotIncluded getPayloadNotIncluded();

    public void setId(final String id);

    public void setVersion(final Long version);

    public void setCreatedAt(final ZonedDateTime createdAt);

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public void setSequenceNumber(final Long sequenceNumber);

    public void setResourceVersion(final Long resourceVersion);

    public void setPayloadNotIncluded(final PayloadNotIncluded payloadNotIncluded);

    public static MessageDeliveryPayload of() {
        return new MessageDeliveryPayloadImpl();
    }

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

    public static MessageDeliveryPayloadBuilder builder() {
        return MessageDeliveryPayloadBuilder.of();
    }

    public static MessageDeliveryPayloadBuilder builder(final MessageDeliveryPayload template) {
        return MessageDeliveryPayloadBuilder.of(template);
    }

    default <T> T withMessageDeliveryPayload(Function<MessageDeliveryPayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MessageDeliveryPayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MessageDeliveryPayload>() {
            @Override
            public String toString() {
                return "TypeReference<MessageDeliveryPayload>";
            }
        };
    }
}
