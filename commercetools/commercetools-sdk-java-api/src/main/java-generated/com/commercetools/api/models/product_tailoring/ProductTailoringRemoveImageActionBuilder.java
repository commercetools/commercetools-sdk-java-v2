
package com.commercetools.api.models.product_tailoring;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTailoringRemoveImageActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringRemoveImageAction productTailoringRemoveImageAction = ProductTailoringRemoveImageAction.builder()
 *             .imageUrl("{imageUrl}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringRemoveImageActionBuilder implements Builder<ProductTailoringRemoveImageAction> {

    @Nullable
    private Long variantId;

    @Nullable
    private String sku;

    private String imageUrl;

    @Nullable
    private Boolean staged;

    /**
     *  <p>The <code>id</code> of the tailored ProductVariant to update.</p>
     * @param variantId value to be set
     * @return Builder
     */

    public ProductTailoringRemoveImageActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>The <code>sku</code> of the tailored ProductVariant to update.</p>
     * @param sku value to be set
     * @return Builder
     */

    public ProductTailoringRemoveImageActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>The URL of the image to remove.</p>
     * @param imageUrl value to be set
     * @return Builder
     */

    public ProductTailoringRemoveImageActionBuilder imageUrl(final String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged image is removed. If <code>false</code>, both the current and staged image is removed.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductTailoringRemoveImageActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the tailored ProductVariant to update.</p>
     * @return variantId
     */

    @Nullable
    public Long getVariantId() {
        return this.variantId;
    }

    /**
     *  <p>The <code>sku</code> of the tailored ProductVariant to update.</p>
     * @return sku
     */

    @Nullable
    public String getSku() {
        return this.sku;
    }

    /**
     *  <p>The URL of the image to remove.</p>
     * @return imageUrl
     */

    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     *  <p>If <code>true</code>, only the staged image is removed. If <code>false</code>, both the current and staged image is removed.</p>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     * builds ProductTailoringRemoveImageAction with checking for non-null required values
     * @return ProductTailoringRemoveImageAction
     */
    public ProductTailoringRemoveImageAction build() {
        Objects.requireNonNull(imageUrl, ProductTailoringRemoveImageAction.class + ": imageUrl is missing");
        return new ProductTailoringRemoveImageActionImpl(variantId, sku, imageUrl, staged);
    }

    /**
     * builds ProductTailoringRemoveImageAction without checking for non-null required values
     * @return ProductTailoringRemoveImageAction
     */
    public ProductTailoringRemoveImageAction buildUnchecked() {
        return new ProductTailoringRemoveImageActionImpl(variantId, sku, imageUrl, staged);
    }

    /**
     * factory method for an instance of ProductTailoringRemoveImageActionBuilder
     * @return builder
     */
    public static ProductTailoringRemoveImageActionBuilder of() {
        return new ProductTailoringRemoveImageActionBuilder();
    }

    /**
     * create builder for ProductTailoringRemoveImageAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringRemoveImageActionBuilder of(final ProductTailoringRemoveImageAction template) {
        ProductTailoringRemoveImageActionBuilder builder = new ProductTailoringRemoveImageActionBuilder();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.imageUrl = template.getImageUrl();
        builder.staged = template.getStaged();
        return builder;
    }

}
