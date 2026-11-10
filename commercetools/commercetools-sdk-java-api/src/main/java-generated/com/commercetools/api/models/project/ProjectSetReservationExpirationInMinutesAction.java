
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;
import tools.jackson.databind.annotation.*;

/**
 *  <p>To use the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryMode" rel="nofollow">ReserveOnCart</a> Line Item inventory mode, you must set the <code>reservationExpirationInMinutes</code> field on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a> using this update action.</p>
 *  <p>To override the Project setting, use the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntrySetReservationExpirationInMinutesAction" rel="nofollow">Set Reservation Expiration In Minutes</a> update action on specific <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntries</a>.</p>
 *
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
@io.vrap.rmf.base.client.utils.json.SubType("setReservationExpirationInMinutes")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ProjectSetReservationExpirationInMinutesActionImpl.class)
public interface ProjectSetReservationExpirationInMinutesAction extends ProjectUpdateAction {

    /**
     * discriminator value for ProjectSetReservationExpirationInMinutesAction
     */
    String SET_RESERVATION_EXPIRATION_IN_MINUTES = "setReservationExpirationInMinutes";

    /**
     *  <p>Value to set.</p>
     * @return reservationExpirationInMinutes
     */
    @NotNull
    @JsonProperty("reservationExpirationInMinutes")
    public Integer getReservationExpirationInMinutes();

    /**
     *  <p>Value to set.</p>
     * @param reservationExpirationInMinutes value to be set
     */

    public void setReservationExpirationInMinutes(final Integer reservationExpirationInMinutes);

    /**
     * factory method
     * @return instance of ProjectSetReservationExpirationInMinutesAction
     */
    public static ProjectSetReservationExpirationInMinutesAction of() {
        return new ProjectSetReservationExpirationInMinutesActionImpl();
    }

    /**
     * factory method to create a shallow copy ProjectSetReservationExpirationInMinutesAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ProjectSetReservationExpirationInMinutesAction of(
            final ProjectSetReservationExpirationInMinutesAction template) {
        ProjectSetReservationExpirationInMinutesActionImpl instance = new ProjectSetReservationExpirationInMinutesActionImpl();
        instance.setReservationExpirationInMinutes(template.getReservationExpirationInMinutes());
        return instance;
    }

    public ProjectSetReservationExpirationInMinutesAction copyDeep();

    /**
     * factory method to create a deep copy of ProjectSetReservationExpirationInMinutesAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ProjectSetReservationExpirationInMinutesAction deepCopy(
            @Nullable final ProjectSetReservationExpirationInMinutesAction template) {
        if (template == null) {
            return null;
        }
        ProjectSetReservationExpirationInMinutesActionImpl instance = new ProjectSetReservationExpirationInMinutesActionImpl();
        instance.setReservationExpirationInMinutes(template.getReservationExpirationInMinutes());
        return instance;
    }

    /**
     * builder factory method for ProjectSetReservationExpirationInMinutesAction
     * @return builder
     */
    public static ProjectSetReservationExpirationInMinutesActionBuilder builder() {
        return ProjectSetReservationExpirationInMinutesActionBuilder.of();
    }

    /**
     * create builder for ProjectSetReservationExpirationInMinutesAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectSetReservationExpirationInMinutesActionBuilder builder(
            final ProjectSetReservationExpirationInMinutesAction template) {
        return ProjectSetReservationExpirationInMinutesActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withProjectSetReservationExpirationInMinutesAction(
            Function<ProjectSetReservationExpirationInMinutesAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<ProjectSetReservationExpirationInMinutesAction> typeReference() {
        return new tools.jackson.core.type.TypeReference<ProjectSetReservationExpirationInMinutesAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProjectSetReservationExpirationInMinutesAction>";
            }
        };
    }
}
