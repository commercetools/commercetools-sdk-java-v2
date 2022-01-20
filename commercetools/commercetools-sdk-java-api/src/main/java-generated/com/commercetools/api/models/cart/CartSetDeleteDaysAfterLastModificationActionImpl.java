
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CartSetDeleteDaysAfterLastModificationActionImpl
        implements CartSetDeleteDaysAfterLastModificationAction, ModelBase {

    private String action;

    private Integer deleteDaysAfterLastModification;

    @JsonCreator
    CartSetDeleteDaysAfterLastModificationActionImpl(
            @JsonProperty("deleteDaysAfterLastModification") final Integer deleteDaysAfterLastModification) {
        this.deleteDaysAfterLastModification = deleteDaysAfterLastModification;
        this.action = SET_DELETE_DAYS_AFTER_LAST_MODIFICATION;
    }

    public CartSetDeleteDaysAfterLastModificationActionImpl() {
        this.action = SET_DELETE_DAYS_AFTER_LAST_MODIFICATION;
    }

    public String getAction() {
        return this.action;
    }

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
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(deleteDaysAfterLastModification).toHashCode();
    }

}
