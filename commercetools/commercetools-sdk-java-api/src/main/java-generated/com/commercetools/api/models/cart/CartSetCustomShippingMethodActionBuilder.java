
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetCustomShippingMethodActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetCustomShippingMethodAction cartSetCustomShippingMethodAction = CartSetCustomShippingMethodAction.builder()
 *             .shippingMethodName("{shippingMethodName}")
 *             .shippingRate(shippingRateBuilder -> shippingRateBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetCustomShippingMethodActionBuilder implements Builder<CartSetCustomShippingMethodAction> {

    private String shippingMethodName;

    private com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate;

    @Nullable
    private com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory;

    @Nullable
    private com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate;

    /**
     *  <p>Name of the custom Shipping Method.</p>
     * @param shippingMethodName
     * @return Builder
     */

    public CartSetCustomShippingMethodActionBuilder shippingMethodName(final String shippingMethodName) {
        this.shippingMethodName = shippingMethodName;
        return this;
    }

    /**
     *  <p>Determines the shipping price.</p>
     * @return Builder
     */

    public CartSetCustomShippingMethodActionBuilder shippingRate(
            Function<com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder, com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder> builder) {
        this.shippingRate = builder.apply(com.commercetools.api.models.shipping_method.ShippingRateDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Determines the shipping price.</p>
     * @param shippingRate
     * @return Builder
     */

    public CartSetCustomShippingMethodActionBuilder shippingRate(
            final com.commercetools.api.models.shipping_method.ShippingRateDraft shippingRate) {
        this.shippingRate = shippingRate;
        return this;
    }

    /**
     *  <p>Tax Category used to determine the Tax Rate when the Cart has the <code>Platform</code> TaxMode.</p>
     * @return Builder
     */

    public CartSetCustomShippingMethodActionBuilder taxCategory(
            Function<com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder, com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder> builder) {
        this.taxCategory = builder
                .apply(com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Tax Category used to determine the Tax Rate when the Cart has the <code>Platform</code> TaxMode.</p>
     * @param taxCategory
     * @return Builder
     */

    public CartSetCustomShippingMethodActionBuilder taxCategory(
            @Nullable final com.commercetools.api.models.tax_category.TaxCategoryResourceIdentifier taxCategory) {
        this.taxCategory = taxCategory;
        return this;
    }

    /**
     *  <p>External Tax Rate for the <code>shippingRate</code> to be set if the Cart has the <code>External</code> TaxMode.</p>
     * @return Builder
     */

    public CartSetCustomShippingMethodActionBuilder externalTaxRate(
            Function<com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder, com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder> builder) {
        this.externalTaxRate = builder.apply(com.commercetools.api.models.cart.ExternalTaxRateDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>External Tax Rate for the <code>shippingRate</code> to be set if the Cart has the <code>External</code> TaxMode.</p>
     * @param externalTaxRate
     * @return Builder
     */

    public CartSetCustomShippingMethodActionBuilder externalTaxRate(
            @Nullable final com.commercetools.api.models.cart.ExternalTaxRateDraft externalTaxRate) {
        this.externalTaxRate = externalTaxRate;
        return this;
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

    public CartSetCustomShippingMethodAction build() {
        Objects.requireNonNull(shippingMethodName,
            CartSetCustomShippingMethodAction.class + ": shippingMethodName is missing");
        Objects.requireNonNull(shippingRate, CartSetCustomShippingMethodAction.class + ": shippingRate is missing");
        return new CartSetCustomShippingMethodActionImpl(shippingMethodName, shippingRate, taxCategory,
            externalTaxRate);
    }

    /**
     * builds CartSetCustomShippingMethodAction without checking for non null required values
     */
    public CartSetCustomShippingMethodAction buildUnchecked() {
        return new CartSetCustomShippingMethodActionImpl(shippingMethodName, shippingRate, taxCategory,
            externalTaxRate);
    }

    public static CartSetCustomShippingMethodActionBuilder of() {
        return new CartSetCustomShippingMethodActionBuilder();
    }

    public static CartSetCustomShippingMethodActionBuilder of(final CartSetCustomShippingMethodAction template) {
        CartSetCustomShippingMethodActionBuilder builder = new CartSetCustomShippingMethodActionBuilder();
        builder.shippingMethodName = template.getShippingMethodName();
        builder.shippingRate = template.getShippingRate();
        builder.taxCategory = template.getTaxCategory();
        builder.externalTaxRate = template.getExternalTaxRate();
        return builder;
    }

}
