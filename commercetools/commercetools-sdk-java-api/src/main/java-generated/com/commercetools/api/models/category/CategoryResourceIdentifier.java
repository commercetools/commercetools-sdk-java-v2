package com.commercetools.api.models.category;

import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.common.ResourceIdentifier;
import com.commercetools.api.models.category.CategoryResourceIdentifierImpl;

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
 *  <p>ResourceIdentifier to a Category.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryResourceIdentifier categoryResourceIdentifier = CategoryResourceIdentifier.builder()
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = CategoryResourceIdentifierImpl.class)
public interface CategoryResourceIdentifier extends ResourceIdentifier, com.commercetools.api.models.Identifiable<Category> {

    /**
     * discriminator value for CategoryResourceIdentifier
     */
    String CATEGORY = "category";

    /**
     *  <p>Unique identifier of the referenced Category. Either <code>id</code> or <code>key</code> is required.</p>
     * @return id
     */
    
    @JsonProperty("id")
    public String getId();
    /**
     *  <p>User-defined unique identifier of the referenced Category. Either <code>id</code> or <code>key</code> is required.</p>
     * @return key
     */
    
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Unique identifier of the referenced Category. Either <code>id</code> or <code>key</code> is required.</p>
     * @param id value to be set
     */
    
    public void setId(final String id);
    
    
    /**
     *  <p>User-defined unique identifier of the referenced Category. Either <code>id</code> or <code>key</code> is required.</p>
     * @param key value to be set
     */
    
    public void setKey(final String key);
    

    /**
     * factory method
     * @return instance of CategoryResourceIdentifier
     */
    public static CategoryResourceIdentifier of(){
        return new CategoryResourceIdentifierImpl();
    }
    

    /**
     * factory method to create a shallow copy CategoryResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    public static CategoryResourceIdentifier of(final CategoryResourceIdentifier template) {
        CategoryResourceIdentifierImpl instance = new CategoryResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of CategoryResourceIdentifier
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CategoryResourceIdentifier deepCopy(@Nullable final CategoryResourceIdentifier template) {
        if (template == null) {
            return null;
        }
        CategoryResourceIdentifierImpl instance = new CategoryResourceIdentifierImpl();
        instance.setId(template.getId());
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for CategoryResourceIdentifier
     * @return builder
     */
    public static CategoryResourceIdentifierBuilder builder() {
        return CategoryResourceIdentifierBuilder.of();
    }
    
    /**
     * create builder for CategoryResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategoryResourceIdentifierBuilder builder(final CategoryResourceIdentifier template) {
        return CategoryResourceIdentifierBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCategoryResourceIdentifier(Function<CategoryResourceIdentifier, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CategoryResourceIdentifier> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategoryResourceIdentifier>() {
            @Override
            public String toString() {
                return "TypeReference<CategoryResourceIdentifier>";
            }
        };
    }
}
