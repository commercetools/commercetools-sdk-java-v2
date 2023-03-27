
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
 *  <p>Generic draft type to model those fields all Business Units have in common. The additional fields required for creating a Company or Division are represented on CompanyDraft and DivisionDraft.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitDraftImpl implements BusinessUnitDraft, ModelBase {

    private String key;

    private com.commercetools.api.models.business_unit.BusinessUnitStatus status;

    private java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores;

    private com.commercetools.api.models.business_unit.BusinessUnitStoreMode storeMode;

    private com.commercetools.api.models.business_unit.BusinessUnitType unitType;

    private String name;

    private String contactEmail;

    private java.util.List<com.commercetools.api.models.business_unit.AssociateDraft> associates;

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
    BusinessUnitDraftImpl(@JsonProperty("key") final String key,
            @JsonProperty("status") final com.commercetools.api.models.business_unit.BusinessUnitStatus status,
            @JsonProperty("stores") final java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores,
            @JsonProperty("storeMode") final com.commercetools.api.models.business_unit.BusinessUnitStoreMode storeMode,
            @JsonProperty("unitType") final com.commercetools.api.models.business_unit.BusinessUnitType unitType,
            @JsonProperty("name") final String name, @JsonProperty("contactEmail") final String contactEmail,
            @JsonProperty("associates") final java.util.List<com.commercetools.api.models.business_unit.AssociateDraft> associates,
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
        this.unitType = unitType;
        this.name = name;
        this.contactEmail = contactEmail;
        this.associates = associates;
        this.addresses = addresses;
        this.shippingAddresses = shippingAddresses;
        this.defaultShippingAddress = defaultShippingAddress;
        this.billingAddresses = billingAddresses;
        this.defaultBillingAddress = defaultBillingAddress;
        this.custom = custom;
    }

    /**
     * create empty instance
     */
    public BusinessUnitDraftImpl() {
    }

    /**
     *  <p>User-defined unique identifier for the Business Unit.</p>
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
     *  <p>If the Business Unit has Stores defined, then all of its Carts, Orders, Quotes, or Quote Requests must belong to one of the Business Unit's Stores.</p>
     *  <p>If the Business Unit has no Stores, then all of its Carts, Orders, Quotes, or Quote Requests must not belong to any Store.</p>
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
     *  <p>List of members that are part of the Business Unit in specific roles.</p>
     */

    public java.util.List<com.commercetools.api.models.business_unit.AssociateDraft> getAssociates() {
        return this.associates;
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

    public void setAssociates(final com.commercetools.api.models.business_unit.AssociateDraft... associates) {
        this.associates = new ArrayList<>(Arrays.asList(associates));
    }

    public void setAssociates(
            final java.util.List<com.commercetools.api.models.business_unit.AssociateDraft> associates) {
        this.associates = associates;
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

        BusinessUnitDraftImpl that = (BusinessUnitDraftImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(status, that.status)
                .append(stores, that.stores)
                .append(storeMode, that.storeMode)
                .append(unitType, that.unitType)
                .append(name, that.name)
                .append(contactEmail, that.contactEmail)
                .append(associates, that.associates)
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
                .append(associates)
                .append(addresses)
                .append(shippingAddresses)
                .append(defaultShippingAddress)
                .append(billingAddresses)
                .append(defaultBillingAddress)
                .append(custom)
                .toHashCode();
    }

}
