
package com.commercetools.api.models.category;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategorySetAssetSourcesActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategorySetAssetSourcesAction categorySetAssetSourcesAction = CategorySetAssetSourcesAction.builder()
 *             .plusSources(sourcesBuilder -> sourcesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CategorySetAssetSourcesActionBuilder implements Builder<CategorySetAssetSourcesAction> {

    @Nullable
    private String assetId;

    @Nullable
    private String assetKey;

    private java.util.List<com.commercetools.api.models.common.AssetSource> sources;

    /**
     *  <p>New value to set. Either <code>assetId</code> or <code>assetKey</code> is required.</p>
     * @param assetId value to be set
     * @return Builder
     */

    public CategorySetAssetSourcesActionBuilder assetId(@Nullable final String assetId) {
        this.assetId = assetId;
        return this;
    }

    /**
     *  <p>New value to set. Either <code>assetId</code> or <code>assetKey</code> is required.</p>
     * @param assetKey value to be set
     * @return Builder
     */

    public CategorySetAssetSourcesActionBuilder assetKey(@Nullable final String assetKey) {
        this.assetKey = assetKey;
        return this;
    }

    /**
     *  <p>Must not be empty. At least one entry is required.</p>
     * @param sources value to be set
     * @return Builder
     */

    public CategorySetAssetSourcesActionBuilder sources(
            final com.commercetools.api.models.common.AssetSource... sources) {
        this.sources = new ArrayList<>(Arrays.asList(sources));
        return this;
    }

    /**
     *  <p>Must not be empty. At least one entry is required.</p>
     * @param sources value to be set
     * @return Builder
     */

    public CategorySetAssetSourcesActionBuilder sources(
            final java.util.List<com.commercetools.api.models.common.AssetSource> sources) {
        this.sources = sources;
        return this;
    }

    /**
     *  <p>Must not be empty. At least one entry is required.</p>
     * @param sources value to be set
     * @return Builder
     */

    public CategorySetAssetSourcesActionBuilder plusSources(
            final com.commercetools.api.models.common.AssetSource... sources) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        this.sources.addAll(Arrays.asList(sources));
        return this;
    }

    /**
     *  <p>Must not be empty. At least one entry is required.</p>
     * @param builder function to build the sources value
     * @return Builder
     */

    public CategorySetAssetSourcesActionBuilder plusSources(
            Function<com.commercetools.api.models.common.AssetSourceBuilder, com.commercetools.api.models.common.AssetSourceBuilder> builder) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        this.sources.add(builder.apply(com.commercetools.api.models.common.AssetSourceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Must not be empty. At least one entry is required.</p>
     * @param builder function to build the sources value
     * @return Builder
     */

    public CategorySetAssetSourcesActionBuilder withSources(
            Function<com.commercetools.api.models.common.AssetSourceBuilder, com.commercetools.api.models.common.AssetSourceBuilder> builder) {
        this.sources = new ArrayList<>();
        this.sources.add(builder.apply(com.commercetools.api.models.common.AssetSourceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>New value to set. Either <code>assetId</code> or <code>assetKey</code> is required.</p>
     * @return assetId
     */

    @Nullable
    public String getAssetId() {
        return this.assetId;
    }

    /**
     *  <p>New value to set. Either <code>assetId</code> or <code>assetKey</code> is required.</p>
     * @return assetKey
     */

    @Nullable
    public String getAssetKey() {
        return this.assetKey;
    }

    /**
     *  <p>Must not be empty. At least one entry is required.</p>
     * @return sources
     */

    public java.util.List<com.commercetools.api.models.common.AssetSource> getSources() {
        return this.sources;
    }

    /**
     * builds CategorySetAssetSourcesAction with checking for non-null required values
     * @return CategorySetAssetSourcesAction
     */
    public CategorySetAssetSourcesAction build() {
        Objects.requireNonNull(sources, CategorySetAssetSourcesAction.class + ": sources is missing");
        return new CategorySetAssetSourcesActionImpl(assetId, assetKey, sources);
    }

    /**
     * builds CategorySetAssetSourcesAction without checking for non-null required values
     * @return CategorySetAssetSourcesAction
     */
    public CategorySetAssetSourcesAction buildUnchecked() {
        return new CategorySetAssetSourcesActionImpl(assetId, assetKey, sources);
    }

    /**
     * factory method for an instance of CategorySetAssetSourcesActionBuilder
     * @return builder
     */
    public static CategorySetAssetSourcesActionBuilder of() {
        return new CategorySetAssetSourcesActionBuilder();
    }

    /**
     * create builder for CategorySetAssetSourcesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategorySetAssetSourcesActionBuilder of(final CategorySetAssetSourcesAction template) {
        CategorySetAssetSourcesActionBuilder builder = new CategorySetAssetSourcesActionBuilder();
        builder.assetId = template.getAssetId();
        builder.assetKey = template.getAssetKey();
        builder.sources = template.getSources();
        return builder;
    }

}
