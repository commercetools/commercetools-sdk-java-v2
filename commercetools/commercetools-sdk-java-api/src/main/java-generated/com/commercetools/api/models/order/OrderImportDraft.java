
package com.commercetools.api.models.order;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier;
import com.commercetools.api.models.cart.CartOrigin;
import com.commercetools.api.models.cart.InventoryMode;
import com.commercetools.api.models.cart.RoundingMode;
import com.commercetools.api.models.cart.TaxCalculationMode;
import com.commercetools.api.models.cart.TaxedPriceDraft;
import com.commercetools.api.models.common.BaseAddress;
import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.models.state.StateReference;
import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.commercetools.api.models.type.CustomFieldsDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>A snapshot of an Order at the time it was imported.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderImportDraft orderImportDraft = OrderImportDraft.builder()
 *             .totalPrice(totalPriceBuilder -> totalPriceBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderImportDraftImpl.class)
public interface OrderImportDraft extends com.commercetools.api.models.CustomizableDraft<OrderImportDraft>,
        io.vrap.rmf.base.client.Draft<OrderImportDraft> {

    /**
     *  <p>User-defined identifier of the Order. Must be unique across a Project. Once set, the value cannot be changed.</p>
     * @return orderNumber
     */

    @JsonProperty("orderNumber")
    public String getOrderNumber();

    /**
     *  <p>User-defined identifier for a purchase Order.</p>
     * @return purchaseOrderNumber
     */

    @JsonProperty("purchaseOrderNumber")
    public String getPurchaseOrderNumber();

    /**
     *  <p>The <code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> the Order belongs to.</p>
     * @return customerId
     */

    @JsonProperty("customerId")
    public String getCustomerId();

    /**
     *  <p>The Email address of the Customer the Order belongs to. Can be used instead of <code>customerId</code> when no check against existing <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customers</a> is required.</p>
     * @return customerEmail
     */

    @JsonProperty("customerEmail")
    public String getCustomerEmail();

    /**
     *  <p>The Customer Group of the Customer the Order belongs to.</p>
     * @return customerGroup
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupResourceIdentifier getCustomerGroup();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to the Business Unit the Order should belong to. When the <code>customerId</code> of the Order is also set, the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> must be an <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> of the Business Unit. Only available for <span>B2B</span>-enabled Projects.</p>
     * @return businessUnit
     */
    @Valid
    @JsonProperty("businessUnit")
    public BusinessUnitResourceIdentifier getBusinessUnit();

    /**
     *  <p>The Store the Order belongs to. Used for <span>filtering</span>.</p>
     *  <p>If a <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItemImportDraft" rel="nofollow">LineItemImportDraft</a> or a <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItemImportDraft" rel="nofollow">CustomLineItemImportDraft</a> specifies a <code>distributionChannel</code> or a <code>supplyChannel</code> that is not defined for the referenced Store, the Order Import gets rejected. The same applies when the provided <code>country</code> is not defined for the referenced Store.</p>
     * @return store
     */
    @Valid
    @JsonProperty("store")
    public StoreResourceIdentifier getStore();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:LineItems" rel="nofollow">Line Items</a> to add to the Order.</p>
     *  <p>If not specified, <code>customLineItems</code> must not be empty.</p>
     * @return lineItems
     */
    @Valid
    @JsonProperty("lineItems")
    public List<LineItemImportDraft> getLineItems();

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItems" rel="nofollow">Custom Line Items</a> to add to the Cart.</p>
     *  <p>If not specified, <code>lineItems</code> must not be empty.</p>
     * @return customLineItems
     */
    @Valid
    @JsonProperty("customLineItems")
    public List<CustomLineItemImportDraft> getCustomLineItems();

    /**
     *  <p>The total Price of the Order. The amount can be negative.</p>
     * @return totalPrice
     */
    @NotNull
    @Valid
    @JsonProperty("totalPrice")
    public Money getTotalPrice();

    /**
     *  <p>Include TaxedPrice information for the Order. If not included, and if you have Tax Rates set for Line Items and Custom Line Items, the Order total will not be recalculated.</p>
     * @return taxedPrice
     */
    @Valid
    @JsonProperty("taxedPrice")
    public TaxedPriceDraft getTaxedPrice();

    /**
     *  <p>Determines how the total prices on <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItems</a> are rounded when calculated.</p>
     * @return priceRoundingMode
     */

    @JsonProperty("priceRoundingMode")
    public RoundingMode getPriceRoundingMode();

    /**
     *  <p>Determines how monetary values are rounded when calculating taxes for <code>taxedPrice</code>.</p>
     * @return taxRoundingMode
     */

    @JsonProperty("taxRoundingMode")
    public RoundingMode getTaxRoundingMode();

    /**
     *  <p>Determines how taxes are calculated for <code>taxedPrice</code>.</p>
     * @return taxCalculationMode
     */

    @JsonProperty("taxCalculationMode")
    public TaxCalculationMode getTaxCalculationMode();

    /**
     *  <p>Determines how stock quantities are tracked for Line Items in the Cart.</p>
     * @return inventoryMode
     */

    @JsonProperty("inventoryMode")
    public InventoryMode getInventoryMode();

    /**
     *  <p>Billing address associated with the Order.</p>
     * @return billingAddress
     */
    @Valid
    @JsonProperty("billingAddress")
    public BaseAddress getBillingAddress();

    /**
     *  <p>Shipping address associated with the Order.</p>
     * @return shippingAddress
     */
    @Valid
    @JsonProperty("shippingAddress")
    public BaseAddress getShippingAddress();

    /**
     *  <p>Addresses for Orders with multiple shipping addresses. Addresses must include a value for <code>key</code>.</p>
     * @return itemShippingAddresses
     */
    @Valid
    @JsonProperty("itemShippingAddresses")
    public List<BaseAddress> getItemShippingAddresses();

    /**
     *  <p>Shipping-related information of the Order.</p>
     * @return shippingInfo
     */
    @Valid
    @JsonProperty("shippingInfo")
    public ShippingInfoImportDraft getShippingInfo();

    /**
     *  <p>Payment information associated with the Order.</p>
     * @return paymentInfo
     */
    @Valid
    @JsonProperty("paymentInfo")
    public PaymentInfo getPaymentInfo();

    /**
     *  <p>Payment status of the Order.</p>
     * @return paymentState
     */

    @JsonProperty("paymentState")
    public PaymentState getPaymentState();

    /**
     *  <p>Shipment status of the Order.</p>
     * @return shipmentState
     */

    @JsonProperty("shipmentState")
    public ShipmentState getShipmentState();

    /**
     *  <p>Current status of the Order.</p>
     * @return orderState
     */

    @JsonProperty("orderState")
    public OrderState getOrderState();

    /**
     *  <p>State of the Order in a custom workflow.</p>
     * @return state
     */
    @Valid
    @JsonProperty("state")
    public StateReference getState();

    /**
     *  <p>Include a value to associate a country with the Order.</p>
     * @return country
     */

    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p>Indicates the origin of the Order.</p>
     * @return origin
     */

    @JsonProperty("origin")
    public CartOrigin getOrigin();

    /**
     *  <p>User-defined date and time for the Order. This value does not influence the <code>createdAt</code> or <code>lastModifiedAt</code> values of the Order created by the Order Import.</p>
     * @return completedAt
     */

    @JsonProperty("completedAt")
    public ZonedDateTime getCompletedAt();

    /**
     *  <p>Custom Fields for the Order.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>User-defined identifier of the Order. Must be unique across a Project. Once set, the value cannot be changed.</p>
     * @param orderNumber value to be set
     */

    public void setOrderNumber(final String orderNumber);

    /**
     *  <p>User-defined identifier for a purchase Order.</p>
     * @param purchaseOrderNumber value to be set
     */

    public void setPurchaseOrderNumber(final String purchaseOrderNumber);

    /**
     *  <p>The <code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> the Order belongs to.</p>
     * @param customerId value to be set
     */

    public void setCustomerId(final String customerId);

    /**
     *  <p>The Email address of the Customer the Order belongs to. Can be used instead of <code>customerId</code> when no check against existing <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customers</a> is required.</p>
     * @param customerEmail value to be set
     */

    public void setCustomerEmail(final String customerEmail);

    /**
     *  <p>The Customer Group of the Customer the Order belongs to.</p>
     * @param customerGroup value to be set
     */

    public void setCustomerGroup(final CustomerGroupResourceIdentifier customerGroup);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to the Business Unit the Order should belong to. When the <code>customerId</code> of the Order is also set, the <a href="https://docs.commercetools.com/apis/ctp:api:type:Customer" rel="nofollow">Customer</a> must be an <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> of the Business Unit. Only available for <span>B2B</span>-enabled Projects.</p>
     * @param businessUnit value to be set
     */

    public void setBusinessUnit(final BusinessUnitResourceIdentifier businessUnit);

    /**
     *  <p>The Store the Order belongs to. Used for <span>filtering</span>.</p>
     *  <p>If a <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItemImportDraft" rel="nofollow">LineItemImportDraft</a> or a <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItemImportDraft" rel="nofollow">CustomLineItemImportDraft</a> specifies a <code>distributionChannel</code> or a <code>supplyChannel</code> that is not defined for the referenced Store, the Order Import gets rejected. The same applies when the provided <code>country</code> is not defined for the referenced Store.</p>
     * @param store value to be set
     */

    public void setStore(final StoreResourceIdentifier store);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:LineItems" rel="nofollow">Line Items</a> to add to the Order.</p>
     *  <p>If not specified, <code>customLineItems</code> must not be empty.</p>
     * @param lineItems values to be set
     */

    @JsonIgnore
    public void setLineItems(final LineItemImportDraft... lineItems);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:LineItems" rel="nofollow">Line Items</a> to add to the Order.</p>
     *  <p>If not specified, <code>customLineItems</code> must not be empty.</p>
     * @param lineItems values to be set
     */

    public void setLineItems(final List<LineItemImportDraft> lineItems);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItems" rel="nofollow">Custom Line Items</a> to add to the Cart.</p>
     *  <p>If not specified, <code>lineItems</code> must not be empty.</p>
     * @param customLineItems values to be set
     */

    @JsonIgnore
    public void setCustomLineItems(final CustomLineItemImportDraft... customLineItems);

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItems" rel="nofollow">Custom Line Items</a> to add to the Cart.</p>
     *  <p>If not specified, <code>lineItems</code> must not be empty.</p>
     * @param customLineItems values to be set
     */

    public void setCustomLineItems(final List<CustomLineItemImportDraft> customLineItems);

    /**
     *  <p>The total Price of the Order. The amount can be negative.</p>
     * @param totalPrice value to be set
     */

    public void setTotalPrice(final Money totalPrice);

    /**
     *  <p>Include TaxedPrice information for the Order. If not included, and if you have Tax Rates set for Line Items and Custom Line Items, the Order total will not be recalculated.</p>
     * @param taxedPrice value to be set
     */

    public void setTaxedPrice(final TaxedPriceDraft taxedPrice);

    /**
     *  <p>Determines how the total prices on <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItems</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItems</a> are rounded when calculated.</p>
     * @param priceRoundingMode value to be set
     */

    public void setPriceRoundingMode(final RoundingMode priceRoundingMode);

    /**
     *  <p>Determines how monetary values are rounded when calculating taxes for <code>taxedPrice</code>.</p>
     * @param taxRoundingMode value to be set
     */

    public void setTaxRoundingMode(final RoundingMode taxRoundingMode);

    /**
     *  <p>Determines how taxes are calculated for <code>taxedPrice</code>.</p>
     * @param taxCalculationMode value to be set
     */

    public void setTaxCalculationMode(final TaxCalculationMode taxCalculationMode);

    /**
     *  <p>Determines how stock quantities are tracked for Line Items in the Cart.</p>
     * @param inventoryMode value to be set
     */

    public void setInventoryMode(final InventoryMode inventoryMode);

    /**
     *  <p>Billing address associated with the Order.</p>
     * @param billingAddress value to be set
     */

    public void setBillingAddress(final BaseAddress billingAddress);

    /**
     *  <p>Shipping address associated with the Order.</p>
     * @param shippingAddress value to be set
     */

    public void setShippingAddress(final BaseAddress shippingAddress);

    /**
     *  <p>Addresses for Orders with multiple shipping addresses. Addresses must include a value for <code>key</code>.</p>
     * @param itemShippingAddresses values to be set
     */

    @JsonIgnore
    public void setItemShippingAddresses(final BaseAddress... itemShippingAddresses);

    /**
     *  <p>Addresses for Orders with multiple shipping addresses. Addresses must include a value for <code>key</code>.</p>
     * @param itemShippingAddresses values to be set
     */

    public void setItemShippingAddresses(final List<BaseAddress> itemShippingAddresses);

    /**
     *  <p>Shipping-related information of the Order.</p>
     * @param shippingInfo value to be set
     */

    public void setShippingInfo(final ShippingInfoImportDraft shippingInfo);

    /**
     *  <p>Payment information associated with the Order.</p>
     * @param paymentInfo value to be set
     */

    public void setPaymentInfo(final PaymentInfo paymentInfo);

    /**
     *  <p>Payment status of the Order.</p>
     * @param paymentState value to be set
     */

    public void setPaymentState(final PaymentState paymentState);

    /**
     *  <p>Shipment status of the Order.</p>
     * @param shipmentState value to be set
     */

    public void setShipmentState(final ShipmentState shipmentState);

    /**
     *  <p>Current status of the Order.</p>
     * @param orderState value to be set
     */

    public void setOrderState(final OrderState orderState);

    /**
     *  <p>State of the Order in a custom workflow.</p>
     * @param state value to be set
     */

    public void setState(final StateReference state);

    /**
     *  <p>Include a value to associate a country with the Order.</p>
     * @param country value to be set
     */

    public void setCountry(final String country);

    /**
     *  <p>Indicates the origin of the Order.</p>
     * @param origin value to be set
     */

    public void setOrigin(final CartOrigin origin);

    /**
     *  <p>User-defined date and time for the Order. This value does not influence the <code>createdAt</code> or <code>lastModifiedAt</code> values of the Order created by the Order Import.</p>
     * @param completedAt value to be set
     */

    public void setCompletedAt(final ZonedDateTime completedAt);

    /**
     *  <p>Custom Fields for the Order.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     * factory method
     * @return instance of OrderImportDraft
     */
    public static OrderImportDraft of() {
        return new OrderImportDraftImpl();
    }

    /**
     * factory method to create a shallow copy OrderImportDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderImportDraft of(final OrderImportDraft template) {
        OrderImportDraftImpl instance = new OrderImportDraftImpl();
        instance.setOrderNumber(template.getOrderNumber());
        instance.setPurchaseOrderNumber(template.getPurchaseOrderNumber());
        instance.setCustomerId(template.getCustomerId());
        instance.setCustomerEmail(template.getCustomerEmail());
        instance.setCustomerGroup(template.getCustomerGroup());
        instance.setBusinessUnit(template.getBusinessUnit());
        instance.setStore(template.getStore());
        instance.setLineItems(template.getLineItems());
        instance.setCustomLineItems(template.getCustomLineItems());
        instance.setTotalPrice(template.getTotalPrice());
        instance.setTaxedPrice(template.getTaxedPrice());
        instance.setPriceRoundingMode(template.getPriceRoundingMode());
        instance.setTaxRoundingMode(template.getTaxRoundingMode());
        instance.setTaxCalculationMode(template.getTaxCalculationMode());
        instance.setInventoryMode(template.getInventoryMode());
        instance.setBillingAddress(template.getBillingAddress());
        instance.setShippingAddress(template.getShippingAddress());
        instance.setItemShippingAddresses(template.getItemShippingAddresses());
        instance.setShippingInfo(template.getShippingInfo());
        instance.setPaymentInfo(template.getPaymentInfo());
        instance.setPaymentState(template.getPaymentState());
        instance.setShipmentState(template.getShipmentState());
        instance.setOrderState(template.getOrderState());
        instance.setState(template.getState());
        instance.setCountry(template.getCountry());
        instance.setOrigin(template.getOrigin());
        instance.setCompletedAt(template.getCompletedAt());
        instance.setCustom(template.getCustom());
        return instance;
    }

    public OrderImportDraft copyDeep();

    /**
     * factory method to create a deep copy of OrderImportDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderImportDraft deepCopy(@Nullable final OrderImportDraft template) {
        if (template == null) {
            return null;
        }
        OrderImportDraftImpl instance = new OrderImportDraftImpl();
        instance.setOrderNumber(template.getOrderNumber());
        instance.setPurchaseOrderNumber(template.getPurchaseOrderNumber());
        instance.setCustomerId(template.getCustomerId());
        instance.setCustomerEmail(template.getCustomerEmail());
        instance.setCustomerGroup(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier
                .deepCopy(template.getCustomerGroup()));
        instance.setBusinessUnit(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier
                .deepCopy(template.getBusinessUnit()));
        instance.setStore(com.commercetools.api.models.store.StoreResourceIdentifier.deepCopy(template.getStore()));
        instance.setLineItems(Optional.ofNullable(template.getLineItems())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.LineItemImportDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setCustomLineItems(Optional.ofNullable(template.getCustomLineItems())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.CustomLineItemImportDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setTotalPrice(com.commercetools.api.models.common.Money.deepCopy(template.getTotalPrice()));
        instance.setTaxedPrice(com.commercetools.api.models.cart.TaxedPriceDraft.deepCopy(template.getTaxedPrice()));
        instance.setPriceRoundingMode(template.getPriceRoundingMode());
        instance.setTaxRoundingMode(template.getTaxRoundingMode());
        instance.setTaxCalculationMode(template.getTaxCalculationMode());
        instance.setInventoryMode(template.getInventoryMode());
        instance.setBillingAddress(
            com.commercetools.api.models.common.BaseAddress.deepCopy(template.getBillingAddress()));
        instance.setShippingAddress(
            com.commercetools.api.models.common.BaseAddress.deepCopy(template.getShippingAddress()));
        instance.setItemShippingAddresses(Optional.ofNullable(template.getItemShippingAddresses())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.BaseAddress::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setShippingInfo(
            com.commercetools.api.models.order.ShippingInfoImportDraft.deepCopy(template.getShippingInfo()));
        instance.setPaymentInfo(com.commercetools.api.models.order.PaymentInfo.deepCopy(template.getPaymentInfo()));
        instance.setPaymentState(template.getPaymentState());
        instance.setShipmentState(template.getShipmentState());
        instance.setOrderState(template.getOrderState());
        instance.setState(com.commercetools.api.models.state.StateReference.deepCopy(template.getState()));
        instance.setCountry(template.getCountry());
        instance.setOrigin(template.getOrigin());
        instance.setCompletedAt(template.getCompletedAt());
        instance.setCustom(com.commercetools.api.models.type.CustomFieldsDraft.deepCopy(template.getCustom()));
        return instance;
    }

    /**
     * builder factory method for OrderImportDraft
     * @return builder
     */
    public static OrderImportDraftBuilder builder() {
        return OrderImportDraftBuilder.of();
    }

    /**
     * create builder for OrderImportDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderImportDraftBuilder builder(final OrderImportDraft template) {
        return OrderImportDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderImportDraft(Function<OrderImportDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderImportDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderImportDraft>() {
            @Override
            public String toString() {
                return "TypeReference<OrderImportDraft>";
            }
        };
    }
}
