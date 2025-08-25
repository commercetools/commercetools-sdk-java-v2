
package com.commercetools.api.models.customer;

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
 * CustomerDraft
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomerDraftImpl implements CustomerDraft, ModelBase {

    private String key;

    private String customerNumber;

    private String externalId;

    private String email;

    private String password;

    private String firstName;

    private String lastName;

    private String middleName;

    private String title;

    @Deprecated
    private String anonymousCartId;

    private com.commercetools.api.models.cart.CartResourceIdentifier anonymousCart;

    private String anonymousId;

    private java.time.LocalDate dateOfBirth;

    private String companyName;

    private String vatId;

    private java.util.List<com.commercetools.api.models.common.BaseAddress> addresses;

    private Integer defaultShippingAddress;

    private java.util.List<Integer> shippingAddresses;

    private Integer defaultBillingAddress;

    private java.util.List<Integer> billingAddresses;

    private Boolean isEmailVerified;

    private com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup;

    private java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignmentDraft> customerGroupAssignments;

    private com.commercetools.api.models.type.CustomFieldsDraft custom;

    private String locale;

    private String salutation;

    private java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores;

    private com.commercetools.api.models.customer.AuthenticationMode authenticationMode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomerDraftImpl(@JsonProperty("key") final String key,
            @JsonProperty("customerNumber") final String customerNumber,
            @JsonProperty("externalId") final String externalId, @JsonProperty("email") final String email,
            @JsonProperty("password") final String password, @JsonProperty("firstName") final String firstName,
            @JsonProperty("lastName") final String lastName, @JsonProperty("middleName") final String middleName,
            @JsonProperty("title") final String title, @JsonProperty("anonymousCartId") final String anonymousCartId,
            @JsonProperty("anonymousCart") final com.commercetools.api.models.cart.CartResourceIdentifier anonymousCart,
            @JsonProperty("anonymousId") final String anonymousId,
            @JsonProperty("dateOfBirth") final java.time.LocalDate dateOfBirth,
            @JsonProperty("companyName") final String companyName, @JsonProperty("vatId") final String vatId,
            @JsonProperty("addresses") final java.util.List<com.commercetools.api.models.common.BaseAddress> addresses,
            @JsonProperty("defaultShippingAddress") final Integer defaultShippingAddress,
            @JsonProperty("shippingAddresses") final java.util.List<Integer> shippingAddresses,
            @JsonProperty("defaultBillingAddress") final Integer defaultBillingAddress,
            @JsonProperty("billingAddresses") final java.util.List<Integer> billingAddresses,
            @JsonProperty("isEmailVerified") final Boolean isEmailVerified,
            @JsonProperty("customerGroup") final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup,
            @JsonProperty("customerGroupAssignments") final java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignmentDraft> customerGroupAssignments,
            @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom,
            @JsonProperty("locale") final String locale, @JsonProperty("salutation") final String salutation,
            @JsonProperty("stores") final java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores,
            @JsonProperty("authenticationMode") final com.commercetools.api.models.customer.AuthenticationMode authenticationMode) {
        this.key = key;
        this.customerNumber = customerNumber;
        this.externalId = externalId;
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.title = title;
        this.anonymousCartId = anonymousCartId;
        this.anonymousCart = anonymousCart;
        this.anonymousId = anonymousId;
        this.dateOfBirth = dateOfBirth;
        this.companyName = companyName;
        this.vatId = vatId;
        this.addresses = addresses;
        this.defaultShippingAddress = defaultShippingAddress;
        this.shippingAddresses = shippingAddresses;
        this.defaultBillingAddress = defaultBillingAddress;
        this.billingAddresses = billingAddresses;
        this.isEmailVerified = isEmailVerified;
        this.customerGroup = customerGroup;
        this.customerGroupAssignments = customerGroupAssignments;
        this.custom = custom;
        this.locale = locale;
        this.salutation = salutation;
        this.stores = stores;
        this.authenticationMode = authenticationMode;
    }

    /**
     * create empty instance
     */
    public CustomerDraftImpl() {
    }

    /**
     *  <p>User-defined unique identifier for the Customer. The <code>key</code> field is preferred over <code>customerNumber</code> as it is mutable and provides more flexibility.</p>
     *  <p>This field is optional for backwards compatibility reasons, but we strongly recommend setting it. Keys are mandatory for importing Customers with the <span>Import API</span>.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>User-defined unique identifier for a Customer. Once set, it cannot be changed.</p>
     *  <p>Can be used to refer to a Customer in a human-readable way (in emails, invoices, and other correspondence).</p>
     */

    public String getCustomerNumber() {
        return this.customerNumber;
    }

    /**
     *  <p>Optional identifier for use in external systems like customer relationship management (CRM) or enterprise resource planning (ERP).</p>
     */

    public String getExternalId() {
        return this.externalId;
    }

    /**
     *  <p>Email address of the Customer that must be <span>unique</span> for an entire Project or to a Store the Customer is assigned to. It is the mandatory unique identifier of a Customer.</p>
     */

    public String getEmail() {
        return this.email;
    }

    /**
     *  <p>Required when <code>authenticationMode</code> is set to <code>Password</code>. Provide the Customer's password in plain text. The API stores passwords in an encrypted format.</p>
     */

    public String getPassword() {
        return this.password;
    }

    /**
     *  <p>Given name (first name) of the Customer.</p>
     */

    public String getFirstName() {
        return this.firstName;
    }

    /**
     *  <p>Family name (last name) of the Customer.</p>
     */

    public String getLastName() {
        return this.lastName;
    }

    /**
     *  <p>Middle name of the Customer.</p>
     */

    public String getMiddleName() {
        return this.middleName;
    }

    /**
     *  <p>Title of the Customer, for example, 'Dr.'.</p>
     */

    public String getTitle() {
        return this.title;
    }

    /**
     *  <p>Deprecated since an anonymous <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> can be identified by its <code>id</code> or external <code>key</code>.</p>
     */
    @Deprecated
    public String getAnonymousCartId() {
        return this.anonymousCartId;
    }

    /**
     *  <p>Identifies a <a href="https://docs.commercetools.com/apis/ctp:api:type:Cart" rel="nofollow">Cart</a> that will be assigned to the new Customer.</p>
     */

    public com.commercetools.api.models.cart.CartResourceIdentifier getAnonymousCart() {
        return this.anonymousCart;
    }

    /**
     *  <p>Identifies Carts and Orders belonging to an anonymous session that will be assigned to the new Customer.</p>
     */

    public String getAnonymousId() {
        return this.anonymousId;
    }

    /**
     *  <p>Date of birth of the Customer.</p>
     */

    public java.time.LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    /**
     *  <p>Company name of the Customer. When representing a company as a Customer, <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">Business Units</a> provide extended functionality.</p>
     */

    public String getCompanyName() {
        return this.companyName;
    }

    /**
     *  <p>Individual VAT ID of the Customer.</p>
     */

    public String getVatId() {
        return this.vatId;
    }

    /**
     *  <p>Addresses of the Customer.</p>
     */

    public java.util.List<com.commercetools.api.models.common.BaseAddress> getAddresses() {
        return this.addresses;
    }

    /**
     *  <p>Index of the address in the <code>addresses</code> array to use as the default shipping address. The <code>defaultShippingAddressId</code> of the Customer will be set to the <code>id</code> of that address.</p>
     */

    public Integer getDefaultShippingAddress() {
        return this.defaultShippingAddress;
    }

    /**
     *  <p>Indices of the shipping addresses in the <code>addresses</code> array. The <code>shippingAddressIds</code> of the Customer will be set to the IDs of these addresses.</p>
     */

    public java.util.List<Integer> getShippingAddresses() {
        return this.shippingAddresses;
    }

    /**
     *  <p>Index of the address in the <code>addresses</code> array to use as the default billing address. The <code>defaultBillingAddressId</code> of the Customer will be set to the <code>id</code> of that address.</p>
     */

    public Integer getDefaultBillingAddress() {
        return this.defaultBillingAddress;
    }

    /**
     *  <p>Indices of the billing addresses in the <code>addresses</code> array. The <code>billingAddressIds</code> of the Customer will be set to the IDs of these addresses.</p>
     */

    public java.util.List<Integer> getBillingAddresses() {
        return this.billingAddresses;
    }

    /**
     *  <p>Set to <code>true</code> if the email address of the Customer has been verified already. The intended use is to leave this field unset upon sign-up of the Customer and initiate the <span>email verification</span> afterwards.</p>
     */

    public Boolean getIsEmailVerified() {
        return this.isEmailVerified;
    }

    /**
     *  <p>Sets the <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroup</a> for the Customer.</p>
     *  <p>For new projects, use <code>customerGroupAssignments</code> instead. It supports assigning Customers to multiple Customer Groups and provides greater flexibility in complex pricing scenarios.</p>
     */

    public com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup() {
        return this.customerGroup;
    }

    /**
     *  <p>Customer Groups to assign the Customer to.</p>
     *  <p>Used for <span>Line Item price selection</span>.</p>
     */

    public java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignmentDraft> getCustomerGroupAssignments() {
        return this.customerGroupAssignments;
    }

    /**
     *  <p>Custom Fields for the Customer.</p>
     */

    public com.commercetools.api.models.type.CustomFieldsDraft getCustom() {
        return this.custom;
    }

    /**
     *  <p>Preferred language of the Customer. Must be one of the languages supported by the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a>.</p>
     */

    public String getLocale() {
        return this.locale;
    }

    /**
     *  <p>Salutation of the Customer, for example, 'Mr.' or 'Mrs.'.</p>
     */

    public String getSalutation() {
        return this.salutation;
    }

    /**
     *  <p>Sets the <a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> for the Customer.</p>
     *  <ul>
     *   <li>If no Stores are specified, the Customer is a global customer, and can log in using the <span>Password Flow for global Customers</span>.</li>
     *   <li>If any Stores are specified, the Customer can only log in using the <span>Password Flow for Customers in a Store</span> for those specific Stores.</li>
     *  </ul>
     */

    public java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> getStores() {
        return this.stores;
    }

    /**
     *  <ul>
     *   <li>Set to <code>Password</code> to make the <code>password</code> field required for the Customer.</li>
     *   <li>Set to <code>ExternalAuth</code> when the password is not required for the Customer.</li>
     *  </ul>
     */

    public com.commercetools.api.models.customer.AuthenticationMode getAuthenticationMode() {
        return this.authenticationMode;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setCustomerNumber(final String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public void setExternalId(final String externalId) {
        this.externalId = externalId;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public void setPassword(final String password) {
        this.password = password;
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

    @Deprecated
    public void setAnonymousCartId(final String anonymousCartId) {
        this.anonymousCartId = anonymousCartId;
    }

    public void setAnonymousCart(final com.commercetools.api.models.cart.CartResourceIdentifier anonymousCart) {
        this.anonymousCart = anonymousCart;
    }

    public void setAnonymousId(final String anonymousId) {
        this.anonymousId = anonymousId;
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

    public void setAddresses(final com.commercetools.api.models.common.BaseAddress... addresses) {
        this.addresses = new ArrayList<>(Arrays.asList(addresses));
    }

    public void setAddresses(final java.util.List<com.commercetools.api.models.common.BaseAddress> addresses) {
        this.addresses = addresses;
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

    public void setDefaultBillingAddress(final Integer defaultBillingAddress) {
        this.defaultBillingAddress = defaultBillingAddress;
    }

    public void setBillingAddresses(final Integer... billingAddresses) {
        this.billingAddresses = new ArrayList<>(Arrays.asList(billingAddresses));
    }

    public void setBillingAddresses(final java.util.List<Integer> billingAddresses) {
        this.billingAddresses = billingAddresses;
    }

    public void setIsEmailVerified(final Boolean isEmailVerified) {
        this.isEmailVerified = isEmailVerified;
    }

    public void setCustomerGroup(
            final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
        this.customerGroup = customerGroup;
    }

    public void setCustomerGroupAssignments(
            final com.commercetools.api.models.customer.CustomerGroupAssignmentDraft... customerGroupAssignments) {
        this.customerGroupAssignments = new ArrayList<>(Arrays.asList(customerGroupAssignments));
    }

    public void setCustomerGroupAssignments(
            final java.util.List<com.commercetools.api.models.customer.CustomerGroupAssignmentDraft> customerGroupAssignments) {
        this.customerGroupAssignments = customerGroupAssignments;
    }

    public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom) {
        this.custom = custom;
    }

    public void setLocale(final String locale) {
        this.locale = locale;
    }

    public void setSalutation(final String salutation) {
        this.salutation = salutation;
    }

    public void setStores(final com.commercetools.api.models.store.StoreResourceIdentifier... stores) {
        this.stores = new ArrayList<>(Arrays.asList(stores));
    }

    public void setStores(final java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores) {
        this.stores = stores;
    }

    public void setAuthenticationMode(
            final com.commercetools.api.models.customer.AuthenticationMode authenticationMode) {
        this.authenticationMode = authenticationMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomerDraftImpl that = (CustomerDraftImpl) o;

        return new EqualsBuilder().append(key, that.key)
                .append(customerNumber, that.customerNumber)
                .append(externalId, that.externalId)
                .append(email, that.email)
                .append(password, that.password)
                .append(firstName, that.firstName)
                .append(lastName, that.lastName)
                .append(middleName, that.middleName)
                .append(title, that.title)
                .append(anonymousCartId, that.anonymousCartId)
                .append(anonymousCart, that.anonymousCart)
                .append(anonymousId, that.anonymousId)
                .append(dateOfBirth, that.dateOfBirth)
                .append(companyName, that.companyName)
                .append(vatId, that.vatId)
                .append(addresses, that.addresses)
                .append(defaultShippingAddress, that.defaultShippingAddress)
                .append(shippingAddresses, that.shippingAddresses)
                .append(defaultBillingAddress, that.defaultBillingAddress)
                .append(billingAddresses, that.billingAddresses)
                .append(isEmailVerified, that.isEmailVerified)
                .append(customerGroup, that.customerGroup)
                .append(customerGroupAssignments, that.customerGroupAssignments)
                .append(custom, that.custom)
                .append(locale, that.locale)
                .append(salutation, that.salutation)
                .append(stores, that.stores)
                .append(authenticationMode, that.authenticationMode)
                .append(key, that.key)
                .append(customerNumber, that.customerNumber)
                .append(externalId, that.externalId)
                .append(email, that.email)
                .append(password, that.password)
                .append(firstName, that.firstName)
                .append(lastName, that.lastName)
                .append(middleName, that.middleName)
                .append(title, that.title)
                .append(anonymousCartId, that.anonymousCartId)
                .append(anonymousCart, that.anonymousCart)
                .append(anonymousId, that.anonymousId)
                .append(dateOfBirth, that.dateOfBirth)
                .append(companyName, that.companyName)
                .append(vatId, that.vatId)
                .append(addresses, that.addresses)
                .append(defaultShippingAddress, that.defaultShippingAddress)
                .append(shippingAddresses, that.shippingAddresses)
                .append(defaultBillingAddress, that.defaultBillingAddress)
                .append(billingAddresses, that.billingAddresses)
                .append(isEmailVerified, that.isEmailVerified)
                .append(customerGroup, that.customerGroup)
                .append(customerGroupAssignments, that.customerGroupAssignments)
                .append(custom, that.custom)
                .append(locale, that.locale)
                .append(salutation, that.salutation)
                .append(stores, that.stores)
                .append(authenticationMode, that.authenticationMode)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(key)
                .append(customerNumber)
                .append(externalId)
                .append(email)
                .append(password)
                .append(firstName)
                .append(lastName)
                .append(middleName)
                .append(title)
                .append(anonymousCartId)
                .append(anonymousCart)
                .append(anonymousId)
                .append(dateOfBirth)
                .append(companyName)
                .append(vatId)
                .append(addresses)
                .append(defaultShippingAddress)
                .append(shippingAddresses)
                .append(defaultBillingAddress)
                .append(billingAddresses)
                .append(isEmailVerified)
                .append(customerGroup)
                .append(customerGroupAssignments)
                .append(custom)
                .append(locale)
                .append(salutation)
                .append(stores)
                .append(authenticationMode)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("key", key)
                .append("customerNumber", customerNumber)
                .append("externalId", externalId)
                .append("email", email)
                .append("password", password)
                .append("firstName", firstName)
                .append("lastName", lastName)
                .append("middleName", middleName)
                .append("title", title)
                .append("anonymousCartId", anonymousCartId)
                .append("anonymousCart", anonymousCart)
                .append("anonymousId", anonymousId)
                .append("dateOfBirth", dateOfBirth)
                .append("companyName", companyName)
                .append("vatId", vatId)
                .append("addresses", addresses)
                .append("defaultShippingAddress", defaultShippingAddress)
                .append("shippingAddresses", shippingAddresses)
                .append("defaultBillingAddress", defaultBillingAddress)
                .append("billingAddresses", billingAddresses)
                .append("isEmailVerified", isEmailVerified)
                .append("customerGroup", customerGroup)
                .append("customerGroupAssignments", customerGroupAssignments)
                .append("custom", custom)
                .append("locale", locale)
                .append("salutation", salutation)
                .append("stores", stores)
                .append("authenticationMode", authenticationMode)
                .build();
    }

    @Override
    public CustomerDraft copyDeep() {
        return CustomerDraft.deepCopy(this);
    }
}
