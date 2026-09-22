
package com.commercetools.api.models.agent;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AgentFeatureDisabledErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentFeatureDisabledError agentFeatureDisabledError = AgentFeatureDisabledError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AgentFeatureDisabledErrorBuilder implements Builder<AgentFeatureDisabledError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Plain text description of the error.</p>
     * @param message value to be set
     * @return Builder
     */

    public AgentFeatureDisabledErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public AgentFeatureDisabledErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public AgentFeatureDisabledErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds AgentFeatureDisabledError with checking for non-null required values
     * @return AgentFeatureDisabledError
     */
    public AgentFeatureDisabledError build() {
        Objects.requireNonNull(message, AgentFeatureDisabledError.class + ": message is missing");
        return new AgentFeatureDisabledErrorImpl(message, values);
    }

    /**
     * builds AgentFeatureDisabledError without checking for non-null required values
     * @return AgentFeatureDisabledError
     */
    public AgentFeatureDisabledError buildUnchecked() {
        return new AgentFeatureDisabledErrorImpl(message, values);
    }

    /**
     * factory method for an instance of AgentFeatureDisabledErrorBuilder
     * @return builder
     */
    public static AgentFeatureDisabledErrorBuilder of() {
        return new AgentFeatureDisabledErrorBuilder();
    }

    /**
     * create builder for AgentFeatureDisabledError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentFeatureDisabledErrorBuilder of(final AgentFeatureDisabledError template) {
        AgentFeatureDisabledErrorBuilder builder = new AgentFeatureDisabledErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
