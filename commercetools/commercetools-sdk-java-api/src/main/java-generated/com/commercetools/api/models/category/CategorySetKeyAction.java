package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryUpdateAction;
import com.commercetools.api.models.category.CategorySetKeyActionImpl;

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
 * CategorySetKeyAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategorySetKeyAction categorySetKeyAction = CategorySetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = CategorySetKeyActionImpl.class)
public interface CategorySetKeyAction extends CategoryUpdateAction {

    /**
     * discriminator value for CategorySetKeyAction
     */
    String SET_KEY = "setKey";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return key
     */
    
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param key value to be set
     */
    
    public void setKey(final String key);
    

    /**
     * factory method
     * @return instance of CategorySetKeyAction
     */
    public static CategorySetKeyAction of(){
        return new CategorySetKeyActionImpl();
    }
    

    /**
     * factory method to create a shallow copy CategorySetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CategorySetKeyAction of(final CategorySetKeyAction template) {
        CategorySetKeyActionImpl instance = new CategorySetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of CategorySetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CategorySetKeyAction deepCopy(@Nullable final CategorySetKeyAction template) {
        if (template == null) {
            return null;
        }
        CategorySetKeyActionImpl instance = new CategorySetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for CategorySetKeyAction
     * @return builder
     */
    public static CategorySetKeyActionBuilder builder() {
        return CategorySetKeyActionBuilder.of();
    }
    
    /**
     * create builder for CategorySetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategorySetKeyActionBuilder builder(final CategorySetKeyAction template) {
        return CategorySetKeyActionBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCategorySetKeyAction(Function<CategorySetKeyAction, T> helper) {
        return helper.apply(this);
    }
    public static CategorySetKeyAction ofUnset() {
        return CategorySetKeyAction.of();
    }
    
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CategorySetKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategorySetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<CategorySetKeyAction>";
            }
        };
    }
}
