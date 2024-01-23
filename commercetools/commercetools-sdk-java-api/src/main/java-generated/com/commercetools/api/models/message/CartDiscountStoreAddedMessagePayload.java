
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.store.StoreKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Add Store update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountStoreAddedMessagePayload cartDiscountStoreAddedMessagePayload = CartDiscountStoreAddedMessagePayload.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountStoreAddedMessagePayloadImpl.class)
public interface CartDiscountStoreAddedMessagePayload extends MessagePayload {

    /**
     * discriminator value for CartDiscountStoreAddedMessagePayload
     */
    String CART_DISCOUNT_STORE_ADDED = "CartDiscountStoreAdded";

    /**
     *  <p>The Store that was added to the Cart Discount.</p>
     * @return store
     */
    @NotNull
    @Valid
    @JsonProperty("store")
    public StoreKeyReference getStore();

    /**
     *  <p>The Store that was added to the Cart Discount.</p>
     * @param store value to be set
     */

    public void setStore(final StoreKeyReference store);

    /**
     * factory method
     * @return instance of CartDiscountStoreAddedMessagePayload
     */
    public static CartDiscountStoreAddedMessagePayload of() {
        return new CartDiscountStoreAddedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CartDiscountStoreAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountStoreAddedMessagePayload of(final CartDiscountStoreAddedMessagePayload template) {
        CartDiscountStoreAddedMessagePayloadImpl instance = new CartDiscountStoreAddedMessagePayloadImpl();
        instance.setStore(template.getStore());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartDiscountStoreAddedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountStoreAddedMessagePayload deepCopy(
            @Nullable final CartDiscountStoreAddedMessagePayload template) {
        if (template == null) {
            return null;
        }
        CartDiscountStoreAddedMessagePayloadImpl instance = new CartDiscountStoreAddedMessagePayloadImpl();
        instance.setStore(com.commercetools.api.models.store.StoreKeyReference.deepCopy(template.getStore()));
        return instance;
    }

    /**
     * builder factory method for CartDiscountStoreAddedMessagePayload
     * @return builder
     */
    public static CartDiscountStoreAddedMessagePayloadBuilder builder() {
        return CartDiscountStoreAddedMessagePayloadBuilder.of();
    }

    /**
     * create builder for CartDiscountStoreAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountStoreAddedMessagePayloadBuilder builder(
            final CartDiscountStoreAddedMessagePayload template) {
        return CartDiscountStoreAddedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountStoreAddedMessagePayload(Function<CartDiscountStoreAddedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountStoreAddedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountStoreAddedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountStoreAddedMessagePayload>";
            }
        };
    }
}
