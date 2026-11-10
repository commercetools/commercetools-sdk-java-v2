
package com.commercetools.api.models.agent;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AgentMissingCustomerEmailErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentMissingCustomerEmailError agentMissingCustomerEmailError = AgentMissingCustomerEmailError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AgentMissingCustomerEmailErrorBuilder implements Builder<AgentMissingCustomerEmailError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Plain text description of the error.</p>
     * @param message value to be set
     * @return Builder
     */

    public AgentMissingCustomerEmailErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public AgentMissingCustomerEmailErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public AgentMissingCustomerEmailErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds AgentMissingCustomerEmailError with checking for non-null required values
     * @return AgentMissingCustomerEmailError
     */
    public AgentMissingCustomerEmailError build() {
        Objects.requireNonNull(message, AgentMissingCustomerEmailError.class + ": message is missing");
        return new AgentMissingCustomerEmailErrorImpl(message, values);
    }

    /**
     * builds AgentMissingCustomerEmailError without checking for non-null required values
     * @return AgentMissingCustomerEmailError
     */
    public AgentMissingCustomerEmailError buildUnchecked() {
        return new AgentMissingCustomerEmailErrorImpl(message, values);
    }

    /**
     * factory method for an instance of AgentMissingCustomerEmailErrorBuilder
     * @return builder
     */
    public static AgentMissingCustomerEmailErrorBuilder of() {
        return new AgentMissingCustomerEmailErrorBuilder();
    }

    /**
     * create builder for AgentMissingCustomerEmailError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentMissingCustomerEmailErrorBuilder of(final AgentMissingCustomerEmailError template) {
        AgentMissingCustomerEmailErrorBuilder builder = new AgentMissingCustomerEmailErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
