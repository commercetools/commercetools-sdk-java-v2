
package com.commercetools.api.models.business_unit;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CompanyDraftBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CompanyDraft companyDraft = CompanyDraft.builder()
 *             .key("{key}")
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CompanyDraftBuilder implements Builder<CompanyDraft> {

    private String key;

    @Nullable
    private com.commercetools.api.models.business_unit.BusinessUnitStatus status;

    @Nullable
    private java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores;

    @Nullable
    private com.commercetools.api.models.business_unit.BusinessUnitStoreMode storeMode;

    private String name;

    @Nullable
    private String contactEmail;

    @Nullable
    private com.commercetools.api.models.business_unit.BusinessUnitAssociateMode associateMode;

    @Nullable
    private java.util.List<com.commercetools.api.models.business_unit.AssociateDraft> associates;

    @Nullable
    private com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode approvalRuleMode;

    @Nullable
    private java.util.List<com.commercetools.api.models.common.BaseAddress> addresses;

    @Nullable
    private java.util.List<Integer> shippingAddresses;

    @Nullable
    private Integer defaultShippingAddress;

    @Nullable
    private java.util.List<Integer> billingAddresses;

    @Nullable
    private Integer defaultBillingAddress;

    @Nullable
    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    @Nullable
    private java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignmentDraft> customerGroupAssignments;

    /**
     *  <p>User-defined unique and immutable identifier for the Business Unit.</p>
     * @param key value to be set
     * @return Builder
     */

    public CompanyDraftBuilder key(final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Indicates whether the Business Unit can be edited and used in <span>Orders</span>.</p>
     * @param status value to be set
     * @return Builder
     */

    public CompanyDraftBuilder status(
            @Nullable final com.commercetools.api.models.business_unit.BusinessUnitStatus status) {
        this.status = status;
        return this;
    }

    /**
     *  <p>Sets the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> the Business Unit is associated with. Can only be set when <code>storeMode</code> is <code>Explicit</code>. Defaults to empty for <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitType" rel="nofollow">Companies</a> and not set for <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitType" rel="nofollow">Divisions</a>.</p>
     *  <p>If the Business Unit has Stores defined, then all of its <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quotes</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">Quote Requests</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">Shopping Lists</a> must belong to one of the Business Unit's Stores.</p>
     *  <p>If the Business Unit has no Stores, then all of its <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quotes</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">Quote Requests</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">Shopping Lists</a> must not belong to any Store.</p>
     * @param stores value to be set
     * @return Builder
     */

    public CompanyDraftBuilder stores(
            @Nullable final com.commercetools.api.models.store.StoreResourceIdentifier... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>Sets the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> the Business Unit is associated with. Can only be set when <code>storeMode</code> is <code>Explicit</code>. Defaults to empty for <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitType" rel="nofollow">Companies</a> and not set for <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitType" rel="nofollow">Divisions</a>.</p>
     *  <p>If the Business Unit has Stores defined, then all of its <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quotes</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">Quote Requests</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">Shopping Lists</a> must belong to one of the Business Unit's Stores.</p>
     *  <p>If the Business Unit has no Stores, then all of its <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quotes</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">Quote Requests</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">Shopping Lists</a> must not belong to any Store.</p>
     * @param stores value to be set
     * @return Builder
     */

    public CompanyDraftBuilder stores(
            @Nullable final java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores) {
        this.stores = stores;
        return this;
    }

    /**
     *  <p>Sets the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> the Business Unit is associated with. Can only be set when <code>storeMode</code> is <code>Explicit</code>. Defaults to empty for <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitType" rel="nofollow">Companies</a> and not set for <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitType" rel="nofollow">Divisions</a>.</p>
     *  <p>If the Business Unit has Stores defined, then all of its <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quotes</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">Quote Requests</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">Shopping Lists</a> must belong to one of the Business Unit's Stores.</p>
     *  <p>If the Business Unit has no Stores, then all of its <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quotes</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">Quote Requests</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">Shopping Lists</a> must not belong to any Store.</p>
     * @param stores value to be set
     * @return Builder
     */

    public CompanyDraftBuilder plusStores(
            @Nullable final com.commercetools.api.models.store.StoreResourceIdentifier... stores) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.addAll(Arrays.asList(stores));
        return this;
    }

    /**
     *  <p>Sets the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> the Business Unit is associated with. Can only be set when <code>storeMode</code> is <code>Explicit</code>. Defaults to empty for <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitType" rel="nofollow">Companies</a> and not set for <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitType" rel="nofollow">Divisions</a>.</p>
     *  <p>If the Business Unit has Stores defined, then all of its <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quotes</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">Quote Requests</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">Shopping Lists</a> must belong to one of the Business Unit's Stores.</p>
     *  <p>If the Business Unit has no Stores, then all of its <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quotes</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">Quote Requests</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">Shopping Lists</a> must not belong to any Store.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CompanyDraftBuilder plusStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        if (this.stores == null) {
            this.stores = new ArrayList<>();
        }
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Sets the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> the Business Unit is associated with. Can only be set when <code>storeMode</code> is <code>Explicit</code>. Defaults to empty for <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitType" rel="nofollow">Companies</a> and not set for <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitType" rel="nofollow">Divisions</a>.</p>
     *  <p>If the Business Unit has Stores defined, then all of its <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quotes</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">Quote Requests</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">Shopping Lists</a> must belong to one of the Business Unit's Stores.</p>
     *  <p>If the Business Unit has no Stores, then all of its <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quotes</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">Quote Requests</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">Shopping Lists</a> must not belong to any Store.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CompanyDraftBuilder withStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifierBuilder> builder) {
        this.stores = new ArrayList<>();
        this.stores.add(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Sets the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> the Business Unit is associated with. Can only be set when <code>storeMode</code> is <code>Explicit</code>. Defaults to empty for <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitType" rel="nofollow">Companies</a> and not set for <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitType" rel="nofollow">Divisions</a>.</p>
     *  <p>If the Business Unit has Stores defined, then all of its <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quotes</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">Quote Requests</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">Shopping Lists</a> must belong to one of the Business Unit's Stores.</p>
     *  <p>If the Business Unit has no Stores, then all of its <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quotes</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">Quote Requests</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">Shopping Lists</a> must not belong to any Store.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CompanyDraftBuilder addStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifier> builder) {
        return plusStores(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()));
    }

    /**
     *  <p>Sets the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> the Business Unit is associated with. Can only be set when <code>storeMode</code> is <code>Explicit</code>. Defaults to empty for <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitType" rel="nofollow">Companies</a> and not set for <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitType" rel="nofollow">Divisions</a>.</p>
     *  <p>If the Business Unit has Stores defined, then all of its <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quotes</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">Quote Requests</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">Shopping Lists</a> must belong to one of the Business Unit's Stores.</p>
     *  <p>If the Business Unit has no Stores, then all of its <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quotes</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">Quote Requests</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">Shopping Lists</a> must not belong to any Store.</p>
     * @param builder function to build the stores value
     * @return Builder
     */

    public CompanyDraftBuilder setStores(
            Function<com.commercetools.api.models.store.StoreResourceIdentifierBuilder, com.commercetools.api.models.store.StoreResourceIdentifier> builder) {
        return stores(builder.apply(com.commercetools.api.models.store.StoreResourceIdentifierBuilder.of()));
    }

    /**
     *  <p>Defines whether the Stores of the Business Unit are set directly on the Business Unit or are inherited from a parent. <code>storeMode</code> is always <code>Explicit</code> for <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitType" rel="nofollow">Companies</a> and defaults to <code>FromParent</code> for <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitType" rel="nofollow">Divisions</a>.</p>
     * @param storeMode value to be set
     * @return Builder
     */

    public CompanyDraftBuilder storeMode(
            @Nullable final com.commercetools.api.models.business_unit.BusinessUnitStoreMode storeMode) {
        this.storeMode = storeMode;
        return this;
    }

    /**
     *  <p>Name of the Business Unit.</p>
     * @param name value to be set
     * @return Builder
     */

    public CompanyDraftBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Email address of the Business Unit.</p>
     * @param contactEmail value to be set
     * @return Builder
     */

    public CompanyDraftBuilder contactEmail(@Nullable final String contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }

    /**
     *  <p>Determines whether the Business Unit can inherit Associates from a parent. Always <code>Explicit</code> for <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitType" rel="nofollow">Companies</a> and defaults to <code>ExplicitAndFromParent</code> for <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitType" rel="nofollow">Divisions</a>.</p>
     * @param associateMode value to be set
     * @return Builder
     */

    public CompanyDraftBuilder associateMode(
            @Nullable final com.commercetools.api.models.business_unit.BusinessUnitAssociateMode associateMode) {
        this.associateMode = associateMode;
        return this;
    }

    /**
     *  <p>List of members that are part of the Business Unit in specific <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">roles</a>.</p>
     * @param associates value to be set
     * @return Builder
     */

    public CompanyDraftBuilder associates(
            @Nullable final com.commercetools.api.models.business_unit.AssociateDraft... associates) {
        this.associates = new ArrayList<>(Arrays.asList(associates));
        return this;
    }

    /**
     *  <p>List of members that are part of the Business Unit in specific <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">roles</a>.</p>
     * @param associates value to be set
     * @return Builder
     */

    public CompanyDraftBuilder associates(
            @Nullable final java.util.List<com.commercetools.api.models.business_unit.AssociateDraft> associates) {
        this.associates = associates;
        return this;
    }

    /**
     *  <p>List of members that are part of the Business Unit in specific <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">roles</a>.</p>
     * @param associates value to be set
     * @return Builder
     */

    public CompanyDraftBuilder plusAssociates(
            @Nullable final com.commercetools.api.models.business_unit.AssociateDraft... associates) {
        if (this.associates == null) {
            this.associates = new ArrayList<>();
        }
        this.associates.addAll(Arrays.asList(associates));
        return this;
    }

    /**
     *  <p>List of members that are part of the Business Unit in specific <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">roles</a>.</p>
     * @param builder function to build the associates value
     * @return Builder
     */

    public CompanyDraftBuilder plusAssociates(
            Function<com.commercetools.api.models.business_unit.AssociateDraftBuilder, com.commercetools.api.models.business_unit.AssociateDraftBuilder> builder) {
        if (this.associates == null) {
            this.associates = new ArrayList<>();
        }
        this.associates
                .add(builder.apply(com.commercetools.api.models.business_unit.AssociateDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>List of members that are part of the Business Unit in specific <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">roles</a>.</p>
     * @param builder function to build the associates value
     * @return Builder
     */

    public CompanyDraftBuilder withAssociates(
            Function<com.commercetools.api.models.business_unit.AssociateDraftBuilder, com.commercetools.api.models.business_unit.AssociateDraftBuilder> builder) {
        this.associates = new ArrayList<>();
        this.associates
                .add(builder.apply(com.commercetools.api.models.business_unit.AssociateDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>List of members that are part of the Business Unit in specific <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">roles</a>.</p>
     * @param builder function to build the associates value
     * @return Builder
     */

    public CompanyDraftBuilder addAssociates(
            Function<com.commercetools.api.models.business_unit.AssociateDraftBuilder, com.commercetools.api.models.business_unit.AssociateDraft> builder) {
        return plusAssociates(builder.apply(com.commercetools.api.models.business_unit.AssociateDraftBuilder.of()));
    }

    /**
     *  <p>List of members that are part of the Business Unit in specific <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">roles</a>.</p>
     * @param builder function to build the associates value
     * @return Builder
     */

    public CompanyDraftBuilder setAssociates(
            Function<com.commercetools.api.models.business_unit.AssociateDraftBuilder, com.commercetools.api.models.business_unit.AssociateDraft> builder) {
        return associates(builder.apply(com.commercetools.api.models.business_unit.AssociateDraftBuilder.of()));
    }

    /**
     *  <p>Determines whether the Business Unit can inherit Approval Rules from a parent. For <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitType" rel="nofollow">Companies</a>, the value of this field is always <code>Explicit</code>. For <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitType" rel="nofollow">Divisions</a>, the default value is <code>ExplicitAndFromParent</code>.</p>
     * @param approvalRuleMode value to be set
     * @return Builder
     */

    public CompanyDraftBuilder approvalRuleMode(
            @Nullable final com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode approvalRuleMode) {
        this.approvalRuleMode = approvalRuleMode;
        return this;
    }

    /**
     *  <p>Addresses used by the Business Unit.</p>
     * @param addresses value to be set
     * @return Builder
     */

    public CompanyDraftBuilder addresses(@Nullable final com.commercetools.api.models.common.BaseAddress... addresses) {
        this.addresses = new ArrayList<>(Arrays.asList(addresses));
        return this;
    }

    /**
     *  <p>Addresses used by the Business Unit.</p>
     * @param addresses value to be set
     * @return Builder
     */

    public CompanyDraftBuilder addresses(
            @Nullable final java.util.List<com.commercetools.api.models.common.BaseAddress> addresses) {
        this.addresses = addresses;
        return this;
    }

    /**
     *  <p>Addresses used by the Business Unit.</p>
     * @param addresses value to be set
     * @return Builder
     */

    public CompanyDraftBuilder plusAddresses(
            @Nullable final com.commercetools.api.models.common.BaseAddress... addresses) {
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

    public CompanyDraftBuilder plusAddresses(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        if (this.addresses == null) {
            this.addresses = new ArrayList<>();
        }
        this.addresses.add(builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Addresses used by the Business Unit.</p>
     * @param builder function to build the addresses value
     * @return Builder
     */

    public CompanyDraftBuilder withAddresses(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.addresses = new ArrayList<>();
        this.addresses.add(builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Addresses used by the Business Unit.</p>
     * @param builder function to build the addresses value
     * @return Builder
     */

    public CompanyDraftBuilder addAddresses(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddress> builder) {
        return plusAddresses(builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()));
    }

    /**
     *  <p>Addresses used by the Business Unit.</p>
     * @param builder function to build the addresses value
     * @return Builder
     */

    public CompanyDraftBuilder setAddresses(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddress> builder) {
        return addresses(builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()));
    }

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as shipping addresses. The <code>shippingAddressIds</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> will be replaced by these addresses.</p>
     * @param shippingAddresses value to be set
     * @return Builder
     */

    public CompanyDraftBuilder shippingAddresses(@Nullable final Integer... shippingAddresses) {
        this.shippingAddresses = new ArrayList<>(Arrays.asList(shippingAddresses));
        return this;
    }

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as shipping addresses. The <code>shippingAddressIds</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> will be replaced by these addresses.</p>
     * @param shippingAddresses value to be set
     * @return Builder
     */

    public CompanyDraftBuilder shippingAddresses(@Nullable final java.util.List<Integer> shippingAddresses) {
        this.shippingAddresses = shippingAddresses;
        return this;
    }

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as shipping addresses. The <code>shippingAddressIds</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> will be replaced by these addresses.</p>
     * @param shippingAddresses value to be set
     * @return Builder
     */

    public CompanyDraftBuilder plusShippingAddresses(@Nullable final Integer... shippingAddresses) {
        if (this.shippingAddresses == null) {
            this.shippingAddresses = new ArrayList<>();
        }
        this.shippingAddresses.addAll(Arrays.asList(shippingAddresses));
        return this;
    }

    /**
     *  <p>Index of the entry in <code>addresses</code> to set as the default shipping address.</p>
     * @param defaultShippingAddress value to be set
     * @return Builder
     */

    public CompanyDraftBuilder defaultShippingAddress(@Nullable final Integer defaultShippingAddress) {
        this.defaultShippingAddress = defaultShippingAddress;
        return this;
    }

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as billing addresses. The <code>billingAddressIds</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> will be replaced by these addresses.</p>
     * @param billingAddresses value to be set
     * @return Builder
     */

    public CompanyDraftBuilder billingAddresses(@Nullable final Integer... billingAddresses) {
        this.billingAddresses = new ArrayList<>(Arrays.asList(billingAddresses));
        return this;
    }

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as billing addresses. The <code>billingAddressIds</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> will be replaced by these addresses.</p>
     * @param billingAddresses value to be set
     * @return Builder
     */

    public CompanyDraftBuilder billingAddresses(@Nullable final java.util.List<Integer> billingAddresses) {
        this.billingAddresses = billingAddresses;
        return this;
    }

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as billing addresses. The <code>billingAddressIds</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> will be replaced by these addresses.</p>
     * @param billingAddresses value to be set
     * @return Builder
     */

    public CompanyDraftBuilder plusBillingAddresses(@Nullable final Integer... billingAddresses) {
        if (this.billingAddresses == null) {
            this.billingAddresses = new ArrayList<>();
        }
        this.billingAddresses.addAll(Arrays.asList(billingAddresses));
        return this;
    }

    /**
     *  <p>Index of the entry in <code>addresses</code> to set as the default billing address.</p>
     * @param defaultBillingAddress value to be set
     * @return Builder
     */

    public CompanyDraftBuilder defaultBillingAddress(@Nullable final Integer defaultBillingAddress) {
        this.defaultBillingAddress = defaultBillingAddress;
        return this;
    }

    /**
     *  <p>Custom Fields for the Business Unit.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public CompanyDraftBuilder custom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraftBuilder> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Custom Fields for the Business Unit.</p>
     * @param builder function to build the custom value
     * @return Builder
     */

    public CompanyDraftBuilder withCustom(
            Function<com.commercetools.api.models.type.CustomFieldsDraftBuilder, com.commercetools.api.models.type.CustomFieldsDraft> builder) {
        this.custom = builder.apply(com.commercetools.api.models.type.CustomFieldsDraftBuilder.of());
        return this;
    }

    /**
     *  <p>Custom Fields for the Business Unit.</p>
     * @param custom value to be set
     * @return Builder
     */

    public CompanyDraftBuilder custom(@Nullable final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
        return this;
    }

    /**
     *  <p>Customer Groups to assign the Business Unit to.</p>
     *  <p>They are considered during <span>line Item price selection</span>, if provided (non-null).</p>
     * @param customerGroupAssignments value to be set
     * @return Builder
     */

    public CompanyDraftBuilder customerGroupAssignments(
            @Nullable final com.commercetools.api.models.customer.CustomerGroupAssignmentDraft... customerGroupAssignments) {
        this.customerGroupAssignments = new ArrayList<>(Arrays.asList(customerGroupAssignments));
        return this;
    }

    /**
     *  <p>Customer Groups to assign the Business Unit to.</p>
     *  <p>They are considered during <span>line Item price selection</span>, if provided (non-null).</p>
     * @param customerGroupAssignments value to be set
     * @return Builder
     */

    public CompanyDraftBuilder customerGroupAssignments(
            @Nullable final java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignmentDraft> customerGroupAssignments) {
        this.customerGroupAssignments = customerGroupAssignments;
        return this;
    }

    /**
     *  <p>Customer Groups to assign the Business Unit to.</p>
     *  <p>They are considered during <span>line Item price selection</span>, if provided (non-null).</p>
     * @param customerGroupAssignments value to be set
     * @return Builder
     */

    public CompanyDraftBuilder plusCustomerGroupAssignments(
            @Nullable final com.commercetools.api.models.customer.CustomerGroupAssignmentDraft... customerGroupAssignments) {
        if (this.customerGroupAssignments == null) {
            this.customerGroupAssignments = new ArrayList<>();
        }
        this.customerGroupAssignments.addAll(Arrays.asList(customerGroupAssignments));
        return this;
    }

    /**
     *  <p>Customer Groups to assign the Business Unit to.</p>
     *  <p>They are considered during <span>line Item price selection</span>, if provided (non-null).</p>
     * @param builder function to build the customerGroupAssignments value
     * @return Builder
     */

    public CompanyDraftBuilder plusCustomerGroupAssignments(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentDraftBuilder, com.commercetools.api.models.customer.CustomerGroupAssignmentDraftBuilder> builder) {
        if (this.customerGroupAssignments == null) {
            this.customerGroupAssignments = new ArrayList<>();
        }
        this.customerGroupAssignments.add(
            builder.apply(com.commercetools.api.models.customer.CustomerGroupAssignmentDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Customer Groups to assign the Business Unit to.</p>
     *  <p>They are considered during <span>line Item price selection</span>, if provided (non-null).</p>
     * @param builder function to build the customerGroupAssignments value
     * @return Builder
     */

    public CompanyDraftBuilder withCustomerGroupAssignments(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentDraftBuilder, com.commercetools.api.models.customer.CustomerGroupAssignmentDraftBuilder> builder) {
        this.customerGroupAssignments = new ArrayList<>();
        this.customerGroupAssignments.add(
            builder.apply(com.commercetools.api.models.customer.CustomerGroupAssignmentDraftBuilder.of()).build());
        return this;
    }

    /**
     *  <p>Customer Groups to assign the Business Unit to.</p>
     *  <p>They are considered during <span>line Item price selection</span>, if provided (non-null).</p>
     * @param builder function to build the customerGroupAssignments value
     * @return Builder
     */

    public CompanyDraftBuilder addCustomerGroupAssignments(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentDraftBuilder, com.commercetools.api.models.customer.CustomerGroupAssignmentDraft> builder) {
        return plusCustomerGroupAssignments(
            builder.apply(com.commercetools.api.models.customer.CustomerGroupAssignmentDraftBuilder.of()));
    }

    /**
     *  <p>Customer Groups to assign the Business Unit to.</p>
     *  <p>They are considered during <span>line Item price selection</span>, if provided (non-null).</p>
     * @param builder function to build the customerGroupAssignments value
     * @return Builder
     */

    public CompanyDraftBuilder setCustomerGroupAssignments(
            Function<com.commercetools.api.models.customer.CustomerGroupAssignmentDraftBuilder, com.commercetools.api.models.customer.CustomerGroupAssignmentDraft> builder) {
        return customerGroupAssignments(
            builder.apply(com.commercetools.api.models.customer.CustomerGroupAssignmentDraftBuilder.of()));
    }

    /**
     *  <p>User-defined unique and immutable identifier for the Business Unit.</p>
     * @return key
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Indicates whether the Business Unit can be edited and used in <span>Orders</span>.</p>
     * @return status
     */

    @Nullable
    public com.commercetools.api.models.business_unit.BusinessUnitStatus getStatus() {
        return this.status;
    }

    /**
     *  <p>Sets the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> the Business Unit is associated with. Can only be set when <code>storeMode</code> is <code>Explicit</code>. Defaults to empty for <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitType" rel="nofollow">Companies</a> and not set for <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitType" rel="nofollow">Divisions</a>.</p>
     *  <p>If the Business Unit has Stores defined, then all of its <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quotes</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">Quote Requests</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">Shopping Lists</a> must belong to one of the Business Unit's Stores.</p>
     *  <p>If the Business Unit has no Stores, then all of its <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quotes</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">Quote Requests</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">Shopping Lists</a> must not belong to any Store.</p>
     * @return stores
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> getStores() {
        return this.stores;
    }

    /**
     *  <p>Defines whether the Stores of the Business Unit are set directly on the Business Unit or are inherited from a parent. <code>storeMode</code> is always <code>Explicit</code> for <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitType" rel="nofollow">Companies</a> and defaults to <code>FromParent</code> for <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitType" rel="nofollow">Divisions</a>.</p>
     * @return storeMode
     */

    @Nullable
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
     *  <p>Determines whether the Business Unit can inherit Associates from a parent. Always <code>Explicit</code> for <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitType" rel="nofollow">Companies</a> and defaults to <code>ExplicitAndFromParent</code> for <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitType" rel="nofollow">Divisions</a>.</p>
     * @return associateMode
     */

    @Nullable
    public com.commercetools.api.models.business_unit.BusinessUnitAssociateMode getAssociateMode() {
        return this.associateMode;
    }

    /**
     *  <p>List of members that are part of the Business Unit in specific <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">roles</a>.</p>
     * @return associates
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.business_unit.AssociateDraft> getAssociates() {
        return this.associates;
    }

    /**
     *  <p>Determines whether the Business Unit can inherit Approval Rules from a parent. For <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitType" rel="nofollow">Companies</a>, the value of this field is always <code>Explicit</code>. For <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitType" rel="nofollow">Divisions</a>, the default value is <code>ExplicitAndFromParent</code>.</p>
     * @return approvalRuleMode
     */

    @Nullable
    public com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode getApprovalRuleMode() {
        return this.approvalRuleMode;
    }

    /**
     *  <p>Addresses used by the Business Unit.</p>
     * @return addresses
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.common.BaseAddress> getAddresses() {
        return this.addresses;
    }

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as shipping addresses. The <code>shippingAddressIds</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> will be replaced by these addresses.</p>
     * @return shippingAddresses
     */

    @Nullable
    public java.util.List<Integer> getShippingAddresses() {
        return this.shippingAddresses;
    }

    /**
     *  <p>Index of the entry in <code>addresses</code> to set as the default shipping address.</p>
     * @return defaultShippingAddress
     */

    @Nullable
    public Integer getDefaultShippingAddress() {
        return this.defaultShippingAddress;
    }

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as billing addresses. The <code>billingAddressIds</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> will be replaced by these addresses.</p>
     * @return billingAddresses
     */

    @Nullable
    public java.util.List<Integer> getBillingAddresses() {
        return this.billingAddresses;
    }

    /**
     *  <p>Index of the entry in <code>addresses</code> to set as the default billing address.</p>
     * @return defaultBillingAddress
     */

    @Nullable
    public Integer getDefaultBillingAddress() {
        return this.defaultBillingAddress;
    }

    /**
     *  <p>Custom Fields for the Business Unit.</p>
     * @return custom
     */

    @Nullable
    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     *  <p>Customer Groups to assign the Business Unit to.</p>
     *  <p>They are considered during <span>line Item price selection</span>, if provided (non-null).</p>
     * @return customerGroupAssignments
     */

    @Nullable
    public java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignmentDraft> getCustomerGroupAssignments() {
        return this.customerGroupAssignments;
    }

    /**
     * builds CompanyDraft with checking for non-null required values
     * @return CompanyDraft
     */
    public CompanyDraft build() {
        Objects.requireNonNull(key, CompanyDraft.class + ": key is missing");
        Objects.requireNonNull(name, CompanyDraft.class + ": name is missing");
        return new CompanyDraftImpl(key, status, stores, storeMode, name, contactEmail, associateMode, associates,
            approvalRuleMode, addresses, shippingAddresses, defaultShippingAddress, billingAddresses,
            defaultBillingAddress, custom, customerGroupAssignments);
    }

    /**
     * builds CompanyDraft without checking for non-null required values
     * @return CompanyDraft
     */
    public CompanyDraft buildUnchecked() {
        return new CompanyDraftImpl(key, status, stores, storeMode, name, contactEmail, associateMode, associates,
            approvalRuleMode, addresses, shippingAddresses, defaultShippingAddress, billingAddresses,
            defaultBillingAddress, custom, customerGroupAssignments);
    }

    /**
     * factory method for an instance of CompanyDraftBuilder
     * @return builder
     */
    public static CompanyDraftBuilder of() {
        return new CompanyDraftBuilder();
    }

    /**
     * create builder for CompanyDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CompanyDraftBuilder of(final CompanyDraft template) {
        CompanyDraftBuilder builder = new CompanyDraftBuilder();
        builder.key = template.getKey();
        builder.status = template.getStatus();
        builder.stores = template.getStores();
        builder.storeMode = template.getStoreMode();
        builder.name = template.getName();
        builder.contactEmail = template.getContactEmail();
        builder.associateMode = template.getAssociateMode();
        builder.associates = template.getAssociates();
        builder.approvalRuleMode = template.getApprovalRuleMode();
        builder.addresses = template.getAddresses();
        builder.shippingAddresses = template.getShippingAddresses();
        builder.defaultShippingAddress = template.getDefaultShippingAddress();
        builder.billingAddresses = template.getBillingAddresses();
        builder.defaultBillingAddress = template.getDefaultBillingAddress();
        builder.custom = template.getCustom();
        builder.customerGroupAssignments = template.getCustomerGroupAssignments();
        return builder;
    }

}
