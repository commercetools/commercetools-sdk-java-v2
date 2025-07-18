
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
 *  <p>Only Business Units of type <code>Division</code> can be changed to <code>ExplicitAndFromParent</code>. This update action generates a BusinessUnitAssociateModeChanged Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitChangeAssociateModeActionImpl implements BusinessUnitChangeAssociateModeAction, ModelBase {

    private String action;

    private com.commercetools.api.models.business_unit.BusinessUnitAssociateMode associateMode;

    private Boolean makeInheritedAssociatesExplicit;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitChangeAssociateModeActionImpl(
            @JsonProperty("associateMode") final com.commercetools.api.models.business_unit.BusinessUnitAssociateMode associateMode,
            @JsonProperty("makeInheritedAssociatesExplicit") final Boolean makeInheritedAssociatesExplicit) {
        this.associateMode = associateMode;
        this.makeInheritedAssociatesExplicit = makeInheritedAssociatesExplicit;
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

    /**
     *  <p>If set to <code>true</code> during a change to <code>associateMode="Explicit"</code>, all inherited Associates will be converted to explicit Associates.</p>
     */

    public Boolean getMakeInheritedAssociatesExplicit() {
        return this.makeInheritedAssociatesExplicit;
    }

    public void setAssociateMode(
            final com.commercetools.api.models.business_unit.BusinessUnitAssociateMode associateMode) {
        this.associateMode = associateMode;
    }

    public void setMakeInheritedAssociatesExplicit(final Boolean makeInheritedAssociatesExplicit) {
        this.makeInheritedAssociatesExplicit = makeInheritedAssociatesExplicit;
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
                .append(makeInheritedAssociatesExplicit, that.makeInheritedAssociatesExplicit)
                .append(action, that.action)
                .append(associateMode, that.associateMode)
                .append(makeInheritedAssociatesExplicit, that.makeInheritedAssociatesExplicit)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(associateMode)
                .append(makeInheritedAssociatesExplicit)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("associateMode", associateMode)
                .append("makeInheritedAssociatesExplicit", makeInheritedAssociatesExplicit)
                .build();
    }

    @Override
    public BusinessUnitChangeAssociateModeAction copyDeep() {
        return BusinessUnitChangeAssociateModeAction.deepCopy(this);
    }
}
