
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
 *  <p>Returned when the request conflicts with the current state of the involved resources. Typically, the request attempts to modify a resource that is out of date (that is modified by another client since it was last retrieved). The client application should resolve the conflict (with or without involving the end-user) before retrying the request.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLConcurrentModificationErrorImpl implements GraphQLConcurrentModificationError, ModelBase {

    private String code;

    private Map<String, java.lang.Object> values;

    private Long currentVersion;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLConcurrentModificationErrorImpl(@JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("currentVersion") final Long currentVersion) {
        this.values = values;
        this.currentVersion = currentVersion;
        this.code = CONCURRENT_MODIFICATION;
    }

    /**
     * create empty instance
     */
    public GraphQLConcurrentModificationErrorImpl() {
        this.code = CONCURRENT_MODIFICATION;
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

    /**
     *  <p>Current version of the resource.</p>
     */

    public Long getCurrentVersion() {
        return this.currentVersion;
    }

    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

    public void setCurrentVersion(final Long currentVersion) {
        this.currentVersion = currentVersion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        GraphQLConcurrentModificationErrorImpl that = (GraphQLConcurrentModificationErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(values, that.values)
                .append(currentVersion, that.currentVersion)
                .append(code, that.code)
                .append(values, that.values)
                .append(currentVersion, that.currentVersion)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(values).append(currentVersion).toHashCode();
    }

}
