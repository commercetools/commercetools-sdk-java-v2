package com.commercetools.api.models.category;

import com.commercetools.api.models.category.Category;
import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.common.ReferenceTypeId;
import com.commercetools.api.models.category.CategoryReferenceImpl;

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
 *  <p>Reference to a Category.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryReference categoryReference = CategoryReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = CategoryReferenceImpl.class)
public interface CategoryReference extends Reference, com.commercetools.api.models.Identifiable<Category> {

    /**
     * discriminator value for CategoryReference
     */
    String CATEGORY = "category";

    /**
     *  <p>Contains the representation of the expanded Category. Only present in responses to requests with Reference Expansion for Categories.</p>
     * @return obj
     */
    @Valid
    @JsonProperty("obj")
    public Category getObj();
    /**
     *  <p>Unique identifier of the referenced Category.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Contains the representation of the expanded Category. Only present in responses to requests with Reference Expansion for Categories.</p>
     * @param obj value to be set
     */
    
    public void setObj(final Category obj);
    
    
    /**
     *  <p>Unique identifier of the referenced Category.</p>
     * @param id value to be set
     */
    
    public void setId(final String id);
    

    /**
     * factory method
     * @return instance of CategoryReference
     */
    public static CategoryReference of(){
        return new CategoryReferenceImpl();
    }
    

    /**
     * factory method to create a shallow copy CategoryReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static CategoryReference of(final CategoryReference template) {
        CategoryReferenceImpl instance = new CategoryReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    /**
     * factory method to create a deep copy of CategoryReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CategoryReference deepCopy(@Nullable final CategoryReference template) {
        if (template == null) {
            return null;
        }
        CategoryReferenceImpl instance = new CategoryReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(com.commercetools.api.models.category.Category.deepCopy(template.getObj()));
        return instance;
    }

    /**
     * builder factory method for CategoryReference
     * @return builder
     */
    public static CategoryReferenceBuilder builder() {
        return CategoryReferenceBuilder.of();
    }
    
    /**
     * create builder for CategoryReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategoryReferenceBuilder builder(final CategoryReference template) {
        return CategoryReferenceBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCategoryReference(Function<CategoryReference, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CategoryReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategoryReference>() {
            @Override
            public String toString() {
                return "TypeReference<CategoryReference>";
            }
        };
    }
}
