
package com.commercetools.api.models.product_tailoring;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTailoringAddAssetActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringAddAssetAction productTailoringAddAssetAction = ProductTailoringAddAssetAction.builder()
 *             .asset(assetBuilder -> assetBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringAddAssetActionBuilder implements Builder<ProductTailoringAddAssetAction> {

    @Nullable
    private Long variantId;

    @Nullable
    private String sku;

    @Nullable
    private Boolean staged;

    private com.commercetools.api.models.common.AssetDraft asset;

    @Nullable
    private Integer position;

    /**
     *  <p>The <code>id</code> of the tailored ProductVariant to update.</p>
     * @param variantId value to be set
     * @return Builder
     */

    public ProductTailoringAddAssetActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>The <code>sku</code> of the tailored ProductVariant to update.</p>
     * @param sku value to be set
     * @return Builder
     */

    public ProductTailoringAddAssetActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>assets</code> are updated. If <code>false</code>, both the current and staged <code>assets</code> are updated.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductTailoringAddAssetActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>Value to append.</p>
     * @param builder function to build the asset value
     * @return Builder
     */

    public ProductTailoringAddAssetActionBuilder asset(
            Function<com.commercetools.api.models.common.AssetDraftBuilder, com.commercetools.api.models.common.AssetDraftBuilder> builder) {
        this.asset = builder.apply(com.commercetools.api.models.common.AssetDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to append.</p>
     * @param builder function to build the asset value
     * @return Builder
     */

    public ProductTailoringAddAssetActionBuilder withAsset(
            Function<com.commercetools.api.models.common.AssetDraftBuilder, com.commercetools.api.models.common.AssetDraft> builder) {
        this.asset = builder.apply(com.commercetools.api.models.common.AssetDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Value to append.</p>
     * @param asset value to be set
     * @return Builder
     */

    public ProductTailoringAddAssetActionBuilder asset(final com.commercetools.api.models.common.AssetDraft asset) {
        this.asset = asset;
        return this;
    }

    /**
     *  <p>Position in <code>assets</code> where the Asset should be put. When specified, the value must be between <code>0</code> and the total number of Assets minus <code>1</code>.</p>
     * @param position value to be set
     * @return Builder
     */

    public ProductTailoringAddAssetActionBuilder position(@Nullable final Integer position) {
        this.position = position;
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
     *  <p>If <code>true</code>, only the staged <code>assets</code> are updated. If <code>false</code>, both the current and staged <code>assets</code> are updated.</p>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     *  <p>Value to append.</p>
     * @return asset
     */

    public com.commercetools.api.models.common.AssetDraft getAsset() {
        return this.asset;
    }

    /**
     *  <p>Position in <code>assets</code> where the Asset should be put. When specified, the value must be between <code>0</code> and the total number of Assets minus <code>1</code>.</p>
     * @return position
     */

    @Nullable
    public Integer getPosition() {
        return this.position;
    }

    /**
     * builds ProductTailoringAddAssetAction with checking for non-null required values
     * @return ProductTailoringAddAssetAction
     */
    public ProductTailoringAddAssetAction build() {
        Objects.requireNonNull(asset, ProductTailoringAddAssetAction.class + ": asset is missing");
        return new ProductTailoringAddAssetActionImpl(variantId, sku, staged, asset, position);
    }

    /**
     * builds ProductTailoringAddAssetAction without checking for non-null required values
     * @return ProductTailoringAddAssetAction
     */
    public ProductTailoringAddAssetAction buildUnchecked() {
        return new ProductTailoringAddAssetActionImpl(variantId, sku, staged, asset, position);
    }

    /**
     * factory method for an instance of ProductTailoringAddAssetActionBuilder
     * @return builder
     */
    public static ProductTailoringAddAssetActionBuilder of() {
        return new ProductTailoringAddAssetActionBuilder();
    }

    /**
     * create builder for ProductTailoringAddAssetAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringAddAssetActionBuilder of(final ProductTailoringAddAssetAction template) {
        ProductTailoringAddAssetActionBuilder builder = new ProductTailoringAddAssetActionBuilder();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.staged = template.getStaged();
        builder.asset = template.getAsset();
        builder.position = template.getPosition();
        return builder;
    }

}
