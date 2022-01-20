
package com.commercetools.importapi.models.customers;

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
*  <p>The data representation for a Customer to be imported that is persisted as a <a href="/../api/projects/customers#top">Customer</a> in the Project.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CustomerImportImpl implements CustomerImport, ModelBase {

    private String key;

    private String customerNumber;

    private String email;

    private String password;

    private java.util.List<com.commercetools.importapi.models.common.StoreKeyReference> stores;

    private String firstName;

    private String lastName;

    private String middleName;

    private String title;

    private String salutation;

    private String externalId;

    private java.time.LocalDate dateOfBirth;

    private String companyName;

    private String vatId;

    private Boolean isEmailVerified;

    private com.commercetools.importapi.models.common.CustomerGroupKeyReference customerGroup;

    private java.util.List<com.commercetools.importapi.models.customers.CustomerAddress> addresses;

    private Integer defaultBillingAddress;

    private java.util.List<Integer> billingAddresses;

    private Integer defaultShippingAddress;

    private java.util.List<Integer> shippingAddresses;

    private String locale;

    private com.commercetools.importapi.models.customfields.Custom custom;

    @JsonCreator
    CustomerImportImpl(@JsonProperty("key") final String key,
            @JsonProperty("customerNumber") final String customerNumber, @JsonProperty("email") final String email,
            @JsonProperty("password") final String password,
            @JsonProperty("stores") final java.util.List<com.commercetools.importapi.models.common.StoreKeyReference> stores,
            @JsonProperty("firstName") final String firstName, @JsonProperty("lastName") final String lastName,
            @JsonProperty("middleName") final String middleName, @JsonProperty("title") final String title,
            @JsonProperty("salutation") final String salutation, @JsonProperty("externalId") final String externalId,
            @JsonProperty("dateOfBirth") final java.time.LocalDate dateOfBirth,
            @JsonProperty("companyName") final String companyName, @JsonProperty("vatId") final String vatId,
            @JsonProperty("isEmailVerified") final Boolean isEmailVerified,
            @JsonProperty("customerGroup") final com.commercetools.importapi.models.common.CustomerGroupKeyReference customerGroup,
            @JsonProperty("addresses") final java.util.List<com.commercetools.importapi.models.customers.CustomerAddress> addresses,
            @JsonProperty("defaultBillingAddress") final Integer defaultBillingAddress,
            @JsonProperty("billingAddresses") final java.util.List<Integer> billingAddresses,
            @JsonProperty("defaultShippingAddress") final Integer defaultShippingAddress,
            @JsonProperty("shippingAddresses") final java.util.List<Integer> shippingAddresses,
            @JsonProperty("locale") final String locale,
            @JsonProperty("custom") final com.commercetools.importapi.models.customfields.Custom custom) {
        this.key = key;
        this.customerNumber = customerNumber;
        this.email = email;
        this.password = password;
        this.stores = stores;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.title = title;
        this.salutation = salutation;
        this.externalId = externalId;
        this.dateOfBirth = dateOfBirth;
        this.companyName = companyName;
        this.vatId = vatId;
        this.isEmailVerified = isEmailVerified;
        this.customerGroup = customerGroup;
        this.addresses = addresses;
        this.defaultBillingAddress = defaultBillingAddress;
        this.billingAddresses = billingAddresses;
        this.defaultShippingAddress = defaultShippingAddress;
        this.shippingAddresses = shippingAddresses;
        this.locale = locale;
        this.custom = custom;
    }

    public CustomerImportImpl() {
    }

    public String getKey() {
        return this.key;
    }

    /**
    *  <p>Maps to <code>Customer.customerNumber</code>.</p>
    */
    public String getCustomerNumber() {
        return this.customerNumber;
    }

    /**
    *  <p>Maps to <code>Customer.email</code>.</p>
    */
    public String getEmail() {
        return this.email;
    }

    /**
    *  <p>Maps to <code>Customer.password</code>.</p>
    */
    public String getPassword() {
        return this.password;
    }

    /**
    *  <p>The References to the Stores with which the Customer is associated. If referenced Stores do not exist, the <code>state</code> of the <a href="/import-operation#importoperation">ImportOperation</a> will be set to <code>unresolved</code> until the necessary Stores are created.</p>
    */
    public java.util.List<com.commercetools.importapi.models.common.StoreKeyReference> getStores() {
        return this.stores;
    }

    /**
    *  <p>Maps to <code>Customer.firstName</code>.</p>
    */
    public String getFirstName() {
        return this.firstName;
    }

    /**
    *  <p>Maps to <code>Customer.lastName</code>.</p>
    */
    public String getLastName() {
        return this.lastName;
    }

    /**
    *  <p>Maps to <code>Customer.middleName</code>.</p>
    */
    public String getMiddleName() {
        return this.middleName;
    }

    /**
    *  <p>Maps to <code>Customer.title</code>.</p>
    */
    public String getTitle() {
        return this.title;
    }

    /**
    *  <p>Maps to <code>Customer.salutation</code>.</p>
    */
    public String getSalutation() {
        return this.salutation;
    }

    /**
    *  <p>Maps to <code>Customer.externalId</code>.</p>
    */
    public String getExternalId() {
        return this.externalId;
    }

    /**
    *  <p>Maps to <code>Customer.dateOfBirth</code>.</p>
    */
    public java.time.LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    /**
    *  <p>Maps to <code>Customer.companyName</code>.</p>
    */
    public String getCompanyName() {
        return this.companyName;
    }

    /**
    *  <p>Maps to <code>Customer.vatId</code>.</p>
    */
    public String getVatId() {
        return this.vatId;
    }

    /**
    *  <p>Maps to <code>Customer.isEmailVerified</code>.</p>
    */
    public Boolean getIsEmailVerified() {
        return this.isEmailVerified;
    }

    /**
    *  <p>The Reference to the <a href="/../api/projects/customerGroups#customergroup">CustomerGroup</a> with which the Customer is associated.
    *  If referenced CustomerGroup does not exist, the <code>state</code> of the <a href="/import-operation#importoperation">ImportOperation</a> will be set to <code>unresolved</code> until the necessary CustomerGroup is created.</p>
    */
    public com.commercetools.importapi.models.common.CustomerGroupKeyReference getCustomerGroup() {
        return this.customerGroup;
    }

    /**
    *  <p>Maps to <code>Customer.addresses</code>.</p>
    */
    public java.util.List<com.commercetools.importapi.models.customers.CustomerAddress> getAddresses() {
        return this.addresses;
    }

    /**
    *  <p>The index of the address in the addresses array. The <code>defaultBillingAddressId</code> of the customer will be set to the ID of that address.</p>
    */
    public Integer getDefaultBillingAddress() {
        return this.defaultBillingAddress;
    }

    /**
    *  <p>The indices of the billing addresses in the addresses array. The <code>billingAddressIds</code> of the customer will be set to the IDs of that addresses.</p>
    */
    public java.util.List<Integer> getBillingAddresses() {
        return this.billingAddresses;
    }

    /**
    *  <p>The index of the address in the addresses array. The <code>defaultShippingAddressId</code> of the customer will be set to the ID of that address.</p>
    */
    public Integer getDefaultShippingAddress() {
        return this.defaultShippingAddress;
    }

    /**
    *  <p>The indices of the shipping addresses in the addresses array. The <code>shippingAddressIds</code> of the customer will be set to the IDs of that addresses.</p>
    */
    public java.util.List<Integer> getShippingAddresses() {
        return this.shippingAddresses;
    }

    /**
    *  <p>Maps to <code>Customer.locale</code>.</p>
    */
    public String getLocale() {
        return this.locale;
    }

    /**
    *  <p>The custom fields for this Customer.</p>
    */
    public com.commercetools.importapi.models.customfields.Custom getCustom() {
        return this.custom;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setCustomerNumber(final String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public void setStores(final com.commercetools.importapi.models.common.StoreKeyReference... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
    }

    public void setStores(final java.util.List<com.commercetools.importapi.models.common.StoreKeyReference> stores) {
        this.stores = stores;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleName(final String middleName) {
        this.middleName = middleName;
    }

    public void setTitle(final String title) {
        this.title = title;
    }

    public void setSalutation(final String salutation) {
        this.salutation = salutation;
    }

    public void setExternalId(final String externalId) {
        this.externalId = externalId;
    }

    public void setDateOfBirth(final java.time.LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setCompanyName(final String companyName) {
        this.companyName = companyName;
    }

    public void setVatId(final String vatId) {
        this.vatId = vatId;
    }

    public void setIsEmailVerified(final Boolean isEmailVerified) {
        this.isEmailVerified = isEmailVerified;
    }

    public void setCustomerGroup(
            final com.commercetools.importapi.models.common.CustomerGroupKeyReference customerGroup) {
        this.customerGroup = customerGroup;
    }

    public void setAddresses(final com.commercetools.importapi.models.customers.CustomerAddress... addresses) {
        this.addresses = new ArrayList<>(Arrays.asList(addresses));
    }

    public void setAddresses(
            final java.util.List<com.commercetools.importapi.models.customers.CustomerAddress> addresses) {
        this.addresses = addresses;
    }

    public void setDefaultBillingAddress(final Integer defaultBillingAddress) {
        this.defaultBillingAddress = defaultBillingAddress;
    }

    public void setBillingAddresses(final Integer... billingAddresses) {
        this.billingAddresses = new ArrayList<>(Arrays.asList(billingAddresses));
    }

    public void setBillingAddresses(final java.util.List<Integer> billingAddresses) {
        this.billingAddresses = billingAddresses;
    }

    public void setDefaultShippingAddress(final Integer defaultShippingAddress) {
        this.defaultShippingAddress = defaultShippingAddress;
    }

    public void setShippingAddresses(final Integer... shippingAddresses) {
        this.shippingAddresses = new ArrayList<>(Arrays.asList(shippingAddresses));
    }

    public void setShippingAddresses(final java.util.List<Integer> shippingAddresses) {
        this.shippingAddresses = shippingAddresses;
    }

    public void setLocale(final String locale) {
        this.locale = locale;
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

        CustomerImportImpl that = (CustomerImportImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(customerNumber, that.customerNumber)
                .append(email, that.email)
                .append(password, that.password)
                .append(stores, that.stores)
                .append(firstName, that.firstName)
                .append(lastName, that.lastName)
                .append(middleName, that.middleName)
                .append(title, that.title)
                .append(salutation, that.salutation)
                .append(externalId, that.externalId)
                .append(dateOfBirth, that.dateOfBirth)
                .append(companyName, that.companyName)
                .append(vatId, that.vatId)
                .append(isEmailVerified, that.isEmailVerified)
                .append(customerGroup, that.customerGroup)
                .append(addresses, that.addresses)
                .append(defaultBillingAddress, that.defaultBillingAddress)
                .append(billingAddresses, that.billingAddresses)
                .append(defaultShippingAddress, that.defaultShippingAddress)
                .append(shippingAddresses, that.shippingAddresses)
                .append(locale, that.locale)
                .append(custom, that.custom)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key)
                .append(customerNumber)
                .append(email)
                .append(password)
                .append(stores)
                .append(firstName)
                .append(lastName)
                .append(middleName)
                .append(title)
                .append(salutation)
                .append(externalId)
                .append(dateOfBirth)
                .append(companyName)
                .append(vatId)
                .append(isEmailVerified)
                .append(customerGroup)
                .append(addresses)
                .append(defaultBillingAddress)
                .append(billingAddresses)
                .append(defaultShippingAddress)
                .append(shippingAddresses)
                .append(locale)
                .append(custom)
                .toHashCode();
    }

}
