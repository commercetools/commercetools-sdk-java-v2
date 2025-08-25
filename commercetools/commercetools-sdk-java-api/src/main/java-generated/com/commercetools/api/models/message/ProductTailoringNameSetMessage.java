
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.LocalizedString;
import com.commercetools.api.models.product.ProductReference;
import com.commercetools.api.models.store.StoreKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Product Tailoring <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoringSetNameAction" rel="nofollow">Set Name</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringNameSetMessage productTailoringNameSetMessage = ProductTailoringNameSetMessage.builder()
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
@io.vrap.rmf.base.client.utils.json.SubType("ProductTailoringNameSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTailoringNameSetMessageImpl.class)
public interface ProductTailoringNameSetMessage extends Message {

    /**
     * discriminator value for ProductTailoringNameSetMessage
     */
    String PRODUCT_TAILORING_NAME_SET = "ProductTailoringNameSet";

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
     *  <p>The name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">Product Tailoring</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoringSetNameAction" rel="nofollow">Set Name</a> update action.</p>
     * @return name
     */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>The name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">ProductTailoring</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoringSetNameAction" rel="nofollow">Set Name</a> update action.</p>
     * @return oldName
     */
    @Valid
    @JsonProperty("oldName")
    public LocalizedString getOldName();

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
     *  <p>The name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">Product Tailoring</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoringSetNameAction" rel="nofollow">Set Name</a> update action.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>The name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">ProductTailoring</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoringSetNameAction" rel="nofollow">Set Name</a> update action.</p>
     * @param oldName value to be set
     */

    public void setOldName(final LocalizedString oldName);

    /**
     * factory method
     * @return instance of ProductTailoringNameSetMessage
     */
    public static ProductTailoringNameSetMessage of() {
        return new ProductTailoringNameSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy ProductTailoringNameSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTailoringNameSetMessage of(final ProductTailoringNameSetMessage template) {
        ProductTailoringNameSetMessageImpl instance = new ProductTailoringNameSetMessageImpl();
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
        instance.setName(template.getName());
        instance.setOldName(template.getOldName());
        return instance;
    }

    public ProductTailoringNameSetMessage copyDeep();

    /**
     * factory method to create a deep copy of ProductTailoringNameSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringNameSetMessage deepCopy(@Nullable final ProductTailoringNameSetMessage template) {
        if (template == null) {
            return null;
        }
        ProductTailoringNameSetMessageImpl instance = new ProductTailoringNameSetMessageImpl();
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
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setOldName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getOldName()));
        return instance;
    }

    /**
     * builder factory method for ProductTailoringNameSetMessage
     * @return builder
     */
    public static ProductTailoringNameSetMessageBuilder builder() {
        return ProductTailoringNameSetMessageBuilder.of();
    }

    /**
     * create builder for ProductTailoringNameSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringNameSetMessageBuilder builder(final ProductTailoringNameSetMessage template) {
        return ProductTailoringNameSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringNameSetMessage(Function<ProductTailoringNameSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTailoringNameSetMessage> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTailoringNameSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringNameSetMessage>";
            }
        };
    }
}
