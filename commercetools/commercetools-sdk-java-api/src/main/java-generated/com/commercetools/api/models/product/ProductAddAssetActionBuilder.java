
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductAddAssetActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductAddAssetAction productAddAssetAction = ProductAddAssetAction.builder()
 *             .asset(assetBuilder -> assetBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductAddAssetActionBuilder implements Builder<ProductAddAssetAction> {

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
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     */

    public ProductAddAssetActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>The <code>sku</code> of the ProductVariant to update.</p>
     */

    public ProductAddAssetActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged <code>assets</code> are updated. If <code>false</code>, both the current and staged <code>assets</code> are updated.</p>
     */

    public ProductAddAssetActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>Value to append.</p>
     */

    public ProductAddAssetActionBuilder asset(
            Function<com.commercetools.api.models.common.AssetDraftBuilder, com.commercetools.api.models.common.AssetDraftBuilder> builder) {
        this.asset = builder.apply(com.commercetools.api.models.common.AssetDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to append.</p>
     */

    public ProductAddAssetActionBuilder asset(final com.commercetools.api.models.common.AssetDraft asset) {
        this.asset = asset;
        return this;
    }

    /**
     *  <p>Position in <code>assets</code> where the Asset should be put. When specified, the value must be between <code>0</code> and the total number of Assets minus <code>1</code>.</p>
     */

    public ProductAddAssetActionBuilder position(@Nullable final Integer position) {
        this.position = position;
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

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    public com.commercetools.api.models.common.AssetDraft getAsset() {
        return this.asset;
    }

    @Nullable
    public Integer getPosition() {
        return this.position;
    }

    public ProductAddAssetAction build() {
        Objects.requireNonNull(asset, ProductAddAssetAction.class + ": asset is missing");
        return new ProductAddAssetActionImpl(variantId, sku, staged, asset, position);
    }

    /**
     * builds ProductAddAssetAction without checking for non null required values
     */
    public ProductAddAssetAction buildUnchecked() {
        return new ProductAddAssetActionImpl(variantId, sku, staged, asset, position);
    }

    public static ProductAddAssetActionBuilder of() {
        return new ProductAddAssetActionBuilder();
    }

    public static ProductAddAssetActionBuilder of(final ProductAddAssetAction template) {
        ProductAddAssetActionBuilder builder = new ProductAddAssetActionBuilder();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.staged = template.getStaged();
        builder.asset = template.getAsset();
        builder.position = template.getPosition();
        return builder;
    }

}
