
package com.commercetools.api.models.reservation;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p>A Reservation represents a quantity of inventory that is reserved.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReservationImpl implements Reservation, ModelBase {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    private java.time.ZonedDateTime expiresAt;

    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    private com.commercetools.api.models.common.CreatedBy createdBy;

    private com.commercetools.api.models.inventory.InventoryEntryReference inventoryEntry;

    private Long quantity;

    private com.commercetools.api.models.common.Reference owner;

    private String lineItemId;

    private com.commercetools.api.models.reservation.ReservationState state;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ReservationImpl(@JsonProperty("id") final String id, @JsonProperty("version") final Long version,
            @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt,
            @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt,
            @JsonProperty("expiresAt") final java.time.ZonedDateTime expiresAt,
            @JsonProperty("lastModifiedBy") final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy,
            @JsonProperty("createdBy") final com.commercetools.api.models.common.CreatedBy createdBy,
            @JsonProperty("inventoryEntry") final com.commercetools.api.models.inventory.InventoryEntryReference inventoryEntry,
            @JsonProperty("quantity") final Long quantity,
            @JsonProperty("owner") final com.commercetools.api.models.common.Reference owner,
            @JsonProperty("lineItemId") final String lineItemId,
            @JsonProperty("state") final com.commercetools.api.models.reservation.ReservationState state) {
        this.id = id;
        this.version = version;
        this.createdAt = createdAt;
        this.lastModifiedAt = lastModifiedAt;
        this.expiresAt = expiresAt;
        this.lastModifiedBy = lastModifiedBy;
        this.createdBy = createdBy;
        this.inventoryEntry = inventoryEntry;
        this.quantity = quantity;
        this.owner = owner;
        this.lineItemId = lineItemId;
        this.state = state;
    }

    /**
     * create empty instance
     */
    public ReservationImpl() {
    }

    /**
     *  <p>Unique identifier of the Reservation.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the Reservation.</p>
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the Reservation was initially created.</p>
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the Reservation was last updated.</p>
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>Date and time (UTC) the Reservation will no longer be valid. It can take a few minutes after expiry for the <code>state</code> to be updated to <code>Expired</code> and the stock to be released.</p>
     */

    public java.time.ZonedDateTime getExpiresAt() {
        return this.expiresAt;
    }

    /**
     *  <p>IDs and references that last modified the Reservation.</p>
     */

    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>IDs and references that created the Reservation.</p>
     */

    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>Reference to the related <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> used to manage the inventory.</p>
     */

    public com.commercetools.api.models.inventory.InventoryEntryReference getInventoryEntry() {
        return this.inventoryEntry;
    }

    /**
     *  <p>The quantity of inventory that is reserved.</p>
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p>Reference to the owner of the Reservation.</p>
     */

    public com.commercetools.api.models.common.Reference getOwner() {
        return this.owner;
    }

    /**
     *  <p>Unique identifier of the LineItem this Reservation is associated with.</p>
     */

    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p>Current state of the Reservation.</p>
     */

    public com.commercetools.api.models.reservation.ReservationState getState() {
        return this.state;
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

    public void setExpiresAt(final java.time.ZonedDateTime expiresAt) {
        this.expiresAt = expiresAt;
    }

    public void setLastModifiedBy(final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public void setCreatedBy(final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
    }

    public void setInventoryEntry(final com.commercetools.api.models.inventory.InventoryEntryReference inventoryEntry) {
        this.inventoryEntry = inventoryEntry;
    }

    public void setQuantity(final Long quantity) {
        this.quantity = quantity;
    }

    public void setOwner(final com.commercetools.api.models.common.Reference owner) {
        this.owner = owner;
    }

    public void setLineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
    }

    public void setState(final com.commercetools.api.models.reservation.ReservationState state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ReservationImpl that = (ReservationImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(expiresAt, that.expiresAt)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(createdBy, that.createdBy)
                .append(inventoryEntry, that.inventoryEntry)
                .append(quantity, that.quantity)
                .append(owner, that.owner)
                .append(lineItemId, that.lineItemId)
                .append(state, that.state)
                .append(id, that.id)
                .append(version, that.version)
                .append(createdAt, that.createdAt)
                .append(lastModifiedAt, that.lastModifiedAt)
                .append(expiresAt, that.expiresAt)
                .append(lastModifiedBy, that.lastModifiedBy)
                .append(createdBy, that.createdBy)
                .append(inventoryEntry, that.inventoryEntry)
                .append(quantity, that.quantity)
                .append(owner, that.owner)
                .append(lineItemId, that.lineItemId)
                .append(state, that.state)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id)
                .append(version)
                .append(createdAt)
                .append(lastModifiedAt)
                .append(expiresAt)
                .append(lastModifiedBy)
                .append(createdBy)
                .append(inventoryEntry)
                .append(quantity)
                .append(owner)
                .append(lineItemId)
                .append(state)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("version", version)
                .append("createdAt", createdAt)
                .append("lastModifiedAt", lastModifiedAt)
                .append("expiresAt", expiresAt)
                .append("lastModifiedBy", lastModifiedBy)
                .append("createdBy", createdBy)
                .append("inventoryEntry", inventoryEntry)
                .append("quantity", quantity)
                .append("owner", owner)
                .append("lineItemId", lineItemId)
                .append("state", state)
                .build();
    }

    @Override
    public Reservation copyDeep() {
        return Reservation.deepCopy(this);
    }
}
