
package com.commercetools.api.models.warning;

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
 *  <p>Contained in responses to a <span>Cart</span> update operation. Indicates that a <code>ReserveOnCart</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:Reservation" rel="nofollow">Reservation</a> was found for a Line Item but its expiration date and time cannot be changed using the <span>Set Reservation Expiration In Minutes</span> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CannotChangeReservationExpiryWarningImpl implements CannotChangeReservationExpiryWarning, ModelBase {

    private String code;

    private String message;

    private String lineItemId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CannotChangeReservationExpiryWarningImpl(@JsonProperty("message") final String message,
            @JsonProperty("lineItemId") final String lineItemId) {
        this.message = message;
        this.lineItemId = lineItemId;
        this.code = CANNOT_CHANGE_RESERVATION_EXPIRY;
    }

    /**
     * create empty instance
     */
    public CannotChangeReservationExpiryWarningImpl() {
        this.code = CANNOT_CHANGE_RESERVATION_EXPIRY;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p><code>"The reservation expiration for line item $lineItemId cannot be changed."</code></p>
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>The ID of the Line Item.</p>
     */

    public String getLineItemId() {
        return this.lineItemId;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setLineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CannotChangeReservationExpiryWarningImpl that = (CannotChangeReservationExpiryWarningImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(lineItemId, that.lineItemId)
                .append(code, that.code)
                .append(message, that.message)
                .append(lineItemId, that.lineItemId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(message).append(lineItemId).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("message", message)
                .append("lineItemId", lineItemId)
                .build();
    }

    @Override
    public CannotChangeReservationExpiryWarning copyDeep() {
        return CannotChangeReservationExpiryWarning.deepCopy(this);
    }
}
