
package com.commercetools.api.models.category;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategoryAddAssetActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryAddAssetAction categoryAddAssetAction = CategoryAddAssetAction.builder()
 *             .asset(assetBuilder -> assetBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategoryAddAssetActionBuilder implements Builder<CategoryAddAssetAction> {

    private com.commercetools.api.models.common.AssetDraft asset;

    @Nullable
    private Integer position;

    /**
     *  <p>Value to append.</p>
     */

    public CategoryAddAssetActionBuilder asset(
            Function<com.commercetools.api.models.common.AssetDraftBuilder, com.commercetools.api.models.common.AssetDraftBuilder> builder) {
        this.asset = builder.apply(com.commercetools.api.models.common.AssetDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to append.</p>
     */

    public CategoryAddAssetActionBuilder asset(final com.commercetools.api.models.common.AssetDraft asset) {
        this.asset = asset;
        return this;
    }

    /**
     *  <p>Position in the array at which the Asset should be put. When specified, the value must be between <code>0</code> and the total number of Assets minus <code>1</code>.</p>
     */

    public CategoryAddAssetActionBuilder position(@Nullable final Integer position) {
        this.position = position;
        return this;
    }

    public com.commercetools.api.models.common.AssetDraft getAsset() {
        return this.asset;
    }

    @Nullable
    public Integer getPosition() {
        return this.position;
    }

    public CategoryAddAssetAction build() {
        Objects.requireNonNull(asset, CategoryAddAssetAction.class + ": asset is missing");
        return new CategoryAddAssetActionImpl(asset, position);
    }

    /**
     * builds CategoryAddAssetAction without checking for non null required values
     */
    public CategoryAddAssetAction buildUnchecked() {
        return new CategoryAddAssetActionImpl(asset, position);
    }

    public static CategoryAddAssetActionBuilder of() {
        return new CategoryAddAssetActionBuilder();
    }

    public static CategoryAddAssetActionBuilder of(final CategoryAddAssetAction template) {
        CategoryAddAssetActionBuilder builder = new CategoryAddAssetActionBuilder();
        builder.asset = template.getAsset();
        builder.position = template.getPosition();
        return builder;
    }

}
