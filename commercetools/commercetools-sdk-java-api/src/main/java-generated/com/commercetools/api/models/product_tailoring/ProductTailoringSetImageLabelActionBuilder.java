
package com.commercetools.api.models.product_tailoring;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTailoringSetImageLabelActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringSetImageLabelAction productTailoringSetImageLabelAction = ProductTailoringSetImageLabelAction.builder()
 *             .imageUrl("{imageUrl}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringSetImageLabelActionBuilder implements Builder<ProductTailoringSetImageLabelAction> {

    @Nullable
    private String sku;

    @Nullable
    private Long variantId;

    private String imageUrl;

    @Nullable
    private String label;

    @Nullable
    private Boolean staged;

    /**
     *  <p>The <code>sku</code> of the tailored ProductVariant to update.</p>
     * @param sku value to be set
     * @return Builder
     */

    public ProductTailoringSetImageLabelActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the tailored ProductVariant to update.</p>
     * @param variantId value to be set
     * @return Builder
     */

    public ProductTailoringSetImageLabelActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>The URL of the image to set the label.</p>
     * @param imageUrl value to be set
     * @return Builder
     */

    public ProductTailoringSetImageLabelActionBuilder imageUrl(final String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param label value to be set
     * @return Builder
     */

    public ProductTailoringSetImageLabelActionBuilder label(@Nullable final String label) {
        this.label = label;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged image is updated. If <code>false</code>, both the current and staged image is updated.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductTailoringSetImageLabelActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
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
     *  <p>The <code>id</code> of the tailored ProductVariant to update.</p>
     * @return variantId
     */

    @Nullable
    public Long getVariantId() {
        return this.variantId;
    }

    /**
     *  <p>The URL of the image to set the label.</p>
     * @return imageUrl
     */

    public String getImageUrl() {
        return this.imageUrl;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return label
     */

    @Nullable
    public String getLabel() {
        return this.label;
    }

    /**
     *  <p>If <code>true</code>, only the staged image is updated. If <code>false</code>, both the current and staged image is updated.</p>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     * builds ProductTailoringSetImageLabelAction with checking for non-null required values
     * @return ProductTailoringSetImageLabelAction
     */
    public ProductTailoringSetImageLabelAction build() {
        Objects.requireNonNull(imageUrl, ProductTailoringSetImageLabelAction.class + ": imageUrl is missing");
        return new ProductTailoringSetImageLabelActionImpl(sku, variantId, imageUrl, label, staged);
    }

    /**
     * builds ProductTailoringSetImageLabelAction without checking for non-null required values
     * @return ProductTailoringSetImageLabelAction
     */
    public ProductTailoringSetImageLabelAction buildUnchecked() {
        return new ProductTailoringSetImageLabelActionImpl(sku, variantId, imageUrl, label, staged);
    }

    /**
     * factory method for an instance of ProductTailoringSetImageLabelActionBuilder
     * @return builder
     */
    public static ProductTailoringSetImageLabelActionBuilder of() {
        return new ProductTailoringSetImageLabelActionBuilder();
    }

    /**
     * create builder for ProductTailoringSetImageLabelAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringSetImageLabelActionBuilder of(final ProductTailoringSetImageLabelAction template) {
        ProductTailoringSetImageLabelActionBuilder builder = new ProductTailoringSetImageLabelActionBuilder();
        builder.sku = template.getSku();
        builder.variantId = template.getVariantId();
        builder.imageUrl = template.getImageUrl();
        builder.label = template.getLabel();
        builder.staged = template.getStaged();
        return builder;
    }

}
