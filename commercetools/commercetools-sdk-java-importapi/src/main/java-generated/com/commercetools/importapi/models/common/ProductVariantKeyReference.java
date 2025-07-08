
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
 *  <p>Used by the Import API to identify a ProductVariant.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantKeyReference productVariantKeyReference = ProductVariantKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("product-variant")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductVariantKeyReferenceImpl.class)
public interface ProductVariantKeyReference extends KeyReference {

    /**
     * discriminator value for ProductVariantKeyReference
     */
    String PRODUCT_VARIANT = "product-variant";

    /**
     *  <p>User-defined unique identifier of the referenced ProductVariant.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>User-defined unique identifier of the referenced ProductVariant.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of ProductVariantKeyReference
     */
    public static ProductVariantKeyReference of() {
        return new ProductVariantKeyReferenceImpl();
    }

    /**
     * factory method to create a shallow copy ProductVariantKeyReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductVariantKeyReference of(final ProductVariantKeyReference template) {
        ProductVariantKeyReferenceImpl instance = new ProductVariantKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public ProductVariantKeyReference copyDeep();

    /**
     * factory method to create a deep copy of ProductVariantKeyReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductVariantKeyReference deepCopy(@Nullable final ProductVariantKeyReference template) {
        if (template == null) {
            return null;
        }
        ProductVariantKeyReferenceImpl instance = new ProductVariantKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for ProductVariantKeyReference
     * @return builder
     */
    public static ProductVariantKeyReferenceBuilder builder() {
        return ProductVariantKeyReferenceBuilder.of();
    }

    /**
     * create builder for ProductVariantKeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantKeyReferenceBuilder builder(final ProductVariantKeyReference template) {
        return ProductVariantKeyReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductVariantKeyReference(Function<ProductVariantKeyReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantKeyReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantKeyReference>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantKeyReference>";
            }
        };
    }
}
