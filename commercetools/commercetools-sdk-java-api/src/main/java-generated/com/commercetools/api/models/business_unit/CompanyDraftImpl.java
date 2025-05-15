
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
 *  <p>Draft type to represent the top level of a business. Contains the fields and values of the generic BusinessUnitDraft that are used specifically for creating a Company.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CompanyDraftImpl implements CompanyDraft, ModelBase {

    private String key;

    private com.commercetools.api.models.business_unit.BusinessUnitStatus status;

    private java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores;

    private com.commercetools.api.models.business_unit.BusinessUnitStoreMode storeMode;

    private com.commercetools.api.models.business_unit.BusinessUnitType unitType;

    private String name;

    private String contactEmail;

    private com.commercetools.api.models.business_unit.BusinessUnitAssociateMode associateMode;

    private java.util.List<com.commercetools.api.models.business_unit.AssociateDraft> associates;

    private com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode approvalRuleMode;

    private java.util.List<com.commercetools.api.models.common.BaseAddress> addresses;

    private java.util.List<Integer> shippingAddresses;

    private Integer defaultShippingAddress;

    private java.util.List<Integer> billingAddresses;

    private Integer defaultBillingAddress;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CompanyDraftImpl(@JsonProperty("key") final String key,
            @JsonProperty("status") final com.commercetools.api.models.business_unit.BusinessUnitStatus status,
            @JsonProperty("stores") final java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores,
            @JsonProperty("storeMode") final com.commercetools.api.models.business_unit.BusinessUnitStoreMode storeMode,
            @JsonProperty("name") final String name, @JsonProperty("contactEmail") final String contactEmail,
            @JsonProperty("associateMode") final com.commercetools.api.models.business_unit.BusinessUnitAssociateMode associateMode,
            @JsonProperty("associates") final java.util.List<com.commercetools.api.models.business_unit.AssociateDraft> associates,
            @JsonProperty("approvalRuleMode") final com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode approvalRuleMode,
            @JsonProperty("addresses") final java.util.List<com.commercetools.api.models.common.BaseAddress> addresses,
            @JsonProperty("shippingAddresses") final java.util.List<Integer> shippingAddresses,
            @JsonProperty("defaultShippingAddress") final Integer defaultShippingAddress,
            @JsonProperty("billingAddresses") final java.util.List<Integer> billingAddresses,
            @JsonProperty("defaultBillingAddress") final Integer defaultBillingAddress,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.key = key;
        this.status = status;
        this.stores = stores;
        this.storeMode = storeMode;
        this.name = name;
        this.contactEmail = contactEmail;
        this.associateMode = associateMode;
        this.associates = associates;
        this.approvalRuleMode = approvalRuleMode;
        this.addresses = addresses;
        this.shippingAddresses = shippingAddresses;
        this.defaultShippingAddress = defaultShippingAddress;
        this.billingAddresses = billingAddresses;
        this.defaultBillingAddress = defaultBillingAddress;
        this.custom = custom;
        this.unitType = BusinessUnitType.findEnum("Company");
    }

    /**
     * create empty instance
     */
    public CompanyDraftImpl() {
        this.unitType = BusinessUnitType.findEnum("Company");
    }

    /**
     *  <p>User-defined unique and immutable identifier for the Business Unit.</p>
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
     *  <p>Sets the Stores the Business Unit is associated with. Can only be set when <code>storeMode</code> is <code>Explicit</code>. Defaults to empty for Companies and not set for Divisions.</p>
     *  <p>If the Business Unit has Stores defined, then all of its Carts, Orders, Quotes, Quote Requests, or Shopping Lists must belong to one of the Business Unit's Stores.</p>
     *  <p>If the Business Unit has no Stores, then all of its Carts, Orders, Quotes, Quote Requests, or Shopping Lists must not belong to any Store.</p>
     */

    public java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> getStores() {
        return this.stores;
    }

    /**
     *  <p>Defines whether the Stores of the Business Unit are set directly on the Business Unit or are inherited from a parent. <code>storeMode</code> is always <code>Explicit</code> for Companies and defaults to <code>FromParent</code> for Divisions.</p>
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
     *  <p>Determines whether the Business Unit can inherit Associates from a parent. Always <code>Explicit</code> for Companies and defaults to <code>ExplicitAndFromParent</code> for Divisions.</p>
     */

    public com.commercetools.api.models.business_unit.BusinessUnitAssociateMode getAssociateMode() {
        return this.associateMode;
    }

    /**
     *  <p>List of members that are part of the Business Unit in specific roles.</p>
     */

    public java.util.List<com.commercetools.api.models.business_unit.AssociateDraft> getAssociates() {
        return this.associates;
    }

    /**
     *  <p>Determines whether the Business Unit can inherit Approval Rules from a parent. For Companies, the value of this field is always <code>Explicit</code>. For Divisions, the default value is <code>ExplicitAndFromParent</code>.</p>
     */

    public com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode getApprovalRuleMode() {
        return this.approvalRuleMode;
    }

    /**
     *  <p>Addresses used by the Business Unit.</p>
     */

    public java.util.List<com.commercetools.api.models.common.BaseAddress> getAddresses() {
        return this.addresses;
    }

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as shipping addresses. The <code>shippingAddressIds</code> of the Customer will be replaced by these addresses.</p>
     */

    public java.util.List<Integer> getShippingAddresses() {
        return this.shippingAddresses;
    }

    /**
     *  <p>Index of the entry in <code>addresses</code> to set as the default shipping address.</p>
     */

    public Integer getDefaultShippingAddress() {
        return this.defaultShippingAddress;
    }

    /**
     *  <p>Indexes of entries in <code>addresses</code> to set as billing addresses. The <code>billingAddressIds</code> of the Customer will be replaced by these addresses.</p>
     */

    public java.util.List<Integer> getBillingAddresses() {
        return this.billingAddresses;
    }

    /**
     *  <p>Index of the entry in <code>addresses</code> to set as the default billing address.</p>
     */

    public Integer getDefaultBillingAddress() {
        return this.defaultBillingAddress;
    }

    /**
     *  <p>Custom Fields for the Business Unit.</p>
     */

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setStatus(final com.commercetools.api.models.business_unit.BusinessUnitStatus status) {
        this.status = status;
    }

    public void setStores(final com.commercetools.api.models.store.StoreResourceIdentifier... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
    }

    public void setStores(final java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores) {
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

    public void setAssociateMode(
            final com.commercetools.api.models.business_unit.BusinessUnitAssociateMode associateMode) {
        this.associateMode = associateMode;
    }

    public void setAssociates(final com.commercetools.api.models.business_unit.AssociateDraft... associates) {
        this.associates = new ArrayList<>(Arrays.asList(associates));
    }

    public void setAssociates(
            final java.util.List<com.commercetools.api.models.business_unit.AssociateDraft> associates) {
        this.associates = associates;
    }

    public void setApprovalRuleMode(
            final com.commercetools.api.models.business_unit.BusinessUnitApprovalRuleMode approvalRuleMode) {
        this.approvalRuleMode = approvalRuleMode;
    }

    public void setAddresses(final com.commercetools.api.models.common.BaseAddress... addresses) {
        this.addresses = new ArrayList<>(Arrays.asList(addresses));
    }

    public void setAddresses(final java.util.List<com.commercetools.api.models.common.BaseAddress> addresses) {
        this.addresses = addresses;
    }

    public void setShippingAddresses(final Integer... shippingAddresses) {
        this.shippingAddresses = new ArrayList<>(Arrays.asList(shippingAddresses));
    }

    public void setShippingAddresses(final java.util.List<Integer> shippingAddresses) {
        this.shippingAddresses = shippingAddresses;
    }

    public void setDefaultShippingAddress(final Integer defaultShippingAddress) {
        this.defaultShippingAddress = defaultShippingAddress;
    }

    public void setBillingAddresses(final Integer... billingAddresses) {
        this.billingAddresses = new ArrayList<>(Arrays.asList(billingAddresses));
    }

    public void setBillingAddresses(final java.util.List<Integer> billingAddresses) {
        this.billingAddresses = billingAddresses;
    }

    public void setDefaultBillingAddress(final Integer defaultBillingAddress) {
        this.defaultBillingAddress = defaultBillingAddress;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CompanyDraftImpl that = (CompanyDraftImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(status, that.status)
                .append(stores, that.stores)
                .append(storeMode, that.storeMode)
                .append(unitType, that.unitType)
                .append(name, that.name)
                .append(contactEmail, that.contactEmail)
                .append(associateMode, that.associateMode)
                .append(associates, that.associates)
                .append(approvalRuleMode, that.approvalRuleMode)
                .append(addresses, that.addresses)
                .append(shippingAddresses, that.shippingAddresses)
                .append(defaultShippingAddress, that.defaultShippingAddress)
                .append(billingAddresses, that.billingAddresses)
                .append(defaultBillingAddress, that.defaultBillingAddress)
                .append(custom, that.custom)
                .append(key, that.key)
                .append(status, that.status)
                .append(stores, that.stores)
                .append(storeMode, that.storeMode)
                .append(unitType, that.unitType)
                .append(name, that.name)
                .append(contactEmail, that.contactEmail)
                .append(associateMode, that.associateMode)
                .append(associates, that.associates)
                .append(approvalRuleMode, that.approvalRuleMode)
                .append(addresses, that.addresses)
                .append(shippingAddresses, that.shippingAddresses)
                .append(defaultShippingAddress, that.defaultShippingAddress)
                .append(billingAddresses, that.billingAddresses)
                .append(defaultBillingAddress, that.defaultBillingAddress)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key)
                .append(status)
                .append(stores)
                .append(storeMode)
                .append(unitType)
                .append(name)
                .append(contactEmail)
                .append(associateMode)
                .append(associates)
                .append(approvalRuleMode)
                .append(addresses)
                .append(shippingAddresses)
                .append(defaultShippingAddress)
                .append(billingAddresses)
                .append(defaultBillingAddress)
                .append(custom)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("key", key)
                .append("status", status)
                .append("stores", stores)
                .append("storeMode", storeMode)
                .append("unitType", unitType)
                .append("name", name)
                .append("contactEmail", contactEmail)
                .append("associateMode", associateMode)
                .append("associates", associates)
                .append("approvalRuleMode", approvalRuleMode)
                .append("addresses", addresses)
                .append("shippingAddresses", shippingAddresses)
                .append("defaultShippingAddress", defaultShippingAddress)
                .append("billingAddresses", billingAddresses)
                .append("defaultBillingAddress", defaultBillingAddress)
                .append("custom", custom)
                .build();
    }

    @Override
    public CompanyDraft copyDeep() {
        return CompanyDraft.deepCopy(this);
    }
}
