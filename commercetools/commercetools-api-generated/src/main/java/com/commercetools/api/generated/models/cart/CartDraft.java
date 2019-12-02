package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.cart.CartOrigin;
import com.commercetools.api.generated.models.cart.CustomLineItemDraft;
import com.commercetools.api.generated.models.cart.ExternalTaxRateDraft;
import com.commercetools.api.generated.models.cart.InventoryMode;
import com.commercetools.api.generated.models.cart.LineItemDraft;
import com.commercetools.api.generated.models.cart.RoundingMode;
import com.commercetools.api.generated.models.cart.ShippingRateInputDraft;
import com.commercetools.api.generated.models.cart.TaxCalculationMode;
import com.commercetools.api.generated.models.cart.TaxMode;
import com.commercetools.api.generated.models.common.Address;
import com.commercetools.api.generated.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.generated.models.shipping_method.ShippingMethodResourceIdentifier;
import com.commercetools.api.generated.models.store.StoreResourceIdentifier;
import com.commercetools.api.generated.models.type.CustomFieldsDraft;
import com.commercetools.api.generated.models.cart.CartDraftImpl;

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
@JsonDeserialize(as = CartDraftImpl.class)
public interface CartDraft  {

   /**
   *  <p>A three-digit currency code as per <a href="https://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a>.</p>
   */
   @NotNull
   @JsonProperty("currency")
   public String getCurrency();
   /**
   *  <p>Id of an existing Customer.</p>
   */
   
   @JsonProperty("customerId")
   public String getCustomerId();
   
   
   @JsonProperty("customerEmail")
   public String getCustomerEmail();
   /**
   *  <p>Will be set automatically when the <code>customerId</code> is set and the customer is a member of a customer group.
   *  Can be set explicitly when no <code>customerId</code> is present.</p>
   */
   @Valid
   @JsonProperty("customerGroup")
   public CustomerGroupResourceIdentifier getCustomerGroup();
   /**
   *  <p>Assigns the new cart to an anonymous session (the customer has not signed up/in yet).</p>
   */
   
   @JsonProperty("anonymousId")
   public String getAnonymousId();
   /**
   *  <p>Assigns the new cart to the store.
   *  The store assignment can not be modified.</p>
   */
   @Valid
   @JsonProperty("store")
   public StoreResourceIdentifier getStore();
   /**
   *  <p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
   */
   
   @JsonProperty("country")
   public String getCountry();
   /**
   *  <p>Default inventory mode is <code>None</code>.</p>
   */
   
   @JsonProperty("inventoryMode")
   public InventoryMode getInventoryMode();
   /**
   *  <p>The default tax mode is <code>Platform</code>.</p>
   */
   
   @JsonProperty("taxMode")
   public TaxMode getTaxMode();
   /**
   *  <p>The default tax rounding mode is <code>HalfEven</code>.</p>
   */
   
   @JsonProperty("taxRoundingMode")
   public RoundingMode getTaxRoundingMode();
   /**
   *  <p>The default tax calculation mode is <code>LineItemLevel</code>.</p>
   */
   
   @JsonProperty("taxCalculationMode")
   public TaxCalculationMode getTaxCalculationMode();
   
   @Valid
   @JsonProperty("lineItems")
   public List<LineItemDraft> getLineItems();
   
   @Valid
   @JsonProperty("customLineItems")
   public List<CustomLineItemDraft> getCustomLineItems();
   /**
   *  <p>The shipping address is used to determine the eligible shipping methods and rates as well as the tax rate of the line items.</p>
   */
   @Valid
   @JsonProperty("shippingAddress")
   public Address getShippingAddress();
   
   @Valid
   @JsonProperty("billingAddress")
   public Address getBillingAddress();
   
   @Valid
   @JsonProperty("shippingMethod")
   public ShippingMethodResourceIdentifier getShippingMethod();
   /**
   *  <p>An external tax rate can be set for the <code>shippingMethod</code> if the cart has the <code>External</code> TaxMode.</p>
   */
   @Valid
   @JsonProperty("externalTaxRateForShippingMethod")
   public ExternalTaxRateDraft getExternalTaxRateForShippingMethod();
   /**
   *  <p>The custom fields.</p>
   */
   @Valid
   @JsonProperty("custom")
   public CustomFieldsDraft getCustom();
   /**
   *  <p>Must be one of the languages supported for this project</p>
   */
   
   @JsonProperty("locale")
   public String getLocale();
   /**
   *  <p>The cart will be deleted automatically if it hasn't been modified for the specified amount of days and it is in the <code>Active</code> CartState.
   *  If a ChangeSubscription for carts exists, a <code>ResourceDeleted</code> notification will be sent.</p>
   */
   
   @JsonProperty("deleteDaysAfterLastModification")
   public Long getDeleteDaysAfterLastModification();
   /**
   *  <p>The default origin is <code>Customer</code>.</p>
   */
   
   @JsonProperty("origin")
   public CartOrigin getOrigin();
   /**
   *  <p>The shippingRateInput is used as an input to select a ShippingRatePriceTier.
   *  Based on the definition of ShippingRateInputType.
   *  If CartClassification is defined, it must be ClassificationShippingRateInput.
   *  If CartScore is defined, it must be ScoreShippingRateInput.
   *  Otherwise it can not bet set.</p>
   */
   @Valid
   @JsonProperty("shippingRateInput")
   public ShippingRateInputDraft getShippingRateInput();
   /**
   *  <p>Contains addresses for carts with multiple shipping addresses.
   *  Each address must contain a key which is unique in this cart.
   *  Line items will use these keys to reference the addresses under their <code>shippingDetails</code>.
   *  The addresses captured here are not used to determine eligible shipping methods or the applicable tax rate.
   *  Only the cart's <code>shippingAddress</code> is used for this.</p>
   */
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