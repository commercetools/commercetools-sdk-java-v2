
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
 *     ProductImageAddedMessage productImageAddedMessage = ProductImageAddedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .variantId(0.3)
 *             .image(imageBuilder -> imageBuilder)
 *             .staged(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductImageAddedMessageImpl.class)
public interface ProductImageAddedMessage extends Message {

    /**
     * discriminator value for ProductImageAddedMessage
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
     * @return instance of ProductImageAddedMessage
     */
    public static ProductImageAddedMessage of() {
        return new ProductImageAddedMessageImpl();
    }

    /**
     * factory method to create a shallow copy ProductImageAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductImageAddedMessage of(final ProductImageAddedMessage template) {
        ProductImageAddedMessageImpl instance = new ProductImageAddedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setVariantId(template.getVariantId());
        instance.setImage(template.getImage());
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductImageAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductImageAddedMessage deepCopy(@Nullable final ProductImageAddedMessage template) {
        if (template == null) {
            return null;
        }
        ProductImageAddedMessageImpl instance = new ProductImageAddedMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setVariantId(template.getVariantId());
        instance.setImage(com.commercetools.api.models.common.Image.deepCopy(template.getImage()));
        instance.setStaged(template.getStaged());
        return instance;
    }

    /**
     * builder factory method for ProductImageAddedMessage
     * @return builder
     */
    public static ProductImageAddedMessageBuilder builder() {
        return ProductImageAddedMessageBuilder.of();
    }

    /**
     * create builder for ProductImageAddedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductImageAddedMessageBuilder builder(final ProductImageAddedMessage template) {
        return ProductImageAddedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductImageAddedMessage(Function<ProductImageAddedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductImageAddedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductImageAddedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductImageAddedMessage>";
            }
        };
    }
}
