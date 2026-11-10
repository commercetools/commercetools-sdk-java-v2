
package com.commercetools.api.models.agent;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AgentStoreDistributionChannelsUnsupportedErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AgentStoreDistributionChannelsUnsupportedError agentStoreDistributionChannelsUnsupportedError = AgentStoreDistributionChannelsUnsupportedError.builder()
 *             .message("{message}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AgentStoreDistributionChannelsUnsupportedErrorBuilder
        implements Builder<AgentStoreDistributionChannelsUnsupportedError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Plain text description of the error.</p>
     * @param message value to be set
     * @return Builder
     */

    public AgentStoreDistributionChannelsUnsupportedErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public AgentStoreDistributionChannelsUnsupportedErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public AgentStoreDistributionChannelsUnsupportedErrorBuilder addValue(final String key,
            final java.lang.Object value) {
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
     * builds AgentStoreDistributionChannelsUnsupportedError with checking for non-null required values
     * @return AgentStoreDistributionChannelsUnsupportedError
     */
    public AgentStoreDistributionChannelsUnsupportedError build() {
        Objects.requireNonNull(message, AgentStoreDistributionChannelsUnsupportedError.class + ": message is missing");
        return new AgentStoreDistributionChannelsUnsupportedErrorImpl(message, values);
    }

    /**
     * builds AgentStoreDistributionChannelsUnsupportedError without checking for non-null required values
     * @return AgentStoreDistributionChannelsUnsupportedError
     */
    public AgentStoreDistributionChannelsUnsupportedError buildUnchecked() {
        return new AgentStoreDistributionChannelsUnsupportedErrorImpl(message, values);
    }

    /**
     * factory method for an instance of AgentStoreDistributionChannelsUnsupportedErrorBuilder
     * @return builder
     */
    public static AgentStoreDistributionChannelsUnsupportedErrorBuilder of() {
        return new AgentStoreDistributionChannelsUnsupportedErrorBuilder();
    }

    /**
     * create builder for AgentStoreDistributionChannelsUnsupportedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AgentStoreDistributionChannelsUnsupportedErrorBuilder of(
            final AgentStoreDistributionChannelsUnsupportedError template) {
        AgentStoreDistributionChannelsUnsupportedErrorBuilder builder = new AgentStoreDistributionChannelsUnsupportedErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        return builder;
    }

}
