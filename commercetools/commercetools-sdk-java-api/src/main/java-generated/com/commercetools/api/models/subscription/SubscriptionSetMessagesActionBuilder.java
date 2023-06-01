package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.MessageSubscription;
import com.commercetools.api.models.subscription.SubscriptionUpdateAction;
import com.commercetools.api.models.subscription.SubscriptionSetMessagesAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SubscriptionSetMessagesActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SubscriptionSetMessagesAction subscriptionSetMessagesAction = SubscriptionSetMessagesAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class SubscriptionSetMessagesActionBuilder implements Builder<SubscriptionSetMessagesAction> {

    
    @Nullable
    private java.util.List<com.commercetools.api.models.subscription.MessageSubscription> messages;

    /**
     *  <p>Value to set. Can only be unset if <code>changes</code> is set.</p>
     * @param messages value to be set
     * @return Builder
     */
    
    public SubscriptionSetMessagesActionBuilder messages(@Nullable final com.commercetools.api.models.subscription.MessageSubscription ...messages) {
        this.messages = new ArrayList<>(Arrays.asList(messages));
        return this;
    }
    
    /**
     *  <p>Value to set. Can only be unset if <code>changes</code> is set.</p>
     * @param messages value to be set
     * @return Builder
     */
    
    public SubscriptionSetMessagesActionBuilder messages(@Nullable final java.util.List<com.commercetools.api.models.subscription.MessageSubscription> messages) {
        this.messages = messages;
        return this;
    }
    
    /**
     *  <p>Value to set. Can only be unset if <code>changes</code> is set.</p>
     * @param messages value to be set
     * @return Builder
     */
    
    public SubscriptionSetMessagesActionBuilder plusMessages(@Nullable final com.commercetools.api.models.subscription.MessageSubscription ...messages) {
        if (this.messages == null) {
            this.messages = new ArrayList<>();
        }
        this.messages.addAll(Arrays.asList(messages));
        return this;
    }
    
    
    
    /**
     *  <p>Value to set. Can only be unset if <code>changes</code> is set.</p>
     * @param builder function to build the messages value
     * @return Builder
     */
    
    public SubscriptionSetMessagesActionBuilder plusMessages(Function<com.commercetools.api.models.subscription.MessageSubscriptionBuilder, com.commercetools.api.models.subscription.MessageSubscriptionBuilder> builder) {
        if (this.messages == null) {
            this.messages = new ArrayList<>();
        }
        this.messages.add(builder.apply(com.commercetools.api.models.subscription.MessageSubscriptionBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Value to set. Can only be unset if <code>changes</code> is set.</p>
     * @param builder function to build the messages value
     * @return Builder
     */
    
    public SubscriptionSetMessagesActionBuilder withMessages(Function<com.commercetools.api.models.subscription.MessageSubscriptionBuilder, com.commercetools.api.models.subscription.MessageSubscriptionBuilder> builder) {
        this.messages = new ArrayList<>();
        this.messages.add(builder.apply(com.commercetools.api.models.subscription.MessageSubscriptionBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>Value to set. Can only be unset if <code>changes</code> is set.</p>
     * @param builder function to build the messages value
     * @return Builder
     */
    
    public SubscriptionSetMessagesActionBuilder addMessages(Function<com.commercetools.api.models.subscription.MessageSubscriptionBuilder, com.commercetools.api.models.subscription.MessageSubscription> builder) {
        return plusMessages(builder.apply(com.commercetools.api.models.subscription.MessageSubscriptionBuilder.of()));
    }
    
    /**
     *  <p>Value to set. Can only be unset if <code>changes</code> is set.</p>
     * @param builder function to build the messages value
     * @return Builder
     */
    
    public SubscriptionSetMessagesActionBuilder setMessages(Function<com.commercetools.api.models.subscription.MessageSubscriptionBuilder, com.commercetools.api.models.subscription.MessageSubscription> builder) {
        return messages(builder.apply(com.commercetools.api.models.subscription.MessageSubscriptionBuilder.of()));
    }
                    

    /**
     *  <p>Value to set. Can only be unset if <code>changes</code> is set.</p>
     * @return messages
     */
    
    @Nullable
    public java.util.List<com.commercetools.api.models.subscription.MessageSubscription> getMessages(){
        return this.messages;
    }

    /**
     * builds SubscriptionSetMessagesAction with checking for non-null required values
     * @return SubscriptionSetMessagesAction
     */
    public SubscriptionSetMessagesAction build() {
        return new SubscriptionSetMessagesActionImpl(messages);
    }
    
    /**
     * builds SubscriptionSetMessagesAction without checking for non-null required values
     * @return SubscriptionSetMessagesAction
     */
    public SubscriptionSetMessagesAction buildUnchecked() {
        return new SubscriptionSetMessagesActionImpl(messages);
    }

    /**
     * factory method for an instance of SubscriptionSetMessagesActionBuilder
     * @return builder 
     */
    public static SubscriptionSetMessagesActionBuilder of() {
        return new SubscriptionSetMessagesActionBuilder();
    }

    /**
     * create builder for SubscriptionSetMessagesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SubscriptionSetMessagesActionBuilder of(final SubscriptionSetMessagesAction template) {
        SubscriptionSetMessagesActionBuilder builder = new SubscriptionSetMessagesActionBuilder();
        builder.messages = template.getMessages();
        return builder;
    }

}
