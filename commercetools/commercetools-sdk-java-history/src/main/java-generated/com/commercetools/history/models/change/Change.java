
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Difference between the previous and next version of a resource represented by <code>previousValue</code> (omitted, for example, on creations) and <code>nextValue</code> of the associated change. A Change can also contain extra fields that provide further information.</p>
 *  <p>They are not identical to the actual update actions sent.</p>
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Change change = Change.addAddressChangeBuilder()
 *             change("{change}")
 *             previousValue(previousValueBuilder -> previousValueBuilder)
 *             nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonSubTypes({
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.AddAddressChangeImpl.class, name = AddAddressChange.ADD_ADDRESS_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.AddAssetChangeImpl.class, name = AddAssetChange.ADD_ASSET_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.AddAssociateChangeImpl.class, name = AddAssociateChange.ADD_ASSOCIATE_CHANGE),
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
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.AddProductChangeImpl.class, name = AddProductChange.ADD_PRODUCT_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.AddProductSelectionChangeImpl.class, name = AddProductSelectionChange.ADD_PRODUCT_SELECTION_CHANGE),
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
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeAssociateChangeImpl.class, name = ChangeAssociateChange.CHANGE_ASSOCIATE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeAssociateModeChangeImpl.class, name = ChangeAssociateModeChange.CHANGE_ASSOCIATE_MODE_CHANGE),
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
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeParentUnitChangeImpl.class, name = ChangeParentUnitChange.CHANGE_PARENT_UNIT_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangePaymentStateChangeImpl.class, name = ChangePaymentStateChange.CHANGE_PAYMENT_STATE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangePlainEnumValueLabelChangeImpl.class, name = ChangePlainEnumValueLabelChange.CHANGE_PLAIN_ENUM_VALUE_LABEL_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangePlainEnumValueOrderChangeImpl.class, name = ChangePlainEnumValueOrderChange.CHANGE_PLAIN_ENUM_VALUE_ORDER_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangePredicateChangeImpl.class, name = ChangePredicateChange.CHANGE_PREDICATE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangePriceChangeImpl.class, name = ChangePriceChange.CHANGE_PRICE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeProductSelectionActiveChangeImpl.class, name = ChangeProductSelectionActiveChange.CHANGE_PRODUCT_SELECTION_ACTIVE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeQuantityChangeImpl.class, name = ChangeQuantityChange.CHANGE_QUANTITY_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeQuoteRequestStateChangeImpl.class, name = ChangeQuoteRequestStateChange.CHANGE_QUOTE_REQUEST_STATE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeQuoteStateChangeImpl.class, name = ChangeQuoteStateChange.CHANGE_QUOTE_STATE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeRequiresDiscountCodeChangeImpl.class, name = ChangeRequiresDiscountCodeChange.CHANGE_REQUIRES_DISCOUNT_CODE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeReviewRatingStatisticsChangeImpl.class, name = ChangeReviewRatingStatisticsChange.CHANGE_REVIEW_RATING_STATISTICS_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeShipmentStateChangeImpl.class, name = ChangeShipmentStateChange.CHANGE_SHIPMENT_STATE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeShoppingListLineItemQuantityChangeImpl.class, name = ChangeShoppingListLineItemQuantityChange.CHANGE_SHOPPING_LIST_LINE_ITEM_QUANTITY_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeShoppingListLineItemsOrderChangeImpl.class, name = ChangeShoppingListLineItemsOrderChange.CHANGE_SHOPPING_LIST_LINE_ITEMS_ORDER_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeSlugChangeImpl.class, name = ChangeSlugChange.CHANGE_SLUG_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeSortOrderChangeImpl.class, name = ChangeSortOrderChange.CHANGE_SORT_ORDER_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeStackingModeChangeImpl.class, name = ChangeStackingModeChange.CHANGE_STACKING_MODE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeStagedQuoteStateChangeImpl.class, name = ChangeStagedQuoteStateChange.CHANGE_STAGED_QUOTE_STATE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeStateTypeChangeImpl.class, name = ChangeStateTypeChange.CHANGE_STATE_TYPE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.ChangeStatusChangeImpl.class, name = ChangeStatusChange.CHANGE_STATUS_CHANGE),
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
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.RemoveAssociateChangeImpl.class, name = RemoveAssociateChange.REMOVE_ASSOCIATE_CHANGE),
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
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.RemoveProductChangeImpl.class, name = RemoveProductChange.REMOVE_PRODUCT_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.RemoveProductSelectionChangeImpl.class, name = RemoveProductSelectionChange.REMOVE_PRODUCT_SELECTION_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.RemovePropertyChangeImpl.class, name = RemovePropertyChange.REMOVE_PROPERTY_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.RemoveShippingAddressIdChangeImpl.class, name = RemoveShippingAddressIdChange.REMOVE_SHIPPING_ADDRESS_ID_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.RemoveShoppingListLineItemChangeImpl.class, name = RemoveShoppingListLineItemChange.REMOVE_SHOPPING_LIST_LINE_ITEM_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.RemoveStateRolesChangeImpl.class, name = RemoveStateRolesChange.REMOVE_STATE_ROLES_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.RemoveTaxRateChangeImpl.class, name = RemoveTaxRateChange.REMOVE_TAX_RATE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.RemoveTextLineItemChangeImpl.class, name = RemoveTextLineItemChange.REMOVE_TEXT_LINE_ITEM_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.RemoveVariantChangeImpl.class, name = RemoveVariantChange.REMOVE_VARIANT_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.RequestQuoteRenegotiationChangeImpl.class, name = RequestQuoteRenegotiationChange.REQUEST_QUOTE_RENEGOTIATION_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetAddressChangeImpl.class, name = SetAddressChange.SET_ADDRESS_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetAddressCustomFieldChangeImpl.class, name = SetAddressCustomFieldChange.SET_ADDRESS_CUSTOM_FIELD_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetAddressCustomTypeChangeImpl.class, name = SetAddressCustomTypeChange.SET_ADDRESS_CUSTOM_TYPE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetAnonymousIdChangeImpl.class, name = SetAnonymousIdChange.SET_ANONYMOUS_ID_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetApplicationVersionChangeImpl.class, name = SetApplicationVersionChange.SET_APPLICATION_VERSION_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetAssetCustomFieldChangeImpl.class, name = SetAssetCustomFieldChange.SET_ASSET_CUSTOM_FIELD_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetAssetCustomTypeChangeImpl.class, name = SetAssetCustomTypeChange.SET_ASSET_CUSTOM_TYPE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetAssetDescriptionChangeImpl.class, name = SetAssetDescriptionChange.SET_ASSET_DESCRIPTION_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetAssetKeyChangeImpl.class, name = SetAssetKeyChange.SET_ASSET_KEY_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetAssetSourcesChangeImpl.class, name = SetAssetSourcesChange.SET_ASSET_SOURCES_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetAssetTagsChangeImpl.class, name = SetAssetTagsChange.SET_ASSET_TAGS_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetAttributeChangeImpl.class, name = SetAttributeChange.SET_ATTRIBUTE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetAuthenticationModeChangeImpl.class, name = SetAuthenticationModeChange.SET_AUTHENTICATION_MODE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetAuthorNameChangeImpl.class, name = SetAuthorNameChange.SET_AUTHOR_NAME_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetBillingAddressChangeImpl.class, name = SetBillingAddressChange.SET_BILLING_ADDRESS_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetCartPredicateChangeImpl.class, name = SetCartPredicateChange.SET_CART_PREDICATE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetCategoryOrderHintChangeImpl.class, name = SetCategoryOrderHintChange.SET_CATEGORY_ORDER_HINT_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetChannelRolesChangeImpl.class, name = SetChannelRolesChange.SET_CHANNEL_ROLES_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetCompanyNameChangeImpl.class, name = SetCompanyNameChange.SET_COMPANY_NAME_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetContactEmailChangeImpl.class, name = SetContactEmailChange.SET_CONTACT_EMAIL_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetCountriesChangeImpl.class, name = SetCountriesChange.SET_COUNTRIES_CHANGE),
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
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetLineItemDeactivatedAtChangeImpl.class, name = SetLineItemDeactivatedAtChange.SET_LINE_ITEM_DEACTIVATED_AT_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetLineItemDiscountedPriceChangeImpl.class, name = SetLineItemDiscountedPriceChange.SET_LINE_ITEM_DISCOUNTED_PRICE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetLineItemDiscountedPricePerQuantityChangeImpl.class, name = SetLineItemDiscountedPricePerQuantityChange.SET_LINE_ITEM_DISCOUNTED_PRICE_PER_QUANTITY_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetLineItemDistributionChannelChangeImpl.class, name = SetLineItemDistributionChannelChange.SET_LINE_ITEM_DISTRIBUTION_CHANNEL_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetLineItemPriceChangeImpl.class, name = SetLineItemPriceChange.SET_LINE_ITEM_PRICE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetLineItemProductKeyChangeImpl.class, name = SetLineItemProductKeyChange.SET_LINE_ITEM_PRODUCT_KEY_CHANGE),
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
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetProductCountChangeImpl.class, name = SetProductCountChange.SET_PRODUCT_COUNT_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetProductPriceCustomFieldChangeImpl.class, name = SetProductPriceCustomFieldChange.SET_PRODUCT_PRICE_CUSTOM_FIELD_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetProductPriceCustomTypeChangeImpl.class, name = SetProductPriceCustomTypeChange.SET_PRODUCT_PRICE_CUSTOM_TYPE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetProductSelectionsChangeImpl.class, name = SetProductSelectionsChange.SET_PRODUCT_SELECTIONS_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetProductVariantKeyChangeImpl.class, name = SetProductVariantKeyChange.SET_PRODUCT_VARIANT_KEY_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetPropertyChangeImpl.class, name = SetPropertyChange.SET_PROPERTY_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetPurchaseOrderNumberChangeImpl.class, name = SetPurchaseOrderNumberChange.SET_PURCHASE_ORDER_NUMBER_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetRatingChangeImpl.class, name = SetRatingChange.SET_RATING_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetReservationsChangeImpl.class, name = SetReservationsChange.SET_RESERVATIONS_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetRestockableInDaysChangeImpl.class, name = SetRestockableInDaysChange.SET_RESTOCKABLE_IN_DAYS_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetReturnPaymentStateChangeImpl.class, name = SetReturnPaymentStateChange.SET_RETURN_PAYMENT_STATE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetReturnShipmentStateChangeImpl.class, name = SetReturnShipmentStateChange.SET_RETURN_SHIPMENT_STATE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetSalutationChangeImpl.class, name = SetSalutationChange.SET_SALUTATION_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetSearchKeywordsChangeImpl.class, name = SetSearchKeywordsChange.SET_SEARCH_KEYWORDS_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetSellerCommentChangeImpl.class, name = SetSellerCommentChange.SET_SELLER_COMMENT_CHANGE),
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
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetStoreModeChangeImpl.class, name = SetStoreModeChange.SET_STORE_MODE_CHANGE),
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
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetValidToChangeImpl.class, name = SetValidToChange.SET_VALID_TO_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetValidUntilChangeImpl.class, name = SetValidUntilChange.SET_VALID_UNTIL_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetValueChangeImpl.class, name = SetValueChange.SET_VALUE_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetVariantAvailabilityChangeImpl.class, name = SetVariantAvailabilityChange.SET_VARIANT_AVAILABILITY_CHANGE),
        @JsonSubTypes.Type(value = com.commercetools.history.models.change.SetVariantSelectionChangeImpl.class, name = SetVariantSelectionChange.SET_VARIANT_SELECTION_CHANGE),
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface Change {

    /**
     *  <p>Unique discriminator value to reliably deserialize the data type.</p>
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
     *  <p>Type of change on a resource that is similar to the update action it relates to, where possible. It is not a unique identifier for the data structure, for example, the <code>setDescription</code> change can occur with a localized and non-localized representation.</p>
     *  <p>Records can be filtered by this value using the <code>changes</code> query parameter.</p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *  <p>Type of change on a resource that is similar to the update action it relates to, where possible. It is not a unique identifier for the data structure, for example, the <code>setDescription</code> change can occur with a localized and non-localized representation.</p>
     *  <p>Records can be filtered by this value using the <code>changes</code> query parameter.</p>
     * @param change value to be set
     */

    public void setChange(final String change);

    /**
     * factory method to create a deep copy of Change
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Change deepCopy(@Nullable final Change template) {
        if (template == null) {
            return null;
        }
        if (template instanceof com.commercetools.history.models.change.AddAddressChange) {
            return com.commercetools.history.models.change.AddAddressChange
                    .deepCopy((com.commercetools.history.models.change.AddAddressChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.AddAssetChange) {
            return com.commercetools.history.models.change.AddAssetChange
                    .deepCopy((com.commercetools.history.models.change.AddAssetChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.AddAssociateChange) {
            return com.commercetools.history.models.change.AddAssociateChange
                    .deepCopy((com.commercetools.history.models.change.AddAssociateChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.AddAttributeDefinitionChange) {
            return com.commercetools.history.models.change.AddAttributeDefinitionChange
                    .deepCopy((com.commercetools.history.models.change.AddAttributeDefinitionChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.AddBillingAddressIdChange) {
            return com.commercetools.history.models.change.AddBillingAddressIdChange
                    .deepCopy((com.commercetools.history.models.change.AddBillingAddressIdChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.AddChannelRolesChange) {
            return com.commercetools.history.models.change.AddChannelRolesChange
                    .deepCopy((com.commercetools.history.models.change.AddChannelRolesChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.AddCustomLineItemChange) {
            return com.commercetools.history.models.change.AddCustomLineItemChange
                    .deepCopy((com.commercetools.history.models.change.AddCustomLineItemChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.AddDeliveryChange) {
            return com.commercetools.history.models.change.AddDeliveryChange
                    .deepCopy((com.commercetools.history.models.change.AddDeliveryChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.AddDiscountCodeChange) {
            return com.commercetools.history.models.change.AddDiscountCodeChange
                    .deepCopy((com.commercetools.history.models.change.AddDiscountCodeChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.AddEnumValueChange) {
            return com.commercetools.history.models.change.AddEnumValueChange
                    .deepCopy((com.commercetools.history.models.change.AddEnumValueChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.AddExternalImageChange) {
            return com.commercetools.history.models.change.AddExternalImageChange
                    .deepCopy((com.commercetools.history.models.change.AddExternalImageChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.AddFieldDefinitionChange) {
            return com.commercetools.history.models.change.AddFieldDefinitionChange
                    .deepCopy((com.commercetools.history.models.change.AddFieldDefinitionChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.AddInterfaceInteractionChange) {
            return com.commercetools.history.models.change.AddInterfaceInteractionChange
                    .deepCopy((com.commercetools.history.models.change.AddInterfaceInteractionChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.AddItemShippingAddressesChange) {
            return com.commercetools.history.models.change.AddItemShippingAddressesChange
                    .deepCopy((com.commercetools.history.models.change.AddItemShippingAddressesChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.AddLocalizedEnumValueChange) {
            return com.commercetools.history.models.change.AddLocalizedEnumValueChange
                    .deepCopy((com.commercetools.history.models.change.AddLocalizedEnumValueChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.AddLocationChange) {
            return com.commercetools.history.models.change.AddLocationChange
                    .deepCopy((com.commercetools.history.models.change.AddLocationChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.AddOrderLineItemChange) {
            return com.commercetools.history.models.change.AddOrderLineItemChange
                    .deepCopy((com.commercetools.history.models.change.AddOrderLineItemChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.AddParcelToDeliveryChange) {
            return com.commercetools.history.models.change.AddParcelToDeliveryChange
                    .deepCopy((com.commercetools.history.models.change.AddParcelToDeliveryChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.AddPaymentChange) {
            return com.commercetools.history.models.change.AddPaymentChange
                    .deepCopy((com.commercetools.history.models.change.AddPaymentChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.AddPlainEnumValueChange) {
            return com.commercetools.history.models.change.AddPlainEnumValueChange
                    .deepCopy((com.commercetools.history.models.change.AddPlainEnumValueChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.AddPriceChange) {
            return com.commercetools.history.models.change.AddPriceChange
                    .deepCopy((com.commercetools.history.models.change.AddPriceChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.AddProductChange) {
            return com.commercetools.history.models.change.AddProductChange
                    .deepCopy((com.commercetools.history.models.change.AddProductChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.AddProductSelectionChange) {
            return com.commercetools.history.models.change.AddProductSelectionChange
                    .deepCopy((com.commercetools.history.models.change.AddProductSelectionChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.AddPropertyChange) {
            return com.commercetools.history.models.change.AddPropertyChange
                    .deepCopy((com.commercetools.history.models.change.AddPropertyChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.AddReturnInfoChange) {
            return com.commercetools.history.models.change.AddReturnInfoChange
                    .deepCopy((com.commercetools.history.models.change.AddReturnInfoChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.AddShippingAddressIdChange) {
            return com.commercetools.history.models.change.AddShippingAddressIdChange
                    .deepCopy((com.commercetools.history.models.change.AddShippingAddressIdChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.AddShoppingListLineItemChange) {
            return com.commercetools.history.models.change.AddShoppingListLineItemChange
                    .deepCopy((com.commercetools.history.models.change.AddShoppingListLineItemChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.AddStateRolesChange) {
            return com.commercetools.history.models.change.AddStateRolesChange
                    .deepCopy((com.commercetools.history.models.change.AddStateRolesChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.AddTaxRateChange) {
            return com.commercetools.history.models.change.AddTaxRateChange
                    .deepCopy((com.commercetools.history.models.change.AddTaxRateChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.AddTextLineItemChange) {
            return com.commercetools.history.models.change.AddTextLineItemChange
                    .deepCopy((com.commercetools.history.models.change.AddTextLineItemChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.AddToCategoryChange) {
            return com.commercetools.history.models.change.AddToCategoryChange
                    .deepCopy((com.commercetools.history.models.change.AddToCategoryChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.AddTransactionChange) {
            return com.commercetools.history.models.change.AddTransactionChange
                    .deepCopy((com.commercetools.history.models.change.AddTransactionChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.AddVariantChange) {
            return com.commercetools.history.models.change.AddVariantChange
                    .deepCopy((com.commercetools.history.models.change.AddVariantChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeAddressChange) {
            return com.commercetools.history.models.change.ChangeAddressChange
                    .deepCopy((com.commercetools.history.models.change.ChangeAddressChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeAmountAuthorizedChange) {
            return com.commercetools.history.models.change.ChangeAmountAuthorizedChange
                    .deepCopy((com.commercetools.history.models.change.ChangeAmountAuthorizedChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeAmountPlannedChange) {
            return com.commercetools.history.models.change.ChangeAmountPlannedChange
                    .deepCopy((com.commercetools.history.models.change.ChangeAmountPlannedChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeAssetNameChange) {
            return com.commercetools.history.models.change.ChangeAssetNameChange
                    .deepCopy((com.commercetools.history.models.change.ChangeAssetNameChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeAssetOrderChange) {
            return com.commercetools.history.models.change.ChangeAssetOrderChange
                    .deepCopy((com.commercetools.history.models.change.ChangeAssetOrderChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeAssociateChange) {
            return com.commercetools.history.models.change.ChangeAssociateChange
                    .deepCopy((com.commercetools.history.models.change.ChangeAssociateChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeAssociateModeChange) {
            return com.commercetools.history.models.change.ChangeAssociateModeChange
                    .deepCopy((com.commercetools.history.models.change.ChangeAssociateModeChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeAttributeConstraintChange) {
            return com.commercetools.history.models.change.ChangeAttributeConstraintChange
                    .deepCopy((com.commercetools.history.models.change.ChangeAttributeConstraintChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeAttributeOrderByNameChange) {
            return com.commercetools.history.models.change.ChangeAttributeOrderByNameChange
                    .deepCopy((com.commercetools.history.models.change.ChangeAttributeOrderByNameChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeCartDiscountsChange) {
            return com.commercetools.history.models.change.ChangeCartDiscountsChange
                    .deepCopy((com.commercetools.history.models.change.ChangeCartDiscountsChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeCartPredicateChange) {
            return com.commercetools.history.models.change.ChangeCartPredicateChange
                    .deepCopy((com.commercetools.history.models.change.ChangeCartPredicateChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeCustomLineItemQuantityChange) {
            return com.commercetools.history.models.change.ChangeCustomLineItemQuantityChange
                    .deepCopy((com.commercetools.history.models.change.ChangeCustomLineItemQuantityChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeDescriptionChange) {
            return com.commercetools.history.models.change.ChangeDescriptionChange
                    .deepCopy((com.commercetools.history.models.change.ChangeDescriptionChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeEmailChange) {
            return com.commercetools.history.models.change.ChangeEmailChange
                    .deepCopy((com.commercetools.history.models.change.ChangeEmailChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeEnumValueLabelChange) {
            return com.commercetools.history.models.change.ChangeEnumValueLabelChange
                    .deepCopy((com.commercetools.history.models.change.ChangeEnumValueLabelChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeEnumValueOrderChange) {
            return com.commercetools.history.models.change.ChangeEnumValueOrderChange
                    .deepCopy((com.commercetools.history.models.change.ChangeEnumValueOrderChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeFieldDefinitionOrderChange) {
            return com.commercetools.history.models.change.ChangeFieldDefinitionOrderChange
                    .deepCopy((com.commercetools.history.models.change.ChangeFieldDefinitionOrderChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeGroupsChange) {
            return com.commercetools.history.models.change.ChangeGroupsChange
                    .deepCopy((com.commercetools.history.models.change.ChangeGroupsChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeInitialChange) {
            return com.commercetools.history.models.change.ChangeInitialChange
                    .deepCopy((com.commercetools.history.models.change.ChangeInitialChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeInputHintChange) {
            return com.commercetools.history.models.change.ChangeInputHintChange
                    .deepCopy((com.commercetools.history.models.change.ChangeInputHintChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeIsActiveChange) {
            return com.commercetools.history.models.change.ChangeIsActiveChange
                    .deepCopy((com.commercetools.history.models.change.ChangeIsActiveChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeIsSearchableChange) {
            return com.commercetools.history.models.change.ChangeIsSearchableChange
                    .deepCopy((com.commercetools.history.models.change.ChangeIsSearchableChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeKeyChange) {
            return com.commercetools.history.models.change.ChangeKeyChange
                    .deepCopy((com.commercetools.history.models.change.ChangeKeyChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeLabelChange) {
            return com.commercetools.history.models.change.ChangeLabelChange
                    .deepCopy((com.commercetools.history.models.change.ChangeLabelChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeLineItemQuantityChange) {
            return com.commercetools.history.models.change.ChangeLineItemQuantityChange
                    .deepCopy((com.commercetools.history.models.change.ChangeLineItemQuantityChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeLocalizedDescriptionChange) {
            return com.commercetools.history.models.change.ChangeLocalizedDescriptionChange
                    .deepCopy((com.commercetools.history.models.change.ChangeLocalizedDescriptionChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeLocalizedEnumValueLabelChange) {
            return com.commercetools.history.models.change.ChangeLocalizedEnumValueLabelChange
                    .deepCopy((com.commercetools.history.models.change.ChangeLocalizedEnumValueLabelChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeLocalizedEnumValueOrderChange) {
            return com.commercetools.history.models.change.ChangeLocalizedEnumValueOrderChange
                    .deepCopy((com.commercetools.history.models.change.ChangeLocalizedEnumValueOrderChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeLocalizedNameChange) {
            return com.commercetools.history.models.change.ChangeLocalizedNameChange
                    .deepCopy((com.commercetools.history.models.change.ChangeLocalizedNameChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeMasterVariantChange) {
            return com.commercetools.history.models.change.ChangeMasterVariantChange
                    .deepCopy((com.commercetools.history.models.change.ChangeMasterVariantChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeNameChange) {
            return com.commercetools.history.models.change.ChangeNameChange
                    .deepCopy((com.commercetools.history.models.change.ChangeNameChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeOrderHintChange) {
            return com.commercetools.history.models.change.ChangeOrderHintChange
                    .deepCopy((com.commercetools.history.models.change.ChangeOrderHintChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeOrderStateChange) {
            return com.commercetools.history.models.change.ChangeOrderStateChange
                    .deepCopy((com.commercetools.history.models.change.ChangeOrderStateChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeParentChange) {
            return com.commercetools.history.models.change.ChangeParentChange
                    .deepCopy((com.commercetools.history.models.change.ChangeParentChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeParentUnitChange) {
            return com.commercetools.history.models.change.ChangeParentUnitChange
                    .deepCopy((com.commercetools.history.models.change.ChangeParentUnitChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangePaymentStateChange) {
            return com.commercetools.history.models.change.ChangePaymentStateChange
                    .deepCopy((com.commercetools.history.models.change.ChangePaymentStateChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangePlainEnumValueLabelChange) {
            return com.commercetools.history.models.change.ChangePlainEnumValueLabelChange
                    .deepCopy((com.commercetools.history.models.change.ChangePlainEnumValueLabelChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangePlainEnumValueOrderChange) {
            return com.commercetools.history.models.change.ChangePlainEnumValueOrderChange
                    .deepCopy((com.commercetools.history.models.change.ChangePlainEnumValueOrderChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangePredicateChange) {
            return com.commercetools.history.models.change.ChangePredicateChange
                    .deepCopy((com.commercetools.history.models.change.ChangePredicateChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangePriceChange) {
            return com.commercetools.history.models.change.ChangePriceChange
                    .deepCopy((com.commercetools.history.models.change.ChangePriceChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeProductSelectionActiveChange) {
            return com.commercetools.history.models.change.ChangeProductSelectionActiveChange
                    .deepCopy((com.commercetools.history.models.change.ChangeProductSelectionActiveChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeQuantityChange) {
            return com.commercetools.history.models.change.ChangeQuantityChange
                    .deepCopy((com.commercetools.history.models.change.ChangeQuantityChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeQuoteRequestStateChange) {
            return com.commercetools.history.models.change.ChangeQuoteRequestStateChange
                    .deepCopy((com.commercetools.history.models.change.ChangeQuoteRequestStateChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeQuoteStateChange) {
            return com.commercetools.history.models.change.ChangeQuoteStateChange
                    .deepCopy((com.commercetools.history.models.change.ChangeQuoteStateChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeRequiresDiscountCodeChange) {
            return com.commercetools.history.models.change.ChangeRequiresDiscountCodeChange
                    .deepCopy((com.commercetools.history.models.change.ChangeRequiresDiscountCodeChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeReviewRatingStatisticsChange) {
            return com.commercetools.history.models.change.ChangeReviewRatingStatisticsChange
                    .deepCopy((com.commercetools.history.models.change.ChangeReviewRatingStatisticsChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeShipmentStateChange) {
            return com.commercetools.history.models.change.ChangeShipmentStateChange
                    .deepCopy((com.commercetools.history.models.change.ChangeShipmentStateChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeShoppingListLineItemQuantityChange) {
            return com.commercetools.history.models.change.ChangeShoppingListLineItemQuantityChange.deepCopy(
                (com.commercetools.history.models.change.ChangeShoppingListLineItemQuantityChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeShoppingListLineItemsOrderChange) {
            return com.commercetools.history.models.change.ChangeShoppingListLineItemsOrderChange.deepCopy(
                (com.commercetools.history.models.change.ChangeShoppingListLineItemsOrderChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeSlugChange) {
            return com.commercetools.history.models.change.ChangeSlugChange
                    .deepCopy((com.commercetools.history.models.change.ChangeSlugChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeSortOrderChange) {
            return com.commercetools.history.models.change.ChangeSortOrderChange
                    .deepCopy((com.commercetools.history.models.change.ChangeSortOrderChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeStackingModeChange) {
            return com.commercetools.history.models.change.ChangeStackingModeChange
                    .deepCopy((com.commercetools.history.models.change.ChangeStackingModeChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeStagedQuoteStateChange) {
            return com.commercetools.history.models.change.ChangeStagedQuoteStateChange
                    .deepCopy((com.commercetools.history.models.change.ChangeStagedQuoteStateChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeStateTypeChange) {
            return com.commercetools.history.models.change.ChangeStateTypeChange
                    .deepCopy((com.commercetools.history.models.change.ChangeStateTypeChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeStatusChange) {
            return com.commercetools.history.models.change.ChangeStatusChange
                    .deepCopy((com.commercetools.history.models.change.ChangeStatusChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeTargetChange) {
            return com.commercetools.history.models.change.ChangeTargetChange
                    .deepCopy((com.commercetools.history.models.change.ChangeTargetChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeTaxCalculationModeChange) {
            return com.commercetools.history.models.change.ChangeTaxCalculationModeChange
                    .deepCopy((com.commercetools.history.models.change.ChangeTaxCalculationModeChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeTaxModeChange) {
            return com.commercetools.history.models.change.ChangeTaxModeChange
                    .deepCopy((com.commercetools.history.models.change.ChangeTaxModeChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeTaxRoundingModeChange) {
            return com.commercetools.history.models.change.ChangeTaxRoundingModeChange
                    .deepCopy((com.commercetools.history.models.change.ChangeTaxRoundingModeChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeTextLineItemNameChange) {
            return com.commercetools.history.models.change.ChangeTextLineItemNameChange
                    .deepCopy((com.commercetools.history.models.change.ChangeTextLineItemNameChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeTextLineItemQuantityChange) {
            return com.commercetools.history.models.change.ChangeTextLineItemQuantityChange
                    .deepCopy((com.commercetools.history.models.change.ChangeTextLineItemQuantityChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeTextLineItemsOrderChange) {
            return com.commercetools.history.models.change.ChangeTextLineItemsOrderChange
                    .deepCopy((com.commercetools.history.models.change.ChangeTextLineItemsOrderChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeTransactionInteractionIdChange) {
            return com.commercetools.history.models.change.ChangeTransactionInteractionIdChange
                    .deepCopy((com.commercetools.history.models.change.ChangeTransactionInteractionIdChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeTransactionStateChange) {
            return com.commercetools.history.models.change.ChangeTransactionStateChange
                    .deepCopy((com.commercetools.history.models.change.ChangeTransactionStateChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeTransactionTimestampChange) {
            return com.commercetools.history.models.change.ChangeTransactionTimestampChange
                    .deepCopy((com.commercetools.history.models.change.ChangeTransactionTimestampChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.ChangeValueChange) {
            return com.commercetools.history.models.change.ChangeValueChange
                    .deepCopy((com.commercetools.history.models.change.ChangeValueChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.MoveImageToPositionChange) {
            return com.commercetools.history.models.change.MoveImageToPositionChange
                    .deepCopy((com.commercetools.history.models.change.MoveImageToPositionChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.PublishChange) {
            return com.commercetools.history.models.change.PublishChange
                    .deepCopy((com.commercetools.history.models.change.PublishChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.RemoveAddressChange) {
            return com.commercetools.history.models.change.RemoveAddressChange
                    .deepCopy((com.commercetools.history.models.change.RemoveAddressChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.RemoveAssetChange) {
            return com.commercetools.history.models.change.RemoveAssetChange
                    .deepCopy((com.commercetools.history.models.change.RemoveAssetChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.RemoveAssociateChange) {
            return com.commercetools.history.models.change.RemoveAssociateChange
                    .deepCopy((com.commercetools.history.models.change.RemoveAssociateChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.RemoveAttributeDefinitionChange) {
            return com.commercetools.history.models.change.RemoveAttributeDefinitionChange
                    .deepCopy((com.commercetools.history.models.change.RemoveAttributeDefinitionChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.RemoveBillingAddressIdChange) {
            return com.commercetools.history.models.change.RemoveBillingAddressIdChange
                    .deepCopy((com.commercetools.history.models.change.RemoveBillingAddressIdChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.RemoveChannelRolesChange) {
            return com.commercetools.history.models.change.RemoveChannelRolesChange
                    .deepCopy((com.commercetools.history.models.change.RemoveChannelRolesChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.RemoveCustomLineItemChange) {
            return com.commercetools.history.models.change.RemoveCustomLineItemChange
                    .deepCopy((com.commercetools.history.models.change.RemoveCustomLineItemChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.RemoveDeliveryItemsChange) {
            return com.commercetools.history.models.change.RemoveDeliveryItemsChange
                    .deepCopy((com.commercetools.history.models.change.RemoveDeliveryItemsChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.RemoveDiscountCodeChange) {
            return com.commercetools.history.models.change.RemoveDiscountCodeChange
                    .deepCopy((com.commercetools.history.models.change.RemoveDiscountCodeChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.RemoveEnumValuesChange) {
            return com.commercetools.history.models.change.RemoveEnumValuesChange
                    .deepCopy((com.commercetools.history.models.change.RemoveEnumValuesChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.RemoveFieldDefinitionChange) {
            return com.commercetools.history.models.change.RemoveFieldDefinitionChange
                    .deepCopy((com.commercetools.history.models.change.RemoveFieldDefinitionChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.RemoveFromCategoryChange) {
            return com.commercetools.history.models.change.RemoveFromCategoryChange
                    .deepCopy((com.commercetools.history.models.change.RemoveFromCategoryChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.RemoveImageChange) {
            return com.commercetools.history.models.change.RemoveImageChange
                    .deepCopy((com.commercetools.history.models.change.RemoveImageChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.RemoveItemShippingAddressesChange) {
            return com.commercetools.history.models.change.RemoveItemShippingAddressesChange
                    .deepCopy((com.commercetools.history.models.change.RemoveItemShippingAddressesChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.RemoveLocalizedEnumValuesChange) {
            return com.commercetools.history.models.change.RemoveLocalizedEnumValuesChange
                    .deepCopy((com.commercetools.history.models.change.RemoveLocalizedEnumValuesChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.RemoveLocationChange) {
            return com.commercetools.history.models.change.RemoveLocationChange
                    .deepCopy((com.commercetools.history.models.change.RemoveLocationChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.RemoveOrderLineItemChange) {
            return com.commercetools.history.models.change.RemoveOrderLineItemChange
                    .deepCopy((com.commercetools.history.models.change.RemoveOrderLineItemChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.RemoveParcelFromDeliveryChange) {
            return com.commercetools.history.models.change.RemoveParcelFromDeliveryChange
                    .deepCopy((com.commercetools.history.models.change.RemoveParcelFromDeliveryChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.RemovePaymentChange) {
            return com.commercetools.history.models.change.RemovePaymentChange
                    .deepCopy((com.commercetools.history.models.change.RemovePaymentChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.RemovePriceChange) {
            return com.commercetools.history.models.change.RemovePriceChange
                    .deepCopy((com.commercetools.history.models.change.RemovePriceChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.RemoveProductChange) {
            return com.commercetools.history.models.change.RemoveProductChange
                    .deepCopy((com.commercetools.history.models.change.RemoveProductChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.RemoveProductSelectionChange) {
            return com.commercetools.history.models.change.RemoveProductSelectionChange
                    .deepCopy((com.commercetools.history.models.change.RemoveProductSelectionChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.RemovePropertyChange) {
            return com.commercetools.history.models.change.RemovePropertyChange
                    .deepCopy((com.commercetools.history.models.change.RemovePropertyChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.RemoveShippingAddressIdChange) {
            return com.commercetools.history.models.change.RemoveShippingAddressIdChange
                    .deepCopy((com.commercetools.history.models.change.RemoveShippingAddressIdChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.RemoveShoppingListLineItemChange) {
            return com.commercetools.history.models.change.RemoveShoppingListLineItemChange
                    .deepCopy((com.commercetools.history.models.change.RemoveShoppingListLineItemChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.RemoveStateRolesChange) {
            return com.commercetools.history.models.change.RemoveStateRolesChange
                    .deepCopy((com.commercetools.history.models.change.RemoveStateRolesChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.RemoveTaxRateChange) {
            return com.commercetools.history.models.change.RemoveTaxRateChange
                    .deepCopy((com.commercetools.history.models.change.RemoveTaxRateChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.RemoveTextLineItemChange) {
            return com.commercetools.history.models.change.RemoveTextLineItemChange
                    .deepCopy((com.commercetools.history.models.change.RemoveTextLineItemChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.RemoveVariantChange) {
            return com.commercetools.history.models.change.RemoveVariantChange
                    .deepCopy((com.commercetools.history.models.change.RemoveVariantChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.RequestQuoteRenegotiationChange) {
            return com.commercetools.history.models.change.RequestQuoteRenegotiationChange
                    .deepCopy((com.commercetools.history.models.change.RequestQuoteRenegotiationChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetAddressChange) {
            return com.commercetools.history.models.change.SetAddressChange
                    .deepCopy((com.commercetools.history.models.change.SetAddressChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetAddressCustomFieldChange) {
            return com.commercetools.history.models.change.SetAddressCustomFieldChange
                    .deepCopy((com.commercetools.history.models.change.SetAddressCustomFieldChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetAddressCustomTypeChange) {
            return com.commercetools.history.models.change.SetAddressCustomTypeChange
                    .deepCopy((com.commercetools.history.models.change.SetAddressCustomTypeChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetAnonymousIdChange) {
            return com.commercetools.history.models.change.SetAnonymousIdChange
                    .deepCopy((com.commercetools.history.models.change.SetAnonymousIdChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetApplicationVersionChange) {
            return com.commercetools.history.models.change.SetApplicationVersionChange
                    .deepCopy((com.commercetools.history.models.change.SetApplicationVersionChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetAssetCustomFieldChange) {
            return com.commercetools.history.models.change.SetAssetCustomFieldChange
                    .deepCopy((com.commercetools.history.models.change.SetAssetCustomFieldChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetAssetCustomTypeChange) {
            return com.commercetools.history.models.change.SetAssetCustomTypeChange
                    .deepCopy((com.commercetools.history.models.change.SetAssetCustomTypeChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetAssetDescriptionChange) {
            return com.commercetools.history.models.change.SetAssetDescriptionChange
                    .deepCopy((com.commercetools.history.models.change.SetAssetDescriptionChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetAssetKeyChange) {
            return com.commercetools.history.models.change.SetAssetKeyChange
                    .deepCopy((com.commercetools.history.models.change.SetAssetKeyChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetAssetSourcesChange) {
            return com.commercetools.history.models.change.SetAssetSourcesChange
                    .deepCopy((com.commercetools.history.models.change.SetAssetSourcesChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetAssetTagsChange) {
            return com.commercetools.history.models.change.SetAssetTagsChange
                    .deepCopy((com.commercetools.history.models.change.SetAssetTagsChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetAttributeChange) {
            return com.commercetools.history.models.change.SetAttributeChange
                    .deepCopy((com.commercetools.history.models.change.SetAttributeChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetAuthenticationModeChange) {
            return com.commercetools.history.models.change.SetAuthenticationModeChange
                    .deepCopy((com.commercetools.history.models.change.SetAuthenticationModeChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetAuthorNameChange) {
            return com.commercetools.history.models.change.SetAuthorNameChange
                    .deepCopy((com.commercetools.history.models.change.SetAuthorNameChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetBillingAddressChange) {
            return com.commercetools.history.models.change.SetBillingAddressChange
                    .deepCopy((com.commercetools.history.models.change.SetBillingAddressChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetCartPredicateChange) {
            return com.commercetools.history.models.change.SetCartPredicateChange
                    .deepCopy((com.commercetools.history.models.change.SetCartPredicateChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetCategoryOrderHintChange) {
            return com.commercetools.history.models.change.SetCategoryOrderHintChange
                    .deepCopy((com.commercetools.history.models.change.SetCategoryOrderHintChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetChannelRolesChange) {
            return com.commercetools.history.models.change.SetChannelRolesChange
                    .deepCopy((com.commercetools.history.models.change.SetChannelRolesChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetCompanyNameChange) {
            return com.commercetools.history.models.change.SetCompanyNameChange
                    .deepCopy((com.commercetools.history.models.change.SetCompanyNameChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetContactEmailChange) {
            return com.commercetools.history.models.change.SetContactEmailChange
                    .deepCopy((com.commercetools.history.models.change.SetContactEmailChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetCountriesChange) {
            return com.commercetools.history.models.change.SetCountriesChange
                    .deepCopy((com.commercetools.history.models.change.SetCountriesChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetCountryChange) {
            return com.commercetools.history.models.change.SetCountryChange
                    .deepCopy((com.commercetools.history.models.change.SetCountryChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetCustomFieldChange) {
            return com.commercetools.history.models.change.SetCustomFieldChange
                    .deepCopy((com.commercetools.history.models.change.SetCustomFieldChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetCustomLineItemCustomFieldChange) {
            return com.commercetools.history.models.change.SetCustomLineItemCustomFieldChange
                    .deepCopy((com.commercetools.history.models.change.SetCustomLineItemCustomFieldChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetCustomLineItemCustomTypeChange) {
            return com.commercetools.history.models.change.SetCustomLineItemCustomTypeChange
                    .deepCopy((com.commercetools.history.models.change.SetCustomLineItemCustomTypeChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetCustomLineItemMoneyChange) {
            return com.commercetools.history.models.change.SetCustomLineItemMoneyChange
                    .deepCopy((com.commercetools.history.models.change.SetCustomLineItemMoneyChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetCustomLineItemShippingDetailsChange) {
            return com.commercetools.history.models.change.SetCustomLineItemShippingDetailsChange.deepCopy(
                (com.commercetools.history.models.change.SetCustomLineItemShippingDetailsChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetCustomLineItemTaxAmountChange) {
            return com.commercetools.history.models.change.SetCustomLineItemTaxAmountChange
                    .deepCopy((com.commercetools.history.models.change.SetCustomLineItemTaxAmountChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetCustomLineItemTaxCategoryChange) {
            return com.commercetools.history.models.change.SetCustomLineItemTaxCategoryChange
                    .deepCopy((com.commercetools.history.models.change.SetCustomLineItemTaxCategoryChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetCustomLineItemTaxRateChange) {
            return com.commercetools.history.models.change.SetCustomLineItemTaxRateChange
                    .deepCopy((com.commercetools.history.models.change.SetCustomLineItemTaxRateChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetCustomLineItemTaxedPriceChange) {
            return com.commercetools.history.models.change.SetCustomLineItemTaxedPriceChange
                    .deepCopy((com.commercetools.history.models.change.SetCustomLineItemTaxedPriceChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetCustomLineItemTotalPriceChange) {
            return com.commercetools.history.models.change.SetCustomLineItemTotalPriceChange
                    .deepCopy((com.commercetools.history.models.change.SetCustomLineItemTotalPriceChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetCustomShippingMethodChange) {
            return com.commercetools.history.models.change.SetCustomShippingMethodChange
                    .deepCopy((com.commercetools.history.models.change.SetCustomShippingMethodChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetCustomTypeChange) {
            return com.commercetools.history.models.change.SetCustomTypeChange
                    .deepCopy((com.commercetools.history.models.change.SetCustomTypeChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetCustomerChange) {
            return com.commercetools.history.models.change.SetCustomerChange
                    .deepCopy((com.commercetools.history.models.change.SetCustomerChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetCustomerEmailChange) {
            return com.commercetools.history.models.change.SetCustomerEmailChange
                    .deepCopy((com.commercetools.history.models.change.SetCustomerEmailChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetCustomerGroupChange) {
            return com.commercetools.history.models.change.SetCustomerGroupChange
                    .deepCopy((com.commercetools.history.models.change.SetCustomerGroupChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetCustomerIdChange) {
            return com.commercetools.history.models.change.SetCustomerIdChange
                    .deepCopy((com.commercetools.history.models.change.SetCustomerIdChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetCustomerNumberChange) {
            return com.commercetools.history.models.change.SetCustomerNumberChange
                    .deepCopy((com.commercetools.history.models.change.SetCustomerNumberChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetDateOfBirthChange) {
            return com.commercetools.history.models.change.SetDateOfBirthChange
                    .deepCopy((com.commercetools.history.models.change.SetDateOfBirthChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetDefaultBillingAddressChange) {
            return com.commercetools.history.models.change.SetDefaultBillingAddressChange
                    .deepCopy((com.commercetools.history.models.change.SetDefaultBillingAddressChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetDefaultShippingAddressChange) {
            return com.commercetools.history.models.change.SetDefaultShippingAddressChange
                    .deepCopy((com.commercetools.history.models.change.SetDefaultShippingAddressChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetDeleteDaysAfterLastModificationChange) {
            return com.commercetools.history.models.change.SetDeleteDaysAfterLastModificationChange.deepCopy(
                (com.commercetools.history.models.change.SetDeleteDaysAfterLastModificationChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetDeliveryAddressChange) {
            return com.commercetools.history.models.change.SetDeliveryAddressChange
                    .deepCopy((com.commercetools.history.models.change.SetDeliveryAddressChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetDeliveryItemsChange) {
            return com.commercetools.history.models.change.SetDeliveryItemsChange
                    .deepCopy((com.commercetools.history.models.change.SetDeliveryItemsChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetDescriptionChange) {
            return com.commercetools.history.models.change.SetDescriptionChange
                    .deepCopy((com.commercetools.history.models.change.SetDescriptionChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetDiscountedPriceChange) {
            return com.commercetools.history.models.change.SetDiscountedPriceChange
                    .deepCopy((com.commercetools.history.models.change.SetDiscountedPriceChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetDistributionChannelsChange) {
            return com.commercetools.history.models.change.SetDistributionChannelsChange
                    .deepCopy((com.commercetools.history.models.change.SetDistributionChannelsChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetExpectedDeliveryChange) {
            return com.commercetools.history.models.change.SetExpectedDeliveryChange
                    .deepCopy((com.commercetools.history.models.change.SetExpectedDeliveryChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetExternalIdChange) {
            return com.commercetools.history.models.change.SetExternalIdChange
                    .deepCopy((com.commercetools.history.models.change.SetExternalIdChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetFirstNameChange) {
            return com.commercetools.history.models.change.SetFirstNameChange
                    .deepCopy((com.commercetools.history.models.change.SetFirstNameChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetGeoLocationChange) {
            return com.commercetools.history.models.change.SetGeoLocationChange
                    .deepCopy((com.commercetools.history.models.change.SetGeoLocationChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetImageLabelChange) {
            return com.commercetools.history.models.change.SetImageLabelChange
                    .deepCopy((com.commercetools.history.models.change.SetImageLabelChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetInputTipChange) {
            return com.commercetools.history.models.change.SetInputTipChange
                    .deepCopy((com.commercetools.history.models.change.SetInputTipChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetInterfaceIdChange) {
            return com.commercetools.history.models.change.SetInterfaceIdChange
                    .deepCopy((com.commercetools.history.models.change.SetInterfaceIdChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetIsValidChange) {
            return com.commercetools.history.models.change.SetIsValidChange
                    .deepCopy((com.commercetools.history.models.change.SetIsValidChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetKeyChange) {
            return com.commercetools.history.models.change.SetKeyChange
                    .deepCopy((com.commercetools.history.models.change.SetKeyChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetLanguagesChange) {
            return com.commercetools.history.models.change.SetLanguagesChange
                    .deepCopy((com.commercetools.history.models.change.SetLanguagesChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetLastNameChange) {
            return com.commercetools.history.models.change.SetLastNameChange
                    .deepCopy((com.commercetools.history.models.change.SetLastNameChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetLineItemDeactivatedAtChange) {
            return com.commercetools.history.models.change.SetLineItemDeactivatedAtChange
                    .deepCopy((com.commercetools.history.models.change.SetLineItemDeactivatedAtChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetLineItemDiscountedPriceChange) {
            return com.commercetools.history.models.change.SetLineItemDiscountedPriceChange
                    .deepCopy((com.commercetools.history.models.change.SetLineItemDiscountedPriceChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetLineItemDiscountedPricePerQuantityChange) {
            return com.commercetools.history.models.change.SetLineItemDiscountedPricePerQuantityChange.deepCopy(
                (com.commercetools.history.models.change.SetLineItemDiscountedPricePerQuantityChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetLineItemDistributionChannelChange) {
            return com.commercetools.history.models.change.SetLineItemDistributionChannelChange
                    .deepCopy((com.commercetools.history.models.change.SetLineItemDistributionChannelChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetLineItemPriceChange) {
            return com.commercetools.history.models.change.SetLineItemPriceChange
                    .deepCopy((com.commercetools.history.models.change.SetLineItemPriceChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetLineItemProductKeyChange) {
            return com.commercetools.history.models.change.SetLineItemProductKeyChange
                    .deepCopy((com.commercetools.history.models.change.SetLineItemProductKeyChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetLineItemProductSlugChange) {
            return com.commercetools.history.models.change.SetLineItemProductSlugChange
                    .deepCopy((com.commercetools.history.models.change.SetLineItemProductSlugChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetLineItemShippingDetailsChange) {
            return com.commercetools.history.models.change.SetLineItemShippingDetailsChange
                    .deepCopy((com.commercetools.history.models.change.SetLineItemShippingDetailsChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetLineItemTaxAmountChange) {
            return com.commercetools.history.models.change.SetLineItemTaxAmountChange
                    .deepCopy((com.commercetools.history.models.change.SetLineItemTaxAmountChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetLineItemTaxRateChange) {
            return com.commercetools.history.models.change.SetLineItemTaxRateChange
                    .deepCopy((com.commercetools.history.models.change.SetLineItemTaxRateChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetLineItemTaxedPriceChange) {
            return com.commercetools.history.models.change.SetLineItemTaxedPriceChange
                    .deepCopy((com.commercetools.history.models.change.SetLineItemTaxedPriceChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetLineItemTotalPriceChange) {
            return com.commercetools.history.models.change.SetLineItemTotalPriceChange
                    .deepCopy((com.commercetools.history.models.change.SetLineItemTotalPriceChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetLocaleChange) {
            return com.commercetools.history.models.change.SetLocaleChange
                    .deepCopy((com.commercetools.history.models.change.SetLocaleChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetLocalizedDescriptionChange) {
            return com.commercetools.history.models.change.SetLocalizedDescriptionChange
                    .deepCopy((com.commercetools.history.models.change.SetLocalizedDescriptionChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetMaxApplicationsChange) {
            return com.commercetools.history.models.change.SetMaxApplicationsChange
                    .deepCopy((com.commercetools.history.models.change.SetMaxApplicationsChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetMaxApplicationsPerCustomerChange) {
            return com.commercetools.history.models.change.SetMaxApplicationsPerCustomerChange
                    .deepCopy((com.commercetools.history.models.change.SetMaxApplicationsPerCustomerChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetMetaDescriptionChange) {
            return com.commercetools.history.models.change.SetMetaDescriptionChange
                    .deepCopy((com.commercetools.history.models.change.SetMetaDescriptionChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetMetaKeywordsChange) {
            return com.commercetools.history.models.change.SetMetaKeywordsChange
                    .deepCopy((com.commercetools.history.models.change.SetMetaKeywordsChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetMetaTitleChange) {
            return com.commercetools.history.models.change.SetMetaTitleChange
                    .deepCopy((com.commercetools.history.models.change.SetMetaTitleChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetMethodInfoInterfaceChange) {
            return com.commercetools.history.models.change.SetMethodInfoInterfaceChange
                    .deepCopy((com.commercetools.history.models.change.SetMethodInfoInterfaceChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetMethodInfoMethodChange) {
            return com.commercetools.history.models.change.SetMethodInfoMethodChange
                    .deepCopy((com.commercetools.history.models.change.SetMethodInfoMethodChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetMethodInfoNameChange) {
            return com.commercetools.history.models.change.SetMethodInfoNameChange
                    .deepCopy((com.commercetools.history.models.change.SetMethodInfoNameChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetMiddleNameChange) {
            return com.commercetools.history.models.change.SetMiddleNameChange
                    .deepCopy((com.commercetools.history.models.change.SetMiddleNameChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetNameChange) {
            return com.commercetools.history.models.change.SetNameChange
                    .deepCopy((com.commercetools.history.models.change.SetNameChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetOrderLineItemCustomFieldChange) {
            return com.commercetools.history.models.change.SetOrderLineItemCustomFieldChange
                    .deepCopy((com.commercetools.history.models.change.SetOrderLineItemCustomFieldChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetOrderLineItemCustomTypeChange) {
            return com.commercetools.history.models.change.SetOrderLineItemCustomTypeChange
                    .deepCopy((com.commercetools.history.models.change.SetOrderLineItemCustomTypeChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetOrderNumberChange) {
            return com.commercetools.history.models.change.SetOrderNumberChange
                    .deepCopy((com.commercetools.history.models.change.SetOrderNumberChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetOrderTaxedPriceChange) {
            return com.commercetools.history.models.change.SetOrderTaxedPriceChange
                    .deepCopy((com.commercetools.history.models.change.SetOrderTaxedPriceChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetOrderTotalPriceChange) {
            return com.commercetools.history.models.change.SetOrderTotalPriceChange
                    .deepCopy((com.commercetools.history.models.change.SetOrderTotalPriceChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetOrderTotalTaxChange) {
            return com.commercetools.history.models.change.SetOrderTotalTaxChange
                    .deepCopy((com.commercetools.history.models.change.SetOrderTotalTaxChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetParcelItemsChange) {
            return com.commercetools.history.models.change.SetParcelItemsChange
                    .deepCopy((com.commercetools.history.models.change.SetParcelItemsChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetParcelMeasurementsChange) {
            return com.commercetools.history.models.change.SetParcelMeasurementsChange
                    .deepCopy((com.commercetools.history.models.change.SetParcelMeasurementsChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetParcelTrackingDataChange) {
            return com.commercetools.history.models.change.SetParcelTrackingDataChange
                    .deepCopy((com.commercetools.history.models.change.SetParcelTrackingDataChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetPricesChange) {
            return com.commercetools.history.models.change.SetPricesChange
                    .deepCopy((com.commercetools.history.models.change.SetPricesChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetProductCountChange) {
            return com.commercetools.history.models.change.SetProductCountChange
                    .deepCopy((com.commercetools.history.models.change.SetProductCountChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetProductPriceCustomFieldChange) {
            return com.commercetools.history.models.change.SetProductPriceCustomFieldChange
                    .deepCopy((com.commercetools.history.models.change.SetProductPriceCustomFieldChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetProductPriceCustomTypeChange) {
            return com.commercetools.history.models.change.SetProductPriceCustomTypeChange
                    .deepCopy((com.commercetools.history.models.change.SetProductPriceCustomTypeChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetProductSelectionsChange) {
            return com.commercetools.history.models.change.SetProductSelectionsChange
                    .deepCopy((com.commercetools.history.models.change.SetProductSelectionsChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetProductVariantKeyChange) {
            return com.commercetools.history.models.change.SetProductVariantKeyChange
                    .deepCopy((com.commercetools.history.models.change.SetProductVariantKeyChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetPropertyChange) {
            return com.commercetools.history.models.change.SetPropertyChange
                    .deepCopy((com.commercetools.history.models.change.SetPropertyChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetPurchaseOrderNumberChange) {
            return com.commercetools.history.models.change.SetPurchaseOrderNumberChange
                    .deepCopy((com.commercetools.history.models.change.SetPurchaseOrderNumberChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetRatingChange) {
            return com.commercetools.history.models.change.SetRatingChange
                    .deepCopy((com.commercetools.history.models.change.SetRatingChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetReservationsChange) {
            return com.commercetools.history.models.change.SetReservationsChange
                    .deepCopy((com.commercetools.history.models.change.SetReservationsChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetRestockableInDaysChange) {
            return com.commercetools.history.models.change.SetRestockableInDaysChange
                    .deepCopy((com.commercetools.history.models.change.SetRestockableInDaysChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetReturnPaymentStateChange) {
            return com.commercetools.history.models.change.SetReturnPaymentStateChange
                    .deepCopy((com.commercetools.history.models.change.SetReturnPaymentStateChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetReturnShipmentStateChange) {
            return com.commercetools.history.models.change.SetReturnShipmentStateChange
                    .deepCopy((com.commercetools.history.models.change.SetReturnShipmentStateChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetSalutationChange) {
            return com.commercetools.history.models.change.SetSalutationChange
                    .deepCopy((com.commercetools.history.models.change.SetSalutationChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetSearchKeywordsChange) {
            return com.commercetools.history.models.change.SetSearchKeywordsChange
                    .deepCopy((com.commercetools.history.models.change.SetSearchKeywordsChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetSellerCommentChange) {
            return com.commercetools.history.models.change.SetSellerCommentChange
                    .deepCopy((com.commercetools.history.models.change.SetSellerCommentChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetShippingAddressChange) {
            return com.commercetools.history.models.change.SetShippingAddressChange
                    .deepCopy((com.commercetools.history.models.change.SetShippingAddressChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetShippingInfoPriceChange) {
            return com.commercetools.history.models.change.SetShippingInfoPriceChange
                    .deepCopy((com.commercetools.history.models.change.SetShippingInfoPriceChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetShippingInfoTaxedPriceChange) {
            return com.commercetools.history.models.change.SetShippingInfoTaxedPriceChange
                    .deepCopy((com.commercetools.history.models.change.SetShippingInfoTaxedPriceChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetShippingMethodChange) {
            return com.commercetools.history.models.change.SetShippingMethodChange
                    .deepCopy((com.commercetools.history.models.change.SetShippingMethodChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetShippingMethodTaxAmountChange) {
            return com.commercetools.history.models.change.SetShippingMethodTaxAmountChange
                    .deepCopy((com.commercetools.history.models.change.SetShippingMethodTaxAmountChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetShippingMethodTaxRateChange) {
            return com.commercetools.history.models.change.SetShippingMethodTaxRateChange
                    .deepCopy((com.commercetools.history.models.change.SetShippingMethodTaxRateChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetShippingRateChange) {
            return com.commercetools.history.models.change.SetShippingRateChange
                    .deepCopy((com.commercetools.history.models.change.SetShippingRateChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetShippingRateInputChange) {
            return com.commercetools.history.models.change.SetShippingRateInputChange
                    .deepCopy((com.commercetools.history.models.change.SetShippingRateInputChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetShoppingListLineItemCustomFieldChange) {
            return com.commercetools.history.models.change.SetShoppingListLineItemCustomFieldChange.deepCopy(
                (com.commercetools.history.models.change.SetShoppingListLineItemCustomFieldChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetShoppingListLineItemCustomTypeChange) {
            return com.commercetools.history.models.change.SetShoppingListLineItemCustomTypeChange.deepCopy(
                (com.commercetools.history.models.change.SetShoppingListLineItemCustomTypeChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetSkuChange) {
            return com.commercetools.history.models.change.SetSkuChange
                    .deepCopy((com.commercetools.history.models.change.SetSkuChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetSlugChange) {
            return com.commercetools.history.models.change.SetSlugChange
                    .deepCopy((com.commercetools.history.models.change.SetSlugChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetStateRolesChange) {
            return com.commercetools.history.models.change.SetStateRolesChange
                    .deepCopy((com.commercetools.history.models.change.SetStateRolesChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetStatusInterfaceCodeChange) {
            return com.commercetools.history.models.change.SetStatusInterfaceCodeChange
                    .deepCopy((com.commercetools.history.models.change.SetStatusInterfaceCodeChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetStatusInterfaceTextChange) {
            return com.commercetools.history.models.change.SetStatusInterfaceTextChange
                    .deepCopy((com.commercetools.history.models.change.SetStatusInterfaceTextChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetStoreChange) {
            return com.commercetools.history.models.change.SetStoreChange
                    .deepCopy((com.commercetools.history.models.change.SetStoreChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetStoreModeChange) {
            return com.commercetools.history.models.change.SetStoreModeChange
                    .deepCopy((com.commercetools.history.models.change.SetStoreModeChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetStoresChange) {
            return com.commercetools.history.models.change.SetStoresChange
                    .deepCopy((com.commercetools.history.models.change.SetStoresChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetSupplyChannelChange) {
            return com.commercetools.history.models.change.SetSupplyChannelChange
                    .deepCopy((com.commercetools.history.models.change.SetSupplyChannelChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetSupplyChannelsChange) {
            return com.commercetools.history.models.change.SetSupplyChannelsChange
                    .deepCopy((com.commercetools.history.models.change.SetSupplyChannelsChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetTargetChange) {
            return com.commercetools.history.models.change.SetTargetChange
                    .deepCopy((com.commercetools.history.models.change.SetTargetChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetTaxCategoryChange) {
            return com.commercetools.history.models.change.SetTaxCategoryChange
                    .deepCopy((com.commercetools.history.models.change.SetTaxCategoryChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetTextChange) {
            return com.commercetools.history.models.change.SetTextChange
                    .deepCopy((com.commercetools.history.models.change.SetTextChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetTextLineItemCustomFieldChange) {
            return com.commercetools.history.models.change.SetTextLineItemCustomFieldChange
                    .deepCopy((com.commercetools.history.models.change.SetTextLineItemCustomFieldChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetTextLineItemCustomTypeChange) {
            return com.commercetools.history.models.change.SetTextLineItemCustomTypeChange
                    .deepCopy((com.commercetools.history.models.change.SetTextLineItemCustomTypeChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetTextLineItemDescriptionChange) {
            return com.commercetools.history.models.change.SetTextLineItemDescriptionChange
                    .deepCopy((com.commercetools.history.models.change.SetTextLineItemDescriptionChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetTitleChange) {
            return com.commercetools.history.models.change.SetTitleChange
                    .deepCopy((com.commercetools.history.models.change.SetTitleChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetTransitionsChange) {
            return com.commercetools.history.models.change.SetTransitionsChange
                    .deepCopy((com.commercetools.history.models.change.SetTransitionsChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetValidFromAndUntilChange) {
            return com.commercetools.history.models.change.SetValidFromAndUntilChange
                    .deepCopy((com.commercetools.history.models.change.SetValidFromAndUntilChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetValidFromChange) {
            return com.commercetools.history.models.change.SetValidFromChange
                    .deepCopy((com.commercetools.history.models.change.SetValidFromChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetValidToChange) {
            return com.commercetools.history.models.change.SetValidToChange
                    .deepCopy((com.commercetools.history.models.change.SetValidToChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetValidUntilChange) {
            return com.commercetools.history.models.change.SetValidUntilChange
                    .deepCopy((com.commercetools.history.models.change.SetValidUntilChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetValueChange) {
            return com.commercetools.history.models.change.SetValueChange
                    .deepCopy((com.commercetools.history.models.change.SetValueChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetVariantAvailabilityChange) {
            return com.commercetools.history.models.change.SetVariantAvailabilityChange
                    .deepCopy((com.commercetools.history.models.change.SetVariantAvailabilityChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetVariantSelectionChange) {
            return com.commercetools.history.models.change.SetVariantSelectionChange
                    .deepCopy((com.commercetools.history.models.change.SetVariantSelectionChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.SetVatIdChange) {
            return com.commercetools.history.models.change.SetVatIdChange
                    .deepCopy((com.commercetools.history.models.change.SetVatIdChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.TransitionCustomLineItemStateChange) {
            return com.commercetools.history.models.change.TransitionCustomLineItemStateChange
                    .deepCopy((com.commercetools.history.models.change.TransitionCustomLineItemStateChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.TransitionLineItemStateChange) {
            return com.commercetools.history.models.change.TransitionLineItemStateChange
                    .deepCopy((com.commercetools.history.models.change.TransitionLineItemStateChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.TransitionStateChange) {
            return com.commercetools.history.models.change.TransitionStateChange
                    .deepCopy((com.commercetools.history.models.change.TransitionStateChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.UnknownChange) {
            return com.commercetools.history.models.change.UnknownChange
                    .deepCopy((com.commercetools.history.models.change.UnknownChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.UnpublishChange) {
            return com.commercetools.history.models.change.UnpublishChange
                    .deepCopy((com.commercetools.history.models.change.UnpublishChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.UpdateSyncInfoChange) {
            return com.commercetools.history.models.change.UpdateSyncInfoChange
                    .deepCopy((com.commercetools.history.models.change.UpdateSyncInfoChange) template);
        }
        if (template instanceof com.commercetools.history.models.change.VerifyEmailChange) {
            return com.commercetools.history.models.change.VerifyEmailChange
                    .deepCopy((com.commercetools.history.models.change.VerifyEmailChange) template);
        }
        ChangeImpl instance = new ChangeImpl();
        instance.setChange(template.getChange());
        return instance;
    }

    /**
     * builder for addAddressChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.AddAddressChangeBuilder addAddressChangeBuilder() {
        return com.commercetools.history.models.change.AddAddressChangeBuilder.of();
    }

    /**
     * builder for addAssetChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.AddAssetChangeBuilder addAssetChangeBuilder() {
        return com.commercetools.history.models.change.AddAssetChangeBuilder.of();
    }

    /**
     * builder for addAssociateChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.AddAssociateChangeBuilder addAssociateChangeBuilder() {
        return com.commercetools.history.models.change.AddAssociateChangeBuilder.of();
    }

    /**
     * builder for addAttributeDefinitionChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.AddAttributeDefinitionChangeBuilder addAttributeDefinitionChangeBuilder() {
        return com.commercetools.history.models.change.AddAttributeDefinitionChangeBuilder.of();
    }

    /**
     * builder for addBillingAddressIdChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.AddBillingAddressIdChangeBuilder addBillingAddressIdChangeBuilder() {
        return com.commercetools.history.models.change.AddBillingAddressIdChangeBuilder.of();
    }

    /**
     * builder for addChannelRolesChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.AddChannelRolesChangeBuilder addChannelRolesChangeBuilder() {
        return com.commercetools.history.models.change.AddChannelRolesChangeBuilder.of();
    }

    /**
     * builder for addCustomLineItemChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.AddCustomLineItemChangeBuilder addCustomLineItemChangeBuilder() {
        return com.commercetools.history.models.change.AddCustomLineItemChangeBuilder.of();
    }

    /**
     * builder for addDeliveryChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.AddDeliveryChangeBuilder addDeliveryChangeBuilder() {
        return com.commercetools.history.models.change.AddDeliveryChangeBuilder.of();
    }

    /**
     * builder for addDiscountCodeChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.AddDiscountCodeChangeBuilder addDiscountCodeChangeBuilder() {
        return com.commercetools.history.models.change.AddDiscountCodeChangeBuilder.of();
    }

    /**
     * builder for addEnumValueChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.AddEnumValueChangeBuilder addEnumValueChangeBuilder() {
        return com.commercetools.history.models.change.AddEnumValueChangeBuilder.of();
    }

    /**
     * builder for addExternalImageChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.AddExternalImageChangeBuilder addExternalImageChangeBuilder() {
        return com.commercetools.history.models.change.AddExternalImageChangeBuilder.of();
    }

    /**
     * builder for addFieldDefinitionChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.AddFieldDefinitionChangeBuilder addFieldDefinitionChangeBuilder() {
        return com.commercetools.history.models.change.AddFieldDefinitionChangeBuilder.of();
    }

    /**
     * builder for addInterfaceInteractionChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.AddInterfaceInteractionChangeBuilder addInterfaceInteractionChangeBuilder() {
        return com.commercetools.history.models.change.AddInterfaceInteractionChangeBuilder.of();
    }

    /**
     * builder for addItemShippingAddressesChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.AddItemShippingAddressesChangeBuilder addItemShippingAddressesChangeBuilder() {
        return com.commercetools.history.models.change.AddItemShippingAddressesChangeBuilder.of();
    }

    /**
     * builder for addLocalizedEnumValueChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.AddLocalizedEnumValueChangeBuilder addLocalizedEnumValueChangeBuilder() {
        return com.commercetools.history.models.change.AddLocalizedEnumValueChangeBuilder.of();
    }

    /**
     * builder for addLocationChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.AddLocationChangeBuilder addLocationChangeBuilder() {
        return com.commercetools.history.models.change.AddLocationChangeBuilder.of();
    }

    /**
     * builder for addOrderLineItemChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.AddOrderLineItemChangeBuilder addOrderLineItemChangeBuilder() {
        return com.commercetools.history.models.change.AddOrderLineItemChangeBuilder.of();
    }

    /**
     * builder for addParcelToDeliveryChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.AddParcelToDeliveryChangeBuilder addParcelToDeliveryChangeBuilder() {
        return com.commercetools.history.models.change.AddParcelToDeliveryChangeBuilder.of();
    }

    /**
     * builder for addPaymentChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.AddPaymentChangeBuilder addPaymentChangeBuilder() {
        return com.commercetools.history.models.change.AddPaymentChangeBuilder.of();
    }

    /**
     * builder for addPlainEnumValueChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.AddPlainEnumValueChangeBuilder addPlainEnumValueChangeBuilder() {
        return com.commercetools.history.models.change.AddPlainEnumValueChangeBuilder.of();
    }

    /**
     * builder for addPriceChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.AddPriceChangeBuilder addPriceChangeBuilder() {
        return com.commercetools.history.models.change.AddPriceChangeBuilder.of();
    }

    /**
     * builder for addProductChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.AddProductChangeBuilder addProductChangeBuilder() {
        return com.commercetools.history.models.change.AddProductChangeBuilder.of();
    }

    /**
     * builder for addProductSelectionChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.AddProductSelectionChangeBuilder addProductSelectionChangeBuilder() {
        return com.commercetools.history.models.change.AddProductSelectionChangeBuilder.of();
    }

    /**
     * builder for addPropertyChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.AddPropertyChangeBuilder addPropertyChangeBuilder() {
        return com.commercetools.history.models.change.AddPropertyChangeBuilder.of();
    }

    /**
     * builder for addReturnInfoChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.AddReturnInfoChangeBuilder addReturnInfoChangeBuilder() {
        return com.commercetools.history.models.change.AddReturnInfoChangeBuilder.of();
    }

    /**
     * builder for addShippingAddressIdChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.AddShippingAddressIdChangeBuilder addShippingAddressIdChangeBuilder() {
        return com.commercetools.history.models.change.AddShippingAddressIdChangeBuilder.of();
    }

    /**
     * builder for addShoppingListLineItemChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.AddShoppingListLineItemChangeBuilder addShoppingListLineItemChangeBuilder() {
        return com.commercetools.history.models.change.AddShoppingListLineItemChangeBuilder.of();
    }

    /**
     * builder for addStateRolesChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.AddStateRolesChangeBuilder addStateRolesChangeBuilder() {
        return com.commercetools.history.models.change.AddStateRolesChangeBuilder.of();
    }

    /**
     * builder for addTaxRateChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.AddTaxRateChangeBuilder addTaxRateChangeBuilder() {
        return com.commercetools.history.models.change.AddTaxRateChangeBuilder.of();
    }

    /**
     * builder for addTextLineItemChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.AddTextLineItemChangeBuilder addTextLineItemChangeBuilder() {
        return com.commercetools.history.models.change.AddTextLineItemChangeBuilder.of();
    }

    /**
     * builder for addToCategoryChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.AddToCategoryChangeBuilder addToCategoryChangeBuilder() {
        return com.commercetools.history.models.change.AddToCategoryChangeBuilder.of();
    }

    /**
     * builder for addTransactionChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.AddTransactionChangeBuilder addTransactionChangeBuilder() {
        return com.commercetools.history.models.change.AddTransactionChangeBuilder.of();
    }

    /**
     * builder for addVariantChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.AddVariantChangeBuilder addVariantChangeBuilder() {
        return com.commercetools.history.models.change.AddVariantChangeBuilder.of();
    }

    /**
     * builder for changeAddressChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeAddressChangeBuilder changeAddressChangeBuilder() {
        return com.commercetools.history.models.change.ChangeAddressChangeBuilder.of();
    }

    /**
     * builder for changeAmountAuthorizedChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeAmountAuthorizedChangeBuilder changeAmountAuthorizedChangeBuilder() {
        return com.commercetools.history.models.change.ChangeAmountAuthorizedChangeBuilder.of();
    }

    /**
     * builder for changeAmountPlannedChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeAmountPlannedChangeBuilder changeAmountPlannedChangeBuilder() {
        return com.commercetools.history.models.change.ChangeAmountPlannedChangeBuilder.of();
    }

    /**
     * builder for changeAssetNameChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeAssetNameChangeBuilder changeAssetNameChangeBuilder() {
        return com.commercetools.history.models.change.ChangeAssetNameChangeBuilder.of();
    }

    /**
     * builder for changeAssetOrderChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeAssetOrderChangeBuilder changeAssetOrderChangeBuilder() {
        return com.commercetools.history.models.change.ChangeAssetOrderChangeBuilder.of();
    }

    /**
     * builder for changeAssociateChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeAssociateChangeBuilder changeAssociateChangeBuilder() {
        return com.commercetools.history.models.change.ChangeAssociateChangeBuilder.of();
    }

    /**
     * builder for changeAssociateModeChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeAssociateModeChangeBuilder changeAssociateModeChangeBuilder() {
        return com.commercetools.history.models.change.ChangeAssociateModeChangeBuilder.of();
    }

    /**
     * builder for changeAttributeConstraintChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeAttributeConstraintChangeBuilder changeAttributeConstraintChangeBuilder() {
        return com.commercetools.history.models.change.ChangeAttributeConstraintChangeBuilder.of();
    }

    /**
     * builder for changeAttributeOrderByNameChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeAttributeOrderByNameChangeBuilder changeAttributeOrderByNameChangeBuilder() {
        return com.commercetools.history.models.change.ChangeAttributeOrderByNameChangeBuilder.of();
    }

    /**
     * builder for changeCartDiscountsChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeCartDiscountsChangeBuilder changeCartDiscountsChangeBuilder() {
        return com.commercetools.history.models.change.ChangeCartDiscountsChangeBuilder.of();
    }

    /**
     * builder for changeCartPredicateChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeCartPredicateChangeBuilder changeCartPredicateChangeBuilder() {
        return com.commercetools.history.models.change.ChangeCartPredicateChangeBuilder.of();
    }

    /**
     * builder for changeCustomLineItemQuantityChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeCustomLineItemQuantityChangeBuilder changeCustomLineItemQuantityChangeBuilder() {
        return com.commercetools.history.models.change.ChangeCustomLineItemQuantityChangeBuilder.of();
    }

    /**
     * builder for changeDescriptionChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeDescriptionChangeBuilder changeDescriptionChangeBuilder() {
        return com.commercetools.history.models.change.ChangeDescriptionChangeBuilder.of();
    }

    /**
     * builder for changeEmailChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeEmailChangeBuilder changeEmailChangeBuilder() {
        return com.commercetools.history.models.change.ChangeEmailChangeBuilder.of();
    }

    /**
     * builder for changeEnumValueLabelChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeEnumValueLabelChangeBuilder changeEnumValueLabelChangeBuilder() {
        return com.commercetools.history.models.change.ChangeEnumValueLabelChangeBuilder.of();
    }

    /**
     * builder for changeEnumValueOrderChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeEnumValueOrderChangeBuilder changeEnumValueOrderChangeBuilder() {
        return com.commercetools.history.models.change.ChangeEnumValueOrderChangeBuilder.of();
    }

    /**
     * builder for changeFieldDefinitionOrderChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeFieldDefinitionOrderChangeBuilder changeFieldDefinitionOrderChangeBuilder() {
        return com.commercetools.history.models.change.ChangeFieldDefinitionOrderChangeBuilder.of();
    }

    /**
     * builder for changeGroupsChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeGroupsChangeBuilder changeGroupsChangeBuilder() {
        return com.commercetools.history.models.change.ChangeGroupsChangeBuilder.of();
    }

    /**
     * builder for changeInitialChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeInitialChangeBuilder changeInitialChangeBuilder() {
        return com.commercetools.history.models.change.ChangeInitialChangeBuilder.of();
    }

    /**
     * builder for changeInputHintChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeInputHintChangeBuilder changeInputHintChangeBuilder() {
        return com.commercetools.history.models.change.ChangeInputHintChangeBuilder.of();
    }

    /**
     * builder for changeIsActiveChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeIsActiveChangeBuilder changeIsActiveChangeBuilder() {
        return com.commercetools.history.models.change.ChangeIsActiveChangeBuilder.of();
    }

    /**
     * builder for changeIsSearchableChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeIsSearchableChangeBuilder changeIsSearchableChangeBuilder() {
        return com.commercetools.history.models.change.ChangeIsSearchableChangeBuilder.of();
    }

    /**
     * builder for changeKeyChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeKeyChangeBuilder changeKeyChangeBuilder() {
        return com.commercetools.history.models.change.ChangeKeyChangeBuilder.of();
    }

    /**
     * builder for changeLabelChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeLabelChangeBuilder changeLabelChangeBuilder() {
        return com.commercetools.history.models.change.ChangeLabelChangeBuilder.of();
    }

    /**
     * builder for changeLineItemQuantityChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeLineItemQuantityChangeBuilder changeLineItemQuantityChangeBuilder() {
        return com.commercetools.history.models.change.ChangeLineItemQuantityChangeBuilder.of();
    }

    /**
     * builder for changeLocalizedDescriptionChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeLocalizedDescriptionChangeBuilder changeLocalizedDescriptionChangeBuilder() {
        return com.commercetools.history.models.change.ChangeLocalizedDescriptionChangeBuilder.of();
    }

    /**
     * builder for changeLocalizedEnumValueLabelChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeLocalizedEnumValueLabelChangeBuilder changeLocalizedEnumValueLabelChangeBuilder() {
        return com.commercetools.history.models.change.ChangeLocalizedEnumValueLabelChangeBuilder.of();
    }

    /**
     * builder for changeLocalizedEnumValueOrderChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeLocalizedEnumValueOrderChangeBuilder changeLocalizedEnumValueOrderChangeBuilder() {
        return com.commercetools.history.models.change.ChangeLocalizedEnumValueOrderChangeBuilder.of();
    }

    /**
     * builder for changeLocalizedNameChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeLocalizedNameChangeBuilder changeLocalizedNameChangeBuilder() {
        return com.commercetools.history.models.change.ChangeLocalizedNameChangeBuilder.of();
    }

    /**
     * builder for changeMasterVariantChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeMasterVariantChangeBuilder changeMasterVariantChangeBuilder() {
        return com.commercetools.history.models.change.ChangeMasterVariantChangeBuilder.of();
    }

    /**
     * builder for changeNameChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeNameChangeBuilder changeNameChangeBuilder() {
        return com.commercetools.history.models.change.ChangeNameChangeBuilder.of();
    }

    /**
     * builder for changeOrderHintChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeOrderHintChangeBuilder changeOrderHintChangeBuilder() {
        return com.commercetools.history.models.change.ChangeOrderHintChangeBuilder.of();
    }

    /**
     * builder for changeOrderStateChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeOrderStateChangeBuilder changeOrderStateChangeBuilder() {
        return com.commercetools.history.models.change.ChangeOrderStateChangeBuilder.of();
    }

    /**
     * builder for changeParentChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeParentChangeBuilder changeParentChangeBuilder() {
        return com.commercetools.history.models.change.ChangeParentChangeBuilder.of();
    }

    /**
     * builder for changeParentUnitChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeParentUnitChangeBuilder changeParentUnitChangeBuilder() {
        return com.commercetools.history.models.change.ChangeParentUnitChangeBuilder.of();
    }

    /**
     * builder for changePaymentStateChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangePaymentStateChangeBuilder changePaymentStateChangeBuilder() {
        return com.commercetools.history.models.change.ChangePaymentStateChangeBuilder.of();
    }

    /**
     * builder for changePlainEnumValueLabelChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangePlainEnumValueLabelChangeBuilder changePlainEnumValueLabelChangeBuilder() {
        return com.commercetools.history.models.change.ChangePlainEnumValueLabelChangeBuilder.of();
    }

    /**
     * builder for changePlainEnumValueOrderChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangePlainEnumValueOrderChangeBuilder changePlainEnumValueOrderChangeBuilder() {
        return com.commercetools.history.models.change.ChangePlainEnumValueOrderChangeBuilder.of();
    }

    /**
     * builder for changePredicateChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangePredicateChangeBuilder changePredicateChangeBuilder() {
        return com.commercetools.history.models.change.ChangePredicateChangeBuilder.of();
    }

    /**
     * builder for changePriceChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangePriceChangeBuilder changePriceChangeBuilder() {
        return com.commercetools.history.models.change.ChangePriceChangeBuilder.of();
    }

    /**
     * builder for changeProductSelectionActiveChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeProductSelectionActiveChangeBuilder changeProductSelectionActiveChangeBuilder() {
        return com.commercetools.history.models.change.ChangeProductSelectionActiveChangeBuilder.of();
    }

    /**
     * builder for changeQuantityChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeQuantityChangeBuilder changeQuantityChangeBuilder() {
        return com.commercetools.history.models.change.ChangeQuantityChangeBuilder.of();
    }

    /**
     * builder for changeQuoteRequestStateChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeQuoteRequestStateChangeBuilder changeQuoteRequestStateChangeBuilder() {
        return com.commercetools.history.models.change.ChangeQuoteRequestStateChangeBuilder.of();
    }

    /**
     * builder for changeQuoteStateChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeQuoteStateChangeBuilder changeQuoteStateChangeBuilder() {
        return com.commercetools.history.models.change.ChangeQuoteStateChangeBuilder.of();
    }

    /**
     * builder for changeRequiresDiscountCodeChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeRequiresDiscountCodeChangeBuilder changeRequiresDiscountCodeChangeBuilder() {
        return com.commercetools.history.models.change.ChangeRequiresDiscountCodeChangeBuilder.of();
    }

    /**
     * builder for changeReviewRatingStatisticsChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeReviewRatingStatisticsChangeBuilder changeReviewRatingStatisticsChangeBuilder() {
        return com.commercetools.history.models.change.ChangeReviewRatingStatisticsChangeBuilder.of();
    }

    /**
     * builder for changeShipmentStateChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeShipmentStateChangeBuilder changeShipmentStateChangeBuilder() {
        return com.commercetools.history.models.change.ChangeShipmentStateChangeBuilder.of();
    }

    /**
     * builder for changeShoppingListLineItemQuantityChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeShoppingListLineItemQuantityChangeBuilder changeShoppingListLineItemQuantityChangeBuilder() {
        return com.commercetools.history.models.change.ChangeShoppingListLineItemQuantityChangeBuilder.of();
    }

    /**
     * builder for changeShoppingListLineItemsOrderChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeShoppingListLineItemsOrderChangeBuilder changeShoppingListLineItemsOrderChangeBuilder() {
        return com.commercetools.history.models.change.ChangeShoppingListLineItemsOrderChangeBuilder.of();
    }

    /**
     * builder for changeSlugChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeSlugChangeBuilder changeSlugChangeBuilder() {
        return com.commercetools.history.models.change.ChangeSlugChangeBuilder.of();
    }

    /**
     * builder for changeSortOrderChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeSortOrderChangeBuilder changeSortOrderChangeBuilder() {
        return com.commercetools.history.models.change.ChangeSortOrderChangeBuilder.of();
    }

    /**
     * builder for changeStackingModeChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeStackingModeChangeBuilder changeStackingModeChangeBuilder() {
        return com.commercetools.history.models.change.ChangeStackingModeChangeBuilder.of();
    }

    /**
     * builder for changeStagedQuoteStateChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeStagedQuoteStateChangeBuilder changeStagedQuoteStateChangeBuilder() {
        return com.commercetools.history.models.change.ChangeStagedQuoteStateChangeBuilder.of();
    }

    /**
     * builder for changeStateTypeChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeStateTypeChangeBuilder changeStateTypeChangeBuilder() {
        return com.commercetools.history.models.change.ChangeStateTypeChangeBuilder.of();
    }

    /**
     * builder for changeStatusChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeStatusChangeBuilder changeStatusChangeBuilder() {
        return com.commercetools.history.models.change.ChangeStatusChangeBuilder.of();
    }

    /**
     * builder for changeTargetChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeTargetChangeBuilder changeTargetChangeBuilder() {
        return com.commercetools.history.models.change.ChangeTargetChangeBuilder.of();
    }

    /**
     * builder for changeTaxCalculationModeChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeTaxCalculationModeChangeBuilder changeTaxCalculationModeChangeBuilder() {
        return com.commercetools.history.models.change.ChangeTaxCalculationModeChangeBuilder.of();
    }

    /**
     * builder for changeTaxModeChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeTaxModeChangeBuilder changeTaxModeChangeBuilder() {
        return com.commercetools.history.models.change.ChangeTaxModeChangeBuilder.of();
    }

    /**
     * builder for changeTaxRoundingModeChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeTaxRoundingModeChangeBuilder changeTaxRoundingModeChangeBuilder() {
        return com.commercetools.history.models.change.ChangeTaxRoundingModeChangeBuilder.of();
    }

    /**
     * builder for changeTextLineItemNameChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeTextLineItemNameChangeBuilder changeTextLineItemNameChangeBuilder() {
        return com.commercetools.history.models.change.ChangeTextLineItemNameChangeBuilder.of();
    }

    /**
     * builder for changeTextLineItemQuantityChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeTextLineItemQuantityChangeBuilder changeTextLineItemQuantityChangeBuilder() {
        return com.commercetools.history.models.change.ChangeTextLineItemQuantityChangeBuilder.of();
    }

    /**
     * builder for changeTextLineItemsOrderChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeTextLineItemsOrderChangeBuilder changeTextLineItemsOrderChangeBuilder() {
        return com.commercetools.history.models.change.ChangeTextLineItemsOrderChangeBuilder.of();
    }

    /**
     * builder for changeTransactionInteractionIdChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeTransactionInteractionIdChangeBuilder changeTransactionInteractionIdChangeBuilder() {
        return com.commercetools.history.models.change.ChangeTransactionInteractionIdChangeBuilder.of();
    }

    /**
     * builder for changeTransactionStateChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeTransactionStateChangeBuilder changeTransactionStateChangeBuilder() {
        return com.commercetools.history.models.change.ChangeTransactionStateChangeBuilder.of();
    }

    /**
     * builder for changeTransactionTimestampChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeTransactionTimestampChangeBuilder changeTransactionTimestampChangeBuilder() {
        return com.commercetools.history.models.change.ChangeTransactionTimestampChangeBuilder.of();
    }

    /**
     * builder for changeValueChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeValueChangeBuilder changeValueChangeBuilder() {
        return com.commercetools.history.models.change.ChangeValueChangeBuilder.of();
    }

    /**
     * builder for moveImageToPositionChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.MoveImageToPositionChangeBuilder moveImageToPositionChangeBuilder() {
        return com.commercetools.history.models.change.MoveImageToPositionChangeBuilder.of();
    }

    /**
     * builder for publishChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.PublishChangeBuilder publishChangeBuilder() {
        return com.commercetools.history.models.change.PublishChangeBuilder.of();
    }

    /**
     * builder for removeAddressChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.RemoveAddressChangeBuilder removeAddressChangeBuilder() {
        return com.commercetools.history.models.change.RemoveAddressChangeBuilder.of();
    }

    /**
     * builder for removeAssetChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.RemoveAssetChangeBuilder removeAssetChangeBuilder() {
        return com.commercetools.history.models.change.RemoveAssetChangeBuilder.of();
    }

    /**
     * builder for removeAssociateChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.RemoveAssociateChangeBuilder removeAssociateChangeBuilder() {
        return com.commercetools.history.models.change.RemoveAssociateChangeBuilder.of();
    }

    /**
     * builder for removeAttributeDefinitionChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.RemoveAttributeDefinitionChangeBuilder removeAttributeDefinitionChangeBuilder() {
        return com.commercetools.history.models.change.RemoveAttributeDefinitionChangeBuilder.of();
    }

    /**
     * builder for removeBillingAddressIdChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.RemoveBillingAddressIdChangeBuilder removeBillingAddressIdChangeBuilder() {
        return com.commercetools.history.models.change.RemoveBillingAddressIdChangeBuilder.of();
    }

    /**
     * builder for removeChannelRolesChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.RemoveChannelRolesChangeBuilder removeChannelRolesChangeBuilder() {
        return com.commercetools.history.models.change.RemoveChannelRolesChangeBuilder.of();
    }

    /**
     * builder for removeCustomLineItemChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.RemoveCustomLineItemChangeBuilder removeCustomLineItemChangeBuilder() {
        return com.commercetools.history.models.change.RemoveCustomLineItemChangeBuilder.of();
    }

    /**
     * builder for removeDeliveryItemsChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.RemoveDeliveryItemsChangeBuilder removeDeliveryItemsChangeBuilder() {
        return com.commercetools.history.models.change.RemoveDeliveryItemsChangeBuilder.of();
    }

    /**
     * builder for removeDiscountCodeChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.RemoveDiscountCodeChangeBuilder removeDiscountCodeChangeBuilder() {
        return com.commercetools.history.models.change.RemoveDiscountCodeChangeBuilder.of();
    }

    /**
     * builder for removeEnumValuesChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.RemoveEnumValuesChangeBuilder removeEnumValuesChangeBuilder() {
        return com.commercetools.history.models.change.RemoveEnumValuesChangeBuilder.of();
    }

    /**
     * builder for removeFieldDefinitionChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.RemoveFieldDefinitionChangeBuilder removeFieldDefinitionChangeBuilder() {
        return com.commercetools.history.models.change.RemoveFieldDefinitionChangeBuilder.of();
    }

    /**
     * builder for removeFromCategoryChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.RemoveFromCategoryChangeBuilder removeFromCategoryChangeBuilder() {
        return com.commercetools.history.models.change.RemoveFromCategoryChangeBuilder.of();
    }

    /**
     * builder for removeImageChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.RemoveImageChangeBuilder removeImageChangeBuilder() {
        return com.commercetools.history.models.change.RemoveImageChangeBuilder.of();
    }

    /**
     * builder for removeItemShippingAddressesChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.RemoveItemShippingAddressesChangeBuilder removeItemShippingAddressesChangeBuilder() {
        return com.commercetools.history.models.change.RemoveItemShippingAddressesChangeBuilder.of();
    }

    /**
     * builder for removeLocalizedEnumValuesChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.RemoveLocalizedEnumValuesChangeBuilder removeLocalizedEnumValuesChangeBuilder() {
        return com.commercetools.history.models.change.RemoveLocalizedEnumValuesChangeBuilder.of();
    }

    /**
     * builder for removeLocationChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.RemoveLocationChangeBuilder removeLocationChangeBuilder() {
        return com.commercetools.history.models.change.RemoveLocationChangeBuilder.of();
    }

    /**
     * builder for removeOrderLineItemChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.RemoveOrderLineItemChangeBuilder removeOrderLineItemChangeBuilder() {
        return com.commercetools.history.models.change.RemoveOrderLineItemChangeBuilder.of();
    }

    /**
     * builder for removeParcelFromDeliveryChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.RemoveParcelFromDeliveryChangeBuilder removeParcelFromDeliveryChangeBuilder() {
        return com.commercetools.history.models.change.RemoveParcelFromDeliveryChangeBuilder.of();
    }

    /**
     * builder for removePaymentChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.RemovePaymentChangeBuilder removePaymentChangeBuilder() {
        return com.commercetools.history.models.change.RemovePaymentChangeBuilder.of();
    }

    /**
     * builder for removePriceChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.RemovePriceChangeBuilder removePriceChangeBuilder() {
        return com.commercetools.history.models.change.RemovePriceChangeBuilder.of();
    }

    /**
     * builder for removeProductChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.RemoveProductChangeBuilder removeProductChangeBuilder() {
        return com.commercetools.history.models.change.RemoveProductChangeBuilder.of();
    }

    /**
     * builder for removeProductSelectionChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.RemoveProductSelectionChangeBuilder removeProductSelectionChangeBuilder() {
        return com.commercetools.history.models.change.RemoveProductSelectionChangeBuilder.of();
    }

    /**
     * builder for removePropertyChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.RemovePropertyChangeBuilder removePropertyChangeBuilder() {
        return com.commercetools.history.models.change.RemovePropertyChangeBuilder.of();
    }

    /**
     * builder for removeShippingAddressIdChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.RemoveShippingAddressIdChangeBuilder removeShippingAddressIdChangeBuilder() {
        return com.commercetools.history.models.change.RemoveShippingAddressIdChangeBuilder.of();
    }

    /**
     * builder for removeShoppingListLineItemChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.RemoveShoppingListLineItemChangeBuilder removeShoppingListLineItemChangeBuilder() {
        return com.commercetools.history.models.change.RemoveShoppingListLineItemChangeBuilder.of();
    }

    /**
     * builder for removeStateRolesChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.RemoveStateRolesChangeBuilder removeStateRolesChangeBuilder() {
        return com.commercetools.history.models.change.RemoveStateRolesChangeBuilder.of();
    }

    /**
     * builder for removeTaxRateChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.RemoveTaxRateChangeBuilder removeTaxRateChangeBuilder() {
        return com.commercetools.history.models.change.RemoveTaxRateChangeBuilder.of();
    }

    /**
     * builder for removeTextLineItemChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.RemoveTextLineItemChangeBuilder removeTextLineItemChangeBuilder() {
        return com.commercetools.history.models.change.RemoveTextLineItemChangeBuilder.of();
    }

    /**
     * builder for removeVariantChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.RemoveVariantChangeBuilder removeVariantChangeBuilder() {
        return com.commercetools.history.models.change.RemoveVariantChangeBuilder.of();
    }

    /**
     * builder for requestQuoteRenegotiationChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.RequestQuoteRenegotiationChangeBuilder requestQuoteRenegotiationChangeBuilder() {
        return com.commercetools.history.models.change.RequestQuoteRenegotiationChangeBuilder.of();
    }

    /**
     * builder for setAddressChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetAddressChangeBuilder setAddressChangeBuilder() {
        return com.commercetools.history.models.change.SetAddressChangeBuilder.of();
    }

    /**
     * builder for setAddressCustomFieldChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetAddressCustomFieldChangeBuilder setAddressCustomFieldChangeBuilder() {
        return com.commercetools.history.models.change.SetAddressCustomFieldChangeBuilder.of();
    }

    /**
     * builder for setAddressCustomTypeChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetAddressCustomTypeChangeBuilder setAddressCustomTypeChangeBuilder() {
        return com.commercetools.history.models.change.SetAddressCustomTypeChangeBuilder.of();
    }

    /**
     * builder for setAnonymousIdChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetAnonymousIdChangeBuilder setAnonymousIdChangeBuilder() {
        return com.commercetools.history.models.change.SetAnonymousIdChangeBuilder.of();
    }

    /**
     * builder for setApplicationVersionChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetApplicationVersionChangeBuilder setApplicationVersionChangeBuilder() {
        return com.commercetools.history.models.change.SetApplicationVersionChangeBuilder.of();
    }

    /**
     * builder for setAssetCustomFieldChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetAssetCustomFieldChangeBuilder setAssetCustomFieldChangeBuilder() {
        return com.commercetools.history.models.change.SetAssetCustomFieldChangeBuilder.of();
    }

    /**
     * builder for setAssetCustomTypeChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetAssetCustomTypeChangeBuilder setAssetCustomTypeChangeBuilder() {
        return com.commercetools.history.models.change.SetAssetCustomTypeChangeBuilder.of();
    }

    /**
     * builder for setAssetDescriptionChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetAssetDescriptionChangeBuilder setAssetDescriptionChangeBuilder() {
        return com.commercetools.history.models.change.SetAssetDescriptionChangeBuilder.of();
    }

    /**
     * builder for setAssetKeyChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetAssetKeyChangeBuilder setAssetKeyChangeBuilder() {
        return com.commercetools.history.models.change.SetAssetKeyChangeBuilder.of();
    }

    /**
     * builder for setAssetSourcesChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetAssetSourcesChangeBuilder setAssetSourcesChangeBuilder() {
        return com.commercetools.history.models.change.SetAssetSourcesChangeBuilder.of();
    }

    /**
     * builder for setAssetTagsChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetAssetTagsChangeBuilder setAssetTagsChangeBuilder() {
        return com.commercetools.history.models.change.SetAssetTagsChangeBuilder.of();
    }

    /**
     * builder for setAttributeChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetAttributeChangeBuilder setAttributeChangeBuilder() {
        return com.commercetools.history.models.change.SetAttributeChangeBuilder.of();
    }

    /**
     * builder for setAuthenticationModeChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetAuthenticationModeChangeBuilder setAuthenticationModeChangeBuilder() {
        return com.commercetools.history.models.change.SetAuthenticationModeChangeBuilder.of();
    }

    /**
     * builder for setAuthorNameChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetAuthorNameChangeBuilder setAuthorNameChangeBuilder() {
        return com.commercetools.history.models.change.SetAuthorNameChangeBuilder.of();
    }

    /**
     * builder for setBillingAddressChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetBillingAddressChangeBuilder setBillingAddressChangeBuilder() {
        return com.commercetools.history.models.change.SetBillingAddressChangeBuilder.of();
    }

    /**
     * builder for setCartPredicateChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetCartPredicateChangeBuilder setCartPredicateChangeBuilder() {
        return com.commercetools.history.models.change.SetCartPredicateChangeBuilder.of();
    }

    /**
     * builder for setCategoryOrderHintChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetCategoryOrderHintChangeBuilder setCategoryOrderHintChangeBuilder() {
        return com.commercetools.history.models.change.SetCategoryOrderHintChangeBuilder.of();
    }

    /**
     * builder for setChannelRolesChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetChannelRolesChangeBuilder setChannelRolesChangeBuilder() {
        return com.commercetools.history.models.change.SetChannelRolesChangeBuilder.of();
    }

    /**
     * builder for setCompanyNameChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetCompanyNameChangeBuilder setCompanyNameChangeBuilder() {
        return com.commercetools.history.models.change.SetCompanyNameChangeBuilder.of();
    }

    /**
     * builder for setContactEmailChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetContactEmailChangeBuilder setContactEmailChangeBuilder() {
        return com.commercetools.history.models.change.SetContactEmailChangeBuilder.of();
    }

    /**
     * builder for setCountriesChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetCountriesChangeBuilder setCountriesChangeBuilder() {
        return com.commercetools.history.models.change.SetCountriesChangeBuilder.of();
    }

    /**
     * builder for setCountryChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetCountryChangeBuilder setCountryChangeBuilder() {
        return com.commercetools.history.models.change.SetCountryChangeBuilder.of();
    }

    /**
     * builder for setCustomFieldChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetCustomFieldChangeBuilder setCustomFieldChangeBuilder() {
        return com.commercetools.history.models.change.SetCustomFieldChangeBuilder.of();
    }

    /**
     * builder for setCustomLineItemCustomFieldChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetCustomLineItemCustomFieldChangeBuilder setCustomLineItemCustomFieldChangeBuilder() {
        return com.commercetools.history.models.change.SetCustomLineItemCustomFieldChangeBuilder.of();
    }

    /**
     * builder for setCustomLineItemCustomTypeChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetCustomLineItemCustomTypeChangeBuilder setCustomLineItemCustomTypeChangeBuilder() {
        return com.commercetools.history.models.change.SetCustomLineItemCustomTypeChangeBuilder.of();
    }

    /**
     * builder for setCustomLineItemMoneyChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetCustomLineItemMoneyChangeBuilder setCustomLineItemMoneyChangeBuilder() {
        return com.commercetools.history.models.change.SetCustomLineItemMoneyChangeBuilder.of();
    }

    /**
     * builder for setCustomLineItemShippingDetailsChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetCustomLineItemShippingDetailsChangeBuilder setCustomLineItemShippingDetailsChangeBuilder() {
        return com.commercetools.history.models.change.SetCustomLineItemShippingDetailsChangeBuilder.of();
    }

    /**
     * builder for setCustomLineItemTaxAmountChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetCustomLineItemTaxAmountChangeBuilder setCustomLineItemTaxAmountChangeBuilder() {
        return com.commercetools.history.models.change.SetCustomLineItemTaxAmountChangeBuilder.of();
    }

    /**
     * builder for setCustomLineItemTaxCategoryChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetCustomLineItemTaxCategoryChangeBuilder setCustomLineItemTaxCategoryChangeBuilder() {
        return com.commercetools.history.models.change.SetCustomLineItemTaxCategoryChangeBuilder.of();
    }

    /**
     * builder for setCustomLineItemTaxRateChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetCustomLineItemTaxRateChangeBuilder setCustomLineItemTaxRateChangeBuilder() {
        return com.commercetools.history.models.change.SetCustomLineItemTaxRateChangeBuilder.of();
    }

    /**
     * builder for setCustomLineItemTaxedPriceChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetCustomLineItemTaxedPriceChangeBuilder setCustomLineItemTaxedPriceChangeBuilder() {
        return com.commercetools.history.models.change.SetCustomLineItemTaxedPriceChangeBuilder.of();
    }

    /**
     * builder for setCustomLineItemTotalPriceChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetCustomLineItemTotalPriceChangeBuilder setCustomLineItemTotalPriceChangeBuilder() {
        return com.commercetools.history.models.change.SetCustomLineItemTotalPriceChangeBuilder.of();
    }

    /**
     * builder for setCustomShippingMethodChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetCustomShippingMethodChangeBuilder setCustomShippingMethodChangeBuilder() {
        return com.commercetools.history.models.change.SetCustomShippingMethodChangeBuilder.of();
    }

    /**
     * builder for setCustomTypeChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetCustomTypeChangeBuilder setCustomTypeChangeBuilder() {
        return com.commercetools.history.models.change.SetCustomTypeChangeBuilder.of();
    }

    /**
     * builder for setCustomerChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetCustomerChangeBuilder setCustomerChangeBuilder() {
        return com.commercetools.history.models.change.SetCustomerChangeBuilder.of();
    }

    /**
     * builder for setCustomerEmailChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetCustomerEmailChangeBuilder setCustomerEmailChangeBuilder() {
        return com.commercetools.history.models.change.SetCustomerEmailChangeBuilder.of();
    }

    /**
     * builder for setCustomerGroupChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetCustomerGroupChangeBuilder setCustomerGroupChangeBuilder() {
        return com.commercetools.history.models.change.SetCustomerGroupChangeBuilder.of();
    }

    /**
     * builder for setCustomerIdChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetCustomerIdChangeBuilder setCustomerIdChangeBuilder() {
        return com.commercetools.history.models.change.SetCustomerIdChangeBuilder.of();
    }

    /**
     * builder for setCustomerNumberChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetCustomerNumberChangeBuilder setCustomerNumberChangeBuilder() {
        return com.commercetools.history.models.change.SetCustomerNumberChangeBuilder.of();
    }

    /**
     * builder for setDateOfBirthChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetDateOfBirthChangeBuilder setDateOfBirthChangeBuilder() {
        return com.commercetools.history.models.change.SetDateOfBirthChangeBuilder.of();
    }

    /**
     * builder for setDefaultBillingAddressChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetDefaultBillingAddressChangeBuilder setDefaultBillingAddressChangeBuilder() {
        return com.commercetools.history.models.change.SetDefaultBillingAddressChangeBuilder.of();
    }

    /**
     * builder for setDefaultShippingAddressChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetDefaultShippingAddressChangeBuilder setDefaultShippingAddressChangeBuilder() {
        return com.commercetools.history.models.change.SetDefaultShippingAddressChangeBuilder.of();
    }

    /**
     * builder for setDeleteDaysAfterLastModificationChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetDeleteDaysAfterLastModificationChangeBuilder setDeleteDaysAfterLastModificationChangeBuilder() {
        return com.commercetools.history.models.change.SetDeleteDaysAfterLastModificationChangeBuilder.of();
    }

    /**
     * builder for setDeliveryAddressChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetDeliveryAddressChangeBuilder setDeliveryAddressChangeBuilder() {
        return com.commercetools.history.models.change.SetDeliveryAddressChangeBuilder.of();
    }

    /**
     * builder for setDeliveryItemsChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetDeliveryItemsChangeBuilder setDeliveryItemsChangeBuilder() {
        return com.commercetools.history.models.change.SetDeliveryItemsChangeBuilder.of();
    }

    /**
     * builder for setDescriptionChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetDescriptionChangeBuilder setDescriptionChangeBuilder() {
        return com.commercetools.history.models.change.SetDescriptionChangeBuilder.of();
    }

    /**
     * builder for setDiscountedPriceChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetDiscountedPriceChangeBuilder setDiscountedPriceChangeBuilder() {
        return com.commercetools.history.models.change.SetDiscountedPriceChangeBuilder.of();
    }

    /**
     * builder for setDistributionChannelsChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetDistributionChannelsChangeBuilder setDistributionChannelsChangeBuilder() {
        return com.commercetools.history.models.change.SetDistributionChannelsChangeBuilder.of();
    }

    /**
     * builder for setExpectedDeliveryChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetExpectedDeliveryChangeBuilder setExpectedDeliveryChangeBuilder() {
        return com.commercetools.history.models.change.SetExpectedDeliveryChangeBuilder.of();
    }

    /**
     * builder for setExternalIdChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetExternalIdChangeBuilder setExternalIdChangeBuilder() {
        return com.commercetools.history.models.change.SetExternalIdChangeBuilder.of();
    }

    /**
     * builder for setFirstNameChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetFirstNameChangeBuilder setFirstNameChangeBuilder() {
        return com.commercetools.history.models.change.SetFirstNameChangeBuilder.of();
    }

    /**
     * builder for setGeoLocationChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetGeoLocationChangeBuilder setGeoLocationChangeBuilder() {
        return com.commercetools.history.models.change.SetGeoLocationChangeBuilder.of();
    }

    /**
     * builder for setImageLabelChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetImageLabelChangeBuilder setImageLabelChangeBuilder() {
        return com.commercetools.history.models.change.SetImageLabelChangeBuilder.of();
    }

    /**
     * builder for setInputTipChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetInputTipChangeBuilder setInputTipChangeBuilder() {
        return com.commercetools.history.models.change.SetInputTipChangeBuilder.of();
    }

    /**
     * builder for setInterfaceIdChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetInterfaceIdChangeBuilder setInterfaceIdChangeBuilder() {
        return com.commercetools.history.models.change.SetInterfaceIdChangeBuilder.of();
    }

    /**
     * builder for setIsValidChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetIsValidChangeBuilder setIsValidChangeBuilder() {
        return com.commercetools.history.models.change.SetIsValidChangeBuilder.of();
    }

    /**
     * builder for setKeyChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetKeyChangeBuilder setKeyChangeBuilder() {
        return com.commercetools.history.models.change.SetKeyChangeBuilder.of();
    }

    /**
     * builder for setLanguagesChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetLanguagesChangeBuilder setLanguagesChangeBuilder() {
        return com.commercetools.history.models.change.SetLanguagesChangeBuilder.of();
    }

    /**
     * builder for setLastNameChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetLastNameChangeBuilder setLastNameChangeBuilder() {
        return com.commercetools.history.models.change.SetLastNameChangeBuilder.of();
    }

    /**
     * builder for setLineItemDeactivatedAtChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetLineItemDeactivatedAtChangeBuilder setLineItemDeactivatedAtChangeBuilder() {
        return com.commercetools.history.models.change.SetLineItemDeactivatedAtChangeBuilder.of();
    }

    /**
     * builder for setLineItemDiscountedPriceChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetLineItemDiscountedPriceChangeBuilder setLineItemDiscountedPriceChangeBuilder() {
        return com.commercetools.history.models.change.SetLineItemDiscountedPriceChangeBuilder.of();
    }

    /**
     * builder for setLineItemDiscountedPricePerQuantityChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetLineItemDiscountedPricePerQuantityChangeBuilder setLineItemDiscountedPricePerQuantityChangeBuilder() {
        return com.commercetools.history.models.change.SetLineItemDiscountedPricePerQuantityChangeBuilder.of();
    }

    /**
     * builder for setLineItemDistributionChannelChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetLineItemDistributionChannelChangeBuilder setLineItemDistributionChannelChangeBuilder() {
        return com.commercetools.history.models.change.SetLineItemDistributionChannelChangeBuilder.of();
    }

    /**
     * builder for setLineItemPriceChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetLineItemPriceChangeBuilder setLineItemPriceChangeBuilder() {
        return com.commercetools.history.models.change.SetLineItemPriceChangeBuilder.of();
    }

    /**
     * builder for setLineItemProductKeyChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetLineItemProductKeyChangeBuilder setLineItemProductKeyChangeBuilder() {
        return com.commercetools.history.models.change.SetLineItemProductKeyChangeBuilder.of();
    }

    /**
     * builder for setLineItemProductSlugChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetLineItemProductSlugChangeBuilder setLineItemProductSlugChangeBuilder() {
        return com.commercetools.history.models.change.SetLineItemProductSlugChangeBuilder.of();
    }

    /**
     * builder for setLineItemShippingDetailsChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetLineItemShippingDetailsChangeBuilder setLineItemShippingDetailsChangeBuilder() {
        return com.commercetools.history.models.change.SetLineItemShippingDetailsChangeBuilder.of();
    }

    /**
     * builder for setLineItemTaxAmountChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetLineItemTaxAmountChangeBuilder setLineItemTaxAmountChangeBuilder() {
        return com.commercetools.history.models.change.SetLineItemTaxAmountChangeBuilder.of();
    }

    /**
     * builder for setLineItemTaxRateChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetLineItemTaxRateChangeBuilder setLineItemTaxRateChangeBuilder() {
        return com.commercetools.history.models.change.SetLineItemTaxRateChangeBuilder.of();
    }

    /**
     * builder for setLineItemTaxedPriceChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetLineItemTaxedPriceChangeBuilder setLineItemTaxedPriceChangeBuilder() {
        return com.commercetools.history.models.change.SetLineItemTaxedPriceChangeBuilder.of();
    }

    /**
     * builder for setLineItemTotalPriceChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetLineItemTotalPriceChangeBuilder setLineItemTotalPriceChangeBuilder() {
        return com.commercetools.history.models.change.SetLineItemTotalPriceChangeBuilder.of();
    }

    /**
     * builder for setLocaleChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetLocaleChangeBuilder setLocaleChangeBuilder() {
        return com.commercetools.history.models.change.SetLocaleChangeBuilder.of();
    }

    /**
     * builder for setLocalizedDescriptionChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetLocalizedDescriptionChangeBuilder setLocalizedDescriptionChangeBuilder() {
        return com.commercetools.history.models.change.SetLocalizedDescriptionChangeBuilder.of();
    }

    /**
     * builder for setMaxApplicationsChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetMaxApplicationsChangeBuilder setMaxApplicationsChangeBuilder() {
        return com.commercetools.history.models.change.SetMaxApplicationsChangeBuilder.of();
    }

    /**
     * builder for setMaxApplicationsPerCustomerChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetMaxApplicationsPerCustomerChangeBuilder setMaxApplicationsPerCustomerChangeBuilder() {
        return com.commercetools.history.models.change.SetMaxApplicationsPerCustomerChangeBuilder.of();
    }

    /**
     * builder for setMetaDescriptionChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetMetaDescriptionChangeBuilder setMetaDescriptionChangeBuilder() {
        return com.commercetools.history.models.change.SetMetaDescriptionChangeBuilder.of();
    }

    /**
     * builder for setMetaKeywordsChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetMetaKeywordsChangeBuilder setMetaKeywordsChangeBuilder() {
        return com.commercetools.history.models.change.SetMetaKeywordsChangeBuilder.of();
    }

    /**
     * builder for setMetaTitleChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetMetaTitleChangeBuilder setMetaTitleChangeBuilder() {
        return com.commercetools.history.models.change.SetMetaTitleChangeBuilder.of();
    }

    /**
     * builder for setMethodInfoInterfaceChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetMethodInfoInterfaceChangeBuilder setMethodInfoInterfaceChangeBuilder() {
        return com.commercetools.history.models.change.SetMethodInfoInterfaceChangeBuilder.of();
    }

    /**
     * builder for setMethodInfoMethodChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetMethodInfoMethodChangeBuilder setMethodInfoMethodChangeBuilder() {
        return com.commercetools.history.models.change.SetMethodInfoMethodChangeBuilder.of();
    }

    /**
     * builder for setMethodInfoNameChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetMethodInfoNameChangeBuilder setMethodInfoNameChangeBuilder() {
        return com.commercetools.history.models.change.SetMethodInfoNameChangeBuilder.of();
    }

    /**
     * builder for setMiddleNameChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetMiddleNameChangeBuilder setMiddleNameChangeBuilder() {
        return com.commercetools.history.models.change.SetMiddleNameChangeBuilder.of();
    }

    /**
     * builder for setNameChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetNameChangeBuilder setNameChangeBuilder() {
        return com.commercetools.history.models.change.SetNameChangeBuilder.of();
    }

    /**
     * builder for setOrderLineItemCustomFieldChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetOrderLineItemCustomFieldChangeBuilder setOrderLineItemCustomFieldChangeBuilder() {
        return com.commercetools.history.models.change.SetOrderLineItemCustomFieldChangeBuilder.of();
    }

    /**
     * builder for setOrderLineItemCustomTypeChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetOrderLineItemCustomTypeChangeBuilder setOrderLineItemCustomTypeChangeBuilder() {
        return com.commercetools.history.models.change.SetOrderLineItemCustomTypeChangeBuilder.of();
    }

    /**
     * builder for setOrderNumberChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetOrderNumberChangeBuilder setOrderNumberChangeBuilder() {
        return com.commercetools.history.models.change.SetOrderNumberChangeBuilder.of();
    }

    /**
     * builder for setOrderTaxedPriceChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetOrderTaxedPriceChangeBuilder setOrderTaxedPriceChangeBuilder() {
        return com.commercetools.history.models.change.SetOrderTaxedPriceChangeBuilder.of();
    }

    /**
     * builder for setOrderTotalPriceChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetOrderTotalPriceChangeBuilder setOrderTotalPriceChangeBuilder() {
        return com.commercetools.history.models.change.SetOrderTotalPriceChangeBuilder.of();
    }

    /**
     * builder for setOrderTotalTaxChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetOrderTotalTaxChangeBuilder setOrderTotalTaxChangeBuilder() {
        return com.commercetools.history.models.change.SetOrderTotalTaxChangeBuilder.of();
    }

    /**
     * builder for setParcelItemsChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetParcelItemsChangeBuilder setParcelItemsChangeBuilder() {
        return com.commercetools.history.models.change.SetParcelItemsChangeBuilder.of();
    }

    /**
     * builder for setParcelMeasurementsChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetParcelMeasurementsChangeBuilder setParcelMeasurementsChangeBuilder() {
        return com.commercetools.history.models.change.SetParcelMeasurementsChangeBuilder.of();
    }

    /**
     * builder for setParcelTrackingDataChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetParcelTrackingDataChangeBuilder setParcelTrackingDataChangeBuilder() {
        return com.commercetools.history.models.change.SetParcelTrackingDataChangeBuilder.of();
    }

    /**
     * builder for setPricesChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetPricesChangeBuilder setPricesChangeBuilder() {
        return com.commercetools.history.models.change.SetPricesChangeBuilder.of();
    }

    /**
     * builder for setProductCountChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetProductCountChangeBuilder setProductCountChangeBuilder() {
        return com.commercetools.history.models.change.SetProductCountChangeBuilder.of();
    }

    /**
     * builder for setProductPriceCustomFieldChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetProductPriceCustomFieldChangeBuilder setProductPriceCustomFieldChangeBuilder() {
        return com.commercetools.history.models.change.SetProductPriceCustomFieldChangeBuilder.of();
    }

    /**
     * builder for setProductPriceCustomTypeChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetProductPriceCustomTypeChangeBuilder setProductPriceCustomTypeChangeBuilder() {
        return com.commercetools.history.models.change.SetProductPriceCustomTypeChangeBuilder.of();
    }

    /**
     * builder for setProductSelectionsChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetProductSelectionsChangeBuilder setProductSelectionsChangeBuilder() {
        return com.commercetools.history.models.change.SetProductSelectionsChangeBuilder.of();
    }

    /**
     * builder for setProductVariantKeyChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetProductVariantKeyChangeBuilder setProductVariantKeyChangeBuilder() {
        return com.commercetools.history.models.change.SetProductVariantKeyChangeBuilder.of();
    }

    /**
     * builder for setPropertyChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetPropertyChangeBuilder setPropertyChangeBuilder() {
        return com.commercetools.history.models.change.SetPropertyChangeBuilder.of();
    }

    /**
     * builder for setPurchaseOrderNumberChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetPurchaseOrderNumberChangeBuilder setPurchaseOrderNumberChangeBuilder() {
        return com.commercetools.history.models.change.SetPurchaseOrderNumberChangeBuilder.of();
    }

    /**
     * builder for setRatingChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetRatingChangeBuilder setRatingChangeBuilder() {
        return com.commercetools.history.models.change.SetRatingChangeBuilder.of();
    }

    /**
     * builder for setReservationsChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetReservationsChangeBuilder setReservationsChangeBuilder() {
        return com.commercetools.history.models.change.SetReservationsChangeBuilder.of();
    }

    /**
     * builder for setRestockableInDaysChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetRestockableInDaysChangeBuilder setRestockableInDaysChangeBuilder() {
        return com.commercetools.history.models.change.SetRestockableInDaysChangeBuilder.of();
    }

    /**
     * builder for setReturnPaymentStateChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetReturnPaymentStateChangeBuilder setReturnPaymentStateChangeBuilder() {
        return com.commercetools.history.models.change.SetReturnPaymentStateChangeBuilder.of();
    }

    /**
     * builder for setReturnShipmentStateChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetReturnShipmentStateChangeBuilder setReturnShipmentStateChangeBuilder() {
        return com.commercetools.history.models.change.SetReturnShipmentStateChangeBuilder.of();
    }

    /**
     * builder for setSalutationChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetSalutationChangeBuilder setSalutationChangeBuilder() {
        return com.commercetools.history.models.change.SetSalutationChangeBuilder.of();
    }

    /**
     * builder for setSearchKeywordsChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetSearchKeywordsChangeBuilder setSearchKeywordsChangeBuilder() {
        return com.commercetools.history.models.change.SetSearchKeywordsChangeBuilder.of();
    }

    /**
     * builder for setSellerCommentChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetSellerCommentChangeBuilder setSellerCommentChangeBuilder() {
        return com.commercetools.history.models.change.SetSellerCommentChangeBuilder.of();
    }

    /**
     * builder for setShippingAddressChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetShippingAddressChangeBuilder setShippingAddressChangeBuilder() {
        return com.commercetools.history.models.change.SetShippingAddressChangeBuilder.of();
    }

    /**
     * builder for setShippingInfoPriceChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetShippingInfoPriceChangeBuilder setShippingInfoPriceChangeBuilder() {
        return com.commercetools.history.models.change.SetShippingInfoPriceChangeBuilder.of();
    }

    /**
     * builder for setShippingInfoTaxedPriceChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetShippingInfoTaxedPriceChangeBuilder setShippingInfoTaxedPriceChangeBuilder() {
        return com.commercetools.history.models.change.SetShippingInfoTaxedPriceChangeBuilder.of();
    }

    /**
     * builder for setShippingMethodChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetShippingMethodChangeBuilder setShippingMethodChangeBuilder() {
        return com.commercetools.history.models.change.SetShippingMethodChangeBuilder.of();
    }

    /**
     * builder for setShippingMethodTaxAmountChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetShippingMethodTaxAmountChangeBuilder setShippingMethodTaxAmountChangeBuilder() {
        return com.commercetools.history.models.change.SetShippingMethodTaxAmountChangeBuilder.of();
    }

    /**
     * builder for setShippingMethodTaxRateChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetShippingMethodTaxRateChangeBuilder setShippingMethodTaxRateChangeBuilder() {
        return com.commercetools.history.models.change.SetShippingMethodTaxRateChangeBuilder.of();
    }

    /**
     * builder for setShippingRateChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetShippingRateChangeBuilder setShippingRateChangeBuilder() {
        return com.commercetools.history.models.change.SetShippingRateChangeBuilder.of();
    }

    /**
     * builder for setShippingRateInputChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetShippingRateInputChangeBuilder setShippingRateInputChangeBuilder() {
        return com.commercetools.history.models.change.SetShippingRateInputChangeBuilder.of();
    }

    /**
     * builder for setShoppingListLineItemCustomFieldChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetShoppingListLineItemCustomFieldChangeBuilder setShoppingListLineItemCustomFieldChangeBuilder() {
        return com.commercetools.history.models.change.SetShoppingListLineItemCustomFieldChangeBuilder.of();
    }

    /**
     * builder for setShoppingListLineItemCustomTypeChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetShoppingListLineItemCustomTypeChangeBuilder setShoppingListLineItemCustomTypeChangeBuilder() {
        return com.commercetools.history.models.change.SetShoppingListLineItemCustomTypeChangeBuilder.of();
    }

    /**
     * builder for setSkuChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetSkuChangeBuilder setSkuChangeBuilder() {
        return com.commercetools.history.models.change.SetSkuChangeBuilder.of();
    }

    /**
     * builder for setSlugChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetSlugChangeBuilder setSlugChangeBuilder() {
        return com.commercetools.history.models.change.SetSlugChangeBuilder.of();
    }

    /**
     * builder for setStateRolesChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetStateRolesChangeBuilder setStateRolesChangeBuilder() {
        return com.commercetools.history.models.change.SetStateRolesChangeBuilder.of();
    }

    /**
     * builder for setStatusInterfaceCodeChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetStatusInterfaceCodeChangeBuilder setStatusInterfaceCodeChangeBuilder() {
        return com.commercetools.history.models.change.SetStatusInterfaceCodeChangeBuilder.of();
    }

    /**
     * builder for setStatusInterfaceTextChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetStatusInterfaceTextChangeBuilder setStatusInterfaceTextChangeBuilder() {
        return com.commercetools.history.models.change.SetStatusInterfaceTextChangeBuilder.of();
    }

    /**
     * builder for setStoreChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetStoreChangeBuilder setStoreChangeBuilder() {
        return com.commercetools.history.models.change.SetStoreChangeBuilder.of();
    }

    /**
     * builder for setStoreModeChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetStoreModeChangeBuilder setStoreModeChangeBuilder() {
        return com.commercetools.history.models.change.SetStoreModeChangeBuilder.of();
    }

    /**
     * builder for setStoresChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetStoresChangeBuilder setStoresChangeBuilder() {
        return com.commercetools.history.models.change.SetStoresChangeBuilder.of();
    }

    /**
     * builder for setSupplyChannelChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetSupplyChannelChangeBuilder setSupplyChannelChangeBuilder() {
        return com.commercetools.history.models.change.SetSupplyChannelChangeBuilder.of();
    }

    /**
     * builder for setSupplyChannelsChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetSupplyChannelsChangeBuilder setSupplyChannelsChangeBuilder() {
        return com.commercetools.history.models.change.SetSupplyChannelsChangeBuilder.of();
    }

    /**
     * builder for setTargetChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetTargetChangeBuilder setTargetChangeBuilder() {
        return com.commercetools.history.models.change.SetTargetChangeBuilder.of();
    }

    /**
     * builder for setTaxCategoryChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetTaxCategoryChangeBuilder setTaxCategoryChangeBuilder() {
        return com.commercetools.history.models.change.SetTaxCategoryChangeBuilder.of();
    }

    /**
     * builder for setTextChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetTextChangeBuilder setTextChangeBuilder() {
        return com.commercetools.history.models.change.SetTextChangeBuilder.of();
    }

    /**
     * builder for setTextLineItemCustomFieldChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetTextLineItemCustomFieldChangeBuilder setTextLineItemCustomFieldChangeBuilder() {
        return com.commercetools.history.models.change.SetTextLineItemCustomFieldChangeBuilder.of();
    }

    /**
     * builder for setTextLineItemCustomTypeChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetTextLineItemCustomTypeChangeBuilder setTextLineItemCustomTypeChangeBuilder() {
        return com.commercetools.history.models.change.SetTextLineItemCustomTypeChangeBuilder.of();
    }

    /**
     * builder for setTextLineItemDescriptionChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetTextLineItemDescriptionChangeBuilder setTextLineItemDescriptionChangeBuilder() {
        return com.commercetools.history.models.change.SetTextLineItemDescriptionChangeBuilder.of();
    }

    /**
     * builder for setTitleChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetTitleChangeBuilder setTitleChangeBuilder() {
        return com.commercetools.history.models.change.SetTitleChangeBuilder.of();
    }

    /**
     * builder for setTransitionsChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetTransitionsChangeBuilder setTransitionsChangeBuilder() {
        return com.commercetools.history.models.change.SetTransitionsChangeBuilder.of();
    }

    /**
     * builder for setValidFromAndUntilChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetValidFromAndUntilChangeBuilder setValidFromAndUntilChangeBuilder() {
        return com.commercetools.history.models.change.SetValidFromAndUntilChangeBuilder.of();
    }

    /**
     * builder for setValidFromChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetValidFromChangeBuilder setValidFromChangeBuilder() {
        return com.commercetools.history.models.change.SetValidFromChangeBuilder.of();
    }

    /**
     * builder for setValidToChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetValidToChangeBuilder setValidToChangeBuilder() {
        return com.commercetools.history.models.change.SetValidToChangeBuilder.of();
    }

    /**
     * builder for setValidUntilChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetValidUntilChangeBuilder setValidUntilChangeBuilder() {
        return com.commercetools.history.models.change.SetValidUntilChangeBuilder.of();
    }

    /**
     * builder for setValueChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetValueChangeBuilder setValueChangeBuilder() {
        return com.commercetools.history.models.change.SetValueChangeBuilder.of();
    }

    /**
     * builder for setVariantAvailabilityChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetVariantAvailabilityChangeBuilder setVariantAvailabilityChangeBuilder() {
        return com.commercetools.history.models.change.SetVariantAvailabilityChangeBuilder.of();
    }

    /**
     * builder for setVariantSelectionChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetVariantSelectionChangeBuilder setVariantSelectionChangeBuilder() {
        return com.commercetools.history.models.change.SetVariantSelectionChangeBuilder.of();
    }

    /**
     * builder for setVatIdChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetVatIdChangeBuilder setVatIdChangeBuilder() {
        return com.commercetools.history.models.change.SetVatIdChangeBuilder.of();
    }

    /**
     * builder for transitionCustomLineItemStateChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.TransitionCustomLineItemStateChangeBuilder transitionCustomLineItemStateChangeBuilder() {
        return com.commercetools.history.models.change.TransitionCustomLineItemStateChangeBuilder.of();
    }

    /**
     * builder for transitionLineItemStateChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.TransitionLineItemStateChangeBuilder transitionLineItemStateChangeBuilder() {
        return com.commercetools.history.models.change.TransitionLineItemStateChangeBuilder.of();
    }

    /**
     * builder for transitionStateChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.TransitionStateChangeBuilder transitionStateChangeBuilder() {
        return com.commercetools.history.models.change.TransitionStateChangeBuilder.of();
    }

    /**
     * builder for unknownChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.UnknownChangeBuilder unknownChangeBuilder() {
        return com.commercetools.history.models.change.UnknownChangeBuilder.of();
    }

    /**
     * builder for unpublishChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.UnpublishChangeBuilder unpublishChangeBuilder() {
        return com.commercetools.history.models.change.UnpublishChangeBuilder.of();
    }

    /**
     * builder for updateSyncInfoChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.UpdateSyncInfoChangeBuilder updateSyncInfoChangeBuilder() {
        return com.commercetools.history.models.change.UpdateSyncInfoChangeBuilder.of();
    }

    /**
     * builder for verifyEmailChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.VerifyEmailChangeBuilder verifyEmailChangeBuilder() {
        return com.commercetools.history.models.change.VerifyEmailChangeBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withChange(Function<Change, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Change> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Change>() {
            @Override
            public String toString() {
                return "TypeReference<Change>";
            }
        };
    }
}
