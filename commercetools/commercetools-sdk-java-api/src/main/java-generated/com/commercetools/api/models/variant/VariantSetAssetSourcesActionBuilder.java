
package com.commercetools.api.models.variant;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * VariantSetAssetSourcesActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     VariantSetAssetSourcesAction variantSetAssetSourcesAction = VariantSetAssetSourcesAction.builder()
 *             .plusSources(sourcesBuilder -> sourcesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class VariantSetAssetSourcesActionBuilder implements Builder<VariantSetAssetSourcesAction> {

    @Nullable
    private Boolean staged;

    @Nullable
    private String assetId;

    @Nullable
    private String assetKey;

    private java.util.List<com.commercetools.api.models.common.AssetSource> sources;

    /**
     *  <p>Whether only the staged Asset is updated. If <code>false</code>, both the current and staged Asset is updated.</p>
     * @param staged value to be set
     * @return Builder
     */

    public VariantSetAssetSourcesActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    /**
     *  <p>The <code>id</code> of the Asset to update.</p>
     * @param assetId value to be set
     * @return Builder
     */

    public VariantSetAssetSourcesActionBuilder assetId(@Nullable final String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     *  <p>The <code>key</code> of the Asset to update.</p>
     * @param assetKey value to be set
     * @return Builder
     */

    public VariantSetAssetSourcesActionBuilder assetKey(@Nullable final String assetKey) {
        this.assetKey = assetKey;
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param sources value to be set
     * @return Builder
     */

    public VariantSetAssetSourcesActionBuilder sources(
            final com.commercetools.api.models.common.AssetSource... sources) {
        this.sources = new ArrayList<>(Arrays.asList(sources));
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param sources value to be set
     * @return Builder
     */

    public VariantSetAssetSourcesActionBuilder sources(
            final java.util.List<com.commercetools.api.models.common.AssetSource> sources) {
        this.sources = sources;
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @param sources value to be set
     * @return Builder
     */

    public VariantSetAssetSourcesActionBuilder plusSources(
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

    public VariantSetAssetSourcesActionBuilder plusSources(
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

    public VariantSetAssetSourcesActionBuilder withSources(
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

    public VariantSetAssetSourcesActionBuilder addSources(
            Function<com.commercetools.api.models.common.AssetSourceBuilder, com.commercetools.api.models.common.AssetSource> builder) {
        return plusSources(builder.apply(com.commercetools.api.models.common.AssetSourceBuilder.of()));
    }

    /**
     *  <p>Value to set.</p>
     * @param builder function to build the sources value
     * @return Builder
     */

    public VariantSetAssetSourcesActionBuilder setSources(
            Function<com.commercetools.api.models.common.AssetSourceBuilder, com.commercetools.api.models.common.AssetSource> builder) {
        return sources(builder.apply(com.commercetools.api.models.common.AssetSourceBuilder.of()));
    }

    /**
     *  <p>Whether only the staged Asset is updated. If <code>false</code>, both the current and staged Asset is updated.</p>
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
     * builds VariantSetAssetSourcesAction with checking for non-null required values
     * @return VariantSetAssetSourcesAction
     */
    public VariantSetAssetSourcesAction build() {
        Objects.requireNonNull(sources, VariantSetAssetSourcesAction.class + ": sources is missing");
        return new VariantSetAssetSourcesActionImpl(staged, assetId, assetKey, sources);
    }

    /**
     * builds VariantSetAssetSourcesAction without checking for non-null required values
     * @return VariantSetAssetSourcesAction
     */
    public VariantSetAssetSourcesAction buildUnchecked() {
        return new VariantSetAssetSourcesActionImpl(staged, assetId, assetKey, sources);
    }

    /**
     * factory method for an instance of VariantSetAssetSourcesActionBuilder
     * @return builder
     */
    public static VariantSetAssetSourcesActionBuilder of() {
        return new VariantSetAssetSourcesActionBuilder();
    }

    /**
     * create builder for VariantSetAssetSourcesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static VariantSetAssetSourcesActionBuilder of(final VariantSetAssetSourcesAction template) {
        VariantSetAssetSourcesActionBuilder builder = new VariantSetAssetSourcesActionBuilder();
        builder.staged = template.getStaged();
        builder.assetId = template.getAssetId();
        builder.assetKey = template.getAssetKey();
        builder.sources = template.getSources();
        return builder;
    }

}
