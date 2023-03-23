
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

/**
 *  <p>This update action does not support specifying quantities, unlike the Remove LineItem update action.</p>
 *  <p>If <code>shippingDetails</code> must be partially removed, use the Change CustomLineItem Quantity update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartRemoveCustomLineItemActionImpl implements CartRemoveCustomLineItemAction, ModelBase {

    private String action;

    private String customLineItemId;

    @JsonCreator
    CartRemoveCustomLineItemActionImpl(@JsonProperty("customLineItemId") final String customLineItemId) {
        this.customLineItemId = customLineItemId;
        this.action = REMOVE_CUSTOM_LINE_ITEM;
    }

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
     *  <p><code>id</code> of the Custom Line Item to remove.</p>
     */

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    public void setCustomLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
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
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(customLineItemId).toHashCode();
    }

}
