
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
 * CartChangeCustomLineItemPriceModeAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartChangeCustomLineItemPriceModeActionImpl implements CartChangeCustomLineItemPriceModeAction, ModelBase {

    private String action;

    private String customLineItemId;

    private com.commercetools.api.models.cart.CustomLineItemPriceMode mode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartChangeCustomLineItemPriceModeActionImpl(@JsonProperty("customLineItemId") final String customLineItemId,
            @JsonProperty("mode") final com.commercetools.api.models.cart.CustomLineItemPriceMode mode) {
        this.customLineItemId = customLineItemId;
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
     *  <p><code>id</code> of the CustomLineItem to update.</p>
     */

    public String getCustomLineItemId() {
        return this.customLineItemId;
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
                .append(mode, that.mode)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(customLineItemId).append(mode).toHashCode();
    }

}
