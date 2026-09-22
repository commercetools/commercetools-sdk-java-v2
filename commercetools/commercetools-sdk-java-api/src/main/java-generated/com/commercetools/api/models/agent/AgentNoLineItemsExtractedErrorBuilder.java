
package com.commercetools.api.models.agent;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AgentNoLineItemsExtractedErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentNoLineItemsExtractedError agentNoLineItemsExtractedError = AgentNoLineItemsExtractedError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AgentNoLineItemsExtractedErrorBuilder implements Builder<AgentNoLineItemsExtractedError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Plain text description of the error.</p>
     * @param message value to be set
     * @return Builder
     */

    public AgentNoLineItemsExtractedErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public AgentNoLineItemsExtractedErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public AgentNoLineItemsExtractedErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Plain text description of the error.</p>
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
     * builds AgentNoLineItemsExtractedError with checking for non-null required values
     * @return AgentNoLineItemsExtractedError
     */
    public AgentNoLineItemsExtractedError build() {
        Objects.requireNonNull(message, AgentNoLineItemsExtractedError.class + ": message is missing");
        return new AgentNoLineItemsExtractedErrorImpl(message, values);
    }

    /**
     * builds AgentNoLineItemsExtractedError without checking for non-null required values
     * @return AgentNoLineItemsExtractedError
     */
    public AgentNoLineItemsExtractedError buildUnchecked() {
        return new AgentNoLineItemsExtractedErrorImpl(message, values);
    }

    /**
     * factory method for an instance of AgentNoLineItemsExtractedErrorBuilder
     * @return builder
     */
    public static AgentNoLineItemsExtractedErrorBuilder of() {
        return new AgentNoLineItemsExtractedErrorBuilder();
    }

    /**
     * create builder for AgentNoLineItemsExtractedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentNoLineItemsExtractedErrorBuilder of(final AgentNoLineItemsExtractedError template) {
        AgentNoLineItemsExtractedErrorBuilder builder = new AgentNoLineItemsExtractedErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
