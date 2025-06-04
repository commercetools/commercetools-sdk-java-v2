
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
 *  <p>For EventSubscription, the format of the payload is custom for each specific notification.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class EventSubscriptionImpl implements EventSubscription, ModelBase {

    private com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId resourceTypeId;

    private java.util.List<com.commercetools.api.models.subscription.EventType> types;

    /**
     * create instance with all properties
     */
    @JsonCreator
    EventSubscriptionImpl(
            @JsonProperty("resourceTypeId") final com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId resourceTypeId,
            @JsonProperty("types") final java.util.List<com.commercetools.api.models.subscription.EventType> types) {
        this.resourceTypeId = resourceTypeId;
        this.types = types;
    }

    /**
     * create empty instance
     */
    public EventSubscriptionImpl() {
    }

    /**
     *  <p>Unique identifier for the type of resource.</p>
     */

    public com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId getResourceTypeId() {
        return this.resourceTypeId;
    }

    /**
     *  <p>Must contain valid event types for the resource. For example, for resource type <code>import-api</code> the event type <code>ImportContainerCreated</code> is valid. If no <code>types</code> are given, the Subscription will receive all events for the defined resource type.</p>
     */

    public java.util.List<com.commercetools.api.models.subscription.EventType> getTypes() {
        return this.types;
    }

    public void setResourceTypeId(
            final com.commercetools.api.models.subscription.EventSubscriptionResourceTypeId resourceTypeId) {
        this.resourceTypeId = resourceTypeId;
    }

    public void setTypes(final com.commercetools.api.models.subscription.EventType... types) {
        this.types = new ArrayList<>(Arrays.asList(types));
    }

    public void setTypes(final java.util.List<com.commercetools.api.models.subscription.EventType> types) {
        this.types = types;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        EventSubscriptionImpl that = (EventSubscriptionImpl) o;

        return new EqualsBuilder().append(resourceTypeId, that.resourceTypeId)
                .append(types, that.types)
                .append(resourceTypeId, that.resourceTypeId)
                .append(types, that.types)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(resourceTypeId).append(types).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("resourceTypeId", resourceTypeId)
                .append("types", types)
                .build();
    }

    @Override
    public EventSubscription copyDeep() {
        return EventSubscription.deepCopy(this);
    }
}
