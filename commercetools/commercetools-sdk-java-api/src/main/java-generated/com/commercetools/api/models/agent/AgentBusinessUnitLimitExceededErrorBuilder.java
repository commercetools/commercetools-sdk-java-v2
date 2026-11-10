
package com.commercetools.api.models.agent;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AgentBusinessUnitLimitExceededErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentBusinessUnitLimitExceededError agentBusinessUnitLimitExceededError = AgentBusinessUnitLimitExceededError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AgentBusinessUnitLimitExceededErrorBuilder implements Builder<AgentBusinessUnitLimitExceededError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Plain text description of the error.</p>
     * @param message value to be set
     * @return Builder
     */

    public AgentBusinessUnitLimitExceededErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public AgentBusinessUnitLimitExceededErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public AgentBusinessUnitLimitExceededErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds AgentBusinessUnitLimitExceededError with checking for non-null required values
     * @return AgentBusinessUnitLimitExceededError
     */
    public AgentBusinessUnitLimitExceededError build() {
        Objects.requireNonNull(message, AgentBusinessUnitLimitExceededError.class + ": message is missing");
        return new AgentBusinessUnitLimitExceededErrorImpl(message, values);
    }

    /**
     * builds AgentBusinessUnitLimitExceededError without checking for non-null required values
     * @return AgentBusinessUnitLimitExceededError
     */
    public AgentBusinessUnitLimitExceededError buildUnchecked() {
        return new AgentBusinessUnitLimitExceededErrorImpl(message, values);
    }

    /**
     * factory method for an instance of AgentBusinessUnitLimitExceededErrorBuilder
     * @return builder
     */
    public static AgentBusinessUnitLimitExceededErrorBuilder of() {
        return new AgentBusinessUnitLimitExceededErrorBuilder();
    }

    /**
     * create builder for AgentBusinessUnitLimitExceededError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentBusinessUnitLimitExceededErrorBuilder of(final AgentBusinessUnitLimitExceededError template) {
        AgentBusinessUnitLimitExceededErrorBuilder builder = new AgentBusinessUnitLimitExceededErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
