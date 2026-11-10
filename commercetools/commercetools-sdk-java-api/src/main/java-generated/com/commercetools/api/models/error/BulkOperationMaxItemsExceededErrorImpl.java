
package com.commercetools.api.models.error;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Returned when a bulk request contains more items than the allowed maximum.</p>
 *  <p>Reduce the number of items in the request to at most <code>limit</code> and retry.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BulkOperationMaxItemsExceededErrorImpl implements BulkOperationMaxItemsExceededError, ModelBase {

    private String code;

    private String message;

    private Map<String, java.lang.Object> values;

    private Integer limit;

    private Integer provided;

    /**
     * create instance with all properties
     */
    @JsonCreator
    BulkOperationMaxItemsExceededErrorImpl(@JsonProperty("message") final String message,
            @JsonAnySetter @JsonProperty("values") final Map<String, java.lang.Object> values,
            @JsonProperty("limit") final Integer limit, @JsonProperty("provided") final Integer provided) {
        this.message = message;
        this.values = values;
        this.limit = limit;
        this.provided = provided;
        this.code = BULK_OPERATION_MAX_ITEMS_EXCEEDED;
    }

    /**
     * create empty instance
     */
    public BulkOperationMaxItemsExceededErrorImpl() {
        this.code = BULK_OPERATION_MAX_ITEMS_EXCEEDED;
    }

    /**
     *
     */

    public String getCode() {
        return this.code;
    }

    /**
     *  <p><code>"The bulk request exceeds the maximum allowed items of $limit."</code></p>
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public Map<String, java.lang.Object> values() {
        return values;
    }

    /**
     *  <p>Maximum number of items allowed in a single bulk request.</p>
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     *  <p>Number of items provided in the request.</p>
     */

    public Integer getProvided() {
        return this.provided;
    }

    public void setMessage(final String message) {
        this.message = message;
    }

    public void setValue(String key, java.lang.Object value) {
        if (values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
    }

    public void setLimit(final Integer limit) {
        this.limit = limit;
    }

    public void setProvided(final Integer provided) {
        this.provided = provided;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        BulkOperationMaxItemsExceededErrorImpl that = (BulkOperationMaxItemsExceededErrorImpl) o;

        return new EqualsBuilder().append(code, that.code)
                .append(message, that.message)
                .append(values, that.values)
                .append(limit, that.limit)
                .append(provided, that.provided)
                .append(code, that.code)
                .append(message, that.message)
                .append(values, that.values)
                .append(limit, that.limit)
                .append(provided, that.provided)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(code)
                .append(message)
                .append(values)
                .append(limit)
                .append(provided)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("code", code)
                .append("message", message)
                .append("values", values)
                .append("limit", limit)
                .append("provided", provided)
                .build();
    }

    @Override
    public BulkOperationMaxItemsExceededError copyDeep() {
        return BulkOperationMaxItemsExceededError.deepCopy(this);
    }
}
