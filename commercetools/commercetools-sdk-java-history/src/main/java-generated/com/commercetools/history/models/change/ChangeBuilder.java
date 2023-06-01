package com.commercetools.history.models.change;

import com.commercetools.history.models.change.AddAddressChange;
import com.commercetools.history.models.change.AddAssetChange;
import com.commercetools.history.models.change.AddAttributeDefinitionChange;
import com.commercetools.history.models.change.AddBillingAddressIdChange;
import com.commercetools.history.models.change.AddChannelRolesChange;
import com.commercetools.history.models.change.AddCustomLineItemChange;
import com.commercetools.history.models.change.AddDeliveryChange;
import com.commercetools.history.models.change.AddDiscountCodeChange;
import com.commercetools.history.models.change.AddEnumValueChange;
import com.commercetools.history.models.change.AddExternalImageChange;
import com.commercetools.history.models.change.AddFieldDefinitionChange;
import com.commercetools.history.models.change.AddInterfaceInteractionChange;
import com.commercetools.history.models.change.AddItemShippingAddressesChange;
import com.commercetools.history.models.change.AddLocalizedEnumValueChange;
import com.commercetools.history.models.change.AddLocationChange;
import com.commercetools.history.models.change.AddOrderLineItemChange;
import com.commercetools.history.models.change.AddParcelToDeliveryChange;
import com.commercetools.history.models.change.AddPaymentChange;
import com.commercetools.history.models.change.AddPlainEnumValueChange;
import com.commercetools.history.models.change.AddPriceChange;
import com.commercetools.history.models.change.AddProductChange;
import com.commercetools.history.models.change.AddPropertyChange;
import com.commercetools.history.models.change.AddReturnInfoChange;
import com.commercetools.history.models.change.AddShippingAddressIdChange;
import com.commercetools.history.models.change.AddShoppingListLineItemChange;
import com.commercetools.history.models.change.AddStateRolesChange;
import com.commercetools.history.models.change.AddTaxRateChange;
import com.commercetools.history.models.change.AddTextLineItemChange;
import com.commercetools.history.models.change.AddToCategoryChange;
import com.commercetools.history.models.change.AddTransactionChange;
import com.commercetools.history.models.change.AddVariantChange;
import com.commercetools.history.models.change.ChangeAddressChange;
import com.commercetools.history.models.change.ChangeAmountAuthorizedChange;
import com.commercetools.history.models.change.ChangeAmountPlannedChange;
import com.commercetools.history.models.change.ChangeAssetNameChange;
import com.commercetools.history.models.change.ChangeAssetOrderChange;
import com.commercetools.history.models.change.ChangeAttributeConstraintChange;
import com.commercetools.history.models.change.ChangeAttributeOrderByNameChange;
import com.commercetools.history.models.change.ChangeCartDiscountsChange;
import com.commercetools.history.models.change.ChangeCartPredicateChange;
import com.commercetools.history.models.change.ChangeCustomLineItemQuantityChange;
import com.commercetools.history.models.change.ChangeDescriptionChange;
import com.commercetools.history.models.change.ChangeEmailChange;
import com.commercetools.history.models.change.ChangeEnumValueLabelChange;
import com.commercetools.history.models.change.ChangeEnumValueOrderChange;
import com.commercetools.history.models.change.ChangeFieldDefinitionOrderChange;
import com.commercetools.history.models.change.ChangeGroupsChange;
import com.commercetools.history.models.change.ChangeInitialChange;
import com.commercetools.history.models.change.ChangeInputHintChange;
import com.commercetools.history.models.change.ChangeIsActiveChange;
import com.commercetools.history.models.change.ChangeIsSearchableChange;
import com.commercetools.history.models.change.ChangeKeyChange;
import com.commercetools.history.models.change.ChangeLabelChange;
import com.commercetools.history.models.change.ChangeLineItemQuantityChange;
import com.commercetools.history.models.change.ChangeLocalizedDescriptionChange;
import com.commercetools.history.models.change.ChangeLocalizedEnumValueLabelChange;
import com.commercetools.history.models.change.ChangeLocalizedEnumValueOrderChange;
import com.commercetools.history.models.change.ChangeLocalizedNameChange;
import com.commercetools.history.models.change.ChangeMasterVariantChange;
import com.commercetools.history.models.change.ChangeNameChange;
import com.commercetools.history.models.change.ChangeOrderHintChange;
import com.commercetools.history.models.change.ChangeOrderStateChange;
import com.commercetools.history.models.change.ChangeParentChange;
import com.commercetools.history.models.change.ChangePaymentStateChange;
import com.commercetools.history.models.change.ChangePlainEnumValueLabelChange;
import com.commercetools.history.models.change.ChangePlainEnumValueOrderChange;
import com.commercetools.history.models.change.ChangePredicateChange;
import com.commercetools.history.models.change.ChangePriceChange;
import com.commercetools.history.models.change.ChangeQuantityChange;
import com.commercetools.history.models.change.ChangeQuoteRequestStateChange;
import com.commercetools.history.models.change.ChangeQuoteStateChange;
import com.commercetools.history.models.change.ChangeRequiresDiscountCodeChange;
import com.commercetools.history.models.change.ChangeReviewRatingStatisticsChange;
import com.commercetools.history.models.change.ChangeShipmentStateChange;
import com.commercetools.history.models.change.ChangeShoppingListLineItemQuantityChange;
import com.commercetools.history.models.change.ChangeShoppingListLineItemsOrderChange;
import com.commercetools.history.models.change.ChangeSlugChange;
import com.commercetools.history.models.change.ChangeSortOrderChange;
import com.commercetools.history.models.change.ChangeStackingModeChange;
import com.commercetools.history.models.change.ChangeStagedQuoteStateChange;
import com.commercetools.history.models.change.ChangeStateTypeChange;
import com.commercetools.history.models.change.ChangeTargetChange;
import com.commercetools.history.models.change.ChangeTaxCalculationModeChange;
import com.commercetools.history.models.change.ChangeTaxModeChange;
import com.commercetools.history.models.change.ChangeTaxRoundingModeChange;
import com.commercetools.history.models.change.ChangeTextLineItemNameChange;
import com.commercetools.history.models.change.ChangeTextLineItemQuantityChange;
import com.commercetools.history.models.change.ChangeTextLineItemsOrderChange;
import com.commercetools.history.models.change.ChangeTransactionInteractionIdChange;
import com.commercetools.history.models.change.ChangeTransactionStateChange;
import com.commercetools.history.models.change.ChangeTransactionTimestampChange;
import com.commercetools.history.models.change.ChangeValueChange;
import com.commercetools.history.models.change.MoveImageToPositionChange;
import com.commercetools.history.models.change.PublishChange;
import com.commercetools.history.models.change.RemoveAddressChange;
import com.commercetools.history.models.change.RemoveAssetChange;
import com.commercetools.history.models.change.RemoveAttributeDefinitionChange;
import com.commercetools.history.models.change.RemoveBillingAddressIdChange;
import com.commercetools.history.models.change.RemoveChannelRolesChange;
import com.commercetools.history.models.change.RemoveCustomLineItemChange;
import com.commercetools.history.models.change.RemoveDeliveryItemsChange;
import com.commercetools.history.models.change.RemoveDiscountCodeChange;
import com.commercetools.history.models.change.RemoveEnumValuesChange;
import com.commercetools.history.models.change.RemoveFieldDefinitionChange;
import com.commercetools.history.models.change.RemoveFromCategoryChange;
import com.commercetools.history.models.change.RemoveImageChange;
import com.commercetools.history.models.change.RemoveItemShippingAddressesChange;
import com.commercetools.history.models.change.RemoveLocalizedEnumValuesChange;
import com.commercetools.history.models.change.RemoveLocationChange;
import com.commercetools.history.models.change.RemoveOrderLineItemChange;
import com.commercetools.history.models.change.RemoveParcelFromDeliveryChange;
import com.commercetools.history.models.change.RemovePaymentChange;
import com.commercetools.history.models.change.RemovePriceChange;
import com.commercetools.history.models.change.RemoveProductChange;
import com.commercetools.history.models.change.RemovePropertyChange;
import com.commercetools.history.models.change.RemoveShippingAddressIdChange;
import com.commercetools.history.models.change.RemoveShoppingListLineItemChange;
import com.commercetools.history.models.change.RemoveStateRolesChange;
import com.commercetools.history.models.change.RemoveTaxRateChange;
import com.commercetools.history.models.change.RemoveTextLineItemChange;
import com.commercetools.history.models.change.RemoveVariantChange;
import com.commercetools.history.models.change.SetAddressChange;
import com.commercetools.history.models.change.SetAnonymousIdChange;
import com.commercetools.history.models.change.SetApplicationVersionChange;
import com.commercetools.history.models.change.SetAssetCustomFieldChange;
import com.commercetools.history.models.change.SetAssetCustomTypeChange;
import com.commercetools.history.models.change.SetAssetDescriptionChange;
import com.commercetools.history.models.change.SetAssetKeyChange;
import com.commercetools.history.models.change.SetAssetSourcesChange;
import com.commercetools.history.models.change.SetAssetTagsChange;
import com.commercetools.history.models.change.SetAttributeChange;
import com.commercetools.history.models.change.SetAuthenticationModeChange;
import com.commercetools.history.models.change.SetAuthorNameChange;
import com.commercetools.history.models.change.SetBillingAddressChange;
import com.commercetools.history.models.change.SetCartPredicateChange;
import com.commercetools.history.models.change.SetCategoryOrderHintChange;
import com.commercetools.history.models.change.SetChannelRolesChange;
import com.commercetools.history.models.change.SetCompanyNameChange;
import com.commercetools.history.models.change.SetCountriesChange;
import com.commercetools.history.models.change.SetCountryChange;
import com.commercetools.history.models.change.SetCustomFieldChange;
import com.commercetools.history.models.change.SetCustomLineItemCustomFieldChange;
import com.commercetools.history.models.change.SetCustomLineItemCustomTypeChange;
import com.commercetools.history.models.change.SetCustomLineItemMoneyChange;
import com.commercetools.history.models.change.SetCustomLineItemShippingDetailsChange;
import com.commercetools.history.models.change.SetCustomLineItemTaxAmountChange;
import com.commercetools.history.models.change.SetCustomLineItemTaxCategoryChange;
import com.commercetools.history.models.change.SetCustomLineItemTaxRateChange;
import com.commercetools.history.models.change.SetCustomLineItemTaxedPriceChange;
import com.commercetools.history.models.change.SetCustomLineItemTotalPriceChange;
import com.commercetools.history.models.change.SetCustomShippingMethodChange;
import com.commercetools.history.models.change.SetCustomTypeChange;
import com.commercetools.history.models.change.SetCustomerChange;
import com.commercetools.history.models.change.SetCustomerEmailChange;
import com.commercetools.history.models.change.SetCustomerGroupChange;
import com.commercetools.history.models.change.SetCustomerIdChange;
import com.commercetools.history.models.change.SetCustomerNumberChange;
import com.commercetools.history.models.change.SetDateOfBirthChange;
import com.commercetools.history.models.change.SetDefaultBillingAddressChange;
import com.commercetools.history.models.change.SetDefaultShippingAddressChange;
import com.commercetools.history.models.change.SetDeleteDaysAfterLastModificationChange;
import com.commercetools.history.models.change.SetDeliveryAddressChange;
import com.commercetools.history.models.change.SetDeliveryItemsChange;
import com.commercetools.history.models.change.SetDescriptionChange;
import com.commercetools.history.models.change.SetDiscountedPriceChange;
import com.commercetools.history.models.change.SetDistributionChannelsChange;
import com.commercetools.history.models.change.SetExpectedDeliveryChange;
import com.commercetools.history.models.change.SetExternalIdChange;
import com.commercetools.history.models.change.SetFirstNameChange;
import com.commercetools.history.models.change.SetGeoLocationChange;
import com.commercetools.history.models.change.SetImageLabelChange;
import com.commercetools.history.models.change.SetInputTipChange;
import com.commercetools.history.models.change.SetInterfaceIdChange;
import com.commercetools.history.models.change.SetIsValidChange;
import com.commercetools.history.models.change.SetKeyChange;
import com.commercetools.history.models.change.SetLanguagesChange;
import com.commercetools.history.models.change.SetLastNameChange;
import com.commercetools.history.models.change.SetLineItemDeactivatedAtChange;
import com.commercetools.history.models.change.SetLineItemDiscountedPriceChange;
import com.commercetools.history.models.change.SetLineItemDiscountedPricePerQuantityChange;
import com.commercetools.history.models.change.SetLineItemDistributionChannelChange;
import com.commercetools.history.models.change.SetLineItemPriceChange;
import com.commercetools.history.models.change.SetLineItemProductKeyChange;
import com.commercetools.history.models.change.SetLineItemProductSlugChange;
import com.commercetools.history.models.change.SetLineItemShippingDetailsChange;
import com.commercetools.history.models.change.SetLineItemTaxAmountChange;
import com.commercetools.history.models.change.SetLineItemTaxRateChange;
import com.commercetools.history.models.change.SetLineItemTaxedPriceChange;
import com.commercetools.history.models.change.SetLineItemTotalPriceChange;
import com.commercetools.history.models.change.SetLocaleChange;
import com.commercetools.history.models.change.SetLocalizedDescriptionChange;
import com.commercetools.history.models.change.SetMaxApplicationsChange;
import com.commercetools.history.models.change.SetMaxApplicationsPerCustomerChange;
import com.commercetools.history.models.change.SetMetaDescriptionChange;
import com.commercetools.history.models.change.SetMetaKeywordsChange;
import com.commercetools.history.models.change.SetMetaTitleChange;
import com.commercetools.history.models.change.SetMethodInfoInterfaceChange;
import com.commercetools.history.models.change.SetMethodInfoMethodChange;
import com.commercetools.history.models.change.SetMethodInfoNameChange;
import com.commercetools.history.models.change.SetMiddleNameChange;
import com.commercetools.history.models.change.SetNameChange;
import com.commercetools.history.models.change.SetOrderLineItemCustomFieldChange;
import com.commercetools.history.models.change.SetOrderLineItemCustomTypeChange;
import com.commercetools.history.models.change.SetOrderNumberChange;
import com.commercetools.history.models.change.SetOrderTaxedPriceChange;
import com.commercetools.history.models.change.SetOrderTotalPriceChange;
import com.commercetools.history.models.change.SetOrderTotalTaxChange;
import com.commercetools.history.models.change.SetParcelItemsChange;
import com.commercetools.history.models.change.SetParcelMeasurementsChange;
import com.commercetools.history.models.change.SetParcelTrackingDataChange;
import com.commercetools.history.models.change.SetPricesChange;
import com.commercetools.history.models.change.SetProductCountChange;
import com.commercetools.history.models.change.SetProductPriceCustomFieldChange;
import com.commercetools.history.models.change.SetProductPriceCustomTypeChange;
import com.commercetools.history.models.change.SetProductSelectionsChange;
import com.commercetools.history.models.change.SetProductVariantKeyChange;
import com.commercetools.history.models.change.SetPropertyChange;
import com.commercetools.history.models.change.SetPurchaseOrderNumberChange;
import com.commercetools.history.models.change.SetRatingChange;
import com.commercetools.history.models.change.SetReservationsChange;
import com.commercetools.history.models.change.SetRestockableInDaysChange;
import com.commercetools.history.models.change.SetReturnPaymentStateChange;
import com.commercetools.history.models.change.SetReturnShipmentStateChange;
import com.commercetools.history.models.change.SetSalutationChange;
import com.commercetools.history.models.change.SetSearchKeywordsChange;
import com.commercetools.history.models.change.SetSellerCommentChange;
import com.commercetools.history.models.change.SetShippingAddressChange;
import com.commercetools.history.models.change.SetShippingInfoPriceChange;
import com.commercetools.history.models.change.SetShippingInfoTaxedPriceChange;
import com.commercetools.history.models.change.SetShippingMethodChange;
import com.commercetools.history.models.change.SetShippingMethodTaxAmountChange;
import com.commercetools.history.models.change.SetShippingMethodTaxRateChange;
import com.commercetools.history.models.change.SetShippingRateChange;
import com.commercetools.history.models.change.SetShippingRateInputChange;
import com.commercetools.history.models.change.SetShoppingListLineItemCustomFieldChange;
import com.commercetools.history.models.change.SetShoppingListLineItemCustomTypeChange;
import com.commercetools.history.models.change.SetSkuChange;
import com.commercetools.history.models.change.SetSlugChange;
import com.commercetools.history.models.change.SetStateRolesChange;
import com.commercetools.history.models.change.SetStatusInterfaceCodeChange;
import com.commercetools.history.models.change.SetStatusInterfaceTextChange;
import com.commercetools.history.models.change.SetStoreChange;
import com.commercetools.history.models.change.SetStoresChange;
import com.commercetools.history.models.change.SetSupplyChannelChange;
import com.commercetools.history.models.change.SetSupplyChannelsChange;
import com.commercetools.history.models.change.SetTargetChange;
import com.commercetools.history.models.change.SetTaxCategoryChange;
import com.commercetools.history.models.change.SetTextChange;
import com.commercetools.history.models.change.SetTextLineItemCustomFieldChange;
import com.commercetools.history.models.change.SetTextLineItemCustomTypeChange;
import com.commercetools.history.models.change.SetTextLineItemDescriptionChange;
import com.commercetools.history.models.change.SetTitleChange;
import com.commercetools.history.models.change.SetTransitionsChange;
import com.commercetools.history.models.change.SetValidFromAndUntilChange;
import com.commercetools.history.models.change.SetValidFromChange;
import com.commercetools.history.models.change.SetValidToChange;
import com.commercetools.history.models.change.SetValidUntilChange;
import com.commercetools.history.models.change.SetValueChange;
import com.commercetools.history.models.change.SetVariantAvailabilityChange;
import com.commercetools.history.models.change.SetVatIdChange;
import com.commercetools.history.models.change.TransitionCustomLineItemStateChange;
import com.commercetools.history.models.change.TransitionLineItemStateChange;
import com.commercetools.history.models.change.TransitionStateChange;
import com.commercetools.history.models.change.UnknownChange;
import com.commercetools.history.models.change.UnpublishChange;
import com.commercetools.history.models.change.UpdateSyncInfoChange;
import com.commercetools.history.models.change.VerifyEmailChange;
import com.commercetools.history.models.change.Change;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ChangeBuilder
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ChangeBuilder {

    public com.commercetools.history.models.change.AddAddressChangeBuilder addAddressChangeBuilder() {
       return com.commercetools.history.models.change.AddAddressChangeBuilder.of();
    }
    public com.commercetools.history.models.change.AddAssetChangeBuilder addAssetChangeBuilder() {
       return com.commercetools.history.models.change.AddAssetChangeBuilder.of();
    }
    public com.commercetools.history.models.change.AddAttributeDefinitionChangeBuilder addAttributeDefinitionChangeBuilder() {
       return com.commercetools.history.models.change.AddAttributeDefinitionChangeBuilder.of();
    }
    public com.commercetools.history.models.change.AddBillingAddressIdChangeBuilder addBillingAddressIdChangeBuilder() {
       return com.commercetools.history.models.change.AddBillingAddressIdChangeBuilder.of();
    }
    public com.commercetools.history.models.change.AddChannelRolesChangeBuilder addChannelRolesChangeBuilder() {
       return com.commercetools.history.models.change.AddChannelRolesChangeBuilder.of();
    }
    public com.commercetools.history.models.change.AddCustomLineItemChangeBuilder addCustomLineItemChangeBuilder() {
       return com.commercetools.history.models.change.AddCustomLineItemChangeBuilder.of();
    }
    public com.commercetools.history.models.change.AddDeliveryChangeBuilder addDeliveryChangeBuilder() {
       return com.commercetools.history.models.change.AddDeliveryChangeBuilder.of();
    }
    public com.commercetools.history.models.change.AddDiscountCodeChangeBuilder addDiscountCodeChangeBuilder() {
       return com.commercetools.history.models.change.AddDiscountCodeChangeBuilder.of();
    }
    public com.commercetools.history.models.change.AddEnumValueChangeBuilder addEnumValueChangeBuilder() {
       return com.commercetools.history.models.change.AddEnumValueChangeBuilder.of();
    }
    public com.commercetools.history.models.change.AddExternalImageChangeBuilder addExternalImageChangeBuilder() {
       return com.commercetools.history.models.change.AddExternalImageChangeBuilder.of();
    }
    public com.commercetools.history.models.change.AddFieldDefinitionChangeBuilder addFieldDefinitionChangeBuilder() {
       return com.commercetools.history.models.change.AddFieldDefinitionChangeBuilder.of();
    }
    public com.commercetools.history.models.change.AddInterfaceInteractionChangeBuilder addInterfaceInteractionChangeBuilder() {
       return com.commercetools.history.models.change.AddInterfaceInteractionChangeBuilder.of();
    }
    public com.commercetools.history.models.change.AddItemShippingAddressesChangeBuilder addItemShippingAddressesChangeBuilder() {
       return com.commercetools.history.models.change.AddItemShippingAddressesChangeBuilder.of();
    }
    public com.commercetools.history.models.change.AddLocalizedEnumValueChangeBuilder addLocalizedEnumValueChangeBuilder() {
       return com.commercetools.history.models.change.AddLocalizedEnumValueChangeBuilder.of();
    }
    public com.commercetools.history.models.change.AddLocationChangeBuilder addLocationChangeBuilder() {
       return com.commercetools.history.models.change.AddLocationChangeBuilder.of();
    }
    public com.commercetools.history.models.change.AddOrderLineItemChangeBuilder addOrderLineItemChangeBuilder() {
       return com.commercetools.history.models.change.AddOrderLineItemChangeBuilder.of();
    }
    public com.commercetools.history.models.change.AddParcelToDeliveryChangeBuilder addParcelToDeliveryChangeBuilder() {
       return com.commercetools.history.models.change.AddParcelToDeliveryChangeBuilder.of();
    }
    public com.commercetools.history.models.change.AddPaymentChangeBuilder addPaymentChangeBuilder() {
       return com.commercetools.history.models.change.AddPaymentChangeBuilder.of();
    }
    public com.commercetools.history.models.change.AddPlainEnumValueChangeBuilder addPlainEnumValueChangeBuilder() {
       return com.commercetools.history.models.change.AddPlainEnumValueChangeBuilder.of();
    }
    public com.commercetools.history.models.change.AddPriceChangeBuilder addPriceChangeBuilder() {
       return com.commercetools.history.models.change.AddPriceChangeBuilder.of();
    }
    public com.commercetools.history.models.change.AddProductChangeBuilder addProductChangeBuilder() {
       return com.commercetools.history.models.change.AddProductChangeBuilder.of();
    }
    public com.commercetools.history.models.change.AddPropertyChangeBuilder addPropertyChangeBuilder() {
       return com.commercetools.history.models.change.AddPropertyChangeBuilder.of();
    }
    public com.commercetools.history.models.change.AddReturnInfoChangeBuilder addReturnInfoChangeBuilder() {
       return com.commercetools.history.models.change.AddReturnInfoChangeBuilder.of();
    }
    public com.commercetools.history.models.change.AddShippingAddressIdChangeBuilder addShippingAddressIdChangeBuilder() {
       return com.commercetools.history.models.change.AddShippingAddressIdChangeBuilder.of();
    }
    public com.commercetools.history.models.change.AddShoppingListLineItemChangeBuilder addShoppingListLineItemChangeBuilder() {
       return com.commercetools.history.models.change.AddShoppingListLineItemChangeBuilder.of();
    }
    public com.commercetools.history.models.change.AddStateRolesChangeBuilder addStateRolesChangeBuilder() {
       return com.commercetools.history.models.change.AddStateRolesChangeBuilder.of();
    }
    public com.commercetools.history.models.change.AddTaxRateChangeBuilder addTaxRateChangeBuilder() {
       return com.commercetools.history.models.change.AddTaxRateChangeBuilder.of();
    }
    public com.commercetools.history.models.change.AddTextLineItemChangeBuilder addTextLineItemChangeBuilder() {
       return com.commercetools.history.models.change.AddTextLineItemChangeBuilder.of();
    }
    public com.commercetools.history.models.change.AddToCategoryChangeBuilder addToCategoryChangeBuilder() {
       return com.commercetools.history.models.change.AddToCategoryChangeBuilder.of();
    }
    public com.commercetools.history.models.change.AddTransactionChangeBuilder addTransactionChangeBuilder() {
       return com.commercetools.history.models.change.AddTransactionChangeBuilder.of();
    }
    public com.commercetools.history.models.change.AddVariantChangeBuilder addVariantChangeBuilder() {
       return com.commercetools.history.models.change.AddVariantChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeAddressChangeBuilder changeAddressChangeBuilder() {
       return com.commercetools.history.models.change.ChangeAddressChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeAmountAuthorizedChangeBuilder changeAmountAuthorizedChangeBuilder() {
       return com.commercetools.history.models.change.ChangeAmountAuthorizedChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeAmountPlannedChangeBuilder changeAmountPlannedChangeBuilder() {
       return com.commercetools.history.models.change.ChangeAmountPlannedChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeAssetNameChangeBuilder changeAssetNameChangeBuilder() {
       return com.commercetools.history.models.change.ChangeAssetNameChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeAssetOrderChangeBuilder changeAssetOrderChangeBuilder() {
       return com.commercetools.history.models.change.ChangeAssetOrderChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeAttributeConstraintChangeBuilder changeAttributeConstraintChangeBuilder() {
       return com.commercetools.history.models.change.ChangeAttributeConstraintChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeAttributeOrderByNameChangeBuilder changeAttributeOrderByNameChangeBuilder() {
       return com.commercetools.history.models.change.ChangeAttributeOrderByNameChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeCartDiscountsChangeBuilder changeCartDiscountsChangeBuilder() {
       return com.commercetools.history.models.change.ChangeCartDiscountsChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeCartPredicateChangeBuilder changeCartPredicateChangeBuilder() {
       return com.commercetools.history.models.change.ChangeCartPredicateChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeCustomLineItemQuantityChangeBuilder changeCustomLineItemQuantityChangeBuilder() {
       return com.commercetools.history.models.change.ChangeCustomLineItemQuantityChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeDescriptionChangeBuilder changeDescriptionChangeBuilder() {
       return com.commercetools.history.models.change.ChangeDescriptionChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeEmailChangeBuilder changeEmailChangeBuilder() {
       return com.commercetools.history.models.change.ChangeEmailChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeEnumValueLabelChangeBuilder changeEnumValueLabelChangeBuilder() {
       return com.commercetools.history.models.change.ChangeEnumValueLabelChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeEnumValueOrderChangeBuilder changeEnumValueOrderChangeBuilder() {
       return com.commercetools.history.models.change.ChangeEnumValueOrderChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeFieldDefinitionOrderChangeBuilder changeFieldDefinitionOrderChangeBuilder() {
       return com.commercetools.history.models.change.ChangeFieldDefinitionOrderChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeGroupsChangeBuilder changeGroupsChangeBuilder() {
       return com.commercetools.history.models.change.ChangeGroupsChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeInitialChangeBuilder changeInitialChangeBuilder() {
       return com.commercetools.history.models.change.ChangeInitialChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeInputHintChangeBuilder changeInputHintChangeBuilder() {
       return com.commercetools.history.models.change.ChangeInputHintChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeIsActiveChangeBuilder changeIsActiveChangeBuilder() {
       return com.commercetools.history.models.change.ChangeIsActiveChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeIsSearchableChangeBuilder changeIsSearchableChangeBuilder() {
       return com.commercetools.history.models.change.ChangeIsSearchableChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeKeyChangeBuilder changeKeyChangeBuilder() {
       return com.commercetools.history.models.change.ChangeKeyChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeLabelChangeBuilder changeLabelChangeBuilder() {
       return com.commercetools.history.models.change.ChangeLabelChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeLineItemQuantityChangeBuilder changeLineItemQuantityChangeBuilder() {
       return com.commercetools.history.models.change.ChangeLineItemQuantityChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeLocalizedDescriptionChangeBuilder changeLocalizedDescriptionChangeBuilder() {
       return com.commercetools.history.models.change.ChangeLocalizedDescriptionChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeLocalizedEnumValueLabelChangeBuilder changeLocalizedEnumValueLabelChangeBuilder() {
       return com.commercetools.history.models.change.ChangeLocalizedEnumValueLabelChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeLocalizedEnumValueOrderChangeBuilder changeLocalizedEnumValueOrderChangeBuilder() {
       return com.commercetools.history.models.change.ChangeLocalizedEnumValueOrderChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeLocalizedNameChangeBuilder changeLocalizedNameChangeBuilder() {
       return com.commercetools.history.models.change.ChangeLocalizedNameChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeMasterVariantChangeBuilder changeMasterVariantChangeBuilder() {
       return com.commercetools.history.models.change.ChangeMasterVariantChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeNameChangeBuilder changeNameChangeBuilder() {
       return com.commercetools.history.models.change.ChangeNameChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeOrderHintChangeBuilder changeOrderHintChangeBuilder() {
       return com.commercetools.history.models.change.ChangeOrderHintChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeOrderStateChangeBuilder changeOrderStateChangeBuilder() {
       return com.commercetools.history.models.change.ChangeOrderStateChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeParentChangeBuilder changeParentChangeBuilder() {
       return com.commercetools.history.models.change.ChangeParentChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangePaymentStateChangeBuilder changePaymentStateChangeBuilder() {
       return com.commercetools.history.models.change.ChangePaymentStateChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangePlainEnumValueLabelChangeBuilder changePlainEnumValueLabelChangeBuilder() {
       return com.commercetools.history.models.change.ChangePlainEnumValueLabelChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangePlainEnumValueOrderChangeBuilder changePlainEnumValueOrderChangeBuilder() {
       return com.commercetools.history.models.change.ChangePlainEnumValueOrderChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangePredicateChangeBuilder changePredicateChangeBuilder() {
       return com.commercetools.history.models.change.ChangePredicateChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangePriceChangeBuilder changePriceChangeBuilder() {
       return com.commercetools.history.models.change.ChangePriceChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeQuantityChangeBuilder changeQuantityChangeBuilder() {
       return com.commercetools.history.models.change.ChangeQuantityChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeQuoteRequestStateChangeBuilder changeQuoteRequestStateChangeBuilder() {
       return com.commercetools.history.models.change.ChangeQuoteRequestStateChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeQuoteStateChangeBuilder changeQuoteStateChangeBuilder() {
       return com.commercetools.history.models.change.ChangeQuoteStateChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeRequiresDiscountCodeChangeBuilder changeRequiresDiscountCodeChangeBuilder() {
       return com.commercetools.history.models.change.ChangeRequiresDiscountCodeChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeReviewRatingStatisticsChangeBuilder changeReviewRatingStatisticsChangeBuilder() {
       return com.commercetools.history.models.change.ChangeReviewRatingStatisticsChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeShipmentStateChangeBuilder changeShipmentStateChangeBuilder() {
       return com.commercetools.history.models.change.ChangeShipmentStateChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeShoppingListLineItemQuantityChangeBuilder changeShoppingListLineItemQuantityChangeBuilder() {
       return com.commercetools.history.models.change.ChangeShoppingListLineItemQuantityChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeShoppingListLineItemsOrderChangeBuilder changeShoppingListLineItemsOrderChangeBuilder() {
       return com.commercetools.history.models.change.ChangeShoppingListLineItemsOrderChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeSlugChangeBuilder changeSlugChangeBuilder() {
       return com.commercetools.history.models.change.ChangeSlugChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeSortOrderChangeBuilder changeSortOrderChangeBuilder() {
       return com.commercetools.history.models.change.ChangeSortOrderChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeStackingModeChangeBuilder changeStackingModeChangeBuilder() {
       return com.commercetools.history.models.change.ChangeStackingModeChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeStagedQuoteStateChangeBuilder changeStagedQuoteStateChangeBuilder() {
       return com.commercetools.history.models.change.ChangeStagedQuoteStateChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeStateTypeChangeBuilder changeStateTypeChangeBuilder() {
       return com.commercetools.history.models.change.ChangeStateTypeChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeTargetChangeBuilder changeTargetChangeBuilder() {
       return com.commercetools.history.models.change.ChangeTargetChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeTaxCalculationModeChangeBuilder changeTaxCalculationModeChangeBuilder() {
       return com.commercetools.history.models.change.ChangeTaxCalculationModeChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeTaxModeChangeBuilder changeTaxModeChangeBuilder() {
       return com.commercetools.history.models.change.ChangeTaxModeChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeTaxRoundingModeChangeBuilder changeTaxRoundingModeChangeBuilder() {
       return com.commercetools.history.models.change.ChangeTaxRoundingModeChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeTextLineItemNameChangeBuilder changeTextLineItemNameChangeBuilder() {
       return com.commercetools.history.models.change.ChangeTextLineItemNameChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeTextLineItemQuantityChangeBuilder changeTextLineItemQuantityChangeBuilder() {
       return com.commercetools.history.models.change.ChangeTextLineItemQuantityChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeTextLineItemsOrderChangeBuilder changeTextLineItemsOrderChangeBuilder() {
       return com.commercetools.history.models.change.ChangeTextLineItemsOrderChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeTransactionInteractionIdChangeBuilder changeTransactionInteractionIdChangeBuilder() {
       return com.commercetools.history.models.change.ChangeTransactionInteractionIdChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeTransactionStateChangeBuilder changeTransactionStateChangeBuilder() {
       return com.commercetools.history.models.change.ChangeTransactionStateChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeTransactionTimestampChangeBuilder changeTransactionTimestampChangeBuilder() {
       return com.commercetools.history.models.change.ChangeTransactionTimestampChangeBuilder.of();
    }
    public com.commercetools.history.models.change.ChangeValueChangeBuilder changeValueChangeBuilder() {
       return com.commercetools.history.models.change.ChangeValueChangeBuilder.of();
    }
    public com.commercetools.history.models.change.MoveImageToPositionChangeBuilder moveImageToPositionChangeBuilder() {
       return com.commercetools.history.models.change.MoveImageToPositionChangeBuilder.of();
    }
    public com.commercetools.history.models.change.PublishChangeBuilder publishChangeBuilder() {
       return com.commercetools.history.models.change.PublishChangeBuilder.of();
    }
    public com.commercetools.history.models.change.RemoveAddressChangeBuilder removeAddressChangeBuilder() {
       return com.commercetools.history.models.change.RemoveAddressChangeBuilder.of();
    }
    public com.commercetools.history.models.change.RemoveAssetChangeBuilder removeAssetChangeBuilder() {
       return com.commercetools.history.models.change.RemoveAssetChangeBuilder.of();
    }
    public com.commercetools.history.models.change.RemoveAttributeDefinitionChangeBuilder removeAttributeDefinitionChangeBuilder() {
       return com.commercetools.history.models.change.RemoveAttributeDefinitionChangeBuilder.of();
    }
    public com.commercetools.history.models.change.RemoveBillingAddressIdChangeBuilder removeBillingAddressIdChangeBuilder() {
       return com.commercetools.history.models.change.RemoveBillingAddressIdChangeBuilder.of();
    }
    public com.commercetools.history.models.change.RemoveChannelRolesChangeBuilder removeChannelRolesChangeBuilder() {
       return com.commercetools.history.models.change.RemoveChannelRolesChangeBuilder.of();
    }
    public com.commercetools.history.models.change.RemoveCustomLineItemChangeBuilder removeCustomLineItemChangeBuilder() {
       return com.commercetools.history.models.change.RemoveCustomLineItemChangeBuilder.of();
    }
    public com.commercetools.history.models.change.RemoveDeliveryItemsChangeBuilder removeDeliveryItemsChangeBuilder() {
       return com.commercetools.history.models.change.RemoveDeliveryItemsChangeBuilder.of();
    }
    public com.commercetools.history.models.change.RemoveDiscountCodeChangeBuilder removeDiscountCodeChangeBuilder() {
       return com.commercetools.history.models.change.RemoveDiscountCodeChangeBuilder.of();
    }
    public com.commercetools.history.models.change.RemoveEnumValuesChangeBuilder removeEnumValuesChangeBuilder() {
       return com.commercetools.history.models.change.RemoveEnumValuesChangeBuilder.of();
    }
    public com.commercetools.history.models.change.RemoveFieldDefinitionChangeBuilder removeFieldDefinitionChangeBuilder() {
       return com.commercetools.history.models.change.RemoveFieldDefinitionChangeBuilder.of();
    }
    public com.commercetools.history.models.change.RemoveFromCategoryChangeBuilder removeFromCategoryChangeBuilder() {
       return com.commercetools.history.models.change.RemoveFromCategoryChangeBuilder.of();
    }
    public com.commercetools.history.models.change.RemoveImageChangeBuilder removeImageChangeBuilder() {
       return com.commercetools.history.models.change.RemoveImageChangeBuilder.of();
    }
    public com.commercetools.history.models.change.RemoveItemShippingAddressesChangeBuilder removeItemShippingAddressesChangeBuilder() {
       return com.commercetools.history.models.change.RemoveItemShippingAddressesChangeBuilder.of();
    }
    public com.commercetools.history.models.change.RemoveLocalizedEnumValuesChangeBuilder removeLocalizedEnumValuesChangeBuilder() {
       return com.commercetools.history.models.change.RemoveLocalizedEnumValuesChangeBuilder.of();
    }
    public com.commercetools.history.models.change.RemoveLocationChangeBuilder removeLocationChangeBuilder() {
       return com.commercetools.history.models.change.RemoveLocationChangeBuilder.of();
    }
    public com.commercetools.history.models.change.RemoveOrderLineItemChangeBuilder removeOrderLineItemChangeBuilder() {
       return com.commercetools.history.models.change.RemoveOrderLineItemChangeBuilder.of();
    }
    public com.commercetools.history.models.change.RemoveParcelFromDeliveryChangeBuilder removeParcelFromDeliveryChangeBuilder() {
       return com.commercetools.history.models.change.RemoveParcelFromDeliveryChangeBuilder.of();
    }
    public com.commercetools.history.models.change.RemovePaymentChangeBuilder removePaymentChangeBuilder() {
       return com.commercetools.history.models.change.RemovePaymentChangeBuilder.of();
    }
    public com.commercetools.history.models.change.RemovePriceChangeBuilder removePriceChangeBuilder() {
       return com.commercetools.history.models.change.RemovePriceChangeBuilder.of();
    }
    public com.commercetools.history.models.change.RemoveProductChangeBuilder removeProductChangeBuilder() {
       return com.commercetools.history.models.change.RemoveProductChangeBuilder.of();
    }
    public com.commercetools.history.models.change.RemovePropertyChangeBuilder removePropertyChangeBuilder() {
       return com.commercetools.history.models.change.RemovePropertyChangeBuilder.of();
    }
    public com.commercetools.history.models.change.RemoveShippingAddressIdChangeBuilder removeShippingAddressIdChangeBuilder() {
       return com.commercetools.history.models.change.RemoveShippingAddressIdChangeBuilder.of();
    }
    public com.commercetools.history.models.change.RemoveShoppingListLineItemChangeBuilder removeShoppingListLineItemChangeBuilder() {
       return com.commercetools.history.models.change.RemoveShoppingListLineItemChangeBuilder.of();
    }
    public com.commercetools.history.models.change.RemoveStateRolesChangeBuilder removeStateRolesChangeBuilder() {
       return com.commercetools.history.models.change.RemoveStateRolesChangeBuilder.of();
    }
    public com.commercetools.history.models.change.RemoveTaxRateChangeBuilder removeTaxRateChangeBuilder() {
       return com.commercetools.history.models.change.RemoveTaxRateChangeBuilder.of();
    }
    public com.commercetools.history.models.change.RemoveTextLineItemChangeBuilder removeTextLineItemChangeBuilder() {
       return com.commercetools.history.models.change.RemoveTextLineItemChangeBuilder.of();
    }
    public com.commercetools.history.models.change.RemoveVariantChangeBuilder removeVariantChangeBuilder() {
       return com.commercetools.history.models.change.RemoveVariantChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetAddressChangeBuilder setAddressChangeBuilder() {
       return com.commercetools.history.models.change.SetAddressChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetAnonymousIdChangeBuilder setAnonymousIdChangeBuilder() {
       return com.commercetools.history.models.change.SetAnonymousIdChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetApplicationVersionChangeBuilder setApplicationVersionChangeBuilder() {
       return com.commercetools.history.models.change.SetApplicationVersionChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetAssetCustomFieldChangeBuilder setAssetCustomFieldChangeBuilder() {
       return com.commercetools.history.models.change.SetAssetCustomFieldChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetAssetCustomTypeChangeBuilder setAssetCustomTypeChangeBuilder() {
       return com.commercetools.history.models.change.SetAssetCustomTypeChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetAssetDescriptionChangeBuilder setAssetDescriptionChangeBuilder() {
       return com.commercetools.history.models.change.SetAssetDescriptionChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetAssetKeyChangeBuilder setAssetKeyChangeBuilder() {
       return com.commercetools.history.models.change.SetAssetKeyChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetAssetSourcesChangeBuilder setAssetSourcesChangeBuilder() {
       return com.commercetools.history.models.change.SetAssetSourcesChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetAssetTagsChangeBuilder setAssetTagsChangeBuilder() {
       return com.commercetools.history.models.change.SetAssetTagsChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetAttributeChangeBuilder setAttributeChangeBuilder() {
       return com.commercetools.history.models.change.SetAttributeChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetAuthenticationModeChangeBuilder setAuthenticationModeChangeBuilder() {
       return com.commercetools.history.models.change.SetAuthenticationModeChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetAuthorNameChangeBuilder setAuthorNameChangeBuilder() {
       return com.commercetools.history.models.change.SetAuthorNameChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetBillingAddressChangeBuilder setBillingAddressChangeBuilder() {
       return com.commercetools.history.models.change.SetBillingAddressChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetCartPredicateChangeBuilder setCartPredicateChangeBuilder() {
       return com.commercetools.history.models.change.SetCartPredicateChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetCategoryOrderHintChangeBuilder setCategoryOrderHintChangeBuilder() {
       return com.commercetools.history.models.change.SetCategoryOrderHintChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetChannelRolesChangeBuilder setChannelRolesChangeBuilder() {
       return com.commercetools.history.models.change.SetChannelRolesChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetCompanyNameChangeBuilder setCompanyNameChangeBuilder() {
       return com.commercetools.history.models.change.SetCompanyNameChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetCountriesChangeBuilder setCountriesChangeBuilder() {
       return com.commercetools.history.models.change.SetCountriesChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetCountryChangeBuilder setCountryChangeBuilder() {
       return com.commercetools.history.models.change.SetCountryChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetCustomFieldChangeBuilder setCustomFieldChangeBuilder() {
       return com.commercetools.history.models.change.SetCustomFieldChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetCustomLineItemCustomFieldChangeBuilder setCustomLineItemCustomFieldChangeBuilder() {
       return com.commercetools.history.models.change.SetCustomLineItemCustomFieldChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetCustomLineItemCustomTypeChangeBuilder setCustomLineItemCustomTypeChangeBuilder() {
       return com.commercetools.history.models.change.SetCustomLineItemCustomTypeChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetCustomLineItemMoneyChangeBuilder setCustomLineItemMoneyChangeBuilder() {
       return com.commercetools.history.models.change.SetCustomLineItemMoneyChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetCustomLineItemShippingDetailsChangeBuilder setCustomLineItemShippingDetailsChangeBuilder() {
       return com.commercetools.history.models.change.SetCustomLineItemShippingDetailsChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetCustomLineItemTaxAmountChangeBuilder setCustomLineItemTaxAmountChangeBuilder() {
       return com.commercetools.history.models.change.SetCustomLineItemTaxAmountChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetCustomLineItemTaxCategoryChangeBuilder setCustomLineItemTaxCategoryChangeBuilder() {
       return com.commercetools.history.models.change.SetCustomLineItemTaxCategoryChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetCustomLineItemTaxRateChangeBuilder setCustomLineItemTaxRateChangeBuilder() {
       return com.commercetools.history.models.change.SetCustomLineItemTaxRateChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetCustomLineItemTaxedPriceChangeBuilder setCustomLineItemTaxedPriceChangeBuilder() {
       return com.commercetools.history.models.change.SetCustomLineItemTaxedPriceChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetCustomLineItemTotalPriceChangeBuilder setCustomLineItemTotalPriceChangeBuilder() {
       return com.commercetools.history.models.change.SetCustomLineItemTotalPriceChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetCustomShippingMethodChangeBuilder setCustomShippingMethodChangeBuilder() {
       return com.commercetools.history.models.change.SetCustomShippingMethodChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetCustomTypeChangeBuilder setCustomTypeChangeBuilder() {
       return com.commercetools.history.models.change.SetCustomTypeChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetCustomerChangeBuilder setCustomerChangeBuilder() {
       return com.commercetools.history.models.change.SetCustomerChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetCustomerEmailChangeBuilder setCustomerEmailChangeBuilder() {
       return com.commercetools.history.models.change.SetCustomerEmailChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetCustomerGroupChangeBuilder setCustomerGroupChangeBuilder() {
       return com.commercetools.history.models.change.SetCustomerGroupChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetCustomerIdChangeBuilder setCustomerIdChangeBuilder() {
       return com.commercetools.history.models.change.SetCustomerIdChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetCustomerNumberChangeBuilder setCustomerNumberChangeBuilder() {
       return com.commercetools.history.models.change.SetCustomerNumberChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetDateOfBirthChangeBuilder setDateOfBirthChangeBuilder() {
       return com.commercetools.history.models.change.SetDateOfBirthChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetDefaultBillingAddressChangeBuilder setDefaultBillingAddressChangeBuilder() {
       return com.commercetools.history.models.change.SetDefaultBillingAddressChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetDefaultShippingAddressChangeBuilder setDefaultShippingAddressChangeBuilder() {
       return com.commercetools.history.models.change.SetDefaultShippingAddressChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetDeleteDaysAfterLastModificationChangeBuilder setDeleteDaysAfterLastModificationChangeBuilder() {
       return com.commercetools.history.models.change.SetDeleteDaysAfterLastModificationChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetDeliveryAddressChangeBuilder setDeliveryAddressChangeBuilder() {
       return com.commercetools.history.models.change.SetDeliveryAddressChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetDeliveryItemsChangeBuilder setDeliveryItemsChangeBuilder() {
       return com.commercetools.history.models.change.SetDeliveryItemsChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetDescriptionChangeBuilder setDescriptionChangeBuilder() {
       return com.commercetools.history.models.change.SetDescriptionChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetDiscountedPriceChangeBuilder setDiscountedPriceChangeBuilder() {
       return com.commercetools.history.models.change.SetDiscountedPriceChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetDistributionChannelsChangeBuilder setDistributionChannelsChangeBuilder() {
       return com.commercetools.history.models.change.SetDistributionChannelsChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetExpectedDeliveryChangeBuilder setExpectedDeliveryChangeBuilder() {
       return com.commercetools.history.models.change.SetExpectedDeliveryChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetExternalIdChangeBuilder setExternalIdChangeBuilder() {
       return com.commercetools.history.models.change.SetExternalIdChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetFirstNameChangeBuilder setFirstNameChangeBuilder() {
       return com.commercetools.history.models.change.SetFirstNameChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetGeoLocationChangeBuilder setGeoLocationChangeBuilder() {
       return com.commercetools.history.models.change.SetGeoLocationChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetImageLabelChangeBuilder setImageLabelChangeBuilder() {
       return com.commercetools.history.models.change.SetImageLabelChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetInputTipChangeBuilder setInputTipChangeBuilder() {
       return com.commercetools.history.models.change.SetInputTipChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetInterfaceIdChangeBuilder setInterfaceIdChangeBuilder() {
       return com.commercetools.history.models.change.SetInterfaceIdChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetIsValidChangeBuilder setIsValidChangeBuilder() {
       return com.commercetools.history.models.change.SetIsValidChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetKeyChangeBuilder setKeyChangeBuilder() {
       return com.commercetools.history.models.change.SetKeyChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetLanguagesChangeBuilder setLanguagesChangeBuilder() {
       return com.commercetools.history.models.change.SetLanguagesChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetLastNameChangeBuilder setLastNameChangeBuilder() {
       return com.commercetools.history.models.change.SetLastNameChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetLineItemDeactivatedAtChangeBuilder setLineItemDeactivatedAtChangeBuilder() {
       return com.commercetools.history.models.change.SetLineItemDeactivatedAtChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetLineItemDiscountedPriceChangeBuilder setLineItemDiscountedPriceChangeBuilder() {
       return com.commercetools.history.models.change.SetLineItemDiscountedPriceChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetLineItemDiscountedPricePerQuantityChangeBuilder setLineItemDiscountedPricePerQuantityChangeBuilder() {
       return com.commercetools.history.models.change.SetLineItemDiscountedPricePerQuantityChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetLineItemDistributionChannelChangeBuilder setLineItemDistributionChannelChangeBuilder() {
       return com.commercetools.history.models.change.SetLineItemDistributionChannelChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetLineItemPriceChangeBuilder setLineItemPriceChangeBuilder() {
       return com.commercetools.history.models.change.SetLineItemPriceChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetLineItemProductKeyChangeBuilder setLineItemProductKeyChangeBuilder() {
       return com.commercetools.history.models.change.SetLineItemProductKeyChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetLineItemProductSlugChangeBuilder setLineItemProductSlugChangeBuilder() {
       return com.commercetools.history.models.change.SetLineItemProductSlugChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetLineItemShippingDetailsChangeBuilder setLineItemShippingDetailsChangeBuilder() {
       return com.commercetools.history.models.change.SetLineItemShippingDetailsChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetLineItemTaxAmountChangeBuilder setLineItemTaxAmountChangeBuilder() {
       return com.commercetools.history.models.change.SetLineItemTaxAmountChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetLineItemTaxRateChangeBuilder setLineItemTaxRateChangeBuilder() {
       return com.commercetools.history.models.change.SetLineItemTaxRateChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetLineItemTaxedPriceChangeBuilder setLineItemTaxedPriceChangeBuilder() {
       return com.commercetools.history.models.change.SetLineItemTaxedPriceChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetLineItemTotalPriceChangeBuilder setLineItemTotalPriceChangeBuilder() {
       return com.commercetools.history.models.change.SetLineItemTotalPriceChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetLocaleChangeBuilder setLocaleChangeBuilder() {
       return com.commercetools.history.models.change.SetLocaleChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetLocalizedDescriptionChangeBuilder setLocalizedDescriptionChangeBuilder() {
       return com.commercetools.history.models.change.SetLocalizedDescriptionChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetMaxApplicationsChangeBuilder setMaxApplicationsChangeBuilder() {
       return com.commercetools.history.models.change.SetMaxApplicationsChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetMaxApplicationsPerCustomerChangeBuilder setMaxApplicationsPerCustomerChangeBuilder() {
       return com.commercetools.history.models.change.SetMaxApplicationsPerCustomerChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetMetaDescriptionChangeBuilder setMetaDescriptionChangeBuilder() {
       return com.commercetools.history.models.change.SetMetaDescriptionChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetMetaKeywordsChangeBuilder setMetaKeywordsChangeBuilder() {
       return com.commercetools.history.models.change.SetMetaKeywordsChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetMetaTitleChangeBuilder setMetaTitleChangeBuilder() {
       return com.commercetools.history.models.change.SetMetaTitleChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetMethodInfoInterfaceChangeBuilder setMethodInfoInterfaceChangeBuilder() {
       return com.commercetools.history.models.change.SetMethodInfoInterfaceChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetMethodInfoMethodChangeBuilder setMethodInfoMethodChangeBuilder() {
       return com.commercetools.history.models.change.SetMethodInfoMethodChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetMethodInfoNameChangeBuilder setMethodInfoNameChangeBuilder() {
       return com.commercetools.history.models.change.SetMethodInfoNameChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetMiddleNameChangeBuilder setMiddleNameChangeBuilder() {
       return com.commercetools.history.models.change.SetMiddleNameChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetNameChangeBuilder setNameChangeBuilder() {
       return com.commercetools.history.models.change.SetNameChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetOrderLineItemCustomFieldChangeBuilder setOrderLineItemCustomFieldChangeBuilder() {
       return com.commercetools.history.models.change.SetOrderLineItemCustomFieldChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetOrderLineItemCustomTypeChangeBuilder setOrderLineItemCustomTypeChangeBuilder() {
       return com.commercetools.history.models.change.SetOrderLineItemCustomTypeChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetOrderNumberChangeBuilder setOrderNumberChangeBuilder() {
       return com.commercetools.history.models.change.SetOrderNumberChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetOrderTaxedPriceChangeBuilder setOrderTaxedPriceChangeBuilder() {
       return com.commercetools.history.models.change.SetOrderTaxedPriceChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetOrderTotalPriceChangeBuilder setOrderTotalPriceChangeBuilder() {
       return com.commercetools.history.models.change.SetOrderTotalPriceChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetOrderTotalTaxChangeBuilder setOrderTotalTaxChangeBuilder() {
       return com.commercetools.history.models.change.SetOrderTotalTaxChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetParcelItemsChangeBuilder setParcelItemsChangeBuilder() {
       return com.commercetools.history.models.change.SetParcelItemsChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetParcelMeasurementsChangeBuilder setParcelMeasurementsChangeBuilder() {
       return com.commercetools.history.models.change.SetParcelMeasurementsChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetParcelTrackingDataChangeBuilder setParcelTrackingDataChangeBuilder() {
       return com.commercetools.history.models.change.SetParcelTrackingDataChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetPricesChangeBuilder setPricesChangeBuilder() {
       return com.commercetools.history.models.change.SetPricesChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetProductCountChangeBuilder setProductCountChangeBuilder() {
       return com.commercetools.history.models.change.SetProductCountChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetProductPriceCustomFieldChangeBuilder setProductPriceCustomFieldChangeBuilder() {
       return com.commercetools.history.models.change.SetProductPriceCustomFieldChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetProductPriceCustomTypeChangeBuilder setProductPriceCustomTypeChangeBuilder() {
       return com.commercetools.history.models.change.SetProductPriceCustomTypeChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetProductSelectionsChangeBuilder setProductSelectionsChangeBuilder() {
       return com.commercetools.history.models.change.SetProductSelectionsChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetProductVariantKeyChangeBuilder setProductVariantKeyChangeBuilder() {
       return com.commercetools.history.models.change.SetProductVariantKeyChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetPropertyChangeBuilder setPropertyChangeBuilder() {
       return com.commercetools.history.models.change.SetPropertyChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetPurchaseOrderNumberChangeBuilder setPurchaseOrderNumberChangeBuilder() {
       return com.commercetools.history.models.change.SetPurchaseOrderNumberChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetRatingChangeBuilder setRatingChangeBuilder() {
       return com.commercetools.history.models.change.SetRatingChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetReservationsChangeBuilder setReservationsChangeBuilder() {
       return com.commercetools.history.models.change.SetReservationsChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetRestockableInDaysChangeBuilder setRestockableInDaysChangeBuilder() {
       return com.commercetools.history.models.change.SetRestockableInDaysChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetReturnPaymentStateChangeBuilder setReturnPaymentStateChangeBuilder() {
       return com.commercetools.history.models.change.SetReturnPaymentStateChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetReturnShipmentStateChangeBuilder setReturnShipmentStateChangeBuilder() {
       return com.commercetools.history.models.change.SetReturnShipmentStateChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetSalutationChangeBuilder setSalutationChangeBuilder() {
       return com.commercetools.history.models.change.SetSalutationChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetSearchKeywordsChangeBuilder setSearchKeywordsChangeBuilder() {
       return com.commercetools.history.models.change.SetSearchKeywordsChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetSellerCommentChangeBuilder setSellerCommentChangeBuilder() {
       return com.commercetools.history.models.change.SetSellerCommentChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetShippingAddressChangeBuilder setShippingAddressChangeBuilder() {
       return com.commercetools.history.models.change.SetShippingAddressChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetShippingInfoPriceChangeBuilder setShippingInfoPriceChangeBuilder() {
       return com.commercetools.history.models.change.SetShippingInfoPriceChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetShippingInfoTaxedPriceChangeBuilder setShippingInfoTaxedPriceChangeBuilder() {
       return com.commercetools.history.models.change.SetShippingInfoTaxedPriceChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetShippingMethodChangeBuilder setShippingMethodChangeBuilder() {
       return com.commercetools.history.models.change.SetShippingMethodChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetShippingMethodTaxAmountChangeBuilder setShippingMethodTaxAmountChangeBuilder() {
       return com.commercetools.history.models.change.SetShippingMethodTaxAmountChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetShippingMethodTaxRateChangeBuilder setShippingMethodTaxRateChangeBuilder() {
       return com.commercetools.history.models.change.SetShippingMethodTaxRateChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetShippingRateChangeBuilder setShippingRateChangeBuilder() {
       return com.commercetools.history.models.change.SetShippingRateChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetShippingRateInputChangeBuilder setShippingRateInputChangeBuilder() {
       return com.commercetools.history.models.change.SetShippingRateInputChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetShoppingListLineItemCustomFieldChangeBuilder setShoppingListLineItemCustomFieldChangeBuilder() {
       return com.commercetools.history.models.change.SetShoppingListLineItemCustomFieldChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetShoppingListLineItemCustomTypeChangeBuilder setShoppingListLineItemCustomTypeChangeBuilder() {
       return com.commercetools.history.models.change.SetShoppingListLineItemCustomTypeChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetSkuChangeBuilder setSkuChangeBuilder() {
       return com.commercetools.history.models.change.SetSkuChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetSlugChangeBuilder setSlugChangeBuilder() {
       return com.commercetools.history.models.change.SetSlugChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetStateRolesChangeBuilder setStateRolesChangeBuilder() {
       return com.commercetools.history.models.change.SetStateRolesChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetStatusInterfaceCodeChangeBuilder setStatusInterfaceCodeChangeBuilder() {
       return com.commercetools.history.models.change.SetStatusInterfaceCodeChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetStatusInterfaceTextChangeBuilder setStatusInterfaceTextChangeBuilder() {
       return com.commercetools.history.models.change.SetStatusInterfaceTextChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetStoreChangeBuilder setStoreChangeBuilder() {
       return com.commercetools.history.models.change.SetStoreChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetStoresChangeBuilder setStoresChangeBuilder() {
       return com.commercetools.history.models.change.SetStoresChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetSupplyChannelChangeBuilder setSupplyChannelChangeBuilder() {
       return com.commercetools.history.models.change.SetSupplyChannelChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetSupplyChannelsChangeBuilder setSupplyChannelsChangeBuilder() {
       return com.commercetools.history.models.change.SetSupplyChannelsChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetTargetChangeBuilder setTargetChangeBuilder() {
       return com.commercetools.history.models.change.SetTargetChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetTaxCategoryChangeBuilder setTaxCategoryChangeBuilder() {
       return com.commercetools.history.models.change.SetTaxCategoryChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetTextChangeBuilder setTextChangeBuilder() {
       return com.commercetools.history.models.change.SetTextChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetTextLineItemCustomFieldChangeBuilder setTextLineItemCustomFieldChangeBuilder() {
       return com.commercetools.history.models.change.SetTextLineItemCustomFieldChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetTextLineItemCustomTypeChangeBuilder setTextLineItemCustomTypeChangeBuilder() {
       return com.commercetools.history.models.change.SetTextLineItemCustomTypeChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetTextLineItemDescriptionChangeBuilder setTextLineItemDescriptionChangeBuilder() {
       return com.commercetools.history.models.change.SetTextLineItemDescriptionChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetTitleChangeBuilder setTitleChangeBuilder() {
       return com.commercetools.history.models.change.SetTitleChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetTransitionsChangeBuilder setTransitionsChangeBuilder() {
       return com.commercetools.history.models.change.SetTransitionsChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetValidFromAndUntilChangeBuilder setValidFromAndUntilChangeBuilder() {
       return com.commercetools.history.models.change.SetValidFromAndUntilChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetValidFromChangeBuilder setValidFromChangeBuilder() {
       return com.commercetools.history.models.change.SetValidFromChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetValidToChangeBuilder setValidToChangeBuilder() {
       return com.commercetools.history.models.change.SetValidToChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetValidUntilChangeBuilder setValidUntilChangeBuilder() {
       return com.commercetools.history.models.change.SetValidUntilChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetValueChangeBuilder setValueChangeBuilder() {
       return com.commercetools.history.models.change.SetValueChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetVariantAvailabilityChangeBuilder setVariantAvailabilityChangeBuilder() {
       return com.commercetools.history.models.change.SetVariantAvailabilityChangeBuilder.of();
    }
    public com.commercetools.history.models.change.SetVatIdChangeBuilder setVatIdChangeBuilder() {
       return com.commercetools.history.models.change.SetVatIdChangeBuilder.of();
    }
    public com.commercetools.history.models.change.TransitionCustomLineItemStateChangeBuilder transitionCustomLineItemStateChangeBuilder() {
       return com.commercetools.history.models.change.TransitionCustomLineItemStateChangeBuilder.of();
    }
    public com.commercetools.history.models.change.TransitionLineItemStateChangeBuilder transitionLineItemStateChangeBuilder() {
       return com.commercetools.history.models.change.TransitionLineItemStateChangeBuilder.of();
    }
    public com.commercetools.history.models.change.TransitionStateChangeBuilder transitionStateChangeBuilder() {
       return com.commercetools.history.models.change.TransitionStateChangeBuilder.of();
    }
    public com.commercetools.history.models.change.UnknownChangeBuilder unknownChangeBuilder() {
       return com.commercetools.history.models.change.UnknownChangeBuilder.of();
    }
    public com.commercetools.history.models.change.UnpublishChangeBuilder unpublishChangeBuilder() {
       return com.commercetools.history.models.change.UnpublishChangeBuilder.of();
    }
    public com.commercetools.history.models.change.UpdateSyncInfoChangeBuilder updateSyncInfoChangeBuilder() {
       return com.commercetools.history.models.change.UpdateSyncInfoChangeBuilder.of();
    }
    public com.commercetools.history.models.change.VerifyEmailChangeBuilder verifyEmailChangeBuilder() {
       return com.commercetools.history.models.change.VerifyEmailChangeBuilder.of();
    }

    /**
     * factory method for an instance of ChangeBuilder
     * @return builder 
     */
    public static ChangeBuilder of() {
        return new ChangeBuilder();
    }

}
