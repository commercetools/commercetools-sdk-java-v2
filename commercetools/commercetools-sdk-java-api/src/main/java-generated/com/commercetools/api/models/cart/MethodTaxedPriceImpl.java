
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
 * MethodTaxedPrice
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MethodTaxedPriceImpl implements MethodTaxedPrice, ModelBase {

    private String shippingMethodKey;

    private com.commercetools.api.models.cart.TaxedItemPrice taxedPrice;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MethodTaxedPriceImpl(@JsonProperty("shippingMethodKey") final String shippingMethodKey,
            @JsonProperty("taxedPrice") final com.commercetools.api.models.cart.TaxedItemPrice taxedPrice) {
        this.shippingMethodKey = shippingMethodKey;
        this.taxedPrice = taxedPrice;
    }

    /**
     * create empty instance
     */
    public MethodTaxedPriceImpl() {
    }

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> ShippingMode.</p>
     */

    public String getShippingMethodKey() {
        return this.shippingMethodKey;
    }

    /**
     *  <p>Taxed price for the Shipping Method.</p>
     */

    public com.commercetools.api.models.cart.TaxedItemPrice getTaxedPrice() {
        return this.taxedPrice;
    }

    public void setShippingMethodKey(final String shippingMethodKey) {
        this.shippingMethodKey = shippingMethodKey;
    }

    public void setTaxedPrice(final com.commercetools.api.models.cart.TaxedItemPrice taxedPrice) {
        this.taxedPrice = taxedPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MethodTaxedPriceImpl that = (MethodTaxedPriceImpl) o;

        return new EqualsBuilder().append(shippingMethodKey, that.shippingMethodKey)
                .append(taxedPrice, that.taxedPrice)
                .append(shippingMethodKey, that.shippingMethodKey)
                .append(taxedPrice, that.taxedPrice)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(shippingMethodKey).append(taxedPrice).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("shippingMethodKey", shippingMethodKey)
                .append("taxedPrice", taxedPrice)
                .build();
    }

}
