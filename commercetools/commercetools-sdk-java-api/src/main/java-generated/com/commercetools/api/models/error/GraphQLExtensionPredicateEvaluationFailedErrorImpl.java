
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonAnySetter;
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
 *  <p>Returned when the predicate defined in the ExtensionTrigger could not be evaluated due to a missing field.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLExtensionPredicateEvaluationFailedErrorImpl
        implements GraphQLExtensionPredicateEvaluationFailedError, ModelBase {

    private String code;

    private Map<String, java.lang.Object> values;

    private com.commercetools.api.models.error.ErrorByExtension errorByExtension;

    /**
     * create instance with all properties
     */
    @JsonCreator
    GraphQLExtensionPredicateEvaluationFailedErrorImpl(
            @JsonAnySetter @JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("errorByExtension") final com.commercetools.api.models.error.ErrorByExtension errorByExtension) {
        this.values = values;
        this.errorByExtension = errorByExtension;
        this.code = EXTENSION_PREDICATE_EVALUATION_FAILED;
    }

    /**
     * create empty instance
     */
    public GraphQLExtensionPredicateEvaluationFailedErrorImpl() {
        this.code = EXTENSION_PREDICATE_EVALUATION_FAILED;
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
     *  <p>Details about the API Extension that was involved in the error.</p>
     */

    public com.commercetools.api.models.error.ErrorByExtension getErrorByExtension() {
        return this.errorByExtension;
    }

    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

    public void setErrorByExtension(final com.commercetools.api.models.error.ErrorByExtension errorByExtension) {
        this.errorByExtension = errorByExtension;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        GraphQLExtensionPredicateEvaluationFailedErrorImpl that = (GraphQLExtensionPredicateEvaluationFailedErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(values, that.values)
                .append(errorByExtension, that.errorByExtension)
                .append(code, that.code)
                .append(values, that.values)
                .append(errorByExtension, that.errorByExtension)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code).append(values).append(errorByExtension).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("values", values)
                .append("errorByExtension", errorByExtension)
                .build();
    }

    @Override
    public GraphQLExtensionPredicateEvaluationFailedError copyDeep() {
        return GraphQLExtensionPredicateEvaluationFailedError.deepCopy(this);
    }
}
