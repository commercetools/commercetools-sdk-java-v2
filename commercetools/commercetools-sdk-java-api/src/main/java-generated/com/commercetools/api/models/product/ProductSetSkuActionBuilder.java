
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSetSkuActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetSkuAction productSetSkuAction = ProductSetSkuAction.builder()
 *             .variantId(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSetSkuActionBuilder implements Builder<ProductSetSkuAction> {

    private Long variantId;

    @Nullable
    private String sku;

    @Nullable
    private Boolean staged;

    /**
     *
     */

    public ProductSetSkuActionBuilder variantId(final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>SKU must be unique. If left blank or set to <code>null</code>, the sku is unset/removed.</p>
     */

    public ProductSetSkuActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *
     */

    public ProductSetSkuActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    public Long getVariantId() {
        return this.variantId;
    }

    @Nullable
    public String getSku() {
        return this.sku;
    }

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    public ProductSetSkuAction build() {
        Objects.requireNonNull(variantId, ProductSetSkuAction.class + ": variantId is missing");
        return new ProductSetSkuActionImpl(variantId, sku, staged);
    }

    /**
     * builds ProductSetSkuAction without checking for non null required values
     */
    public ProductSetSkuAction buildUnchecked() {
        return new ProductSetSkuActionImpl(variantId, sku, staged);
    }

    public static ProductSetSkuActionBuilder of() {
        return new ProductSetSkuActionBuilder();
    }

    public static ProductSetSkuActionBuilder of(final ProductSetSkuAction template) {
        ProductSetSkuActionBuilder builder = new ProductSetSkuActionBuilder();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.staged = template.getStaged();
        return builder;
    }

}
