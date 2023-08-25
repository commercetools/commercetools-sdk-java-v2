
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
 * MethodExternalTaxRateDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MethodExternalTaxRateDraftImpl implements MethodExternalTaxRateDraft, ModelBase {

    private String shippingMethodKey;

    private com.commercetools.api.models.cart.ExternalTaxRateDraft taxRate;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MethodExternalTaxRateDraftImpl(@JsonProperty("shippingMethodKey") final String shippingMethodKey,
            @JsonProperty("taxRate") final com.commercetools.api.models.cart.ExternalTaxRateDraft taxRate) {
        this.shippingMethodKey = shippingMethodKey;
        this.taxRate = taxRate;
    }

    /**
     * create empty instance
     */
    public MethodExternalTaxRateDraftImpl() {
    }

    /**
     *  <p>User-defined unique identifier of the Shipping Method in a Cart with <code>Multiple</code> ShippingMode.</p>
     */

    public String getShippingMethodKey() {
        return this.shippingMethodKey;
    }

    /**
     *  <p>External Tax Rate for the Shipping Method, if the Cart has <code>External</code> TaxMode.</p>
     */

    public com.commercetools.api.models.cart.ExternalTaxRateDraft getTaxRate() {
        return this.taxRate;
    }

    public void setShippingMethodKey(final String shippingMethodKey) {
        this.shippingMethodKey = shippingMethodKey;
    }

    public void setTaxRate(final com.commercetools.api.models.cart.ExternalTaxRateDraft taxRate) {
        this.taxRate = taxRate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MethodExternalTaxRateDraftImpl that = (MethodExternalTaxRateDraftImpl) o;

        return new EqualsBuilder().append(shippingMethodKey, that.shippingMethodKey)
                .append(taxRate, that.taxRate)
                .append(shippingMethodKey, that.shippingMethodKey)
                .append(taxRate, that.taxRate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(shippingMethodKey).append(taxRate).toHashCode();
    }

}
