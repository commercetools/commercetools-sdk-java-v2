
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
 *  <p>Sets the recurrence information on the <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a>. If the Cart is already associated with a Recurring Order, this action will fail.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetLineItemRecurrenceInfoActionImpl implements CartSetLineItemRecurrenceInfoAction, ModelBase {

    private String action;

    private String lineItemId;

    private String lineItemKey;

    private com.commercetools.api.models.recurring_order.LineItemRecurrenceInfoDraft recurrenceInfo;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartSetLineItemRecurrenceInfoActionImpl(@JsonProperty("lineItemId") final String lineItemId,
            @JsonProperty("lineItemKey") final String lineItemKey,
            @JsonProperty("recurrenceInfo") final com.commercetools.api.models.recurring_order.LineItemRecurrenceInfoDraft recurrenceInfo) {
        this.lineItemId = lineItemId;
        this.lineItemKey = lineItemKey;
        this.recurrenceInfo = recurrenceInfo;
        this.action = SET_LINE_ITEM_RECURRENCE_INFO;
    }

    /**
     * create empty instance
     */
    public CartSetLineItemRecurrenceInfoActionImpl() {
        this.action = SET_LINE_ITEM_RECURRENCE_INFO;
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
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public com.commercetools.api.models.recurring_order.LineItemRecurrenceInfoDraft getRecurrenceInfo() {
        return this.recurrenceInfo;
    }

    public void setLineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
    }

    public void setLineItemKey(final String lineItemKey) {
        this.lineItemKey = lineItemKey;
    }

    public void setRecurrenceInfo(
            final com.commercetools.api.models.recurring_order.LineItemRecurrenceInfoDraft recurrenceInfo) {
        this.recurrenceInfo = recurrenceInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartSetLineItemRecurrenceInfoActionImpl that = (CartSetLineItemRecurrenceInfoActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(lineItemId, that.lineItemId)
                .append(lineItemKey, that.lineItemKey)
                .append(recurrenceInfo, that.recurrenceInfo)
                .append(action, that.action)
                .append(lineItemId, that.lineItemId)
                .append(lineItemKey, that.lineItemKey)
                .append(recurrenceInfo, that.recurrenceInfo)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(lineItemId)
                .append(lineItemKey)
                .append(recurrenceInfo)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("lineItemId", lineItemId)
                .append("lineItemKey", lineItemKey)
                .append("recurrenceInfo", recurrenceInfo)
                .build();
    }

    @Override
    public CartSetLineItemRecurrenceInfoAction copyDeep() {
        return CartSetLineItemRecurrenceInfoAction.deepCopy(this);
    }
}
