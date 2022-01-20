
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
public class MissingAttributesDetailsImpl implements MissingAttributesDetails, ModelBase {

    private Integer total;

    private Integer missingAttributeNames;

    private Integer missingAttributeValues;

    @JsonCreator
    MissingAttributesDetailsImpl(@JsonProperty("total") final Integer total,
            @JsonProperty("missingAttributeNames") final Integer missingAttributeNames,
            @JsonProperty("missingAttributeValues") final Integer missingAttributeValues) {
        this.total = total;
        this.missingAttributeNames = missingAttributeNames;
        this.missingAttributeValues = missingAttributeValues;
    }

    public MissingAttributesDetailsImpl() {
    }

    /**
    *  <p>Number of products scanned.</p>
    */
    public Integer getTotal() {
        return this.total;
    }

    /**
    *  <p>Number of products missing attribute names.</p>
    */
    public Integer getMissingAttributeNames() {
        return this.missingAttributeNames;
    }

    /**
    *  <p>Number of products missing attribute values.</p>
    */
    public Integer getMissingAttributeValues() {
        return this.missingAttributeValues;
    }

    public void setTotal(final Integer total) {
        this.total = total;
    }

    public void setMissingAttributeNames(final Integer missingAttributeNames) {
        this.missingAttributeNames = missingAttributeNames;
    }

    public void setMissingAttributeValues(final Integer missingAttributeValues) {
        this.missingAttributeValues = missingAttributeValues;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MissingAttributesDetailsImpl that = (MissingAttributesDetailsImpl) o;

        return new EqualsBuilder().append(total, that.total)
                .append(missingAttributeNames, that.missingAttributeNames)
                .append(missingAttributeValues, that.missingAttributeValues)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(total)
                .append(missingAttributeNames)
                .append(missingAttributeValues)
                .toHashCode();
    }

}
