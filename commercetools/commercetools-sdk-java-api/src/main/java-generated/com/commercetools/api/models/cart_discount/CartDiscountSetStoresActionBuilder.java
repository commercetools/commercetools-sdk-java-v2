
package com.commercetools.api.models.cart_discount;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountSetStoresActionBuilder
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountSetStoresActionBuilder implements Builder<CartDiscountSetStoresAction> {

    private java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores;

    /**
     *  <p>Stores to set. Overrides the current list of Stores. If empty, any existing values will be removed.</p>
     *  <p>A failed update can return the following errors:</p>
     *  <ul>
     *   <li>If the referenced Stores exceed the limit, a MaxStoreReferencesReached error is returned.</li>
     *   <li>If the referenced Stores exceed the limit for Cart Discounts that do not require a Discount Code, a StoreCartDiscountsLimitReached error is returned.</li>
     *  </ul>
     * @param stores value to be set
     * @return Builder
     */

    public CartDiscountSetStoresActionBuilder stores(
            final com.commercetools.api.models.store.StoreResourceIdentifier... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>Stores to set. Overrides the current list of Stores. If empty, any existing values will be removed.</p>
     *  <p>A failed update can return the following errors:</p>
     *  <ul>
     *   <li>If the referenced Stores exceed the limit, a MaxStoreReferencesReached error is returned.</li>
     *   <li>If the referenced Stores exceed the limit for Cart Discounts that do not require a Discount Code, a StoreCartDiscountsLimitReached error is returned.</li>
     *  </ul>
     * @param stores value to be set
     * @return Builder
     */

    public CartDiscountSetStoresActionBuilder stores(
            final java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores) {
        this.stores = stores;
        return this;
    }

    /**
     *  <p>Stores to set. Overrides the current list of Stores. If empty, any existing values will be removed.</p>
     *  <p>A failed update can return the following errors:</p>
     *  <ul>
     *   <li>If the referenced Stores exceed the limit, a MaxStoreReferencesReached error is returned.</li>
     *   <li>If the referenced Stores exceed the limit for Cart Discounts that do not require a Discount Code, a StoreCartDiscountsLimitReached error is returned.</li>
     *  </ul>
     * @param stores value to be set
     * @return Builder
     */

    public CartDiscountSetStoresActionBuilder plusStores(
            final com.commercetools.api.models.store.StoreResourceIdentifier... stores) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.addAll(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>Stores to set. Overrides the current list of Stores. If empty, any existing values will be removed.</p>
     *  <p>A failed update can return the following errors:</p>
     *  <ul>
     *   <li>If the referenced Stores exceed the limit, a MaxStoreReferencesReached error is returned.</li>
     *   <li>If the referenced Stores exceed the limit for Cart Discounts that do not require a Discount Code, a StoreCartDiscountsLimitReached error is returned.</li>
     *  </ul>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CartDiscountSetStoresActionBuilder plusStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Stores to set. Overrides the current list of Stores. If empty, any existing values will be removed.</p>
     *  <p>A failed update can return the following errors:</p>
     *  <ul>
     *   <li>If the referenced Stores exceed the limit, a MaxStoreReferencesReached error is returned.</li>
     *   <li>If the referenced Stores exceed the limit for Cart Discounts that do not require a Discount Code, a StoreCartDiscountsLimitReached error is returned.</li>
     *  </ul>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CartDiscountSetStoresActionBuilder withStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        this.stores = new ArrayList<>();
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Stores to set. Overrides the current list of Stores. If empty, any existing values will be removed.</p>
     *  <p>A failed update can return the following errors:</p>
     *  <ul>
     *   <li>If the referenced Stores exceed the limit, a MaxStoreReferencesReached error is returned.</li>
     *   <li>If the referenced Stores exceed the limit for Cart Discounts that do not require a Discount Code, a StoreCartDiscountsLimitReached error is returned.</li>
     *  </ul>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CartDiscountSetStoresActionBuilder addStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifier> builder) {
        return plusStores(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()));
    }

    /**
     *  <p>Stores to set. Overrides the current list of Stores. If empty, any existing values will be removed.</p>
     *  <p>A failed update can return the following errors:</p>
     *  <ul>
     *   <li>If the referenced Stores exceed the limit, a MaxStoreReferencesReached error is returned.</li>
     *   <li>If the referenced Stores exceed the limit for Cart Discounts that do not require a Discount Code, a StoreCartDiscountsLimitReached error is returned.</li>
     *  </ul>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CartDiscountSetStoresActionBuilder setStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifier> builder) {
        return stores(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()));
    }

    /**
     *  <p>Stores to set. Overrides the current list of Stores. If empty, any existing values will be removed.</p>
     *  <p>A failed update can return the following errors:</p>
     *  <ul>
     *   <li>If the referenced Stores exceed the limit, a MaxStoreReferencesReached error is returned.</li>
     *   <li>If the referenced Stores exceed the limit for Cart Discounts that do not require a Discount Code, a StoreCartDiscountsLimitReached error is returned.</li>
     *  </ul>
     * @return stores
     */

    public java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> getStores() {
        return this.stores;
    }

    /**
     * builds CartDiscountSetStoresAction with checking for non-null required values
     * @return CartDiscountSetStoresAction
     */
    public CartDiscountSetStoresAction build() {
        Objects.requireNonNull(stores, CartDiscountSetStoresAction.class + ": stores is missing");
        return new CartDiscountSetStoresActionImpl(stores);
    }

    /**
     * builds CartDiscountSetStoresAction without checking for non-null required values
     * @return CartDiscountSetStoresAction
     */
    public CartDiscountSetStoresAction buildUnchecked() {
        return new CartDiscountSetStoresActionImpl(stores);
    }

    /**
     * factory method for an instance of CartDiscountSetStoresActionBuilder
     * @return builder
     */
    public static CartDiscountSetStoresActionBuilder of() {
        return new CartDiscountSetStoresActionBuilder();
    }

    /**
     * create builder for CartDiscountSetStoresAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountSetStoresActionBuilder of(final CartDiscountSetStoresAction template) {
        CartDiscountSetStoresActionBuilder builder = new CartDiscountSetStoresActionBuilder();
        builder.stores = template.getStores();
        return builder;
    }

}
