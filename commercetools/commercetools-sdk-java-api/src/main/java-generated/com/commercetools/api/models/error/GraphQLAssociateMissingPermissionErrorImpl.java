
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonAnySetter;
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
 *  <p>Returned when an <span>Associate</span> is missing a <span>Permission</span> on a <span>B2B resource</span>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLAssociateMissingPermissionErrorImpl implements GraphQLAssociateMissingPermissionError, ModelBase {

    private String code;

    private Map<String, java.lang.Object> values;

    private com.commercetools.api.models.customer.CustomerResourceIdentifier associate;

    private com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit;

    private com.commercetools.api.models.customer.CustomerResourceIdentifier associateOnBehalf;

    private java.util.List<com.commercetools.api.models.associate_role.Permission> permissions;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLAssociateMissingPermissionErrorImpl(
            @JsonAnySetter @JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("associate") final com.commercetools.api.models.customer.CustomerResourceIdentifier associate,
            @JsonProperty("businessUnit") final com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit,
            @JsonProperty("associateOnBehalf") final com.commercetools.api.models.customer.CustomerResourceIdentifier associateOnBehalf,
            @JsonProperty("permissions") final java.util.List<com.commercetools.api.models.associate_role.Permission> permissions) {
        this.values = values;
        this.associate = associate;
        this.businessUnit = businessUnit;
        this.associateOnBehalf = associateOnBehalf;
        this.permissions = permissions;
        this.code = ASSOCIATE_MISSING_PERMISSION;
    }

    /**
     * create empty instance
     */
    public GraphQLAssociateMissingPermissionErrorImpl() {
        this.code = ASSOCIATE_MISSING_PERMISSION;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public Map<String, java.lang.Object> values() {
        return values;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> that tried to perform the action.</p>
     */

    public com.commercetools.api.models.customer.CustomerResourceIdentifier getAssociate() {
        return this.associate;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitResourceIdentifier" rel="nofollow">ResourceIdentifier</a> to the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a>.</p>
     */

    public com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier getBusinessUnit() {
        return this.businessUnit;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomerResourceIdentifier" rel="nofollow">ResourceIdentifier</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> on whose behalf the action is performed.</p>
     */

    public com.commercetools.api.models.customer.CustomerResourceIdentifier getAssociateOnBehalf() {
        return this.associateOnBehalf;
    }

    /**
     *  <p>The Permissions that the <a href="https://docs.commercetools.com/apis/ctp:api:type:Associate" rel="nofollow">Associate</a> performing the action lacks. At least one of these Permissions is needed.</p>
     */

    public java.util.List<com.commercetools.api.models.associate_role.Permission> getPermissions() {
        return this.permissions;
    }

    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

    public void setAssociate(final com.commercetools.api.models.customer.CustomerResourceIdentifier associate) {
        this.associate = associate;
    }

    public void setBusinessUnit(
            final com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit) {
        this.businessUnit = businessUnit;
    }

    public void setAssociateOnBehalf(
            final com.commercetools.api.models.customer.CustomerResourceIdentifier associateOnBehalf) {
        this.associateOnBehalf = associateOnBehalf;
    }

    public void setPermissions(final com.commercetools.api.models.associate_role.Permission... permissions) {
        this.permissions = new ArrayList<>(Arrays.asList(permissions));
    }

    public void setPermissions(
            final java.util.List<com.commercetools.api.models.associate_role.Permission> permissions) {
        this.permissions = permissions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        GraphQLAssociateMissingPermissionErrorImpl that = (GraphQLAssociateMissingPermissionErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(values, that.values)
                .append(associate, that.associate)
                .append(businessUnit, that.businessUnit)
                .append(associateOnBehalf, that.associateOnBehalf)
                .append(permissions, that.permissions)
                .append(code, that.code)
                .append(values, that.values)
                .append(associate, that.associate)
                .append(businessUnit, that.businessUnit)
                .append(associateOnBehalf, that.associateOnBehalf)
                .append(permissions, that.permissions)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code)
                .append(values)
                .append(associate)
                .append(businessUnit)
                .append(associateOnBehalf)
                .append(permissions)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("values", values)
                .append("associate", associate)
                .append("businessUnit", businessUnit)
                .append("associateOnBehalf", associateOnBehalf)
                .append("permissions", permissions)
                .build();
    }

    @Override
    public GraphQLAssociateMissingPermissionError copyDeep() {
        return GraphQLAssociateMissingPermissionError.deepCopy(this);
    }
}
