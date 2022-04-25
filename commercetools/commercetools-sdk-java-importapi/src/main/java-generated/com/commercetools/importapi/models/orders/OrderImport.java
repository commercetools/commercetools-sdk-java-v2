
package com.commercetools.importapi.models.orders;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.Address;
import com.commercetools.importapi.models.common.CustomerGroupKeyReference;
import com.commercetools.importapi.models.common.CustomerKeyReference;
import com.commercetools.importapi.models.common.TypedMoney;
import com.commercetools.importapi.models.customfields.Custom;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>The data representation for an Order to be imported that is persisted as an <a href="/../api/projects/orders#top">Order</a> in the Project.</p>
*  <p>In commercetools, you can import an Order using the
*  <a href="https://docs.commercetools.com/http-api-projects-orders-import.html#create-an-order-by-import">Create Order by Import</a>
*  endpoint method instead of creating it from a Cart.</p>
*  <p>An OrderImport is a snapshot of an order at the time it was imported.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OrderImportImpl.class)
public interface OrderImport {

    /**
    *  <p>Maps to <code>Order.orderNumber</code>, String that uniquely identifies an order. It should be unique across a project. Once it's set it cannot be changed.</p>
    */
    @NotNull
    @JsonProperty("orderNumber")
    public String getOrderNumber();

    @Valid
    @JsonProperty("customer")
    public CustomerKeyReference getCustomer();

    /**
    *  <p>Maps to <code>Order.customerEmail</code>.</p>
    */

    @JsonProperty("customerEmail")
    public String getCustomerEmail();

    /**
    *  <p>Maps to <code>Order.lineItems</code>.</p>
    */
    @Valid
    @JsonProperty("lineItems")
    public List<LineItemImportDraft> getLineItems();

    /**
    *  <p>Maps to <code>Order.customLineItems</code></p>
    */
    @Valid
    @JsonProperty("customLineItems")
    public List<CustomLineItemDraft> getCustomLineItems();

    /**
    *  <p>Maps to <code>Order.totalPrice</code>.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("totalPrice")
    public TypedMoney getTotalPrice();

    /**
    *  <p>Maps to <code>Order.taxedPrice</code>.</p>
    */
    @Valid
    @JsonProperty("taxedPrice")
    public TaxedPrice getTaxedPrice();

    /**
    *  <p>Maps to <code>Order.shippingAddress</code>.</p>
    */
    @Valid
    @JsonProperty("shippingAddress")
    public Address getShippingAddress();

    /**
    *  <p>Maps to <code>Order.billingAddress</code>.</p>
    */
    @Valid
    @JsonProperty("billingAddress")
    public Address getBillingAddress();

    /**
    *  <p>Maps to <code>Order.customerGroup</code>.</p>
    */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupKeyReference getCustomerGroup();

    /**
    *  <p>Maps to <code>Order.country</code>.</p>
    */

    @JsonProperty("country")
    public String getCountry();

    /**
    *  <p>Maps to <code>Order.orderState</code>.</p>
    */

    @JsonProperty("orderState")
    public OrderState getOrderState();

    /**
    *  <p>Maps to <code>Order.shipmentState</code>.</p>
    */

    @JsonProperty("shipmentState")
    public ShipmentState getShipmentState();

    /**
    *  <p>Maps to <code>Order.paymentState</code>.</p>
    */

    @JsonProperty("paymentState")
    public PaymentState getPaymentState();

    /**
    *  <p>Maps to <code>Order.shippingInfo</code>.</p>
    */
    @Valid
    @JsonProperty("shippingInfo")
    public ShippingInfoImportDraft getShippingInfo();

    /**
    *  <p>Maps to <code>Order.completedAt</code>.</p>
    */

    @JsonProperty("completedAt")
    public ZonedDateTime getCompletedAt();

    /**
    *  <p>Maps to <code>Order.custom</code>.</p>
    */
    @Valid
    @JsonProperty("custom")
    public Custom getCustom();

    /**
    *  <p>Maps to <code>Order.inventoryMode</code>.</p>
    */

    @JsonProperty("inventoryMode")
    public InventoryMode getInventoryMode();

