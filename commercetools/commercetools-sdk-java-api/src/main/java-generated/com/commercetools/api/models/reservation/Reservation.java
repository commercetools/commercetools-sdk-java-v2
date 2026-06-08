
package com.commercetools.api.models.reservation;

import java.time.*;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.BaseResource;
import com.commercetools.api.models.common.CreatedBy;
import com.commercetools.api.models.common.LastModifiedBy;
import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.inventory.InventoryEntryReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>A Reservation represents a quantity of inventory that is reserved.</p>
 *
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
@JsonDeserialize(as = ReservationImpl.class)
public interface Reservation extends BaseResource {

    /**
     *  <p>Unique identifier of the Reservation.</p>
     * @return id
     */
    @NotNull
    @JsonProperty("id")
    public String getId();

    /**
     *  <p>Current version of the Reservation.</p>
     * @return version
     */
    @NotNull
    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Date and time (UTC) the Reservation was initially created.</p>
     * @return createdAt
     */
    @NotNull
    @JsonProperty("createdAt")
    public ZonedDateTime getCreatedAt();

    /**
     *  <p>Date and time (UTC) the Reservation was last updated.</p>
     * @return lastModifiedAt
     */
    @NotNull
    @JsonProperty("lastModifiedAt")
    public ZonedDateTime getLastModifiedAt();

    /**
     *  <p>Date and time (UTC) the Reservation will no longer be valid. It can take a few minutes after expiry for the <code>state</code> to be updated to <code>Expired</code> and the stock to be released.</p>
     * @return expiresAt
     */
    @NotNull
    @JsonProperty("expiresAt")
    public ZonedDateTime getExpiresAt();

    /**
     *  <p>IDs and references that last modified the Reservation.</p>
     * @return lastModifiedBy
     */
    @Valid
    @JsonProperty("lastModifiedBy")
    public LastModifiedBy getLastModifiedBy();

    /**
     *  <p>IDs and references that created the Reservation.</p>
     * @return createdBy
     */
    @Valid
    @JsonProperty("createdBy")
    public CreatedBy getCreatedBy();

    /**
     *  <p>Reference to the related <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> used to manage the inventory.</p>
     * @return inventoryEntry
     */
    @NotNull
    @Valid
    @JsonProperty("inventoryEntry")
    public InventoryEntryReference getInventoryEntry();

    /**
     *  <p>The quantity of inventory that is reserved.</p>
     * @return quantity
     */
    @NotNull
    @JsonProperty("quantity")
    public Long getQuantity();

    /**
     *  <p>Reference to the owner of the Reservation.</p>
     * @return owner
     */
    @NotNull
    @Valid
    @JsonProperty("owner")
    public Reference getOwner();

    /**
     *  <p>Unique identifier of the LineItem this Reservation is associated with.</p>
     * @return lineItemId
     */
    @NotNull
    @JsonProperty("lineItemId")
    public String getLineItemId();

    /**
     *  <p>Current state of the Reservation.</p>
     * @return state
     */
    @NotNull
    @JsonProperty("state")
    public ReservationState getState();

    /**
     *  <p>Unique identifier of the Reservation.</p>
     * @param id value to be set
     */

    public void setId(final String id);

    /**
     *  <p>Current version of the Reservation.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     *  <p>Date and time (UTC) the Reservation was initially created.</p>
     * @param createdAt value to be set
     */

    public void setCreatedAt(final ZonedDateTime createdAt);

    /**
     *  <p>Date and time (UTC) the Reservation was last updated.</p>
     * @param lastModifiedAt value to be set
     */

    public void setLastModifiedAt(final ZonedDateTime lastModifiedAt);

    /**
     *  <p>Date and time (UTC) the Reservation will no longer be valid. It can take a few minutes after expiry for the <code>state</code> to be updated to <code>Expired</code> and the stock to be released.</p>
     * @param expiresAt value to be set
     */

    public void setExpiresAt(final ZonedDateTime expiresAt);

    /**
     *  <p>IDs and references that last modified the Reservation.</p>
     * @param lastModifiedBy value to be set
     */

    public void setLastModifiedBy(final LastModifiedBy lastModifiedBy);

    /**
     *  <p>IDs and references that created the Reservation.</p>
     * @param createdBy value to be set
     */

    public void setCreatedBy(final CreatedBy createdBy);

    /**
     *  <p>Reference to the related <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntry</a> used to manage the inventory.</p>
     * @param inventoryEntry value to be set
     */

    public void setInventoryEntry(final InventoryEntryReference inventoryEntry);

    /**
     *  <p>The quantity of inventory that is reserved.</p>
     * @param quantity value to be set
     */

    public void setQuantity(final Long quantity);

    /**
     *  <p>Reference to the owner of the Reservation.</p>
     * @param owner value to be set
     */

    public void setOwner(final Reference owner);

    /**
     *  <p>Unique identifier of the LineItem this Reservation is associated with.</p>
     * @param lineItemId value to be set
     */

    public void setLineItemId(final String lineItemId);

    /**
     *  <p>Current state of the Reservation.</p>
     * @param state value to be set
     */

    public void setState(final ReservationState state);

    /**
     * factory method
     * @return instance of Reservation
     */
    public static Reservation of() {
        return new ReservationImpl();
    }

    /**
     * factory method to create a shallow copy Reservation
     * @param template instance to be copied
     * @return copy instance
     */
    public static Reservation of(final Reservation template) {
        ReservationImpl instance = new ReservationImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setExpiresAt(template.getExpiresAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setInventoryEntry(template.getInventoryEntry());
        instance.setQuantity(template.getQuantity());
        instance.setOwner(template.getOwner());
        instance.setLineItemId(template.getLineItemId());
        instance.setState(template.getState());
        return instance;
    }

    public Reservation copyDeep();

    /**
     * factory method to create a deep copy of Reservation
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static Reservation deepCopy(@Nullable final Reservation template) {
        if (template == null) {
            return null;
        }
        ReservationImpl instance = new ReservationImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setExpiresAt(template.getExpiresAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setInventoryEntry(
            com.commercetools.api.models.inventory.InventoryEntryReference.deepCopy(template.getInventoryEntry()));
        instance.setQuantity(template.getQuantity());
        instance.setOwner(com.commercetools.api.models.common.Reference.deepCopy(template.getOwner()));
        instance.setLineItemId(template.getLineItemId());
        instance.setState(template.getState());
        return instance;
    }

    /**
     * builder factory method for Reservation
     * @return builder
     */
    public static ReservationBuilder builder() {
        return ReservationBuilder.of();
    }

    /**
     * create builder for Reservation instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReservationBuilder builder(final Reservation template) {
        return ReservationBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withReservation(Function<Reservation, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<Reservation> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Reservation>() {
            @Override
            public String toString() {
                return "TypeReference<Reservation>";
            }
        };
    }
}
