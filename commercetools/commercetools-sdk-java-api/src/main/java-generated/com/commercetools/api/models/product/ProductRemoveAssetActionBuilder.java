
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductRemoveAssetActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductRemoveAssetAction productRemoveAssetAction = ProductRemoveAssetAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductRemoveAssetActionBuilder implements Builder<ProductRemoveAssetAction> {

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
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     */

    public ProductRemoveAssetActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>The <code>sku</code> of the ProductVariant to update.</p>
     */

    public ProductRemoveAssetActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged Asset is removed. If <code>false</code>, both the current and staged Asset is removed.</p>
     */

    public ProductRemoveAssetActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the Asset to remove.</p>
     */

    public ProductRemoveAssetActionBuilder assetId(@Nullable final String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     *  <p>The <code>key</code> of the Asset to remove.</p>
     */

    public ProductRemoveAssetActionBuilder assetKey(@Nullable final String assetKey) {
        this.assetKey = assetKey;
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

    @Nullable
    public String getAssetId() {
        return this.assetId;
    }

    @Nullable
    public String getAssetKey() {
        return this.assetKey;
    }

    public ProductRemoveAssetAction build() {
        return new ProductRemoveAssetActionImpl(variantId, sku, staged, assetId, assetKey);
    }

    /**
     * builds ProductRemoveAssetAction without checking for non null required values
     */
    public ProductRemoveAssetAction buildUnchecked() {
        return new ProductRemoveAssetActionImpl(variantId, sku, staged, assetId, assetKey);
    }

    public static ProductRemoveAssetActionBuilder of() {
        return new ProductRemoveAssetActionBuilder();
    }

    public static ProductRemoveAssetActionBuilder of(final ProductRemoveAssetAction template) {
        ProductRemoveAssetActionBuilder builder = new ProductRemoveAssetActionBuilder();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.staged = template.getStaged();
        builder.assetId = template.getAssetId();
        builder.assetKey = template.getAssetKey();
        return builder;
    }

}
