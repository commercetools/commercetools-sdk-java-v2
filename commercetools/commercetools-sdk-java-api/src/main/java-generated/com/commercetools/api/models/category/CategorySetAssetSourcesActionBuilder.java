
package com.commercetools.api.models.category;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CategorySetAssetSourcesActionBuilder implements Builder<CategorySetAssetSourcesAction> {

    @Nullable
    private String assetId;

    @Nullable
    private String assetKey;

    private java.util.List<com.commercetools.api.models.common.AssetSource> sources;

    public CategorySetAssetSourcesActionBuilder assetId(@Nullable final String assetId) {
        this.assetId = assetId;
        return this;
    }

    public CategorySetAssetSourcesActionBuilder assetKey(@Nullable final String assetKey) {
        this.assetKey = assetKey;
        return this;
    }

    public CategorySetAssetSourcesActionBuilder sources(
            final com.commercetools.api.models.common.AssetSource... sources) {
        this.sources = new ArrayList<>(Arrays.asList(sources));
        return this;
    }

    public CategorySetAssetSourcesActionBuilder sources(
            final java.util.List<com.commercetools.api.models.common.AssetSource> sources) {
        this.sources = sources;
        return this;
    }

    public CategorySetAssetSourcesActionBuilder plusSources(
            final com.commercetools.api.models.common.AssetSource... sources) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        this.sources.addAll(Arrays.asList(sources));
        return this;
    }

    public CategorySetAssetSourcesActionBuilder plusSources(
            Function<com.commercetools.api.models.common.AssetSourceBuilder, com.commercetools.api.models.common.AssetSourceBuilder> builder) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        this.sources.add(builder.apply(com.commercetools.api.models.common.AssetSourceBuilder.of()).build());
        return this;
    }

    public CategorySetAssetSourcesActionBuilder withSources(
            Function<com.commercetools.api.models.common.AssetSourceBuilder, com.commercetools.api.models.common.AssetSourceBuilder> builder) {
        this.sources = new ArrayList<>();
        this.sources.add(builder.apply(com.commercetools.api.models.common.AssetSourceBuilder.of()).build());
        return this;
    }

    @Nullable
    public String getAssetId() {
        return this.assetId;
    }

    @Nullable
    public String getAssetKey() {
        return this.assetKey;
    }

    public java.util.List<com.commercetools.api.models.common.AssetSource> getSources() {
        return this.sources;
    }

    public CategorySetAssetSourcesAction build() {
        Objects.requireNonNull(sources, CategorySetAssetSourcesAction.class + ": sources is missing");
        return new CategorySetAssetSourcesActionImpl(assetId, assetKey, sources);
    }

    /**
     * builds CategorySetAssetSourcesAction without checking for non null required values
     */
    public CategorySetAssetSourcesAction buildUnchecked() {
        return new CategorySetAssetSourcesActionImpl(assetId, assetKey, sources);
    }

    public static CategorySetAssetSourcesActionBuilder of() {
        return new CategorySetAssetSourcesActionBuilder();
    }

    public static CategorySetAssetSourcesActionBuilder of(final CategorySetAssetSourcesAction template) {
        CategorySetAssetSourcesActionBuilder builder = new CategorySetAssetSourcesActionBuilder();
        builder.assetId = template.getAssetId();
        builder.assetKey = template.getAssetKey();
        builder.sources = template.getSources();
        return builder;
    }

}
