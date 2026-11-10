
package com.commercetools.api.models.agent;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AgentMissingEntityTypeErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentMissingEntityTypeError agentMissingEntityTypeError = AgentMissingEntityTypeError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AgentMissingEntityTypeErrorBuilder implements Builder<AgentMissingEntityTypeError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Plain text description of the error.</p>
     * @param message value to be set
     * @return Builder
     */

    public AgentMissingEntityTypeErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public AgentMissingEntityTypeErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public AgentMissingEntityTypeErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds AgentMissingEntityTypeError with checking for non-null required values
     * @return AgentMissingEntityTypeError
     */
    public AgentMissingEntityTypeError build() {
        Objects.requireNonNull(message, AgentMissingEntityTypeError.class + ": message is missing");
        return new AgentMissingEntityTypeErrorImpl(message, values);
    }

    /**
     * builds AgentMissingEntityTypeError without checking for non-null required values
     * @return AgentMissingEntityTypeError
     */
    public AgentMissingEntityTypeError buildUnchecked() {
        return new AgentMissingEntityTypeErrorImpl(message, values);
    }

    /**
     * factory method for an instance of AgentMissingEntityTypeErrorBuilder
     * @return builder
     */
    public static AgentMissingEntityTypeErrorBuilder of() {
        return new AgentMissingEntityTypeErrorBuilder();
    }

    /**
     * create builder for AgentMissingEntityTypeError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentMissingEntityTypeErrorBuilder of(final AgentMissingEntityTypeError template) {
        AgentMissingEntityTypeErrorBuilder builder = new AgentMissingEntityTypeErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
