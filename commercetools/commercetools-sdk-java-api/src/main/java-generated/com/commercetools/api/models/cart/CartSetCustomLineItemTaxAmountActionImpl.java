
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
 *  <p>Can be used if the Cart has the <code>ExternalAmount</code> TaxMode.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetCustomLineItemTaxAmountActionImpl implements CartSetCustomLineItemTaxAmountAction, ModelBase {

    private String action;

    private String customLineItemId;

    private String customLineItemKey;

    private com.commercetools.api.models.cart.ExternalTaxAmountDraft externalTaxAmount;

    private String shippingKey;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartSetCustomLineItemTaxAmountActionImpl(@JsonProperty("customLineItemId") final String customLineItemId,
            @JsonProperty("customLineItemKey") final String customLineItemKey,
            @JsonProperty("externalTaxAmount") final com.commercetools.api.models.cart.ExternalTaxAmountDraft externalTaxAmount,
            @JsonProperty("shippingKey") final String shippingKey) {
        this.customLineItemId = customLineItemId;
        this.customLineItemKey = customLineItemKey;
        this.externalTaxAmount = externalTaxAmount;
        this.shippingKey = shippingKey;
        this.action = SET_CUSTOM_LINE_ITEM_TAX_AMOUNT;
    }

    /**
     * create empty instance
     */
    public CartSetCustomLineItemTaxAmountActionImpl() {
        this.action = SET_CUSTOM_LINE_ITEM_TAX_AMOUNT;
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
     *  <p>Value to set. If empty, any existing value is removed.</p>
     */

    public com.commercetools.api.models.cart.ExternalTaxAmountDraft getExternalTaxAmount() {
        return this.externalTaxAmount;
    }

    /**
     *  <p><code>key</code> of the ShippingMethod used for this Custom Line Item. This is required for Carts with <code>Multiple</code> ShippingMode.</p>
     */

    public String getShippingKey() {
        return this.shippingKey;
    }

    public void setCustomLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
    }

    public void setCustomLineItemKey(final String customLineItemKey) {
        this.customLineItemKey = customLineItemKey;
    }

    public void setExternalTaxAmount(final com.commercetools.api.models.cart.ExternalTaxAmountDraft externalTaxAmount) {
        this.externalTaxAmount = externalTaxAmount;
    }

    public void setShippingKey(final String shippingKey) {
        this.shippingKey = shippingKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartSetCustomLineItemTaxAmountActionImpl that = (CartSetCustomLineItemTaxAmountActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(customLineItemId, that.customLineItemId)
                .append(customLineItemKey, that.customLineItemKey)
                .append(externalTaxAmount, that.externalTaxAmount)
                .append(shippingKey, that.shippingKey)
                .append(action, that.action)
                .append(customLineItemId, that.customLineItemId)
                .append(customLineItemKey, that.customLineItemKey)
                .append(externalTaxAmount, that.externalTaxAmount)
                .append(shippingKey, that.shippingKey)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(customLineItemId)
                .append(customLineItemKey)
                .append(externalTaxAmount)
                .append(shippingKey)
                .toHashCode();
    }

}
