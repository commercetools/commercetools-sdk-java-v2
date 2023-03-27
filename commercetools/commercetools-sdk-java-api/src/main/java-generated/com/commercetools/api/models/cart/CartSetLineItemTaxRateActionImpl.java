
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
 *  <p>Can be used if the Cart has the <code>External</code> TaxMode.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetLineItemTaxRateActionImpl implements CartSetLineItemTaxRateAction, ModelBase {

    private String action;

    private String lineItemId;

    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    private String shippingKey;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartSetLineItemTaxRateActionImpl(@JsonProperty("lineItemId") final String lineItemId,
            @JsonProperty("externalTaxRate") final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate,
            @JsonProperty("shippingKey") final String shippingKey) {
        this.lineItemId = lineItemId;
        this.externalTaxRate = externalTaxRate;
        this.shippingKey = shippingKey;
        this.action = SET_LINE_ITEM_TAX_RATE;
    }

    /**
     * create empty instance
     */
    public CartSetLineItemTaxRateActionImpl() {
        this.action = SET_LINE_ITEM_TAX_RATE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p><code>id</code> of the LineItem to update.</p>
     */

    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p>Value to set. If empty, any existing value is removed.</p>
     */

    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate() {
        return this.externalTaxRate;
    }

    /**
     *  <p><code>key</code> of the ShippingMethod used for this Line Item. This is required for Carts with <code>Multiple</code> ShippingMode.</p>
     */

    public String getShippingKey() {
        return this.shippingKey;
    }

    public void setLineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
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

        CartSetLineItemTaxRateActionImpl that = (CartSetLineItemTaxRateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(lineItemId, that.lineItemId)
                .append(externalTaxRate, that.externalTaxRate)
                .append(shippingKey, that.shippingKey)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(lineItemId)
                .append(externalTaxRate)
                .append(shippingKey)
                .toHashCode();
    }

}
