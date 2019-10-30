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
   	<p>The currency code compliant to <a href="https://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a>.</p>
   */
   @NotNull
   @JsonProperty("currency")
   public String getCurrency();
   
   
   @JsonProperty("customerEmail")
   public String getCustomerEmail();
   
   
   @JsonProperty("country")
   public String getCountry();
   
   
   @JsonProperty("inventoryMode")
   public InventoryMode getInventoryMode();
   
   @Valid
   @JsonProperty("lineItems")
   public List<MyLineItemDraft> getLineItems();
   
   @Valid
   @JsonProperty("shippingAddress")
   public Address getShippingAddress();
   
   @Valid
   @JsonProperty("billingAddress")
   public Address getBillingAddress();
   
   @Valid
   @JsonProperty("shippingMethod")
   public ShippingMethodResourceIdentifier getShippingMethod();
   
   @Valid
   @JsonProperty("custom")
   public CustomFieldsDraft getCustom();
   
   
   @JsonProperty("locale")
   public String getLocale();
   
   
   @JsonProperty("taxMode")
   public TaxMode getTaxMode();
   
   
   @JsonProperty("deleteDaysAfterLastModification")
   public Long getDeleteDaysAfterLastModification();
   
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