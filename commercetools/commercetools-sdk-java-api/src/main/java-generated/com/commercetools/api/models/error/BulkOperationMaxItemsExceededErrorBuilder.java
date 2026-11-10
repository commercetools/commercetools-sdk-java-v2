
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BulkOperationMaxItemsExceededErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BulkOperationMaxItemsExceededError bulkOperationMaxItemsExceededError = BulkOperationMaxItemsExceededError.builder()
 *             .message("{message}")
 *             .limit(0.3)
 *             .provided(0.3)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BulkOperationMaxItemsExceededErrorBuilder implements Builder<BulkOperationMaxItemsExceededError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    private Integer limit;

    private Integer provided;

    /**
     *  <p><code>"The bulk request exceeds the maximum allowed items of $limit."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public BulkOperationMaxItemsExceededErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public BulkOperationMaxItemsExceededErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public BulkOperationMaxItemsExceededErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Maximum number of items allowed in a single bulk request.</p>
     * @param limit value to be set
     * @return Builder
     */

    public BulkOperationMaxItemsExceededErrorBuilder limit(final Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     *  <p>Number of items provided in the request.</p>
     * @param provided value to be set
     * @return Builder
     */

    public BulkOperationMaxItemsExceededErrorBuilder provided(final Integer provided) {
        this.provided = provided;
        return this;
    }

    /**
     *  <p><code>"The bulk request exceeds the maximum allowed items of $limit."</code></p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @return pattern properties
     */

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    /**
     *  <p>Maximum number of items allowed in a single bulk request.</p>
     * @return limit
     */

    public Integer getLimit() {
        return this.limit;
    }

    /**
     *  <p>Number of items provided in the request.</p>
     * @return provided
     */

    public Integer getProvided() {
        return this.provided;
    }

    /**
     * builds BulkOperationMaxItemsExceededError with checking for non-null required values
     * @return BulkOperationMaxItemsExceededError
     */
    public BulkOperationMaxItemsExceededError build() {
        Objects.requireNonNull(message, BulkOperationMaxItemsExceededError.class + ": message is missing");
        Objects.requireNonNull(limit, BulkOperationMaxItemsExceededError.class + ": limit is missing");
        Objects.requireNonNull(provided, BulkOperationMaxItemsExceededError.class + ": provided is missing");
        return new BulkOperationMaxItemsExceededErrorImpl(message, values, limit, provided);
    }

    /**
     * builds BulkOperationMaxItemsExceededError without checking for non-null required values
     * @return BulkOperationMaxItemsExceededError
     */
    public BulkOperationMaxItemsExceededError buildUnchecked() {
        return new BulkOperationMaxItemsExceededErrorImpl(message, values, limit, provided);
    }

    /**
     * factory method for an instance of BulkOperationMaxItemsExceededErrorBuilder
     * @return builder
     */
    public static BulkOperationMaxItemsExceededErrorBuilder of() {
        return new BulkOperationMaxItemsExceededErrorBuilder();
    }

    /**
     * create builder for BulkOperationMaxItemsExceededError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BulkOperationMaxItemsExceededErrorBuilder of(final BulkOperationMaxItemsExceededError template) {
        BulkOperationMaxItemsExceededErrorBuilder builder = new BulkOperationMaxItemsExceededErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.limit = template.getLimit();
        builder.provided = template.getProvided();
        return builder;
    }

}
