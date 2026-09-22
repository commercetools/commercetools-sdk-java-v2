
package com.commercetools.api.models.agent;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AgentProductSearchNotEnabledErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentProductSearchNotEnabledError agentProductSearchNotEnabledError = AgentProductSearchNotEnabledError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AgentProductSearchNotEnabledErrorBuilder implements Builder<AgentProductSearchNotEnabledError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Plain text description of the error.</p>
     * @param message value to be set
     * @return Builder
     */

    public AgentProductSearchNotEnabledErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public AgentProductSearchNotEnabledErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public AgentProductSearchNotEnabledErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds AgentProductSearchNotEnabledError with checking for non-null required values
     * @return AgentProductSearchNotEnabledError
     */
    public AgentProductSearchNotEnabledError build() {
        Objects.requireNonNull(message, AgentProductSearchNotEnabledError.class + ": message is missing");
        return new AgentProductSearchNotEnabledErrorImpl(message, values);
    }

    /**
     * builds AgentProductSearchNotEnabledError without checking for non-null required values
     * @return AgentProductSearchNotEnabledError
     */
    public AgentProductSearchNotEnabledError buildUnchecked() {
        return new AgentProductSearchNotEnabledErrorImpl(message, values);
    }

    /**
     * factory method for an instance of AgentProductSearchNotEnabledErrorBuilder
     * @return builder
     */
    public static AgentProductSearchNotEnabledErrorBuilder of() {
        return new AgentProductSearchNotEnabledErrorBuilder();
    }

    /**
     * create builder for AgentProductSearchNotEnabledError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentProductSearchNotEnabledErrorBuilder of(final AgentProductSearchNotEnabledError template) {
        AgentProductSearchNotEnabledErrorBuilder builder = new AgentProductSearchNotEnabledErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
