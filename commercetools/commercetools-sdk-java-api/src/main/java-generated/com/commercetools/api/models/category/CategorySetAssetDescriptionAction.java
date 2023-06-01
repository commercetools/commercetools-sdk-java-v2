package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryUpdateAction;
import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.category.CategorySetAssetDescriptionActionImpl;

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
 * CategorySetAssetDescriptionAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategorySetAssetDescriptionAction categorySetAssetDescriptionAction = CategorySetAssetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = CategorySetAssetDescriptionActionImpl.class)
public interface CategorySetAssetDescriptionAction extends CategoryUpdateAction {

    /**
     * discriminator value for CategorySetAssetDescriptionAction
     */
    String SET_ASSET_DESCRIPTION = "setAssetDescription";

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
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

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
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param description value to be set
     */
    
    public void setDescription(final LocalizedString description);
    

    /**
     * factory method
     * @return instance of CategorySetAssetDescriptionAction
     */
    public static CategorySetAssetDescriptionAction of(){
        return new CategorySetAssetDescriptionActionImpl();
    }
    

    /**
     * factory method to create a shallow copy CategorySetAssetDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CategorySetAssetDescriptionAction of(final CategorySetAssetDescriptionAction template) {
        CategorySetAssetDescriptionActionImpl instance = new CategorySetAssetDescriptionActionImpl();
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setDescription(template.getDescription());
        return instance;
    }

    /**
     * factory method to create a deep copy of CategorySetAssetDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CategorySetAssetDescriptionAction deepCopy(@Nullable final CategorySetAssetDescriptionAction template) {
        if (template == null) {
            return null;
        }
        CategorySetAssetDescriptionActionImpl instance = new CategorySetAssetDescriptionActionImpl();
        instance.setAssetId(template.getAssetId());
        instance.setAssetKey(template.getAssetKey());
        instance.setDescription(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getDescription()));
        return instance;
    }

    /**
     * builder factory method for CategorySetAssetDescriptionAction
     * @return builder
     */
    public static CategorySetAssetDescriptionActionBuilder builder() {
        return CategorySetAssetDescriptionActionBuilder.of();
    }
    
    /**
     * create builder for CategorySetAssetDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategorySetAssetDescriptionActionBuilder builder(final CategorySetAssetDescriptionAction template) {
        return CategorySetAssetDescriptionActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCategorySetAssetDescriptionAction(Function<CategorySetAssetDescriptionAction, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CategorySetAssetDescriptionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategorySetAssetDescriptionAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategorySetAssetDescriptionAction>";
            }
        };
    }
}
