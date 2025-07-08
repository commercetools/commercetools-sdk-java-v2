
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringOrderCustomFieldRemovedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderCustomFieldRemovedMessagePayload recurringOrderCustomFieldRemovedMessagePayload = RecurringOrderCustomFieldRemovedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderCustomFieldRemovedMessagePayloadBuilder
        implements Builder<RecurringOrderCustomFieldRemovedMessagePayload> {

    private String name;

    /**
     *  <p>Name of the Custom Field that was removed.</p>
     * @param name value to be set
     * @return Builder
     */

    public RecurringOrderCustomFieldRemovedMessagePayloadBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Name of the Custom Field that was removed.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     * builds RecurringOrderCustomFieldRemovedMessagePayload with checking for non-null required values
     * @return RecurringOrderCustomFieldRemovedMessagePayload
     */
    public RecurringOrderCustomFieldRemovedMessagePayload build() {
        Objects.requireNonNull(name, RecurringOrderCustomFieldRemovedMessagePayload.class + ": name is missing");
        return new RecurringOrderCustomFieldRemovedMessagePayloadImpl(name);
    }

    /**
     * builds RecurringOrderCustomFieldRemovedMessagePayload without checking for non-null required values
     * @return RecurringOrderCustomFieldRemovedMessagePayload
     */
    public RecurringOrderCustomFieldRemovedMessagePayload buildUnchecked() {
        return new RecurringOrderCustomFieldRemovedMessagePayloadImpl(name);
    }

    /**
     * factory method for an instance of RecurringOrderCustomFieldRemovedMessagePayloadBuilder
     * @return builder
     */
    public static RecurringOrderCustomFieldRemovedMessagePayloadBuilder of() {
        return new RecurringOrderCustomFieldRemovedMessagePayloadBuilder();
    }

    /**
     * create builder for RecurringOrderCustomFieldRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderCustomFieldRemovedMessagePayloadBuilder of(
            final RecurringOrderCustomFieldRemovedMessagePayload template) {
        RecurringOrderCustomFieldRemovedMessagePayloadBuilder builder = new RecurringOrderCustomFieldRemovedMessagePayloadBuilder();
        builder.name = template.getName();
        return builder;
    }

}
