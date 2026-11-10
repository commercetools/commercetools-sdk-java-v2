
package com.commercetools.api.models.variant;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantAddAssetActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantAddAssetAction variantAddAssetAction = VariantAddAssetAction.builder()
 *             .asset(assetBuilder -> assetBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantAddAssetActionBuilder implements Builder<VariantAddAssetAction> {

    @Nullable
    private Boolean staged;

    private com.commercetools.api.models.common.AssetDraft asset;

    @Nullable
    private Integer position;

    /**
     *  <p>Whether only the staged <code>assets</code> are updated. If <code>false</code>, both the current and staged <code>assets</code> are updated.</p>
     * @param staged value to be set
     * @return Builder
     */

    public VariantAddAssetActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>Value to append.</p>
     * @param builder function to build the asset value
     * @return Builder
     */

    public VariantAddAssetActionBuilder asset(
            Function<com.commercetools.api.models.common.AssetDraftBuilder, com.commercetools.api.models.common.AssetDraftBuilder> builder) {
        this.asset = builder.apply(com.commercetools.api.models.common.AssetDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value to append.</p>
     * @param builder function to build the asset value
     * @return Builder
     */

    public VariantAddAssetActionBuilder withAsset(
            Function<com.commercetools.api.models.common.AssetDraftBuilder, com.commercetools.api.models.common.AssetDraft> builder) {
        this.asset = builder.apply(com.commercetools.api.models.common.AssetDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Value to append.</p>
     * @param asset value to be set
     * @return Builder
     */

    public VariantAddAssetActionBuilder asset(final com.commercetools.api.models.common.AssetDraft asset) {
        this.asset = asset;
        return this;
    }

    /**
     *  <p>Position in <code>assets</code> where the Asset should be put. When specified, the value must be between <code>0</code> and the total number of Assets minus <code>1</code>.</p>
     * @param position value to be set
     * @return Builder
     */

    public VariantAddAssetActionBuilder position(@Nullable final Integer position) {
        this.position = position;
        return this;
    }

    /**
     *  <p>Whether only the staged <code>assets</code> are updated. If <code>false</code>, both the current and staged <code>assets</code> are updated.</p>
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
     * builds VariantAddAssetAction with checking for non-null required values
     * @return VariantAddAssetAction
     */
    public VariantAddAssetAction build() {
        Objects.requireNonNull(asset, VariantAddAssetAction.class + ": asset is missing");
        return new VariantAddAssetActionImpl(staged, asset, position);
    }

    /**
     * builds VariantAddAssetAction without checking for non-null required values
     * @return VariantAddAssetAction
     */
    public VariantAddAssetAction buildUnchecked() {
        return new VariantAddAssetActionImpl(staged, asset, position);
    }

    /**
     * factory method for an instance of VariantAddAssetActionBuilder
     * @return builder
     */
    public static VariantAddAssetActionBuilder of() {
        return new VariantAddAssetActionBuilder();
    }

    /**
     * create builder for VariantAddAssetAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantAddAssetActionBuilder of(final VariantAddAssetAction template) {
        VariantAddAssetActionBuilder builder = new VariantAddAssetActionBuilder();
        builder.staged = template.getStaged();
        builder.asset = template.getAsset();
        builder.position = template.getPosition();
        return builder;
    }

}
