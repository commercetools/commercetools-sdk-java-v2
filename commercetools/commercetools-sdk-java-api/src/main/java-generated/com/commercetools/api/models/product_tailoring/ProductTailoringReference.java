
package com.commercetools.api.models.product_tailoring;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Reference" rel="nofollow">Reference</a> to a <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">ProductTailoring</a>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringReference productTailoringReference = ProductTailoringReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("product-tailoring")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTailoringReferenceImpl.class)
public interface ProductTailoringReference extends Reference {

    /**
     * discriminator value for ProductTailoringReference
     */
    String PRODUCT_TAILORING = "product-tailoring";

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">ProductTailoring</a>.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Contains the representation of the expanded ProductTailoring. Only present in responses to requests with <span>Reference Expansion</span> for ProductTailoring.</p>
     * @return obj
     */
    @Valid
    @JsonProperty("obj")
    public ProductTailoring getObj();

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">ProductTailoring</a>.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Contains the representation of the expanded ProductTailoring. Only present in responses to requests with <span>Reference Expansion</span> for ProductTailoring.</p>
     * @param obj value to be set
     */

    public void setObj(final ProductTailoring obj);

    /**
     * factory method
     * @return instance of ProductTailoringReference
     */
    public static ProductTailoringReference of() {
        return new ProductTailoringReferenceImpl();
    }

    /**
     * factory method to create a shallow copy ProductTailoringReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTailoringReference of(final ProductTailoringReference template) {
        ProductTailoringReferenceImpl instance = new ProductTailoringReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public ProductTailoringReference copyDeep();

    /**
     * factory method to create a deep copy of ProductTailoringReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringReference deepCopy(@Nullable final ProductTailoringReference template) {
        if (template == null) {
            return null;
        }
        ProductTailoringReferenceImpl instance = new ProductTailoringReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(com.commercetools.api.models.product_tailoring.ProductTailoring.deepCopy(template.getObj()));
        return instance;
    }

    /**
     * builder factory method for ProductTailoringReference
     * @return builder
     */
    public static ProductTailoringReferenceBuilder builder() {
        return ProductTailoringReferenceBuilder.of();
    }

    /**
     * create builder for ProductTailoringReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringReferenceBuilder builder(final ProductTailoringReference template) {
        return ProductTailoringReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringReference(Function<ProductTailoringReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTailoringReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTailoringReference>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringReference>";
            }
        };
    }
}
