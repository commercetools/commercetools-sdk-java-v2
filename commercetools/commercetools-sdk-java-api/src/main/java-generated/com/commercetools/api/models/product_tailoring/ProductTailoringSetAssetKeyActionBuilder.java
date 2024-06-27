
package com.commercetools.api.models.product_tailoring;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTailoringSetAssetKeyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringSetAssetKeyAction productTailoringSetAssetKeyAction = ProductTailoringSetAssetKeyAction.builder()
 *             .assetId("{assetId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringSetAssetKeyActionBuilder implements Builder<ProductTailoringSetAssetKeyAction> {

    @Nullable
    private Long variantId;

    @Nullable
    private String sku;

    @Nullable
    private Boolean staged;

    private String assetId;

    @Nullable
    private String assetKey;

    /**
     *  <p>The <code>id</code> of the tailored ProductVariant to update.</p>
     * @param variantId value to be set
     * @return Builder
     */

    public ProductTailoringSetAssetKeyActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>The <code>sku</code> of the tailored ProductVariant to update.</p>
     * @param sku value to be set
     * @return Builder
     */

    public ProductTailoringSetAssetKeyActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged Asset is updated. If <code>false</code>, both the current and staged Asset is updated.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductTailoringSetAssetKeyActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the Asset to update.</p>
     * @param assetId value to be set
     * @return Builder
     */

    public ProductTailoringSetAssetKeyActionBuilder assetId(final String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param assetKey value to be set
     * @return Builder
     */

    public ProductTailoringSetAssetKeyActionBuilder assetKey(@Nullable final String assetKey) {
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
     *  <p>If <code>true</code>, only the staged Asset is updated. If <code>false</code>, both the current and staged Asset is updated.</p>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     *  <p>The <code>id</code> of the Asset to update.</p>
     * @return assetId
     */

    public String getAssetId() {
        return this.assetId;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return assetKey
     */

    @Nullable
    public String getAssetKey() {
        return this.assetKey;
    }

    /**
     * builds ProductTailoringSetAssetKeyAction with checking for non-null required values
     * @return ProductTailoringSetAssetKeyAction
     */
    public ProductTailoringSetAssetKeyAction build() {
        Objects.requireNonNull(assetId, ProductTailoringSetAssetKeyAction.class + ": assetId is missing");
        return new ProductTailoringSetAssetKeyActionImpl(variantId, sku, staged, assetId, assetKey);
    }

    /**
     * builds ProductTailoringSetAssetKeyAction without checking for non-null required values
     * @return ProductTailoringSetAssetKeyAction
     */
    public ProductTailoringSetAssetKeyAction buildUnchecked() {
        return new ProductTailoringSetAssetKeyActionImpl(variantId, sku, staged, assetId, assetKey);
    }

    /**
     * factory method for an instance of ProductTailoringSetAssetKeyActionBuilder
     * @return builder
     */
    public static ProductTailoringSetAssetKeyActionBuilder of() {
        return new ProductTailoringSetAssetKeyActionBuilder();
    }

    /**
     * create builder for ProductTailoringSetAssetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringSetAssetKeyActionBuilder of(final ProductTailoringSetAssetKeyAction template) {
        ProductTailoringSetAssetKeyActionBuilder builder = new ProductTailoringSetAssetKeyActionBuilder();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.staged = template.getStaged();
        builder.assetId = template.getAssetId();
        builder.assetKey = template.getAssetKey();
        return builder;
    }

}
