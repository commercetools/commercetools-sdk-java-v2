
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
 *  <p>Generated after a successful Create Product Tailoring or Create Product Tailoring in Store request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringCreatedMessagePayload productTailoringCreatedMessagePayload = ProductTailoringCreatedMessagePayload.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .product(productBuilder -> productBuilder)
 *             .published(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTailoringCreatedMessagePayloadImpl.class)
public interface ProductTailoringCreatedMessagePayload extends MessagePayload {

    /**
     * discriminator value for ProductTailoringCreatedMessagePayload
     */
    String PRODUCT_TAILORING_CREATED = "ProductTailoringCreated";

    /**
     *  <p>User-defined unique identifier of the Product Tailoring.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

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
     *  <p>The description of the Product Tailoring at the time of creation.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>The name of the Product Tailoring at the time of creation.</p>
     * @return name
     */
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>The slug of the Product Tailoring at the time of creation.</p>
     * @return slug
     */
    @Valid
    @JsonProperty("slug")
    public LocalizedString getSlug();

    /**
     *  <p><code>true</code> if the ProductTailoring is published.</p>
     * @return published
     */
    @NotNull
    @JsonProperty("published")
    public Boolean getPublished();

    /**
     *  <p>User-defined unique identifier of the Product Tailoring.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

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
     *  <p>The description of the Product Tailoring at the time of creation.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     *  <p>The name of the Product Tailoring at the time of creation.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     *  <p>The slug of the Product Tailoring at the time of creation.</p>
     * @param slug value to be set
     */

    public void setSlug(final LocalizedString slug);

    /**
     *  <p><code>true</code> if the ProductTailoring is published.</p>
     * @param published value to be set
     */

    public void setPublished(final Boolean published);

    /**
     * factory method
     * @return instance of ProductTailoringCreatedMessagePayload
     */
    public static ProductTailoringCreatedMessagePayload of() {
        return new ProductTailoringCreatedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ProductTailoringCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTailoringCreatedMessagePayload of(final ProductTailoringCreatedMessagePayload template) {
        ProductTailoringCreatedMessagePayloadImpl instance = new ProductTailoringCreatedMessagePayloadImpl();
        instance.setKey(template.getKey());
        instance.setStore(template.getStore());
        instance.setProductKey(template.getProductKey());
        instance.setProduct(template.getProduct());
        instance.setDescription(template.getDescription());
        instance.setName(template.getName());
        instance.setSlug(template.getSlug());
        instance.setPublished(template.getPublished());
        return instance;
    }

    /**
     * factory method to create a deep copy of ProductTailoringCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringCreatedMessagePayload deepCopy(
            @Nullable final ProductTailoringCreatedMessagePayload template) {
        if (template == null) {
            return null;
        }
        ProductTailoringCreatedMessagePayloadImpl instance = new ProductTailoringCreatedMessagePayloadImpl();
        instance.setKey(template.getKey());
        instance.setStore(com.commercetools.api.models.store.StoreKeyReference.deepCopy(template.getStore()));
        instance.setProductKey(template.getProductKey());
        instance.setProduct(com.commercetools.api.models.product.ProductReference.deepCopy(template.getProduct()));
        instance.setDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getDescription()));
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        instance.setSlug(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getSlug()));
        instance.setPublished(template.getPublished());
        return instance;
    }

    /**
     * builder factory method for ProductTailoringCreatedMessagePayload
     * @return builder
     */
    public static ProductTailoringCreatedMessagePayloadBuilder builder() {
        return ProductTailoringCreatedMessagePayloadBuilder.of();
    }

    /**
     * create builder for ProductTailoringCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringCreatedMessagePayloadBuilder builder(
            final ProductTailoringCreatedMessagePayload template) {
        return ProductTailoringCreatedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringCreatedMessagePayload(Function<ProductTailoringCreatedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProductTailoringCreatedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProductTailoringCreatedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringCreatedMessagePayload>";
            }
        };
    }
}
