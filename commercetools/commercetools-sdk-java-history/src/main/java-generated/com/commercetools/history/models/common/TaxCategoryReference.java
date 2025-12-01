
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxCategory" rel="nofollow">TaxCategory</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TaxCategoryReference taxCategoryReference = TaxCategoryReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("tax-category")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TaxCategoryReferenceImpl.class)
public interface TaxCategoryReference extends Reference {

    /**
     * discriminator value for TaxCategoryReference
     */
    String TAX_CATEGORY = "tax-category";

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxCategory" rel="nofollow">TaxCategory</a>.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:TaxCategory" rel="nofollow">TaxCategory</a>.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * factory method
     * @return instance of TaxCategoryReference
     */
    public static TaxCategoryReference of() {
        return new TaxCategoryReferenceImpl();
    }

    /**
     * factory method to create a shallow copy TaxCategoryReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static TaxCategoryReference of(final TaxCategoryReference template) {
        TaxCategoryReferenceImpl instance = new TaxCategoryReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    public TaxCategoryReference copyDeep();

    /**
     * factory method to create a deep copy of TaxCategoryReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TaxCategoryReference deepCopy(@Nullable final TaxCategoryReference template) {
        if (template == null) {
            return null;
        }
        TaxCategoryReferenceImpl instance = new TaxCategoryReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    /**
     * builder factory method for TaxCategoryReference
     * @return builder
     */
    public static TaxCategoryReferenceBuilder builder() {
        return TaxCategoryReferenceBuilder.of();
    }

    /**
     * create builder for TaxCategoryReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TaxCategoryReferenceBuilder builder(final TaxCategoryReference template) {
        return TaxCategoryReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTaxCategoryReference(Function<TaxCategoryReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TaxCategoryReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TaxCategoryReference>() {
            @Override
            public String toString() {
                return "TypeReference<TaxCategoryReference>";
            }
        };
    }
}
