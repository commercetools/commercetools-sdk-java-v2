
package com.commercetools.api.models.category;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CategoryRemoveAssetActionBuilder {

    @Nullable
    private String assetId;

    @Nullable
    private String assetKey;

    public CategoryRemoveAssetActionBuilder assetId(@Nullable final String assetId) {
        this.assetId = assetId;
        return this;
    }

    public CategoryRemoveAssetActionBuilder assetKey(@Nullable final String assetKey) {
        this.assetKey = assetKey;
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

    public CategoryRemoveAssetAction build() {
        return new CategoryRemoveAssetActionImpl(assetId, assetKey);
    }

    public static CategoryRemoveAssetActionBuilder of() {
        return new CategoryRemoveAssetActionBuilder();
    }

    public static CategoryRemoveAssetActionBuilder of(final CategoryRemoveAssetAction template) {
        CategoryRemoveAssetActionBuilder builder = new CategoryRemoveAssetActionBuilder();
        builder.assetId = template.getAssetId();
        builder.assetKey = template.getAssetKey();
        return builder;
    }

}
