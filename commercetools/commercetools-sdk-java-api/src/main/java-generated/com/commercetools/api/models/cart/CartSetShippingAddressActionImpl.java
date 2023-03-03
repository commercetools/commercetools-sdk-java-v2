
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
 *  <p>Setting the shipping address also sets the TaxRate of Line Items and calculates the TaxedPrice.</p>
 *  <p>If a matching price cannot be found for the given shipping address during Line Item Price selection, a MissingTaxRateForCountry error is returned.</p>
 *  <p>If you want to allow shipping to states inside a country that are not explicitly covered by a TaxRate, set the <code>countryTaxRateFallbackEnabled</code> field to <code>true</code> in the CartsConfiguration by using the Change CountryTaxRateFallbackEnabled update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetShippingAddressActionImpl implements CartSetShippingAddressAction, ModelBase {

    private String action;

    private com.commercetools.api.models.common.BaseAddress address;

    @JsonCreator
    CartSetShippingAddressActionImpl(
            @JsonProperty("address") final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        this.action = SET_SHIPPING_ADDRESS;
    }

    public CartSetShippingAddressActionImpl() {
        this.action = SET_SHIPPING_ADDRESS;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. If not set, the shipping address is unset, and the <code>taxedPrice</code> and <code>taxRate</code> are unset in all Line Items of the Cart.</p>
     */

    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    public void setAddress(final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartSetShippingAddressActionImpl that = (CartSetShippingAddressActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(address, that.address).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(address).toHashCode();
    }

}
