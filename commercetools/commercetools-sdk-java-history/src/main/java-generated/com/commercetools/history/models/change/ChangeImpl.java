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
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Change
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ChangeImpl implements Change, ModelBase {

    
    private String type;
    
    
    private String change;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ChangeImpl(@JsonProperty("type") final String type, @JsonProperty("change") final String change) {
        this.type = type;
        this.change = change;
    }
    /**
     * create empty instance
     */
    public ChangeImpl() {
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *
     */
    
    public String getChange(){
        return this.change;
    }

    
    public void setChange(final String change){
        this.change = change;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ChangeImpl that = (ChangeImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .append(change, that.change)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .append(change)
            .toHashCode();
    }

}
