
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
 * CartChangeCustomLineItemPriceModeAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartChangeCustomLineItemPriceModeActionImpl implements CartChangeCustomLineItemPriceModeAction, ModelBase {

    private String action;

    private String customLineItemId;

    private String customLineItemKey;

    private com.commercetools.api.models.cart.CustomLineItemPriceMode mode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartChangeCustomLineItemPriceModeActionImpl(@JsonProperty("customLineItemId") final String customLineItemId,
            @JsonProperty("customLineItemKey") final String customLineItemKey,
            @JsonProperty("mode") final com.commercetools.api.models.cart.CustomLineItemPriceMode mode) {
        this.customLineItemId = customLineItemId;
        this.customLineItemKey = customLineItemKey;
        this.mode = mode;
        this.action = CHANGE_CUSTOM_LINE_ITEM_PRICE_MODE;
    }

    /**
     * create empty instance
     */
    public CartChangeCustomLineItemPriceModeActionImpl() {
        this.action = CHANGE_CUSTOM_LINE_ITEM_PRICE_MODE;
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
     *  <p>New value to set. Must not be empty.</p>
     */

    public com.commercetools.api.models.cart.CustomLineItemPriceMode getMode() {
        return this.mode;
    }

    public void setCustomLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
    }

    public void setCustomLineItemKey(final String customLineItemKey) {
        this.customLineItemKey = customLineItemKey;
    }

    public void setMode(final com.commercetools.api.models.cart.CustomLineItemPriceMode mode) {
        this.mode = mode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartChangeCustomLineItemPriceModeActionImpl that = (CartChangeCustomLineItemPriceModeActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(customLineItemId, that.customLineItemId)
                .append(customLineItemKey, that.customLineItemKey)
                .append(mode, that.mode)
                .append(action, that.action)
                .append(customLineItemId, that.customLineItemId)
                .append(customLineItemKey, that.customLineItemKey)
                .append(mode, that.mode)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(customLineItemId)
                .append(customLineItemKey)
                .append(mode)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("customLineItemId", customLineItemId)
                .append("customLineItemKey", customLineItemKey)
                .append("mode", mode)
                .build();
    }

    @Override
    public CartChangeCustomLineItemPriceModeAction copyDeep() {
        return CartChangeCustomLineItemPriceModeAction.deepCopy(this);
    }
}
