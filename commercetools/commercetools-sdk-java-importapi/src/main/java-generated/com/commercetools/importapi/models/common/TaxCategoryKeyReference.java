
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
 *  <p>Used by the Import API to identify a TaxCategory.</p>
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
@io.vrap.rmf.base.client.utils.json.SubType("tax-category")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TaxCategoryKeyReferenceImpl.class)
public interface TaxCategoryKeyReference extends KeyReference {

    /**
     * discriminator value for TaxCategoryKeyReference
     */
    String TAX_CATEGORY = "tax-category";

    /**
     *  <p>User-defined unique identifier of the referenced TaxCategory.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>User-defined unique identifier of the referenced TaxCategory.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of TaxCategoryKeyReference
     */
    public static TaxCategoryKeyReference of() {
        return new TaxCategoryKeyReferenceImpl();
    }

    /**
     * factory method to create a shallow copy TaxCategoryKeyReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static TaxCategoryKeyReference of(final TaxCategoryKeyReference template) {
        TaxCategoryKeyReferenceImpl instance = new TaxCategoryKeyReferenceImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public TaxCategoryKeyReference copyDeep();

    /**
     * factory method to create a deep copy of TaxCategoryKeyReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TaxCategoryKeyReference deepCopy(@Nullable final TaxCategoryKeyReference template) {
        if (template == null) {
            return null;
        }
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
