
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.Image;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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

    public void setVariantId(final Long variantId);

    public void setImage(final Image image);

    public void setStaged(final Boolean staged);

    public static ProductImageAddedMessagePayload of() {
        return new ProductImageAddedMessagePayloadImpl();
    }

    public static ProductImageAddedMessagePayload of(final ProductImageAddedMessagePayload template) {
        ProductImageAddedMessagePayloadImpl instance = new ProductImageAddedMessagePayloadImpl();
        instance.setVariantId(template.getVariantId());
        instance.setImage(template.getImage());
        instance.setStaged(template.getStaged());
        return instance;
    }

    public static ProductImageAddedMessagePayloadBuilder builder() {
        return ProductImageAddedMessagePayloadBuilder.of();
    }

    public static ProductImageAddedMessagePayloadBuilder builder(final ProductImageAddedMessagePayload template) {
        return ProductImageAddedMessagePayloadBuilder.of(template);
    }

    default <T> T withProductImageAddedMessagePayload(Function<ProductImageAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProductImageAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductImageAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductImageAddedMessagePayload>";
            }
        };
    }
}
