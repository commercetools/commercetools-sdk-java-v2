package com.commercetools.api.generated.models.order;

import com.commercetools.api.generated.models.cart.CartOrigin;
import com.commercetools.api.generated.models.cart.CustomLineItemDraft;
import com.commercetools.api.generated.models.cart.InventoryMode;
import com.commercetools.api.generated.models.cart.RoundingMode;
import com.commercetools.api.generated.models.cart.TaxedPriceDraft;
import com.commercetools.api.generated.models.common.Address;
import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.generated.models.order.LineItemImportDraft;
import com.commercetools.api.generated.models.order.OrderState;
import com.commercetools.api.generated.models.order.PaymentState;
import com.commercetools.api.generated.models.order.ShipmentState;
import com.commercetools.api.generated.models.order.ShippingInfoImportDraft;
import com.commercetools.api.generated.models.store.StoreResourceIdentifier;
import com.commercetools.api.generated.models.type.CustomFieldsDraft;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.order.OrderImportDraftImpl;

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
   public TaxedPriceDraft getTaxedPrice();
   
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
   public StoreResourceIdentifier getStore();
   
   
   @JsonProperty("origin")
   public CartOrigin getOrigin();

   public void setOrderNumber(final String orderNumber);
   
   public void setCustomerId(final String customerId);
   
   public void setCustomerEmail(final String customerEmail);
   
   public void setLineItems(final List<LineItemImportDraft> lineItems);
   
   public void setCustomLineItems(final List<CustomLineItemDraft> customLineItems);
   
   public void setTotalPrice(final Money totalPrice);
   
   public void setTaxedPrice(final TaxedPriceDraft taxedPrice);
   
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
   
   public void setStore(final StoreResourceIdentifier store);
   
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