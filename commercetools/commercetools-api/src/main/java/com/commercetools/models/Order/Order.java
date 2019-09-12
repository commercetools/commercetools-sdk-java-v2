package com.commercetools.models.Order;

import com.commercetools.models.Cart.CartOrigin;
import com.commercetools.models.Cart.CartReference;
import com.commercetools.models.Cart.CustomLineItem;
import com.commercetools.models.Cart.DiscountCodeInfo;
import com.commercetools.models.Cart.InventoryMode;
import com.commercetools.models.Cart.LineItem;
import com.commercetools.models.Cart.RoundingMode;
import com.commercetools.models.Cart.ShippingInfo;
import com.commercetools.models.Cart.ShippingRateInput;
import com.commercetools.models.Cart.TaxCalculationMode;
import com.commercetools.models.Cart.TaxMode;
import com.commercetools.models.Cart.TaxedPrice;
import com.commercetools.models.Common.Address;
import com.commercetools.models.Common.LoggedResource;
import com.commercetools.models.Common.Money;
import com.commercetools.models.CustomerGroup.CustomerGroupReference;
import com.commercetools.models.Order.OrderState;
import com.commercetools.models.Order.PaymentInfo;
import com.commercetools.models.Order.PaymentState;
import com.commercetools.models.Order.ReturnInfo;
import com.commercetools.models.Order.ShipmentState;
import com.commercetools.models.Order.SyncInfo;
import com.commercetools.models.OrderEdit.StagedOrder;
import com.commercetools.models.State.StateReference;
import com.commercetools.models.Store.StoreKeyReference;
import com.commercetools.models.Type.CustomFields;
import java.lang.Long;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.Order.OrderImpl;

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
@JsonDeserialize(as = OrderImpl.class)
public interface Order extends LoggedResource {

   
   
   @JsonProperty("completedAt")
   public ZonedDateTime getCompletedAt();
   
   
   @JsonProperty("orderNumber")
   public String getOrderNumber();
   
   
   @JsonProperty("customerId")
   public String getCustomerId();
   
   
   @JsonProperty("customerEmail")
   public String getCustomerEmail();
   
   
   @JsonProperty("anonymousId")
   public String getAnonymousId();
   
   @Valid
   @JsonProperty("store")
   public StoreKeyReference getStore();
   
   @NotNull
   @Valid
   @JsonProperty("lineItems")
   public List<LineItem> getLineItems();
   
   @NotNull
   @Valid
   @JsonProperty("customLineItems")
   public List<CustomLineItem> getCustomLineItems();
   
   @NotNull
   @Valid
   @JsonProperty("totalPrice")
   public Money getTotalPrice();
   
   @Valid
   @JsonProperty("taxedPrice")
   public TaxedPrice getTaxedPrice();
   
   @Valid
   @JsonProperty("shippingAddress")
   public Address getShippingAddress();
   
   @Valid
   @JsonProperty("billingAddress")
   public Address getBillingAddress();
   
   
   @JsonProperty("taxMode")
   public TaxMode getTaxMode();
   
   
   @JsonProperty("taxRoundingMode")
   public RoundingMode getTaxRoundingMode();
   
   @Valid
   @JsonProperty("customerGroup")
   public CustomerGroupReference getCustomerGroup();
   
   
   @JsonProperty("country")
   public String getCountry();
   
   @NotNull
   @JsonProperty("orderState")
   public OrderState getOrderState();
   
   @Valid
   @JsonProperty("state")
   public StateReference getState();
   
   
   @JsonProperty("shipmentState")
   public ShipmentState getShipmentState();
   
   
   @JsonProperty("paymentState")
   public PaymentState getPaymentState();
   
   @Valid
   @JsonProperty("shippingInfo")
   public ShippingInfo getShippingInfo();
   
   @NotNull
   @Valid
   @JsonProperty("syncInfo")
   public List<SyncInfo> getSyncInfo();
   
   @Valid
   @JsonProperty("returnInfo")
   public List<ReturnInfo> getReturnInfo();
   
   @Valid
   @JsonProperty("discountCodes")
   public List<DiscountCodeInfo> getDiscountCodes();
   
   @NotNull
   @JsonProperty("lastMessageSequenceNumber")
   public Long getLastMessageSequenceNumber();
   
   @Valid
   @JsonProperty("cart")
   public CartReference getCart();
   
   @Valid
   @JsonProperty("custom")
   public CustomFields getCustom();
   
   @Valid
   @JsonProperty("paymentInfo")
   public PaymentInfo getPaymentInfo();
   
   
   @JsonProperty("locale")
   public String getLocale();
   
   
   @JsonProperty("inventoryMode")
   public InventoryMode getInventoryMode();
   
   @NotNull
   @JsonProperty("origin")
   public CartOrigin getOrigin();
   
   
   @JsonProperty("taxCalculationMode")
   public TaxCalculationMode getTaxCalculationMode();
   
