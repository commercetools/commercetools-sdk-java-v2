
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryEntryReservationExpirationInMinutesSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntryReservationExpirationInMinutesSetMessagePayload inventoryEntryReservationExpirationInMinutesSetMessagePayload = InventoryEntryReservationExpirationInMinutesSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryEntryReservationExpirationInMinutesSetMessagePayloadBuilder
        implements Builder<InventoryEntryReservationExpirationInMinutesSetMessagePayload> {

    @Nullable
    private Integer newReservationExpirationInMinutes;

    @Nullable
    private Integer oldReservationExpirationInMinutes;

    /**
     *  <p><code>reservationExpirationInMinutes</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">Inventory Entry</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntrySetReservationExpirationInMinutesAction" rel="nofollow">Set Reservation Expiration In Minutes</a> update action.</p>
     * @param newReservationExpirationInMinutes value to be set
     * @return Builder
     */

    public InventoryEntryReservationExpirationInMinutesSetMessagePayloadBuilder newReservationExpirationInMinutes(
            @Nullable final Integer newReservationExpirationInMinutes) {
        this.newReservationExpirationInMinutes = newReservationExpirationInMinutes;
        return this;
    }

    /**
     *  <p><code>reservationExpirationInMinutes</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">Inventory Entry</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntrySetReservationExpirationInMinutesAction" rel="nofollow">Set Reservation Expiration In Minutes</a> update action.</p>
     * @param oldReservationExpirationInMinutes value to be set
     * @return Builder
     */

    public InventoryEntryReservationExpirationInMinutesSetMessagePayloadBuilder oldReservationExpirationInMinutes(
            @Nullable final Integer oldReservationExpirationInMinutes) {
        this.oldReservationExpirationInMinutes = oldReservationExpirationInMinutes;
        return this;
    }

    /**
     *  <p><code>reservationExpirationInMinutes</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">Inventory Entry</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntrySetReservationExpirationInMinutesAction" rel="nofollow">Set Reservation Expiration In Minutes</a> update action.</p>
     * @return newReservationExpirationInMinutes
     */

    @Nullable
    public Integer getNewReservationExpirationInMinutes() {
        return this.newReservationExpirationInMinutes;
    }

    /**
     *  <p><code>reservationExpirationInMinutes</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">Inventory Entry</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntrySetReservationExpirationInMinutesAction" rel="nofollow">Set Reservation Expiration In Minutes</a> update action.</p>
     * @return oldReservationExpirationInMinutes
     */

    @Nullable
    public Integer getOldReservationExpirationInMinutes() {
        return this.oldReservationExpirationInMinutes;
    }

    /**
     * builds InventoryEntryReservationExpirationInMinutesSetMessagePayload with checking for non-null required values
     * @return InventoryEntryReservationExpirationInMinutesSetMessagePayload
     */
    public InventoryEntryReservationExpirationInMinutesSetMessagePayload build() {
        return new InventoryEntryReservationExpirationInMinutesSetMessagePayloadImpl(newReservationExpirationInMinutes,
            oldReservationExpirationInMinutes);
    }

    /**
     * builds InventoryEntryReservationExpirationInMinutesSetMessagePayload without checking for non-null required values
     * @return InventoryEntryReservationExpirationInMinutesSetMessagePayload
     */
    public InventoryEntryReservationExpirationInMinutesSetMessagePayload buildUnchecked() {
        return new InventoryEntryReservationExpirationInMinutesSetMessagePayloadImpl(newReservationExpirationInMinutes,
            oldReservationExpirationInMinutes);
    }

    /**
     * factory method for an instance of InventoryEntryReservationExpirationInMinutesSetMessagePayloadBuilder
     * @return builder
     */
    public static InventoryEntryReservationExpirationInMinutesSetMessagePayloadBuilder of() {
        return new InventoryEntryReservationExpirationInMinutesSetMessagePayloadBuilder();
    }

    /**
     * create builder for InventoryEntryReservationExpirationInMinutesSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntryReservationExpirationInMinutesSetMessagePayloadBuilder of(
            final InventoryEntryReservationExpirationInMinutesSetMessagePayload template) {
        InventoryEntryReservationExpirationInMinutesSetMessagePayloadBuilder builder = new InventoryEntryReservationExpirationInMinutesSetMessagePayloadBuilder();
        builder.newReservationExpirationInMinutes = template.getNewReservationExpirationInMinutes();
        builder.oldReservationExpirationInMinutes = template.getOldReservationExpirationInMinutes();
        return builder;
    }

}
