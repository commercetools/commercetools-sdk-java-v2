
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
 *  <p>This update action does not support specifying quantities, unlike the Remove LineItem update action.</p>
 *  <p>If <code>shippingDetails</code> must be partially removed, use the Change CustomLineItem Quantity update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartRemoveCustomLineItemActionImpl implements CartRemoveCustomLineItemAction, ModelBase {

    private String action;

    private String customLineItemId;

    private String customLineItemKey;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartRemoveCustomLineItemActionImpl(@JsonProperty("customLineItemId") final String customLineItemId,
            @JsonProperty("customLineItemKey") final String customLineItemKey) {
        this.customLineItemId = customLineItemId;
        this.customLineItemKey = customLineItemKey;
        this.action = REMOVE_CUSTOM_LINE_ITEM;
    }

    /**
     * create empty instance
     */
    public CartRemoveCustomLineItemActionImpl() {
        this.action = REMOVE_CUSTOM_LINE_ITEM;
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

    public void setCustomLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
    }

    public void setCustomLineItemKey(final String customLineItemKey) {
        this.customLineItemKey = customLineItemKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartRemoveCustomLineItemActionImpl that = (CartRemoveCustomLineItemActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(customLineItemId, that.customLineItemId)
                .append(customLineItemKey, that.customLineItemKey)
                .append(action, that.action)
                .append(customLineItemId, that.customLineItemId)
                .append(customLineItemKey, that.customLineItemKey)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(customLineItemId)
                .append(customLineItemKey)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("customLineItemId", customLineItemId)
                .append("customLineItemKey", customLineItemKey)
                .build();
    }

}
