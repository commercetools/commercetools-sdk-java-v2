package com.commercetools.api.models.message;

import com.commercetools.api.models.message.CustomLineItemStateTransitionMessage;
import com.commercetools.api.models.message.DeliveryAddedMessage;
import com.commercetools.api.models.message.DeliveryAddressSetMessage;
import com.commercetools.api.models.message.DeliveryItemsUpdatedMessage;
import com.commercetools.api.models.message.DeliveryRemovedMessage;
import com.commercetools.api.models.message.LineItemStateTransitionMessage;
import com.commercetools.api.models.message.Message;
import com.commercetools.api.models.message.OrderBillingAddressSetMessage;
import com.commercetools.api.models.message.OrderCreatedMessage;
import com.commercetools.api.models.message.OrderCustomLineItemAddedMessage;
import com.commercetools.api.models.message.OrderCustomLineItemDiscountSetMessage;
import com.commercetools.api.models.message.OrderCustomLineItemQuantityChangedMessage;
import com.commercetools.api.models.message.OrderCustomLineItemRemovedMessage;
import com.commercetools.api.models.message.OrderCustomerEmailSetMessage;
import com.commercetools.api.models.message.OrderCustomerGroupSetMessage;
import com.commercetools.api.models.message.OrderCustomerSetMessage;
import com.commercetools.api.models.message.OrderDeletedMessage;
import com.commercetools.api.models.message.OrderDiscountCodeAddedMessage;
import com.commercetools.api.models.message.OrderDiscountCodeRemovedMessage;
import com.commercetools.api.models.message.OrderDiscountCodeStateSetMessage;
import com.commercetools.api.models.message.OrderEditAppliedMessage;
import com.commercetools.api.models.message.OrderImportedMessage;
import com.commercetools.api.models.message.OrderLineItemAddedMessage;
import com.commercetools.api.models.message.OrderLineItemDiscountSetMessage;
import com.commercetools.api.models.message.OrderLineItemDistributionChannelSetMessage;
import com.commercetools.api.models.message.OrderLineItemRemovedMessage;
import com.commercetools.api.models.message.OrderPaymentStateChangedMessage;
import com.commercetools.api.models.message.OrderPurchaseOrderNumberSetMessage;
import com.commercetools.api.models.message.OrderReturnShipmentStateChangedMessage;
import com.commercetools.api.models.message.OrderShipmentStateChangedMessage;
import com.commercetools.api.models.message.OrderShippingAddressSetMessage;
import com.commercetools.api.models.message.OrderShippingInfoSetMessage;
import com.commercetools.api.models.message.OrderShippingRateInputSetMessage;
import com.commercetools.api.models.message.OrderStateChangedMessage;
import com.commercetools.api.models.message.OrderStateTransitionMessage;
import com.commercetools.api.models.message.OrderStoreSetMessage;
import com.commercetools.api.models.message.ParcelAddedToDeliveryMessage;
import com.commercetools.api.models.message.ParcelItemsUpdatedMessage;
import com.commercetools.api.models.message.ParcelMeasurementsUpdatedMessage;
import com.commercetools.api.models.message.ParcelRemovedFromDeliveryMessage;
import com.commercetools.api.models.message.ParcelTrackingDataUpdatedMessage;
import com.commercetools.api.models.message.ReturnInfoAddedMessage;
import com.commercetools.api.models.message.ReturnInfoSetMessage;
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
 * OrderMessage
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class OrderMessageImpl implements OrderMessage, ModelBase {

    
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
    OrderMessageImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy, @JsonProperty("sequenceNumber") final Long sequenceNumber, @JsonProperty("resource") final com.commercetools.api.models.common.Reference resource, @JsonProperty("resourceVersion") final Long resourceVersion, @JsonProperty("type") final String type, @JsonProperty("resourceUserProvidedIdentifiers") final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
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
    public OrderMessageImpl() {
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
    
        OrderMessageImpl that = (OrderMessageImpl) o;
    
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
