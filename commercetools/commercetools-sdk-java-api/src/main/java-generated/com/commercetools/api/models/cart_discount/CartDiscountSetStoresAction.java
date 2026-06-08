
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>If a referenced Store does not exist, a <a href="https://docs.commercetools.com/apis/ctp:api:type:ReferencedResourceNotFoundError" rel="nofollow">ReferencedResourceNotFound</a> error is returned.</p>
 *  <p>This action generates a <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountStoresSetMessage" rel="nofollow">CartDiscountStoresSet</a> Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountSetStoresAction cartDiscountSetStoresAction = CartDiscountSetStoresAction.builder()
 *             .plusStores(storesBuilder -> storesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setStores")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountSetStoresActionImpl.class)
public interface CartDiscountSetStoresAction extends CartDiscountUpdateAction {

    /**
     * discriminator value for CartDiscountSetStoresAction
     */
    String SET_STORES = "setStores";

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> to set. Overrides the current list of Stores. If empty, any existing values will be removed.</p>
     *  <p>A failed update can return the following errors:</p>
     *  <ul>
     *   <li>If the referenced Stores exceed the <span>limit</span>, a <a href="https://docs.commercetools.com/apis/ctp:api:type:MaxStoreReferencesReachedError" rel="nofollow">MaxStoreReferencesReached</a> error is returned.</li>
     *   <li>If the referenced Stores exceed the <span>limit</span> for Cart Discounts that do not require a Discount Code, a <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreCartDiscountsLimitReachedError" rel="nofollow">StoreCartDiscountsLimitReached</a> error is returned.</li>
     *  </ul>
     * @return stores
     */
    @NotNull
    @Valid
    @JsonProperty("stores")
    public List<StoreResourceIdentifier> getStores();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> to set. Overrides the current list of Stores. If empty, any existing values will be removed.</p>
     *  <p>A failed update can return the following errors:</p>
     *  <ul>
     *   <li>If the referenced Stores exceed the <span>limit</span>, a <a href="https://docs.commercetools.com/apis/ctp:api:type:MaxStoreReferencesReachedError" rel="nofollow">MaxStoreReferencesReached</a> error is returned.</li>
     *   <li>If the referenced Stores exceed the <span>limit</span> for Cart Discounts that do not require a Discount Code, a <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreCartDiscountsLimitReachedError" rel="nofollow">StoreCartDiscountsLimitReached</a> error is returned.</li>
     *  </ul>
     * @param stores values to be set
     */

    @JsonIgnore
    public void setStores(final StoreResourceIdentifier... stores);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> to set. Overrides the current list of Stores. If empty, any existing values will be removed.</p>
     *  <p>A failed update can return the following errors:</p>
     *  <ul>
     *   <li>If the referenced Stores exceed the <span>limit</span>, a <a href="https://docs.commercetools.com/apis/ctp:api:type:MaxStoreReferencesReachedError" rel="nofollow">MaxStoreReferencesReached</a> error is returned.</li>
     *   <li>If the referenced Stores exceed the <span>limit</span> for Cart Discounts that do not require a Discount Code, a <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreCartDiscountsLimitReachedError" rel="nofollow">StoreCartDiscountsLimitReached</a> error is returned.</li>
     *  </ul>
     * @param stores values to be set
     */

    public void setStores(final List<StoreResourceIdentifier> stores);

    /**
     * factory method
     * @return instance of CartDiscountSetStoresAction
     */
    public static CartDiscountSetStoresAction of() {
        return new CartDiscountSetStoresActionImpl();
    }

    /**
     * factory method to create a shallow copy CartDiscountSetStoresAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountSetStoresAction of(final CartDiscountSetStoresAction template) {
        CartDiscountSetStoresActionImpl instance = new CartDiscountSetStoresActionImpl();
        instance.setStores(template.getStores());
        return instance;
    }

    public CartDiscountSetStoresAction copyDeep();

    /**
     * factory method to create a deep copy of CartDiscountSetStoresAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountSetStoresAction deepCopy(@Nullable final CartDiscountSetStoresAction template) {
        if (template == null) {
            return null;
        }
        CartDiscountSetStoresActionImpl instance = new CartDiscountSetStoresActionImpl();
        instance.setStores(Optional.ofNullable(template.getStores())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.store.StoreResourceIdentifier::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for CartDiscountSetStoresAction
     * @return builder
     */
    public static CartDiscountSetStoresActionBuilder builder() {
        return CartDiscountSetStoresActionBuilder.of();
    }

    /**
     * create builder for CartDiscountSetStoresAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountSetStoresActionBuilder builder(final CartDiscountSetStoresAction template) {
        return CartDiscountSetStoresActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountSetStoresAction(Function<CartDiscountSetStoresAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountSetStoresAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountSetStoresAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountSetStoresAction>";
            }
        };
    }
}
