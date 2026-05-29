
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntrySetReservationExpirationInMinutesAction" rel="nofollow">Set Reservation Expiration In Minutes</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntryReservationExpirationInMinutesSetMessagePayload inventoryEntryReservationExpirationInMinutesSetMessagePayload = InventoryEntryReservationExpirationInMinutesSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("InventoryEntryReservationExpirationInMinutesSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InventoryEntryReservationExpirationInMinutesSetMessagePayloadImpl.class)
public interface InventoryEntryReservationExpirationInMinutesSetMessagePayload extends MessagePayload {

    /**
     * discriminator value for InventoryEntryReservationExpirationInMinutesSetMessagePayload
     */
    String INVENTORY_ENTRY_RESERVATION_EXPIRATION_IN_MINUTES_SET = "InventoryEntryReservationExpirationInMinutesSet";

    /**
     *  <p><code>reservationExpirationInMinutes</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">Inventory Entry</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntrySetReservationExpirationInMinutesAction" rel="nofollow">Set Reservation Expiration In Minutes</a> update action.</p>
     * @return newReservationExpirationInMinutes
     */

    @JsonProperty("newReservationExpirationInMinutes")
    public Integer getNewReservationExpirationInMinutes();

    /**
     *  <p><code>reservationExpirationInMinutes</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">Inventory Entry</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntrySetReservationExpirationInMinutesAction" rel="nofollow">Set Reservation Expiration In Minutes</a> update action.</p>
     * @return oldReservationExpirationInMinutes
     */

    @JsonProperty("oldReservationExpirationInMinutes")
    public Integer getOldReservationExpirationInMinutes();

    /**
     *  <p><code>reservationExpirationInMinutes</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">Inventory Entry</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntrySetReservationExpirationInMinutesAction" rel="nofollow">Set Reservation Expiration In Minutes</a> update action.</p>
     * @param newReservationExpirationInMinutes value to be set
     */

    public void setNewReservationExpirationInMinutes(final Integer newReservationExpirationInMinutes);

    /**
     *  <p><code>reservationExpirationInMinutes</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">Inventory Entry</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntrySetReservationExpirationInMinutesAction" rel="nofollow">Set Reservation Expiration In Minutes</a> update action.</p>
     * @param oldReservationExpirationInMinutes value to be set
     */

    public void setOldReservationExpirationInMinutes(final Integer oldReservationExpirationInMinutes);

    /**
     * factory method
     * @return instance of InventoryEntryReservationExpirationInMinutesSetMessagePayload
     */
    public static InventoryEntryReservationExpirationInMinutesSetMessagePayload of() {
        return new InventoryEntryReservationExpirationInMinutesSetMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy InventoryEntryReservationExpirationInMinutesSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static InventoryEntryReservationExpirationInMinutesSetMessagePayload of(
            final InventoryEntryReservationExpirationInMinutesSetMessagePayload template) {
        InventoryEntryReservationExpirationInMinutesSetMessagePayloadImpl instance = new InventoryEntryReservationExpirationInMinutesSetMessagePayloadImpl();
        instance.setNewReservationExpirationInMinutes(template.getNewReservationExpirationInMinutes());
        instance.setOldReservationExpirationInMinutes(template.getOldReservationExpirationInMinutes());
        return instance;
    }

    public InventoryEntryReservationExpirationInMinutesSetMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of InventoryEntryReservationExpirationInMinutesSetMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InventoryEntryReservationExpirationInMinutesSetMessagePayload deepCopy(
            @Nullable final InventoryEntryReservationExpirationInMinutesSetMessagePayload template) {
        if (template == null) {
            return null;
        }
        InventoryEntryReservationExpirationInMinutesSetMessagePayloadImpl instance = new InventoryEntryReservationExpirationInMinutesSetMessagePayloadImpl();
        instance.setNewReservationExpirationInMinutes(template.getNewReservationExpirationInMinutes());
        instance.setOldReservationExpirationInMinutes(template.getOldReservationExpirationInMinutes());
        return instance;
    }

    /**
     * builder factory method for InventoryEntryReservationExpirationInMinutesSetMessagePayload
     * @return builder
     */
    public static InventoryEntryReservationExpirationInMinutesSetMessagePayloadBuilder builder() {
        return InventoryEntryReservationExpirationInMinutesSetMessagePayloadBuilder.of();
    }

    /**
     * create builder for InventoryEntryReservationExpirationInMinutesSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntryReservationExpirationInMinutesSetMessagePayloadBuilder builder(
            final InventoryEntryReservationExpirationInMinutesSetMessagePayload template) {
        return InventoryEntryReservationExpirationInMinutesSetMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInventoryEntryReservationExpirationInMinutesSetMessagePayload(
            Function<InventoryEntryReservationExpirationInMinutesSetMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InventoryEntryReservationExpirationInMinutesSetMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryEntryReservationExpirationInMinutesSetMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntryReservationExpirationInMinutesSetMessagePayload>";
            }
        };
    }
}
