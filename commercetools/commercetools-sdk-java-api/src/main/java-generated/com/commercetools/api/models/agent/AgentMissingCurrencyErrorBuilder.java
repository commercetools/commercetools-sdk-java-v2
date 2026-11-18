
package com.commercetools.api.models.agent;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AgentMissingCurrencyErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentMissingCurrencyError agentMissingCurrencyError = AgentMissingCurrencyError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AgentMissingCurrencyErrorBuilder implements Builder<AgentMissingCurrencyError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Plain text description of the error.</p>
     * @param message value to be set
     * @return Builder
     */

    public AgentMissingCurrencyErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public AgentMissingCurrencyErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public AgentMissingCurrencyErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds AgentMissingCurrencyError with checking for non-null required values
     * @return AgentMissingCurrencyError
     */
    public AgentMissingCurrencyError build() {
        Objects.requireNonNull(message, AgentMissingCurrencyError.class + ": message is missing");
        return new AgentMissingCurrencyErrorImpl(message, values);
    }

    /**
     * builds AgentMissingCurrencyError without checking for non-null required values
     * @return AgentMissingCurrencyError
     */
    public AgentMissingCurrencyError buildUnchecked() {
        return new AgentMissingCurrencyErrorImpl(message, values);
    }

    /**
     * factory method for an instance of AgentMissingCurrencyErrorBuilder
     * @return builder
     */
    public static AgentMissingCurrencyErrorBuilder of() {
        return new AgentMissingCurrencyErrorBuilder();
    }

    /**
     * create builder for AgentMissingCurrencyError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentMissingCurrencyErrorBuilder of(final AgentMissingCurrencyError template) {
        AgentMissingCurrencyErrorBuilder builder = new AgentMissingCurrencyErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
