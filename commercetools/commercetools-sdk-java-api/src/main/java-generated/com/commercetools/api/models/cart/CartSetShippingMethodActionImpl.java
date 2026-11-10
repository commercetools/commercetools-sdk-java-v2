
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p>To set the Cart's Shipping Method the Cart must have the <code>Single</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a> and a <code>shippingAddress</code>.</p>
 *  <p>This update is not allowed when the Cart is <span>frozen</span> with the <code>HardFreeze</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:FreezeStrategy" rel="nofollow">FreezeStrategy</a>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetShippingMethodActionImpl implements CartSetShippingMethodAction, ModelBase {

    private String action;

    private com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod;

    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    private com.commercetools.api.models.cart.EstimatedDelivery estimatedDelivery;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartSetShippingMethodActionImpl(
            @JsonProperty("shippingMethod") final com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod,
            @JsonProperty("externalTaxRate") final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate,
            @JsonProperty("estimatedDelivery") final com.commercetools.api.models.cart.EstimatedDelivery estimatedDelivery) {
        this.shippingMethod = shippingMethod;
        this.externalTaxRate = externalTaxRate;
        this.estimatedDelivery = estimatedDelivery;
        this.action = SET_SHIPPING_METHOD;
    }

    /**
     * create empty instance
     */
    public CartSetShippingMethodActionImpl() {
        this.action = SET_SHIPPING_METHOD;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. If omitted, any existing value is removed.</p>
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error is returned in one of the following cases:</p>
     *  <ol>
     *   <li>If the referenced Shipping Method has a predicate that does not match the Cart.</li>
     *   <li>If the referenced Shipping Method is not active.</li>
     *   <li>If the referenced Shipping Method is associated with a Store that is different from the Cart's Store.</li>
     *   <li>If the referenced Shipping Method is associated with a Store and the Cart is not associated with any Store.</li>
     *  </ol>
     */

    public com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier getShippingMethod() {
        return this.shippingMethod;
    }

    /**
     *  <p>An external Tax Rate can be set if the Cart has the <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>.</p>
     */

    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate() {
        return this.externalTaxRate;
    }

    /**
     *  <p>Estimated time window during which the shipment is expected to be delivered. If not set, any existing estimate on the Cart's <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingInfo" rel="nofollow">ShippingInfo</a> is cleared.</p>
     */

    public com.commercetools.api.models.cart.EstimatedDelivery getEstimatedDelivery() {
        return this.estimatedDelivery;
    }

    public void setShippingMethod(
            final com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public void setExternalTaxRate(final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
    }

    public void setEstimatedDelivery(final com.commercetools.api.models.cart.EstimatedDelivery estimatedDelivery) {
        this.estimatedDelivery = estimatedDelivery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartSetShippingMethodActionImpl that = (CartSetShippingMethodActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(shippingMethod, that.shippingMethod)
                .append(externalTaxRate, that.externalTaxRate)
                .append(estimatedDelivery, that.estimatedDelivery)
                .append(action, that.action)
                .append(shippingMethod, that.shippingMethod)
                .append(externalTaxRate, that.externalTaxRate)
                .append(estimatedDelivery, that.estimatedDelivery)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(shippingMethod)
                .append(externalTaxRate)
                .append(estimatedDelivery)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("shippingMethod", shippingMethod)
                .append("externalTaxRate", externalTaxRate)
                .append("estimatedDelivery", estimatedDelivery)
                .build();
    }

    @Override
    public CartSetShippingMethodAction copyDeep() {
        return CartSetShippingMethodAction.deepCopy(this);
    }
}
