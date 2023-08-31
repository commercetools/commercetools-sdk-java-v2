
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
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
 *     MessagePayload messagePayload = MessagePayload.associateRoleBuyerAssignableChangedBuilder()
 *             buyerAssignable(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.AssociateRoleBuyerAssignableChangedMessagePayloadImpl.class, name = AssociateRoleBuyerAssignableChangedMessagePayload.ASSOCIATE_ROLE_BUYER_ASSIGNABLE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.AssociateRoleCreatedMessagePayloadImpl.class, name = AssociateRoleCreatedMessagePayload.ASSOCIATE_ROLE_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.AssociateRoleDeletedMessagePayloadImpl.class, name = AssociateRoleDeletedMessagePayload.ASSOCIATE_ROLE_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.AssociateRoleNameChangedMessagePayloadImpl.class, name = AssociateRoleNameChangedMessagePayload.ASSOCIATE_ROLE_NAME_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.AssociateRolePermissionAddedMessagePayloadImpl.class, name = AssociateRolePermissionAddedMessagePayload.ASSOCIATE_ROLE_PERMISSION_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.AssociateRolePermissionRemovedMessagePayloadImpl.class, name = AssociateRolePermissionRemovedMessagePayload.ASSOCIATE_ROLE_PERMISSION_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.AssociateRolePermissionsSetMessagePayloadImpl.class, name = AssociateRolePermissionsSetMessagePayload.ASSOCIATE_ROLE_PERMISSIONS_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitAddressAddedMessagePayloadImpl.class, name = BusinessUnitAddressAddedMessagePayload.BUSINESS_UNIT_ADDRESS_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitAddressChangedMessagePayloadImpl.class, name = BusinessUnitAddressChangedMessagePayload.BUSINESS_UNIT_ADDRESS_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitAddressRemovedMessagePayloadImpl.class, name = BusinessUnitAddressRemovedMessagePayload.BUSINESS_UNIT_ADDRESS_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitAssociateAddedMessagePayloadImpl.class, name = BusinessUnitAssociateAddedMessagePayload.BUSINESS_UNIT_ASSOCIATE_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitAssociateChangedMessagePayloadImpl.class, name = BusinessUnitAssociateChangedMessagePayload.BUSINESS_UNIT_ASSOCIATE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitAssociateModeChangedMessagePayloadImpl.class, name = BusinessUnitAssociateModeChangedMessagePayload.BUSINESS_UNIT_ASSOCIATE_MODE_CHANGED),
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
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitParentChangedMessagePayloadImpl.class, name = BusinessUnitParentChangedMessagePayload.BUSINESS_UNIT_PARENT_CHANGED),
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
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomFieldAddedMessagePayloadImpl.class, name = OrderCustomFieldAddedMessagePayload.ORDER_CUSTOM_FIELD_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomFieldChangedMessagePayloadImpl.class, name = OrderCustomFieldChangedMessagePayload.ORDER_CUSTOM_FIELD_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomFieldRemovedMessagePayloadImpl.class, name = OrderCustomFieldRemovedMessagePayload.ORDER_CUSTOM_FIELD_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomLineItemAddedMessagePayloadImpl.class, name = OrderCustomLineItemAddedMessagePayload.ORDER_CUSTOM_LINE_ITEM_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomLineItemDiscountSetMessagePayloadImpl.class, name = OrderCustomLineItemDiscountSetMessagePayload.ORDER_CUSTOM_LINE_ITEM_DISCOUNT_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomLineItemQuantityChangedMessagePayloadImpl.class, name = OrderCustomLineItemQuantityChangedMessagePayload.ORDER_CUSTOM_LINE_ITEM_QUANTITY_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomLineItemRemovedMessagePayloadImpl.class, name = OrderCustomLineItemRemovedMessagePayload.ORDER_CUSTOM_LINE_ITEM_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomTypeRemovedMessagePayloadImpl.class, name = OrderCustomTypeRemovedMessagePayload.ORDER_CUSTOM_TYPE_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomTypeSetMessagePayloadImpl.class, name = OrderCustomTypeSetMessagePayload.ORDER_CUSTOM_TYPE_SET),
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
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.QuoteCustomerChangedMessagePayloadImpl.class, name = QuoteCustomerChangedMessagePayload.QUOTE_CUSTOMER_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.QuoteDeletedMessagePayloadImpl.class, name = QuoteDeletedMessagePayload.QUOTE_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.QuoteRenegotiationRequestedMessagePayloadImpl.class, name = QuoteRenegotiationRequestedMessagePayload.QUOTE_RENEGOTIATION_REQUESTED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.QuoteRequestCreatedMessagePayloadImpl.class, name = QuoteRequestCreatedMessagePayload.QUOTE_REQUEST_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.QuoteRequestCustomerChangedMessagePayloadImpl.class, name = QuoteRequestCustomerChangedMessagePayload.QUOTE_REQUEST_CUSTOMER_CHANGED),
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
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StandalonePriceStagedChangesRemovedMessagePayloadImpl.class, name = StandalonePriceStagedChangesRemovedMessagePayload.STANDALONE_PRICE_STAGED_CHANGES_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StandalonePriceTierAddedMessagePayloadImpl.class, name = StandalonePriceTierAddedMessagePayload.STANDALONE_PRICE_TIER_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StandalonePriceTierRemovedMessagePayloadImpl.class, name = StandalonePriceTierRemovedMessagePayload.STANDALONE_PRICE_TIER_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StandalonePriceTiersSetMessagePayloadImpl.class, name = StandalonePriceTiersSetMessagePayload.STANDALONE_PRICE_TIERS_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StandalonePriceValidFromAndUntilSetMessagePayloadImpl.class, name = StandalonePriceValidFromAndUntilSetMessagePayload.STANDALONE_PRICE_VALID_FROM_AND_UNTIL_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StandalonePriceValidFromSetMessagePayloadImpl.class, name = StandalonePriceValidFromSetMessagePayload.STANDALONE_PRICE_VALID_FROM_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StandalonePriceValidUntilSetMessagePayloadImpl.class, name = StandalonePriceValidUntilSetMessagePayload.STANDALONE_PRICE_VALID_UNTIL_SET),
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
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     * factory method to create a deep copy of MessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static MessagePayload deepCopy(@Nullable final MessagePayload template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.message.AssociateRoleBuyerAssignableChangedMessagePayload) {
            return com.commercetools.api.models.message.AssociateRoleBuyerAssignableChangedMessagePayload.deepCopy(
                (com.commercetools.api.models.message.AssociateRoleBuyerAssignableChangedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.AssociateRoleCreatedMessagePayload) {
            return com.commercetools.api.models.message.AssociateRoleCreatedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.AssociateRoleCreatedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.AssociateRoleDeletedMessagePayload) {
            return com.commercetools.api.models.message.AssociateRoleDeletedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.AssociateRoleDeletedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.AssociateRoleNameChangedMessagePayload) {
            return com.commercetools.api.models.message.AssociateRoleNameChangedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.AssociateRoleNameChangedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.AssociateRolePermissionAddedMessagePayload) {
            return com.commercetools.api.models.message.AssociateRolePermissionAddedMessagePayload.deepCopy(
                (com.commercetools.api.models.message.AssociateRolePermissionAddedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.AssociateRolePermissionRemovedMessagePayload) {
            return com.commercetools.api.models.message.AssociateRolePermissionRemovedMessagePayload.deepCopy(
                (com.commercetools.api.models.message.AssociateRolePermissionRemovedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.AssociateRolePermissionsSetMessagePayload) {
            return com.commercetools.api.models.message.AssociateRolePermissionsSetMessagePayload.deepCopy(
                (com.commercetools.api.models.message.AssociateRolePermissionsSetMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitAddressAddedMessagePayload) {
            return com.commercetools.api.models.message.BusinessUnitAddressAddedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.BusinessUnitAddressAddedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitAddressChangedMessagePayload) {
            return com.commercetools.api.models.message.BusinessUnitAddressChangedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.BusinessUnitAddressChangedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitAddressRemovedMessagePayload) {
            return com.commercetools.api.models.message.BusinessUnitAddressRemovedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.BusinessUnitAddressRemovedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitAssociateAddedMessagePayload) {
            return com.commercetools.api.models.message.BusinessUnitAssociateAddedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.BusinessUnitAssociateAddedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitAssociateChangedMessagePayload) {
            return com.commercetools.api.models.message.BusinessUnitAssociateChangedMessagePayload.deepCopy(
                (com.commercetools.api.models.message.BusinessUnitAssociateChangedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitAssociateModeChangedMessagePayload) {
            return com.commercetools.api.models.message.BusinessUnitAssociateModeChangedMessagePayload.deepCopy(
                (com.commercetools.api.models.message.BusinessUnitAssociateModeChangedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitAssociateRemovedMessagePayload) {
            return com.commercetools.api.models.message.BusinessUnitAssociateRemovedMessagePayload.deepCopy(
                (com.commercetools.api.models.message.BusinessUnitAssociateRemovedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitAssociatesSetMessagePayload) {
            return com.commercetools.api.models.message.BusinessUnitAssociatesSetMessagePayload
                    .deepCopy((com.commercetools.api.models.message.BusinessUnitAssociatesSetMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitBillingAddressAddedMessagePayload) {
            return com.commercetools.api.models.message.BusinessUnitBillingAddressAddedMessagePayload.deepCopy(
                (com.commercetools.api.models.message.BusinessUnitBillingAddressAddedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitBillingAddressRemovedMessagePayload) {
            return com.commercetools.api.models.message.BusinessUnitBillingAddressRemovedMessagePayload.deepCopy(
                (com.commercetools.api.models.message.BusinessUnitBillingAddressRemovedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitContactEmailSetMessagePayload) {
            return com.commercetools.api.models.message.BusinessUnitContactEmailSetMessagePayload.deepCopy(
                (com.commercetools.api.models.message.BusinessUnitContactEmailSetMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitCreatedMessagePayload) {
            return com.commercetools.api.models.message.BusinessUnitCreatedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.BusinessUnitCreatedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitDefaultBillingAddressSetMessagePayload) {
            return com.commercetools.api.models.message.BusinessUnitDefaultBillingAddressSetMessagePayload.deepCopy(
                (com.commercetools.api.models.message.BusinessUnitDefaultBillingAddressSetMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitDefaultShippingAddressSetMessagePayload) {
            return com.commercetools.api.models.message.BusinessUnitDefaultShippingAddressSetMessagePayload.deepCopy(
                (com.commercetools.api.models.message.BusinessUnitDefaultShippingAddressSetMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitDeletedMessagePayload) {
            return com.commercetools.api.models.message.BusinessUnitDeletedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.BusinessUnitDeletedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitNameChangedMessagePayload) {
            return com.commercetools.api.models.message.BusinessUnitNameChangedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.BusinessUnitNameChangedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitParentChangedMessagePayload) {
            return com.commercetools.api.models.message.BusinessUnitParentChangedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.BusinessUnitParentChangedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitShippingAddressAddedMessagePayload) {
            return com.commercetools.api.models.message.BusinessUnitShippingAddressAddedMessagePayload.deepCopy(
                (com.commercetools.api.models.message.BusinessUnitShippingAddressAddedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitShippingAddressRemovedMessagePayload) {
            return com.commercetools.api.models.message.BusinessUnitShippingAddressRemovedMessagePayload.deepCopy(
                (com.commercetools.api.models.message.BusinessUnitShippingAddressRemovedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitStatusChangedMessagePayload) {
            return com.commercetools.api.models.message.BusinessUnitStatusChangedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.BusinessUnitStatusChangedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitStoreAddedMessagePayload) {
            return com.commercetools.api.models.message.BusinessUnitStoreAddedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.BusinessUnitStoreAddedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitStoreModeChangedMessagePayload) {
            return com.commercetools.api.models.message.BusinessUnitStoreModeChangedMessagePayload.deepCopy(
                (com.commercetools.api.models.message.BusinessUnitStoreModeChangedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitStoreRemovedMessagePayload) {
            return com.commercetools.api.models.message.BusinessUnitStoreRemovedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.BusinessUnitStoreRemovedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitStoresSetMessagePayload) {
            return com.commercetools.api.models.message.BusinessUnitStoresSetMessagePayload
                    .deepCopy((com.commercetools.api.models.message.BusinessUnitStoresSetMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.CategoryCreatedMessagePayload) {
            return com.commercetools.api.models.message.CategoryCreatedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.CategoryCreatedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.CategorySlugChangedMessagePayload) {
            return com.commercetools.api.models.message.CategorySlugChangedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.CategorySlugChangedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.CustomerAddressAddedMessagePayload) {
            return com.commercetools.api.models.message.CustomerAddressAddedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.CustomerAddressAddedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.CustomerAddressChangedMessagePayload) {
            return com.commercetools.api.models.message.CustomerAddressChangedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.CustomerAddressChangedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.CustomerAddressRemovedMessagePayload) {
            return com.commercetools.api.models.message.CustomerAddressRemovedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.CustomerAddressRemovedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.CustomerCompanyNameSetMessagePayload) {
            return com.commercetools.api.models.message.CustomerCompanyNameSetMessagePayload
                    .deepCopy((com.commercetools.api.models.message.CustomerCompanyNameSetMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.CustomerCreatedMessagePayload) {
            return com.commercetools.api.models.message.CustomerCreatedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.CustomerCreatedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.CustomerDateOfBirthSetMessagePayload) {
            return com.commercetools.api.models.message.CustomerDateOfBirthSetMessagePayload
                    .deepCopy((com.commercetools.api.models.message.CustomerDateOfBirthSetMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.CustomerDeletedMessagePayload) {
            return com.commercetools.api.models.message.CustomerDeletedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.CustomerDeletedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.CustomerEmailChangedMessagePayload) {
            return com.commercetools.api.models.message.CustomerEmailChangedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.CustomerEmailChangedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.CustomerEmailVerifiedMessagePayload) {
            return com.commercetools.api.models.message.CustomerEmailVerifiedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.CustomerEmailVerifiedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.CustomerFirstNameSetMessagePayload) {
            return com.commercetools.api.models.message.CustomerFirstNameSetMessagePayload
                    .deepCopy((com.commercetools.api.models.message.CustomerFirstNameSetMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.CustomerGroupSetMessagePayload) {
            return com.commercetools.api.models.message.CustomerGroupSetMessagePayload
                    .deepCopy((com.commercetools.api.models.message.CustomerGroupSetMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.CustomerLastNameSetMessagePayload) {
            return com.commercetools.api.models.message.CustomerLastNameSetMessagePayload
                    .deepCopy((com.commercetools.api.models.message.CustomerLastNameSetMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.CustomerPasswordUpdatedMessagePayload) {
            return com.commercetools.api.models.message.CustomerPasswordUpdatedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.CustomerPasswordUpdatedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.CustomerTitleSetMessagePayload) {
            return com.commercetools.api.models.message.CustomerTitleSetMessagePayload
                    .deepCopy((com.commercetools.api.models.message.CustomerTitleSetMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.InventoryEntryCreatedMessagePayload) {
            return com.commercetools.api.models.message.InventoryEntryCreatedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.InventoryEntryCreatedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.InventoryEntryDeletedMessagePayload) {
            return com.commercetools.api.models.message.InventoryEntryDeletedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.InventoryEntryDeletedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.InventoryEntryQuantitySetMessagePayload) {
            return com.commercetools.api.models.message.InventoryEntryQuantitySetMessagePayload
                    .deepCopy((com.commercetools.api.models.message.InventoryEntryQuantitySetMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderMessagePayload) {
            return com.commercetools.api.models.message.OrderMessagePayload
                    .deepCopy((com.commercetools.api.models.message.OrderMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderPaymentAddedMessagePayload) {
            return com.commercetools.api.models.message.OrderPaymentAddedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.OrderPaymentAddedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.PaymentCreatedMessagePayload) {
            return com.commercetools.api.models.message.PaymentCreatedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.PaymentCreatedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.PaymentInteractionAddedMessagePayload) {
            return com.commercetools.api.models.message.PaymentInteractionAddedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.PaymentInteractionAddedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.PaymentStatusInterfaceCodeSetMessagePayload) {
            return com.commercetools.api.models.message.PaymentStatusInterfaceCodeSetMessagePayload.deepCopy(
                (com.commercetools.api.models.message.PaymentStatusInterfaceCodeSetMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.PaymentStatusStateTransitionMessagePayload) {
            return com.commercetools.api.models.message.PaymentStatusStateTransitionMessagePayload.deepCopy(
                (com.commercetools.api.models.message.PaymentStatusStateTransitionMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.PaymentTransactionAddedMessagePayload) {
            return com.commercetools.api.models.message.PaymentTransactionAddedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.PaymentTransactionAddedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.PaymentTransactionStateChangedMessagePayload) {
            return com.commercetools.api.models.message.PaymentTransactionStateChangedMessagePayload.deepCopy(
                (com.commercetools.api.models.message.PaymentTransactionStateChangedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductAddedToCategoryMessagePayload) {
            return com.commercetools.api.models.message.ProductAddedToCategoryMessagePayload
                    .deepCopy((com.commercetools.api.models.message.ProductAddedToCategoryMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductCreatedMessagePayload) {
            return com.commercetools.api.models.message.ProductCreatedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.ProductCreatedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductDeletedMessagePayload) {
            return com.commercetools.api.models.message.ProductDeletedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.ProductDeletedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductImageAddedMessagePayload) {
            return com.commercetools.api.models.message.ProductImageAddedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.ProductImageAddedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductPriceAddedMessagePayload) {
            return com.commercetools.api.models.message.ProductPriceAddedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.ProductPriceAddedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductPriceChangedMessagePayload) {
            return com.commercetools.api.models.message.ProductPriceChangedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.ProductPriceChangedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductPriceDiscountsSetMessagePayload) {
            return com.commercetools.api.models.message.ProductPriceDiscountsSetMessagePayload
                    .deepCopy((com.commercetools.api.models.message.ProductPriceDiscountsSetMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductPriceExternalDiscountSetMessagePayload) {
            return com.commercetools.api.models.message.ProductPriceExternalDiscountSetMessagePayload.deepCopy(
                (com.commercetools.api.models.message.ProductPriceExternalDiscountSetMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductPriceKeySetMessagePayload) {
            return com.commercetools.api.models.message.ProductPriceKeySetMessagePayload
                    .deepCopy((com.commercetools.api.models.message.ProductPriceKeySetMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductPriceModeSetMessagePayload) {
            return com.commercetools.api.models.message.ProductPriceModeSetMessagePayload
                    .deepCopy((com.commercetools.api.models.message.ProductPriceModeSetMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductPriceRemovedMessagePayload) {
            return com.commercetools.api.models.message.ProductPriceRemovedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.ProductPriceRemovedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductPricesSetMessagePayload) {
            return com.commercetools.api.models.message.ProductPricesSetMessagePayload
                    .deepCopy((com.commercetools.api.models.message.ProductPricesSetMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductPublishedMessagePayload) {
            return com.commercetools.api.models.message.ProductPublishedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.ProductPublishedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductRemovedFromCategoryMessagePayload) {
            return com.commercetools.api.models.message.ProductRemovedFromCategoryMessagePayload
                    .deepCopy((com.commercetools.api.models.message.ProductRemovedFromCategoryMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductRevertedStagedChangesMessagePayload) {
            return com.commercetools.api.models.message.ProductRevertedStagedChangesMessagePayload.deepCopy(
                (com.commercetools.api.models.message.ProductRevertedStagedChangesMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductSelectionCreatedMessagePayload) {
            return com.commercetools.api.models.message.ProductSelectionCreatedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.ProductSelectionCreatedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductSelectionDeletedMessagePayload) {
            return com.commercetools.api.models.message.ProductSelectionDeletedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.ProductSelectionDeletedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductSelectionProductAddedMessagePayload) {
            return com.commercetools.api.models.message.ProductSelectionProductAddedMessagePayload.deepCopy(
                (com.commercetools.api.models.message.ProductSelectionProductAddedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductSelectionProductExcludedMessagePayload) {
            return com.commercetools.api.models.message.ProductSelectionProductExcludedMessagePayload.deepCopy(
                (com.commercetools.api.models.message.ProductSelectionProductExcludedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductSelectionProductRemovedMessagePayload) {
            return com.commercetools.api.models.message.ProductSelectionProductRemovedMessagePayload.deepCopy(
                (com.commercetools.api.models.message.ProductSelectionProductRemovedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductSelectionVariantExclusionChangedMessagePayload) {
            return com.commercetools.api.models.message.ProductSelectionVariantExclusionChangedMessagePayload.deepCopy(
                (com.commercetools.api.models.message.ProductSelectionVariantExclusionChangedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductSelectionVariantSelectionChangedMessagePayload) {
            return com.commercetools.api.models.message.ProductSelectionVariantSelectionChangedMessagePayload.deepCopy(
                (com.commercetools.api.models.message.ProductSelectionVariantSelectionChangedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductSlugChangedMessagePayload) {
            return com.commercetools.api.models.message.ProductSlugChangedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.ProductSlugChangedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductStateTransitionMessagePayload) {
            return com.commercetools.api.models.message.ProductStateTransitionMessagePayload
                    .deepCopy((com.commercetools.api.models.message.ProductStateTransitionMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductUnpublishedMessagePayload) {
            return com.commercetools.api.models.message.ProductUnpublishedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.ProductUnpublishedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductVariantAddedMessagePayload) {
            return com.commercetools.api.models.message.ProductVariantAddedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.ProductVariantAddedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductVariantDeletedMessagePayload) {
            return com.commercetools.api.models.message.ProductVariantDeletedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.ProductVariantDeletedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.QuoteCreatedMessagePayload) {
            return com.commercetools.api.models.message.QuoteCreatedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.QuoteCreatedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.QuoteCustomerChangedMessagePayload) {
            return com.commercetools.api.models.message.QuoteCustomerChangedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.QuoteCustomerChangedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.QuoteDeletedMessagePayload) {
            return com.commercetools.api.models.message.QuoteDeletedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.QuoteDeletedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.QuoteRenegotiationRequestedMessagePayload) {
            return com.commercetools.api.models.message.QuoteRenegotiationRequestedMessagePayload.deepCopy(
                (com.commercetools.api.models.message.QuoteRenegotiationRequestedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.QuoteRequestCreatedMessagePayload) {
            return com.commercetools.api.models.message.QuoteRequestCreatedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.QuoteRequestCreatedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.QuoteRequestCustomerChangedMessagePayload) {
            return com.commercetools.api.models.message.QuoteRequestCustomerChangedMessagePayload.deepCopy(
                (com.commercetools.api.models.message.QuoteRequestCustomerChangedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.QuoteRequestDeletedMessagePayload) {
            return com.commercetools.api.models.message.QuoteRequestDeletedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.QuoteRequestDeletedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.QuoteRequestStateChangedMessagePayload) {
            return com.commercetools.api.models.message.QuoteRequestStateChangedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.QuoteRequestStateChangedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.QuoteRequestStateTransitionMessagePayload) {
            return com.commercetools.api.models.message.QuoteRequestStateTransitionMessagePayload.deepCopy(
                (com.commercetools.api.models.message.QuoteRequestStateTransitionMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.QuoteStateChangedMessagePayload) {
            return com.commercetools.api.models.message.QuoteStateChangedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.QuoteStateChangedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.QuoteStateTransitionMessagePayload) {
            return com.commercetools.api.models.message.QuoteStateTransitionMessagePayload
                    .deepCopy((com.commercetools.api.models.message.QuoteStateTransitionMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.ReviewCreatedMessagePayload) {
            return com.commercetools.api.models.message.ReviewCreatedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.ReviewCreatedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.ReviewRatingSetMessagePayload) {
            return com.commercetools.api.models.message.ReviewRatingSetMessagePayload
                    .deepCopy((com.commercetools.api.models.message.ReviewRatingSetMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.ReviewStateTransitionMessagePayload) {
            return com.commercetools.api.models.message.ReviewStateTransitionMessagePayload
                    .deepCopy((com.commercetools.api.models.message.ReviewStateTransitionMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.ShoppingListStoreSetMessagePayload) {
            return com.commercetools.api.models.message.ShoppingListStoreSetMessagePayload
                    .deepCopy((com.commercetools.api.models.message.ShoppingListStoreSetMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.StagedQuoteCreatedMessagePayload) {
            return com.commercetools.api.models.message.StagedQuoteCreatedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.StagedQuoteCreatedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.StagedQuoteDeletedMessagePayload) {
            return com.commercetools.api.models.message.StagedQuoteDeletedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.StagedQuoteDeletedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.StagedQuoteSellerCommentSetMessagePayload) {
            return com.commercetools.api.models.message.StagedQuoteSellerCommentSetMessagePayload.deepCopy(
                (com.commercetools.api.models.message.StagedQuoteSellerCommentSetMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.StagedQuoteStateChangedMessagePayload) {
            return com.commercetools.api.models.message.StagedQuoteStateChangedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.StagedQuoteStateChangedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.StagedQuoteStateTransitionMessagePayload) {
            return com.commercetools.api.models.message.StagedQuoteStateTransitionMessagePayload
                    .deepCopy((com.commercetools.api.models.message.StagedQuoteStateTransitionMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.StagedQuoteValidToSetMessagePayload) {
            return com.commercetools.api.models.message.StagedQuoteValidToSetMessagePayload
                    .deepCopy((com.commercetools.api.models.message.StagedQuoteValidToSetMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.StandalonePriceActiveChangedMessagePayload) {
            return com.commercetools.api.models.message.StandalonePriceActiveChangedMessagePayload.deepCopy(
                (com.commercetools.api.models.message.StandalonePriceActiveChangedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.StandalonePriceCreatedMessagePayload) {
            return com.commercetools.api.models.message.StandalonePriceCreatedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.StandalonePriceCreatedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.StandalonePriceDeletedMessagePayload) {
            return com.commercetools.api.models.message.StandalonePriceDeletedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.StandalonePriceDeletedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.StandalonePriceDiscountSetMessagePayload) {
            return com.commercetools.api.models.message.StandalonePriceDiscountSetMessagePayload
                    .deepCopy((com.commercetools.api.models.message.StandalonePriceDiscountSetMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.StandalonePriceExternalDiscountSetMessagePayload) {
            return com.commercetools.api.models.message.StandalonePriceExternalDiscountSetMessagePayload.deepCopy(
                (com.commercetools.api.models.message.StandalonePriceExternalDiscountSetMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.StandalonePriceKeySetMessagePayload) {
            return com.commercetools.api.models.message.StandalonePriceKeySetMessagePayload
                    .deepCopy((com.commercetools.api.models.message.StandalonePriceKeySetMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.StandalonePriceStagedChangesAppliedMessagePayload) {
            return com.commercetools.api.models.message.StandalonePriceStagedChangesAppliedMessagePayload.deepCopy(
                (com.commercetools.api.models.message.StandalonePriceStagedChangesAppliedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.StandalonePriceStagedChangesRemovedMessagePayload) {
            return com.commercetools.api.models.message.StandalonePriceStagedChangesRemovedMessagePayload.deepCopy(
                (com.commercetools.api.models.message.StandalonePriceStagedChangesRemovedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.StandalonePriceTierAddedMessagePayload) {
            return com.commercetools.api.models.message.StandalonePriceTierAddedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.StandalonePriceTierAddedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.StandalonePriceTierRemovedMessagePayload) {
            return com.commercetools.api.models.message.StandalonePriceTierRemovedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.StandalonePriceTierRemovedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.StandalonePriceTiersSetMessagePayload) {
            return com.commercetools.api.models.message.StandalonePriceTiersSetMessagePayload
                    .deepCopy((com.commercetools.api.models.message.StandalonePriceTiersSetMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.StandalonePriceValidFromAndUntilSetMessagePayload) {
            return com.commercetools.api.models.message.StandalonePriceValidFromAndUntilSetMessagePayload.deepCopy(
                (com.commercetools.api.models.message.StandalonePriceValidFromAndUntilSetMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.StandalonePriceValidFromSetMessagePayload) {
            return com.commercetools.api.models.message.StandalonePriceValidFromSetMessagePayload.deepCopy(
                (com.commercetools.api.models.message.StandalonePriceValidFromSetMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.StandalonePriceValidUntilSetMessagePayload) {
            return com.commercetools.api.models.message.StandalonePriceValidUntilSetMessagePayload.deepCopy(
                (com.commercetools.api.models.message.StandalonePriceValidUntilSetMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.StandalonePriceValueChangedMessagePayload) {
            return com.commercetools.api.models.message.StandalonePriceValueChangedMessagePayload.deepCopy(
                (com.commercetools.api.models.message.StandalonePriceValueChangedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.StoreCountriesChangedMessagePayload) {
            return com.commercetools.api.models.message.StoreCountriesChangedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.StoreCountriesChangedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.StoreCreatedMessagePayload) {
            return com.commercetools.api.models.message.StoreCreatedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.StoreCreatedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.StoreDeletedMessagePayload) {
            return com.commercetools.api.models.message.StoreDeletedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.StoreDeletedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.StoreDistributionChannelsChangedMessagePayload) {
            return com.commercetools.api.models.message.StoreDistributionChannelsChangedMessagePayload.deepCopy(
                (com.commercetools.api.models.message.StoreDistributionChannelsChangedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.StoreLanguagesChangedMessagePayload) {
            return com.commercetools.api.models.message.StoreLanguagesChangedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.StoreLanguagesChangedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.StoreNameSetMessagePayload) {
            return com.commercetools.api.models.message.StoreNameSetMessagePayload
                    .deepCopy((com.commercetools.api.models.message.StoreNameSetMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.StoreProductSelectionsChangedMessagePayload) {
            return com.commercetools.api.models.message.StoreProductSelectionsChangedMessagePayload.deepCopy(
                (com.commercetools.api.models.message.StoreProductSelectionsChangedMessagePayload) template);
        }
        if (template instanceof com.commercetools.api.models.message.StoreSupplyChannelsChangedMessagePayload) {
            return com.commercetools.api.models.message.StoreSupplyChannelsChangedMessagePayload
                    .deepCopy((com.commercetools.api.models.message.StoreSupplyChannelsChangedMessagePayload) template);
        }
        MessagePayloadImpl instance = new MessagePayloadImpl();
        return instance;
    }

    /**
     * builder for associateRoleBuyerAssignableChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.AssociateRoleBuyerAssignableChangedMessagePayloadBuilder associateRoleBuyerAssignableChangedBuilder() {
        return com.commercetools.api.models.message.AssociateRoleBuyerAssignableChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for associateRoleCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.AssociateRoleCreatedMessagePayloadBuilder associateRoleCreatedBuilder() {
        return com.commercetools.api.models.message.AssociateRoleCreatedMessagePayloadBuilder.of();
    }

    /**
     * builder for associateRoleDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.AssociateRoleDeletedMessagePayloadBuilder associateRoleDeletedBuilder() {
        return com.commercetools.api.models.message.AssociateRoleDeletedMessagePayloadBuilder.of();
    }

    /**
     * builder for associateRoleNameSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.AssociateRoleNameChangedMessagePayloadBuilder associateRoleNameSetBuilder() {
        return com.commercetools.api.models.message.AssociateRoleNameChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for associateRolePermissionAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.AssociateRolePermissionAddedMessagePayloadBuilder associateRolePermissionAddedBuilder() {
        return com.commercetools.api.models.message.AssociateRolePermissionAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for associateRolePermissionRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.AssociateRolePermissionRemovedMessagePayloadBuilder associateRolePermissionRemovedBuilder() {
        return com.commercetools.api.models.message.AssociateRolePermissionRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for associateRolePermissionsSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.AssociateRolePermissionsSetMessagePayloadBuilder associateRolePermissionsSetBuilder() {
        return com.commercetools.api.models.message.AssociateRolePermissionsSetMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitAddressAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAddressAddedMessagePayloadBuilder businessUnitAddressAddedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAddressAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitAddressChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAddressChangedMessagePayloadBuilder businessUnitAddressChangedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAddressChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitAddressRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAddressRemovedMessagePayloadBuilder businessUnitAddressRemovedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAddressRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitAssociateAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAssociateAddedMessagePayloadBuilder businessUnitAssociateAddedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAssociateAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitAssociateChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAssociateChangedMessagePayloadBuilder businessUnitAssociateChangedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAssociateChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitAssociateModeChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAssociateModeChangedMessagePayloadBuilder businessUnitAssociateModeChangedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAssociateModeChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitAssociateRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAssociateRemovedMessagePayloadBuilder businessUnitAssociateRemovedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAssociateRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitAssociatesSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAssociatesSetMessagePayloadBuilder businessUnitAssociatesSetBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAssociatesSetMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitBillingAddressAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitBillingAddressAddedMessagePayloadBuilder businessUnitBillingAddressAddedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitBillingAddressAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitBillingAddressRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitBillingAddressRemovedMessagePayloadBuilder businessUnitBillingAddressRemovedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitBillingAddressRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitContactEmailSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitContactEmailSetMessagePayloadBuilder businessUnitContactEmailSetBuilder() {
        return com.commercetools.api.models.message.BusinessUnitContactEmailSetMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitCreatedMessagePayloadBuilder businessUnitCreatedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitCreatedMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitDefaultBillingAddressSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitDefaultBillingAddressSetMessagePayloadBuilder businessUnitDefaultBillingAddressSetBuilder() {
        return com.commercetools.api.models.message.BusinessUnitDefaultBillingAddressSetMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitDefaultShippingAddressSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitDefaultShippingAddressSetMessagePayloadBuilder businessUnitDefaultShippingAddressSetBuilder() {
        return com.commercetools.api.models.message.BusinessUnitDefaultShippingAddressSetMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitDeletedMessagePayloadBuilder businessUnitDeletedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitDeletedMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitNameChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitNameChangedMessagePayloadBuilder businessUnitNameChangedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitNameChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitParentChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitParentChangedMessagePayloadBuilder businessUnitParentChangedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitParentChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitShippingAddressAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitShippingAddressAddedMessagePayloadBuilder businessUnitShippingAddressAddedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitShippingAddressAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitShippingAddressRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitShippingAddressRemovedMessagePayloadBuilder businessUnitShippingAddressRemovedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitShippingAddressRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitStatusChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitStatusChangedMessagePayloadBuilder businessUnitStatusChangedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitStatusChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitStoreAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitStoreAddedMessagePayloadBuilder businessUnitStoreAddedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitStoreAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitStoreModeChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitStoreModeChangedMessagePayloadBuilder businessUnitStoreModeChangedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitStoreModeChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitStoreRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitStoreRemovedMessagePayloadBuilder businessUnitStoreRemovedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitStoreRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for businessUnitStoresSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitStoresSetMessagePayloadBuilder businessUnitStoresSetBuilder() {
        return com.commercetools.api.models.message.BusinessUnitStoresSetMessagePayloadBuilder.of();
    }

    /**
     * builder for categoryCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CategoryCreatedMessagePayloadBuilder categoryCreatedBuilder() {
        return com.commercetools.api.models.message.CategoryCreatedMessagePayloadBuilder.of();
    }

    /**
     * builder for categorySlugChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CategorySlugChangedMessagePayloadBuilder categorySlugChangedBuilder() {
        return com.commercetools.api.models.message.CategorySlugChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for customLineItemStateTransition subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomLineItemStateTransitionMessagePayloadBuilder customLineItemStateTransitionBuilder() {
        return com.commercetools.api.models.message.CustomLineItemStateTransitionMessagePayloadBuilder.of();
    }

    /**
     * builder for customerAddressAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerAddressAddedMessagePayloadBuilder customerAddressAddedBuilder() {
        return com.commercetools.api.models.message.CustomerAddressAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for customerAddressChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerAddressChangedMessagePayloadBuilder customerAddressChangedBuilder() {
        return com.commercetools.api.models.message.CustomerAddressChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for customerAddressRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerAddressRemovedMessagePayloadBuilder customerAddressRemovedBuilder() {
        return com.commercetools.api.models.message.CustomerAddressRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for customerCompanyNameSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerCompanyNameSetMessagePayloadBuilder customerCompanyNameSetBuilder() {
        return com.commercetools.api.models.message.CustomerCompanyNameSetMessagePayloadBuilder.of();
    }

    /**
     * builder for customerCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerCreatedMessagePayloadBuilder customerCreatedBuilder() {
        return com.commercetools.api.models.message.CustomerCreatedMessagePayloadBuilder.of();
    }

    /**
     * builder for customerDateOfBirthSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerDateOfBirthSetMessagePayloadBuilder customerDateOfBirthSetBuilder() {
        return com.commercetools.api.models.message.CustomerDateOfBirthSetMessagePayloadBuilder.of();
    }

    /**
     * builder for customerDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerDeletedMessagePayloadBuilder customerDeletedBuilder() {
        return com.commercetools.api.models.message.CustomerDeletedMessagePayloadBuilder.of();
    }

    /**
     * builder for customerEmailChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerEmailChangedMessagePayloadBuilder customerEmailChangedBuilder() {
        return com.commercetools.api.models.message.CustomerEmailChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for customerEmailVerified subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerEmailVerifiedMessagePayloadBuilder customerEmailVerifiedBuilder() {
        return com.commercetools.api.models.message.CustomerEmailVerifiedMessagePayloadBuilder.of();
    }

    /**
     * builder for customerFirstNameSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerFirstNameSetMessagePayloadBuilder customerFirstNameSetBuilder() {
        return com.commercetools.api.models.message.CustomerFirstNameSetMessagePayloadBuilder.of();
    }

    /**
     * builder for customerGroupSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerGroupSetMessagePayloadBuilder customerGroupSetBuilder() {
        return com.commercetools.api.models.message.CustomerGroupSetMessagePayloadBuilder.of();
    }

    /**
     * builder for customerLastNameSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerLastNameSetMessagePayloadBuilder customerLastNameSetBuilder() {
        return com.commercetools.api.models.message.CustomerLastNameSetMessagePayloadBuilder.of();
    }

    /**
     * builder for customerPasswordUpdated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerPasswordUpdatedMessagePayloadBuilder customerPasswordUpdatedBuilder() {
        return com.commercetools.api.models.message.CustomerPasswordUpdatedMessagePayloadBuilder.of();
    }

    /**
     * builder for customerTitleSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerTitleSetMessagePayloadBuilder customerTitleSetBuilder() {
        return com.commercetools.api.models.message.CustomerTitleSetMessagePayloadBuilder.of();
    }

    /**
     * builder for deliveryAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.DeliveryAddedMessagePayloadBuilder deliveryAddedBuilder() {
        return com.commercetools.api.models.message.DeliveryAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for deliveryAddressSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.DeliveryAddressSetMessagePayloadBuilder deliveryAddressSetBuilder() {
        return com.commercetools.api.models.message.DeliveryAddressSetMessagePayloadBuilder.of();
    }

    /**
     * builder for deliveryItemsUpdated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.DeliveryItemsUpdatedMessagePayloadBuilder deliveryItemsUpdatedBuilder() {
        return com.commercetools.api.models.message.DeliveryItemsUpdatedMessagePayloadBuilder.of();
    }

    /**
     * builder for deliveryRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.DeliveryRemovedMessagePayloadBuilder deliveryRemovedBuilder() {
        return com.commercetools.api.models.message.DeliveryRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for inventoryEntryCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.InventoryEntryCreatedMessagePayloadBuilder inventoryEntryCreatedBuilder() {
        return com.commercetools.api.models.message.InventoryEntryCreatedMessagePayloadBuilder.of();
    }

    /**
     * builder for inventoryEntryDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.InventoryEntryDeletedMessagePayloadBuilder inventoryEntryDeletedBuilder() {
        return com.commercetools.api.models.message.InventoryEntryDeletedMessagePayloadBuilder.of();
    }

    /**
     * builder for inventoryEntryQuantitySet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.InventoryEntryQuantitySetMessagePayloadBuilder inventoryEntryQuantitySetBuilder() {
        return com.commercetools.api.models.message.InventoryEntryQuantitySetMessagePayloadBuilder.of();
    }

    /**
     * builder for lineItemStateTransition subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.LineItemStateTransitionMessagePayloadBuilder lineItemStateTransitionBuilder() {
        return com.commercetools.api.models.message.LineItemStateTransitionMessagePayloadBuilder.of();
    }

    /**
     * builder for orderBillingAddressSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderBillingAddressSetMessagePayloadBuilder orderBillingAddressSetBuilder() {
        return com.commercetools.api.models.message.OrderBillingAddressSetMessagePayloadBuilder.of();
    }

    /**
     * builder for orderCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCreatedMessagePayloadBuilder orderCreatedBuilder() {
        return com.commercetools.api.models.message.OrderCreatedMessagePayloadBuilder.of();
    }

    /**
     * builder for orderCustomFieldAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomFieldAddedMessagePayloadBuilder orderCustomFieldAddedBuilder() {
        return com.commercetools.api.models.message.OrderCustomFieldAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for orderCustomFieldChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomFieldChangedMessagePayloadBuilder orderCustomFieldChangedBuilder() {
        return com.commercetools.api.models.message.OrderCustomFieldChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for orderCustomFieldRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomFieldRemovedMessagePayloadBuilder orderCustomFieldRemovedBuilder() {
        return com.commercetools.api.models.message.OrderCustomFieldRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for orderCustomLineItemAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomLineItemAddedMessagePayloadBuilder orderCustomLineItemAddedBuilder() {
        return com.commercetools.api.models.message.OrderCustomLineItemAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for orderCustomLineItemDiscountSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomLineItemDiscountSetMessagePayloadBuilder orderCustomLineItemDiscountSetBuilder() {
        return com.commercetools.api.models.message.OrderCustomLineItemDiscountSetMessagePayloadBuilder.of();
    }

    /**
     * builder for orderCustomLineItemQuantityChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomLineItemQuantityChangedMessagePayloadBuilder orderCustomLineItemQuantityChangedBuilder() {
        return com.commercetools.api.models.message.OrderCustomLineItemQuantityChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for orderCustomLineItemRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomLineItemRemovedMessagePayloadBuilder orderCustomLineItemRemovedBuilder() {
        return com.commercetools.api.models.message.OrderCustomLineItemRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for orderCustomTypeRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomTypeRemovedMessagePayloadBuilder orderCustomTypeRemovedBuilder() {
        return com.commercetools.api.models.message.OrderCustomTypeRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for orderCustomTypeSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomTypeSetMessagePayloadBuilder orderCustomTypeSetBuilder() {
        return com.commercetools.api.models.message.OrderCustomTypeSetMessagePayloadBuilder.of();
    }

    /**
     * builder for orderCustomerEmailSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomerEmailSetMessagePayloadBuilder orderCustomerEmailSetBuilder() {
        return com.commercetools.api.models.message.OrderCustomerEmailSetMessagePayloadBuilder.of();
    }

    /**
     * builder for orderCustomerGroupSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomerGroupSetMessagePayloadBuilder orderCustomerGroupSetBuilder() {
        return com.commercetools.api.models.message.OrderCustomerGroupSetMessagePayloadBuilder.of();
    }

    /**
     * builder for orderCustomerSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomerSetMessagePayloadBuilder orderCustomerSetBuilder() {
        return com.commercetools.api.models.message.OrderCustomerSetMessagePayloadBuilder.of();
    }

    /**
     * builder for orderDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderDeletedMessagePayloadBuilder orderDeletedBuilder() {
        return com.commercetools.api.models.message.OrderDeletedMessagePayloadBuilder.of();
    }

    /**
     * builder for orderDiscountCodeAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderDiscountCodeAddedMessagePayloadBuilder orderDiscountCodeAddedBuilder() {
        return com.commercetools.api.models.message.OrderDiscountCodeAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for orderDiscountCodeRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderDiscountCodeRemovedMessagePayloadBuilder orderDiscountCodeRemovedBuilder() {
        return com.commercetools.api.models.message.OrderDiscountCodeRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for orderDiscountCodeStateSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderDiscountCodeStateSetMessagePayloadBuilder orderDiscountCodeStateSetBuilder() {
        return com.commercetools.api.models.message.OrderDiscountCodeStateSetMessagePayloadBuilder.of();
    }

    /**
     * builder for orderEditApplied subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderEditAppliedMessagePayloadBuilder orderEditAppliedBuilder() {
        return com.commercetools.api.models.message.OrderEditAppliedMessagePayloadBuilder.of();
    }

    /**
     * builder for orderImported subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderImportedMessagePayloadBuilder orderImportedBuilder() {
        return com.commercetools.api.models.message.OrderImportedMessagePayloadBuilder.of();
    }

    /**
     * builder for orderLineItemAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderLineItemAddedMessagePayloadBuilder orderLineItemAddedBuilder() {
        return com.commercetools.api.models.message.OrderLineItemAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for orderLineItemDiscountSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderLineItemDiscountSetMessagePayloadBuilder orderLineItemDiscountSetBuilder() {
        return com.commercetools.api.models.message.OrderLineItemDiscountSetMessagePayloadBuilder.of();
    }

    /**
     * builder for orderLineItemDistributionChannelSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderLineItemDistributionChannelSetMessagePayloadBuilder orderLineItemDistributionChannelSetBuilder() {
        return com.commercetools.api.models.message.OrderLineItemDistributionChannelSetMessagePayloadBuilder.of();
    }

    /**
     * builder for orderLineItemRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderLineItemRemovedMessagePayloadBuilder orderLineItemRemovedBuilder() {
        return com.commercetools.api.models.message.OrderLineItemRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for orderPaymentAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderPaymentAddedMessagePayloadBuilder orderPaymentAddedBuilder() {
        return com.commercetools.api.models.message.OrderPaymentAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for orderPaymentStateChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderPaymentStateChangedMessagePayloadBuilder orderPaymentStateChangedBuilder() {
        return com.commercetools.api.models.message.OrderPaymentStateChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for orderPurchaseOrderNumberSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderPurchaseOrderNumberSetMessagePayloadBuilder orderPurchaseOrderNumberSetBuilder() {
        return com.commercetools.api.models.message.OrderPurchaseOrderNumberSetMessagePayloadBuilder.of();
    }

    /**
     * builder for orderReturnShipmentStateChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderReturnShipmentStateChangedMessagePayloadBuilder orderReturnShipmentStateChangedBuilder() {
        return com.commercetools.api.models.message.OrderReturnShipmentStateChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for orderShipmentStateChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderShipmentStateChangedMessagePayloadBuilder orderShipmentStateChangedBuilder() {
        return com.commercetools.api.models.message.OrderShipmentStateChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for orderShippingAddressSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderShippingAddressSetMessagePayloadBuilder orderShippingAddressSetBuilder() {
        return com.commercetools.api.models.message.OrderShippingAddressSetMessagePayloadBuilder.of();
    }

    /**
     * builder for orderShippingInfoSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderShippingInfoSetMessagePayloadBuilder orderShippingInfoSetBuilder() {
        return com.commercetools.api.models.message.OrderShippingInfoSetMessagePayloadBuilder.of();
    }

    /**
     * builder for orderShippingRateInputSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderShippingRateInputSetMessagePayloadBuilder orderShippingRateInputSetBuilder() {
        return com.commercetools.api.models.message.OrderShippingRateInputSetMessagePayloadBuilder.of();
    }

    /**
     * builder for orderStateChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderStateChangedMessagePayloadBuilder orderStateChangedBuilder() {
        return com.commercetools.api.models.message.OrderStateChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for orderStateTransition subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderStateTransitionMessagePayloadBuilder orderStateTransitionBuilder() {
        return com.commercetools.api.models.message.OrderStateTransitionMessagePayloadBuilder.of();
    }

    /**
     * builder for orderStoreSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderStoreSetMessagePayloadBuilder orderStoreSetBuilder() {
        return com.commercetools.api.models.message.OrderStoreSetMessagePayloadBuilder.of();
    }

    /**
     * builder for parcelAddedToDelivery subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ParcelAddedToDeliveryMessagePayloadBuilder parcelAddedToDeliveryBuilder() {
        return com.commercetools.api.models.message.ParcelAddedToDeliveryMessagePayloadBuilder.of();
    }

    /**
     * builder for parcelItemsUpdated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ParcelItemsUpdatedMessagePayloadBuilder parcelItemsUpdatedBuilder() {
        return com.commercetools.api.models.message.ParcelItemsUpdatedMessagePayloadBuilder.of();
    }

    /**
     * builder for parcelMeasurementsUpdated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ParcelMeasurementsUpdatedMessagePayloadBuilder parcelMeasurementsUpdatedBuilder() {
        return com.commercetools.api.models.message.ParcelMeasurementsUpdatedMessagePayloadBuilder.of();
    }

    /**
     * builder for parcelRemovedFromDelivery subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ParcelRemovedFromDeliveryMessagePayloadBuilder parcelRemovedFromDeliveryBuilder() {
        return com.commercetools.api.models.message.ParcelRemovedFromDeliveryMessagePayloadBuilder.of();
    }

    /**
     * builder for parcelTrackingDataUpdated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ParcelTrackingDataUpdatedMessagePayloadBuilder parcelTrackingDataUpdatedBuilder() {
        return com.commercetools.api.models.message.ParcelTrackingDataUpdatedMessagePayloadBuilder.of();
    }

    /**
     * builder for paymentCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentCreatedMessagePayloadBuilder paymentCreatedBuilder() {
        return com.commercetools.api.models.message.PaymentCreatedMessagePayloadBuilder.of();
    }

    /**
     * builder for paymentInteractionAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentInteractionAddedMessagePayloadBuilder paymentInteractionAddedBuilder() {
        return com.commercetools.api.models.message.PaymentInteractionAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for paymentStatusInterfaceCodeSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentStatusInterfaceCodeSetMessagePayloadBuilder paymentStatusInterfaceCodeSetBuilder() {
        return com.commercetools.api.models.message.PaymentStatusInterfaceCodeSetMessagePayloadBuilder.of();
    }

    /**
     * builder for paymentStatusStateTransition subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentStatusStateTransitionMessagePayloadBuilder paymentStatusStateTransitionBuilder() {
        return com.commercetools.api.models.message.PaymentStatusStateTransitionMessagePayloadBuilder.of();
    }

    /**
     * builder for paymentTransactionAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentTransactionAddedMessagePayloadBuilder paymentTransactionAddedBuilder() {
        return com.commercetools.api.models.message.PaymentTransactionAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for paymentTransactionStateChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentTransactionStateChangedMessagePayloadBuilder paymentTransactionStateChangedBuilder() {
        return com.commercetools.api.models.message.PaymentTransactionStateChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for productAddedToCategory subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductAddedToCategoryMessagePayloadBuilder productAddedToCategoryBuilder() {
        return com.commercetools.api.models.message.ProductAddedToCategoryMessagePayloadBuilder.of();
    }

    /**
     * builder for productCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductCreatedMessagePayloadBuilder productCreatedBuilder() {
        return com.commercetools.api.models.message.ProductCreatedMessagePayloadBuilder.of();
    }

    /**
     * builder for productDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductDeletedMessagePayloadBuilder productDeletedBuilder() {
        return com.commercetools.api.models.message.ProductDeletedMessagePayloadBuilder.of();
    }

    /**
     * builder for productImageAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductImageAddedMessagePayloadBuilder productImageAddedBuilder() {
        return com.commercetools.api.models.message.ProductImageAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for productPriceAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPriceAddedMessagePayloadBuilder productPriceAddedBuilder() {
        return com.commercetools.api.models.message.ProductPriceAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for productPriceChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPriceChangedMessagePayloadBuilder productPriceChangedBuilder() {
        return com.commercetools.api.models.message.ProductPriceChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for productPriceDiscountsSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPriceDiscountsSetMessagePayloadBuilder productPriceDiscountsSetBuilder() {
        return com.commercetools.api.models.message.ProductPriceDiscountsSetMessagePayloadBuilder.of();
    }

    /**
     * builder for productPriceExternalDiscountSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPriceExternalDiscountSetMessagePayloadBuilder productPriceExternalDiscountSetBuilder() {
        return com.commercetools.api.models.message.ProductPriceExternalDiscountSetMessagePayloadBuilder.of();
    }

    /**
     * builder for productPriceKeySet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPriceKeySetMessagePayloadBuilder productPriceKeySetBuilder() {
        return com.commercetools.api.models.message.ProductPriceKeySetMessagePayloadBuilder.of();
    }

    /**
     * builder for productPriceModeSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPriceModeSetMessagePayloadBuilder productPriceModeSetBuilder() {
        return com.commercetools.api.models.message.ProductPriceModeSetMessagePayloadBuilder.of();
    }

    /**
     * builder for productPriceRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPriceRemovedMessagePayloadBuilder productPriceRemovedBuilder() {
        return com.commercetools.api.models.message.ProductPriceRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for productPricesSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPricesSetMessagePayloadBuilder productPricesSetBuilder() {
        return com.commercetools.api.models.message.ProductPricesSetMessagePayloadBuilder.of();
    }

    /**
     * builder for productPublished subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPublishedMessagePayloadBuilder productPublishedBuilder() {
        return com.commercetools.api.models.message.ProductPublishedMessagePayloadBuilder.of();
    }

    /**
     * builder for productRemovedFromCategory subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductRemovedFromCategoryMessagePayloadBuilder productRemovedFromCategoryBuilder() {
        return com.commercetools.api.models.message.ProductRemovedFromCategoryMessagePayloadBuilder.of();
    }

    /**
     * builder for productRevertedStagedChanges subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductRevertedStagedChangesMessagePayloadBuilder productRevertedStagedChangesBuilder() {
        return com.commercetools.api.models.message.ProductRevertedStagedChangesMessagePayloadBuilder.of();
    }

    /**
     * builder for productSelectionCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductSelectionCreatedMessagePayloadBuilder productSelectionCreatedBuilder() {
        return com.commercetools.api.models.message.ProductSelectionCreatedMessagePayloadBuilder.of();
    }

    /**
     * builder for productSelectionDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductSelectionDeletedMessagePayloadBuilder productSelectionDeletedBuilder() {
        return com.commercetools.api.models.message.ProductSelectionDeletedMessagePayloadBuilder.of();
    }

    /**
     * builder for productSelectionProductAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductSelectionProductAddedMessagePayloadBuilder productSelectionProductAddedBuilder() {
        return com.commercetools.api.models.message.ProductSelectionProductAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for productSelectionProductExcluded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductSelectionProductExcludedMessagePayloadBuilder productSelectionProductExcludedBuilder() {
        return com.commercetools.api.models.message.ProductSelectionProductExcludedMessagePayloadBuilder.of();
    }

    /**
     * builder for productSelectionProductRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductSelectionProductRemovedMessagePayloadBuilder productSelectionProductRemovedBuilder() {
        return com.commercetools.api.models.message.ProductSelectionProductRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for productSelectionVariantExclusionChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductSelectionVariantExclusionChangedMessagePayloadBuilder productSelectionVariantExclusionChangedBuilder() {
        return com.commercetools.api.models.message.ProductSelectionVariantExclusionChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for productSelectionVariantSelectionChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductSelectionVariantSelectionChangedMessagePayloadBuilder productSelectionVariantSelectionChangedBuilder() {
        return com.commercetools.api.models.message.ProductSelectionVariantSelectionChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for productSlugChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductSlugChangedMessagePayloadBuilder productSlugChangedBuilder() {
        return com.commercetools.api.models.message.ProductSlugChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for productStateTransition subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductStateTransitionMessagePayloadBuilder productStateTransitionBuilder() {
        return com.commercetools.api.models.message.ProductStateTransitionMessagePayloadBuilder.of();
    }

    /**
     * builder for productUnpublished subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductUnpublishedMessagePayloadBuilder productUnpublishedBuilder() {
        return com.commercetools.api.models.message.ProductUnpublishedMessagePayloadBuilder.of();
    }

    /**
     * builder for productVariantAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductVariantAddedMessagePayloadBuilder productVariantAddedBuilder() {
        return com.commercetools.api.models.message.ProductVariantAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for productVariantDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductVariantDeletedMessagePayloadBuilder productVariantDeletedBuilder() {
        return com.commercetools.api.models.message.ProductVariantDeletedMessagePayloadBuilder.of();
    }

    /**
     * builder for quoteCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteCreatedMessagePayloadBuilder quoteCreatedBuilder() {
        return com.commercetools.api.models.message.QuoteCreatedMessagePayloadBuilder.of();
    }

    /**
     * builder for quoteCustomerChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteCustomerChangedMessagePayloadBuilder quoteCustomerChangedBuilder() {
        return com.commercetools.api.models.message.QuoteCustomerChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for quoteDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteDeletedMessagePayloadBuilder quoteDeletedBuilder() {
        return com.commercetools.api.models.message.QuoteDeletedMessagePayloadBuilder.of();
    }

    /**
     * builder for quoteRenegotiationRequested subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteRenegotiationRequestedMessagePayloadBuilder quoteRenegotiationRequestedBuilder() {
        return com.commercetools.api.models.message.QuoteRenegotiationRequestedMessagePayloadBuilder.of();
    }

    /**
     * builder for quoteRequestCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteRequestCreatedMessagePayloadBuilder quoteRequestCreatedBuilder() {
        return com.commercetools.api.models.message.QuoteRequestCreatedMessagePayloadBuilder.of();
    }

    /**
     * builder for quoteRequestCustomerChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteRequestCustomerChangedMessagePayloadBuilder quoteRequestCustomerChangedBuilder() {
        return com.commercetools.api.models.message.QuoteRequestCustomerChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for quoteRequestDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteRequestDeletedMessagePayloadBuilder quoteRequestDeletedBuilder() {
        return com.commercetools.api.models.message.QuoteRequestDeletedMessagePayloadBuilder.of();
    }

    /**
     * builder for quoteRequestStateChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteRequestStateChangedMessagePayloadBuilder quoteRequestStateChangedBuilder() {
        return com.commercetools.api.models.message.QuoteRequestStateChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for quoteRequestStateTransition subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteRequestStateTransitionMessagePayloadBuilder quoteRequestStateTransitionBuilder() {
        return com.commercetools.api.models.message.QuoteRequestStateTransitionMessagePayloadBuilder.of();
    }

    /**
     * builder for quoteStateChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteStateChangedMessagePayloadBuilder quoteStateChangedBuilder() {
        return com.commercetools.api.models.message.QuoteStateChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for quoteStateTransition subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteStateTransitionMessagePayloadBuilder quoteStateTransitionBuilder() {
        return com.commercetools.api.models.message.QuoteStateTransitionMessagePayloadBuilder.of();
    }

    /**
     * builder for returnInfoAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ReturnInfoAddedMessagePayloadBuilder returnInfoAddedBuilder() {
        return com.commercetools.api.models.message.ReturnInfoAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for returnInfoSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ReturnInfoSetMessagePayloadBuilder returnInfoSetBuilder() {
        return com.commercetools.api.models.message.ReturnInfoSetMessagePayloadBuilder.of();
    }

    /**
     * builder for reviewCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ReviewCreatedMessagePayloadBuilder reviewCreatedBuilder() {
        return com.commercetools.api.models.message.ReviewCreatedMessagePayloadBuilder.of();
    }

    /**
     * builder for reviewRatingSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ReviewRatingSetMessagePayloadBuilder reviewRatingSetBuilder() {
        return com.commercetools.api.models.message.ReviewRatingSetMessagePayloadBuilder.of();
    }

    /**
     * builder for reviewStateTransition subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ReviewStateTransitionMessagePayloadBuilder reviewStateTransitionBuilder() {
        return com.commercetools.api.models.message.ReviewStateTransitionMessagePayloadBuilder.of();
    }

    /**
     * builder for shoppingListStoreSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ShoppingListStoreSetMessagePayloadBuilder shoppingListStoreSetBuilder() {
        return com.commercetools.api.models.message.ShoppingListStoreSetMessagePayloadBuilder.of();
    }

    /**
     * builder for stagedQuoteCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StagedQuoteCreatedMessagePayloadBuilder stagedQuoteCreatedBuilder() {
        return com.commercetools.api.models.message.StagedQuoteCreatedMessagePayloadBuilder.of();
    }

    /**
     * builder for stagedQuoteDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StagedQuoteDeletedMessagePayloadBuilder stagedQuoteDeletedBuilder() {
        return com.commercetools.api.models.message.StagedQuoteDeletedMessagePayloadBuilder.of();
    }

    /**
     * builder for stagedQuoteSellerCommentSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StagedQuoteSellerCommentSetMessagePayloadBuilder stagedQuoteSellerCommentSetBuilder() {
        return com.commercetools.api.models.message.StagedQuoteSellerCommentSetMessagePayloadBuilder.of();
    }

    /**
     * builder for stagedQuoteStateChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StagedQuoteStateChangedMessagePayloadBuilder stagedQuoteStateChangedBuilder() {
        return com.commercetools.api.models.message.StagedQuoteStateChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for stagedQuoteStateTransition subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StagedQuoteStateTransitionMessagePayloadBuilder stagedQuoteStateTransitionBuilder() {
        return com.commercetools.api.models.message.StagedQuoteStateTransitionMessagePayloadBuilder.of();
    }

    /**
     * builder for stagedQuoteValidToSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StagedQuoteValidToSetMessagePayloadBuilder stagedQuoteValidToSetBuilder() {
        return com.commercetools.api.models.message.StagedQuoteValidToSetMessagePayloadBuilder.of();
    }

    /**
     * builder for standalonePriceActiveChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceActiveChangedMessagePayloadBuilder standalonePriceActiveChangedBuilder() {
        return com.commercetools.api.models.message.StandalonePriceActiveChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for standalonePriceCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceCreatedMessagePayloadBuilder standalonePriceCreatedBuilder() {
        return com.commercetools.api.models.message.StandalonePriceCreatedMessagePayloadBuilder.of();
    }

    /**
     * builder for standalonePriceDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceDeletedMessagePayloadBuilder standalonePriceDeletedBuilder() {
        return com.commercetools.api.models.message.StandalonePriceDeletedMessagePayloadBuilder.of();
    }

    /**
     * builder for standalonePriceDiscountSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceDiscountSetMessagePayloadBuilder standalonePriceDiscountSetBuilder() {
        return com.commercetools.api.models.message.StandalonePriceDiscountSetMessagePayloadBuilder.of();
    }

    /**
     * builder for standalonePriceExternalDiscountSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceExternalDiscountSetMessagePayloadBuilder standalonePriceExternalDiscountSetBuilder() {
        return com.commercetools.api.models.message.StandalonePriceExternalDiscountSetMessagePayloadBuilder.of();
    }

    /**
     * builder for standalonePriceKeySet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceKeySetMessagePayloadBuilder standalonePriceKeySetBuilder() {
        return com.commercetools.api.models.message.StandalonePriceKeySetMessagePayloadBuilder.of();
    }

    /**
     * builder for standalonePriceStagedChangesApplied subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceStagedChangesAppliedMessagePayloadBuilder standalonePriceStagedChangesAppliedBuilder() {
        return com.commercetools.api.models.message.StandalonePriceStagedChangesAppliedMessagePayloadBuilder.of();
    }

    /**
     * builder for standalonePriceStagedChangesRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceStagedChangesRemovedMessagePayloadBuilder standalonePriceStagedChangesRemovedBuilder() {
        return com.commercetools.api.models.message.StandalonePriceStagedChangesRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for standalonePriceTierAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceTierAddedMessagePayloadBuilder standalonePriceTierAddedBuilder() {
        return com.commercetools.api.models.message.StandalonePriceTierAddedMessagePayloadBuilder.of();
    }

    /**
     * builder for standalonePriceTierRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceTierRemovedMessagePayloadBuilder standalonePriceTierRemovedBuilder() {
        return com.commercetools.api.models.message.StandalonePriceTierRemovedMessagePayloadBuilder.of();
    }

    /**
     * builder for standalonePriceTiersSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceTiersSetMessagePayloadBuilder standalonePriceTiersSetBuilder() {
        return com.commercetools.api.models.message.StandalonePriceTiersSetMessagePayloadBuilder.of();
    }

    /**
     * builder for standalonePriceValidFromAndUntilSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceValidFromAndUntilSetMessagePayloadBuilder standalonePriceValidFromAndUntilSetBuilder() {
        return com.commercetools.api.models.message.StandalonePriceValidFromAndUntilSetMessagePayloadBuilder.of();
    }

    /**
     * builder for standalonePriceValidFromSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceValidFromSetMessagePayloadBuilder standalonePriceValidFromSetBuilder() {
        return com.commercetools.api.models.message.StandalonePriceValidFromSetMessagePayloadBuilder.of();
    }

    /**
     * builder for standalonePriceValidUntilSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceValidUntilSetMessagePayloadBuilder standalonePriceValidUntilSetBuilder() {
        return com.commercetools.api.models.message.StandalonePriceValidUntilSetMessagePayloadBuilder.of();
    }

    /**
     * builder for standalonePriceValueChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceValueChangedMessagePayloadBuilder standalonePriceValueChangedBuilder() {
        return com.commercetools.api.models.message.StandalonePriceValueChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for storeCountriesChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StoreCountriesChangedMessagePayloadBuilder storeCountriesChangedBuilder() {
        return com.commercetools.api.models.message.StoreCountriesChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for storeCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StoreCreatedMessagePayloadBuilder storeCreatedBuilder() {
        return com.commercetools.api.models.message.StoreCreatedMessagePayloadBuilder.of();
    }

    /**
     * builder for storeDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StoreDeletedMessagePayloadBuilder storeDeletedBuilder() {
        return com.commercetools.api.models.message.StoreDeletedMessagePayloadBuilder.of();
    }

    /**
     * builder for storeDistributionChannelsChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StoreDistributionChannelsChangedMessagePayloadBuilder storeDistributionChannelsChangedBuilder() {
        return com.commercetools.api.models.message.StoreDistributionChannelsChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for storeLanguagesChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StoreLanguagesChangedMessagePayloadBuilder storeLanguagesChangedBuilder() {
        return com.commercetools.api.models.message.StoreLanguagesChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for storeNameSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StoreNameSetMessagePayloadBuilder storeNameSetBuilder() {
        return com.commercetools.api.models.message.StoreNameSetMessagePayloadBuilder.of();
    }

    /**
     * builder for storeProductSelectionsChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StoreProductSelectionsChangedMessagePayloadBuilder storeProductSelectionsChangedBuilder() {
        return com.commercetools.api.models.message.StoreProductSelectionsChangedMessagePayloadBuilder.of();
    }

    /**
     * builder for storeSupplyChannelsChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StoreSupplyChannelsChangedMessagePayloadBuilder storeSupplyChannelsChangedBuilder() {
        return com.commercetools.api.models.message.StoreSupplyChannelsChangedMessagePayloadBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMessagePayload(Function<MessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<MessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<MessagePayload>";
            }
        };
    }
}
