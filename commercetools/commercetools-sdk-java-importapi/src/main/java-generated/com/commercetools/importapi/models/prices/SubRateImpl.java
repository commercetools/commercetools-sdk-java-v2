
package com.commercetools.importapi.models.prices;

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
public class SubRateImpl implements SubRate, ModelBase {

    private String name;

    private Double amount;

    @JsonCreator
    SubRateImpl(@JsonProperty("name") final String name, @JsonProperty("amount") final Double amount) {
        this.name = name;
        this.amount = amount;
    }

    public SubRateImpl() {
    }

    public String getName() {
        return this.name;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setAmount(final Double amount) {
        this.amount = amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SubRateImpl that = (SubRateImpl) o;

        return new EqualsBuilder().append(name, that.name).append(amount, that.amount).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(name).append(amount).toHashCode();
    }

}
