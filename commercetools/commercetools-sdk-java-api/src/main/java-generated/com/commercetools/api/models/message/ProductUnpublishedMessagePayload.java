
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Unpublish Product update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductUnpublishedMessagePayload productUnpublishedMessagePayload = ProductUnpublishedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductUnpublishedMessagePayloadImpl.class)
public interface ProductUnpublishedMessagePayload extends MessagePayload {

    /**
     * discriminator value for ProductUnpublishedMessagePayload
     */
    String PRODUCT_UNPUBLISHED = "ProductUnpublished";

    /**
     * factory method
     * @return instance of ProductUnpublishedMessagePayload
     */
    public static ProductUnpublishedMessagePayload of() {
        return new ProductUnpublishedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ProductUnpublishedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductUnpublishedMessagePayload of(final ProductUnpublishedMessagePayload template) {
        ProductUnpublishedMessagePayloadImpl instance = new ProductUnpublishedMessagePayloadImpl();
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductUnpublishedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductUnpublishedMessagePayload deepCopy(@Nullable final ProductUnpublishedMessagePayload template) {
        if (template == null) {
            return null;
        }
        ProductUnpublishedMessagePayloadImpl instance = new ProductUnpublishedMessagePayloadImpl();
        return instance;
    }

    /**
     * builder factory method for ProductUnpublishedMessagePayload
     * @return builder
     */
    public static ProductUnpublishedMessagePayloadBuilder builder() {
        return ProductUnpublishedMessagePayloadBuilder.of();
    }

    /**
     * create builder for ProductUnpublishedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductUnpublishedMessagePayloadBuilder builder(final ProductUnpublishedMessagePayload template) {
        return ProductUnpublishedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductUnpublishedMessagePayload(Function<ProductUnpublishedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductUnpublishedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductUnpublishedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductUnpublishedMessagePayload>";
            }
        };
    }
}
