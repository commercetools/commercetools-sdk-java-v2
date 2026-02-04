
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

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
 *             nextValue(nextValueBuilder -> nextValueBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
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
     *  <p>Change type on a resource that is similar to the update action it relates to, where possible. It is not a unique identifier for the data structure, for example, the <code>setDescription</code> change can occur with a localized and non-localized representation.</p>
     *  <p><a href="https://docs.commercetools.com/apis/ctp:history:type:Record" rel="nofollow">Records</a> can be filtered by this value using the <code>changes</code> query parameter.</p>
     * @return change
     */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
     *  <p>Change type on a resource that is similar to the update action it relates to, where possible. It is not a unique identifier for the data structure, for example, the <code>setDescription</code> change can occur with a localized and non-localized representation.</p>
     *  <p><a href="https://docs.commercetools.com/apis/ctp:history:type:Record" rel="nofollow">Records</a> can be filtered by this value using the <code>changes</code> query parameter.</p>
     * @param change value to be set
     */

    public void setChange(final String change);

    public Change copyDeep();

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

        if (!(template instanceof ChangeImpl)) {
            return template.copyDeep();
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
     * builder for addInheritedAssociateChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.AddInheritedAssociateChangeBuilder addInheritedAssociateChangeBuilder() {
        return com.commercetools.history.models.change.AddInheritedAssociateChangeBuilder.of();
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
     * builder for addShippingChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.AddShippingChangeBuilder addShippingChangeBuilder() {
        return com.commercetools.history.models.change.AddShippingChangeBuilder.of();
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
     * builder for changeApprovalRuleModeChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeApprovalRuleModeChangeBuilder changeApprovalRuleModeChangeBuilder() {
        return com.commercetools.history.models.change.ChangeApprovalRuleModeChangeBuilder.of();
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
     * builder for changeBuyerAssignableChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeBuyerAssignableChangeBuilder changeBuyerAssignableChangeBuilder() {
        return com.commercetools.history.models.change.ChangeBuyerAssignableChangeBuilder.of();
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
     * builder for changeCustomLineItemPriceRoundingModeChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeCustomLineItemPriceRoundingModeChangeBuilder changeCustomLineItemPriceRoundingModeChangeBuilder() {
        return com.commercetools.history.models.change.ChangeCustomLineItemPriceRoundingModeChangeBuilder.of();
    }

    /**
     * builder for changeCustomLineItemQuantityChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeCustomLineItemQuantityChangeBuilder changeCustomLineItemQuantityChangeBuilder() {
        return com.commercetools.history.models.change.ChangeCustomLineItemQuantityChangeBuilder.of();
    }

    /**
     * builder for changeCustomerChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeCustomerChangeBuilder changeCustomerChangeBuilder() {
        return com.commercetools.history.models.change.ChangeCustomerChangeBuilder.of();
    }

    /**
     * builder for changeDescriptionChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeDescriptionChangeBuilder changeDescriptionChangeBuilder() {
        return com.commercetools.history.models.change.ChangeDescriptionChangeBuilder.of();
    }

    /**
     * builder for changeDiscountTypeCombinationChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeDiscountTypeCombinationChangeBuilder changeDiscountTypeCombinationChangeBuilder() {
        return com.commercetools.history.models.change.ChangeDiscountTypeCombinationChangeBuilder.of();
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
     * builder for changeIncludedInStatisticsChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeIncludedInStatisticsChangeBuilder changeIncludedInStatisticsChangeBuilder() {
        return com.commercetools.history.models.change.ChangeIncludedInStatisticsChangeBuilder.of();
    }

    /**
     * builder for changeInheritedAssociateChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeInheritedAssociateChangeBuilder changeInheritedAssociateChangeBuilder() {
        return com.commercetools.history.models.change.ChangeInheritedAssociateChangeBuilder.of();
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
     * builder for changeLastVariantIdChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeLastVariantIdChangeBuilder changeLastVariantIdChangeBuilder() {
        return com.commercetools.history.models.change.ChangeLastVariantIdChangeBuilder.of();
    }

    /**
     * builder for changeLineItemNameChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeLineItemNameChangeBuilder changeLineItemNameChangeBuilder() {
        return com.commercetools.history.models.change.ChangeLineItemNameChangeBuilder.of();
    }

    /**
     * builder for changeLineItemPriceRoundingModeChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeLineItemPriceRoundingModeChangeBuilder changeLineItemPriceRoundingModeChangeBuilder() {
        return com.commercetools.history.models.change.ChangeLineItemPriceRoundingModeChangeBuilder.of();
    }

    /**
     * builder for changeLineItemPublishedChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeLineItemPublishedChangeBuilder changeLineItemPublishedChangeBuilder() {
        return com.commercetools.history.models.change.ChangeLineItemPublishedChangeBuilder.of();
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
     * builder for changePriceRoundingModeChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangePriceRoundingModeChangeBuilder changePriceRoundingModeChangeBuilder() {
        return com.commercetools.history.models.change.ChangePriceRoundingModeChangeBuilder.of();
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
     * builder for changeTopLevelUnitChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ChangeTopLevelUnitChangeBuilder changeTopLevelUnitChangeBuilder() {
        return com.commercetools.history.models.change.ChangeTopLevelUnitChangeBuilder.of();
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
     * builder for excludeProductChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ExcludeProductChangeBuilder excludeProductChangeBuilder() {
        return com.commercetools.history.models.change.ExcludeProductChangeBuilder.of();
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
     * builder for removeInheritedAssociateChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.RemoveInheritedAssociateChangeBuilder removeInheritedAssociateChangeBuilder() {
        return com.commercetools.history.models.change.RemoveInheritedAssociateChangeBuilder.of();
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
     * builder for removeShippingChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.RemoveShippingChangeBuilder removeShippingChangeBuilder() {
        return com.commercetools.history.models.change.RemoveShippingChangeBuilder.of();
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
     * builder for replaceTaxRateChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ReplaceTaxRateChangeBuilder replaceTaxRateChangeBuilder() {
        return com.commercetools.history.models.change.ReplaceTaxRateChangeBuilder.of();
    }

    /**
     * builder for requestQuoteRenegotiationChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.RequestQuoteRenegotiationChangeBuilder requestQuoteRenegotiationChangeBuilder() {
        return com.commercetools.history.models.change.RequestQuoteRenegotiationChangeBuilder.of();
    }

    /**
     * builder for revertStagedChangesChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.RevertStagedChangesChangeBuilder revertStagedChangesChangeBuilder() {
        return com.commercetools.history.models.change.RevertStagedChangesChangeBuilder.of();
    }

    /**
     * builder for revertStagedVariantChangesChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.RevertStagedVariantChangesChangeBuilder revertStagedVariantChangesChangeBuilder() {
        return com.commercetools.history.models.change.RevertStagedVariantChangesChangeBuilder.of();
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
     * builder for setAncestorsChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetAncestorsChangeBuilder setAncestorsChangeBuilder() {
        return com.commercetools.history.models.change.SetAncestorsChangeBuilder.of();
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
     * builder for setAssociatesChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetAssociatesChangeBuilder setAssociatesChangeBuilder() {
        return com.commercetools.history.models.change.SetAssociatesChangeBuilder.of();
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
     * builder for setBillingAddressCustomFieldChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetBillingAddressCustomFieldChangeBuilder setBillingAddressCustomFieldChangeBuilder() {
        return com.commercetools.history.models.change.SetBillingAddressCustomFieldChangeBuilder.of();
    }

    /**
     * builder for setBillingAddressCustomTypeChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetBillingAddressCustomTypeChangeBuilder setBillingAddressCustomTypeChangeBuilder() {
        return com.commercetools.history.models.change.SetBillingAddressCustomTypeChangeBuilder.of();
    }

    /**
     * builder for setBusinessUnitChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetBusinessUnitChangeBuilder setBusinessUnitChangeBuilder() {
        return com.commercetools.history.models.change.SetBusinessUnitChangeBuilder.of();
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
     * builder for setCustomLineItemDiscountedPriceChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetCustomLineItemDiscountedPriceChangeBuilder setCustomLineItemDiscountedPriceChangeBuilder() {
        return com.commercetools.history.models.change.SetCustomLineItemDiscountedPriceChangeBuilder.of();
    }

    /**
     * builder for setCustomLineItemDiscountedPricePerQuantityChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetCustomLineItemDiscountedPricePerQuantityChangeBuilder setCustomLineItemDiscountedPricePerQuantityChangeBuilder() {
        return com.commercetools.history.models.change.SetCustomLineItemDiscountedPricePerQuantityChangeBuilder.of();
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
     * builder for setCustomerGroupAssignmentsChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetCustomerGroupAssignmentsChangeBuilder setCustomerGroupAssignmentsChangeBuilder() {
        return com.commercetools.history.models.change.SetCustomerGroupAssignmentsChangeBuilder.of();
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
     * builder for setDeliveryAddressCustomFieldChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetDeliveryAddressCustomFieldChangeBuilder setDeliveryAddressCustomFieldChangeBuilder() {
        return com.commercetools.history.models.change.SetDeliveryAddressCustomFieldChangeBuilder.of();
    }

    /**
     * builder for setDeliveryAddressCustomTypeChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetDeliveryAddressCustomTypeChangeBuilder setDeliveryAddressCustomTypeChangeBuilder() {
        return com.commercetools.history.models.change.SetDeliveryAddressCustomTypeChangeBuilder.of();
    }

    /**
     * builder for setDeliveryCustomFieldChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetDeliveryCustomFieldChangeBuilder setDeliveryCustomFieldChangeBuilder() {
        return com.commercetools.history.models.change.SetDeliveryCustomFieldChangeBuilder.of();
    }

    /**
     * builder for setDeliveryCustomTypeChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetDeliveryCustomTypeChangeBuilder setDeliveryCustomTypeChangeBuilder() {
        return com.commercetools.history.models.change.SetDeliveryCustomTypeChangeBuilder.of();
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
     * builder for setDirectDiscountsChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetDirectDiscountsChangeBuilder setDirectDiscountsChangeBuilder() {
        return com.commercetools.history.models.change.SetDirectDiscountsChangeBuilder.of();
    }

    /**
     * builder for setDiscountOnTotalPriceChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetDiscountOnTotalPriceChangeBuilder setDiscountOnTotalPriceChangeBuilder() {
        return com.commercetools.history.models.change.SetDiscountOnTotalPriceChangeBuilder.of();
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
     * builder for setInheritedAssociatesChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetInheritedAssociatesChangeBuilder setInheritedAssociatesChangeBuilder() {
        return com.commercetools.history.models.change.SetInheritedAssociatesChangeBuilder.of();
    }

    /**
     * builder for setInheritedStoresChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetInheritedStoresChangeBuilder setInheritedStoresChangeBuilder() {
        return com.commercetools.history.models.change.SetInheritedStoresChangeBuilder.of();
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
     * builder for setItemShippingAddressCustomFieldChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetItemShippingAddressCustomFieldChangeBuilder setItemShippingAddressCustomFieldChangeBuilder() {
        return com.commercetools.history.models.change.SetItemShippingAddressCustomFieldChangeBuilder.of();
    }

    /**
     * builder for setItemShippingAddressCustomTypeChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetItemShippingAddressCustomTypeChangeBuilder setItemShippingAddressCustomTypeChangeBuilder() {
        return com.commercetools.history.models.change.SetItemShippingAddressCustomTypeChangeBuilder.of();
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
     * builder for setLocalizedNameChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetLocalizedNameChangeBuilder setLocalizedNameChangeBuilder() {
        return com.commercetools.history.models.change.SetLocalizedNameChangeBuilder.of();
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
     * builder for setMaxCartQuantityChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetMaxCartQuantityChangeBuilder setMaxCartQuantityChangeBuilder() {
        return com.commercetools.history.models.change.SetMaxCartQuantityChangeBuilder.of();
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
     * builder for setMinCartQuantityChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetMinCartQuantityChangeBuilder setMinCartQuantityChangeBuilder() {
        return com.commercetools.history.models.change.SetMinCartQuantityChangeBuilder.of();
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
     * builder for setParcelCustomFieldChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetParcelCustomFieldChangeBuilder setParcelCustomFieldChangeBuilder() {
        return com.commercetools.history.models.change.SetParcelCustomFieldChangeBuilder.of();
    }

    /**
     * builder for setParcelCustomTypeChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetParcelCustomTypeChangeBuilder setParcelCustomTypeChangeBuilder() {
        return com.commercetools.history.models.change.SetParcelCustomTypeChangeBuilder.of();
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
     * builder for setPasswordChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetPasswordChangeBuilder setPasswordChangeBuilder() {
        return com.commercetools.history.models.change.SetPasswordChangeBuilder.of();
    }

    /**
     * builder for setPermissionsChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetPermissionsChangeBuilder setPermissionsChangeBuilder() {
        return com.commercetools.history.models.change.SetPermissionsChangeBuilder.of();
    }

    /**
     * builder for setPriceKeyChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetPriceKeyChangeBuilder setPriceKeyChangeBuilder() {
        return com.commercetools.history.models.change.SetPriceKeyChangeBuilder.of();
    }

    /**
     * builder for setPriceModeChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetPriceModeChangeBuilder setPriceModeChangeBuilder() {
        return com.commercetools.history.models.change.SetPriceModeChangeBuilder.of();
    }

    /**
     * builder for setPricesChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetPricesChangeBuilder setPricesChangeBuilder() {
        return com.commercetools.history.models.change.SetPricesChangeBuilder.of();
    }

    /**
     * builder for setProductAttributeChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetProductAttributeChangeBuilder setProductAttributeChangeBuilder() {
        return com.commercetools.history.models.change.SetProductAttributeChangeBuilder.of();
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
     * builder for setReferencesChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetReferencesChangeBuilder setReferencesChangeBuilder() {
        return com.commercetools.history.models.change.SetReferencesChangeBuilder.of();
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
     * builder for setReturnInfoChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetReturnInfoChangeBuilder setReturnInfoChangeBuilder() {
        return com.commercetools.history.models.change.SetReturnInfoChangeBuilder.of();
    }

    /**
     * builder for setReturnItemCustomLineItemCustomFieldChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetReturnItemCustomLineItemCustomFieldChangeBuilder setReturnItemCustomLineItemCustomFieldChangeBuilder() {
        return com.commercetools.history.models.change.SetReturnItemCustomLineItemCustomFieldChangeBuilder.of();
    }

    /**
     * builder for setReturnItemCustomLineItemCustomTypeChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetReturnItemCustomLineItemCustomTypeChangeBuilder setReturnItemCustomLineItemCustomTypeChangeBuilder() {
        return com.commercetools.history.models.change.SetReturnItemCustomLineItemCustomTypeChangeBuilder.of();
    }

    /**
     * builder for setReturnItemLineItemCustomFieldChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetReturnItemLineItemCustomFieldChangeBuilder setReturnItemLineItemCustomFieldChangeBuilder() {
        return com.commercetools.history.models.change.SetReturnItemLineItemCustomFieldChangeBuilder.of();
    }

    /**
     * builder for setReturnItemLineItemCustomTypeChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetReturnItemLineItemCustomTypeChangeBuilder setReturnItemLineItemCustomTypeChangeBuilder() {
        return com.commercetools.history.models.change.SetReturnItemLineItemCustomTypeChangeBuilder.of();
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
     * builder for setShippingAddressCustomFieldChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetShippingAddressCustomFieldChangeBuilder setShippingAddressCustomFieldChangeBuilder() {
        return com.commercetools.history.models.change.SetShippingAddressCustomFieldChangeBuilder.of();
    }

    /**
     * builder for setShippingAddressCustomTypeChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetShippingAddressCustomTypeChangeBuilder setShippingAddressCustomTypeChangeBuilder() {
        return com.commercetools.history.models.change.SetShippingAddressCustomTypeChangeBuilder.of();
    }

    /**
     * builder for setShippingCustomFieldChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetShippingCustomFieldChangeBuilder setShippingCustomFieldChangeBuilder() {
        return com.commercetools.history.models.change.SetShippingCustomFieldChangeBuilder.of();
    }

    /**
     * builder for setShippingCustomTypeChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetShippingCustomTypeChangeBuilder setShippingCustomTypeChangeBuilder() {
        return com.commercetools.history.models.change.SetShippingCustomTypeChangeBuilder.of();
    }

    /**
     * builder for setShippingInfoDiscountedPriceChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetShippingInfoDiscountedPriceChangeBuilder setShippingInfoDiscountedPriceChangeBuilder() {
        return com.commercetools.history.models.change.SetShippingInfoDiscountedPriceChangeBuilder.of();
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
     * builder for setShippingMethodTaxCategoryChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetShippingMethodTaxCategoryChangeBuilder setShippingMethodTaxCategoryChangeBuilder() {
        return com.commercetools.history.models.change.SetShippingMethodTaxCategoryChangeBuilder.of();
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
     * builder for setTaxedShippingPriceChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetTaxedShippingPriceChangeBuilder setTaxedShippingPriceChangeBuilder() {
        return com.commercetools.history.models.change.SetTaxedShippingPriceChangeBuilder.of();
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
     * builder for setTransactionCustomFieldChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetTransactionCustomFieldChangeBuilder setTransactionCustomFieldChangeBuilder() {
        return com.commercetools.history.models.change.SetTransactionCustomFieldChangeBuilder.of();
    }

    /**
     * builder for setTransactionCustomTypeChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetTransactionCustomTypeChangeBuilder setTransactionCustomTypeChangeBuilder() {
        return com.commercetools.history.models.change.SetTransactionCustomTypeChangeBuilder.of();
    }

    /**
     * builder for setTransitionsChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetTransitionsChangeBuilder setTransitionsChangeBuilder() {
        return com.commercetools.history.models.change.SetTransitionsChangeBuilder.of();
    }

    /**
     * builder for setUnitTypeChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetUnitTypeChangeBuilder setUnitTypeChangeBuilder() {
        return com.commercetools.history.models.change.SetUnitTypeChangeBuilder.of();
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
     * builder for setVariantExclusionChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.SetVariantExclusionChangeBuilder setVariantExclusionChangeBuilder() {
        return com.commercetools.history.models.change.SetVariantExclusionChangeBuilder.of();
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
     * builder for shippingMethodAddShippingRateChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ShippingMethodAddShippingRateChangeBuilder shippingMethodAddShippingRateChangeBuilder() {
        return com.commercetools.history.models.change.ShippingMethodAddShippingRateChangeBuilder.of();
    }

    /**
     * builder for shippingMethodAddZoneChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ShippingMethodAddZoneChangeBuilder shippingMethodAddZoneChangeBuilder() {
        return com.commercetools.history.models.change.ShippingMethodAddZoneChangeBuilder.of();
    }

    /**
     * builder for shippingMethodChangeActiveChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ShippingMethodChangeActiveChangeBuilder shippingMethodChangeActiveChangeBuilder() {
        return com.commercetools.history.models.change.ShippingMethodChangeActiveChangeBuilder.of();
    }

    /**
     * builder for shippingMethodChangeIsDefaultChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ShippingMethodChangeIsDefaultChangeBuilder shippingMethodChangeIsDefaultChangeBuilder() {
        return com.commercetools.history.models.change.ShippingMethodChangeIsDefaultChangeBuilder.of();
    }

    /**
     * builder for shippingMethodChangeNameChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ShippingMethodChangeNameChangeBuilder shippingMethodChangeNameChangeBuilder() {
        return com.commercetools.history.models.change.ShippingMethodChangeNameChangeBuilder.of();
    }

    /**
     * builder for shippingMethodChangeTaxCategoryChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ShippingMethodChangeTaxCategoryChangeBuilder shippingMethodChangeTaxCategoryChangeBuilder() {
        return com.commercetools.history.models.change.ShippingMethodChangeTaxCategoryChangeBuilder.of();
    }

    /**
     * builder for shippingMethodRemoveShippingRateChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ShippingMethodRemoveShippingRateChangeBuilder shippingMethodRemoveShippingRateChangeBuilder() {
        return com.commercetools.history.models.change.ShippingMethodRemoveShippingRateChangeBuilder.of();
    }

    /**
     * builder for shippingMethodRemoveZoneChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ShippingMethodRemoveZoneChangeBuilder shippingMethodRemoveZoneChangeBuilder() {
        return com.commercetools.history.models.change.ShippingMethodRemoveZoneChangeBuilder.of();
    }

    /**
     * builder for shippingMethodSetCustomFieldChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ShippingMethodSetCustomFieldChangeBuilder shippingMethodSetCustomFieldChangeBuilder() {
        return com.commercetools.history.models.change.ShippingMethodSetCustomFieldChangeBuilder.of();
    }

    /**
     * builder for shippingMethodSetCustomTypeChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ShippingMethodSetCustomTypeChangeBuilder shippingMethodSetCustomTypeChangeBuilder() {
        return com.commercetools.history.models.change.ShippingMethodSetCustomTypeChangeBuilder.of();
    }

    /**
     * builder for shippingMethodSetKeyChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ShippingMethodSetKeyChangeBuilder shippingMethodSetKeyChangeBuilder() {
        return com.commercetools.history.models.change.ShippingMethodSetKeyChangeBuilder.of();
    }

    /**
     * builder for shippingMethodSetLocalizedDescriptionChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ShippingMethodSetLocalizedDescriptionChangeBuilder shippingMethodSetLocalizedDescriptionChangeBuilder() {
        return com.commercetools.history.models.change.ShippingMethodSetLocalizedDescriptionChangeBuilder.of();
    }

    /**
     * builder for shippingMethodSetLocalizedNameChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ShippingMethodSetLocalizedNameChangeBuilder shippingMethodSetLocalizedNameChangeBuilder() {
        return com.commercetools.history.models.change.ShippingMethodSetLocalizedNameChangeBuilder.of();
    }

    /**
     * builder for shippingMethodSetPredicateChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.ShippingMethodSetPredicateChangeBuilder shippingMethodSetPredicateChangeBuilder() {
        return com.commercetools.history.models.change.ShippingMethodSetPredicateChangeBuilder.of();
    }

    /**
     * builder for standalonePriceChangeActiveChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.StandalonePriceChangeActiveChangeBuilder standalonePriceChangeActiveChangeBuilder() {
        return com.commercetools.history.models.change.StandalonePriceChangeActiveChangeBuilder.of();
    }

    /**
     * builder for standalonePriceChangeValueChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.StandalonePriceChangeValueChangeBuilder standalonePriceChangeValueChangeBuilder() {
        return com.commercetools.history.models.change.StandalonePriceChangeValueChangeBuilder.of();
    }

    /**
     * builder for standalonePriceSetCustomFieldChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.StandalonePriceSetCustomFieldChangeBuilder standalonePriceSetCustomFieldChangeBuilder() {
        return com.commercetools.history.models.change.StandalonePriceSetCustomFieldChangeBuilder.of();
    }

    /**
     * builder for standalonePriceSetCustomTypeChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.StandalonePriceSetCustomTypeChangeBuilder standalonePriceSetCustomTypeChangeBuilder() {
        return com.commercetools.history.models.change.StandalonePriceSetCustomTypeChangeBuilder.of();
    }

    /**
     * builder for standalonePriceSetDiscountedPriceChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.StandalonePriceSetDiscountedPriceChangeBuilder standalonePriceSetDiscountedPriceChangeBuilder() {
        return com.commercetools.history.models.change.StandalonePriceSetDiscountedPriceChangeBuilder.of();
    }

    /**
     * builder for standalonePriceSetKeyChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.StandalonePriceSetKeyChangeBuilder standalonePriceSetKeyChangeBuilder() {
        return com.commercetools.history.models.change.StandalonePriceSetKeyChangeBuilder.of();
    }

    /**
     * builder for standalonePriceSetPriceTiersChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.StandalonePriceSetPriceTiersChangeBuilder standalonePriceSetPriceTiersChangeBuilder() {
        return com.commercetools.history.models.change.StandalonePriceSetPriceTiersChangeBuilder.of();
    }

    /**
     * builder for standalonePriceSetValidFromAndUntilChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.StandalonePriceSetValidFromAndUntilChangeBuilder standalonePriceSetValidFromAndUntilChangeBuilder() {
        return com.commercetools.history.models.change.StandalonePriceSetValidFromAndUntilChangeBuilder.of();
    }

    /**
     * builder for standalonePriceSetValidFromChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.StandalonePriceSetValidFromChangeBuilder standalonePriceSetValidFromChangeBuilder() {
        return com.commercetools.history.models.change.StandalonePriceSetValidFromChangeBuilder.of();
    }

    /**
     * builder for standalonePriceSetValidUntilChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.StandalonePriceSetValidUntilChangeBuilder standalonePriceSetValidUntilChangeBuilder() {
        return com.commercetools.history.models.change.StandalonePriceSetValidUntilChangeBuilder.of();
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
     * builder for updateItemShippingAddressChange subtype
     * @return builder
     */
    public static com.commercetools.history.models.change.UpdateItemShippingAddressChangeBuilder updateItemShippingAddressChangeBuilder() {
        return com.commercetools.history.models.change.UpdateItemShippingAddressChangeBuilder.of();
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
