package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.shipping_method.ShippingRateDraft;
import com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier;
import com.commercetools.api.models.order_edit.StagedOrderSetShippingAddressAndCustomShippingMethodAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetShippingAddressAndCustomShippingMethodAction stagedOrderSetShippingAddressAndCustomShippingMethodAction = StagedOrderSetShippingAddressAndCustomShippingMethodAction.builder()
 *             .address(addressBuilder -> addressBuilder)
 *             .shippingMethodName("{shippingMethodName}")
 *             .shippingRate(shippingRateBuilder -> shippingRateBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder implements Builder<StagedOrderSetShippingAddressAndCustomShippingMethodAction> {

    
    
    private com.commercetools.api.models.common.BaseAddress address;
    
    
    
    private String shippingMethodName;
    
    
    
    private com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate;
    
    
    @Nullable
    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;
    
    
    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    
    /**
     *  <p>Polymorphic base type that represents a postal address and contact details. Depending on the read or write action, it can be either Address or AddressDraft that only differ in the data type for the optional <code>custom</code> field.</p>
     * @param builder function to build the address value
     * @return Builder
     */
    
    public StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder address(Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Polymorphic base type that represents a postal address and contact details. Depending on the read or write action, it can be either Address or AddressDraft that only differ in the data type for the optional <code>custom</code> field.</p>
     * @param builder function to build the address value
     * @return Builder
     */
    
    public StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder withAddress(Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddress> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Polymorphic base type that represents a postal address and contact details. Depending on the read or write action, it can be either Address or AddressDraft that only differ in the data type for the optional <code>custom</code> field.</p>
     * @param address value to be set
     * @return Builder
     */
    
    public StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder address( final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }
    
    
    
    
    /**
     * set the value to the shippingMethodName
     * @param shippingMethodName value to be set
     * @return Builder
     */
    
    public StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder shippingMethodName( final String shippingMethodName) {
        this.shippingMethodName = shippingMethodName;
        return this;
    }
    
    
    
    
    /**
     * set the value to the shippingRate using the builder function
     * @param builder function to build the shippingRate value
     * @return Builder
     */
    
    public StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder shippingRate(Function<com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder, com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder> builder) {
        this.shippingRate = builder.apply(com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder.of()).build();
        return this;
    }
    
    /**
     * set the value to the shippingRate using the builder function
     * @param builder function to build the shippingRate value
     * @return Builder
     */
    
    public StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder withShippingRate(Function<com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder, com.commercetools.api.models.shipping_method.ShippingRateDraft> builder) {
        this.shippingRate = builder.apply(com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder.of());
        return this;
    }
                    
    /**
     * set the value to the shippingRate
     * @param shippingRate value to be set
     * @return Builder
     */
    
    public StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder shippingRate( final com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate) {
        this.shippingRate = shippingRate;
        return this;
    }
    
    
    
    
    /**
     *  <p>ResourceIdentifier to a TaxCategory.</p>
     * @param builder function to build the taxCategory value
     * @return Builder
     */
    
    public StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder taxCategory(Function<com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder, com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder> builder) {
        this.taxCategory = builder.apply(com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>ResourceIdentifier to a TaxCategory.</p>
     * @param builder function to build the taxCategory value
     * @return Builder
     */
    
    public StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder withTaxCategory(Function<com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder, com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier> builder) {
        this.taxCategory = builder.apply(com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder.of());
        return this;
    }
                    
    /**
     *  <p>ResourceIdentifier to a TaxCategory.</p>
     * @param taxCategory value to be set
     * @return Builder
     */
    
    public StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder taxCategory(@Nullable final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }
    
    
    
    
    /**
     *  <p>Controls calculation of taxed prices for Line Items, Custom Line Items, and Shipping Methods as explained in Cart tax calculation.</p>
     * @param builder function to build the externalTaxRate value
     * @return Builder
     */
    
    public StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder externalTaxRate(Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder> builder) {
        this.externalTaxRate = builder.apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of()).build();
        return this;
    }
    
    /**
     *  <p>Controls calculation of taxed prices for Line Items, Custom Line Items, and Shipping Methods as explained in Cart tax calculation.</p>
     * @param builder function to build the externalTaxRate value
     * @return Builder
     */
    
    public StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder withExternalTaxRate(Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraft> builder) {
        this.externalTaxRate = builder.apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of());
        return this;
    }
                    
    /**
     *  <p>Controls calculation of taxed prices for Line Items, Custom Line Items, and Shipping Methods as explained in Cart tax calculation.</p>
     * @param externalTaxRate value to be set
     * @return Builder
     */
    
    public StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder externalTaxRate(@Nullable final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
        return this;
    }
    
    

    /**
     *  <p>Polymorphic base type that represents a postal address and contact details. Depending on the read or write action, it can be either Address or AddressDraft that only differ in the data type for the optional <code>custom</code> field.</p>
     * @return address
     */
    
    
    public com.commercetools.api.models.common.BaseAddress getAddress(){
        return this.address;
    }
    
    /**
     * value of shippingMethodName}
     * @return shippingMethodName
     */
    
    
    public String getShippingMethodName(){
        return this.shippingMethodName;
    }
    
    /**
     * value of shippingRate}
     * @return shippingRate
     */
    
    
    public com.commercetools.api.models.shipping_method.ShippingRateDraft getShippingRate(){
        return this.shippingRate;
    }
    
    /**
     *  <p>ResourceIdentifier to a TaxCategory.</p>
     * @return taxCategory
     */
    
    @Nullable
    public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory(){
        return this.taxCategory;
    }
    
    /**
     *  <p>Controls calculation of taxed prices for Line Items, Custom Line Items, and Shipping Methods as explained in Cart tax calculation.</p>
     * @return externalTaxRate
     */
    
    @Nullable
    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate(){
        return this.externalTaxRate;
    }

    /**
     * builds StagedOrderSetShippingAddressAndCustomShippingMethodAction with checking for non-null required values
     * @return StagedOrderSetShippingAddressAndCustomShippingMethodAction
     */
    public StagedOrderSetShippingAddressAndCustomShippingMethodAction build() {
        Objects.requireNonNull(address, StagedOrderSetShippingAddressAndCustomShippingMethodAction.class + ": address is missing");
        Objects.requireNonNull(shippingMethodName, StagedOrderSetShippingAddressAndCustomShippingMethodAction.class + ": shippingMethodName is missing");
        Objects.requireNonNull(shippingRate, StagedOrderSetShippingAddressAndCustomShippingMethodAction.class + ": shippingRate is missing");
        return new StagedOrderSetShippingAddressAndCustomShippingMethodActionImpl(address, shippingMethodName, shippingRate, taxCategory, externalTaxRate);
    }
    
    /**
     * builds StagedOrderSetShippingAddressAndCustomShippingMethodAction without checking for non-null required values
     * @return StagedOrderSetShippingAddressAndCustomShippingMethodAction
     */
    public StagedOrderSetShippingAddressAndCustomShippingMethodAction buildUnchecked() {
        return new StagedOrderSetShippingAddressAndCustomShippingMethodActionImpl(address, shippingMethodName, shippingRate, taxCategory, externalTaxRate);
    }

    /**
     * factory method for an instance of StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder
     * @return builder 
     */
    public static StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder of() {
        return new StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder();
    }

    /**
     * create builder for StagedOrderSetShippingAddressAndCustomShippingMethodAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder of(final StagedOrderSetShippingAddressAndCustomShippingMethodAction template) {
        StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder builder = new StagedOrderSetShippingAddressAndCustomShippingMethodActionBuilder();
        builder.address = template.getAddress();
        builder.shippingMethodName = template.getShippingMethodName();
        builder.shippingRate = template.getShippingRate();
        builder.taxCategory = template.getTaxCategory();
        builder.externalTaxRate = template.getExternalTaxRate();
        return builder;
    }

}
