
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.product.ProductVariant;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Add Product Variant update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantAddedMessagePayload productVariantAddedMessagePayload = ProductVariantAddedMessagePayload.builder()
 *             .variant(variantBuilder -> variantBuilder)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductVariantAddedMessagePayloadImpl.class)
public interface ProductVariantAddedMessagePayload extends MessagePayload {

    /**
     * discriminator value for ProductVariantAddedMessagePayload
     */
    String PRODUCT_VARIANT_ADDED = "ProductVariantAdded";

    /**
     *  <p>Unique identifier of the Product Variant that was added.</p>
     * @return variant
     */
    @NotNull
    @Valid
    @JsonProperty("variant")
    public ProductVariant getVariant();

    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     * @return staged
     */
    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>Unique identifier of the Product Variant that was added.</p>
     * @param variant value to be set
     */

    public void setVariant(final ProductVariant variant);

    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of ProductVariantAddedMessagePayload
     */
    public static ProductVariantAddedMessagePayload of() {
        return new ProductVariantAddedMessagePayloadImpl();
    }

    /**
     * factory method to copy an instance of ProductVariantAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductVariantAddedMessagePayload of(final ProductVariantAddedMessagePayload template) {
        ProductVariantAddedMessagePayloadImpl instance = new ProductVariantAddedMessagePayloadImpl();
        instance.setVariant(template.getVariant());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductVariantAddedMessagePayload
     * @return builder
     */
    public static ProductVariantAddedMessagePayloadBuilder builder() {
        return ProductVariantAddedMessagePayloadBuilder.of();
    }

    /**
     * create builder for ProductVariantAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantAddedMessagePayloadBuilder builder(final ProductVariantAddedMessagePayload template) {
        return ProductVariantAddedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductVariantAddedMessagePayload(Function<ProductVariantAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantAddedMessagePayload>";
            }
        };
    }
}
