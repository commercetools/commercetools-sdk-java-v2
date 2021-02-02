
package com.commercetools.api.models.me;

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
@JsonDeserialize(as = MyCustomerImpl.class)
public interface MyCustomer extends BaseResource, com.commercetools.api.models.DomainResource<MyCustomer> {

    @NotNull
    @JsonProperty("id")
    public String getId();

    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    @JsonProperty("customerNumber")
    public String getCustomerNumber();

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

    @NotNull
    @Valid
    @JsonProperty("addresses")
    public List<Address> getAddresses();

    @JsonProperty("defaultShippingAddressId")
    public String getDefaultShippingAddressId();

    @JsonProperty("shippingAddressIds")
    public List<String> getShippingAddressIds();

    @JsonProperty("defaultBillingAddressId")
    public String getDefaultBillingAddressId();

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

    @JsonProperty("key")
    public String getKey();

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

    public static MyCustomer of() {
        return new MyCustomerImpl();
    }

    public static MyCustomer of(final MyCustomer template) {
        MyCustomerImpl instance = new MyCustomerImpl();
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

    public static MyCustomerBuilder builder() {
        return MyCustomerBuilder.of();
    }

    public static MyCustomerBuilder builder(final MyCustomer template) {
        return MyCustomerBuilder.of(template);
    }

    default <T> T withMyCustomer(Function<MyCustomer, T> helper) {
        return helper.apply(this);
    }
}
