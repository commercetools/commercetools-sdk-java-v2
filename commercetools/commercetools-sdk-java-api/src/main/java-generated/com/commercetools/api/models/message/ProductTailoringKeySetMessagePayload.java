
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.product.ProductReference;
import com.commercetools.api.models.store.StoreKeyReference;
import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>Generated after a successful Product Tailoring <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoringSetKeyAction" rel="nofollow">Set Key</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProductTailoringKeySetMessagePayload productTailoringKeySetMessagePayload = ProductTailoringKeySetMessagePayload.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .product(productBuilder -> productBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ProductTailoringKeySet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProductTailoringKeySetMessagePayloadImpl.class)
public interface ProductTailoringKeySetMessagePayload extends MessagePayload {

    /**
     * discriminator value for ProductTailoringKeySetMessagePayload
     */
    String PRODUCT_TAILORING_KEY_SET = "ProductTailoringKeySet";

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
     *  <p><code>key</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">ProductTailoring</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoringSetKeyAction" rel="nofollow">Set Key</a> update action.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p><code>key</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">ProductTailoring</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoringSetKeyAction" rel="nofollow">Set Key</a> update action.</p>
     * @return oldKey
     */

    @JsonProperty("oldKey")
    public String getOldKey();

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
     *  <p><code>key</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">ProductTailoring</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoringSetKeyAction" rel="nofollow">Set Key</a> update action.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p><code>key</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoring" rel="nofollow">ProductTailoring</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:ProductTailoringSetKeyAction" rel="nofollow">Set Key</a> update action.</p>
     * @param oldKey value to be set
     */

    public void setOldKey(final String oldKey);

    /**
     * factory method
     * @return instance of ProductTailoringKeySetMessagePayload
     */
    public static ProductTailoringKeySetMessagePayload of() {
        return new ProductTailoringKeySetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ProductTailoringKeySetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProductTailoringKeySetMessagePayload of(final ProductTailoringKeySetMessagePayload template) {
        ProductTailoringKeySetMessagePayloadImpl instance = new ProductTailoringKeySetMessagePayloadImpl();
        instance.setStore(template.getStore());
        instance.setProductKey(template.getProductKey());
        instance.setProduct(template.getProduct());
        instance.setKey(template.getKey());
        instance.setOldKey(template.getOldKey());
        return instance;
    }

    public ProductTailoringKeySetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of ProductTailoringKeySetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProductTailoringKeySetMessagePayload deepCopy(
            @Nullable final ProductTailoringKeySetMessagePayload template) {
        if (template == null) {
            return null;
        }
        ProductTailoringKeySetMessagePayloadImpl instance = new ProductTailoringKeySetMessagePayloadImpl();
        instance.setStore(com.commercetools.api.models.store.StoreKeyReference.deepCopy(template.getStore()));
        instance.setProductKey(template.getProductKey());
        instance.setProduct(com.commercetools.api.models.product.ProductReference.deepCopy(template.getProduct()));
        instance.setKey(template.getKey());
        instance.setOldKey(template.getOldKey());
        return instance;
    }

    /**
     * builder factory method for ProductTailoringKeySetMessagePayload
     * @return builder
     */
    public static ProductTailoringKeySetMessagePayloadBuilder builder() {
        return ProductTailoringKeySetMessagePayloadBuilder.of();
    }

    /**
     * create builder for ProductTailoringKeySetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProductTailoringKeySetMessagePayloadBuilder builder(
            final ProductTailoringKeySetMessagePayload template) {
        return ProductTailoringKeySetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProductTailoringKeySetMessagePayload(Function<ProductTailoringKeySetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<ProductTailoringKeySetMessagePayload> typeReference() {
        return new tools.jackson.core.type.TypeReference<ProductTailoringKeySetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ProductTailoringKeySetMessagePayload>";
            }
        };
    }
}
