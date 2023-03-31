
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 *  <p>Returned when the indexing of Product information is still in progress for Projects that have indexing activated.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLSearchIndexingInProgressErrorImpl implements GraphQLSearchIndexingInProgressError, ModelBase {

    private String code;

    private Map<String, java.lang.Object> values;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLSearchIndexingInProgressErrorImpl(@JsonProperty("values") final Map<String, java.lang.Object> values) {
        this.values = values;
        this.code = SEARCH_INDEXING_IN_PROGRESS;
    }

    /**
     * create empty instance
     */
    public GraphQLSearchIndexingInProgressErrorImpl() {
        this.code = SEARCH_INDEXING_IN_PROGRESS;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public Map<String, java.lang.Object> values() {
        return values;
    }

    public void setValue(String key, java.lang.Object value) {
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

        GraphQLSearchIndexingInProgressErrorImpl that = (GraphQLSearchIndexingInProgressErrorImpl) o;

        return new EqualsBuilder().append(code, that.code).append(values, that.values).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(values).toHashCode();
    }

}
