
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetShippingAddressAndShippingMethodActionBuilder
        implements Builder<StagedOrderSetShippingAddressAndShippingMethodAction> {

    private com.commercetools.api.models.common.BaseAddress address;

    @Nullable
    private com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod;

    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    public StagedOrderSetShippingAddressAndShippingMethodActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    public StagedOrderSetShippingAddressAndShippingMethodActionBuilder address(
            final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    public StagedOrderSetShippingAddressAndShippingMethodActionBuilder shippingMethod(
            Function<com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder, com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder> builder) {
        this.shippingMethod = builder
                .apply(com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    public StagedOrderSetShippingAddressAndShippingMethodActionBuilder shippingMethod(
            @Nullable final com.commercetools.api.models.shipping_method.ShippingMethodResourceIdentifier shippingMethod) {
        this.shippingMethod = shippingMethod;
        return this;
    }

    public StagedOrderSetShippingAddressAndShippingMethodActionBuilder externalTaxRate(
            Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder> builder) {
        this.externalTaxRate = builder.apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of())
                .build();
        return this;
    }

    public StagedOrderSetShippingAddressAndShippingMethodActionBuilder externalTaxRate(
            @Nullable final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
        return this;
    }

    public com.commercetools.api.models.common.BaseAddress getAddress() {
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
        Objects.requireNonNull(address,
            StagedOrderSetShippingAddressAndShippingMethodAction.class + ": address is missing");
        return new StagedOrderSetShippingAddressAndShippingMethodActionImpl(address, shippingMethod, externalTaxRate);
    }

    /**
     * builds StagedOrderSetShippingAddressAndShippingMethodAction without checking for non null required values
     */
    public StagedOrderSetShippingAddressAndShippingMethodAction buildUnchecked() {
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
