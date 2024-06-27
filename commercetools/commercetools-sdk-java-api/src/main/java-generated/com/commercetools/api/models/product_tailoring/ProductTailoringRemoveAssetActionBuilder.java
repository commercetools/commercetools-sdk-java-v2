
package com.commercetools.api.models.product_tailoring;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTailoringRemoveAssetActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringRemoveAssetAction productTailoringRemoveAssetAction = ProductTailoringRemoveAssetAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringRemoveAssetActionBuilder implements Builder<ProductTailoringRemoveAssetAction> {

    @Nullable
    private Long variantId;

    @Nullable
    private String sku;

    @Nullable
    private Boolean staged;

    @Nullable
    private String assetId;

    @Nullable
    private String assetKey;

    /**
     *  <p>The <code>id</code> of the tailored ProductVariant to update.</p>
     * @param variantId value to be set
     * @return Builder
     */

    public ProductTailoringRemoveAssetActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>The <code>sku</code> of the tailored ProductVariant to update.</p>
     * @param sku value to be set
     * @return Builder
     */

    public ProductTailoringRemoveAssetActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged Asset is removed. If <code>false</code>, both the current and staged Asset is removed.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductTailoringRemoveAssetActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the Asset to remove.</p>
     * @param assetId value to be set
     * @return Builder
     */

    public ProductTailoringRemoveAssetActionBuilder assetId(@Nullable final String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     *  <p>The <code>key</code> of the Asset to remove.</p>
     * @param assetKey value to be set
     * @return Builder
     */

    public ProductTailoringRemoveAssetActionBuilder assetKey(@Nullable final String assetKey) {
        this.assetKey = assetKey;
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
     *  <p>If <code>true</code>, only the staged Asset is removed. If <code>false</code>, both the current and staged Asset is removed.</p>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     *  <p>The <code>id</code> of the Asset to remove.</p>
     * @return assetId
     */

    @Nullable
    public String getAssetId() {
        return this.assetId;
    }

    /**
     *  <p>The <code>key</code> of the Asset to remove.</p>
     * @return assetKey
     */

    @Nullable
    public String getAssetKey() {
        return this.assetKey;
    }

    /**
     * builds ProductTailoringRemoveAssetAction with checking for non-null required values
     * @return ProductTailoringRemoveAssetAction
     */
    public ProductTailoringRemoveAssetAction build() {
        return new ProductTailoringRemoveAssetActionImpl(variantId, sku, staged, assetId, assetKey);
    }

    /**
     * builds ProductTailoringRemoveAssetAction without checking for non-null required values
     * @return ProductTailoringRemoveAssetAction
     */
    public ProductTailoringRemoveAssetAction buildUnchecked() {
        return new ProductTailoringRemoveAssetActionImpl(variantId, sku, staged, assetId, assetKey);
    }

    /**
     * factory method for an instance of ProductTailoringRemoveAssetActionBuilder
     * @return builder
     */
    public static ProductTailoringRemoveAssetActionBuilder of() {
        return new ProductTailoringRemoveAssetActionBuilder();
    }

    /**
     * create builder for ProductTailoringRemoveAssetAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringRemoveAssetActionBuilder of(final ProductTailoringRemoveAssetAction template) {
        ProductTailoringRemoveAssetActionBuilder builder = new ProductTailoringRemoveAssetActionBuilder();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.staged = template.getStaged();
        builder.assetId = template.getAssetId();
        builder.assetKey = template.getAssetKey();
        return builder;
    }

}
