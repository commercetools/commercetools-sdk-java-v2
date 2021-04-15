
package com.commercetools.api.models.category;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CategoryAddAssetActionBuilder {

    private com.commercetools.api.models.common.AssetDraft asset;

    @Nullable
    private Integer position;

    public CategoryAddAssetActionBuilder asset(final com.commercetools.api.models.common.AssetDraft asset) {
        this.asset = asset;
        return this;
    }

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
