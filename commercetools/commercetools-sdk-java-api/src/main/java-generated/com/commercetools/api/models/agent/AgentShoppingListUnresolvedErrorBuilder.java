
package com.commercetools.api.models.agent;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AgentShoppingListUnresolvedErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentShoppingListUnresolvedError agentShoppingListUnresolvedError = AgentShoppingListUnresolvedError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AgentShoppingListUnresolvedErrorBuilder implements Builder<AgentShoppingListUnresolvedError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Plain text description of the error.</p>
     * @param message value to be set
     * @return Builder
     */

    public AgentShoppingListUnresolvedErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public AgentShoppingListUnresolvedErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public AgentShoppingListUnresolvedErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds AgentShoppingListUnresolvedError with checking for non-null required values
     * @return AgentShoppingListUnresolvedError
     */
    public AgentShoppingListUnresolvedError build() {
        Objects.requireNonNull(message, AgentShoppingListUnresolvedError.class + ": message is missing");
        return new AgentShoppingListUnresolvedErrorImpl(message, values);
    }

    /**
     * builds AgentShoppingListUnresolvedError without checking for non-null required values
     * @return AgentShoppingListUnresolvedError
     */
    public AgentShoppingListUnresolvedError buildUnchecked() {
        return new AgentShoppingListUnresolvedErrorImpl(message, values);
    }

    /**
     * factory method for an instance of AgentShoppingListUnresolvedErrorBuilder
     * @return builder
     */
    public static AgentShoppingListUnresolvedErrorBuilder of() {
        return new AgentShoppingListUnresolvedErrorBuilder();
    }

    /**
     * create builder for AgentShoppingListUnresolvedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentShoppingListUnresolvedErrorBuilder of(final AgentShoppingListUnresolvedError template) {
        AgentShoppingListUnresolvedErrorBuilder builder = new AgentShoppingListUnresolvedErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
