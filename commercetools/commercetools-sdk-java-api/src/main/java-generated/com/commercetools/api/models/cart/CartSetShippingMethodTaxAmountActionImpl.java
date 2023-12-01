
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
 *  <p>A Shipping Method tax amount can be set if the Cart has the <code>ExternalAmount</code> TaxMode.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetShippingMethodTaxAmountActionImpl implements CartSetShippingMethodTaxAmountAction, ModelBase {

    private String action;

    private String shippingKey;

    private com.commercetools.api.models.cart.ExternalTaxAmountDraft externalTaxAmount;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartSetShippingMethodTaxAmountActionImpl(@JsonProperty("shippingKey") final String shippingKey,
            @JsonProperty("externalTaxAmount") final com.commercetools.api.models.cart.ExternalTaxAmountDraft externalTaxAmount) {
        this.shippingKey = shippingKey;
        this.externalTaxAmount = externalTaxAmount;
        this.action = SET_SHIPPING_METHOD_TAX_AMOUNT;
    }

    /**
     * create empty instance
     */
    public CartSetShippingMethodTaxAmountActionImpl() {
        this.action = SET_SHIPPING_METHOD_TAX_AMOUNT;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p><code>key</code> of the ShippingMethod to update. This is required for Carts with <code>Multiple</code> ShippingMode.</p>
     */

    public String getShippingKey() {
        return this.shippingKey;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     */

    public com.commercetools.api.models.cart.ExternalTaxAmountDraft getExternalTaxAmount() {
        return this.externalTaxAmount;
    }

    public void setShippingKey(final String shippingKey) {
        this.shippingKey = shippingKey;
    }

    public void setExternalTaxAmount(final com.commercetools.api.models.cart.ExternalTaxAmountDraft externalTaxAmount) {
        this.externalTaxAmount = externalTaxAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartSetShippingMethodTaxAmountActionImpl that = (CartSetShippingMethodTaxAmountActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(shippingKey, that.shippingKey)
                .append(externalTaxAmount, that.externalTaxAmount)
                .append(action, that.action)
                .append(shippingKey, that.shippingKey)
                .append(externalTaxAmount, that.externalTaxAmount)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(shippingKey).append(externalTaxAmount).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("shippingKey", shippingKey)
                .append("externalTaxAmount", externalTaxAmount)
                .build();
    }

}
