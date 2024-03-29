
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
     * @param builder function to build the asset value
     * @return Builder
     */

    public CategoryAddAssetActionBuilder asset(
            Function<com.commercetools.api.models.common.AssetDraftBuilder, com.commercetools.api.models.common.AssetDraftBuilder> builder) {
        this.asset = builder.apply(com.commercetools.api.models.common.AssetDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to append.</p>
     * @param builder function to build the asset value
     * @return Builder
     */

    public CategoryAddAssetActionBuilder withAsset(
            Function<com.commercetools.api.models.common.AssetDraftBuilder, com.commercetools.api.models.common.AssetDraft> builder) {
        this.asset = builder.apply(com.commercetools.api.models.common.AssetDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Value to append.</p>
     * @param asset value to be set
     * @return Builder
     */

    public CategoryAddAssetActionBuilder asset(final com.commercetools.api.models.common.AssetDraft asset) {
        this.asset = asset;
        return this;
    }

    /**
     *  <p>Position in the array at which the Asset should be put. When specified, the value must be between <code>0</code> and the total number of Assets minus <code>1</code>.</p>
     * @param position value to be set
     * @return Builder
     */

    public CategoryAddAssetActionBuilder position(@Nullable final Integer position) {
        this.position = position;
        return this;
    }

    /**
     *  <p>Value to append.</p>
     * @return asset
     */

    public com.commercetools.api.models.common.AssetDraft getAsset() {
        return this.asset;
    }

    /**
     *  <p>Position in the array at which the Asset should be put. When specified, the value must be between <code>0</code> and the total number of Assets minus <code>1</code>.</p>
     * @return position
     */

    @Nullable
    public Integer getPosition() {
        return this.position;
    }

    /**
     * builds CategoryAddAssetAction with checking for non-null required values
     * @return CategoryAddAssetAction
     */
    public CategoryAddAssetAction build() {
        Objects.requireNonNull(asset, CategoryAddAssetAction.class + ": asset is missing");
        return new CategoryAddAssetActionImpl(asset, position);
    }

    /**
     * builds CategoryAddAssetAction without checking for non-null required values
     * @return CategoryAddAssetAction
     */
    public CategoryAddAssetAction buildUnchecked() {
        return new CategoryAddAssetActionImpl(asset, position);
    }

    /**
     * factory method for an instance of CategoryAddAssetActionBuilder
     * @return builder
     */
    public static CategoryAddAssetActionBuilder of() {
        return new CategoryAddAssetActionBuilder();
    }

    /**
     * create builder for CategoryAddAssetAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategoryAddAssetActionBuilder of(final CategoryAddAssetAction template) {
        CategoryAddAssetActionBuilder builder = new CategoryAddAssetActionBuilder();
        builder.asset = template.getAsset();
        builder.position = template.getPosition();
        return builder;
    }

}
