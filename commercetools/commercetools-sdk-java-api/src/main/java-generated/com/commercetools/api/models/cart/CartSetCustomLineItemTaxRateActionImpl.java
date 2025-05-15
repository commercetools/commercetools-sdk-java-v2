
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
 *  <p>Can be used if the Cart has the <code>External</code> TaxMode.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetCustomLineItemTaxRateActionImpl implements CartSetCustomLineItemTaxRateAction, ModelBase {

    private String action;

    private String customLineItemId;

    private String customLineItemKey;

    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    private String shippingKey;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartSetCustomLineItemTaxRateActionImpl(@JsonProperty("customLineItemId") final String customLineItemId,
            @JsonProperty("customLineItemKey") final String customLineItemKey,
            @JsonProperty("externalTaxRate") final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate,
            @JsonProperty("shippingKey") final String shippingKey) {
        this.customLineItemId = customLineItemId;
        this.customLineItemKey = customLineItemKey;
        this.externalTaxRate = externalTaxRate;
        this.shippingKey = shippingKey;
        this.action = SET_CUSTOM_LINE_ITEM_TAX_RATE;
    }

    /**
     * create empty instance
     */
    public CartSetCustomLineItemTaxRateActionImpl() {
        this.action = SET_CUSTOM_LINE_ITEM_TAX_RATE;
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
     *  <p>Value to set. If empty, an existing value is removed.</p>
     */

    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate() {
        return this.externalTaxRate;
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

    public void setExternalTaxRate(final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
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

        CartSetCustomLineItemTaxRateActionImpl that = (CartSetCustomLineItemTaxRateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(customLineItemId, that.customLineItemId)
                .append(customLineItemKey, that.customLineItemKey)
                .append(externalTaxRate, that.externalTaxRate)
                .append(shippingKey, that.shippingKey)
                .append(action, that.action)
                .append(customLineItemId, that.customLineItemId)
                .append(customLineItemKey, that.customLineItemKey)
                .append(externalTaxRate, that.externalTaxRate)
                .append(shippingKey, that.shippingKey)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(customLineItemId)
                .append(customLineItemKey)
                .append(externalTaxRate)
                .append(shippingKey)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("customLineItemId", customLineItemId)
                .append("customLineItemKey", customLineItemKey)
                .append("externalTaxRate", externalTaxRate)
                .append("shippingKey", shippingKey)
                .build();
    }

    @Override
    public CartSetCustomLineItemTaxRateAction copyDeep() {
        return CartSetCustomLineItemTaxRateAction.deepCopy(this);
    }
}
