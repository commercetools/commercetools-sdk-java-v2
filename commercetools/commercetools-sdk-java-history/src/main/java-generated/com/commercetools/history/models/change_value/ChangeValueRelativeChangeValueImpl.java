
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
*  <p>Shape of the value for cart discounts relative value.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ChangeValueRelativeChangeValueImpl implements ChangeValueRelativeChangeValue {

    private String type;

    private Integer permyriad;

    @JsonCreator
    ChangeValueRelativeChangeValueImpl(@JsonProperty("permyriad") final Integer permyriad) {
        this.permyriad = permyriad;
        this.type = RELATIVE;
    }

    public ChangeValueRelativeChangeValueImpl() {
        this.type = RELATIVE;
    }

    public String getType() {
        return this.type;
    }

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

        return new EqualsBuilder().append(type, that.type).append(permyriad, that.permyriad).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(permyriad).toHashCode();
    }

}
