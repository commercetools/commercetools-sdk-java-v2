
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
 *  <p>This type represents an attribute whose value is a date with time.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DateTimeAttributeImpl implements DateTimeAttribute, ModelBase {

    private String name;

    private String type;

    private java.time.ZonedDateTime value;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DateTimeAttributeImpl(@JsonProperty("name") final String name,
            @JsonProperty("value") final java.time.ZonedDateTime value) {
        this.name = name;
        this.value = value;
        this.type = DATETIME;
    }

    /**
     * create empty instance
     */
    public DateTimeAttributeImpl() {
        this.type = DATETIME;
    }

    /**
     *  <p>Required if used for ProductVariantImport. Must not be set if used for ProductVariantPatch.</p>
     *  <p>Must match <code>name</code> of an AttributeDefinition of the Product Type.</p>
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>Must match <code>type</code> of an AttributeDefinition of the Product Type. The type is required if this type is used in a product variant and must not be set when used in a product variant patch.</p>
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>A date with time in the format <code>YYYY-MM-DDTHH:mm:ss.SSSZ</code>. The time zone is optional and defaults to UTC if not specified. If the time zone is specified, it must be in the format <code>±HH:mm</code> or <code>Z</code> for UTC.</p>
     */

    public java.time.ZonedDateTime getValue() {
        return this.value;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setValue(final java.time.ZonedDateTime value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DateTimeAttributeImpl that = (DateTimeAttributeImpl) o;

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

    @Override
    public DateTimeAttribute copyDeep() {
        return DateTimeAttribute.deepCopy(this);
    }
}
