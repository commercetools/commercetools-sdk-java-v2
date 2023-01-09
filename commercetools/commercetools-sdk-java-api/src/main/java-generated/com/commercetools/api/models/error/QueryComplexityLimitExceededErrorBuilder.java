
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QueryComplexityLimitExceededErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QueryComplexityLimitExceededError queryComplexityLimitExceededError = QueryComplexityLimitExceededError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QueryComplexityLimitExceededErrorBuilder implements Builder<QueryComplexityLimitExceededError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *
     */

    public QueryComplexityLimitExceededErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public QueryComplexityLimitExceededErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public QueryComplexityLimitExceededErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    public QueryComplexityLimitExceededError build() {
        Objects.requireNonNull(message, QueryComplexityLimitExceededError.class + ": message is missing");
        return new QueryComplexityLimitExceededErrorImpl(message, values);
    }

    /**
     * builds QueryComplexityLimitExceededError without checking for non null required values
     */
    public QueryComplexityLimitExceededError buildUnchecked() {
        return new QueryComplexityLimitExceededErrorImpl(message, values);
    }

    public static QueryComplexityLimitExceededErrorBuilder of() {
        return new QueryComplexityLimitExceededErrorBuilder();
    }

    public static QueryComplexityLimitExceededErrorBuilder of(final QueryComplexityLimitExceededError template) {
        QueryComplexityLimitExceededErrorBuilder builder = new QueryComplexityLimitExceededErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
