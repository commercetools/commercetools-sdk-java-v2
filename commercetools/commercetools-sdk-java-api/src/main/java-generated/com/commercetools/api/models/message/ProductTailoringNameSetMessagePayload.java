
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
 *  <p>Generated after a successful Product Tailoring Set Name update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringNameSetMessagePayload productTailoringNameSetMessagePayload = ProductTailoringNameSetMessagePayload.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTailoringNameSetMessagePayloadImpl.class)
public interface ProductTailoringNameSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for ProductTailoringNameSetMessagePayload
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
     *  <p>The name of the Product Tailoring after the Set Name update action.</p>
     * @return name
     */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>The name of the ProductTailoring before the Set Name update action.</p>
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
     *  <p>The name of the Product Tailoring after the Set Name update action.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>The name of the ProductTailoring before the Set Name update action.</p>
     * @param oldName value to be set
     */

    public void setOldName(final LocalizedString oldName);

    /**
     * factory method
     * @return instance of ProductTailoringNameSetMessagePayload
     */
    public static ProductTailoringNameSetMessagePayload of() {
        return new ProductTailoringNameSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ProductTailoringNameSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTailoringNameSetMessagePayload of(final ProductTailoringNameSetMessagePayload template) {
        ProductTailoringNameSetMessagePayloadImpl instance = new ProductTailoringNameSetMessagePayloadImpl();
        instance.setStore(template.getStore());
        instance.setProductKey(template.getProductKey());
        instance.setProduct(template.getProduct());
        instance.setName(template.getName());
        instance.setOldName(template.getOldName());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductTailoringNameSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringNameSetMessagePayload deepCopy(
            @Nullable final ProductTailoringNameSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        ProductTailoringNameSetMessagePayloadImpl instance = new ProductTailoringNameSetMessagePayloadImpl();
        instance.setStore(com.commercetools.api.models.store.StoreKeyReference.deepCopy(template.getStore()));
        instance.setProductKey(template.getProductKey());
        instance.setProduct(com.commercetools.api.models.product.ProductReference.deepCopy(template.getProduct()));
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setOldName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getOldName()));
        return instance;
    }

    /**
     * builder factory method for ProductTailoringNameSetMessagePayload
     * @return builder
     */
    public static ProductTailoringNameSetMessagePayloadBuilder builder() {
        return ProductTailoringNameSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for ProductTailoringNameSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringNameSetMessagePayloadBuilder builder(
            final ProductTailoringNameSetMessagePayload template) {
        return ProductTailoringNameSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringNameSetMessagePayload(Function<ProductTailoringNameSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTailoringNameSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTailoringNameSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringNameSetMessagePayload>";
            }
        };
    }
}
