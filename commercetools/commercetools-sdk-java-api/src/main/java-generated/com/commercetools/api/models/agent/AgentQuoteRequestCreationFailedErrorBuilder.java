
package com.commercetools.api.models.agent;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AgentQuoteRequestCreationFailedErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentQuoteRequestCreationFailedError agentQuoteRequestCreationFailedError = AgentQuoteRequestCreationFailedError.builder()
 *             .message("{message}")
 *             .cartId("{cartId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AgentQuoteRequestCreationFailedErrorBuilder implements Builder<AgentQuoteRequestCreationFailedError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    private String cartId;

    /**
     *  <p>Plain text description of the error.</p>
     * @param message value to be set
     * @return Builder
     */

    public AgentQuoteRequestCreationFailedErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public AgentQuoteRequestCreationFailedErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public AgentQuoteRequestCreationFailedErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p><code>id</code> of the orphaned Cart, for retry or cleanup.</p>
     * @param cartId value to be set
     * @return Builder
     */

    public AgentQuoteRequestCreationFailedErrorBuilder cartId(final String cartId) {
        this.cartId = cartId;
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
     *  <p><code>id</code> of the orphaned Cart, for retry or cleanup.</p>
     * @return cartId
     */

    public String getCartId() {
        return this.cartId;
    }

    /**
     * builds AgentQuoteRequestCreationFailedError with checking for non-null required values
     * @return AgentQuoteRequestCreationFailedError
     */
    public AgentQuoteRequestCreationFailedError build() {
        Objects.requireNonNull(message, AgentQuoteRequestCreationFailedError.class + ": message is missing");
        Objects.requireNonNull(cartId, AgentQuoteRequestCreationFailedError.class + ": cartId is missing");
        return new AgentQuoteRequestCreationFailedErrorImpl(message, values, cartId);
    }

    /**
     * builds AgentQuoteRequestCreationFailedError without checking for non-null required values
     * @return AgentQuoteRequestCreationFailedError
     */
    public AgentQuoteRequestCreationFailedError buildUnchecked() {
        return new AgentQuoteRequestCreationFailedErrorImpl(message, values, cartId);
    }

    /**
     * factory method for an instance of AgentQuoteRequestCreationFailedErrorBuilder
     * @return builder
     */
    public static AgentQuoteRequestCreationFailedErrorBuilder of() {
        return new AgentQuoteRequestCreationFailedErrorBuilder();
    }

    /**
     * create builder for AgentQuoteRequestCreationFailedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentQuoteRequestCreationFailedErrorBuilder of(final AgentQuoteRequestCreationFailedError template) {
        AgentQuoteRequestCreationFailedErrorBuilder builder = new AgentQuoteRequestCreationFailedErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.cartId = template.getCartId();
        return builder;
    }

}
