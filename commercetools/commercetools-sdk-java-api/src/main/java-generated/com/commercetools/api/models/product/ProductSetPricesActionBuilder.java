
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSetPricesActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetPricesAction productSetPricesAction = ProductSetPricesAction.builder()
 *             .plusPrices(pricesBuilder -> pricesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSetPricesActionBuilder implements Builder<ProductSetPricesAction> {

    @Nullable
    private Long variantId;

    @Nullable
    private String sku;

    private java.util.List<com.commercetools.api.models.common.PriceDraft> prices;

    @Nullable
    private Boolean staged;

    /**
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     * @param variantId value to be set
     * @return Builder
     */

    public ProductSetPricesActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>The <code>sku</code> of the ProductVariant to update.</p>
     * @param sku value to be set
     * @return Builder
     */

    public ProductSetPricesActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>The Embedded Prices to set. Each Price must have its unique Price scope (with same currency, country, Customer Group, Channel, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @param prices value to be set
     * @return Builder
     */

    public ProductSetPricesActionBuilder prices(final com.commercetools.api.models.common.PriceDraft... prices) {
        this.prices = new ArrayList<>(Arrays.asList(prices));
        return this;
    }

    /**
     *  <p>The Embedded Prices to set. Each Price must have its unique Price scope (with same currency, country, Customer Group, Channel, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @param prices value to be set
     * @return Builder
     */

    public ProductSetPricesActionBuilder prices(
            final java.util.List<com.commercetools.api.models.common.PriceDraft> prices) {
        this.prices = prices;
        return this;
    }

    /**
     *  <p>The Embedded Prices to set. Each Price must have its unique Price scope (with same currency, country, Customer Group, Channel, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @param prices value to be set
     * @return Builder
     */

    public ProductSetPricesActionBuilder plusPrices(final com.commercetools.api.models.common.PriceDraft... prices) {
        if (this.prices == null) {
            this.prices = new ArrayList<>();
        }
        this.prices.addAll(Arrays.asList(prices));
        return this;
    }

    /**
     *  <p>The Embedded Prices to set. Each Price must have its unique Price scope (with same currency, country, Customer Group, Channel, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @param builder function to build the prices value
     * @return Builder
     */

    public ProductSetPricesActionBuilder plusPrices(
            Function<com.commercetools.api.models.common.PriceDraftBuilder, com.commercetools.api.models.common.PriceDraftBuilder> builder) {
        if (this.prices == null) {
            this.prices = new ArrayList<>();
        }
        this.prices.add(builder.apply(com.commercetools.api.models.common.PriceDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The Embedded Prices to set. Each Price must have its unique Price scope (with same currency, country, Customer Group, Channel, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @param builder function to build the prices value
     * @return Builder
     */

    public ProductSetPricesActionBuilder withPrices(
            Function<com.commercetools.api.models.common.PriceDraftBuilder, com.commercetools.api.models.common.PriceDraftBuilder> builder) {
        this.prices = new ArrayList<>();
        this.prices.add(builder.apply(com.commercetools.api.models.common.PriceDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>The Embedded Prices to set. Each Price must have its unique Price scope (with same currency, country, Customer Group, Channel, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @param builder function to build the prices value
     * @return Builder
     */

    public ProductSetPricesActionBuilder addPrices(
            Function<com.commercetools.api.models.common.PriceDraftBuilder, com.commercetools.api.models.common.PriceDraft> builder) {
        return plusPrices(builder.apply(com.commercetools.api.models.common.PriceDraftBuilder.of()));
    }

    /**
     *  <p>The Embedded Prices to set. Each Price must have its unique Price scope (with same currency, country, Customer Group, Channel, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @param builder function to build the prices value
     * @return Builder
     */

    public ProductSetPricesActionBuilder setPrices(
            Function<com.commercetools.api.models.common.PriceDraftBuilder, com.commercetools.api.models.common.PriceDraft> builder) {
        return prices(builder.apply(com.commercetools.api.models.common.PriceDraftBuilder.of()));
    }

    /**
     *  <p>If <code>true</code>, only the staged ProductVariant is updated. If <code>false</code>, both the current and staged ProductVariant are updated.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductSetPricesActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     * @return variantId
     */

    @Nullable
    public Long getVariantId() {
        return this.variantId;
    }

    /**
     *  <p>The <code>sku</code> of the ProductVariant to update.</p>
     * @return sku
     */

    @Nullable
    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>The Embedded Prices to set. Each Price must have its unique Price scope (with same currency, country, Customer Group, Channel, <code>validFrom</code> and <code>validUntil</code>).</p>
     * @return prices
     */

    public java.util.List<com.commercetools.api.models.common.PriceDraft> getPrices() {
        return this.prices;
    }

    /**
     *  <p>If <code>true</code>, only the staged ProductVariant is updated. If <code>false</code>, both the current and staged ProductVariant are updated.</p>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     * builds ProductSetPricesAction with checking for non-null required values
     * @return ProductSetPricesAction
     */
    public ProductSetPricesAction build() {
        Objects.requireNonNull(prices, ProductSetPricesAction.class + ": prices is missing");
        return new ProductSetPricesActionImpl(variantId, sku, prices, staged);
    }

    /**
     * builds ProductSetPricesAction without checking for non-null required values
     * @return ProductSetPricesAction
     */
    public ProductSetPricesAction buildUnchecked() {
        return new ProductSetPricesActionImpl(variantId, sku, prices, staged);
    }

    /**
     * factory method for an instance of ProductSetPricesActionBuilder
     * @return builder
     */
    public static ProductSetPricesActionBuilder of() {
        return new ProductSetPricesActionBuilder();
    }

    /**
     * create builder for ProductSetPricesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSetPricesActionBuilder of(final ProductSetPricesAction template) {
        ProductSetPricesActionBuilder builder = new ProductSetPricesActionBuilder();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.prices = template.getPrices();
        builder.staged = template.getStaged();
        return builder;
    }

}
