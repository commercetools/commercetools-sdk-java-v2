
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
*  <p>The data representation for a Customer to be imported that is persisted as a <a href="/../api/projects/customers#top">Customer</a> in the Project.</p>
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
    *  <p>The References to the Stores with which the Customer is associated. If referenced Stores do not exist, the <code>state</code> of the <a href="/import-operation#importoperation">ImportOperation</a> will be set to <code>Unresolved</code> until the necessary Stores are created.</p>
    */
    @Valid
    @JsonProperty("stores")
    public List<StoreKeyReference> getStores();

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
    *  <p>The Reference to the <a href="/../api/projects/customerGroups#customergroup">CustomerGroup</a> with which the Customer is associated.
    *  If referenced CustomerGroup does not exist, the <code>state</code> of the <a href="/import-operation#importoperation">ImportOperation</a> will be set to <code>Unresolved</code> until the necessary CustomerGroup is created.</p>
    */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupKeyReference getCustomerGroup();

    /**
    *  <p>Maps to <code>Customer.addresses</code>.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("addresses")
    public List<CustomerAddress> getAddresses();

    /**
    *  <p>The index of the address in the addresses array. The <code>defaultBillingAddressId</code> of the customer will be set to the ID of that address.</p>
    */

    @JsonProperty("defaultBillingAddress")
    public Integer getDefaultBillingAddress();

    /**
    *  <p>The indices of the billing addresses in the addresses array. The <code>billingAddressIds</code> of the customer will be set to the IDs of that addresses.</p>
    */

    @JsonProperty("billingAddresses")
    public List<Integer> getBillingAddresses();

    /**
    *  <p>The index of the address in the addresses array. The <code>defaultShippingAddressId</code> of the customer will be set to the ID of that address.</p>
    */

    @JsonProperty("defaultShippingAddress")
    public Integer getDefaultShippingAddress();

    /**
    *  <p>The indices of the shipping addresses in the addresses array. The <code>shippingAddressIds</code> of the customer will be set to the IDs of that addresses.</p>
    */

    @JsonProperty("shippingAddresses")
    public List<Integer> getShippingAddresses();

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

    @JsonIgnore
    public void setStores(final StoreKeyReference... stores);

    public void setStores(final List<StoreKeyReference> stores);

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
    public void setAddresses(final CustomerAddress... addresses);

    public void setAddresses(final List<CustomerAddress> addresses);

    public void setDefaultBillingAddress(final Integer defaultBillingAddress);

    @JsonIgnore
    public void setBillingAddresses(final Integer... billingAddresses);

    public void setBillingAddresses(final List<Integer> billingAddresses);

    public void setDefaultShippingAddress(final Integer defaultShippingAddress);

    @JsonIgnore
    public void setShippingAddresses(final Integer... shippingAddresses);

    public void setShippingAddresses(final List<Integer> shippingAddresses);

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
