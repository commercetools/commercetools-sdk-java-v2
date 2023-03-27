
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

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
     * factory method to copy an instance of StagedOrder
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
