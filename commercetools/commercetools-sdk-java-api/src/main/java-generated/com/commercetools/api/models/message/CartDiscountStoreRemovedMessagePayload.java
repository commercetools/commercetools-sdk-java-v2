
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.store.StoreKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Remove Store update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountStoreRemovedMessagePayload cartDiscountStoreRemovedMessagePayload = CartDiscountStoreRemovedMessagePayload.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CartDiscountStoreRemoved")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountStoreRemovedMessagePayloadImpl.class)
public interface CartDiscountStoreRemovedMessagePayload extends MessagePayload {

    /**
     * discriminator value for CartDiscountStoreRemovedMessagePayload
     */
    String CART_DISCOUNT_STORE_REMOVED = "CartDiscountStoreRemoved";

    /**
     *  <p>The Store that was removed from the Cart Discount.</p>
     * @return store
     */
    @NotNull
    @Valid
    @JsonProperty("store")
    public StoreKeyReference getStore();

    /**
     *  <p>The Store that was removed from the Cart Discount.</p>
     * @param store value to be set
     */

    public void setStore(final StoreKeyReference store);

    /**
     * factory method
     * @return instance of CartDiscountStoreRemovedMessagePayload
     */
    public static CartDiscountStoreRemovedMessagePayload of() {
        return new CartDiscountStoreRemovedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CartDiscountStoreRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountStoreRemovedMessagePayload of(final CartDiscountStoreRemovedMessagePayload template) {
        CartDiscountStoreRemovedMessagePayloadImpl instance = new CartDiscountStoreRemovedMessagePayloadImpl();
        instance.setStore(template.getStore());
        return instance;
    }

    public CartDiscountStoreRemovedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of CartDiscountStoreRemovedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountStoreRemovedMessagePayload deepCopy(
            @Nullable final CartDiscountStoreRemovedMessagePayload template) {
        if (template == null) {
            return null;
        }
        CartDiscountStoreRemovedMessagePayloadImpl instance = new CartDiscountStoreRemovedMessagePayloadImpl();
        instance.setStore(com.commercetools.api.models.store.StoreKeyReference.deepCopy(template.getStore()));
        return instance;
    }

    /**
     * builder factory method for CartDiscountStoreRemovedMessagePayload
     * @return builder
     */
    public static CartDiscountStoreRemovedMessagePayloadBuilder builder() {
        return CartDiscountStoreRemovedMessagePayloadBuilder.of();
    }

    /**
     * create builder for CartDiscountStoreRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountStoreRemovedMessagePayloadBuilder builder(
            final CartDiscountStoreRemovedMessagePayload template) {
        return CartDiscountStoreRemovedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountStoreRemovedMessagePayload(
            Function<CartDiscountStoreRemovedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountStoreRemovedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountStoreRemovedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountStoreRemovedMessagePayload>";
            }
        };
    }
}
