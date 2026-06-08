
package com.commercetools.api.models.order_edit;

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
 *  <p>When multiple shipping addresses are set for a Custom Line Item, use the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderAddCustomLineItemAction" rel="nofollow">Add CustomLineItem</a> update action to change the shipping details. Since it is not possible for the API to infer how the overall change in the Custom Line Item quantity should be distributed over the sub-quantities, the <code>shippingDetails</code> field is kept in its current state to avoid data loss.</p>
 *  <p>To change the Custom Line Item quantity and shipping details together, use this update action in combination with the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetCustomLineItemShippingDetailsAction" rel="nofollow">Set CustomLineItem ShippingDetails</a> update action in a single Order update command.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderChangeCustomLineItemQuantityActionImpl
        implements StagedOrderChangeCustomLineItemQuantityAction, ModelBase {

    private String action;

    private String customLineItemId;

    private String customLineItemKey;

    private Long quantity;

    /**
     * create instance with all properties
     */
    @JsonCreator
    StagedOrderChangeCustomLineItemQuantityActionImpl(@JsonProperty("customLineItemId") final String customLineItemId,
            @JsonProperty("customLineItemKey") final String customLineItemKey,
            @JsonProperty("quantity") final Long quantity) {
        this.customLineItemId = customLineItemId;
        this.customLineItemKey = customLineItemKey;
        this.quantity = quantity;
        this.action = CHANGE_CUSTOM_LINE_ITEM_QUANTITY;
    }

    /**
     * create empty instance
     */
    public StagedOrderChangeCustomLineItemQuantityActionImpl() {
        this.action = CHANGE_CUSTOM_LINE_ITEM_QUANTITY;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a> to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     */

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a> to update. Either <code>customLineItemId</code> or <code>customLineItemKey</code> is required.</p>
     */

    public String getCustomLineItemKey() {
        return this.customLineItemKey;
    }

    /**
     *  <p>New value to set. If <code>0</code>, the Custom Line Item is removed from the Order.</p>
     */

    public Long getQuantity() {
        return this.quantity;
    }

    public void setCustomLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
    }

    public void setCustomLineItemKey(final String customLineItemKey) {
        this.customLineItemKey = customLineItemKey;
    }

    public void setQuantity(final Long quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StagedOrderChangeCustomLineItemQuantityActionImpl that = (StagedOrderChangeCustomLineItemQuantityActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(customLineItemId, that.customLineItemId)
                .append(customLineItemKey, that.customLineItemKey)
                .append(quantity, that.quantity)
                .append(action, that.action)
                .append(customLineItemId, that.customLineItemId)
                .append(customLineItemKey, that.customLineItemKey)
                .append(quantity, that.quantity)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(customLineItemId)
                .append(customLineItemKey)
                .append(quantity)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("customLineItemId", customLineItemId)
                .append("customLineItemKey", customLineItemKey)
                .append("quantity", quantity)
                .build();
    }

    @Override
    public StagedOrderChangeCustomLineItemQuantityAction copyDeep() {
        return StagedOrderChangeCustomLineItemQuantityAction.deepCopy(this);
    }
}
