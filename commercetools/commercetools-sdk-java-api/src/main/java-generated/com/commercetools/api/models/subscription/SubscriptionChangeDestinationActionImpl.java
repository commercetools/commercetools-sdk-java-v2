
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
 *  <p>A test notification is sent to ensure the correct configuration of the Destination. If the notification cannot be delivered, the update will fail. The payload of the test notification is of type ResourceCreated for the <code>resourceTypeId</code> <code>subscription</code>. The <code>status</code> will change to Healthy, if it isn't already.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SubscriptionChangeDestinationActionImpl implements SubscriptionChangeDestinationAction, ModelBase {

    private String action;

    private com.commercetools.api.models.subscription.Destination destination;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SubscriptionChangeDestinationActionImpl(
            @JsonProperty("destination") final com.commercetools.api.models.subscription.Destination destination) {
        this.destination = destination;
        this.action = CHANGE_DESTINATION;
    }

    /**
     * create empty instance
     */
    public SubscriptionChangeDestinationActionImpl() {
        this.action = CHANGE_DESTINATION;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     */

    public com.commercetools.api.models.subscription.Destination getDestination() {
        return this.destination;
    }

    public void setDestination(final com.commercetools.api.models.subscription.Destination destination) {
        this.destination = destination;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SubscriptionChangeDestinationActionImpl that = (SubscriptionChangeDestinationActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(destination, that.destination)
                .append(action, that.action)
                .append(destination, that.destination)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(destination).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("destination", destination)
                .build();
    }

    @Override
    public SubscriptionChangeDestinationAction copyDeep() {
        return SubscriptionChangeDestinationAction.deepCopy(this);
    }
}
