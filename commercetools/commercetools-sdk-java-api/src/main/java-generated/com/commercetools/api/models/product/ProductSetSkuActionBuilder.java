
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
     * @param variantId value to be set
     * @return Builder
     */

    public ProductSetSkuActionBuilder variantId(final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>Value to set. Must be unique. If empty, any existing value will be removed.</p>
     * @param sku value to be set
     * @return Builder
     */

    public ProductSetSkuActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>sku</code> is updated. If <code>false</code>, both the current and staged <code>sku</code> are updated.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductSetSkuActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     * @return variantId
     */

    public Long getVariantId() {
        return this.variantId;
    }

    /**
     *  <p>Value to set. Must be unique. If empty, any existing value will be removed.</p>
     * @return sku
     */

    @Nullable
    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>sku</code> is updated. If <code>false</code>, both the current and staged <code>sku</code> are updated.</p>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     * builds ProductSetSkuAction with checking for non-null required values
     * @return ProductSetSkuAction
     */
    public ProductSetSkuAction build() {
        Objects.requireNonNull(variantId, ProductSetSkuAction.class + ": variantId is missing");
        return new ProductSetSkuActionImpl(variantId, sku, staged);
    }

    /**
     * builds ProductSetSkuAction without checking for non-null required values
     * @return ProductSetSkuAction
     */
    public ProductSetSkuAction buildUnchecked() {
        return new ProductSetSkuActionImpl(variantId, sku, staged);
    }

    /**
     * factory method for an instance of ProductSetSkuActionBuilder
     * @return builder
     */
    public static ProductSetSkuActionBuilder of() {
        return new ProductSetSkuActionBuilder();
    }

    /**
     * create builder for ProductSetSkuAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSetSkuActionBuilder of(final ProductSetSkuAction template) {
        ProductSetSkuActionBuilder builder = new ProductSetSkuActionBuilder();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.staged = template.getStaged();
        return builder;
    }

}
