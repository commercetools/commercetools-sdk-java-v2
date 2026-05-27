
package com.commercetools.api.models.project;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProjectSetReservationExpirationInMinutesActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectSetReservationExpirationInMinutesAction projectSetReservationExpirationInMinutesAction = ProjectSetReservationExpirationInMinutesAction.builder()
 *             .reservationExpirationInMinutes(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProjectSetReservationExpirationInMinutesActionBuilder
        implements Builder<ProjectSetReservationExpirationInMinutesAction> {

    private Integer reservationExpirationInMinutes;

    /**
     *  <p>Value to set.</p>
     * @param reservationExpirationInMinutes value to be set
     * @return Builder
     */

    public ProjectSetReservationExpirationInMinutesActionBuilder reservationExpirationInMinutes(
            final Integer reservationExpirationInMinutes) {
        this.reservationExpirationInMinutes = reservationExpirationInMinutes;
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @return reservationExpirationInMinutes
     */

    public Integer getReservationExpirationInMinutes() {
        return this.reservationExpirationInMinutes;
    }

    /**
     * builds ProjectSetReservationExpirationInMinutesAction with checking for non-null required values
     * @return ProjectSetReservationExpirationInMinutesAction
     */
    public ProjectSetReservationExpirationInMinutesAction build() {
        Objects.requireNonNull(reservationExpirationInMinutes,
            ProjectSetReservationExpirationInMinutesAction.class + ": reservationExpirationInMinutes is missing");
        return new ProjectSetReservationExpirationInMinutesActionImpl(reservationExpirationInMinutes);
    }

    /**
     * builds ProjectSetReservationExpirationInMinutesAction without checking for non-null required values
     * @return ProjectSetReservationExpirationInMinutesAction
     */
    public ProjectSetReservationExpirationInMinutesAction buildUnchecked() {
        return new ProjectSetReservationExpirationInMinutesActionImpl(reservationExpirationInMinutes);
    }

    /**
     * factory method for an instance of ProjectSetReservationExpirationInMinutesActionBuilder
     * @return builder
     */
    public static ProjectSetReservationExpirationInMinutesActionBuilder of() {
        return new ProjectSetReservationExpirationInMinutesActionBuilder();
    }

    /**
     * create builder for ProjectSetReservationExpirationInMinutesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectSetReservationExpirationInMinutesActionBuilder of(
            final ProjectSetReservationExpirationInMinutesAction template) {
        ProjectSetReservationExpirationInMinutesActionBuilder builder = new ProjectSetReservationExpirationInMinutesActionBuilder();
        builder.reservationExpirationInMinutes = template.getReservationExpirationInMinutes();
        return builder;
    }

}
