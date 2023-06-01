package com.commercetools.api.models.message;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.message.AssociateRoleBuyerAssignableChangedMessage;
import com.commercetools.api.models.message.AssociateRoleCreatedMessage;
import com.commercetools.api.models.message.AssociateRoleDeletedMessage;
import com.commercetools.api.models.message.AssociateRoleNameChangedMessage;
import com.commercetools.api.models.message.AssociateRolePermissionAddedMessage;
import com.commercetools.api.models.message.AssociateRolePermissionRemovedMessage;
import com.commercetools.api.models.message.AssociateRolePermissionsSetMessage;
import com.commercetools.api.models.message.BusinessUnitAddressAddedMessage;
import com.commercetools.api.models.message.BusinessUnitAddressChangedMessage;
import com.commercetools.api.models.message.BusinessUnitAddressRemovedMessage;
import com.commercetools.api.models.message.BusinessUnitAssociateAddedMessage;
import com.commercetools.api.models.message.BusinessUnitAssociateChangedMessage;
import com.commercetools.api.models.message.BusinessUnitAssociateModeChangedMessage;
import com.commercetools.api.models.message.BusinessUnitAssociateRemovedMessage;
import com.commercetools.api.models.message.BusinessUnitAssociatesSetMessage;
import com.commercetools.api.models.message.BusinessUnitBillingAddressAddedMessage;
import com.commercetools.api.models.message.BusinessUnitBillingAddressRemovedMessage;
import com.commercetools.api.models.message.BusinessUnitContactEmailSetMessage;
import com.commercetools.api.models.message.BusinessUnitCreatedMessage;
import com.commercetools.api.models.message.BusinessUnitDefaultBillingAddressSetMessage;
import com.commercetools.api.models.message.BusinessUnitDefaultShippingAddressSetMessage;
import com.commercetools.api.models.message.BusinessUnitDeletedMessage;
import com.commercetools.api.models.message.BusinessUnitNameChangedMessage;
import com.commercetools.api.models.message.BusinessUnitParentUnitChangedMessage;
import com.commercetools.api.models.message.BusinessUnitShippingAddressAddedMessage;
import com.commercetools.api.models.message.BusinessUnitShippingAddressRemovedMessage;
import com.commercetools.api.models.message.BusinessUnitStatusChangedMessage;
import com.commercetools.api.models.message.BusinessUnitStoreAddedMessage;
import com.commercetools.api.models.message.BusinessUnitStoreModeChangedMessage;
import com.commercetools.api.models.message.BusinessUnitStoreRemovedMessage;
import com.commercetools.api.models.message.BusinessUnitStoresSetMessage;
import com.commercetools.api.models.message.CategoryCreatedMessage;
import com.commercetools.api.models.message.CategorySlugChangedMessage;
import com.commercetools.api.models.message.CustomerAddressAddedMessage;
import com.commercetools.api.models.message.CustomerAddressChangedMessage;
import com.commercetools.api.models.message.CustomerAddressRemovedMessage;
import com.commercetools.api.models.message.CustomerCompanyNameSetMessage;
import com.commercetools.api.models.message.CustomerCreatedMessage;
import com.commercetools.api.models.message.CustomerDateOfBirthSetMessage;
import com.commercetools.api.models.message.CustomerDeletedMessage;
import com.commercetools.api.models.message.CustomerEmailChangedMessage;
import com.commercetools.api.models.message.CustomerEmailVerifiedMessage;
import com.commercetools.api.models.message.CustomerFirstNameSetMessage;
import com.commercetools.api.models.message.CustomerGroupSetMessage;
import com.commercetools.api.models.message.CustomerLastNameSetMessage;
import com.commercetools.api.models.message.CustomerPasswordUpdatedMessage;
import com.commercetools.api.models.message.CustomerTitleSetMessage;
import com.commercetools.api.models.message.InventoryEntryCreatedMessage;
import com.commercetools.api.models.message.InventoryEntryDeletedMessage;
import com.commercetools.api.models.message.InventoryEntryQuantitySetMessage;
import com.commercetools.api.models.message.OrderMessage;
import com.commercetools.api.models.message.OrderPaymentAddedMessage;
import com.commercetools.api.models.message.PaymentCreatedMessage;
import com.commercetools.api.models.message.PaymentInteractionAddedMessage;
import com.commercetools.api.models.message.PaymentStatusInterfaceCodeSetMessage;
import com.commercetools.api.models.message.PaymentStatusStateTransitionMessage;
import com.commercetools.api.models.message.PaymentTransactionAddedMessage;
import com.commercetools.api.models.message.PaymentTransactionStateChangedMessage;
import com.commercetools.api.models.message.ProductAddedToCategoryMessage;
import com.commercetools.api.models.message.ProductCreatedMessage;
import com.commercetools.api.models.message.ProductDeletedMessage;
import com.commercetools.api.models.message.ProductImageAddedMessage;
import com.commercetools.api.models.message.ProductPriceAddedMessage;
import com.commercetools.api.models.message.ProductPriceChangedMessage;
import com.commercetools.api.models.message.ProductPriceDiscountsSetMessage;
import com.commercetools.api.models.message.ProductPriceExternalDiscountSetMessage;
import com.commercetools.api.models.message.ProductPriceKeySetMessage;
import com.commercetools.api.models.message.ProductPriceModeSetMessage;
import com.commercetools.api.models.message.ProductPriceRemovedMessage;
import com.commercetools.api.models.message.ProductPricesSetMessage;
import com.commercetools.api.models.message.ProductPublishedMessage;
import com.commercetools.api.models.message.ProductRemovedFromCategoryMessage;
import com.commercetools.api.models.message.ProductRevertedStagedChangesMessage;
import com.commercetools.api.models.message.ProductSelectionCreatedMessage;
import com.commercetools.api.models.message.ProductSelectionDeletedMessage;
import com.commercetools.api.models.message.ProductSelectionProductAddedMessage;
import com.commercetools.api.models.message.ProductSelectionProductExcludedMessage;
import com.commercetools.api.models.message.ProductSelectionProductRemovedMessage;
import com.commercetools.api.models.message.ProductSelectionVariantExclusionChangedMessage;
import com.commercetools.api.models.message.ProductSelectionVariantSelectionChangedMessage;
import com.commercetools.api.models.message.ProductSlugChangedMessage;
import com.commercetools.api.models.message.ProductStateTransitionMessage;
import com.commercetools.api.models.message.ProductUnpublishedMessage;
import com.commercetools.api.models.message.ProductVariantAddedMessage;
import com.commercetools.api.models.message.ProductVariantDeletedMessage;
import com.commercetools.api.models.message.QuoteCreatedMessage;
import com.commercetools.api.models.message.QuoteCustomerChangedMessage;
import com.commercetools.api.models.message.QuoteDeletedMessage;
import com.commercetools.api.models.message.QuoteRequestCreatedMessage;
import com.commercetools.api.models.message.QuoteRequestCustomerChangedMessage;
import com.commercetools.api.models.message.QuoteRequestDeletedMessage;
import com.commercetools.api.models.message.QuoteRequestStateChangedMessage;
import com.commercetools.api.models.message.QuoteRequestStateTransitionMessage;
import com.commercetools.api.models.message.QuoteStateChangedMessage;
import com.commercetools.api.models.message.QuoteStateTransitionMessage;
import com.commercetools.api.models.message.ReviewCreatedMessage;
import com.commercetools.api.models.message.ReviewRatingSetMessage;
import com.commercetools.api.models.message.ReviewStateTransitionMessage;
import com.commercetools.api.models.message.StagedQuoteCreatedMessage;
import com.commercetools.api.models.message.StagedQuoteDeletedMessage;
import com.commercetools.api.models.message.StagedQuoteSellerCommentSetMessage;
import com.commercetools.api.models.message.StagedQuoteStateChangedMessage;
import com.commercetools.api.models.message.StagedQuoteStateTransitionMessage;
import com.commercetools.api.models.message.StagedQuoteValidToSetMessage;
import com.commercetools.api.models.message.StandalonePriceActiveChangedMessage;
import com.commercetools.api.models.message.StandalonePriceCreatedMessage;
import com.commercetools.api.models.message.StandalonePriceDeletedMessage;
import com.commercetools.api.models.message.StandalonePriceDiscountSetMessage;
import com.commercetools.api.models.message.StandalonePriceExternalDiscountSetMessage;
import com.commercetools.api.models.message.StandalonePriceKeySetMessage;
import com.commercetools.api.models.message.StandalonePriceStagedChangesAppliedMessage;
import com.commercetools.api.models.message.StandalonePriceValueChangedMessage;
import com.commercetools.api.models.message.StoreCountriesChangedMessage;
import com.commercetools.api.models.message.StoreCreatedMessage;
import com.commercetools.api.models.message.StoreDeletedMessage;
import com.commercetools.api.models.message.StoreDistributionChannelsChangedMessage;
import com.commercetools.api.models.message.StoreLanguagesChangedMessage;
import com.commercetools.api.models.message.StoreNameSetMessage;
import com.commercetools.api.models.message.StoreProductSelectionsChangedMessage;
import com.commercetools.api.models.message.StoreSupplyChannelsChangedMessage;
import com.commercetools.api.models.message.UserProvidedIdentifiers;
import java.time.ZonedDateTime;
import com.commercetools.api.models.message.Message;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MessageBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MessageBuilder {

    public com.commercetools.api.models.message.AssociateRoleBuyerAssignableChangedMessageBuilder associateRoleBuyerAssignableChangedBuilder() {
       return com.commercetools.api.models.message.AssociateRoleBuyerAssignableChangedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.AssociateRoleCreatedMessageBuilder associateRoleCreatedBuilder() {
       return com.commercetools.api.models.message.AssociateRoleCreatedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.AssociateRoleDeletedMessageBuilder associateRoleDeletedBuilder() {
       return com.commercetools.api.models.message.AssociateRoleDeletedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.AssociateRoleNameChangedMessageBuilder associateRoleNameSetBuilder() {
       return com.commercetools.api.models.message.AssociateRoleNameChangedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.AssociateRolePermissionAddedMessageBuilder associateRolePermissionAddedBuilder() {
       return com.commercetools.api.models.message.AssociateRolePermissionAddedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.AssociateRolePermissionRemovedMessageBuilder associateRolePermissionRemovedBuilder() {
       return com.commercetools.api.models.message.AssociateRolePermissionRemovedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.AssociateRolePermissionsSetMessageBuilder associateRolePermissionsSetBuilder() {
       return com.commercetools.api.models.message.AssociateRolePermissionsSetMessageBuilder.of();
    }
    public com.commercetools.api.models.message.BusinessUnitAddressAddedMessageBuilder businessUnitAddressAddedBuilder() {
       return com.commercetools.api.models.message.BusinessUnitAddressAddedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.BusinessUnitAddressChangedMessageBuilder businessUnitAddressChangedBuilder() {
       return com.commercetools.api.models.message.BusinessUnitAddressChangedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.BusinessUnitAddressRemovedMessageBuilder businessUnitAddressRemovedBuilder() {
       return com.commercetools.api.models.message.BusinessUnitAddressRemovedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.BusinessUnitAssociateAddedMessageBuilder businessUnitAssociateAddedBuilder() {
       return com.commercetools.api.models.message.BusinessUnitAssociateAddedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.BusinessUnitAssociateChangedMessageBuilder businessUnitAssociateChangedBuilder() {
       return com.commercetools.api.models.message.BusinessUnitAssociateChangedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.BusinessUnitAssociateModeChangedMessageBuilder businessUnitAssociateModeChangedBuilder() {
       return com.commercetools.api.models.message.BusinessUnitAssociateModeChangedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.BusinessUnitAssociateRemovedMessageBuilder businessUnitAssociateRemovedBuilder() {
       return com.commercetools.api.models.message.BusinessUnitAssociateRemovedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.BusinessUnitAssociatesSetMessageBuilder businessUnitAssociatesSetBuilder() {
       return com.commercetools.api.models.message.BusinessUnitAssociatesSetMessageBuilder.of();
    }
    public com.commercetools.api.models.message.BusinessUnitBillingAddressAddedMessageBuilder businessUnitBillingAddressAddedBuilder() {
       return com.commercetools.api.models.message.BusinessUnitBillingAddressAddedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.BusinessUnitBillingAddressRemovedMessageBuilder businessUnitBillingAddressRemovedBuilder() {
       return com.commercetools.api.models.message.BusinessUnitBillingAddressRemovedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.BusinessUnitContactEmailSetMessageBuilder businessUnitContactEmailSetBuilder() {
       return com.commercetools.api.models.message.BusinessUnitContactEmailSetMessageBuilder.of();
    }
    public com.commercetools.api.models.message.BusinessUnitCreatedMessageBuilder businessUnitCreatedBuilder() {
       return com.commercetools.api.models.message.BusinessUnitCreatedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.BusinessUnitDefaultBillingAddressSetMessageBuilder businessUnitDefaultBillingAddressSetBuilder() {
       return com.commercetools.api.models.message.BusinessUnitDefaultBillingAddressSetMessageBuilder.of();
    }
    public com.commercetools.api.models.message.BusinessUnitDefaultShippingAddressSetMessageBuilder businessUnitDefaultShippingAddressSetBuilder() {
       return com.commercetools.api.models.message.BusinessUnitDefaultShippingAddressSetMessageBuilder.of();
    }
    public com.commercetools.api.models.message.BusinessUnitDeletedMessageBuilder businessUnitDeletedBuilder() {
       return com.commercetools.api.models.message.BusinessUnitDeletedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.BusinessUnitNameChangedMessageBuilder businessUnitNameChangedBuilder() {
       return com.commercetools.api.models.message.BusinessUnitNameChangedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.BusinessUnitParentUnitChangedMessageBuilder businessUnitParentUnitChangedBuilder() {
       return com.commercetools.api.models.message.BusinessUnitParentUnitChangedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.BusinessUnitShippingAddressAddedMessageBuilder businessUnitShippingAddressAddedBuilder() {
       return com.commercetools.api.models.message.BusinessUnitShippingAddressAddedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.BusinessUnitShippingAddressRemovedMessageBuilder businessUnitShippingAddressRemovedBuilder() {
       return com.commercetools.api.models.message.BusinessUnitShippingAddressRemovedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.BusinessUnitStatusChangedMessageBuilder businessUnitStatusChangedBuilder() {
       return com.commercetools.api.models.message.BusinessUnitStatusChangedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.BusinessUnitStoreAddedMessageBuilder businessUnitStoreAddedBuilder() {
       return com.commercetools.api.models.message.BusinessUnitStoreAddedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.BusinessUnitStoreModeChangedMessageBuilder businessUnitStoreModeChangedBuilder() {
       return com.commercetools.api.models.message.BusinessUnitStoreModeChangedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.BusinessUnitStoreRemovedMessageBuilder businessUnitStoreRemovedBuilder() {
       return com.commercetools.api.models.message.BusinessUnitStoreRemovedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.BusinessUnitStoresSetMessageBuilder businessUnitStoresSetBuilder() {
       return com.commercetools.api.models.message.BusinessUnitStoresSetMessageBuilder.of();
    }
    public com.commercetools.api.models.message.CategoryCreatedMessageBuilder categoryCreatedBuilder() {
       return com.commercetools.api.models.message.CategoryCreatedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.CategorySlugChangedMessageBuilder categorySlugChangedBuilder() {
       return com.commercetools.api.models.message.CategorySlugChangedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.CustomLineItemStateTransitionMessageBuilder customLineItemStateTransitionBuilder() {
       return com.commercetools.api.models.message.CustomLineItemStateTransitionMessageBuilder.of();
    }
    public com.commercetools.api.models.message.CustomerAddressAddedMessageBuilder customerAddressAddedBuilder() {
       return com.commercetools.api.models.message.CustomerAddressAddedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.CustomerAddressChangedMessageBuilder customerAddressChangedBuilder() {
       return com.commercetools.api.models.message.CustomerAddressChangedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.CustomerAddressRemovedMessageBuilder customerAddressRemovedBuilder() {
       return com.commercetools.api.models.message.CustomerAddressRemovedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.CustomerCompanyNameSetMessageBuilder customerCompanyNameSetBuilder() {
       return com.commercetools.api.models.message.CustomerCompanyNameSetMessageBuilder.of();
    }
    public com.commercetools.api.models.message.CustomerCreatedMessageBuilder customerCreatedBuilder() {
       return com.commercetools.api.models.message.CustomerCreatedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.CustomerDateOfBirthSetMessageBuilder customerDateOfBirthSetBuilder() {
       return com.commercetools.api.models.message.CustomerDateOfBirthSetMessageBuilder.of();
    }
    public com.commercetools.api.models.message.CustomerDeletedMessageBuilder customerDeletedBuilder() {
       return com.commercetools.api.models.message.CustomerDeletedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.CustomerEmailChangedMessageBuilder customerEmailChangedBuilder() {
       return com.commercetools.api.models.message.CustomerEmailChangedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.CustomerEmailVerifiedMessageBuilder customerEmailVerifiedBuilder() {
       return com.commercetools.api.models.message.CustomerEmailVerifiedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.CustomerFirstNameSetMessageBuilder customerFirstNameSetBuilder() {
       return com.commercetools.api.models.message.CustomerFirstNameSetMessageBuilder.of();
    }
    public com.commercetools.api.models.message.CustomerGroupSetMessageBuilder customerGroupSetBuilder() {
       return com.commercetools.api.models.message.CustomerGroupSetMessageBuilder.of();
    }
    public com.commercetools.api.models.message.CustomerLastNameSetMessageBuilder customerLastNameSetBuilder() {
       return com.commercetools.api.models.message.CustomerLastNameSetMessageBuilder.of();
    }
    public com.commercetools.api.models.message.CustomerPasswordUpdatedMessageBuilder customerPasswordUpdatedBuilder() {
       return com.commercetools.api.models.message.CustomerPasswordUpdatedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.CustomerTitleSetMessageBuilder customerTitleSetBuilder() {
       return com.commercetools.api.models.message.CustomerTitleSetMessageBuilder.of();
    }
    public com.commercetools.api.models.message.DeliveryAddedMessageBuilder deliveryAddedBuilder() {
       return com.commercetools.api.models.message.DeliveryAddedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.DeliveryAddressSetMessageBuilder deliveryAddressSetBuilder() {
       return com.commercetools.api.models.message.DeliveryAddressSetMessageBuilder.of();
    }
    public com.commercetools.api.models.message.DeliveryItemsUpdatedMessageBuilder deliveryItemsUpdatedBuilder() {
       return com.commercetools.api.models.message.DeliveryItemsUpdatedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.DeliveryRemovedMessageBuilder deliveryRemovedBuilder() {
       return com.commercetools.api.models.message.DeliveryRemovedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.InventoryEntryCreatedMessageBuilder inventoryEntryCreatedBuilder() {
       return com.commercetools.api.models.message.InventoryEntryCreatedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.InventoryEntryDeletedMessageBuilder inventoryEntryDeletedBuilder() {
       return com.commercetools.api.models.message.InventoryEntryDeletedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.InventoryEntryQuantitySetMessageBuilder inventoryEntryQuantitySetBuilder() {
       return com.commercetools.api.models.message.InventoryEntryQuantitySetMessageBuilder.of();
    }
    public com.commercetools.api.models.message.LineItemStateTransitionMessageBuilder lineItemStateTransitionBuilder() {
       return com.commercetools.api.models.message.LineItemStateTransitionMessageBuilder.of();
    }
    public com.commercetools.api.models.message.OrderBillingAddressSetMessageBuilder orderBillingAddressSetBuilder() {
       return com.commercetools.api.models.message.OrderBillingAddressSetMessageBuilder.of();
    }
    public com.commercetools.api.models.message.OrderCreatedMessageBuilder orderCreatedBuilder() {
       return com.commercetools.api.models.message.OrderCreatedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.OrderCustomLineItemAddedMessageBuilder orderCustomLineItemAddedBuilder() {
       return com.commercetools.api.models.message.OrderCustomLineItemAddedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.OrderCustomLineItemDiscountSetMessageBuilder orderCustomLineItemDiscountSetBuilder() {
       return com.commercetools.api.models.message.OrderCustomLineItemDiscountSetMessageBuilder.of();
    }
    public com.commercetools.api.models.message.OrderCustomLineItemQuantityChangedMessageBuilder orderCustomLineItemQuantityChangedBuilder() {
       return com.commercetools.api.models.message.OrderCustomLineItemQuantityChangedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.OrderCustomLineItemRemovedMessageBuilder orderCustomLineItemRemovedBuilder() {
       return com.commercetools.api.models.message.OrderCustomLineItemRemovedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.OrderCustomerEmailSetMessageBuilder orderCustomerEmailSetBuilder() {
       return com.commercetools.api.models.message.OrderCustomerEmailSetMessageBuilder.of();
    }
    public com.commercetools.api.models.message.OrderCustomerGroupSetMessageBuilder orderCustomerGroupSetBuilder() {
       return com.commercetools.api.models.message.OrderCustomerGroupSetMessageBuilder.of();
    }
    public com.commercetools.api.models.message.OrderCustomerSetMessageBuilder orderCustomerSetBuilder() {
       return com.commercetools.api.models.message.OrderCustomerSetMessageBuilder.of();
    }
    public com.commercetools.api.models.message.OrderDeletedMessageBuilder orderDeletedBuilder() {
       return com.commercetools.api.models.message.OrderDeletedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.OrderDiscountCodeAddedMessageBuilder orderDiscountCodeAddedBuilder() {
       return com.commercetools.api.models.message.OrderDiscountCodeAddedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.OrderDiscountCodeRemovedMessageBuilder orderDiscountCodeRemovedBuilder() {
       return com.commercetools.api.models.message.OrderDiscountCodeRemovedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.OrderDiscountCodeStateSetMessageBuilder orderDiscountCodeStateSetBuilder() {
       return com.commercetools.api.models.message.OrderDiscountCodeStateSetMessageBuilder.of();
    }
    public com.commercetools.api.models.message.OrderEditAppliedMessageBuilder orderEditAppliedBuilder() {
       return com.commercetools.api.models.message.OrderEditAppliedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.OrderImportedMessageBuilder orderImportedBuilder() {
       return com.commercetools.api.models.message.OrderImportedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.OrderLineItemAddedMessageBuilder orderLineItemAddedBuilder() {
       return com.commercetools.api.models.message.OrderLineItemAddedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.OrderLineItemDiscountSetMessageBuilder orderLineItemDiscountSetBuilder() {
       return com.commercetools.api.models.message.OrderLineItemDiscountSetMessageBuilder.of();
    }
    public com.commercetools.api.models.message.OrderLineItemDistributionChannelSetMessageBuilder orderLineItemDistributionChannelSetBuilder() {
       return com.commercetools.api.models.message.OrderLineItemDistributionChannelSetMessageBuilder.of();
    }
    public com.commercetools.api.models.message.OrderLineItemRemovedMessageBuilder orderLineItemRemovedBuilder() {
       return com.commercetools.api.models.message.OrderLineItemRemovedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.OrderPaymentAddedMessageBuilder orderPaymentAddedBuilder() {
       return com.commercetools.api.models.message.OrderPaymentAddedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.OrderPaymentStateChangedMessageBuilder orderPaymentStateChangedBuilder() {
       return com.commercetools.api.models.message.OrderPaymentStateChangedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.OrderPurchaseOrderNumberSetMessageBuilder orderPurchaseOrderNumberSetBuilder() {
       return com.commercetools.api.models.message.OrderPurchaseOrderNumberSetMessageBuilder.of();
    }
    public com.commercetools.api.models.message.OrderReturnShipmentStateChangedMessageBuilder orderReturnShipmentStateChangedBuilder() {
       return com.commercetools.api.models.message.OrderReturnShipmentStateChangedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.OrderShipmentStateChangedMessageBuilder orderShipmentStateChangedBuilder() {
       return com.commercetools.api.models.message.OrderShipmentStateChangedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.OrderShippingAddressSetMessageBuilder orderShippingAddressSetBuilder() {
       return com.commercetools.api.models.message.OrderShippingAddressSetMessageBuilder.of();
    }
    public com.commercetools.api.models.message.OrderShippingInfoSetMessageBuilder orderShippingInfoSetBuilder() {
       return com.commercetools.api.models.message.OrderShippingInfoSetMessageBuilder.of();
    }
    public com.commercetools.api.models.message.OrderShippingRateInputSetMessageBuilder orderShippingRateInputSetBuilder() {
       return com.commercetools.api.models.message.OrderShippingRateInputSetMessageBuilder.of();
    }
    public com.commercetools.api.models.message.OrderStateChangedMessageBuilder orderStateChangedBuilder() {
       return com.commercetools.api.models.message.OrderStateChangedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.OrderStateTransitionMessageBuilder orderStateTransitionBuilder() {
       return com.commercetools.api.models.message.OrderStateTransitionMessageBuilder.of();
    }
    public com.commercetools.api.models.message.OrderStoreSetMessageBuilder orderStoreSetBuilder() {
       return com.commercetools.api.models.message.OrderStoreSetMessageBuilder.of();
    }
    public com.commercetools.api.models.message.ParcelAddedToDeliveryMessageBuilder parcelAddedToDeliveryBuilder() {
       return com.commercetools.api.models.message.ParcelAddedToDeliveryMessageBuilder.of();
    }
    public com.commercetools.api.models.message.ParcelItemsUpdatedMessageBuilder parcelItemsUpdatedBuilder() {
       return com.commercetools.api.models.message.ParcelItemsUpdatedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.ParcelMeasurementsUpdatedMessageBuilder parcelMeasurementsUpdatedBuilder() {
       return com.commercetools.api.models.message.ParcelMeasurementsUpdatedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.ParcelRemovedFromDeliveryMessageBuilder parcelRemovedFromDeliveryBuilder() {
       return com.commercetools.api.models.message.ParcelRemovedFromDeliveryMessageBuilder.of();
    }
    public com.commercetools.api.models.message.ParcelTrackingDataUpdatedMessageBuilder parcelTrackingDataUpdatedBuilder() {
       return com.commercetools.api.models.message.ParcelTrackingDataUpdatedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.PaymentCreatedMessageBuilder paymentCreatedBuilder() {
       return com.commercetools.api.models.message.PaymentCreatedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.PaymentInteractionAddedMessageBuilder paymentInteractionAddedBuilder() {
       return com.commercetools.api.models.message.PaymentInteractionAddedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.PaymentStatusInterfaceCodeSetMessageBuilder paymentStatusInterfaceCodeSetBuilder() {
       return com.commercetools.api.models.message.PaymentStatusInterfaceCodeSetMessageBuilder.of();
    }
    public com.commercetools.api.models.message.PaymentStatusStateTransitionMessageBuilder paymentStatusStateTransitionBuilder() {
       return com.commercetools.api.models.message.PaymentStatusStateTransitionMessageBuilder.of();
    }
    public com.commercetools.api.models.message.PaymentTransactionAddedMessageBuilder paymentTransactionAddedBuilder() {
       return com.commercetools.api.models.message.PaymentTransactionAddedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.PaymentTransactionStateChangedMessageBuilder paymentTransactionStateChangedBuilder() {
       return com.commercetools.api.models.message.PaymentTransactionStateChangedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.ProductAddedToCategoryMessageBuilder productAddedToCategoryBuilder() {
       return com.commercetools.api.models.message.ProductAddedToCategoryMessageBuilder.of();
    }
    public com.commercetools.api.models.message.ProductCreatedMessageBuilder productCreatedBuilder() {
       return com.commercetools.api.models.message.ProductCreatedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.ProductDeletedMessageBuilder productDeletedBuilder() {
       return com.commercetools.api.models.message.ProductDeletedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.ProductImageAddedMessageBuilder productImageAddedBuilder() {
       return com.commercetools.api.models.message.ProductImageAddedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.ProductPriceAddedMessageBuilder productPriceAddedBuilder() {
       return com.commercetools.api.models.message.ProductPriceAddedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.ProductPriceChangedMessageBuilder productPriceChangedBuilder() {
       return com.commercetools.api.models.message.ProductPriceChangedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.ProductPriceDiscountsSetMessageBuilder productPriceDiscountsSetBuilder() {
       return com.commercetools.api.models.message.ProductPriceDiscountsSetMessageBuilder.of();
    }
    public com.commercetools.api.models.message.ProductPriceExternalDiscountSetMessageBuilder productPriceExternalDiscountSetBuilder() {
       return com.commercetools.api.models.message.ProductPriceExternalDiscountSetMessageBuilder.of();
    }
    public com.commercetools.api.models.message.ProductPriceKeySetMessageBuilder productPriceKeySetBuilder() {
       return com.commercetools.api.models.message.ProductPriceKeySetMessageBuilder.of();
    }
    public com.commercetools.api.models.message.ProductPriceModeSetMessageBuilder productPriceModeSetBuilder() {
       return com.commercetools.api.models.message.ProductPriceModeSetMessageBuilder.of();
    }
    public com.commercetools.api.models.message.ProductPriceRemovedMessageBuilder productPriceRemovedBuilder() {
       return com.commercetools.api.models.message.ProductPriceRemovedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.ProductPricesSetMessageBuilder productPricesSetBuilder() {
       return com.commercetools.api.models.message.ProductPricesSetMessageBuilder.of();
    }
    public com.commercetools.api.models.message.ProductPublishedMessageBuilder productPublishedBuilder() {
       return com.commercetools.api.models.message.ProductPublishedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.ProductRemovedFromCategoryMessageBuilder productRemovedFromCategoryBuilder() {
       return com.commercetools.api.models.message.ProductRemovedFromCategoryMessageBuilder.of();
    }
    public com.commercetools.api.models.message.ProductRevertedStagedChangesMessageBuilder productRevertedStagedChangesBuilder() {
       return com.commercetools.api.models.message.ProductRevertedStagedChangesMessageBuilder.of();
    }
    public com.commercetools.api.models.message.ProductSelectionCreatedMessageBuilder productSelectionCreatedBuilder() {
       return com.commercetools.api.models.message.ProductSelectionCreatedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.ProductSelectionDeletedMessageBuilder productSelectionDeletedBuilder() {
       return com.commercetools.api.models.message.ProductSelectionDeletedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.ProductSelectionProductAddedMessageBuilder productSelectionProductAddedBuilder() {
       return com.commercetools.api.models.message.ProductSelectionProductAddedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.ProductSelectionProductExcludedMessageBuilder productSelectionProductExcludedBuilder() {
       return com.commercetools.api.models.message.ProductSelectionProductExcludedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.ProductSelectionProductRemovedMessageBuilder productSelectionProductRemovedBuilder() {
       return com.commercetools.api.models.message.ProductSelectionProductRemovedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.ProductSelectionVariantExclusionChangedMessageBuilder productSelectionVariantExclusionChangedBuilder() {
       return com.commercetools.api.models.message.ProductSelectionVariantExclusionChangedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.ProductSelectionVariantSelectionChangedMessageBuilder productSelectionVariantSelectionChangedBuilder() {
       return com.commercetools.api.models.message.ProductSelectionVariantSelectionChangedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.ProductSlugChangedMessageBuilder productSlugChangedBuilder() {
       return com.commercetools.api.models.message.ProductSlugChangedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.ProductStateTransitionMessageBuilder productStateTransitionBuilder() {
       return com.commercetools.api.models.message.ProductStateTransitionMessageBuilder.of();
    }
    public com.commercetools.api.models.message.ProductUnpublishedMessageBuilder productUnpublishedBuilder() {
       return com.commercetools.api.models.message.ProductUnpublishedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.ProductVariantAddedMessageBuilder productVariantAddedBuilder() {
       return com.commercetools.api.models.message.ProductVariantAddedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.ProductVariantDeletedMessageBuilder productVariantDeletedBuilder() {
       return com.commercetools.api.models.message.ProductVariantDeletedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.QuoteCreatedMessageBuilder quoteCreatedBuilder() {
       return com.commercetools.api.models.message.QuoteCreatedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.QuoteCustomerChangedMessageBuilder quoteCustomerChangedBuilder() {
       return com.commercetools.api.models.message.QuoteCustomerChangedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.QuoteDeletedMessageBuilder quoteDeletedBuilder() {
       return com.commercetools.api.models.message.QuoteDeletedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.QuoteRequestCreatedMessageBuilder quoteRequestCreatedBuilder() {
       return com.commercetools.api.models.message.QuoteRequestCreatedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.QuoteRequestCustomerChangedMessageBuilder quoteRequestCustomerChangedBuilder() {
       return com.commercetools.api.models.message.QuoteRequestCustomerChangedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.QuoteRequestDeletedMessageBuilder quoteRequestDeletedBuilder() {
       return com.commercetools.api.models.message.QuoteRequestDeletedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.QuoteRequestStateChangedMessageBuilder quoteRequestStateChangedBuilder() {
       return com.commercetools.api.models.message.QuoteRequestStateChangedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.QuoteRequestStateTransitionMessageBuilder quoteRequestStateTransitionBuilder() {
       return com.commercetools.api.models.message.QuoteRequestStateTransitionMessageBuilder.of();
    }
    public com.commercetools.api.models.message.QuoteStateChangedMessageBuilder quoteStateChangedBuilder() {
       return com.commercetools.api.models.message.QuoteStateChangedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.QuoteStateTransitionMessageBuilder quoteStateTransitionBuilder() {
       return com.commercetools.api.models.message.QuoteStateTransitionMessageBuilder.of();
    }
    public com.commercetools.api.models.message.ReturnInfoAddedMessageBuilder returnInfoAddedBuilder() {
       return com.commercetools.api.models.message.ReturnInfoAddedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.ReturnInfoSetMessageBuilder returnInfoSetBuilder() {
       return com.commercetools.api.models.message.ReturnInfoSetMessageBuilder.of();
    }
    public com.commercetools.api.models.message.ReviewCreatedMessageBuilder reviewCreatedBuilder() {
       return com.commercetools.api.models.message.ReviewCreatedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.ReviewRatingSetMessageBuilder reviewRatingSetBuilder() {
       return com.commercetools.api.models.message.ReviewRatingSetMessageBuilder.of();
    }
    public com.commercetools.api.models.message.ReviewStateTransitionMessageBuilder reviewStateTransitionBuilder() {
       return com.commercetools.api.models.message.ReviewStateTransitionMessageBuilder.of();
    }
    public com.commercetools.api.models.message.StagedQuoteCreatedMessageBuilder stagedQuoteCreatedBuilder() {
       return com.commercetools.api.models.message.StagedQuoteCreatedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.StagedQuoteDeletedMessageBuilder stagedQuoteDeletedBuilder() {
       return com.commercetools.api.models.message.StagedQuoteDeletedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.StagedQuoteSellerCommentSetMessageBuilder stagedQuoteSellerCommentSetBuilder() {
       return com.commercetools.api.models.message.StagedQuoteSellerCommentSetMessageBuilder.of();
    }
    public com.commercetools.api.models.message.StagedQuoteStateChangedMessageBuilder stagedQuoteStateChangedBuilder() {
       return com.commercetools.api.models.message.StagedQuoteStateChangedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.StagedQuoteStateTransitionMessageBuilder stagedQuoteStateTransitionBuilder() {
       return com.commercetools.api.models.message.StagedQuoteStateTransitionMessageBuilder.of();
    }
    public com.commercetools.api.models.message.StagedQuoteValidToSetMessageBuilder stagedQuoteValidToSetBuilder() {
       return com.commercetools.api.models.message.StagedQuoteValidToSetMessageBuilder.of();
    }
    public com.commercetools.api.models.message.StandalonePriceActiveChangedMessageBuilder standalonePriceActiveChangedBuilder() {
       return com.commercetools.api.models.message.StandalonePriceActiveChangedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.StandalonePriceCreatedMessageBuilder standalonePriceCreatedBuilder() {
       return com.commercetools.api.models.message.StandalonePriceCreatedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.StandalonePriceDeletedMessageBuilder standalonePriceDeletedBuilder() {
       return com.commercetools.api.models.message.StandalonePriceDeletedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.StandalonePriceDiscountSetMessageBuilder standalonePriceDiscountSetBuilder() {
       return com.commercetools.api.models.message.StandalonePriceDiscountSetMessageBuilder.of();
    }
    public com.commercetools.api.models.message.StandalonePriceExternalDiscountSetMessageBuilder standalonePriceExternalDiscountSetBuilder() {
       return com.commercetools.api.models.message.StandalonePriceExternalDiscountSetMessageBuilder.of();
    }
    public com.commercetools.api.models.message.StandalonePriceKeySetMessageBuilder standalonePriceKeySetBuilder() {
       return com.commercetools.api.models.message.StandalonePriceKeySetMessageBuilder.of();
    }
    public com.commercetools.api.models.message.StandalonePriceStagedChangesAppliedMessageBuilder standalonePriceStagedChangesAppliedBuilder() {
       return com.commercetools.api.models.message.StandalonePriceStagedChangesAppliedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.StandalonePriceValueChangedMessageBuilder standalonePriceValueChangedBuilder() {
       return com.commercetools.api.models.message.StandalonePriceValueChangedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.StoreCountriesChangedMessageBuilder storeCountriesChangedBuilder() {
       return com.commercetools.api.models.message.StoreCountriesChangedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.StoreCreatedMessageBuilder storeCreatedBuilder() {
       return com.commercetools.api.models.message.StoreCreatedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.StoreDeletedMessageBuilder storeDeletedBuilder() {
       return com.commercetools.api.models.message.StoreDeletedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.StoreDistributionChannelsChangedMessageBuilder storeDistributionChannelsChangedBuilder() {
       return com.commercetools.api.models.message.StoreDistributionChannelsChangedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.StoreLanguagesChangedMessageBuilder storeLanguagesChangedBuilder() {
       return com.commercetools.api.models.message.StoreLanguagesChangedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.StoreNameSetMessageBuilder storeNameSetBuilder() {
       return com.commercetools.api.models.message.StoreNameSetMessageBuilder.of();
    }
    public com.commercetools.api.models.message.StoreProductSelectionsChangedMessageBuilder storeProductSelectionsChangedBuilder() {
       return com.commercetools.api.models.message.StoreProductSelectionsChangedMessageBuilder.of();
    }
    public com.commercetools.api.models.message.StoreSupplyChannelsChangedMessageBuilder storeSupplyChannelsChangedBuilder() {
       return com.commercetools.api.models.message.StoreSupplyChannelsChangedMessageBuilder.of();
    }

    /**
     * factory method for an instance of MessageBuilder
     * @return builder 
     */
    public static MessageBuilder of() {
        return new MessageBuilder();
    }

}
