
package com.commercetools.api.models.cart_discount;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountDraft cartDiscountDraft = CartDiscountDraft.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .value(valueBuilder -> valueBuilder)
 *             .cartPredicate("{cartPredicate}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountDraftBuilder implements Builder<CartDiscountDraft> {

    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private String key;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    private com.commercetools.api.models.cart_discount.CartDiscountValueDraft value;

    private String cartPredicate;

    @Nullable
    private com.commercetools.api.models.cart_discount.CartDiscountTarget target;

    @Nullable
    private String sortOrder;

    @Nullable
    private java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores;

    @Nullable
    private Boolean isActive;

    @Nullable
    private java.time.ZonedDateTime validFrom;

    @Nullable
    private java.time.ZonedDateTime validUntil;

    @Nullable
    private Boolean requiresDiscountCode;

    @Nullable
    private com.commercetools.api.models.cart_discount.StackingMode stackingMode;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @Nullable
    private com.commercetools.api.models.discount_group.DiscountGroupResourceIdentifier discountGroup;

    @Nullable
    private com.commercetools.api.models.recurring_order.RecurringOrderScopeDraft recurringOrderScope;

    /**
     *  <p>Name of the CartDiscount.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public CartDiscountDraftBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the CartDiscount.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public CartDiscountDraftBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the CartDiscount.</p>
     * @param name value to be set
     * @return Builder
     */

    public CartDiscountDraftBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>User-defined unique identifier for the CartDiscount.</p>
     * @param key value to be set
     * @return Builder
     */

    public CartDiscountDraftBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Description of the CartDiscount.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public CartDiscountDraftBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Description of the CartDiscount.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public CartDiscountDraftBuilder withDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Description of the CartDiscount.</p>
     * @param description value to be set
     * @return Builder
     */

    public CartDiscountDraftBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Effect of the CartDiscount on the <code>target</code>.</p>
     * @param value value to be set
     * @return Builder
     */

    public CartDiscountDraftBuilder value(
            final com.commercetools.api.models.cart_discount.CartDiscountValueDraft value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Effect of the CartDiscount on the <code>target</code>.</p>
     * @param builder function to build the value value
     * @return Builder
     */

    public CartDiscountDraftBuilder value(
            Function<com.commercetools.api.models.cart_discount.CartDiscountValueDraftBuilder, Builder<? extends com.commercetools.api.models.cart_discount.CartDiscountValueDraft>> builder) {
        this.value = builder.apply(com.commercetools.api.models.cart_discount.CartDiscountValueDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Valid <span>Cart Predicate</span>.</p>
     * @param cartPredicate value to be set
     * @return Builder
     */

    public CartDiscountDraftBuilder cartPredicate(final String cartPredicate) {
        this.cartPredicate = cartPredicate;
        return this;
    }

    /**
     *  <p>Segment of the Cart that will be discounted.</p>
     *  <p>Must not be set if the <code>value</code> is <code>giftLineItem</code>.</p>
     * @param target value to be set
     * @return Builder
     */

    public CartDiscountDraftBuilder target(
            @Nullable final com.commercetools.api.models.cart_discount.CartDiscountTarget target) {
        this.target = target;
        return this;
    }

    /**
     *  <p>Segment of the Cart that will be discounted.</p>
     *  <p>Must not be set if the <code>value</code> is <code>giftLineItem</code>.</p>
     * @param builder function to build the target value
     * @return Builder
     */

    public CartDiscountDraftBuilder target(
            Function<com.commercetools.api.models.cart_discount.CartDiscountTargetBuilder, Builder<? extends com.commercetools.api.models.cart_discount.CartDiscountTarget>> builder) {
        this.target = builder.apply(com.commercetools.api.models.cart_discount.CartDiscountTargetBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value between <code>0</code> and <code>1</code> that determines the order in which the CartDiscounts will be applied; a CartDiscount with a higher value will be prioritized.</p>
     *  <p>It must be unique among all CartDiscounts and DiscountGroups.</p>
     *  <p>If the CartDiscount is part of a DiscountGroup, it will use the sort order of the DiscountGroup.</p>
     * @param sortOrder value to be set
     * @return Builder
     */

    public CartDiscountDraftBuilder sortOrder(@Nullable final String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     *  <ul>
     *   <li>If defined, the Cart Discount applies on <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a> having a <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> matching any Store defined for this field.</li>
     *   <li>If not defined, the Cart Discount applies on all Carts, irrespective of a Store.</li>
     *  </ul>
     *  <p>If the referenced Stores exceed the <span>limit</span>, a <a href="https://docs.commercetools.com/apis/ctp:api:type:MaxStoreReferencesReachedError" rel="nofollow">MaxStoreReferencesReached</a> error is returned.</p>
     *  <p>If the referenced Stores exceed the <span>limit</span> for Cart Discounts that do not require a Discount Code, a <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreCartDiscountsLimitReachedError" rel="nofollow">StoreCartDiscountsLimitReached</a> error is returned.</p>
     * @param stores value to be set
     * @return Builder
     */

    public CartDiscountDraftBuilder stores(
            @Nullable final com.commercetools.api.models.store.StoreResourceIdentifier... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
        return this;
    }

    /**
     *  <ul>
     *   <li>If defined, the Cart Discount applies on <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a> having a <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> matching any Store defined for this field.</li>
     *   <li>If not defined, the Cart Discount applies on all Carts, irrespective of a Store.</li>
     *  </ul>
     *  <p>If the referenced Stores exceed the <span>limit</span>, a <a href="https://docs.commercetools.com/apis/ctp:api:type:MaxStoreReferencesReachedError" rel="nofollow">MaxStoreReferencesReached</a> error is returned.</p>
     *  <p>If the referenced Stores exceed the <span>limit</span> for Cart Discounts that do not require a Discount Code, a <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreCartDiscountsLimitReachedError" rel="nofollow">StoreCartDiscountsLimitReached</a> error is returned.</p>
     * @param stores value to be set
     * @return Builder
     */

    public CartDiscountDraftBuilder stores(
            @Nullable final java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores) {
        this.stores = stores;
        return this;
    }

    /**
     *  <ul>
     *   <li>If defined, the Cart Discount applies on <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a> having a <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> matching any Store defined for this field.</li>
     *   <li>If not defined, the Cart Discount applies on all Carts, irrespective of a Store.</li>
     *  </ul>
     *  <p>If the referenced Stores exceed the <span>limit</span>, a <a href="https://docs.commercetools.com/apis/ctp:api:type:MaxStoreReferencesReachedError" rel="nofollow">MaxStoreReferencesReached</a> error is returned.</p>
     *  <p>If the referenced Stores exceed the <span>limit</span> for Cart Discounts that do not require a Discount Code, a <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreCartDiscountsLimitReachedError" rel="nofollow">StoreCartDiscountsLimitReached</a> error is returned.</p>
     * @param stores value to be set
     * @return Builder
     */

    public CartDiscountDraftBuilder plusStores(
            @Nullable final com.commercetools.api.models.store.StoreResourceIdentifier... stores) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.addAll(Arrays.asList(stores));
        return this;
    }

    /**
     *  <ul>
     *   <li>If defined, the Cart Discount applies on <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a> having a <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> matching any Store defined for this field.</li>
     *   <li>If not defined, the Cart Discount applies on all Carts, irrespective of a Store.</li>
     *  </ul>
     *  <p>If the referenced Stores exceed the <span>limit</span>, a <a href="https://docs.commercetools.com/apis/ctp:api:type:MaxStoreReferencesReachedError" rel="nofollow">MaxStoreReferencesReached</a> error is returned.</p>
     *  <p>If the referenced Stores exceed the <span>limit</span> for Cart Discounts that do not require a Discount Code, a <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreCartDiscountsLimitReachedError" rel="nofollow">StoreCartDiscountsLimitReached</a> error is returned.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CartDiscountDraftBuilder plusStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build());
        return this;
    }

    /**
     *  <ul>
     *   <li>If defined, the Cart Discount applies on <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a> having a <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> matching any Store defined for this field.</li>
     *   <li>If not defined, the Cart Discount applies on all Carts, irrespective of a Store.</li>
     *  </ul>
     *  <p>If the referenced Stores exceed the <span>limit</span>, a <a href="https://docs.commercetools.com/apis/ctp:api:type:MaxStoreReferencesReachedError" rel="nofollow">MaxStoreReferencesReached</a> error is returned.</p>
     *  <p>If the referenced Stores exceed the <span>limit</span> for Cart Discounts that do not require a Discount Code, a <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreCartDiscountsLimitReachedError" rel="nofollow">StoreCartDiscountsLimitReached</a> error is returned.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CartDiscountDraftBuilder withStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        this.stores = new ArrayList<>();
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build());
        return this;
    }

    /**
     *  <ul>
     *   <li>If defined, the Cart Discount applies on <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a> having a <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> matching any Store defined for this field.</li>
     *   <li>If not defined, the Cart Discount applies on all Carts, irrespective of a Store.</li>
     *  </ul>
     *  <p>If the referenced Stores exceed the <span>limit</span>, a <a href="https://docs.commercetools.com/apis/ctp:api:type:MaxStoreReferencesReachedError" rel="nofollow">MaxStoreReferencesReached</a> error is returned.</p>
     *  <p>If the referenced Stores exceed the <span>limit</span> for Cart Discounts that do not require a Discount Code, a <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreCartDiscountsLimitReachedError" rel="nofollow">StoreCartDiscountsLimitReached</a> error is returned.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CartDiscountDraftBuilder addStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifier> builder) {
        return plusStores(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()));
    }

    /**
     *  <ul>
     *   <li>If defined, the Cart Discount applies on <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a> having a <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> matching any Store defined for this field.</li>
     *   <li>If not defined, the Cart Discount applies on all Carts, irrespective of a Store.</li>
     *  </ul>
     *  <p>If the referenced Stores exceed the <span>limit</span>, a <a href="https://docs.commercetools.com/apis/ctp:api:type:MaxStoreReferencesReachedError" rel="nofollow">MaxStoreReferencesReached</a> error is returned.</p>
     *  <p>If the referenced Stores exceed the <span>limit</span> for Cart Discounts that do not require a Discount Code, a <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreCartDiscountsLimitReachedError" rel="nofollow">StoreCartDiscountsLimitReached</a> error is returned.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CartDiscountDraftBuilder setStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifier> builder) {
        return stores(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()));
    }

    /**
     *  <p>Only active Discounts can be applied to the Cart. If the <span>limit</span> for active Cart Discounts is reached, a <a href="https://docs.commercetools.com/apis/ctp:api:type:MaxCartDiscountsReachedError" rel="nofollow">MaxCartDiscountsReached</a> error is returned.</p>
     * @param isActive value to be set
     * @return Builder
     */

    public CartDiscountDraftBuilder isActive(@Nullable final Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    /**
     *  <p>Date and time (UTC) from which the Discount is effective.</p>
     * @param validFrom value to be set
     * @return Builder
     */

    public CartDiscountDraftBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     *  <p>Date and time (UTC) until which the Discount is effective.</p>
     * @param validUntil value to be set
     * @return Builder
     */

    public CartDiscountDraftBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     *  <p>States whether the Discount can only be used in a connection with a <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">DiscountCode</a>.</p>
     * @param requiresDiscountCode value to be set
     * @return Builder
     */

    public CartDiscountDraftBuilder requiresDiscountCode(@Nullable final Boolean requiresDiscountCode) {
        this.requiresDiscountCode = requiresDiscountCode;
        return this;
    }

    /**
     *  <p>Specifies whether the application of this discount causes the following discounts to be ignored.</p>
     * @param stackingMode value to be set
     * @return Builder
     */

    public CartDiscountDraftBuilder stackingMode(
            @Nullable final com.commercetools.api.models.cart_discount.StackingMode stackingMode) {
        this.stackingMode = stackingMode;
        return this;
    }

    /**
     *  <p>Custom Fields of the CartDiscount.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public CartDiscountDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields of the CartDiscount.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public CartDiscountDraftBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields of the CartDiscount.</p>
     * @param custom value to be set
     * @return Builder
     */

    public CartDiscountDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Reference to a DiscountGroup that the CartDiscount must belong to.</p>
     * @param builder function to build the discountGroup value
     * @return Builder
     */

    public CartDiscountDraftBuilder discountGroup(
            Function<com.commercetools.api.models.discount_group.DiscountGroupResourceIdentifierBuilder, com.commercetools.api.models.discount_group.DiscountGroupResourceIdentifierBuilder> builder) {
        this.discountGroup = builder
                .apply(com.commercetools.api.models.discount_group.DiscountGroupResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Reference to a DiscountGroup that the CartDiscount must belong to.</p>
     * @param builder function to build the discountGroup value
     * @return Builder
     */

    public CartDiscountDraftBuilder withDiscountGroup(
            Function<com.commercetools.api.models.discount_group.DiscountGroupResourceIdentifierBuilder, com.commercetools.api.models.discount_group.DiscountGroupResourceIdentifier> builder) {
        this.discountGroup = builder
                .apply(com.commercetools.api.models.discount_group.DiscountGroupResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to a DiscountGroup that the CartDiscount must belong to.</p>
     * @param discountGroup value to be set
     * @return Builder
     */

    public CartDiscountDraftBuilder discountGroup(
            @Nullable final com.commercetools.api.models.discount_group.DiscountGroupResourceIdentifier discountGroup) {
        this.discountGroup = discountGroup;
        return this;
    }

    /**
     *  <p>Scope of the Cart Discount for Recurring Orders.</p>
     *  <p>If not set, the default is <a href="https://docs.commercetools.com/apis/ctp:api:type:NonRecurringOrdersOnlyDraft" rel="nofollow">NonRecurringOrdersOnlyDraft</a>.</p>
     * @param recurringOrderScope value to be set
     * @return Builder
     */

    public CartDiscountDraftBuilder recurringOrderScope(
            @Nullable final com.commercetools.api.models.recurring_order.RecurringOrderScopeDraft recurringOrderScope) {
        this.recurringOrderScope = recurringOrderScope;
        return this;
    }

    /**
     *  <p>Scope of the Cart Discount for Recurring Orders.</p>
     *  <p>If not set, the default is <a href="https://docs.commercetools.com/apis/ctp:api:type:NonRecurringOrdersOnlyDraft" rel="nofollow">NonRecurringOrdersOnlyDraft</a>.</p>
     * @param builder function to build the recurringOrderScope value
     * @return Builder
     */

    public CartDiscountDraftBuilder recurringOrderScope(
            Function<com.commercetools.api.models.recurring_order.RecurringOrderScopeDraftBuilder, Builder<? extends com.commercetools.api.models.recurring_order.RecurringOrderScopeDraft>> builder) {
        this.recurringOrderScope = builder
                .apply(com.commercetools.api.models.recurring_order.RecurringOrderScopeDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Name of the CartDiscount.</p>
     * @return name
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>User-defined unique identifier for the CartDiscount.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Description of the CartDiscount.</p>
     * @return description
     */

    @Nullable
    public com.commercetools.api.models.common.LocalizedString getDescription() {
        return this.description;
    }

    /**
     *  <p>Effect of the CartDiscount on the <code>target</code>.</p>
     * @return value
     */

    public com.commercetools.api.models.cart_discount.CartDiscountValueDraft getValue() {
        return this.value;
    }

    /**
     *  <p>Valid <span>Cart Predicate</span>.</p>
     * @return cartPredicate
     */

    public String getCartPredicate() {
        return this.cartPredicate;
    }

    /**
     *  <p>Segment of the Cart that will be discounted.</p>
     *  <p>Must not be set if the <code>value</code> is <code>giftLineItem</code>.</p>
     * @return target
     */

    @Nullable
    public com.commercetools.api.models.cart_discount.CartDiscountTarget getTarget() {
        return this.target;
    }

    /**
     *  <p>Value between <code>0</code> and <code>1</code> that determines the order in which the CartDiscounts will be applied; a CartDiscount with a higher value will be prioritized.</p>
     *  <p>It must be unique among all CartDiscounts and DiscountGroups.</p>
     *  <p>If the CartDiscount is part of a DiscountGroup, it will use the sort order of the DiscountGroup.</p>
     * @return sortOrder
     */

    @Nullable
    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     *  <ul>
     *   <li>If defined, the Cart Discount applies on <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a> having a <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> matching any Store defined for this field.</li>
     *   <li>If not defined, the Cart Discount applies on all Carts, irrespective of a Store.</li>
     *  </ul>
     *  <p>If the referenced Stores exceed the <span>limit</span>, a <a href="https://docs.commercetools.com/apis/ctp:api:type:MaxStoreReferencesReachedError" rel="nofollow">MaxStoreReferencesReached</a> error is returned.</p>
     *  <p>If the referenced Stores exceed the <span>limit</span> for Cart Discounts that do not require a Discount Code, a <a href="https://docs.commercetools.com/apis/ctp:api:type:StoreCartDiscountsLimitReachedError" rel="nofollow">StoreCartDiscountsLimitReached</a> error is returned.</p>
     * @return stores
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> getStores() {
        return this.stores;
    }

    /**
     *  <p>Only active Discounts can be applied to the Cart. If the <span>limit</span> for active Cart Discounts is reached, a <a href="https://docs.commercetools.com/apis/ctp:api:type:MaxCartDiscountsReachedError" rel="nofollow">MaxCartDiscountsReached</a> error is returned.</p>
     * @return isActive
     */

    @Nullable
    public Boolean getIsActive() {
        return this.isActive;
    }

    /**
     *  <p>Date and time (UTC) from which the Discount is effective.</p>
     * @return validFrom
     */

    @Nullable
    public java.time.ZonedDateTime getValidFrom() {
        return this.validFrom;
    }

    /**
     *  <p>Date and time (UTC) until which the Discount is effective.</p>
     * @return validUntil
     */

    @Nullable
    public java.time.ZonedDateTime getValidUntil() {
        return this.validUntil;
    }

    /**
     *  <p>States whether the Discount can only be used in a connection with a <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">DiscountCode</a>.</p>
     * @return requiresDiscountCode
     */

    @Nullable
    public Boolean getRequiresDiscountCode() {
        return this.requiresDiscountCode;
    }

    /**
     *  <p>Specifies whether the application of this discount causes the following discounts to be ignored.</p>
     * @return stackingMode
     */

    @Nullable
    public com.commercetools.api.models.cart_discount.StackingMode getStackingMode() {
        return this.stackingMode;
    }

    /**
     *  <p>Custom Fields of the CartDiscount.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     *  <p>Reference to a DiscountGroup that the CartDiscount must belong to.</p>
     * @return discountGroup
     */

    @Nullable
    public com.commercetools.api.models.discount_group.DiscountGroupResourceIdentifier getDiscountGroup() {
        return this.discountGroup;
    }

    /**
     *  <p>Scope of the Cart Discount for Recurring Orders.</p>
     *  <p>If not set, the default is <a href="https://docs.commercetools.com/apis/ctp:api:type:NonRecurringOrdersOnlyDraft" rel="nofollow">NonRecurringOrdersOnlyDraft</a>.</p>
     * @return recurringOrderScope
     */

    @Nullable
    public com.commercetools.api.models.recurring_order.RecurringOrderScopeDraft getRecurringOrderScope() {
        return this.recurringOrderScope;
    }

    /**
     * builds CartDiscountDraft with checking for non-null required values
     * @return CartDiscountDraft
     */
    public CartDiscountDraft build() {
        Objects.requireNonNull(name, CartDiscountDraft.class + ": name is missing");
        Objects.requireNonNull(value, CartDiscountDraft.class + ": value is missing");
        Objects.requireNonNull(cartPredicate, CartDiscountDraft.class + ": cartPredicate is missing");
        return new CartDiscountDraftImpl(name, key, description, value, cartPredicate, target, sortOrder, stores,
            isActive, validFrom, validUntil, requiresDiscountCode, stackingMode, custom, discountGroup,
            recurringOrderScope);
    }

    /**
     * builds CartDiscountDraft without checking for non-null required values
     * @return CartDiscountDraft
     */
    public CartDiscountDraft buildUnchecked() {
        return new CartDiscountDraftImpl(name, key, description, value, cartPredicate, target, sortOrder, stores,
            isActive, validFrom, validUntil, requiresDiscountCode, stackingMode, custom, discountGroup,
            recurringOrderScope);
    }

    /**
     * factory method for an instance of CartDiscountDraftBuilder
     * @return builder
     */
    public static CartDiscountDraftBuilder of() {
        return new CartDiscountDraftBuilder();
    }

    /**
     * create builder for CartDiscountDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountDraftBuilder of(final CartDiscountDraft template) {
        CartDiscountDraftBuilder builder = new CartDiscountDraftBuilder();
        builder.name = template.getName();
        builder.key = template.getKey();
        builder.description = template.getDescription();
        builder.value = template.getValue();
        builder.cartPredicate = template.getCartPredicate();
        builder.target = template.getTarget();
        builder.sortOrder = template.getSortOrder();
        builder.stores = template.getStores();
        builder.isActive = template.getIsActive();
        builder.validFrom = template.getValidFrom();
        builder.validUntil = template.getValidUntil();
        builder.requiresDiscountCode = template.getRequiresDiscountCode();
        builder.stackingMode = template.getStackingMode();
        builder.custom = template.getCustom();
        builder.discountGroup = template.getDiscountGroup();
        builder.recurringOrderScope = template.getRecurringOrderScope();
        return builder;
    }

}
