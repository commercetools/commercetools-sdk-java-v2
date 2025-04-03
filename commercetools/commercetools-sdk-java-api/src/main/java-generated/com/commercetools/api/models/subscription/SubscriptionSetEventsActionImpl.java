
package com.commercetools.api.models.subscription;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * SubscriptionSetEventsAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SubscriptionSetEventsActionImpl implements SubscriptionSetEventsAction, ModelBase {

    private String action;

    private java.util.List<com.commercetools.api.models.subscription.EventSubscription> messages;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SubscriptionSetEventsActionImpl(
            @JsonProperty("messages") final java.util.List<com.commercetools.api.models.subscription.EventSubscription> messages) {
        this.messages = messages;
        this.action = SET_EVENTS;
    }

    /**
     * create empty instance
     */
    public SubscriptionSetEventsActionImpl() {
        this.action = SET_EVENTS;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. Can only be unset if either <code>messages</code> or <code>changes</code> is set.</p>
     */

    public java.util.List<com.commercetools.api.models.subscription.EventSubscription> getMessages() {
        return this.messages;
    }

    public void setMessages(final com.commercetools.api.models.subscription.EventSubscription... messages) {
        this.messages = new ArrayList<>(Arrays.asList(messages));
    }

    public void setMessages(
            final java.util.List<com.commercetools.api.models.subscription.EventSubscription> messages) {
        this.messages = messages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SubscriptionSetEventsActionImpl that = (SubscriptionSetEventsActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(messages, that.messages)
                .append(action, that.action)
                .append(messages, that.messages)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(messages).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("messages", messages)
                .build();
    }

}
