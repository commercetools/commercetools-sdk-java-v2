package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartOrigin;
import com.commercetools.models.Cart.CustomLineItemDraft;
import com.commercetools.models.Cart.ExternalTaxRateDraft;
import com.commercetools.models.Cart.InventoryMode;
import com.commercetools.models.Cart.LineItemDraft;
import com.commercetools.models.Cart.RoundingMode;
import com.commercetools.models.Cart.ShippingRateInputDraft;
import com.commercetools.models.Cart.TaxCalculationMode;
import com.commercetools.models.Cart.TaxMode;
import com.commercetools.models.Common.Address;
import com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier;
import com.commercetools.models.ShippingMethod.ShippingMethodResourceIdentifier;
import com.commercetools.models.Store.StoreResourceIdentifier;
import com.commercetools.models.Type.CustomFieldsDraft;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.Cart.CartDraftImpl;

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
@JsonDeserialize(as = CartDraftImpl.class)
public interface CartDraft  {

   /**
   	<p>The currency code compliant to <a href="https://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a>.</p>
   */
   @NotNull
   @JsonProperty("currency")
   public String getCurrency();
   
   
   @JsonProperty("customerId")
   public String getCustomerId();
   
   
   @JsonProperty("customerEmail")
   public String getCustomerEmail();
   
   @Valid
   @JsonProperty("customerGroup")
   public CustomerGroupResourceIdentifier getCustomerGroup();
   
   
   @JsonProperty("anonymousId")
   public String getAnonymousId();
   
   @Valid
   @JsonProperty("store")
   public StoreResourceIdentifier getStore();
   
   
   @JsonProperty("country")
   public String getCountry();
   
   
   @JsonProperty("inventoryMode")
   public InventoryMode getInventoryMode();
   
   
   @JsonProperty("taxMode")
   public TaxMode getTaxMode();
   
   
   @JsonProperty("taxRoundingMode")
   public RoundingMode getTaxRoundingMode();
   
   
   @JsonProperty("taxCalculationMode")
   public TaxCalculationMode getTaxCalculationMode();
   
   @Valid
   @JsonProperty("lineItems")
   public List<LineItemDraft> getLineItems();
   
   @Valid
   @JsonProperty("customLineItems")
   public List<CustomLineItemDraft> getCustomLineItems();
   
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
   @JsonProperty("externalTaxRateForShippingMethod")
   public ExternalTaxRateDraft getExternalTaxRateForShippingMethod();
   
   @Valid
   @JsonProperty("custom")
   public CustomFieldsDraft getCustom();
   
   
   @JsonProperty("locale")
   public String getLocale();
   
   
   @JsonProperty("deleteDaysAfterLastModification")
   public Long getDeleteDaysAfterLastModification();
   
   
   @JsonProperty("origin")
   public CartOrigin getOrigin();
   
   @Valid
   @JsonProperty("shippingRateInput")
   public ShippingRateInputDraft getShippingRateInput();
   
   @Valid
   @JsonProperty("itemShippingAddresses")
   public List<Address> getItemShippingAddresses();

   public void setCurrency(final String currency);
   
   public void setCustomerId(final String customerId);
   
   public void setCustomerEmail(final String customerEmail);
   
   public void setCustomerGroup(final CustomerGroupResourceIdentifier customerGroup);
   
   public void setAnonymousId(final String anonymousId);
   
   public void setStore(final StoreResourceIdentifier store);
   
   public void setCountry(final String country);
   
   public void setInventoryMode(final InventoryMode inventoryMode);
   
   public void setTaxMode(final TaxMode taxMode);
   
   public void setTaxRoundingMode(final RoundingMode taxRoundingMode);
   
   public void setTaxCalculationMode(final TaxCalculationMode taxCalculationMode);
   
   public void setLineItems(final List<LineItemDraft> lineItems);
   
   public void setCustomLineItems(final List<CustomLineItemDraft> customLineItems);
   
   public void setShippingAddress(final Address shippingAddress);
   
   public void setBillingAddress(final Address billingAddress);
   
   public void setShippingMethod(final ShippingMethodResourceIdentifier shippingMethod);
   
   public void setExternalTaxRateForShippingMethod(final ExternalTaxRateDraft externalTaxRateForShippingMethod);
   
   public void setCustom(final CustomFieldsDraft custom);
   
   public void setLocale(final String locale);
   
   public void setDeleteDaysAfterLastModification(final Long deleteDaysAfterLastModification);
   
   public void setOrigin(final CartOrigin origin);
   
   public void setShippingRateInput(final ShippingRateInputDraft shippingRateInput);
   
   public void setItemShippingAddresses(final List<Address> itemShippingAddresses);
   
   public static CartDraftImpl of(){
      return new CartDraftImpl();
   }
   

   public static CartDraftImpl of(final CartDraft template) {
      CartDraftImpl instance = new CartDraftImpl();
      instance.setCountry(template.getCountry());
      instance.setAnonymousId(template.getAnonymousId());
      instance.setShippingRateInput(template.getShippingRateInput());
      instance.setCustomerGroup(template.getCustomerGroup());
      instance.setOrigin(template.getOrigin());
      instance.setDeleteDaysAfterLastModification(template.getDeleteDaysAfterLastModification());
      instance.setCustom(template.getCustom());
      instance.setShippingMethod(template.getShippingMethod());
      instance.setTaxCalculationMode(template.getTaxCalculationMode());
      instance.setStore(template.getStore());
      instance.setLocale(template.getLocale());
      instance.setExternalTaxRateForShippingMethod(template.getExternalTaxRateForShippingMethod());
      instance.setInventoryMode(template.getInventoryMode());
      instance.setLineItems(template.getLineItems());
      instance.setTaxRoundingMode(template.getTaxRoundingMode());
      instance.setCustomLineItems(template.getCustomLineItems());
      instance.setItemShippingAddresses(template.getItemShippingAddresses());
      instance.setTaxMode(template.getTaxMode());
      instance.setCustomerEmail(template.getCustomerEmail());
      instance.setCustomerId(template.getCustomerId());
      instance.setShippingAddress(template.getShippingAddress());
      instance.setCurrency(template.getCurrency());
      instance.setBillingAddress(template.getBillingAddress());
      return instance;
   }

}