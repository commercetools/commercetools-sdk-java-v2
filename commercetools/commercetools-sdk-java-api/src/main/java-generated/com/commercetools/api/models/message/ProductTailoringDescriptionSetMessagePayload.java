
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
 *  <p>Generated after a successful Product Tailoring Set Description update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringDescriptionSetMessagePayload productTailoringDescriptionSetMessagePayload = ProductTailoringDescriptionSetMessagePayload.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ProductTailoringDescriptionSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTailoringDescriptionSetMessagePayloadImpl.class)
public interface ProductTailoringDescriptionSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for ProductTailoringDescriptionSetMessagePayload
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
     * @return instance of ProductTailoringDescriptionSetMessagePayload
     */
    public static ProductTailoringDescriptionSetMessagePayload of() {
        return new ProductTailoringDescriptionSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ProductTailoringDescriptionSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTailoringDescriptionSetMessagePayload of(
            final ProductTailoringDescriptionSetMessagePayload template) {
        ProductTailoringDescriptionSetMessagePayloadImpl instance = new ProductTailoringDescriptionSetMessagePayloadImpl();
        instance.setStore(template.getStore());
        instance.setProductKey(template.getProductKey());
        instance.setProduct(template.getProduct());
        instance.setDescription(template.getDescription());
        instance.setOldDescription(template.getOldDescription());
        return instance;
    }

    public ProductTailoringDescriptionSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of ProductTailoringDescriptionSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringDescriptionSetMessagePayload deepCopy(
            @Nullable final ProductTailoringDescriptionSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        ProductTailoringDescriptionSetMessagePayloadImpl instance = new ProductTailoringDescriptionSetMessagePayloadImpl();
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
     * builder factory method for ProductTailoringDescriptionSetMessagePayload
     * @return builder
     */
    public static ProductTailoringDescriptionSetMessagePayloadBuilder builder() {
        return ProductTailoringDescriptionSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for ProductTailoringDescriptionSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringDescriptionSetMessagePayloadBuilder builder(
            final ProductTailoringDescriptionSetMessagePayload template) {
        return ProductTailoringDescriptionSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringDescriptionSetMessagePayload(
            Function<ProductTailoringDescriptionSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTailoringDescriptionSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTailoringDescriptionSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringDescriptionSetMessagePayload>";
            }
        };
    }
}
