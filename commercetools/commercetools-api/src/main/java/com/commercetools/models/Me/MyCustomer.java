package com.commercetools.models.Me;

import com.commercetools.models.Common.Address;
import com.commercetools.models.Common.LoggedResource;
import com.commercetools.models.CustomerGroup.CustomerGroupReference;
import com.commercetools.models.Type.CustomFields;
import java.lang.Boolean;
import java.lang.String;
import java.time.LocalDate;
import com.commercetools.models.Me.MyCustomerImpl;

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
@JsonDeserialize(as = MyCustomerImpl.class)
public interface MyCustomer extends LoggedResource {

   
   
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
   
   public void setAddresses(final List<Address> addresses);
   
   public void setDefaultShippingAddressId(final String defaultShippingAddressId);
   
   public void setShippingAddressIds(final List<String> shippingAddressIds);
   
   public void setDefaultBillingAddressId(final String defaultBillingAddressId);
   
   public void setBillingAddressIds(final List<String> billingAddressIds);
   
   public void setIsEmailVerified(final Boolean isEmailVerified);
   
   public void setExternalId(final String externalId);
   
   public void setCustomerGroup(final CustomerGroupReference customerGroup);
   
   public void setCustom(final CustomFields custom);
   
   public void setLocale(final String locale);
   
   public void setSalutation(final String salutation);
   
   public void setKey(final String key);
   
   public static MyCustomerImpl of(){
      return new MyCustomerImpl();
   }
   

   public static MyCustomerImpl of(final MyCustomer template) {
      MyCustomerImpl instance = new MyCustomerImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setLastName(template.getLastName());
      instance.setAddresses(template.getAddresses());
      instance.setCustomerGroup(template.getCustomerGroup());
      instance.setCustom(template.getCustom());
      instance.setCompanyName(template.getCompanyName());
      instance.setVatId(template.getVatId());
      instance.setExternalId(template.getExternalId());
      instance.setDateOfBirth(template.getDateOfBirth());
      instance.setLocale(template.getLocale());
      instance.setBillingAddressIds(template.getBillingAddressIds());
      instance.setDefaultShippingAddressId(template.getDefaultShippingAddressId());
      instance.setTitle(template.getTitle());
      instance.setCustomerNumber(template.getCustomerNumber());
      instance.setIsEmailVerified(template.getIsEmailVerified());
      instance.setDefaultBillingAddressId(template.getDefaultBillingAddressId());
      instance.setShippingAddressIds(template.getShippingAddressIds());
      instance.setFirstName(template.getFirstName());
      instance.setPassword(template.getPassword());
      instance.setMiddleName(template.getMiddleName());
      instance.setSalutation(template.getSalutation());
      instance.setKey(template.getKey());
      instance.setEmail(template.getEmail());
      return instance;
   }

}