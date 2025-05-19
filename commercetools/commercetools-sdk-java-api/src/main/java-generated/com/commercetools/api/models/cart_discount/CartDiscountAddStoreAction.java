
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
 *  <p>This action generates a CartDiscountStoreAdded Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountAddStoreAction cartDiscountAddStoreAction = CartDiscountAddStoreAction.builder()
 *             .store(storeBuilder -> storeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("addStore")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountAddStoreActionImpl.class)
public interface CartDiscountAddStoreAction extends CartDiscountUpdateAction {

    /**
     * discriminator value for CartDiscountAddStoreAction
     */
    String ADD_STORE = "addStore";

    /**
     *  <p>Store to add.</p>
     *  <p>A failed update can return the following errors:</p>
     *  <ul>
     *   <li>If the referenced Stores exceed the limit, a MaxStoreReferencesReached error is returned.</li>
     *   <li>If the referenced Stores exceed the limit for Cart Discounts that do not require a Discount Code, a StoreCartDiscountsLimitReached error is returned.</li>
     *  </ul>
     * @return store
     */
    @NotNull
    @Valid
    @JsonProperty("store")
    public StoreResourceIdentifier getStore();

    /**
     *  <p>Store to add.</p>
     *  <p>A failed update can return the following errors:</p>
     *  <ul>
     *   <li>If the referenced Stores exceed the limit, a MaxStoreReferencesReached error is returned.</li>
     *   <li>If the referenced Stores exceed the limit for Cart Discounts that do not require a Discount Code, a StoreCartDiscountsLimitReached error is returned.</li>
     *  </ul>
     * @param store value to be set
     */

    public void setStore(final StoreResourceIdentifier store);

    /**
     * factory method
     * @return instance of CartDiscountAddStoreAction
     */
    public static CartDiscountAddStoreAction of() {
        return new CartDiscountAddStoreActionImpl();
    }

    /**
     * factory method to create a shallow copy CartDiscountAddStoreAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountAddStoreAction of(final CartDiscountAddStoreAction template) {
        CartDiscountAddStoreActionImpl instance = new CartDiscountAddStoreActionImpl();
        instance.setStore(template.getStore());
        return instance;
    }

    public CartDiscountAddStoreAction copyDeep();

    /**
     * factory method to create a deep copy of CartDiscountAddStoreAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountAddStoreAction deepCopy(@Nullable final CartDiscountAddStoreAction template) {
        if (template == null) {
            return null;
        }
        CartDiscountAddStoreActionImpl instance = new CartDiscountAddStoreActionImpl();
        instance.setStore(com.commercetools.api.models.store.StoreResourceIdentifier.deepCopy(template.getStore()));
        return instance;
    }

    /**
     * builder factory method for CartDiscountAddStoreAction
     * @return builder
     */
    public static CartDiscountAddStoreActionBuilder builder() {
        return CartDiscountAddStoreActionBuilder.of();
    }

    /**
     * create builder for CartDiscountAddStoreAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountAddStoreActionBuilder builder(final CartDiscountAddStoreAction template) {
        return CartDiscountAddStoreActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountAddStoreAction(Function<CartDiscountAddStoreAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountAddStoreAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountAddStoreAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountAddStoreAction>";
            }
        };
    }
}
