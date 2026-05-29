
package com.commercetools.api.models.reservation;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReservationBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     Reservation reservation = Reservation.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .expiresAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .inventoryEntry(inventoryEntryBuilder -> inventoryEntryBuilder)
 *             .quantity(0.3)
 *             .owner(ownerBuilder -> ownerBuilder)
 *             .lineItemId("{lineItemId}")
 *             .state(ReservationState.CREATED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReservationBuilder implements Builder<Reservation> {

    private String id;

    private Long version;

    private java.time.ZonedDateTime createdAt;

    private java.time.ZonedDateTime lastModifiedAt;

    private java.time.ZonedDateTime expiresAt;

    @Nullable
    private com.commercetools.api.models.common.LastModifiedBy lastModifiedBy;

    @Nullable
    private com.commercetools.api.models.common.CreatedBy createdBy;

    private com.commercetools.api.models.inventory.InventoryEntryReference inventoryEntry;

    private Long quantity;

    private com.commercetools.api.models.common.Reference owner;

    private String lineItemId;

    private com.commercetools.api.models.reservation.ReservationState state;

    /**
     *  <p>Unique identifier of the Reservation.</p>
     * @param id value to be set
     * @return Builder
     */

    public ReservationBuilder id(final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Current version of the Reservation.</p>
     * @param version value to be set
     * @return Builder
     */

    public ReservationBuilder version(final Long version) {
        this.version = version;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Reservation was initially created.</p>
     * @param createdAt value to be set
     * @return Builder
     */

    public ReservationBuilder createdAt(final java.time.ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Reservation was last updated.</p>
     * @param lastModifiedAt value to be set
     * @return Builder
     */

    public ReservationBuilder lastModifiedAt(final java.time.ZonedDateTime lastModifiedAt) {
        this.lastModifiedAt = lastModifiedAt;
        return this;
    }

    /**
     *  <p>Date and time (UTC) the Reservation will no longer be valid. It can take a few minutes after expiry for the <code>state</code> to be updated to <code>Expired</code> and the stock to be released.</p>
     * @param expiresAt value to be set
     * @return Builder
     */

    public ReservationBuilder expiresAt(final java.time.ZonedDateTime expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Reservation.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public ReservationBuilder lastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedByBuilder> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Reservation.</p>
     * @param builder function to build the lastModifiedBy value
     * @return Builder
     */

    public ReservationBuilder withLastModifiedBy(
            Function<com.commercetools.api.models.common.LastModifiedByBuilder, com.commercetools.api.models.common.LastModifiedBy> builder) {
        this.lastModifiedBy = builder.apply(com.commercetools.api.models.common.LastModifiedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that last modified the Reservation.</p>
     * @param lastModifiedBy value to be set
     * @return Builder
     */

    public ReservationBuilder lastModifiedBy(
            @Nullable final com.commercetools.api.models.common.LastModifiedBy lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
        return this;
    }

    /**
     *  <p>IDs and references that created the Reservation.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public ReservationBuilder createdBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedByBuilder> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of()).build();
        return this;
    }

    /**
     *  <p>IDs and references that created the Reservation.</p>
     * @param builder function to build the createdBy value
     * @return Builder
     */

    public ReservationBuilder withCreatedBy(
            Function<com.commercetools.api.models.common.CreatedByBuilder, com.commercetools.api.models.common.CreatedBy> builder) {
        this.createdBy = builder.apply(com.commercetools.api.models.common.CreatedByBuilder.of());
        return this;
    }

    /**
     *  <p>IDs and references that created the Reservation.</p>
     * @param createdBy value to be set
     * @return Builder
     */

    public ReservationBuilder createdBy(@Nullable final com.commercetools.api.models.common.CreatedBy createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    /**
     *  <p>Reference to the related <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> used to manage the inventory.</p>
     * @param builder function to build the inventoryEntry value
     * @return Builder
     */

    public ReservationBuilder inventoryEntry(
            Function<com.commercetools.api.models.inventory.InventoryEntryReferenceBuilder, com.commercetools.api.models.inventory.InventoryEntryReferenceBuilder> builder) {
        this.inventoryEntry = builder.apply(com.commercetools.api.models.inventory.InventoryEntryReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Reference to the related <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> used to manage the inventory.</p>
     * @param builder function to build the inventoryEntry value
     * @return Builder
     */

    public ReservationBuilder withInventoryEntry(
            Function<com.commercetools.api.models.inventory.InventoryEntryReferenceBuilder, com.commercetools.api.models.inventory.InventoryEntryReference> builder) {
        this.inventoryEntry = builder.apply(com.commercetools.api.models.inventory.InventoryEntryReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Reference to the related <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> used to manage the inventory.</p>
     * @param inventoryEntry value to be set
     * @return Builder
     */

    public ReservationBuilder inventoryEntry(
            final com.commercetools.api.models.inventory.InventoryEntryReference inventoryEntry) {
        this.inventoryEntry = inventoryEntry;
        return this;
    }

    /**
     *  <p>The quantity of inventory that is reserved.</p>
     * @param quantity value to be set
     * @return Builder
     */

    public ReservationBuilder quantity(final Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     *  <p>Reference to the owner of the Reservation.</p>
     * @param owner value to be set
     * @return Builder
     */

    public ReservationBuilder owner(final com.commercetools.api.models.common.Reference owner) {
        this.owner = owner;
        return this;
    }

    /**
     *  <p>Reference to the owner of the Reservation.</p>
     * @param builder function to build the owner value
     * @return Builder
     */

    public ReservationBuilder owner(
            Function<com.commercetools.api.models.common.ReferenceBuilder, Builder<? extends com.commercetools.api.models.common.Reference>> builder) {
        this.owner = builder.apply(com.commercetools.api.models.common.ReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Unique identifier of the LineItem this Reservation is associated with.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public ReservationBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p>Current state of the Reservation.</p>
     * @param state value to be set
     * @return Builder
     */

    public ReservationBuilder state(final com.commercetools.api.models.reservation.ReservationState state) {
        this.state = state;
        return this;
    }

    /**
     *  <p>Unique identifier of the Reservation.</p>
     * @return id
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Current version of the Reservation.</p>
     * @return version
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     *  <p>Date and time (UTC) the Reservation was initially created.</p>
     * @return createdAt
     */

    public java.time.ZonedDateTime getCreatedAt() {
        return this.createdAt;
    }

    /**
     *  <p>Date and time (UTC) the Reservation was last updated.</p>
     * @return lastModifiedAt
     */

    public java.time.ZonedDateTime getLastModifiedAt() {
        return this.lastModifiedAt;
    }

    /**
     *  <p>Date and time (UTC) the Reservation will no longer be valid. It can take a few minutes after expiry for the <code>state</code> to be updated to <code>Expired</code> and the stock to be released.</p>
     * @return expiresAt
     */

    public java.time.ZonedDateTime getExpiresAt() {
        return this.expiresAt;
    }

    /**
     *  <p>IDs and references that last modified the Reservation.</p>
     * @return lastModifiedBy
     */

    @Nullable
    public com.commercetools.api.models.common.LastModifiedBy getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    /**
     *  <p>IDs and references that created the Reservation.</p>
     * @return createdBy
     */

    @Nullable
    public com.commercetools.api.models.common.CreatedBy getCreatedBy() {
        return this.createdBy;
    }

    /**
     *  <p>Reference to the related <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> used to manage the inventory.</p>
     * @return inventoryEntry
     */

    public com.commercetools.api.models.inventory.InventoryEntryReference getInventoryEntry() {
        return this.inventoryEntry;
    }

    /**
     *  <p>The quantity of inventory that is reserved.</p>
     * @return quantity
     */

    public Long getQuantity() {
        return this.quantity;
    }

    /**
     *  <p>Reference to the owner of the Reservation.</p>
     * @return owner
     */

    public com.commercetools.api.models.common.Reference getOwner() {
        return this.owner;
    }

    /**
     *  <p>Unique identifier of the LineItem this Reservation is associated with.</p>
     * @return lineItemId
     */

    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p>Current state of the Reservation.</p>
     * @return state
     */

    public com.commercetools.api.models.reservation.ReservationState getState() {
        return this.state;
    }

    /**
     * builds Reservation with checking for non-null required values
     * @return Reservation
     */
    public Reservation build() {
        Objects.requireNonNull(id, Reservation.class + ": id is missing");
        Objects.requireNonNull(version, Reservation.class + ": version is missing");
        Objects.requireNonNull(createdAt, Reservation.class + ": createdAt is missing");
        Objects.requireNonNull(lastModifiedAt, Reservation.class + ": lastModifiedAt is missing");
        Objects.requireNonNull(expiresAt, Reservation.class + ": expiresAt is missing");
        Objects.requireNonNull(inventoryEntry, Reservation.class + ": inventoryEntry is missing");
        Objects.requireNonNull(quantity, Reservation.class + ": quantity is missing");
        Objects.requireNonNull(owner, Reservation.class + ": owner is missing");
        Objects.requireNonNull(lineItemId, Reservation.class + ": lineItemId is missing");
        Objects.requireNonNull(state, Reservation.class + ": state is missing");
        return new ReservationImpl(id, version, createdAt, lastModifiedAt, expiresAt, lastModifiedBy, createdBy,
            inventoryEntry, quantity, owner, lineItemId, state);
    }

    /**
     * builds Reservation without checking for non-null required values
     * @return Reservation
     */
    public Reservation buildUnchecked() {
        return new ReservationImpl(id, version, createdAt, lastModifiedAt, expiresAt, lastModifiedBy, createdBy,
            inventoryEntry, quantity, owner, lineItemId, state);
    }

    /**
     * factory method for an instance of ReservationBuilder
     * @return builder
     */
    public static ReservationBuilder of() {
        return new ReservationBuilder();
    }

    /**
     * create builder for Reservation instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReservationBuilder of(final Reservation template) {
        ReservationBuilder builder = new ReservationBuilder();
        builder.id = template.getId();
        builder.version = template.getVersion();
        builder.createdAt = template.getCreatedAt();
        builder.lastModifiedAt = template.getLastModifiedAt();
        builder.expiresAt = template.getExpiresAt();
        builder.lastModifiedBy = template.getLastModifiedBy();
        builder.createdBy = template.getCreatedBy();
        builder.inventoryEntry = template.getInventoryEntry();
        builder.quantity = template.getQuantity();
        builder.owner = template.getOwner();
        builder.lineItemId = template.getLineItemId();
        builder.state = template.getState();
        return builder;
    }

}
