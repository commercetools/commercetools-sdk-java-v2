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
 * MessagePayload
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MessagePayloadImpl implements MessagePayload, ModelBase {

    
    private String type;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MessagePayloadImpl(@JsonProperty("type") final String type) {
        this.type = type;
    }
    /**
     * create empty instance
     */
    public MessagePayloadImpl() {
    }

    /**
     *
     */
    
    public String getType(){
        return this.type;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        MessagePayloadImpl that = (MessagePayloadImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .toHashCode();
    }

}
