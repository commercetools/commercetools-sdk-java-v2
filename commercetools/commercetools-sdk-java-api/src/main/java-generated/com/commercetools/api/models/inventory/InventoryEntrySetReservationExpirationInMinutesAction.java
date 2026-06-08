
package com.commercetools.api.models.inventory;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Sets the default reservation expiration time for the Inventory Entry. This action does not affect existing reservations. To change the expiration date and time of existing reservations, see the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetReservationExpirationInMinutesAction" rel="nofollow">Set Reservation Expiration In Minutes</a> update action on the Carts API.</p>
 *  <p>Produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntryReservationExpirationInMinutesSetMessage" rel="nofollow">InventoryEntry Reservation Expiration In Minutes Set</a> Message after a successful update.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntrySetReservationExpirationInMinutesAction inventoryEntrySetReservationExpirationInMinutesAction = InventoryEntrySetReservationExpirationInMinutesAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setReservationExpirationInMinutes")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = InventoryEntrySetReservationExpirationInMinutesActionImpl.class)
public interface InventoryEntrySetReservationExpirationInMinutesAction extends InventoryEntryUpdateAction {

    /**
     * discriminator value for InventoryEntrySetReservationExpirationInMinutesAction
     */
    String SET_RESERVATION_EXPIRATION_IN_MINUTES = "setReservationExpirationInMinutes";

    /**
     *  <p>Value to set, must be a positive integer. If empty, any existing value will be removed.</p>
     * @return reservationExpirationInMinutes
     */

    @JsonProperty("reservationExpirationInMinutes")
    public Integer getReservationExpirationInMinutes();

    /**
     *  <p>Value to set, must be a positive integer. If empty, any existing value will be removed.</p>
     * @param reservationExpirationInMinutes value to be set
     */

    public void setReservationExpirationInMinutes(final Integer reservationExpirationInMinutes);

    /**
     * factory method
     * @return instance of InventoryEntrySetReservationExpirationInMinutesAction
     */
    public static InventoryEntrySetReservationExpirationInMinutesAction of() {
        return new InventoryEntrySetReservationExpirationInMinutesActionImpl();
    }

    /**
     * factory method to create a shallow copy InventoryEntrySetReservationExpirationInMinutesAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static InventoryEntrySetReservationExpirationInMinutesAction of(
            final InventoryEntrySetReservationExpirationInMinutesAction template) {
        InventoryEntrySetReservationExpirationInMinutesActionImpl instance = new InventoryEntrySetReservationExpirationInMinutesActionImpl();
        instance.setReservationExpirationInMinutes(template.getReservationExpirationInMinutes());
        return instance;
    }

    public InventoryEntrySetReservationExpirationInMinutesAction copyDeep();

    /**
     * factory method to create a deep copy of InventoryEntrySetReservationExpirationInMinutesAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static InventoryEntrySetReservationExpirationInMinutesAction deepCopy(
            @Nullable final InventoryEntrySetReservationExpirationInMinutesAction template) {
        if (template == null) {
            return null;
        }
        InventoryEntrySetReservationExpirationInMinutesActionImpl instance = new InventoryEntrySetReservationExpirationInMinutesActionImpl();
        instance.setReservationExpirationInMinutes(template.getReservationExpirationInMinutes());
        return instance;
    }

    /**
     * builder factory method for InventoryEntrySetReservationExpirationInMinutesAction
     * @return builder
     */
    public static InventoryEntrySetReservationExpirationInMinutesActionBuilder builder() {
        return InventoryEntrySetReservationExpirationInMinutesActionBuilder.of();
    }

    /**
     * create builder for InventoryEntrySetReservationExpirationInMinutesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntrySetReservationExpirationInMinutesActionBuilder builder(
            final InventoryEntrySetReservationExpirationInMinutesAction template) {
        return InventoryEntrySetReservationExpirationInMinutesActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withInventoryEntrySetReservationExpirationInMinutesAction(
            Function<InventoryEntrySetReservationExpirationInMinutesAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<InventoryEntrySetReservationExpirationInMinutesAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<InventoryEntrySetReservationExpirationInMinutesAction>() {
            @Override
            public String toString() {
                return "TypeReference<InventoryEntrySetReservationExpirationInMinutesAction>";
            }
        };
    }
}
