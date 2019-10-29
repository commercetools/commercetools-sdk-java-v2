package com.commercetools.api.generated.models.customer;

import com.commercetools.api.generated.models.common.Address;
import com.commercetools.api.generated.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.generated.models.store.StoreResourceIdentifier;
import com.commercetools.api.generated.models.type.CustomFieldsDraft;
import java.time.LocalDate;
import com.commercetools.api.generated.models.customer.CustomerDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CustomerDraftImpl.class)
public interface CustomerDraft  {

   
   
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
   
   
   @JsonProperty("anonymousCartId")
   public String getAnonymousCartId();
   
   
   @JsonProperty("anonymousId")
   public String getAnonymousId();
   
   
   @JsonProperty("dateOfBirth")
   public LocalDate getDateOfBirth();
   
   
   @JsonProperty("companyName")
   public String getCompanyName();
   
   
   @JsonProperty("vatId")
   public String getVatId();
   
   @Valid
   @JsonProperty("addresses")
   public List<Address> getAddresses();
   
   
   @JsonProperty("defaultShippingAddress")
   public Long getDefaultShippingAddress();
   
   
   @JsonProperty("shippingAddresses")
   public List<Integer> getShippingAddresses();
   
   
   @JsonProperty("defaultBillingAddress")
   public Long getDefaultBillingAddress();
   
   
   @JsonProperty("billingAddresses")
   public List<Integer> getBillingAddresses();
   
   
   @JsonProperty("isEmailVerified")
   public Boolean getIsEmailVerified();
   
   
   @JsonProperty("externalId")
   public String getExternalId();
   
   @Valid
   @JsonProperty("customerGroup")
   public CustomerGroupResourceIdentifier getCustomerGroup();
   
   @Valid
   @JsonProperty("custom")
   public CustomFieldsDraft getCustom();
   
   
   @JsonProperty("locale")
   public String getLocale();
   
   
   @JsonProperty("salutation")
   public String getSalutation();
   
   
   @JsonProperty("key")
   public String getKey();
   
   @Valid
   @JsonProperty("stores")
   public List<StoreResourceIdentifier> getStores();

   public void setCustomerNumber(final String customerNumber);
   
   public void setEmail(final String email);
   
   public void setPassword(final String password);
   
   public void setFirstName(final String firstName);
   
   public void setLastName(final String lastName);
   
   public void setMiddleName(final String middleName);
   
   public void setTitle(final String title);
   
   public void setAnonymousCartId(final String anonymousCartId);
   
   public void setAnonymousId(final String anonymousId);
   
   public void setDateOfBirth(final LocalDate dateOfBirth);
   
   public void setCompanyName(final String companyName);
   
   public void setVatId(final String vatId);
   
   public void setAddresses(final List<Address> addresses);
   
   public void setDefaultShippingAddress(final Long defaultShippingAddress);
   
   public void setShippingAddresses(final List<Integer> shippingAddresses);
   
   public void setDefaultBillingAddress(final Long defaultBillingAddress);
   
   public void setBillingAddresses(final List<Integer> billingAddresses);
   
   public void setIsEmailVerified(final Boolean isEmailVerified);
   
   public void setExternalId(final String externalId);
   
   public void setCustomerGroup(final CustomerGroupResourceIdentifier customerGroup);
   
   public void setCustom(final CustomFieldsDraft custom);
   
   public void setLocale(final String locale);
   
   public void setSalutation(final String salutation);
   
   public void setKey(final String key);
   
   public void setStores(final List<StoreResourceIdentifier> stores);
   
   public static CustomerDraftImpl of(){
      return new CustomerDraftImpl();
   }
   

   public static CustomerDraftImpl of(final CustomerDraft template) {
      CustomerDraftImpl instance = new CustomerDraftImpl();
      instance.setAnonymousId(template.getAnonymousId());
      instance.setLastName(template.getLastName());
      instance.setAddresses(template.getAddresses());
      instance.setDefaultShippingAddress(template.getDefaultShippingAddress());
      instance.setStores(template.getStores());
      instance.setCustomerGroup(template.getCustomerGroup());
      instance.setCustom(template.getCustom());
      instance.setCompanyName(template.getCompanyName());
      instance.setVatId(template.getVatId());
      instance.setExternalId(template.getExternalId());
      instance.setBillingAddresses(template.getBillingAddresses());
      instance.setDateOfBirth(template.getDateOfBirth());
      instance.setLocale(template.getLocale());
      instance.setTitle(template.getTitle());
      instance.setCustomerNumber(template.getCustomerNumber());
      instance.setIsEmailVerified(template.getIsEmailVerified());
      instance.setFirstName(template.getFirstName());
      instance.setPassword(template.getPassword());
      instance.setMiddleName(template.getMiddleName());
      instance.setSalutation(template.getSalutation());
      instance.setAnonymousCartId(template.getAnonymousCartId());
      instance.setKey(template.getKey());
      instance.setDefaultBillingAddress(template.getDefaultBillingAddress());
      instance.setEmail(template.getEmail());
      instance.setShippingAddresses(template.getShippingAddresses());
      return instance;
   }

}