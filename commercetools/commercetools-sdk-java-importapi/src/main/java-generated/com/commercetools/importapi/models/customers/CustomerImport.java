
package com.commercetools.importapi.models.customers;

import java.time.*;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.CustomerGroupKeyReference;
import com.commercetools.importapi.models.common.ImportResource;
import com.commercetools.importapi.models.common.StoreKeyReference;
import com.commercetools.importapi.models.customfields.Custom;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>The data representation for a Customer to be imported that is persisted as a Customer in the Project.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerImport customerImport = CustomerImport.builder()
 *             .key("{key}")
 *             .email("{email}")
 *             .plusAddresses(addressesBuilder -> addressesBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerImportImpl.class)
public interface CustomerImport extends ImportResource {

    /**
     *  <p>Maps to <code>Customer.customerNumber</code>.</p>
     * @return customerNumber
     */

    @JsonProperty("customerNumber")
    public String getCustomerNumber();

    /**
     *  <p>Maps to <code>Customer.email</code>.</p>
     * @return email
     */
    @NotNull
    @JsonProperty("email")
    public String getEmail();

    /**
     *  <p>Maps to <code>Customer.password</code>.</p>
     * @return password
     */

    @JsonProperty("password")
    public String getPassword();

    /**
     *  <p>The References to the Stores with which the Customer is associated. If referenced Stores do not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Stores are created.</p>
     * @return stores
     */
    @Valid
    @JsonProperty("stores")
    public List<StoreKeyReference> getStores();

    /**
     *  <p>Maps to <code>Customer.firstName</code>.</p>
     * @return firstName
     */

    @JsonProperty("firstName")
    public String getFirstName();

    /**
     *  <p>Maps to <code>Customer.lastName</code>.</p>
     * @return lastName
     */

    @JsonProperty("lastName")
    public String getLastName();

    /**
     *  <p>Maps to <code>Customer.middleName</code>.</p>
     * @return middleName
     */

    @JsonProperty("middleName")
    public String getMiddleName();

    /**
     *  <p>Maps to <code>Customer.title</code>.</p>
     * @return title
     */

    @JsonProperty("title")
    public String getTitle();

    /**
     *  <p>Maps to <code>Customer.salutation</code>.</p>
     * @return salutation
     */

    @JsonProperty("salutation")
    public String getSalutation();

    /**
     *  <p>Maps to <code>Customer.externalId</code>.</p>
     * @return externalId
     */

    @JsonProperty("externalId")
    public String getExternalId();

    /**
     *  <p>Maps to <code>Customer.dateOfBirth</code>.</p>
     * @return dateOfBirth
     */

    @JsonProperty("dateOfBirth")
    public LocalDate getDateOfBirth();

    /**
     *  <p>Maps to <code>Customer.companyName</code>.</p>
     * @return companyName
     */

    @JsonProperty("companyName")
    public String getCompanyName();

    /**
     *  <p>Maps to <code>Customer.vatId</code>.</p>
     * @return vatId
     */

    @JsonProperty("vatId")
    public String getVatId();

    /**
     *  <p>Maps to <code>Customer.isEmailVerified</code>.</p>
     * @return isEmailVerified
     */

    @JsonProperty("isEmailVerified")
    public Boolean getIsEmailVerified();

    /**
     *  <p>The Reference to the CustomerGroup with which the Customer is associated. If referenced CustomerGroup does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary CustomerGroup is created.</p>
     * @return customerGroup
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupKeyReference getCustomerGroup();

    /**
     *  <p>Maps to <code>Customer.addresses</code>.</p>
     * @return addresses
     */
    @NotNull
    @Valid
    @JsonProperty("addresses")
    public List<CustomerAddress> getAddresses();

    /**
     *  <p>The index of the address in the addresses array. The <code>defaultBillingAddressId</code> of the customer will be set to the ID of that address.</p>
     * @return defaultBillingAddress
     */

    @JsonProperty("defaultBillingAddress")
    public Integer getDefaultBillingAddress();

    /**
     *  <p>The indices of the billing addresses in the addresses array. The <code>billingAddressIds</code> of the customer will be set to the IDs of that addresses.</p>
     * @return billingAddresses
     */

    @JsonProperty("billingAddresses")
    public List<Integer> getBillingAddresses();

