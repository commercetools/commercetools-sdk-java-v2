
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OrderLineItemRemovedMessageImpl implements OrderLineItemRemovedMessage, ModelBase {

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

    private String lineItemId;

    private Long removedQuantity;

    private Long newQuantity;

    private java.util.List<com.commercetools.api.models.order.ItemState> newState;

    private com.commercetools.api.models.common.TypedMoney newTotalPrice;

    private com.commercetools.api.models.cart.TaxedItemPrice newTaxedPrice;

    private com.commercetools.api.models.common.Price newPrice;

    private com.commercetools.api.models.cart.ItemShippingDetails newShippingDetail;

    @JsonCreator
    OrderLineItemRemovedMessageImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt,
            @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy,
            @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy,
            @JsonProperty("sequenceNumber") final Long sequenceNumber,
            @JsonProperty("resource") final com.commercetools.api.models.common.Reference resource,
            @JsonProperty("resourceVersion") final Long resourceVersion,
            @JsonProperty("resourceUserProvidedIdentifiers") final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers,
            @JsonProperty("lineItemId") final String lineItemId,
            @JsonProperty("removedQuantity") final Long removedQuantity,
            @JsonProperty("newQuantity") final Long newQuantity,
            @JsonProperty("newState") final java.util.List<com.commercetools.api.models.order.ItemState> newState,
            @JsonProperty("newTotalPrice") final com.commercetools.api.models.common.TypedMoney newTotalPrice,
            @JsonProperty("newTaxedPrice") final com.commercetools.api.models.cart.TaxedItemPrice newTaxedPrice,
            @JsonProperty("newPrice") final com.commercetools.api.models.common.Price newPrice,
            @JsonProperty("newShippingDetail") final com.commercetools.api.models.cart.ItemShippingDetails newShippingDetail) {
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.createdBy = createdBy;
        this.sequenceNumber = sequenceNumber;
        this.resource = resource;
        this.resourceVersion = resourceVersion;
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
        this.lineItemId = lineItemId;
        this.removedQuantity = removedQuantity;
        this.newQuantity = newQuantity;
        this.newState = newState;
        this.newTotalPrice = newTotalPrice;
        this.newTaxedPrice = newTaxedPrice;
        this.newPrice = newPrice;
        this.newShippingDetail = newShippingDetail;
        this.type = ORDER_LINE_ITEM_REMOVED;
    }

    public OrderLineItemRemovedMessageImpl() {
        this.type = ORDER_LINE_ITEM_REMOVED;
    }

    /**
    *  <p>Platform-generated unique identifier of the Message.</p>
    */
    public String getId() {
        return this.id;
    }

    public Long getVersion() {
        return this.version;
    }

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
    *  <p>Present on resources created after 1 February 2019 except for <a href="/client-logging#events-tracked">events not tracked</a>.</p>
    */
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
    *  <p>Present on resources created after 1 February 2019 except for <a href="/client-logging#events-tracked">events not tracked</a>.</p>
    */
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    public Long getSequenceNumber() {
        return this.sequenceNumber;
    }

    public com.commercetools.api.models.common.Reference getResource() {
        return this.resource;
    }

    public Long getResourceVersion() {
        return this.resourceVersion;
    }

    public String getType() {
        return this.type;
    }

    public com.commercetools.api.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers() {
        return this.resourceUserProvidedIdentifiers;
    }

    public String getLineItemId() {
        return this.lineItemId;
    }

    public Long getRemovedQuantity() {
        return this.removedQuantity;
    }

    public Long getNewQuantity() {
        return this.newQuantity;
    }

    public java.util.List<com.commercetools.api.models.order.ItemState> getNewState() {
        return this.newState;
    }

    /**
    *  <p>Base polymorphic read-only Money type which is stored in cent precision or high precision. The actual type is determined by the <code>type</code> field.</p>
    */
    public com.commercetools.api.models.common.TypedMoney getNewTotalPrice() {
        return this.newTotalPrice;
    }

    public com.commercetools.api.models.cart.TaxedItemPrice getNewTaxedPrice() {
        return this.newTaxedPrice;
    }

    public com.commercetools.api.models.common.Price getNewPrice() {
        return this.newPrice;
    }

    public com.commercetools.api.models.cart.ItemShippingDetails getNewShippingDetail() {
        return this.newShippingDetail;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setVersion(final Long version) {
        this.version = version;
    }

    public void setCreatedAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
    }

    public void setLastModifiedBy(final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public void setCreatedBy(final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
    }

    public void setSequenceNumber(final Long sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public void setResource(final com.commercetools.api.models.common.Reference resource) {
        this.resource = resource;
    }

    public void setResourceVersion(final Long resourceVersion) {
        this.resourceVersion = resourceVersion;
    }

    public void setResourceUserProvidedIdentifiers(
            final com.commercetools.api.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
        this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
    }

    public void setLineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
    }

    public void setRemovedQuantity(final Long removedQuantity) {
        this.removedQuantity = removedQuantity;
    }

    public void setNewQuantity(final Long newQuantity) {
        this.newQuantity = newQuantity;
    }

    public void setNewState(final com.commercetools.api.models.order.ItemState... newState) {
        this.newState = new ArrayList<>(Arrays.asList(newState));
    }

    public void setNewState(final java.util.List<com.commercetools.api.models.order.ItemState> newState) {
        this.newState = newState;
    }

    public void setNewTotalPrice(final com.commercetools.api.models.common.TypedMoney newTotalPrice) {
        this.newTotalPrice = newTotalPrice;
    }

    public void setNewTaxedPrice(final com.commercetools.api.models.cart.TaxedItemPrice newTaxedPrice) {
        this.newTaxedPrice = newTaxedPrice;
    }

    public void setNewPrice(final com.commercetools.api.models.common.Price newPrice) {
        this.newPrice = newPrice;
    }

    public void setNewShippingDetail(final com.commercetools.api.models.cart.ItemShippingDetails newShippingDetail) {
        this.newShippingDetail = newShippingDetail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderLineItemRemovedMessageImpl that = (OrderLineItemRemovedMessageImpl) o;

        return new EqualsBuilder().append(id, that.id)
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
                .append(lineItemId, that.lineItemId)
                .append(removedQuantity, that.removedQuantity)
                .append(newQuantity, that.newQuantity)
                .append(newState, that.newState)
                .append(newTotalPrice, that.newTotalPrice)
                .append(newTaxedPrice, that.newTaxedPrice)
                .append(newPrice, that.newPrice)
                .append(newShippingDetail, that.newShippingDetail)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
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
                .append(lineItemId)
                .append(removedQuantity)
                .append(newQuantity)
                .append(newState)
                .append(newTotalPrice)
                .append(newTaxedPrice)
                .append(newPrice)
                .append(newShippingDetail)
                .toHashCode();
    }

}
