
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Delete Product Selection request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductSelectionDeletedMessagePayload productSelectionDeletedMessagePayload = ProductSelectionDeletedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductSelectionDeletedMessagePayloadImpl.class)
public interface ProductSelectionDeletedMessagePayload extends MessagePayload {

    /**
     * discriminator value for ProductSelectionDeletedMessagePayload
     */
    String PRODUCT_SELECTION_DELETED = "ProductSelectionDeleted";

    /**
     * factory method
     * @return instance of ProductSelectionDeletedMessagePayload
     */
    public static ProductSelectionDeletedMessagePayload of() {
        return new ProductSelectionDeletedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ProductSelectionDeletedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductSelectionDeletedMessagePayload of(final ProductSelectionDeletedMessagePayload template) {
        ProductSelectionDeletedMessagePayloadImpl instance = new ProductSelectionDeletedMessagePayloadImpl();
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductSelectionDeletedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductSelectionDeletedMessagePayload deepCopy(
            @Nullable final ProductSelectionDeletedMessagePayload template) {
        if (template == null) {
            return null;
        }
        ProductSelectionDeletedMessagePayloadImpl instance = new ProductSelectionDeletedMessagePayloadImpl();
        return instance;
    }

    /**
     * builder factory method for ProductSelectionDeletedMessagePayload
     * @return builder
     */
    public static ProductSelectionDeletedMessagePayloadBuilder builder() {
        return ProductSelectionDeletedMessagePayloadBuilder.of();
    }

    /**
     * create builder for ProductSelectionDeletedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductSelectionDeletedMessagePayloadBuilder builder(
            final ProductSelectionDeletedMessagePayload template) {
        return ProductSelectionDeletedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductSelectionDeletedMessagePayload(Function<ProductSelectionDeletedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductSelectionDeletedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductSelectionDeletedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductSelectionDeletedMessagePayload>";
            }
        };
    }
}
