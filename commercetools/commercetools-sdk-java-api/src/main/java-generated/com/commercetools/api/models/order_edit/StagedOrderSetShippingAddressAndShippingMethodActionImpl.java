
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class StagedOrderSetShippingAddressAndShippingMethodActionImpl
        implements StagedOrderSetShippingAddressAndShippingMethodAction, ModelBase {

    private String action;

    private com.commercetools.api.models.common.BaseAddress address;

    private com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod;

    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    @JsonCreator
    StagedOrderSetShippingAddressAndShippingMethodActionImpl(
            @JsonProperty("address") final com.commercetools.api.models.common.BaseAddress address,
            @JsonProperty("shippingMethod") final com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod,
            @JsonProperty("externalTaxRate") final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.address = address;
        this.shippingMethod = shippingMethod;
        this.externalTaxRate = externalTaxRate;
        this.action = SET_SHIPPING_ADDRESS_AND_SHIPPING_METHOD;
    }

    public StagedOrderSetShippingAddressAndShippingMethodActionImpl() {
        this.action = SET_SHIPPING_ADDRESS_AND_SHIPPING_METHOD;
    }

    public String getAction() {
        return this.action;
    }

    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    public com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier getShippingMethod() {
        return this.shippingMethod;
    }

    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate() {
        return this.externalTaxRate;
    }

    public void setAddress(final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
    }

    public void setShippingMethod(
            final com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod) {
        this.shippingMethod = shippingMethod;
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

        StagedOrderSetShippingAddressAndShippingMethodActionImpl that = (StagedOrderSetShippingAddressAndShippingMethodActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(address, that.address)
                .append(shippingMethod, that.shippingMethod)
                .append(externalTaxRate, that.externalTaxRate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(address)
                .append(shippingMethod)
                .append(externalTaxRate)
                .toHashCode();
    }

}