   @Valid
   @JsonProperty("shippingRateInput")
   public ShippingRateInput getShippingRateInput();
   
   @Valid
   @JsonProperty("itemShippingAddresses")
   public List<Address> getItemShippingAddresses();

   public void setCompletedAt(final ZonedDateTime completedAt);
   
   public void setOrderNumber(final String orderNumber);
   
   public void setCustomerId(final String customerId);
   
   public void setCustomerEmail(final String customerEmail);
   
   public void setAnonymousId(final String anonymousId);
   
   public void setStore(final StoreKeyReference store);
   
   public void setLineItems(final List<LineItem> lineItems);
   
   public void setCustomLineItems(final List<CustomLineItem> customLineItems);
   
   public void setTotalPrice(final Money totalPrice);
   
   public void setTaxedPrice(final TaxedPrice taxedPrice);
   
   public void setShippingAddress(final Address shippingAddress);
   
   public void setBillingAddress(final Address billingAddress);
   
   public void setTaxMode(final TaxMode taxMode);
   
   public void setTaxRoundingMode(final RoundingMode taxRoundingMode);
   
   public void setCustomerGroup(final CustomerGroupReference customerGroup);
   
   public void setCountry(final String country);
   
   public void setOrderState(final OrderState orderState);
   
   public void setState(final StateReference state);
   
   public void setShipmentState(final ShipmentState shipmentState);
   
   public void setPaymentState(final PaymentState paymentState);
   
   public void setShippingInfo(final ShippingInfo shippingInfo);
   
   public void setSyncInfo(final List<SyncInfo> syncInfo);
   
   public void setReturnInfo(final List<ReturnInfo> returnInfo);
   
   public void setDiscountCodes(final List<DiscountCodeInfo> discountCodes);
   
   public void setLastMessageSequenceNumber(final Long lastMessageSequenceNumber);
   
   public void setCart(final CartReference cart);
   
   public void setCustom(final CustomFields custom);
   
   public void setPaymentInfo(final PaymentInfo paymentInfo);
   
   public void setLocale(final String locale);
   
   public void setInventoryMode(final InventoryMode inventoryMode);
   
   public void setOrigin(final CartOrigin origin);
   
   public void setTaxCalculationMode(final TaxCalculationMode taxCalculationMode);
   
   public void setShippingRateInput(final ShippingRateInput shippingRateInput);
   
   public void setItemShippingAddresses(final List<Address> itemShippingAddresses);
   
   public static OrderImpl of(){
      return new OrderImpl();
   }
   

   public static OrderImpl of(final Order template) {
      OrderImpl instance = new OrderImpl();
      instance.setCreatedAt(template.getCreatedAt());
      instance.setLastModifiedAt(template.getLastModifiedAt());
      instance.setId(template.getId());
      instance.setVersion(template.getVersion());
      instance.setCreatedBy(template.getCreatedBy());
      instance.setLastModifiedBy(template.getLastModifiedBy());
      instance.setShipmentState(template.getShipmentState());
      instance.setCountry(template.getCountry());
      instance.setOrderNumber(template.getOrderNumber());
      instance.setTotalPrice(template.getTotalPrice());
      instance.setShippingRateInput(template.getShippingRateInput());
      instance.setTaxedPrice(template.getTaxedPrice());
      instance.setOrigin(template.getOrigin());
      instance.setShippingInfo(template.getShippingInfo());
      instance.setLocale(template.getLocale());
      instance.setCart(template.getCart());
      instance.setInventoryMode(template.getInventoryMode());
      instance.setOrderState(template.getOrderState());
      instance.setReturnInfo(template.getReturnInfo());
      instance.setLineItems(template.getLineItems());
      instance.setCustomLineItems(template.getCustomLineItems());
      instance.setItemShippingAddresses(template.getItemShippingAddresses());
      instance.setCustomerEmail(template.getCustomerEmail());
      instance.setCustomerId(template.getCustomerId());
      instance.setState(template.getState());
      instance.setPaymentState(template.getPaymentState());
      instance.setAnonymousId(template.getAnonymousId());
      instance.setDiscountCodes(template.getDiscountCodes());
      instance.setCompletedAt(template.getCompletedAt());
      instance.setCustomerGroup(template.getCustomerGroup());
      instance.setCustom(template.getCustom());
      instance.setTaxCalculationMode(template.getTaxCalculationMode());
      instance.setStore(template.getStore());
      instance.setLastMessageSequenceNumber(template.getLastMessageSequenceNumber());
      instance.setSyncInfo(template.getSyncInfo());
      instance.setTaxRoundingMode(template.getTaxRoundingMode());
      instance.setTaxMode(template.getTaxMode());
      instance.setShippingAddress(template.getShippingAddress());
      instance.setBillingAddress(template.getBillingAddress());
      instance.setPaymentInfo(template.getPaymentInfo());
      return instance;
   }

}