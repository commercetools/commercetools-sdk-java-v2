package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.Destination;
import com.commercetools.api.models.subscription.SubscriptionUpdateAction;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>A test message is sent to ensure the correct configuration of the Destination. If the message cannot be delivered, the update will fail. The payload of the test message is a notification of type ResourceCreated for the <code>resourceTypeId</code> <code>subscription</code>. The <code>status</code> will change to Healthy, if it isn't already.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class SubscriptionChangeDestinationActionImpl implements SubscriptionChangeDestinationAction, ModelBase {

    
    private String action;
    
    
    private com.commercetools.api.models.subscription.Destination destination;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SubscriptionChangeDestinationActionImpl(@JsonProperty("destination") final com.commercetools.api.models.subscription.Destination destination) {
        this.destination = destination;
        this.action =  CHANGE_DESTINATION;
    }
    /**
     * create empty instance
     */
    public SubscriptionChangeDestinationActionImpl() {
        this.action =  CHANGE_DESTINATION;
    }

    /**
     *
     */
    
    public String getAction(){
        return this.action;
    }
    
    /**
     *  <p>New value to set. Must not be empty.</p>
     */
    
    public com.commercetools.api.models.subscription.Destination getDestination(){
        return this.destination;
    }

    
    public void setDestination(final com.commercetools.api.models.subscription.Destination destination){
        this.destination = destination;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        SubscriptionChangeDestinationActionImpl that = (SubscriptionChangeDestinationActionImpl) o;
    
        return new EqualsBuilder()
                .append(action, that.action)
                .append(destination, that.destination)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(action)
            .append(destination)
            .toHashCode();
    }

}
