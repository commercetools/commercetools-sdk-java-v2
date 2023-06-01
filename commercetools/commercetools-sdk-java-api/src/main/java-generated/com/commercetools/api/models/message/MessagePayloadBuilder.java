package com.commercetools.api.models.message;

import com.commercetools.api.models.message.AssociateRoleBuyerAssignableChangedMessagePayload;
import com.commercetools.api.models.message.AssociateRoleCreatedMessagePayload;
import com.commercetools.api.models.message.AssociateRoleDeletedMessagePayload;
import com.commercetools.api.models.message.AssociateRoleNameChangedMessagePayload;
import com.commercetools.api.models.message.AssociateRolePermissionAddedMessagePayload;
import com.commercetools.api.models.message.AssociateRolePermissionRemovedMessagePayload;
import com.commercetools.api.models.message.AssociateRolePermissionsSetMessagePayload;
import com.commercetools.api.models.message.BusinessUnitAddressAddedMessagePayload;
import com.commercetools.api.models.message.BusinessUnitAddressChangedMessagePayload;
import com.commercetools.api.models.message.BusinessUnitAddressRemovedMessagePayload;
import com.commercetools.api.models.message.BusinessUnitAssociateAddedMessagePayload;
import com.commercetools.api.models.message.BusinessUnitAssociateChangedMessagePayload;
import com.commercetools.api.models.message.BusinessUnitAssociateModeChangedMessagePayload;
import com.commercetools.api.models.message.BusinessUnitAssociateRemovedMessagePayload;
import com.commercetools.api.models.message.BusinessUnitAssociatesSetMessagePayload;
import com.commercetools.api.models.message.BusinessUnitBillingAddressAddedMessagePayload;
import com.commercetools.api.models.message.BusinessUnitBillingAddressRemovedMessagePayload;
import com.commercetools.api.models.message.BusinessUnitContactEmailSetMessagePayload;
import com.commercetools.api.models.message.BusinessUnitCreatedMessagePayload;
import com.commercetools.api.models.message.BusinessUnitDefaultBillingAddressSetMessagePayload;
import com.commercetools.api.models.message.BusinessUnitDefaultShippingAddressSetMessagePayload;
import com.commercetools.api.models.message.BusinessUnitDeletedMessagePayload;
import com.commercetools.api.models.message.BusinessUnitNameChangedMessagePayload;
import com.commercetools.api.models.message.BusinessUnitParentUnitChangedMessagePayload;
import com.commercetools.api.models.message.BusinessUnitShippingAddressAddedMessagePayload;
import com.commercetools.api.models.message.BusinessUnitShippingAddressRemovedMessagePayload;
import com.commercetools.api.models.message.BusinessUnitStatusChangedMessagePayload;
import com.commercetools.api.models.message.BusinessUnitStoreAddedMessagePayload;
import com.commercetools.api.models.message.BusinessUnitStoreModeChangedMessagePayload;
import com.commercetools.api.models.message.BusinessUnitStoreRemovedMessagePayload;
import com.commercetools.api.models.message.BusinessUnitStoresSetMessagePayload;
import com.commercetools.api.models.message.CategoryCreatedMessagePayload;
import com.commercetools.api.models.message.CategorySlugChangedMessagePayload;
import com.commercetools.api.models.message.CustomerAddressAddedMessagePayload;
import com.commercetools.api.models.message.CustomerAddressChangedMessagePayload;
import com.commercetools.api.models.message.CustomerAddressRemovedMessagePayload;
import com.commercetools.api.models.message.CustomerCompanyNameSetMessagePayload;
import com.commercetools.api.models.message.CustomerCreatedMessagePayload;
import com.commercetools.api.models.message.CustomerDateOfBirthSetMessagePayload;
import com.commercetools.api.models.message.CustomerDeletedMessagePayload;
import com.commercetools.api.models.message.CustomerEmailChangedMessagePayload;
import com.commercetools.api.models.message.CustomerEmailVerifiedMessagePayload;
import com.commercetools.api.models.message.CustomerFirstNameSetMessagePayload;
import com.commercetools.api.models.message.CustomerGroupSetMessagePayload;
import com.commercetools.api.models.message.CustomerLastNameSetMessagePayload;
import com.commercetools.api.models.message.CustomerPasswordUpdatedMessagePayload;
import com.commercetools.api.models.message.CustomerTitleSetMessagePayload;
import com.commercetools.api.models.message.InventoryEntryCreatedMessagePayload;
import com.commercetools.api.models.message.InventoryEntryDeletedMessagePayload;
import com.commercetools.api.models.message.InventoryEntryQuantitySetMessagePayload;
import com.commercetools.api.models.message.OrderMessagePayload;
import com.commercetools.api.models.message.OrderPaymentAddedMessagePayload;
import com.commercetools.api.models.message.PaymentCreatedMessagePayload;
import com.commercetools.api.models.message.PaymentInteractionAddedMessagePayload;
import com.commercetools.api.models.message.PaymentStatusInterfaceCodeSetMessagePayload;
import com.commercetools.api.models.message.PaymentStatusStateTransitionMessagePayload;
import com.commercetools.api.models.message.PaymentTransactionAddedMessagePayload;
import com.commercetools.api.models.message.PaymentTransactionStateChangedMessagePayload;
import com.commercetools.api.models.message.ProductAddedToCategoryMessagePayload;
import com.commercetools.api.models.message.ProductCreatedMessagePayload;
import com.commercetools.api.models.message.ProductDeletedMessagePayload;
import com.commercetools.api.models.message.ProductImageAddedMessagePayload;
import com.commercetools.api.models.message.ProductPriceAddedMessagePayload;
import com.commercetools.api.models.message.ProductPriceChangedMessagePayload;
import com.commercetools.api.models.message.ProductPriceDiscountsSetMessagePayload;
import com.commercetools.api.models.message.ProductPriceExternalDiscountSetMessagePayload;
import com.commercetools.api.models.message.ProductPriceKeySetMessagePayload;
import com.commercetools.api.models.message.ProductPriceModeSetMessagePayload;
import com.commercetools.api.models.message.ProductPriceRemovedMessagePayload;
import com.commercetools.api.models.message.ProductPricesSetMessagePayload;
import com.commercetools.api.models.message.ProductPublishedMessagePayload;
import com.commercetools.api.models.message.ProductRemovedFromCategoryMessagePayload;
import com.commercetools.api.models.message.ProductRevertedStagedChangesMessagePayload;
import com.commercetools.api.models.message.ProductSelectionCreatedMessagePayload;
import com.commercetools.api.models.message.ProductSelectionDeletedMessagePayload;
import com.commercetools.api.models.message.ProductSelectionProductAddedMessagePayload;
import com.commercetools.api.models.message.ProductSelectionProductExcludedMessagePayload;
import com.commercetools.api.models.message.ProductSelectionProductRemovedMessagePayload;
import com.commercetools.api.models.message.ProductSelectionVariantExclusionChangedMessagePayload;
import com.commercetools.api.models.message.ProductSelectionVariantSelectionChangedMessagePayload;
import com.commercetools.api.models.message.ProductSlugChangedMessagePayload;
import com.commercetools.api.models.message.ProductStateTransitionMessagePayload;
import com.commercetools.api.models.message.ProductUnpublishedMessagePayload;
import com.commercetools.api.models.message.ProductVariantAddedMessagePayload;
import com.commercetools.api.models.message.ProductVariantDeletedMessagePayload;
import com.commercetools.api.models.message.QuoteCreatedMessagePayload;
import com.commercetools.api.models.message.QuoteCustomerChangedMessagePayload;
import com.commercetools.api.models.message.QuoteDeletedMessagePayload;
import com.commercetools.api.models.message.QuoteRequestCreatedMessagePayload;
import com.commercetools.api.models.message.QuoteRequestCustomerChangedMessagePayload;
import com.commercetools.api.models.message.QuoteRequestDeletedMessagePayload;
import com.commercetools.api.models.message.QuoteRequestStateChangedMessagePayload;
import com.commercetools.api.models.message.QuoteRequestStateTransitionMessagePayload;
import com.commercetools.api.models.message.QuoteStateChangedMessagePayload;
import com.commercetools.api.models.message.QuoteStateTransitionMessagePayload;
import com.commercetools.api.models.message.ReviewCreatedMessagePayload;
import com.commercetools.api.models.message.ReviewRatingSetMessagePayload;
import com.commercetools.api.models.message.ReviewStateTransitionMessagePayload;
import com.commercetools.api.models.message.ShoppingListStoreSetMessagePayload;
import com.commercetools.api.models.message.StagedQuoteCreatedMessagePayload;
import com.commercetools.api.models.message.StagedQuoteDeletedMessagePayload;
import com.commercetools.api.models.message.StagedQuoteSellerCommentSetMessagePayload;
import com.commercetools.api.models.message.StagedQuoteStateChangedMessagePayload;
import com.commercetools.api.models.message.StagedQuoteStateTransitionMessagePayload;
import com.commercetools.api.models.message.StagedQuoteValidToSetMessagePayload;
import com.commercetools.api.models.message.StandalonePriceActiveChangedMessagePayload;
import com.commercetools.api.models.message.StandalonePriceCreatedMessagePayload;
import com.commercetools.api.models.message.StandalonePriceDeletedMessagePayload;
import com.commercetools.api.models.message.StandalonePriceDiscountSetMessagePayload;
import com.commercetools.api.models.message.StandalonePriceExternalDiscountSetMessagePayload;
import com.commercetools.api.models.message.StandalonePriceKeySetMessagePayload;
import com.commercetools.api.models.message.StandalonePriceStagedChangesAppliedMessagePayload;
import com.commercetools.api.models.message.StandalonePriceValueChangedMessagePayload;
import com.commercetools.api.models.message.StoreCountriesChangedMessagePayload;
import com.commercetools.api.models.message.StoreCreatedMessagePayload;
import com.commercetools.api.models.message.StoreDeletedMessagePayload;
import com.commercetools.api.models.message.StoreDistributionChannelsChangedMessagePayload;
import com.commercetools.api.models.message.StoreLanguagesChangedMessagePayload;
import com.commercetools.api.models.message.StoreNameSetMessagePayload;
import com.commercetools.api.models.message.StoreProductSelectionsChangedMessagePayload;
import com.commercetools.api.models.message.StoreSupplyChannelsChangedMessagePayload;
import com.commercetools.api.models.message.MessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MessagePayloadBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MessagePayloadBuilder {

    public com.commercetools.api.models.message.AssociateRoleBuyerAssignableChangedMessagePayloadBuilder associateRoleBuyerAssignableChangedBuilder() {
       return com.commercetools.api.models.message.AssociateRoleBuyerAssignableChangedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.AssociateRoleCreatedMessagePayloadBuilder associateRoleCreatedBuilder() {
       return com.commercetools.api.models.message.AssociateRoleCreatedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.AssociateRoleDeletedMessagePayloadBuilder associateRoleDeletedBuilder() {
       return com.commercetools.api.models.message.AssociateRoleDeletedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.AssociateRoleNameChangedMessagePayloadBuilder associateRoleNameSetBuilder() {
       return com.commercetools.api.models.message.AssociateRoleNameChangedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.AssociateRolePermissionAddedMessagePayloadBuilder associateRolePermissionAddedBuilder() {
       return com.commercetools.api.models.message.AssociateRolePermissionAddedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.AssociateRolePermissionRemovedMessagePayloadBuilder associateRolePermissionRemovedBuilder() {
       return com.commercetools.api.models.message.AssociateRolePermissionRemovedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.AssociateRolePermissionsSetMessagePayloadBuilder associateRolePermissionsSetBuilder() {
       return com.commercetools.api.models.message.AssociateRolePermissionsSetMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.BusinessUnitAddressAddedMessagePayloadBuilder businessUnitAddressAddedBuilder() {
       return com.commercetools.api.models.message.BusinessUnitAddressAddedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.BusinessUnitAddressChangedMessagePayloadBuilder businessUnitAddressChangedBuilder() {
       return com.commercetools.api.models.message.BusinessUnitAddressChangedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.BusinessUnitAddressRemovedMessagePayloadBuilder businessUnitAddressRemovedBuilder() {
       return com.commercetools.api.models.message.BusinessUnitAddressRemovedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.BusinessUnitAssociateAddedMessagePayloadBuilder businessUnitAssociateAddedBuilder() {
       return com.commercetools.api.models.message.BusinessUnitAssociateAddedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.BusinessUnitAssociateChangedMessagePayloadBuilder businessUnitAssociateChangedBuilder() {
       return com.commercetools.api.models.message.BusinessUnitAssociateChangedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.BusinessUnitAssociateModeChangedMessagePayloadBuilder businessUnitAssociateModeChangedBuilder() {
       return com.commercetools.api.models.message.BusinessUnitAssociateModeChangedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.BusinessUnitAssociateRemovedMessagePayloadBuilder businessUnitAssociateRemovedBuilder() {
       return com.commercetools.api.models.message.BusinessUnitAssociateRemovedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.BusinessUnitAssociatesSetMessagePayloadBuilder businessUnitAssociatesSetBuilder() {
       return com.commercetools.api.models.message.BusinessUnitAssociatesSetMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.BusinessUnitBillingAddressAddedMessagePayloadBuilder businessUnitBillingAddressAddedBuilder() {
       return com.commercetools.api.models.message.BusinessUnitBillingAddressAddedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.BusinessUnitBillingAddressRemovedMessagePayloadBuilder businessUnitBillingAddressRemovedBuilder() {
       return com.commercetools.api.models.message.BusinessUnitBillingAddressRemovedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.BusinessUnitContactEmailSetMessagePayloadBuilder businessUnitContactEmailSetBuilder() {
       return com.commercetools.api.models.message.BusinessUnitContactEmailSetMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.BusinessUnitCreatedMessagePayloadBuilder businessUnitCreatedBuilder() {
       return com.commercetools.api.models.message.BusinessUnitCreatedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.BusinessUnitDefaultBillingAddressSetMessagePayloadBuilder businessUnitDefaultBillingAddressSetBuilder() {
       return com.commercetools.api.models.message.BusinessUnitDefaultBillingAddressSetMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.BusinessUnitDefaultShippingAddressSetMessagePayloadBuilder businessUnitDefaultShippingAddressSetBuilder() {
       return com.commercetools.api.models.message.BusinessUnitDefaultShippingAddressSetMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.BusinessUnitDeletedMessagePayloadBuilder businessUnitDeletedBuilder() {
       return com.commercetools.api.models.message.BusinessUnitDeletedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.BusinessUnitNameChangedMessagePayloadBuilder businessUnitNameChangedBuilder() {
       return com.commercetools.api.models.message.BusinessUnitNameChangedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.BusinessUnitParentUnitChangedMessagePayloadBuilder businessUnitParentUnitChangedBuilder() {
       return com.commercetools.api.models.message.BusinessUnitParentUnitChangedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.BusinessUnitShippingAddressAddedMessagePayloadBuilder businessUnitShippingAddressAddedBuilder() {
       return com.commercetools.api.models.message.BusinessUnitShippingAddressAddedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.BusinessUnitShippingAddressRemovedMessagePayloadBuilder businessUnitShippingAddressRemovedBuilder() {
       return com.commercetools.api.models.message.BusinessUnitShippingAddressRemovedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.BusinessUnitStatusChangedMessagePayloadBuilder businessUnitStatusChangedBuilder() {
       return com.commercetools.api.models.message.BusinessUnitStatusChangedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.BusinessUnitStoreAddedMessagePayloadBuilder businessUnitStoreAddedBuilder() {
       return com.commercetools.api.models.message.BusinessUnitStoreAddedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.BusinessUnitStoreModeChangedMessagePayloadBuilder businessUnitStoreModeChangedBuilder() {
       return com.commercetools.api.models.message.BusinessUnitStoreModeChangedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.BusinessUnitStoreRemovedMessagePayloadBuilder businessUnitStoreRemovedBuilder() {
       return com.commercetools.api.models.message.BusinessUnitStoreRemovedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.BusinessUnitStoresSetMessagePayloadBuilder businessUnitStoresSetBuilder() {
       return com.commercetools.api.models.message.BusinessUnitStoresSetMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.CategoryCreatedMessagePayloadBuilder categoryCreatedBuilder() {
       return com.commercetools.api.models.message.CategoryCreatedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.CategorySlugChangedMessagePayloadBuilder categorySlugChangedBuilder() {
       return com.commercetools.api.models.message.CategorySlugChangedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.CustomLineItemStateTransitionMessagePayloadBuilder customLineItemStateTransitionBuilder() {
       return com.commercetools.api.models.message.CustomLineItemStateTransitionMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.CustomerAddressAddedMessagePayloadBuilder customerAddressAddedBuilder() {
       return com.commercetools.api.models.message.CustomerAddressAddedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.CustomerAddressChangedMessagePayloadBuilder customerAddressChangedBuilder() {
       return com.commercetools.api.models.message.CustomerAddressChangedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.CustomerAddressRemovedMessagePayloadBuilder customerAddressRemovedBuilder() {
       return com.commercetools.api.models.message.CustomerAddressRemovedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.CustomerCompanyNameSetMessagePayloadBuilder customerCompanyNameSetBuilder() {
       return com.commercetools.api.models.message.CustomerCompanyNameSetMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.CustomerCreatedMessagePayloadBuilder customerCreatedBuilder() {
       return com.commercetools.api.models.message.CustomerCreatedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.CustomerDateOfBirthSetMessagePayloadBuilder customerDateOfBirthSetBuilder() {
       return com.commercetools.api.models.message.CustomerDateOfBirthSetMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.CustomerDeletedMessagePayloadBuilder customerDeletedBuilder() {
       return com.commercetools.api.models.message.CustomerDeletedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.CustomerEmailChangedMessagePayloadBuilder customerEmailChangedBuilder() {
       return com.commercetools.api.models.message.CustomerEmailChangedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.CustomerEmailVerifiedMessagePayloadBuilder customerEmailVerifiedBuilder() {
       return com.commercetools.api.models.message.CustomerEmailVerifiedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.CustomerFirstNameSetMessagePayloadBuilder customerFirstNameSetBuilder() {
       return com.commercetools.api.models.message.CustomerFirstNameSetMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.CustomerGroupSetMessagePayloadBuilder customerGroupSetBuilder() {
       return com.commercetools.api.models.message.CustomerGroupSetMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.CustomerLastNameSetMessagePayloadBuilder customerLastNameSetBuilder() {
       return com.commercetools.api.models.message.CustomerLastNameSetMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.CustomerPasswordUpdatedMessagePayloadBuilder customerPasswordUpdatedBuilder() {
       return com.commercetools.api.models.message.CustomerPasswordUpdatedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.CustomerTitleSetMessagePayloadBuilder customerTitleSetBuilder() {
       return com.commercetools.api.models.message.CustomerTitleSetMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.DeliveryAddedMessagePayloadBuilder deliveryAddedBuilder() {
       return com.commercetools.api.models.message.DeliveryAddedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.DeliveryAddressSetMessagePayloadBuilder deliveryAddressSetBuilder() {
       return com.commercetools.api.models.message.DeliveryAddressSetMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.DeliveryItemsUpdatedMessagePayloadBuilder deliveryItemsUpdatedBuilder() {
       return com.commercetools.api.models.message.DeliveryItemsUpdatedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.DeliveryRemovedMessagePayloadBuilder deliveryRemovedBuilder() {
       return com.commercetools.api.models.message.DeliveryRemovedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.InventoryEntryCreatedMessagePayloadBuilder inventoryEntryCreatedBuilder() {
       return com.commercetools.api.models.message.InventoryEntryCreatedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.InventoryEntryDeletedMessagePayloadBuilder inventoryEntryDeletedBuilder() {
       return com.commercetools.api.models.message.InventoryEntryDeletedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.InventoryEntryQuantitySetMessagePayloadBuilder inventoryEntryQuantitySetBuilder() {
       return com.commercetools.api.models.message.InventoryEntryQuantitySetMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.LineItemStateTransitionMessagePayloadBuilder lineItemStateTransitionBuilder() {
       return com.commercetools.api.models.message.LineItemStateTransitionMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.OrderBillingAddressSetMessagePayloadBuilder orderBillingAddressSetBuilder() {
       return com.commercetools.api.models.message.OrderBillingAddressSetMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.OrderCreatedMessagePayloadBuilder orderCreatedBuilder() {
       return com.commercetools.api.models.message.OrderCreatedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.OrderCustomLineItemAddedMessagePayloadBuilder orderCustomLineItemAddedBuilder() {
       return com.commercetools.api.models.message.OrderCustomLineItemAddedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.OrderCustomLineItemDiscountSetMessagePayloadBuilder orderCustomLineItemDiscountSetBuilder() {
       return com.commercetools.api.models.message.OrderCustomLineItemDiscountSetMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.OrderCustomLineItemQuantityChangedMessagePayloadBuilder orderCustomLineItemQuantityChangedBuilder() {
       return com.commercetools.api.models.message.OrderCustomLineItemQuantityChangedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.OrderCustomLineItemRemovedMessagePayloadBuilder orderCustomLineItemRemovedBuilder() {
       return com.commercetools.api.models.message.OrderCustomLineItemRemovedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.OrderCustomerEmailSetMessagePayloadBuilder orderCustomerEmailSetBuilder() {
       return com.commercetools.api.models.message.OrderCustomerEmailSetMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.OrderCustomerGroupSetMessagePayloadBuilder orderCustomerGroupSetBuilder() {
       return com.commercetools.api.models.message.OrderCustomerGroupSetMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.OrderCustomerSetMessagePayloadBuilder orderCustomerSetBuilder() {
       return com.commercetools.api.models.message.OrderCustomerSetMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.OrderDeletedMessagePayloadBuilder orderDeletedBuilder() {
       return com.commercetools.api.models.message.OrderDeletedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.OrderDiscountCodeAddedMessagePayloadBuilder orderDiscountCodeAddedBuilder() {
       return com.commercetools.api.models.message.OrderDiscountCodeAddedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.OrderDiscountCodeRemovedMessagePayloadBuilder orderDiscountCodeRemovedBuilder() {
       return com.commercetools.api.models.message.OrderDiscountCodeRemovedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.OrderDiscountCodeStateSetMessagePayloadBuilder orderDiscountCodeStateSetBuilder() {
       return com.commercetools.api.models.message.OrderDiscountCodeStateSetMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.OrderEditAppliedMessagePayloadBuilder orderEditAppliedBuilder() {
       return com.commercetools.api.models.message.OrderEditAppliedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.OrderImportedMessagePayloadBuilder orderImportedBuilder() {
       return com.commercetools.api.models.message.OrderImportedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.OrderLineItemAddedMessagePayloadBuilder orderLineItemAddedBuilder() {
       return com.commercetools.api.models.message.OrderLineItemAddedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.OrderLineItemDiscountSetMessagePayloadBuilder orderLineItemDiscountSetBuilder() {
       return com.commercetools.api.models.message.OrderLineItemDiscountSetMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.OrderLineItemDistributionChannelSetMessagePayloadBuilder orderLineItemDistributionChannelSetBuilder() {
       return com.commercetools.api.models.message.OrderLineItemDistributionChannelSetMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.OrderLineItemRemovedMessagePayloadBuilder orderLineItemRemovedBuilder() {
       return com.commercetools.api.models.message.OrderLineItemRemovedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.OrderPaymentAddedMessagePayloadBuilder orderPaymentAddedBuilder() {
       return com.commercetools.api.models.message.OrderPaymentAddedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.OrderPaymentStateChangedMessagePayloadBuilder orderPaymentStateChangedBuilder() {
       return com.commercetools.api.models.message.OrderPaymentStateChangedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.OrderPurchaseOrderNumberSetMessagePayloadBuilder orderPurchaseOrderNumberSetBuilder() {
       return com.commercetools.api.models.message.OrderPurchaseOrderNumberSetMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.OrderReturnShipmentStateChangedMessagePayloadBuilder orderReturnShipmentStateChangedBuilder() {
       return com.commercetools.api.models.message.OrderReturnShipmentStateChangedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.OrderShipmentStateChangedMessagePayloadBuilder orderShipmentStateChangedBuilder() {
       return com.commercetools.api.models.message.OrderShipmentStateChangedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.OrderShippingAddressSetMessagePayloadBuilder orderShippingAddressSetBuilder() {
       return com.commercetools.api.models.message.OrderShippingAddressSetMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.OrderShippingInfoSetMessagePayloadBuilder orderShippingInfoSetBuilder() {
       return com.commercetools.api.models.message.OrderShippingInfoSetMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.OrderShippingRateInputSetMessagePayloadBuilder orderShippingRateInputSetBuilder() {
       return com.commercetools.api.models.message.OrderShippingRateInputSetMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.OrderStateChangedMessagePayloadBuilder orderStateChangedBuilder() {
       return com.commercetools.api.models.message.OrderStateChangedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.OrderStateTransitionMessagePayloadBuilder orderStateTransitionBuilder() {
       return com.commercetools.api.models.message.OrderStateTransitionMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.OrderStoreSetMessagePayloadBuilder orderStoreSetBuilder() {
       return com.commercetools.api.models.message.OrderStoreSetMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.ParcelAddedToDeliveryMessagePayloadBuilder parcelAddedToDeliveryBuilder() {
       return com.commercetools.api.models.message.ParcelAddedToDeliveryMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.ParcelItemsUpdatedMessagePayloadBuilder parcelItemsUpdatedBuilder() {
       return com.commercetools.api.models.message.ParcelItemsUpdatedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.ParcelMeasurementsUpdatedMessagePayloadBuilder parcelMeasurementsUpdatedBuilder() {
       return com.commercetools.api.models.message.ParcelMeasurementsUpdatedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.ParcelRemovedFromDeliveryMessagePayloadBuilder parcelRemovedFromDeliveryBuilder() {
       return com.commercetools.api.models.message.ParcelRemovedFromDeliveryMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.ParcelTrackingDataUpdatedMessagePayloadBuilder parcelTrackingDataUpdatedBuilder() {
       return com.commercetools.api.models.message.ParcelTrackingDataUpdatedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.PaymentCreatedMessagePayloadBuilder paymentCreatedBuilder() {
       return com.commercetools.api.models.message.PaymentCreatedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.PaymentInteractionAddedMessagePayloadBuilder paymentInteractionAddedBuilder() {
       return com.commercetools.api.models.message.PaymentInteractionAddedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.PaymentStatusInterfaceCodeSetMessagePayloadBuilder paymentStatusInterfaceCodeSetBuilder() {
       return com.commercetools.api.models.message.PaymentStatusInterfaceCodeSetMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.PaymentStatusStateTransitionMessagePayloadBuilder paymentStatusStateTransitionBuilder() {
       return com.commercetools.api.models.message.PaymentStatusStateTransitionMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.PaymentTransactionAddedMessagePayloadBuilder paymentTransactionAddedBuilder() {
       return com.commercetools.api.models.message.PaymentTransactionAddedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.PaymentTransactionStateChangedMessagePayloadBuilder paymentTransactionStateChangedBuilder() {
       return com.commercetools.api.models.message.PaymentTransactionStateChangedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.ProductAddedToCategoryMessagePayloadBuilder productAddedToCategoryBuilder() {
       return com.commercetools.api.models.message.ProductAddedToCategoryMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.ProductCreatedMessagePayloadBuilder productCreatedBuilder() {
       return com.commercetools.api.models.message.ProductCreatedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.ProductDeletedMessagePayloadBuilder productDeletedBuilder() {
       return com.commercetools.api.models.message.ProductDeletedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.ProductImageAddedMessagePayloadBuilder productImageAddedBuilder() {
       return com.commercetools.api.models.message.ProductImageAddedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.ProductPriceAddedMessagePayloadBuilder productPriceAddedBuilder() {
       return com.commercetools.api.models.message.ProductPriceAddedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.ProductPriceChangedMessagePayloadBuilder productPriceChangedBuilder() {
       return com.commercetools.api.models.message.ProductPriceChangedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.ProductPriceDiscountsSetMessagePayloadBuilder productPriceDiscountsSetBuilder() {
       return com.commercetools.api.models.message.ProductPriceDiscountsSetMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.ProductPriceExternalDiscountSetMessagePayloadBuilder productPriceExternalDiscountSetBuilder() {
       return com.commercetools.api.models.message.ProductPriceExternalDiscountSetMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.ProductPriceKeySetMessagePayloadBuilder productPriceKeySetBuilder() {
       return com.commercetools.api.models.message.ProductPriceKeySetMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.ProductPriceModeSetMessagePayloadBuilder productPriceModeSetBuilder() {
       return com.commercetools.api.models.message.ProductPriceModeSetMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.ProductPriceRemovedMessagePayloadBuilder productPriceRemovedBuilder() {
       return com.commercetools.api.models.message.ProductPriceRemovedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.ProductPricesSetMessagePayloadBuilder productPricesSetBuilder() {
       return com.commercetools.api.models.message.ProductPricesSetMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.ProductPublishedMessagePayloadBuilder productPublishedBuilder() {
       return com.commercetools.api.models.message.ProductPublishedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.ProductRemovedFromCategoryMessagePayloadBuilder productRemovedFromCategoryBuilder() {
       return com.commercetools.api.models.message.ProductRemovedFromCategoryMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.ProductRevertedStagedChangesMessagePayloadBuilder productRevertedStagedChangesBuilder() {
       return com.commercetools.api.models.message.ProductRevertedStagedChangesMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.ProductSelectionCreatedMessagePayloadBuilder productSelectionCreatedBuilder() {
       return com.commercetools.api.models.message.ProductSelectionCreatedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.ProductSelectionDeletedMessagePayloadBuilder productSelectionDeletedBuilder() {
       return com.commercetools.api.models.message.ProductSelectionDeletedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.ProductSelectionProductAddedMessagePayloadBuilder productSelectionProductAddedBuilder() {
       return com.commercetools.api.models.message.ProductSelectionProductAddedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.ProductSelectionProductExcludedMessagePayloadBuilder productSelectionProductExcludedBuilder() {
       return com.commercetools.api.models.message.ProductSelectionProductExcludedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.ProductSelectionProductRemovedMessagePayloadBuilder productSelectionProductRemovedBuilder() {
       return com.commercetools.api.models.message.ProductSelectionProductRemovedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.ProductSelectionVariantExclusionChangedMessagePayloadBuilder productSelectionVariantExclusionChangedBuilder() {
       return com.commercetools.api.models.message.ProductSelectionVariantExclusionChangedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.ProductSelectionVariantSelectionChangedMessagePayloadBuilder productSelectionVariantSelectionChangedBuilder() {
       return com.commercetools.api.models.message.ProductSelectionVariantSelectionChangedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.ProductSlugChangedMessagePayloadBuilder productSlugChangedBuilder() {
       return com.commercetools.api.models.message.ProductSlugChangedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.ProductStateTransitionMessagePayloadBuilder productStateTransitionBuilder() {
       return com.commercetools.api.models.message.ProductStateTransitionMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.ProductUnpublishedMessagePayloadBuilder productUnpublishedBuilder() {
       return com.commercetools.api.models.message.ProductUnpublishedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.ProductVariantAddedMessagePayloadBuilder productVariantAddedBuilder() {
       return com.commercetools.api.models.message.ProductVariantAddedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.ProductVariantDeletedMessagePayloadBuilder productVariantDeletedBuilder() {
       return com.commercetools.api.models.message.ProductVariantDeletedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.QuoteCreatedMessagePayloadBuilder quoteCreatedBuilder() {
       return com.commercetools.api.models.message.QuoteCreatedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.QuoteCustomerChangedMessagePayloadBuilder quoteCustomerChangedBuilder() {
       return com.commercetools.api.models.message.QuoteCustomerChangedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.QuoteDeletedMessagePayloadBuilder quoteDeletedBuilder() {
       return com.commercetools.api.models.message.QuoteDeletedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.QuoteRequestCreatedMessagePayloadBuilder quoteRequestCreatedBuilder() {
       return com.commercetools.api.models.message.QuoteRequestCreatedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.QuoteRequestCustomerChangedMessagePayloadBuilder quoteRequestCustomerChangedBuilder() {
       return com.commercetools.api.models.message.QuoteRequestCustomerChangedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.QuoteRequestDeletedMessagePayloadBuilder quoteRequestDeletedBuilder() {
       return com.commercetools.api.models.message.QuoteRequestDeletedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.QuoteRequestStateChangedMessagePayloadBuilder quoteRequestStateChangedBuilder() {
       return com.commercetools.api.models.message.QuoteRequestStateChangedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.QuoteRequestStateTransitionMessagePayloadBuilder quoteRequestStateTransitionBuilder() {
       return com.commercetools.api.models.message.QuoteRequestStateTransitionMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.QuoteStateChangedMessagePayloadBuilder quoteStateChangedBuilder() {
       return com.commercetools.api.models.message.QuoteStateChangedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.QuoteStateTransitionMessagePayloadBuilder quoteStateTransitionBuilder() {
       return com.commercetools.api.models.message.QuoteStateTransitionMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.ReturnInfoAddedMessagePayloadBuilder returnInfoAddedBuilder() {
       return com.commercetools.api.models.message.ReturnInfoAddedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.ReturnInfoSetMessagePayloadBuilder returnInfoSetBuilder() {
       return com.commercetools.api.models.message.ReturnInfoSetMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.ReviewCreatedMessagePayloadBuilder reviewCreatedBuilder() {
       return com.commercetools.api.models.message.ReviewCreatedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.ReviewRatingSetMessagePayloadBuilder reviewRatingSetBuilder() {
       return com.commercetools.api.models.message.ReviewRatingSetMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.ReviewStateTransitionMessagePayloadBuilder reviewStateTransitionBuilder() {
       return com.commercetools.api.models.message.ReviewStateTransitionMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.ShoppingListStoreSetMessagePayloadBuilder shoppingListStoreSetBuilder() {
       return com.commercetools.api.models.message.ShoppingListStoreSetMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.StagedQuoteCreatedMessagePayloadBuilder stagedQuoteCreatedBuilder() {
       return com.commercetools.api.models.message.StagedQuoteCreatedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.StagedQuoteDeletedMessagePayloadBuilder stagedQuoteDeletedBuilder() {
       return com.commercetools.api.models.message.StagedQuoteDeletedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.StagedQuoteSellerCommentSetMessagePayloadBuilder stagedQuoteSellerCommentSetBuilder() {
       return com.commercetools.api.models.message.StagedQuoteSellerCommentSetMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.StagedQuoteStateChangedMessagePayloadBuilder stagedQuoteStateChangedBuilder() {
       return com.commercetools.api.models.message.StagedQuoteStateChangedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.StagedQuoteStateTransitionMessagePayloadBuilder stagedQuoteStateTransitionBuilder() {
       return com.commercetools.api.models.message.StagedQuoteStateTransitionMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.StagedQuoteValidToSetMessagePayloadBuilder stagedQuoteValidToSetBuilder() {
       return com.commercetools.api.models.message.StagedQuoteValidToSetMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.StandalonePriceActiveChangedMessagePayloadBuilder standalonePriceActiveChangedBuilder() {
       return com.commercetools.api.models.message.StandalonePriceActiveChangedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.StandalonePriceCreatedMessagePayloadBuilder standalonePriceCreatedBuilder() {
       return com.commercetools.api.models.message.StandalonePriceCreatedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.StandalonePriceDeletedMessagePayloadBuilder standalonePriceDeletedBuilder() {
       return com.commercetools.api.models.message.StandalonePriceDeletedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.StandalonePriceDiscountSetMessagePayloadBuilder standalonePriceDiscountSetBuilder() {
       return com.commercetools.api.models.message.StandalonePriceDiscountSetMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.StandalonePriceExternalDiscountSetMessagePayloadBuilder standalonePriceExternalDiscountSetBuilder() {
       return com.commercetools.api.models.message.StandalonePriceExternalDiscountSetMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.StandalonePriceKeySetMessagePayloadBuilder standalonePriceKeySetBuilder() {
       return com.commercetools.api.models.message.StandalonePriceKeySetMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.StandalonePriceStagedChangesAppliedMessagePayloadBuilder standalonePriceStagedChangesAppliedBuilder() {
       return com.commercetools.api.models.message.StandalonePriceStagedChangesAppliedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.StandalonePriceValueChangedMessagePayloadBuilder standalonePriceValueChangedBuilder() {
       return com.commercetools.api.models.message.StandalonePriceValueChangedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.StoreCountriesChangedMessagePayloadBuilder storeCountriesChangedBuilder() {
       return com.commercetools.api.models.message.StoreCountriesChangedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.StoreCreatedMessagePayloadBuilder storeCreatedBuilder() {
       return com.commercetools.api.models.message.StoreCreatedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.StoreDeletedMessagePayloadBuilder storeDeletedBuilder() {
       return com.commercetools.api.models.message.StoreDeletedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.StoreDistributionChannelsChangedMessagePayloadBuilder storeDistributionChannelsChangedBuilder() {
       return com.commercetools.api.models.message.StoreDistributionChannelsChangedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.StoreLanguagesChangedMessagePayloadBuilder storeLanguagesChangedBuilder() {
       return com.commercetools.api.models.message.StoreLanguagesChangedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.StoreNameSetMessagePayloadBuilder storeNameSetBuilder() {
       return com.commercetools.api.models.message.StoreNameSetMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.StoreProductSelectionsChangedMessagePayloadBuilder storeProductSelectionsChangedBuilder() {
       return com.commercetools.api.models.message.StoreProductSelectionsChangedMessagePayloadBuilder.of();
    }
    public com.commercetools.api.models.message.StoreSupplyChannelsChangedMessagePayloadBuilder storeSupplyChannelsChangedBuilder() {
       return com.commercetools.api.models.message.StoreSupplyChannelsChangedMessagePayloadBuilder.of();
    }

    /**
     * factory method for an instance of MessagePayloadBuilder
     * @return builder 
     */
    public static MessagePayloadBuilder of() {
        return new MessagePayloadBuilder();
    }

}
