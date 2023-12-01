
package com.commercetools.history.models.label;

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
 * AssociateRoleLabel
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AssociateRoleLabelImpl implements AssociateRoleLabel, ModelBase {

    private String type;

    private String key;

    private String name;

    /**
     * create instance with all properties
     */
    @JsonCreator
    AssociateRoleLabelImpl(@JsonProperty("key") final String key, @JsonProperty("name") final String name) {
        this.key = key;
        this.name = name;
        this.type = ASSOCIATE_ROLE_LABEL;
    }

    /**
     * create empty instance
     */
    public AssociateRoleLabelImpl() {
        this.type = ASSOCIATE_ROLE_LABEL;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>User-defined unique identifier of the Associate Role.</p>
     */

    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Name of the Associate Role.</p>
     */

    public String getName() {
        return this.name;
    }

    public void setKey(final String key) {
        this.key = key;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AssociateRoleLabelImpl that = (AssociateRoleLabelImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(key, that.key)
                .append(name, that.name)
                .append(type, that.type)
                .append(key, that.key)
                .append(name, that.name)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(key).append(name).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("key", key)
                .append("name", name)
                .build();
    }

}
