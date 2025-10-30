
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
 *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelection" rel="nofollow">ProductSelection</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionReference productSelectionReference = ProductSelectionReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("product-selection")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionReferenceImpl.class)
public interface ProductSelectionReference extends Reference {

    /**
     * discriminator value for ProductSelectionReference
     */
    String PRODUCT_SELECTION = "product-selection";

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelection" rel="nofollow">ProductSelection</a>.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductSelection" rel="nofollow">ProductSelection</a>.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * factory method
     * @return instance of ProductSelectionReference
     */
    public static ProductSelectionReference of() {
        return new ProductSelectionReferenceImpl();
    }

    /**
     * factory method to create a shallow copy ProductSelectionReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSelectionReference of(final ProductSelectionReference template) {
        ProductSelectionReferenceImpl instance = new ProductSelectionReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    public ProductSelectionReference copyDeep();

    /**
     * factory method to create a deep copy of ProductSelectionReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSelectionReference deepCopy(@Nullable final ProductSelectionReference template) {
        if (template == null) {
            return null;
        }
        ProductSelectionReferenceImpl instance = new ProductSelectionReferenceImpl();
        instance.setId(template.getId());
        return instance;
    }

    /**
     * builder factory method for ProductSelectionReference
     * @return builder
     */
    public static ProductSelectionReferenceBuilder builder() {
        return ProductSelectionReferenceBuilder.of();
    }

    /**
     * create builder for ProductSelectionReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionReferenceBuilder builder(final ProductSelectionReference template) {
        return ProductSelectionReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSelectionReference(Function<ProductSelectionReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionReference>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionReference>";
            }
        };
    }
}
