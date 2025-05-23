
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.product.ProductReference;
import com.commercetools.api.models.store.StoreKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Product Tailoring Unpublish update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringUnpublishedMessage productTailoringUnpublishedMessage = ProductTailoringUnpublishedMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .store(storeBuilder -> storeBuilder)
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ProductTailoringUnpublished")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTailoringUnpublishedMessageImpl.class)
public interface ProductTailoringUnpublishedMessage extends Message {

    /**
     * discriminator value for ProductTailoringUnpublishedMessage
     */
    String PRODUCT_TAILORING_UNPUBLISHED = "ProductTailoringUnpublished";

    /**
     *  <p>The Store to which the Product Tailoring belongs.</p>
     * @return store
     */
    @NotNull
    @Valid
    @JsonProperty("store")
    public StoreKeyReference getStore();

    /**
     *  <p>User-defined unique identifier of the Product this Product Tailoring belongs to.</p>
     * @return productKey
     */

    @JsonProperty("productKey")
    public String getProductKey();

    /**
     *  <p>Reference to the Product the Product Tailoring belongs to.</p>
     * @return product
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();

    /**
     *  <p>The Store to which the Product Tailoring belongs.</p>
     * @param store value to be set
     */

    public void setStore(final StoreKeyReference store);

    /**
     *  <p>User-defined unique identifier of the Product this Product Tailoring belongs to.</p>
     * @param productKey value to be set
     */

    public void setProductKey(final String productKey);

    /**
     *  <p>Reference to the Product the Product Tailoring belongs to.</p>
     * @param product value to be set
     */

    public void setProduct(final ProductReference product);

    /**
     * factory method
     * @return instance of ProductTailoringUnpublishedMessage
     */
    public static ProductTailoringUnpublishedMessage of() {
        return new ProductTailoringUnpublishedMessageImpl();
    }

    /**
     * factory method to create a shallow copy ProductTailoringUnpublishedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTailoringUnpublishedMessage of(final ProductTailoringUnpublishedMessage template) {
        ProductTailoringUnpublishedMessageImpl instance = new ProductTailoringUnpublishedMessageImpl();
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
        return instance;
    }

    public ProductTailoringUnpublishedMessage copyDeep();

    /**
     * factory method to create a deep copy of ProductTailoringUnpublishedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringUnpublishedMessage deepCopy(
            @Nullable final ProductTailoringUnpublishedMessage template) {
        if (template == null) {
            return null;
        }
        ProductTailoringUnpublishedMessageImpl instance = new ProductTailoringUnpublishedMessageImpl();
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
        return instance;
    }

    /**
     * builder factory method for ProductTailoringUnpublishedMessage
     * @return builder
     */
    public static ProductTailoringUnpublishedMessageBuilder builder() {
        return ProductTailoringUnpublishedMessageBuilder.of();
    }

    /**
     * create builder for ProductTailoringUnpublishedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringUnpublishedMessageBuilder builder(final ProductTailoringUnpublishedMessage template) {
        return ProductTailoringUnpublishedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringUnpublishedMessage(Function<ProductTailoringUnpublishedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTailoringUnpublishedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTailoringUnpublishedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringUnpublishedMessage>";
            }
        };
    }
}
