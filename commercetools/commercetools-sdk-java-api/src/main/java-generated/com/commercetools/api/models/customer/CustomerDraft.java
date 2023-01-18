
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

/**
 * CustomerDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomerDraft customerDraft = CustomerDraft.builder()
 *             .email("{email}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomerDraftImpl.class)
public interface CustomerDraft extends com.commercetools.api.models.CustomizableDraft<CustomerDraft>,
        com.commercetools.api.models.WithKey, io.vrap.rmf.base.client.Draft<CustomerDraft> {

    /**
     *  <p>User-defined unique identifier for the Customer. The <code>key</code> field is preferred over <code>customerNumber</code> as it is mutable and provides more flexibility.</p>
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>User-defined unique identifier for a Customer. Once set, it cannot be changed.</p>
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
     *  <p>Email address of the Customer that must be unique for an entire Project or to a Store the Customer is assigned to. It is the mandatory unique identifier of a Customer.</p>
     */
    @NotNull
    @JsonProperty("email")
    public String getEmail();

    /**
     *  <p>Required when <code>authenticationMode</code> is set to <code>Password</code>. Provide the Customer's password in plain text. The API stores passwords in an encrypted format.</p>
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
     *  <p>Deprecated since an anonymous Cart can be identified by its <code>id</code> or external <code>key</code>.</p>
     */
    @Deprecated
    @JsonProperty("anonymousCartId")
    public String getAnonymousCartId();

    /**
     *  <p>Identifies a Cart that will be assigned to the new Customer.</p>
     */
    @Valid
    @JsonProperty("anonymousCart")
    public CartResourceIdentifier getAnonymousCart();

    /**
     *  <p>Identifies Carts and Orders belonging to an anonymous session that will be assigned to the new Customer.</p>
     */

    @JsonProperty("anonymousId")
    public String getAnonymousId();

    /**
     *  <p>Date of birth of the Customer.</p>
     */

    @JsonProperty("dateOfBirth")
    public LocalDate getDateOfBirth();

    /**
     *  <p>Company name of the Customer. When representing a company as a Customer, Business Units provide extended funtionality.</p>
     */

    @JsonProperty("companyName")
    public String getCompanyName();

    /**
     *  <p>Unique VAT ID of the Customer.</p>
     */

    @JsonProperty("vatId")
    public String getVatId();

    /**
     *  <p>Addresses of the Customer.</p>
     */
    @Valid
    @JsonProperty("addresses")
    public List<BaseAddress> getAddresses();

    /**
     *  <p>Index of the address in the <code>addresses</code> array to use as the default shipping address. The <code>defaultShippingAddressId</code> of the Customer will be set to the <code>id</code> of that address.</p>
     */

    @JsonProperty("defaultShippingAddress")
    public Integer getDefaultShippingAddress();

    /**
     *  <p>Indices of the shipping addresses in the <code>addresses</code> array. The <code>shippingAddressIds</code> of the Customer will be set to the IDs of these addresses.</p>
     */

    @JsonProperty("shippingAddresses")
    public List<Integer> getShippingAddresses();

    /**
     *  <p>Index of the address in the <code>addresses</code> array to use as the default billing address. The <code>defaultBillingAddressId</code> of the Customer will be set to the <code>id</code> of that address.</p>
     */

    @JsonProperty("defaultBillingAddress")
    public Integer getDefaultBillingAddress();

    /**
     *  <p>Indices of the billing addresses in the <code>addresses</code> array. The <code>billingAddressIds</code> of the Customer will be set to the IDs of these addresses.</p>
     */

    @JsonProperty("billingAddresses")
    public List<Integer> getBillingAddresses();

    /**
     *  <p>Set to <code>true</code> if the email address of the Customer has been verified already. The intended use is to leave this field unset upon sign-up of the Customer and initiate the email verification afterwards.</p>
     */

    @JsonProperty("isEmailVerified")
    public Boolean getIsEmailVerified();

    /**
     *  <p>Sets the CustomerGroup for the Customer.</p>
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupResourceIdentifier getCustomerGroup();

    /**
     *  <p>Custom Fields for the Customer.</p>
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>Preferred language of the Customer. Must be one of the languages supported by the Project.</p>
     */

    @JsonProperty("locale")
    public String getLocale();

    /**
     *  <p>Salutation of the Customer, for example, 'Mr.' or 'Mrs.'.</p>
     */

    @JsonProperty("salutation")
    public String getSalutation();

    /**
     *  <p>Sets the Stores for the Customer.</p>
     *  <ul>
     *   <li>If no Stores are specified, the Customer is a global customer, and can log in using the Password Flow for global Customers.</li>
     *   <li>If any Stores are specified, the Customer can only log in using the Password Flow for Customers in a Store for those specific Stores.</li>
     *  </ul>
     */
    @Valid
    @JsonProperty("stores")
    public List<StoreResourceIdentifier> getStores();

    /**
     *  <ul>
     *   <li>Set to <code>Password</code> to make the <code>password</code> field required for the Customer.</li>
     *   <li>Set to <code>ExternalAuth</code> when the password is not required for the Customer.</li>
     *  </ul>
     */

    @JsonProperty("authenticationMode")
    public AuthenticationMode getAuthenticationMode();

    public void setKey(final String key);

    public void setCustomerNumber(final String customerNumber);

    public void setExternalId(final String externalId);

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

    public void setCustomerGroup(final CustomerGroupResourceIdentifier customerGroup);

    public void setCustom(final CustomFieldsDraft custom);

    public void setLocale(final String locale);

    public void setSalutation(final String salutation);

    @JsonIgnore
    public void setStores(final StoreResourceIdentifier... stores);

    public void setStores(final List<StoreResourceIdentifier> stores);

    public void setAuthenticationMode(final AuthenticationMode authenticationMode);

    public static CustomerDraft of() {
        return new CustomerDraftImpl();
    }

    public static CustomerDraft of(final CustomerDraft template) {
        CustomerDraftImpl instance = new CustomerDraftImpl();
        instance.setKey(template.getKey());
        instance.setCustomerNumber(template.getCustomerNumber());
        instance.setExternalId(template.getExternalId());
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
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setCustom(template.getCustom());
        instance.setLocale(template.getLocale());
        instance.setSalutation(template.getSalutation());
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

    public static CustomerDraftBuilder builder(Customer customer) {
        List<BaseAddress> addresses = new ArrayList<>(customer.getAddresses());
        Map<String, Integer> addressIds = java.util.stream.IntStream.range(0, addresses.size())
                .boxed()
                .collect(
                    java.util.stream.Collectors.toMap(integer -> addresses.get(integer).getId(), Function.identity()));
        return CustomerDraft.builder()
                .key(customer.getKey())
                .customerNumber(customer.getCustomerNumber())
                .externalId(customer.getExternalId())
                .email(customer.getEmail())
                .firstName(customer.getFirstName())
                .lastName(customer.getLastName())
                .middleName(customer.getMiddleName())
                .title(customer.getTitle())
                .dateOfBirth(customer.getDateOfBirth())
                .companyName(customer.getCompanyName())
                .vatId(customer.getVatId())
                .addresses(addresses.size() > 0 ? addresses : null)
                .defaultBillingAddress(customer.getDefaultBillingAddressId() != null
                        ? addressIds.get(customer.getDefaultBillingAddressId())
                        : null)
                .defaultShippingAddress(customer.getDefaultShippingAddressId() != null
                        ? addressIds.get(customer.getDefaultShippingAddressId())
                        : null)
                .billingAddresses(customer.getBillingAddressIds().size() > 0 ? addressIds.entrySet()
                        .stream()
                        .filter(entry -> customer.getBillingAddressIds().contains(entry.getKey()))
                        .map(Map.Entry::getValue)
                        .collect(java.util.stream.Collectors.toList()) : null)
                .shippingAddresses(customer.getShippingAddressIds().size() > 0 ? addressIds.entrySet()
                        .stream()
                        .filter(entry -> customer.getShippingAddressIds().contains(entry.getKey()))
                        .map(Map.Entry::getValue)
                        .collect(java.util.stream.Collectors.toList()) : null)
                .isEmailVerified(customer.getIsEmailVerified())
                .customerGroup(Optional.ofNullable(customer.getCustomerGroup())
                        .map(reference -> CustomerGroupResourceIdentifier.builder().id(reference.getId()).build())
                        .orElse(null))
                .locale(customer.getLocale())
                .salutation(customer.getSalutation())
                .stores(Optional.ofNullable(customer.getStores())
                        .map(stores -> stores.stream()
                                .map(store -> StoreResourceIdentifier.builder().key(store.getKey()).build())
                                .collect(java.util.stream.Collectors.toList()))
                        .orElse(null))
                .authenticationMode(customer.getAuthenticationMode())
                .custom(Optional.ofNullable(customer.getCustom())
                        .map(com.commercetools.api.models.type.CustomFields::toDraft)
                        .orElse(null));
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
