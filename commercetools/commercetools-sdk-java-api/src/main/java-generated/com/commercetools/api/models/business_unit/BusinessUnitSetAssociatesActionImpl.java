
package com.commercetools.api.models.business_unit;

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
 *  <p>Changes the Associates of a Business Unit, generates a BusinessUnitAssociatesSet Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitSetAssociatesActionImpl implements BusinessUnitSetAssociatesAction, ModelBase {

    private String action;

    private java.util.List<com.commercetools.api.models.business_unit.AssociateDraft> associates;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitSetAssociatesActionImpl(
            @JsonProperty("associates") final java.util.List<com.commercetools.api.models.business_unit.AssociateDraft> associates) {
        this.associates = associates;
        this.action = SET_ASSOCIATES;
    }

    /**
     * create empty instance
     */
    public BusinessUnitSetAssociatesActionImpl() {
        this.action = SET_ASSOCIATES;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>The new list of Associates. If empty, existing values will be removed.</p>
     */

    public java.util.List<com.commercetools.api.models.business_unit.AssociateDraft> getAssociates() {
        return this.associates;
    }

    public void setAssociates(final com.commercetools.api.models.business_unit.AssociateDraft... associates) {
        this.associates = new ArrayList<>(Arrays.asList(associates));
    }

    public void setAssociates(
            final java.util.List<com.commercetools.api.models.business_unit.AssociateDraft> associates) {
        this.associates = associates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        BusinessUnitSetAssociatesActionImpl that = (BusinessUnitSetAssociatesActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(associates, that.associates)
                .append(action, that.action)
                .append(associates, that.associates)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(associates).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("associates", associates)
                .build();
    }

    @Override
    public BusinessUnitSetAssociatesAction copyDeep() {
        return BusinessUnitSetAssociatesAction.deepCopy(this);
    }
}
