
package com.commercetools.api.models.variant;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantSetAssetsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantSetAssetsAction variantSetAssetsAction = VariantSetAssetsAction.builder()
 *             .plusAssets(assetsBuilder -> assetsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantSetAssetsActionBuilder implements Builder<VariantSetAssetsAction> {

    private java.util.List<com.commercetools.api.models.common.AssetDraft> assets;

    @Nullable
    private Boolean staged;

    /**
     *  <p>Assets to set for the Variant.</p>
     * @param assets value to be set
     * @return Builder
     */

    public VariantSetAssetsActionBuilder assets(final com.commercetools.api.models.common.AssetDraft... assets) {
        this.assets = new ArrayList<>(Arrays.asList(assets));
        return this;
    }

    /**
     *  <p>Assets to set for the Variant.</p>
     * @param assets value to be set
     * @return Builder
     */

    public VariantSetAssetsActionBuilder assets(
            final java.util.List<com.commercetools.api.models.common.AssetDraft> assets) {
        this.assets = assets;
        return this;
    }

    /**
     *  <p>Assets to set for the Variant.</p>
     * @param assets value to be set
     * @return Builder
     */

    public VariantSetAssetsActionBuilder plusAssets(final com.commercetools.api.models.common.AssetDraft... assets) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.addAll(Arrays.asList(assets));
        return this;
    }

    /**
     *  <p>Assets to set for the Variant.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public VariantSetAssetsActionBuilder plusAssets(
            Function<com.commercetools.api.models.common.AssetDraftBuilder, com.commercetools.api.models.common.AssetDraftBuilder> builder) {
        if (this.assets == null) {
            this.assets = new ArrayList<>();
        }
        this.assets.add(builder.apply(com.commercetools.api.models.common.AssetDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Assets to set for the Variant.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public VariantSetAssetsActionBuilder withAssets(
            Function<com.commercetools.api.models.common.AssetDraftBuilder, com.commercetools.api.models.common.AssetDraftBuilder> builder) {
        this.assets = new ArrayList<>();
        this.assets.add(builder.apply(com.commercetools.api.models.common.AssetDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Assets to set for the Variant.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public VariantSetAssetsActionBuilder addAssets(
            Function<com.commercetools.api.models.common.AssetDraftBuilder, com.commercetools.api.models.common.AssetDraft> builder) {
        return plusAssets(builder.apply(com.commercetools.api.models.common.AssetDraftBuilder.of()));
    }

    /**
     *  <p>Assets to set for the Variant.</p>
     * @param builder function to build the assets value
     * @return Builder
     */

    public VariantSetAssetsActionBuilder setAssets(
            Function<com.commercetools.api.models.common.AssetDraftBuilder, com.commercetools.api.models.common.AssetDraft> builder) {
        return assets(builder.apply(com.commercetools.api.models.common.AssetDraftBuilder.of()));
    }

    /**
     *  <p>Whether only the staged assets are set. If <code>false</code>, both the current and staged assets are updated.</p>
     * @param staged value to be set
     * @return Builder
     */

    public VariantSetAssetsActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>Assets to set for the Variant.</p>
     * @return assets
     */

    public java.util.List<com.commercetools.api.models.common.AssetDraft> getAssets() {
        return this.assets;
    }

    /**
     *  <p>Whether only the staged assets are set. If <code>false</code>, both the current and staged assets are updated.</p>
     * @return staged
     */

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    /**
     * builds VariantSetAssetsAction with checking for non-null required values
     * @return VariantSetAssetsAction
     */
    public VariantSetAssetsAction build() {
        Objects.requireNonNull(assets, VariantSetAssetsAction.class + ": assets is missing");
        return new VariantSetAssetsActionImpl(assets, staged);
    }

    /**
     * builds VariantSetAssetsAction without checking for non-null required values
     * @return VariantSetAssetsAction
     */
    public VariantSetAssetsAction buildUnchecked() {
        return new VariantSetAssetsActionImpl(assets, staged);
    }

    /**
     * factory method for an instance of VariantSetAssetsActionBuilder
     * @return builder
     */
    public static VariantSetAssetsActionBuilder of() {
        return new VariantSetAssetsActionBuilder();
    }

    /**
     * create builder for VariantSetAssetsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantSetAssetsActionBuilder of(final VariantSetAssetsAction template) {
        VariantSetAssetsActionBuilder builder = new VariantSetAssetsActionBuilder();
        builder.assets = template.getAssets();
        builder.staged = template.getStaged();
        return builder;
    }

}
