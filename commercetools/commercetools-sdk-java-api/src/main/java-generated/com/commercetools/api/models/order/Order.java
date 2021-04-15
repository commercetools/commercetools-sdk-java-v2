
package com.commercetools.api.models.order;

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
import com.commercetools.api.models.state.StateReference;
import com.commercetools.api.models.store.StoreKeyReference;
import com.commercetools.api.models.type.CustomFields;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderImpl.class)
public interface Order extends BaseResource, com.commercetools.api.models.DomainResource<Order> {

    /**
    *  <p>The unique ID of the order.</p>
    */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
    *  <p>The current version of the order.</p>
    */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
    *  <p>Present on resources updated after 1/02/2019 except for events not tracked.</p>
    */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
    *  <p>Present on resources created after 1/02/2019 except for events not tracked.</p>
    */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
    *  <p>This field will only be present if it was set for Order Import</p>
    */

    @JsonProperty("completedAt")
    public ZonedDateTime getCompletedAt();

    /**
    *  <p>String that uniquely identifies an order.
    *  It can be used to create more human-readable (in contrast to ID) identifier for the order.
    *  It should be unique across a project.
    *  Once it's set it cannot be changed.</p>
    */

    @JsonProperty("orderNumber")
    public String getOrderNumber();

    @JsonProperty("customerId")
    public String getCustomerId();

    @JsonProperty("customerEmail")
    public String getCustomerEmail();

    /**
    *  <p>Identifies carts and orders belonging to an anonymous session (the customer has not signed up/in yet).</p>
    */

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

    /**
    *  <p>The taxes are calculated based on the shipping address.</p>
    */
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

    /**
    *  <p>When calculating taxes for <code>taxedPrice</code>, the selected mode is used for rouding.</p>
    */

    @JsonProperty("taxRoundingMode")
    public RoundingMode getTaxRoundingMode();

    /**
    *  <p>Set when the customer is set and the customer is a member of a customer group.
    *  Used for product variant price selection.</p>
    */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupReference getCustomerGroup();

    /**
    *  <p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.
    *  Used for product variant price selection.</p>
    */

    @JsonProperty("country")
    public String getCountry();

    /**
    *  <p>One of the four predefined OrderStates.</p>
    */
    @NotNull
    @JsonProperty("orderState")
    public OrderState getOrderState();

    /**
    *  <p>This reference can point to a state in a custom workflow.</p>
    */
    @Valid
    @JsonProperty("state")
    public StateReference getState();

    @JsonProperty("shipmentState")
    public ShipmentState getShipmentState();

    @JsonProperty("paymentState")
    public PaymentState getPaymentState();

    /**
    *  <p>Set if the ShippingMethod is set.</p>
    */
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

    /**
    *  <p>The sequence number of the last order message produced by changes to this order.
    *  <code>0</code> means, that no messages were created yet.</p>
    */
    @NotNull
    @JsonProperty("lastMessageSequenceNumber")
    public Long getLastMessageSequenceNumber();

    /**
    *  <p>Set when this order was created from a cart.
    *  The cart will have the state <code>Ordered</code>.</p>
    */
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

    /**
    *  <p>When calculating taxes for <code>taxedPrice</code>, the selected mode is used for calculating the price with LineItemLevel (horizontally) or UnitPriceLevel (vertically) calculation mode.</p>
    */

    @JsonProperty("taxCalculationMode")
    public TaxCalculationMode getTaxCalculationMode();

    /**
    *  <p>The shippingRateInput is used as an input to select a ShippingRatePriceTier.</p>
    */
    @Valid
    @JsonProperty("shippingRateInput")
    public ShippingRateInput getShippingRateInput();

    /**
    *  <p>Contains addresses for orders with multiple shipping addresses.</p>
    */
    @Valid
    @JsonProperty("itemShippingAddresses")
    public List<Address> getItemShippingAddresses();

    /**
    *  <p>Automatically filled when a line item with LineItemMode <code>GiftLineItem</code> is removed from this order.</p>
    */
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

    public static Order of() {
        return new OrderImpl();
    }

    public static Order of(final Order template) {
        OrderImpl instance = new OrderImpl();
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

    public static OrderBuilder builder() {
        return OrderBuilder.of();
    }

    public static OrderBuilder builder(final Order template) {
        return OrderBuilder.of(template);
    }

    default <T> T withOrder(Function<Order, T> helper) {
        return helper.apply(this);
    }
}
