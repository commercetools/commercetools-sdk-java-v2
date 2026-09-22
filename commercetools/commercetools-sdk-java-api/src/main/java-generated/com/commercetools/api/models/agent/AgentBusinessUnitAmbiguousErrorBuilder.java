
package com.commercetools.api.models.agent;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AgentBusinessUnitAmbiguousErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentBusinessUnitAmbiguousError agentBusinessUnitAmbiguousError = AgentBusinessUnitAmbiguousError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AgentBusinessUnitAmbiguousErrorBuilder implements Builder<AgentBusinessUnitAmbiguousError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Plain text description of the error.</p>
     * @param message value to be set
     * @return Builder
     */

    public AgentBusinessUnitAmbiguousErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public AgentBusinessUnitAmbiguousErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public AgentBusinessUnitAmbiguousErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds AgentBusinessUnitAmbiguousError with checking for non-null required values
     * @return AgentBusinessUnitAmbiguousError
     */
    public AgentBusinessUnitAmbiguousError build() {
        Objects.requireNonNull(message, AgentBusinessUnitAmbiguousError.class + ": message is missing");
        return new AgentBusinessUnitAmbiguousErrorImpl(message, values);
    }

    /**
     * builds AgentBusinessUnitAmbiguousError without checking for non-null required values
     * @return AgentBusinessUnitAmbiguousError
     */
    public AgentBusinessUnitAmbiguousError buildUnchecked() {
        return new AgentBusinessUnitAmbiguousErrorImpl(message, values);
    }

    /**
     * factory method for an instance of AgentBusinessUnitAmbiguousErrorBuilder
     * @return builder
     */
    public static AgentBusinessUnitAmbiguousErrorBuilder of() {
        return new AgentBusinessUnitAmbiguousErrorBuilder();
    }

    /**
     * create builder for AgentBusinessUnitAmbiguousError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentBusinessUnitAmbiguousErrorBuilder of(final AgentBusinessUnitAmbiguousError template) {
        AgentBusinessUnitAmbiguousErrorBuilder builder = new AgentBusinessUnitAmbiguousErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
