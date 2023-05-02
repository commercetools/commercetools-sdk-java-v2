
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

/**
 *  <p>Business Unit type to represent the top level of a business. Contains specific fields and values that differentiate a Company from the generic BusinessUnit.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CompanyImpl implements Company, ModelBase {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    private com.commercetools.api.models.common.CreatedBy createdBy;

    private String key;

    private com.commercetools.api.models.business_unit.BusinessUnitStatus status;

    private java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores;

    private com.commercetools.api.models.business_unit.BusinessUnitStoreMode storeMode;

    private com.commercetools.api.models.business_unit.BusinessUnitType unitType;

    private String name;

    private String contactEmail;

    private com.commercetools.api.models.type.CustomFields custom;

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

    /**
     * create instance with all properties
     */
    @JsonCreator
    CompanyImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt,
            @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy,
            @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy,
            @JsonProperty("key") final String key,
            @JsonProperty("status") final com.commercetools.api.models.business_unit.BusinessUnitStatus status,
            @JsonProperty("stores") final java.util.List<com.commercetools.api.models.store.StoreKeyReference> stores,
            @JsonProperty("storeMode") final com.commercetools.api.models.business_unit.BusinessUnitStoreMode storeMode,
            @JsonProperty("name") final String name, @JsonProperty("contactEmail") final String contactEmail,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom,
            @JsonProperty("addresses") final java.util.List<com.commercetools.api.models.common.Address> addresses,
            @JsonProperty("shippingAddressIds") final java.util.List<String> shippingAddressIds,
            @JsonProperty("defaultShippingAddressId") final String defaultShippingAddressId,
            @JsonProperty("billingAddressIds") final java.util.List<String> billingAddressIds,
            @JsonProperty("defaultBillingAddressId") final String defaultBillingAddressId,
            @JsonProperty("associateMode") final com.commercetools.api.models.business_unit.BusinessUnitAssociateMode associateMode,
            @JsonProperty("associates") final java.util.List<com.commercetools.api.models.business_unit.Associate> associates,
            @JsonProperty("inheritedAssociates") final java.util.List<com.commercetools.api.models.business_unit.InheritedAssociate> inheritedAssociates,
            @JsonProperty("parentUnit") final com.commercetools.api.models.business_unit.BusinessUnitKeyReference parentUnit,
            @JsonProperty("topLevelUnit") final com.commercetools.api.models.business_unit.BusinessUnitKeyReference topLevelUnit) {
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.createdBy = createdBy;
        this.key = key;
        this.status = status;
        this.stores = stores;
        this.storeMode = storeMode;
        this.name = name;
        this.contactEmail = contactEmail;
        this.custom = custom;
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
        this.unitType = BusinessUnitType.findEnum("Company");
    }

    /**
     * create empty instance
     */
    public CompanyImpl() {
        this.unitType = BusinessUnitType.findEnum("Company");
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
     *  <p>Present on resources updated after 1 February 2019 except for events not tracked.</p>
     */

    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */

    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>User-defined unique identifier of the Business Unit.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Indicates whether the Business Unit can be edited and used in Orders.</p>
     */

    public com.commercetools.api.models.business_unit.BusinessUnitStatus getStatus() {
        return this.status;
    }

    /**
     *  <p>References to Stores the Business Unit is associated with. Only present when <code>storeMode</code> is <code>Explicit</code>.</p>
     *  <p>If the Business Unit has Stores defined, then all of its Carts, Orders, Quotes, or Quote Requests must belong to one of the Business Unit's Stores.</p>
     *  <p>If the Business Unit has no Stores, then all of its Carts, Orders, Quotes, or Quote Requests must not belong to any Store.</p>
     */

    public java.util.List<com.commercetools.api.models.store.StoreKeyReference> getStores() {
        return this.stores;
    }

    /**
     *  <p>Is always <code>Explicit</code> since a Company cannot have a parent Business Unit that Stores can be inherited from.</p>
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
     *  <p>Is always <code>Explicit</code> since a Company cannot have a parent Business Unit that Associates can be inherited from.</p>
     */

    public com.commercetools.api.models.business_unit.BusinessUnitAssociateMode getAssociateMode() {
        return this.associateMode;
    }

    /**
     *  <p>Associates that are part of the Business Unit in specific roles.</p>
     */

    public java.util.List<com.commercetools.api.models.business_unit.Associate> getAssociates() {
        return this.associates;
    }

    /**
     *  <p>Associates that are inherited from a parent Business Unit. This value of this field is eventually consistent and is only present when the <code>associateMode</code> is set to <code>ExplicitAndFromParent</code>.</p>
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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CompanyImpl that = (CompanyImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(createdBy, that.createdBy)
                .append(key, that.key)
                .append(status, that.status)
                .append(stores, that.stores)
                .append(storeMode, that.storeMode)
                .append(unitType, that.unitType)
                .append(name, that.name)
                .append(contactEmail, that.contactEmail)
                .append(custom, that.custom)
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
                .append(storeMode)
                .append(unitType)
                .append(name)
                .append(contactEmail)
                .append(custom)
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
                .toHashCode();
    }

}
