
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product.ProductReference;
import com.commercetools.api.models.store.StoreKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Product Tailoring Set Description update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringDescriptionSetMessage productTailoringDescriptionSetMessage = ProductTailoringDescriptionSetMessage.builder()
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTailoringDescriptionSetMessageImpl.class)
public interface ProductTailoringDescriptionSetMessage extends Message {

    /**
     * discriminator value for ProductTailoringDescriptionSetMessage
     */
    String PRODUCT_TAILORING_DESCRIPTION_SET = "ProductTailoringDescriptionSet";

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
     *  <p>The description of the Product Tailoring after the Set Description update action.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>The description of the ProductTailoring before the Set Description update action.</p>
     * @return oldDescription
     */
    @Valid
    @JsonProperty("oldDescription")
    public LocalizedString getOldDescription();

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
     *  <p>The description of the Product Tailoring after the Set Description update action.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     *  <p>The description of the ProductTailoring before the Set Description update action.</p>
     * @param oldDescription value to be set
     */

    public void setOldDescription(final LocalizedString oldDescription);

    /**
     * factory method
     * @return instance of ProductTailoringDescriptionSetMessage
     */
    public static ProductTailoringDescriptionSetMessage of() {
        return new ProductTailoringDescriptionSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy ProductTailoringDescriptionSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTailoringDescriptionSetMessage of(final ProductTailoringDescriptionSetMessage template) {
        ProductTailoringDescriptionSetMessageImpl instance = new ProductTailoringDescriptionSetMessageImpl();
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
        instance.setDescription(template.getDescription());
        instance.setOldDescription(template.getOldDescription());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductTailoringDescriptionSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringDescriptionSetMessage deepCopy(
            @Nullable final ProductTailoringDescriptionSetMessage template) {
        if (template == null) {
            return null;
        }
        ProductTailoringDescriptionSetMessageImpl instance = new ProductTailoringDescriptionSetMessageImpl();
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
        instance.setDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getDescription()));
        instance.setOldDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getOldDescription()));
        return instance;
    }

    /**
     * builder factory method for ProductTailoringDescriptionSetMessage
     * @return builder
     */
    public static ProductTailoringDescriptionSetMessageBuilder builder() {
        return ProductTailoringDescriptionSetMessageBuilder.of();
    }

    /**
     * create builder for ProductTailoringDescriptionSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringDescriptionSetMessageBuilder builder(
            final ProductTailoringDescriptionSetMessage template) {
        return ProductTailoringDescriptionSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringDescriptionSetMessage(Function<ProductTailoringDescriptionSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTailoringDescriptionSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTailoringDescriptionSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringDescriptionSetMessage>";
            }
        };
    }
}
