
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntrySetReservationExpirationInMinutesAction" rel="nofollow">Set Reservation Expiration In Minutes</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntryReservationExpirationInMinutesSetMessage inventoryEntryReservationExpirationInMinutesSetMessage = InventoryEntryReservationExpirationInMinutesSetMessage.builder()
 *             .id("{id}")
 *             .version(0.3)
 *             .createdAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .lastModifiedAt(ZonedDateTime.parse("2022-01-01T12:00:00.301Z"))
 *             .sequenceNumber(0.3)
 *             .resource(resourceBuilder -> resourceBuilder)
 *             .resourceVersion(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("InventoryEntryReservationExpirationInMinutesSet")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InventoryEntryReservationExpirationInMinutesSetMessageImpl.class)
public interface InventoryEntryReservationExpirationInMinutesSetMessage extends Message {

    /**
     * discriminator value for InventoryEntryReservationExpirationInMinutesSetMessage
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
     * @return instance of InventoryEntryReservationExpirationInMinutesSetMessage
     */
    public static InventoryEntryReservationExpirationInMinutesSetMessage of() {
        return new InventoryEntryReservationExpirationInMinutesSetMessageImpl();
    }

    /**
     * factory method to create a shallow copy InventoryEntryReservationExpirationInMinutesSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    public static InventoryEntryReservationExpirationInMinutesSetMessage of(
            final InventoryEntryReservationExpirationInMinutesSetMessage template) {
        InventoryEntryReservationExpirationInMinutesSetMessageImpl instance = new InventoryEntryReservationExpirationInMinutesSetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(template.getLastModifiedBy());
        instance.setCreatedBy(template.getCreatedBy());
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(template.getResource());
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(template.getResourceUserProvidedIdentifiers());
        instance.setNewReservationExpirationInMinutes(template.getNewReservationExpirationInMinutes());
        instance.setOldReservationExpirationInMinutes(template.getOldReservationExpirationInMinutes());
        return instance;
    }

    public InventoryEntryReservationExpirationInMinutesSetMessage copyDeep();

    /**
     * factory method to create a deep copy of InventoryEntryReservationExpirationInMinutesSetMessage
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InventoryEntryReservationExpirationInMinutesSetMessage deepCopy(
            @Nullable final InventoryEntryReservationExpirationInMinutesSetMessage template) {
        if (template == null) {
            return null;
        }
        InventoryEntryReservationExpirationInMinutesSetMessageImpl instance = new InventoryEntryReservationExpirationInMinutesSetMessageImpl();
        instance.setId(template.getId());
        instance.setVersion(template.getVersion());
        instance.setCreatedAt(template.getCreatedAt());
        instance.setLastModifiedAt(template.getLastModifiedAt());
        instance.setLastModifiedBy(
            com.commercetools.api.models.common.LastModifiedBy.deepCopy(template.getLastModifiedBy()));
        instance.setCreatedBy(com.commercetools.api.models.common.CreatedBy.deepCopy(template.getCreatedBy()));
        instance.setSequenceNumber(template.getSequenceNumber());
        instance.setResource(com.commercetools.api.models.common.Reference.deepCopy(template.getResource()));
        instance.setResourceVersion(template.getResourceVersion());
        instance.setResourceUserProvidedIdentifiers(com.commercetools.api.models.message.UserProvidedIdentifiers
                .deepCopy(template.getResourceUserProvidedIdentifiers()));
        instance.setNewReservationExpirationInMinutes(template.getNewReservationExpirationInMinutes());
        instance.setOldReservationExpirationInMinutes(template.getOldReservationExpirationInMinutes());
        return instance;
    }

    /**
     * builder factory method for InventoryEntryReservationExpirationInMinutesSetMessage
     * @return builder
     */
    public static InventoryEntryReservationExpirationInMinutesSetMessageBuilder builder() {
        return InventoryEntryReservationExpirationInMinutesSetMessageBuilder.of();
    }

    /**
     * create builder for InventoryEntryReservationExpirationInMinutesSetMessage instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntryReservationExpirationInMinutesSetMessageBuilder builder(
            final InventoryEntryReservationExpirationInMinutesSetMessage template) {
        return InventoryEntryReservationExpirationInMinutesSetMessageBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInventoryEntryReservationExpirationInMinutesSetMessage(
            Function<InventoryEntryReservationExpirationInMinutesSetMessage, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<InventoryEntryReservationExpirationInMinutesSetMessage> typeReference() {
        return new tools.jackson.core.type.TypeReference<InventoryEntryReservationExpirationInMinutesSetMessage>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntryReservationExpirationInMinutesSetMessage>";
            }
        };
    }
}
