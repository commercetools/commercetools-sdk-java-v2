
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = SubscriptionDraftImpl.class)
public interface SubscriptionDraft extends com.commercetools.api.models.WithKey {

    /**
     *  <p>Change notifications to be subscribed to.</p>
     */
    @Valid
    @JsonProperty("changes")
    public List<ChangeSubscription> getChanges();

    /**
     *  <p>Messaging service to which the messages are sent.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("destination")
    public Destination getDestination();

    /**
     *  <p>User-defined unique identifier for the Subscription.</p>
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Messages to be subscribed to.</p>
     */
    @Valid
    @JsonProperty("messages")
    public List<MessageSubscription> getMessages();

    /**
     *  <p>Format in which the payload is delivered. When not provided, the PlatformFormat is selected by default.</p>
     */
    @Valid
    @JsonProperty("format")
    public DeliveryFormat getFormat();

    @JsonIgnore
    public void setChanges(final ChangeSubscription... changes);

    public void setChanges(final List<ChangeSubscription> changes);

    public void setDestination(final Destination destination);

    public void setKey(final String key);

    @JsonIgnore
    public void setMessages(final MessageSubscription... messages);

    public void setMessages(final List<MessageSubscription> messages);

    public void setFormat(final DeliveryFormat format);

    public static SubscriptionDraft of() {
        return new SubscriptionDraftImpl();
    }

    public static SubscriptionDraft of(final SubscriptionDraft template) {
        SubscriptionDraftImpl instance = new SubscriptionDraftImpl();
        instance.setChanges(template.getChanges());
        instance.setDestination(template.getDestination());
        instance.setKey(template.getKey());
        instance.setMessages(template.getMessages());
        instance.setFormat(template.getFormat());
        return instance;
    }

    public static SubscriptionDraftBuilder builder() {
        return SubscriptionDraftBuilder.of();
    }

    public static SubscriptionDraftBuilder builder(final SubscriptionDraft template) {
        return SubscriptionDraftBuilder.of(template);
    }

    default <T> T withSubscriptionDraft(Function<SubscriptionDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SubscriptionDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SubscriptionDraft>() {
            @Override
            public String toString() {
                return "TypeReference<SubscriptionDraft>";
            }
        };
    }
}
