
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
 *  <p>If set to <code>true</code>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Reservation" rel="nofollow">Reservations</a> are marked as <code>Expired</code> once their <code>reservationExpirationInMinutes</code> is reached. The reserved inventory is then made available. If set to <code>false</code>, tracking Line Items with expired reservations becomes your responsibility.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProjectSetReleaseExpiredReservationsActionImpl
        implements ProjectSetReleaseExpiredReservationsAction, ModelBase {

    private String action;

    private Boolean releaseExpiredReservations;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProjectSetReleaseExpiredReservationsActionImpl(
            @JsonProperty("releaseExpiredReservations") final Boolean releaseExpiredReservations) {
        this.releaseExpiredReservations = releaseExpiredReservations;
        this.action = SET_RELEASE_EXPIRED_RESERVATIONS;
    }

    /**
     * create empty instance
     */
    public ProjectSetReleaseExpiredReservationsActionImpl() {
        this.action = SET_RELEASE_EXPIRED_RESERVATIONS;
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

    public Boolean getReleaseExpiredReservations() {
        return this.releaseExpiredReservations;
    }

    public void setReleaseExpiredReservations(final Boolean releaseExpiredReservations) {
        this.releaseExpiredReservations = releaseExpiredReservations;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ProjectSetReleaseExpiredReservationsActionImpl that = (ProjectSetReleaseExpiredReservationsActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(releaseExpiredReservations, that.releaseExpiredReservations)
                .append(action, that.action)
                .append(releaseExpiredReservations, that.releaseExpiredReservations)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(releaseExpiredReservations).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("releaseExpiredReservations", releaseExpiredReservations)
                .build();
    }

    @Override
    public ProjectSetReleaseExpiredReservationsAction copyDeep() {
        return ProjectSetReleaseExpiredReservationsAction.deepCopy(this);
    }
}
