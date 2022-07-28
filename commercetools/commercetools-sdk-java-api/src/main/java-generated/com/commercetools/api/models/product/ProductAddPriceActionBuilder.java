
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductAddPriceActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductAddPriceAction productAddPriceAction = ProductAddPriceAction.builder()
 *             .price(priceBuilder -> priceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductAddPriceActionBuilder implements Builder<ProductAddPriceAction> {

    @Nullable
    private Long variantId;

    @Nullable
    private String sku;

    private com.commercetools.api.models.product.EmbeddedPriceDraft price;

    @Nullable
    private Boolean staged;

    /**
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     */

    public ProductAddPriceActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>The <code>sku</code> of the ProductVariant to update.</p>
     */

    public ProductAddPriceActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>EmbeddedPrice to add to the Product Variant.</p>
     */

    public ProductAddPriceActionBuilder price(
            Function<com.commercetools.api.models.product.EmbeddedPriceDraftBuilder, com.commercetools.api.models.product.EmbeddedPriceDraftBuilder> builder) {
        this.price = builder.apply(com.commercetools.api.models.product.EmbeddedPriceDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>EmbeddedPrice to add to the Product Variant.</p>
     */

    public ProductAddPriceActionBuilder price(final com.commercetools.api.models.product.EmbeddedPriceDraft price) {
        this.price = price;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>prices</code> is updated. If <code>false</code>, both the current and staged <code>prices</code> are updated.</p>
     */

    public ProductAddPriceActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    @Nullable
    public Long getVariantId() {
        return this.variantId;
    }

    @Nullable
    public String getSku() {
        return this.sku;
    }

    public com.commercetools.api.models.product.EmbeddedPriceDraft getPrice() {
        return this.price;
    }

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    public ProductAddPriceAction build() {
        Objects.requireNonNull(price, ProductAddPriceAction.class + ": price is missing");
        return new ProductAddPriceActionImpl(variantId, sku, price, staged);
    }

    /**
     * builds ProductAddPriceAction without checking for non null required values
     */
    public ProductAddPriceAction buildUnchecked() {
        return new ProductAddPriceActionImpl(variantId, sku, price, staged);
    }

    public static ProductAddPriceActionBuilder of() {
        return new ProductAddPriceActionBuilder();
    }

    public static ProductAddPriceActionBuilder of(final ProductAddPriceAction template) {
        ProductAddPriceActionBuilder builder = new ProductAddPriceActionBuilder();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.price = template.getPrice();
        builder.staged = template.getStaged();
        return builder;
    }

}
