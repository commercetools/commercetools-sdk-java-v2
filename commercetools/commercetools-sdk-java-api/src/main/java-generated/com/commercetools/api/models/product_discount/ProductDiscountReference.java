
package com.commercetools.api.models.product_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Reference to a ProductDiscount.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductDiscountReference productDiscountReference = ProductDiscountReference.builder()
 *             .id("{id}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductDiscountReferenceImpl.class)
public interface ProductDiscountReference extends Reference, com.commercetools.api.models.Identifiable<ProductDiscount>,
        com.commercetools.api.models.IdentifiableObjHolder<ProductDiscount> {

    /**
     * discriminator value for ProductDiscountReference
     */
    String PRODUCT_DISCOUNT = "product-discount";

    /**
     *  <p>Contains the representation of the expanded ProductDiscount. Only present in responses to requests with Reference Expansion for ProductDiscounts.</p>
     * @return obj
     */
    @Valid
    @JsonProperty("obj")
    public ProductDiscount getObj();

    /**
     *  <p>Unique identifier of the referenced ProductDiscount.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Contains the representation of the expanded ProductDiscount. Only present in responses to requests with Reference Expansion for ProductDiscounts.</p>
     * @param obj value to be set
     */

    public void setObj(final ProductDiscount obj);

    /**
     *  <p>Unique identifier of the referenced ProductDiscount.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     * factory method
     * @return instance of ProductDiscountReference
     */
    public static ProductDiscountReference of() {
        return new ProductDiscountReferenceImpl();
    }

    /**
     * factory method to create a shallow copy ProductDiscountReference
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductDiscountReference of(final ProductDiscountReference template) {
        ProductDiscountReferenceImpl instance = new ProductDiscountReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(template.getObj());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductDiscountReference
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductDiscountReference deepCopy(@Nullable final ProductDiscountReference template) {
        if (template == null) {
            return null;
        }
        ProductDiscountReferenceImpl instance = new ProductDiscountReferenceImpl();
        instance.setId(template.getId());
        instance.setObj(com.commercetools.api.models.product_discount.ProductDiscount.deepCopy(template.getObj()));
        return instance;
    }

    /**
     * builder factory method for ProductDiscountReference
     * @return builder
     */
    public static ProductDiscountReferenceBuilder builder() {
        return ProductDiscountReferenceBuilder.of();
    }

    /**
     * create builder for ProductDiscountReference instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductDiscountReferenceBuilder builder(final ProductDiscountReference template) {
        return ProductDiscountReferenceBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductDiscountReference(Function<ProductDiscountReference, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductDiscountReference> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductDiscountReference>() {
            @Override
            public String toString() {
                return "TypeReference<ProductDiscountReference>";
            }
        };
    }
}
