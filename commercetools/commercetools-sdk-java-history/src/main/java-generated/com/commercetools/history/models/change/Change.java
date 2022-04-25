
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.AddAddressChangeImpl.class, name = AddAddressChange.ADD_ADDRESS_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.AddAssetChangeImpl.class, name = AddAssetChange.ADD_ASSET_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.AddAttributeDefinitionChangeImpl.class, name = AddAttributeDefinitionChange.ADD_ATTRIBUTE_DEFINITION_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.AddBillingAddressIdChangeImpl.class, name = AddBillingAddressIdChange.ADD_BILLING_ADDRESS_ID_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.AddChannelRolesChangeImpl.class, name = AddChannelRolesChange.ADD_CHANNEL_ROLES_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.AddCustomLineItemChangeImpl.class, name = AddCustomLineItemChange.ADD_CUSTOM_LINE_ITEM_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.AddDeliveryChangeImpl.class, name = AddDeliveryChange.ADD_DELIVERY_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.AddDiscountCodeChangeImpl.class, name = AddDiscountCodeChange.ADD_DISCOUNT_CODE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.AddEnumValueChangeImpl.class, name = AddEnumValueChange.ADD_ENUM_VALUE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.AddExternalImageChangeImpl.class, name = AddExternalImageChange.ADD_EXTERNAL_IMAGE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.AddFieldDefinitionChangeImpl.class, name = AddFieldDefinitionChange.ADD_FIELD_DEFINITION_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.AddInterfaceInteractionChangeImpl.class, name = AddInterfaceInteractionChange.ADD_INTERFACE_INTERACTION_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.AddItemShippingAddressesChangeImpl.class, name = AddItemShippingAddressesChange.ADD_ITEM_SHIPPING_ADDRESSES_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.AddLocalizedEnumValueChangeImpl.class, name = AddLocalizedEnumValueChange.ADD_LOCALIZED_ENUM_VALUE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.AddLocationChangeImpl.class, name = AddLocationChange.ADD_LOCATION_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.AddOrderLineItemChangeImpl.class, name = AddOrderLineItemChange.ADD_ORDER_LINE_ITEM_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.AddParcelToDeliveryChangeImpl.class, name = AddParcelToDeliveryChange.ADD_PARCEL_TO_DELIVERY_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.AddPaymentChangeImpl.class, name = AddPaymentChange.ADD_PAYMENT_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.AddPlainEnumValueChangeImpl.class, name = AddPlainEnumValueChange.ADD_PLAIN_ENUM_VALUE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.AddPriceChangeImpl.class, name = AddPriceChange.ADD_PRICE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.AddPropertyChangeImpl.class, name = AddPropertyChange.ADD_PROPERTY_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.AddReturnInfoChangeImpl.class, name = AddReturnInfoChange.ADD_RETURN_INFO_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.AddShippingAddressIdChangeImpl.class, name = AddShippingAddressIdChange.ADD_SHIPPING_ADDRESS_ID_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.AddShoppingListLineItemChangeImpl.class, name = AddShoppingListLineItemChange.ADD_SHOPPING_LIST_LINE_ITEM_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.AddStateRolesChangeImpl.class, name = AddStateRolesChange.ADD_STATE_ROLES_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.AddTaxRateChangeImpl.class, name = AddTaxRateChange.ADD_TAX_RATE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.AddTextLineItemChangeImpl.class, name = AddTextLineItemChange.ADD_TEXT_LINE_ITEM_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.AddToCategoryChangeImpl.class, name = AddToCategoryChange.ADD_TO_CATEGORY_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.AddTransactionChangeImpl.class, name = AddTransactionChange.ADD_TRANSACTION_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.AddVariantChangeImpl.class, name = AddVariantChange.ADD_VARIANT_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeAddressChangeImpl.class, name = ChangeAddressChange.CHANGE_ADDRESS_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeAmountAuthorizedChangeImpl.class, name = ChangeAmountAuthorizedChange.CHANGE_AMOUNT_AUTHORIZED_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeAmountPlannedChangeImpl.class, name = ChangeAmountPlannedChange.CHANGE_AMOUNT_PLANNED_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeAssetNameChangeImpl.class, name = ChangeAssetNameChange.CHANGE_ASSET_NAME_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeAssetOrderChangeImpl.class, name = ChangeAssetOrderChange.CHANGE_ASSET_ORDER_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeAttributeConstraintChangeImpl.class, name = ChangeAttributeConstraintChange.CHANGE_ATTRIBUTE_CONSTRAINT_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeAttributeOrderByNameChangeImpl.class, name = ChangeAttributeOrderByNameChange.CHANGE_ATTRIBUTE_ORDER_BY_NAME_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeCartDiscountsChangeImpl.class, name = ChangeCartDiscountsChange.CHANGE_CART_DISCOUNTS_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeCartPredicateChangeImpl.class, name = ChangeCartPredicateChange.CHANGE_CART_PREDICATE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeCustomLineItemQuantityChangeImpl.class, name = ChangeCustomLineItemQuantityChange.CHANGE_CUSTOM_LINE_ITEM_QUANTITY_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeDescriptionChangeImpl.class, name = ChangeDescriptionChange.CHANGE_DESCRIPTION_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeEmailChangeImpl.class, name = ChangeEmailChange.CHANGE_EMAIL_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeEnumValueLabelChangeImpl.class, name = ChangeEnumValueLabelChange.CHANGE_ENUM_VALUE_LABEL_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeEnumValueOrderChangeImpl.class, name = ChangeEnumValueOrderChange.CHANGE_ENUM_VALUE_ORDER_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeFieldDefinitionOrderChangeImpl.class, name = ChangeFieldDefinitionOrderChange.CHANGE_FIELD_DEFINITION_ORDER_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeGroupsChangeImpl.class, name = ChangeGroupsChange.CHANGE_GROUPS_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeInitialChangeImpl.class, name = ChangeInitialChange.CHANGE_INITIAL_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeInputHintChangeImpl.class, name = ChangeInputHintChange.CHANGE_INPUT_HINT_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeIsActiveChangeImpl.class, name = ChangeIsActiveChange.CHANGE_IS_ACTIVE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeIsSearchableChangeImpl.class, name = ChangeIsSearchableChange.CHANGE_IS_SEARCHABLE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeKeyChangeImpl.class, name = ChangeKeyChange.CHANGE_KEY_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeLabelChangeImpl.class, name = ChangeLabelChange.CHANGE_LABEL_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeLineItemQuantityChangeImpl.class, name = ChangeLineItemQuantityChange.CHANGE_LINE_ITEM_QUANTITY_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeLocalizedDescriptionChangeImpl.class, name = ChangeLocalizedDescriptionChange.CHANGE_LOCALIZED_DESCRIPTION_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeLocalizedEnumValueLabelChangeImpl.class, name = ChangeLocalizedEnumValueLabelChange.CHANGE_LOCALIZED_ENUM_VALUE_LABEL_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeLocalizedEnumValueOrderChangeImpl.class, name = ChangeLocalizedEnumValueOrderChange.CHANGE_LOCALIZED_ENUM_VALUE_ORDER_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeLocalizedNameChangeImpl.class, name = ChangeLocalizedNameChange.CHANGE_LOCALIZED_NAME_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeMasterVariantChangeImpl.class, name = ChangeMasterVariantChange.CHANGE_MASTER_VARIANT_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeNameChangeImpl.class, name = ChangeNameChange.CHANGE_NAME_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeOrderHintChangeImpl.class, name = ChangeOrderHintChange.CHANGE_ORDER_HINT_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeOrderStateChangeImpl.class, name = ChangeOrderStateChange.CHANGE_ORDER_STATE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeParentChangeImpl.class, name = ChangeParentChange.CHANGE_PARENT_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangePaymentStateChangeImpl.class, name = ChangePaymentStateChange.CHANGE_PAYMENT_STATE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangePlainEnumValueLabelChangeImpl.class, name = ChangePlainEnumValueLabelChange.CHANGE_PLAIN_ENUM_VALUE_LABEL_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangePlainEnumValueOrderChangeImpl.class, name = ChangePlainEnumValueOrderChange.CHANGE_PLAIN_ENUM_VALUE_ORDER_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangePredicateChangeImpl.class, name = ChangePredicateChange.CHANGE_PREDICATE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangePriceChangeImpl.class, name = ChangePriceChange.CHANGE_PRICE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeQuantityChangeImpl.class, name = ChangeQuantityChange.CHANGE_QUANTITY_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeRequiresDiscountCodeChangeImpl.class, name = ChangeRequiresDiscountCodeChange.CHANGE_REQUIRES_DISCOUNT_CODE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeReviewRatingStatisticsChangeImpl.class, name = ChangeReviewRatingStatisticsChange.CHANGE_REVIEW_RATING_STATISTICS_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeShipmentStateChangeImpl.class, name = ChangeShipmentStateChange.CHANGE_SHIPMENT_STATE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeShoppingListLineItemQuantityChangeImpl.class, name = ChangeShoppingListLineItemQuantityChange.CHANGE_SHOPPING_LIST_LINE_ITEM_QUANTITY_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeShoppingListLineItemsOrderChangeImpl.class, name = ChangeShoppingListLineItemsOrderChange.CHANGE_SHOPPING_LIST_LINE_ITEMS_ORDER_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeSlugChangeImpl.class, name = ChangeSlugChange.CHANGE_SLUG_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeSortOrderChangeImpl.class, name = ChangeSortOrderChange.CHANGE_SORT_ORDER_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeStackingModeChangeImpl.class, name = ChangeStackingModeChange.CHANGE_STACKING_MODE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeStateTypeChangeImpl.class, name = ChangeStateTypeChange.CHANGE_STATE_TYPE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeTargetChangeImpl.class, name = ChangeTargetChange.CHANGE_TARGET_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeTaxCalculationModeChangeImpl.class, name = ChangeTaxCalculationModeChange.CHANGE_TAX_CALCULATION_MODE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeTaxModeChangeImpl.class, name = ChangeTaxModeChange.CHANGE_TAX_MODE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeTaxRoundingModeChangeImpl.class, name = ChangeTaxRoundingModeChange.CHANGE_TAX_ROUNDING_MODE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeTextLineItemNameChangeImpl.class, name = ChangeTextLineItemNameChange.CHANGE_TEXT_LINE_ITEM_NAME_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeTextLineItemQuantityChangeImpl.class, name = ChangeTextLineItemQuantityChange.CHANGE_TEXT_LINE_ITEM_QUANTITY_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeTextLineItemsOrderChangeImpl.class, name = ChangeTextLineItemsOrderChange.CHANGE_TEXT_LINE_ITEMS_ORDER_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeTransactionInteractionIdChangeImpl.class, name = ChangeTransactionInteractionIdChange.CHANGE_TRANSACTION_INTERACTION_ID_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeTransactionStateChangeImpl.class, name = ChangeTransactionStateChange.CHANGE_TRANSACTION_STATE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeTransactionTimestampChangeImpl.class, name = ChangeTransactionTimestampChange.CHANGE_TRANSACTION_TIMESTAMP_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeValueChangeImpl.class, name = ChangeValueChange.CHANGE_VALUE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.MoveImageToPositionChangeImpl.class, name = MoveImageToPositionChange.MOVE_IMAGE_TO_POSITION_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.PublishChangeImpl.class, name = PublishChange.PUBLISH_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.RemoveAddressChangeImpl.class, name = RemoveAddressChange.REMOVE_ADDRESS_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.RemoveAssetChangeImpl.class, name = RemoveAssetChange.REMOVE_ASSET_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.RemoveAttributeDefinitionChangeImpl.class, name = RemoveAttributeDefinitionChange.REMOVE_ATTRIBUTE_DEFINITION_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.RemoveBillingAddressIdChangeImpl.class, name = RemoveBillingAddressIdChange.REMOVE_BILLING_ADDRESS_ID_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.RemoveChannelRolesChangeImpl.class, name = RemoveChannelRolesChange.REMOVE_CHANNEL_ROLES_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.RemoveCustomLineItemChangeImpl.class, name = RemoveCustomLineItemChange.REMOVE_CUSTOM_LINE_ITEM_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.RemoveDeliveryItemsChangeImpl.class, name = RemoveDeliveryItemsChange.REMOVE_DELIVERY_ITEMS_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.RemoveDiscountCodeChangeImpl.class, name = RemoveDiscountCodeChange.REMOVE_DISCOUNT_CODE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.RemoveEnumValuesChangeImpl.class, name = RemoveEnumValuesChange.REMOVE_ENUM_VALUES_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.RemoveFieldDefinitionChangeImpl.class, name = RemoveFieldDefinitionChange.REMOVE_FIELD_DEFINITION_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.RemoveFromCategoryChangeImpl.class, name = RemoveFromCategoryChange.REMOVE_FROM_CATEGORY_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.RemoveImageChangeImpl.class, name = RemoveImageChange.REMOVE_IMAGE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.RemoveItemShippingAddressesChangeImpl.class, name = RemoveItemShippingAddressesChange.REMOVE_ITEM_SHIPPING_ADDRESSES_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.RemoveLocalizedEnumValuesChangeImpl.class, name = RemoveLocalizedEnumValuesChange.REMOVE_LOCALIZED_ENUM_VALUES_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.RemoveLocationChangeImpl.class, name = RemoveLocationChange.REMOVE_LOCATION_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.RemoveOrderLineItemChangeImpl.class, name = RemoveOrderLineItemChange.REMOVE_ORDER_LINE_ITEM_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.RemoveParcelFromDeliveryChangeImpl.class, name = RemoveParcelFromDeliveryChange.REMOVE_PARCEL_FROM_DELIVERY_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.RemovePaymentChangeImpl.class, name = RemovePaymentChange.REMOVE_PAYMENT_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.RemovePriceChangeImpl.class, name = RemovePriceChange.REMOVE_PRICE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.RemovePropertyChangeImpl.class, name = RemovePropertyChange.REMOVE_PROPERTY_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.RemoveShippingAddressIdChangeImpl.class, name = RemoveShippingAddressIdChange.REMOVE_SHIPPING_ADDRESS_ID_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.RemoveShoppingListLineItemChangeImpl.class, name = RemoveShoppingListLineItemChange.REMOVE_SHOPPING_LIST_LINE_ITEM_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.RemoveStateRolesChangeImpl.class, name = RemoveStateRolesChange.REMOVE_STATE_ROLES_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.RemoveTaxRateChangeImpl.class, name = RemoveTaxRateChange.REMOVE_TAX_RATE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.RemoveTextLineItemChangeImpl.class, name = RemoveTextLineItemChange.REMOVE_TEXT_LINE_ITEM_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.RemoveVariantChangeImpl.class, name = RemoveVariantChange.REMOVE_VARIANT_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetAddressChangeImpl.class, name = SetAddressChange.SET_ADDRESS_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetAnonymousIdChangeImpl.class, name = SetAnonymousIdChange.SET_ANONYMOUS_ID_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetApplicationVersionChangeImpl.class, name = SetApplicationVersionChange.SET_APPLICATION_VERSION_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetAssetCustomFieldChangeImpl.class, name = SetAssetCustomFieldChange.SET_ASSET_CUSTOM_FIELD_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetAssetCustomTypeChangeImpl.class, name = SetAssetCustomTypeChange.SET_ASSET_CUSTOM_TYPE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetAssetDescriptionChangeImpl.class, name = SetAssetDescriptionChange.SET_ASSET_DESCRIPTION_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetAssetKeyChangeImpl.class, name = SetAssetKeyChange.SET_ASSET_KEY_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetAssetSourcesChangeImpl.class, name = SetAssetSourcesChange.SET_ASSET_SOURCES_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetAssetTagsChangeImpl.class, name = SetAssetTagsChange.SET_ASSET_TAGS_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetAttributeChangeImpl.class, name = SetAttributeChange.SET_ATTRIBUTE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetAuthorNameChangeImpl.class, name = SetAuthorNameChange.SET_AUTHOR_NAME_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetBillingAddressChangeImpl.class, name = SetBillingAddressChange.SET_BILLING_ADDRESS_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetCartPredicateChangeImpl.class, name = SetCartPredicateChange.SET_CART_PREDICATE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetCategoryOrderHintChangeImpl.class, name = SetCategoryOrderHintChange.SET_CATEGORY_ORDER_HINT_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetChannelRolesChangeImpl.class, name = SetChannelRolesChange.SET_CHANNEL_ROLES_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetCompanyNameChangeImpl.class, name = SetCompanyNameChange.SET_COMPANY_NAME_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetCountryChangeImpl.class, name = SetCountryChange.SET_COUNTRY_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetCustomFieldChangeImpl.class, name = SetCustomFieldChange.SET_CUSTOM_FIELD_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetCustomLineItemCustomFieldChangeImpl.class, name = SetCustomLineItemCustomFieldChange.SET_CUSTOM_LINE_ITEM_CUSTOM_FIELD_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetCustomLineItemCustomTypeChangeImpl.class, name = SetCustomLineItemCustomTypeChange.SET_CUSTOM_LINE_ITEM_CUSTOM_TYPE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetCustomLineItemMoneyChangeImpl.class, name = SetCustomLineItemMoneyChange.SET_CUSTOM_LINE_ITEM_MONEY_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetCustomLineItemShippingDetailsChangeImpl.class, name = SetCustomLineItemShippingDetailsChange.SET_CUSTOM_LINE_ITEM_SHIPPING_DETAILS_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetCustomLineItemTaxAmountChangeImpl.class, name = SetCustomLineItemTaxAmountChange.SET_CUSTOM_LINE_ITEM_TAX_AMOUNT_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetCustomLineItemTaxCategoryChangeImpl.class, name = SetCustomLineItemTaxCategoryChange.SET_CUSTOM_LINE_ITEM_TAX_CATEGORY_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetCustomLineItemTaxRateChangeImpl.class, name = SetCustomLineItemTaxRateChange.SET_CUSTOM_LINE_ITEM_TAX_RATE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetCustomLineItemTaxedPriceChangeImpl.class, name = SetCustomLineItemTaxedPriceChange.SET_CUSTOM_LINE_ITEM_TAXED_PRICE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetCustomLineItemTotalPriceChangeImpl.class, name = SetCustomLineItemTotalPriceChange.SET_CUSTOM_LINE_ITEM_TOTAL_PRICE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetCustomShippingMethodChangeImpl.class, name = SetCustomShippingMethodChange.SET_CUSTOM_SHIPPING_METHOD_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetCustomTypeChangeImpl.class, name = SetCustomTypeChange.SET_CUSTOM_TYPE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetCustomerChangeImpl.class, name = SetCustomerChange.SET_CUSTOMER_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetCustomerEmailChangeImpl.class, name = SetCustomerEmailChange.SET_CUSTOMER_EMAIL_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetCustomerGroupChangeImpl.class, name = SetCustomerGroupChange.SET_CUSTOMER_GROUP_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetCustomerIdChangeImpl.class, name = SetCustomerIdChange.SET_CUSTOMER_ID_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetCustomerNumberChangeImpl.class, name = SetCustomerNumberChange.SET_CUSTOMER_NUMBER_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetDateOfBirthChangeImpl.class, name = SetDateOfBirthChange.SET_DATE_OF_BIRTH_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetDefaultBillingAddressChangeImpl.class, name = SetDefaultBillingAddressChange.SET_DEFAULT_BILLING_ADDRESS_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetDefaultShippingAddressChangeImpl.class, name = SetDefaultShippingAddressChange.SET_DEFAULT_SHIPPING_ADDRESS_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetDeleteDaysAfterLastModificationChangeImpl.class, name = SetDeleteDaysAfterLastModificationChange.SET_DELETE_DAYS_AFTER_LAST_MODIFICATION_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetDeliveryAddressChangeImpl.class, name = SetDeliveryAddressChange.SET_DELIVERY_ADDRESS_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetDeliveryItemsChangeImpl.class, name = SetDeliveryItemsChange.SET_DELIVERY_ITEMS_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetDescriptionChangeImpl.class, name = SetDescriptionChange.SET_DESCRIPTION_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetDiscountedPriceChangeImpl.class, name = SetDiscountedPriceChange.SET_DISCOUNTED_PRICE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetDistributionChannelsChangeImpl.class, name = SetDistributionChannelsChange.SET_DISTRIBUTION_CHANNELS_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetExpectedDeliveryChangeImpl.class, name = SetExpectedDeliveryChange.SET_EXPECTED_DELIVERY_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetExternalIdChangeImpl.class, name = SetExternalIdChange.SET_EXTERNAL_ID_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetFirstNameChangeImpl.class, name = SetFirstNameChange.SET_FIRST_NAME_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetGeoLocationChangeImpl.class, name = SetGeoLocationChange.SET_GEO_LOCATION_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetImageLabelChangeImpl.class, name = SetImageLabelChange.SET_IMAGE_LABEL_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetInputTipChangeImpl.class, name = SetInputTipChange.SET_INPUT_TIP_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetInterfaceIdChangeImpl.class, name = SetInterfaceIdChange.SET_INTERFACE_ID_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetIsValidChangeImpl.class, name = SetIsValidChange.SET_IS_VALID_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetKeyChangeImpl.class, name = SetKeyChange.SET_KEY_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetLanguagesChangeImpl.class, name = SetLanguagesChange.SET_LANGUAGES_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetLastNameChangeImpl.class, name = SetLastNameChange.SET_LAST_NAME_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetLineItemDiscountedPriceChangeImpl.class, name = SetLineItemDiscountedPriceChange.SET_LINE_ITEM_DISCOUNTED_PRICE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetLineItemDiscountedPricePerQuantityChangeImpl.class, name = SetLineItemDiscountedPricePerQuantityChange.SET_LINE_ITEM_DISCOUNTED_PRICE_PER_QUANTITY_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetLineItemDistributionChannelChangeImpl.class, name = SetLineItemDistributionChannelChange.SET_LINE_ITEM_DISTRIBUTION_CHANNEL_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetLineItemPriceChangeImpl.class, name = SetLineItemPriceChange.SET_LINE_ITEM_PRICE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetLineItemProductSlugChangeImpl.class, name = SetLineItemProductSlugChange.SET_LINE_ITEM_PRODUCT_SLUG_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetLineItemShippingDetailsChangeImpl.class, name = SetLineItemShippingDetailsChange.SET_LINE_ITEM_SHIPPING_DETAILS_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetLineItemTaxAmountChangeImpl.class, name = SetLineItemTaxAmountChange.SET_LINE_ITEM_TAX_AMOUNT_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetLineItemTaxRateChangeImpl.class, name = SetLineItemTaxRateChange.SET_LINE_ITEM_TAX_RATE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetLineItemTaxedPriceChangeImpl.class, name = SetLineItemTaxedPriceChange.SET_LINE_ITEM_TAXED_PRICE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetLineItemTotalPriceChangeImpl.class, name = SetLineItemTotalPriceChange.SET_LINE_ITEM_TOTAL_PRICE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetLocaleChangeImpl.class, name = SetLocaleChange.SET_LOCALE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetLocalizedDescriptionChangeImpl.class, name = SetLocalizedDescriptionChange.SET_LOCALIZED_DESCRIPTION_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetMaxApplicationsChangeImpl.class, name = SetMaxApplicationsChange.SET_MAX_APPLICATIONS_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetMaxApplicationsPerCustomerChangeImpl.class, name = SetMaxApplicationsPerCustomerChange.SET_MAX_APPLICATIONS_PER_CUSTOMER_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetMetaDescriptionChangeImpl.class, name = SetMetaDescriptionChange.SET_META_DESCRIPTION_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetMetaKeywordsChangeImpl.class, name = SetMetaKeywordsChange.SET_META_KEYWORDS_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetMetaTitleChangeImpl.class, name = SetMetaTitleChange.SET_META_TITLE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetMethodInfoInterfaceChangeImpl.class, name = SetMethodInfoInterfaceChange.SET_METHOD_INFO_INTERFACE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetMethodInfoMethodChangeImpl.class, name = SetMethodInfoMethodChange.SET_METHOD_INFO_METHOD_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetMethodInfoNameChangeImpl.class, name = SetMethodInfoNameChange.SET_METHOD_INFO_NAME_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetMiddleNameChangeImpl.class, name = SetMiddleNameChange.SET_MIDDLE_NAME_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetNameChangeImpl.class, name = SetNameChange.SET_NAME_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetOrderLineItemCustomFieldChangeImpl.class, name = SetOrderLineItemCustomFieldChange.SET_ORDER_LINE_ITEM_CUSTOM_FIELD_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetOrderLineItemCustomTypeChangeImpl.class, name = SetOrderLineItemCustomTypeChange.SET_ORDER_LINE_ITEM_CUSTOM_TYPE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetOrderNumberChangeImpl.class, name = SetOrderNumberChange.SET_ORDER_NUMBER_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetOrderTaxedPriceChangeImpl.class, name = SetOrderTaxedPriceChange.SET_ORDER_TAXED_PRICE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetOrderTotalPriceChangeImpl.class, name = SetOrderTotalPriceChange.SET_ORDER_TOTAL_PRICE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetOrderTotalTaxChangeImpl.class, name = SetOrderTotalTaxChange.SET_ORDER_TOTAL_TAX_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetParcelItemsChangeImpl.class, name = SetParcelItemsChange.SET_PARCEL_ITEMS_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetParcelMeasurementsChangeImpl.class, name = SetParcelMeasurementsChange.SET_PARCEL_MEASUREMENTS_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetParcelTrackingDataChangeImpl.class, name = SetParcelTrackingDataChange.SET_PARCEL_TRACKING_DATA_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetPricesChangeImpl.class, name = SetPricesChange.SET_PRICES_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetProductPriceCustomFieldChangeImpl.class, name = SetProductPriceCustomFieldChange.SET_PRODUCT_PRICE_CUSTOM_FIELD_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetProductPriceCustomTypeChangeImpl.class, name = SetProductPriceCustomTypeChange.SET_PRODUCT_PRICE_CUSTOM_TYPE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetProductVariantKeyChangeImpl.class, name = SetProductVariantKeyChange.SET_PRODUCT_VARIANT_KEY_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetPropertyChangeImpl.class, name = SetPropertyChange.SET_PROPERTY_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetRatingChangeImpl.class, name = SetRatingChange.SET_RATING_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetReservationsChangeImpl.class, name = SetReservationsChange.SET_RESERVATIONS_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetRestockableInDaysChangeImpl.class, name = SetRestockableInDaysChange.SET_RESTOCKABLE_IN_DAYS_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetReturnPaymentStateChangeImpl.class, name = SetReturnPaymentStateChange.SET_RETURN_PAYMENT_STATE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetReturnShipmentStateChangeImpl.class, name = SetReturnShipmentStateChange.SET_RETURN_SHIPMENT_STATE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetSalutationChangeImpl.class, name = SetSalutationChange.SET_SALUTATION_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetSearchKeywordsChangeImpl.class, name = SetSearchKeywordsChange.SET_SEARCH_KEYWORDS_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetShippingAddressChangeImpl.class, name = SetShippingAddressChange.SET_SHIPPING_ADDRESS_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetShippingInfoPriceChangeImpl.class, name = SetShippingInfoPriceChange.SET_SHIPPING_INFO_PRICE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetShippingInfoTaxedPriceChangeImpl.class, name = SetShippingInfoTaxedPriceChange.SET_SHIPPING_INFO_TAXED_PRICE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetShippingMethodChangeImpl.class, name = SetShippingMethodChange.SET_SHIPPING_METHOD_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetShippingMethodTaxAmountChangeImpl.class, name = SetShippingMethodTaxAmountChange.SET_SHIPPING_METHOD_TAX_AMOUNT_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetShippingMethodTaxRateChangeImpl.class, name = SetShippingMethodTaxRateChange.SET_SHIPPING_METHOD_TAX_RATE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetShippingRateChangeImpl.class, name = SetShippingRateChange.SET_SHIPPING_RATE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetShippingRateInputChangeImpl.class, name = SetShippingRateInputChange.SET_SHIPPING_RATE_INPUT_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetShoppingListLineItemCustomFieldChangeImpl.class, name = SetShoppingListLineItemCustomFieldChange.SET_SHOPPING_LIST_LINE_ITEM_CUSTOM_FIELD_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetShoppingListLineItemCustomTypeChangeImpl.class, name = SetShoppingListLineItemCustomTypeChange.SET_SHOPPING_LIST_LINE_ITEM_CUSTOM_TYPE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetSkuChangeImpl.class, name = SetSkuChange.SET_SKU_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetSlugChangeImpl.class, name = SetSlugChange.SET_SLUG_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetStateRolesChangeImpl.class, name = SetStateRolesChange.SET_STATE_ROLES_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetStatusInterfaceCodeChangeImpl.class, name = SetStatusInterfaceCodeChange.SET_STATUS_INTERFACE_CODE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetStatusInterfaceTextChangeImpl.class, name = SetStatusInterfaceTextChange.SET_STATUS_INTERFACE_TEXT_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetStoreChangeImpl.class, name = SetStoreChange.SET_STORE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetStoresChangeImpl.class, name = SetStoresChange.SET_STORES_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetSupplyChannelChangeImpl.class, name = SetSupplyChannelChange.SET_SUPPLY_CHANNEL_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetSupplyChannelsChangeImpl.class, name = SetSupplyChannelsChange.SET_SUPPLY_CHANNELS_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetTargetChangeImpl.class, name = SetTargetChange.SET_TARGET_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetTaxCategoryChangeImpl.class, name = SetTaxCategoryChange.SET_TAX_CATEGORY_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetTextChangeImpl.class, name = SetTextChange.SET_TEXT_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetTextLineItemCustomFieldChangeImpl.class, name = SetTextLineItemCustomFieldChange.SET_TEXT_LINE_ITEM_CUSTOM_FIELD_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetTextLineItemCustomTypeChangeImpl.class, name = SetTextLineItemCustomTypeChange.SET_TEXT_LINE_ITEM_CUSTOM_TYPE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetTextLineItemDescriptionChangeImpl.class, name = SetTextLineItemDescriptionChange.SET_TEXT_LINE_ITEM_DESCRIPTION_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetTitleChangeImpl.class, name = SetTitleChange.SET_TITLE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetTransitionsChangeImpl.class, name = SetTransitionsChange.SET_TRANSITIONS_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetValidFromAndUntilChangeImpl.class, name = SetValidFromAndUntilChange.SET_VALID_FROM_AND_UNTIL_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetValidFromChangeImpl.class, name = SetValidFromChange.SET_VALID_FROM_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetValidUntilChangeImpl.class, name = SetValidUntilChange.SET_VALID_UNTIL_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetValueChangeImpl.class, name = SetValueChange.SET_VALUE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetVariantAvailabilityChangeImpl.class, name = SetVariantAvailabilityChange.SET_VARIANT_AVAILABILITY_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetVatIdChangeImpl.class, name = SetVatIdChange.SET_VAT_ID_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.TransitionCustomLineItemStateChangeImpl.class, name = TransitionCustomLineItemStateChange.TRANSITION_CUSTOM_LINE_ITEM_STATE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.TransitionLineItemStateChangeImpl.class, name = TransitionLineItemStateChange.TRANSITION_LINE_ITEM_STATE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.TransitionStateChangeImpl.class, name = TransitionStateChange.TRANSITION_STATE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.UnknownChangeImpl.class, name = UnknownChange.UNKNOWN_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.UnpublishChangeImpl.class, name = UnpublishChange.UNPUBLISH_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.UpdateSyncInfoChangeImpl.class, name = UpdateSyncInfoChange.UPDATE_SYNC_INFO_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.VerifyEmailChangeImpl.class, name = VerifyEmailChange.VERIFY_EMAIL_CHANGE) })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = ChangeImpl.class, visible = true)
@JsonDeserialize(as = ChangeImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public interface Change {

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @JsonProperty("change")
    public String getChange();

    public void setChange(final String change);

    public static com.commercetools.history.models.change.AddAddressChangeBuilder addAddressChangeBuilder() {
        return com.commercetools.history.models.change.AddAddressChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.AddAssetChangeBuilder addAssetChangeBuilder() {
        return com.commercetools.history.models.change.AddAssetChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.AddAttributeDefinitionChangeBuilder addAttributeDefinitionChangeBuilder() {
        return com.commercetools.history.models.change.AddAttributeDefinitionChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.AddBillingAddressIdChangeBuilder addBillingAddressIdChangeBuilder() {
        return com.commercetools.history.models.change.AddBillingAddressIdChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.AddChannelRolesChangeBuilder addChannelRolesChangeBuilder() {
        return com.commercetools.history.models.change.AddChannelRolesChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.AddCustomLineItemChangeBuilder addCustomLineItemChangeBuilder() {
        return com.commercetools.history.models.change.AddCustomLineItemChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.AddDeliveryChangeBuilder addDeliveryChangeBuilder() {
        return com.commercetools.history.models.change.AddDeliveryChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.AddDiscountCodeChangeBuilder addDiscountCodeChangeBuilder() {
        return com.commercetools.history.models.change.AddDiscountCodeChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.AddEnumValueChangeBuilder addEnumValueChangeBuilder() {
        return com.commercetools.history.models.change.AddEnumValueChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.AddExternalImageChangeBuilder addExternalImageChangeBuilder() {
        return com.commercetools.history.models.change.AddExternalImageChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.AddFieldDefinitionChangeBuilder addFieldDefinitionChangeBuilder() {
        return com.commercetools.history.models.change.AddFieldDefinitionChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.AddInterfaceInteractionChangeBuilder addInterfaceInteractionChangeBuilder() {
        return com.commercetools.history.models.change.AddInterfaceInteractionChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.AddItemShippingAddressesChangeBuilder addItemShippingAddressesChangeBuilder() {
        return com.commercetools.history.models.change.AddItemShippingAddressesChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.AddLocalizedEnumValueChangeBuilder addLocalizedEnumValueChangeBuilder() {
        return com.commercetools.history.models.change.AddLocalizedEnumValueChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.AddLocationChangeBuilder addLocationChangeBuilder() {
        return com.commercetools.history.models.change.AddLocationChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.AddOrderLineItemChangeBuilder addOrderLineItemChangeBuilder() {
        return com.commercetools.history.models.change.AddOrderLineItemChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.AddParcelToDeliveryChangeBuilder addParcelToDeliveryChangeBuilder() {
        return com.commercetools.history.models.change.AddParcelToDeliveryChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.AddPaymentChangeBuilder addPaymentChangeBuilder() {
        return com.commercetools.history.models.change.AddPaymentChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.AddPlainEnumValueChangeBuilder addPlainEnumValueChangeBuilder() {
        return com.commercetools.history.models.change.AddPlainEnumValueChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.AddPriceChangeBuilder addPriceChangeBuilder() {
        return com.commercetools.history.models.change.AddPriceChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.AddPropertyChangeBuilder addPropertyChangeBuilder() {
        return com.commercetools.history.models.change.AddPropertyChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.AddReturnInfoChangeBuilder addReturnInfoChangeBuilder() {
        return com.commercetools.history.models.change.AddReturnInfoChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.AddShippingAddressIdChangeBuilder addShippingAddressIdChangeBuilder() {
        return com.commercetools.history.models.change.AddShippingAddressIdChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.AddShoppingListLineItemChangeBuilder addShoppingListLineItemChangeBuilder() {
        return com.commercetools.history.models.change.AddShoppingListLineItemChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.AddStateRolesChangeBuilder addStateRolesChangeBuilder() {
        return com.commercetools.history.models.change.AddStateRolesChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.AddTaxRateChangeBuilder addTaxRateChangeBuilder() {
        return com.commercetools.history.models.change.AddTaxRateChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.AddTextLineItemChangeBuilder addTextLineItemChangeBuilder() {
        return com.commercetools.history.models.change.AddTextLineItemChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.AddToCategoryChangeBuilder addToCategoryChangeBuilder() {
        return com.commercetools.history.models.change.AddToCategoryChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.AddTransactionChangeBuilder addTransactionChangeBuilder() {
        return com.commercetools.history.models.change.AddTransactionChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.AddVariantChangeBuilder addVariantChangeBuilder() {
        return com.commercetools.history.models.change.AddVariantChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeAddressChangeBuilder changeAddressChangeBuilder() {
        return com.commercetools.history.models.change.ChangeAddressChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeAmountAuthorizedChangeBuilder changeAmountAuthorizedChangeBuilder() {
        return com.commercetools.history.models.change.ChangeAmountAuthorizedChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeAmountPlannedChangeBuilder changeAmountPlannedChangeBuilder() {
        return com.commercetools.history.models.change.ChangeAmountPlannedChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeAssetNameChangeBuilder changeAssetNameChangeBuilder() {
        return com.commercetools.history.models.change.ChangeAssetNameChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeAssetOrderChangeBuilder changeAssetOrderChangeBuilder() {
        return com.commercetools.history.models.change.ChangeAssetOrderChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeAttributeConstraintChangeBuilder changeAttributeConstraintChangeBuilder() {
        return com.commercetools.history.models.change.ChangeAttributeConstraintChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeAttributeOrderByNameChangeBuilder changeAttributeOrderByNameChangeBuilder() {
        return com.commercetools.history.models.change.ChangeAttributeOrderByNameChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeCartDiscountsChangeBuilder changeCartDiscountsChangeBuilder() {
        return com.commercetools.history.models.change.ChangeCartDiscountsChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeCartPredicateChangeBuilder changeCartPredicateChangeBuilder() {
        return com.commercetools.history.models.change.ChangeCartPredicateChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeCustomLineItemQuantityChangeBuilder changeCustomLineItemQuantityChangeBuilder() {
        return com.commercetools.history.models.change.ChangeCustomLineItemQuantityChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeDescriptionChangeBuilder changeDescriptionChangeBuilder() {
        return com.commercetools.history.models.change.ChangeDescriptionChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeEmailChangeBuilder changeEmailChangeBuilder() {
        return com.commercetools.history.models.change.ChangeEmailChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeEnumValueLabelChangeBuilder changeEnumValueLabelChangeBuilder() {
        return com.commercetools.history.models.change.ChangeEnumValueLabelChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeEnumValueOrderChangeBuilder changeEnumValueOrderChangeBuilder() {
        return com.commercetools.history.models.change.ChangeEnumValueOrderChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeFieldDefinitionOrderChangeBuilder changeFieldDefinitionOrderChangeBuilder() {
        return com.commercetools.history.models.change.ChangeFieldDefinitionOrderChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeGroupsChangeBuilder changeGroupsChangeBuilder() {
        return com.commercetools.history.models.change.ChangeGroupsChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeInitialChangeBuilder changeInitialChangeBuilder() {
        return com.commercetools.history.models.change.ChangeInitialChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeInputHintChangeBuilder changeInputHintChangeBuilder() {
        return com.commercetools.history.models.change.ChangeInputHintChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeIsActiveChangeBuilder changeIsActiveChangeBuilder() {
        return com.commercetools.history.models.change.ChangeIsActiveChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeIsSearchableChangeBuilder changeIsSearchableChangeBuilder() {
        return com.commercetools.history.models.change.ChangeIsSearchableChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeKeyChangeBuilder changeKeyChangeBuilder() {
        return com.commercetools.history.models.change.ChangeKeyChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeLabelChangeBuilder changeLabelChangeBuilder() {
        return com.commercetools.history.models.change.ChangeLabelChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeLineItemQuantityChangeBuilder changeLineItemQuantityChangeBuilder() {
        return com.commercetools.history.models.change.ChangeLineItemQuantityChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeLocalizedDescriptionChangeBuilder changeLocalizedDescriptionChangeBuilder() {
        return com.commercetools.history.models.change.ChangeLocalizedDescriptionChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeLocalizedEnumValueLabelChangeBuilder changeLocalizedEnumValueLabelChangeBuilder() {
        return com.commercetools.history.models.change.ChangeLocalizedEnumValueLabelChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeLocalizedEnumValueOrderChangeBuilder changeLocalizedEnumValueOrderChangeBuilder() {
        return com.commercetools.history.models.change.ChangeLocalizedEnumValueOrderChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeLocalizedNameChangeBuilder changeLocalizedNameChangeBuilder() {
        return com.commercetools.history.models.change.ChangeLocalizedNameChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeMasterVariantChangeBuilder changeMasterVariantChangeBuilder() {
        return com.commercetools.history.models.change.ChangeMasterVariantChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeNameChangeBuilder changeNameChangeBuilder() {
        return com.commercetools.history.models.change.ChangeNameChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeOrderHintChangeBuilder changeOrderHintChangeBuilder() {
        return com.commercetools.history.models.change.ChangeOrderHintChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeOrderStateChangeBuilder changeOrderStateChangeBuilder() {
        return com.commercetools.history.models.change.ChangeOrderStateChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeParentChangeBuilder changeParentChangeBuilder() {
        return com.commercetools.history.models.change.ChangeParentChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangePaymentStateChangeBuilder changePaymentStateChangeBuilder() {
        return com.commercetools.history.models.change.ChangePaymentStateChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangePlainEnumValueLabelChangeBuilder changePlainEnumValueLabelChangeBuilder() {
        return com.commercetools.history.models.change.ChangePlainEnumValueLabelChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangePlainEnumValueOrderChangeBuilder changePlainEnumValueOrderChangeBuilder() {
        return com.commercetools.history.models.change.ChangePlainEnumValueOrderChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangePredicateChangeBuilder changePredicateChangeBuilder() {
        return com.commercetools.history.models.change.ChangePredicateChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangePriceChangeBuilder changePriceChangeBuilder() {
        return com.commercetools.history.models.change.ChangePriceChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeQuantityChangeBuilder changeQuantityChangeBuilder() {
        return com.commercetools.history.models.change.ChangeQuantityChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeRequiresDiscountCodeChangeBuilder changeRequiresDiscountCodeChangeBuilder() {
        return com.commercetools.history.models.change.ChangeRequiresDiscountCodeChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeReviewRatingStatisticsChangeBuilder changeReviewRatingStatisticsChangeBuilder() {
        return com.commercetools.history.models.change.ChangeReviewRatingStatisticsChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeShipmentStateChangeBuilder changeShipmentStateChangeBuilder() {
        return com.commercetools.history.models.change.ChangeShipmentStateChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeShoppingListLineItemQuantityChangeBuilder changeShoppingListLineItemQuantityChangeBuilder() {
        return com.commercetools.history.models.change.ChangeShoppingListLineItemQuantityChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeShoppingListLineItemsOrderChangeBuilder changeShoppingListLineItemsOrderChangeBuilder() {
        return com.commercetools.history.models.change.ChangeShoppingListLineItemsOrderChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeSlugChangeBuilder changeSlugChangeBuilder() {
        return com.commercetools.history.models.change.ChangeSlugChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeSortOrderChangeBuilder changeSortOrderChangeBuilder() {
        return com.commercetools.history.models.change.ChangeSortOrderChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeStackingModeChangeBuilder changeStackingModeChangeBuilder() {
        return com.commercetools.history.models.change.ChangeStackingModeChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeStateTypeChangeBuilder changeStateTypeChangeBuilder() {
        return com.commercetools.history.models.change.ChangeStateTypeChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeTargetChangeBuilder changeTargetChangeBuilder() {
        return com.commercetools.history.models.change.ChangeTargetChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeTaxCalculationModeChangeBuilder changeTaxCalculationModeChangeBuilder() {
        return com.commercetools.history.models.change.ChangeTaxCalculationModeChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeTaxModeChangeBuilder changeTaxModeChangeBuilder() {
        return com.commercetools.history.models.change.ChangeTaxModeChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeTaxRoundingModeChangeBuilder changeTaxRoundingModeChangeBuilder() {
        return com.commercetools.history.models.change.ChangeTaxRoundingModeChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeTextLineItemNameChangeBuilder changeTextLineItemNameChangeBuilder() {
        return com.commercetools.history.models.change.ChangeTextLineItemNameChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeTextLineItemQuantityChangeBuilder changeTextLineItemQuantityChangeBuilder() {
        return com.commercetools.history.models.change.ChangeTextLineItemQuantityChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeTextLineItemsOrderChangeBuilder changeTextLineItemsOrderChangeBuilder() {
        return com.commercetools.history.models.change.ChangeTextLineItemsOrderChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeTransactionInteractionIdChangeBuilder changeTransactionInteractionIdChangeBuilder() {
        return com.commercetools.history.models.change.ChangeTransactionInteractionIdChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeTransactionStateChangeBuilder changeTransactionStateChangeBuilder() {
        return com.commercetools.history.models.change.ChangeTransactionStateChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeTransactionTimestampChangeBuilder changeTransactionTimestampChangeBuilder() {
        return com.commercetools.history.models.change.ChangeTransactionTimestampChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.ChangeValueChangeBuilder changeValueChangeBuilder() {
        return com.commercetools.history.models.change.ChangeValueChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.MoveImageToPositionChangeBuilder moveImageToPositionChangeBuilder() {
        return com.commercetools.history.models.change.MoveImageToPositionChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.PublishChangeBuilder publishChangeBuilder() {
        return com.commercetools.history.models.change.PublishChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.RemoveAddressChangeBuilder removeAddressChangeBuilder() {
        return com.commercetools.history.models.change.RemoveAddressChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.RemoveAssetChangeBuilder removeAssetChangeBuilder() {
        return com.commercetools.history.models.change.RemoveAssetChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.RemoveAttributeDefinitionChangeBuilder removeAttributeDefinitionChangeBuilder() {
        return com.commercetools.history.models.change.RemoveAttributeDefinitionChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.RemoveBillingAddressIdChangeBuilder removeBillingAddressIdChangeBuilder() {
        return com.commercetools.history.models.change.RemoveBillingAddressIdChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.RemoveChannelRolesChangeBuilder removeChannelRolesChangeBuilder() {
        return com.commercetools.history.models.change.RemoveChannelRolesChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.RemoveCustomLineItemChangeBuilder removeCustomLineItemChangeBuilder() {
        return com.commercetools.history.models.change.RemoveCustomLineItemChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.RemoveDeliveryItemsChangeBuilder removeDeliveryItemsChangeBuilder() {
        return com.commercetools.history.models.change.RemoveDeliveryItemsChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.RemoveDiscountCodeChangeBuilder removeDiscountCodeChangeBuilder() {
        return com.commercetools.history.models.change.RemoveDiscountCodeChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.RemoveEnumValuesChangeBuilder removeEnumValuesChangeBuilder() {
        return com.commercetools.history.models.change.RemoveEnumValuesChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.RemoveFieldDefinitionChangeBuilder removeFieldDefinitionChangeBuilder() {
        return com.commercetools.history.models.change.RemoveFieldDefinitionChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.RemoveFromCategoryChangeBuilder removeFromCategoryChangeBuilder() {
        return com.commercetools.history.models.change.RemoveFromCategoryChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.RemoveImageChangeBuilder removeImageChangeBuilder() {
        return com.commercetools.history.models.change.RemoveImageChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.RemoveItemShippingAddressesChangeBuilder removeItemShippingAddressesChangeBuilder() {
        return com.commercetools.history.models.change.RemoveItemShippingAddressesChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.RemoveLocalizedEnumValuesChangeBuilder removeLocalizedEnumValuesChangeBuilder() {
        return com.commercetools.history.models.change.RemoveLocalizedEnumValuesChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.RemoveLocationChangeBuilder removeLocationChangeBuilder() {
        return com.commercetools.history.models.change.RemoveLocationChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.RemoveOrderLineItemChangeBuilder removeOrderLineItemChangeBuilder() {
        return com.commercetools.history.models.change.RemoveOrderLineItemChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.RemoveParcelFromDeliveryChangeBuilder removeParcelFromDeliveryChangeBuilder() {
        return com.commercetools.history.models.change.RemoveParcelFromDeliveryChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.RemovePaymentChangeBuilder removePaymentChangeBuilder() {
        return com.commercetools.history.models.change.RemovePaymentChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.RemovePriceChangeBuilder removePriceChangeBuilder() {
        return com.commercetools.history.models.change.RemovePriceChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.RemovePropertyChangeBuilder removePropertyChangeBuilder() {
        return com.commercetools.history.models.change.RemovePropertyChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.RemoveShippingAddressIdChangeBuilder removeShippingAddressIdChangeBuilder() {
        return com.commercetools.history.models.change.RemoveShippingAddressIdChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.RemoveShoppingListLineItemChangeBuilder removeShoppingListLineItemChangeBuilder() {
        return com.commercetools.history.models.change.RemoveShoppingListLineItemChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.RemoveStateRolesChangeBuilder removeStateRolesChangeBuilder() {
        return com.commercetools.history.models.change.RemoveStateRolesChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.RemoveTaxRateChangeBuilder removeTaxRateChangeBuilder() {
        return com.commercetools.history.models.change.RemoveTaxRateChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.RemoveTextLineItemChangeBuilder removeTextLineItemChangeBuilder() {
        return com.commercetools.history.models.change.RemoveTextLineItemChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.RemoveVariantChangeBuilder removeVariantChangeBuilder() {
        return com.commercetools.history.models.change.RemoveVariantChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetAddressChangeBuilder setAddressChangeBuilder() {
        return com.commercetools.history.models.change.SetAddressChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetAnonymousIdChangeBuilder setAnonymousIdChangeBuilder() {
        return com.commercetools.history.models.change.SetAnonymousIdChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetApplicationVersionChangeBuilder setApplicationVersionChangeBuilder() {
        return com.commercetools.history.models.change.SetApplicationVersionChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetAssetCustomFieldChangeBuilder setAssetCustomFieldChangeBuilder() {
        return com.commercetools.history.models.change.SetAssetCustomFieldChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetAssetCustomTypeChangeBuilder setAssetCustomTypeChangeBuilder() {
        return com.commercetools.history.models.change.SetAssetCustomTypeChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetAssetDescriptionChangeBuilder setAssetDescriptionChangeBuilder() {
        return com.commercetools.history.models.change.SetAssetDescriptionChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetAssetKeyChangeBuilder setAssetKeyChangeBuilder() {
        return com.commercetools.history.models.change.SetAssetKeyChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetAssetSourcesChangeBuilder setAssetSourcesChangeBuilder() {
        return com.commercetools.history.models.change.SetAssetSourcesChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetAssetTagsChangeBuilder setAssetTagsChangeBuilder() {
        return com.commercetools.history.models.change.SetAssetTagsChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetAttributeChangeBuilder setAttributeChangeBuilder() {
        return com.commercetools.history.models.change.SetAttributeChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetAuthorNameChangeBuilder setAuthorNameChangeBuilder() {
        return com.commercetools.history.models.change.SetAuthorNameChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetBillingAddressChangeBuilder setBillingAddressChangeBuilder() {
        return com.commercetools.history.models.change.SetBillingAddressChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetCartPredicateChangeBuilder setCartPredicateChangeBuilder() {
        return com.commercetools.history.models.change.SetCartPredicateChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetCategoryOrderHintChangeBuilder setCategoryOrderHintChangeBuilder() {
        return com.commercetools.history.models.change.SetCategoryOrderHintChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetChannelRolesChangeBuilder setChannelRolesChangeBuilder() {
        return com.commercetools.history.models.change.SetChannelRolesChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetCompanyNameChangeBuilder setCompanyNameChangeBuilder() {
        return com.commercetools.history.models.change.SetCompanyNameChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetCountryChangeBuilder setCountryChangeBuilder() {
        return com.commercetools.history.models.change.SetCountryChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetCustomFieldChangeBuilder setCustomFieldChangeBuilder() {
        return com.commercetools.history.models.change.SetCustomFieldChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetCustomLineItemCustomFieldChangeBuilder setCustomLineItemCustomFieldChangeBuilder() {
        return com.commercetools.history.models.change.SetCustomLineItemCustomFieldChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetCustomLineItemCustomTypeChangeBuilder setCustomLineItemCustomTypeChangeBuilder() {
        return com.commercetools.history.models.change.SetCustomLineItemCustomTypeChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetCustomLineItemMoneyChangeBuilder setCustomLineItemMoneyChangeBuilder() {
        return com.commercetools.history.models.change.SetCustomLineItemMoneyChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetCustomLineItemShippingDetailsChangeBuilder setCustomLineItemShippingDetailsChangeBuilder() {
        return com.commercetools.history.models.change.SetCustomLineItemShippingDetailsChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetCustomLineItemTaxAmountChangeBuilder setCustomLineItemTaxAmountChangeBuilder() {
        return com.commercetools.history.models.change.SetCustomLineItemTaxAmountChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetCustomLineItemTaxCategoryChangeBuilder setCustomLineItemTaxCategoryChangeBuilder() {
        return com.commercetools.history.models.change.SetCustomLineItemTaxCategoryChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetCustomLineItemTaxRateChangeBuilder setCustomLineItemTaxRateChangeBuilder() {
        return com.commercetools.history.models.change.SetCustomLineItemTaxRateChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetCustomLineItemTaxedPriceChangeBuilder setCustomLineItemTaxedPriceChangeBuilder() {
        return com.commercetools.history.models.change.SetCustomLineItemTaxedPriceChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetCustomLineItemTotalPriceChangeBuilder setCustomLineItemTotalPriceChangeBuilder() {
        return com.commercetools.history.models.change.SetCustomLineItemTotalPriceChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetCustomShippingMethodChangeBuilder setCustomShippingMethodChangeBuilder() {
        return com.commercetools.history.models.change.SetCustomShippingMethodChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetCustomTypeChangeBuilder setCustomTypeChangeBuilder() {
        return com.commercetools.history.models.change.SetCustomTypeChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetCustomerChangeBuilder setCustomerChangeBuilder() {
        return com.commercetools.history.models.change.SetCustomerChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetCustomerEmailChangeBuilder setCustomerEmailChangeBuilder() {
        return com.commercetools.history.models.change.SetCustomerEmailChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetCustomerGroupChangeBuilder setCustomerGroupChangeBuilder() {
        return com.commercetools.history.models.change.SetCustomerGroupChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetCustomerIdChangeBuilder setCustomerIdChangeBuilder() {
        return com.commercetools.history.models.change.SetCustomerIdChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetCustomerNumberChangeBuilder setCustomerNumberChangeBuilder() {
        return com.commercetools.history.models.change.SetCustomerNumberChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetDateOfBirthChangeBuilder setDateOfBirthChangeBuilder() {
        return com.commercetools.history.models.change.SetDateOfBirthChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetDefaultBillingAddressChangeBuilder setDefaultBillingAddressChangeBuilder() {
        return com.commercetools.history.models.change.SetDefaultBillingAddressChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetDefaultShippingAddressChangeBuilder setDefaultShippingAddressChangeBuilder() {
        return com.commercetools.history.models.change.SetDefaultShippingAddressChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetDeleteDaysAfterLastModificationChangeBuilder setDeleteDaysAfterLastModificationChangeBuilder() {
        return com.commercetools.history.models.change.SetDeleteDaysAfterLastModificationChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetDeliveryAddressChangeBuilder setDeliveryAddressChangeBuilder() {
        return com.commercetools.history.models.change.SetDeliveryAddressChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetDeliveryItemsChangeBuilder setDeliveryItemsChangeBuilder() {
        return com.commercetools.history.models.change.SetDeliveryItemsChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetDescriptionChangeBuilder setDescriptionChangeBuilder() {
        return com.commercetools.history.models.change.SetDescriptionChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetDiscountedPriceChangeBuilder setDiscountedPriceChangeBuilder() {
        return com.commercetools.history.models.change.SetDiscountedPriceChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetDistributionChannelsChangeBuilder setDistributionChannelsChangeBuilder() {
        return com.commercetools.history.models.change.SetDistributionChannelsChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetExpectedDeliveryChangeBuilder setExpectedDeliveryChangeBuilder() {
        return com.commercetools.history.models.change.SetExpectedDeliveryChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetExternalIdChangeBuilder setExternalIdChangeBuilder() {
        return com.commercetools.history.models.change.SetExternalIdChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetFirstNameChangeBuilder setFirstNameChangeBuilder() {
        return com.commercetools.history.models.change.SetFirstNameChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetGeoLocationChangeBuilder setGeoLocationChangeBuilder() {
        return com.commercetools.history.models.change.SetGeoLocationChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetImageLabelChangeBuilder setImageLabelChangeBuilder() {
        return com.commercetools.history.models.change.SetImageLabelChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetInputTipChangeBuilder setInputTipChangeBuilder() {
        return com.commercetools.history.models.change.SetInputTipChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetInterfaceIdChangeBuilder setInterfaceIdChangeBuilder() {
        return com.commercetools.history.models.change.SetInterfaceIdChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetIsValidChangeBuilder setIsValidChangeBuilder() {
        return com.commercetools.history.models.change.SetIsValidChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetKeyChangeBuilder setKeyChangeBuilder() {
        return com.commercetools.history.models.change.SetKeyChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetLanguagesChangeBuilder setLanguagesChangeBuilder() {
        return com.commercetools.history.models.change.SetLanguagesChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetLastNameChangeBuilder setLastNameChangeBuilder() {
        return com.commercetools.history.models.change.SetLastNameChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetLineItemDiscountedPriceChangeBuilder setLineItemDiscountedPriceChangeBuilder() {
        return com.commercetools.history.models.change.SetLineItemDiscountedPriceChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetLineItemDiscountedPricePerQuantityChangeBuilder setLineItemDiscountedPricePerQuantityChangeBuilder() {
        return com.commercetools.history.models.change.SetLineItemDiscountedPricePerQuantityChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetLineItemDistributionChannelChangeBuilder setLineItemDistributionChannelChangeBuilder() {
        return com.commercetools.history.models.change.SetLineItemDistributionChannelChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetLineItemPriceChangeBuilder setLineItemPriceChangeBuilder() {
        return com.commercetools.history.models.change.SetLineItemPriceChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetLineItemProductSlugChangeBuilder setLineItemProductSlugChangeBuilder() {
        return com.commercetools.history.models.change.SetLineItemProductSlugChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetLineItemShippingDetailsChangeBuilder setLineItemShippingDetailsChangeBuilder() {
        return com.commercetools.history.models.change.SetLineItemShippingDetailsChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetLineItemTaxAmountChangeBuilder setLineItemTaxAmountChangeBuilder() {
        return com.commercetools.history.models.change.SetLineItemTaxAmountChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetLineItemTaxRateChangeBuilder setLineItemTaxRateChangeBuilder() {
        return com.commercetools.history.models.change.SetLineItemTaxRateChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetLineItemTaxedPriceChangeBuilder setLineItemTaxedPriceChangeBuilder() {
        return com.commercetools.history.models.change.SetLineItemTaxedPriceChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetLineItemTotalPriceChangeBuilder setLineItemTotalPriceChangeBuilder() {
        return com.commercetools.history.models.change.SetLineItemTotalPriceChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetLocaleChangeBuilder setLocaleChangeBuilder() {
        return com.commercetools.history.models.change.SetLocaleChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetLocalizedDescriptionChangeBuilder setLocalizedDescriptionChangeBuilder() {
        return com.commercetools.history.models.change.SetLocalizedDescriptionChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetMaxApplicationsChangeBuilder setMaxApplicationsChangeBuilder() {
        return com.commercetools.history.models.change.SetMaxApplicationsChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetMaxApplicationsPerCustomerChangeBuilder setMaxApplicationsPerCustomerChangeBuilder() {
        return com.commercetools.history.models.change.SetMaxApplicationsPerCustomerChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetMetaDescriptionChangeBuilder setMetaDescriptionChangeBuilder() {
        return com.commercetools.history.models.change.SetMetaDescriptionChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetMetaKeywordsChangeBuilder setMetaKeywordsChangeBuilder() {
        return com.commercetools.history.models.change.SetMetaKeywordsChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetMetaTitleChangeBuilder setMetaTitleChangeBuilder() {
        return com.commercetools.history.models.change.SetMetaTitleChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetMethodInfoInterfaceChangeBuilder setMethodInfoInterfaceChangeBuilder() {
        return com.commercetools.history.models.change.SetMethodInfoInterfaceChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetMethodInfoMethodChangeBuilder setMethodInfoMethodChangeBuilder() {
        return com.commercetools.history.models.change.SetMethodInfoMethodChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetMethodInfoNameChangeBuilder setMethodInfoNameChangeBuilder() {
        return com.commercetools.history.models.change.SetMethodInfoNameChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetMiddleNameChangeBuilder setMiddleNameChangeBuilder() {
        return com.commercetools.history.models.change.SetMiddleNameChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetNameChangeBuilder setNameChangeBuilder() {
        return com.commercetools.history.models.change.SetNameChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetOrderLineItemCustomFieldChangeBuilder setOrderLineItemCustomFieldChangeBuilder() {
        return com.commercetools.history.models.change.SetOrderLineItemCustomFieldChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetOrderLineItemCustomTypeChangeBuilder setOrderLineItemCustomTypeChangeBuilder() {
        return com.commercetools.history.models.change.SetOrderLineItemCustomTypeChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetOrderNumberChangeBuilder setOrderNumberChangeBuilder() {
        return com.commercetools.history.models.change.SetOrderNumberChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetOrderTaxedPriceChangeBuilder setOrderTaxedPriceChangeBuilder() {
        return com.commercetools.history.models.change.SetOrderTaxedPriceChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetOrderTotalPriceChangeBuilder setOrderTotalPriceChangeBuilder() {
        return com.commercetools.history.models.change.SetOrderTotalPriceChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetOrderTotalTaxChangeBuilder setOrderTotalTaxChangeBuilder() {
        return com.commercetools.history.models.change.SetOrderTotalTaxChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetParcelItemsChangeBuilder setParcelItemsChangeBuilder() {
        return com.commercetools.history.models.change.SetParcelItemsChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetParcelMeasurementsChangeBuilder setParcelMeasurementsChangeBuilder() {
        return com.commercetools.history.models.change.SetParcelMeasurementsChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetParcelTrackingDataChangeBuilder setParcelTrackingDataChangeBuilder() {
        return com.commercetools.history.models.change.SetParcelTrackingDataChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetPricesChangeBuilder setPricesChangeBuilder() {
        return com.commercetools.history.models.change.SetPricesChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetProductPriceCustomFieldChangeBuilder setProductPriceCustomFieldChangeBuilder() {
        return com.commercetools.history.models.change.SetProductPriceCustomFieldChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetProductPriceCustomTypeChangeBuilder setProductPriceCustomTypeChangeBuilder() {
        return com.commercetools.history.models.change.SetProductPriceCustomTypeChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetProductVariantKeyChangeBuilder setProductVariantKeyChangeBuilder() {
        return com.commercetools.history.models.change.SetProductVariantKeyChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetPropertyChangeBuilder setPropertyChangeBuilder() {
        return com.commercetools.history.models.change.SetPropertyChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetRatingChangeBuilder setRatingChangeBuilder() {
        return com.commercetools.history.models.change.SetRatingChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetReservationsChangeBuilder setReservationsChangeBuilder() {
        return com.commercetools.history.models.change.SetReservationsChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetRestockableInDaysChangeBuilder setRestockableInDaysChangeBuilder() {
        return com.commercetools.history.models.change.SetRestockableInDaysChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetReturnPaymentStateChangeBuilder setReturnPaymentStateChangeBuilder() {
        return com.commercetools.history.models.change.SetReturnPaymentStateChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetReturnShipmentStateChangeBuilder setReturnShipmentStateChangeBuilder() {
        return com.commercetools.history.models.change.SetReturnShipmentStateChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetSalutationChangeBuilder setSalutationChangeBuilder() {
        return com.commercetools.history.models.change.SetSalutationChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetSearchKeywordsChangeBuilder setSearchKeywordsChangeBuilder() {
        return com.commercetools.history.models.change.SetSearchKeywordsChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetShippingAddressChangeBuilder setShippingAddressChangeBuilder() {
        return com.commercetools.history.models.change.SetShippingAddressChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetShippingInfoPriceChangeBuilder setShippingInfoPriceChangeBuilder() {
        return com.commercetools.history.models.change.SetShippingInfoPriceChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetShippingInfoTaxedPriceChangeBuilder setShippingInfoTaxedPriceChangeBuilder() {
        return com.commercetools.history.models.change.SetShippingInfoTaxedPriceChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetShippingMethodChangeBuilder setShippingMethodChangeBuilder() {
        return com.commercetools.history.models.change.SetShippingMethodChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetShippingMethodTaxAmountChangeBuilder setShippingMethodTaxAmountChangeBuilder() {
        return com.commercetools.history.models.change.SetShippingMethodTaxAmountChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetShippingMethodTaxRateChangeBuilder setShippingMethodTaxRateChangeBuilder() {
        return com.commercetools.history.models.change.SetShippingMethodTaxRateChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetShippingRateChangeBuilder setShippingRateChangeBuilder() {
        return com.commercetools.history.models.change.SetShippingRateChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetShippingRateInputChangeBuilder setShippingRateInputChangeBuilder() {
        return com.commercetools.history.models.change.SetShippingRateInputChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetShoppingListLineItemCustomFieldChangeBuilder setShoppingListLineItemCustomFieldChangeBuilder() {
        return com.commercetools.history.models.change.SetShoppingListLineItemCustomFieldChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetShoppingListLineItemCustomTypeChangeBuilder setShoppingListLineItemCustomTypeChangeBuilder() {
        return com.commercetools.history.models.change.SetShoppingListLineItemCustomTypeChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetSkuChangeBuilder setSkuChangeBuilder() {
        return com.commercetools.history.models.change.SetSkuChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetSlugChangeBuilder setSlugChangeBuilder() {
        return com.commercetools.history.models.change.SetSlugChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetStateRolesChangeBuilder setStateRolesChangeBuilder() {
        return com.commercetools.history.models.change.SetStateRolesChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetStatusInterfaceCodeChangeBuilder setStatusInterfaceCodeChangeBuilder() {
        return com.commercetools.history.models.change.SetStatusInterfaceCodeChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetStatusInterfaceTextChangeBuilder setStatusInterfaceTextChangeBuilder() {
        return com.commercetools.history.models.change.SetStatusInterfaceTextChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetStoreChangeBuilder setStoreChangeBuilder() {
        return com.commercetools.history.models.change.SetStoreChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetStoresChangeBuilder setStoresChangeBuilder() {
        return com.commercetools.history.models.change.SetStoresChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetSupplyChannelChangeBuilder setSupplyChannelChangeBuilder() {
        return com.commercetools.history.models.change.SetSupplyChannelChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetSupplyChannelsChangeBuilder setSupplyChannelsChangeBuilder() {
        return com.commercetools.history.models.change.SetSupplyChannelsChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetTargetChangeBuilder setTargetChangeBuilder() {
        return com.commercetools.history.models.change.SetTargetChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetTaxCategoryChangeBuilder setTaxCategoryChangeBuilder() {
        return com.commercetools.history.models.change.SetTaxCategoryChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetTextChangeBuilder setTextChangeBuilder() {
        return com.commercetools.history.models.change.SetTextChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetTextLineItemCustomFieldChangeBuilder setTextLineItemCustomFieldChangeBuilder() {
        return com.commercetools.history.models.change.SetTextLineItemCustomFieldChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetTextLineItemCustomTypeChangeBuilder setTextLineItemCustomTypeChangeBuilder() {
        return com.commercetools.history.models.change.SetTextLineItemCustomTypeChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetTextLineItemDescriptionChangeBuilder setTextLineItemDescriptionChangeBuilder() {
        return com.commercetools.history.models.change.SetTextLineItemDescriptionChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetTitleChangeBuilder setTitleChangeBuilder() {
        return com.commercetools.history.models.change.SetTitleChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetTransitionsChangeBuilder setTransitionsChangeBuilder() {
        return com.commercetools.history.models.change.SetTransitionsChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetValidFromAndUntilChangeBuilder setValidFromAndUntilChangeBuilder() {
        return com.commercetools.history.models.change.SetValidFromAndUntilChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetValidFromChangeBuilder setValidFromChangeBuilder() {
        return com.commercetools.history.models.change.SetValidFromChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetValidUntilChangeBuilder setValidUntilChangeBuilder() {
        return com.commercetools.history.models.change.SetValidUntilChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetValueChangeBuilder setValueChangeBuilder() {
        return com.commercetools.history.models.change.SetValueChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetVariantAvailabilityChangeBuilder setVariantAvailabilityChangeBuilder() {
        return com.commercetools.history.models.change.SetVariantAvailabilityChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.SetVatIdChangeBuilder setVatIdChangeBuilder() {
        return com.commercetools.history.models.change.SetVatIdChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.TransitionCustomLineItemStateChangeBuilder transitionCustomLineItemStateChangeBuilder() {
        return com.commercetools.history.models.change.TransitionCustomLineItemStateChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.TransitionLineItemStateChangeBuilder transitionLineItemStateChangeBuilder() {
        return com.commercetools.history.models.change.TransitionLineItemStateChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.TransitionStateChangeBuilder transitionStateChangeBuilder() {
        return com.commercetools.history.models.change.TransitionStateChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.UnknownChangeBuilder unknownChangeBuilder() {
        return com.commercetools.history.models.change.UnknownChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.UnpublishChangeBuilder unpublishChangeBuilder() {
        return com.commercetools.history.models.change.UnpublishChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.UpdateSyncInfoChangeBuilder updateSyncInfoChangeBuilder() {
        return com.commercetools.history.models.change.UpdateSyncInfoChangeBuilder.of();
    }

    public static com.commercetools.history.models.change.VerifyEmailChangeBuilder verifyEmailChangeBuilder() {
        return com.commercetools.history.models.change.VerifyEmailChangeBuilder.of();
    }

    default <T> T withChange(Function<Change, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<Change> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Change>() {
            @Override
            public String toString() {
                return "TypeReference<Change>";
            }
        };
    }
}
