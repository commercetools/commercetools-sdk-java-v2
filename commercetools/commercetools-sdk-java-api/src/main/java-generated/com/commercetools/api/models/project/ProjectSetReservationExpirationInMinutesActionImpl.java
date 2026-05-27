
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>To use the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryMode" rel="nofollow">ReserveOnCart</a> Line Item inventory mode, you must set the <code>reservationExpirationInMinutes</code> field on the <a href="https://docs.commercetools.com/apis/ctp:api:type:Project" rel="nofollow">Project</a> using this update action.</p>
 *  <p>To override the Project setting, use the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntrySetReservationExpirationInMinutesAction" rel="nofollow">Set Reservation Expiration In Minutes</a> update action on specific <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">InventoryEntries</a>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProjectSetReservationExpirationInMinutesActionImpl
        implements ProjectSetReservationExpirationInMinutesAction, ModelBase {

    private String action;

    private Integer reservationExpirationInMinutes;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProjectSetReservationExpirationInMinutesActionImpl(
            @JsonProperty("reservationExpirationInMinutes") final Integer reservationExpirationInMinutes) {
        this.reservationExpirationInMinutes = reservationExpirationInMinutes;
        this.action = SET_RESERVATION_EXPIRATION_IN_MINUTES;
    }

    /**
     * create empty instance
     */
    public ProjectSetReservationExpirationInMinutesActionImpl() {
        this.action = SET_RESERVATION_EXPIRATION_IN_MINUTES;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set.</p>
     */

    public Integer getReservationExpirationInMinutes() {
        return this.reservationExpirationInMinutes;
    }

    public void setReservationExpirationInMinutes(final Integer reservationExpirationInMinutes) {
        this.reservationExpirationInMinutes = reservationExpirationInMinutes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProjectSetReservationExpirationInMinutesActionImpl that = (ProjectSetReservationExpirationInMinutesActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(reservationExpirationInMinutes, that.reservationExpirationInMinutes)
                .append(action, that.action)
                .append(reservationExpirationInMinutes, that.reservationExpirationInMinutes)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(reservationExpirationInMinutes).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("reservationExpirationInMinutes", reservationExpirationInMinutes)
                .build();
    }

    @Override
    public ProjectSetReservationExpirationInMinutesAction copyDeep() {
        return ProjectSetReservationExpirationInMinutesAction.deepCopy(this);
    }
}
