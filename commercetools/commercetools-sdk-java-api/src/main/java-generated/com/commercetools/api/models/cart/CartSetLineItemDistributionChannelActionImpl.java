
package com.commercetools.api.models.cart;

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
 *  <p>Setting a distribution channel for a LineItem can lead to an updated <code>price</code> as described in LineItem Price selection.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetLineItemDistributionChannelActionImpl
        implements CartSetLineItemDistributionChannelAction, ModelBase {

    private String action;

    private String lineItemId;

    private String lineItemKey;

    private com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartSetLineItemDistributionChannelActionImpl(@JsonProperty("lineItemId") final String lineItemId,
            @JsonProperty("lineItemKey") final String lineItemKey,
            @JsonProperty("distributionChannel") final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
        this.lineItemId = lineItemId;
        this.lineItemKey = lineItemKey;
        this.distributionChannel = distributionChannel;
        this.action = SET_LINE_ITEM_DISTRIBUTION_CHANNEL;
    }

    /**
     * create empty instance
     */
    public CartSetLineItemDistributionChannelActionImpl() {
        this.action = SET_LINE_ITEM_DISTRIBUTION_CHANNEL;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p><code>id</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     */

    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p><code>key</code> of the LineItem to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     */

    public String getLineItemKey() {
        return this.lineItemKey;
    }

    /**
     *  <ul>
     *   <li>If present, a Reference to the Channel is set for the LineItem specified by <code>lineItemId</code>.</li>
     *   <li>If not present, the current Reference to a distribution channel is removed from the LineItem specified by <code>lineItemId</code>. The Channel must have the <code>ProductDistribution</code> ChannelRoleEnum.</li>
     *  </ul>
     */

    public com.commercetools.api.models.channel.ChannelResourceIdentifier getDistributionChannel() {
        return this.distributionChannel;
    }

    public void setLineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
    }

    public void setLineItemKey(final String lineItemKey) {
        this.lineItemKey = lineItemKey;
    }

    public void setDistributionChannel(
            final com.commercetools.api.models.channel.ChannelResourceIdentifier distributionChannel) {
        this.distributionChannel = distributionChannel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartSetLineItemDistributionChannelActionImpl that = (CartSetLineItemDistributionChannelActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(lineItemId, that.lineItemId)
                .append(lineItemKey, that.lineItemKey)
                .append(distributionChannel, that.distributionChannel)
                .append(action, that.action)
                .append(lineItemId, that.lineItemId)
                .append(lineItemKey, that.lineItemKey)
                .append(distributionChannel, that.distributionChannel)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(lineItemId)
                .append(lineItemKey)
                .append(distributionChannel)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("lineItemId", lineItemId)
                .append("lineItemKey", lineItemKey)
                .append("distributionChannel", distributionChannel)
                .build();
    }

}
