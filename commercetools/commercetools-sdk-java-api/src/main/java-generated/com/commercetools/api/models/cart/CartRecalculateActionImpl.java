
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
 *  <p>This update action does not set any Cart field in particular, but it triggers several Cart updates to bring prices and discounts to the latest state. Those can become stale over time when no Cart updates have been performed for a while and prices on related Products have changed in the meanwhile.</p>
 *  <p>If the <code>priceMode</code> of the Product related to a Line Item is of <code>Embedded</code> ProductPriceMode, the updated <code>price</code> of that LineItem may not correspond to a Price in the <code>variant.prices</code> anymore.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartRecalculateActionImpl implements CartRecalculateAction, ModelBase {

    private String action;

    private Boolean updateProductData;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartRecalculateActionImpl(@JsonProperty("updateProductData") final Boolean updateProductData) {
        this.updateProductData = updateProductData;
        this.action = RECALCULATE;
    }

    /**
     * create empty instance
     */
    public CartRecalculateActionImpl() {
        this.action = RECALCULATE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <ul>
     *   <li>Leave empty or set as <code>false</code> to update only the Prices and TaxRates of the Line Items.</li>
     *   <li>Set as <code>true</code> to update the Product data (such as <code>name</code>, <code>variant</code>, <code>productType</code>, and Product Attributes) of the Line Items.</li>
     *  </ul>
     */

    public Boolean getUpdateProductData() {
        return this.updateProductData;
    }

    public void setUpdateProductData(final Boolean updateProductData) {
        this.updateProductData = updateProductData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartRecalculateActionImpl that = (CartRecalculateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(updateProductData, that.updateProductData)
                .append(action, that.action)
                .append(updateProductData, that.updateProductData)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(updateProductData).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("updateProductData", updateProductData)
                .build();
    }

    @Override
    public CartRecalculateAction copyDeep() {
        return CartRecalculateAction.deepCopy(this);
    }
}
