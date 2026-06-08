
package com.commercetools.api.models.message;

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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntrySetReservationExpirationInMinutesAction" rel="nofollow">Set Reservation Expiration In Minutes</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InventoryEntryReservationExpirationInMinutesSetMessagePayloadImpl
        implements InventoryEntryReservationExpirationInMinutesSetMessagePayload, ModelBase {

    private String type;

    private Integer newReservationExpirationInMinutes;

    private Integer oldReservationExpirationInMinutes;

    /**
     * create instance with all properties
     */
    @JsonCreator
    InventoryEntryReservationExpirationInMinutesSetMessagePayloadImpl(
            @JsonProperty("newReservationExpirationInMinutes") final Integer newReservationExpirationInMinutes,
            @JsonProperty("oldReservationExpirationInMinutes") final Integer oldReservationExpirationInMinutes) {
        this.newReservationExpirationInMinutes = newReservationExpirationInMinutes;
        this.oldReservationExpirationInMinutes = oldReservationExpirationInMinutes;
        this.type = INVENTORY_ENTRY_RESERVATION_EXPIRATION_IN_MINUTES_SET;
    }

    /**
     * create empty instance
     */
    public InventoryEntryReservationExpirationInMinutesSetMessagePayloadImpl() {
        this.type = INVENTORY_ENTRY_RESERVATION_EXPIRATION_IN_MINUTES_SET;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p><code>reservationExpirationInMinutes</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">Inventory Entry</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntrySetReservationExpirationInMinutesAction" rel="nofollow">Set Reservation Expiration In Minutes</a> update action.</p>
     */

    public Integer getNewReservationExpirationInMinutes() {
        return this.newReservationExpirationInMinutes;
    }

    /**
     *  <p><code>reservationExpirationInMinutes</code> value of the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntry" rel="nofollow">Inventory Entry</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:InventoryEntrySetReservationExpirationInMinutesAction" rel="nofollow">Set Reservation Expiration In Minutes</a> update action.</p>
     */

    public Integer getOldReservationExpirationInMinutes() {
        return this.oldReservationExpirationInMinutes;
    }

    public void setNewReservationExpirationInMinutes(final Integer newReservationExpirationInMinutes) {
        this.newReservationExpirationInMinutes = newReservationExpirationInMinutes;
    }

    public void setOldReservationExpirationInMinutes(final Integer oldReservationExpirationInMinutes) {
        this.oldReservationExpirationInMinutes = oldReservationExpirationInMinutes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        InventoryEntryReservationExpirationInMinutesSetMessagePayloadImpl that = (InventoryEntryReservationExpirationInMinutesSetMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(newReservationExpirationInMinutes, that.newReservationExpirationInMinutes)
                .append(oldReservationExpirationInMinutes, that.oldReservationExpirationInMinutes)
                .append(type, that.type)
                .append(newReservationExpirationInMinutes, that.newReservationExpirationInMinutes)
                .append(oldReservationExpirationInMinutes, that.oldReservationExpirationInMinutes)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(newReservationExpirationInMinutes)
                .append(oldReservationExpirationInMinutes)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("newReservationExpirationInMinutes", newReservationExpirationInMinutes)
                .append("oldReservationExpirationInMinutes", oldReservationExpirationInMinutes)
                .build();
    }

    @Override
    public InventoryEntryReservationExpirationInMinutesSetMessagePayload copyDeep() {
        return InventoryEntryReservationExpirationInMinutesSetMessagePayload.deepCopy(this);
    }
}
