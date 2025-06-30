
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

    private java.util.List<com.commercetools.api.models.subscription.EventSubscription> events;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SubscriptionSetEventsActionImpl(
            @JsonProperty("events") final java.util.List<com.commercetools.api.models.subscription.EventSubscription> events) {
        this.events = events;
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

    public java.util.List<com.commercetools.api.models.subscription.EventSubscription> getEvents() {
        return this.events;
    }

    public void setEvents(final com.commercetools.api.models.subscription.EventSubscription... events) {
        this.events = new ArrayList<>(Arrays.asList(events));
    }

    public void setEvents(final java.util.List<com.commercetools.api.models.subscription.EventSubscription> events) {
        this.events = events;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SubscriptionSetEventsActionImpl that = (SubscriptionSetEventsActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(events, that.events)
                .append(action, that.action)
                .append(events, that.events)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(events).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("events", events)
                .build();
    }

    @Override
    public SubscriptionSetEventsAction copyDeep() {
        return SubscriptionSetEventsAction.deepCopy(this);
    }
}
