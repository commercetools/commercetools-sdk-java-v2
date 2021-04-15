
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetShippingAddressAndShippingMethodActionBuilder {

    private com.commercetools.api.models.common.Address address;

    @Nullable
    private com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod;

    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    public StagedOrderSetShippingAddressAndShippingMethodActionBuilder address(
            final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    public StagedOrderSetShippingAddressAndShippingMethodActionBuilder shippingMethod(
            @Nullable final com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod) {
        this.shippingMethod = shippingMethod;
        return this;
    }

    public StagedOrderSetShippingAddressAndShippingMethodActionBuilder externalTaxRate(
            @Nullable final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
        return this;
    }

    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    @Nullable
    public com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier getShippingMethod() {
        return this.shippingMethod;
    }

    @Nullable
    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate() {
        return this.externalTaxRate;
    }

    public StagedOrderSetShippingAddressAndShippingMethodAction build() {
        return new StagedOrderSetShippingAddressAndShippingMethodActionImpl(address, shippingMethod, externalTaxRate);
    }

    public static StagedOrderSetShippingAddressAndShippingMethodActionBuilder of() {
        return new StagedOrderSetShippingAddressAndShippingMethodActionBuilder();
    }

    public static StagedOrderSetShippingAddressAndShippingMethodActionBuilder of(
            final StagedOrderSetShippingAddressAndShippingMethodAction template) {
        StagedOrderSetShippingAddressAndShippingMethodActionBuilder builder = new StagedOrderSetShippingAddressAndShippingMethodActionBuilder();
        builder.address = template.getAddress();
        builder.shippingMethod = template.getShippingMethod();
        builder.externalTaxRate = template.getExternalTaxRate();
        return builder;
    }

}
