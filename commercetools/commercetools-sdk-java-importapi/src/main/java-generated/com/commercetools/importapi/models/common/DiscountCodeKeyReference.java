
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>References a discount code by key.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeKeyReference discountCodeKeyReference = DiscountCodeKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("discount-code")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountCodeKeyReferenceImpl.class)
public interface DiscountCodeKeyReference extends KeyReference {

    /**
     * discriminator value for DiscountCodeKeyReference
     */
    String DISCOUNT_CODE = "discount-code";

    /**
     * factory method
     * @return instance of DiscountCodeKeyReference
     */
    public static DiscountCodeKeyReference of() {
        return new DiscountCodeKeyReferenceImpl();
    }

    /**
     * factory method to create a shallow copy DiscountCodeKeyReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountCodeKeyReference of(final DiscountCodeKeyReference template) {
        DiscountCodeKeyReferenceImpl instance = new DiscountCodeKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public DiscountCodeKeyReference copyDeep();

    /**
     * factory method to create a deep copy of DiscountCodeKeyReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountCodeKeyReference deepCopy(@Nullable final DiscountCodeKeyReference template) {
        if (template == null) {
            return null;
        }
        DiscountCodeKeyReferenceImpl instance = new DiscountCodeKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for DiscountCodeKeyReference
     * @return builder
     */
    public static DiscountCodeKeyReferenceBuilder builder() {
        return DiscountCodeKeyReferenceBuilder.of();
    }

    /**
     * create builder for DiscountCodeKeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeKeyReferenceBuilder builder(final DiscountCodeKeyReference template) {
        return DiscountCodeKeyReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountCodeKeyReference(Function<DiscountCodeKeyReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodeKeyReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodeKeyReference>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodeKeyReference>";
            }
        };
    }
}
