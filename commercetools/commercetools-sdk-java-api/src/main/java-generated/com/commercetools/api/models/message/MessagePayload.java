
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * MessagePayload
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MessagePayload messagePayload = MessagePayload.businessUnitAddressAddedBuilder()
 *             address(addressBuilder -> addressBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitAddressAddedMessagePayloadImpl.class, name = BusinessUnitAddressAddedMessagePayload.BUSINESS_UNIT_ADDRESS_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitAddressChangedMessagePayloadImpl.class, name = BusinessUnitAddressChangedMessagePayload.BUSINESS_UNIT_ADDRESS_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitAddressRemovedMessagePayloadImpl.class, name = BusinessUnitAddressRemovedMessagePayload.BUSINESS_UNIT_ADDRESS_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitAssociateAddedMessagePayloadImpl.class, name = BusinessUnitAssociateAddedMessagePayload.BUSINESS_UNIT_ASSOCIATE_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitAssociateChangedMessagePayloadImpl.class, name = BusinessUnitAssociateChangedMessagePayload.BUSINESS_UNIT_ASSOCIATE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitAssociateRemovedMessagePayloadImpl.class, name = BusinessUnitAssociateRemovedMessagePayload.BUSINESS_UNIT_ASSOCIATE_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitAssociatesSetMessagePayloadImpl.class, name = BusinessUnitAssociatesSetMessagePayload.BUSINESS_UNIT_ASSOCIATES_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitBillingAddressAddedMessagePayloadImpl.class, name = BusinessUnitBillingAddressAddedMessagePayload.BUSINESS_UNIT_BILLING_ADDRESS_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitBillingAddressRemovedMessagePayloadImpl.class, name = BusinessUnitBillingAddressRemovedMessagePayload.BUSINESS_UNIT_BILLING_ADDRESS_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitContactEmailSetMessagePayloadImpl.class, name = BusinessUnitContactEmailSetMessagePayload.BUSINESS_UNIT_CONTACT_EMAIL_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitCreatedMessagePayloadImpl.class, name = BusinessUnitCreatedMessagePayload.BUSINESS_UNIT_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitDefaultBillingAddressSetMessagePayloadImpl.class, name = BusinessUnitDefaultBillingAddressSetMessagePayload.BUSINESS_UNIT_DEFAULT_BILLING_ADDRESS_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitDefaultShippingAddressSetMessagePayloadImpl.class, name = BusinessUnitDefaultShippingAddressSetMessagePayload.BUSINESS_UNIT_DEFAULT_SHIPPING_ADDRESS_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitDeletedMessagePayloadImpl.class, name = BusinessUnitDeletedMessagePayload.BUSINESS_UNIT_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitNameChangedMessagePayloadImpl.class, name = BusinessUnitNameChangedMessagePayload.BUSINESS_UNIT_NAME_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitParentUnitChangedMessagePayloadImpl.class, name = BusinessUnitParentUnitChangedMessagePayload.BUSINESS_UNIT_PARENT_UNIT_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitShippingAddressAddedMessagePayloadImpl.class, name = BusinessUnitShippingAddressAddedMessagePayload.BUSINESS_UNIT_SHIPPING_ADDRESS_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitShippingAddressRemovedMessagePayloadImpl.class, name = BusinessUnitShippingAddressRemovedMessagePayload.BUSINESS_UNIT_SHIPPING_ADDRESS_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitStatusChangedMessagePayloadImpl.class, name = BusinessUnitStatusChangedMessagePayload.BUSINESS_UNIT_STATUS_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitStoreAddedMessagePayloadImpl.class, name = BusinessUnitStoreAddedMessagePayload.BUSINESS_UNIT_STORE_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitStoreModeChangedMessagePayloadImpl.class, name = BusinessUnitStoreModeChangedMessagePayload.BUSINESS_UNIT_STORE_MODE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitStoreRemovedMessagePayloadImpl.class, name = BusinessUnitStoreRemovedMessagePayload.BUSINESS_UNIT_STORE_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitStoresSetMessagePayloadImpl.class, name = BusinessUnitStoresSetMessagePayload.BUSINESS_UNIT_STORES_SET),
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
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomLineItemAddedMessagePayloadImpl.class, name = OrderCustomLineItemAddedMessagePayload.ORDER_CUSTOM_LINE_ITEM_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomLineItemDiscountSetMessagePayloadImpl.class, name = OrderCustomLineItemDiscountSetMessagePayload.ORDER_CUSTOM_LINE_ITEM_DISCOUNT_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomLineItemQuantityChangedMessagePayloadImpl.class, name = OrderCustomLineItemQuantityChangedMessagePayload.ORDER_CUSTOM_LINE_ITEM_QUANTITY_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomLineItemRemovedMessagePayloadImpl.class, name = OrderCustomLineItemRemovedMessagePayload.ORDER_CUSTOM_LINE_ITEM_REMOVED),
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
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderPurchaseOrderNumberSetMessagePayloadImpl.class, name = OrderPurchaseOrderNumberSetMessagePayload.ORDER_PURCHASE_ORDER_NUMBER_SET),
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
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductPriceAddedMessagePayloadImpl.class, name = ProductPriceAddedMessagePayload.PRODUCT_PRICE_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductPriceChangedMessagePayloadImpl.class, name = ProductPriceChangedMessagePayload.PRODUCT_PRICE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductPriceDiscountsSetMessagePayloadImpl.class, name = ProductPriceDiscountsSetMessagePayload.PRODUCT_PRICE_DISCOUNTS_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductPriceExternalDiscountSetMessagePayloadImpl.class, name = ProductPriceExternalDiscountSetMessagePayload.PRODUCT_PRICE_EXTERNAL_DISCOUNT_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductPriceKeySetMessagePayloadImpl.class, name = ProductPriceKeySetMessagePayload.PRODUCT_PRICE_KEY_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductPriceModeSetMessagePayloadImpl.class, name = ProductPriceModeSetMessagePayload.PRODUCT_PRICE_MODE_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductPriceRemovedMessagePayloadImpl.class, name = ProductPriceRemovedMessagePayload.PRODUCT_PRICE_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductPricesSetMessagePayloadImpl.class, name = ProductPricesSetMessagePayload.PRODUCT_PRICES_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductPublishedMessagePayloadImpl.class, name = ProductPublishedMessagePayload.PRODUCT_PUBLISHED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductRemovedFromCategoryMessagePayloadImpl.class, name = ProductRemovedFromCategoryMessagePayload.PRODUCT_REMOVED_FROM_CATEGORY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductRevertedStagedChangesMessagePayloadImpl.class, name = ProductRevertedStagedChangesMessagePayload.PRODUCT_REVERTED_STAGED_CHANGES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductSelectionCreatedMessagePayloadImpl.class, name = ProductSelectionCreatedMessagePayload.PRODUCT_SELECTION_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductSelectionDeletedMessagePayloadImpl.class, name = ProductSelectionDeletedMessagePayload.PRODUCT_SELECTION_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductSelectionProductAddedMessagePayloadImpl.class, name = ProductSelectionProductAddedMessagePayload.PRODUCT_SELECTION_PRODUCT_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductSelectionProductExcludedMessagePayloadImpl.class, name = ProductSelectionProductExcludedMessagePayload.PRODUCT_SELECTION_PRODUCT_EXCLUDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductSelectionProductRemovedMessagePayloadImpl.class, name = ProductSelectionProductRemovedMessagePayload.PRODUCT_SELECTION_PRODUCT_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductSelectionVariantExclusionChangedMessagePayloadImpl.class, name = ProductSelectionVariantExclusionChangedMessagePayload.PRODUCT_SELECTION_VARIANT_EXCLUSION_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductSelectionVariantSelectionChangedMessagePayloadImpl.class, name = ProductSelectionVariantSelectionChangedMessagePayload.PRODUCT_SELECTION_VARIANT_SELECTION_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductSlugChangedMessagePayloadImpl.class, name = ProductSlugChangedMessagePayload.PRODUCT_SLUG_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductStateTransitionMessagePayloadImpl.class, name = ProductStateTransitionMessagePayload.PRODUCT_STATE_TRANSITION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductUnpublishedMessagePayloadImpl.class, name = ProductUnpublishedMessagePayload.PRODUCT_UNPUBLISHED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductVariantAddedMessagePayloadImpl.class, name = ProductVariantAddedMessagePayload.PRODUCT_VARIANT_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductVariantDeletedMessagePayloadImpl.class, name = ProductVariantDeletedMessagePayload.PRODUCT_VARIANT_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.QuoteCreatedMessagePayloadImpl.class, name = QuoteCreatedMessagePayload.QUOTE_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.QuoteDeletedMessagePayloadImpl.class, name = QuoteDeletedMessagePayload.QUOTE_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.QuoteRequestCreatedMessagePayloadImpl.class, name = QuoteRequestCreatedMessagePayload.QUOTE_REQUEST_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.QuoteRequestDeletedMessagePayloadImpl.class, name = QuoteRequestDeletedMessagePayload.QUOTE_REQUEST_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.QuoteRequestStateChangedMessagePayloadImpl.class, name = QuoteRequestStateChangedMessagePayload.QUOTE_REQUEST_STATE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.QuoteRequestStateTransitionMessagePayloadImpl.class, name = QuoteRequestStateTransitionMessagePayload.QUOTE_REQUEST_STATE_TRANSITION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.QuoteStateChangedMessagePayloadImpl.class, name = QuoteStateChangedMessagePayload.QUOTE_STATE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.QuoteStateTransitionMessagePayloadImpl.class, name = QuoteStateTransitionMessagePayload.QUOTE_STATE_TRANSITION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ReturnInfoAddedMessagePayloadImpl.class, name = ReturnInfoAddedMessagePayload.RETURN_INFO_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ReturnInfoSetMessagePayloadImpl.class, name = ReturnInfoSetMessagePayload.RETURN_INFO_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ReviewCreatedMessagePayloadImpl.class, name = ReviewCreatedMessagePayload.REVIEW_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ReviewRatingSetMessagePayloadImpl.class, name = ReviewRatingSetMessagePayload.REVIEW_RATING_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ReviewStateTransitionMessagePayloadImpl.class, name = ReviewStateTransitionMessagePayload.REVIEW_STATE_TRANSITION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ShoppingListStoreSetMessagePayloadImpl.class, name = ShoppingListStoreSetMessagePayload.SHOPPING_LIST_STORE_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StagedQuoteCreatedMessagePayloadImpl.class, name = StagedQuoteCreatedMessagePayload.STAGED_QUOTE_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StagedQuoteDeletedMessagePayloadImpl.class, name = StagedQuoteDeletedMessagePayload.STAGED_QUOTE_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StagedQuoteSellerCommentSetMessagePayloadImpl.class, name = StagedQuoteSellerCommentSetMessagePayload.STAGED_QUOTE_SELLER_COMMENT_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StagedQuoteStateChangedMessagePayloadImpl.class, name = StagedQuoteStateChangedMessagePayload.STAGED_QUOTE_STATE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StagedQuoteStateTransitionMessagePayloadImpl.class, name = StagedQuoteStateTransitionMessagePayload.STAGED_QUOTE_STATE_TRANSITION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StagedQuoteValidToSetMessagePayloadImpl.class, name = StagedQuoteValidToSetMessagePayload.STAGED_QUOTE_VALID_TO_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StandalonePriceActiveChangedMessagePayloadImpl.class, name = StandalonePriceActiveChangedMessagePayload.STANDALONE_PRICE_ACTIVE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StandalonePriceCreatedMessagePayloadImpl.class, name = StandalonePriceCreatedMessagePayload.STANDALONE_PRICE_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StandalonePriceDeletedMessagePayloadImpl.class, name = StandalonePriceDeletedMessagePayload.STANDALONE_PRICE_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StandalonePriceDiscountSetMessagePayloadImpl.class, name = StandalonePriceDiscountSetMessagePayload.STANDALONE_PRICE_DISCOUNT_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StandalonePriceExternalDiscountSetMessagePayloadImpl.class, name = StandalonePriceExternalDiscountSetMessagePayload.STANDALONE_PRICE_EXTERNAL_DISCOUNT_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StandalonePriceKeySetMessagePayloadImpl.class, name = StandalonePriceKeySetMessagePayload.STANDALONE_PRICE_KEY_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StandalonePriceStagedChangesAppliedMessagePayloadImpl.class, name = StandalonePriceStagedChangesAppliedMessagePayload.STANDALONE_PRICE_STAGED_CHANGES_APPLIED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StandalonePriceValueChangedMessagePayloadImpl.class, name = StandalonePriceValueChangedMessagePayload.STANDALONE_PRICE_VALUE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StoreCountriesChangedMessagePayloadImpl.class, name = StoreCountriesChangedMessagePayload.STORE_COUNTRIES_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StoreCreatedMessagePayloadImpl.class, name = StoreCreatedMessagePayload.STORE_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StoreDeletedMessagePayloadImpl.class, name = StoreDeletedMessagePayload.STORE_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StoreDistributionChannelsChangedMessagePayloadImpl.class, name = StoreDistributionChannelsChangedMessagePayload.STORE_DISTRIBUTION_CHANNELS_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StoreLanguagesChangedMessagePayloadImpl.class, name = StoreLanguagesChangedMessagePayload.STORE_LANGUAGES_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StoreNameSetMessagePayloadImpl.class, name = StoreNameSetMessagePayload.STORE_NAME_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StoreProductSelectionsChangedMessagePayloadImpl.class, name = StoreProductSelectionsChangedMessagePayload.STORE_PRODUCT_SELECTIONS_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StoreSupplyChannelsChangedMessagePayloadImpl.class, name = StoreSupplyChannelsChangedMessagePayload.STORE_SUPPLY_CHANNELS_CHANGED) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = MessagePayloadImpl.class, visible = true)
@JsonDeserialize(as = MessagePayloadImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface MessagePayload {

    /**
     *
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    public static com.commercetools.api.models.message.BusinessUnitAddressAddedMessagePayloadBuilder businessUnitAddressAddedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAddressAddedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.BusinessUnitAddressChangedMessagePayloadBuilder businessUnitAddressChangedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAddressChangedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.BusinessUnitAddressRemovedMessagePayloadBuilder businessUnitAddressRemovedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAddressRemovedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.BusinessUnitAssociateAddedMessagePayloadBuilder businessUnitAssociateAddedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAssociateAddedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.BusinessUnitAssociateChangedMessagePayloadBuilder businessUnitAssociateChangedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAssociateChangedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.BusinessUnitAssociateRemovedMessagePayloadBuilder businessUnitAssociateRemovedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAssociateRemovedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.BusinessUnitAssociatesSetMessagePayloadBuilder businessUnitAssociatesSetBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAssociatesSetMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.BusinessUnitBillingAddressAddedMessagePayloadBuilder businessUnitBillingAddressAddedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitBillingAddressAddedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.BusinessUnitBillingAddressRemovedMessagePayloadBuilder businessUnitBillingAddressRemovedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitBillingAddressRemovedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.BusinessUnitContactEmailSetMessagePayloadBuilder businessUnitContactEmailSetBuilder() {
        return com.commercetools.api.models.message.BusinessUnitContactEmailSetMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.BusinessUnitCreatedMessagePayloadBuilder businessUnitCreatedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitCreatedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.BusinessUnitDefaultBillingAddressSetMessagePayloadBuilder businessUnitDefaultBillingAddressSetBuilder() {
        return com.commercetools.api.models.message.BusinessUnitDefaultBillingAddressSetMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.BusinessUnitDefaultShippingAddressSetMessagePayloadBuilder businessUnitDefaultShippingAddressSetBuilder() {
        return com.commercetools.api.models.message.BusinessUnitDefaultShippingAddressSetMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.BusinessUnitDeletedMessagePayloadBuilder businessUnitDeletedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitDeletedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.BusinessUnitNameChangedMessagePayloadBuilder businessUnitNameChangedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitNameChangedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.BusinessUnitParentUnitChangedMessagePayloadBuilder businessUnitParentUnitChangedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitParentUnitChangedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.BusinessUnitShippingAddressAddedMessagePayloadBuilder businessUnitShippingAddressAddedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitShippingAddressAddedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.BusinessUnitShippingAddressRemovedMessagePayloadBuilder businessUnitShippingAddressRemovedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitShippingAddressRemovedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.BusinessUnitStatusChangedMessagePayloadBuilder businessUnitStatusChangedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitStatusChangedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.BusinessUnitStoreAddedMessagePayloadBuilder businessUnitStoreAddedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitStoreAddedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.BusinessUnitStoreModeChangedMessagePayloadBuilder businessUnitStoreModeChangedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitStoreModeChangedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.BusinessUnitStoreRemovedMessagePayloadBuilder businessUnitStoreRemovedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitStoreRemovedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.BusinessUnitStoresSetMessagePayloadBuilder businessUnitStoresSetBuilder() {
        return com.commercetools.api.models.message.BusinessUnitStoresSetMessagePayloadBuilder.of();
    }

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

    public static com.commercetools.api.models.message.OrderCustomLineItemAddedMessagePayloadBuilder orderCustomLineItemAddedBuilder() {
        return com.commercetools.api.models.message.OrderCustomLineItemAddedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderCustomLineItemDiscountSetMessagePayloadBuilder orderCustomLineItemDiscountSetBuilder() {
        return com.commercetools.api.models.message.OrderCustomLineItemDiscountSetMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderCustomLineItemQuantityChangedMessagePayloadBuilder orderCustomLineItemQuantityChangedBuilder() {
        return com.commercetools.api.models.message.OrderCustomLineItemQuantityChangedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.OrderCustomLineItemRemovedMessagePayloadBuilder orderCustomLineItemRemovedBuilder() {
        return com.commercetools.api.models.message.OrderCustomLineItemRemovedMessagePayloadBuilder.of();
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

    public static com.commercetools.api.models.message.OrderPurchaseOrderNumberSetMessagePayloadBuilder orderPurchaseOrderNumberSetBuilder() {
        return com.commercetools.api.models.message.OrderPurchaseOrderNumberSetMessagePayloadBuilder.of();
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

    public static com.commercetools.api.models.message.ProductPriceAddedMessagePayloadBuilder productPriceAddedBuilder() {
        return com.commercetools.api.models.message.ProductPriceAddedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.ProductPriceChangedMessagePayloadBuilder productPriceChangedBuilder() {
        return com.commercetools.api.models.message.ProductPriceChangedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.ProductPriceDiscountsSetMessagePayloadBuilder productPriceDiscountsSetBuilder() {
        return com.commercetools.api.models.message.ProductPriceDiscountsSetMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.ProductPriceExternalDiscountSetMessagePayloadBuilder productPriceExternalDiscountSetBuilder() {
        return com.commercetools.api.models.message.ProductPriceExternalDiscountSetMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.ProductPriceKeySetMessagePayloadBuilder productPriceKeySetBuilder() {
        return com.commercetools.api.models.message.ProductPriceKeySetMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.ProductPriceModeSetMessagePayloadBuilder productPriceModeSetBuilder() {
        return com.commercetools.api.models.message.ProductPriceModeSetMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.ProductPriceRemovedMessagePayloadBuilder productPriceRemovedBuilder() {
        return com.commercetools.api.models.message.ProductPriceRemovedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.ProductPricesSetMessagePayloadBuilder productPricesSetBuilder() {
        return com.commercetools.api.models.message.ProductPricesSetMessagePayloadBuilder.of();
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

    public static com.commercetools.api.models.message.ProductSelectionProductExcludedMessagePayloadBuilder productSelectionProductExcludedBuilder() {
        return com.commercetools.api.models.message.ProductSelectionProductExcludedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.ProductSelectionProductRemovedMessagePayloadBuilder productSelectionProductRemovedBuilder() {
        return com.commercetools.api.models.message.ProductSelectionProductRemovedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.ProductSelectionVariantExclusionChangedMessagePayloadBuilder productSelectionVariantExclusionChangedBuilder() {
        return com.commercetools.api.models.message.ProductSelectionVariantExclusionChangedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.ProductSelectionVariantSelectionChangedMessagePayloadBuilder productSelectionVariantSelectionChangedBuilder() {
        return com.commercetools.api.models.message.ProductSelectionVariantSelectionChangedMessagePayloadBuilder.of();
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

    public static com.commercetools.api.models.message.QuoteCreatedMessagePayloadBuilder quoteCreatedBuilder() {
        return com.commercetools.api.models.message.QuoteCreatedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.QuoteDeletedMessagePayloadBuilder quoteDeletedBuilder() {
        return com.commercetools.api.models.message.QuoteDeletedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.QuoteRequestCreatedMessagePayloadBuilder quoteRequestCreatedBuilder() {
        return com.commercetools.api.models.message.QuoteRequestCreatedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.QuoteRequestDeletedMessagePayloadBuilder quoteRequestDeletedBuilder() {
        return com.commercetools.api.models.message.QuoteRequestDeletedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.QuoteRequestStateChangedMessagePayloadBuilder quoteRequestStateChangedBuilder() {
        return com.commercetools.api.models.message.QuoteRequestStateChangedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.QuoteRequestStateTransitionMessagePayloadBuilder quoteRequestStateTransitionBuilder() {
        return com.commercetools.api.models.message.QuoteRequestStateTransitionMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.QuoteStateChangedMessagePayloadBuilder quoteStateChangedBuilder() {
        return com.commercetools.api.models.message.QuoteStateChangedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.QuoteStateTransitionMessagePayloadBuilder quoteStateTransitionBuilder() {
        return com.commercetools.api.models.message.QuoteStateTransitionMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.ReturnInfoAddedMessagePayloadBuilder returnInfoAddedBuilder() {
        return com.commercetools.api.models.message.ReturnInfoAddedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.ReturnInfoSetMessagePayloadBuilder returnInfoSetBuilder() {
        return com.commercetools.api.models.message.ReturnInfoSetMessagePayloadBuilder.of();
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

    public static com.commercetools.api.models.message.StagedQuoteCreatedMessagePayloadBuilder stagedQuoteCreatedBuilder() {
        return com.commercetools.api.models.message.StagedQuoteCreatedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.StagedQuoteDeletedMessagePayloadBuilder stagedQuoteDeletedBuilder() {
        return com.commercetools.api.models.message.StagedQuoteDeletedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.StagedQuoteSellerCommentSetMessagePayloadBuilder stagedQuoteSellerCommentSetBuilder() {
        return com.commercetools.api.models.message.StagedQuoteSellerCommentSetMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.StagedQuoteStateChangedMessagePayloadBuilder stagedQuoteStateChangedBuilder() {
        return com.commercetools.api.models.message.StagedQuoteStateChangedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.StagedQuoteStateTransitionMessagePayloadBuilder stagedQuoteStateTransitionBuilder() {
        return com.commercetools.api.models.message.StagedQuoteStateTransitionMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.StagedQuoteValidToSetMessagePayloadBuilder stagedQuoteValidToSetBuilder() {
        return com.commercetools.api.models.message.StagedQuoteValidToSetMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.StandalonePriceActiveChangedMessagePayloadBuilder standalonePriceActiveChangedBuilder() {
        return com.commercetools.api.models.message.StandalonePriceActiveChangedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.StandalonePriceCreatedMessagePayloadBuilder standalonePriceCreatedBuilder() {
        return com.commercetools.api.models.message.StandalonePriceCreatedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.StandalonePriceDeletedMessagePayloadBuilder standalonePriceDeletedBuilder() {
        return com.commercetools.api.models.message.StandalonePriceDeletedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.StandalonePriceDiscountSetMessagePayloadBuilder standalonePriceDiscountSetBuilder() {
        return com.commercetools.api.models.message.StandalonePriceDiscountSetMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.StandalonePriceExternalDiscountSetMessagePayloadBuilder standalonePriceExternalDiscountSetBuilder() {
        return com.commercetools.api.models.message.StandalonePriceExternalDiscountSetMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.StandalonePriceKeySetMessagePayloadBuilder standalonePriceKeySetBuilder() {
        return com.commercetools.api.models.message.StandalonePriceKeySetMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.StandalonePriceStagedChangesAppliedMessagePayloadBuilder standalonePriceStagedChangesAppliedBuilder() {
        return com.commercetools.api.models.message.StandalonePriceStagedChangesAppliedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.StandalonePriceValueChangedMessagePayloadBuilder standalonePriceValueChangedBuilder() {
        return com.commercetools.api.models.message.StandalonePriceValueChangedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.StoreCountriesChangedMessagePayloadBuilder storeCountriesChangedBuilder() {
        return com.commercetools.api.models.message.StoreCountriesChangedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.StoreCreatedMessagePayloadBuilder storeCreatedBuilder() {
        return com.commercetools.api.models.message.StoreCreatedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.StoreDeletedMessagePayloadBuilder storeDeletedBuilder() {
        return com.commercetools.api.models.message.StoreDeletedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.StoreDistributionChannelsChangedMessagePayloadBuilder storeDistributionChannelsChangedBuilder() {
        return com.commercetools.api.models.message.StoreDistributionChannelsChangedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.StoreLanguagesChangedMessagePayloadBuilder storeLanguagesChangedBuilder() {
        return com.commercetools.api.models.message.StoreLanguagesChangedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.StoreNameSetMessagePayloadBuilder storeNameSetBuilder() {
        return com.commercetools.api.models.message.StoreNameSetMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.StoreProductSelectionsChangedMessagePayloadBuilder storeProductSelectionsChangedBuilder() {
        return com.commercetools.api.models.message.StoreProductSelectionsChangedMessagePayloadBuilder.of();
    }

    public static com.commercetools.api.models.message.StoreSupplyChannelsChangedMessagePayloadBuilder storeSupplyChannelsChangedBuilder() {
        return com.commercetools.api.models.message.StoreSupplyChannelsChangedMessagePayloadBuilder.of();
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
