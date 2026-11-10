
package com.commercetools.api.models.agent;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AgentStoreAmbiguousErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentStoreAmbiguousError agentStoreAmbiguousError = AgentStoreAmbiguousError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AgentStoreAmbiguousErrorBuilder implements Builder<AgentStoreAmbiguousError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Plain text description of the error.</p>
     * @param message value to be set
     * @return Builder
     */

    public AgentStoreAmbiguousErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public AgentStoreAmbiguousErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public AgentStoreAmbiguousErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds AgentStoreAmbiguousError with checking for non-null required values
     * @return AgentStoreAmbiguousError
     */
    public AgentStoreAmbiguousError build() {
        Objects.requireNonNull(message, AgentStoreAmbiguousError.class + ": message is missing");
        return new AgentStoreAmbiguousErrorImpl(message, values);
    }

    /**
     * builds AgentStoreAmbiguousError without checking for non-null required values
     * @return AgentStoreAmbiguousError
     */
    public AgentStoreAmbiguousError buildUnchecked() {
        return new AgentStoreAmbiguousErrorImpl(message, values);
    }

    /**
     * factory method for an instance of AgentStoreAmbiguousErrorBuilder
     * @return builder
     */
    public static AgentStoreAmbiguousErrorBuilder of() {
        return new AgentStoreAmbiguousErrorBuilder();
    }

    /**
     * create builder for AgentStoreAmbiguousError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentStoreAmbiguousErrorBuilder of(final AgentStoreAmbiguousError template) {
        AgentStoreAmbiguousErrorBuilder builder = new AgentStoreAmbiguousErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
