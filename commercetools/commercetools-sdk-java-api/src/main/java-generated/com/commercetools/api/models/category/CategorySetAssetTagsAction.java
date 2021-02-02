
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CategorySetAssetTagsActionImpl.class)
public interface CategorySetAssetTagsAction extends CategoryUpdateAction {

    String SET_ASSET_TAGS = "setAssetTags";

    @JsonProperty("assetId")
    public String getAssetId();

    @JsonProperty("assetKey")
    public String getAssetKey();

    @JsonProperty("tags")
    public List<String> getTags();

    public void setAssetId(final String assetId);

    public void setAssetKey(final String assetKey);

    @JsonIgnore
    public void setTags(final String... tags);

    public void setTags(final List<String> tags);

    public static CategorySetAssetTagsAction of() {
        return new CategorySetAssetTagsActionImpl();
    }

    public static CategorySetAssetTagsAction of(final CategorySetAssetTagsAction template) {
        CategorySetAssetTagsActionImpl instance = new CategorySetAssetTagsActionImpl();
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setTags(template.getTags());
        return instance;
    }

    public static CategorySetAssetTagsActionBuilder builder() {
        return CategorySetAssetTagsActionBuilder.of();
    }

    public static CategorySetAssetTagsActionBuilder builder(final CategorySetAssetTagsAction template) {
        return CategorySetAssetTagsActionBuilder.of(template);
    }

    default <T> T withCategorySetAssetTagsAction(Function<CategorySetAssetTagsAction, T> helper) {
        return helper.apply(this);
    }
}
