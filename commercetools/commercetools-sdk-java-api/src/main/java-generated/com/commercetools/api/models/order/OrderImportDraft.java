
package com.commercetools.api.models.order;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier;
import com.commercetools.api.models.cart.CartOrigin;
import com.commercetools.api.models.cart.CustomLineItemImportDraft;
import com.commercetools.api.models.cart.InventoryMode;
import com.commercetools.api.models.cart.RoundingMode;
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

/**
 * OrderImportDraft
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
     *  <p>String that unique identifies an order. It can be used to create more human-readable (in contrast to ID) identifier for the order. It should be unique within a project.</p>
     * @return orderNumber
     */

    @JsonProperty("orderNumber")
    public String getOrderNumber();

    /**
     *  <p>If given the customer with that ID must exist in the project.</p>
     * @return customerId
     */

    @JsonProperty("customerId")
    public String getCustomerId();

    /**
     *  <p>The customer email can be used when no check against existing Customers is desired during order import.</p>
     * @return customerEmail
     */

    @JsonProperty("customerEmail")
    public String getCustomerEmail();

    /**
     *  <p>If not given <code>customLineItems</code> must not be empty.</p>
     * @return lineItems
     */
    @Valid
    @JsonProperty("lineItems")
    public List<LineItemImportDraft> getLineItems();

    /**
     *  <p>If not given <code>lineItems</code> must not be empty.</p>
     * @return customLineItems
     */
    @Valid
    @JsonProperty("customLineItems")
    public List<CustomLineItemImportDraft> getCustomLineItems();

    /**
     *
     * @return totalPrice
     */
    @NotNull
    @Valid
    @JsonProperty("totalPrice")
    public Money getTotalPrice();

    /**
     *  <p>Order Import does not support calculation of taxes. When setting the draft the taxedPrice is to be provided.</p>
     * @return taxedPrice
     */
    @Valid
    @JsonProperty("taxedPrice")
    public TaxedPriceDraft getTaxedPrice();

    /**
     *
     * @return shippingAddress
     */
    @Valid
    @JsonProperty("shippingAddress")
    public BaseAddress getShippingAddress();

    /**
     *
     * @return billingAddress
     */
    @Valid
    @JsonProperty("billingAddress")
    public BaseAddress getBillingAddress();

    /**
     *  <p>Set when the customer is set and the customer is a member of a customer group. Used for product variant price selection.</p>
     * @return customerGroup
     */
    @Valid
    @JsonProperty("customerGroup")
    public CustomerGroupResourceIdentifier getCustomerGroup();

    /**
     *  <p>A two-digit country code as per ISO 3166-1 alpha-2. Used for product variant price selection.</p>
     * @return country
     */

    @JsonProperty("country")
    public String getCountry();

    /**
     *  <p>If not given the <code>Open</code> state will be assigned by default.</p>
     * @return orderState
     */

    @JsonProperty("orderState")
    public OrderState getOrderState();

    /**
     *  <p>This reference can point to a state in a custom workflow.</p>
     * @return state
     */
    @Valid
    @JsonProperty("state")
    public StateReference getState();

    /**
     *
     * @return shipmentState
     */

    @JsonProperty("shipmentState")
    public ShipmentState getShipmentState();

    /**
     *
     * @return paymentState
     */

    @JsonProperty("paymentState")
    public PaymentState getPaymentState();

    /**
     *  <p>Set if the ShippingMethod is set.</p>
     * @return shippingInfo
     */
    @Valid
    @JsonProperty("shippingInfo")
    public ShippingInfoImportDraft getShippingInfo();

    /**
     *
     * @return paymentInfo
     */
    @Valid
    @JsonProperty("paymentInfo")
    public PaymentInfo getPaymentInfo();

    /**
     *
     * @return completedAt
     */

    @JsonProperty("completedAt")
    public ZonedDateTime getCompletedAt();

    /**
     *  <p>The custom fields.</p>
     * @return custom
     */
    @Valid
    @JsonProperty("custom")
    public CustomFieldsDraft getCustom();

    /**
     *  <p>If not given the mode <code>None</code> will be assigned by default.</p>
     * @return inventoryMode
     */

    @JsonProperty("inventoryMode")
    public InventoryMode getInventoryMode();

    /**
     *  <p>If not given the tax rounding mode <code>HalfEven</code> will be assigned by default.</p>
     * @return taxRoundingMode
     */

    @JsonProperty("taxRoundingMode")
    public RoundingMode getTaxRoundingMode();

    /**
     *  <p>Contains addresses for orders with multiple shipping addresses.</p>
     * @return itemShippingAddresses
     */
    @Valid
    @JsonProperty("itemShippingAddresses")
    public List<BaseAddress> getItemShippingAddresses();

    /**
     *  <p>The Business Unit the Cart belongs to.</p>
     * @return businessUnit
     */
    @Valid
    @JsonProperty("businessUnit")
    public BusinessUnitResourceIdentifier getBusinessUnit();

    /**
     *
     * @return store
     */
    @Valid
    @JsonProperty("store")
    public StoreResourceIdentifier getStore();

    /**
     *  <p>The default origin is <code>Customer</code>.</p>
     * @return origin
     */

    @JsonProperty("origin")
    public CartOrigin getOrigin();

    /**
     *  <p>String that unique identifies an order. It can be used to create more human-readable (in contrast to ID) identifier for the order. It should be unique within a project.</p>
     * @param orderNumber value to be set
     */

    public void setOrderNumber(final String orderNumber);

    /**
     *  <p>If given the customer with that ID must exist in the project.</p>
     * @param customerId value to be set
     */

    public void setCustomerId(final String customerId);

    /**
     *  <p>The customer email can be used when no check against existing Customers is desired during order import.</p>
     * @param customerEmail value to be set
     */

    public void setCustomerEmail(final String customerEmail);

    /**
     *  <p>If not given <code>customLineItems</code> must not be empty.</p>
     * @param lineItems values to be set
     */

    @JsonIgnore
    public void setLineItems(final LineItemImportDraft... lineItems);

    /**
     *  <p>If not given <code>customLineItems</code> must not be empty.</p>
     * @param lineItems values to be set
     */

    public void setLineItems(final List<LineItemImportDraft> lineItems);

    /**
     *  <p>If not given <code>lineItems</code> must not be empty.</p>
     * @param customLineItems values to be set
     */

    @JsonIgnore
    public void setCustomLineItems(final CustomLineItemImportDraft... customLineItems);

    /**
     *  <p>If not given <code>lineItems</code> must not be empty.</p>
     * @param customLineItems values to be set
     */

    public void setCustomLineItems(final List<CustomLineItemImportDraft> customLineItems);

    /**
     * set totalPrice
     * @param totalPrice value to be set
     */

    public void setTotalPrice(final Money totalPrice);

    /**
     *  <p>Order Import does not support calculation of taxes. When setting the draft the taxedPrice is to be provided.</p>
     * @param taxedPrice value to be set
     */

    public void setTaxedPrice(final TaxedPriceDraft taxedPrice);

    /**
     * set shippingAddress
     * @param shippingAddress value to be set
     */

    public void setShippingAddress(final BaseAddress shippingAddress);

    /**
     * set billingAddress
     * @param billingAddress value to be set
     */

    public void setBillingAddress(final BaseAddress billingAddress);

    /**
     *  <p>Set when the customer is set and the customer is a member of a customer group. Used for product variant price selection.</p>
     * @param customerGroup value to be set
     */

    public void setCustomerGroup(final CustomerGroupResourceIdentifier customerGroup);

    /**
     *  <p>A two-digit country code as per ISO 3166-1 alpha-2. Used for product variant price selection.</p>
     * @param country value to be set
     */

    public void setCountry(final String country);

    /**
     *  <p>If not given the <code>Open</code> state will be assigned by default.</p>
     * @param orderState value to be set
     */

    public void setOrderState(final OrderState orderState);

    /**
     *  <p>This reference can point to a state in a custom workflow.</p>
     * @param state value to be set
     */

    public void setState(final StateReference state);

    /**
     * set shipmentState
     * @param shipmentState value to be set
     */

    public void setShipmentState(final ShipmentState shipmentState);

    /**
     * set paymentState
     * @param paymentState value to be set
     */

    public void setPaymentState(final PaymentState paymentState);

    /**
     *  <p>Set if the ShippingMethod is set.</p>
     * @param shippingInfo value to be set
     */

    public void setShippingInfo(final ShippingInfoImportDraft shippingInfo);

    /**
     * set paymentInfo
     * @param paymentInfo value to be set
     */

    public void setPaymentInfo(final PaymentInfo paymentInfo);

    /**
     * set completedAt
     * @param completedAt value to be set
     */

    public void setCompletedAt(final ZonedDateTime completedAt);

    /**
     *  <p>The custom fields.</p>
     * @param custom value to be set
     */

    public void setCustom(final CustomFieldsDraft custom);

    /**
     *  <p>If not given the mode <code>None</code> will be assigned by default.</p>
     * @param inventoryMode value to be set
     */

    public void setInventoryMode(final InventoryMode inventoryMode);

    /**
     *  <p>If not given the tax rounding mode <code>HalfEven</code> will be assigned by default.</p>
     * @param taxRoundingMode value to be set
     */

    public void setTaxRoundingMode(final RoundingMode taxRoundingMode);

    /**
     *  <p>Contains addresses for orders with multiple shipping addresses.</p>
     * @param itemShippingAddresses values to be set
     */

    @JsonIgnore
    public void setItemShippingAddresses(final BaseAddress... itemShippingAddresses);

    /**
     *  <p>Contains addresses for orders with multiple shipping addresses.</p>
     * @param itemShippingAddresses values to be set
     */

    public void setItemShippingAddresses(final List<BaseAddress> itemShippingAddresses);

    /**
     *  <p>The Business Unit the Cart belongs to.</p>
     * @param businessUnit value to be set
     */

    public void setBusinessUnit(final BusinessUnitResourceIdentifier businessUnit);

    /**
     * set store
     * @param store value to be set
     */

    public void setStore(final StoreResourceIdentifier store);

    /**
     *  <p>The default origin is <code>Customer</code>.</p>
     * @param origin value to be set
     */

    public void setOrigin(final CartOrigin origin);

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
        instance.setCustomerId(template.getCustomerId());
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
        instance.setState(template.getState());
        instance.setShipmentState(template.getShipmentState());
        instance.setPaymentState(template.getPaymentState());
        instance.setShippingInfo(template.getShippingInfo());
        instance.setPaymentInfo(template.getPaymentInfo());
        instance.setCompletedAt(template.getCompletedAt());
        instance.setCustom(template.getCustom());
        instance.setInventoryMode(template.getInventoryMode());
        instance.setTaxRoundingMode(template.getTaxRoundingMode());
        instance.setItemShippingAddresses(template.getItemShippingAddresses());
        instance.setBusinessUnit(template.getBusinessUnit());
        instance.setStore(template.getStore());
        instance.setOrigin(template.getOrigin());
        return instance;
    }

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
        instance.setCustomerId(template.getCustomerId());
        instance.setCustomerEmail(template.getCustomerEmail());
        instance.setLineItems(Optional.ofNullable(template.getLineItems())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.LineItemImportDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setCustomLineItems(Optional.ofNullable(template.getCustomLineItems())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.cart.CustomLineItemImportDraft::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setTotalPrice(Optional.ofNullable(template.getTotalPrice())
                .map(com.commercetools.api.models.common.Money::deepCopy)
                .orElse(null));
        instance.setTaxedPrice(Optional.ofNullable(template.getTaxedPrice())
                .map(com.commercetools.api.models.cart.TaxedPriceDraft::deepCopy)
                .orElse(null));
        instance.setShippingAddress(Optional.ofNullable(template.getShippingAddress())
                .map(com.commercetools.api.models.common.BaseAddress::deepCopy)
                .orElse(null));
        instance.setBillingAddress(Optional.ofNullable(template.getBillingAddress())
                .map(com.commercetools.api.models.common.BaseAddress::deepCopy)
                .orElse(null));
        instance.setCustomerGroup(Optional.ofNullable(template.getCustomerGroup())
                .map(com.commercetools.api.models.customer_group.CustomerGroupResourceIdentifier::deepCopy)
                .orElse(null));
        instance.setCountry(template.getCountry());
        instance.setOrderState(template.getOrderState());
        instance.setState(Optional.ofNullable(template.getState())
                .map(com.commercetools.api.models.state.StateReference::deepCopy)
                .orElse(null));
        instance.setShipmentState(template.getShipmentState());
        instance.setPaymentState(template.getPaymentState());
        instance.setShippingInfo(Optional.ofNullable(template.getShippingInfo())
                .map(com.commercetools.api.models.order.ShippingInfoImportDraft::deepCopy)
                .orElse(null));
        instance.setPaymentInfo(Optional.ofNullable(template.getPaymentInfo())
                .map(com.commercetools.api.models.order.PaymentInfo::deepCopy)
                .orElse(null));
        instance.setCompletedAt(template.getCompletedAt());
        instance.setCustom(Optional.ofNullable(template.getCustom())
                .map(com.commercetools.api.models.type.CustomFieldsDraft::deepCopy)
                .orElse(null));
        instance.setInventoryMode(template.getInventoryMode());
        instance.setTaxRoundingMode(template.getTaxRoundingMode());
        instance.setItemShippingAddresses(Optional.ofNullable(template.getItemShippingAddresses())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.BaseAddress::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setBusinessUnit(Optional.ofNullable(template.getBusinessUnit())
                .map(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier::deepCopy)
                .orElse(null));
        instance.setStore(Optional.ofNullable(template.getStore())
                .map(com.commercetools.api.models.store.StoreResourceIdentifier::deepCopy)
                .orElse(null));
        instance.setOrigin(template.getOrigin());
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
