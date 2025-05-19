
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>References a product type by key.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeKeyReference productTypeKeyReference = ProductTypeKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("product-type")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTypeKeyReferenceImpl.class)
public interface ProductTypeKeyReference extends KeyReference {

    /**
     * discriminator value for ProductTypeKeyReference
     */
    String PRODUCT_TYPE = "product-type";

    /**
     * factory method
     * @return instance of ProductTypeKeyReference
     */
    public static ProductTypeKeyReference of() {
        return new ProductTypeKeyReferenceImpl();
    }

    /**
     * factory method to create a shallow copy ProductTypeKeyReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTypeKeyReference of(final ProductTypeKeyReference template) {
        ProductTypeKeyReferenceImpl instance = new ProductTypeKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public ProductTypeKeyReference copyDeep();

    /**
     * factory method to create a deep copy of ProductTypeKeyReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTypeKeyReference deepCopy(@Nullable final ProductTypeKeyReference template) {
        if (template == null) {
            return null;
        }
        ProductTypeKeyReferenceImpl instance = new ProductTypeKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for ProductTypeKeyReference
     * @return builder
     */
    public static ProductTypeKeyReferenceBuilder builder() {
        return ProductTypeKeyReferenceBuilder.of();
    }

    /**
     * create builder for ProductTypeKeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeKeyReferenceBuilder builder(final ProductTypeKeyReference template) {
        return ProductTypeKeyReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTypeKeyReference(Function<ProductTypeKeyReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeKeyReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeKeyReference>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeKeyReference>";
            }
        };
    }
}
