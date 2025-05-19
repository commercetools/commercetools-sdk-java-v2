
package com.commercetools.history.models.graph_ql;

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
 *  <p>Contains an error message, the location of the code that caused the error, and other information to help you correct the error.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLErrorImpl implements GraphQLError, ModelBase {

    private String message;

    private java.util.List<com.commercetools.history.models.graph_ql.GraphQLErrorLocation> locations;

    private java.util.List<java.lang.Object> path;

    private java.lang.Object extensions;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLErrorImpl(@JsonProperty("message") final String message,
            @JsonProperty("locations") final java.util.List<com.commercetools.history.models.graph_ql.GraphQLErrorLocation> locations,
            @JsonProperty("path") final java.util.List<java.lang.Object> path,
            @JsonProperty("extensions") final java.lang.Object extensions) {
        this.message = message;
        this.locations = locations;
        this.path = path;
        this.extensions = extensions;
    }

    /**
     * create empty instance
     */
    public GraphQLErrorImpl() {
    }

    /**
     *  <p>Detailed description of the error explaining the root cause of the problem and suggesting how to correct the error.</p>
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>Location within your query where the error occurred.</p>
     */

    public java.util.List<com.commercetools.history.models.graph_ql.GraphQLErrorLocation> getLocations() {
        return this.locations;
    }

    /**
     *  <p>Query fields listed in order from the root of the query response up to the field in which the error occurred. <code>path</code> is displayed in the response only if an error is associated with a particular field in the query result.</p>
     */

    public java.util.List<java.lang.Object> getPath() {
        return this.path;
    }

    /**
     *  <p>Dictionary with additional information where applicable.</p>
     */

    public java.lang.Object getExtensions() {
        return this.extensions;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setLocations(final com.commercetools.history.models.graph_ql.GraphQLErrorLocation... locations) {
        this.locations = new ArrayList<>(Arrays.asList(locations));
    }

    public void setLocations(
            final java.util.List<com.commercetools.history.models.graph_ql.GraphQLErrorLocation> locations) {
        this.locations = locations;
    }

    public void setPath(final java.lang.Object... path) {
        this.path = new ArrayList<>(Arrays.asList(path));
    }

    public void setPath(final java.util.List<java.lang.Object> path) {
        this.path = path;
    }

    public void setExtensions(final java.lang.Object extensions) {
        this.extensions = extensions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        GraphQLErrorImpl that = (GraphQLErrorImpl) o;

        return new EqualsBuilder().append(message, that.message)
                .append(locations, that.locations)
                .append(path, that.path)
                .append(extensions, that.extensions)
                .append(message, that.message)
                .append(locations, that.locations)
                .append(path, that.path)
                .append(extensions, that.extensions)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(message)
                .append(locations)
                .append(path)
                .append(extensions)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("message", message)
                .append("locations", locations)
                .append("path", path)
                .append("extensions", extensions)
                .build();
    }

    @Override
    public GraphQLError copyDeep() {
        return GraphQLError.deepCopy(this);
    }
}
