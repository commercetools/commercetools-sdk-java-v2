
package com.commercetools.api.models.product;

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
public class FacetResultsImpl implements FacetResults, ModelBase {

    private Map<String, com.commercetools.api.models.product.FacetResult> values;

    @JsonCreator
    FacetResultsImpl(
            @JsonProperty("values") final Map<String, com.commercetools.api.models.product.FacetResult> values) {
        this.values = values;
    }

    public FacetResultsImpl() {
    }

    public Map<String, com.commercetools.api.models.product.FacetResult> values() {
        return values;
    }

    public void setValue(String key, com.commercetools.api.models.product.FacetResult value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        FacetResultsImpl that = (FacetResultsImpl) o;

        return new EqualsBuilder().append(values, that.values).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(values).toHashCode();
    }

}
