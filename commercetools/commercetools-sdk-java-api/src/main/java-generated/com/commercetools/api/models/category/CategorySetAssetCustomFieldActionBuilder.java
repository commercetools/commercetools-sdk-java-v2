package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryUpdateAction;
import java.lang.Object;
import com.commercetools.api.models.category.CategorySetAssetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CategorySetAssetCustomFieldActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategorySetAssetCustomFieldAction categorySetAssetCustomFieldAction = CategorySetAssetCustomFieldAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class CategorySetAssetCustomFieldActionBuilder implements Builder<CategorySetAssetCustomFieldAction> {

    
    @Nullable
    private String assetId;
    
    
    @Nullable
    private String assetKey;
    
    
    
    private String name;
    
    
    @Nullable
    private java.lang.Object value;

    
    /**
     *  <p>New value to set. Either <code>assetId</code> or <code>assetKey</code> is required.</p>
     * @param assetId value to be set
     * @return Builder
     */
    
    public CategorySetAssetCustomFieldActionBuilder assetId(@Nullable final String assetId) {
        this.assetId = assetId;
        return this;
    }
    
    
    
    
    /**
     *  <p>New value to set. Either <code>assetId</code> or <code>assetKey</code> is required.</p>
     * @param assetKey value to be set
     * @return Builder
     */
    
    public CategorySetAssetCustomFieldActionBuilder assetKey(@Nullable final String assetKey) {
        this.assetKey = assetKey;
        return this;
    }
    
    
    
    
    /**
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     * @return Builder
     */
    
    public CategorySetAssetCustomFieldActionBuilder name( final String name) {
        this.name = name;
        return this;
    }
    
    
    
    
    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     * @return Builder
     */
    
    public CategorySetAssetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
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
     *  <p>Name of the Custom Field.</p>
     * @return name
     */
    
    
    public String getName(){
        return this.name;
    }
    
    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */
    
    @Nullable
    public java.lang.Object getValue(){
        return this.value;
    }

    /**
     * builds CategorySetAssetCustomFieldAction with checking for non-null required values
     * @return CategorySetAssetCustomFieldAction
     */
    public CategorySetAssetCustomFieldAction build() {
        Objects.requireNonNull(name, CategorySetAssetCustomFieldAction.class + ": name is missing");
        return new CategorySetAssetCustomFieldActionImpl(assetId, assetKey, name, value);
    }
    
    /**
     * builds CategorySetAssetCustomFieldAction without checking for non-null required values
     * @return CategorySetAssetCustomFieldAction
     */
    public CategorySetAssetCustomFieldAction buildUnchecked() {
        return new CategorySetAssetCustomFieldActionImpl(assetId, assetKey, name, value);
    }

    /**
     * factory method for an instance of CategorySetAssetCustomFieldActionBuilder
     * @return builder 
     */
    public static CategorySetAssetCustomFieldActionBuilder of() {
        return new CategorySetAssetCustomFieldActionBuilder();
    }

    /**
     * create builder for CategorySetAssetCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategorySetAssetCustomFieldActionBuilder of(final CategorySetAssetCustomFieldAction template) {
        CategorySetAssetCustomFieldActionBuilder builder = new CategorySetAssetCustomFieldActionBuilder();
        builder.assetId = template.getAssetId();
        builder.assetKey = template.getAssetKey();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
