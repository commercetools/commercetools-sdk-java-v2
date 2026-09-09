
package com.commercetools.api.models.agent;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AgentStoreUnresolvedErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentStoreUnresolvedError agentStoreUnresolvedError = AgentStoreUnresolvedError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AgentStoreUnresolvedErrorBuilder implements Builder<AgentStoreUnresolvedError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Plain text description of the error.</p>
     * @param message value to be set
     * @return Builder
     */

    public AgentStoreUnresolvedErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public AgentStoreUnresolvedErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public AgentStoreUnresolvedErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds AgentStoreUnresolvedError with checking for non-null required values
     * @return AgentStoreUnresolvedError
     */
    public AgentStoreUnresolvedError build() {
        Objects.requireNonNull(message, AgentStoreUnresolvedError.class + ": message is missing");
        return new AgentStoreUnresolvedErrorImpl(message, values);
    }

    /**
     * builds AgentStoreUnresolvedError without checking for non-null required values
     * @return AgentStoreUnresolvedError
     */
    public AgentStoreUnresolvedError buildUnchecked() {
        return new AgentStoreUnresolvedErrorImpl(message, values);
    }

    /**
     * factory method for an instance of AgentStoreUnresolvedErrorBuilder
     * @return builder
     */
    public static AgentStoreUnresolvedErrorBuilder of() {
        return new AgentStoreUnresolvedErrorBuilder();
    }

    /**
     * create builder for AgentStoreUnresolvedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentStoreUnresolvedErrorBuilder of(final AgentStoreUnresolvedError template) {
        AgentStoreUnresolvedErrorBuilder builder = new AgentStoreUnresolvedErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
