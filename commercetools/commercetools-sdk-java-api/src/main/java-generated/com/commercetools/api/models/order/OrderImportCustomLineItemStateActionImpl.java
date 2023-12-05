
package com.commercetools.api.models.order;

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
 *  <p>The import of States does not follow any predefined rules and should be only used if no transitions are defined. The <code>quantity</code> in the ItemStates must match the sum of all Custom Line Item states' quantities.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderImportCustomLineItemStateActionImpl implements OrderImportCustomLineItemStateAction, ModelBase {

    private String action;

    private String customLineItemId;

    private String customLineItemKey;

    private java.util.List<com.commercetools.api.models.order.ItemState> state;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderImportCustomLineItemStateActionImpl(@JsonProperty("customLineItemId") final String customLineItemId,
            @JsonProperty("customLineItemKey") final String customLineItemKey,
            @JsonProperty("state") final java.util.List<com.commercetools.api.models.order.ItemState> state) {
        this.customLineItemId = customLineItemId;
        this.customLineItemKey = customLineItemKey;
        this.state = state;
        this.action = IMPORT_CUSTOM_LINE_ITEM_STATE;
    }

    /**
     * create empty instance
     */
    public OrderImportCustomLineItemStateActionImpl() {
        this.action = IMPORT_CUSTOM_LINE_ITEM_STATE;
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
     *  <p>New status of the Custom Line Items.</p>
     */

    public java.util.List<com.commercetools.api.models.order.ItemState> getState() {
        return this.state;
    }

    public void setCustomLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
    }

    public void setCustomLineItemKey(final String customLineItemKey) {
        this.customLineItemKey = customLineItemKey;
    }

    public void setState(final com.commercetools.api.models.order.ItemState... state) {
        this.state = new ArrayList<>(Arrays.asList(state));
    }

    public void setState(final java.util.List<com.commercetools.api.models.order.ItemState> state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderImportCustomLineItemStateActionImpl that = (OrderImportCustomLineItemStateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(customLineItemId, that.customLineItemId)
                .append(customLineItemKey, that.customLineItemKey)
                .append(state, that.state)
                .append(action, that.action)
                .append(customLineItemId, that.customLineItemId)
                .append(customLineItemKey, that.customLineItemKey)
                .append(state, that.state)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(customLineItemId)
                .append(customLineItemKey)
                .append(state)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("customLineItemId", customLineItemId)
                .append("customLineItemKey", customLineItemKey)
                .append("state", state)
                .build();
    }

}
