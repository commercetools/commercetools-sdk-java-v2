
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Image;
import com.commercetools.api.models.product.ProductReference;
import com.commercetools.api.models.store.StoreKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Add External Image update action or after a successful Upload Product Tailoring image request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringImageAddedMessage productTailoringImageAddedMessage = ProductTailoringImageAddedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .store(storeBuilder -> storeBuilder)
 *             .product(productBuilder -> productBuilder)
 *             .variantId(0.3)
 *             .image(imageBuilder -> imageBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ProductTailoringImageAdded")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTailoringImageAddedMessageImpl.class)
public interface ProductTailoringImageAddedMessage extends Message {

    /**
     * discriminator value for ProductTailoringImageAddedMessage
     */
    String PRODUCT_TAILORING_IMAGE_ADDED = "ProductTailoringImageAdded";

    /**
     *  <p>The Store to which the Product Tailoring belongs.</p>
     * @return store
     */
    @NotNull
    @Valid
    @JsonProperty("store")
    public StoreKeyReference getStore();

    /**
     *  <p><code>key</code> of the tailored Product.</p>
     * @return productKey
     */

    @JsonProperty("productKey")
    public String getProductKey();

    /**
     *  <p>Reference to the tailored Product.</p>
     * @return product
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();

    /**
     *  <p><code>id</code> of the tailored ProductVariant.</p>
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
     *  <p>The Store to which the Product Tailoring belongs.</p>
     * @param store value to be set
     */

    public void setStore(final StoreKeyReference store);

    /**
     *  <p><code>key</code> of the tailored Product.</p>
     * @param productKey value to be set
     */

    public void setProductKey(final String productKey);

    /**
     *  <p>Reference to the tailored Product.</p>
     * @param product value to be set
     */

    public void setProduct(final ProductReference product);

    /**
     *  <p><code>id</code> of the tailored ProductVariant.</p>
     * @param variantId value to be set
     */

    public void setVariantId(final Long variantId);

    /**
     *  <p>Image that was added.</p>
     * @param image value to be set
     */

    public void setImage(final Image image);

    /**
     * factory method
     * @return instance of ProductTailoringImageAddedMessage
     */
    public static ProductTailoringImageAddedMessage of() {
        return new ProductTailoringImageAddedMessageImpl();
    }

    /**
     * factory method to create a shallow copy ProductTailoringImageAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTailoringImageAddedMessage of(final ProductTailoringImageAddedMessage template) {
        ProductTailoringImageAddedMessageImpl instance = new ProductTailoringImageAddedMessageImpl();
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
        instance.setStore(template.getStore());
        instance.setProductKey(template.getProductKey());
        instance.setProduct(template.getProduct());
        instance.setVariantId(template.getVariantId());
        instance.setImage(template.getImage());
        return instance;
    }

    public ProductTailoringImageAddedMessage copyDeep();

    /**
     * factory method to create a deep copy of ProductTailoringImageAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringImageAddedMessage deepCopy(
            @Nullable final ProductTailoringImageAddedMessage template) {
        if (template == null) {
            return null;
        }
        ProductTailoringImageAddedMessageImpl instance = new ProductTailoringImageAddedMessageImpl();
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
        instance.setStore(com.commercetools.api.models.store.StoreKeyReference.deepCopy(template.getStore()));
        instance.setProductKey(template.getProductKey());
        instance.setProduct(com.commercetools.api.models.product.ProductReference.deepCopy(template.getProduct()));
        instance.setVariantId(template.getVariantId());
        instance.setImage(com.commercetools.api.models.common.Image.deepCopy(template.getImage()));
        return instance;
    }

    /**
     * builder factory method for ProductTailoringImageAddedMessage
     * @return builder
     */
    public static ProductTailoringImageAddedMessageBuilder builder() {
        return ProductTailoringImageAddedMessageBuilder.of();
    }

    /**
     * create builder for ProductTailoringImageAddedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringImageAddedMessageBuilder builder(final ProductTailoringImageAddedMessage template) {
        return ProductTailoringImageAddedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringImageAddedMessage(Function<ProductTailoringImageAddedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTailoringImageAddedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTailoringImageAddedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringImageAddedMessage>";
            }
        };
    }
}
