
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import javax.annotation.Nullable;

import com.commercetools.api.models.order.Order;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrder
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrder stagedOrder = StagedOrder.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .plusLineItems(lineItemsBuilder -> lineItemsBuilder)
 *             .plusCustomLineItems(customLineItemsBuilder -> customLineItemsBuilder)
 *             .totalPrice(totalPriceBuilder -> totalPriceBuilder)
 *             .shippingMode(ShippingMode.SINGLE)
 *             .plusShipping(shippingBuilder -> shippingBuilder)
 *             .orderState(OrderState.OPEN)
 *             .plusSyncInfo(syncInfoBuilder -> syncInfoBuilder)
 *             .origin(CartOrigin.CUSTOMER)
 *             .plusRefusedGifts(refusedGiftsBuilder -> refusedGiftsBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderImpl.class)
public interface StagedOrder extends Order {

    /**
     * factory method
     * @return instance of StagedOrder
     */
    public static StagedOrder of() {
        return new StagedOrderImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrder
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrder of(final StagedOrder template) {
        StagedOrderImpl instance = new StagedOrderImpl();
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
        instance.setBusinessUnit(template.getBusinessUnit());
        instance.setStore(template.getStore());
        instance.setLineItems(template.getLineItems());
        instance.setCustomLineItems(template.getCustomLineItems());
        instance.setTotalPrice(template.getTotalPrice());
        instance.setTaxedPrice(template.getTaxedPrice());
        instance.setTaxedShippingPrice(template.getTaxedShippingPrice());
        instance.setShippingAddress(template.getShippingAddress());
        instance.setBillingAddress(template.getBillingAddress());
        instance.setShippingMode(template.getShippingMode());
        instance.setShipping(template.getShipping());
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
        instance.setPurchaseOrderNumber(template.getPurchaseOrderNumber());
        instance.setDiscountCodes(template.getDiscountCodes());
        instance.setLastMessageSequenceNumber(template.getLastMessageSequenceNumber());
        instance.setCart(template.getCart());
        instance.setQuote(template.getQuote());
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

    /**
     * factory method to create a deep copy of StagedOrder
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrder deepCopy(@Nullable final StagedOrder template) {
        if (template == null) {
            return null;
        }
        StagedOrderImpl instance = new StagedOrderImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(Optional.ofNullable(template.getLastModifiedBy())
                .map(com.commercetools.api.models.common.LastModifiedBy::deepCopy)
                .orElse(null));
        instance.setCreatedBy(Optional.ofNullable(template.getCreatedBy())
                .map(com.commercetools.api.models.common.CreatedBy::deepCopy)
                .orElse(null));
        instance.setCompletedAt(template.getCompletedAt());
        instance.setOrderNumber(template.getOrderNumber());
        instance.setCustomerId(template.getCustomerId());
        instance.setCustomerEmail(template.getCustomerEmail());
        instance.setAnonymousId(template.getAnonymousId());
        instance.setBusinessUnit(Optional.ofNullable(template.getBusinessUnit())
                .map(com.commercetools.api.models.business_unit.BusinessUnitKeyReference::deepCopy)
                .orElse(null));
        instance.setStore(Optional.ofNullable(template.getStore())
                .map(com.commercetools.api.models.store.StoreKeyReference::deepCopy)
                .orElse(null));
        instance.setLineItems(Optional.ofNullable(template.getLineItems())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.cart.LineItem::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setCustomLineItems(Optional.ofNullable(template.getCustomLineItems())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.cart.CustomLineItem::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setTotalPrice(Optional.ofNullable(template.getTotalPrice())
                .map(com.commercetools.api.models.common.TypedMoney::deepCopy)
                .orElse(null));
        instance.setTaxedPrice(Optional.ofNullable(template.getTaxedPrice())
                .map(com.commercetools.api.models.cart.TaxedPrice::deepCopy)
                .orElse(null));
        instance.setTaxedShippingPrice(Optional.ofNullable(template.getTaxedShippingPrice())
                .map(com.commercetools.api.models.cart.TaxedPrice::deepCopy)
                .orElse(null));
        instance.setShippingAddress(Optional.ofNullable(template.getShippingAddress())
                .map(com.commercetools.api.models.common.Address::deepCopy)
                .orElse(null));
        instance.setBillingAddress(Optional.ofNullable(template.getBillingAddress())
                .map(com.commercetools.api.models.common.Address::deepCopy)
                .orElse(null));
        instance.setShippingMode(template.getShippingMode());
        instance.setShipping(Optional.ofNullable(template.getShipping())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.cart.Shipping::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setTaxMode(template.getTaxMode());
        instance.setTaxRoundingMode(template.getTaxRoundingMode());
        instance.setCustomerGroup(Optional.ofNullable(template.getCustomerGroup())
                .map(com.commercetools.api.models.customer_group.CustomerGroupReference::deepCopy)
                .orElse(null));
        instance.setCountry(template.getCountry());
        instance.setOrderState(template.getOrderState());
        instance.setState(Optional.ofNullable(template.getState())
                .map(com.commercetools.api.models.state.StateReference::deepCopy)
                .orElse(null));
        instance.setShipmentState(template.getShipmentState());
        instance.setPaymentState(template.getPaymentState());
        instance.setShippingInfo(Optional.ofNullable(template.getShippingInfo())
                .map(com.commercetools.api.models.cart.ShippingInfo::deepCopy)
                .orElse(null));
        instance.setSyncInfo(Optional.ofNullable(template.getSyncInfo())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.SyncInfo::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setReturnInfo(Optional.ofNullable(template.getReturnInfo())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.order.ReturnInfo::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setPurchaseOrderNumber(template.getPurchaseOrderNumber());
        instance.setDiscountCodes(Optional.ofNullable(template.getDiscountCodes())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.cart.DiscountCodeInfo::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setLastMessageSequenceNumber(template.getLastMessageSequenceNumber());
        instance.setCart(Optional.ofNullable(template.getCart())
                .map(com.commercetools.api.models.cart.CartReference::deepCopy)
                .orElse(null));
        instance.setQuote(Optional.ofNullable(template.getQuote())
                .map(com.commercetools.api.models.quote.QuoteReference::deepCopy)
                .orElse(null));
        instance.setCustom(Optional.ofNullable(template.getCustom())
                .map(com.commercetools.api.models.type.CustomFields::deepCopy)
                .orElse(null));
        instance.setPaymentInfo(Optional.ofNullable(template.getPaymentInfo())
                .map(com.commercetools.api.models.order.PaymentInfo::deepCopy)
                .orElse(null));
        instance.setLocale(template.getLocale());
        instance.setInventoryMode(template.getInventoryMode());
        instance.setOrigin(template.getOrigin());
        instance.setTaxCalculationMode(template.getTaxCalculationMode());
        instance.setShippingRateInput(Optional.ofNullable(template.getShippingRateInput())
                .map(com.commercetools.api.models.cart.ShippingRateInput::deepCopy)
                .orElse(null));
        instance.setItemShippingAddresses(Optional.ofNullable(template.getItemShippingAddresses())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.common.Address::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        instance.setRefusedGifts(Optional.ofNullable(template.getRefusedGifts())
                .map(t -> t.stream()
                        .map(com.commercetools.api.models.cart_discount.CartDiscountReference::deepCopy)
                        .collect(Collectors.toList()))
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for StagedOrder
     * @return builder
     */
    public static StagedOrderBuilder builder() {
        return StagedOrderBuilder.of();
    }

    /**
     * create builder for StagedOrder instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderBuilder builder(final StagedOrder template) {
        return StagedOrderBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrder(Function<StagedOrder, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrder> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrder>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrder>";
            }
        };
    }
}
