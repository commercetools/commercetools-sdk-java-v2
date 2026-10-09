
package com.commercetools.api.models.agent;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AgentShoppingListCreationFailedErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentShoppingListCreationFailedError agentShoppingListCreationFailedError = AgentShoppingListCreationFailedError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AgentShoppingListCreationFailedErrorBuilder implements Builder<AgentShoppingListCreationFailedError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Plain text description of the error.</p>
     * @param message value to be set
     * @return Builder
     */

    public AgentShoppingListCreationFailedErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public AgentShoppingListCreationFailedErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public AgentShoppingListCreationFailedErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds AgentShoppingListCreationFailedError with checking for non-null required values
     * @return AgentShoppingListCreationFailedError
     */
    public AgentShoppingListCreationFailedError build() {
        Objects.requireNonNull(message, AgentShoppingListCreationFailedError.class + ": message is missing");
        return new AgentShoppingListCreationFailedErrorImpl(message, values);
    }

    /**
     * builds AgentShoppingListCreationFailedError without checking for non-null required values
     * @return AgentShoppingListCreationFailedError
     */
    public AgentShoppingListCreationFailedError buildUnchecked() {
        return new AgentShoppingListCreationFailedErrorImpl(message, values);
    }

    /**
     * factory method for an instance of AgentShoppingListCreationFailedErrorBuilder
     * @return builder
     */
    public static AgentShoppingListCreationFailedErrorBuilder of() {
        return new AgentShoppingListCreationFailedErrorBuilder();
    }

    /**
     * create builder for AgentShoppingListCreationFailedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentShoppingListCreationFailedErrorBuilder of(final AgentShoppingListCreationFailedError template) {
        AgentShoppingListCreationFailedErrorBuilder builder = new AgentShoppingListCreationFailedErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
