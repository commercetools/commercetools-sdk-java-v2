
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Represents the location within your query where the error occurred.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLErrorLocationImpl implements GraphQLErrorLocation, ModelBase {

    private Long line;

    private Long column;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLErrorLocationImpl(@JsonProperty("line") final Long line, @JsonProperty("column") final Long column) {
        this.line = line;
        this.column = column;
    }

    /**
     * create empty instance
     */
    public GraphQLErrorLocationImpl() {
    }

    /**
     *  <p>Line number of the query where the error occurred.</p>
     */

    public Long getLine() {
        return this.line;
    }

    /**
     *  <p>Position in <code>line</code> where the error occurred.</p>
     */

    public Long getColumn() {
        return this.column;
    }

    public void setLine(final Long line) {
        this.line = line;
    }

    public void setColumn(final Long column) {
        this.column = column;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        GraphQLErrorLocationImpl that = (GraphQLErrorLocationImpl) o;

        return new EqualsBuilder().append(line, that.line)
                .append(column, that.column)
                .append(line, that.line)
                .append(column, that.column)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(line).append(column).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("line", line)
                .append("column", column)
                .build();
    }

}
