
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>If a referenced Store does not exist, a ReferencedResourceNotFound error is returned.</p>
 *  <p>This action generates a CartDiscountStoreRemoved Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountRemoveStoreAction cartDiscountRemoveStoreAction = CartDiscountRemoveStoreAction.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountRemoveStoreActionImpl.class)
public interface CartDiscountRemoveStoreAction extends CartDiscountUpdateAction {

    /**
     * discriminator value for CartDiscountRemoveStoreAction
     */
    String REMOVE_STORE = "removeStore";

    /**
     *  <p>Store to remove.</p>
     * @return store
     */
    @NotNull
    @Valid
    @JsonProperty("store")
    public StoreResourceIdentifier getStore();

    /**
     *  <p>Store to remove.</p>
     * @param store value to be set
     */

    public void setStore(final StoreResourceIdentifier store);

    /**
     * factory method
     * @return instance of CartDiscountRemoveStoreAction
     */
    public static CartDiscountRemoveStoreAction of() {
        return new CartDiscountRemoveStoreActionImpl();
    }

    /**
     * factory method to create a shallow copy CartDiscountRemoveStoreAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountRemoveStoreAction of(final CartDiscountRemoveStoreAction template) {
        CartDiscountRemoveStoreActionImpl instance = new CartDiscountRemoveStoreActionImpl();
        instance.setStore(template.getStore());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartDiscountRemoveStoreAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountRemoveStoreAction deepCopy(@Nullable final CartDiscountRemoveStoreAction template) {
        if (template == null) {
            return null;
        }
        CartDiscountRemoveStoreActionImpl instance = new CartDiscountRemoveStoreActionImpl();
        instance.setStore(com.commercetools.api.models.store.StoreResourceIdentifier.deepCopy(template.getStore()));
        return instance;
    }

    /**
     * builder factory method for CartDiscountRemoveStoreAction
     * @return builder
     */
    public static CartDiscountRemoveStoreActionBuilder builder() {
        return CartDiscountRemoveStoreActionBuilder.of();
    }

    /**
     * create builder for CartDiscountRemoveStoreAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountRemoveStoreActionBuilder builder(final CartDiscountRemoveStoreAction template) {
        return CartDiscountRemoveStoreActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountRemoveStoreAction(Function<CartDiscountRemoveStoreAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountRemoveStoreAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountRemoveStoreAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountRemoveStoreAction>";
            }
        };
    }
}
