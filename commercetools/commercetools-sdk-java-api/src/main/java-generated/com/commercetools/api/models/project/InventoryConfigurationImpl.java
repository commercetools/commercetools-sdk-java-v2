
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
 *  <p>Inventory configuration settings for a Project.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryConfigurationImpl implements InventoryConfiguration, ModelBase {

    private Integer reservationExpirationInMinutes;

    private Boolean releaseExpiredReservations;

    /**
     * create instance with all properties
     */
    @JsonCreator
    InventoryConfigurationImpl(
            @JsonProperty("reservationExpirationInMinutes") final Integer reservationExpirationInMinutes,
            @JsonProperty("releaseExpiredReservations") final Boolean releaseExpiredReservations) {
        this.reservationExpirationInMinutes = reservationExpirationInMinutes;
        this.releaseExpiredReservations = releaseExpiredReservations;
    }

    /**
     * create empty instance
     */
    public InventoryConfigurationImpl() {
    }

    /**
     *  <p>The number of minutes after which a <a href="https://docs.commercetools.com/apis/ctp:api:type:Reservation" rel="nofollow">Reservation</a> expires. To use the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryMode" rel="nofollow">ReserveOnCart</a> inventory mode, this field must be set.</p>
     */

    public Integer getReservationExpirationInMinutes() {
        return this.reservationExpirationInMinutes;
    }

    /**
     *  <p>If set to <code>true</code>, <a href="https://docs.commercetools.com/apis/ctp:api:type:Reservation" rel="nofollow">Reservations</a> are marked as <code>Expired</code> once their <code>reservationExpirationInMinutes</code> is reached. The reserved inventory is then made available. If set to <code>false</code>, tracking Line Items with expired reservations becomes your responsibility.</p>
     */

    public Boolean getReleaseExpiredReservations() {
        return this.releaseExpiredReservations;
    }

    public void setReservationExpirationInMinutes(final Integer reservationExpirationInMinutes) {
        this.reservationExpirationInMinutes = reservationExpirationInMinutes;
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

        InventoryConfigurationImpl that = (InventoryConfigurationImpl) o;

        return new EqualsBuilder().append(reservationExpirationInMinutes, that.reservationExpirationInMinutes)
                .append(releaseExpiredReservations, that.releaseExpiredReservations)
                .append(reservationExpirationInMinutes, that.reservationExpirationInMinutes)
                .append(releaseExpiredReservations, that.releaseExpiredReservations)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(reservationExpirationInMinutes)
                .append(releaseExpiredReservations)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                .append("reservationExpirationInMinutes", reservationExpirationInMinutes)
                .append("releaseExpiredReservations", releaseExpiredReservations)
                .build();
    }

    @Override
    public InventoryConfiguration copyDeep() {
        return InventoryConfiguration.deepCopy(this);
    }
}
