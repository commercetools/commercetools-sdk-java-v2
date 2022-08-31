
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductChangeAssetNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductChangeAssetNameAction productChangeAssetNameAction = ProductChangeAssetNameAction.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProductChangeAssetNameActionBuilder implements Builder<ProductChangeAssetNameAction> {

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

    private com.commercetools.api.models.common.LocalizedString name;

    /**
     *  <p>The <code>id</code> of the ProductVariant to update.</p>
     */

    public ProductChangeAssetNameActionBuilder variantId(@Nullable final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    /**
     *  <p>The <code>sku</code> of the ProductVariant to update.</p>
     */

    public ProductChangeAssetNameActionBuilder sku(@Nullable final String sku) {
        this.sku = sku;
        return this;
    }

    /**
     *  <p>If <code>true</code>, only the staged Asset is updated. If <code>false</code>, both the current and staged Asset is updated.</p>
     */

    public ProductChangeAssetNameActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the Asset to update.</p>
     */

    public ProductChangeAssetNameActionBuilder assetId(@Nullable final String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     *  <p>The <code>key</code> of the Asset to update.</p>
     */

    public ProductChangeAssetNameActionBuilder assetKey(@Nullable final String assetKey) {
        this.assetKey = assetKey;
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     */

    public ProductChangeAssetNameActionBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>New value to set. Must not be empty.</p>
     */

    public ProductChangeAssetNameActionBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
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

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public ProductChangeAssetNameAction build() {
        Objects.requireNonNull(name, ProductChangeAssetNameAction.class + ": name is missing");
        return new ProductChangeAssetNameActionImpl(variantId, sku, staged, assetId, assetKey, name);
    }

    /**
     * builds ProductChangeAssetNameAction without checking for non null required values
     */
    public ProductChangeAssetNameAction buildUnchecked() {
        return new ProductChangeAssetNameActionImpl(variantId, sku, staged, assetId, assetKey, name);
    }

    public static ProductChangeAssetNameActionBuilder of() {
        return new ProductChangeAssetNameActionBuilder();
    }

    public static ProductChangeAssetNameActionBuilder of(final ProductChangeAssetNameAction template) {
        ProductChangeAssetNameActionBuilder builder = new ProductChangeAssetNameActionBuilder();
        builder.variantId = template.getVariantId();
        builder.sku = template.getSku();
        builder.staged = template.getStaged();
        builder.assetId = template.getAssetId();
        builder.assetKey = template.getAssetKey();
        builder.name = template.getName();
        return builder;
    }

}
