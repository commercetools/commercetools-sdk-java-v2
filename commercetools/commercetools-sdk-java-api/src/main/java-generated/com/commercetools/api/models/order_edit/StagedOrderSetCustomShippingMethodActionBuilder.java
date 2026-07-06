
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetCustomShippingMethodActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetCustomShippingMethodAction stagedOrderSetCustomShippingMethodAction = StagedOrderSetCustomShippingMethodAction.builder()
 *             .shippingMethodName("{shippingMethodName}")
 *             .shippingRate(shippingRateBuilder -> shippingRateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderSetCustomShippingMethodActionBuilder
        implements Builder<StagedOrderSetCustomShippingMethodAction> {

    private String shippingMethodName;

    private com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate;

    @Nullable
    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     *  <p>Name of the custom Shipping Method.</p>
     * @param shippingMethodName value to be set
     * @return Builder
     */

    public StagedOrderSetCustomShippingMethodActionBuilder shippingMethodName(final String shippingMethodName) {
        this.shippingMethodName = shippingMethodName;
        return this;
    }

    /**
     *  <p>Determines the shipping price.</p>
     * @param builder function to build the shippingRate value
     * @return Builder
     */

    public StagedOrderSetCustomShippingMethodActionBuilder shippingRate(
            Function<com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder, com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder> builder) {
        this.shippingRate = builder.apply(com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Determines the shipping price.</p>
     * @param builder function to build the shippingRate value
     * @return Builder
     */

    public StagedOrderSetCustomShippingMethodActionBuilder withShippingRate(
            Function<com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder, com.commercetools.api.models.shipping_method.ShippingRateDraft> builder) {
        this.shippingRate = builder.apply(com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Determines the shipping price.</p>
     * @param shippingRate value to be set
     * @return Builder
     */

    public StagedOrderSetCustomShippingMethodActionBuilder shippingRate(
            final com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate) {
        this.shippingRate = shippingRate;
        return this;
    }

    /**
     *  <p>Tax Category used to determine the Tax Rate when the Cart has the <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>.</p>
     * @param builder function to build the taxCategory value
     * @return Builder
     */

    public StagedOrderSetCustomShippingMethodActionBuilder taxCategory(
            Function<com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder, com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder> builder) {
        this.taxCategory = builder
                .apply(com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Tax Category used to determine the Tax Rate when the Cart has the <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>.</p>
     * @param builder function to build the taxCategory value
     * @return Builder
     */

    public StagedOrderSetCustomShippingMethodActionBuilder withTaxCategory(
            Function<com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder, com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier> builder) {
        this.taxCategory = builder
                .apply(com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Tax Category used to determine the Tax Rate when the Cart has the <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>.</p>
     * @param taxCategory value to be set
     * @return Builder
     */

    public StagedOrderSetCustomShippingMethodActionBuilder taxCategory(
            @Nullable final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }

    /**
     *  <p>External Tax Rate for the <code>shippingRate</code> to be set if the Cart has the <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>.</p>
     * @param builder function to build the externalTaxRate value
     * @return Builder
     */

    public StagedOrderSetCustomShippingMethodActionBuilder externalTaxRate(
            Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder> builder) {
        this.externalTaxRate = builder.apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>External Tax Rate for the <code>shippingRate</code> to be set if the Cart has the <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>.</p>
     * @param builder function to build the externalTaxRate value
     * @return Builder
     */

    public StagedOrderSetCustomShippingMethodActionBuilder withExternalTaxRate(
            Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraft> builder) {
        this.externalTaxRate = builder.apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of());
        return this;
    }

    /**
     *  <p>External Tax Rate for the <code>shippingRate</code> to be set if the Cart has the <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>.</p>
     * @param externalTaxRate value to be set
     * @return Builder
     */

    public StagedOrderSetCustomShippingMethodActionBuilder externalTaxRate(
            @Nullable final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
        return this;
    }

    /**
     *  <p>Custom Fields for the custom Shipping Method.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public StagedOrderSetCustomShippingMethodActionBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the custom Shipping Method.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public StagedOrderSetCustomShippingMethodActionBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields for the custom Shipping Method.</p>
     * @param custom value to be set
     * @return Builder
     */

    public StagedOrderSetCustomShippingMethodActionBuilder custom(
            @Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Name of the custom Shipping Method.</p>
     * @return shippingMethodName
     */

    public String getShippingMethodName() {
        return this.shippingMethodName;
    }

    /**
     *  <p>Determines the shipping price.</p>
     * @return shippingRate
     */

    public com.commercetools.api.models.shipping_method.ShippingRateDraft getShippingRate() {
        return this.shippingRate;
    }

    /**
     *  <p>Tax Category used to determine the Tax Rate when the Cart has the <code>Platform</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>.</p>
     * @return taxCategory
     */

    @Nullable
    public com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier getTaxCategory() {
        return this.taxCategory;
    }

    /**
     *  <p>External Tax Rate for the <code>shippingRate</code> to be set if the Cart has the <code>External</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxMode" rel="nofollow">TaxMode</a>.</p>
     * @return externalTaxRate
     */

    @Nullable
    public com.commercetools.api.models.cart.ExternalTaxRateDraft getExternalTaxRate() {
        return this.externalTaxRate;
    }

    /**
     *  <p>Custom Fields for the custom Shipping Method.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     * builds StagedOrderSetCustomShippingMethodAction with checking for non-null required values
     * @return StagedOrderSetCustomShippingMethodAction
     */
    public StagedOrderSetCustomShippingMethodAction build() {
        Objects.requireNonNull(shippingMethodName,
            StagedOrderSetCustomShippingMethodAction.class + ": shippingMethodName is missing");
        Objects.requireNonNull(shippingRate,
            StagedOrderSetCustomShippingMethodAction.class + ": shippingRate is missing");
        return new StagedOrderSetCustomShippingMethodActionImpl(shippingMethodName, shippingRate, taxCategory,
            externalTaxRate, custom);
    }

    /**
     * builds StagedOrderSetCustomShippingMethodAction without checking for non-null required values
     * @return StagedOrderSetCustomShippingMethodAction
     */
    public StagedOrderSetCustomShippingMethodAction buildUnchecked() {
        return new StagedOrderSetCustomShippingMethodActionImpl(shippingMethodName, shippingRate, taxCategory,
            externalTaxRate, custom);
    }

    /**
     * factory method for an instance of StagedOrderSetCustomShippingMethodActionBuilder
     * @return builder
     */
    public static StagedOrderSetCustomShippingMethodActionBuilder of() {
        return new StagedOrderSetCustomShippingMethodActionBuilder();
    }

    /**
     * create builder for StagedOrderSetCustomShippingMethodAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetCustomShippingMethodActionBuilder of(
            final StagedOrderSetCustomShippingMethodAction template) {
        StagedOrderSetCustomShippingMethodActionBuilder builder = new StagedOrderSetCustomShippingMethodActionBuilder();
        builder.shippingMethodName = template.getShippingMethodName();
        builder.shippingRate = template.getShippingRate();
        builder.taxCategory = template.getTaxCategory();
        builder.externalTaxRate = template.getExternalTaxRate();
        builder.custom = template.getCustom();
        return builder;
    }

}
