
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder {

    private com.commercetools.api.models.common.Address address;

    private String shippingMethodName;

    private com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate;

    @Nullable
    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    public StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder address(
            final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    public StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder shippingMethodName(
            final String shippingMethodName) {
        this.shippingMethodName = shippingMethodName;
        return this;
    }

    public StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder shippingRate(
            final com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate) {
        this.shippingRate = shippingRate;
        return this;
    }

    public StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder taxCategory(
            @Nullable final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }

    public StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder externalTaxRate(
            @Nullable final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
        return this;
    }

    public com.commercetools.api.models.common.Address getAddress() {
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
