
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSetAssetKeyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetAssetKeyAction productSetAssetKeyAction = ProductSetAssetKeyAction.builder()
 *             .assetId("{assetId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSetAssetKeyActionBuilder implements Builder<ProductSetAssetKeyAction> {

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
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     */

    public ProductSetAssetKeyActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>The <code>sku</code> of the ProductVariant to update.</p>
     */

    public ProductSetAssetKeyActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged Asset is updated. If <code>false</code>, both the current and staged Asset is updated.</p>
     */

    public ProductSetAssetKeyActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the Asset to update.</p>
     */

    public ProductSetAssetKeyActionBuilder assetId(final String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     */

    public ProductSetAssetKeyActionBuilder assetKey(@Nullable final String assetKey) {
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

    public String getAssetId() {
        return this.assetId;
    }

    @Nullable
    public String getAssetKey() {
        return this.assetKey;
    }

    public ProductSetAssetKeyAction build() {
        Objects.requireNonNull(assetId, ProductSetAssetKeyAction.class + ": assetId is missing");
        return new ProductSetAssetKeyActionImpl(variantId, sku, staged, assetId, assetKey);
    }

    /**
     * builds ProductSetAssetKeyAction without checking for non null required values
     */
    public ProductSetAssetKeyAction buildUnchecked() {
        return new ProductSetAssetKeyActionImpl(variantId, sku, staged, assetId, assetKey);
    }

    public static ProductSetAssetKeyActionBuilder of() {
        return new ProductSetAssetKeyActionBuilder();
    }

    public static ProductSetAssetKeyActionBuilder of(final ProductSetAssetKeyAction template) {
        ProductSetAssetKeyActionBuilder builder = new ProductSetAssetKeyActionBuilder();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.staged = template.getStaged();
        builder.assetId = template.getAssetId();
        builder.assetKey = template.getAssetKey();
        return builder;
    }

}
