package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.Destination;
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
 *  <p>AWS EventBridge can be used to push events and messages to a serverless event bus that can forward them to AWS SQS, SNS, Lambda, and other AWS services based on forwarding rules. Once the Subscription is created, an equivalent "partner event source" is created in AWS EventBridge. This event source must be associated with an event bus for the Subscription setup to be complete.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class EventBridgeDestinationImpl implements EventBridgeDestination, ModelBase {

    
    private String type;
    
    
    private String region;
    
    
    private String accountId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    EventBridgeDestinationImpl(@JsonProperty("region") final String region, @JsonProperty("accountId") final String accountId) {
        this.region = region;
        this.accountId = accountId;
        this.type =  EVENT_BRIDGE;
    }
    /**
     * create empty instance
     */
    public EventBridgeDestinationImpl() {
        this.type =  EVENT_BRIDGE;
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>AWS region that receives the events.</p>
     */
    
    public String getRegion(){
        return this.region;
    }
    
    /**
     *  <p>ID of the AWS account that receives the events.</p>
     */
    
    public String getAccountId(){
        return this.accountId;
    }

    
    public void setRegion(final String region){
        this.region = region;
    }
    
    
    public void setAccountId(final String accountId){
        this.accountId = accountId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        EventBridgeDestinationImpl that = (EventBridgeDestinationImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(region, that.region)
                .append(accountId, that.accountId)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(region)
            .append(accountId)
            .toHashCode();
    }

}
