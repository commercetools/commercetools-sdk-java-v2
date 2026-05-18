
package com.commercetools.api.models.cart_discount;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscount cartDiscount = CartDiscount.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .name(nameBuilder -> nameBuilder)
 *             .value(valueBuilder -> valueBuilder)
 *             .cartPredicate("{cartPredicate}")
 *             .sortOrder("{sortOrder}")
 *             .plusStores(storesBuilder -> storesBuilder)
 *             .isActive(true)
 *             .requiresDiscountCode(true)
 *             .plusReferences(referencesBuilder -> referencesBuilder)
 *             .stackingMode(StackingMode.STACKING)
 *             .recurringOrderScope(recurringOrderScopeBuilder -> recurringOrderScopeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountBuilder implements Builder<CartDiscount> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    private com.commercetools.api.models.common.LocalizedString name;

    @Nullable
    private String key;

    @Nullable
    private com.commercetools.api.models.common.LocalizedString description;

    private com.commercetools.api.models.cart_discount.CartDiscountValue value;

    private String cartPredicate;

    @Nullable
    private com.commercetools.api.models.cart_discount.CartDiscountTarget target;

    private String sortOrder;

    private java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores;

    private Boolean isActive;

    @Nullable
    private java.time.ZonedDateTime validFrom;

    @Nullable
    private java.time.ZonedDateTime validUntil;

    private Boolean requiresDiscountCode;

    private java.util.List<com.commercetools.api.models.common.Reference> references;

    private com.commercetools.api.models.cart_discount.StackingMode stackingMode;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    @Nullable
    private com.commercetools.api.models.discount_group.DiscountGroupReference discountGroup;

    private com.commercetools.api.models.recurring_order.RecurringOrderScope recurringOrderScope;

    /**
     *  <p>Unique identifier of the CartDiscount.</p>
     * @param id value to be set
     * @return Builder
     */

    public CartDiscountBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the CartDiscount.</p>
     * @param version value to be set
     * @return Builder
     */

    public CartDiscountBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the CartDiscount was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public CartDiscountBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the CartDiscount was last updated.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public CartDiscountBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>IDs and references that last modified the CartDiscount.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public CartDiscountBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that last modified the CartDiscount.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public CartDiscountBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that last modified the CartDiscount.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public CartDiscountBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>IDs and references that created the CartDiscount.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public CartDiscountBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that created the CartDiscount.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public CartDiscountBuilder withCreatedBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that created the CartDiscount.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public CartDiscountBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Name of the CartDiscount.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public CartDiscountBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Name of the CartDiscount.</p>
     * @param builder function to build the name value
     * @return Builder
     */

    public CartDiscountBuilder withName(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Name of the CartDiscount.</p>
     * @param name value to be set
     * @return Builder
     */

    public CartDiscountBuilder name(final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the CartDiscount.</p>
     * @param key value to be set
     * @return Builder
     */

    public CartDiscountBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Description of the CartDiscount.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public CartDiscountBuilder description(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Description of the CartDiscount.</p>
     * @param builder function to build the description value
     * @return Builder
     */

    public CartDiscountBuilder withDescription(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedString> builder) {
        this.description = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of());
        return this;
    }

    /**
     *  <p>Description of the CartDiscount.</p>
     * @param description value to be set
     * @return Builder
     */

    public CartDiscountBuilder description(
            @Nullable final com.commercetools.api.models.common.LocalizedString description) {
        this.description = description;
        return this;
    }

    /**
     *  <p>Effect of the CartDiscount on the <code>target</code>.</p>
     * @param value value to be set
     * @return Builder
     */

    public CartDiscountBuilder value(final com.commercetools.api.models.cart_discount.CartDiscountValue value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Effect of the CartDiscount on the <code>target</code>.</p>
     * @param builder function to build the value value
     * @return Builder
     */

    public CartDiscountBuilder value(
            Function<com.commercetools.api.models.cart_discount.CartDiscountValueBuilder, Builder<? extends com.commercetools.api.models.cart_discount.CartDiscountValue>> builder) {
        this.value = builder.apply(com.commercetools.api.models.cart_discount.CartDiscountValueBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Valid <span>Cart Predicate</span>.</p>
     * @param cartPredicate value to be set
     * @return Builder
     */

    public CartDiscountBuilder cartPredicate(final String cartPredicate) {
        this.cartPredicate = cartPredicate;
        return this;
    }

    /**
     *  <p>Segment of the Cart that is discounted.</p>
     *  <p>Empty, if the <code>value</code> is <code>giftLineItem</code>.</p>
     * @param target value to be set
     * @return Builder
     */

    public CartDiscountBuilder target(
            @Nullable final com.commercetools.api.models.cart_discount.CartDiscountTarget target) {
        this.target = target;
        return this;
    }

    /**
     *  <p>Segment of the Cart that is discounted.</p>
     *  <p>Empty, if the <code>value</code> is <code>giftLineItem</code>.</p>
     * @param builder function to build the target value
     * @return Builder
     */

    public CartDiscountBuilder target(
            Function<com.commercetools.api.models.cart_discount.CartDiscountTargetBuilder, Builder<? extends com.commercetools.api.models.cart_discount.CartDiscountTarget>> builder) {
        this.target = builder.apply(com.commercetools.api.models.cart_discount.CartDiscountTargetBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Value between <code>0</code> and <code>1</code> that determines the order in which the CartDiscounts are applied; a CartDiscount with a higher value is prioritized.</p>
     *  <p>It is unique among all CartDiscounts and DiscountGroups.</p>
     *  <p>If the CartDiscount is part of a DiscountGroup, it uses the sort order of the DiscountGroup.</p>
     * @param sortOrder value to be set
     * @return Builder
     */

    public CartDiscountBuilder sortOrder(final String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     *  <ul>
     *   <li>If a value exists, the Cart Discount applies on <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a> having a <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> matching any Store defined for this field.</li>
     *   <li>If empty, the Cart Discount applies on all <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, irrespective of a Store.</li>
     *  </ul>
     * @param stores value to be set
     * @return Builder
     */

    public CartDiscountBuilder stores(final com.commercetools.api.models.store.StoreKeyReference... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
        return this;
    }

    /**
     *  <ul>
     *   <li>If a value exists, the Cart Discount applies on <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a> having a <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> matching any Store defined for this field.</li>
     *   <li>If empty, the Cart Discount applies on all <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, irrespective of a Store.</li>
     *  </ul>
     * @param stores value to be set
     * @return Builder
     */

    public CartDiscountBuilder stores(
            final java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores) {
        this.stores = stores;
        return this;
    }

    /**
     *  <ul>
     *   <li>If a value exists, the Cart Discount applies on <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a> having a <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> matching any Store defined for this field.</li>
     *   <li>If empty, the Cart Discount applies on all <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, irrespective of a Store.</li>
     *  </ul>
     * @param stores value to be set
     * @return Builder
     */

    public CartDiscountBuilder plusStores(final com.commercetools.api.models.store.StoreKeyReference... stores) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.addAll(Arrays.asList(stores));
        return this;
    }

    /**
     *  <ul>
     *   <li>If a value exists, the Cart Discount applies on <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a> having a <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> matching any Store defined for this field.</li>
     *   <li>If empty, the Cart Discount applies on all <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, irrespective of a Store.</li>
     *  </ul>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CartDiscountBuilder plusStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <ul>
     *   <li>If a value exists, the Cart Discount applies on <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a> having a <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> matching any Store defined for this field.</li>
     *   <li>If empty, the Cart Discount applies on all <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, irrespective of a Store.</li>
     *  </ul>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CartDiscountBuilder withStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.stores = new ArrayList<>();
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <ul>
     *   <li>If a value exists, the Cart Discount applies on <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a> having a <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> matching any Store defined for this field.</li>
     *   <li>If empty, the Cart Discount applies on all <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, irrespective of a Store.</li>
     *  </ul>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CartDiscountBuilder addStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReference> builder) {
        return plusStores(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()));
    }

    /**
     *  <ul>
     *   <li>If a value exists, the Cart Discount applies on <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a> having a <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> matching any Store defined for this field.</li>
     *   <li>If empty, the Cart Discount applies on all <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, irrespective of a Store.</li>
     *  </ul>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CartDiscountBuilder setStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReference> builder) {
        return stores(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()));
    }

    /**
     *  <p>Indicates if the CartDiscount is active and can be applied to the Cart.</p>
     * @param isActive value to be set
     * @return Builder
     */

    public CartDiscountBuilder isActive(final Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    /**
     *  <p>Date and time (UTC) from which the Discount is effective.</p>
     * @param validFrom value to be set
     * @return Builder
     */

    public CartDiscountBuilder validFrom(@Nullable final java.time.ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    /**
     *  <p>Date and time (UTC) until which the Discount is effective.</p>
     * @param validUntil value to be set
     * @return Builder
     */

    public CartDiscountBuilder validUntil(@Nullable final java.time.ZonedDateTime validUntil) {
        this.validUntil = validUntil;
        return this;
    }

    /**
     *  <p>Indicates if the Discount is used in connection with a <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">DiscountCode</a>.</p>
     * @param requiresDiscountCode value to be set
     * @return Builder
     */

    public CartDiscountBuilder requiresDiscountCode(final Boolean requiresDiscountCode) {
        this.requiresDiscountCode = requiresDiscountCode;
        return this;
    }

    /**
     *  <p>References to all resources addressed in the <code>cartPredicate</code> by their IDs. This value is generated by the platform.</p>
     * @param references value to be set
     * @return Builder
     */

    public CartDiscountBuilder references(final com.commercetools.api.models.common.Reference... references) {
        this.references = new ArrayList<>(Arrays.asList(references));
        return this;
    }

    /**
     *  <p>References to all resources addressed in the <code>cartPredicate</code> by their IDs. This value is generated by the platform.</p>
     * @param references value to be set
     * @return Builder
     */

    public CartDiscountBuilder references(
            final java.util.List<com.commercetools.api.models.common.Reference> references) {
        this.references = references;
        return this;
    }

    /**
     *  <p>References to all resources addressed in the <code>cartPredicate</code> by their IDs. This value is generated by the platform.</p>
     * @param references value to be set
     * @return Builder
     */

    public CartDiscountBuilder plusReferences(final com.commercetools.api.models.common.Reference... references) {
        if (this.references == null) {
            this.references = new ArrayList<>();
        }
        this.references.addAll(Arrays.asList(references));
        return this;
    }

    /**
     *  <p>References to all resources addressed in the <code>cartPredicate</code> by their IDs. This value is generated by the platform.</p>
     * @param builder function to build the references value
     * @return Builder
     */

    public CartDiscountBuilder plusReferences(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        if (this.references == null) {
            this.references = new ArrayList<>();
        }
        this.references.add(builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>References to all resources addressed in the <code>cartPredicate</code> by their IDs. This value is generated by the platform.</p>
     * @param builder function to build the references value
     * @return Builder
     */

    public CartDiscountBuilder withReferences(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.references = new ArrayList<>();
        this.references.add(builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Indicates whether the application of the CartDiscount causes other discounts to be ignored.</p>
     * @param stackingMode value to be set
     * @return Builder
     */

    public CartDiscountBuilder stackingMode(
            final com.commercetools.api.models.cart_discount.StackingMode stackingMode) {
        this.stackingMode = stackingMode;
        return this;
    }

    /**
     *  <p>Custom Fields of the CartDiscount.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public CartDiscountBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields of the CartDiscount.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public CartDiscountBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFields> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields of the CartDiscount.</p>
     * @param custom value to be set
     * @return Builder
     */

    public CartDiscountBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Reference to a DiscountGroup that the CartDiscount belongs to.</p>
     * @param builder function to build the discountGroup value
     * @return Builder
     */

    public CartDiscountBuilder discountGroup(
            Function<com.commercetools.api.models.discount_group.DiscountGroupReferenceBuilder, com.commercetools.api.models.discount_group.DiscountGroupReferenceBuilder> builder) {
        this.discountGroup = builder
                .apply(com.commercetools.api.models.discount_group.DiscountGroupReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Reference to a DiscountGroup that the CartDiscount belongs to.</p>
     * @param builder function to build the discountGroup value
     * @return Builder
     */

    public CartDiscountBuilder withDiscountGroup(
            Function<com.commercetools.api.models.discount_group.DiscountGroupReferenceBuilder, com.commercetools.api.models.discount_group.DiscountGroupReference> builder) {
        this.discountGroup = builder
                .apply(com.commercetools.api.models.discount_group.DiscountGroupReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to a DiscountGroup that the CartDiscount belongs to.</p>
     * @param discountGroup value to be set
     * @return Builder
     */

    public CartDiscountBuilder discountGroup(
            @Nullable final com.commercetools.api.models.discount_group.DiscountGroupReference discountGroup) {
        this.discountGroup = discountGroup;
        return this;
    }

    /**
     *  <p>Scope of the Cart Discount for Recurring Orders.</p>
     *  <p>The default is <a href="https://docs.commercetools.com/apis/ctp:api:type:NonRecurringOrdersOnly" rel="nofollow">NonRecurringOrdersOnly</a>.</p>
     * @param recurringOrderScope value to be set
     * @return Builder
     */

    public CartDiscountBuilder recurringOrderScope(
            final com.commercetools.api.models.recurring_order.RecurringOrderScope recurringOrderScope) {
        this.recurringOrderScope = recurringOrderScope;
        return this;
    }

    /**
     *  <p>Scope of the Cart Discount for Recurring Orders.</p>
     *  <p>The default is <a href="https://docs.commercetools.com/apis/ctp:api:type:NonRecurringOrdersOnly" rel="nofollow">NonRecurringOrdersOnly</a>.</p>
     * @param builder function to build the recurringOrderScope value
     * @return Builder
     */

    public CartDiscountBuilder recurringOrderScope(
            Function<com.commercetools.api.models.recurring_order.RecurringOrderScopeBuilder, Builder<? extends com.commercetools.api.models.recurring_order.RecurringOrderScope>> builder) {
        this.recurringOrderScope = builder
                .apply(com.commercetools.api.models.recurring_order.RecurringOrderScopeBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Unique identifier of the CartDiscount.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the CartDiscount.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the CartDiscount was initially created.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the CartDiscount was last updated.</p>
     * @return lastModifiedAt
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>IDs and references that last modified the CartDiscount.</p>
     * @return lastModifiedBy
     */

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>IDs and references that created the CartDiscount.</p>
     * @return createdBy
     */

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>Name of the CartDiscount.</p>
     * @return name
     */

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    /**
     *  <p>User-defined unique identifier of the CartDiscount.</p>
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

    public com.commercetools.api.models.cart_discount.CartDiscountValue getValue() {
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
     *  <p>Segment of the Cart that is discounted.</p>
     *  <p>Empty, if the <code>value</code> is <code>giftLineItem</code>.</p>
     * @return target
     */

    @Nullable
    public com.commercetools.api.models.cart_discount.CartDiscountTarget getTarget() {
        return this.target;
    }

    /**
     *  <p>Value between <code>0</code> and <code>1</code> that determines the order in which the CartDiscounts are applied; a CartDiscount with a higher value is prioritized.</p>
     *  <p>It is unique among all CartDiscounts and DiscountGroups.</p>
     *  <p>If the CartDiscount is part of a DiscountGroup, it uses the sort order of the DiscountGroup.</p>
     * @return sortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     *  <ul>
     *   <li>If a value exists, the Cart Discount applies on <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a> having a <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Store</a> matching any Store defined for this field.</li>
     *   <li>If empty, the Cart Discount applies on all <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, irrespective of a Store.</li>
     *  </ul>
     * @return stores
     */

    public java.util.List<com.commercetools.api.models.store.StoreKeyReference> getStores() {
        return this.stores;
    }

    /**
     *  <p>Indicates if the CartDiscount is active and can be applied to the Cart.</p>
     * @return isActive
     */

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
     *  <p>Indicates if the Discount is used in connection with a <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">DiscountCode</a>.</p>
     * @return requiresDiscountCode
     */

    public Boolean getRequiresDiscountCode() {
        return this.requiresDiscountCode;
    }

    /**
     *  <p>References to all resources addressed in the <code>cartPredicate</code> by their IDs. This value is generated by the platform.</p>
     * @return references
     */

    public java.util.List<com.commercetools.api.models.common.Reference> getReferences() {
        return this.references;
    }

    /**
     *  <p>Indicates whether the application of the CartDiscount causes other discounts to be ignored.</p>
     * @return stackingMode
     */

    public com.commercetools.api.models.cart_discount.StackingMode getStackingMode() {
        return this.stackingMode;
    }

    /**
     *  <p>Custom Fields of the CartDiscount.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    /**
     *  <p>Reference to a DiscountGroup that the CartDiscount belongs to.</p>
     * @return discountGroup
     */

    @Nullable
    public com.commercetools.api.models.discount_group.DiscountGroupReference getDiscountGroup() {
        return this.discountGroup;
    }

    /**
     *  <p>Scope of the Cart Discount for Recurring Orders.</p>
     *  <p>The default is <a href="https://docs.commercetools.com/apis/ctp:api:type:NonRecurringOrdersOnly" rel="nofollow">NonRecurringOrdersOnly</a>.</p>
     * @return recurringOrderScope
     */

    public com.commercetools.api.models.recurring_order.RecurringOrderScope getRecurringOrderScope() {
        return this.recurringOrderScope;
    }

    /**
     * builds CartDiscount with checking for non-null required values
     * @return CartDiscount
     */
    public CartDiscount build() {
        Objects.requireNonNull(id, CartDiscount.class + ": id is missing");
        Objects.requireNonNull(version, CartDiscount.class + ": version is missing");
        Objects.requireNonNull(createdAt, CartDiscount.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, CartDiscount.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(name, CartDiscount.class + ": name is missing");
        Objects.requireNonNull(value, CartDiscount.class + ": value is missing");
        Objects.requireNonNull(cartPredicate, CartDiscount.class + ": cartPredicate is missing");
        Objects.requireNonNull(sortOrder, CartDiscount.class + ": sortOrder is missing");
        Objects.requireNonNull(stores, CartDiscount.class + ": stores is missing");
        Objects.requireNonNull(isActive, CartDiscount.class + ": isActive is missing");
        Objects.requireNonNull(requiresDiscountCode, CartDiscount.class + ": requiresDiscountCode is missing");
        Objects.requireNonNull(references, CartDiscount.class + ": references is missing");
        Objects.requireNonNull(stackingMode, CartDiscount.class + ": stackingMode is missing");
        Objects.requireNonNull(recurringOrderScope, CartDiscount.class + ": recurringOrderScope is missing");
        return new CartDiscountImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, name, key,
            description, value, cartPredicate, target, sortOrder, stores, isActive, validFrom, validUntil,
            requiresDiscountCode, references, stackingMode, custom, discountGroup, recurringOrderScope);
    }

    /**
     * builds CartDiscount without checking for non-null required values
     * @return CartDiscount
     */
    public CartDiscount buildUnchecked() {
        return new CartDiscountImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, name, key,
            description, value, cartPredicate, target, sortOrder, stores, isActive, validFrom, validUntil,
            requiresDiscountCode, references, stackingMode, custom, discountGroup, recurringOrderScope);
    }

    /**
     * factory method for an instance of CartDiscountBuilder
     * @return builder
     */
    public static CartDiscountBuilder of() {
        return new CartDiscountBuilder();
    }

    /**
     * create builder for CartDiscount instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountBuilder of(final CartDiscount template) {
        CartDiscountBuilder builder = new CartDiscountBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
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
        builder.references = template.getReferences();
        builder.stackingMode = template.getStackingMode();
        builder.custom = template.getCustom();
        builder.discountGroup = template.getDiscountGroup();
        builder.recurringOrderScope = template.getRecurringOrderScope();
        return builder;
    }

}
