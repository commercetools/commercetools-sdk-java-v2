
package com.commercetools.importapi.models.customfields;

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
 *  <p>The representation to be sent to the server when creating a resource with Custom Fields.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomImpl implements Custom, ModelBase {

    private com.commercetools.importapi.models.common.TypeKeyReference type;

    private com.commercetools.importapi.models.customfields.FieldContainer fields;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CustomImpl(@JsonProperty("type") final com.commercetools.importapi.models.common.TypeKeyReference type,
            @JsonProperty("fields") final com.commercetools.importapi.models.customfields.FieldContainer fields) {
        this.type = type;
        this.fields = fields;
    }

    /**
     * create empty instance
     */
    public CustomImpl() {
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:Type" rel="nofollow">Type</a> that provides the field definitions for this object. If the referenced Type does not exist, the <code>state</code> of the <a href="https://docs.commercetools.com/apis/ctp:import:type:ImportOperation" rel="nofollow">ImportOperation</a> will be set to <code>unresolved</code> until the referenced Type is created.</p>
     */

    public com.commercetools.importapi.models.common.TypeKeyReference getType() {
        return this.type;
    }

    /**
     *  <p>The Custom Fields of this object.</p>
     */

    public com.commercetools.importapi.models.customfields.FieldContainer getFields() {
        return this.fields;
    }

    public void setType(final com.commercetools.importapi.models.common.TypeKeyReference type) {
        this.type = type;
    }

    public void setFields(final com.commercetools.importapi.models.customfields.FieldContainer fields) {
        this.fields = fields;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomImpl that = (CustomImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(fields, that.fields)
                .append(type, that.type)
                .append(fields, that.fields)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(fields).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("fields", fields)
                .build();
    }

    @Override
    public Custom copyDeep() {
        return Custom.deepCopy(this);
    }
}
