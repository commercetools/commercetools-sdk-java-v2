
package com.commercetools.api.models.me;

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
 *  <p>To override the shipping details, see Set LineItem ShippingDetails.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCartApplyDeltaToLineItemShippingDetailsTargetsActionImpl
        implements MyCartApplyDeltaToLineItemShippingDetailsTargetsAction, ModelBase {

    private String action;

    private String lineItemId;

    private String lineItemKey;

    private java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> targetsDelta;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MyCartApplyDeltaToLineItemShippingDetailsTargetsActionImpl(@JsonProperty("lineItemId") final String lineItemId,
            @JsonProperty("lineItemKey") final String lineItemKey,
            @JsonProperty("targetsDelta") final java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> targetsDelta) {
        this.lineItemId = lineItemId;
        this.lineItemKey = lineItemKey;
        this.targetsDelta = targetsDelta;
        this.action = APPLY_DELTA_TO_LINE_ITEM_SHIPPING_DETAILS_TARGETS;
    }

    /**
     * create empty instance
     */
    public MyCartApplyDeltaToLineItemShippingDetailsTargetsActionImpl() {
        this.action = APPLY_DELTA_TO_LINE_ITEM_SHIPPING_DETAILS_TARGETS;
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
     *  <p>Using positive or negative quantities increases or decreases the number of items shipped to an address.</p>
     */

    public java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> getTargetsDelta() {
        return this.targetsDelta;
    }

    public void setLineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
    }

    public void setLineItemKey(final String lineItemKey) {
        this.lineItemKey = lineItemKey;
    }

    public void setTargetsDelta(final com.commercetools.api.models.cart.ItemShippingTarget... targetsDelta) {
        this.targetsDelta = new ArrayList<>(Arrays.asList(targetsDelta));
    }

    public void setTargetsDelta(
            final java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> targetsDelta) {
        this.targetsDelta = targetsDelta;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyCartApplyDeltaToLineItemShippingDetailsTargetsActionImpl that = (MyCartApplyDeltaToLineItemShippingDetailsTargetsActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(lineItemId, that.lineItemId)
                .append(lineItemKey, that.lineItemKey)
                .append(targetsDelta, that.targetsDelta)
                .append(action, that.action)
                .append(lineItemId, that.lineItemId)
                .append(lineItemKey, that.lineItemKey)
                .append(targetsDelta, that.targetsDelta)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(lineItemId)
                .append(lineItemKey)
                .append(targetsDelta)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("lineItemId", lineItemId)
                .append("lineItemKey", lineItemKey)
                .append("targetsDelta", targetsDelta)
                .build();
    }

    @Override
    public MyCartApplyDeltaToLineItemShippingDetailsTargetsAction copyDeep() {
        return MyCartApplyDeltaToLineItemShippingDetailsTargetsAction.deepCopy(this);
    }
}
