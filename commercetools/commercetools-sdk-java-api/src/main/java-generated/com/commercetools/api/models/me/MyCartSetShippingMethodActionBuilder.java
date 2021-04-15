
package com.commercetools.api.models.me;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyCartSetShippingMethodActionBuilder {

    @Nullable
    private com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod;

    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    public MyCartSetShippingMethodActionBuilder shippingMethod(
            @Nullable final com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod) {
        this.shippingMethod = shippingMethod;
        return this;
    }

    public MyCartSetShippingMethodActionBuilder externalTaxRate(
            @Nullable final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier getShippingMethod() {
        return this.shippingMethod;
    }

    @Nullable
    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate() {
        return this.externalTaxRate;
    }

    public MyCartSetShippingMethodAction build() {
        return new MyCartSetShippingMethodActionImpl(shippingMethod, externalTaxRate);
    }

    public static MyCartSetShippingMethodActionBuilder of() {
        return new MyCartSetShippingMethodActionBuilder();
    }

    public static MyCartSetShippingMethodActionBuilder of(final MyCartSetShippingMethodAction template) {
        MyCartSetShippingMethodActionBuilder builder = new MyCartSetShippingMethodActionBuilder();
        builder.shippingMethod = template.getShippingMethod();
        builder.externalTaxRate = template.getExternalTaxRate();
        return builder;
    }

}
