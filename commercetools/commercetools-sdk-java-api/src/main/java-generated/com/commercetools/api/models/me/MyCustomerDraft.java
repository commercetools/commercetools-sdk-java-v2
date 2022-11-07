
package com.commercetools.api.models.me;

import java.time.*;
import java.time.LocalDate;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

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
public interface MyCustomerDraft extends com.commercetools.api.models.CustomizableDraft<MyCustomerDraft> {

    /**
     *  <p>Email address of the Customer that is unique for an entire Project or Store the Customer is assigned to. It is the mandatory unique identifier of a Customer.</p>
     */
    @NotNull
    @JsonProperty("email")
    public String getEmail();

    /**
     *  <p>Password of the Customer.</p>
     */
    @NotNull
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
     *  <p>Salutation of the Customer, for example, 'Mr.' or 'Mrs.'.</p>
     */

    @JsonProperty("salutation")
    public String getSalutation();

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
     *  <p>Addresses of the Customer.</p>
     */
    @Valid
    @JsonProperty("addresses")
    public List<BaseAddress> getAddresses();

    /**
     *  <p>Index of the address in the <code>addresses</code> array to use as the default shipping address. The <code>defaultShippingAddressId</code> of the Customer will be set to the <code>id</code> of that address.</p>
     */

    @JsonProperty("defaultShippingAddress")
    public Long getDefaultShippingAddress();

    /**
     *  <p>Index of the address in the <code>addresses</code> array to use as the default billing address. The <code>defaultBillingAddressId</code> of the Customer will be set to the <code>id</code> of that address.</p>
     */

    @JsonProperty("defaultBillingAddress")
    public Long getDefaultBillingAddress();

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
     *  <p>Sets the Stores for the Customer.</p>
     */
    @Valid
    @JsonProperty("stores")
    public List<StoreResourceIdentifier> getStores();

    public void setEmail(final String email);

    public void setPassword(final String password);

    public void setFirstName(final String firstName);

    public void setLastName(final String lastName);

    public void setMiddleName(final String middleName);

    public void setTitle(final String title);

    public void setSalutation(final String salutation);

    public void setDateOfBirth(final LocalDate dateOfBirth);

    public void setCompanyName(final String companyName);

    public void setVatId(final String vatId);

    @JsonIgnore
    public void setAddresses(final BaseAddress... addresses);

    public void setAddresses(final List<BaseAddress> addresses);

    public void setDefaultShippingAddress(final Long defaultShippingAddress);

    public void setDefaultBillingAddress(final Long defaultBillingAddress);

    public void setCustom(final CustomFieldsDraft custom);

    public void setLocale(final String locale);

    @JsonIgnore
    public void setStores(final StoreResourceIdentifier... stores);

    public void setStores(final List<StoreResourceIdentifier> stores);

    public static MyCustomerDraft of() {
        return new MyCustomerDraftImpl();
    }

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

    public static MyCustomerDraftBuilder builder() {
        return MyCustomerDraftBuilder.of();
    }

    public static MyCustomerDraftBuilder builder(final MyCustomerDraft template) {
        return MyCustomerDraftBuilder.of(template);
    }

    default <T> T withMyCustomerDraft(Function<MyCustomerDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MyCustomerDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MyCustomerDraft>() {
            @Override
            public String toString() {
                return "TypeReference<MyCustomerDraft>";
            }
        };
    }
}
