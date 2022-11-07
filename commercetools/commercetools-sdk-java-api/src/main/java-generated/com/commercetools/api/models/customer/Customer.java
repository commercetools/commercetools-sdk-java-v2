
package com.commercetools.api.models.customer;

import java.time.*;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

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
 *             .isEmailVerified(true)
 *             .authenticationMode(AuthenticationMode.PASSWORD)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerImpl.class)
public interface Customer extends BaseResource, com.commercetools.api.models.DomainResource<Customer>,
        com.commercetools.api.models.Referencable<Customer>,
        com.commercetools.api.models.ResourceIdentifiable<Customer>,
        com.commercetools.api.models.Customizable<Customer> {

    /**
     *  <p>Unique identifier of the Customer.</p>
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the Customer.</p>
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>User-defined unique identifier of the Customer.</p>
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>User-defined unique identifier of the Customer.</p>
     *  <p>Can be used to refer to a Customer in a human-readable way (in emails, invoices, and other correspondence).</p>
     */

    @JsonProperty("customerNumber")
    public String getCustomerNumber();

    /**
     *  <p>Optional identifier for use in external systems like Customer Relationship Management (CRM) or Enterprise Resource Planning (ERP).</p>
     */

    @JsonProperty("externalId")
    public String getExternalId();

    /**
     *  <p>Date and time (UTC) the Customer was initially created.</p>
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the Customer was last updated.</p>
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>Email address of the Customer that is unique for an entire Project or to a Store the Customer is assigned to. It is the mandatory unique identifier of a Customer.</p>
     */
    @NotNull
    @JsonProperty("email")
    public String getEmail();

    /**
     *  <p>Present only when <code>authenticationMode</code> is set to <code>Password</code>.</p>
     */

    @JsonProperty("password")
    public String getPassword();

    /**
     *  <p>Given name (first name) of the Customer.</p>
     */

    @JsonProperty("firstName")
    public String getFirstName();

    /**
     *  <p>Family name (last name) of the Customer.</p>
     */

    @JsonProperty("lastName")
    public String getLastName();

    /**
     *  <p>Middle name of the Customer.</p>
     */

    @JsonProperty("middleName")
    public String getMiddleName();

    /**
     *  <p>Title of the Customer, for example, 'Dr.'.</p>
     */

    @JsonProperty("title")
    public String getTitle();

    /**
     *  <p>Date of birth of the Customer.</p>
     */

    @JsonProperty("dateOfBirth")
    public LocalDate getDateOfBirth();

    /**
     *  <p>Company name of the Customer.</p>
     */

    @JsonProperty("companyName")
    public String getCompanyName();

    /**
     *  <p>Unique VAT ID of the Customer.</p>
     */

    @JsonProperty("vatId")
    public String getVatId();

    /**
     *  <p>Addresses used by the Customer.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("addresses")
    public List<Address> getAddresses();

    /**
     *  <p>ID of the address in <code>addresses</code> used as the default shipping address.</p>
     */

    @JsonProperty("defaultShippingAddressId")
    public String getDefaultShippingAddressId();

    /**
     *  <p>IDs of addresses in <code>addresses</code> used as shipping addresses.</p>
     */

    @JsonProperty("shippingAddressIds")
    public List<String> getShippingAddressIds();

    /**
     *  <p>ID of the address in <code>addresses</code> used as the default billing address.</p>
     */

    @JsonProperty("defaultBillingAddressId")
    public String getDefaultBillingAddressId();

    /**
     *  <p>IDs of addresses in <code>addresses</code> used as billing addresses.</p>
     */

    @JsonProperty("billingAddressIds")
    public List<String> getBillingAddressIds();

    /**
     *  <p>Indicates whether the email address of the Customer is verified.</p>
     */
    @NotNull
    @JsonProperty("isEmailVerified")
    public Boolean getIsEmailVerified();

    /**
     *  <p>CustomerGroup to which the Customer belongs.</p>
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupReference getCustomerGroup();

    /**
     *  <p>Custom Fields for the Customer.</p>
     */
    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    /**
     *  <p>Preferred language of the Customer.</p>
     */

    @JsonProperty("locale")
    public String getLocale();

    /**
     *  <p>Salutation of the Customer, for example, 'Mr.' or 'Mrs.'.</p>
     */

    @JsonProperty("salutation")
    public String getSalutation();

    /**
     *  <p>Stores to which the Customer is assigned to.</p>
     *  <ul>
     *   <li>If no Stores are specified, the Customer is a global customer, and can log in using the Password Flow for global Customers.</li>
     *   <li>If any Stores are specified, the Customer can only log in using the Password Flow for Customers in a Store for those specific Stores.</li>
     *  </ul>
     */
    @Valid
    @JsonProperty("stores")
    public List<StoreKeyReference> getStores();

    /**
     *  <p>Indicates whether the <code>password</code> is required for the Customer.</p>
     */
    @NotNull
    @JsonProperty("authenticationMode")
    public AuthenticationMode getAuthenticationMode();

    public void setId(final String id);

    public void setVersion(final Long version);

    public void setKey(final String key);

    public void setCustomerNumber(final String customerNumber);

    public void setExternalId(final String externalId);

    public void setCreatedAt(final ZonedDateTime createdAt);

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    public void setCreatedBy(final CreatedBy createdBy);

    public void setEmail(final String email);

    public void setPassword(final String password);

    public void setFirstName(final String firstName);

    public void setLastName(final String lastName);

    public void setMiddleName(final String middleName);

    public void setTitle(final String title);

    public void setDateOfBirth(final LocalDate dateOfBirth);

    public void setCompanyName(final String companyName);

    public void setVatId(final String vatId);

    @JsonIgnore
    public void setAddresses(final Address... addresses);

    public void setAddresses(final List<Address> addresses);

    public void setDefaultShippingAddressId(final String defaultShippingAddressId);

    @JsonIgnore
    public void setShippingAddressIds(final String... shippingAddressIds);

    public void setShippingAddressIds(final List<String> shippingAddressIds);

    public void setDefaultBillingAddressId(final String defaultBillingAddressId);

    @JsonIgnore
    public void setBillingAddressIds(final String... billingAddressIds);

    public void setBillingAddressIds(final List<String> billingAddressIds);

    public void setIsEmailVerified(final Boolean isEmailVerified);

    public void setCustomerGroup(final CustomerGroupReference customerGroup);

    public void setCustom(final CustomFields custom);

    public void setLocale(final String locale);

    public void setSalutation(final String salutation);

    @JsonIgnore
    public void setStores(final StoreKeyReference... stores);

    public void setStores(final List<StoreKeyReference> stores);

    public void setAuthenticationMode(final AuthenticationMode authenticationMode);

    public static Customer of() {
        return new CustomerImpl();
    }

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
        instance.setCustom(template.getCustom());
        instance.setLocale(template.getLocale());
        instance.setSalutation(template.getSalutation());
        instance.setStores(template.getStores());
        instance.setAuthenticationMode(template.getAuthenticationMode());
        return instance;
    }

    public static CustomerBuilder builder() {
        return CustomerBuilder.of();
    }

    public static CustomerBuilder builder(final Customer template) {
        return CustomerBuilder.of(template);
    }

    default <T> T withCustomer(Function<Customer, T> helper) {
        return helper.apply(this);
    }

    @Override
    public default com.commercetools.api.models.common.ResourceIdentifier toResourceIdentifier() {
        return com.commercetools.api.models.customer.CustomerResourceIdentifier.builder().id(getId()).build();
    }

    @Override
    public default com.commercetools.api.models.common.Reference toReference() {
        return com.commercetools.api.models.customer.CustomerReference.builder().id(getId()).build();
    }

    public static com.fasterxml.jackson.core.type.TypeReference<Customer> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Customer>() {
            @Override
            public String toString() {
                return "TypeReference<Customer>";
            }
        };
    }
}
