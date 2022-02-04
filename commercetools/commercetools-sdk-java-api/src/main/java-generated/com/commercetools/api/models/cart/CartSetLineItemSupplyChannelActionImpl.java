
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CartSetLineItemSupplyChannelActionImpl implements CartSetLineItemSupplyChannelAction, ModelBase {

    private String action;

    private String lineItemId;

    private com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel;

    @JsonCreator
    CartSetLineItemSupplyChannelActionImpl(@JsonProperty("lineItemId") final String lineItemId,
            @JsonProperty("supplyChannel") final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
        this.lineItemId = lineItemId;
        this.supplyChannel = supplyChannel;
        this.action = SET_LINE_ITEM_SUPPLY_CHANNEL;
    }

    public CartSetLineItemSupplyChannelActionImpl() {
        this.action = SET_LINE_ITEM_SUPPLY_CHANNEL;
    }

    public String getAction() {
        return this.action;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
    *  <p><a href="/../api/types#resourceidentifier">ResourceIdentifier</a> to a <a href="ctp:api:type:Channel">Channel</a>.</p>
    */
    public com.commercetools.api.models.channel.ChannelResourceIdentifier getSupplyChannel() {
        return this.supplyChannel;
    }

    public void setLineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
    }

    public void setSupplyChannel(final com.commercetools.api.models.channel.ChannelResourceIdentifier supplyChannel) {
        this.supplyChannel = supplyChannel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartSetLineItemSupplyChannelActionImpl that = (CartSetLineItemSupplyChannelActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(lineItemId, that.lineItemId)
                .append(supplyChannel, that.supplyChannel)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(lineItemId).append(supplyChannel).toHashCode();
    }

}
