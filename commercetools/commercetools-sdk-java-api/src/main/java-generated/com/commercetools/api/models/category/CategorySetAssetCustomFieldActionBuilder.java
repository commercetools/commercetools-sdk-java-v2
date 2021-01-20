
package com.commercetools.api.models.category;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.category.CategorySetAssetCustomFieldAction;
import com.commercetools.api.models.category.CategoryUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CategorySetAssetCustomFieldActionBuilder {

    @Nullable
    private String assetId;

    @Nullable
    private String assetKey;

    private String name;

    @Nullable
    private com.fasterxml.jackson.databind.JsonNode value;

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

    public CategorySetAssetCustomFieldActionBuilder value(
            @Nullable final com.fasterxml.jackson.databind.JsonNode value) {
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
    public com.fasterxml.jackson.databind.JsonNode getValue() {
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
