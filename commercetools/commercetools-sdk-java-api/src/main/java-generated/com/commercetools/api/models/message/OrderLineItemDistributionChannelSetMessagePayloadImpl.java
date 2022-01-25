
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OrderLineItemDistributionChannelSetMessagePayloadImpl
        implements OrderLineItemDistributionChannelSetMessagePayload, ModelBase {

    private String type;

    private String lineItemId;

    private com.commercetools.api.models.channel.ChannelReference distributionChannel;

    @JsonCreator
    OrderLineItemDistributionChannelSetMessagePayloadImpl(@JsonProperty("lineItemId") final String lineItemId,
            @JsonProperty("distributionChannel") final com.commercetools.api.models.channel.ChannelReference distributionChannel) {
        this.lineItemId = lineItemId;
        this.distributionChannel = distributionChannel;
        this.type = ORDER_LINE_ITEM_DISTRIBUTION_CHANNEL_SET;
    }

    public OrderLineItemDistributionChannelSetMessagePayloadImpl() {
        this.type = ORDER_LINE_ITEM_DISTRIBUTION_CHANNEL_SET;
    }

    public String getType() {
        return this.type;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
    *  <p><a href="/../api/types#reference">Reference</a> to a <a href="ctp:api:type:Channel">Channel</a>.</p>
    */
    public com.commercetools.api.models.channel.ChannelReference getDistributionChannel() {
        return this.distributionChannel;
    }

    public void setLineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
    }

    public void setDistributionChannel(
            final com.commercetools.api.models.channel.ChannelReference distributionChannel) {
        this.distributionChannel = distributionChannel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderLineItemDistributionChannelSetMessagePayloadImpl that = (OrderLineItemDistributionChannelSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(lineItemId, that.lineItemId)
                .append(distributionChannel, that.distributionChannel)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(lineItemId).append(distributionChannel).toHashCode();
    }

}
