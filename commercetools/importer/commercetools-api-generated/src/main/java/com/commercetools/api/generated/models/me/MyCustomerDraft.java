package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.common.Address;
import com.commercetools.api.generated.models.store.StoreResourceIdentifier;
import com.commercetools.api.generated.models.type.CustomFields;
import java.time.LocalDate;
import com.commercetools.api.generated.models.me.MyCustomerDraftImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
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
   /**
   *  <p>Sets the ID of each address to be unique in the addresses list.</p>
   */
   @Valid
   @JsonProperty("addresses")
   public List<Address> getAddresses();
   /**
   *  <p>The index of the address in the addresses array.
   *  The <code>defaultShippingAddressId</code> of the customer will be set to the ID of that address.</p>
   */
   
   @JsonProperty("defaultShippingAddress")
   public Long getDefaultShippingAddress();
   /**
   *  <p>The index of the address in the addresses array.
   *  The <code>defaultBillingAddressId</code> of the customer will be set to the ID of that address.</p>
   */
   
   @JsonProperty("defaultBillingAddress")
   public Long getDefaultBillingAddress();
   /**
   *  <p>The custom fields.</p>
   */
   @Valid
   @JsonProperty("custom")
   public CustomFields getCustom();
   
   
   @JsonProperty("locale")
   public String getLocale();
   
   @Valid
   @JsonProperty("stores")
   public List<StoreResourceIdentifier> getStores();

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
   
   public void setStores(final List<StoreResourceIdentifier> stores);
   
   public static MyCustomerDraftImpl of(){
      return new MyCustomerDraftImpl();
   }
   

   public static MyCustomerDraftImpl of(final MyCustomerDraft template) {
      MyCustomerDraftImpl instance = new MyCustomerDraftImpl();
      instance.setLastName(template.getLastName());
      instance.setAddresses(template.getAddresses());
      instance.setDefaultShippingAddress(template.getDefaultShippingAddress());
      instance.setStores(template.getStores());
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