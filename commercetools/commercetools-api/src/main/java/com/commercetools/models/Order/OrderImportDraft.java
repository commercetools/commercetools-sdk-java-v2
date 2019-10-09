package com.commercetools.models.order;

import com.commercetools.models.cart.CartOrigin;
import com.commercetools.models.cart.CustomLineItemDraft;
import com.commercetools.models.cart.InventoryMode;
import com.commercetools.models.cart.RoundingMode;
import com.commercetools.models.cart.TaxedPrice;
import com.commercetools.models.common.Address;
import com.commercetools.models.common.Money;
import com.commercetools.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.models.order.LineItemImportDraft;
import com.commercetools.models.order.OrderState;
import com.commercetools.models.order.PaymentState;
import com.commercetools.models.order.ShipmentState;
import com.commercetools.models.order.ShippingInfoImportDraft;
import com.commercetools.models.store.StoreKeyReference;
import com.commercetools.models.type.CustomFieldsDraft;
import java.time.ZonedDateTime;
import com.commercetools.models.order.OrderImportDraftImpl;

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
@JsonDeserialize(as = OrderImportDraftImpl.class)
public interface OrderImportDraft  {

   
   
   @JsonProperty("orderNumber")
   public String getOrderNumber();
   
   
   @JsonProperty("customerId")
   public String getCustomerId();
   
   
   @JsonProperty("customerEmail")
   public String getCustomerEmail();
   
   @Valid
   @JsonProperty("lineItems")
   public List<LineItemImportDraft> getLineItems();
   
   @Valid
   @JsonProperty("customLineItems")
   public List<CustomLineItemDraft> getCustomLineItems();
   
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
   
   @Valid
   @JsonProperty("customerGroup")
   public CustomerGroupResourceIdentifier getCustomerGroup();
   
   
   @JsonProperty("country")
   public String getCountry();
   
   
   @JsonProperty("orderState")
   public OrderState getOrderState();
   
   
   @JsonProperty("shipmentState")
   public ShipmentState getShipmentState();
   
   
   @JsonProperty("paymentState")
   public PaymentState getPaymentState();
   
   @Valid
   @JsonProperty("shippingInfo")
   public ShippingInfoImportDraft getShippingInfo();
   
   
   @JsonProperty("completedAt")
   public ZonedDateTime getCompletedAt();
   
   @Valid
   @JsonProperty("custom")
   public CustomFieldsDraft getCustom();
   
   
   @JsonProperty("inventoryMode")
   public InventoryMode getInventoryMode();
   
   
   @JsonProperty("taxRoundingMode")
   public RoundingMode getTaxRoundingMode();
   
   @Valid
   @JsonProperty("itemShippingAddresses")
   public List<Address> getItemShippingAddresses();
   
   @Valid
   @JsonProperty("store")
   public StoreKeyReference getStore();
   
   
   @JsonProperty("origin")
   public CartOrigin getOrigin();

   public void setOrderNumber(final String orderNumber);
   
   public void setCustomerId(final String customerId);
   
   public void setCustomerEmail(final String customerEmail);
   
   public void setLineItems(final List<LineItemImportDraft> lineItems);
   
   public void setCustomLineItems(final List<CustomLineItemDraft> customLineItems);
   
   public void setTotalPrice(final Money totalPrice);
   
   public void setTaxedPrice(final TaxedPrice taxedPrice);
   
   public void setShippingAddress(final Address shippingAddress);
   
   public void setBillingAddress(final Address billingAddress);
   
   public void setCustomerGroup(final CustomerGroupResourceIdentifier customerGroup);
   
   public void setCountry(final String country);
   
   public void setOrderState(final OrderState orderState);
   
   public void setShipmentState(final ShipmentState shipmentState);
   
   public void setPaymentState(final PaymentState paymentState);
   
   public void setShippingInfo(final ShippingInfoImportDraft shippingInfo);
   
   public void setCompletedAt(final ZonedDateTime completedAt);
   
   public void setCustom(final CustomFieldsDraft custom);
   
   public void setInventoryMode(final InventoryMode inventoryMode);
   
   public void setTaxRoundingMode(final RoundingMode taxRoundingMode);
   
   public void setItemShippingAddresses(final List<Address> itemShippingAddresses);
   
   public void setStore(final StoreKeyReference store);
   
   public void setOrigin(final CartOrigin origin);
   
   public static OrderImportDraftImpl of(){
      return new OrderImportDraftImpl();
   }
   

   public static OrderImportDraftImpl of(final OrderImportDraft template) {
      OrderImportDraftImpl instance = new OrderImportDraftImpl();
      instance.setShipmentState(template.getShipmentState());
      instance.setCountry(template.getCountry());
      instance.setCompletedAt(template.getCompletedAt());
      instance.setOrderNumber(template.getOrderNumber());
      instance.setTotalPrice(template.getTotalPrice());
      instance.setCustomerGroup(template.getCustomerGroup());
      instance.setTaxedPrice(template.getTaxedPrice());
      instance.setOrigin(template.getOrigin());
      instance.setCustom(template.getCustom());
      instance.setShippingInfo(template.getShippingInfo());
      instance.setStore(template.getStore());
      instance.setInventoryMode(template.getInventoryMode());
      instance.setOrderState(template.getOrderState());
      instance.setTaxRoundingMode(template.getTaxRoundingMode());
      instance.setLineItems(template.getLineItems());
      instance.setCustomLineItems(template.getCustomLineItems());
      instance.setItemShippingAddresses(template.getItemShippingAddresses());
      instance.setCustomerEmail(template.getCustomerEmail());
      instance.setCustomerId(template.getCustomerId());
      instance.setShippingAddress(template.getShippingAddress());
      instance.setBillingAddress(template.getBillingAddress());
      instance.setPaymentState(template.getPaymentState());
      return instance;
   }

}