    /**
     *  <p>The index of the address in the addresses array. The <code>defaultShippingAddressId</code> of the customer will be set to the ID of that address.</p>
     * @return defaultShippingAddress
     */

    @JsonProperty("defaultShippingAddress")
    public Integer getDefaultShippingAddress();

    /**
     *  <p>The indices of the shipping addresses in the addresses array. The <code>shippingAddressIds</code> of the customer will be set to the IDs of that addresses.</p>
     * @return shippingAddresses
     */

    @JsonProperty("shippingAddresses")
    public List<Integer> getShippingAddresses();

    /**
     *  <p>Maps to <code>Customer.locale</code>.</p>
     * @return locale
     */

    @JsonProperty("locale")
    public String getLocale();

    /**
     *  <p>The Custom Fields for this Customer.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public Custom getCustom();

    /**
     *  <ul>
     *   <li>Set to <code>Password</code> to make the <code>password</code> field required for the Customer.</li>
     *   <li>Set to <code>ExternalAuth</code> when the password is not required for the Customer.</li>
     *  </ul>
     * @return authenticationMode
     */

    @JsonProperty("authenticationMode")
    public AuthenticationMode getAuthenticationMode();

    /**
     *  <p>Maps to <code>Customer.customerNumber</code>.</p>
     * @param customerNumber value to be set
     */

    public void setCustomerNumber(final String customerNumber);

    /**
     *  <p>Maps to <code>Customer.email</code>.</p>
     * @param email value to be set
     */

    public void setEmail(final String email);

    /**
     *  <p>Maps to <code>Customer.password</code>.</p>
     * @param password value to be set
     */

    public void setPassword(final String password);

    /**
     *  <p>The References to the Stores with which the Customer is associated. If referenced Stores do not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Stores are created.</p>
     * @param stores values to be set
     */

    @JsonIgnore
    public void setStores(final StoreKeyReference... stores);

    /**
     *  <p>The References to the Stores with which the Customer is associated. If referenced Stores do not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Stores are created.</p>
     * @param stores values to be set
     */

    public void setStores(final List<StoreKeyReference> stores);

    /**
     *  <p>Maps to <code>Customer.firstName</code>.</p>
     * @param firstName value to be set
     */

    public void setFirstName(final String firstName);

    /**
     *  <p>Maps to <code>Customer.lastName</code>.</p>
     * @param lastName value to be set
     */

    public void setLastName(final String lastName);

    /**
     *  <p>Maps to <code>Customer.middleName</code>.</p>
     * @param middleName value to be set
     */

    public void setMiddleName(final String middleName);

    /**
     *  <p>Maps to <code>Customer.title</code>.</p>
     * @param title value to be set
     */

    public void setTitle(final String title);

    /**
     *  <p>Maps to <code>Customer.salutation</code>.</p>
     * @param salutation value to be set
     */

    public void setSalutation(final String salutation);

    /**
     *  <p>Maps to <code>Customer.externalId</code>.</p>
     * @param externalId value to be set
     */

    public void setExternalId(final String externalId);

    /**
     *  <p>Maps to <code>Customer.dateOfBirth</code>.</p>
     * @param dateOfBirth value to be set
     */

    public void setDateOfBirth(final LocalDate dateOfBirth);

    /**
     *  <p>Maps to <code>Customer.companyName</code>.</p>
     * @param companyName value to be set
     */

    public void setCompanyName(final String companyName);

    /**
     *  <p>Maps to <code>Customer.vatId</code>.</p>
     * @param vatId value to be set
     */

    public void setVatId(final String vatId);

    /**
     *  <p>Maps to <code>Customer.isEmailVerified</code>.</p>
     * @param isEmailVerified value to be set
     */

    public void setIsEmailVerified(final Boolean isEmailVerified);

    /**
     *  <p>The Reference to the CustomerGroup with which the Customer is associated. If referenced CustomerGroup does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary CustomerGroup is created.</p>
     * @param customerGroup value to be set
     */

    public void setCustomerGroup(final CustomerGroupKeyReference customerGroup);

    /**
     *  <p>Maps to <code>Customer.addresses</code>.</p>
     * @param addresses values to be set
     */

    @JsonIgnore
    public void setAddresses(final CustomerAddress... addresses);

    /**
     *  <p>Maps to <code>Customer.addresses</code>.</p>
     * @param addresses values to be set
     */

