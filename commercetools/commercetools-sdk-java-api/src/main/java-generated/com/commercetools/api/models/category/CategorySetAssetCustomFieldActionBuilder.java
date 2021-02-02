
package com.commercetools.api.models.category;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CategorySetAssetCustomFieldActionBuilder {

    @Nullable
    private String assetId;

    @Nullable
    private String assetKey;

    private String name;

    @Nullable
    private java.lang.Object value;

    public CategorySetAssetCustomFieldActionBuilder assetId(@Nullable final String assetId) {
        this.assetId = assetId;
        return this;
    }

    public CategorySetAssetCustomFieldActionBuilder assetKey(@Nullable final String assetKey) {
        this.assetKey = assetKey;
        return this;
    }

    public CategorySetAssetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public CategorySetAssetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
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

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public CategorySetAssetCustomFieldAction build() {
        return new CategorySetAssetCustomFieldActionImpl(assetId, assetKey, name, value);
    }

    public static CategorySetAssetCustomFieldActionBuilder of() {
        return new CategorySetAssetCustomFieldActionBuilder();
    }

    public static CategorySetAssetCustomFieldActionBuilder of(final CategorySetAssetCustomFieldAction template) {
        CategorySetAssetCustomFieldActionBuilder builder = new CategorySetAssetCustomFieldActionBuilder();
        builder.assetId = template.getAssetId();
        builder.assetKey = template.getAssetKey();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
