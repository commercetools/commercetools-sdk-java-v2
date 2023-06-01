package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryUpdateAction;
import java.lang.Object;
import com.commercetools.api.models.category.CategorySetAssetCustomFieldActionImpl;

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
 * CategorySetAssetCustomFieldAction
 *
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
@JsonDeserialize(as = CategorySetAssetCustomFieldActionImpl.class)
public interface CategorySetAssetCustomFieldAction extends CategoryUpdateAction {

    /**
     * discriminator value for CategorySetAssetCustomFieldAction
     */
    String SET_ASSET_CUSTOM_FIELD = "setAssetCustomField";

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
     *  <p>Name of the Custom Field.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();
    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @return value
     */
    
    @JsonProperty("value")
    public Object getValue();

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
     *  <p>Name of the Custom Field.</p>
     * @param name value to be set
     */
    
    public void setName(final String name);
    
    
    /**
     *  <p>If <code>value</code> is absent or <code>null</code>, this field will be removed if it exists. Removing a field that does not exist returns an InvalidOperation error. If <code>value</code> is provided, it is set for the field defined by <code>name</code>.</p>
     * @param value value to be set
     */
    
    public void setValue(final Object value);
    

    /**
     * factory method
     * @return instance of CategorySetAssetCustomFieldAction
     */
    public static CategorySetAssetCustomFieldAction of(){
        return new CategorySetAssetCustomFieldActionImpl();
    }
    

    /**
     * factory method to create a shallow copy CategorySetAssetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CategorySetAssetCustomFieldAction of(final CategorySetAssetCustomFieldAction template) {
        CategorySetAssetCustomFieldActionImpl instance = new CategorySetAssetCustomFieldActionImpl();
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * factory method to create a deep copy of CategorySetAssetCustomFieldAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CategorySetAssetCustomFieldAction deepCopy(@Nullable final CategorySetAssetCustomFieldAction template) {
        if (template == null) {
            return null;
        }
        CategorySetAssetCustomFieldActionImpl instance = new CategorySetAssetCustomFieldActionImpl();
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    /**
     * builder factory method for CategorySetAssetCustomFieldAction
     * @return builder
     */
    public static CategorySetAssetCustomFieldActionBuilder builder() {
        return CategorySetAssetCustomFieldActionBuilder.of();
    }
    
    /**
     * create builder for CategorySetAssetCustomFieldAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategorySetAssetCustomFieldActionBuilder builder(final CategorySetAssetCustomFieldAction template) {
        return CategorySetAssetCustomFieldActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCategorySetAssetCustomFieldAction(Function<CategorySetAssetCustomFieldAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CategorySetAssetCustomFieldAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategorySetAssetCustomFieldAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategorySetAssetCustomFieldAction>";
            }
        };
    }
}
