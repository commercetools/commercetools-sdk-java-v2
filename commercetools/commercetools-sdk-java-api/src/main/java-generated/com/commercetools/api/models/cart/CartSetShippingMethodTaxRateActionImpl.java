
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
 *  <p>A Shipping Method Tax Rate can be set if the Cart has the <code>External</code> TaxMode.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetShippingMethodTaxRateActionImpl implements CartSetShippingMethodTaxRateAction, ModelBase {

    private String action;

    private String shippingKey;

    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartSetShippingMethodTaxRateActionImpl(@JsonProperty("shippingKey") final String shippingKey,
            @JsonProperty("externalTaxRate") final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.shippingKey = shippingKey;
        this.externalTaxRate = externalTaxRate;
        this.action = SET_SHIPPING_METHOD_TAX_RATE;
    }

    /**
     * create empty instance
     */
    public CartSetShippingMethodTaxRateActionImpl() {
        this.action = SET_SHIPPING_METHOD_TAX_RATE;
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

    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate() {
        return this.externalTaxRate;
    }

    public void setShippingKey(final String shippingKey) {
        this.shippingKey = shippingKey;
    }

    public void setExternalTaxRate(final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartSetShippingMethodTaxRateActionImpl that = (CartSetShippingMethodTaxRateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(shippingKey, that.shippingKey)
                .append(externalTaxRate, that.externalTaxRate)
                .append(action, that.action)
                .append(shippingKey, that.shippingKey)
                .append(externalTaxRate, that.externalTaxRate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(shippingKey).append(externalTaxRate).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("shippingKey", shippingKey)
                .append("externalTaxRate", externalTaxRate)
                .build();
    }

    @Override
    public CartSetShippingMethodTaxRateAction copyDeep() {
        return CartSetShippingMethodTaxRateAction.deepCopy(this);
    }
}
