
package com.commercetools.importapi.models.business_units;

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
 *  <p>Represents the data used to import a BusinessUnit. Can be of type Company or Division.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitImportImpl implements BusinessUnitImport, ModelBase {

    private com.commercetools.importapi.models.business_units.BusinessUnitType unitType;

    private String key;

    private String name;

    private com.commercetools.importapi.models.business_units.BusinessUnitStatus status;

    private String contactEmail;

    private java.util.List<com.commercetools.importapi.models.business_units.AssociateDraft> associates;

    private java.util.List<com.commercetools.importapi.models.common.Address> addresses;

    private java.util.List<Integer> shippingAddresses;

    private Integer defaultShippingAddress;

    private java.util.List<Integer> billingAddresses;

    private Integer defaultBillingAddress;

    private java.util.List<com.commercetools.importapi.models.common.StoreKeyReference> stores;

    private com.commercetools.importapi.models.customfields.Custom custom;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitImportImpl(
            @JsonProperty("unitType") final com.commercetools.importapi.models.business_units.BusinessUnitType unitType,
            @JsonProperty("key") final String key, @JsonProperty("name") final String name,
            @JsonProperty("status") final com.commercetools.importapi.models.business_units.BusinessUnitStatus status,
            @JsonProperty("contactEmail") final String contactEmail,
            @JsonProperty("associates") final java.util.List<com.commercetools.importapi.models.business_units.AssociateDraft> associates,
            @JsonProperty("addresses") final java.util.List<com.commercetools.importapi.models.common.Address> addresses,
            @JsonProperty("shippingAddresses") final java.util.List<Integer> shippingAddresses,
            @JsonProperty("defaultShippingAddress") final Integer defaultShippingAddress,
            @JsonProperty("billingAddresses") final java.util.List<Integer> billingAddresses,
            @JsonProperty("defaultBillingAddress") final Integer defaultBillingAddress,
            @JsonProperty("stores") final java.util.List<com.commercetools.importapi.models.common.StoreKeyReference> stores,
            @JsonProperty("custom") final com.commercetools.importapi.models.customfields.Custom custom) {
        this.unitType = unitType;
        this.key = key;
        this.name = name;
        this.status = status;
        this.contactEmail = contactEmail;
        this.associates = associates;
        this.addresses = addresses;
        this.shippingAddresses = shippingAddresses;
        this.defaultShippingAddress = defaultShippingAddress;
        this.billingAddresses = billingAddresses;
        this.defaultBillingAddress = defaultBillingAddress;
        this.stores = stores;
        this.custom = custom;
    }

    /**
     * create empty instance
     */
    public BusinessUnitImportImpl() {
    }

    /**
     *  <p>The type of Business Unit.</p>
     */

    public com.commercetools.importapi.models.business_units.BusinessUnitType getUnitType() {
        return this.unitType;
    }

    /**
     *  <p>User-defined unique identifier. If a BusinessUnit with this <code>key</code> exists, it is updated with the imported data.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>The name of the Business Unit.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>The status of the Business Unit.</p>
     */

    public com.commercetools.importapi.models.business_units.BusinessUnitStatus getStatus() {
        return this.status;
    }

    /**
     *  <p>The contact email address for the Business Unit.</p>
     */

    public String getContactEmail() {
        return this.contactEmail;
    }

    /**
     *  <p>List of Associates to be assigned to the Business Unit.</p>
     */

    public java.util.List<com.commercetools.importapi.models.business_units.AssociateDraft> getAssociates() {
        return this.associates;
    }

    /**
     *  <p>The addresses for the Business Unit.</p>
     */

    public java.util.List<com.commercetools.importapi.models.common.Address> getAddresses() {
        return this.addresses;
    }

    /**
     *  <p>The indices of the shipping addresses in the <code>addresses</code> array.</p>
     */

    public java.util.List<Integer> getShippingAddresses() {
        return this.shippingAddresses;
    }

    /**
     *  <p>The index of the default shipping address in the <code>addresses</code> array.</p>
     */

    public Integer getDefaultShippingAddress() {
        return this.defaultShippingAddress;
    }

    /**
     *  <p>The indices of the billing addresses in the <code>addresses</code> array.</p>
     */

    public java.util.List<Integer> getBillingAddresses() {
        return this.billingAddresses;
    }

    /**
     *  <p>The index of the default billing address in the <code>addresses</code> array.</p>
     */

    public Integer getDefaultBillingAddress() {
        return this.defaultBillingAddress;
    }

    /**
     *  <p>The Stores of the Business Unit.</p>
     */

    public java.util.List<com.commercetools.importapi.models.common.StoreKeyReference> getStores() {
        return this.stores;
    }

    /**
     *  <p>Custom fields for the Business Unit.</p>
     */

    public com.commercetools.importapi.models.customfields.Custom getCustom() {
        return this.custom;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setStatus(final com.commercetools.importapi.models.business_units.BusinessUnitStatus status) {
        this.status = status;
    }

    public void setContactEmail(final String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public void setAssociates(final com.commercetools.importapi.models.business_units.AssociateDraft... associates) {
        this.associates = new ArrayList<>(Arrays.asList(associates));
    }

    public void setAssociates(
            final java.util.List<com.commercetools.importapi.models.business_units.AssociateDraft> associates) {
        this.associates = associates;
    }

    public void setAddresses(final com.commercetools.importapi.models.common.Address... addresses) {
        this.addresses = new ArrayList<>(Arrays.asList(addresses));
    }

    public void setAddresses(final java.util.List<com.commercetools.importapi.models.common.Address> addresses) {
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

    public void setStores(final com.commercetools.importapi.models.common.StoreKeyReference... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
    }

    public void setStores(final java.util.List<com.commercetools.importapi.models.common.StoreKeyReference> stores) {
        this.stores = stores;
    }

    public void setCustom(final com.commercetools.importapi.models.customfields.Custom custom) {
        this.custom = custom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        BusinessUnitImportImpl that = (BusinessUnitImportImpl) o;

        return new EqualsBuilder().append(unitType, that.unitType)
                .append(key, that.key)
                .append(name, that.name)
                .append(status, that.status)
                .append(contactEmail, that.contactEmail)
                .append(associates, that.associates)
                .append(addresses, that.addresses)
                .append(shippingAddresses, that.shippingAddresses)
                .append(defaultShippingAddress, that.defaultShippingAddress)
                .append(billingAddresses, that.billingAddresses)
                .append(defaultBillingAddress, that.defaultBillingAddress)
                .append(stores, that.stores)
                .append(custom, that.custom)
                .append(unitType, that.unitType)
                .append(key, that.key)
                .append(name, that.name)
                .append(status, that.status)
                .append(contactEmail, that.contactEmail)
                .append(associates, that.associates)
                .append(addresses, that.addresses)
                .append(shippingAddresses, that.shippingAddresses)
                .append(defaultShippingAddress, that.defaultShippingAddress)
                .append(billingAddresses, that.billingAddresses)
                .append(defaultBillingAddress, that.defaultBillingAddress)
                .append(stores, that.stores)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(unitType)
                .append(key)
                .append(name)
                .append(status)
                .append(contactEmail)
                .append(associates)
                .append(addresses)
                .append(shippingAddresses)
                .append(defaultShippingAddress)
                .append(billingAddresses)
                .append(defaultBillingAddress)
                .append(stores)
                .append(custom)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("unitType", unitType)
                .append("key", key)
                .append("name", name)
                .append("status", status)
                .append("contactEmail", contactEmail)
                .append("associates", associates)
                .append("addresses", addresses)
                .append("shippingAddresses", shippingAddresses)
                .append("defaultShippingAddress", defaultShippingAddress)
                .append("billingAddresses", billingAddresses)
                .append("defaultBillingAddress", defaultBillingAddress)
                .append("stores", stores)
                .append("custom", custom)
                .build();
    }

    @Override
    public BusinessUnitImport copyDeep() {
        return BusinessUnitImport.deepCopy(this);
    }
}
