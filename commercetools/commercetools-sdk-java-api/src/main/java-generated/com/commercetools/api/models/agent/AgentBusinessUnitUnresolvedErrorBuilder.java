
package com.commercetools.api.models.agent;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AgentBusinessUnitUnresolvedErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentBusinessUnitUnresolvedError agentBusinessUnitUnresolvedError = AgentBusinessUnitUnresolvedError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AgentBusinessUnitUnresolvedErrorBuilder implements Builder<AgentBusinessUnitUnresolvedError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Plain text description of the error.</p>
     * @param message value to be set
     * @return Builder
     */

    public AgentBusinessUnitUnresolvedErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public AgentBusinessUnitUnresolvedErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public AgentBusinessUnitUnresolvedErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds AgentBusinessUnitUnresolvedError with checking for non-null required values
     * @return AgentBusinessUnitUnresolvedError
     */
    public AgentBusinessUnitUnresolvedError build() {
        Objects.requireNonNull(message, AgentBusinessUnitUnresolvedError.class + ": message is missing");
        return new AgentBusinessUnitUnresolvedErrorImpl(message, values);
    }

    /**
     * builds AgentBusinessUnitUnresolvedError without checking for non-null required values
     * @return AgentBusinessUnitUnresolvedError
     */
    public AgentBusinessUnitUnresolvedError buildUnchecked() {
        return new AgentBusinessUnitUnresolvedErrorImpl(message, values);
    }

    /**
     * factory method for an instance of AgentBusinessUnitUnresolvedErrorBuilder
     * @return builder
     */
    public static AgentBusinessUnitUnresolvedErrorBuilder of() {
        return new AgentBusinessUnitUnresolvedErrorBuilder();
    }

    /**
     * create builder for AgentBusinessUnitUnresolvedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentBusinessUnitUnresolvedErrorBuilder of(final AgentBusinessUnitUnresolvedError template) {
        AgentBusinessUnitUnresolvedErrorBuilder builder = new AgentBusinessUnitUnresolvedErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
