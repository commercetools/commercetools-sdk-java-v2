
package com.commercetools.api.models.agent;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AgentExtractionFailedErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentExtractionFailedError agentExtractionFailedError = AgentExtractionFailedError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AgentExtractionFailedErrorBuilder implements Builder<AgentExtractionFailedError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Plain text description of the error.</p>
     * @param message value to be set
     * @return Builder
     */

    public AgentExtractionFailedErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public AgentExtractionFailedErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public AgentExtractionFailedErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds AgentExtractionFailedError with checking for non-null required values
     * @return AgentExtractionFailedError
     */
    public AgentExtractionFailedError build() {
        Objects.requireNonNull(message, AgentExtractionFailedError.class + ": message is missing");
        return new AgentExtractionFailedErrorImpl(message, values);
    }

    /**
     * builds AgentExtractionFailedError without checking for non-null required values
     * @return AgentExtractionFailedError
     */
    public AgentExtractionFailedError buildUnchecked() {
        return new AgentExtractionFailedErrorImpl(message, values);
    }

    /**
     * factory method for an instance of AgentExtractionFailedErrorBuilder
     * @return builder
     */
    public static AgentExtractionFailedErrorBuilder of() {
        return new AgentExtractionFailedErrorBuilder();
    }

    /**
     * create builder for AgentExtractionFailedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentExtractionFailedErrorBuilder of(final AgentExtractionFailedError template) {
        AgentExtractionFailedErrorBuilder builder = new AgentExtractionFailedErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
