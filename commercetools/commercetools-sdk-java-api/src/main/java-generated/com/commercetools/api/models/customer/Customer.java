
package com.commercetools.api.models.customer;

import java.time.*;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.store.StoreKeyReference;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>If <code>stores</code> is not empty, the Customer is specific to those Stores.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Customer customer = Customer.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .email("{email}")
 *             .plusAddresses(addressesBuilder -> addressesBuilder)
 *             .plusShippingAddressIds(shippingAddressIdsBuilder -> shippingAddressIdsBuilder)
 *             .plusBillingAddressIds(billingAddressIdsBuilder -> billingAddressIdsBuilder)
 *             .isEmailVerified(true)
 *             .plusCustomerGroupAssignments(customerGroupAssignmentsBuilder -> customerGroupAssignmentsBuilder)
 *             .plusStores(storesBuilder -> storesBuilder)
 *             .authenticationMode(AuthenticationMode.PASSWORD)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerImpl.class)
public interface Customer extends BaseResource, CustomerMixin, com.commercetools.api.models.DomainResource<Customer>,
        com.commercetools.api.models.Referencable<Customer>,
        com.commercetools.api.models.ResourceIdentifiable<Customer>,
        com.commercetools.api.models.Customizable<Customer>, com.commercetools.api.models.WithKey {

    /**
     *  <p>Unique identifier of the Customer.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the Customer.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>User-defined unique identifier of the Customer.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>User-defined unique identifier of the Customer.</p>
     *  <p>Can be used to refer to a Customer in a human-readable way (in emails, invoices, and other correspondence).</p>
     * @return customerNumber
     */

    @JsonProperty("customerNumber")
    public String getCustomerNumber();

    /**
     *  <p>Optional identifier for use in external systems like customer relationship management (CRM) or enterprise resource planning (ERP).</p>
     * @return externalId
     */

    @JsonProperty("externalId")
    public String getExternalId();

    /**
     *  <p>Date and time (UTC) the Customer was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the Customer was last updated.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>IDs and references that last modified the Customer.</p>
     * @return lastModifiedBy
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>IDs and references that created the Customer.</p>
     * @return createdBy
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>Email address of the Customer that is <span>unique</span> for an entire Project or to a Store the Customer is assigned to. It is the mandatory unique identifier of a Customer.</p>
     * @return email
     */
    @NotNull
    @JsonProperty("email")
    public String getEmail();

    /**
     *  <p>Present only when <code>authenticationMode</code> is set to <code>Password</code>.</p>
     * @return password
     */

    @JsonProperty("password")
    public String getPassword();

    /**
     *  <p>Given name (first name) of the Customer.</p>
     * @return firstName
     */

    @JsonProperty("firstName")
    public String getFirstName();

    /**
     *  <p>Family name (last name) of the Customer.</p>
     * @return lastName
     */

    @JsonProperty("lastName")
    public String getLastName();

    /**
     *  <p>Middle name of the Customer.</p>
     * @return middleName
     */

    @JsonProperty("middleName")
    public String getMiddleName();

    /**
     *  <p>Title of the Customer, for example, 'Dr.'.</p>
     * @return title
     */

    @JsonProperty("title")
    public String getTitle();

    /**
     *  <p>Date of birth of the Customer.</p>
     * @return dateOfBirth
     */

    @JsonProperty("dateOfBirth")
    public LocalDate getDateOfBirth();

    /**
     *  <p>Company name of the Customer.</p>
     * @return companyName
     */

    @JsonProperty("companyName")
    public String getCompanyName();

    /**
     *  <p>Individual VAT ID of the Customer.</p>
     * @return vatId
     */

    @JsonProperty("vatId")
    public String getVatId();

    /**
     *  <p>Addresses used by the Customer.</p>
     * @return addresses
     */
    @NotNull
    @Valid
    @JsonProperty("addresses")
    public List<Address> getAddresses();

    /**
     *  <p>ID of the address in <code>addresses</code> used as the default shipping address.</p>
     * @return defaultShippingAddressId
     */

    @JsonProperty("defaultShippingAddressId")
    public String getDefaultShippingAddressId();

    /**
     *  <p>IDs of addresses in <code>addresses</code> used as shipping addresses.</p>
     * @return shippingAddressIds
     */
    @NotNull
    @JsonProperty("shippingAddressIds")
    public List<String> getShippingAddressIds();

    /**
     *  <p>ID of the address in <code>addresses</code> used as the default billing address.</p>
     * @return defaultBillingAddressId
     */

    @JsonProperty("defaultBillingAddressId")
    public String getDefaultBillingAddressId();

    /**
     *  <p>IDs of addresses in <code>addresses</code> used as billing addresses.</p>
     * @return billingAddressIds
     */
    @NotNull
    @JsonProperty("billingAddressIds")
    public List<String> getBillingAddressIds();

    /**
     *  <p>Indicates whether the email address of the Customer is <span>verified</span>.</p>
     * @return isEmailVerified
     */
    @NotNull
    @JsonProperty("isEmailVerified")
    public Boolean getIsEmailVerified();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroup</a> to which the Customer belongs.</p>
     * @return customerGroup
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupReference getCustomerGroup();

    /**
     *  <p>Customer Groups that the Customer belongs to.</p>
     *  <p>Used for <span>Line Item price selection</span>.</p>
     * @return customerGroupAssignments
     */
    @NotNull
    @Valid
    @JsonProperty("customerGroupAssignments")
    public List<CustomerGroupAssignment> getCustomerGroupAssignments();

    /**
     *  <p>Custom Fields of the Customer.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *  <p>Preferred language of the Customer.</p>
     * @return locale
     */

    @JsonProperty("locale")
    public String getLocale();

    /**
     *  <p>Salutation of the Customer, for example, 'Mr.' or 'Mrs.'.</p>
     * @return salutation
     */

    @JsonProperty("salutation")
    public String getSalutation();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> to which the Customer is assigned to.</p>
     *  <ul>
     *   <li>If <code>stores</code> is empty, the Customer is a global customer, and can log in using the <span>Password Flow for global Customers</span>.</li>
     *   <li>If any Stores are specified, the Customer can only log in using the <span>Password Flow for Customers in a Store</span> for those specific Stores.</li>
     *  </ul>
     * @return stores
     */
    @NotNull
    @Valid
    @JsonProperty("stores")
    public List<StoreKeyReference> getStores();

    /**
     *  <p>Indicates whether the <code>password</code> is required for the Customer.</p>
     * @return authenticationMode
     */
    @NotNull
    @JsonProperty("authenticationMode")
    public AuthenticationMode getAuthenticationMode();

    /**
     *  <p>Unique identifier of the Customer.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Current version of the Customer.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>User-defined unique identifier of the Customer.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>User-defined unique identifier of the Customer.</p>
     *  <p>Can be used to refer to a Customer in a human-readable way (in emails, invoices, and other correspondence).</p>
     * @param customerNumber value to be set
     */

    public void setCustomerNumber(final String customerNumber);

    /**
     *  <p>Optional identifier for use in external systems like customer relationship management (CRM) or enterprise resource planning (ERP).</p>
     * @param externalId value to be set
     */

    public void setExternalId(final String externalId);

    /**
     *  <p>Date and time (UTC) the Customer was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Date and time (UTC) the Customer was last updated.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>IDs and references that last modified the Customer.</p>
     * @param lastModifiedBy value to be set
     */

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    /**
     *  <p>IDs and references that created the Customer.</p>
     * @param createdBy value to be set
     */

    public void setCreatedBy(final CreatedBy createdBy);

    /**
     *  <p>Email address of the Customer that is <span>unique</span> for an entire Project or to a Store the Customer is assigned to. It is the mandatory unique identifier of a Customer.</p>
     * @param email value to be set
     */

    public void setEmail(final String email);

    /**
     *  <p>Present only when <code>authenticationMode</code> is set to <code>Password</code>.</p>
     * @param password value to be set
     */

    public void setPassword(final String password);

    /**
     *  <p>Given name (first name) of the Customer.</p>
     * @param firstName value to be set
     */

    public void setFirstName(final String firstName);

    /**
     *  <p>Family name (last name) of the Customer.</p>
     * @param lastName value to be set
     */

    public void setLastName(final String lastName);

    /**
     *  <p>Middle name of the Customer.</p>
     * @param middleName value to be set
     */

    public void setMiddleName(final String middleName);

    /**
     *  <p>Title of the Customer, for example, 'Dr.'.</p>
     * @param title value to be set
     */

    public void setTitle(final String title);

    /**
     *  <p>Date of birth of the Customer.</p>
     * @param dateOfBirth value to be set
     */

    public void setDateOfBirth(final LocalDate dateOfBirth);

    /**
     *  <p>Company name of the Customer.</p>
     * @param companyName value to be set
     */

    public void setCompanyName(final String companyName);

    /**
     *  <p>Individual VAT ID of the Customer.</p>
     * @param vatId value to be set
     */

    public void setVatId(final String vatId);

    /**
     *  <p>Addresses used by the Customer.</p>
     * @param addresses values to be set
     */

    @JsonIgnore
    public void setAddresses(final Address... addresses);

    /**
     *  <p>Addresses used by the Customer.</p>
     * @param addresses values to be set
     */

    public void setAddresses(final List<Address> addresses);

    /**
     *  <p>ID of the address in <code>addresses</code> used as the default shipping address.</p>
     * @param defaultShippingAddressId value to be set
     */

    public void setDefaultShippingAddressId(final String defaultShippingAddressId);

    /**
     *  <p>IDs of addresses in <code>addresses</code> used as shipping addresses.</p>
     * @param shippingAddressIds values to be set
     */

    @JsonIgnore
    public void setShippingAddressIds(final String... shippingAddressIds);

    /**
     *  <p>IDs of addresses in <code>addresses</code> used as shipping addresses.</p>
     * @param shippingAddressIds values to be set
     */

    public void setShippingAddressIds(final List<String> shippingAddressIds);

    /**
     *  <p>ID of the address in <code>addresses</code> used as the default billing address.</p>
     * @param defaultBillingAddressId value to be set
     */

    public void setDefaultBillingAddressId(final String defaultBillingAddressId);

    /**
     *  <p>IDs of addresses in <code>addresses</code> used as billing addresses.</p>
     * @param billingAddressIds values to be set
     */

    @JsonIgnore
    public void setBillingAddressIds(final String... billingAddressIds);

    /**
     *  <p>IDs of addresses in <code>addresses</code> used as billing addresses.</p>
     * @param billingAddressIds values to be set
     */

    public void setBillingAddressIds(final List<String> billingAddressIds);

    /**
     *  <p>Indicates whether the email address of the Customer is <span>verified</span>.</p>
     * @param isEmailVerified value to be set
     */

    public void setIsEmailVerified(final Boolean isEmailVerified);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerGroup" rel="nofollow">CustomerGroup</a> to which the Customer belongs.</p>
     * @param customerGroup value to be set
     */

    public void setCustomerGroup(final CustomerGroupReference customerGroup);

    /**
     *  <p>Customer Groups that the Customer belongs to.</p>
     *  <p>Used for <span>Line Item price selection</span>.</p>
     * @param customerGroupAssignments values to be set
     */

    @JsonIgnore
    public void setCustomerGroupAssignments(final CustomerGroupAssignment... customerGroupAssignments);

    /**
     *  <p>Customer Groups that the Customer belongs to.</p>
     *  <p>Used for <span>Line Item price selection</span>.</p>
     * @param customerGroupAssignments values to be set
     */

    public void setCustomerGroupAssignments(final List<CustomerGroupAssignment> customerGroupAssignments);

    /**
     *  <p>Custom Fields of the Customer.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFields custom);

    /**
     *  <p>Preferred language of the Customer.</p>
     * @param locale value to be set
     */

    public void setLocale(final String locale);

    /**
     *  <p>Salutation of the Customer, for example, 'Mr.' or 'Mrs.'.</p>
     * @param salutation value to be set
     */

    public void setSalutation(final String salutation);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> to which the Customer is assigned to.</p>
     *  <ul>
     *   <li>If <code>stores</code> is empty, the Customer is a global customer, and can log in using the <span>Password Flow for global Customers</span>.</li>
     *   <li>If any Stores are specified, the Customer can only log in using the <span>Password Flow for Customers in a Store</span> for those specific Stores.</li>
     *  </ul>
     * @param stores values to be set
     */

    @JsonIgnore
    public void setStores(final StoreKeyReference... stores);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:Store" rel="nofollow">Stores</a> to which the Customer is assigned to.</p>
     *  <ul>
     *   <li>If <code>stores</code> is empty, the Customer is a global customer, and can log in using the <span>Password Flow for global Customers</span>.</li>
     *   <li>If any Stores are specified, the Customer can only log in using the <span>Password Flow for Customers in a Store</span> for those specific Stores.</li>
     *  </ul>
     * @param stores values to be set
     */

    public void setStores(final List<StoreKeyReference> stores);

    /**
     *  <p>Indicates whether the <code>password</code> is required for the Customer.</p>
     * @param authenticationMode value to be set
     */

    public void setAuthenticationMode(final AuthenticationMode authenticationMode);

    /**
     * factory method
     * @return instance of Customer
     */
    public static Customer of() {
        return new CustomerImpl();
    }

    /**
     * factory method to create a shallow copy Customer
     * @param template instance to be copied
     * @return copy instance
     */
    public static Customer of(final Customer template) {
        CustomerImpl instance = new CustomerImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setKey(template.getKey());
        instance.setCustomerNumber(template.getCustomerNumber());
        instance.setExternalId(template.getExternalId());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setEmail(template.getEmail());
        instance.setPassword(template.getPassword());
        instance.setFirstName(template.getFirstName());
        instance.setLastName(template.getLastName());
        instance.setMiddleName(template.getMiddleName());
        instance.setTitle(template.getTitle());
        instance.setDateOfBirth(template.getDateOfBirth());
        instance.setCompanyName(template.getCompanyName());
        instance.setVatId(template.getVatId());
        instance.setAddresses(template.getAddresses());
        instance.setDefaultShippingAddressId(template.getDefaultShippingAddressId());
        instance.setShippingAddressIds(template.getShippingAddressIds());
        instance.setDefaultBillingAddressId(template.getDefaultBillingAddressId());
        instance.setBillingAddressIds(template.getBillingAddressIds());
        instance.setIsEmailVerified(template.getIsEmailVerified());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setCustomerGroupAssignments(template.getCustomerGroupAssignments());
        instance.setCustom(template.getCustom());
        instance.setLocale(template.getLocale());
        instance.setSalutation(template.getSalutation());
        instance.setStores(template.getStores());
        instance.setAuthenticationMode(template.getAuthenticationMode());
        return instance;
    }

    public Customer copyDeep();

    /**
     * factory method to create a deep copy of Customer
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Customer deepCopy(@Nullable final Customer template) {
        if (template == null) {
            return null;
        }
        CustomerImpl instance = new CustomerImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setKey(template.getKey());
        instance.setCustomerNumber(template.getCustomerNumber());
        instance.setExternalId(template.getExternalId());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setEmail(template.getEmail());
        instance.setPassword(template.getPassword());
        instance.setFirstName(template.getFirstName());
        instance.setLastName(template.getLastName());
        instance.setMiddleName(template.getMiddleName());
        instance.setTitle(template.getTitle());
        instance.setDateOfBirth(template.getDateOfBirth());
        instance.setCompanyName(template.getCompanyName());
        instance.setVatId(template.getVatId());
        instance.setAddresses(Optional.ofNullable(template.getAddresses())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.Address::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setDefaultShippingAddressId(template.getDefaultShippingAddressId());
        instance.setShippingAddressIds(
            Optional.ofNullable(template.getShippingAddressIds()).map(ArrayList::new).orElse(null));
        instance.setDefaultBillingAddressId(template.getDefaultBillingAddressId());
        instance.setBillingAddressIds(
            Optional.ofNullable(template.getBillingAddressIds()).map(ArrayList::new).orElse(null));
        instance.setIsEmailVerified(template.getIsEmailVerified());
        instance.setCustomerGroup(
            com.commercetools.api.models.customer_group.CustomerGroupReference.deepCopy(template.getCustomerGroup()));
        instance.setCustomerGroupAssignments(Optional.ofNullable(template.getCustomerGroupAssignments())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.customer.CustomerGroupAssignment::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setCustom(com.commercetools.api.models.type.CustomFields.deepCopy(template.getCustom()));
        instance.setLocale(template.getLocale());
        instance.setSalutation(template.getSalutation());
        instance.setStores(Optional.ofNullable(template.getStores())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.store.StoreKeyReference::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setAuthenticationMode(template.getAuthenticationMode());
        return instance;
    }

    /**
     * builder factory method for Customer
     * @return builder
     */
    public static CustomerBuilder builder() {
        return CustomerBuilder.of();
    }

    /**
     * create builder for Customer instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerBuilder builder(final Customer template) {
        return CustomerBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomer(Function<Customer, T> helper) {
        return helper.apply(this);
    }

    public static com.commercetools.api.models.common.ReferenceTypeId referenceTypeId() {
        return com.commercetools.api.models.common.ReferenceTypeId.CUSTOMER;
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Customer> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Customer>() {
            @Override
            public String toString() {
                return "TypeReference<Customer>";
            }
        };
    }
}
