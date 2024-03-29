
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductRemoveImageActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductRemoveImageAction productRemoveImageAction = ProductRemoveImageAction.builder()
 *             .imageUrl("{imageUrl}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductRemoveImageActionBuilder implements Builder<ProductRemoveImageAction> {

    @Nullable
    private Long variantId;

    @Nullable
    private String sku;

    private String imageUrl;

    @Nullable
    private Boolean staged;

    /**
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     * @param variantId value to be set
     * @return Builder
     */

    public ProductRemoveImageActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>The <code>sku</code> of the ProductVariant to update.</p>
     * @param sku value to be set
     * @return Builder
     */

    public ProductRemoveImageActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>The URL of the image to remove.</p>
     * @param imageUrl value to be set
     * @return Builder
     */

    public ProductRemoveImageActionBuilder imageUrl(final String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged image is removed. If <code>false</code>, both the current and staged image is removed.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductRemoveImageActionBuilder staged(@Nullable final Boolean staged) {
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
     * builds ProductRemoveImageAction with checking for non-null required values
     * @return ProductRemoveImageAction
     */
    public ProductRemoveImageAction build() {
        Objects.requireNonNull(imageUrl, ProductRemoveImageAction.class + ": imageUrl is missing");
        return new ProductRemoveImageActionImpl(variantId, sku, imageUrl, staged);
    }

    /**
     * builds ProductRemoveImageAction without checking for non-null required values
     * @return ProductRemoveImageAction
     */
    public ProductRemoveImageAction buildUnchecked() {
        return new ProductRemoveImageActionImpl(variantId, sku, imageUrl, staged);
    }

    /**
     * factory method for an instance of ProductRemoveImageActionBuilder
     * @return builder
     */
    public static ProductRemoveImageActionBuilder of() {
        return new ProductRemoveImageActionBuilder();
    }

    /**
     * create builder for ProductRemoveImageAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductRemoveImageActionBuilder of(final ProductRemoveImageAction template) {
        ProductRemoveImageActionBuilder builder = new ProductRemoveImageActionBuilder();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.imageUrl = template.getImageUrl();
        builder.staged = template.getStaged();
        return builder;
    }

}
