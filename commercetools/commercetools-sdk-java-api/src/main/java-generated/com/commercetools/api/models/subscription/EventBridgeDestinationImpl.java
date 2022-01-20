
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

/**
*  <p><a href="https://aws.amazon.com/eventbridge/">AWS EventBridge</a> can be used to push events and messages to a serverless event bus that can forward them to AWS SQS, SNS, Lambda, and other AWS services based on forwarding rules.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class EventBridgeDestinationImpl implements EventBridgeDestination, ModelBase {

    private String type;

    private String region;

    private String accountId;

    @JsonCreator
    EventBridgeDestinationImpl(@JsonProperty("region") final String region,
            @JsonProperty("accountId") final String accountId) {
        this.region = region;
        this.accountId = accountId;
        this.type = EVENT_BRIDGE;
    }

    public EventBridgeDestinationImpl() {
        this.type = EVENT_BRIDGE;
    }

    public String getType() {
        return this.type;
    }

    /**
    *  <p>AWS region to which commercetools sends the events.</p>
    */
    public String getRegion() {
        return this.region;
    }

    /**
    *  <p>ID of the AWS account that receives events from the commercetools platform.</p>
    */
    public String getAccountId() {
        return this.accountId;
    }

    public void setRegion(final String region) {
        this.region = region;
    }

    public void setAccountId(final String accountId) {
        this.accountId = accountId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        EventBridgeDestinationImpl that = (EventBridgeDestinationImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(region, that.region)
                .append(accountId, that.accountId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(region).append(accountId).toHashCode();
    }

}
