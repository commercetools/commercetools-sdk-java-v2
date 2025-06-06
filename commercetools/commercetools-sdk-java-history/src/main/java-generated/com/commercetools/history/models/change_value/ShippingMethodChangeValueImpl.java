
package com.commercetools.history.models.change_value;

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
 * ShippingMethodChangeValue
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodChangeValueImpl implements ShippingMethodChangeValue, ModelBase {

    private String id;

    private String name;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ShippingMethodChangeValueImpl(@JsonProperty("id") final String id, @JsonProperty("name") final String name) {
        this.id = id;
        this.name = name;
    }

    /**
     * create empty instance
     */
    public ShippingMethodChangeValueImpl() {
    }

    /**
     *  <p><code>id</code> of the ShippingMethod.</p>
     */

    public String getId() {
        return this.id;
    }

    /**
     *  <p>Name of the ShippingMethod.</p>
     */

    public String getName() {
        return this.name;
    }

    public void setId(final String id) {
        this.id = id;
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

        ShippingMethodChangeValueImpl that = (ShippingMethodChangeValueImpl) o;

        return new EqualsBuilder().append(id, that.id)
                .append(name, that.name)
                .append(id, that.id)
                .append(name, that.name)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).append(name).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("id", id)
                .append("name", name)
                .build();
    }

    @Override
    public ShippingMethodChangeValue copyDeep() {
        return ShippingMethodChangeValue.deepCopy(this);
    }
}
