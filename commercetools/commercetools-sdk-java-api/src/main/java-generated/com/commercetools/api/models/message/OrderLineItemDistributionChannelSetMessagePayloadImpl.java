
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Generated after a successful <span>Set LineItem DistributionChannel</span> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderLineItemDistributionChannelSetMessagePayloadImpl
        implements OrderLineItemDistributionChannelSetMessagePayload, ModelBase {

    private String type;

    private String lineItemId;

    private String lineItemKey;

    private com.commercetools.api.models.channel.ChannelReference distributionChannel;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderLineItemDistributionChannelSetMessagePayloadImpl(@JsonProperty("lineItemId") final String lineItemId,
            @JsonProperty("lineItemKey") final String lineItemKey,
            @JsonProperty("distributionChannel") final com.commercetools.api.models.channel.ChannelReference distributionChannel) {
        this.lineItemId = lineItemId;
        this.lineItemKey = lineItemKey;
        this.distributionChannel = distributionChannel;
        this.type = ORDER_LINE_ITEM_DISTRIBUTION_CHANNEL_SET;
    }

    /**
     * create empty instance
     */
    public OrderLineItemDistributionChannelSetMessagePayloadImpl() {
        this.type = ORDER_LINE_ITEM_DISTRIBUTION_CHANNEL_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">Line Item</a>.</p>
     */

    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p>User-defined unique identifier of the LineItem.</p>
     */

    public String getLineItemKey() {
        return this.lineItemKey;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Channel" rel="nofollow">Distribution Channel</a> that was set.</p>
     */

    public com.commercetools.api.models.channel.ChannelReference getDistributionChannel() {
        return this.distributionChannel;
    }

    public void setLineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
    }

    public void setLineItemKey(final String lineItemKey) {
        this.lineItemKey = lineItemKey;
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
                .append(lineItemKey, that.lineItemKey)
                .append(distributionChannel, that.distributionChannel)
                .append(type, that.type)
                .append(lineItemId, that.lineItemId)
                .append(lineItemKey, that.lineItemKey)
                .append(distributionChannel, that.distributionChannel)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(lineItemId)
                .append(lineItemKey)
                .append(distributionChannel)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("lineItemId", lineItemId)
                .append("lineItemKey", lineItemKey)
                .append("distributionChannel", distributionChannel)
                .build();
    }

    @Override
    public OrderLineItemDistributionChannelSetMessagePayload copyDeep() {
        return OrderLineItemDistributionChannelSetMessagePayload.deepCopy(this);
    }
}
