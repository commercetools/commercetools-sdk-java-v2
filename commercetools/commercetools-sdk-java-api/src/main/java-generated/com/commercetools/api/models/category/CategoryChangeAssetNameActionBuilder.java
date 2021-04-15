
package com.commercetools.api.models.category;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CategoryChangeAssetNameActionBuilder {

    @Nullable
    private String assetId;

    @Nullable
    private String assetKey;

    private com.commercetools.api.models.common.LocalizedString name;

    public CategoryChangeAssetNameActionBuilder assetId(@Nullable final String assetId) {
        this.assetId = assetId;
        return this;
    }

    public CategoryChangeAssetNameActionBuilder assetKey(@Nullable final String assetKey) {
        this.assetKey = assetKey;
        return this;
    }

    public CategoryChangeAssetNameActionBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
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

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public CategoryChangeAssetNameAction build() {
        return new CategoryChangeAssetNameActionImpl(assetId, assetKey, name);
    }

    public static CategoryChangeAssetNameActionBuilder of() {
        return new CategoryChangeAssetNameActionBuilder();
    }

    public static CategoryChangeAssetNameActionBuilder of(final CategoryChangeAssetNameAction template) {
        CategoryChangeAssetNameActionBuilder builder = new CategoryChangeAssetNameActionBuilder();
        builder.assetId = template.getAssetId();
        builder.assetKey = template.getAssetKey();
        builder.name = template.getName();
        return builder;
    }

}
