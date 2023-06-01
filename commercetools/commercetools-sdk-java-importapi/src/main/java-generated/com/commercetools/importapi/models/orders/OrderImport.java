package com.commercetools.importapi.models.orders;

import com.commercetools.importapi.models.common.Address;
import com.commercetools.importapi.models.common.CustomerGroupKeyReference;
import com.commercetools.importapi.models.common.CustomerKeyReference;
import com.commercetools.importapi.models.common.StateKeyReference;
import com.commercetools.importapi.models.common.StoreKeyReference;
import com.commercetools.importapi.models.common.TypedMoney;
import com.commercetools.importapi.models.customfields.Custom;
import com.commercetools.importapi.models.orders.CartOrigin;
import com.commercetools.importapi.models.orders.CustomLineItemDraft;
import com.commercetools.importapi.models.orders.InventoryMode;
import com.commercetools.importapi.models.orders.LineItemImportDraft;
import com.commercetools.importapi.models.orders.OrderState;
import com.commercetools.importapi.models.orders.PaymentState;
import com.commercetools.importapi.models.orders.RoundingMode;
import com.commercetools.importapi.models.orders.ShipmentState;
import com.commercetools.importapi.models.orders.ShippingInfoImportDraft;
import com.commercetools.importapi.models.orders.TaxCalculationMode;
import com.commercetools.importapi.models.orders.TaxedPrice;
import java.time.ZonedDateTime;
import com.commercetools.importapi.models.orders.OrderImportImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 *  <p>The data representation for an Order to be imported that is persisted as an Order in the Project.</p>
 *  <p>In commercetools, you can import an Order using the Create Order by Import endpoint method instead of creating it from a Cart.</p>
 *  <p>An OrderImport is a snapshot of an order at the time it was imported.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderImport orderImport = OrderImport.builder()
 *             .orderNumber("{orderNumber}")
 *             .totalPrice(totalPriceBuilder -> totalPriceBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
@JsonDeserialize(as = OrderImportImpl.class)
public interface OrderImport  {


    /**
     *  <p>Maps to <code>Order.orderNumber</code>, String that uniquely identifies an order. It should be unique across a project. Once it's set it cannot be changed.</p>
     * @return orderNumber
     */
    @NotNull
    @JsonProperty("orderNumber")
    public String getOrderNumber();
    /**
     *
     * @return customer
     */
    @Valid
    @JsonProperty("customer")
    public CustomerKeyReference getCustomer();
    /**
     *  <p>Maps to <code>Order.customerEmail</code>.</p>
     * @return customerEmail
     */
    
    @JsonProperty("customerEmail")
    public String getCustomerEmail();
    /**
     *  <p>Maps to <code>Order.lineItems</code>.</p>
     * @return lineItems
     */
    @Valid
    @JsonProperty("lineItems")
    public List<LineItemImportDraft> getLineItems();
    /**
     *  <p>Maps to <code>Order.customLineItems</code></p>
     * @return customLineItems
     */
    @Valid
    @JsonProperty("customLineItems")
    public List<CustomLineItemDraft> getCustomLineItems();
    /**
     *  <p>Maps to <code>Order.totalPrice</code>.</p>
     * @return totalPrice
     */
    @NotNull
    @Valid
    @JsonProperty("totalPrice")
    public TypedMoney getTotalPrice();
    /**
     *  <p>Maps to <code>Order.taxedPrice</code>.</p>
     * @return taxedPrice
     */
    @Valid
    @JsonProperty("taxedPrice")
    public TaxedPrice getTaxedPrice();
    /**
     *  <p>Maps to <code>Order.shippingAddress</code>.</p>
     * @return shippingAddress
     */
    @Valid
    @JsonProperty("shippingAddress")
    public Address getShippingAddress();
    /**
     *  <p>Maps to <code>Order.billingAddress</code>.</p>
     * @return billingAddress
     */
    @Valid
    @JsonProperty("billingAddress")
    public Address getBillingAddress();
    /**
     *  <p>Maps to <code>Order.customerGroup</code>.</p>
     * @return customerGroup
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupKeyReference getCustomerGroup();
    /**
     *  <p>Maps to <code>Order.country</code>.</p>
     * @return country
     */
    
    @JsonProperty("country")
    public String getCountry();
    /**
     *  <p>Maps to <code>Order.orderState</code>.</p>
     * @return orderState
     */
    
    @JsonProperty("orderState")
    public OrderState getOrderState();
    /**
     *  <p>Maps to <code>Order.shipmentState</code>.</p>
     * @return shipmentState
     */
    
    @JsonProperty("shipmentState")
    public ShipmentState getShipmentState();
    /**
     *  <p>Maps to <code>Order.paymentState</code>.</p>
     * @return paymentState
     */
    
    @JsonProperty("paymentState")
    public PaymentState getPaymentState();
    /**
     *  <p>Maps to <code>Order.shippingInfo</code>.</p>
     * @return shippingInfo
     */
    @Valid
    @JsonProperty("shippingInfo")
    public ShippingInfoImportDraft getShippingInfo();
    /**
     *  <p>Maps to <code>Order.completedAt</code>.</p>
     * @return completedAt
     */
    
    @JsonProperty("completedAt")
    public ZonedDateTime getCompletedAt();
    /**
     *  <p>Maps to <code>Order.custom</code>.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public Custom getCustom();
    /**
     *  <p>Maps to <code>Order.inventoryMode</code>.</p>
     * @return inventoryMode
     */
    
    @JsonProperty("inventoryMode")
    public InventoryMode getInventoryMode();
    /**
     *  <p>Maps to <code>Order.taxRoundingMode</code>.</p>
     * @return taxRoundingMode
     */
    
    @JsonProperty("taxRoundingMode")
    public RoundingMode getTaxRoundingMode();
    /**
     *  <p>Maps to <code>Order.taxCalculationMode</code>.</p>
     * @return taxCalculationMode
     */
    
    @JsonProperty("taxCalculationMode")
    public TaxCalculationMode getTaxCalculationMode();
    /**
     *  <p>Maps to <code>Order.origin</code>.</p>
     * @return origin
     */
    
    @JsonProperty("origin")
    public CartOrigin getOrigin();
    /**
     *  <p>Maps to <code>Order.itemShippingAddresses</code>.</p>
     * @return itemShippingAddresses
     */
    @Valid
    @JsonProperty("itemShippingAddresses")
    public List<Address> getItemShippingAddresses();
    /**
     *  <p>Reference to the Store in which the Order is associated. If referenced Store does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Store exists.</p>
     * @return store
     */
    @Valid
    @JsonProperty("store")
    public StoreKeyReference getStore();
    /**
     *  <p>Reference to a State in a custom workflow.</p>
     * @return state
     */
    @Valid
    @JsonProperty("state")
    public StateKeyReference getState();

    /**
     *  <p>Maps to <code>Order.orderNumber</code>, String that uniquely identifies an order. It should be unique across a project. Once it's set it cannot be changed.</p>
     * @param orderNumber value to be set
     */
    
    public void setOrderNumber(final String orderNumber);
    
    
    /**
     * set customer
     * @param customer value to be set
     */
    
    public void setCustomer(final CustomerKeyReference customer);
    
    
    /**
     *  <p>Maps to <code>Order.customerEmail</code>.</p>
     * @param customerEmail value to be set
     */
    
    public void setCustomerEmail(final String customerEmail);
    
    
    /**
     *  <p>Maps to <code>Order.lineItems</code>.</p>
     * @param lineItems values to be set
     */
    
    @JsonIgnore
    public void setLineItems(final LineItemImportDraft ...lineItems);
    /**
     *  <p>Maps to <code>Order.lineItems</code>.</p>
     * @param lineItems values to be set
     */
    
    public void setLineItems(final List<LineItemImportDraft> lineItems);
    
    /**
     *  <p>Maps to <code>Order.customLineItems</code></p>
     * @param customLineItems values to be set
     */
    
    @JsonIgnore
    public void setCustomLineItems(final CustomLineItemDraft ...customLineItems);
    /**
     *  <p>Maps to <code>Order.customLineItems</code></p>
     * @param customLineItems values to be set
     */
    
    public void setCustomLineItems(final List<CustomLineItemDraft> customLineItems);
    
    /**
     *  <p>Maps to <code>Order.totalPrice</code>.</p>
     * @param totalPrice value to be set
     */
    
    public void setTotalPrice(final TypedMoney totalPrice);
    
    
    /**
     *  <p>Maps to <code>Order.taxedPrice</code>.</p>
     * @param taxedPrice value to be set
     */
    
    public void setTaxedPrice(final TaxedPrice taxedPrice);
    
    
    /**
     *  <p>Maps to <code>Order.shippingAddress</code>.</p>
     * @param shippingAddress value to be set
     */
    
    public void setShippingAddress(final Address shippingAddress);
    
    
    /**
     *  <p>Maps to <code>Order.billingAddress</code>.</p>
     * @param billingAddress value to be set
     */
    
    public void setBillingAddress(final Address billingAddress);
    
    
    /**
     *  <p>Maps to <code>Order.customerGroup</code>.</p>
     * @param customerGroup value to be set
     */
    
    public void setCustomerGroup(final CustomerGroupKeyReference customerGroup);
    
    
    /**
     *  <p>Maps to <code>Order.country</code>.</p>
     * @param country value to be set
     */
    
    public void setCountry(final String country);
    
    
    /**
     *  <p>Maps to <code>Order.orderState</code>.</p>
     * @param orderState value to be set
     */
    
    public void setOrderState(final OrderState orderState);
    
    
    /**
     *  <p>Maps to <code>Order.shipmentState</code>.</p>
     * @param shipmentState value to be set
     */
    
    public void setShipmentState(final ShipmentState shipmentState);
    
    
    /**
     *  <p>Maps to <code>Order.paymentState</code>.</p>
     * @param paymentState value to be set
     */
    
    public void setPaymentState(final PaymentState paymentState);
    
    
    /**
     *  <p>Maps to <code>Order.shippingInfo</code>.</p>
     * @param shippingInfo value to be set
     */
    
    public void setShippingInfo(final ShippingInfoImportDraft shippingInfo);
    
    
    /**
     *  <p>Maps to <code>Order.completedAt</code>.</p>
     * @param completedAt value to be set
     */
    
    public void setCompletedAt(final ZonedDateTime completedAt);
    
    
    /**
     *  <p>Maps to <code>Order.custom</code>.</p>
     * @param custom value to be set
     */
    
    public void setCustom(final Custom custom);
    
    
    /**
     *  <p>Maps to <code>Order.inventoryMode</code>.</p>
     * @param inventoryMode value to be set
     */
    
    public void setInventoryMode(final InventoryMode inventoryMode);
    
    
    /**
     *  <p>Maps to <code>Order.taxRoundingMode</code>.</p>
     * @param taxRoundingMode value to be set
     */
    
    public void setTaxRoundingMode(final RoundingMode taxRoundingMode);
    
    
    /**
     *  <p>Maps to <code>Order.taxCalculationMode</code>.</p>
     * @param taxCalculationMode value to be set
     */
    
    public void setTaxCalculationMode(final TaxCalculationMode taxCalculationMode);
    
    
    /**
     *  <p>Maps to <code>Order.origin</code>.</p>
     * @param origin value to be set
     */
    
    public void setOrigin(final CartOrigin origin);
    
    
    /**
     *  <p>Maps to <code>Order.itemShippingAddresses</code>.</p>
     * @param itemShippingAddresses values to be set
     */
    
    @JsonIgnore
    public void setItemShippingAddresses(final Address ...itemShippingAddresses);
    /**
     *  <p>Maps to <code>Order.itemShippingAddresses</code>.</p>
     * @param itemShippingAddresses values to be set
     */
    
    public void setItemShippingAddresses(final List<Address> itemShippingAddresses);
    
    /**
     *  <p>Reference to the Store in which the Order is associated. If referenced Store does not exist, the <code>state</code> of the ImportOperation will be set to <code>unresolved</code> until the necessary Store exists.</p>
     * @param store value to be set
     */
    
    public void setStore(final StoreKeyReference store);
    
    
    /**
     *  <p>Reference to a State in a custom workflow.</p>
     * @param state value to be set
     */
    
    public void setState(final StateKeyReference state);
    

    /**
     * factory method
     * @return instance of OrderImport
     */
    public static OrderImport of(){
        return new OrderImportImpl();
    }
    

    /**
     * factory method to create a shallow copy OrderImport
     * @param template instance to be copied
     * @return copy instance
     */
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
        instance.setStore(template.getStore());
        instance.setState(template.getState());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderImport
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderImport deepCopy(@Nullable final OrderImport template) {
        if (template == null) {
            return null;
        }
        OrderImportImpl instance = new OrderImportImpl();
        instance.setOrderNumber(template.getOrderNumber());
        instance.setCustomer(com.commercetools.importapi.models.common.CustomerKeyReference.deepCopy(template.getCustomer()));
        instance.setCustomerEmail(template.getCustomerEmail());
        instance.setLineItems(Optional.ofNullable(template.getLineItems())
                .map(t -> t.stream().map(com.commercetools.importapi.models.orders.LineItemImportDraft::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        instance.setCustomLineItems(Optional.ofNullable(template.getCustomLineItems())
                .map(t -> t.stream().map(com.commercetools.importapi.models.orders.CustomLineItemDraft::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        instance.setTotalPrice(com.commercetools.importapi.models.common.TypedMoney.deepCopy(template.getTotalPrice()));
        instance.setTaxedPrice(com.commercetools.importapi.models.orders.TaxedPrice.deepCopy(template.getTaxedPrice()));
        instance.setShippingAddress(com.commercetools.importapi.models.common.Address.deepCopy(template.getShippingAddress()));
        instance.setBillingAddress(com.commercetools.importapi.models.common.Address.deepCopy(template.getBillingAddress()));
        instance.setCustomerGroup(com.commercetools.importapi.models.common.CustomerGroupKeyReference.deepCopy(template.getCustomerGroup()));
        instance.setCountry(template.getCountry());
        instance.setOrderState(template.getOrderState());
        instance.setShipmentState(template.getShipmentState());
        instance.setPaymentState(template.getPaymentState());
        instance.setShippingInfo(com.commercetools.importapi.models.orders.ShippingInfoImportDraft.deepCopy(template.getShippingInfo()));
        instance.setCompletedAt(template.getCompletedAt());
        instance.setCustom(com.commercetools.importapi.models.customfields.Custom.deepCopy(template.getCustom()));
        instance.setInventoryMode(template.getInventoryMode());
        instance.setTaxRoundingMode(template.getTaxRoundingMode());
        instance.setTaxCalculationMode(template.getTaxCalculationMode());
        instance.setOrigin(template.getOrigin());
        instance.setItemShippingAddresses(Optional.ofNullable(template.getItemShippingAddresses())
                .map(t -> t.stream().map(com.commercetools.importapi.models.common.Address::deepCopy).collect(Collectors.toList()))
                .orElse(null));
        instance.setStore(com.commercetools.importapi.models.common.StoreKeyReference.deepCopy(template.getStore()));
        instance.setState(com.commercetools.importapi.models.common.StateKeyReference.deepCopy(template.getState()));
        return instance;
    }

    /**
     * builder factory method for OrderImport
     * @return builder
     */
    public static OrderImportBuilder builder() {
        return OrderImportBuilder.of();
    }
    
    /**
     * create builder for OrderImport instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderImportBuilder builder(final OrderImport template) {
        return OrderImportBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderImport(Function<OrderImport, T> helper) {
        return helper.apply(this);
    }
    
    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderImport> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderImport>() {
            @Override
            public String toString() {
                return "TypeReference<OrderImport>";
            }
        };
    }
}
