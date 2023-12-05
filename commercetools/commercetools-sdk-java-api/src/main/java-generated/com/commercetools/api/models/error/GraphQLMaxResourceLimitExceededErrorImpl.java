
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
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Returned when a resource type cannot be created as it has reached its limits.</p>
 *  <p>The limits must be adjusted for this resource before sending the request again.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLMaxResourceLimitExceededErrorImpl implements GraphQLMaxResourceLimitExceededError, ModelBase {

    private String code;

    private Map<String, java.lang.Object> values;

    private com.commercetools.api.models.common.ReferenceTypeId exceededResource;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLMaxResourceLimitExceededErrorImpl(@JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("exceededResource") final com.commercetools.api.models.common.ReferenceTypeId exceededResource) {
        this.values = values;
        this.exceededResource = exceededResource;
        this.code = MAX_RESOURCE_LIMIT_EXCEEDED;
    }

    /**
     * create empty instance
     */
    public GraphQLMaxResourceLimitExceededErrorImpl() {
        this.code = MAX_RESOURCE_LIMIT_EXCEEDED;
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
     *  <p>Resource type that reached its maximum limit of configured elements (for example, 100 Zones per Project).</p>
     */

    public com.commercetools.api.models.common.ReferenceTypeId getExceededResource() {
        return this.exceededResource;
    }

    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

    public void setExceededResource(final com.commercetools.api.models.common.ReferenceTypeId exceededResource) {
        this.exceededResource = exceededResource;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        GraphQLMaxResourceLimitExceededErrorImpl that = (GraphQLMaxResourceLimitExceededErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(values, that.values)
                .append(exceededResource, that.exceededResource)
                .append(code, that.code)
                .append(values, that.values)
                .append(exceededResource, that.exceededResource)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(values).append(exceededResource).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("values", values)
                .append("exceededResource", exceededResource)
                .build();
    }

}
