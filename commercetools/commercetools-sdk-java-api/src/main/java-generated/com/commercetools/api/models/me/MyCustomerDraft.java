
package com.commercetools.api.models.me;

import java.time.*;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 * MyCustomerDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCustomerDraft myCustomerDraft = MyCustomerDraft.builder()
 *             .email("{email}")
 *             .password("{password}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = MyCustomerDraftImpl.class)
public interface MyCustomerDraft extends com.commercetools.api.models.CustomizableDraft<MyCustomerDraft>,
        io.vrap.rmf.base.client.Draft<MyCustomerDraft> {

    /**
     *  <p>Email address of the Customer that is unique for an entire Project or Store the Customer is assigned to. It is the mandatory unique identifier of a Customer.</p>
     * @return email
     */
    @NotNull
    @JsonProperty("email")
    public String getEmail();

    /**
     *  <p>Password of the Customer.</p>
     * @return password
     */
    @NotNull
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
     *  <p>Salutation of the Customer, for example, 'Mr.' or 'Mrs.'.</p>
     * @return salutation
     */

    @JsonProperty("salutation")
    public String getSalutation();

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
     *  <p>Addresses of the Customer.</p>
     * @return addresses
     */
    @Valid
    @JsonProperty("addresses")
    public List<BaseAddress> getAddresses();

    /**
     *  <p>Index of the address in the <code>addresses</code> array to use as the default shipping address. The <code>defaultShippingAddressId</code> of the Customer will be set to the <code>id</code> of that address.</p>
     * @return defaultShippingAddress
     */

    @JsonProperty("defaultShippingAddress")
    public Long getDefaultShippingAddress();

    /**
     *  <p>Index of the address in the <code>addresses</code> array to use as the default billing address. The <code>defaultBillingAddressId</code> of the Customer will be set to the <code>id</code> of that address.</p>
     * @return defaultBillingAddress
     */

    @JsonProperty("defaultBillingAddress")
    public Long getDefaultBillingAddress();

    /**
     *  <p>Custom Fields for the Customer.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>Preferred language of the Customer. Must be one of the languages supported by the Project.</p>
     * @return locale
     */

    @JsonProperty("locale")
    public String getLocale();

    /**
     *  <p>Sets the Stores for the Customer.</p>
     * @return stores
     */
    @Valid
    @JsonProperty("stores")
    public List<StoreResourceIdentifier> getStores();

    /**
     *  <p>Email address of the Customer that is unique for an entire Project or Store the Customer is assigned to. It is the mandatory unique identifier of a Customer.</p>
     * @param email value to be set
     */

    public void setEmail(final String email);

    /**
     *  <p>Password of the Customer.</p>
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
     *  <p>Salutation of the Customer, for example, 'Mr.' or 'Mrs.'.</p>
     * @param salutation value to be set
     */

    public void setSalutation(final String salutation);

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
     *  <p>Addresses of the Customer.</p>
     * @param addresses values to be set
     */

    @JsonIgnore
    public void setAddresses(final BaseAddress... addresses);

    /**
     *  <p>Addresses of the Customer.</p>
     * @param addresses values to be set
     */

    public void setAddresses(final List<BaseAddress> addresses);

    /**
     *  <p>Index of the address in the <code>addresses</code> array to use as the default shipping address. The <code>defaultShippingAddressId</code> of the Customer will be set to the <code>id</code> of that address.</p>
     * @param defaultShippingAddress value to be set
     */

    public void setDefaultShippingAddress(final Long defaultShippingAddress);

    /**
     *  <p>Index of the address in the <code>addresses</code> array to use as the default billing address. The <code>defaultBillingAddressId</code> of the Customer will be set to the <code>id</code> of that address.</p>
     * @param defaultBillingAddress value to be set
     */

    public void setDefaultBillingAddress(final Long defaultBillingAddress);

    /**
     *  <p>Custom Fields for the Customer.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     *  <p>Preferred language of the Customer. Must be one of the languages supported by the Project.</p>
     * @param locale value to be set
     */

    public void setLocale(final String locale);

    /**
     *  <p>Sets the Stores for the Customer.</p>
     * @param stores values to be set
     */

    @JsonIgnore
    public void setStores(final StoreResourceIdentifier... stores);

    /**
     *  <p>Sets the Stores for the Customer.</p>
     * @param stores values to be set
     */

    public void setStores(final List<StoreResourceIdentifier> stores);

    /**
     * factory method
     * @return instance of MyCustomerDraft
     */
    public static MyCustomerDraft of() {
        return new MyCustomerDraftImpl();
    }

    /**
     * factory method to create a shallow copy MyCustomerDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static MyCustomerDraft of(final MyCustomerDraft template) {
        MyCustomerDraftImpl instance = new MyCustomerDraftImpl();
        instance.setEmail(template.getEmail());
        instance.setPassword(template.getPassword());
        instance.setFirstName(template.getFirstName());
        instance.setLastName(template.getLastName());
        instance.setMiddleName(template.getMiddleName());
        instance.setTitle(template.getTitle());
        instance.setSalutation(template.getSalutation());
        instance.setDateOfBirth(template.getDateOfBirth());
        instance.setCompanyName(template.getCompanyName());
        instance.setVatId(template.getVatId());
        instance.setAddresses(template.getAddresses());
        instance.setDefaultShippingAddress(template.getDefaultShippingAddress());
        instance.setDefaultBillingAddress(template.getDefaultBillingAddress());
        instance.setCustom(template.getCustom());
        instance.setLocale(template.getLocale());
        instance.setStores(template.getStores());
        return instance;
    }

    /**
     * factory method to create a deep copy of MyCustomerDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MyCustomerDraft deepCopy(@Nullable final MyCustomerDraft template) {
        if (template == null) {
            return null;
        }
        MyCustomerDraftImpl instance = new MyCustomerDraftImpl();
        instance.setEmail(template.getEmail());
        instance.setPassword(template.getPassword());
        instance.setFirstName(template.getFirstName());
        instance.setLastName(template.getLastName());
        instance.setMiddleName(template.getMiddleName());
        instance.setTitle(template.getTitle());
        instance.setSalutation(template.getSalutation());
        instance.setDateOfBirth(template.getDateOfBirth());
        instance.setCompanyName(template.getCompanyName());
        instance.setVatId(template.getVatId());
        instance.setAddresses(Optional.ofNullable(template.getAddresses())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.BaseAddress::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setDefaultShippingAddress(template.getDefaultShippingAddress());
        instance.setDefaultBillingAddress(template.getDefaultBillingAddress());
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
        instance.setLocale(template.getLocale());
        instance.setStores(Optional.ofNullable(template.getStores())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.store.StoreResourceIdentifier::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for MyCustomerDraft
     * @return builder
     */
    public static MyCustomerDraftBuilder builder() {
        return MyCustomerDraftBuilder.of();
    }

    /**
     * create builder for MyCustomerDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCustomerDraftBuilder builder(final MyCustomerDraft template) {
        return MyCustomerDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMyCustomerDraft(Function<MyCustomerDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerDraft>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerDraft>";
            }
        };
    }
}
