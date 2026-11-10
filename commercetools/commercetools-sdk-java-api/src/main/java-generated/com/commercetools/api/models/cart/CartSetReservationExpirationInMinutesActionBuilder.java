
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetReservationExpirationInMinutesActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetReservationExpirationInMinutesAction cartSetReservationExpirationInMinutesAction = CartSetReservationExpirationInMinutesAction.builder()
 *             .reservationExpirationInMinutes(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetReservationExpirationInMinutesActionBuilder
        implements Builder<CartSetReservationExpirationInMinutesAction> {

    private Integer reservationExpirationInMinutes;

    /**
     *  <p>Value to set. Must be a positive integer.</p>
     * @param reservationExpirationInMinutes value to be set
     * @return Builder
     */

    public CartSetReservationExpirationInMinutesActionBuilder reservationExpirationInMinutes(
            final Integer reservationExpirationInMinutes) {
        this.reservationExpirationInMinutes = reservationExpirationInMinutes;
        return this;
    }

    /**
     *  <p>Value to set. Must be a positive integer.</p>
     * @return reservationExpirationInMinutes
     */

    public Integer getReservationExpirationInMinutes() {
        return this.reservationExpirationInMinutes;
    }

    /**
     * builds CartSetReservationExpirationInMinutesAction with checking for non-null required values
     * @return CartSetReservationExpirationInMinutesAction
     */
    public CartSetReservationExpirationInMinutesAction build() {
        Objects.requireNonNull(reservationExpirationInMinutes,
            CartSetReservationExpirationInMinutesAction.class + ": reservationExpirationInMinutes is missing");
        return new CartSetReservationExpirationInMinutesActionImpl(reservationExpirationInMinutes);
    }

    /**
     * builds CartSetReservationExpirationInMinutesAction without checking for non-null required values
     * @return CartSetReservationExpirationInMinutesAction
     */
    public CartSetReservationExpirationInMinutesAction buildUnchecked() {
        return new CartSetReservationExpirationInMinutesActionImpl(reservationExpirationInMinutes);
    }

    /**
     * factory method for an instance of CartSetReservationExpirationInMinutesActionBuilder
     * @return builder
     */
    public static CartSetReservationExpirationInMinutesActionBuilder of() {
        return new CartSetReservationExpirationInMinutesActionBuilder();
    }

    /**
     * create builder for CartSetReservationExpirationInMinutesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetReservationExpirationInMinutesActionBuilder of(
            final CartSetReservationExpirationInMinutesAction template) {
        CartSetReservationExpirationInMinutesActionBuilder builder = new CartSetReservationExpirationInMinutesActionBuilder();
        builder.reservationExpirationInMinutes = template.getReservationExpirationInMinutes();
        return builder;
    }

}
