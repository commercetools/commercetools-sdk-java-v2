
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategorySetAssetTagsAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategorySetAssetTagsAction categorySetAssetTagsAction = CategorySetAssetTagsAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategorySetAssetTagsActionImpl.class)
public interface CategorySetAssetTagsAction extends CategoryUpdateAction {

    String SET_ASSET_TAGS = "setAssetTags";

    /**
     *  <p>New value to set. Either <code>assetId</code> or <code>assetKey</code> is required.</p>
     */

    @JsonProperty("assetId")
    public String getAssetId();

    /**
     *  <p>New value to set. Either <code>assetId</code> or <code>assetKey</code> is required.</p>
     */

    @JsonProperty("assetKey")
    public String getAssetKey();

    /**
     *  <p>Keywords for categorizing and organizing Assets.</p>
     */

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

    public static com.fasterxml.jackson.core.type.TypeReference<CategorySetAssetTagsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategorySetAssetTagsAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategorySetAssetTagsAction>";
            }
        };
    }
}
