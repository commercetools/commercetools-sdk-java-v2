
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerImpl.class)
public interface Customer extends BaseResource, com.commercetools.api.models.DomainResource<Customer> {

    /**
    *  <p>The unique ID of the customer.</p>
    */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
    *  <p>The current version of the customer.</p>
    */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
    *  <p>Present on resources created after 2019-02-01 except for <a href="/client-logging#events-tracked">events not tracked</a>.</p>
    */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
    *  <p>Present on resources created after 2019-02-01 except for <a href="/client-logging#events-tracked">events not tracked</a>.</p>
    */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
    *  <p>The customer number can be used to create a more human-readable (in contrast to ID) identifier for the customer.
    *  It should be unique across a project.
    *  Once the field was set it cannot be changed anymore.</p>
    */

    @JsonProperty("customerNumber")
    public String getCustomerNumber();

    /**
    *  <p>The customer's email address and the main identifier of uniqueness for a customer account.
    *  Email addresses are either unique to the store they're specified for, <em>or</em> for the entire project.
    *  For more information, see Email uniquenes.</p>
    */
    @NotNull
    @JsonProperty("email")
    public String getEmail();

    @NotNull
    @JsonProperty("password")
    public String getPassword();

    @JsonProperty("firstName")
    public String getFirstName();

    @JsonProperty("lastName")
    public String getLastName();

    @JsonProperty("middleName")
    public String getMiddleName();

    @JsonProperty("title")
    public String getTitle();

    @JsonProperty("dateOfBirth")
    public LocalDate getDateOfBirth();

    @JsonProperty("companyName")
    public String getCompanyName();

    @JsonProperty("vatId")
    public String getVatId();

    /**
    *  <p>The addresses have unique IDs in the addresses list</p>
    */
    @NotNull
    @Valid
    @JsonProperty("addresses")
    public List<Address> getAddresses();

    /**
    *  <p>The address ID in the addresses list</p>
    */

    @JsonProperty("defaultShippingAddressId")
    public String getDefaultShippingAddressId();

    /**
    *  <p>The IDs from the addresses list which are used as shipping addresses</p>
    */

    @JsonProperty("shippingAddressIds")
    public List<String> getShippingAddressIds();

    /**
    *  <p>The address ID in the addresses list</p>
    */

    @JsonProperty("defaultBillingAddressId")
    public String getDefaultBillingAddressId();

    /**
    *  <p>The IDs from the addresses list which are used as billing addresses</p>
    */

    @JsonProperty("billingAddressIds")
    public List<String> getBillingAddressIds();

    @NotNull
    @JsonProperty("isEmailVerified")
    public Boolean getIsEmailVerified();

    @JsonProperty("externalId")
    public String getExternalId();

    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupReference getCustomerGroup();

    @Valid
    @JsonProperty("custom")
    public CustomFields getCustom();

    @JsonProperty("locale")
    public String getLocale();

    @JsonProperty("salutation")
    public String getSalutation();

    /**
    *  <p>User-specific unique identifier for a customer.
    *  Must be unique across a project.
    *  The field can be reset using the Set Key UpdateAction</p>
    */

    @JsonProperty("key")
    public String getKey();

    /**
    *  <p>References to the stores the customer account is associated with.
    *  If no stores are specified, the customer is a global customer, and can log in using the Password Flow for global Customers.
    *  If one or more stores are specified, the customer can only log in using the Password Flow for Customers in a Store for those specific stores.</p>
    */
    @Valid
    @JsonProperty("stores")
    public List<StoreKeyReference> getStores();

    public void setId(final String id);

    public void setVersion(final Long version);

    public void setCreatedAt(final ZonedDateTime createdAt);

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    public void setCreatedBy(final CreatedBy createdBy);

    public void setCustomerNumber(final String customerNumber);

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

    public void setExternalId(final String externalId);

    public void setCustomerGroup(final CustomerGroupReference customerGroup);

    public void setCustom(final CustomFields custom);

    public void setLocale(final String locale);

    public void setSalutation(final String salutation);

    public void setKey(final String key);

    @JsonIgnore
    public void setStores(final StoreKeyReference... stores);

    public void setStores(final List<StoreKeyReference> stores);

    public static Customer of() {
        return new CustomerImpl();
    }

    public static Customer of(final Customer template) {
        CustomerImpl instance = new CustomerImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setCustomerNumber(template.getCustomerNumber());
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
        instance.setExternalId(template.getExternalId());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setCustom(template.getCustom());
        instance.setLocale(template.getLocale());
        instance.setSalutation(template.getSalutation());
        instance.setKey(template.getKey());
        instance.setStores(template.getStores());
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
}
