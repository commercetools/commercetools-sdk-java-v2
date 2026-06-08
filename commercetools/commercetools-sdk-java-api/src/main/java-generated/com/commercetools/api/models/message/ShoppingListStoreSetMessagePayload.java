
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
 * ShoppingListStoreSetMessagePayload
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListStoreSetMessagePayload shoppingListStoreSetMessagePayload = ShoppingListStoreSetMessagePayload.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("ShoppingListStoreSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShoppingListStoreSetMessagePayloadImpl.class)
public interface ShoppingListStoreSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for ShoppingListStoreSetMessagePayload
     */
    String SHOPPING_LIST_STORE_SET = "ShoppingListStoreSet";

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:KeyReference" rel="nofollow">KeyReference</a> to a <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>.</p>
     * @return store
     */
    @NotNull
    @Valid
    @JsonProperty("store")
    public StoreKeyReference getStore();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:KeyReference" rel="nofollow">KeyReference</a> to a <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a>.</p>
     * @param store value to be set
     */

    public void setStore(final StoreKeyReference store);

    /**
     * factory method
     * @return instance of ShoppingListStoreSetMessagePayload
     */
    public static ShoppingListStoreSetMessagePayload of() {
        return new ShoppingListStoreSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy ShoppingListStoreSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShoppingListStoreSetMessagePayload of(final ShoppingListStoreSetMessagePayload template) {
        ShoppingListStoreSetMessagePayloadImpl instance = new ShoppingListStoreSetMessagePayloadImpl();
        instance.setStore(template.getStore());
        return instance;
    }

    public ShoppingListStoreSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of ShoppingListStoreSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShoppingListStoreSetMessagePayload deepCopy(
            @Nullable final ShoppingListStoreSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        ShoppingListStoreSetMessagePayloadImpl instance = new ShoppingListStoreSetMessagePayloadImpl();
        instance.setStore(com.commercetools.api.models.store.StoreKeyReference.deepCopy(template.getStore()));
        return instance;
    }

    /**
     * builder factory method for ShoppingListStoreSetMessagePayload
     * @return builder
     */
    public static ShoppingListStoreSetMessagePayloadBuilder builder() {
        return ShoppingListStoreSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for ShoppingListStoreSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListStoreSetMessagePayloadBuilder builder(final ShoppingListStoreSetMessagePayload template) {
        return ShoppingListStoreSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShoppingListStoreSetMessagePayload(Function<ShoppingListStoreSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListStoreSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListStoreSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListStoreSetMessagePayload>";
            }
        };
    }
}
