package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryUpdateAction;
import com.commercetools.api.models.category.CategorySetAssetKeyActionImpl;

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
 *  <p>Set or remove the <code>key</code> of an Asset.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategorySetAssetKeyAction categorySetAssetKeyAction = CategorySetAssetKeyAction.builder()
 *             .assetId("{assetId}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = CategorySetAssetKeyActionImpl.class)
public interface CategorySetAssetKeyAction extends CategoryUpdateAction {

    /**
     * discriminator value for CategorySetAssetKeyAction
     */
    String SET_ASSET_KEY = "setAssetKey";

    /**
     *  <p>Value to set.</p>
     * @return assetId
     */
    @NotNull
    @JsonProperty("assetId")
    public String getAssetId();
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return assetKey
     */
    
    @JsonProperty("assetKey")
    public String getAssetKey();

    /**
     *  <p>Value to set.</p>
     * @param assetId value to be set
     */
    
    public void setAssetId(final String assetId);
    
    
    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param assetKey value to be set
     */
    
    public void setAssetKey(final String assetKey);
    

    /**
     * factory method
     * @return instance of CategorySetAssetKeyAction
     */
    public static CategorySetAssetKeyAction of(){
        return new CategorySetAssetKeyActionImpl();
    }
    

    /**
     * factory method to create a shallow copy CategorySetAssetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CategorySetAssetKeyAction of(final CategorySetAssetKeyAction template) {
        CategorySetAssetKeyActionImpl instance = new CategorySetAssetKeyActionImpl();
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of CategorySetAssetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CategorySetAssetKeyAction deepCopy(@Nullable final CategorySetAssetKeyAction template) {
        if (template == null) {
            return null;
        }
        CategorySetAssetKeyActionImpl instance = new CategorySetAssetKeyActionImpl();
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        return instance;
    }

    /**
     * builder factory method for CategorySetAssetKeyAction
     * @return builder
     */
    public static CategorySetAssetKeyActionBuilder builder() {
        return CategorySetAssetKeyActionBuilder.of();
    }
    
    /**
     * create builder for CategorySetAssetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategorySetAssetKeyActionBuilder builder(final CategorySetAssetKeyAction template) {
        return CategorySetAssetKeyActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCategorySetAssetKeyAction(Function<CategorySetAssetKeyAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CategorySetAssetKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategorySetAssetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategorySetAssetKeyAction>";
            }
        };
    }
}
