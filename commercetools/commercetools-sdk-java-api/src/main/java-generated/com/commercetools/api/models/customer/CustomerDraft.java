
package com.commercetools.api.models.customer;

import java.time.*;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.CartResourceIdentifier;
import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomerDraftImpl.class)
public interface CustomerDraft extends com.commercetools.api.models.CustomizableDraft<CustomerDraft> {

    /**
    *  <p>String that uniquely identifies a customer.
    *  It can be used to create more human-readable (in contrast to ID) identifier for the customer.
    *  It should be <strong>unique</strong> across a project.
    *  Once it's set it cannot be changed.</p>
    */

    @JsonProperty("customerNumber")
    public String getCustomerNumber();

    /**
    *  <p>The customer's email address and the main identifier of uniqueness for a customer account.
    *  Email addresses are either unique to the store they're specified for, <em>or</em> for the entire project, and are case insensitive.
    *  For more information, see Email uniquenes.</p>
    */
    @NotNull
    @JsonProperty("email")
    public String getEmail();

    /**
    *  <p>Only optional with <code>authenticationMode</code> set to <code>ExternalAuth</code>.</p>
    */

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

    /**
    *  <p>Identifies a single cart that will be assigned to the new customer account.</p>
    */
    @Deprecated
    @JsonProperty("anonymousCartId")
    public String getAnonymousCartId();

    /**
    *  <p>Identifies a single cart that will be assigned to the new customer account.</p>
    */
    @Valid
    @JsonProperty("anonymousCart")
    public CartResourceIdentifier getAnonymousCart();

    /**
    *  <p>Identifies carts and orders belonging to an anonymous session that will be assigned to the new customer account.</p>
    */

    @JsonProperty("anonymousId")
    public String getAnonymousId();

    @JsonProperty("dateOfBirth")
    public LocalDate getDateOfBirth();

    @JsonProperty("companyName")
    public String getCompanyName();

    @JsonProperty("vatId")
    public String getVatId();

    /**
    *  <p>Sets the ID of each address to be unique in the addresses list.</p>
    */
    @Valid
    @JsonProperty("addresses")
    public List<BaseAddress> getAddresses();

    /**
    *  <p>The index of the address in the addresses array.
    *  The <code>defaultShippingAddressId</code> of the customer will be set to the ID of that address.</p>
    */

    @JsonProperty("defaultShippingAddress")
    public Integer getDefaultShippingAddress();

    /**
    *  <p>The indices of the shipping addresses in the addresses array.
    *  The <code>shippingAddressIds</code> of the Customer will be set to the IDs of that addresses.</p>
    */

    @JsonProperty("shippingAddresses")
    public List<Integer> getShippingAddresses();

    /**
    *  <p>The index of the address in the addresses array.
    *  The <code>defaultBillingAddressId</code> of the customer will be set to the ID of that address.</p>
    */

    @JsonProperty("defaultBillingAddress")
    public Integer getDefaultBillingAddress();

    /**
    *  <p>The indices of the billing addresses in the addresses array.
    *  The <code>billingAddressIds</code> of the customer will be set to the IDs of that addresses.</p>
    */

    @JsonProperty("billingAddresses")
    public List<Integer> getBillingAddresses();

    @JsonProperty("isEmailVerified")
    public Boolean getIsEmailVerified();

    @JsonProperty("externalId")
    public String getExternalId();

    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupResourceIdentifier getCustomerGroup();

    /**
    *  <p>The custom fields.</p>
    */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
    *  <p>Must be one of the languages supported for this project</p>
    */

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
    public List<StoreResourceIdentifier> getStores();

    /**
    *  <p>Defines whether a password is required for the Customer that is used for platform-internal authentication.</p>
    */

    @JsonProperty("authenticationMode")
    public AuthenticationMode getAuthenticationMode();

    public void setCustomerNumber(final String customerNumber);

    public void setEmail(final String email);

    public void setPassword(final String password);

    public void setFirstName(final String firstName);

    public void setLastName(final String lastName);

    public void setMiddleName(final String middleName);

    public void setTitle(final String title);

    @Deprecated
    public void setAnonymousCartId(final String anonymousCartId);

    public void setAnonymousCart(final CartResourceIdentifier anonymousCart);

    public void setAnonymousId(final String anonymousId);

    public void setDateOfBirth(final LocalDate dateOfBirth);

    public void setCompanyName(final String companyName);

    public void setVatId(final String vatId);

    @JsonIgnore
    public void setAddresses(final BaseAddress... addresses);

    public void setAddresses(final List<BaseAddress> addresses);

    public void setDefaultShippingAddress(final Integer defaultShippingAddress);

    @JsonIgnore
    public void setShippingAddresses(final Integer... shippingAddresses);

    public void setShippingAddresses(final List<Integer> shippingAddresses);

    public void setDefaultBillingAddress(final Integer defaultBillingAddress);

    @JsonIgnore
    public void setBillingAddresses(final Integer... billingAddresses);

    public void setBillingAddresses(final List<Integer> billingAddresses);

    public void setIsEmailVerified(final Boolean isEmailVerified);

    public void setExternalId(final String externalId);

    public void setCustomerGroup(final CustomerGroupResourceIdentifier customerGroup);

    public void setCustom(final CustomFieldsDraft custom);

    public void setLocale(final String locale);

    public void setSalutation(final String salutation);

    public void setKey(final String key);

    @JsonIgnore
    public void setStores(final StoreResourceIdentifier... stores);

    public void setStores(final List<StoreResourceIdentifier> stores);

    public void setAuthenticationMode(final AuthenticationMode authenticationMode);

    public static CustomerDraft of() {
        return new CustomerDraftImpl();
    }

    public static CustomerDraft of(final CustomerDraft template) {
        CustomerDraftImpl instance = new CustomerDraftImpl();
        instance.setCustomerNumber(template.getCustomerNumber());
        instance.setEmail(template.getEmail());
        instance.setPassword(template.getPassword());
        instance.setFirstName(template.getFirstName());
        instance.setLastName(template.getLastName());
        instance.setMiddleName(template.getMiddleName());
        instance.setTitle(template.getTitle());
        instance.setAnonymousCartId(template.getAnonymousCartId());
        instance.setAnonymousCart(template.getAnonymousCart());
        instance.setAnonymousId(template.getAnonymousId());
        instance.setDateOfBirth(template.getDateOfBirth());
        instance.setCompanyName(template.getCompanyName());
        instance.setVatId(template.getVatId());
        instance.setAddresses(template.getAddresses());
        instance.setDefaultShippingAddress(template.getDefaultShippingAddress());
        instance.setShippingAddresses(template.getShippingAddresses());
        instance.setDefaultBillingAddress(template.getDefaultBillingAddress());
        instance.setBillingAddresses(template.getBillingAddresses());
        instance.setIsEmailVerified(template.getIsEmailVerified());
        instance.setExternalId(template.getExternalId());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setCustom(template.getCustom());
        instance.setLocale(template.getLocale());
        instance.setSalutation(template.getSalutation());
        instance.setKey(template.getKey());
        instance.setStores(template.getStores());
        instance.setAuthenticationMode(template.getAuthenticationMode());
        return instance;
    }

    public static CustomerDraftBuilder builder() {
        return CustomerDraftBuilder.of();
    }

    public static CustomerDraftBuilder builder(final CustomerDraft template) {
        return CustomerDraftBuilder.of(template);
    }

    default <T> T withCustomerDraft(Function<CustomerDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomerDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomerDraft>() {
            @Override
            public String toString() {
                return "TypeReference<CustomerDraft>";
            }
        };
    }
}
