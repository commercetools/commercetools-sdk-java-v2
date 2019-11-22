package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.cart.InventoryMode;
import com.commercetools.api.generated.models.cart.TaxMode;
import com.commercetools.api.generated.models.common.Address;
import com.commercetools.api.generated.models.me.MyLineItemDraft;
import com.commercetools.api.generated.models.shipping_method.ShippingMethodResourceIdentifier;
import com.commercetools.api.generated.models.type.CustomFieldsDraft;
import com.commercetools.api.generated.models.me.MyCartDraftImpl;

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
@JsonDeserialize(as = MyCartDraftImpl.class)
public interface MyCartDraft  {

   /**
   	<p>A three-digit currency code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
   */
   @NotNull
   @JsonProperty("currency")
   public String getCurrency();
   /**
   	
   */
   
   @JsonProperty("customerEmail")
   public String getCustomerEmail();
   /**
   	<p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
   */
   
   @JsonProperty("country")
   public String getCountry();
   /**
   	<p>Default inventory mode is <code>None</code>.</p>
   */
   
   @JsonProperty("inventoryMode")
   public InventoryMode getInventoryMode();
   /**
   	
   */
   @Valid
   @JsonProperty("lineItems")
   public List<MyLineItemDraft> getLineItems();
   /**
   	
   */
   @Valid
   @JsonProperty("shippingAddress")
   public Address getShippingAddress();
   /**
   	
   */
   @Valid
   @JsonProperty("billingAddress")
   public Address getBillingAddress();
   /**
   	
   */
   @Valid
   @JsonProperty("shippingMethod")
   public ShippingMethodResourceIdentifier getShippingMethod();
   /**
   	<p>The custom fields.</p>
   */
   @Valid
   @JsonProperty("custom")
   public CustomFieldsDraft getCustom();
   /**
   	
   */
   
   @JsonProperty("locale")
   public String getLocale();
   /**
   	<p>The <code>TaxMode</code> <code>Disabled</code> can not be set on the My Carts endpoint.</p>
   */
   
   @JsonProperty("taxMode")
   public TaxMode getTaxMode();
   /**
   	<p>The cart will be deleted automatically if it hasn't been modified for the specified amount of days and it is in the <code>Active</code> CartState.
   	If a ChangeSubscription for carts exists, a <code>ResourceDeleted</code> notification will be sent.</p>
   */
   
   @JsonProperty("deleteDaysAfterLastModification")
   public Long getDeleteDaysAfterLastModification();
   /**
   	<p>Contains addresses for orders with multiple shipping addresses.
   	Each address must contain a key which is unique in this cart.</p>
   */
   @Valid
   @JsonProperty("itemShippingAddresses")
   public List<Address> getItemShippingAddresses();

   public void setCurrency(final String currency);
   
   public void setCustomerEmail(final String customerEmail);
   
   public void setCountry(final String country);
   
   public void setInventoryMode(final InventoryMode inventoryMode);
   
   public void setLineItems(final List<MyLineItemDraft> lineItems);
   
   public void setShippingAddress(final Address shippingAddress);
   
   public void setBillingAddress(final Address billingAddress);
   
   public void setShippingMethod(final ShippingMethodResourceIdentifier shippingMethod);
   
   public void setCustom(final CustomFieldsDraft custom);
   
   public void setLocale(final String locale);
   
   public void setTaxMode(final TaxMode taxMode);
   
   public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification);
   
   public void setItemShippingAddresses(final List<Address> itemShippingAddresses);
   
   public static MyCartDraftImpl of(){
      return new MyCartDraftImpl();
   }
   

   public static MyCartDraftImpl of(final MyCartDraft template) {
      MyCartDraftImpl instance = new MyCartDraftImpl();
      instance.setLineItems(template.getLineItems());
      instance.setCountry(template.getCountry());
      instance.setItemShippingAddresses(template.getItemShippingAddresses());
      instance.setTaxMode(template.getTaxMode());
      instance.setDeleteDaysAfterLastModification(template.getDeleteDaysAfterLastModification());
      instance.setCustom(template.getCustom());
      instance.setShippingMethod(template.getShippingMethod());
      instance.setCustomerEmail(template.getCustomerEmail());
      instance.setShippingAddress(template.getShippingAddress());
      instance.setCurrency(template.getCurrency());
      instance.setBillingAddress(template.getBillingAddress());
      instance.setLocale(template.getLocale());
      instance.setInventoryMode(template.getInventoryMode());
      return instance;
   }

}