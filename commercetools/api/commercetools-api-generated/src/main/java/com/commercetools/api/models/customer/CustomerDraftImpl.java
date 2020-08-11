package com.commercetools.api.models.customer;

import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import java.time.LocalDate;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerDraftImpl implements CustomerDraft {

   private String anonymousId;

   private String lastName;

   private java.util.List<com.commercetools.api.models.common.Address> addresses;

   private Long defaultShippingAddress;

   private java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores;

   private com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup;

   private com.commercetools.api.models.type.CustomFieldsDraft custom;

   private String companyName;

   private String vatId;

   private String externalId;

   private java.util.List<Integer> billingAddresses;

   private java.time.LocalDate dateOfBirth;

   private String locale;

   private String title;

   private String customerNumber;

   private Boolean isEmailVerified;

   private String firstName;

   private String password;

   private String middleName;

   private String salutation;

   private String anonymousCartId;

   private String key;

   private Long defaultBillingAddress;

   private String email;

   private java.util.List<Integer> shippingAddresses;

   @JsonCreator
   CustomerDraftImpl(@JsonProperty("anonymousId") final String anonymousId, @JsonProperty("lastName") final String lastName, @JsonProperty("addresses") final java.util.List<com.commercetools.api.models.common.Address> addresses, @JsonProperty("defaultShippingAddress") final Long defaultShippingAddress, @JsonProperty("stores") final java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores, @JsonProperty("customerGroup") final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup, @JsonProperty("custom") final com.commercetools.api.models.type.CustomFieldsDraft custom, @JsonProperty("companyName") final String companyName, @JsonProperty("vatId") final String vatId, @JsonProperty("externalId") final String externalId, @JsonProperty("billingAddresses") final java.util.List<Integer> billingAddresses, @JsonProperty("dateOfBirth") final java.time.LocalDate dateOfBirth, @JsonProperty("locale") final String locale, @JsonProperty("title") final String title, @JsonProperty("customerNumber") final String customerNumber, @JsonProperty("isEmailVerified") final Boolean isEmailVerified, @JsonProperty("firstName") final String firstName, @JsonProperty("password") final String password, @JsonProperty("middleName") final String middleName, @JsonProperty("salutation") final String salutation, @JsonProperty("anonymousCartId") final String anonymousCartId, @JsonProperty("key") final String key, @JsonProperty("defaultBillingAddress") final Long defaultBillingAddress, @JsonProperty("email") final String email, @JsonProperty("shippingAddresses") final java.util.List<Integer> shippingAddresses) {
      this.anonymousId = anonymousId;
      this.lastName = lastName;
      this.addresses = addresses;
      this.defaultShippingAddress = defaultShippingAddress;
      this.stores = stores;
      this.customerGroup = customerGroup;
      this.custom = custom;
      this.companyName = companyName;
      this.vatId = vatId;
      this.externalId = externalId;
      this.billingAddresses = billingAddresses;
      this.dateOfBirth = dateOfBirth;
      this.locale = locale;
      this.title = title;
      this.customerNumber = customerNumber;
      this.isEmailVerified = isEmailVerified;
      this.firstName = firstName;
      this.password = password;
      this.middleName = middleName;
      this.salutation = salutation;
      this.anonymousCartId = anonymousCartId;
      this.key = key;
      this.defaultBillingAddress = defaultBillingAddress;
      this.email = email;
      this.shippingAddresses = shippingAddresses;
   }
   public CustomerDraftImpl() {

   }

   /**
   *  <p>Identifies carts and orders belonging to an anonymous session that will be assigned to the new customer account.</p>
   */
   public String getAnonymousId(){
      return this.anonymousId;
   }


   public String getLastName(){
      return this.lastName;
   }

   /**
   *  <p>Sets the ID of each address to be unique in the addresses list.</p>
   */
   public java.util.List<com.commercetools.api.models.common.Address> getAddresses(){
      return this.addresses;
   }

   /**
   *  <p>The index of the address in the addresses array.
   *  The <code>defaultShippingAddressId</code> of the customer will be set to the ID of that address.</p>
   */
   public Long getDefaultShippingAddress(){
      return this.defaultShippingAddress;
   }

   /**
   *  <p>References to the stores the customer account is associated with.
   *  If no stores are specified, the customer is a global customer, and can log in using the Password Flow for global Customers.
   *  If one or more stores are specified, the customer can only log in using the Password Flow for Customers in a Store for those specific stores.</p>
   */
   public java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> getStores(){
      return this.stores;
   }


   public com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup(){
      return this.customerGroup;
   }

   /**
   *  <p>The custom fields.</p>
   */
   public com.commercetools.api.models.type.CustomFieldsDraft getCustom(){
      return this.custom;
   }


   public String getCompanyName(){
      return this.companyName;
   }


   public String getVatId(){
      return this.vatId;
   }


   public String getExternalId(){
      return this.externalId;
   }

   /**
   *  <p>The indices of the billing addresses in the addresses array.
   *  The <code>billingAddressIds</code> of the customer will be set to the IDs of that addresses.</p>
   */
   public java.util.List<Integer> getBillingAddresses(){
      return this.billingAddresses;
   }


   public java.time.LocalDate getDateOfBirth(){
      return this.dateOfBirth;
   }

   /**
   *  <p>Must be one of the languages supported for this project</p>
   */
   public String getLocale(){
      return this.locale;
   }


   public String getTitle(){
      return this.title;
   }

   /**
   *  <p>String that uniquely identifies a customer.
   *  It can be used to create more human-readable (in contrast to ID) identifier for the customer.
   *  It should be <strong>unique</strong> across a project.
   *  Once it's set it cannot be changed.</p>
   */
   public String getCustomerNumber(){
      return this.customerNumber;
   }


   public Boolean getIsEmailVerified(){
      return this.isEmailVerified;
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


   public String getSalutation(){
      return this.salutation;
   }

   /**
   *  <p>Identifies a single cart that will be assigned to the new customer account.</p>
   */
   public String getAnonymousCartId(){
      return this.anonymousCartId;
   }

   /**
   *  <p>User-specific unique identifier for a customer.
   *  Must be unique across a project.
   *  The field can be reset using the Set Key UpdateAction</p>
   */
   public String getKey(){
      return this.key;
   }

   /**
   *  <p>The index of the address in the addresses array.
   *  The <code>defaultBillingAddressId</code> of the customer will be set to the ID of that address.</p>
   */
   public Long getDefaultBillingAddress(){
      return this.defaultBillingAddress;
   }

   /**
   *  <p>The customer's email address and the main identifier of uniqueness for a customer account.
   *  Email addresses are either unique to the store they're specified for, <em>or</em> for the entire project, and are case insensitive.
   *  For more information, see Email uniquenes.</p>
   */
   public String getEmail(){
      return this.email;
   }

   /**
   *  <p>The indices of the shipping addresses in the addresses array.
   *  The <code>shippingAddressIds</code> of the Customer will be set to the IDs of that addresses.</p>
   */
   public java.util.List<Integer> getShippingAddresses(){
      return this.shippingAddresses;
   }

   public void setAnonymousId(final String anonymousId){
      this.anonymousId = anonymousId;
   }

   public void setLastName(final String lastName){
      this.lastName = lastName;
   }

   public void setAddresses(final java.util.List<com.commercetools.api.models.common.Address> addresses){
      this.addresses = addresses;
   }

   public void setDefaultShippingAddress(final Long defaultShippingAddress){
      this.defaultShippingAddress = defaultShippingAddress;
   }

   public void setStores(final java.util.List<com.commercetools.api.models.store.StoreResourceIdentifier> stores){
      this.stores = stores;
   }

   public void setCustomerGroup(final com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier customerGroup){
      this.customerGroup = customerGroup;
   }

   public void setCustom(final com.commercetools.api.models.type.CustomFieldsDraft custom){
      this.custom = custom;
   }

   public void setCompanyName(final String companyName){
      this.companyName = companyName;
   }

   public void setVatId(final String vatId){
      this.vatId = vatId;
   }

   public void setExternalId(final String externalId){
      this.externalId = externalId;
   }

   public void setBillingAddresses(final java.util.List<Integer> billingAddresses){
      this.billingAddresses = billingAddresses;
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

   public void setCustomerNumber(final String customerNumber){
      this.customerNumber = customerNumber;
   }

   public void setIsEmailVerified(final Boolean isEmailVerified){
      this.isEmailVerified = isEmailVerified;
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

   public void setSalutation(final String salutation){
      this.salutation = salutation;
   }

   public void setAnonymousCartId(final String anonymousCartId){
      this.anonymousCartId = anonymousCartId;
   }

   public void setKey(final String key){
      this.key = key;
   }

   public void setDefaultBillingAddress(final Long defaultBillingAddress){
      this.defaultBillingAddress = defaultBillingAddress;
   }

   public void setEmail(final String email){
      this.email = email;
   }

   public void setShippingAddresses(final java.util.List<Integer> shippingAddresses){
      this.shippingAddresses = shippingAddresses;
   }

}
