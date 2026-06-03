
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>If set to <code>true</code>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Reservation" rel="nofollow">Reservations</a> are marked as <code>Expired</code> once their <code>reservationExpirationInMinutes</code> is reached. The reserved inventory is then made available. If set to <code>false</code>, tracking Line Items with expired reservations becomes your responsibility.</p>
 *
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
@io.vrap.rmf.base.client.utils.json.SubType("setReleaseExpiredReservations")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProjectSetReleaseExpiredReservationsActionImpl.class)
public interface ProjectSetReleaseExpiredReservationsAction extends ProjectUpdateAction {

    /**
     * discriminator value for ProjectSetReleaseExpiredReservationsAction
     */
    String SET_RELEASE_EXPIRED_RESERVATIONS = "setReleaseExpiredReservations";

    /**
     *  <p>Value to set.</p>
     * @return releaseExpiredReservations
     */
    @NotNull
    @JsonProperty("releaseExpiredReservations")
    public Boolean getReleaseExpiredReservations();

    /**
     *  <p>Value to set.</p>
     * @param releaseExpiredReservations value to be set
     */

    public void setReleaseExpiredReservations(final Boolean releaseExpiredReservations);

    /**
     * factory method
     * @return instance of ProjectSetReleaseExpiredReservationsAction
     */
    public static ProjectSetReleaseExpiredReservationsAction of() {
        return new ProjectSetReleaseExpiredReservationsActionImpl();
    }

    /**
     * factory method to create a shallow copy ProjectSetReleaseExpiredReservationsAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProjectSetReleaseExpiredReservationsAction of(
            final ProjectSetReleaseExpiredReservationsAction template) {
        ProjectSetReleaseExpiredReservationsActionImpl instance = new ProjectSetReleaseExpiredReservationsActionImpl();
        instance.setReleaseExpiredReservations(template.getReleaseExpiredReservations());
        return instance;
    }

    public ProjectSetReleaseExpiredReservationsAction copyDeep();

    /**
     * factory method to create a deep copy of ProjectSetReleaseExpiredReservationsAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProjectSetReleaseExpiredReservationsAction deepCopy(
            @Nullable final ProjectSetReleaseExpiredReservationsAction template) {
        if (template == null) {
            return null;
        }
        ProjectSetReleaseExpiredReservationsActionImpl instance = new ProjectSetReleaseExpiredReservationsActionImpl();
        instance.setReleaseExpiredReservations(template.getReleaseExpiredReservations());
        return instance;
    }

    /**
     * builder factory method for ProjectSetReleaseExpiredReservationsAction
     * @return builder
     */
    public static ProjectSetReleaseExpiredReservationsActionBuilder builder() {
        return ProjectSetReleaseExpiredReservationsActionBuilder.of();
    }

    /**
     * create builder for ProjectSetReleaseExpiredReservationsAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectSetReleaseExpiredReservationsActionBuilder builder(
            final ProjectSetReleaseExpiredReservationsAction template) {
        return ProjectSetReleaseExpiredReservationsActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProjectSetReleaseExpiredReservationsAction(
            Function<ProjectSetReleaseExpiredReservationsAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ProjectSetReleaseExpiredReservationsAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProjectSetReleaseExpiredReservationsAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProjectSetReleaseExpiredReservationsAction>";
            }
        };
    }
}
