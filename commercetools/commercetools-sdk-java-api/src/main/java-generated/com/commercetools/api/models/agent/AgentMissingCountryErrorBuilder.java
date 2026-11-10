
package com.commercetools.api.models.agent;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AgentMissingCountryErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentMissingCountryError agentMissingCountryError = AgentMissingCountryError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AgentMissingCountryErrorBuilder implements Builder<AgentMissingCountryError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Plain text description of the error.</p>
     * @param message value to be set
     * @return Builder
     */

    public AgentMissingCountryErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public AgentMissingCountryErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public AgentMissingCountryErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds AgentMissingCountryError with checking for non-null required values
     * @return AgentMissingCountryError
     */
    public AgentMissingCountryError build() {
        Objects.requireNonNull(message, AgentMissingCountryError.class + ": message is missing");
        return new AgentMissingCountryErrorImpl(message, values);
    }

    /**
     * builds AgentMissingCountryError without checking for non-null required values
     * @return AgentMissingCountryError
     */
    public AgentMissingCountryError buildUnchecked() {
        return new AgentMissingCountryErrorImpl(message, values);
    }

    /**
     * factory method for an instance of AgentMissingCountryErrorBuilder
     * @return builder
     */
    public static AgentMissingCountryErrorBuilder of() {
        return new AgentMissingCountryErrorBuilder();
    }

    /**
     * create builder for AgentMissingCountryError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentMissingCountryErrorBuilder of(final AgentMissingCountryError template) {
        AgentMissingCountryErrorBuilder builder = new AgentMissingCountryErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
