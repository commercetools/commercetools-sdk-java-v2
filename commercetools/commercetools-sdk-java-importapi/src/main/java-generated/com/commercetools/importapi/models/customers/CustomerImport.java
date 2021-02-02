
package com.commercetools.importapi.models.customers;

import java.time.*;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.Address;
import com.commercetools.importapi.models.common.CustomerGroupKeyReference;
import com.commercetools.importapi.models.common.ImportResource;
import com.commercetools.importapi.models.customfields.Custom;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Import representation for a customer.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerImportImpl.class)
public interface CustomerImport extends ImportResource {

    /**
    *  <p>Maps to <code>Customer.customerNumber</code>.</p>
    */

    @JsonProperty("customerNumber")
    public String getCustomerNumber();

    /**
    *  <p>Maps to <code>Customer.email</code>.</p>
    */
    @NotNull
    @JsonProperty("email")
    public String getEmail();

    /**
    *  <p>Maps to <code>Customer.password</code>.</p>
    */
    @NotNull
    @JsonProperty("password")
    public String getPassword();

    /**
    *  <p>Maps to <code>Customer.firstName</code>.</p>
    */

    @JsonProperty("firstName")
    public String getFirstName();

    /**
    *  <p>Maps to <code>Customer.lastName</code>.</p>
    */

    @JsonProperty("lastName")
    public String getLastName();

    /**
    *  <p>Maps to <code>Customer.middleName</code>.</p>
    */

    @JsonProperty("middleName")
    public String getMiddleName();

    /**
    *  <p>Maps to <code>Customer.title</code>.</p>
    */

    @JsonProperty("title")
    public String getTitle();

    /**
    *  <p>Maps to <code>Customer.salutation</code>.</p>
    */

    @JsonProperty("salutation")
    public String getSalutation();

    /**
    *  <p>Maps to <code>Customer.externalId</code>.</p>
    */

    @JsonProperty("externalId")
    public String getExternalId();

    /**
    *  <p>Maps to <code>Customer.dateOfBirth</code>.</p>
    */

    @JsonProperty("dateOfBirth")
    public LocalDate getDateOfBirth();

    /**
    *  <p>Maps to <code>Customer.companyName</code>.</p>
    */

    @JsonProperty("companyName")
    public String getCompanyName();

    /**
    *  <p>Maps to <code>Customer.vatId</code>.</p>
    */

    @JsonProperty("vatId")
    public String getVatId();

    /**
    *  <p>Maps to <code>Customer.isEmailVerified</code>.</p>
    */

    @JsonProperty("isEmailVerified")
    public Boolean getIsEmailVerified();

    /**
    *  <p>References a customer group by its key.</p>
    *  <p>The customer group referenced
    *  must already exist in the commercetools project, or the
    *  import operation state is set to <code>Unresolved</code>.</p>
    */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupKeyReference getCustomerGroup();

    /**
    *  <p>Maps to <code>Customer.addresses</code>.</p>
    */
    @Valid
    @JsonProperty("addresses")
    public List<Address> getAddresses();

    /**
    *  <p>Maps to <code>Customer.defaultBillingAddress</code>.</p>
    */
    @Valid
    @JsonProperty("defaultBillingAddress")
    public Address getDefaultBillingAddress();

    /**
    *  <p>Maps to <code>Customer.billingAddresses</code>.</p>
    */
    @Valid
    @JsonProperty("billingAddresses")
    public Address getBillingAddresses();

    /**
    *  <p>Maps to <code>Customer.defaultShippingAddress</code>.</p>
    */
    @Valid
    @JsonProperty("defaultShippingAddress")
    public Address getDefaultShippingAddress();

    /**
    *  <p>Maps to <code>Customer.shippingAddresses</code>.</p>
    */
    @Valid
    @JsonProperty("shippingAddresses")
    public Address getShippingAddresses();

    /**
    *  <p>Maps to <code>Customer.locale</code>.</p>
    */

    @JsonProperty("locale")
    public String getLocale();

    /**
    *  <p>The custom fields for this Customer.</p>
    */
    @Valid
    @JsonProperty("custom")
    public Custom getCustom();

    public void setCustomerNumber(final String customerNumber);

    public void setEmail(final String email);

    public void setPassword(final String password);

    public void setFirstName(final String firstName);

    public void setLastName(final String lastName);

    public void setMiddleName(final String middleName);

    public void setTitle(final String title);

    public void setSalutation(final String salutation);

    public void setExternalId(final String externalId);

    public void setDateOfBirth(final LocalDate dateOfBirth);

    public void setCompanyName(final String companyName);

    public void setVatId(final String vatId);

    public void setIsEmailVerified(final Boolean isEmailVerified);

    public void setCustomerGroup(final CustomerGroupKeyReference customerGroup);

    @JsonIgnore
    public void setAddresses(final Address... addresses);

    public void setAddresses(final List<Address> addresses);

    public void setDefaultBillingAddress(final Address defaultBillingAddress);

    public void setBillingAddresses(final Address billingAddresses);

    public void setDefaultShippingAddress(final Address defaultShippingAddress);

    public void setShippingAddresses(final Address shippingAddresses);

    public void setLocale(final String locale);

    public void setCustom(final Custom custom);

    public static CustomerImport of() {
        return new CustomerImportImpl();
    }

    public static CustomerImport of(final CustomerImport template) {
        CustomerImportImpl instance = new CustomerImportImpl();
        instance.setKey(template.getKey());
        instance.setCustomerNumber(template.getCustomerNumber());
        instance.setEmail(template.getEmail());
        instance.setPassword(template.getPassword());
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
        return instance;
    }

    public static CustomerImportBuilder builder() {
        return CustomerImportBuilder.of();
    }

    public static CustomerImportBuilder builder(final CustomerImport template) {
        return CustomerImportBuilder.of(template);
    }

    default <T> T withCustomerImport(Function<CustomerImport, T> helper) {
        return helper.apply(this);
    }
}
