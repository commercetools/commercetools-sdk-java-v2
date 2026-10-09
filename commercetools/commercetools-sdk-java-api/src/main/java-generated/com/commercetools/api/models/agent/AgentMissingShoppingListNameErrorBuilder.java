
package com.commercetools.api.models.agent;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AgentMissingShoppingListNameErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentMissingShoppingListNameError agentMissingShoppingListNameError = AgentMissingShoppingListNameError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AgentMissingShoppingListNameErrorBuilder implements Builder<AgentMissingShoppingListNameError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Plain text description of the error.</p>
     * @param message value to be set
     * @return Builder
     */

    public AgentMissingShoppingListNameErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public AgentMissingShoppingListNameErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public AgentMissingShoppingListNameErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds AgentMissingShoppingListNameError with checking for non-null required values
     * @return AgentMissingShoppingListNameError
     */
    public AgentMissingShoppingListNameError build() {
        Objects.requireNonNull(message, AgentMissingShoppingListNameError.class + ": message is missing");
        return new AgentMissingShoppingListNameErrorImpl(message, values);
    }

    /**
     * builds AgentMissingShoppingListNameError without checking for non-null required values
     * @return AgentMissingShoppingListNameError
     */
    public AgentMissingShoppingListNameError buildUnchecked() {
        return new AgentMissingShoppingListNameErrorImpl(message, values);
    }

    /**
     * factory method for an instance of AgentMissingShoppingListNameErrorBuilder
     * @return builder
     */
    public static AgentMissingShoppingListNameErrorBuilder of() {
        return new AgentMissingShoppingListNameErrorBuilder();
    }

    /**
     * create builder for AgentMissingShoppingListNameError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentMissingShoppingListNameErrorBuilder of(final AgentMissingShoppingListNameError template) {
        AgentMissingShoppingListNameErrorBuilder builder = new AgentMissingShoppingListNameErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
