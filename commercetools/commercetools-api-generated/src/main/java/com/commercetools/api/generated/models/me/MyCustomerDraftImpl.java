package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.common.Address;
import com.commercetools.api.generated.models.store.StoreResourceIdentifier;
import com.commercetools.api.generated.models.type.CustomFields;
import java.time.LocalDate;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCustomerDraftImpl implements MyCustomerDraft {

   private String lastName;
   
   private java.util.List<com.commercetools.api.generated.models.common.Address> addresses;
   
   private Long defaultShippingAddress;
   
   private java.util.List<com.commercetools.api.generated.models.store.StoreResourceIdentifier> stores;
   
   private com.commercetools.api.generated.models.type.CustomFields custom;
   
   private String companyName;
   
   private String vatId;
   
   private java.time.LocalDate dateOfBirth;
   
   private String locale;
   
   private String title;
   
   private String firstName;
   
   private String password;
   
   private String middleName;
   
   private Long defaultBillingAddress;
   
   private String email;

   @JsonCreator
   MyCustomerDraftImpl(@JsonProperty("lastName") final String lastName, @JsonProperty("addresses") final java.util.List<com.commercetools.api.generated.models.common.Address> addresses, @JsonProperty("defaultShippingAddress") final Long defaultShippingAddress, @JsonProperty("stores") final java.util.List<com.commercetools.api.generated.models.store.StoreResourceIdentifier> stores, @JsonProperty("custom") final com.commercetools.api.generated.models.type.CustomFields custom, @JsonProperty("companyName") final String companyName, @JsonProperty("vatId") final String vatId, @JsonProperty("dateOfBirth") final java.time.LocalDate dateOfBirth, @JsonProperty("locale") final String locale, @JsonProperty("title") final String title, @JsonProperty("firstName") final String firstName, @JsonProperty("password") final String password, @JsonProperty("middleName") final String middleName, @JsonProperty("defaultBillingAddress") final Long defaultBillingAddress, @JsonProperty("email") final String email) {
      this.lastName = lastName;
      this.addresses = addresses;
      this.defaultShippingAddress = defaultShippingAddress;
      this.stores = stores;
      this.custom = custom;
      this.companyName = companyName;
      this.vatId = vatId;
      this.dateOfBirth = dateOfBirth;
      this.locale = locale;
      this.title = title;
      this.firstName = firstName;
      this.password = password;
      this.middleName = middleName;
      this.defaultBillingAddress = defaultBillingAddress;
      this.email = email;
   }
   public MyCustomerDraftImpl() {
      
   }
   
   
   public String getLastName(){
      return this.lastName;
   }
   
   /**
   *  <p>Sets the ID of each address to be unique in the addresses list.</p>
   */
   public java.util.List<com.commercetools.api.generated.models.common.Address> getAddresses(){
      return this.addresses;
   }
   
   /**
   *  <p>The index of the address in the addresses array.
   *  The <code>defaultShippingAddressId</code> of the customer will be set to the ID of that address.</p>
   */
   public Long getDefaultShippingAddress(){
      return this.defaultShippingAddress;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.store.StoreResourceIdentifier> getStores(){
      return this.stores;
   }
   
   /**
   *  <p>The custom fields.</p>
   */
   public com.commercetools.api.generated.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public String getCompanyName(){
      return this.companyName;
   }
   
   
   public String getVatId(){
      return this.vatId;
   }
   
   
   public java.time.LocalDate getDateOfBirth(){
      return this.dateOfBirth;
   }
   
   
   public String getLocale(){
      return this.locale;
   }
   
   
   public String getTitle(){
      return this.title;
   }
   
   
   public String getFirstName(){
      return this.firstName;
   }
   
   
   public String getPassword(){
      return this.password;
   }
   
   
   public String getMiddleName(){
      return this.middleName;
   }
   
   /**
   *  <p>The index of the address in the addresses array.
   *  The <code>defaultBillingAddressId</code> of the customer will be set to the ID of that address.</p>
   */
   public Long getDefaultBillingAddress(){
      return this.defaultBillingAddress;
   }
   
   
   public String getEmail(){
      return this.email;
   }

   public void setLastName(final String lastName){
      this.lastName = lastName;
   }
   
   public void setAddresses(final java.util.List<com.commercetools.api.generated.models.common.Address> addresses){
      this.addresses = addresses;
   }
   
   public void setDefaultShippingAddress(final Long defaultShippingAddress){
      this.defaultShippingAddress = defaultShippingAddress;
   }
   
   public void setStores(final java.util.List<com.commercetools.api.generated.models.store.StoreResourceIdentifier> stores){
      this.stores = stores;
   }
   
   public void setCustom(final com.commercetools.api.generated.models.type.CustomFields custom){
      this.custom = custom;
   }
   
   public void setCompanyName(final String companyName){
      this.companyName = companyName;
   }
   
   public void setVatId(final String vatId){
      this.vatId = vatId;
   }
   
   public void setDateOfBirth(final java.time.LocalDate dateOfBirth){
      this.dateOfBirth = dateOfBirth;
   }
   
   public void setLocale(final String locale){
      this.locale = locale;
   }
   
   public void setTitle(final String title){
      this.title = title;
   }
   
   public void setFirstName(final String firstName){
      this.firstName = firstName;
   }
   
   public void setPassword(final String password){
      this.password = password;
   }
   
   public void setMiddleName(final String middleName){
      this.middleName = middleName;
   }
   
   public void setDefaultBillingAddress(final Long defaultBillingAddress){
      this.defaultBillingAddress = defaultBillingAddress;
   }
   
   public void setEmail(final String email){
      this.email = email;
   }

}