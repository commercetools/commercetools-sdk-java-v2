
package com.commercetools.ml.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProductReference
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductReference productReference = ProductReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductReferenceImpl.class)
public interface ProductReference extends Reference {

    /**
     * discriminator value for ProductReference
     */
    String PRODUCT = "product";

    /**
     * factory method
     * @return instance of ProductReference
     */
    public static ProductReference of() {
        return new ProductReferenceImpl();
    }

    /**
     * factory method to create a shallow copy ProductReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductReference of(final ProductReference template) {
        ProductReferenceImpl instance = new ProductReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductReference deepCopy(@Nullable final ProductReference template) {
        if (template == null) {
            return null;
        }
        ProductReferenceImpl instance = new ProductReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    /**
     * builder factory method for ProductReference
     * @return builder
     */
    public static ProductReferenceBuilder builder() {
        return ProductReferenceBuilder.of();
    }

    /**
     * create builder for ProductReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductReferenceBuilder builder(final ProductReference template) {
        return ProductReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductReference(Function<ProductReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductReference>() {
            @Override
            public String toString() {
                return "TypeReference<ProductReference>";
            }
        };
    }
}
