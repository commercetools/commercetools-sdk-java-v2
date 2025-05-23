
package com.commercetools.api.models.product_type;

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
 *  <p>Reference to a ProductType.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTypeReference productTypeReference = ProductTypeReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("product-type")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTypeReferenceImpl.class)
public interface ProductTypeReference extends Reference, com.commercetools.api.models.Identifiable<ProductType>,
        com.commercetools.api.models.IdentifiableObjHolder<ProductType> {

    /**
     * discriminator value for ProductTypeReference
     */
    String PRODUCT_TYPE = "product-type";

    /**
     *  <p>Contains the representation of the expanded ProductType. Only present in responses to requests with Reference Expansion for ProductTypes.</p>
     * @return obj
     */
    @Valid
    @JsonProperty("obj")
    public ProductType getObj();

    /**
     *  <p>Unique identifier of the referenced ProductType.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Contains the representation of the expanded ProductType. Only present in responses to requests with Reference Expansion for ProductTypes.</p>
     * @param obj value to be set
     */

    public void setObj(final ProductType obj);

    /**
     *  <p>Unique identifier of the referenced ProductType.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * factory method
     * @return instance of ProductTypeReference
     */
    public static ProductTypeReference of() {
        return new ProductTypeReferenceImpl();
    }

    /**
     * factory method to create a shallow copy ProductTypeReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTypeReference of(final ProductTypeReference template) {
        ProductTypeReferenceImpl instance = new ProductTypeReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    public ProductTypeReference copyDeep();

    /**
     * factory method to create a deep copy of ProductTypeReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTypeReference deepCopy(@Nullable final ProductTypeReference template) {
        if (template == null) {
            return null;
        }
        ProductTypeReferenceImpl instance = new ProductTypeReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(com.commercetools.api.models.product_type.ProductType.deepCopy(template.getObj()));
        return instance;
    }

    /**
     * builder factory method for ProductTypeReference
     * @return builder
     */
    public static ProductTypeReferenceBuilder builder() {
        return ProductTypeReferenceBuilder.of();
    }

    /**
     * create builder for ProductTypeReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTypeReferenceBuilder builder(final ProductTypeReference template) {
        return ProductTypeReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTypeReference(Function<ProductTypeReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTypeReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTypeReference>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTypeReference>";
            }
        };
    }
}
