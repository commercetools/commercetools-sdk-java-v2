
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Image;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Add External Image update action or after the successful upload of an image.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductImageAddedMessagePayload productImageAddedMessagePayload = ProductImageAddedMessagePayload.builder()
 *             .variantId(0.3)
 *             .image(imageBuilder -> imageBuilder)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductImageAddedMessagePayloadImpl.class)
public interface ProductImageAddedMessagePayload extends MessagePayload {

    /**
     * discriminator value for ProductImageAddedMessagePayload
     */
    String PRODUCT_IMAGE_ADDED = "ProductImageAdded";

    /**
     *  <p>Unique identifier of the Product Variant to which the Image was added.</p>
     * @return variantId
     */
    @NotNull
    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p>Image that was added.</p>
     * @return image
     */
    @NotNull
    @Valid
    @JsonProperty("image")
    public Image getImage();

    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     * @return staged
     */
    @NotNull
    @JsonProperty("staged")
    public Boolean getStaged();

    /**
     *  <p>Unique identifier of the Product Variant to which the Image was added.</p>
     * @param variantId value to be set
     */

    public void setVariantId(final Long variantId);

    /**
     *  <p>Image that was added.</p>
     * @param image value to be set
     */

    public void setImage(final Image image);

    /**
     *  <p>Whether the update was only applied to the staged Product Projection.</p>
     * @param staged value to be set
     */

    public void setStaged(final Boolean staged);

    /**
     * factory method
     * @return instance of ProductImageAddedMessagePayload
     */
    public static ProductImageAddedMessagePayload of() {
        return new ProductImageAddedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ProductImageAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductImageAddedMessagePayload of(final ProductImageAddedMessagePayload template) {
        ProductImageAddedMessagePayloadImpl instance = new ProductImageAddedMessagePayloadImpl();
        instance.setVariantId(template.getVariantId());
        instance.setImage(template.getImage());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductImageAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductImageAddedMessagePayload deepCopy(@Nullable final ProductImageAddedMessagePayload template) {
        if (template == null) {
            return null;
        }
        ProductImageAddedMessagePayloadImpl instance = new ProductImageAddedMessagePayloadImpl();
        instance.setVariantId(template.getVariantId());
        instance.setImage(com.commercetools.api.models.common.Image.deepCopy(template.getImage()));
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductImageAddedMessagePayload
     * @return builder
     */
    public static ProductImageAddedMessagePayloadBuilder builder() {
        return ProductImageAddedMessagePayloadBuilder.of();
    }

    /**
     * create builder for ProductImageAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductImageAddedMessagePayloadBuilder builder(final ProductImageAddedMessagePayload template) {
        return ProductImageAddedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductImageAddedMessagePayload(Function<ProductImageAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductImageAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductImageAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductImageAddedMessagePayload>";
            }
        };
    }
}
