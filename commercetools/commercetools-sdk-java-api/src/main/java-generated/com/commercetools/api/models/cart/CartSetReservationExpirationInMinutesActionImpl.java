
package com.commercetools.api.models.cart;

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
 *  <p>Sets a new expiration date and time for all <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryMode" rel="nofollow">ReserveOnCart</a> Line Items with a <a href="https://docs.commercetools.com/apis/ctp:api:type:Reservation" rel="nofollow">Reservation</a>. The Cart will return a <a href="https://docs.commercetools.com/apis/ctp:api:type:WarningObject" rel="nofollow">warning</a> for any Reservation that could not be changed.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetReservationExpirationInMinutesActionImpl
        implements CartSetReservationExpirationInMinutesAction, ModelBase {

    private String action;

    private Integer reservationExpirationInMinutes;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartSetReservationExpirationInMinutesActionImpl(
            @JsonProperty("reservationExpirationInMinutes") final Integer reservationExpirationInMinutes) {
        this.reservationExpirationInMinutes = reservationExpirationInMinutes;
        this.action = SET_RESERVATION_EXPIRATION_IN_MINUTES;
    }

    /**
     * create empty instance
     */
    public CartSetReservationExpirationInMinutesActionImpl() {
        this.action = SET_RESERVATION_EXPIRATION_IN_MINUTES;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. Must be a positive integer.</p>
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

        CartSetReservationExpirationInMinutesActionImpl that = (CartSetReservationExpirationInMinutesActionImpl) o;

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
    public CartSetReservationExpirationInMinutesAction copyDeep() {
        return CartSetReservationExpirationInMinutesAction.deepCopy(this);
    }
}
