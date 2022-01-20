
package com.commercetools.api.models.graph_ql;

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
public class GraphQLErrorLocationImpl implements GraphQLErrorLocation, ModelBase {

    private Integer line;

    private Integer column;

    @JsonCreator
    GraphQLErrorLocationImpl(@JsonProperty("line") final Integer line, @JsonProperty("column") final Integer column) {
        this.line = line;
        this.column = column;
    }

    public GraphQLErrorLocationImpl() {
    }

    public Integer getLine() {
        return this.line;
    }

    public Integer getColumn() {
        return this.column;
    }

    public void setLine(final Integer line) {
        this.line = line;
    }

    public void setColumn(final Integer column) {
        this.column = column;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        GraphQLErrorLocationImpl that = (GraphQLErrorLocationImpl) o;

        return new EqualsBuilder().append(line, that.line).append(column, that.column).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(line).append(column).toHashCode();
    }

}
