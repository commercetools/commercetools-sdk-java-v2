
package com.commercetools.api.models.product_tailoring;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductTailoringSetAssetSourcesActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringSetAssetSourcesAction productTailoringSetAssetSourcesAction = ProductTailoringSetAssetSourcesAction.builder()
 *             .plusSources(sourcesBuilder -> sourcesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductTailoringSetAssetSourcesActionBuilder implements Builder<ProductTailoringSetAssetSourcesAction> {

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

    private java.util.List<com.commercetools.api.models.common.AssetSource> sources;

    /**
     *  <p>The <code>id</code> of the tailored ProductVariant to update.</p>
     * @param variantId value to be set
     * @return Builder
     */

    public ProductTailoringSetAssetSourcesActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>The <code>sku</code> of the tailored ProductVariant to update.</p>
     * @param sku value to be set
     * @return Builder
     */

    public ProductTailoringSetAssetSourcesActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged Asset is updated. If <code>false</code> both the current and staged Asset is updated.</p>
     * @param staged value to be set
     * @return Builder
     */

    public ProductTailoringSetAssetSourcesActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the Asset to update.</p>
     * @param assetId value to be set
     * @return Builder
     */

    public ProductTailoringSetAssetSourcesActionBuilder assetId(@Nullable final String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     *  <p>The <code>key</code> of the Asset to update.</p>
     * @param assetKey value to be set
     * @return Builder
     */

    public ProductTailoringSetAssetSourcesActionBuilder assetKey(@Nullable final String assetKey) {
        this.assetKey = assetKey;
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param sources value to be set
     * @return Builder
     */

    public ProductTailoringSetAssetSourcesActionBuilder sources(
            final com.commercetools.api.models.common.AssetSource... sources) {
        this.sources = new ArrayList<>(Arrays.asList(sources));
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param sources value to be set
     * @return Builder
     */

    public ProductTailoringSetAssetSourcesActionBuilder sources(
            final java.util.List<com.commercetools.api.models.common.AssetSource> sources) {
        this.sources = sources;
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param sources value to be set
     * @return Builder
     */

    public ProductTailoringSetAssetSourcesActionBuilder plusSources(
            final com.commercetools.api.models.common.AssetSource... sources) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        this.sources.addAll(Arrays.asList(sources));
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param builder function to build the sources value
     * @return Builder
     */

    public ProductTailoringSetAssetSourcesActionBuilder plusSources(
            Function<com.commercetools.api.models.common.AssetSourceBuilder, com.commercetools.api.models.common.AssetSourceBuilder> builder) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        this.sources.add(builder.apply(com.commercetools.api.models.common.AssetSourceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param builder function to build the sources value
     * @return Builder
     */

    public ProductTailoringSetAssetSourcesActionBuilder withSources(
            Function<com.commercetools.api.models.common.AssetSourceBuilder, com.commercetools.api.models.common.AssetSourceBuilder> builder) {
        this.sources = new ArrayList<>();
        this.sources.add(builder.apply(com.commercetools.api.models.common.AssetSourceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param builder function to build the sources value
     * @return Builder
     */

    public ProductTailoringSetAssetSourcesActionBuilder addSources(
            Function<com.commercetools.api.models.common.AssetSourceBuilder, com.commercetools.api.models.common.AssetSource> builder) {
        return plusSources(builder.apply(com.commercetools.api.models.common.AssetSourceBuilder.of()));
    }

    /**
     *  <p>Value to set.</p>
     * @param builder function to build the sources value
     * @return Builder
     */

    public ProductTailoringSetAssetSourcesActionBuilder setSources(
            Function<com.commercetools.api.models.common.AssetSourceBuilder, com.commercetools.api.models.common.AssetSource> builder) {
        return sources(builder.apply(com.commercetools.api.models.common.AssetSourceBuilder.of()));
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
     *  <p>If <code>true</code>, only the staged Asset is updated. If <code>false</code> both the current and staged Asset is updated.</p>
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

    @Nullable
    public String getAssetId() {
        return this.assetId;
    }

    /**
     *  <p>The <code>key</code> of the Asset to update.</p>
     * @return assetKey
     */

    @Nullable
    public String getAssetKey() {
        return this.assetKey;
    }

    /**
     *  <p>Value to set.</p>
     * @return sources
     */

    public java.util.List<com.commercetools.api.models.common.AssetSource> getSources() {
        return this.sources;
    }

    /**
     * builds ProductTailoringSetAssetSourcesAction with checking for non-null required values
     * @return ProductTailoringSetAssetSourcesAction
     */
    public ProductTailoringSetAssetSourcesAction build() {
        Objects.requireNonNull(sources, ProductTailoringSetAssetSourcesAction.class + ": sources is missing");
        return new ProductTailoringSetAssetSourcesActionImpl(variantId, sku, staged, assetId, assetKey, sources);
    }

    /**
     * builds ProductTailoringSetAssetSourcesAction without checking for non-null required values
     * @return ProductTailoringSetAssetSourcesAction
     */
    public ProductTailoringSetAssetSourcesAction buildUnchecked() {
        return new ProductTailoringSetAssetSourcesActionImpl(variantId, sku, staged, assetId, assetKey, sources);
    }

    /**
     * factory method for an instance of ProductTailoringSetAssetSourcesActionBuilder
     * @return builder
     */
    public static ProductTailoringSetAssetSourcesActionBuilder of() {
        return new ProductTailoringSetAssetSourcesActionBuilder();
    }

    /**
     * create builder for ProductTailoringSetAssetSourcesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringSetAssetSourcesActionBuilder of(
            final ProductTailoringSetAssetSourcesAction template) {
        ProductTailoringSetAssetSourcesActionBuilder builder = new ProductTailoringSetAssetSourcesActionBuilder();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.staged = template.getStaged();
        builder.assetId = template.getAssetId();
        builder.assetKey = template.getAssetKey();
        builder.sources = template.getSources();
        return builder;
    }

}
