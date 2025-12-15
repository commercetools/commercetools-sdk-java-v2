
package com.commercetools.api.models.business_unit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DivisionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Division division = Division.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .key("{key}")
 *             .status(BusinessUnitStatus.ACTIVE)
 *             .storeMode(BusinessUnitStoreMode.EXPLICIT)
 *             .name("{name}")
 *             .plusAddresses(addressesBuilder -> addressesBuilder)
 *             .associateMode(BusinessUnitAssociateMode.EXPLICIT)
 *             .plusAssociates(associatesBuilder -> associatesBuilder)
 *             .parentUnit(parentUnitBuilder -> parentUnitBuilder)
 *             .topLevelUnit(topLevelUnitBuilder -> topLevelUnitBuilder)
 *             .approvalRuleMode(BusinessUnitApprovalRuleMode.EXPLICIT)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DivisionBuilder implements Builder<Division> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    private String key;

    private com.commercetools.api.models.business_unit.BusinessUnitStatus status;

    @Nullable
    private java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores;

    @Nullable
    private java.util.List<com.commercetools.api.models.store.StoreKeyReference> inheritedStores;

    private com.commercetools.api.models.business_unit.BusinessUnitStoreMode storeMode;

    private String name;

    @Nullable
    private String contactEmail;

    @Nullable
    private com.commercetools.api.models.type.CustomFields custom;

    @Nullable
    private java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignment> customerGroupAssignments;

    private java.util.List<com.commercetools.api.models.common.Address> addresses;

    @Nullable
    private java.util.List<String> shippingAddressIds;

    @Nullable
    private String defaultShippingAddressId;

    @Nullable
    private java.util.List<String> billingAddressIds;

    @Nullable
    private String defaultBillingAddressId;

    private com.commercetools.api.models.business_unit.BusinessUnitAssociateMode associateMode;

    private java.util.List<com.commercetools.api.models.business_unit.Associate> associates;

    @Nullable
    private java.util.List<com.commercetools.api.models.business_unit.InheritedAssociate> inheritedAssociates;

    private com.commercetools.api.models.business_unit.BusinessUnitKeyReference parentUnit;

    private com.commercetools.api.models.business_unit.BusinessUnitKeyReference topLevelUnit;

    private com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode approvalRuleMode;

    /**
     *  <p>Unique identifier of the Business Unit.</p>
     * @param id value to be set
     * @return Builder
     */

    public DivisionBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the Business Unit.</p>
     * @param version value to be set
     * @return Builder
     */

    public DivisionBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Business Unit was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public DivisionBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Business Unit was last updated.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public DivisionBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>IDs and references that last modified the BusinessUnit.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public DivisionBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that last modified the BusinessUnit.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public DivisionBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that last modified the BusinessUnit.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public DivisionBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>IDs and references that created the BusinessUnit.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public DivisionBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that created the BusinessUnit.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public DivisionBuilder withCreatedBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that created the BusinessUnit.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public DivisionBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>User-defined unique and immutable identifier of the Business Unit.</p>
     * @param key value to be set
     * @return Builder
     */

    public DivisionBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Indicates whether the Business Unit can be edited and used in <span>Orders</span>.</p>
     * @param status value to be set
     * @return Builder
     */

    public DivisionBuilder status(final com.commercetools.api.models.business_unit.BusinessUnitStatus status) {
        this.status = status;
        return this;
    }

    /**
     *  <p>References to <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> the Business Unit is associated with. Only present when <code>storeMode</code> is <code>Explicit</code>.</p>
     *  <p>If the Business Unit has Stores defined, then all of its <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quotes</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">Quote Requests</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">Shopping Lists</a> must belong to one of the Business Unit's Stores.</p>
     *  <p>If the Business Unit has no Stores, then all of its <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quotes</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">Quote Requests</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">Shopping Lists</a> must not belong to any Store.</p>
     * @param stores value to be set
     * @return Builder
     */

    public DivisionBuilder stores(@Nullable final com.commercetools.api.models.store.StoreKeyReference... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>References to <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> the Business Unit is associated with. Only present when <code>storeMode</code> is <code>Explicit</code>.</p>
     *  <p>If the Business Unit has Stores defined, then all of its <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quotes</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">Quote Requests</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">Shopping Lists</a> must belong to one of the Business Unit's Stores.</p>
     *  <p>If the Business Unit has no Stores, then all of its <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quotes</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">Quote Requests</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">Shopping Lists</a> must not belong to any Store.</p>
     * @param stores value to be set
     * @return Builder
     */

    public DivisionBuilder stores(
            @Nullable final java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores) {
        this.stores = stores;
        return this;
    }

    /**
     *  <p>References to <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> the Business Unit is associated with. Only present when <code>storeMode</code> is <code>Explicit</code>.</p>
     *  <p>If the Business Unit has Stores defined, then all of its <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quotes</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">Quote Requests</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">Shopping Lists</a> must belong to one of the Business Unit's Stores.</p>
     *  <p>If the Business Unit has no Stores, then all of its <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quotes</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">Quote Requests</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">Shopping Lists</a> must not belong to any Store.</p>
     * @param stores value to be set
     * @return Builder
     */

    public DivisionBuilder plusStores(@Nullable final com.commercetools.api.models.store.StoreKeyReference... stores) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.addAll(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>References to <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> the Business Unit is associated with. Only present when <code>storeMode</code> is <code>Explicit</code>.</p>
     *  <p>If the Business Unit has Stores defined, then all of its <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quotes</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">Quote Requests</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">Shopping Lists</a> must belong to one of the Business Unit's Stores.</p>
     *  <p>If the Business Unit has no Stores, then all of its <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quotes</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">Quote Requests</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">Shopping Lists</a> must not belong to any Store.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public DivisionBuilder plusStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>References to <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> the Business Unit is associated with. Only present when <code>storeMode</code> is <code>Explicit</code>.</p>
     *  <p>If the Business Unit has Stores defined, then all of its <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quotes</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">Quote Requests</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">Shopping Lists</a> must belong to one of the Business Unit's Stores.</p>
     *  <p>If the Business Unit has no Stores, then all of its <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quotes</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">Quote Requests</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">Shopping Lists</a> must not belong to any Store.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public DivisionBuilder withStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.stores = new ArrayList<>();
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>References to <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> the Business Unit is associated with. Only present when <code>storeMode</code> is <code>Explicit</code>.</p>
     *  <p>If the Business Unit has Stores defined, then all of its <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quotes</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">Quote Requests</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">Shopping Lists</a> must belong to one of the Business Unit's Stores.</p>
     *  <p>If the Business Unit has no Stores, then all of its <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quotes</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">Quote Requests</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">Shopping Lists</a> must not belong to any Store.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public DivisionBuilder addStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReference> builder) {
        return plusStores(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()));
    }

    /**
     *  <p>References to <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> the Business Unit is associated with. Only present when <code>storeMode</code> is <code>Explicit</code>.</p>
     *  <p>If the Business Unit has Stores defined, then all of its <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quotes</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">Quote Requests</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">Shopping Lists</a> must belong to one of the Business Unit's Stores.</p>
     *  <p>If the Business Unit has no Stores, then all of its <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quotes</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">Quote Requests</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">Shopping Lists</a> must not belong to any Store.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public DivisionBuilder setStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReference> builder) {
        return stores(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()));
    }

    /**
     *  <p>Stores that are inherited from a parent Business Unit. The value of this field is <span>eventually consistent</span> and is only present when the <code>storeMode</code> is set to <code>FromParent</code>.</p>
     * @param inheritedStores value to be set
     * @return Builder
     */

    public DivisionBuilder inheritedStores(
            @Nullable final com.commercetools.api.models.store.StoreKeyReference... inheritedStores) {
        this.inheritedStores = new ArrayList<>(Arrays.asList(inheritedStores));
        return this;
    }

    /**
     *  <p>Stores that are inherited from a parent Business Unit. The value of this field is <span>eventually consistent</span> and is only present when the <code>storeMode</code> is set to <code>FromParent</code>.</p>
     * @param inheritedStores value to be set
     * @return Builder
     */

    public DivisionBuilder inheritedStores(
            @Nullable final java.util.List<com.commercetools.api.models.store.StoreKeyReference> inheritedStores) {
        this.inheritedStores = inheritedStores;
        return this;
    }

    /**
     *  <p>Stores that are inherited from a parent Business Unit. The value of this field is <span>eventually consistent</span> and is only present when the <code>storeMode</code> is set to <code>FromParent</code>.</p>
     * @param inheritedStores value to be set
     * @return Builder
     */

    public DivisionBuilder plusInheritedStores(
            @Nullable final com.commercetools.api.models.store.StoreKeyReference... inheritedStores) {
        if (this.inheritedStores == null) {
            this.inheritedStores = new ArrayList<>();
        }
        this.inheritedStores.addAll(Arrays.asList(inheritedStores));
        return this;
    }

    /**
     *  <p>Stores that are inherited from a parent Business Unit. The value of this field is <span>eventually consistent</span> and is only present when the <code>storeMode</code> is set to <code>FromParent</code>.</p>
     * @param builder function to build the inheritedStores value
     * @return Builder
     */

    public DivisionBuilder plusInheritedStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        if (this.inheritedStores == null) {
            this.inheritedStores = new ArrayList<>();
        }
        this.inheritedStores
                .add(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Stores that are inherited from a parent Business Unit. The value of this field is <span>eventually consistent</span> and is only present when the <code>storeMode</code> is set to <code>FromParent</code>.</p>
     * @param builder function to build the inheritedStores value
     * @return Builder
     */

    public DivisionBuilder withInheritedStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReferenceBuilder> builder) {
        this.inheritedStores = new ArrayList<>();
        this.inheritedStores
                .add(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Stores that are inherited from a parent Business Unit. The value of this field is <span>eventually consistent</span> and is only present when the <code>storeMode</code> is set to <code>FromParent</code>.</p>
     * @param builder function to build the inheritedStores value
     * @return Builder
     */

    public DivisionBuilder addInheritedStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReference> builder) {
        return plusInheritedStores(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()));
    }

    /**
     *  <p>Stores that are inherited from a parent Business Unit. The value of this field is <span>eventually consistent</span> and is only present when the <code>storeMode</code> is set to <code>FromParent</code>.</p>
     * @param builder function to build the inheritedStores value
     * @return Builder
     */

    public DivisionBuilder setInheritedStores(
            Function<com.commercetools.api.models.store.StoreKeyReferenceBuilder, com.commercetools.api.models.store.StoreKeyReference> builder) {
        return inheritedStores(builder.apply(com.commercetools.api.models.store.StoreKeyReferenceBuilder.of()));
    }

    /**
     *  <p>Defines whether the Stores of the Division are set explicitly or inherited from a parent Business Unit.</p>
     * @param storeMode value to be set
     * @return Builder
     */

    public DivisionBuilder storeMode(final com.commercetools.api.models.business_unit.BusinessUnitStoreMode storeMode) {
        this.storeMode = storeMode;
        return this;
    }

    /**
     *  <p>Name of the Business Unit.</p>
     * @param name value to be set
     * @return Builder
     */

    public DivisionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Email address of the Business Unit.</p>
     * @param contactEmail value to be set
     * @return Builder
     */

    public DivisionBuilder contactEmail(@Nullable final String contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }

    /**
     *  <p>Custom Fields for the Business Unit.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public DivisionBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFieldsBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the Business Unit.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public DivisionBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsBuilder, com.commercetools.api.models.type.CustomFields> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields for the Business Unit.</p>
     * @param custom value to be set
     * @return Builder
     */

    public DivisionBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Customer Groups assigned to the Business Unit.</p>
     *  <p>They are considered during <span>line Item price selection</span>, if provided (non-null).</p>
     * @param customerGroupAssignments value to be set
     * @return Builder
     */

    public DivisionBuilder customerGroupAssignments(
            @Nullable final com.commercetools.api.models.customer.CustomerGroupAssignment... customerGroupAssignments) {
        this.customerGroupAssignments = new ArrayList<>(Arrays.asList(customerGroupAssignments));
        return this;
    }

    /**
     *  <p>Customer Groups assigned to the Business Unit.</p>
     *  <p>They are considered during <span>line Item price selection</span>, if provided (non-null).</p>
     * @param customerGroupAssignments value to be set
     * @return Builder
     */

    public DivisionBuilder customerGroupAssignments(
            @Nullable final java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignment> customerGroupAssignments) {
        this.customerGroupAssignments = customerGroupAssignments;
        return this;
    }

    /**
     *  <p>Customer Groups assigned to the Business Unit.</p>
     *  <p>They are considered during <span>line Item price selection</span>, if provided (non-null).</p>
     * @param customerGroupAssignments value to be set
     * @return Builder
     */

    public DivisionBuilder plusCustomerGroupAssignments(
            @Nullable final com.commercetools.api.models.customer.CustomerGroupAssignment... customerGroupAssignments) {
        if (this.customerGroupAssignments == null) {
            this.customerGroupAssignments = new ArrayList<>();
        }
        this.customerGroupAssignments.addAll(Arrays.asList(customerGroupAssignments));
        return this;
    }

    /**
     *  <p>Customer Groups assigned to the Business Unit.</p>
     *  <p>They are considered during <span>line Item price selection</span>, if provided (non-null).</p>
     * @param builder function to build the customerGroupAssignments value
     * @return Builder
     */

    public DivisionBuilder plusCustomerGroupAssignments(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder, com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder> builder) {
        if (this.customerGroupAssignments == null) {
            this.customerGroupAssignments = new ArrayList<>();
        }
        this.customerGroupAssignments
                .add(builder.apply(com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Customer Groups assigned to the Business Unit.</p>
     *  <p>They are considered during <span>line Item price selection</span>, if provided (non-null).</p>
     * @param builder function to build the customerGroupAssignments value
     * @return Builder
     */

    public DivisionBuilder withCustomerGroupAssignments(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder, com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder> builder) {
        this.customerGroupAssignments = new ArrayList<>();
        this.customerGroupAssignments
                .add(builder.apply(com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Customer Groups assigned to the Business Unit.</p>
     *  <p>They are considered during <span>line Item price selection</span>, if provided (non-null).</p>
     * @param builder function to build the customerGroupAssignments value
     * @return Builder
     */

    public DivisionBuilder addCustomerGroupAssignments(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder, com.commercetools.api.models.customer.CustomerGroupAssignment> builder) {
        return plusCustomerGroupAssignments(
            builder.apply(com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder.of()));
    }

    /**
     *  <p>Customer Groups assigned to the Business Unit.</p>
     *  <p>They are considered during <span>line Item price selection</span>, if provided (non-null).</p>
     * @param builder function to build the customerGroupAssignments value
     * @return Builder
     */

    public DivisionBuilder setCustomerGroupAssignments(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder, com.commercetools.api.models.customer.CustomerGroupAssignment> builder) {
        return customerGroupAssignments(
            builder.apply(com.commercetools.api.models.customer.CustomerGroupAssignmentBuilder.of()));
    }

    /**
     *  <p>Addresses used by the Business Unit.</p>
     * @param addresses value to be set
     * @return Builder
     */

    public DivisionBuilder addresses(final com.commercetools.api.models.common.Address... addresses) {
        this.addresses = new ArrayList<>(Arrays.asList(addresses));
        return this;
    }

    /**
     *  <p>Addresses used by the Business Unit.</p>
     * @param addresses value to be set
     * @return Builder
     */

    public DivisionBuilder addresses(final java.util.List<com.commercetools.api.models.common.Address> addresses) {
        this.addresses = addresses;
        return this;
    }

    /**
     *  <p>Addresses used by the Business Unit.</p>
     * @param addresses value to be set
     * @return Builder
     */

    public DivisionBuilder plusAddresses(final com.commercetools.api.models.common.Address... addresses) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses.addAll(Arrays.asList(addresses));
        return this;
    }

    /**
     *  <p>Addresses used by the Business Unit.</p>
     * @param builder function to build the addresses value
     * @return Builder
     */

    public DivisionBuilder plusAddresses(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses.add(builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Addresses used by the Business Unit.</p>
     * @param builder function to build the addresses value
     * @return Builder
     */

    public DivisionBuilder withAddresses(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.addresses = new ArrayList<>();
        this.addresses.add(builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Addresses used by the Business Unit.</p>
     * @param builder function to build the addresses value
     * @return Builder
     */

    public DivisionBuilder addAddresses(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.Address> builder) {
        return plusAddresses(builder.apply(com.commercetools.api.models.common.AddressBuilder.of()));
    }

    /**
     *  <p>Addresses used by the Business Unit.</p>
     * @param builder function to build the addresses value
     * @return Builder
     */

    public DivisionBuilder setAddresses(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.Address> builder) {
        return addresses(builder.apply(com.commercetools.api.models.common.AddressBuilder.of()));
    }

    /**
     *  <p>Unique identifiers of addresses used as shipping addresses.</p>
     * @param shippingAddressIds value to be set
     * @return Builder
     */

    public DivisionBuilder shippingAddressIds(@Nullable final String... shippingAddressIds) {
        this.shippingAddressIds = new ArrayList<>(Arrays.asList(shippingAddressIds));
        return this;
    }

    /**
     *  <p>Unique identifiers of addresses used as shipping addresses.</p>
     * @param shippingAddressIds value to be set
     * @return Builder
     */

    public DivisionBuilder shippingAddressIds(@Nullable final java.util.List<String> shippingAddressIds) {
        this.shippingAddressIds = shippingAddressIds;
        return this;
    }

    /**
     *  <p>Unique identifiers of addresses used as shipping addresses.</p>
     * @param shippingAddressIds value to be set
     * @return Builder
     */

    public DivisionBuilder plusShippingAddressIds(@Nullable final String... shippingAddressIds) {
        if (this.shippingAddressIds == null) {
            this.shippingAddressIds = new ArrayList<>();
        }
        this.shippingAddressIds.addAll(Arrays.asList(shippingAddressIds));
        return this;
    }

    /**
     *  <p>Unique identifier of the address used as the default shipping address.</p>
     * @param defaultShippingAddressId value to be set
     * @return Builder
     */

    public DivisionBuilder defaultShippingAddressId(@Nullable final String defaultShippingAddressId) {
        this.defaultShippingAddressId = defaultShippingAddressId;
        return this;
    }

    /**
     *  <p>Unique identifiers of addresses used as billing addresses.</p>
     * @param billingAddressIds value to be set
     * @return Builder
     */

    public DivisionBuilder billingAddressIds(@Nullable final String... billingAddressIds) {
        this.billingAddressIds = new ArrayList<>(Arrays.asList(billingAddressIds));
        return this;
    }

    /**
     *  <p>Unique identifiers of addresses used as billing addresses.</p>
     * @param billingAddressIds value to be set
     * @return Builder
     */

    public DivisionBuilder billingAddressIds(@Nullable final java.util.List<String> billingAddressIds) {
        this.billingAddressIds = billingAddressIds;
        return this;
    }

    /**
     *  <p>Unique identifiers of addresses used as billing addresses.</p>
     * @param billingAddressIds value to be set
     * @return Builder
     */

    public DivisionBuilder plusBillingAddressIds(@Nullable final String... billingAddressIds) {
        if (this.billingAddressIds == null) {
            this.billingAddressIds = new ArrayList<>();
        }
        this.billingAddressIds.addAll(Arrays.asList(billingAddressIds));
        return this;
    }

    /**
     *  <p>Unique identifier of the address used as the default billing address.</p>
     * @param defaultBillingAddressId value to be set
     * @return Builder
     */

    public DivisionBuilder defaultBillingAddressId(@Nullable final String defaultBillingAddressId) {
        this.defaultBillingAddressId = defaultBillingAddressId;
        return this;
    }

    /**
     *  <p>Determines whether the Division can inherit Associates from a parent.</p>
     * @param associateMode value to be set
     * @return Builder
     */

    public DivisionBuilder associateMode(
            final com.commercetools.api.models.business_unit.BusinessUnitAssociateMode associateMode) {
        this.associateMode = associateMode;
        return this;
    }

    /**
     *  <p>Associates that are part of the Business Unit in specific <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">roles</a>.</p>
     * @param associates value to be set
     * @return Builder
     */

    public DivisionBuilder associates(final com.commercetools.api.models.business_unit.Associate... associates) {
        this.associates = new ArrayList<>(Arrays.asList(associates));
        return this;
    }

    /**
     *  <p>Associates that are part of the Business Unit in specific <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">roles</a>.</p>
     * @param associates value to be set
     * @return Builder
     */

    public DivisionBuilder associates(
            final java.util.List<com.commercetools.api.models.business_unit.Associate> associates) {
        this.associates = associates;
        return this;
    }

    /**
     *  <p>Associates that are part of the Business Unit in specific <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">roles</a>.</p>
     * @param associates value to be set
     * @return Builder
     */

    public DivisionBuilder plusAssociates(final com.commercetools.api.models.business_unit.Associate... associates) {
        if (this.associates == null) {
            this.associates = new ArrayList<>();
        }
        this.associates.addAll(Arrays.asList(associates));
        return this;
    }

    /**
     *  <p>Associates that are part of the Business Unit in specific <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">roles</a>.</p>
     * @param builder function to build the associates value
     * @return Builder
     */

    public DivisionBuilder plusAssociates(
            Function<com.commercetools.api.models.business_unit.AssociateBuilder, com.commercetools.api.models.business_unit.AssociateBuilder> builder) {
        if (this.associates == null) {
            this.associates = new ArrayList<>();
        }
        this.associates.add(builder.apply(com.commercetools.api.models.business_unit.AssociateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Associates that are part of the Business Unit in specific <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">roles</a>.</p>
     * @param builder function to build the associates value
     * @return Builder
     */

    public DivisionBuilder withAssociates(
            Function<com.commercetools.api.models.business_unit.AssociateBuilder, com.commercetools.api.models.business_unit.AssociateBuilder> builder) {
        this.associates = new ArrayList<>();
        this.associates.add(builder.apply(com.commercetools.api.models.business_unit.AssociateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Associates that are part of the Business Unit in specific <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">roles</a>.</p>
     * @param builder function to build the associates value
     * @return Builder
     */

    public DivisionBuilder addAssociates(
            Function<com.commercetools.api.models.business_unit.AssociateBuilder, com.commercetools.api.models.business_unit.Associate> builder) {
        return plusAssociates(builder.apply(com.commercetools.api.models.business_unit.AssociateBuilder.of()));
    }

    /**
     *  <p>Associates that are part of the Business Unit in specific <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">roles</a>.</p>
     * @param builder function to build the associates value
     * @return Builder
     */

    public DivisionBuilder setAssociates(
            Function<com.commercetools.api.models.business_unit.AssociateBuilder, com.commercetools.api.models.business_unit.Associate> builder) {
        return associates(builder.apply(com.commercetools.api.models.business_unit.AssociateBuilder.of()));
    }

    /**
     *  <p>Associates that are inherited from a parent Business Unit. The value of this field is <span>eventually consistent</span> and is only present when the <code>associateMode</code> is set to <code>ExplicitAndFromParent</code>.</p>
     * @param inheritedAssociates value to be set
     * @return Builder
     */

    public DivisionBuilder inheritedAssociates(
            @Nullable final com.commercetools.api.models.business_unit.InheritedAssociate... inheritedAssociates) {
        this.inheritedAssociates = new ArrayList<>(Arrays.asList(inheritedAssociates));
        return this;
    }

    /**
     *  <p>Associates that are inherited from a parent Business Unit. The value of this field is <span>eventually consistent</span> and is only present when the <code>associateMode</code> is set to <code>ExplicitAndFromParent</code>.</p>
     * @param inheritedAssociates value to be set
     * @return Builder
     */

    public DivisionBuilder inheritedAssociates(
            @Nullable final java.util.List<com.commercetools.api.models.business_unit.InheritedAssociate> inheritedAssociates) {
        this.inheritedAssociates = inheritedAssociates;
        return this;
    }

    /**
     *  <p>Associates that are inherited from a parent Business Unit. The value of this field is <span>eventually consistent</span> and is only present when the <code>associateMode</code> is set to <code>ExplicitAndFromParent</code>.</p>
     * @param inheritedAssociates value to be set
     * @return Builder
     */

    public DivisionBuilder plusInheritedAssociates(
            @Nullable final com.commercetools.api.models.business_unit.InheritedAssociate... inheritedAssociates) {
        if (this.inheritedAssociates == null) {
            this.inheritedAssociates = new ArrayList<>();
        }
        this.inheritedAssociates.addAll(Arrays.asList(inheritedAssociates));
        return this;
    }

    /**
     *  <p>Associates that are inherited from a parent Business Unit. The value of this field is <span>eventually consistent</span> and is only present when the <code>associateMode</code> is set to <code>ExplicitAndFromParent</code>.</p>
     * @param builder function to build the inheritedAssociates value
     * @return Builder
     */

    public DivisionBuilder plusInheritedAssociates(
            Function<com.commercetools.api.models.business_unit.InheritedAssociateBuilder, com.commercetools.api.models.business_unit.InheritedAssociateBuilder> builder) {
        if (this.inheritedAssociates == null) {
            this.inheritedAssociates = new ArrayList<>();
        }
        this.inheritedAssociates
                .add(builder.apply(com.commercetools.api.models.business_unit.InheritedAssociateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Associates that are inherited from a parent Business Unit. The value of this field is <span>eventually consistent</span> and is only present when the <code>associateMode</code> is set to <code>ExplicitAndFromParent</code>.</p>
     * @param builder function to build the inheritedAssociates value
     * @return Builder
     */

    public DivisionBuilder withInheritedAssociates(
            Function<com.commercetools.api.models.business_unit.InheritedAssociateBuilder, com.commercetools.api.models.business_unit.InheritedAssociateBuilder> builder) {
        this.inheritedAssociates = new ArrayList<>();
        this.inheritedAssociates
                .add(builder.apply(com.commercetools.api.models.business_unit.InheritedAssociateBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Associates that are inherited from a parent Business Unit. The value of this field is <span>eventually consistent</span> and is only present when the <code>associateMode</code> is set to <code>ExplicitAndFromParent</code>.</p>
     * @param builder function to build the inheritedAssociates value
     * @return Builder
     */

    public DivisionBuilder addInheritedAssociates(
            Function<com.commercetools.api.models.business_unit.InheritedAssociateBuilder, com.commercetools.api.models.business_unit.InheritedAssociate> builder) {
        return plusInheritedAssociates(
            builder.apply(com.commercetools.api.models.business_unit.InheritedAssociateBuilder.of()));
    }

    /**
     *  <p>Associates that are inherited from a parent Business Unit. The value of this field is <span>eventually consistent</span> and is only present when the <code>associateMode</code> is set to <code>ExplicitAndFromParent</code>.</p>
     * @param builder function to build the inheritedAssociates value
     * @return Builder
     */

    public DivisionBuilder setInheritedAssociates(
            Function<com.commercetools.api.models.business_unit.InheritedAssociateBuilder, com.commercetools.api.models.business_unit.InheritedAssociate> builder) {
        return inheritedAssociates(
            builder.apply(com.commercetools.api.models.business_unit.InheritedAssociateBuilder.of()));
    }

    /**
     *  <p>Parent unit of the Division.</p>
     * @param builder function to build the parentUnit value
     * @return Builder
     */

    public DivisionBuilder parentUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder> builder) {
        this.parentUnit = builder.apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Parent unit of the Division.</p>
     * @param builder function to build the parentUnit value
     * @return Builder
     */

    public DivisionBuilder withParentUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReference> builder) {
        this.parentUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Parent unit of the Division.</p>
     * @param parentUnit value to be set
     * @return Builder
     */

    public DivisionBuilder parentUnit(
            final com.commercetools.api.models.business_unit.BusinessUnitKeyReference parentUnit) {
        this.parentUnit = parentUnit;
        return this;
    }

    /**
     *  <p>Top-level unit of the Business Unit. The top-level unit is of <code>unitType</code> <code>Company</code>.</p>
     * @param builder function to build the topLevelUnit value
     * @return Builder
     */

    public DivisionBuilder topLevelUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder> builder) {
        this.topLevelUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Top-level unit of the Business Unit. The top-level unit is of <code>unitType</code> <code>Company</code>.</p>
     * @param builder function to build the topLevelUnit value
     * @return Builder
     */

    public DivisionBuilder withTopLevelUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder, com.commercetools.api.models.business_unit.BusinessUnitKeyReference> builder) {
        this.topLevelUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitKeyReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Top-level unit of the Business Unit. The top-level unit is of <code>unitType</code> <code>Company</code>.</p>
     * @param topLevelUnit value to be set
     * @return Builder
     */

    public DivisionBuilder topLevelUnit(
            final com.commercetools.api.models.business_unit.BusinessUnitKeyReference topLevelUnit) {
        this.topLevelUnit = topLevelUnit;
        return this;
    }

    /**
     *  <p>Determines whether a Business Unit can inherit Approval Rules from a parent.</p>
     * @param approvalRuleMode value to be set
     * @return Builder
     */

    public DivisionBuilder approvalRuleMode(
            final com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode approvalRuleMode) {
        this.approvalRuleMode = approvalRuleMode;
        return this;
    }

    /**
     *  <p>Unique identifier of the Business Unit.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the Business Unit.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the Business Unit was initially created.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the Business Unit was last updated.</p>
     * @return lastModifiedAt
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>IDs and references that last modified the BusinessUnit.</p>
     * @return lastModifiedBy
     */

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>IDs and references that created the BusinessUnit.</p>
     * @return createdBy
     */

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>User-defined unique and immutable identifier of the Business Unit.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Indicates whether the Business Unit can be edited and used in <span>Orders</span>.</p>
     * @return status
     */

    public com.commercetools.api.models.business_unit.BusinessUnitStatus getStatus() {
        return this.status;
    }

    /**
     *  <p>References to <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> the Business Unit is associated with. Only present when <code>storeMode</code> is <code>Explicit</code>.</p>
     *  <p>If the Business Unit has Stores defined, then all of its <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quotes</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">Quote Requests</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">Shopping Lists</a> must belong to one of the Business Unit's Stores.</p>
     *  <p>If the Business Unit has no Stores, then all of its <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quotes</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">Quote Requests</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">Shopping Lists</a> must not belong to any Store.</p>
     * @return stores
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.store.StoreKeyReference> getStores() {
        return this.stores;
    }

    /**
     *  <p>Stores that are inherited from a parent Business Unit. The value of this field is <span>eventually consistent</span> and is only present when the <code>storeMode</code> is set to <code>FromParent</code>.</p>
     * @return inheritedStores
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.store.StoreKeyReference> getInheritedStores() {
        return this.inheritedStores;
    }

    /**
     *  <p>Defines whether the Stores of the Division are set explicitly or inherited from a parent Business Unit.</p>
     * @return storeMode
     */

    public com.commercetools.api.models.business_unit.BusinessUnitStoreMode getStoreMode() {
        return this.storeMode;
    }

    /**
     *  <p>Name of the Business Unit.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Email address of the Business Unit.</p>
     * @return contactEmail
     */

    @Nullable
    public String getContactEmail() {
        return this.contactEmail;
    }

    /**
     *  <p>Custom Fields for the Business Unit.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    /**
     *  <p>Customer Groups assigned to the Business Unit.</p>
     *  <p>They are considered during <span>line Item price selection</span>, if provided (non-null).</p>
     * @return customerGroupAssignments
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignment> getCustomerGroupAssignments() {
        return this.customerGroupAssignments;
    }

    /**
     *  <p>Addresses used by the Business Unit.</p>
     * @return addresses
     */

    public java.util.List<com.commercetools.api.models.common.Address> getAddresses() {
        return this.addresses;
    }

    /**
     *  <p>Unique identifiers of addresses used as shipping addresses.</p>
     * @return shippingAddressIds
     */

    @Nullable
    public java.util.List<String> getShippingAddressIds() {
        return this.shippingAddressIds;
    }

    /**
     *  <p>Unique identifier of the address used as the default shipping address.</p>
     * @return defaultShippingAddressId
     */

    @Nullable
    public String getDefaultShippingAddressId() {
        return this.defaultShippingAddressId;
    }

    /**
     *  <p>Unique identifiers of addresses used as billing addresses.</p>
     * @return billingAddressIds
     */

    @Nullable
    public java.util.List<String> getBillingAddressIds() {
        return this.billingAddressIds;
    }

    /**
     *  <p>Unique identifier of the address used as the default billing address.</p>
     * @return defaultBillingAddressId
     */

    @Nullable
    public String getDefaultBillingAddressId() {
        return this.defaultBillingAddressId;
    }

    /**
     *  <p>Determines whether the Division can inherit Associates from a parent.</p>
     * @return associateMode
     */

    public com.commercetools.api.models.business_unit.BusinessUnitAssociateMode getAssociateMode() {
        return this.associateMode;
    }

    /**
     *  <p>Associates that are part of the Business Unit in specific <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">roles</a>.</p>
     * @return associates
     */

    public java.util.List<com.commercetools.api.models.business_unit.Associate> getAssociates() {
        return this.associates;
    }

    /**
     *  <p>Associates that are inherited from a parent Business Unit. The value of this field is <span>eventually consistent</span> and is only present when the <code>associateMode</code> is set to <code>ExplicitAndFromParent</code>.</p>
     * @return inheritedAssociates
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.business_unit.InheritedAssociate> getInheritedAssociates() {
        return this.inheritedAssociates;
    }

    /**
     *  <p>Parent unit of the Division.</p>
     * @return parentUnit
     */

    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getParentUnit() {
        return this.parentUnit;
    }

    /**
     *  <p>Top-level unit of the Business Unit. The top-level unit is of <code>unitType</code> <code>Company</code>.</p>
     * @return topLevelUnit
     */

    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getTopLevelUnit() {
        return this.topLevelUnit;
    }

    /**
     *  <p>Determines whether a Business Unit can inherit Approval Rules from a parent.</p>
     * @return approvalRuleMode
     */

    public com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode getApprovalRuleMode() {
        return this.approvalRuleMode;
    }

    /**
     * builds Division with checking for non-null required values
     * @return Division
     */
    public Division build() {
        Objects.requireNonNull(id, Division.class + ": id is missing");
        Objects.requireNonNull(version, Division.class + ": version is missing");
        Objects.requireNonNull(createdAt, Division.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, Division.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(key, Division.class + ": key is missing");
        Objects.requireNonNull(status, Division.class + ": status is missing");
        Objects.requireNonNull(storeMode, Division.class + ": storeMode is missing");
        Objects.requireNonNull(name, Division.class + ": name is missing");
        Objects.requireNonNull(addresses, Division.class + ": addresses is missing");
        Objects.requireNonNull(associateMode, Division.class + ": associateMode is missing");
        Objects.requireNonNull(associates, Division.class + ": associates is missing");
        Objects.requireNonNull(parentUnit, Division.class + ": parentUnit is missing");
        Objects.requireNonNull(topLevelUnit, Division.class + ": topLevelUnit is missing");
        Objects.requireNonNull(approvalRuleMode, Division.class + ": approvalRuleMode is missing");
        return new DivisionImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, status, stores,
            inheritedStores, storeMode, name, contactEmail, custom, customerGroupAssignments, addresses,
            shippingAddressIds, defaultShippingAddressId, billingAddressIds, defaultBillingAddressId, associateMode,
            associates, inheritedAssociates, parentUnit, topLevelUnit, approvalRuleMode);
    }

    /**
     * builds Division without checking for non-null required values
     * @return Division
     */
    public Division buildUnchecked() {
        return new DivisionImpl(id, version, createdAt, lastModifiedAt, lastModifiedBy, createdBy, key, status, stores,
            inheritedStores, storeMode, name, contactEmail, custom, customerGroupAssignments, addresses,
            shippingAddressIds, defaultShippingAddressId, billingAddressIds, defaultBillingAddressId, associateMode,
            associates, inheritedAssociates, parentUnit, topLevelUnit, approvalRuleMode);
    }

    /**
     * factory method for an instance of DivisionBuilder
     * @return builder
     */
    public static DivisionBuilder of() {
        return new DivisionBuilder();
    }

    /**
     * create builder for Division instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DivisionBuilder of(final Division template) {
        DivisionBuilder builder = new DivisionBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.key = template.getKey();
        builder.status = template.getStatus();
        builder.stores = template.getStores();
        builder.inheritedStores = template.getInheritedStores();
        builder.storeMode = template.getStoreMode();
        builder.name = template.getName();
        builder.contactEmail = template.getContactEmail();
        builder.custom = template.getCustom();
        builder.customerGroupAssignments = template.getCustomerGroupAssignments();
        builder.addresses = template.getAddresses();
        builder.shippingAddressIds = template.getShippingAddressIds();
        builder.defaultShippingAddressId = template.getDefaultShippingAddressId();
        builder.billingAddressIds = template.getBillingAddressIds();
        builder.defaultBillingAddressId = template.getDefaultBillingAddressId();
        builder.associateMode = template.getAssociateMode();
        builder.associates = template.getAssociates();
        builder.inheritedAssociates = template.getInheritedAssociates();
        builder.parentUnit = template.getParentUnit();
        builder.topLevelUnit = template.getTopLevelUnit();
        builder.approvalRuleMode = template.getApprovalRuleMode();
        return builder;
    }

}
