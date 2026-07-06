
package com.commercetools.api.models.inventory;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Sets the default reservation expiration time for the Inventory Entry. This action does not affect existing reservations. To change the expiration date and time of existing reservations, see the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartSetReservationExpirationInMinutesAction" rel="nofollow">Set Reservation Expiration In Minutes</a> update action on the Carts API.</p>
 *  <p>Produces the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntryReservationExpirationInMinutesSetMessage" rel="nofollow">InventoryEntry Reservation Expiration In Minutes Set</a> Message after a successful update.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryEntrySetReservationExpirationInMinutesActionImpl
        implements InventoryEntrySetReservationExpirationInMinutesAction, ModelBase {

    private String action;

    private Integer reservationExpirationInMinutes;

    /**
     * create instance with all properties
     */
    @JsonCreator
    InventoryEntrySetReservationExpirationInMinutesActionImpl(
            @JsonProperty("reservationExpirationInMinutes") final Integer reservationExpirationInMinutes) {
        this.reservationExpirationInMinutes = reservationExpirationInMinutes;
        this.action = SET_RESERVATION_EXPIRATION_IN_MINUTES;
    }

    /**
     * create empty instance
     */
    public InventoryEntrySetReservationExpirationInMinutesActionImpl() {
        this.action = SET_RESERVATION_EXPIRATION_IN_MINUTES;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set, must be a positive integer. If empty, any existing value will be removed.</p>
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

        InventoryEntrySetReservationExpirationInMinutesActionImpl that = (InventoryEntrySetReservationExpirationInMinutesActionImpl) o;

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
    public InventoryEntrySetReservationExpirationInMinutesAction copyDeep() {
        return InventoryEntrySetReservationExpirationInMinutesAction.deepCopy(this);
    }
}
