
package com.commercetools.importapi.models.productvariants;

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
 *  <p>This type represents an attribute whose value is either "true" or "false".</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BooleanAttributeImpl implements BooleanAttribute, ModelBase {

    private String name;

    private String type;

    private Boolean value;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BooleanAttributeImpl(@JsonProperty("name") final String name, @JsonProperty("value") final Boolean value) {
        this.name = name;
        this.value = value;
        this.type = BOOLEAN;
    }

    /**
     * create empty instance
     */
    public BooleanAttributeImpl() {
        this.type = BOOLEAN;
    }

    /**
     *  <p>The name of this attribute must match a name of the product types attribute definitions. The name is required if this type is used in a product variant and must not be set when used in a product variant patch.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *
     */

    public Boolean getValue() {
        return this.value;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setValue(final Boolean value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        BooleanAttributeImpl that = (BooleanAttributeImpl) o;

        return new EqualsBuilder().append(name, that.name)
                .append(type, that.type)
                .append(value, that.value)
                .append(name, that.name)
                .append(type, that.type)
                .append(value, that.value)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).append(type).append(value).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("name", name)
                .append("type", type)
                .append("value", value)
                .build();
    }

}
