
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
 *  <p>A field with a date time value.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DateTimeFieldImpl implements DateTimeField, ModelBase {

    private String type;

    private java.time.ZonedDateTime value;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DateTimeFieldImpl(@JsonProperty("value") final java.time.ZonedDateTime value) {
        this.value = value;
        this.type = DATE_TIME;
    }

    /**
     * create empty instance
     */
    public DateTimeFieldImpl() {
        this.type = DATE_TIME;
    }

    /**
     *  <p>The type of this field.</p>
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

    public void setValue(final java.time.ZonedDateTime value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DateTimeFieldImpl that = (DateTimeFieldImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(value, that.value)
                .append(type, that.type)
                .append(value, that.value)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(value).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("value", value)
                .build();
    }

    @Override
    public DateTimeField copyDeep() {
        return DateTimeField.deepCopy(this);
    }
}
