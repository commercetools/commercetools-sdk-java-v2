
package com.commercetools.api.models.category;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CategorySetAssetSourcesActionBuilder {

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
