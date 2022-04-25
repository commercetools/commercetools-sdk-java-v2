
package com.commercetools.api.models.subscription;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SubscriptionImpl.class)
public interface Subscription extends BaseResource, com.commercetools.api.models.DomainResource<Subscription> {

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

    /**
    *  <p>Present on resources created after 2019-02-01 except for <a href="/client-logging#events-tracked">events not tracked</a>.</p>
    */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
    *  <p>Present on resources created after 2019-02-01 except for <a href="/client-logging#events-tracked">events not tracked</a>.</p>
    */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    @NotNull
    @Valid
    @JsonProperty("changes")
    public List<ChangeSubscription> getChanges();

    @NotNull
    @Valid
    @JsonProperty("destination")
    public Destination getDestination();

    @JsonProperty("key")
    public String getKey();

    @NotNull
    @Valid
    @JsonProperty("messages")
    public List<MessageSubscription> getMessages();

    @NotNull
    @Valid
    @JsonProperty("format")
    public DeliveryFormat getFormat();

    @NotNull
    @JsonProperty("status")
    public SubscriptionHealthStatus getStatus();

    public void setId(final String id);

    public void setVersion(final Long version);

    public void setCreatedAt(final ZonedDateTime createdAt);

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    public void setCreatedBy(final CreatedBy createdBy);

    @JsonIgnore
    public void setChanges(final ChangeSubscription... changes);

    public void setChanges(final List<ChangeSubscription> changes);

    public void setDestination(final Destination destination);

    public void setKey(final String key);

    @JsonIgnore
    public void setMessages(final MessageSubscription... messages);

    public void setMessages(final List<MessageSubscription> messages);

    public void setFormat(final DeliveryFormat format);

    public void setStatus(final SubscriptionHealthStatus status);

    public static Subscription of() {
        return new SubscriptionImpl();
    }

    public static Subscription of(final Subscription template) {
        SubscriptionImpl instance = new SubscriptionImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setChanges(template.getChanges());
        instance.setDestination(template.getDestination());
        instance.setKey(template.getKey());
        instance.setMessages(template.getMessages());
        instance.setFormat(template.getFormat());
        instance.setStatus(template.getStatus());
        return instance;
    }

    public static SubscriptionBuilder builder() {
        return SubscriptionBuilder.of();
    }

    public static SubscriptionBuilder builder(final Subscription template) {
        return SubscriptionBuilder.of(template);
    }

    default <T> T withSubscription(Function<Subscription, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<Subscription> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Subscription>() {
            @Override
            public String toString() {
                return "TypeReference<Subscription>";
            }
        };
    }
}
