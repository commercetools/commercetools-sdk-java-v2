
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.store.StoreKeyReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Set Stores update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountStoresSetMessagePayload cartDiscountStoresSetMessagePayload = CartDiscountStoresSetMessagePayload.builder()
 *             .plusStores(storesBuilder -> storesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CartDiscountStoresSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountStoresSetMessagePayloadImpl.class)
public interface CartDiscountStoresSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for CartDiscountStoresSetMessagePayload
     */
    String CART_DISCOUNT_STORES_SET = "CartDiscountStoresSet";

    /**
     *  <p>Stores of the Cart Discount after the Set Stores update action.</p>
     * @return stores
     */
    @NotNull
    @Valid
    @JsonProperty("stores")
    public List<StoreKeyReference> getStores();

    /**
     *  <p>Stores of the Cart Discount after the Set Stores update action.</p>
     * @param stores values to be set
     */

    @JsonIgnore
    public void setStores(final StoreKeyReference... stores);

    /**
     *  <p>Stores of the Cart Discount after the Set Stores update action.</p>
     * @param stores values to be set
     */

    public void setStores(final List<StoreKeyReference> stores);

    /**
     * factory method
     * @return instance of CartDiscountStoresSetMessagePayload
     */
    public static CartDiscountStoresSetMessagePayload of() {
        return new CartDiscountStoresSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CartDiscountStoresSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountStoresSetMessagePayload of(final CartDiscountStoresSetMessagePayload template) {
        CartDiscountStoresSetMessagePayloadImpl instance = new CartDiscountStoresSetMessagePayloadImpl();
        instance.setStores(template.getStores());
        return instance;
    }

    public CartDiscountStoresSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of CartDiscountStoresSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountStoresSetMessagePayload deepCopy(
            @Nullable final CartDiscountStoresSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        CartDiscountStoresSetMessagePayloadImpl instance = new CartDiscountStoresSetMessagePayloadImpl();
        instance.setStores(Optional.ofNullable(template.getStores())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.store.StoreKeyReference::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for CartDiscountStoresSetMessagePayload
     * @return builder
     */
    public static CartDiscountStoresSetMessagePayloadBuilder builder() {
        return CartDiscountStoresSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for CartDiscountStoresSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountStoresSetMessagePayloadBuilder builder(
            final CartDiscountStoresSetMessagePayload template) {
        return CartDiscountStoresSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountStoresSetMessagePayload(Function<CartDiscountStoresSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountStoresSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountStoresSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountStoresSetMessagePayload>";
            }
        };
    }
}
