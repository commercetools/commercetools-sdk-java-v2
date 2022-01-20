
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ChangeImpl implements Change, ModelBase {

    private String type;

    private String change;

    @JsonCreator
    ChangeImpl(@JsonProperty("type") final String type, @JsonProperty("change") final String change) {
        this.type = type;
        this.change = change;
    }

    public ChangeImpl() {
    }

    public String getType() {
        return this.type;
    }

    public String getChange() {
        return this.change;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ChangeImpl that = (ChangeImpl) o;

        return new EqualsBuilder().append(type, that.type).append(change, that.change).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(change).toHashCode();
    }

}
