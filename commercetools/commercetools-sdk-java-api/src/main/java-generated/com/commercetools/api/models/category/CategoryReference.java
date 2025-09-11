
package com.commercetools.api.models.category;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a <a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Category</a>.</p>
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
@io.vrap.rmf.base.client.utils.json.SubType("category")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategoryReferenceImpl.class)
public interface CategoryReference extends Reference, com.commercetools.api.models.Identifiable<Category>,
        com.commercetools.api.models.IdentifiableObjHolder<Category> {

    /**
     * discriminator value for CategoryReference
     */
    String CATEGORY = "category";

    /**
     *  <p>Contains the representation of the expanded Category. Only present in responses to requests with <span>Reference Expansion</span> for Categories.</p>
     * @return obj
     */
    @Valid
    @JsonProperty("obj")
    public Category getObj();

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Category</a>.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Contains the representation of the expanded Category. Only present in responses to requests with <span>Reference Expansion</span> for Categories.</p>
     * @param obj value to be set
     */

    public void setObj(final Category obj);

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:Category" rel="nofollow">Category</a>.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * factory method
     * @return instance of CategoryReference
     */
    public static CategoryReference of() {
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

    public CategoryReference copyDeep();

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
