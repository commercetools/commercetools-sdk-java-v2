
package com.commercetools.api.models.business_unit;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.customer.CustomerGroupAssignment;
import com.commercetools.api.models.store.StoreKeyReference;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generic type to model the fields that all types of Business Units have in common.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnit businessUnit = BusinessUnit.companyBuilder()
 *             id("{id}")
 *             version(0.3)
 *             createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             key("{key}")
 *             status(BusinessUnitStatus.ACTIVE)
 *             storeMode(BusinessUnitStoreMode.EXPLICIT)
 *             name("{name}")
 *             plusAddresses(addressesBuilder -> addressesBuilder)
 *             plusShippingAddressIds(shippingAddressIdsBuilder -> shippingAddressIdsBuilder)
 *             plusBillingAddressIds(billingAddressIdsBuilder -> billingAddressIdsBuilder)
 *             associateMode(BusinessUnitAssociateMode.EXPLICIT)
 *             plusAssociates(associatesBuilder -> associatesBuilder)
 *             topLevelUnit(topLevelUnitBuilder -> topLevelUnitBuilder)
 *             approvalRuleMode(BusinessUnitApprovalRuleMode.EXPLICIT)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "unitType", defaultImpl = BusinessUnitImpl.class, visible = true)
@JsonDeserialize(as = BusinessUnitImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface BusinessUnit extends BaseResource, com.commercetools.api.models.WithKey {

    /**
     *  <p>Unique identifier of the Business Unit.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the Business Unit.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Date and time (UTC) the Business Unit was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the Business Unit was last updated.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>IDs and references that last modified the BusinessUnit.</p>
     * @return lastModifiedBy
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>IDs and references that created the BusinessUnit.</p>
     * @return createdBy
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>User-defined unique and immutable identifier of the Business Unit.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Indicates whether the Business Unit can be edited and used in <span>Orders</span>.</p>
     * @return status
     */
    @NotNull
    @JsonProperty("status")
    public BusinessUnitStatus getStatus();

    /**
     *  <p>References to <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> the Business Unit is associated with. Only present when <code>storeMode</code> is <code>Explicit</code>.</p>
     *  <p>If the Business Unit has Stores defined, then all of its <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quotes</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">Quote Requests</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">Shopping Lists</a> must belong to one of the Business Unit's Stores.</p>
     *  <p>If the Business Unit has no Stores, then all of its <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quotes</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">Quote Requests</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">Shopping Lists</a> must not belong to any Store.</p>
     * @return stores
     */
    @Valid
    @JsonProperty("stores")
    public List<StoreKeyReference> getStores();

    /**
     *  <p>Stores that are inherited from a parent Business Unit. The value of this field is <span>eventually consistent</span> and is only present when the <code>storeMode</code> is set to <code>FromParent</code>.</p>
     * @return inheritedStores
     */
    @Valid
    @JsonProperty("inheritedStores")
    public List<StoreKeyReference> getInheritedStores();

    /**
     *  <p>Defines whether the Stores of the Business Unit are set directly on the Business Unit or are inherited from a parent.</p>
     * @return storeMode
     */
    @NotNull
    @JsonProperty("storeMode")
    public BusinessUnitStoreMode getStoreMode();

    /**
     *  <p>Type of the Business Unit indicating its position in a hierarchy.</p>
     * @return unitType
     */
    @NotNull
    @JsonProperty("unitType")
    public BusinessUnitType getUnitType();

    /**
     *  <p>Name of the Business Unit.</p>
     * @return name
     */
    @NotNull
    @JsonProperty("name")
    public String getName();

    /**
     *  <p>Email address of the Business Unit.</p>
     * @return contactEmail
     */

    @JsonProperty("contactEmail")
    public String getContactEmail();

    /**
     *  <p>Custom Fields of the Business Unit.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *  <p>Customer Groups assigned to the Business Unit.</p>
     *  <p>They are considered during <span>line Item price selection</span>, if provided (non-null).</p>
     * @return customerGroupAssignments
     */
    @Valid
    @JsonProperty("customerGroupAssignments")
    public List<CustomerGroupAssignment> getCustomerGroupAssignments();

    /**
     *  <p>Addresses used by the Business Unit.</p>
     * @return addresses
     */
    @NotNull
    @Valid
    @JsonProperty("addresses")
    public List<Address> getAddresses();

    /**
     *  <p>Unique identifiers of addresses used as shipping addresses.</p>
     * @return shippingAddressIds
     */
    @NotNull
    @JsonProperty("shippingAddressIds")
    public List<String> getShippingAddressIds();

    /**
     *  <p>Unique identifier of the address used as the default shipping address.</p>
     * @return defaultShippingAddressId
     */

    @JsonProperty("defaultShippingAddressId")
    public String getDefaultShippingAddressId();

    /**
     *  <p>Unique identifiers of addresses used as billing addresses.</p>
     * @return billingAddressIds
     */
    @NotNull
    @JsonProperty("billingAddressIds")
    public List<String> getBillingAddressIds();

    /**
     *  <p>Unique identifier of the address used as the default billing address.</p>
     * @return defaultBillingAddressId
     */

    @JsonProperty("defaultBillingAddressId")
    public String getDefaultBillingAddressId();

    /**
     *  <p>Set to <code>Explicit</code> to prevent the Business Unit inheriting Associates from a parent, set to <code>ExplicitAndFromParent</code> to enable inheritance.</p>
     * @return associateMode
     */
    @NotNull
    @JsonProperty("associateMode")
    public BusinessUnitAssociateMode getAssociateMode();

    /**
     *  <p>Associates that are part of the Business Unit in specific <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">roles</a>.</p>
     * @return associates
     */
    @NotNull
    @Valid
    @JsonProperty("associates")
    public List<Associate> getAssociates();

    /**
     *  <p>Associates that are inherited from a parent Business Unit. The value of this field is <span>eventually consistent</span> and is only present when the <code>associateMode</code> is set to <code>ExplicitAndFromParent</code>.</p>
     * @return inheritedAssociates
     */
    @Valid
    @JsonProperty("inheritedAssociates")
    public List<InheritedAssociate> getInheritedAssociates();

    /**
     *  <p>Parent unit of the Business Unit. Only present when the <code>unitType</code> is <code>Division</code>.</p>
     * @return parentUnit
     */
    @Valid
    @JsonProperty("parentUnit")
    public BusinessUnitKeyReference getParentUnit();

    /**
     *  <p>Top-level unit of the Business Unit. The top-level unit is of <code>unitType</code> <code>Company</code>.</p>
     * @return topLevelUnit
     */
    @NotNull
    @Valid
    @JsonProperty("topLevelUnit")
    public BusinessUnitKeyReference getTopLevelUnit();

    /**
     *  <p>Determines whether the Business Unit can inherit Approval Rules from a parent. Always <code>Explicit</code> for <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitType" rel="nofollow">Companies</a> and defaults to <code>ExplicitAndFromParent</code> for <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitType" rel="nofollow">Divisions</a>.</p>
     * @return approvalRuleMode
     */
    @NotNull
    @JsonProperty("approvalRuleMode")
    public BusinessUnitApprovalRuleMode getApprovalRuleMode();

    /**
     *  <p>Unique identifier of the Business Unit.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Current version of the Business Unit.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Date and time (UTC) the Business Unit was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Date and time (UTC) the Business Unit was last updated.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>IDs and references that last modified the BusinessUnit.</p>
     * @param lastModifiedBy value to be set
     */

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    /**
     *  <p>IDs and references that created the BusinessUnit.</p>
     * @param createdBy value to be set
     */

    public void setCreatedBy(final CreatedBy createdBy);

    /**
     *  <p>User-defined unique and immutable identifier of the Business Unit.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>Indicates whether the Business Unit can be edited and used in <span>Orders</span>.</p>
     * @param status value to be set
     */

    public void setStatus(final BusinessUnitStatus status);

    /**
     *  <p>References to <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> the Business Unit is associated with. Only present when <code>storeMode</code> is <code>Explicit</code>.</p>
     *  <p>If the Business Unit has Stores defined, then all of its <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quotes</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">Quote Requests</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">Shopping Lists</a> must belong to one of the Business Unit's Stores.</p>
     *  <p>If the Business Unit has no Stores, then all of its <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quotes</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">Quote Requests</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">Shopping Lists</a> must not belong to any Store.</p>
     * @param stores values to be set
     */

    @JsonIgnore
    public void setStores(final StoreKeyReference... stores);

    /**
     *  <p>References to <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> the Business Unit is associated with. Only present when <code>storeMode</code> is <code>Explicit</code>.</p>
     *  <p>If the Business Unit has Stores defined, then all of its <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quotes</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">Quote Requests</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">Shopping Lists</a> must belong to one of the Business Unit's Stores.</p>
     *  <p>If the Business Unit has no Stores, then all of its <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Carts</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Order" rel="nofollow">Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">Recurring Orders</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Quote" rel="nofollow">Quotes</a>, <a href="https://docs.commercetools.com/apis/ctp:api:type:QuoteRequest" rel="nofollow">Quote Requests</a>, or <a href="https://docs.commercetools.com/apis/ctp:api:type:ShoppingList" rel="nofollow">Shopping Lists</a> must not belong to any Store.</p>
     * @param stores values to be set
     */

    public void setStores(final List<StoreKeyReference> stores);

    /**
     *  <p>Stores that are inherited from a parent Business Unit. The value of this field is <span>eventually consistent</span> and is only present when the <code>storeMode</code> is set to <code>FromParent</code>.</p>
     * @param inheritedStores values to be set
     */

    @JsonIgnore
    public void setInheritedStores(final StoreKeyReference... inheritedStores);

    /**
     *  <p>Stores that are inherited from a parent Business Unit. The value of this field is <span>eventually consistent</span> and is only present when the <code>storeMode</code> is set to <code>FromParent</code>.</p>
     * @param inheritedStores values to be set
     */

    public void setInheritedStores(final List<StoreKeyReference> inheritedStores);

    /**
     *  <p>Defines whether the Stores of the Business Unit are set directly on the Business Unit or are inherited from a parent.</p>
     * @param storeMode value to be set
     */

    public void setStoreMode(final BusinessUnitStoreMode storeMode);

    /**
     *  <p>Name of the Business Unit.</p>
     * @param name value to be set
     */

    public void setName(final String name);

    /**
     *  <p>Email address of the Business Unit.</p>
     * @param contactEmail value to be set
     */

    public void setContactEmail(final String contactEmail);

    /**
     *  <p>Custom Fields of the Business Unit.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFields custom);

    /**
     *  <p>Customer Groups assigned to the Business Unit.</p>
     *  <p>They are considered during <span>line Item price selection</span>, if provided (non-null).</p>
     * @param customerGroupAssignments values to be set
     */

    @JsonIgnore
    public void setCustomerGroupAssignments(final CustomerGroupAssignment... customerGroupAssignments);

    /**
     *  <p>Customer Groups assigned to the Business Unit.</p>
     *  <p>They are considered during <span>line Item price selection</span>, if provided (non-null).</p>
     * @param customerGroupAssignments values to be set
     */

    public void setCustomerGroupAssignments(final List<CustomerGroupAssignment> customerGroupAssignments);

    /**
     *  <p>Addresses used by the Business Unit.</p>
     * @param addresses values to be set
     */

    @JsonIgnore
    public void setAddresses(final Address... addresses);

    /**
     *  <p>Addresses used by the Business Unit.</p>
     * @param addresses values to be set
     */

    public void setAddresses(final List<Address> addresses);

    /**
     *  <p>Unique identifiers of addresses used as shipping addresses.</p>
     * @param shippingAddressIds values to be set
     */

    @JsonIgnore
    public void setShippingAddressIds(final String... shippingAddressIds);

    /**
     *  <p>Unique identifiers of addresses used as shipping addresses.</p>
     * @param shippingAddressIds values to be set
     */

    public void setShippingAddressIds(final List<String> shippingAddressIds);

    /**
     *  <p>Unique identifier of the address used as the default shipping address.</p>
     * @param defaultShippingAddressId value to be set
     */

    public void setDefaultShippingAddressId(final String defaultShippingAddressId);

    /**
     *  <p>Unique identifiers of addresses used as billing addresses.</p>
     * @param billingAddressIds values to be set
     */

    @JsonIgnore
    public void setBillingAddressIds(final String... billingAddressIds);

    /**
     *  <p>Unique identifiers of addresses used as billing addresses.</p>
     * @param billingAddressIds values to be set
     */

    public void setBillingAddressIds(final List<String> billingAddressIds);

    /**
     *  <p>Unique identifier of the address used as the default billing address.</p>
     * @param defaultBillingAddressId value to be set
     */

    public void setDefaultBillingAddressId(final String defaultBillingAddressId);

    /**
     *  <p>Set to <code>Explicit</code> to prevent the Business Unit inheriting Associates from a parent, set to <code>ExplicitAndFromParent</code> to enable inheritance.</p>
     * @param associateMode value to be set
     */

    public void setAssociateMode(final BusinessUnitAssociateMode associateMode);

    /**
     *  <p>Associates that are part of the Business Unit in specific <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">roles</a>.</p>
     * @param associates values to be set
     */

    @JsonIgnore
    public void setAssociates(final Associate... associates);

    /**
     *  <p>Associates that are part of the Business Unit in specific <a href="https://docs.commercetools.com/apis/ctp:api:type:AssociateRole" rel="nofollow">roles</a>.</p>
     * @param associates values to be set
     */

    public void setAssociates(final List<Associate> associates);

    /**
     *  <p>Associates that are inherited from a parent Business Unit. The value of this field is <span>eventually consistent</span> and is only present when the <code>associateMode</code> is set to <code>ExplicitAndFromParent</code>.</p>
     * @param inheritedAssociates values to be set
     */

    @JsonIgnore
    public void setInheritedAssociates(final InheritedAssociate... inheritedAssociates);

    /**
     *  <p>Associates that are inherited from a parent Business Unit. The value of this field is <span>eventually consistent</span> and is only present when the <code>associateMode</code> is set to <code>ExplicitAndFromParent</code>.</p>
     * @param inheritedAssociates values to be set
     */

    public void setInheritedAssociates(final List<InheritedAssociate> inheritedAssociates);

    /**
     *  <p>Parent unit of the Business Unit. Only present when the <code>unitType</code> is <code>Division</code>.</p>
     * @param parentUnit value to be set
     */

    public void setParentUnit(final BusinessUnitKeyReference parentUnit);

    /**
     *  <p>Top-level unit of the Business Unit. The top-level unit is of <code>unitType</code> <code>Company</code>.</p>
     * @param topLevelUnit value to be set
     */

    public void setTopLevelUnit(final BusinessUnitKeyReference topLevelUnit);

    /**
     *  <p>Determines whether the Business Unit can inherit Approval Rules from a parent. Always <code>Explicit</code> for <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitType" rel="nofollow">Companies</a> and defaults to <code>ExplicitAndFromParent</code> for <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitType" rel="nofollow">Divisions</a>.</p>
     * @param approvalRuleMode value to be set
     */

    public void setApprovalRuleMode(final BusinessUnitApprovalRuleMode approvalRuleMode);

    public BusinessUnit copyDeep();

    /**
     * factory method to create a deep copy of BusinessUnit
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static BusinessUnit deepCopy(@Nullable final BusinessUnit template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof BusinessUnitImpl)) {
            return template.copyDeep();
        }
        BusinessUnitImpl instance = new BusinessUnitImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setKey(template.getKey());
        instance.setStatus(template.getStatus());
        instance.setStores(Optional.ofNullable(template.getStores())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.store.StoreKeyReference::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setInheritedStores(Optional.ofNullable(template.getInheritedStores())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.store.StoreKeyReference::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setStoreMode(template.getStoreMode());
        instance.setName(template.getName());
        instance.setContactEmail(template.getContactEmail());
        instance.setCustom(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustom()));
        instance.setCustomerGroupAssignments(Optional.ofNullable(template.getCustomerGroupAssignments())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.customer.CustomerGroupAssignment::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setAddresses(Optional.ofNullable(template.getAddresses())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.Address::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setShippingAddressIds(
            Optional.ofNullable(template.getShippingAddressIds()).map(ArrayList::new).orElse(null));
        instance.setDefaultShippingAddressId(template.getDefaultShippingAddressId());
        instance.setBillingAddressIds(
            Optional.ofNullable(template.getBillingAddressIds()).map(ArrayList::new).orElse(null));
        instance.setDefaultBillingAddressId(template.getDefaultBillingAddressId());
        instance.setAssociateMode(template.getAssociateMode());
        instance.setAssociates(Optional.ofNullable(template.getAssociates())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.business_unit.Associate::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setInheritedAssociates(Optional.ofNullable(template.getInheritedAssociates())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.business_unit.InheritedAssociate::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setParentUnit(
            com.commercetools.api.models.business_unit.BusinessUnitKeyReference.deepCopy(template.getParentUnit()));
        instance.setTopLevelUnit(
            com.commercetools.api.models.business_unit.BusinessUnitKeyReference.deepCopy(template.getTopLevelUnit()));
        instance.setApprovalRuleMode(template.getApprovalRuleMode());
        return instance;
    }

    /**
     * builder for company subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.CompanyBuilder companyBuilder() {
        return com.commercetools.api.models.business_unit.CompanyBuilder.of();
    }

    /**
     * builder for division subtype
     * @return builder
     */
    public static com.commercetools.api.models.business_unit.DivisionBuilder divisionBuilder() {
        return com.commercetools.api.models.business_unit.DivisionBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withBusinessUnit(Function<BusinessUnit, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<BusinessUnit> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<BusinessUnit>() {
            @Override
            public String toString() {
                return "TypeReference<BusinessUnit>";
            }
        };
    }
}
