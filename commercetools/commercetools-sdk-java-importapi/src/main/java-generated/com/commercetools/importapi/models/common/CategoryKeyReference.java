
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>References a category by key.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CategoryKeyReference categoryKeyReference = CategoryKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CategoryKeyReferenceImpl.class)
public interface CategoryKeyReference extends KeyReference {

    /**
     * discriminator value for CategoryKeyReference
     */
    String CATEGORY = "category";

    /**
     * factory method
     * @return instance of CategoryKeyReference
     */
    public static CategoryKeyReference of() {
        return new CategoryKeyReferenceImpl();
    }

    /**
     * factory method to create a shallow copy CategoryKeyReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static CategoryKeyReference of(final CategoryKeyReference template) {
        CategoryKeyReferenceImpl instance = new CategoryKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of CategoryKeyReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CategoryKeyReference deepCopy(@Nullable final CategoryKeyReference template) {
        if (template == null) {
            return null;
        }
        CategoryKeyReferenceImpl instance = new CategoryKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for CategoryKeyReference
     * @return builder
     */
    public static CategoryKeyReferenceBuilder builder() {
        return CategoryKeyReferenceBuilder.of();
    }

    /**
     * create builder for CategoryKeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CategoryKeyReferenceBuilder builder(final CategoryKeyReference template) {
        return CategoryKeyReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCategoryKeyReference(Function<CategoryKeyReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CategoryKeyReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CategoryKeyReference>() {
            @Override
            public String toString() {
                return "TypeReference<CategoryKeyReference>";
            }
        };
    }
}
