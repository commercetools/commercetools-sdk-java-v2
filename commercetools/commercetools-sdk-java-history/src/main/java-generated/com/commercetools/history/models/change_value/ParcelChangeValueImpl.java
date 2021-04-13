
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ParcelChangeValueImpl implements ParcelChangeValue {

    private String id;

    private String createdAt;

    @JsonCreator
    ParcelChangeValueImpl(@JsonProperty("id") final String id, @JsonProperty("createdAt") final String createdAt) {
        this.id = id;
        this.createdAt = createdAt;
    }

    public ParcelChangeValueImpl() {
    }

    public String getId() {
        return this.id;
    }

    public String getCreatedAt() {
        return this.createdAt;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setCreatedAt(final String createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ParcelChangeValueImpl that = (ParcelChangeValueImpl) o;

        return new EqualsBuilder().append(id, that.id).append(createdAt, that.createdAt).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).append(createdAt).toHashCode();
    }

}
