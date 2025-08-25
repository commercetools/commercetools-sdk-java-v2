
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
 *  <p>Sets the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> <code>price</code> and changes the <code>priceMode</code> to <code>ExternalPrice</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItemPriceMode" rel="nofollow">LineItemPriceMode</a>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetLineItemPriceActionImpl implements CartSetLineItemPriceAction, ModelBase {

    private String action;

    private String lineItemId;

    private String lineItemKey;

    private com.commercetools.api.models.common.Money externalPrice;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartSetLineItemPriceActionImpl(@JsonProperty("lineItemId") final String lineItemId,
            @JsonProperty("lineItemKey") final String lineItemKey,
            @JsonProperty("externalPrice") final com.commercetools.api.models.common.Money externalPrice) {
        this.lineItemId = lineItemId;
        this.lineItemKey = lineItemKey;
        this.externalPrice = externalPrice;
        this.action = SET_LINE_ITEM_PRICE;
    }

    /**
     * create empty instance
     */
    public CartSetLineItemPriceActionImpl() {
        this.action = SET_LINE_ITEM_PRICE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     */

    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a> to update. Either <code>lineItemId</code> or <code>lineItemKey</code> is required.</p>
     */

    public String getLineItemKey() {
        return this.lineItemKey;
    }

    /**
     *  <p>Value to set. If <code>externalPrice</code> is not given and the <code>priceMode</code> is <code>ExternalPrice</code>, the external price is unset and the <code>priceMode</code> is set to <code>Platform</code>.</p>
     *  <p>To set the money value in high precision, use <a href="https://docs.commercetools.com/apis/ctp:api:type:HighPrecisionMoneyDraft" rel="nofollow">HighPrecisionMoneyDraft</a>.</p>
     */

    public com.commercetools.api.models.common.Money getExternalPrice() {
        return this.externalPrice;
    }

    public void setLineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
    }

    public void setLineItemKey(final String lineItemKey) {
        this.lineItemKey = lineItemKey;
    }

    public void setExternalPrice(final com.commercetools.api.models.common.Money externalPrice) {
        this.externalPrice = externalPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartSetLineItemPriceActionImpl that = (CartSetLineItemPriceActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(lineItemId, that.lineItemId)
                .append(lineItemKey, that.lineItemKey)
                .append(externalPrice, that.externalPrice)
                .append(action, that.action)
                .append(lineItemId, that.lineItemId)
                .append(lineItemKey, that.lineItemKey)
                .append(externalPrice, that.externalPrice)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(lineItemId)
                .append(lineItemKey)
                .append(externalPrice)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("lineItemId", lineItemId)
                .append("lineItemKey", lineItemKey)
                .append("externalPrice", externalPrice)
                .build();
    }

    @Override
    public CartSetLineItemPriceAction copyDeep() {
        return CartSetLineItemPriceAction.deepCopy(this);
    }
}
