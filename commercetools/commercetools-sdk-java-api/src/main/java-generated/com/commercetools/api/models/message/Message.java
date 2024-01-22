
package com.commercetools.api.models.message;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Base representation of a Message containing common fields to all Message Types.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Message message = Message.approvalFlowApprovedBuilder()
 *             id("{id}")
 *             version(0.3)
 *             createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             sequenceNumber(0.3)
 *             resource(resourceBuilder -> resourceBuilder)
 *             resourceVersion(0.3)
 *             associate(associateBuilder -> associateBuilder)
 *             order(orderBuilder -> orderBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ApprovalFlowApprovedMessageImpl.class, name = ApprovalFlowApprovedMessage.APPROVAL_FLOW_APPROVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ApprovalFlowCompletedMessageImpl.class, name = ApprovalFlowCompletedMessage.APPROVAL_FLOW_COMPLETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ApprovalFlowCreatedMessageImpl.class, name = ApprovalFlowCreatedMessage.APPROVAL_FLOW_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ApprovalFlowRejectedMessageImpl.class, name = ApprovalFlowRejectedMessage.APPROVAL_FLOW_REJECTED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ApprovalRuleApproversSetMessageImpl.class, name = ApprovalRuleApproversSetMessage.APPROVAL_RULE_APPROVERS_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ApprovalRuleCreatedMessageImpl.class, name = ApprovalRuleCreatedMessage.APPROVAL_RULE_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ApprovalRuleDescriptionSetMessageImpl.class, name = ApprovalRuleDescriptionSetMessage.APPROVAL_RULE_DESCRIPTION_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ApprovalRuleKeySetMessageImpl.class, name = ApprovalRuleKeySetMessage.APPROVAL_RULE_KEY_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ApprovalRuleNameSetMessageImpl.class, name = ApprovalRuleNameSetMessage.APPROVAL_RULE_NAME_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ApprovalRulePredicateSetMessageImpl.class, name = ApprovalRulePredicateSetMessage.APPROVAL_RULE_PREDICATE_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ApprovalRuleRequestersSetMessageImpl.class, name = ApprovalRuleRequestersSetMessage.APPROVAL_RULE_REQUESTERS_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ApprovalRuleStatusSetMessageImpl.class, name = ApprovalRuleStatusSetMessage.APPROVAL_RULE_STATUS_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.AssociateRoleBuyerAssignableChangedMessageImpl.class, name = AssociateRoleBuyerAssignableChangedMessage.ASSOCIATE_ROLE_BUYER_ASSIGNABLE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.AssociateRoleCreatedMessageImpl.class, name = AssociateRoleCreatedMessage.ASSOCIATE_ROLE_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.AssociateRoleDeletedMessageImpl.class, name = AssociateRoleDeletedMessage.ASSOCIATE_ROLE_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.AssociateRoleNameChangedMessageImpl.class, name = AssociateRoleNameChangedMessage.ASSOCIATE_ROLE_NAME_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.AssociateRolePermissionAddedMessageImpl.class, name = AssociateRolePermissionAddedMessage.ASSOCIATE_ROLE_PERMISSION_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.AssociateRolePermissionRemovedMessageImpl.class, name = AssociateRolePermissionRemovedMessage.ASSOCIATE_ROLE_PERMISSION_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.AssociateRolePermissionsSetMessageImpl.class, name = AssociateRolePermissionsSetMessage.ASSOCIATE_ROLE_PERMISSIONS_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitAddressAddedMessageImpl.class, name = BusinessUnitAddressAddedMessage.BUSINESS_UNIT_ADDRESS_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitAddressChangedMessageImpl.class, name = BusinessUnitAddressChangedMessage.BUSINESS_UNIT_ADDRESS_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitAddressCustomFieldAddedMessageImpl.class, name = BusinessUnitAddressCustomFieldAddedMessage.BUSINESS_UNIT_ADDRESS_CUSTOM_FIELD_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitAddressCustomFieldChangedMessageImpl.class, name = BusinessUnitAddressCustomFieldChangedMessage.BUSINESS_UNIT_ADDRESS_CUSTOM_FIELD_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitAddressCustomFieldRemovedMessageImpl.class, name = BusinessUnitAddressCustomFieldRemovedMessage.BUSINESS_UNIT_ADDRESS_CUSTOM_FIELD_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitAddressCustomTypeRemovedMessageImpl.class, name = BusinessUnitAddressCustomTypeRemovedMessage.BUSINESS_UNIT_ADDRESS_CUSTOM_TYPE_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitAddressCustomTypeSetMessageImpl.class, name = BusinessUnitAddressCustomTypeSetMessage.BUSINESS_UNIT_ADDRESS_CUSTOM_TYPE_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitAddressRemovedMessageImpl.class, name = BusinessUnitAddressRemovedMessage.BUSINESS_UNIT_ADDRESS_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitAssociateAddedMessageImpl.class, name = BusinessUnitAssociateAddedMessage.BUSINESS_UNIT_ASSOCIATE_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitAssociateChangedMessageImpl.class, name = BusinessUnitAssociateChangedMessage.BUSINESS_UNIT_ASSOCIATE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitAssociateModeChangedMessageImpl.class, name = BusinessUnitAssociateModeChangedMessage.BUSINESS_UNIT_ASSOCIATE_MODE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitAssociateRemovedMessageImpl.class, name = BusinessUnitAssociateRemovedMessage.BUSINESS_UNIT_ASSOCIATE_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitAssociatesSetMessageImpl.class, name = BusinessUnitAssociatesSetMessage.BUSINESS_UNIT_ASSOCIATES_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitBillingAddressAddedMessageImpl.class, name = BusinessUnitBillingAddressAddedMessage.BUSINESS_UNIT_BILLING_ADDRESS_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitBillingAddressRemovedMessageImpl.class, name = BusinessUnitBillingAddressRemovedMessage.BUSINESS_UNIT_BILLING_ADDRESS_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitContactEmailSetMessageImpl.class, name = BusinessUnitContactEmailSetMessage.BUSINESS_UNIT_CONTACT_EMAIL_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitCreatedMessageImpl.class, name = BusinessUnitCreatedMessage.BUSINESS_UNIT_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitCustomFieldAddedMessageImpl.class, name = BusinessUnitCustomFieldAddedMessage.BUSINESS_UNIT_CUSTOM_FIELD_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitCustomFieldChangedMessageImpl.class, name = BusinessUnitCustomFieldChangedMessage.BUSINESS_UNIT_CUSTOM_FIELD_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitCustomFieldRemovedMessageImpl.class, name = BusinessUnitCustomFieldRemovedMessage.BUSINESS_UNIT_CUSTOM_FIELD_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitCustomTypeRemovedMessageImpl.class, name = BusinessUnitCustomTypeRemovedMessage.BUSINESS_UNIT_CUSTOM_TYPE_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitCustomTypeSetMessageImpl.class, name = BusinessUnitCustomTypeSetMessage.BUSINESS_UNIT_CUSTOM_TYPE_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitDefaultBillingAddressSetMessageImpl.class, name = BusinessUnitDefaultBillingAddressSetMessage.BUSINESS_UNIT_DEFAULT_BILLING_ADDRESS_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitDefaultShippingAddressSetMessageImpl.class, name = BusinessUnitDefaultShippingAddressSetMessage.BUSINESS_UNIT_DEFAULT_SHIPPING_ADDRESS_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitDeletedMessageImpl.class, name = BusinessUnitDeletedMessage.BUSINESS_UNIT_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitNameChangedMessageImpl.class, name = BusinessUnitNameChangedMessage.BUSINESS_UNIT_NAME_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitParentChangedMessageImpl.class, name = BusinessUnitParentChangedMessage.BUSINESS_UNIT_PARENT_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitShippingAddressAddedMessageImpl.class, name = BusinessUnitShippingAddressAddedMessage.BUSINESS_UNIT_SHIPPING_ADDRESS_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitShippingAddressRemovedMessageImpl.class, name = BusinessUnitShippingAddressRemovedMessage.BUSINESS_UNIT_SHIPPING_ADDRESS_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitStatusChangedMessageImpl.class, name = BusinessUnitStatusChangedMessage.BUSINESS_UNIT_STATUS_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitStoreAddedMessageImpl.class, name = BusinessUnitStoreAddedMessage.BUSINESS_UNIT_STORE_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitStoreModeChangedMessageImpl.class, name = BusinessUnitStoreModeChangedMessage.BUSINESS_UNIT_STORE_MODE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitStoreRemovedMessageImpl.class, name = BusinessUnitStoreRemovedMessage.BUSINESS_UNIT_STORE_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.BusinessUnitStoresSetMessageImpl.class, name = BusinessUnitStoresSetMessage.BUSINESS_UNIT_STORES_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CartDiscountCreatedMessageImpl.class, name = CartDiscountCreatedMessage.CART_DISCOUNT_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CartDiscountDeletedMessageImpl.class, name = CartDiscountDeletedMessage.CART_DISCOUNT_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CartDiscountStoreAddedMessageImpl.class, name = CartDiscountStoreAddedMessage.CART_DISCOUNT_STORE_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CartDiscountStoreRemovedMessageImpl.class, name = CartDiscountStoreRemovedMessage.CART_DISCOUNT_STORE_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CartDiscountStoresSetMessageImpl.class, name = CartDiscountStoresSetMessage.CART_DISCOUNT_STORES_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CategoryCreatedMessageImpl.class, name = CategoryCreatedMessage.CATEGORY_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CategorySlugChangedMessageImpl.class, name = CategorySlugChangedMessage.CATEGORY_SLUG_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomLineItemStateTransitionMessageImpl.class, name = CustomLineItemStateTransitionMessage.CUSTOM_LINE_ITEM_STATE_TRANSITION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerAddressAddedMessageImpl.class, name = CustomerAddressAddedMessage.CUSTOMER_ADDRESS_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerAddressChangedMessageImpl.class, name = CustomerAddressChangedMessage.CUSTOMER_ADDRESS_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerAddressCustomFieldAddedMessageImpl.class, name = CustomerAddressCustomFieldAddedMessage.CUSTOMER_ADDRESS_CUSTOM_FIELD_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerAddressCustomFieldChangedMessageImpl.class, name = CustomerAddressCustomFieldChangedMessage.CUSTOMER_ADDRESS_CUSTOM_FIELD_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerAddressCustomFieldRemovedMessageImpl.class, name = CustomerAddressCustomFieldRemovedMessage.CUSTOMER_ADDRESS_CUSTOM_FIELD_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerAddressCustomTypeRemovedMessageImpl.class, name = CustomerAddressCustomTypeRemovedMessage.CUSTOMER_ADDRESS_CUSTOM_TYPE_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerAddressCustomTypeSetMessageImpl.class, name = CustomerAddressCustomTypeSetMessage.CUSTOMER_ADDRESS_CUSTOM_TYPE_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerAddressRemovedMessageImpl.class, name = CustomerAddressRemovedMessage.CUSTOMER_ADDRESS_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerCompanyNameSetMessageImpl.class, name = CustomerCompanyNameSetMessage.CUSTOMER_COMPANY_NAME_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerCreatedMessageImpl.class, name = CustomerCreatedMessage.CUSTOMER_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerCustomFieldAddedMessageImpl.class, name = CustomerCustomFieldAddedMessage.CUSTOMER_CUSTOM_FIELD_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerCustomFieldChangedMessageImpl.class, name = CustomerCustomFieldChangedMessage.CUSTOMER_CUSTOM_FIELD_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerCustomFieldRemovedMessageImpl.class, name = CustomerCustomFieldRemovedMessage.CUSTOMER_CUSTOM_FIELD_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerCustomTypeRemovedMessageImpl.class, name = CustomerCustomTypeRemovedMessage.CUSTOMER_CUSTOM_TYPE_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerCustomTypeSetMessageImpl.class, name = CustomerCustomTypeSetMessage.CUSTOMER_CUSTOM_TYPE_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerDateOfBirthSetMessageImpl.class, name = CustomerDateOfBirthSetMessage.CUSTOMER_DATE_OF_BIRTH_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerDeletedMessageImpl.class, name = CustomerDeletedMessage.CUSTOMER_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerEmailChangedMessageImpl.class, name = CustomerEmailChangedMessage.CUSTOMER_EMAIL_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerEmailTokenCreatedMessageImpl.class, name = CustomerEmailTokenCreatedMessage.CUSTOMER_EMAIL_TOKEN_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerEmailVerifiedMessageImpl.class, name = CustomerEmailVerifiedMessage.CUSTOMER_EMAIL_VERIFIED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerFirstNameSetMessageImpl.class, name = CustomerFirstNameSetMessage.CUSTOMER_FIRST_NAME_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerGroupCustomFieldAddedMessageImpl.class, name = CustomerGroupCustomFieldAddedMessage.CUSTOMER_GROUP_CUSTOM_FIELD_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerGroupCustomFieldChangedMessageImpl.class, name = CustomerGroupCustomFieldChangedMessage.CUSTOMER_GROUP_CUSTOM_FIELD_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerGroupCustomFieldRemovedMessageImpl.class, name = CustomerGroupCustomFieldRemovedMessage.CUSTOMER_GROUP_CUSTOM_FIELD_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerGroupCustomTypeRemovedMessageImpl.class, name = CustomerGroupCustomTypeRemovedMessage.CUSTOMER_GROUP_CUSTOM_TYPE_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerGroupCustomTypeSetMessageImpl.class, name = CustomerGroupCustomTypeSetMessage.CUSTOMER_GROUP_CUSTOM_TYPE_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerGroupSetMessageImpl.class, name = CustomerGroupSetMessage.CUSTOMER_GROUP_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerLastNameSetMessageImpl.class, name = CustomerLastNameSetMessage.CUSTOMER_LAST_NAME_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerPasswordTokenCreatedMessageImpl.class, name = CustomerPasswordTokenCreatedMessage.CUSTOMER_PASSWORD_TOKEN_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerPasswordUpdatedMessageImpl.class, name = CustomerPasswordUpdatedMessage.CUSTOMER_PASSWORD_UPDATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.CustomerTitleSetMessageImpl.class, name = CustomerTitleSetMessage.CUSTOMER_TITLE_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.DeliveryAddedMessageImpl.class, name = DeliveryAddedMessage.DELIVERY_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.DeliveryAddressSetMessageImpl.class, name = DeliveryAddressSetMessage.DELIVERY_ADDRESS_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.DeliveryItemsUpdatedMessageImpl.class, name = DeliveryItemsUpdatedMessage.DELIVERY_ITEMS_UPDATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.DeliveryRemovedMessageImpl.class, name = DeliveryRemovedMessage.DELIVERY_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.InventoryEntryCreatedMessageImpl.class, name = InventoryEntryCreatedMessage.INVENTORY_ENTRY_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.InventoryEntryDeletedMessageImpl.class, name = InventoryEntryDeletedMessage.INVENTORY_ENTRY_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.InventoryEntryQuantitySetMessageImpl.class, name = InventoryEntryQuantitySetMessage.INVENTORY_ENTRY_QUANTITY_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.LineItemStateTransitionMessageImpl.class, name = LineItemStateTransitionMessage.LINE_ITEM_STATE_TRANSITION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderBillingAddressSetMessageImpl.class, name = OrderBillingAddressSetMessage.ORDER_BILLING_ADDRESS_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCreatedMessageImpl.class, name = OrderCreatedMessage.ORDER_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomFieldAddedMessageImpl.class, name = OrderCustomFieldAddedMessage.ORDER_CUSTOM_FIELD_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomFieldChangedMessageImpl.class, name = OrderCustomFieldChangedMessage.ORDER_CUSTOM_FIELD_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomFieldRemovedMessageImpl.class, name = OrderCustomFieldRemovedMessage.ORDER_CUSTOM_FIELD_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomLineItemAddedMessageImpl.class, name = OrderCustomLineItemAddedMessage.ORDER_CUSTOM_LINE_ITEM_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomLineItemDiscountSetMessageImpl.class, name = OrderCustomLineItemDiscountSetMessage.ORDER_CUSTOM_LINE_ITEM_DISCOUNT_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomLineItemQuantityChangedMessageImpl.class, name = OrderCustomLineItemQuantityChangedMessage.ORDER_CUSTOM_LINE_ITEM_QUANTITY_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomLineItemRemovedMessageImpl.class, name = OrderCustomLineItemRemovedMessage.ORDER_CUSTOM_LINE_ITEM_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomTypeRemovedMessageImpl.class, name = OrderCustomTypeRemovedMessage.ORDER_CUSTOM_TYPE_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomTypeSetMessageImpl.class, name = OrderCustomTypeSetMessage.ORDER_CUSTOM_TYPE_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomerEmailSetMessageImpl.class, name = OrderCustomerEmailSetMessage.ORDER_CUSTOMER_EMAIL_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomerGroupSetMessageImpl.class, name = OrderCustomerGroupSetMessage.ORDER_CUSTOMER_GROUP_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderCustomerSetMessageImpl.class, name = OrderCustomerSetMessage.ORDER_CUSTOMER_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderDeletedMessageImpl.class, name = OrderDeletedMessage.ORDER_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderDiscountCodeAddedMessageImpl.class, name = OrderDiscountCodeAddedMessage.ORDER_DISCOUNT_CODE_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderDiscountCodeRemovedMessageImpl.class, name = OrderDiscountCodeRemovedMessage.ORDER_DISCOUNT_CODE_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderDiscountCodeStateSetMessageImpl.class, name = OrderDiscountCodeStateSetMessage.ORDER_DISCOUNT_CODE_STATE_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderEditAppliedMessageImpl.class, name = OrderEditAppliedMessage.ORDER_EDIT_APPLIED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderImportedMessageImpl.class, name = OrderImportedMessage.ORDER_IMPORTED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderLineItemAddedMessageImpl.class, name = OrderLineItemAddedMessage.ORDER_LINE_ITEM_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderLineItemDiscountSetMessageImpl.class, name = OrderLineItemDiscountSetMessage.ORDER_LINE_ITEM_DISCOUNT_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderLineItemDistributionChannelSetMessageImpl.class, name = OrderLineItemDistributionChannelSetMessage.ORDER_LINE_ITEM_DISTRIBUTION_CHANNEL_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderLineItemRemovedMessageImpl.class, name = OrderLineItemRemovedMessage.ORDER_LINE_ITEM_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderPaymentAddedMessageImpl.class, name = OrderPaymentAddedMessage.ORDER_PAYMENT_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderPaymentStateChangedMessageImpl.class, name = OrderPaymentStateChangedMessage.ORDER_PAYMENT_STATE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderPurchaseOrderNumberSetMessageImpl.class, name = OrderPurchaseOrderNumberSetMessage.ORDER_PURCHASE_ORDER_NUMBER_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderReturnShipmentStateChangedMessageImpl.class, name = OrderReturnShipmentStateChangedMessage.ORDER_RETURN_SHIPMENT_STATE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderShipmentStateChangedMessageImpl.class, name = OrderShipmentStateChangedMessage.ORDER_SHIPMENT_STATE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderShippingAddressSetMessageImpl.class, name = OrderShippingAddressSetMessage.ORDER_SHIPPING_ADDRESS_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderShippingInfoSetMessageImpl.class, name = OrderShippingInfoSetMessage.ORDER_SHIPPING_INFO_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderShippingRateInputSetMessageImpl.class, name = OrderShippingRateInputSetMessage.ORDER_SHIPPING_RATE_INPUT_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderStateChangedMessageImpl.class, name = OrderStateChangedMessage.ORDER_STATE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderStateTransitionMessageImpl.class, name = OrderStateTransitionMessage.ORDER_STATE_TRANSITION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.OrderStoreSetMessageImpl.class, name = OrderStoreSetMessage.ORDER_STORE_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ParcelAddedToDeliveryMessageImpl.class, name = ParcelAddedToDeliveryMessage.PARCEL_ADDED_TO_DELIVERY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ParcelItemsUpdatedMessageImpl.class, name = ParcelItemsUpdatedMessage.PARCEL_ITEMS_UPDATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ParcelMeasurementsUpdatedMessageImpl.class, name = ParcelMeasurementsUpdatedMessage.PARCEL_MEASUREMENTS_UPDATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ParcelRemovedFromDeliveryMessageImpl.class, name = ParcelRemovedFromDeliveryMessage.PARCEL_REMOVED_FROM_DELIVERY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ParcelTrackingDataUpdatedMessageImpl.class, name = ParcelTrackingDataUpdatedMessage.PARCEL_TRACKING_DATA_UPDATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.PaymentCreatedMessageImpl.class, name = PaymentCreatedMessage.PAYMENT_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.PaymentInteractionAddedMessageImpl.class, name = PaymentInteractionAddedMessage.PAYMENT_INTERACTION_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.PaymentStatusInterfaceCodeSetMessageImpl.class, name = PaymentStatusInterfaceCodeSetMessage.PAYMENT_STATUS_INTERFACE_CODE_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.PaymentStatusStateTransitionMessageImpl.class, name = PaymentStatusStateTransitionMessage.PAYMENT_STATUS_STATE_TRANSITION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.PaymentTransactionAddedMessageImpl.class, name = PaymentTransactionAddedMessage.PAYMENT_TRANSACTION_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.PaymentTransactionStateChangedMessageImpl.class, name = PaymentTransactionStateChangedMessage.PAYMENT_TRANSACTION_STATE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductAddedToCategoryMessageImpl.class, name = ProductAddedToCategoryMessage.PRODUCT_ADDED_TO_CATEGORY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductCreatedMessageImpl.class, name = ProductCreatedMessage.PRODUCT_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductDeletedMessageImpl.class, name = ProductDeletedMessage.PRODUCT_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductImageAddedMessageImpl.class, name = ProductImageAddedMessage.PRODUCT_IMAGE_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductPriceAddedMessageImpl.class, name = ProductPriceAddedMessage.PRODUCT_PRICE_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductPriceChangedMessageImpl.class, name = ProductPriceChangedMessage.PRODUCT_PRICE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductPriceDiscountsSetMessageImpl.class, name = ProductPriceDiscountsSetMessage.PRODUCT_PRICE_DISCOUNTS_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductPriceExternalDiscountSetMessageImpl.class, name = ProductPriceExternalDiscountSetMessage.PRODUCT_PRICE_EXTERNAL_DISCOUNT_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductPriceKeySetMessageImpl.class, name = ProductPriceKeySetMessage.PRODUCT_PRICE_KEY_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductPriceModeSetMessageImpl.class, name = ProductPriceModeSetMessage.PRODUCT_PRICE_MODE_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductPriceRemovedMessageImpl.class, name = ProductPriceRemovedMessage.PRODUCT_PRICE_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductPricesSetMessageImpl.class, name = ProductPricesSetMessage.PRODUCT_PRICES_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductPublishedMessageImpl.class, name = ProductPublishedMessage.PRODUCT_PUBLISHED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductRemovedFromCategoryMessageImpl.class, name = ProductRemovedFromCategoryMessage.PRODUCT_REMOVED_FROM_CATEGORY),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductRevertedStagedChangesMessageImpl.class, name = ProductRevertedStagedChangesMessage.PRODUCT_REVERTED_STAGED_CHANGES),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductSelectionCreatedMessageImpl.class, name = ProductSelectionCreatedMessage.PRODUCT_SELECTION_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductSelectionDeletedMessageImpl.class, name = ProductSelectionDeletedMessage.PRODUCT_SELECTION_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductSelectionProductAddedMessageImpl.class, name = ProductSelectionProductAddedMessage.PRODUCT_SELECTION_PRODUCT_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductSelectionProductExcludedMessageImpl.class, name = ProductSelectionProductExcludedMessage.PRODUCT_SELECTION_PRODUCT_EXCLUDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductSelectionProductRemovedMessageImpl.class, name = ProductSelectionProductRemovedMessage.PRODUCT_SELECTION_PRODUCT_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductSelectionVariantExclusionChangedMessageImpl.class, name = ProductSelectionVariantExclusionChangedMessage.PRODUCT_SELECTION_VARIANT_EXCLUSION_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductSelectionVariantSelectionChangedMessageImpl.class, name = ProductSelectionVariantSelectionChangedMessage.PRODUCT_SELECTION_VARIANT_SELECTION_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductSlugChangedMessageImpl.class, name = ProductSlugChangedMessage.PRODUCT_SLUG_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductStateTransitionMessageImpl.class, name = ProductStateTransitionMessage.PRODUCT_STATE_TRANSITION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductUnpublishedMessageImpl.class, name = ProductUnpublishedMessage.PRODUCT_UNPUBLISHED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductVariantAddedMessageImpl.class, name = ProductVariantAddedMessage.PRODUCT_VARIANT_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ProductVariantDeletedMessageImpl.class, name = ProductVariantDeletedMessage.PRODUCT_VARIANT_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.QuoteCreatedMessageImpl.class, name = QuoteCreatedMessage.QUOTE_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.QuoteCustomerChangedMessageImpl.class, name = QuoteCustomerChangedMessage.QUOTE_CUSTOMER_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.QuoteDeletedMessageImpl.class, name = QuoteDeletedMessage.QUOTE_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.QuoteRenegotiationRequestedMessageImpl.class, name = QuoteRenegotiationRequestedMessage.QUOTE_RENEGOTIATION_REQUESTED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.QuoteRequestCreatedMessageImpl.class, name = QuoteRequestCreatedMessage.QUOTE_REQUEST_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.QuoteRequestCustomerChangedMessageImpl.class, name = QuoteRequestCustomerChangedMessage.QUOTE_REQUEST_CUSTOMER_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.QuoteRequestDeletedMessageImpl.class, name = QuoteRequestDeletedMessage.QUOTE_REQUEST_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.QuoteRequestStateChangedMessageImpl.class, name = QuoteRequestStateChangedMessage.QUOTE_REQUEST_STATE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.QuoteRequestStateTransitionMessageImpl.class, name = QuoteRequestStateTransitionMessage.QUOTE_REQUEST_STATE_TRANSITION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.QuoteStateChangedMessageImpl.class, name = QuoteStateChangedMessage.QUOTE_STATE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.QuoteStateTransitionMessageImpl.class, name = QuoteStateTransitionMessage.QUOTE_STATE_TRANSITION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ReturnInfoAddedMessageImpl.class, name = ReturnInfoAddedMessage.RETURN_INFO_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ReturnInfoSetMessageImpl.class, name = ReturnInfoSetMessage.RETURN_INFO_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ReviewCreatedMessageImpl.class, name = ReviewCreatedMessage.REVIEW_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ReviewRatingSetMessageImpl.class, name = ReviewRatingSetMessage.REVIEW_RATING_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.ReviewStateTransitionMessageImpl.class, name = ReviewStateTransitionMessage.REVIEW_STATE_TRANSITION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StagedQuoteCreatedMessageImpl.class, name = StagedQuoteCreatedMessage.STAGED_QUOTE_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StagedQuoteDeletedMessageImpl.class, name = StagedQuoteDeletedMessage.STAGED_QUOTE_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StagedQuoteSellerCommentSetMessageImpl.class, name = StagedQuoteSellerCommentSetMessage.STAGED_QUOTE_SELLER_COMMENT_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StagedQuoteStateChangedMessageImpl.class, name = StagedQuoteStateChangedMessage.STAGED_QUOTE_STATE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StagedQuoteStateTransitionMessageImpl.class, name = StagedQuoteStateTransitionMessage.STAGED_QUOTE_STATE_TRANSITION),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StagedQuoteValidToSetMessageImpl.class, name = StagedQuoteValidToSetMessage.STAGED_QUOTE_VALID_TO_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StandalonePriceActiveChangedMessageImpl.class, name = StandalonePriceActiveChangedMessage.STANDALONE_PRICE_ACTIVE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StandalonePriceCreatedMessageImpl.class, name = StandalonePriceCreatedMessage.STANDALONE_PRICE_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StandalonePriceDeletedMessageImpl.class, name = StandalonePriceDeletedMessage.STANDALONE_PRICE_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StandalonePriceDiscountSetMessageImpl.class, name = StandalonePriceDiscountSetMessage.STANDALONE_PRICE_DISCOUNT_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StandalonePriceExternalDiscountSetMessageImpl.class, name = StandalonePriceExternalDiscountSetMessage.STANDALONE_PRICE_EXTERNAL_DISCOUNT_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StandalonePriceKeySetMessageImpl.class, name = StandalonePriceKeySetMessage.STANDALONE_PRICE_KEY_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StandalonePriceStagedChangesAppliedMessageImpl.class, name = StandalonePriceStagedChangesAppliedMessage.STANDALONE_PRICE_STAGED_CHANGES_APPLIED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StandalonePriceStagedChangesRemovedMessageImpl.class, name = StandalonePriceStagedChangesRemovedMessage.STANDALONE_PRICE_STAGED_CHANGES_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StandalonePriceTierAddedMessageImpl.class, name = StandalonePriceTierAddedMessage.STANDALONE_PRICE_TIER_ADDED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StandalonePriceTierRemovedMessageImpl.class, name = StandalonePriceTierRemovedMessage.STANDALONE_PRICE_TIER_REMOVED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StandalonePriceTiersSetMessageImpl.class, name = StandalonePriceTiersSetMessage.STANDALONE_PRICE_TIERS_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StandalonePriceValidFromAndUntilSetMessageImpl.class, name = StandalonePriceValidFromAndUntilSetMessage.STANDALONE_PRICE_VALID_FROM_AND_UNTIL_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StandalonePriceValidFromSetMessageImpl.class, name = StandalonePriceValidFromSetMessage.STANDALONE_PRICE_VALID_FROM_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StandalonePriceValidUntilSetMessageImpl.class, name = StandalonePriceValidUntilSetMessage.STANDALONE_PRICE_VALID_UNTIL_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StandalonePriceValueChangedMessageImpl.class, name = StandalonePriceValueChangedMessage.STANDALONE_PRICE_VALUE_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StoreCountriesChangedMessageImpl.class, name = StoreCountriesChangedMessage.STORE_COUNTRIES_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StoreCreatedMessageImpl.class, name = StoreCreatedMessage.STORE_CREATED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StoreDeletedMessageImpl.class, name = StoreDeletedMessage.STORE_DELETED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StoreDistributionChannelsChangedMessageImpl.class, name = StoreDistributionChannelsChangedMessage.STORE_DISTRIBUTION_CHANNELS_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StoreLanguagesChangedMessageImpl.class, name = StoreLanguagesChangedMessage.STORE_LANGUAGES_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StoreNameSetMessageImpl.class, name = StoreNameSetMessage.STORE_NAME_SET),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StoreProductSelectionsChangedMessageImpl.class, name = StoreProductSelectionsChangedMessage.STORE_PRODUCT_SELECTIONS_CHANGED),
        @JsonSubTypes.Type(value = com.commercetools.api.models.message.StoreSupplyChannelsChangedMessageImpl.class, name = StoreSupplyChannelsChangedMessage.STORE_SUPPLY_CHANNELS_CHANGED) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = MessageImpl.class, visible = true)
