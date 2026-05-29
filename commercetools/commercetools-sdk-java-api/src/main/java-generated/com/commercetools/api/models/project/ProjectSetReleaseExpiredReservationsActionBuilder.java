
package com.commercetools.api.models.project;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProjectSetReleaseExpiredReservationsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectSetReleaseExpiredReservationsAction projectSetReleaseExpiredReservationsAction = ProjectSetReleaseExpiredReservationsAction.builder()
 *             .releaseExpiredReservations(true)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProjectSetReleaseExpiredReservationsActionBuilder
        implements Builder<ProjectSetReleaseExpiredReservationsAction> {

    private Boolean releaseExpiredReservations;

    /**
     *  <p>Value to set.</p>
     * @param releaseExpiredReservations value to be set
     * @return Builder
     */

    public ProjectSetReleaseExpiredReservationsActionBuilder releaseExpiredReservations(
            final Boolean releaseExpiredReservations) {
        this.releaseExpiredReservations = releaseExpiredReservations;
        return this;
    }

    /**
     *  <p>Value to set.</p>
     * @return releaseExpiredReservations
     */

    public Boolean getReleaseExpiredReservations() {
        return this.releaseExpiredReservations;
    }

    /**
     * builds ProjectSetReleaseExpiredReservationsAction with checking for non-null required values
     * @return ProjectSetReleaseExpiredReservationsAction
     */
    public ProjectSetReleaseExpiredReservationsAction build() {
        Objects.requireNonNull(releaseExpiredReservations,
            ProjectSetReleaseExpiredReservationsAction.class + ": releaseExpiredReservations is missing");
        return new ProjectSetReleaseExpiredReservationsActionImpl(releaseExpiredReservations);
    }

    /**
     * builds ProjectSetReleaseExpiredReservationsAction without checking for non-null required values
     * @return ProjectSetReleaseExpiredReservationsAction
     */
    public ProjectSetReleaseExpiredReservationsAction buildUnchecked() {
        return new ProjectSetReleaseExpiredReservationsActionImpl(releaseExpiredReservations);
    }

    /**
     * factory method for an instance of ProjectSetReleaseExpiredReservationsActionBuilder
     * @return builder
     */
    public static ProjectSetReleaseExpiredReservationsActionBuilder of() {
        return new ProjectSetReleaseExpiredReservationsActionBuilder();
    }

    /**
     * create builder for ProjectSetReleaseExpiredReservationsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectSetReleaseExpiredReservationsActionBuilder of(
            final ProjectSetReleaseExpiredReservationsAction template) {
        ProjectSetReleaseExpiredReservationsActionBuilder builder = new ProjectSetReleaseExpiredReservationsActionBuilder();
        builder.releaseExpiredReservations = template.getReleaseExpiredReservations();
        return builder;
    }

}
