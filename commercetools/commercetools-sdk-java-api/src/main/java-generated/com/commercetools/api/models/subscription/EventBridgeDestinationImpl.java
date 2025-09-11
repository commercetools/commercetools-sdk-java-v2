
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
 *  <p><span>AWS EventBridge</span> can be used to push events and messages to a serverless event bus that can forward them to AWS SQS, SNS, Lambda, and other AWS services based on forwarding rules. Once the Subscription is created, an equivalent "partner event source" is created in AWS EventBridge. This event source must be associated with an event bus for the Subscription setup to be complete.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class EventBridgeDestinationImpl implements EventBridgeDestination, ModelBase {

    private String type;

    private String region;

    private String accountId;

    private String source;

    /**
     * create instance with all properties
     */
    @JsonCreator
    EventBridgeDestinationImpl(@JsonProperty("region") final String region,
            @JsonProperty("accountId") final String accountId, @JsonProperty("source") final String source) {
        this.region = region;
        this.accountId = accountId;
        this.source = source;
        this.type = EVENT_BRIDGE;
    }

    /**
     * create empty instance
     */
    public EventBridgeDestinationImpl() {
        this.type = EVENT_BRIDGE;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>AWS region that receives the events.</p>
     */

    public String getRegion() {
        return this.region;
    }

    /**
     *  <p>ID of the AWS account that receives the events.</p>
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     *  <p>URN for the EventBridge destination.</p>
     */

    public String getSource() {
        return this.source;
    }

    public void setRegion(final String region) {
        this.region = region;
    }

    public void setAccountId(final String accountId) {
        this.accountId = accountId;
    }

    public void setSource(final String source) {
        this.source = source;
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
                .append(source, that.source)
                .append(type, that.type)
                .append(region, that.region)
                .append(accountId, that.accountId)
                .append(source, that.source)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(region).append(accountId).append(source).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("region", region)
                .append("accountId", accountId)
                .append("source", source)
                .build();
    }

    @Override
    public EventBridgeDestination copyDeep() {
        return EventBridgeDestination.deepCopy(this);
    }
}
