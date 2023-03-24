
package com.commercetools.api.models.product;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductSetAssetTagsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSetAssetTagsAction productSetAssetTagsAction = ProductSetAssetTagsAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductSetAssetTagsActionBuilder implements Builder<ProductSetAssetTagsAction> {

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

    @Nullable
    private java.util.List<String> tags;

    /**
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     * @param variantId value to be set
     * @return Builder
     */

    public ProductSetAssetTagsActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>The <code>sku</code> of the ProductVariant to update.</p>
     * @param sku value to be set
     * @return Builder
     */

    public ProductSetAssetTagsActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged Asset is updated. If <code>false</code>, both the current and staged Asset is updated.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductSetAssetTagsActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the Asset to update.</p>
     * @param assetId value to be set
     * @return Builder
     */

    public ProductSetAssetTagsActionBuilder assetId(@Nullable final String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     *  <p>The <code>key</code> of the Asset to update.</p>
     * @param assetKey value to be set
     * @return Builder
     */

    public ProductSetAssetTagsActionBuilder assetKey(@Nullable final String assetKey) {
        this.assetKey = assetKey;
        return this;
    }

    /**
     *  <p>Keywords for categorizing and organizing Assets.</p>
     * @param tags value to be set
     * @return Builder
     */

    public ProductSetAssetTagsActionBuilder tags(@Nullable final String... tags) {
        this.tags = new ArrayList<>(Arrays.asList(tags));
        return this;
    }

    /**
     *  <p>Keywords for categorizing and organizing Assets.</p>
     * @param tags value to be set
     * @return Builder
     */

    public ProductSetAssetTagsActionBuilder tags(@Nullable final java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     *  <p>Keywords for categorizing and organizing Assets.</p>
     * @param tags value to be set
     * @return Builder
     */

    public ProductSetAssetTagsActionBuilder plusTags(@Nullable final String... tags) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.addAll(Arrays.asList(tags));
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

    @Nullable
    public java.util.List<String> getTags() {
        return this.tags;
    }

    /**
     * builds ProductSetAssetTagsAction with checking for non-null required values
     * @return ProductSetAssetTagsAction
     */
    public ProductSetAssetTagsAction build() {
        return new ProductSetAssetTagsActionImpl(variantId, sku, staged, assetId, assetKey, tags);
    }

    /**
     * builds ProductSetAssetTagsAction without checking for non-null required values
     * @return ProductSetAssetTagsAction
     */
    public ProductSetAssetTagsAction buildUnchecked() {
        return new ProductSetAssetTagsActionImpl(variantId, sku, staged, assetId, assetKey, tags);
    }

    public static ProductSetAssetTagsActionBuilder of() {
        return new ProductSetAssetTagsActionBuilder();
    }

    public static ProductSetAssetTagsActionBuilder of(final ProductSetAssetTagsAction template) {
        ProductSetAssetTagsActionBuilder builder = new ProductSetAssetTagsActionBuilder();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.staged = template.getStaged();
        builder.assetId = template.getAssetId();
        builder.assetKey = template.getAssetKey();
        builder.tags = template.getTags();
        return builder;
    }

}
