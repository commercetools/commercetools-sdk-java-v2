
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product.ProductReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Remove Product update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionProductRemovedMessagePayload productSelectionProductRemovedMessagePayload = ProductSelectionProductRemovedMessagePayload.builder()
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionProductRemovedMessagePayloadImpl.class)
public interface ProductSelectionProductRemovedMessagePayload extends MessagePayload {

    /**
     * discriminator value for ProductSelectionProductRemovedMessagePayload
     */
    String PRODUCT_SELECTION_PRODUCT_REMOVED = "ProductSelectionProductRemoved";

    /**
     *  <p>Product that was removed from the Product Selection.</p>
     * @return product
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();

    /**
     *  <p>Product that was removed from the Product Selection.</p>
     * @param product value to be set
     */

    public void setProduct(final ProductReference product);

    /**
     * factory method
     * @return instance of ProductSelectionProductRemovedMessagePayload
     */
    public static ProductSelectionProductRemovedMessagePayload of() {
        return new ProductSelectionProductRemovedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ProductSelectionProductRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSelectionProductRemovedMessagePayload of(
            final ProductSelectionProductRemovedMessagePayload template) {
        ProductSelectionProductRemovedMessagePayloadImpl instance = new ProductSelectionProductRemovedMessagePayloadImpl();
        instance.setProduct(template.getProduct());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSelectionProductRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSelectionProductRemovedMessagePayload deepCopy(
            @Nullable final ProductSelectionProductRemovedMessagePayload template) {
        if (template == null) {
            return null;
        }
        ProductSelectionProductRemovedMessagePayloadImpl instance = new ProductSelectionProductRemovedMessagePayloadImpl();
        instance.setProduct(com.commercetools.api.models.product.ProductReference.deepCopy(template.getProduct()));
        return instance;
    }

    /**
     * builder factory method for ProductSelectionProductRemovedMessagePayload
     * @return builder
     */
    public static ProductSelectionProductRemovedMessagePayloadBuilder builder() {
        return ProductSelectionProductRemovedMessagePayloadBuilder.of();
    }

    /**
     * create builder for ProductSelectionProductRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionProductRemovedMessagePayloadBuilder builder(
            final ProductSelectionProductRemovedMessagePayload template) {
        return ProductSelectionProductRemovedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSelectionProductRemovedMessagePayload(
            Function<ProductSelectionProductRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionProductRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionProductRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionProductRemovedMessagePayload>";
            }
        };
    }
}
