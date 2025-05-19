
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>References a price by key.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PriceKeyReference priceKeyReference = PriceKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("price")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = PriceKeyReferenceImpl.class)
public interface PriceKeyReference extends KeyReference {

    /**
     * discriminator value for PriceKeyReference
     */
    String PRICE = "price";

    /**
     * factory method
     * @return instance of PriceKeyReference
     */
    public static PriceKeyReference of() {
        return new PriceKeyReferenceImpl();
    }

    /**
     * factory method to create a shallow copy PriceKeyReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static PriceKeyReference of(final PriceKeyReference template) {
        PriceKeyReferenceImpl instance = new PriceKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public PriceKeyReference copyDeep();

    /**
     * factory method to create a deep copy of PriceKeyReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static PriceKeyReference deepCopy(@Nullable final PriceKeyReference template) {
        if (template == null) {
            return null;
        }
        PriceKeyReferenceImpl instance = new PriceKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for PriceKeyReference
     * @return builder
     */
    public static PriceKeyReferenceBuilder builder() {
        return PriceKeyReferenceBuilder.of();
    }

    /**
     * create builder for PriceKeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PriceKeyReferenceBuilder builder(final PriceKeyReference template) {
        return PriceKeyReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withPriceKeyReference(Function<PriceKeyReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<PriceKeyReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<PriceKeyReference>() {
            @Override
            public String toString() {
                return "TypeReference<PriceKeyReference>";
            }
        };
    }
}
