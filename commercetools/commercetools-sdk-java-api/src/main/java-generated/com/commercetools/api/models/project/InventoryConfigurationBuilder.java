
package com.commercetools.api.models.project;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InventoryConfigurationBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InventoryConfiguration inventoryConfiguration = InventoryConfiguration.builder()
 *             .releaseExpiredReservations(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryConfigurationBuilder implements Builder<InventoryConfiguration> {

    @Nullable
    private Integer reservationExpirationInMinutes;

    private Boolean releaseExpiredReservations;

    /**
     *  <p>The number of minutes after which a <a href="https://docs.commercetools.com/apis/ctp:api:type:Reservation" rel="nofollow">Reservation</a> expires. To use the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryMode" rel="nofollow">ReserveOnCart</a> inventory mode, this field must be set.</p>
     * @param reservationExpirationInMinutes value to be set
     * @return Builder
     */

    public InventoryConfigurationBuilder reservationExpirationInMinutes(
            @Nullable final Integer reservationExpirationInMinutes) {
        this.reservationExpirationInMinutes = reservationExpirationInMinutes;
        return this;
    }

    /**
     *  <p>If set to <code>true</code>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Reservation" rel="nofollow">Reservations</a> are marked as <code>Expired</code> once their <code>reservationExpirationInMinutes</code> is reached. The reserved inventory is then made available. If set to <code>false</code>, tracking Line Items with expired reservations becomes your responsibility.</p>
     * @param releaseExpiredReservations value to be set
     * @return Builder
     */

    public InventoryConfigurationBuilder releaseExpiredReservations(final Boolean releaseExpiredReservations) {
        this.releaseExpiredReservations = releaseExpiredReservations;
        return this;
    }

    /**
     *  <p>The number of minutes after which a <a href="https://docs.commercetools.com/apis/ctp:api:type:Reservation" rel="nofollow">Reservation</a> expires. To use the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryMode" rel="nofollow">ReserveOnCart</a> inventory mode, this field must be set.</p>
     * @return reservationExpirationInMinutes
     */

    @Nullable
    public Integer getReservationExpirationInMinutes() {
        return this.reservationExpirationInMinutes;
    }

    /**
     *  <p>If set to <code>true</code>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Reservation" rel="nofollow">Reservations</a> are marked as <code>Expired</code> once their <code>reservationExpirationInMinutes</code> is reached. The reserved inventory is then made available. If set to <code>false</code>, tracking Line Items with expired reservations becomes your responsibility.</p>
     * @return releaseExpiredReservations
     */

    public Boolean getReleaseExpiredReservations() {
        return this.releaseExpiredReservations;
    }

    /**
     * builds InventoryConfiguration with checking for non-null required values
     * @return InventoryConfiguration
     */
    public InventoryConfiguration build() {
        Objects.requireNonNull(releaseExpiredReservations,
            InventoryConfiguration.class + ": releaseExpiredReservations is missing");
        return new InventoryConfigurationImpl(reservationExpirationInMinutes, releaseExpiredReservations);
    }

    /**
     * builds InventoryConfiguration without checking for non-null required values
     * @return InventoryConfiguration
     */
    public InventoryConfiguration buildUnchecked() {
        return new InventoryConfigurationImpl(reservationExpirationInMinutes, releaseExpiredReservations);
    }

    /**
     * factory method for an instance of InventoryConfigurationBuilder
     * @return builder
     */
    public static InventoryConfigurationBuilder of() {
        return new InventoryConfigurationBuilder();
    }

    /**
     * create builder for InventoryConfiguration instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InventoryConfigurationBuilder of(final InventoryConfiguration template) {
        InventoryConfigurationBuilder builder = new InventoryConfigurationBuilder();
        builder.reservationExpirationInMinutes = template.getReservationExpirationInMinutes();
        builder.releaseExpiredReservations = template.getReleaseExpiredReservations();
        return builder;
    }

}
