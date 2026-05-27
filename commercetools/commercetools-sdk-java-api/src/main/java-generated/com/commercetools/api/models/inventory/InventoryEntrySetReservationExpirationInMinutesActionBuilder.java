
package com.commercetools.api.models.inventory;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryEntrySetReservationExpirationInMinutesActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryEntrySetReservationExpirationInMinutesAction inventoryEntrySetReservationExpirationInMinutesAction = InventoryEntrySetReservationExpirationInMinutesAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryEntrySetReservationExpirationInMinutesActionBuilder
        implements Builder<InventoryEntrySetReservationExpirationInMinutesAction> {

    @Nullable
    private Integer reservationExpirationInMinutes;

    /**
     *  <p>Value to set, must be a positive integer. If empty, any existing value will be removed.</p>
     * @param reservationExpirationInMinutes value to be set
     * @return Builder
     */

    public InventoryEntrySetReservationExpirationInMinutesActionBuilder reservationExpirationInMinutes(
            @Nullable final Integer reservationExpirationInMinutes) {
        this.reservationExpirationInMinutes = reservationExpirationInMinutes;
        return this;
    }

    /**
     *  <p>Value to set, must be a positive integer. If empty, any existing value will be removed.</p>
     * @return reservationExpirationInMinutes
     */

    @Nullable
    public Integer getReservationExpirationInMinutes() {
        return this.reservationExpirationInMinutes;
    }

    /**
     * builds InventoryEntrySetReservationExpirationInMinutesAction with checking for non-null required values
     * @return InventoryEntrySetReservationExpirationInMinutesAction
     */
    public InventoryEntrySetReservationExpirationInMinutesAction build() {
        return new InventoryEntrySetReservationExpirationInMinutesActionImpl(reservationExpirationInMinutes);
    }

    /**
     * builds InventoryEntrySetReservationExpirationInMinutesAction without checking for non-null required values
     * @return InventoryEntrySetReservationExpirationInMinutesAction
     */
    public InventoryEntrySetReservationExpirationInMinutesAction buildUnchecked() {
        return new InventoryEntrySetReservationExpirationInMinutesActionImpl(reservationExpirationInMinutes);
    }

    /**
     * factory method for an instance of InventoryEntrySetReservationExpirationInMinutesActionBuilder
     * @return builder
     */
    public static InventoryEntrySetReservationExpirationInMinutesActionBuilder of() {
        return new InventoryEntrySetReservationExpirationInMinutesActionBuilder();
    }

    /**
     * create builder for InventoryEntrySetReservationExpirationInMinutesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryEntrySetReservationExpirationInMinutesActionBuilder of(
            final InventoryEntrySetReservationExpirationInMinutesAction template) {
        InventoryEntrySetReservationExpirationInMinutesActionBuilder builder = new InventoryEntrySetReservationExpirationInMinutesActionBuilder();
        builder.reservationExpirationInMinutes = template.getReservationExpirationInMinutes();
        return builder;
    }

}
