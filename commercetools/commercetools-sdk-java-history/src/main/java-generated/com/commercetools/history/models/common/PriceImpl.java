
package com.commercetools.history.models.common;

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
public class PriceImpl implements Price, ModelBase {

    private String id;

    private com.commercetools.history.models.common.Money value;

    @JsonCreator
    PriceImpl(@JsonProperty("id") final String id,
            @JsonProperty("value") final com.commercetools.history.models.common.Money value) {
        this.id = id;
        this.value = value;
    }

    public PriceImpl() {
    }

    public String getId() {
        return this.id;
    }

    public com.commercetools.history.models.common.Money getValue() {
        return this.value;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setValue(final com.commercetools.history.models.common.Money value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PriceImpl that = (PriceImpl) o;

        return new EqualsBuilder().append(id, that.id).append(value, that.value).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(id).append(value).toHashCode();
    }

}
