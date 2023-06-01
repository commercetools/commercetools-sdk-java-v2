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
 *  <p>Base representation of a Message containing common fields to all Message Types.</p>
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class MessageImpl implements Message, ModelBase {

    
    private String id;
    
    
    private Long version;
    
    
    private java.time.ZonedDateTime createdAt;
    
    
    private java.time.ZonedDateTime lastModifiedAt;
    
    
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;
    
    
    private com.commercetools.api.models.common.CreatedBy createdBy;
    
    
    private Long sequenceNumber;
    
    
    private com.commercetools.api.models.common.Reference resource;
    
    
    private Long resourceVersion;
    
    
    private String type;
    
    
    private com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;

    /**
     * create instance with all properties
     */
    @JsonCreator
    MessageImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy, @JsonProperty("sequenceNumber") final Long sequenceNumber, @JsonProperty("resource") final com.commercetools.api.models.common.Reference resource, @JsonProperty("resourceVersion") final Long resourceVersion, @JsonProperty("type") final String type, @JsonProperty("resourceUserProvidedIdentifiers") final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.createdBy = createdBy;
        this.sequenceNumber = sequenceNumber;
        this.resource = resource;
        this.resourceVersion = resourceVersion;
        this.type = type;
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
    }
    /**
     * create empty instance
     */
    public MessageImpl() {
    }

    /**
     *  <p>Unique identifier of the Message. Can be used to track which Messages have been processed.</p>
     */
    
    public String getId(){
        return this.id;
    }
    
    /**
     *  <p>Version of a resource. In case of Messages, this is always <code>1</code>.</p>
     */
    
    public Long getVersion(){
        return this.version;
    }
    
    /**
     *  <p>Date and time (UTC) the Message was generated.</p>
     */
    
    public java.time.ZonedDateTime getCreatedAt(){
        return this.createdAt;
    }
    
    /**
     *  <p>Value of <code>createdAt</code>.</p>
     */
    
    public java.time.ZonedDateTime getLastModifiedAt(){
        return this.lastModifiedAt;
    }
    
    /**
     *  <p>Value of <code>createdBy</code>.</p>
     */
    
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy(){
        return this.lastModifiedBy;
    }
    
    /**
     *  <p>Present on resources created after 1 February 2019 except for events not tracked.</p>
     */
    
    public com.commercetools.api.models.common.CreatedBy getCreatedBy(){
        return this.createdBy;
    }
    
    /**
     *  <p>Message number in relation to other Messages for a given resource. The <code>sequenceNumber</code> of the next Message for the resource is the successor of the <code>sequenceNumber</code> of the current Message. Meaning, the <code>sequenceNumber</code> of the next Message equals the <code>sequenceNumber</code> of the current Message + 1. <code>sequenceNumber</code> can be used to ensure that Messages are processed in the correct order for a particular resource.</p>
     */
    
    public Long getSequenceNumber(){
        return this.sequenceNumber;
    }
    
    /**
     *  <p>Reference to the resource on which the change or action was performed.</p>
     */
    
    public com.commercetools.api.models.common.Reference getResource(){
        return this.resource;
    }
    
    /**
     *  <p>Version of the resource on which the change or action was performed.</p>
     */
    
    public Long getResourceVersion(){
        return this.resourceVersion;
    }
    
    /**
     *  <p>Message Type of the Message.</p>
     */
    
    public String getType(){
        return this.type;
    }
    
    /**
     *  <p>User-provided identifiers of the resource, such as <code>key</code> or <code>externalId</code>. Only present if the resource has such identifiers.</p>
     */
    
    public com.commercetools.api.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers(){
        return this.resourceUserProvidedIdentifiers;
    }

    
    public void setId(final String id){
        this.id = id;
    }
    
    
    public void setVersion(final Long version){
        this.version = version;
    }
    
    
    public void setCreatedAt(final java.time.ZonedDateTime createdAt){
        this.createdAt = createdAt;
    }
    
    
    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
        this.lastModifiedAt = lastModifiedAt;
    }
    
    
    public void setLastModifiedBy(final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy){
        this.lastModifiedBy = lastModifiedBy;
    }
    
    
    public void setCreatedBy(final com.commercetools.api.models.common.CreatedBy createdBy){
        this.createdBy = createdBy;
    }
    
    
    public void setSequenceNumber(final Long sequenceNumber){
        this.sequenceNumber = sequenceNumber;
    }
    
    
    public void setResource(final com.commercetools.api.models.common.Reference resource){
        this.resource = resource;
    }
    
    
    public void setResourceVersion(final Long resourceVersion){
        this.resourceVersion = resourceVersion;
    }
    
    
    public void setResourceUserProvidedIdentifiers(final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers){
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        MessageImpl that = (MessageImpl) o;
    
        return new EqualsBuilder()
                .append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(createdBy, that.createdBy)
                .append(sequenceNumber, that.sequenceNumber)
                .append(resource, that.resource)
                .append(resourceVersion, that.resourceVersion)
                .append(type, that.type)
                .append(resourceUserProvidedIdentifiers, that.resourceUserProvidedIdentifiers)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(id)
            .append(version)
            .append(createdAt)
            .append(lastModifiedAt)
            .append(lastModifiedBy)
            .append(createdBy)
            .append(sequenceNumber)
            .append(resource)
            .append(resourceVersion)
            .append(type)
            .append(resourceUserProvidedIdentifiers)
            .toHashCode();
    }

}
