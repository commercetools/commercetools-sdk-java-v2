
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
 * CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl
        implements CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction, ModelBase {

    private String action;

    private String customLineItemId;

    private String customLineItemKey;

    private java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> targetsDelta;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl(
            @JsonProperty("customLineItemId") final String customLineItemId,
            @JsonProperty("customLineItemKey") final String customLineItemKey,
            @JsonProperty("targetsDelta") final java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> targetsDelta) {
        this.customLineItemId = customLineItemId;
        this.customLineItemKey = customLineItemKey;
        this.targetsDelta = targetsDelta;
        this.action = APPLY_DELTA_TO_CUSTOM_LINE_ITEM_SHIPPING_DETAILS_TARGETS;
    }

    /**
     * create empty instance
     */
    public CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl() {
        this.action = APPLY_DELTA_TO_CUSTOM_LINE_ITEM_SHIPPING_DETAILS_TARGETS;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p><code>id</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     */

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    /**
     *  <p><code>key</code> of the CustomLineItem to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     */

    public String getCustomLineItemKey() {
        return this.customLineItemKey;
    }

    /**
     *  <p>Using positive or negative quantities increases or decreases the number of items shipped to an address.</p>
     */

    public java.util.List<com.commercetools.api.models.cart.ItemShippingTarget> getTargetsDelta() {
        return this.targetsDelta;
    }

    public void setCustomLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
    }

    public void setCustomLineItemKey(final String customLineItemKey) {
        this.customLineItemKey = customLineItemKey;
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

        CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl that = (CartApplyDeltaToCustomLineItemShippingDetailsTargetsActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(customLineItemId, that.customLineItemId)
                .append(customLineItemKey, that.customLineItemKey)
                .append(targetsDelta, that.targetsDelta)
                .append(action, that.action)
                .append(customLineItemId, that.customLineItemId)
                .append(customLineItemKey, that.customLineItemKey)
                .append(targetsDelta, that.targetsDelta)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(customLineItemId)
                .append(customLineItemKey)
                .append(targetsDelta)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("customLineItemId", customLineItemId)
                .append("customLineItemKey", customLineItemKey)
                .append("targetsDelta", targetsDelta)
                .build();
    }

    @Override
    public CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction copyDeep() {
        return CartApplyDeltaToCustomLineItemShippingDetailsTargetsAction.deepCopy(this);
    }
}
