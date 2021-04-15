
package com.commercetools.api.models.me;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.cart.CartOrigin;
import com.commercetools.api.models.cart.CartReference;
import com.commercetools.api.models.cart.CustomLineItem;
import com.commercetools.api.models.cart.DiscountCodeInfo;
import com.commercetools.api.models.cart.InventoryMode;
import com.commercetools.api.models.cart.LineItem;
import com.commercetools.api.models.cart.RoundingMode;
import com.commercetools.api.models.cart.ShippingInfo;
import com.commercetools.api.models.cart.ShippingRateInput;
import com.commercetools.api.models.cart.TaxCalculationMode;
import com.commercetools.api.models.cart.TaxMode;
import com.commercetools.api.models.cart.TaxedPrice;
import com.commercetools.api.models.cart_discount.CartDiscountReference;
import com.commercetools.api.models.common.Address;
import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.order.OrderState;
import com.commercetools.api.models.order.PaymentInfo;
import com.commercetools.api.models.order.PaymentState;
import com.commercetools.api.models.order.ReturnInfo;
import com.commercetools.api.models.order.ShipmentState;
import com.commercetools.api.models.order.SyncInfo;
import com.commercetools.api.models.state.StateReference;
import com.commercetools.api.models.store.StoreKeyReference;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MyOrderImpl.class)
public interface MyOrder extends BaseResource, com.commercetools.api.models.DomainResource<MyOrder> {

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

    @JsonIgnore
    public void setLineItems(final LineItem... lineItems);

    public void setLineItems(final List<LineItem> lineItems);

    @JsonIgnore
    public void setCustomLineItems(final CustomLineItem... customLineItems);

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

    @JsonIgnore
    public void setSyncInfo(final SyncInfo... syncInfo);

    public void setSyncInfo(final List<SyncInfo> syncInfo);

    @JsonIgnore
    public void setReturnInfo(final ReturnInfo... returnInfo);

    public void setReturnInfo(final List<ReturnInfo> returnInfo);

    @JsonIgnore
    public void setDiscountCodes(final DiscountCodeInfo... discountCodes);

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

    @JsonIgnore
    public void setItemShippingAddresses(final Address... itemShippingAddresses);

    public void setItemShippingAddresses(final List<Address> itemShippingAddresses);

    @JsonIgnore
    public void setRefusedGifts(final CartDiscountReference... refusedGifts);

    public void setRefusedGifts(final List<CartDiscountReference> refusedGifts);

    public static MyOrder of() {
        return new MyOrderImpl();
    }

    public static MyOrder of(final MyOrder template) {
        MyOrderImpl instance = new MyOrderImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setCompletedAt(template.getCompletedAt());
        instance.setOrderNumber(template.getOrderNumber());
        instance.setCustomerId(template.getCustomerId());
        instance.setCustomerEmail(template.getCustomerEmail());
        instance.setAnonymousId(template.getAnonymousId());
        instance.setStore(template.getStore());
        instance.setLineItems(template.getLineItems());
        instance.setCustomLineItems(template.getCustomLineItems());
        instance.setTotalPrice(template.getTotalPrice());
        instance.setTaxedPrice(template.getTaxedPrice());
        instance.setShippingAddress(template.getShippingAddress());
        instance.setBillingAddress(template.getBillingAddress());
        instance.setTaxMode(template.getTaxMode());
        instance.setTaxRoundingMode(template.getTaxRoundingMode());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setCountry(template.getCountry());
        instance.setOrderState(template.getOrderState());
        instance.setState(template.getState());
        instance.setShipmentState(template.getShipmentState());
        instance.setPaymentState(template.getPaymentState());
        instance.setShippingInfo(template.getShippingInfo());
        instance.setSyncInfo(template.getSyncInfo());
        instance.setReturnInfo(template.getReturnInfo());
        instance.setDiscountCodes(template.getDiscountCodes());
        instance.setLastMessageSequenceNumber(template.getLastMessageSequenceNumber());
        instance.setCart(template.getCart());
        instance.setCustom(template.getCustom());
        instance.setPaymentInfo(template.getPaymentInfo());
        instance.setLocale(template.getLocale());
        instance.setInventoryMode(template.getInventoryMode());
        instance.setOrigin(template.getOrigin());
        instance.setTaxCalculationMode(template.getTaxCalculationMode());
        instance.setShippingRateInput(template.getShippingRateInput());
        instance.setItemShippingAddresses(template.getItemShippingAddresses());
        instance.setRefusedGifts(template.getRefusedGifts());
        return instance;
    }

    public static MyOrderBuilder builder() {
        return MyOrderBuilder.of();
    }

    public static MyOrderBuilder builder(final MyOrder template) {
        return MyOrderBuilder.of(template);
    }

    default <T> T withMyOrder(Function<MyOrder, T> helper) {
        return helper.apply(this);
    }
}
