
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * QueryTimedOutErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     QueryTimedOutError queryTimedOutError = QueryTimedOutError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class QueryTimedOutErrorBuilder implements Builder<QueryTimedOutError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p><code>"The query timed out. If your query constantly times out, please check that it follows the performance best practices (see https://docs.commercetools.com/api/predicates/query#performance-considerations)."</code></p>
     */

    public QueryTimedOutErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public QueryTimedOutErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public QueryTimedOutErrorBuilder addValue(final String key, final java.lang.Object value) {
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

    public QueryTimedOutError build() {
        Objects.requireNonNull(message, QueryTimedOutError.class + ": message is missing");
        return new QueryTimedOutErrorImpl(message, values);
    }

    /**
     * builds QueryTimedOutError without checking for non null required values
     */
    public QueryTimedOutError buildUnchecked() {
        return new QueryTimedOutErrorImpl(message, values);
    }

    public static QueryTimedOutErrorBuilder of() {
        return new QueryTimedOutErrorBuilder();
    }

    public static QueryTimedOutErrorBuilder of(final QueryTimedOutError template) {
        QueryTimedOutErrorBuilder builder = new QueryTimedOutErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
