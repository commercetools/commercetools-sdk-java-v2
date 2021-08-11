
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder
        implements Builder<StagedOrderSetShippingAddressAndCustomShippingMethodAction> {

    private com.commercetools.api.models.common.BaseAddress address;

    private String shippingMethodName;

    private com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate;

    @Nullable
    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    public StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    public StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder address(
            final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    public StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder shippingMethodName(
            final String shippingMethodName) {
        this.shippingMethodName = shippingMethodName;
        return this;
    }

    public StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder shippingRate(
            Function<com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder, com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder> builder) {
        this.shippingRate = builder.apply(com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder.of())
                .build();
        return this;
    }

    public StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder shippingRate(
            final com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate) {
        this.shippingRate = shippingRate;
        return this;
    }

    public StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder taxCategory(
            Function<com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder, com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder> builder) {
        this.taxCategory = builder
                .apply(com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    public StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder taxCategory(
            @Nullable final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }

    public StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder externalTaxRate(
            Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder> builder) {
        this.externalTaxRate = builder.apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of())
                .build();
        return this;
    }

    public StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder externalTaxRate(
            @Nullable final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
        return this;
    }

    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    public String getShippingMethodName() {
        return this.shippingMethodName;
    }

    public com.commercetools.api.models.shipping_method.ShippingRateDraft getShippingRate() {
        return this.shippingRate;
    }

    @Nullable
    public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory() {
        return this.taxCategory;
    }

    @Nullable
    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate() {
        return this.externalTaxRate;
    }

    public StagedOrderSetShippingAddressAndCustomShippingMethodAction build() {
        Objects.requireNonNull(address,
            StagedOrderSetShippingAddressAndCustomShippingMethodAction.class + ": address is missing");
        Objects.requireNonNull(shippingMethodName,
            StagedOrderSetShippingAddressAndCustomShippingMethodAction.class + ": shippingMethodName is missing");
        Objects.requireNonNull(shippingRate,
            StagedOrderSetShippingAddressAndCustomShippingMethodAction.class + ": shippingRate is missing");
        return new StagedOrderSetShippingAddressAndCustomShippingMethodActionImpl(address, shippingMethodName,
            shippingRate, taxCategory, externalTaxRate);
    }

    /**
     * builds StagedOrderSetShippingAddressAndCustomShippingMethodAction without checking for non null required values
     */
    public StagedOrderSetShippingAddressAndCustomShippingMethodAction buildUnchecked() {
        return new StagedOrderSetShippingAddressAndCustomShippingMethodActionImpl(address, shippingMethodName,
            shippingRate, taxCategory, externalTaxRate);
    }

    public static StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder of() {
        return new StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder();
    }

    public static StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder of(
            final StagedOrderSetShippingAddressAndCustomShippingMethodAction template) {
        StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder builder = new StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder();
        builder.address = template.getAddress();
        builder.shippingMethodName = template.getShippingMethodName();
        builder.shippingRate = template.getShippingRate();
        builder.taxCategory = template.getTaxCategory();
        builder.externalTaxRate = template.getExternalTaxRate();
        return builder;
    }

}
