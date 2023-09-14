
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

/**
 *  <p>Only Business Units of type <code>Division</code> can be changed to <code>ExplicitAndFromParent</code>. This update action generates a BusinessUnitAssociateModeChanged Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitChangeAssociateModeActionImpl implements BusinessUnitChangeAssociateModeAction, ModelBase {

    private String action;

    private com.commercetools.api.models.business_unit.BusinessUnitAssociateMode associateMode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitChangeAssociateModeActionImpl(
            @JsonProperty("associateMode") final com.commercetools.api.models.business_unit.BusinessUnitAssociateMode associateMode) {
        this.associateMode = associateMode;
        this.action = CHANGE_ASSOCIATE_MODE;
    }

    /**
     * create empty instance
     */
    public BusinessUnitChangeAssociateModeActionImpl() {
        this.action = CHANGE_ASSOCIATE_MODE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>The new value for <code>associateMode</code>.</p>
     */

    public com.commercetools.api.models.business_unit.BusinessUnitAssociateMode getAssociateMode() {
        return this.associateMode;
    }

    public void setAssociateMode(
            final com.commercetools.api.models.business_unit.BusinessUnitAssociateMode associateMode) {
        this.associateMode = associateMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        BusinessUnitChangeAssociateModeActionImpl that = (BusinessUnitChangeAssociateModeActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(associateMode, that.associateMode)
                .append(action, that.action)
                .append(associateMode, that.associateMode)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(associateMode).toHashCode();
    }

}
