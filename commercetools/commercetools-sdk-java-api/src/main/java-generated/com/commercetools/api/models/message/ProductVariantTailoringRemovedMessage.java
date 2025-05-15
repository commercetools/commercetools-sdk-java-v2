
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
 *  <p>Generated after a successful Remove ProductVariant Tailoring update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductVariantTailoringRemovedMessage productVariantTailoringRemovedMessage = ProductVariantTailoringRemovedMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("ProductVariantTailoringRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductVariantTailoringRemovedMessageImpl.class)
public interface ProductVariantTailoringRemovedMessage extends Message {

    /**
     * discriminator value for ProductVariantTailoringRemovedMessage
     */
    String PRODUCT_VARIANT_TAILORING_REMOVED = "ProductVariantTailoringRemoved";

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
     *  <p>Reference to the Product the Product Tailoring belongs to.</p>
     * @return product
     */
    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();

    /**
     *  <p><code>id</code> of the ProductVariant removed from the Tailoring.</p>
     * @return variantId
     */
    @NotNull
    @JsonProperty("variantId")
    public Long getVariantId();

    /**
     *  <p>The ProductVariantTailoring that was removed from the ProductTailoring.</p>
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
     *  <p>Reference to the Product the Product Tailoring belongs to.</p>
     * @param product value to be set
     */

    public void setProduct(final ProductReference product);

    /**
     *  <p><code>id</code> of the ProductVariant removed from the Tailoring.</p>
     * @param variantId value to be set
     */

    public void setVariantId(final Long variantId);

    /**
     *  <p>The ProductVariantTailoring that was removed from the ProductTailoring.</p>
     * @param variant value to be set
     */

    public void setVariant(final ProductVariantTailoring variant);

    /**
     * factory method
     * @return instance of ProductVariantTailoringRemovedMessage
     */
    public static ProductVariantTailoringRemovedMessage of() {
        return new ProductVariantTailoringRemovedMessageImpl();
    }

    /**
     * factory method to create a shallow copy ProductVariantTailoringRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductVariantTailoringRemovedMessage of(final ProductVariantTailoringRemovedMessage template) {
        ProductVariantTailoringRemovedMessageImpl instance = new ProductVariantTailoringRemovedMessageImpl();
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

    public ProductVariantTailoringRemovedMessage copyDeep();

    /**
     * factory method to create a deep copy of ProductVariantTailoringRemovedMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductVariantTailoringRemovedMessage deepCopy(
            @Nullable final ProductVariantTailoringRemovedMessage template) {
        if (template == null) {
            return null;
        }
        ProductVariantTailoringRemovedMessageImpl instance = new ProductVariantTailoringRemovedMessageImpl();
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
     * builder factory method for ProductVariantTailoringRemovedMessage
     * @return builder
     */
    public static ProductVariantTailoringRemovedMessageBuilder builder() {
        return ProductVariantTailoringRemovedMessageBuilder.of();
    }

    /**
     * create builder for ProductVariantTailoringRemovedMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductVariantTailoringRemovedMessageBuilder builder(
            final ProductVariantTailoringRemovedMessage template) {
        return ProductVariantTailoringRemovedMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductVariantTailoringRemovedMessage(Function<ProductVariantTailoringRemovedMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductVariantTailoringRemovedMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductVariantTailoringRemovedMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductVariantTailoringRemovedMessage>";
            }
        };
    }
}
