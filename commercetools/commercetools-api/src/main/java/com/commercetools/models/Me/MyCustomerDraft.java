package com.commercetools.models.Me;

import com.commercetools.models.Common.Address;
import com.commercetools.models.Type.CustomFields;
import java.lang.Long;
import java.lang.String;
import java.time.LocalDate;
import com.commercetools.models.Me.MyCustomerDraftImpl;

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
@JsonDeserialize(as = MyCustomerDraftImpl.class)
public interface MyCustomerDraft  {

   
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
   
   @Valid
   @JsonProperty("addresses")
   public List<Address> getAddresses();
   
   
   @JsonProperty("defaultShippingAddress")
   public Long getDefaultShippingAddress();
   
   
   @JsonProperty("defaultBillingAddress")
   public Long getDefaultBillingAddress();
   
   @Valid
   @JsonProperty("custom")
   public CustomFields getCustom();
   
   
   @JsonProperty("locale")
   public String getLocale();

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
   
   public void setDefaultShippingAddress(final Long defaultShippingAddress);
   
   public void setDefaultBillingAddress(final Long defaultBillingAddress);
   
   public void setCustom(final CustomFields custom);
   
   public void setLocale(final String locale);
   
   public static MyCustomerDraftImpl of(){
      return new MyCustomerDraftImpl();
   }
   

   public static MyCustomerDraftImpl of(final MyCustomerDraft template) {
      MyCustomerDraftImpl instance = new MyCustomerDraftImpl();
      instance.setLastName(template.getLastName());
      instance.setAddresses(template.getAddresses());
      instance.setDefaultShippingAddress(template.getDefaultShippingAddress());
      instance.setCustom(template.getCustom());
      instance.setCompanyName(template.getCompanyName());
      instance.setVatId(template.getVatId());
      instance.setDateOfBirth(template.getDateOfBirth());
      instance.setLocale(template.getLocale());
      instance.setTitle(template.getTitle());
      instance.setFirstName(template.getFirstName());
      instance.setPassword(template.getPassword());
      instance.setMiddleName(template.getMiddleName());
      instance.setDefaultBillingAddress(template.getDefaultBillingAddress());
      instance.setEmail(template.getEmail());
      return instance;
   }

}