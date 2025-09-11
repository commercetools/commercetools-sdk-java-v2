
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringOrderCustomFieldAddedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderCustomFieldAddedMessagePayload recurringOrderCustomFieldAddedMessagePayload = RecurringOrderCustomFieldAddedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderCustomFieldAddedMessagePayloadBuilder
        implements Builder<RecurringOrderCustomFieldAddedMessagePayload> {

    private String name;

    private java.lang.Object value;

    /**
     *  <p>Name of the Custom Field that was added.</p>
     * @param name value to be set
     * @return Builder
     */

    public RecurringOrderCustomFieldAddedMessagePayloadBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>The added <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a>.</p>
     * @param value value to be set
     * @return Builder
     */

    public RecurringOrderCustomFieldAddedMessagePayloadBuilder value(final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Name of the Custom Field that was added.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p>The added <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a>.</p>
     * @return value
     */

    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     * builds RecurringOrderCustomFieldAddedMessagePayload with checking for non-null required values
     * @return RecurringOrderCustomFieldAddedMessagePayload
     */
    public RecurringOrderCustomFieldAddedMessagePayload build() {
        Objects.requireNonNull(name, RecurringOrderCustomFieldAddedMessagePayload.class + ": name is missing");
        Objects.requireNonNull(value, RecurringOrderCustomFieldAddedMessagePayload.class + ": value is missing");
        return new RecurringOrderCustomFieldAddedMessagePayloadImpl(name, value);
    }

    /**
     * builds RecurringOrderCustomFieldAddedMessagePayload without checking for non-null required values
     * @return RecurringOrderCustomFieldAddedMessagePayload
     */
    public RecurringOrderCustomFieldAddedMessagePayload buildUnchecked() {
        return new RecurringOrderCustomFieldAddedMessagePayloadImpl(name, value);
    }

    /**
     * factory method for an instance of RecurringOrderCustomFieldAddedMessagePayloadBuilder
     * @return builder
     */
    public static RecurringOrderCustomFieldAddedMessagePayloadBuilder of() {
        return new RecurringOrderCustomFieldAddedMessagePayloadBuilder();
    }

    /**
     * create builder for RecurringOrderCustomFieldAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderCustomFieldAddedMessagePayloadBuilder of(
            final RecurringOrderCustomFieldAddedMessagePayload template) {
        RecurringOrderCustomFieldAddedMessagePayloadBuilder builder = new RecurringOrderCustomFieldAddedMessagePayloadBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
