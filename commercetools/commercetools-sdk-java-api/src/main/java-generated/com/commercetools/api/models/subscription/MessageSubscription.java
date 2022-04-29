
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MessageSubscriptionImpl.class)
public interface MessageSubscription {

    @NotNull
    @JsonProperty("resourceTypeId")
    public String getResourceTypeId();

    @JsonProperty("types")
    public List<String> getTypes();

    public void setResourceTypeId(final String resourceTypeId);

    @JsonIgnore
    public void setTypes(final String... types);

    public void setTypes(final List<String> types);

    public static MessageSubscription of() {
        return new MessageSubscriptionImpl();
    }

    public static MessageSubscription of(final MessageSubscription template) {
        MessageSubscriptionImpl instance = new MessageSubscriptionImpl();
        instance.setResourceTypeId(template.getResourceTypeId());
        instance.setTypes(template.getTypes());
        return instance;
    }

    public static MessageSubscriptionBuilder builder() {
        return MessageSubscriptionBuilder.of();
    }

    public static MessageSubscriptionBuilder builder(final MessageSubscription template) {
        return MessageSubscriptionBuilder.of(template);
    }

    default <T> T withMessageSubscription(Function<MessageSubscription, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MessageSubscription> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MessageSubscription>() {
            @Override
            public String toString() {
                return "TypeReference<MessageSubscription>";
            }
        };
    }
}
