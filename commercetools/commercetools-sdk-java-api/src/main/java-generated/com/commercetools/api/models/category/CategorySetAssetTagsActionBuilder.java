package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryUpdateAction;
import com.commercetools.api.models.category.CategorySetAssetTagsAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategorySetAssetTagsActionBuilder
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
public class CategorySetAssetTagsActionBuilder implements Builder<CategorySetAssetTagsAction> {

    
    @Nullable
    private String assetId;
    
    
    @Nullable
    private String assetKey;
    
    
    @Nullable
    private java.util.List<String> tags;

    
    /**
     *  <p>New value to set. Either <code>assetId</code> or <code>assetKey</code> is required.</p>
     * @param assetId value to be set
     * @return Builder
     */
    
    public CategorySetAssetTagsActionBuilder assetId(@Nullable final String assetId) {
        this.assetId = assetId;
        return this;
    }
    
    
    
    
    /**
     *  <p>New value to set. Either <code>assetId</code> or <code>assetKey</code> is required.</p>
     * @param assetKey value to be set
     * @return Builder
     */
    
    public CategorySetAssetTagsActionBuilder assetKey(@Nullable final String assetKey) {
        this.assetKey = assetKey;
        return this;
    }
    
    
    
    /**
     *  <p>Keywords for categorizing and organizing Assets.</p>
     * @param tags value to be set
     * @return Builder
     */
    
    public CategorySetAssetTagsActionBuilder tags(@Nullable final String ...tags) {
        this.tags = new ArrayList<>(Arrays.asList(tags));
        return this;
    }
    
    /**
     *  <p>Keywords for categorizing and organizing Assets.</p>
     * @param tags value to be set
     * @return Builder
     */
    
    public CategorySetAssetTagsActionBuilder tags(@Nullable final java.util.List<String> tags) {
        this.tags = tags;
        return this;
    }
    
    /**
     *  <p>Keywords for categorizing and organizing Assets.</p>
     * @param tags value to be set
     * @return Builder
     */
    
    public CategorySetAssetTagsActionBuilder plusTags(@Nullable final String ...tags) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.addAll(Arrays.asList(tags));
        return this;
    }
    
    
    

    /**
     *  <p>New value to set. Either <code>assetId</code> or <code>assetKey</code> is required.</p>
     * @return assetId
     */
    
    @Nullable
    public String getAssetId(){
        return this.assetId;
    }
    
    /**
     *  <p>New value to set. Either <code>assetId</code> or <code>assetKey</code> is required.</p>
     * @return assetKey
     */
    
    @Nullable
    public String getAssetKey(){
        return this.assetKey;
    }
    
    /**
     *  <p>Keywords for categorizing and organizing Assets.</p>
     * @return tags
     */
    
    @Nullable
    public java.util.List<String> getTags(){
        return this.tags;
    }

    /**
     * builds CategorySetAssetTagsAction with checking for non-null required values
     * @return CategorySetAssetTagsAction
     */
    public CategorySetAssetTagsAction build() {
        return new CategorySetAssetTagsActionImpl(assetId, assetKey, tags);
    }
    
    /**
     * builds CategorySetAssetTagsAction without checking for non-null required values
     * @return CategorySetAssetTagsAction
     */
    public CategorySetAssetTagsAction buildUnchecked() {
        return new CategorySetAssetTagsActionImpl(assetId, assetKey, tags);
    }

    /**
     * factory method for an instance of CategorySetAssetTagsActionBuilder
     * @return builder 
     */
    public static CategorySetAssetTagsActionBuilder of() {
        return new CategorySetAssetTagsActionBuilder();
    }

    /**
     * create builder for CategorySetAssetTagsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategorySetAssetTagsActionBuilder of(final CategorySetAssetTagsAction template) {
        CategorySetAssetTagsActionBuilder builder = new CategorySetAssetTagsActionBuilder();
        builder.assetId = template.getAssetId();
        builder.assetKey = template.getAssetKey();
        builder.tags = template.getTags();
        return builder;
    }

}