@JsonDeserialize(as = MessageImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface Message extends BaseResource, com.commercetools.api.models.DomainResource<Message> {

    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Value of <code>createdAt</code>.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>Value of <code>createdBy</code>.</p>
     * @return lastModifiedBy
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @return createdBy
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     * @return sequenceNumber
     */
    @NotNull
    @JsonProperty("sequenceNumber")
    public Long getSequenceNumber();

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @return resource
     */
    @NotNull
    @Valid
    @JsonProperty("resource")
    public Reference getResource();

    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     * @return resourceVersion
     */
    @NotNull
    @JsonProperty("resourceVersion")
    public Long getResourceVersion();

    /**
     *  <p>Message Type of the Message.</p>
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @return resourceUserProvidedIdentifiers
     */
    @Valid
    @JsonProperty("resourceUserProvidedIdentifiers")
    public UserProvidedIdentifiers getResourceUserProvidedIdentifiers();

    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Value of <code>createdAt</code>.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>Value of <code>createdBy</code>.</p>
     * @param lastModifiedBy value to be set
     */

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     * @param createdBy value to be set
     */

    public void setCreatedBy(final CreatedBy createdBy);

    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     * @param sequenceNumber value to be set
     */

    public void setSequenceNumber(final Long sequenceNumber);

    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     * @param resource value to be set
     */

    public void setResource(final Reference resource);

    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     * @param resourceVersion value to be set
     */

    public void setResourceVersion(final Long resourceVersion);

    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     * @param resourceUserProvidedIdentifiers value to be set
     */

    public void setResourceUserProvidedIdentifiers(final UserProvidedIdentifiers resourceUserProvidedIdentifiers);

    /**
     * factory method to create a deep copy of Message
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Message deepCopy(@Nullable final Message template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.api.models.message.ApprovalFlowApprovedMessage) {
            return com.commercetools.api.models.message.ApprovalFlowApprovedMessage
                    .deepCopy((com.commercetools.api.models.message.ApprovalFlowApprovedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.ApprovalFlowCompletedMessage) {
            return com.commercetools.api.models.message.ApprovalFlowCompletedMessage
                    .deepCopy((com.commercetools.api.models.message.ApprovalFlowCompletedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.ApprovalFlowCreatedMessage) {
            return com.commercetools.api.models.message.ApprovalFlowCreatedMessage
                    .deepCopy((com.commercetools.api.models.message.ApprovalFlowCreatedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.ApprovalFlowRejectedMessage) {
            return com.commercetools.api.models.message.ApprovalFlowRejectedMessage
                    .deepCopy((com.commercetools.api.models.message.ApprovalFlowRejectedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.ApprovalRuleApproversSetMessage) {
            return com.commercetools.api.models.message.ApprovalRuleApproversSetMessage
                    .deepCopy((com.commercetools.api.models.message.ApprovalRuleApproversSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.ApprovalRuleCreatedMessage) {
            return com.commercetools.api.models.message.ApprovalRuleCreatedMessage
                    .deepCopy((com.commercetools.api.models.message.ApprovalRuleCreatedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.ApprovalRuleDescriptionSetMessage) {
            return com.commercetools.api.models.message.ApprovalRuleDescriptionSetMessage
                    .deepCopy((com.commercetools.api.models.message.ApprovalRuleDescriptionSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.ApprovalRuleKeySetMessage) {
            return com.commercetools.api.models.message.ApprovalRuleKeySetMessage
                    .deepCopy((com.commercetools.api.models.message.ApprovalRuleKeySetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.ApprovalRuleNameSetMessage) {
            return com.commercetools.api.models.message.ApprovalRuleNameSetMessage
                    .deepCopy((com.commercetools.api.models.message.ApprovalRuleNameSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.ApprovalRulePredicateSetMessage) {
            return com.commercetools.api.models.message.ApprovalRulePredicateSetMessage
                    .deepCopy((com.commercetools.api.models.message.ApprovalRulePredicateSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.ApprovalRuleRequestersSetMessage) {
            return com.commercetools.api.models.message.ApprovalRuleRequestersSetMessage
                    .deepCopy((com.commercetools.api.models.message.ApprovalRuleRequestersSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.ApprovalRuleStatusSetMessage) {
            return com.commercetools.api.models.message.ApprovalRuleStatusSetMessage
                    .deepCopy((com.commercetools.api.models.message.ApprovalRuleStatusSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.AssociateRoleBuyerAssignableChangedMessage) {
            return com.commercetools.api.models.message.AssociateRoleBuyerAssignableChangedMessage.deepCopy(
                (com.commercetools.api.models.message.AssociateRoleBuyerAssignableChangedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.AssociateRoleCreatedMessage) {
            return com.commercetools.api.models.message.AssociateRoleCreatedMessage
                    .deepCopy((com.commercetools.api.models.message.AssociateRoleCreatedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.AssociateRoleDeletedMessage) {
            return com.commercetools.api.models.message.AssociateRoleDeletedMessage
                    .deepCopy((com.commercetools.api.models.message.AssociateRoleDeletedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.AssociateRoleNameChangedMessage) {
            return com.commercetools.api.models.message.AssociateRoleNameChangedMessage
                    .deepCopy((com.commercetools.api.models.message.AssociateRoleNameChangedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.AssociateRolePermissionAddedMessage) {
            return com.commercetools.api.models.message.AssociateRolePermissionAddedMessage
                    .deepCopy((com.commercetools.api.models.message.AssociateRolePermissionAddedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.AssociateRolePermissionRemovedMessage) {
            return com.commercetools.api.models.message.AssociateRolePermissionRemovedMessage
                    .deepCopy((com.commercetools.api.models.message.AssociateRolePermissionRemovedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.AssociateRolePermissionsSetMessage) {
            return com.commercetools.api.models.message.AssociateRolePermissionsSetMessage
                    .deepCopy((com.commercetools.api.models.message.AssociateRolePermissionsSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitAddressAddedMessage) {
            return com.commercetools.api.models.message.BusinessUnitAddressAddedMessage
                    .deepCopy((com.commercetools.api.models.message.BusinessUnitAddressAddedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitAddressChangedMessage) {
            return com.commercetools.api.models.message.BusinessUnitAddressChangedMessage
                    .deepCopy((com.commercetools.api.models.message.BusinessUnitAddressChangedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitAddressCustomFieldAddedMessage) {
            return com.commercetools.api.models.message.BusinessUnitAddressCustomFieldAddedMessage.deepCopy(
                (com.commercetools.api.models.message.BusinessUnitAddressCustomFieldAddedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitAddressCustomFieldChangedMessage) {
            return com.commercetools.api.models.message.BusinessUnitAddressCustomFieldChangedMessage.deepCopy(
                (com.commercetools.api.models.message.BusinessUnitAddressCustomFieldChangedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitAddressCustomFieldRemovedMessage) {
            return com.commercetools.api.models.message.BusinessUnitAddressCustomFieldRemovedMessage.deepCopy(
                (com.commercetools.api.models.message.BusinessUnitAddressCustomFieldRemovedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitAddressCustomTypeRemovedMessage) {
            return com.commercetools.api.models.message.BusinessUnitAddressCustomTypeRemovedMessage.deepCopy(
                (com.commercetools.api.models.message.BusinessUnitAddressCustomTypeRemovedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitAddressCustomTypeSetMessage) {
            return com.commercetools.api.models.message.BusinessUnitAddressCustomTypeSetMessage
                    .deepCopy((com.commercetools.api.models.message.BusinessUnitAddressCustomTypeSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitAddressRemovedMessage) {
            return com.commercetools.api.models.message.BusinessUnitAddressRemovedMessage
                    .deepCopy((com.commercetools.api.models.message.BusinessUnitAddressRemovedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitAssociateAddedMessage) {
            return com.commercetools.api.models.message.BusinessUnitAssociateAddedMessage
                    .deepCopy((com.commercetools.api.models.message.BusinessUnitAssociateAddedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitAssociateChangedMessage) {
            return com.commercetools.api.models.message.BusinessUnitAssociateChangedMessage
                    .deepCopy((com.commercetools.api.models.message.BusinessUnitAssociateChangedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitAssociateModeChangedMessage) {
            return com.commercetools.api.models.message.BusinessUnitAssociateModeChangedMessage
                    .deepCopy((com.commercetools.api.models.message.BusinessUnitAssociateModeChangedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitAssociateRemovedMessage) {
            return com.commercetools.api.models.message.BusinessUnitAssociateRemovedMessage
                    .deepCopy((com.commercetools.api.models.message.BusinessUnitAssociateRemovedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitAssociatesSetMessage) {
            return com.commercetools.api.models.message.BusinessUnitAssociatesSetMessage
                    .deepCopy((com.commercetools.api.models.message.BusinessUnitAssociatesSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitBillingAddressAddedMessage) {
            return com.commercetools.api.models.message.BusinessUnitBillingAddressAddedMessage
                    .deepCopy((com.commercetools.api.models.message.BusinessUnitBillingAddressAddedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitBillingAddressRemovedMessage) {
            return com.commercetools.api.models.message.BusinessUnitBillingAddressRemovedMessage
                    .deepCopy((com.commercetools.api.models.message.BusinessUnitBillingAddressRemovedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitContactEmailSetMessage) {
            return com.commercetools.api.models.message.BusinessUnitContactEmailSetMessage
                    .deepCopy((com.commercetools.api.models.message.BusinessUnitContactEmailSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitCreatedMessage) {
            return com.commercetools.api.models.message.BusinessUnitCreatedMessage
                    .deepCopy((com.commercetools.api.models.message.BusinessUnitCreatedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitCustomFieldAddedMessage) {
            return com.commercetools.api.models.message.BusinessUnitCustomFieldAddedMessage
                    .deepCopy((com.commercetools.api.models.message.BusinessUnitCustomFieldAddedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitCustomFieldChangedMessage) {
            return com.commercetools.api.models.message.BusinessUnitCustomFieldChangedMessage
                    .deepCopy((com.commercetools.api.models.message.BusinessUnitCustomFieldChangedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitCustomFieldRemovedMessage) {
            return com.commercetools.api.models.message.BusinessUnitCustomFieldRemovedMessage
                    .deepCopy((com.commercetools.api.models.message.BusinessUnitCustomFieldRemovedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitCustomTypeRemovedMessage) {
            return com.commercetools.api.models.message.BusinessUnitCustomTypeRemovedMessage
                    .deepCopy((com.commercetools.api.models.message.BusinessUnitCustomTypeRemovedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitCustomTypeSetMessage) {
            return com.commercetools.api.models.message.BusinessUnitCustomTypeSetMessage
                    .deepCopy((com.commercetools.api.models.message.BusinessUnitCustomTypeSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitDefaultBillingAddressSetMessage) {
            return com.commercetools.api.models.message.BusinessUnitDefaultBillingAddressSetMessage.deepCopy(
                (com.commercetools.api.models.message.BusinessUnitDefaultBillingAddressSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitDefaultShippingAddressSetMessage) {
            return com.commercetools.api.models.message.BusinessUnitDefaultShippingAddressSetMessage.deepCopy(
                (com.commercetools.api.models.message.BusinessUnitDefaultShippingAddressSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitDeletedMessage) {
            return com.commercetools.api.models.message.BusinessUnitDeletedMessage
                    .deepCopy((com.commercetools.api.models.message.BusinessUnitDeletedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitNameChangedMessage) {
            return com.commercetools.api.models.message.BusinessUnitNameChangedMessage
                    .deepCopy((com.commercetools.api.models.message.BusinessUnitNameChangedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitParentChangedMessage) {
            return com.commercetools.api.models.message.BusinessUnitParentChangedMessage
                    .deepCopy((com.commercetools.api.models.message.BusinessUnitParentChangedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitShippingAddressAddedMessage) {
            return com.commercetools.api.models.message.BusinessUnitShippingAddressAddedMessage
                    .deepCopy((com.commercetools.api.models.message.BusinessUnitShippingAddressAddedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitShippingAddressRemovedMessage) {
            return com.commercetools.api.models.message.BusinessUnitShippingAddressRemovedMessage.deepCopy(
                (com.commercetools.api.models.message.BusinessUnitShippingAddressRemovedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitStatusChangedMessage) {
            return com.commercetools.api.models.message.BusinessUnitStatusChangedMessage
                    .deepCopy((com.commercetools.api.models.message.BusinessUnitStatusChangedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitStoreAddedMessage) {
            return com.commercetools.api.models.message.BusinessUnitStoreAddedMessage
                    .deepCopy((com.commercetools.api.models.message.BusinessUnitStoreAddedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitStoreModeChangedMessage) {
            return com.commercetools.api.models.message.BusinessUnitStoreModeChangedMessage
                    .deepCopy((com.commercetools.api.models.message.BusinessUnitStoreModeChangedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitStoreRemovedMessage) {
            return com.commercetools.api.models.message.BusinessUnitStoreRemovedMessage
                    .deepCopy((com.commercetools.api.models.message.BusinessUnitStoreRemovedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.BusinessUnitStoresSetMessage) {
            return com.commercetools.api.models.message.BusinessUnitStoresSetMessage
                    .deepCopy((com.commercetools.api.models.message.BusinessUnitStoresSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.CartDiscountCreatedMessage) {
            return com.commercetools.api.models.message.CartDiscountCreatedMessage
                    .deepCopy((com.commercetools.api.models.message.CartDiscountCreatedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.CartDiscountDeletedMessage) {
            return com.commercetools.api.models.message.CartDiscountDeletedMessage
                    .deepCopy((com.commercetools.api.models.message.CartDiscountDeletedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.CartDiscountStoreAddedMessage) {
            return com.commercetools.api.models.message.CartDiscountStoreAddedMessage
                    .deepCopy((com.commercetools.api.models.message.CartDiscountStoreAddedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.CartDiscountStoreRemovedMessage) {
            return com.commercetools.api.models.message.CartDiscountStoreRemovedMessage
                    .deepCopy((com.commercetools.api.models.message.CartDiscountStoreRemovedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.CartDiscountStoresSetMessage) {
            return com.commercetools.api.models.message.CartDiscountStoresSetMessage
                    .deepCopy((com.commercetools.api.models.message.CartDiscountStoresSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.CategoryCreatedMessage) {
            return com.commercetools.api.models.message.CategoryCreatedMessage
                    .deepCopy((com.commercetools.api.models.message.CategoryCreatedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.CategorySlugChangedMessage) {
            return com.commercetools.api.models.message.CategorySlugChangedMessage
                    .deepCopy((com.commercetools.api.models.message.CategorySlugChangedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.CustomerAddressAddedMessage) {
            return com.commercetools.api.models.message.CustomerAddressAddedMessage
                    .deepCopy((com.commercetools.api.models.message.CustomerAddressAddedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.CustomerAddressChangedMessage) {
            return com.commercetools.api.models.message.CustomerAddressChangedMessage
                    .deepCopy((com.commercetools.api.models.message.CustomerAddressChangedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.CustomerAddressCustomFieldAddedMessage) {
            return com.commercetools.api.models.message.CustomerAddressCustomFieldAddedMessage
                    .deepCopy((com.commercetools.api.models.message.CustomerAddressCustomFieldAddedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.CustomerAddressCustomFieldChangedMessage) {
            return com.commercetools.api.models.message.CustomerAddressCustomFieldChangedMessage
                    .deepCopy((com.commercetools.api.models.message.CustomerAddressCustomFieldChangedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.CustomerAddressCustomFieldRemovedMessage) {
            return com.commercetools.api.models.message.CustomerAddressCustomFieldRemovedMessage
                    .deepCopy((com.commercetools.api.models.message.CustomerAddressCustomFieldRemovedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.CustomerAddressCustomTypeRemovedMessage) {
            return com.commercetools.api.models.message.CustomerAddressCustomTypeRemovedMessage
                    .deepCopy((com.commercetools.api.models.message.CustomerAddressCustomTypeRemovedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.CustomerAddressCustomTypeSetMessage) {
            return com.commercetools.api.models.message.CustomerAddressCustomTypeSetMessage
                    .deepCopy((com.commercetools.api.models.message.CustomerAddressCustomTypeSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.CustomerAddressRemovedMessage) {
            return com.commercetools.api.models.message.CustomerAddressRemovedMessage
                    .deepCopy((com.commercetools.api.models.message.CustomerAddressRemovedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.CustomerCompanyNameSetMessage) {
            return com.commercetools.api.models.message.CustomerCompanyNameSetMessage
                    .deepCopy((com.commercetools.api.models.message.CustomerCompanyNameSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.CustomerCreatedMessage) {
            return com.commercetools.api.models.message.CustomerCreatedMessage
                    .deepCopy((com.commercetools.api.models.message.CustomerCreatedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.CustomerCustomFieldAddedMessage) {
            return com.commercetools.api.models.message.CustomerCustomFieldAddedMessage
                    .deepCopy((com.commercetools.api.models.message.CustomerCustomFieldAddedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.CustomerCustomFieldChangedMessage) {
            return com.commercetools.api.models.message.CustomerCustomFieldChangedMessage
                    .deepCopy((com.commercetools.api.models.message.CustomerCustomFieldChangedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.CustomerCustomFieldRemovedMessage) {
            return com.commercetools.api.models.message.CustomerCustomFieldRemovedMessage
                    .deepCopy((com.commercetools.api.models.message.CustomerCustomFieldRemovedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.CustomerCustomTypeRemovedMessage) {
            return com.commercetools.api.models.message.CustomerCustomTypeRemovedMessage
                    .deepCopy((com.commercetools.api.models.message.CustomerCustomTypeRemovedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.CustomerCustomTypeSetMessage) {
            return com.commercetools.api.models.message.CustomerCustomTypeSetMessage
                    .deepCopy((com.commercetools.api.models.message.CustomerCustomTypeSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.CustomerDateOfBirthSetMessage) {
            return com.commercetools.api.models.message.CustomerDateOfBirthSetMessage
                    .deepCopy((com.commercetools.api.models.message.CustomerDateOfBirthSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.CustomerDeletedMessage) {
            return com.commercetools.api.models.message.CustomerDeletedMessage
                    .deepCopy((com.commercetools.api.models.message.CustomerDeletedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.CustomerEmailChangedMessage) {
            return com.commercetools.api.models.message.CustomerEmailChangedMessage
                    .deepCopy((com.commercetools.api.models.message.CustomerEmailChangedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.CustomerEmailTokenCreatedMessage) {
            return com.commercetools.api.models.message.CustomerEmailTokenCreatedMessage
                    .deepCopy((com.commercetools.api.models.message.CustomerEmailTokenCreatedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.CustomerEmailVerifiedMessage) {
            return com.commercetools.api.models.message.CustomerEmailVerifiedMessage
                    .deepCopy((com.commercetools.api.models.message.CustomerEmailVerifiedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.CustomerFirstNameSetMessage) {
            return com.commercetools.api.models.message.CustomerFirstNameSetMessage
                    .deepCopy((com.commercetools.api.models.message.CustomerFirstNameSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.CustomerGroupCustomFieldAddedMessage) {
            return com.commercetools.api.models.message.CustomerGroupCustomFieldAddedMessage
                    .deepCopy((com.commercetools.api.models.message.CustomerGroupCustomFieldAddedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.CustomerGroupCustomFieldChangedMessage) {
            return com.commercetools.api.models.message.CustomerGroupCustomFieldChangedMessage
                    .deepCopy((com.commercetools.api.models.message.CustomerGroupCustomFieldChangedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.CustomerGroupCustomFieldRemovedMessage) {
            return com.commercetools.api.models.message.CustomerGroupCustomFieldRemovedMessage
                    .deepCopy((com.commercetools.api.models.message.CustomerGroupCustomFieldRemovedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.CustomerGroupCustomTypeRemovedMessage) {
            return com.commercetools.api.models.message.CustomerGroupCustomTypeRemovedMessage
                    .deepCopy((com.commercetools.api.models.message.CustomerGroupCustomTypeRemovedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.CustomerGroupCustomTypeSetMessage) {
            return com.commercetools.api.models.message.CustomerGroupCustomTypeSetMessage
                    .deepCopy((com.commercetools.api.models.message.CustomerGroupCustomTypeSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.CustomerGroupSetMessage) {
            return com.commercetools.api.models.message.CustomerGroupSetMessage
                    .deepCopy((com.commercetools.api.models.message.CustomerGroupSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.CustomerLastNameSetMessage) {
            return com.commercetools.api.models.message.CustomerLastNameSetMessage
                    .deepCopy((com.commercetools.api.models.message.CustomerLastNameSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.CustomerPasswordTokenCreatedMessage) {
            return com.commercetools.api.models.message.CustomerPasswordTokenCreatedMessage
                    .deepCopy((com.commercetools.api.models.message.CustomerPasswordTokenCreatedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.CustomerPasswordUpdatedMessage) {
            return com.commercetools.api.models.message.CustomerPasswordUpdatedMessage
                    .deepCopy((com.commercetools.api.models.message.CustomerPasswordUpdatedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.CustomerTitleSetMessage) {
            return com.commercetools.api.models.message.CustomerTitleSetMessage
                    .deepCopy((com.commercetools.api.models.message.CustomerTitleSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.InventoryEntryCreatedMessage) {
            return com.commercetools.api.models.message.InventoryEntryCreatedMessage
                    .deepCopy((com.commercetools.api.models.message.InventoryEntryCreatedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.InventoryEntryDeletedMessage) {
            return com.commercetools.api.models.message.InventoryEntryDeletedMessage
                    .deepCopy((com.commercetools.api.models.message.InventoryEntryDeletedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.InventoryEntryQuantitySetMessage) {
            return com.commercetools.api.models.message.InventoryEntryQuantitySetMessage
                    .deepCopy((com.commercetools.api.models.message.InventoryEntryQuantitySetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderMessage) {
            return com.commercetools.api.models.message.OrderMessage
                    .deepCopy((com.commercetools.api.models.message.OrderMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.OrderPaymentAddedMessage) {
            return com.commercetools.api.models.message.OrderPaymentAddedMessage
                    .deepCopy((com.commercetools.api.models.message.OrderPaymentAddedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.PaymentCreatedMessage) {
            return com.commercetools.api.models.message.PaymentCreatedMessage
                    .deepCopy((com.commercetools.api.models.message.PaymentCreatedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.PaymentInteractionAddedMessage) {
            return com.commercetools.api.models.message.PaymentInteractionAddedMessage
                    .deepCopy((com.commercetools.api.models.message.PaymentInteractionAddedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.PaymentStatusInterfaceCodeSetMessage) {
            return com.commercetools.api.models.message.PaymentStatusInterfaceCodeSetMessage
                    .deepCopy((com.commercetools.api.models.message.PaymentStatusInterfaceCodeSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.PaymentStatusStateTransitionMessage) {
            return com.commercetools.api.models.message.PaymentStatusStateTransitionMessage
                    .deepCopy((com.commercetools.api.models.message.PaymentStatusStateTransitionMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.PaymentTransactionAddedMessage) {
            return com.commercetools.api.models.message.PaymentTransactionAddedMessage
                    .deepCopy((com.commercetools.api.models.message.PaymentTransactionAddedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.PaymentTransactionStateChangedMessage) {
            return com.commercetools.api.models.message.PaymentTransactionStateChangedMessage
                    .deepCopy((com.commercetools.api.models.message.PaymentTransactionStateChangedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductAddedToCategoryMessage) {
            return com.commercetools.api.models.message.ProductAddedToCategoryMessage
                    .deepCopy((com.commercetools.api.models.message.ProductAddedToCategoryMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductCreatedMessage) {
            return com.commercetools.api.models.message.ProductCreatedMessage
                    .deepCopy((com.commercetools.api.models.message.ProductCreatedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductDeletedMessage) {
            return com.commercetools.api.models.message.ProductDeletedMessage
                    .deepCopy((com.commercetools.api.models.message.ProductDeletedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductImageAddedMessage) {
            return com.commercetools.api.models.message.ProductImageAddedMessage
                    .deepCopy((com.commercetools.api.models.message.ProductImageAddedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductPriceAddedMessage) {
            return com.commercetools.api.models.message.ProductPriceAddedMessage
                    .deepCopy((com.commercetools.api.models.message.ProductPriceAddedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductPriceChangedMessage) {
            return com.commercetools.api.models.message.ProductPriceChangedMessage
                    .deepCopy((com.commercetools.api.models.message.ProductPriceChangedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductPriceDiscountsSetMessage) {
            return com.commercetools.api.models.message.ProductPriceDiscountsSetMessage
                    .deepCopy((com.commercetools.api.models.message.ProductPriceDiscountsSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductPriceExternalDiscountSetMessage) {
            return com.commercetools.api.models.message.ProductPriceExternalDiscountSetMessage
                    .deepCopy((com.commercetools.api.models.message.ProductPriceExternalDiscountSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductPriceKeySetMessage) {
            return com.commercetools.api.models.message.ProductPriceKeySetMessage
                    .deepCopy((com.commercetools.api.models.message.ProductPriceKeySetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductPriceModeSetMessage) {
            return com.commercetools.api.models.message.ProductPriceModeSetMessage
                    .deepCopy((com.commercetools.api.models.message.ProductPriceModeSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductPriceRemovedMessage) {
            return com.commercetools.api.models.message.ProductPriceRemovedMessage
                    .deepCopy((com.commercetools.api.models.message.ProductPriceRemovedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductPricesSetMessage) {
            return com.commercetools.api.models.message.ProductPricesSetMessage
                    .deepCopy((com.commercetools.api.models.message.ProductPricesSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductPublishedMessage) {
            return com.commercetools.api.models.message.ProductPublishedMessage
                    .deepCopy((com.commercetools.api.models.message.ProductPublishedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductRemovedFromCategoryMessage) {
            return com.commercetools.api.models.message.ProductRemovedFromCategoryMessage
                    .deepCopy((com.commercetools.api.models.message.ProductRemovedFromCategoryMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductRevertedStagedChangesMessage) {
            return com.commercetools.api.models.message.ProductRevertedStagedChangesMessage
                    .deepCopy((com.commercetools.api.models.message.ProductRevertedStagedChangesMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductSelectionCreatedMessage) {
            return com.commercetools.api.models.message.ProductSelectionCreatedMessage
                    .deepCopy((com.commercetools.api.models.message.ProductSelectionCreatedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductSelectionDeletedMessage) {
            return com.commercetools.api.models.message.ProductSelectionDeletedMessage
                    .deepCopy((com.commercetools.api.models.message.ProductSelectionDeletedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductSelectionProductAddedMessage) {
            return com.commercetools.api.models.message.ProductSelectionProductAddedMessage
                    .deepCopy((com.commercetools.api.models.message.ProductSelectionProductAddedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductSelectionProductExcludedMessage) {
            return com.commercetools.api.models.message.ProductSelectionProductExcludedMessage
                    .deepCopy((com.commercetools.api.models.message.ProductSelectionProductExcludedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductSelectionProductRemovedMessage) {
            return com.commercetools.api.models.message.ProductSelectionProductRemovedMessage
                    .deepCopy((com.commercetools.api.models.message.ProductSelectionProductRemovedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductSelectionVariantExclusionChangedMessage) {
            return com.commercetools.api.models.message.ProductSelectionVariantExclusionChangedMessage.deepCopy(
                (com.commercetools.api.models.message.ProductSelectionVariantExclusionChangedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductSelectionVariantSelectionChangedMessage) {
            return com.commercetools.api.models.message.ProductSelectionVariantSelectionChangedMessage.deepCopy(
                (com.commercetools.api.models.message.ProductSelectionVariantSelectionChangedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductSlugChangedMessage) {
            return com.commercetools.api.models.message.ProductSlugChangedMessage
                    .deepCopy((com.commercetools.api.models.message.ProductSlugChangedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductStateTransitionMessage) {
            return com.commercetools.api.models.message.ProductStateTransitionMessage
                    .deepCopy((com.commercetools.api.models.message.ProductStateTransitionMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductUnpublishedMessage) {
            return com.commercetools.api.models.message.ProductUnpublishedMessage
                    .deepCopy((com.commercetools.api.models.message.ProductUnpublishedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductVariantAddedMessage) {
            return com.commercetools.api.models.message.ProductVariantAddedMessage
                    .deepCopy((com.commercetools.api.models.message.ProductVariantAddedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.ProductVariantDeletedMessage) {
            return com.commercetools.api.models.message.ProductVariantDeletedMessage
                    .deepCopy((com.commercetools.api.models.message.ProductVariantDeletedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.QuoteCreatedMessage) {
            return com.commercetools.api.models.message.QuoteCreatedMessage
                    .deepCopy((com.commercetools.api.models.message.QuoteCreatedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.QuoteCustomerChangedMessage) {
            return com.commercetools.api.models.message.QuoteCustomerChangedMessage
                    .deepCopy((com.commercetools.api.models.message.QuoteCustomerChangedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.QuoteDeletedMessage) {
            return com.commercetools.api.models.message.QuoteDeletedMessage
                    .deepCopy((com.commercetools.api.models.message.QuoteDeletedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.QuoteRenegotiationRequestedMessage) {
            return com.commercetools.api.models.message.QuoteRenegotiationRequestedMessage
                    .deepCopy((com.commercetools.api.models.message.QuoteRenegotiationRequestedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.QuoteRequestCreatedMessage) {
            return com.commercetools.api.models.message.QuoteRequestCreatedMessage
                    .deepCopy((com.commercetools.api.models.message.QuoteRequestCreatedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.QuoteRequestCustomerChangedMessage) {
            return com.commercetools.api.models.message.QuoteRequestCustomerChangedMessage
                    .deepCopy((com.commercetools.api.models.message.QuoteRequestCustomerChangedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.QuoteRequestDeletedMessage) {
            return com.commercetools.api.models.message.QuoteRequestDeletedMessage
                    .deepCopy((com.commercetools.api.models.message.QuoteRequestDeletedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.QuoteRequestStateChangedMessage) {
            return com.commercetools.api.models.message.QuoteRequestStateChangedMessage
                    .deepCopy((com.commercetools.api.models.message.QuoteRequestStateChangedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.QuoteRequestStateTransitionMessage) {
            return com.commercetools.api.models.message.QuoteRequestStateTransitionMessage
                    .deepCopy((com.commercetools.api.models.message.QuoteRequestStateTransitionMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.QuoteStateChangedMessage) {
            return com.commercetools.api.models.message.QuoteStateChangedMessage
                    .deepCopy((com.commercetools.api.models.message.QuoteStateChangedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.QuoteStateTransitionMessage) {
            return com.commercetools.api.models.message.QuoteStateTransitionMessage
                    .deepCopy((com.commercetools.api.models.message.QuoteStateTransitionMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.ReviewCreatedMessage) {
            return com.commercetools.api.models.message.ReviewCreatedMessage
                    .deepCopy((com.commercetools.api.models.message.ReviewCreatedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.ReviewRatingSetMessage) {
            return com.commercetools.api.models.message.ReviewRatingSetMessage
                    .deepCopy((com.commercetools.api.models.message.ReviewRatingSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.ReviewStateTransitionMessage) {
            return com.commercetools.api.models.message.ReviewStateTransitionMessage
                    .deepCopy((com.commercetools.api.models.message.ReviewStateTransitionMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.StagedQuoteCreatedMessage) {
            return com.commercetools.api.models.message.StagedQuoteCreatedMessage
                    .deepCopy((com.commercetools.api.models.message.StagedQuoteCreatedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.StagedQuoteDeletedMessage) {
            return com.commercetools.api.models.message.StagedQuoteDeletedMessage
                    .deepCopy((com.commercetools.api.models.message.StagedQuoteDeletedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.StagedQuoteSellerCommentSetMessage) {
            return com.commercetools.api.models.message.StagedQuoteSellerCommentSetMessage
                    .deepCopy((com.commercetools.api.models.message.StagedQuoteSellerCommentSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.StagedQuoteStateChangedMessage) {
            return com.commercetools.api.models.message.StagedQuoteStateChangedMessage
                    .deepCopy((com.commercetools.api.models.message.StagedQuoteStateChangedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.StagedQuoteStateTransitionMessage) {
            return com.commercetools.api.models.message.StagedQuoteStateTransitionMessage
                    .deepCopy((com.commercetools.api.models.message.StagedQuoteStateTransitionMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.StagedQuoteValidToSetMessage) {
            return com.commercetools.api.models.message.StagedQuoteValidToSetMessage
                    .deepCopy((com.commercetools.api.models.message.StagedQuoteValidToSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.StandalonePriceActiveChangedMessage) {
            return com.commercetools.api.models.message.StandalonePriceActiveChangedMessage
                    .deepCopy((com.commercetools.api.models.message.StandalonePriceActiveChangedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.StandalonePriceCreatedMessage) {
            return com.commercetools.api.models.message.StandalonePriceCreatedMessage
                    .deepCopy((com.commercetools.api.models.message.StandalonePriceCreatedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.StandalonePriceDeletedMessage) {
            return com.commercetools.api.models.message.StandalonePriceDeletedMessage
                    .deepCopy((com.commercetools.api.models.message.StandalonePriceDeletedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.StandalonePriceDiscountSetMessage) {
            return com.commercetools.api.models.message.StandalonePriceDiscountSetMessage
                    .deepCopy((com.commercetools.api.models.message.StandalonePriceDiscountSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.StandalonePriceExternalDiscountSetMessage) {
            return com.commercetools.api.models.message.StandalonePriceExternalDiscountSetMessage.deepCopy(
                (com.commercetools.api.models.message.StandalonePriceExternalDiscountSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.StandalonePriceKeySetMessage) {
            return com.commercetools.api.models.message.StandalonePriceKeySetMessage
                    .deepCopy((com.commercetools.api.models.message.StandalonePriceKeySetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.StandalonePriceStagedChangesAppliedMessage) {
            return com.commercetools.api.models.message.StandalonePriceStagedChangesAppliedMessage.deepCopy(
                (com.commercetools.api.models.message.StandalonePriceStagedChangesAppliedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.StandalonePriceStagedChangesRemovedMessage) {
            return com.commercetools.api.models.message.StandalonePriceStagedChangesRemovedMessage.deepCopy(
                (com.commercetools.api.models.message.StandalonePriceStagedChangesRemovedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.StandalonePriceTierAddedMessage) {
            return com.commercetools.api.models.message.StandalonePriceTierAddedMessage
                    .deepCopy((com.commercetools.api.models.message.StandalonePriceTierAddedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.StandalonePriceTierRemovedMessage) {
            return com.commercetools.api.models.message.StandalonePriceTierRemovedMessage
                    .deepCopy((com.commercetools.api.models.message.StandalonePriceTierRemovedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.StandalonePriceTiersSetMessage) {
            return com.commercetools.api.models.message.StandalonePriceTiersSetMessage
                    .deepCopy((com.commercetools.api.models.message.StandalonePriceTiersSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.StandalonePriceValidFromAndUntilSetMessage) {
            return com.commercetools.api.models.message.StandalonePriceValidFromAndUntilSetMessage.deepCopy(
                (com.commercetools.api.models.message.StandalonePriceValidFromAndUntilSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.StandalonePriceValidFromSetMessage) {
            return com.commercetools.api.models.message.StandalonePriceValidFromSetMessage
                    .deepCopy((com.commercetools.api.models.message.StandalonePriceValidFromSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.StandalonePriceValidUntilSetMessage) {
            return com.commercetools.api.models.message.StandalonePriceValidUntilSetMessage
                    .deepCopy((com.commercetools.api.models.message.StandalonePriceValidUntilSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.StandalonePriceValueChangedMessage) {
            return com.commercetools.api.models.message.StandalonePriceValueChangedMessage
                    .deepCopy((com.commercetools.api.models.message.StandalonePriceValueChangedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.StoreCountriesChangedMessage) {
            return com.commercetools.api.models.message.StoreCountriesChangedMessage
                    .deepCopy((com.commercetools.api.models.message.StoreCountriesChangedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.StoreCreatedMessage) {
            return com.commercetools.api.models.message.StoreCreatedMessage
                    .deepCopy((com.commercetools.api.models.message.StoreCreatedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.StoreDeletedMessage) {
            return com.commercetools.api.models.message.StoreDeletedMessage
                    .deepCopy((com.commercetools.api.models.message.StoreDeletedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.StoreDistributionChannelsChangedMessage) {
            return com.commercetools.api.models.message.StoreDistributionChannelsChangedMessage
                    .deepCopy((com.commercetools.api.models.message.StoreDistributionChannelsChangedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.StoreLanguagesChangedMessage) {
            return com.commercetools.api.models.message.StoreLanguagesChangedMessage
                    .deepCopy((com.commercetools.api.models.message.StoreLanguagesChangedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.StoreNameSetMessage) {
            return com.commercetools.api.models.message.StoreNameSetMessage
                    .deepCopy((com.commercetools.api.models.message.StoreNameSetMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.StoreProductSelectionsChangedMessage) {
            return com.commercetools.api.models.message.StoreProductSelectionsChangedMessage
                    .deepCopy((com.commercetools.api.models.message.StoreProductSelectionsChangedMessage) template);
        }
        if (template instanceof com.commercetools.api.models.message.StoreSupplyChannelsChangedMessage) {
            return com.commercetools.api.models.message.StoreSupplyChannelsChangedMessage
                    .deepCopy((com.commercetools.api.models.message.StoreSupplyChannelsChangedMessage) template);
        }
        MessageImpl instance = new MessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
        return instance;
    }

    /**
     * builder for approvalFlowApproved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ApprovalFlowApprovedMessageBuilder approvalFlowApprovedBuilder() {
        return com.commercetools.api.models.message.ApprovalFlowApprovedMessageBuilder.of();
    }

    /**
     * builder for approvalFlowCompleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ApprovalFlowCompletedMessageBuilder approvalFlowCompletedBuilder() {
        return com.commercetools.api.models.message.ApprovalFlowCompletedMessageBuilder.of();
    }

    /**
     * builder for approvalFlowCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ApprovalFlowCreatedMessageBuilder approvalFlowCreatedBuilder() {
        return com.commercetools.api.models.message.ApprovalFlowCreatedMessageBuilder.of();
    }

    /**
     * builder for approvalFlowRejected subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ApprovalFlowRejectedMessageBuilder approvalFlowRejectedBuilder() {
        return com.commercetools.api.models.message.ApprovalFlowRejectedMessageBuilder.of();
    }

    /**
     * builder for approvalRuleApproversSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ApprovalRuleApproversSetMessageBuilder approvalRuleApproversSetBuilder() {
        return com.commercetools.api.models.message.ApprovalRuleApproversSetMessageBuilder.of();
    }

    /**
     * builder for approvalRuleCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ApprovalRuleCreatedMessageBuilder approvalRuleCreatedBuilder() {
        return com.commercetools.api.models.message.ApprovalRuleCreatedMessageBuilder.of();
    }

    /**
     * builder for approvalRuleDescriptionSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ApprovalRuleDescriptionSetMessageBuilder approvalRuleDescriptionSetBuilder() {
        return com.commercetools.api.models.message.ApprovalRuleDescriptionSetMessageBuilder.of();
    }

    /**
     * builder for approvalRuleKeySet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ApprovalRuleKeySetMessageBuilder approvalRuleKeySetBuilder() {
        return com.commercetools.api.models.message.ApprovalRuleKeySetMessageBuilder.of();
    }

    /**
     * builder for approvalRuleNameSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ApprovalRuleNameSetMessageBuilder approvalRuleNameSetBuilder() {
        return com.commercetools.api.models.message.ApprovalRuleNameSetMessageBuilder.of();
    }

    /**
     * builder for approvalRulePredicateSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ApprovalRulePredicateSetMessageBuilder approvalRulePredicateSetBuilder() {
        return com.commercetools.api.models.message.ApprovalRulePredicateSetMessageBuilder.of();
    }

    /**
     * builder for approvalRuleRequestersSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ApprovalRuleRequestersSetMessageBuilder approvalRuleRequestersSetBuilder() {
        return com.commercetools.api.models.message.ApprovalRuleRequestersSetMessageBuilder.of();
    }

    /**
     * builder for approvalRuleStatusSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ApprovalRuleStatusSetMessageBuilder approvalRuleStatusSetBuilder() {
        return com.commercetools.api.models.message.ApprovalRuleStatusSetMessageBuilder.of();
    }

    /**
     * builder for associateRoleBuyerAssignableChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.AssociateRoleBuyerAssignableChangedMessageBuilder associateRoleBuyerAssignableChangedBuilder() {
        return com.commercetools.api.models.message.AssociateRoleBuyerAssignableChangedMessageBuilder.of();
    }

    /**
     * builder for associateRoleCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.AssociateRoleCreatedMessageBuilder associateRoleCreatedBuilder() {
        return com.commercetools.api.models.message.AssociateRoleCreatedMessageBuilder.of();
    }

    /**
     * builder for associateRoleDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.AssociateRoleDeletedMessageBuilder associateRoleDeletedBuilder() {
        return com.commercetools.api.models.message.AssociateRoleDeletedMessageBuilder.of();
    }

    /**
     * builder for associateRoleNameSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.AssociateRoleNameChangedMessageBuilder associateRoleNameSetBuilder() {
        return com.commercetools.api.models.message.AssociateRoleNameChangedMessageBuilder.of();
    }

    /**
     * builder for associateRolePermissionAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.AssociateRolePermissionAddedMessageBuilder associateRolePermissionAddedBuilder() {
        return com.commercetools.api.models.message.AssociateRolePermissionAddedMessageBuilder.of();
    }

    /**
     * builder for associateRolePermissionRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.AssociateRolePermissionRemovedMessageBuilder associateRolePermissionRemovedBuilder() {
        return com.commercetools.api.models.message.AssociateRolePermissionRemovedMessageBuilder.of();
    }

    /**
     * builder for associateRolePermissionsSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.AssociateRolePermissionsSetMessageBuilder associateRolePermissionsSetBuilder() {
        return com.commercetools.api.models.message.AssociateRolePermissionsSetMessageBuilder.of();
    }

    /**
     * builder for businessUnitAddressAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAddressAddedMessageBuilder businessUnitAddressAddedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAddressAddedMessageBuilder.of();
    }

    /**
     * builder for businessUnitAddressChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAddressChangedMessageBuilder businessUnitAddressChangedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAddressChangedMessageBuilder.of();
    }

    /**
     * builder for businessUnitAddressCustomFieldAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAddressCustomFieldAddedMessageBuilder businessUnitAddressCustomFieldAddedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAddressCustomFieldAddedMessageBuilder.of();
    }

    /**
     * builder for businessUnitAddressCustomFieldChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAddressCustomFieldChangedMessageBuilder businessUnitAddressCustomFieldChangedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAddressCustomFieldChangedMessageBuilder.of();
    }

    /**
     * builder for businessUnitAddressCustomFieldRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAddressCustomFieldRemovedMessageBuilder businessUnitAddressCustomFieldRemovedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAddressCustomFieldRemovedMessageBuilder.of();
    }

    /**
     * builder for businessUnitAddressCustomTypeRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAddressCustomTypeRemovedMessageBuilder businessUnitAddressCustomTypeRemovedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAddressCustomTypeRemovedMessageBuilder.of();
    }

    /**
     * builder for businessUnitAddressCustomTypeSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAddressCustomTypeSetMessageBuilder businessUnitAddressCustomTypeSetBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAddressCustomTypeSetMessageBuilder.of();
    }

    /**
     * builder for businessUnitAddressRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAddressRemovedMessageBuilder businessUnitAddressRemovedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAddressRemovedMessageBuilder.of();
    }

    /**
     * builder for businessUnitAssociateAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAssociateAddedMessageBuilder businessUnitAssociateAddedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAssociateAddedMessageBuilder.of();
    }

    /**
     * builder for businessUnitAssociateChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAssociateChangedMessageBuilder businessUnitAssociateChangedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAssociateChangedMessageBuilder.of();
    }

    /**
     * builder for businessUnitAssociateModeChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAssociateModeChangedMessageBuilder businessUnitAssociateModeChangedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAssociateModeChangedMessageBuilder.of();
    }

    /**
     * builder for businessUnitAssociateRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAssociateRemovedMessageBuilder businessUnitAssociateRemovedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAssociateRemovedMessageBuilder.of();
    }

    /**
     * builder for businessUnitAssociatesSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitAssociatesSetMessageBuilder businessUnitAssociatesSetBuilder() {
        return com.commercetools.api.models.message.BusinessUnitAssociatesSetMessageBuilder.of();
    }

    /**
     * builder for businessUnitBillingAddressAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitBillingAddressAddedMessageBuilder businessUnitBillingAddressAddedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitBillingAddressAddedMessageBuilder.of();
    }

    /**
     * builder for businessUnitBillingAddressRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitBillingAddressRemovedMessageBuilder businessUnitBillingAddressRemovedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitBillingAddressRemovedMessageBuilder.of();
    }

    /**
     * builder for businessUnitContactEmailSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitContactEmailSetMessageBuilder businessUnitContactEmailSetBuilder() {
        return com.commercetools.api.models.message.BusinessUnitContactEmailSetMessageBuilder.of();
    }

    /**
     * builder for businessUnitCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitCreatedMessageBuilder businessUnitCreatedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitCreatedMessageBuilder.of();
    }

    /**
     * builder for businessUnitCustomFieldAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitCustomFieldAddedMessageBuilder businessUnitCustomFieldAddedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitCustomFieldAddedMessageBuilder.of();
    }

    /**
     * builder for businessUnitCustomFieldChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitCustomFieldChangedMessageBuilder businessUnitCustomFieldChangedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitCustomFieldChangedMessageBuilder.of();
    }

    /**
     * builder for businessUnitCustomFieldRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitCustomFieldRemovedMessageBuilder businessUnitCustomFieldRemovedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitCustomFieldRemovedMessageBuilder.of();
    }

    /**
     * builder for businessUnitCustomTypeRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitCustomTypeRemovedMessageBuilder businessUnitCustomTypeRemovedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitCustomTypeRemovedMessageBuilder.of();
    }

    /**
     * builder for businessUnitCustomTypeSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitCustomTypeSetMessageBuilder businessUnitCustomTypeSetBuilder() {
        return com.commercetools.api.models.message.BusinessUnitCustomTypeSetMessageBuilder.of();
    }

    /**
     * builder for businessUnitDefaultBillingAddressSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitDefaultBillingAddressSetMessageBuilder businessUnitDefaultBillingAddressSetBuilder() {
        return com.commercetools.api.models.message.BusinessUnitDefaultBillingAddressSetMessageBuilder.of();
    }

    /**
     * builder for businessUnitDefaultShippingAddressSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitDefaultShippingAddressSetMessageBuilder businessUnitDefaultShippingAddressSetBuilder() {
        return com.commercetools.api.models.message.BusinessUnitDefaultShippingAddressSetMessageBuilder.of();
    }

    /**
     * builder for businessUnitDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitDeletedMessageBuilder businessUnitDeletedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitDeletedMessageBuilder.of();
    }

    /**
     * builder for businessUnitNameChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitNameChangedMessageBuilder businessUnitNameChangedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitNameChangedMessageBuilder.of();
    }

    /**
     * builder for businessUnitParentChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitParentChangedMessageBuilder businessUnitParentChangedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitParentChangedMessageBuilder.of();
    }

    /**
     * builder for businessUnitShippingAddressAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitShippingAddressAddedMessageBuilder businessUnitShippingAddressAddedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitShippingAddressAddedMessageBuilder.of();
    }

    /**
     * builder for businessUnitShippingAddressRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitShippingAddressRemovedMessageBuilder businessUnitShippingAddressRemovedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitShippingAddressRemovedMessageBuilder.of();
    }

    /**
     * builder for businessUnitStatusChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitStatusChangedMessageBuilder businessUnitStatusChangedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitStatusChangedMessageBuilder.of();
    }

    /**
     * builder for businessUnitStoreAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitStoreAddedMessageBuilder businessUnitStoreAddedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitStoreAddedMessageBuilder.of();
    }

    /**
     * builder for businessUnitStoreModeChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitStoreModeChangedMessageBuilder businessUnitStoreModeChangedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitStoreModeChangedMessageBuilder.of();
    }

    /**
     * builder for businessUnitStoreRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitStoreRemovedMessageBuilder businessUnitStoreRemovedBuilder() {
        return com.commercetools.api.models.message.BusinessUnitStoreRemovedMessageBuilder.of();
    }

    /**
     * builder for businessUnitStoresSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.BusinessUnitStoresSetMessageBuilder businessUnitStoresSetBuilder() {
        return com.commercetools.api.models.message.BusinessUnitStoresSetMessageBuilder.of();
    }

    /**
     * builder for cartDiscountCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CartDiscountCreatedMessageBuilder cartDiscountCreatedBuilder() {
        return com.commercetools.api.models.message.CartDiscountCreatedMessageBuilder.of();
    }

    /**
     * builder for cartDiscountDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CartDiscountDeletedMessageBuilder cartDiscountDeletedBuilder() {
        return com.commercetools.api.models.message.CartDiscountDeletedMessageBuilder.of();
    }

    /**
     * builder for cartDiscountStoreAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CartDiscountStoreAddedMessageBuilder cartDiscountStoreAddedBuilder() {
        return com.commercetools.api.models.message.CartDiscountStoreAddedMessageBuilder.of();
    }

    /**
     * builder for cartDiscountStoreRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CartDiscountStoreRemovedMessageBuilder cartDiscountStoreRemovedBuilder() {
        return com.commercetools.api.models.message.CartDiscountStoreRemovedMessageBuilder.of();
    }

    /**
     * builder for cartDiscountStoresSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CartDiscountStoresSetMessageBuilder cartDiscountStoresSetBuilder() {
        return com.commercetools.api.models.message.CartDiscountStoresSetMessageBuilder.of();
    }

    /**
     * builder for categoryCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CategoryCreatedMessageBuilder categoryCreatedBuilder() {
        return com.commercetools.api.models.message.CategoryCreatedMessageBuilder.of();
    }

    /**
     * builder for categorySlugChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CategorySlugChangedMessageBuilder categorySlugChangedBuilder() {
        return com.commercetools.api.models.message.CategorySlugChangedMessageBuilder.of();
    }

    /**
     * builder for customLineItemStateTransition subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomLineItemStateTransitionMessageBuilder customLineItemStateTransitionBuilder() {
        return com.commercetools.api.models.message.CustomLineItemStateTransitionMessageBuilder.of();
    }

    /**
     * builder for customerAddressAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerAddressAddedMessageBuilder customerAddressAddedBuilder() {
        return com.commercetools.api.models.message.CustomerAddressAddedMessageBuilder.of();
    }

    /**
     * builder for customerAddressChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerAddressChangedMessageBuilder customerAddressChangedBuilder() {
        return com.commercetools.api.models.message.CustomerAddressChangedMessageBuilder.of();
    }

    /**
     * builder for customerAddressCustomFieldAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerAddressCustomFieldAddedMessageBuilder customerAddressCustomFieldAddedBuilder() {
        return com.commercetools.api.models.message.CustomerAddressCustomFieldAddedMessageBuilder.of();
    }

    /**
     * builder for customerAddressCustomFieldChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerAddressCustomFieldChangedMessageBuilder customerAddressCustomFieldChangedBuilder() {
        return com.commercetools.api.models.message.CustomerAddressCustomFieldChangedMessageBuilder.of();
    }

    /**
     * builder for customerAddressCustomFieldRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerAddressCustomFieldRemovedMessageBuilder customerAddressCustomFieldRemovedBuilder() {
        return com.commercetools.api.models.message.CustomerAddressCustomFieldRemovedMessageBuilder.of();
    }

    /**
     * builder for customerAddressCustomTypeRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerAddressCustomTypeRemovedMessageBuilder customerAddressCustomTypeRemovedBuilder() {
        return com.commercetools.api.models.message.CustomerAddressCustomTypeRemovedMessageBuilder.of();
    }

    /**
     * builder for customerAddressCustomTypeSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerAddressCustomTypeSetMessageBuilder customerAddressCustomTypeSetBuilder() {
        return com.commercetools.api.models.message.CustomerAddressCustomTypeSetMessageBuilder.of();
    }

    /**
     * builder for customerAddressRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerAddressRemovedMessageBuilder customerAddressRemovedBuilder() {
        return com.commercetools.api.models.message.CustomerAddressRemovedMessageBuilder.of();
    }

    /**
     * builder for customerCompanyNameSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerCompanyNameSetMessageBuilder customerCompanyNameSetBuilder() {
        return com.commercetools.api.models.message.CustomerCompanyNameSetMessageBuilder.of();
    }

    /**
     * builder for customerCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerCreatedMessageBuilder customerCreatedBuilder() {
        return com.commercetools.api.models.message.CustomerCreatedMessageBuilder.of();
    }

    /**
     * builder for customerCustomFieldAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerCustomFieldAddedMessageBuilder customerCustomFieldAddedBuilder() {
        return com.commercetools.api.models.message.CustomerCustomFieldAddedMessageBuilder.of();
    }

    /**
     * builder for customerCustomFieldChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerCustomFieldChangedMessageBuilder customerCustomFieldChangedBuilder() {
        return com.commercetools.api.models.message.CustomerCustomFieldChangedMessageBuilder.of();
    }

    /**
     * builder for customerCustomFieldRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerCustomFieldRemovedMessageBuilder customerCustomFieldRemovedBuilder() {
        return com.commercetools.api.models.message.CustomerCustomFieldRemovedMessageBuilder.of();
    }

    /**
     * builder for customerCustomTypeRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerCustomTypeRemovedMessageBuilder customerCustomTypeRemovedBuilder() {
        return com.commercetools.api.models.message.CustomerCustomTypeRemovedMessageBuilder.of();
    }

    /**
     * builder for customerCustomTypeSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerCustomTypeSetMessageBuilder customerCustomTypeSetBuilder() {
        return com.commercetools.api.models.message.CustomerCustomTypeSetMessageBuilder.of();
    }

    /**
     * builder for customerDateOfBirthSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerDateOfBirthSetMessageBuilder customerDateOfBirthSetBuilder() {
        return com.commercetools.api.models.message.CustomerDateOfBirthSetMessageBuilder.of();
    }

    /**
     * builder for customerDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerDeletedMessageBuilder customerDeletedBuilder() {
        return com.commercetools.api.models.message.CustomerDeletedMessageBuilder.of();
    }

    /**
     * builder for customerEmailChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerEmailChangedMessageBuilder customerEmailChangedBuilder() {
        return com.commercetools.api.models.message.CustomerEmailChangedMessageBuilder.of();
    }

    /**
     * builder for customerEmailTokenCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerEmailTokenCreatedMessageBuilder customerEmailTokenCreatedBuilder() {
        return com.commercetools.api.models.message.CustomerEmailTokenCreatedMessageBuilder.of();
    }

    /**
     * builder for customerEmailVerified subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerEmailVerifiedMessageBuilder customerEmailVerifiedBuilder() {
        return com.commercetools.api.models.message.CustomerEmailVerifiedMessageBuilder.of();
    }

    /**
     * builder for customerFirstNameSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerFirstNameSetMessageBuilder customerFirstNameSetBuilder() {
        return com.commercetools.api.models.message.CustomerFirstNameSetMessageBuilder.of();
    }

    /**
     * builder for customerGroupCustomFieldAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerGroupCustomFieldAddedMessageBuilder customerGroupCustomFieldAddedBuilder() {
        return com.commercetools.api.models.message.CustomerGroupCustomFieldAddedMessageBuilder.of();
    }

    /**
     * builder for customerGroupCustomFieldChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerGroupCustomFieldChangedMessageBuilder customerGroupCustomFieldChangedBuilder() {
        return com.commercetools.api.models.message.CustomerGroupCustomFieldChangedMessageBuilder.of();
    }

    /**
     * builder for customerGroupCustomFieldRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerGroupCustomFieldRemovedMessageBuilder customerGroupCustomFieldRemovedBuilder() {
        return com.commercetools.api.models.message.CustomerGroupCustomFieldRemovedMessageBuilder.of();
    }

    /**
     * builder for customerGroupCustomTypeRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerGroupCustomTypeRemovedMessageBuilder customerGroupCustomTypeRemovedBuilder() {
        return com.commercetools.api.models.message.CustomerGroupCustomTypeRemovedMessageBuilder.of();
    }

    /**
     * builder for customerGroupCustomTypeSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerGroupCustomTypeSetMessageBuilder customerGroupCustomTypeSetBuilder() {
        return com.commercetools.api.models.message.CustomerGroupCustomTypeSetMessageBuilder.of();
    }

    /**
     * builder for customerGroupSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerGroupSetMessageBuilder customerGroupSetBuilder() {
        return com.commercetools.api.models.message.CustomerGroupSetMessageBuilder.of();
    }

    /**
     * builder for customerLastNameSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerLastNameSetMessageBuilder customerLastNameSetBuilder() {
        return com.commercetools.api.models.message.CustomerLastNameSetMessageBuilder.of();
    }

    /**
     * builder for customerPasswordTokenCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerPasswordTokenCreatedMessageBuilder customerPasswordTokenCreatedBuilder() {
        return com.commercetools.api.models.message.CustomerPasswordTokenCreatedMessageBuilder.of();
    }

    /**
     * builder for customerPasswordUpdated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerPasswordUpdatedMessageBuilder customerPasswordUpdatedBuilder() {
        return com.commercetools.api.models.message.CustomerPasswordUpdatedMessageBuilder.of();
    }

    /**
     * builder for customerTitleSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.CustomerTitleSetMessageBuilder customerTitleSetBuilder() {
        return com.commercetools.api.models.message.CustomerTitleSetMessageBuilder.of();
    }

    /**
     * builder for deliveryAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.DeliveryAddedMessageBuilder deliveryAddedBuilder() {
        return com.commercetools.api.models.message.DeliveryAddedMessageBuilder.of();
    }

    /**
     * builder for deliveryAddressSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.DeliveryAddressSetMessageBuilder deliveryAddressSetBuilder() {
        return com.commercetools.api.models.message.DeliveryAddressSetMessageBuilder.of();
    }

    /**
     * builder for deliveryItemsUpdated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.DeliveryItemsUpdatedMessageBuilder deliveryItemsUpdatedBuilder() {
        return com.commercetools.api.models.message.DeliveryItemsUpdatedMessageBuilder.of();
    }

    /**
     * builder for deliveryRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.DeliveryRemovedMessageBuilder deliveryRemovedBuilder() {
        return com.commercetools.api.models.message.DeliveryRemovedMessageBuilder.of();
    }

    /**
     * builder for inventoryEntryCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.InventoryEntryCreatedMessageBuilder inventoryEntryCreatedBuilder() {
        return com.commercetools.api.models.message.InventoryEntryCreatedMessageBuilder.of();
    }

    /**
     * builder for inventoryEntryDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.InventoryEntryDeletedMessageBuilder inventoryEntryDeletedBuilder() {
        return com.commercetools.api.models.message.InventoryEntryDeletedMessageBuilder.of();
    }

    /**
     * builder for inventoryEntryQuantitySet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.InventoryEntryQuantitySetMessageBuilder inventoryEntryQuantitySetBuilder() {
        return com.commercetools.api.models.message.InventoryEntryQuantitySetMessageBuilder.of();
    }

    /**
     * builder for lineItemStateTransition subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.LineItemStateTransitionMessageBuilder lineItemStateTransitionBuilder() {
        return com.commercetools.api.models.message.LineItemStateTransitionMessageBuilder.of();
    }

    /**
     * builder for orderBillingAddressSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderBillingAddressSetMessageBuilder orderBillingAddressSetBuilder() {
        return com.commercetools.api.models.message.OrderBillingAddressSetMessageBuilder.of();
    }

    /**
     * builder for orderCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCreatedMessageBuilder orderCreatedBuilder() {
        return com.commercetools.api.models.message.OrderCreatedMessageBuilder.of();
    }

    /**
     * builder for orderCustomFieldAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomFieldAddedMessageBuilder orderCustomFieldAddedBuilder() {
        return com.commercetools.api.models.message.OrderCustomFieldAddedMessageBuilder.of();
    }

    /**
     * builder for orderCustomFieldChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomFieldChangedMessageBuilder orderCustomFieldChangedBuilder() {
        return com.commercetools.api.models.message.OrderCustomFieldChangedMessageBuilder.of();
    }

    /**
     * builder for orderCustomFieldRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomFieldRemovedMessageBuilder orderCustomFieldRemovedBuilder() {
        return com.commercetools.api.models.message.OrderCustomFieldRemovedMessageBuilder.of();
    }

    /**
     * builder for orderCustomLineItemAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomLineItemAddedMessageBuilder orderCustomLineItemAddedBuilder() {
        return com.commercetools.api.models.message.OrderCustomLineItemAddedMessageBuilder.of();
    }

    /**
     * builder for orderCustomLineItemDiscountSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomLineItemDiscountSetMessageBuilder orderCustomLineItemDiscountSetBuilder() {
        return com.commercetools.api.models.message.OrderCustomLineItemDiscountSetMessageBuilder.of();
    }

    /**
     * builder for orderCustomLineItemQuantityChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomLineItemQuantityChangedMessageBuilder orderCustomLineItemQuantityChangedBuilder() {
        return com.commercetools.api.models.message.OrderCustomLineItemQuantityChangedMessageBuilder.of();
    }

    /**
     * builder for orderCustomLineItemRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomLineItemRemovedMessageBuilder orderCustomLineItemRemovedBuilder() {
        return com.commercetools.api.models.message.OrderCustomLineItemRemovedMessageBuilder.of();
    }

    /**
     * builder for orderCustomTypeRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomTypeRemovedMessageBuilder orderCustomTypeRemovedBuilder() {
        return com.commercetools.api.models.message.OrderCustomTypeRemovedMessageBuilder.of();
    }

    /**
     * builder for orderCustomTypeSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomTypeSetMessageBuilder orderCustomTypeSetBuilder() {
        return com.commercetools.api.models.message.OrderCustomTypeSetMessageBuilder.of();
    }

    /**
     * builder for orderCustomerEmailSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomerEmailSetMessageBuilder orderCustomerEmailSetBuilder() {
        return com.commercetools.api.models.message.OrderCustomerEmailSetMessageBuilder.of();
    }

    /**
     * builder for orderCustomerGroupSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomerGroupSetMessageBuilder orderCustomerGroupSetBuilder() {
        return com.commercetools.api.models.message.OrderCustomerGroupSetMessageBuilder.of();
    }

    /**
     * builder for orderCustomerSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderCustomerSetMessageBuilder orderCustomerSetBuilder() {
        return com.commercetools.api.models.message.OrderCustomerSetMessageBuilder.of();
    }

    /**
     * builder for orderDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderDeletedMessageBuilder orderDeletedBuilder() {
        return com.commercetools.api.models.message.OrderDeletedMessageBuilder.of();
    }

    /**
     * builder for orderDiscountCodeAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderDiscountCodeAddedMessageBuilder orderDiscountCodeAddedBuilder() {
        return com.commercetools.api.models.message.OrderDiscountCodeAddedMessageBuilder.of();
    }

    /**
     * builder for orderDiscountCodeRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderDiscountCodeRemovedMessageBuilder orderDiscountCodeRemovedBuilder() {
        return com.commercetools.api.models.message.OrderDiscountCodeRemovedMessageBuilder.of();
    }

    /**
     * builder for orderDiscountCodeStateSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderDiscountCodeStateSetMessageBuilder orderDiscountCodeStateSetBuilder() {
        return com.commercetools.api.models.message.OrderDiscountCodeStateSetMessageBuilder.of();
    }

    /**
     * builder for orderEditApplied subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderEditAppliedMessageBuilder orderEditAppliedBuilder() {
        return com.commercetools.api.models.message.OrderEditAppliedMessageBuilder.of();
    }

    /**
     * builder for orderImported subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderImportedMessageBuilder orderImportedBuilder() {
        return com.commercetools.api.models.message.OrderImportedMessageBuilder.of();
    }

    /**
     * builder for orderLineItemAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderLineItemAddedMessageBuilder orderLineItemAddedBuilder() {
        return com.commercetools.api.models.message.OrderLineItemAddedMessageBuilder.of();
    }

    /**
     * builder for orderLineItemDiscountSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderLineItemDiscountSetMessageBuilder orderLineItemDiscountSetBuilder() {
        return com.commercetools.api.models.message.OrderLineItemDiscountSetMessageBuilder.of();
    }

    /**
     * builder for orderLineItemDistributionChannelSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderLineItemDistributionChannelSetMessageBuilder orderLineItemDistributionChannelSetBuilder() {
        return com.commercetools.api.models.message.OrderLineItemDistributionChannelSetMessageBuilder.of();
    }

    /**
     * builder for orderLineItemRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderLineItemRemovedMessageBuilder orderLineItemRemovedBuilder() {
        return com.commercetools.api.models.message.OrderLineItemRemovedMessageBuilder.of();
    }

    /**
     * builder for orderPaymentAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderPaymentAddedMessageBuilder orderPaymentAddedBuilder() {
        return com.commercetools.api.models.message.OrderPaymentAddedMessageBuilder.of();
    }

    /**
     * builder for orderPaymentStateChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderPaymentStateChangedMessageBuilder orderPaymentStateChangedBuilder() {
        return com.commercetools.api.models.message.OrderPaymentStateChangedMessageBuilder.of();
    }

    /**
     * builder for orderPurchaseOrderNumberSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderPurchaseOrderNumberSetMessageBuilder orderPurchaseOrderNumberSetBuilder() {
        return com.commercetools.api.models.message.OrderPurchaseOrderNumberSetMessageBuilder.of();
    }

    /**
     * builder for orderReturnShipmentStateChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderReturnShipmentStateChangedMessageBuilder orderReturnShipmentStateChangedBuilder() {
        return com.commercetools.api.models.message.OrderReturnShipmentStateChangedMessageBuilder.of();
    }

    /**
     * builder for orderShipmentStateChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderShipmentStateChangedMessageBuilder orderShipmentStateChangedBuilder() {
        return com.commercetools.api.models.message.OrderShipmentStateChangedMessageBuilder.of();
    }

    /**
     * builder for orderShippingAddressSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderShippingAddressSetMessageBuilder orderShippingAddressSetBuilder() {
        return com.commercetools.api.models.message.OrderShippingAddressSetMessageBuilder.of();
    }

    /**
     * builder for orderShippingInfoSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderShippingInfoSetMessageBuilder orderShippingInfoSetBuilder() {
        return com.commercetools.api.models.message.OrderShippingInfoSetMessageBuilder.of();
    }

    /**
     * builder for orderShippingRateInputSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderShippingRateInputSetMessageBuilder orderShippingRateInputSetBuilder() {
        return com.commercetools.api.models.message.OrderShippingRateInputSetMessageBuilder.of();
    }

    /**
     * builder for orderStateChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderStateChangedMessageBuilder orderStateChangedBuilder() {
        return com.commercetools.api.models.message.OrderStateChangedMessageBuilder.of();
    }

    /**
     * builder for orderStateTransition subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderStateTransitionMessageBuilder orderStateTransitionBuilder() {
        return com.commercetools.api.models.message.OrderStateTransitionMessageBuilder.of();
    }

    /**
     * builder for orderStoreSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.OrderStoreSetMessageBuilder orderStoreSetBuilder() {
        return com.commercetools.api.models.message.OrderStoreSetMessageBuilder.of();
    }

    /**
     * builder for parcelAddedToDelivery subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ParcelAddedToDeliveryMessageBuilder parcelAddedToDeliveryBuilder() {
        return com.commercetools.api.models.message.ParcelAddedToDeliveryMessageBuilder.of();
    }

    /**
     * builder for parcelItemsUpdated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ParcelItemsUpdatedMessageBuilder parcelItemsUpdatedBuilder() {
        return com.commercetools.api.models.message.ParcelItemsUpdatedMessageBuilder.of();
    }

    /**
     * builder for parcelMeasurementsUpdated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ParcelMeasurementsUpdatedMessageBuilder parcelMeasurementsUpdatedBuilder() {
        return com.commercetools.api.models.message.ParcelMeasurementsUpdatedMessageBuilder.of();
    }

    /**
     * builder for parcelRemovedFromDelivery subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ParcelRemovedFromDeliveryMessageBuilder parcelRemovedFromDeliveryBuilder() {
        return com.commercetools.api.models.message.ParcelRemovedFromDeliveryMessageBuilder.of();
    }

    /**
     * builder for parcelTrackingDataUpdated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ParcelTrackingDataUpdatedMessageBuilder parcelTrackingDataUpdatedBuilder() {
        return com.commercetools.api.models.message.ParcelTrackingDataUpdatedMessageBuilder.of();
    }

    /**
     * builder for paymentCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentCreatedMessageBuilder paymentCreatedBuilder() {
        return com.commercetools.api.models.message.PaymentCreatedMessageBuilder.of();
    }

    /**
     * builder for paymentInteractionAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentInteractionAddedMessageBuilder paymentInteractionAddedBuilder() {
        return com.commercetools.api.models.message.PaymentInteractionAddedMessageBuilder.of();
    }

    /**
     * builder for paymentStatusInterfaceCodeSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentStatusInterfaceCodeSetMessageBuilder paymentStatusInterfaceCodeSetBuilder() {
        return com.commercetools.api.models.message.PaymentStatusInterfaceCodeSetMessageBuilder.of();
    }

    /**
     * builder for paymentStatusStateTransition subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentStatusStateTransitionMessageBuilder paymentStatusStateTransitionBuilder() {
        return com.commercetools.api.models.message.PaymentStatusStateTransitionMessageBuilder.of();
    }

    /**
     * builder for paymentTransactionAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentTransactionAddedMessageBuilder paymentTransactionAddedBuilder() {
        return com.commercetools.api.models.message.PaymentTransactionAddedMessageBuilder.of();
    }

    /**
     * builder for paymentTransactionStateChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.PaymentTransactionStateChangedMessageBuilder paymentTransactionStateChangedBuilder() {
        return com.commercetools.api.models.message.PaymentTransactionStateChangedMessageBuilder.of();
    }

    /**
     * builder for productAddedToCategory subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductAddedToCategoryMessageBuilder productAddedToCategoryBuilder() {
        return com.commercetools.api.models.message.ProductAddedToCategoryMessageBuilder.of();
    }

    /**
     * builder for productCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductCreatedMessageBuilder productCreatedBuilder() {
        return com.commercetools.api.models.message.ProductCreatedMessageBuilder.of();
    }

    /**
     * builder for productDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductDeletedMessageBuilder productDeletedBuilder() {
        return com.commercetools.api.models.message.ProductDeletedMessageBuilder.of();
    }

    /**
     * builder for productImageAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductImageAddedMessageBuilder productImageAddedBuilder() {
        return com.commercetools.api.models.message.ProductImageAddedMessageBuilder.of();
    }

    /**
     * builder for productPriceAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPriceAddedMessageBuilder productPriceAddedBuilder() {
        return com.commercetools.api.models.message.ProductPriceAddedMessageBuilder.of();
    }

    /**
     * builder for productPriceChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPriceChangedMessageBuilder productPriceChangedBuilder() {
        return com.commercetools.api.models.message.ProductPriceChangedMessageBuilder.of();
    }

    /**
     * builder for productPriceDiscountsSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPriceDiscountsSetMessageBuilder productPriceDiscountsSetBuilder() {
        return com.commercetools.api.models.message.ProductPriceDiscountsSetMessageBuilder.of();
    }

    /**
     * builder for productPriceExternalDiscountSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPriceExternalDiscountSetMessageBuilder productPriceExternalDiscountSetBuilder() {
        return com.commercetools.api.models.message.ProductPriceExternalDiscountSetMessageBuilder.of();
    }

    /**
     * builder for productPriceKeySet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPriceKeySetMessageBuilder productPriceKeySetBuilder() {
        return com.commercetools.api.models.message.ProductPriceKeySetMessageBuilder.of();
    }

    /**
     * builder for productPriceModeSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPriceModeSetMessageBuilder productPriceModeSetBuilder() {
        return com.commercetools.api.models.message.ProductPriceModeSetMessageBuilder.of();
    }

    /**
     * builder for productPriceRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPriceRemovedMessageBuilder productPriceRemovedBuilder() {
        return com.commercetools.api.models.message.ProductPriceRemovedMessageBuilder.of();
    }

    /**
     * builder for productPricesSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPricesSetMessageBuilder productPricesSetBuilder() {
        return com.commercetools.api.models.message.ProductPricesSetMessageBuilder.of();
    }

    /**
     * builder for productPublished subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductPublishedMessageBuilder productPublishedBuilder() {
        return com.commercetools.api.models.message.ProductPublishedMessageBuilder.of();
    }

    /**
     * builder for productRemovedFromCategory subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductRemovedFromCategoryMessageBuilder productRemovedFromCategoryBuilder() {
        return com.commercetools.api.models.message.ProductRemovedFromCategoryMessageBuilder.of();
    }

    /**
     * builder for productRevertedStagedChanges subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductRevertedStagedChangesMessageBuilder productRevertedStagedChangesBuilder() {
        return com.commercetools.api.models.message.ProductRevertedStagedChangesMessageBuilder.of();
    }

    /**
     * builder for productSelectionCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductSelectionCreatedMessageBuilder productSelectionCreatedBuilder() {
        return com.commercetools.api.models.message.ProductSelectionCreatedMessageBuilder.of();
    }

    /**
     * builder for productSelectionDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductSelectionDeletedMessageBuilder productSelectionDeletedBuilder() {
        return com.commercetools.api.models.message.ProductSelectionDeletedMessageBuilder.of();
    }

    /**
     * builder for productSelectionProductAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductSelectionProductAddedMessageBuilder productSelectionProductAddedBuilder() {
        return com.commercetools.api.models.message.ProductSelectionProductAddedMessageBuilder.of();
    }

    /**
     * builder for productSelectionProductExcluded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductSelectionProductExcludedMessageBuilder productSelectionProductExcludedBuilder() {
        return com.commercetools.api.models.message.ProductSelectionProductExcludedMessageBuilder.of();
    }

    /**
     * builder for productSelectionProductRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductSelectionProductRemovedMessageBuilder productSelectionProductRemovedBuilder() {
        return com.commercetools.api.models.message.ProductSelectionProductRemovedMessageBuilder.of();
    }

    /**
     * builder for productSelectionVariantExclusionChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductSelectionVariantExclusionChangedMessageBuilder productSelectionVariantExclusionChangedBuilder() {
        return com.commercetools.api.models.message.ProductSelectionVariantExclusionChangedMessageBuilder.of();
    }

    /**
     * builder for productSelectionVariantSelectionChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductSelectionVariantSelectionChangedMessageBuilder productSelectionVariantSelectionChangedBuilder() {
        return com.commercetools.api.models.message.ProductSelectionVariantSelectionChangedMessageBuilder.of();
    }

    /**
     * builder for productSlugChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductSlugChangedMessageBuilder productSlugChangedBuilder() {
        return com.commercetools.api.models.message.ProductSlugChangedMessageBuilder.of();
    }

    /**
     * builder for productStateTransition subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductStateTransitionMessageBuilder productStateTransitionBuilder() {
        return com.commercetools.api.models.message.ProductStateTransitionMessageBuilder.of();
    }

    /**
     * builder for productUnpublished subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductUnpublishedMessageBuilder productUnpublishedBuilder() {
        return com.commercetools.api.models.message.ProductUnpublishedMessageBuilder.of();
    }

    /**
     * builder for productVariantAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductVariantAddedMessageBuilder productVariantAddedBuilder() {
        return com.commercetools.api.models.message.ProductVariantAddedMessageBuilder.of();
    }

    /**
     * builder for productVariantDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ProductVariantDeletedMessageBuilder productVariantDeletedBuilder() {
        return com.commercetools.api.models.message.ProductVariantDeletedMessageBuilder.of();
    }

    /**
     * builder for quoteCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteCreatedMessageBuilder quoteCreatedBuilder() {
        return com.commercetools.api.models.message.QuoteCreatedMessageBuilder.of();
    }

    /**
     * builder for quoteCustomerChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteCustomerChangedMessageBuilder quoteCustomerChangedBuilder() {
        return com.commercetools.api.models.message.QuoteCustomerChangedMessageBuilder.of();
    }

    /**
     * builder for quoteDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteDeletedMessageBuilder quoteDeletedBuilder() {
        return com.commercetools.api.models.message.QuoteDeletedMessageBuilder.of();
    }

    /**
     * builder for quoteRenegotiationRequested subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteRenegotiationRequestedMessageBuilder quoteRenegotiationRequestedBuilder() {
        return com.commercetools.api.models.message.QuoteRenegotiationRequestedMessageBuilder.of();
    }

    /**
     * builder for quoteRequestCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteRequestCreatedMessageBuilder quoteRequestCreatedBuilder() {
        return com.commercetools.api.models.message.QuoteRequestCreatedMessageBuilder.of();
    }

    /**
     * builder for quoteRequestCustomerChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteRequestCustomerChangedMessageBuilder quoteRequestCustomerChangedBuilder() {
        return com.commercetools.api.models.message.QuoteRequestCustomerChangedMessageBuilder.of();
    }

    /**
     * builder for quoteRequestDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteRequestDeletedMessageBuilder quoteRequestDeletedBuilder() {
        return com.commercetools.api.models.message.QuoteRequestDeletedMessageBuilder.of();
    }

    /**
     * builder for quoteRequestStateChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteRequestStateChangedMessageBuilder quoteRequestStateChangedBuilder() {
        return com.commercetools.api.models.message.QuoteRequestStateChangedMessageBuilder.of();
    }

    /**
     * builder for quoteRequestStateTransition subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteRequestStateTransitionMessageBuilder quoteRequestStateTransitionBuilder() {
        return com.commercetools.api.models.message.QuoteRequestStateTransitionMessageBuilder.of();
    }

    /**
     * builder for quoteStateChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteStateChangedMessageBuilder quoteStateChangedBuilder() {
        return com.commercetools.api.models.message.QuoteStateChangedMessageBuilder.of();
    }

    /**
     * builder for quoteStateTransition subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.QuoteStateTransitionMessageBuilder quoteStateTransitionBuilder() {
        return com.commercetools.api.models.message.QuoteStateTransitionMessageBuilder.of();
    }

    /**
     * builder for returnInfoAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ReturnInfoAddedMessageBuilder returnInfoAddedBuilder() {
        return com.commercetools.api.models.message.ReturnInfoAddedMessageBuilder.of();
    }

    /**
     * builder for returnInfoSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ReturnInfoSetMessageBuilder returnInfoSetBuilder() {
        return com.commercetools.api.models.message.ReturnInfoSetMessageBuilder.of();
    }

    /**
     * builder for reviewCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ReviewCreatedMessageBuilder reviewCreatedBuilder() {
        return com.commercetools.api.models.message.ReviewCreatedMessageBuilder.of();
    }

    /**
     * builder for reviewRatingSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ReviewRatingSetMessageBuilder reviewRatingSetBuilder() {
        return com.commercetools.api.models.message.ReviewRatingSetMessageBuilder.of();
    }

    /**
     * builder for reviewStateTransition subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.ReviewStateTransitionMessageBuilder reviewStateTransitionBuilder() {
        return com.commercetools.api.models.message.ReviewStateTransitionMessageBuilder.of();
    }

    /**
     * builder for stagedQuoteCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StagedQuoteCreatedMessageBuilder stagedQuoteCreatedBuilder() {
        return com.commercetools.api.models.message.StagedQuoteCreatedMessageBuilder.of();
    }

    /**
     * builder for stagedQuoteDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StagedQuoteDeletedMessageBuilder stagedQuoteDeletedBuilder() {
        return com.commercetools.api.models.message.StagedQuoteDeletedMessageBuilder.of();
    }

    /**
     * builder for stagedQuoteSellerCommentSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StagedQuoteSellerCommentSetMessageBuilder stagedQuoteSellerCommentSetBuilder() {
        return com.commercetools.api.models.message.StagedQuoteSellerCommentSetMessageBuilder.of();
    }

    /**
     * builder for stagedQuoteStateChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StagedQuoteStateChangedMessageBuilder stagedQuoteStateChangedBuilder() {
        return com.commercetools.api.models.message.StagedQuoteStateChangedMessageBuilder.of();
    }

    /**
     * builder for stagedQuoteStateTransition subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StagedQuoteStateTransitionMessageBuilder stagedQuoteStateTransitionBuilder() {
        return com.commercetools.api.models.message.StagedQuoteStateTransitionMessageBuilder.of();
    }

    /**
     * builder for stagedQuoteValidToSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StagedQuoteValidToSetMessageBuilder stagedQuoteValidToSetBuilder() {
        return com.commercetools.api.models.message.StagedQuoteValidToSetMessageBuilder.of();
    }

    /**
     * builder for standalonePriceActiveChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceActiveChangedMessageBuilder standalonePriceActiveChangedBuilder() {
        return com.commercetools.api.models.message.StandalonePriceActiveChangedMessageBuilder.of();
    }

    /**
     * builder for standalonePriceCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceCreatedMessageBuilder standalonePriceCreatedBuilder() {
        return com.commercetools.api.models.message.StandalonePriceCreatedMessageBuilder.of();
    }

    /**
     * builder for standalonePriceDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceDeletedMessageBuilder standalonePriceDeletedBuilder() {
        return com.commercetools.api.models.message.StandalonePriceDeletedMessageBuilder.of();
    }

    /**
     * builder for standalonePriceDiscountSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceDiscountSetMessageBuilder standalonePriceDiscountSetBuilder() {
        return com.commercetools.api.models.message.StandalonePriceDiscountSetMessageBuilder.of();
    }

    /**
     * builder for standalonePriceExternalDiscountSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceExternalDiscountSetMessageBuilder standalonePriceExternalDiscountSetBuilder() {
        return com.commercetools.api.models.message.StandalonePriceExternalDiscountSetMessageBuilder.of();
    }

    /**
     * builder for standalonePriceKeySet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceKeySetMessageBuilder standalonePriceKeySetBuilder() {
        return com.commercetools.api.models.message.StandalonePriceKeySetMessageBuilder.of();
    }

    /**
     * builder for standalonePriceStagedChangesApplied subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceStagedChangesAppliedMessageBuilder standalonePriceStagedChangesAppliedBuilder() {
        return com.commercetools.api.models.message.StandalonePriceStagedChangesAppliedMessageBuilder.of();
    }

    /**
     * builder for standalonePriceStagedChangesRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceStagedChangesRemovedMessageBuilder standalonePriceStagedChangesRemovedBuilder() {
        return com.commercetools.api.models.message.StandalonePriceStagedChangesRemovedMessageBuilder.of();
    }

    /**
     * builder for standalonePriceTierAdded subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceTierAddedMessageBuilder standalonePriceTierAddedBuilder() {
        return com.commercetools.api.models.message.StandalonePriceTierAddedMessageBuilder.of();
    }

    /**
     * builder for standalonePriceTierRemoved subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceTierRemovedMessageBuilder standalonePriceTierRemovedBuilder() {
        return com.commercetools.api.models.message.StandalonePriceTierRemovedMessageBuilder.of();
    }

    /**
     * builder for standalonePriceTiersSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceTiersSetMessageBuilder standalonePriceTiersSetBuilder() {
        return com.commercetools.api.models.message.StandalonePriceTiersSetMessageBuilder.of();
    }

    /**
     * builder for standalonePriceValidFromAndUntilSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceValidFromAndUntilSetMessageBuilder standalonePriceValidFromAndUntilSetBuilder() {
        return com.commercetools.api.models.message.StandalonePriceValidFromAndUntilSetMessageBuilder.of();
    }

    /**
     * builder for standalonePriceValidFromSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceValidFromSetMessageBuilder standalonePriceValidFromSetBuilder() {
        return com.commercetools.api.models.message.StandalonePriceValidFromSetMessageBuilder.of();
    }

    /**
     * builder for standalonePriceValidUntilSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceValidUntilSetMessageBuilder standalonePriceValidUntilSetBuilder() {
        return com.commercetools.api.models.message.StandalonePriceValidUntilSetMessageBuilder.of();
    }

    /**
     * builder for standalonePriceValueChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StandalonePriceValueChangedMessageBuilder standalonePriceValueChangedBuilder() {
        return com.commercetools.api.models.message.StandalonePriceValueChangedMessageBuilder.of();
    }

    /**
     * builder for storeCountriesChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StoreCountriesChangedMessageBuilder storeCountriesChangedBuilder() {
        return com.commercetools.api.models.message.StoreCountriesChangedMessageBuilder.of();
    }

    /**
     * builder for storeCreated subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StoreCreatedMessageBuilder storeCreatedBuilder() {
        return com.commercetools.api.models.message.StoreCreatedMessageBuilder.of();
    }

    /**
     * builder for storeDeleted subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StoreDeletedMessageBuilder storeDeletedBuilder() {
        return com.commercetools.api.models.message.StoreDeletedMessageBuilder.of();
    }

    /**
     * builder for storeDistributionChannelsChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StoreDistributionChannelsChangedMessageBuilder storeDistributionChannelsChangedBuilder() {
        return com.commercetools.api.models.message.StoreDistributionChannelsChangedMessageBuilder.of();
    }

    /**
     * builder for storeLanguagesChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StoreLanguagesChangedMessageBuilder storeLanguagesChangedBuilder() {
        return com.commercetools.api.models.message.StoreLanguagesChangedMessageBuilder.of();
    }

    /**
     * builder for storeNameSet subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StoreNameSetMessageBuilder storeNameSetBuilder() {
        return com.commercetools.api.models.message.StoreNameSetMessageBuilder.of();
    }

    /**
     * builder for storeProductSelectionsChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StoreProductSelectionsChangedMessageBuilder storeProductSelectionsChangedBuilder() {
        return com.commercetools.api.models.message.StoreProductSelectionsChangedMessageBuilder.of();
    }

    /**
     * builder for storeSupplyChannelsChanged subtype
     * @return builder
     */
    public static com.commercetools.api.models.message.StoreSupplyChannelsChangedMessageBuilder storeSupplyChannelsChangedBuilder() {
        return com.commercetools.api.models.message.StoreSupplyChannelsChangedMessageBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withMessage(Function<Message, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Message> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Message>() {
            @Override
            public String toString() {
                return "TypeReference<Message>";
            }
        };
    }
}
