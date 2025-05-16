
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.product.ProductReference;
import com.commercetools.api.models.product_tailoring.ProductVariantTailoring;
import com.commercetools.api.models.store.StoreKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Add ProductVariant Tailoring update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantTailoringAddedMessage productVariantTailoringAddedMessage = ProductVariantTailoringAddedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .store(storeBuilder -> storeBuilder)
 *             .product(productBuilder -> productBuilder)
 *             .variantId(1)
 *             .variant(variantBuilder -> variantBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ProductVariantTailoringAdded")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductVariantTailoringAddedMessageImpl.class)
public interface ProductVariantTailoringAddedMessage extends Message {

    /**
     * discriminator value for ProductVariantTailoringAddedMessage
     */
    String PRODUCT_VARIANT_TAILORING_ADDED = "ProductVariantTailoringAdded";

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
     *  <p><code>id</code> of the ProductVariant added to the Tailoring.</p>
     * @return variantId
     */
    @NotNull
    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p>The ProductVariantTailoring that was added to the ProductTailoring.</p>
     * @return variant
     */
    @NotNull
    @Valid
    @JsonProperty("variant")
    public ProductVariantTailoring getVariant();

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
     *  <p><code>id</code> of the ProductVariant added to the Tailoring.</p>
     * @param variantId value to be set
     */

    public void setVariantId(final Long variantId);

    /**
     *  <p>The ProductVariantTailoring that was added to the ProductTailoring.</p>
     * @param variant value to be set
     */

    public void setVariant(final ProductVariantTailoring variant);

    /**
     * factory method
     * @return instance of ProductVariantTailoringAddedMessage
     */
    public static ProductVariantTailoringAddedMessage of() {
        return new ProductVariantTailoringAddedMessageImpl();
    }

    /**
     * factory method to create a shallow copy ProductVariantTailoringAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductVariantTailoringAddedMessage of(final ProductVariantTailoringAddedMessage template) {
        ProductVariantTailoringAddedMessageImpl instance = new ProductVariantTailoringAddedMessageImpl();
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
        instance.setVariant(template.getVariant());
        return instance;
    }

    public ProductVariantTailoringAddedMessage copyDeep();

    /**
     * factory method to create a deep copy of ProductVariantTailoringAddedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductVariantTailoringAddedMessage deepCopy(
            @Nullable final ProductVariantTailoringAddedMessage template) {
        if (template == null) {
            return null;
        }
        ProductVariantTailoringAddedMessageImpl instance = new ProductVariantTailoringAddedMessageImpl();
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
        instance.setVariant(
            com.commercetools.api.models.product_tailoring.ProductVariantTailoring.deepCopy(template.getVariant()));
        return instance;
    }

    /**
     * builder factory method for ProductVariantTailoringAddedMessage
     * @return builder
     */
    public static ProductVariantTailoringAddedMessageBuilder builder() {
        return ProductVariantTailoringAddedMessageBuilder.of();
    }

    /**
     * create builder for ProductVariantTailoringAddedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantTailoringAddedMessageBuilder builder(
            final ProductVariantTailoringAddedMessage template) {
        return ProductVariantTailoringAddedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductVariantTailoringAddedMessage(Function<ProductVariantTailoringAddedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantTailoringAddedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantTailoringAddedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantTailoringAddedMessage>";
            }
        };
    }
}