    /**
    *  <p>Maps to <code>Order.taxRoundingMode</code>.</p>
    */

    @JsonProperty("taxRoundingMode")
    public RoundingMode getTaxRoundingMode();

    /**
    *  <p>Maps to <code>Order.taxCalculationMode</code>.</p>
    */

    @JsonProperty("taxCalculationMode")
    public TaxCalculationMode getTaxCalculationMode();

    /**
    *  <p>Maps to <code>Order.origin</code>.</p>
    */

    @JsonProperty("origin")
    public CartOrigin getOrigin();

    /**
    *  <p>Maps to <code>Order.itemShippingAddresses</code>.</p>
    */
    @Valid
    @JsonProperty("itemShippingAddresses")
    public List<Address> getItemShippingAddresses();

    public void setOrderNumber(final String orderNumber);

    public void setCustomer(final CustomerKeyReference customer);

    public void setCustomerEmail(final String customerEmail);

    @JsonIgnore
    public void setLineItems(final LineItemImportDraft... lineItems);

    public void setLineItems(final List<LineItemImportDraft> lineItems);

    @JsonIgnore
    public void setCustomLineItems(final CustomLineItemDraft... customLineItems);

    public void setCustomLineItems(final List<CustomLineItemDraft> customLineItems);

    public void setTotalPrice(final TypedMoney totalPrice);

    public void setTaxedPrice(final TaxedPrice taxedPrice);

    public void setShippingAddress(final Address shippingAddress);

    public void setBillingAddress(final Address billingAddress);

    public void setCustomerGroup(final CustomerGroupKeyReference customerGroup);

    public void setCountry(final String country);

    public void setOrderState(final OrderState orderState);

    public void setShipmentState(final ShipmentState shipmentState);

    public void setPaymentState(final PaymentState paymentState);

    public void setShippingInfo(final ShippingInfoImportDraft shippingInfo);

    public void setCompletedAt(final ZonedDateTime completedAt);

    public void setCustom(final Custom custom);

    public void setInventoryMode(final InventoryMode inventoryMode);

    public void setTaxRoundingMode(final RoundingMode taxRoundingMode);

    public void setTaxCalculationMode(final TaxCalculationMode taxCalculationMode);

    public void setOrigin(final CartOrigin origin);

    @JsonIgnore
    public void setItemShippingAddresses(final Address... itemShippingAddresses);

    public void setItemShippingAddresses(final List<Address> itemShippingAddresses);

    public static OrderImport of() {
        return new OrderImportImpl();
    }

    public static OrderImport of(final OrderImport template) {
        OrderImportImpl instance = new OrderImportImpl();
        instance.setOrderNumber(template.getOrderNumber());
        instance.setCustomer(template.getCustomer());
        instance.setCustomerEmail(template.getCustomerEmail());
        instance.setLineItems(template.getLineItems());
        instance.setCustomLineItems(template.getCustomLineItems());
        instance.setTotalPrice(template.getTotalPrice());
        instance.setTaxedPrice(template.getTaxedPrice());
        instance.setShippingAddress(template.getShippingAddress());
        instance.setBillingAddress(template.getBillingAddress());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setCountry(template.getCountry());
        instance.setOrderState(template.getOrderState());
        instance.setShipmentState(template.getShipmentState());
        instance.setPaymentState(template.getPaymentState());
        instance.setShippingInfo(template.getShippingInfo());
        instance.setCompletedAt(template.getCompletedAt());
        instance.setCustom(template.getCustom());
        instance.setInventoryMode(template.getInventoryMode());
        instance.setTaxRoundingMode(template.getTaxRoundingMode());
        instance.setTaxCalculationMode(template.getTaxCalculationMode());
        instance.setOrigin(template.getOrigin());
        instance.setItemShippingAddresses(template.getItemShippingAddresses());
        return instance;
    }

    public static OrderImportBuilder builder() {
        return OrderImportBuilder.of();
    }

    public static OrderImportBuilder builder(final OrderImport template) {
        return OrderImportBuilder.of(template);
    }

    default <T> T withOrderImport(Function<OrderImport, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<OrderImport> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderImport>() {
            @Override
            public String toString() {
                return "TypeReference<OrderImport>";
            }
        };
    }
}
