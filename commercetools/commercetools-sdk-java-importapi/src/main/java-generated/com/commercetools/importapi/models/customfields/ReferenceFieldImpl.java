
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

/**
*  <p>A field with a reference value.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ReferenceFieldImpl implements ReferenceField, ModelBase {

    private String type;

    private com.commercetools.importapi.models.common.KeyReference value;

    @JsonCreator
    ReferenceFieldImpl(@JsonProperty("value") final com.commercetools.importapi.models.common.KeyReference value) {
        this.value = value;
        this.type = REFERENCE;
    }

    public ReferenceFieldImpl() {
        this.type = REFERENCE;
    }

    /**
    *  <p>The type of this field.</p>
    */
    public String getType() {
        return this.type;
    }

    /**
    *  <p>References a resource by key</p>
    */
    public com.commercetools.importapi.models.common.KeyReference getValue() {
        return this.value;
    }

    public void setValue(final com.commercetools.importapi.models.common.KeyReference value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ReferenceFieldImpl that = (ReferenceFieldImpl) o;

        return new EqualsBuilder().append(type, that.type).append(value, that.value).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(value).toHashCode();
    }

}
