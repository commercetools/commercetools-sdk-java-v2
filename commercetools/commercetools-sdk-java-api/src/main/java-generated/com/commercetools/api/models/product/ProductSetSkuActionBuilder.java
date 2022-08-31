
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
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     */

    public ProductSetSkuActionBuilder variantId(final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>Value to set. Must be unique. If empty, any existing value will be removed.</p>
     */

    public ProductSetSkuActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>sku</code> is updated. If <code>false</code>, both the current and staged <code>sku</code> are updated.</p>
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
