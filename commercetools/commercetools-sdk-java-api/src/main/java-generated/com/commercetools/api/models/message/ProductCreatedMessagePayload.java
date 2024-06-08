
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.product.ProductProjection;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Create Product request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductCreatedMessagePayload productCreatedMessagePayload = ProductCreatedMessagePayload.builder()
 *             .productProjection(productProjectionBuilder -> productProjectionBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductCreatedMessagePayloadImpl.class)
public interface ProductCreatedMessagePayload extends MessagePayload {

    /**
     * discriminator value for ProductCreatedMessagePayload
     */
    String PRODUCT_CREATED = "ProductCreated";

    /**
     *  <p>The staged Product Projection of the Product at the time of creation.</p>
     * @return productProjection
     */
    @NotNull
    @Valid
    @JsonProperty("productProjection")
    public ProductProjection getProductProjection();

    /**
     *  <p>The staged Product Projection of the Product at the time of creation.</p>
     * @param productProjection value to be set
     */

    public void setProductProjection(final ProductProjection productProjection);

    /**
     * factory method
     * @return instance of ProductCreatedMessagePayload
     */
    public static ProductCreatedMessagePayload of() {
        return new ProductCreatedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ProductCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductCreatedMessagePayload of(final ProductCreatedMessagePayload template) {
        ProductCreatedMessagePayloadImpl instance = new ProductCreatedMessagePayloadImpl();
        instance.setProductProjection(template.getProductProjection());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductCreatedMessagePayload deepCopy(@Nullable final ProductCreatedMessagePayload template) {
        if (template == null) {
            return null;
        }
        ProductCreatedMessagePayloadImpl instance = new ProductCreatedMessagePayloadImpl();
        instance.setProductProjection(
            com.commercetools.api.models.product.ProductProjection.deepCopy(template.getProductProjection()));
        return instance;
    }

    /**
     * builder factory method for ProductCreatedMessagePayload
     * @return builder
     */
    public static ProductCreatedMessagePayloadBuilder builder() {
        return ProductCreatedMessagePayloadBuilder.of();
    }

    /**
     * create builder for ProductCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductCreatedMessagePayloadBuilder builder(final ProductCreatedMessagePayload template) {
        return ProductCreatedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductCreatedMessagePayload(Function<ProductCreatedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductCreatedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductCreatedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductCreatedMessagePayload>";
            }
        };
    }
}
