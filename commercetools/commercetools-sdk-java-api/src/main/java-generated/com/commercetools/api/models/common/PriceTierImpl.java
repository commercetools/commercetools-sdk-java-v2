
package com.commercetools.api.models.common;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class PriceTierImpl implements PriceTier {

    private Long minimumQuantity;

    private com.commercetools.api.models.common.TypedMoney value;

    @JsonCreator
    PriceTierImpl(@JsonProperty("minimumQuantity") final Long minimumQuantity,
            @JsonProperty("value") final com.commercetools.api.models.common.TypedMoney value) {
        this.minimumQuantity = minimumQuantity;
        this.value = value;
    }

    public PriceTierImpl() {
    }

    public Long getMinimumQuantity() {
        return this.minimumQuantity;
    }

    public com.commercetools.api.models.common.TypedMoney getValue() {
        return this.value;
    }

    public void setMinimumQuantity(final Long minimumQuantity) {
        this.minimumQuantity = minimumQuantity;
    }

    public void setValue(final com.commercetools.api.models.common.TypedMoney value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        PriceTierImpl that = (PriceTierImpl) o;

        return new EqualsBuilder().append(minimumQuantity, that.minimumQuantity).append(value, that.value).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(minimumQuantity).append(value).toHashCode();
    }

}