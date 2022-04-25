
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CategoryCreatedMessagePayloadImpl.class, name = CategoryCreatedMessagePayload.CATEGORY_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CategorySlugChangedMessagePayloadImpl.class, name = CategorySlugChangedMessagePayload.CATEGORY_SLUG_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomLineItemStateTransitionMessagePayloadImpl.class, name = CustomLineItemStateTransitionMessagePayload.CUSTOM_LINE_ITEM_STATE_TRANSITION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerAddressAddedMessagePayloadImpl.class, name = CustomerAddressAddedMessagePayload.CUSTOMER_ADDRESS_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerAddressChangedMessagePayloadImpl.class, name = CustomerAddressChangedMessagePayload.CUSTOMER_ADDRESS_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerAddressRemovedMessagePayloadImpl.class, name = CustomerAddressRemovedMessagePayload.CUSTOMER_ADDRESS_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerCompanyNameSetMessagePayloadImpl.class, name = CustomerCompanyNameSetMessagePayload.CUSTOMER_COMPANY_NAME_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerCreatedMessagePayloadImpl.class, name = CustomerCreatedMessagePayload.CUSTOMER_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerDateOfBirthSetMessagePayloadImpl.class, name = CustomerDateOfBirthSetMessagePayload.CUSTOMER_DATE_OF_BIRTH_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerDeletedMessagePayloadImpl.class, name = CustomerDeletedMessagePayload.CUSTOMER_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerEmailChangedMessagePayloadImpl.class, name = CustomerEmailChangedMessagePayload.CUSTOMER_EMAIL_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerEmailVerifiedMessagePayloadImpl.class, name = CustomerEmailVerifiedMessagePayload.CUSTOMER_EMAIL_VERIFIED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerFirstNameSetMessagePayloadImpl.class, name = CustomerFirstNameSetMessagePayload.CUSTOMER_FIRST_NAME_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerGroupSetMessagePayloadImpl.class, name = CustomerGroupSetMessagePayload.CUSTOMER_GROUP_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerLastNameSetMessagePayloadImpl.class, name = CustomerLastNameSetMessagePayload.CUSTOMER_LAST_NAME_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerPasswordUpdatedMessagePayloadImpl.class, name = CustomerPasswordUpdatedMessagePayload.CUSTOMER_PASSWORD_UPDATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerTitleSetMessagePayloadImpl.class, name = CustomerTitleSetMessagePayload.CUSTOMER_TITLE_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.DeliveryAddedMessagePayloadImpl.class, name = DeliveryAddedMessagePayload.DELIVERY_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.DeliveryAddressSetMessagePayloadImpl.class, name = DeliveryAddressSetMessagePayload.DELIVERY_ADDRESS_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.DeliveryItemsUpdatedMessagePayloadImpl.class, name = DeliveryItemsUpdatedMessagePayload.DELIVERY_ITEMS_UPDATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.DeliveryRemovedMessagePayloadImpl.class, name = DeliveryRemovedMessagePayload.DELIVERY_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.InventoryEntryCreatedMessagePayloadImpl.class, name = InventoryEntryCreatedMessagePayload.INVENTORY_ENTRY_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.InventoryEntryDeletedMessagePayloadImpl.class, name = InventoryEntryDeletedMessagePayload.INVENTORY_ENTRY_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.InventoryEntryQuantitySetMessagePayloadImpl.class, name = InventoryEntryQuantitySetMessagePayload.INVENTORY_ENTRY_QUANTITY_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.LineItemStateTransitionMessagePayloadImpl.class, name = LineItemStateTransitionMessagePayload.LINE_ITEM_STATE_TRANSITION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderBillingAddressSetMessagePayloadImpl.class, name = OrderBillingAddressSetMessagePayload.ORDER_BILLING_ADDRESS_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCreatedMessagePayloadImpl.class, name = OrderCreatedMessagePayload.ORDER_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomLineItemDiscountSetMessagePayloadImpl.class, name = OrderCustomLineItemDiscountSetMessagePayload.ORDER_CUSTOM_LINE_ITEM_DISCOUNT_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomerEmailSetMessagePayloadImpl.class, name = OrderCustomerEmailSetMessagePayload.ORDER_CUSTOMER_EMAIL_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomerGroupSetMessagePayloadImpl.class, name = OrderCustomerGroupSetMessagePayload.ORDER_CUSTOMER_GROUP_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomerSetMessagePayloadImpl.class, name = OrderCustomerSetMessagePayload.ORDER_CUSTOMER_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderDeletedMessagePayloadImpl.class, name = OrderDeletedMessagePayload.ORDER_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderDiscountCodeAddedMessagePayloadImpl.class, name = OrderDiscountCodeAddedMessagePayload.ORDER_DISCOUNT_CODE_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderDiscountCodeRemovedMessagePayloadImpl.class, name = OrderDiscountCodeRemovedMessagePayload.ORDER_DISCOUNT_CODE_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderDiscountCodeStateSetMessagePayloadImpl.class, name = OrderDiscountCodeStateSetMessagePayload.ORDER_DISCOUNT_CODE_STATE_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderEditAppliedMessagePayloadImpl.class, name = OrderEditAppliedMessagePayload.ORDER_EDIT_APPLIED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderImportedMessagePayloadImpl.class, name = OrderImportedMessagePayload.ORDER_IMPORTED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderLineItemAddedMessagePayloadImpl.class, name = OrderLineItemAddedMessagePayload.ORDER_LINE_ITEM_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderLineItemDiscountSetMessagePayloadImpl.class, name = OrderLineItemDiscountSetMessagePayload.ORDER_LINE_ITEM_DISCOUNT_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderLineItemDistributionChannelSetMessagePayloadImpl.class, name = OrderLineItemDistributionChannelSetMessagePayload.ORDER_LINE_ITEM_DISTRIBUTION_CHANNEL_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderLineItemRemovedMessagePayloadImpl.class, name = OrderLineItemRemovedMessagePayload.ORDER_LINE_ITEM_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderPaymentAddedMessagePayloadImpl.class, name = OrderPaymentAddedMessagePayload.ORDER_PAYMENT_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderPaymentStateChangedMessagePayloadImpl.class, name = OrderPaymentStateChangedMessagePayload.ORDER_PAYMENT_STATE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderReturnInfoAddedMessagePayloadImpl.class, name = OrderReturnInfoAddedMessagePayload.RETURN_INFO_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderReturnInfoSetMessagePayloadImpl.class, name = OrderReturnInfoSetMessagePayload.RETURN_INFO_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderReturnShipmentStateChangedMessagePayloadImpl.class, name = OrderReturnShipmentStateChangedMessagePayload.ORDER_RETURN_SHIPMENT_STATE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderShipmentStateChangedMessagePayloadImpl.class, name = OrderShipmentStateChangedMessagePayload.ORDER_SHIPMENT_STATE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderShippingAddressSetMessagePayloadImpl.class, name = OrderShippingAddressSetMessagePayload.ORDER_SHIPPING_ADDRESS_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderShippingInfoSetMessagePayloadImpl.class, name = OrderShippingInfoSetMessagePayload.ORDER_SHIPPING_INFO_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderShippingRateInputSetMessagePayloadImpl.class, name = OrderShippingRateInputSetMessagePayload.ORDER_SHIPPING_RATE_INPUT_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderStateChangedMessagePayloadImpl.class, name = OrderStateChangedMessagePayload.ORDER_STATE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderStateTransitionMessagePayloadImpl.class, name = OrderStateTransitionMessagePayload.ORDER_STATE_TRANSITION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderStoreSetMessagePayloadImpl.class, name = OrderStoreSetMessagePayload.ORDER_STORE_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ParcelAddedToDeliveryMessagePayloadImpl.class, name = ParcelAddedToDeliveryMessagePayload.PARCEL_ADDED_TO_DELIVERY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ParcelItemsUpdatedMessagePayloadImpl.class, name = ParcelItemsUpdatedMessagePayload.PARCEL_ITEMS_UPDATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ParcelMeasurementsUpdatedMessagePayloadImpl.class, name = ParcelMeasurementsUpdatedMessagePayload.PARCEL_MEASUREMENTS_UPDATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ParcelRemovedFromDeliveryMessagePayloadImpl.class, name = ParcelRemovedFromDeliveryMessagePayload.PARCEL_REMOVED_FROM_DELIVERY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ParcelTrackingDataUpdatedMessagePayloadImpl.class, name = ParcelTrackingDataUpdatedMessagePayload.PARCEL_TRACKING_DATA_UPDATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.PaymentCreatedMessagePayloadImpl.class, name = PaymentCreatedMessagePayload.PAYMENT_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.PaymentInteractionAddedMessagePayloadImpl.class, name = PaymentInteractionAddedMessagePayload.PAYMENT_INTERACTION_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.PaymentStatusInterfaceCodeSetMessagePayloadImpl.class, name = PaymentStatusInterfaceCodeSetMessagePayload.PAYMENT_STATUS_INTERFACE_CODE_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.PaymentStatusStateTransitionMessagePayloadImpl.class, name = PaymentStatusStateTransitionMessagePayload.PAYMENT_STATUS_STATE_TRANSITION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.PaymentTransactionAddedMessagePayloadImpl.class, name = PaymentTransactionAddedMessagePayload.PAYMENT_TRANSACTION_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.PaymentTransactionStateChangedMessagePayloadImpl.class, name = PaymentTransactionStateChangedMessagePayload.PAYMENT_TRANSACTION_STATE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductAddedToCategoryMessagePayloadImpl.class, name = ProductAddedToCategoryMessagePayload.PRODUCT_ADDED_TO_CATEGORY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductCreatedMessagePayloadImpl.class, name = ProductCreatedMessagePayload.PRODUCT_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductDeletedMessagePayloadImpl.class, name = ProductDeletedMessagePayload.PRODUCT_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductImageAddedMessagePayloadImpl.class, name = ProductImageAddedMessagePayload.PRODUCT_IMAGE_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductPriceDiscountsSetMessagePayloadImpl.class, name = ProductPriceDiscountsSetMessagePayload.PRODUCT_PRICE_DISCOUNTS_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductPriceExternalDiscountSetMessagePayloadImpl.class, name = ProductPriceExternalDiscountSetMessagePayload.PRODUCT_PRICE_EXTERNAL_DISCOUNT_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductPublishedMessagePayloadImpl.class, name = ProductPublishedMessagePayload.PRODUCT_PUBLISHED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductRemovedFromCategoryMessagePayloadImpl.class, name = ProductRemovedFromCategoryMessagePayload.PRODUCT_REMOVED_FROM_CATEGORY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductRevertedStagedChangesMessagePayloadImpl.class, name = ProductRevertedStagedChangesMessagePayload.PRODUCT_REVERTED_STAGED_CHANGES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductSelectionCreatedMessagePayloadImpl.class, name = ProductSelectionCreatedMessagePayload.PRODUCT_SELECTION_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductSelectionDeletedMessagePayloadImpl.class, name = ProductSelectionDeletedMessagePayload.PRODUCT_SELECTION_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductSelectionProductAddedMessagePayloadImpl.class, name = ProductSelectionProductAddedMessagePayload.PRODUCT_SELECTION_PRODUCT_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductSelectionProductRemovedMessagePayloadImpl.class, name = ProductSelectionProductRemovedMessagePayload.PRODUCT_SELECTION_PRODUCT_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductSlugChangedMessagePayloadImpl.class, name = ProductSlugChangedMessagePayload.PRODUCT_SLUG_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductStateTransitionMessagePayloadImpl.class, name = ProductStateTransitionMessagePayload.PRODUCT_STATE_TRANSITION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductUnpublishedMessagePayloadImpl.class, name = ProductUnpublishedMessagePayload.PRODUCT_UNPUBLISHED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductVariantAddedMessagePayloadImpl.class, name = ProductVariantAddedMessagePayload.PRODUCT_VARIANT_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductVariantDeletedMessagePayloadImpl.class, name = ProductVariantDeletedMessagePayload.PRODUCT_VARIANT_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ReviewCreatedMessagePayloadImpl.class, name = ReviewCreatedMessagePayload.REVIEW_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ReviewRatingSetMessagePayloadImpl.class, name = ReviewRatingSetMessagePayload.REVIEW_RATING_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ReviewStateTransitionMessagePayloadImpl.class, name = ReviewStateTransitionMessagePayload.REVIEW_STATE_TRANSITION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ShoppingListStoreSetMessagePayloadImpl.class, name = ShoppingListStoreSetMessagePayload.SHOPPING_LIST_STORE_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StoreCreatedMessagePayloadImpl.class, name = StoreCreatedMessagePayload.STORE_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StoreDeletedMessagePayloadImpl.class, name = StoreDeletedMessagePayload.STORE_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StoreProductSelectionsChangedMessagePayloadImpl.class, name = StoreProductSelectionsChangedMessagePayload.STORE_PRODUCT_SELECTIONS_CHANGED) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = MessagePayloadImpl.class, visible = true)
@JsonDeserialize(as = MessagePayloadImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface MessagePayload {

    @NotNull
    @JsonProperty("type")
    public String getType();

    public static com.commercetools.api.models.message.CategoryCreatedMessagePayloadBuilder categoryCreatedBuilder() {
        return com.commercetools.api.models.message.CategoryCreatedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.CategorySlugChangedMessagePayloadBuilder categorySlugChangedBuilder() {
        return com.commercetools.api.models.message.CategorySlugChangedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.CustomLineItemStateTransitionMessagePayloadBuilder customLineItemStateTransitionBuilder() {
        return com.commercetools.api.models.message.CustomLineItemStateTransitionMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.CustomerAddressAddedMessagePayloadBuilder customerAddressAddedBuilder() {
        return com.commercetools.api.models.message.CustomerAddressAddedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.CustomerAddressChangedMessagePayloadBuilder customerAddressChangedBuilder() {
        return com.commercetools.api.models.message.CustomerAddressChangedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.CustomerAddressRemovedMessagePayloadBuilder customerAddressRemovedBuilder() {
        return com.commercetools.api.models.message.CustomerAddressRemovedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.CustomerCompanyNameSetMessagePayloadBuilder customerCompanyNameSetBuilder() {
        return com.commercetools.api.models.message.CustomerCompanyNameSetMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.CustomerCreatedMessagePayloadBuilder customerCreatedBuilder() {
        return com.commercetools.api.models.message.CustomerCreatedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.CustomerDateOfBirthSetMessagePayloadBuilder customerDateOfBirthSetBuilder() {
        return com.commercetools.api.models.message.CustomerDateOfBirthSetMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.CustomerDeletedMessagePayloadBuilder customerDeletedBuilder() {
        return com.commercetools.api.models.message.CustomerDeletedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.CustomerEmailChangedMessagePayloadBuilder customerEmailChangedBuilder() {
        return com.commercetools.api.models.message.CustomerEmailChangedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.CustomerEmailVerifiedMessagePayloadBuilder customerEmailVerifiedBuilder() {
        return com.commercetools.api.models.message.CustomerEmailVerifiedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.CustomerFirstNameSetMessagePayloadBuilder customerFirstNameSetBuilder() {
        return com.commercetools.api.models.message.CustomerFirstNameSetMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.CustomerGroupSetMessagePayloadBuilder customerGroupSetBuilder() {
        return com.commercetools.api.models.message.CustomerGroupSetMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.CustomerLastNameSetMessagePayloadBuilder customerLastNameSetBuilder() {
        return com.commercetools.api.models.message.CustomerLastNameSetMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.CustomerPasswordUpdatedMessagePayloadBuilder customerPasswordUpdatedBuilder() {
        return com.commercetools.api.models.message.CustomerPasswordUpdatedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.CustomerTitleSetMessagePayloadBuilder customerTitleSetBuilder() {
        return com.commercetools.api.models.message.CustomerTitleSetMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.DeliveryAddedMessagePayloadBuilder deliveryAddedBuilder() {
        return com.commercetools.api.models.message.DeliveryAddedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.DeliveryAddressSetMessagePayloadBuilder deliveryAddressSetBuilder() {
        return com.commercetools.api.models.message.DeliveryAddressSetMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.DeliveryItemsUpdatedMessagePayloadBuilder deliveryItemsUpdatedBuilder() {
        return com.commercetools.api.models.message.DeliveryItemsUpdatedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.DeliveryRemovedMessagePayloadBuilder deliveryRemovedBuilder() {
        return com.commercetools.api.models.message.DeliveryRemovedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.InventoryEntryCreatedMessagePayloadBuilder inventoryEntryCreatedBuilder() {
        return com.commercetools.api.models.message.InventoryEntryCreatedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.InventoryEntryDeletedMessagePayloadBuilder inventoryEntryDeletedBuilder() {
        return com.commercetools.api.models.message.InventoryEntryDeletedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.InventoryEntryQuantitySetMessagePayloadBuilder inventoryEntryQuantitySetBuilder() {
        return com.commercetools.api.models.message.InventoryEntryQuantitySetMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.LineItemStateTransitionMessagePayloadBuilder lineItemStateTransitionBuilder() {
        return com.commercetools.api.models.message.LineItemStateTransitionMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderBillingAddressSetMessagePayloadBuilder orderBillingAddressSetBuilder() {
        return com.commercetools.api.models.message.OrderBillingAddressSetMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderCreatedMessagePayloadBuilder orderCreatedBuilder() {
        return com.commercetools.api.models.message.OrderCreatedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderCustomLineItemDiscountSetMessagePayloadBuilder orderCustomLineItemDiscountSetBuilder() {
        return com.commercetools.api.models.message.OrderCustomLineItemDiscountSetMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderCustomerEmailSetMessagePayloadBuilder orderCustomerEmailSetBuilder() {
        return com.commercetools.api.models.message.OrderCustomerEmailSetMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderCustomerGroupSetMessagePayloadBuilder orderCustomerGroupSetBuilder() {
        return com.commercetools.api.models.message.OrderCustomerGroupSetMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderCustomerSetMessagePayloadBuilder orderCustomerSetBuilder() {
        return com.commercetools.api.models.message.OrderCustomerSetMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderDeletedMessagePayloadBuilder orderDeletedBuilder() {
        return com.commercetools.api.models.message.OrderDeletedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderDiscountCodeAddedMessagePayloadBuilder orderDiscountCodeAddedBuilder() {
        return com.commercetools.api.models.message.OrderDiscountCodeAddedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderDiscountCodeRemovedMessagePayloadBuilder orderDiscountCodeRemovedBuilder() {
        return com.commercetools.api.models.message.OrderDiscountCodeRemovedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderDiscountCodeStateSetMessagePayloadBuilder orderDiscountCodeStateSetBuilder() {
        return com.commercetools.api.models.message.OrderDiscountCodeStateSetMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderEditAppliedMessagePayloadBuilder orderEditAppliedBuilder() {
        return com.commercetools.api.models.message.OrderEditAppliedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderImportedMessagePayloadBuilder orderImportedBuilder() {
        return com.commercetools.api.models.message.OrderImportedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderLineItemAddedMessagePayloadBuilder orderLineItemAddedBuilder() {
        return com.commercetools.api.models.message.OrderLineItemAddedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderLineItemDiscountSetMessagePayloadBuilder orderLineItemDiscountSetBuilder() {
        return com.commercetools.api.models.message.OrderLineItemDiscountSetMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderLineItemDistributionChannelSetMessagePayloadBuilder orderLineItemDistributionChannelSetBuilder() {
        return com.commercetools.api.models.message.OrderLineItemDistributionChannelSetMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderLineItemRemovedMessagePayloadBuilder orderLineItemRemovedBuilder() {
        return com.commercetools.api.models.message.OrderLineItemRemovedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderPaymentAddedMessagePayloadBuilder orderPaymentAddedBuilder() {
        return com.commercetools.api.models.message.OrderPaymentAddedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderPaymentStateChangedMessagePayloadBuilder orderPaymentStateChangedBuilder() {
        return com.commercetools.api.models.message.OrderPaymentStateChangedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderReturnInfoAddedMessagePayloadBuilder returnInfoAddedBuilder() {
        return com.commercetools.api.models.message.OrderReturnInfoAddedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderReturnInfoSetMessagePayloadBuilder returnInfoSetBuilder() {
        return com.commercetools.api.models.message.OrderReturnInfoSetMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderReturnShipmentStateChangedMessagePayloadBuilder orderReturnShipmentStateChangedBuilder() {
        return com.commercetools.api.models.message.OrderReturnShipmentStateChangedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderShipmentStateChangedMessagePayloadBuilder orderShipmentStateChangedBuilder() {
        return com.commercetools.api.models.message.OrderShipmentStateChangedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderShippingAddressSetMessagePayloadBuilder orderShippingAddressSetBuilder() {
        return com.commercetools.api.models.message.OrderShippingAddressSetMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderShippingInfoSetMessagePayloadBuilder orderShippingInfoSetBuilder() {
        return com.commercetools.api.models.message.OrderShippingInfoSetMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderShippingRateInputSetMessagePayloadBuilder orderShippingRateInputSetBuilder() {
        return com.commercetools.api.models.message.OrderShippingRateInputSetMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderStateChangedMessagePayloadBuilder orderStateChangedBuilder() {
        return com.commercetools.api.models.message.OrderStateChangedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderStateTransitionMessagePayloadBuilder orderStateTransitionBuilder() {
        return com.commercetools.api.models.message.OrderStateTransitionMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderStoreSetMessagePayloadBuilder orderStoreSetBuilder() {
        return com.commercetools.api.models.message.OrderStoreSetMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.ParcelAddedToDeliveryMessagePayloadBuilder parcelAddedToDeliveryBuilder() {
        return com.commercetools.api.models.message.ParcelAddedToDeliveryMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.ParcelItemsUpdatedMessagePayloadBuilder parcelItemsUpdatedBuilder() {
        return com.commercetools.api.models.message.ParcelItemsUpdatedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.ParcelMeasurementsUpdatedMessagePayloadBuilder parcelMeasurementsUpdatedBuilder() {
        return com.commercetools.api.models.message.ParcelMeasurementsUpdatedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.ParcelRemovedFromDeliveryMessagePayloadBuilder parcelRemovedFromDeliveryBuilder() {
        return com.commercetools.api.models.message.ParcelRemovedFromDeliveryMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.ParcelTrackingDataUpdatedMessagePayloadBuilder parcelTrackingDataUpdatedBuilder() {
        return com.commercetools.api.models.message.ParcelTrackingDataUpdatedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.PaymentCreatedMessagePayloadBuilder paymentCreatedBuilder() {
        return com.commercetools.api.models.message.PaymentCreatedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.PaymentInteractionAddedMessagePayloadBuilder paymentInteractionAddedBuilder() {
        return com.commercetools.api.models.message.PaymentInteractionAddedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.PaymentStatusInterfaceCodeSetMessagePayloadBuilder paymentStatusInterfaceCodeSetBuilder() {
        return com.commercetools.api.models.message.PaymentStatusInterfaceCodeSetMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.PaymentStatusStateTransitionMessagePayloadBuilder paymentStatusStateTransitionBuilder() {
        return com.commercetools.api.models.message.PaymentStatusStateTransitionMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.PaymentTransactionAddedMessagePayloadBuilder paymentTransactionAddedBuilder() {
        return com.commercetools.api.models.message.PaymentTransactionAddedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.PaymentTransactionStateChangedMessagePayloadBuilder paymentTransactionStateChangedBuilder() {
        return com.commercetools.api.models.message.PaymentTransactionStateChangedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.ProductAddedToCategoryMessagePayloadBuilder productAddedToCategoryBuilder() {
        return com.commercetools.api.models.message.ProductAddedToCategoryMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.ProductCreatedMessagePayloadBuilder productCreatedBuilder() {
        return com.commercetools.api.models.message.ProductCreatedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.ProductDeletedMessagePayloadBuilder productDeletedBuilder() {
        return com.commercetools.api.models.message.ProductDeletedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.ProductImageAddedMessagePayloadBuilder productImageAddedBuilder() {
        return com.commercetools.api.models.message.ProductImageAddedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.ProductPriceDiscountsSetMessagePayloadBuilder productPriceDiscountsSetBuilder() {
        return com.commercetools.api.models.message.ProductPriceDiscountsSetMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.ProductPriceExternalDiscountSetMessagePayloadBuilder productPriceExternalDiscountSetBuilder() {
        return com.commercetools.api.models.message.ProductPriceExternalDiscountSetMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.ProductPublishedMessagePayloadBuilder productPublishedBuilder() {
        return com.commercetools.api.models.message.ProductPublishedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.ProductRemovedFromCategoryMessagePayloadBuilder productRemovedFromCategoryBuilder() {
        return com.commercetools.api.models.message.ProductRemovedFromCategoryMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.ProductRevertedStagedChangesMessagePayloadBuilder productRevertedStagedChangesBuilder() {
        return com.commercetools.api.models.message.ProductRevertedStagedChangesMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.ProductSelectionCreatedMessagePayloadBuilder productSelectionCreatedBuilder() {
        return com.commercetools.api.models.message.ProductSelectionCreatedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.ProductSelectionDeletedMessagePayloadBuilder productSelectionDeletedBuilder() {
        return com.commercetools.api.models.message.ProductSelectionDeletedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.ProductSelectionProductAddedMessagePayloadBuilder productSelectionProductAddedBuilder() {
        return com.commercetools.api.models.message.ProductSelectionProductAddedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.ProductSelectionProductRemovedMessagePayloadBuilder productSelectionProductRemovedBuilder() {
        return com.commercetools.api.models.message.ProductSelectionProductRemovedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.ProductSlugChangedMessagePayloadBuilder productSlugChangedBuilder() {
        return com.commercetools.api.models.message.ProductSlugChangedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.ProductStateTransitionMessagePayloadBuilder productStateTransitionBuilder() {
        return com.commercetools.api.models.message.ProductStateTransitionMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.ProductUnpublishedMessagePayloadBuilder productUnpublishedBuilder() {
        return com.commercetools.api.models.message.ProductUnpublishedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.ProductVariantAddedMessagePayloadBuilder productVariantAddedBuilder() {
        return com.commercetools.api.models.message.ProductVariantAddedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.ProductVariantDeletedMessagePayloadBuilder productVariantDeletedBuilder() {
        return com.commercetools.api.models.message.ProductVariantDeletedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.ReviewCreatedMessagePayloadBuilder reviewCreatedBuilder() {
        return com.commercetools.api.models.message.ReviewCreatedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.ReviewRatingSetMessagePayloadBuilder reviewRatingSetBuilder() {
        return com.commercetools.api.models.message.ReviewRatingSetMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.ReviewStateTransitionMessagePayloadBuilder reviewStateTransitionBuilder() {
        return com.commercetools.api.models.message.ReviewStateTransitionMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.ShoppingListStoreSetMessagePayloadBuilder shoppingListStoreSetBuilder() {
        return com.commercetools.api.models.message.ShoppingListStoreSetMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.StoreCreatedMessagePayloadBuilder storeCreatedBuilder() {
        return com.commercetools.api.models.message.StoreCreatedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.StoreDeletedMessagePayloadBuilder storeDeletedBuilder() {
        return com.commercetools.api.models.message.StoreDeletedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.StoreProductSelectionsChangedMessagePayloadBuilder storeProductSelectionsChangedBuilder() {
        return com.commercetools.api.models.message.StoreProductSelectionsChangedMessagePayloadBuilder.of();
    }

    default <T> T withMessagePayload(Function<MessagePayload, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<MessagePayload>";
            }
        };
    }
}