    public void setAddresses(final List<CustomerAddress> addresses);

    /**
     *  <p>The index of the address in the addresses array. The <code>defaultBillingAddressId</code> of the customer will be set to the ID of that address.</p>
     * @param defaultBillingAddress value to be set
     */

    public void setDefaultBillingAddress(final Integer defaultBillingAddress);

    /**
     *  <p>The indices of the billing addresses in the addresses array. The <code>billingAddressIds</code> of the customer will be set to the IDs of that addresses.</p>
     * @param billingAddresses values to be set
     */

    @JsonIgnore
    public void setBillingAddresses(final Integer... billingAddresses);

    /**
     *  <p>The indices of the billing addresses in the addresses array. The <code>billingAddressIds</code> of the customer will be set to the IDs of that addresses.</p>
     * @param billingAddresses values to be set
     */

    public void setBillingAddresses(final List<Integer> billingAddresses);

    /**
     *  <p>The index of the address in the addresses array. The <code>defaultShippingAddressId</code> of the customer will be set to the ID of that address.</p>
     * @param defaultShippingAddress value to be set
     */

    public void setDefaultShippingAddress(final Integer defaultShippingAddress);

    /**
     *  <p>The indices of the shipping addresses in the addresses array. The <code>shippingAddressIds</code> of the customer will be set to the IDs of that addresses.</p>
     * @param shippingAddresses values to be set
     */

    @JsonIgnore
    public void setShippingAddresses(final Integer... shippingAddresses);

    /**
     *  <p>The indices of the shipping addresses in the addresses array. The <code>shippingAddressIds</code> of the customer will be set to the IDs of that addresses.</p>
     * @param shippingAddresses values to be set
     */

    public void setShippingAddresses(final List<Integer> shippingAddresses);

    /**
     *  <p>Maps to <code>Customer.locale</code>.</p>
     * @param locale value to be set
     */

    public void setLocale(final String locale);

    /**
     *  <p>The Custom Fields for this Customer.</p>
     * @param custom value to be set
     */

    public void setCustom(final Custom custom);

    /**
     *  <ul>
     *   <li>Set to <code>Password</code> to make the <code>password</code> field required for the Customer.</li>
     *   <li>Set to <code>ExternalAuth</code> when the password is not required for the Customer.</li>
     *  </ul>
     * @param authenticationMode value to be set
     */

    public void setAuthenticationMode(final AuthenticationMode authenticationMode);

    /**
     * factory method
     * @return instance of CustomerImport
     */
    public static CustomerImport of() {
        return new CustomerImportImpl();
    }

    /**
     * factory method to copy an instance of CustomerImport
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomerImport of(final CustomerImport template) {
        CustomerImportImpl instance = new CustomerImportImpl();
        instance.setKey(template.getKey());
        instance.setCustomerNumber(template.getCustomerNumber());
        instance.setEmail(template.getEmail());
        instance.setPassword(template.getPassword());
        instance.setStores(template.getStores());
        instance.setFirstName(template.getFirstName());
        instance.setLastName(template.getLastName());
        instance.setMiddleName(template.getMiddleName());
        instance.setTitle(template.getTitle());
        instance.setSalutation(template.getSalutation());
        instance.setExternalId(template.getExternalId());
        instance.setDateOfBirth(template.getDateOfBirth());
        instance.setCompanyName(template.getCompanyName());
        instance.setVatId(template.getVatId());
        instance.setIsEmailVerified(template.getIsEmailVerified());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setAddresses(template.getAddresses());
        instance.setDefaultBillingAddress(template.getDefaultBillingAddress());
        instance.setBillingAddresses(template.getBillingAddresses());
        instance.setDefaultShippingAddress(template.getDefaultShippingAddress());
        instance.setShippingAddresses(template.getShippingAddresses());
        instance.setLocale(template.getLocale());
        instance.setCustom(template.getCustom());
        instance.setAuthenticationMode(template.getAuthenticationMode());
        return instance;
    }

    /**
     * builder factory method for CustomerImport
     * @return builder
     */
    public static CustomerImportBuilder builder() {
        return CustomerImportBuilder.of();
    }

    /**
     * create builder for CustomerImport instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomerImportBuilder builder(final CustomerImport template) {
        return CustomerImportBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomerImport(Function<CustomerImport, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomerImport> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerImport>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerImport>";
            }
        };
    }
}
