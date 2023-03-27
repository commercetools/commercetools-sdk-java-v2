
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
 *  <p>Changing the status of a Business Unit generates a BusinessUnitStatusChanged Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitChangeStatusActionImpl implements BusinessUnitChangeStatusAction, ModelBase {

    private String action;

    private String status;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitChangeStatusActionImpl(@JsonProperty("status") final String status) {
        this.status = status;
        this.action = CHANGE_STATUS;
    }

    /**
     * create empty instance
     */
    public BusinessUnitChangeStatusActionImpl() {
        this.action = CHANGE_STATUS;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New status to set.</p>
     */

    public String getStatus() {
        return this.status;
    }

    public void setStatus(final String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        BusinessUnitChangeStatusActionImpl that = (BusinessUnitChangeStatusActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(status, that.status).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(status).toHashCode();
    }

}
