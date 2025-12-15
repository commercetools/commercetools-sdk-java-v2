
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Generic type to model the fields that all types of Business Units have in common.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitImpl implements BusinessUnit, ModelBase {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    private com.commercetools.api.models.common.CreatedBy createdBy;

    private String key;

    private com.commercetools.api.models.business_unit.BusinessUnitStatus status;

    private java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores;

    private java.util.List<com.commercetools.api.models.store.StoreKeyReference> inheritedStores;

    private com.commercetools.api.models.business_unit.BusinessUnitStoreMode storeMode;

    private com.commercetools.api.models.business_unit.BusinessUnitType unitType;

    private String name;

    private String contactEmail;

    private com.commercetools.api.models.type.CustomFields custom;

    private java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignment> customerGroupAssignments;

    private java.util.List<com.commercetools.api.models.common.Address> addresses;

    private java.util.List<String> shippingAddressIds;

    private String defaultShippingAddressId;

    private java.util.List<String> billingAddressIds;

    private String defaultBillingAddressId;

    private com.commercetools.api.models.business_unit.BusinessUnitAssociateMode associateMode;

    private java.util.List<com.commercetools.api.models.business_unit.Associate> associates;

    private java.util.List<com.commercetools.api.models.business_unit.InheritedAssociate> inheritedAssociates;

    private com.commercetools.api.models.business_unit.BusinessUnitKeyReference parentUnit;

    private com.commercetools.api.models.business_unit.BusinessUnitKeyReference topLevelUnit;

    private com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode approvalRuleMode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt,
            @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy,
            @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy,
            @JsonProperty("key") final String key,
            @JsonProperty("status") final com.commercetools.api.models.business_unit.BusinessUnitStatus status,
            @JsonProperty("stores") final java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores,
            @JsonProperty("inheritedStores") final java.util.List<com.commercetools.api.models.store.StoreKeyReference> inheritedStores,
            @JsonProperty("storeMode") final com.commercetools.api.models.business_unit.BusinessUnitStoreMode storeMode,
            @JsonProperty("unitType") final com.commercetools.api.models.business_unit.BusinessUnitType unitType,
            @JsonProperty("name") final String name, @JsonProperty("contactEmail") final String contactEmail,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom,
            @JsonProperty("customerGroupAssignments") final java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignment> customerGroupAssignments,
            @JsonProperty("addresses") final java.util.List<com.commercetools.api.models.common.Address> addresses,
            @JsonProperty("shippingAddressIds") final java.util.List<String> shippingAddressIds,
            @JsonProperty("defaultShippingAddressId") final String defaultShippingAddressId,
            @JsonProperty("billingAddressIds") final java.util.List<String> billingAddressIds,
            @JsonProperty("defaultBillingAddressId") final String defaultBillingAddressId,
            @JsonProperty("associateMode") final com.commercetools.api.models.business_unit.BusinessUnitAssociateMode associateMode,
            @JsonProperty("associates") final java.util.List<com.commercetools.api.models.business_unit.Associate> associates,
            @JsonProperty("inheritedAssociates") final java.util.List<com.commercetools.api.models.business_unit.InheritedAssociate> inheritedAssociates,
            @JsonProperty("parentUnit") final com.commercetools.api.models.business_unit.BusinessUnitKeyReference parentUnit,
            @JsonProperty("topLevelUnit") final com.commercetools.api.models.business_unit.BusinessUnitKeyReference topLevelUnit,
            @JsonProperty("approvalRuleMode") final com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode approvalRuleMode) {
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.createdBy = createdBy;
        this.key = key;
        this.status = status;
        this.stores = stores;
        this.inheritedStores = inheritedStores;
        this.storeMode = storeMode;
        this.unitType = unitType;
        this.name = name;
        this.contactEmail = contactEmail;
        this.custom = custom;
        this.customerGroupAssignments = customerGroupAssignments;
        this.addresses = addresses;
        this.shippingAddressIds = shippingAddressIds;
        this.defaultShippingAddressId = defaultShippingAddressId;
        this.billingAddressIds = billingAddressIds;
        this.defaultBillingAddressId = defaultBillingAddressId;
        this.associateMode = associateMode;
        this.associates = associates;
        this.inheritedAssociates = inheritedAssociates;
        this.parentUnit = parentUnit;
        this.topLevelUnit = topLevelUnit;
        this.approvalRuleMode = approvalRuleMode;
    }

    /**
     * create empty instance
     */
    public BusinessUnitImpl() {
    }

    /**
     *  <p>Unique identifier of the Business Unit.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the Business Unit.</p>
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the Business Unit was initially created.</p>
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the Business Unit was last updated.</p>
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>IDs and references that last modified the BusinessUnit.</p>
     */

    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>IDs and references that created the BusinessUnit.</p>
     */

    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>User-defined unique and immutable identifier of the Business Unit.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Indicates whether the Business Unit can be edited and used in <span>Orders</span>.</p>
     */

    public com.commercetools.api.models.business_unit.BusinessUnitStatus getStatus() {
        return this.status;
    }

    /**
     *  <p>References to <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> the Business Unit is associated with. Only present when <code>storeMode</code> is <code>Explicit</code>.</p>
     *  <p>If the Business Unit has Stores defined, then all of its <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quotes</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">Quote Requests</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">Shopping Lists</a> must belong to one of the Business Unit's Stores.</p>
     *  <p>If the Business Unit has no Stores, then all of its <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quotes</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">Quote Requests</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">Shopping Lists</a> must not belong to any Store.</p>
     */

    public java.util.List<com.commercetools.api.models.store.StoreKeyReference> getStores() {
        return this.stores;
    }

    /**
     *  <p>Stores that are inherited from a parent Business Unit. The value of this field is <span>eventually consistent</span> and is only present when the <code>storeMode</code> is set to <code>FromParent</code>.</p>
     */

    public java.util.List<com.commercetools.api.models.store.StoreKeyReference> getInheritedStores() {
        return this.inheritedStores;
    }

    /**
     *  <p>Defines whether the Stores of the Business Unit are set directly on the Business Unit or are inherited from a parent.</p>
     */

    public com.commercetools.api.models.business_unit.BusinessUnitStoreMode getStoreMode() {
        return this.storeMode;
    }

    /**
     *  <p>Type of the Business Unit indicating its position in a hierarchy.</p>
     */

    public com.commercetools.api.models.business_unit.BusinessUnitType getUnitType() {
        return this.unitType;
    }

    /**
     *  <p>Name of the Business Unit.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Email address of the Business Unit.</p>
     */

    public String getContactEmail() {
        return this.contactEmail;
    }

    /**
     *  <p>Custom Fields for the Business Unit.</p>
     */

    public com.commercetools.api.models.type.CustomFields getCustom() {
        return this.custom;
    }

    /**
     *  <p>Customer Groups assigned to the Business Unit.</p>
     *  <p>They are considered during <span>line Item price selection</span>, if provided (non-null).</p>
     */

    public java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignment> getCustomerGroupAssignments() {
        return this.customerGroupAssignments;
    }

    /**
     *  <p>Addresses used by the Business Unit.</p>
     */

    public java.util.List<com.commercetools.api.models.common.Address> getAddresses() {
        return this.addresses;
    }

    /**
     *  <p>Unique identifiers of addresses used as shipping addresses.</p>
     */

    public java.util.List<String> getShippingAddressIds() {
        return this.shippingAddressIds;
    }

    /**
     *  <p>Unique identifier of the address used as the default shipping address.</p>
     */

    public String getDefaultShippingAddressId() {
        return this.defaultShippingAddressId;
    }

    /**
     *  <p>Unique identifiers of addresses used as billing addresses.</p>
     */

    public java.util.List<String> getBillingAddressIds() {
        return this.billingAddressIds;
    }

    /**
     *  <p>Unique identifier of the address used as the default billing address.</p>
     */

    public String getDefaultBillingAddressId() {
        return this.defaultBillingAddressId;
    }

    /**
     *  <p>Set to <code>Explicit</code> to prevent the Business Unit inheriting Associates from a parent, set to <code>ExplicitAndFromParent</code> to enable inheritance.</p>
     */

    public com.commercetools.api.models.business_unit.BusinessUnitAssociateMode getAssociateMode() {
        return this.associateMode;
    }

    /**
     *  <p>Associates that are part of the Business Unit in specific <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">roles</a>.</p>
     */

    public java.util.List<com.commercetools.api.models.business_unit.Associate> getAssociates() {
        return this.associates;
    }

    /**
     *  <p>Associates that are inherited from a parent Business Unit. The value of this field is <span>eventually consistent</span> and is only present when the <code>associateMode</code> is set to <code>ExplicitAndFromParent</code>.</p>
     */

    public java.util.List<com.commercetools.api.models.business_unit.InheritedAssociate> getInheritedAssociates() {
        return this.inheritedAssociates;
    }

    /**
     *  <p>Parent unit of the Business Unit. Only present when the <code>unitType</code> is <code>Division</code>.</p>
     */

    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getParentUnit() {
        return this.parentUnit;
    }

    /**
     *  <p>Top-level unit of the Business Unit. The top-level unit is of <code>unitType</code> <code>Company</code>.</p>
     */

    public com.commercetools.api.models.business_unit.BusinessUnitKeyReference getTopLevelUnit() {
        return this.topLevelUnit;
    }

    /**
     *  <p>Determines whether the Business Unit can inherit Approval Rules from a parent. Always <code>Explicit</code> for <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitType" rel="nofollow">Companies</a> and defaults to <code>ExplicitAndFromParent</code> for <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitType" rel="nofollow">Divisions</a>.</p>
     */

    public com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode getApprovalRuleMode() {
        return this.approvalRuleMode;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setCreatedAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    public void setLastModifiedBy(final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public void setCreatedBy(final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setStatus(final com.commercetools.api.models.business_unit.BusinessUnitStatus status) {
        this.status = status;
    }

    public void setStores(final com.commercetools.api.models.store.StoreKeyReference... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
    }

    public void setStores(final java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores) {
        this.stores = stores;
    }

    public void setInheritedStores(final com.commercetools.api.models.store.StoreKeyReference... inheritedStores) {
        this.inheritedStores = new ArrayList<>(Arrays.asList(inheritedStores));
    }

    public void setInheritedStores(
            final java.util.List<com.commercetools.api.models.store.StoreKeyReference> inheritedStores) {
        this.inheritedStores = inheritedStores;
    }

    public void setStoreMode(final com.commercetools.api.models.business_unit.BusinessUnitStoreMode storeMode) {
        this.storeMode = storeMode;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setContactEmail(final String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFields custom) {
        this.custom = custom;
    }

    public void setCustomerGroupAssignments(
            final com.commercetools.api.models.customer.CustomerGroupAssignment... customerGroupAssignments) {
        this.customerGroupAssignments = new ArrayList<>(Arrays.asList(customerGroupAssignments));
    }

    public void setCustomerGroupAssignments(
            final java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignment> customerGroupAssignments) {
        this.customerGroupAssignments = customerGroupAssignments;
    }

    public void setAddresses(final com.commercetools.api.models.common.Address... addresses) {
        this.addresses = new ArrayList<>(Arrays.asList(addresses));
    }

    public void setAddresses(final java.util.List<com.commercetools.api.models.common.Address> addresses) {
        this.addresses = addresses;
    }

    public void setShippingAddressIds(final String... shippingAddressIds) {
        this.shippingAddressIds = new ArrayList<>(Arrays.asList(shippingAddressIds));
    }

    public void setShippingAddressIds(final java.util.List<String> shippingAddressIds) {
        this.shippingAddressIds = shippingAddressIds;
    }

    public void setDefaultShippingAddressId(final String defaultShippingAddressId) {
        this.defaultShippingAddressId = defaultShippingAddressId;
    }

    public void setBillingAddressIds(final String... billingAddressIds) {
        this.billingAddressIds = new ArrayList<>(Arrays.asList(billingAddressIds));
    }

    public void setBillingAddressIds(final java.util.List<String> billingAddressIds) {
        this.billingAddressIds = billingAddressIds;
    }

    public void setDefaultBillingAddressId(final String defaultBillingAddressId) {
        this.defaultBillingAddressId = defaultBillingAddressId;
    }

    public void setAssociateMode(
            final com.commercetools.api.models.business_unit.BusinessUnitAssociateMode associateMode) {
        this.associateMode = associateMode;
    }

    public void setAssociates(final com.commercetools.api.models.business_unit.Associate... associates) {
        this.associates = new ArrayList<>(Arrays.asList(associates));
    }

    public void setAssociates(final java.util.List<com.commercetools.api.models.business_unit.Associate> associates) {
        this.associates = associates;
    }

    public void setInheritedAssociates(
            final com.commercetools.api.models.business_unit.InheritedAssociate... inheritedAssociates) {
        this.inheritedAssociates = new ArrayList<>(Arrays.asList(inheritedAssociates));
    }

    public void setInheritedAssociates(
            final java.util.List<com.commercetools.api.models.business_unit.InheritedAssociate> inheritedAssociates) {
        this.inheritedAssociates = inheritedAssociates;
    }

    public void setParentUnit(final com.commercetools.api.models.business_unit.BusinessUnitKeyReference parentUnit) {
        this.parentUnit = parentUnit;
    }

    public void setTopLevelUnit(
            final com.commercetools.api.models.business_unit.BusinessUnitKeyReference topLevelUnit) {
        this.topLevelUnit = topLevelUnit;
    }

    public void setApprovalRuleMode(
            final com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode approvalRuleMode) {
        this.approvalRuleMode = approvalRuleMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        BusinessUnitImpl that = (BusinessUnitImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(createdBy, that.createdBy)
                .append(key, that.key)
                .append(status, that.status)
                .append(stores, that.stores)
                .append(inheritedStores, that.inheritedStores)
                .append(storeMode, that.storeMode)
                .append(unitType, that.unitType)
                .append(name, that.name)
                .append(contactEmail, that.contactEmail)
                .append(custom, that.custom)
                .append(customerGroupAssignments, that.customerGroupAssignments)
                .append(addresses, that.addresses)
                .append(shippingAddressIds, that.shippingAddressIds)
                .append(defaultShippingAddressId, that.defaultShippingAddressId)
                .append(billingAddressIds, that.billingAddressIds)
                .append(defaultBillingAddressId, that.defaultBillingAddressId)
                .append(associateMode, that.associateMode)
                .append(associates, that.associates)
                .append(inheritedAssociates, that.inheritedAssociates)
                .append(parentUnit, that.parentUnit)
                .append(topLevelUnit, that.topLevelUnit)
                .append(approvalRuleMode, that.approvalRuleMode)
                .append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(createdBy, that.createdBy)
                .append(key, that.key)
                .append(status, that.status)
                .append(stores, that.stores)
                .append(inheritedStores, that.inheritedStores)
                .append(storeMode, that.storeMode)
                .append(unitType, that.unitType)
                .append(name, that.name)
                .append(contactEmail, that.contactEmail)
                .append(custom, that.custom)
                .append(customerGroupAssignments, that.customerGroupAssignments)
                .append(addresses, that.addresses)
                .append(shippingAddressIds, that.shippingAddressIds)
                .append(defaultShippingAddressId, that.defaultShippingAddressId)
                .append(billingAddressIds, that.billingAddressIds)
                .append(defaultBillingAddressId, that.defaultBillingAddressId)
                .append(associateMode, that.associateMode)
                .append(associates, that.associates)
                .append(inheritedAssociates, that.inheritedAssociates)
                .append(parentUnit, that.parentUnit)
                .append(topLevelUnit, that.topLevelUnit)
                .append(approvalRuleMode, that.approvalRuleMode)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(version)
                .append(createdAt)
                .append(lastModifiedAt)
                .append(lastModifiedBy)
                .append(createdBy)
                .append(key)
                .append(status)
                .append(stores)
                .append(inheritedStores)
                .append(storeMode)
                .append(unitType)
                .append(name)
                .append(contactEmail)
                .append(custom)
                .append(customerGroupAssignments)
                .append(addresses)
                .append(shippingAddressIds)
                .append(defaultShippingAddressId)
                .append(billingAddressIds)
                .append(defaultBillingAddressId)
                .append(associateMode)
                .append(associates)
                .append(inheritedAssociates)
                .append(parentUnit)
                .append(topLevelUnit)
                .append(approvalRuleMode)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("version", version)
                .append("createdAt", createdAt)
                .append("lastModifiedAt", lastModifiedAt)
                .append("lastModifiedBy", lastModifiedBy)
                .append("createdBy", createdBy)
                .append("key", key)
                .append("status", status)
                .append("stores", stores)
                .append("inheritedStores", inheritedStores)
                .append("storeMode", storeMode)
                .append("unitType", unitType)
                .append("name", name)
                .append("contactEmail", contactEmail)
                .append("custom", custom)
                .append("customerGroupAssignments", customerGroupAssignments)
                .append("addresses", addresses)
                .append("shippingAddressIds", shippingAddressIds)
                .append("defaultShippingAddressId", defaultShippingAddressId)
                .append("billingAddressIds", billingAddressIds)
                .append("defaultBillingAddressId", defaultBillingAddressId)
                .append("associateMode", associateMode)
                .append("associates", associates)
                .append("inheritedAssociates", inheritedAssociates)
                .append("parentUnit", parentUnit)
                .append("topLevelUnit", topLevelUnit)
                .append("approvalRuleMode", approvalRuleMode)
                .build();
    }

    @Override
    public BusinessUnit copyDeep() {
        return BusinessUnit.deepCopy(this);
    }
}
