
package com.commercetools.importapi.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>References a tax category by key.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxCategoryKeyReference taxCategoryKeyReference = TaxCategoryKeyReference.builder()
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TaxCategoryKeyReferenceImpl.class)
public interface TaxCategoryKeyReference extends KeyReference {

    /**
     * discriminator value for TaxCategoryKeyReference
     */
    String TAX_CATEGORY = "tax-category";

    /**
     * factory method
     * @return instance of TaxCategoryKeyReference
     */
    public static TaxCategoryKeyReference of() {
        return new TaxCategoryKeyReferenceImpl();
    }

    /**
     * factory method to copy an instance of TaxCategoryKeyReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static TaxCategoryKeyReference of(final TaxCategoryKeyReference template) {
        TaxCategoryKeyReferenceImpl instance = new TaxCategoryKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for TaxCategoryKeyReference
     * @return builder
     */
    public static TaxCategoryKeyReferenceBuilder builder() {
        return TaxCategoryKeyReferenceBuilder.of();
    }

    /**
     * create builder for TaxCategoryKeyReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TaxCategoryKeyReferenceBuilder builder(final TaxCategoryKeyReference template) {
        return TaxCategoryKeyReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTaxCategoryKeyReference(Function<TaxCategoryKeyReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TaxCategoryKeyReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TaxCategoryKeyReference>() {
            @Override
            public String toString() {
                return "TypeReference<TaxCategoryKeyReference>";
            }
        };
    }
}
