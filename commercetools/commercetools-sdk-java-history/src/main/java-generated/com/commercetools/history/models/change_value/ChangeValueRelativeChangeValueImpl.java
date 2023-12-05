
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
 * ChangeValueRelativeChangeValue
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ChangeValueRelativeChangeValueImpl implements ChangeValueRelativeChangeValue, ModelBase {

    private String type;

    private Integer permyriad;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ChangeValueRelativeChangeValueImpl(@JsonProperty("permyriad") final Integer permyriad) {
        this.permyriad = permyriad;
        this.type = RELATIVE;
    }

    /**
     * create empty instance
     */
    public ChangeValueRelativeChangeValueImpl() {
        this.type = RELATIVE;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Fraction (per ten thousand) the price is reduced by. For example, 1000 results in a 10% price reduction.</p>
     */

    public Integer getPermyriad() {
        return this.permyriad;
    }

    public void setPermyriad(final Integer permyriad) {
        this.permyriad = permyriad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ChangeValueRelativeChangeValueImpl that = (ChangeValueRelativeChangeValueImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(permyriad, that.permyriad)
                .append(type, that.type)
                .append(permyriad, that.permyriad)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(permyriad).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("permyriad", permyriad)
                .build();
    }

}
