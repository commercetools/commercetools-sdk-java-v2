
package com.commercetools.importapi.models.importrequests;

import java.time.*;
import java.util.*;

import com.commercetools.importapi.models.common.ImportResourceType;
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
 *  <p>The request body to import Business Units. Contains data for Business Units to be created or updated in a Project.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitImportRequestImpl implements BusinessUnitImportRequest, ModelBase {

    private com.commercetools.importapi.models.common.ImportResourceType type;

    private java.util.List<com.commercetools.importapi.models.business_units.BusinessUnitImport> resources;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BusinessUnitImportRequestImpl(
            @JsonProperty("resources") final java.util.List<com.commercetools.importapi.models.business_units.BusinessUnitImport> resources) {
        this.resources = resources;
        this.type = ImportResourceType.findEnum("business-unit");
    }

    /**
     * create empty instance
     */
    public BusinessUnitImportRequestImpl() {
        this.type = ImportResourceType.findEnum("business-unit");
    }

    /**
     *  <p>The resource type that can be imported.</p>
     */

    public com.commercetools.importapi.models.common.ImportResourceType getType() {
        return this.type;
    }

    /**
     *  <p>The Business Unit import resources of this request. Can contain CompanyBusinessUnitImport or DivisionBusinessUnitImport.</p>
     */

    public java.util.List<com.commercetools.importapi.models.business_units.BusinessUnitImport> getResources() {
        return this.resources;
    }

    public void setResources(final com.commercetools.importapi.models.business_units.BusinessUnitImport... resources) {
        this.resources = new ArrayList<>(Arrays.asList(resources));
    }

    public void setResources(
            final java.util.List<com.commercetools.importapi.models.business_units.BusinessUnitImport> resources) {
        this.resources = resources;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        BusinessUnitImportRequestImpl that = (BusinessUnitImportRequestImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(resources, that.resources)
                .append(type, that.type)
                .append(resources, that.resources)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(resources).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("resources", resources)
                .build();
    }

    @Override
    public BusinessUnitImportRequest copyDeep() {
        return BusinessUnitImportRequest.deepCopy(this);
    }
}
