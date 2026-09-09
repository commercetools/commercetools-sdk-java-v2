
package com.commercetools.api.models.agent;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AgentProductsNotFoundErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentProductsNotFoundError agentProductsNotFoundError = AgentProductsNotFoundError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AgentProductsNotFoundErrorBuilder implements Builder<AgentProductsNotFoundError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Plain text description of the error.</p>
     * @param message value to be set
     * @return Builder
     */

    public AgentProductsNotFoundErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public AgentProductsNotFoundErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public AgentProductsNotFoundErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds AgentProductsNotFoundError with checking for non-null required values
     * @return AgentProductsNotFoundError
     */
    public AgentProductsNotFoundError build() {
        Objects.requireNonNull(message, AgentProductsNotFoundError.class + ": message is missing");
        return new AgentProductsNotFoundErrorImpl(message, values);
    }

    /**
     * builds AgentProductsNotFoundError without checking for non-null required values
     * @return AgentProductsNotFoundError
     */
    public AgentProductsNotFoundError buildUnchecked() {
        return new AgentProductsNotFoundErrorImpl(message, values);
    }

    /**
     * factory method for an instance of AgentProductsNotFoundErrorBuilder
     * @return builder
     */
    public static AgentProductsNotFoundErrorBuilder of() {
        return new AgentProductsNotFoundErrorBuilder();
    }

    /**
     * create builder for AgentProductsNotFoundError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentProductsNotFoundErrorBuilder of(final AgentProductsNotFoundError template) {
        AgentProductsNotFoundErrorBuilder builder = new AgentProductsNotFoundErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
