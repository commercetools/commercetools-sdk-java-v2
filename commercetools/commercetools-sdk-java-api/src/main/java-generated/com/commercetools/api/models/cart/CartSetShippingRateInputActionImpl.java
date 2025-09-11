
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
 *  <p>Input used to select a <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingRatePriceTier" rel="nofollow">ShippingRatePriceTier</a>. If no matching tier can be found, or the input is not set, the default price for the shipping rate is used.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetShippingRateInputActionImpl implements CartSetShippingRateInputAction, ModelBase {

    private String action;

    private com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartSetShippingRateInputActionImpl(
            @JsonProperty("shippingRateInput") final com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput) {
        this.shippingRateInput = shippingRateInput;
        this.action = SET_SHIPPING_RATE_INPUT;
    }

    /**
     * create empty instance
     */
    public CartSetShippingRateInputActionImpl() {
        this.action = SET_SHIPPING_RATE_INPUT;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>The data type of this field depends on the <code>shippingRateInputType.type</code> configured in the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>:</p>
     *  <ul>
     *   <li>If <code>CartClassification</code>, it must be <a href="https://docs.commercetools.com/apis/ctp:api:type:ClassificationShippingRateInputDraft" rel="nofollow">ClassificationShippingRateInputDraft</a>.</li>
     *   <li>If <code>CartScore</code>, it must be <a href="https://docs.commercetools.com/apis/ctp:api:type:ScoreShippingRateInputDraft" rel="nofollow">ScoreShippingRateInputDraft</a>.</li>
     *   <li>If <code>CartValue</code>, it cannot be set.</li>
     *  </ul>
     */

    public com.commercetools.api.models.cart.ShippingRateInputDraft getShippingRateInput() {
        return this.shippingRateInput;
    }

    public void setShippingRateInput(final com.commercetools.api.models.cart.ShippingRateInputDraft shippingRateInput) {
        this.shippingRateInput = shippingRateInput;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartSetShippingRateInputActionImpl that = (CartSetShippingRateInputActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(shippingRateInput, that.shippingRateInput)
                .append(action, that.action)
                .append(shippingRateInput, that.shippingRateInput)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(shippingRateInput).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("shippingRateInput", shippingRateInput)
                .build();
    }

    @Override
    public CartSetShippingRateInputAction copyDeep() {
        return CartSetShippingRateInputAction.deepCopy(this);
    }
}
