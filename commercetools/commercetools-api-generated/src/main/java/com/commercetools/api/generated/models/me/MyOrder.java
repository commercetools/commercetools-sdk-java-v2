package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.cart.CartOrigin;
import com.commercetools.api.generated.models.cart.CartReference;
import com.commercetools.api.generated.models.cart.CustomLineItem;
import com.commercetools.api.generated.models.cart.DiscountCodeInfo;
import com.commercetools.api.generated.models.cart.InventoryMode;
import com.commercetools.api.generated.models.cart.LineItem;
import com.commercetools.api.generated.models.cart.RoundingMode;
import com.commercetools.api.generated.models.cart.ShippingInfo;
import com.commercetools.api.generated.models.cart.ShippingRateInput;
import com.commercetools.api.generated.models.cart.TaxCalculationMode;
import com.commercetools.api.generated.models.cart.TaxMode;
import com.commercetools.api.generated.models.cart.TaxedPrice;
import com.commercetools.api.generated.models.cart_discount.CartDiscountReference;
import com.commercetools.api.generated.models.common.Address;
import com.commercetools.api.generated.models.common.CreatedBy;
import com.commercetools.api.generated.models.common.LastModifiedBy;
import com.commercetools.api.generated.models.common.LoggedResource;
import com.commercetools.api.generated.models.common.TypedMoney;
import com.commercetools.api.generated.models.customer_group.CustomerGroupReference;
import com.commercetools.api.generated.models.order.OrderState;
import com.commercetools.api.generated.models.order.PaymentInfo;
import com.commercetools.api.generated.models.order.PaymentState;
import com.commercetools.api.generated.models.order.ReturnInfo;
import com.commercetools.api.generated.models.order.ShipmentState;
import com.commercetools.api.generated.models.order.SyncInfo;
import com.commercetools.api.generated.models.state.StateReference;
import com.commercetools.api.generated.models.store.StoreKeyReference;
import com.commercetools.api.generated.models.type.CustomFields;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.me.MyOrderImpl;

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
@JsonDeserialize(as = MyOrderImpl.class)
public interface MyOrder extends LoggedResource {

   
   @NotNull
   @JsonProperty("id")
   public String getId();
   
   @NotNull
   @JsonProperty("version")
   public Long getVersion();
   
   @NotNull
   @JsonProperty("createdAt")
   public ZonedDateTime getCreatedAt();
   
   @NotNull
   @JsonProperty("lastModifiedAt")
   public ZonedDateTime getLastModifiedAt();
   
   @Valid
   @JsonProperty("lastModifiedBy")
   public LastModifiedBy getLastModifiedBy();
   
   @Valid
   @JsonProperty("createdBy")
   public CreatedBy getCreatedBy();
   
   
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
   public TypedMoney getTotalPrice();
   
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
   
   @NotNull
   @Valid
   @JsonProperty("refusedGifts")
   public List<CartDiscountReference> getRefusedGifts();

   public void setId(final String id);
   
   public void setVersion(final Long version);
   
   public void setCreatedAt(final ZonedDateTime createdAt);
   
   public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);
   
   public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);
   
   public void setCreatedBy(final CreatedBy createdBy);
   
   public void setCompletedAt(final ZonedDateTime completedAt);
   
   public void setOrderNumber(final String orderNumber);
   
   public void setCustomerId(final String customerId);
   
   public void setCustomerEmail(final String customerEmail);
   
   public void setAnonymousId(final String anonymousId);
   
   public void setStore(final StoreKeyReference store);
   
   public void setLineItems(final List<LineItem> lineItems);
   
   public void setCustomLineItems(final List<CustomLineItem> customLineItems);
   
   public void setTotalPrice(final TypedMoney totalPrice);
   
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
   
   public void setRefusedGifts(final List<CartDiscountReference> refusedGifts);
   
   public static MyOrderImpl of(){
      return new MyOrderImpl();
   }
   

   public static MyOrderImpl of(final MyOrder template) {
      MyOrderImpl instance = new MyOrderImpl();
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
      instance.setRefusedGifts(template.getRefusedGifts());
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