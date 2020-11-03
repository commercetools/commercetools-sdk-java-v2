package com.commercetools.api.models.subscription;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.subscription.ChangeSubscription;
import com.commercetools.api.models.subscription.DeliveryFormat;
import com.commercetools.api.models.subscription.Destination;
import com.commercetools.api.models.subscription.MessageSubscription;
import com.commercetools.api.models.subscription.SubscriptionHealthStatus;
import java.time.ZonedDateTime;
import com.commercetools.api.models.subscription.SubscriptionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = SubscriptionImpl.class)
public interface Subscription extends BaseResource {

    
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
    *  <p>Present on resources updated after 1/02/2019 except for events not tracked.</p>
    */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();
    /**
    *  <p>Present on resources created after 1/02/2019 except for events not tracked.</p>
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
    public void setChanges(final ChangeSubscription ...changes);
    public void setChanges(final List<ChangeSubscription> changes);
    
    public void setDestination(final Destination destination);
    
    public void setKey(final String key);
    
    @JsonIgnore
    public void setMessages(final MessageSubscription ...messages);
    public void setMessages(final List<MessageSubscription> messages);
    
    public void setFormat(final DeliveryFormat format);
    
    public void setStatus(final SubscriptionHealthStatus status);

    public static SubscriptionImpl of(){
        return new SubscriptionImpl();
    }
    

    public static SubscriptionImpl of(final Subscription template) {
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

    default <T> T withSubscription(Function<Subscription, T> helper) {
        return helper.apply(this);
    }
}
