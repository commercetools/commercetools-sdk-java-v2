
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Field type for <a href="https://docs.commercetools.com/apis/ctp:api:type:Time" rel="nofollow">Time</a> values.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomFieldTimeTypeImpl implements CustomFieldTimeType, ModelBase {

    private String name;

    /**
     * create instance with all properties
     */
    @JsonCreator
    public CustomFieldTimeTypeImpl() {
        this.name = TIME;
    }

    /**
     *  <p>Discriminator that determines the type of the field.</p>
     */

    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CustomFieldTimeTypeImpl that = (CustomFieldTimeTypeImpl) o;

        return new EqualsBuilder().append(name, that.name).append(name, that.name).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("name", name).build();
    }

    @Override
    public CustomFieldTimeType copyDeep() {
        return CustomFieldTimeType.deepCopy(this);
    }
}
