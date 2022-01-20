
package com.commercetools.ml.models.missing_data;

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
public class AttributeCoverageImpl implements AttributeCoverage, ModelBase {

    private Double names;

    private Double values;

    @JsonCreator
    AttributeCoverageImpl(@JsonProperty("names") final Double names, @JsonProperty("values") final Double values) {
        this.names = names;
        this.values = values;
    }

    public AttributeCoverageImpl() {
    }

    /**
    *  <p>The percentage of attributes from the product type defined in the product variant. A value of <code>1.0</code> indicates a product variant contains all attributes defined in the product type.</p>
    */
    public Double getNames() {
        return this.names;
    }

    /**
    *  <p>Represents the percentage of attributes in the product variant that contain values.</p>
    */
    public Double getValues() {
        return this.values;
    }

    public void setNames(final Double names) {
        this.names = names;
    }

    public void setValues(final Double values) {
        this.values = values;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        AttributeCoverageImpl that = (AttributeCoverageImpl) o;

        return new EqualsBuilder().append(names, that.names).append(values, that.values).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(names).append(values).toHashCode();
    }

}
