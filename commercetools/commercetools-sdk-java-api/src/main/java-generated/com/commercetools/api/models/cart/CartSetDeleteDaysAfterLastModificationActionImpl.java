
package com.commercetools.api.models.cart;

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
 *  <p>Number of days after which a Cart with <code>Active</code> CartState is deleted since its last modification.</p>
 *  <p>If a ChangeSubscription exists for Carts, a ResourceDeletedDeliveryPayload is sent.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetDeleteDaysAfterLastModificationActionImpl
        implements CartSetDeleteDaysAfterLastModificationAction, ModelBase {

    private String action;

    private Integer deleteDaysAfterLastModification;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartSetDeleteDaysAfterLastModificationActionImpl(
            @JsonProperty("deleteDaysAfterLastModification") final Integer deleteDaysAfterLastModification) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
        this.action = SET_DELETE_DAYS_AFTER_LAST_MODIFICATION;
    }

    /**
     * create empty instance
     */
    public CartSetDeleteDaysAfterLastModificationActionImpl() {
        this.action = SET_DELETE_DAYS_AFTER_LAST_MODIFICATION;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>Value to set. If not provided, the default value for this field configured in Project settings is assigned.</p>
     */

    public Integer getDeleteDaysAfterLastModification() {
        return this.deleteDaysAfterLastModification;
    }

    public void setDeleteDaysAfterLastModification(final Integer deleteDaysAfterLastModification) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartSetDeleteDaysAfterLastModificationActionImpl that = (CartSetDeleteDaysAfterLastModificationActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(deleteDaysAfterLastModification, that.deleteDaysAfterLastModification)
                .append(action, that.action)
                .append(deleteDaysAfterLastModification, that.deleteDaysAfterLastModification)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(deleteDaysAfterLastModification).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("deleteDaysAfterLastModification", deleteDaysAfterLastModification)
                .build();
    }

}
