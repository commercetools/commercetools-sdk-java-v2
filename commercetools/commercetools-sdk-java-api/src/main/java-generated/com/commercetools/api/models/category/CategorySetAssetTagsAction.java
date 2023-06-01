package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryUpdateAction;
import com.commercetools.api.models.category.CategorySetAssetTagsActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

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
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = CategorySetAssetTagsActionImpl.class)
public interface CategorySetAssetTagsAction extends CategoryUpdateAction {

    /**
     * discriminator value for CategorySetAssetTagsAction
     */
    String SET_ASSET_TAGS = "setAssetTags";

    /**
     *  <p>New value to set. Either <code>assetId</code> or <code>assetKey</code> is required.</p>
     * @return assetId
     */
    
    @JsonProperty("assetId")
    public String getAssetId();
    /**
     *  <p>New value to set. Either <code>assetId</code> or <code>assetKey</code> is required.</p>
     * @return assetKey
     */
    
    @JsonProperty("assetKey")
    public String getAssetKey();
    /**
     *  <p>Keywords for categorizing and organizing Assets.</p>
     * @return tags
     */
    
    @JsonProperty("tags")
    public List<String> getTags();

    /**
     *  <p>New value to set. Either <code>assetId</code> or <code>assetKey</code> is required.</p>
     * @param assetId value to be set
     */
    
    public void setAssetId(final String assetId);
    
    
    /**
     *  <p>New value to set. Either <code>assetId</code> or <code>assetKey</code> is required.</p>
     * @param assetKey value to be set
     */
    
    public void setAssetKey(final String assetKey);
    
    
    /**
     *  <p>Keywords for categorizing and organizing Assets.</p>
     * @param tags values to be set
     */
    
    @JsonIgnore
    public void setTags(final String ...tags);
    /**
     *  <p>Keywords for categorizing and organizing Assets.</p>
     * @param tags values to be set
     */
    
    public void setTags(final List<String> tags);

    /**
     * factory method
     * @return instance of CategorySetAssetTagsAction
     */
    public static CategorySetAssetTagsAction of(){
        return new CategorySetAssetTagsActionImpl();
    }
    

    /**
     * factory method to create a shallow copy CategorySetAssetTagsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CategorySetAssetTagsAction of(final CategorySetAssetTagsAction template) {
        CategorySetAssetTagsActionImpl instance = new CategorySetAssetTagsActionImpl();
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setTags(template.getTags());
        return instance;
    }

    /**
     * factory method to create a deep copy of CategorySetAssetTagsAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CategorySetAssetTagsAction deepCopy(@Nullable final CategorySetAssetTagsAction template) {
        if (template == null) {
            return null;
        }
        CategorySetAssetTagsActionImpl instance = new CategorySetAssetTagsActionImpl();
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setTags(Optional.ofNullable(template.getTags())
                .map(ArrayList::new)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for CategorySetAssetTagsAction
     * @return builder
     */
    public static CategorySetAssetTagsActionBuilder builder() {
        return CategorySetAssetTagsActionBuilder.of();
    }
    
    /**
     * create builder for CategorySetAssetTagsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategorySetAssetTagsActionBuilder builder(final CategorySetAssetTagsAction template) {
        return CategorySetAssetTagsActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCategorySetAssetTagsAction(Function<CategorySetAssetTagsAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CategorySetAssetTagsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategorySetAssetTagsAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategorySetAssetTagsAction>";
            }
        };
    }
}
