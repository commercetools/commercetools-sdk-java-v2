
package com.commercetools.api.models.project;

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
 * BusinessUnitConfiguration
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitConfigurationImpl implements BusinessUnitConfiguration, ModelBase {

    private com.commercetools.api.models.project.BusinessUnitConfigurationStatus myBusinessUnitStatusOnCreation;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitConfigurationImpl(
            @JsonProperty("myBusinessUnitStatusOnCreation") final com.commercetools.api.models.project.BusinessUnitConfigurationStatus myBusinessUnitStatusOnCreation) {
        this.myBusinessUnitStatusOnCreation = myBusinessUnitStatusOnCreation;
    }

    /**
     * create empty instance
     */
    public BusinessUnitConfigurationImpl() {
    }

    /**
     *  <p>Status of Business Units created using the My Business Unit endpoint.</p>
     */

    public com.commercetools.api.models.project.BusinessUnitConfigurationStatus getMyBusinessUnitStatusOnCreation() {
        return this.myBusinessUnitStatusOnCreation;
    }

    public void setMyBusinessUnitStatusOnCreation(
            final com.commercetools.api.models.project.BusinessUnitConfigurationStatus myBusinessUnitStatusOnCreation) {
        this.myBusinessUnitStatusOnCreation = myBusinessUnitStatusOnCreation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        BusinessUnitConfigurationImpl that = (BusinessUnitConfigurationImpl) o;

        return new EqualsBuilder().append(myBusinessUnitStatusOnCreation, that.myBusinessUnitStatusOnCreation)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(myBusinessUnitStatusOnCreation).toHashCode();
    }

}
