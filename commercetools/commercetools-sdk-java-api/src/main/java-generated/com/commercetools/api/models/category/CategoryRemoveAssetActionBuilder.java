package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryUpdateAction;
import com.commercetools.api.models.category.CategoryRemoveAssetAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategoryRemoveAssetActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryRemoveAssetAction categoryRemoveAssetAction = CategoryRemoveAssetAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CategoryRemoveAssetActionBuilder implements Builder<CategoryRemoveAssetAction> {

    
    @Nullable
    private String assetId;
    
    
    @Nullable
    private String assetKey;

    
    /**
     *  <p>Value to remove. Either <code>assetId</code> or <code>assetKey</code> is required.</p>
     * @param assetId value to be set
     * @return Builder
     */
    
    public CategoryRemoveAssetActionBuilder assetId(@Nullable final String assetId) {
        this.assetId = assetId;
        return this;
    }
    
    
    
    
    /**
     *  <p>Value to remove. Either <code>assetId</code> or <code>assetKey</code> is required.</p>
     * @param assetKey value to be set
     * @return Builder
     */
    
    public CategoryRemoveAssetActionBuilder assetKey(@Nullable final String assetKey) {
        this.assetKey = assetKey;
        return this;
    }
    
    

    /**
     *  <p>Value to remove. Either <code>assetId</code> or <code>assetKey</code> is required.</p>
     * @return assetId
     */
    
    @Nullable
    public String getAssetId(){
        return this.assetId;
    }
    
    /**
     *  <p>Value to remove. Either <code>assetId</code> or <code>assetKey</code> is required.</p>
     * @return assetKey
     */
    
    @Nullable
    public String getAssetKey(){
        return this.assetKey;
    }

    /**
     * builds CategoryRemoveAssetAction with checking for non-null required values
     * @return CategoryRemoveAssetAction
     */
    public CategoryRemoveAssetAction build() {
        return new CategoryRemoveAssetActionImpl(assetId, assetKey);
    }
    
    /**
     * builds CategoryRemoveAssetAction without checking for non-null required values
     * @return CategoryRemoveAssetAction
     */
    public CategoryRemoveAssetAction buildUnchecked() {
        return new CategoryRemoveAssetActionImpl(assetId, assetKey);
    }

    /**
     * factory method for an instance of CategoryRemoveAssetActionBuilder
     * @return builder 
     */
    public static CategoryRemoveAssetActionBuilder of() {
        return new CategoryRemoveAssetActionBuilder();
    }

    /**
     * create builder for CategoryRemoveAssetAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategoryRemoveAssetActionBuilder of(final CategoryRemoveAssetAction template) {
        CategoryRemoveAssetActionBuilder builder = new CategoryRemoveAssetActionBuilder();
        builder.assetId = template.getAssetId();
        builder.assetKey = template.getAssetKey();
        return builder;
    }

}
