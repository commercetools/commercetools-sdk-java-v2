
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Used by the <span>Import API</span> to identify a ProductDiscount.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountKeyReference productDiscountKeyReference = ProductDiscountKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("product-discount")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductDiscountKeyReferenceImpl.class)
public interface ProductDiscountKeyReference extends KeyReference {

    /**
     * discriminator value for ProductDiscountKeyReference
     */
    String PRODUCT_DISCOUNT = "product-discount";

    /**
     *  <p>User-defined unique identifier of the referenced ProductDiscount.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>User-defined unique identifier of the referenced ProductDiscount.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of ProductDiscountKeyReference
     */
    public static ProductDiscountKeyReference of() {
        return new ProductDiscountKeyReferenceImpl();
    }

    /**
     * factory method to create a shallow copy ProductDiscountKeyReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductDiscountKeyReference of(final ProductDiscountKeyReference template) {
        ProductDiscountKeyReferenceImpl instance = new ProductDiscountKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public ProductDiscountKeyReference copyDeep();

    /**
     * factory method to create a deep copy of ProductDiscountKeyReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductDiscountKeyReference deepCopy(@Nullable final ProductDiscountKeyReference template) {
        if (template == null) {
            return null;
        }
        ProductDiscountKeyReferenceImpl instance = new ProductDiscountKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for ProductDiscountKeyReference
     * @return builder
     */
    public static ProductDiscountKeyReferenceBuilder builder() {
        return ProductDiscountKeyReferenceBuilder.of();
    }

    /**
     * create builder for ProductDiscountKeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDiscountKeyReferenceBuilder builder(final ProductDiscountKeyReference template) {
        return ProductDiscountKeyReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductDiscountKeyReference(Function<ProductDiscountKeyReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductDiscountKeyReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDiscountKeyReference>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDiscountKeyReference>";
            }
        };
    }
}
