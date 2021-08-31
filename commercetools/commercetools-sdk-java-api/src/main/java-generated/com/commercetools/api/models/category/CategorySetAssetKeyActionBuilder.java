
package com.commercetools.api.models.category;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CategorySetAssetKeyActionBuilder implements Builder<CategorySetAssetKeyAction> {

    private String assetId;

    @Nullable
    private String assetKey;

    public CategorySetAssetKeyActionBuilder assetId(final String assetId) {
        this.assetId = assetId;
        return this;
    }

    public CategorySetAssetKeyActionBuilder assetKey(@Nullable final String assetKey) {
        this.assetKey = assetKey;
        return this;
    }

    public String getAssetId() {
        return this.assetId;
    }

    @Nullable
    public String getAssetKey() {
        return this.assetKey;
    }

    public CategorySetAssetKeyAction build() {
        Objects.requireNonNull(assetId, CategorySetAssetKeyAction.class + ": assetId is missing");
        return new CategorySetAssetKeyActionImpl(assetId, assetKey);
    }

    /**
     * builds CategorySetAssetKeyAction without checking for non null required values
     */
    public CategorySetAssetKeyAction buildUnchecked() {
        return new CategorySetAssetKeyActionImpl(assetId, assetKey);
    }

    public static CategorySetAssetKeyActionBuilder of() {
        return new CategorySetAssetKeyActionBuilder();
    }

    public static CategorySetAssetKeyActionBuilder of(final CategorySetAssetKeyAction template) {
        CategorySetAssetKeyActionBuilder builder = new CategorySetAssetKeyActionBuilder();
        builder.assetId = template.getAssetId();
        builder.assetKey = template.getAssetKey();
        return builder;
    }

}
