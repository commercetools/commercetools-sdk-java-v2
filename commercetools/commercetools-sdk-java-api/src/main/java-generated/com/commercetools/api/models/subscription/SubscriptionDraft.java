package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.ChangeSubscription;
import com.commercetools.api.models.subscription.DeliveryFormat;
import com.commercetools.api.models.subscription.Destination;
import com.commercetools.api.models.subscription.MessageSubscription;
import com.commercetools.api.models.subscription.SubscriptionDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 *  <p>Either <code>messages</code> or <code>changes</code> must be set.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SubscriptionDraft subscriptionDraft = SubscriptionDraft.builder()
 *             .destination(destinationBuilder -> destinationBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = SubscriptionDraftImpl.class)
public interface SubscriptionDraft extends com.commercetools.api.models.WithKey, io.vrap.rmf.base.client.Draft<SubscriptionDraft> {


    /**
     *  <p>Change notifications to be subscribed to.</p>
     * @return changes
     */
    @Valid
    @JsonProperty("changes")
    public List<ChangeSubscription> getChanges();
    /**
     *  <p>Messaging service to which the messages are sent.</p>
     * @return destination
     */
    @NotNull
    @Valid
    @JsonProperty("destination")
    public Destination getDestination();
    /**
     *  <p>User-defined unique identifier for the Subscription.</p>
     * @return key
     */
    
    @JsonProperty("key")
    public String getKey();
    /**
     *  <p>Messages to be subscribed to.</p>
     * @return messages
     */
    @Valid
    @JsonProperty("messages")
    public List<MessageSubscription> getMessages();
    /**
     *  <p>Format in which the payload is delivered. When not provided, the PlatformFormat is selected by default.</p>
     * @return format
     */
    @Valid
    @JsonProperty("format")
    public DeliveryFormat getFormat();

    /**
     *  <p>Change notifications to be subscribed to.</p>
     * @param changes values to be set
     */
    
    @JsonIgnore
    public void setChanges(final ChangeSubscription ...changes);
    /**
     *  <p>Change notifications to be subscribed to.</p>
     * @param changes values to be set
     */
    
    public void setChanges(final List<ChangeSubscription> changes);
    
    /**
     *  <p>Messaging service to which the messages are sent.</p>
     * @param destination value to be set
     */
    
    public void setDestination(final Destination destination);
    
    
    /**
     *  <p>User-defined unique identifier for the Subscription.</p>
     * @param key value to be set
     */
    
    public void setKey(final String key);
    
    
    /**
     *  <p>Messages to be subscribed to.</p>
     * @param messages values to be set
     */
    
    @JsonIgnore
    public void setMessages(final MessageSubscription ...messages);
    /**
     *  <p>Messages to be subscribed to.</p>
     * @param messages values to be set
     */
    
    public void setMessages(final List<MessageSubscription> messages);
    
    /**
     *  <p>Format in which the payload is delivered. When not provided, the PlatformFormat is selected by default.</p>
     * @param format value to be set
     */
    
    public void setFormat(final DeliveryFormat format);
    

    /**
     * factory method
     * @return instance of SubscriptionDraft
     */
    public static SubscriptionDraft of(){
        return new SubscriptionDraftImpl();
    }
    

    /**
     * factory method to create a shallow copy SubscriptionDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static SubscriptionDraft of(final SubscriptionDraft template) {
        SubscriptionDraftImpl instance = new SubscriptionDraftImpl();
        instance.setChanges(template.getChanges());
        instance.setDestination(template.getDestination());
        instance.setKey(template.getKey());
        instance.setMessages(template.getMessages());
        instance.setFormat(template.getFormat());
        return instance;
    }

    /**
     * factory method to create a deep copy of SubscriptionDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static SubscriptionDraft deepCopy(@Nullable final SubscriptionDraft template) {
        if (template == null) {
            return null;
        }
        SubscriptionDraftImpl instance = new SubscriptionDraftImpl();
        instance.setChanges(Optional.ofNullable(template.getChanges())
                .map(t -> t.stream().map(com.commercetools.api.models.subscription.ChangeSubscription::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        instance.setDestination(com.commercetools.api.models.subscription.Destination.deepCopy(template.getDestination()));
        instance.setKey(template.getKey());
        instance.setMessages(Optional.ofNullable(template.getMessages())
                .map(t -> t.stream().map(com.commercetools.api.models.subscription.MessageSubscription::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        instance.setFormat(com.commercetools.api.models.subscription.DeliveryFormat.deepCopy(template.getFormat()));
        return instance;
    }

    /**
     * builder factory method for SubscriptionDraft
     * @return builder
     */
    public static SubscriptionDraftBuilder builder() {
        return SubscriptionDraftBuilder.of();
    }
    
    /**
     * create builder for SubscriptionDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SubscriptionDraftBuilder builder(final SubscriptionDraft template) {
        return SubscriptionDraftBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withSubscriptionDraft(Function<SubscriptionDraft, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<SubscriptionDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SubscriptionDraft>() {
            @Override
            public String toString() {
                return "TypeReference<SubscriptionDraft>";
            }
        };
    }
}
