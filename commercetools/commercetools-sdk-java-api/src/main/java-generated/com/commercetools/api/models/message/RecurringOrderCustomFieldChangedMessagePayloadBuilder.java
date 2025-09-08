
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringOrderCustomFieldChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringOrderCustomFieldChangedMessagePayload recurringOrderCustomFieldChangedMessagePayload = RecurringOrderCustomFieldChangedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringOrderCustomFieldChangedMessagePayloadBuilder
        implements Builder<RecurringOrderCustomFieldChangedMessagePayload> {

    private String name;

    private java.lang.Object value;

    @Nullable
    private java.lang.Object previousValue;

    /**
     *  <p>Name of the Custom Field that changed.</p>
     * @param name value to be set
     * @return Builder
     */

    public RecurringOrderCustomFieldChangedMessagePayloadBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetCustomFieldAction" rel="nofollow">Set CustomField</a> update action.</p>
     * @param value value to be set
     * @return Builder
     */

    public RecurringOrderCustomFieldChangedMessagePayloadBuilder value(final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetCustomFieldAction" rel="nofollow">Set CustomField</a> update action. When there has not been a Custom Field with the <code>name</code> on the Order before, an <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderCustomFieldAddedMessage" rel="nofollow">Order Custom Field Added</a> Message is generated instead.</p>
     * @param previousValue value to be set
     * @return Builder
     */

    public RecurringOrderCustomFieldChangedMessagePayloadBuilder previousValue(
            @Nullable final java.lang.Object previousValue) {
        this.previousValue = previousValue;
        return this;
    }

    /**
     *  <p>Name of the Custom Field that changed.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetCustomFieldAction" rel="nofollow">Set CustomField</a> update action.</p>
     * @return value
     */

    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderSetCustomFieldAction" rel="nofollow">Set CustomField</a> update action. When there has not been a Custom Field with the <code>name</code> on the Order before, an <a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrderCustomFieldAddedMessage" rel="nofollow">Order Custom Field Added</a> Message is generated instead.</p>
     * @return previousValue
     */

    @Nullable
    public java.lang.Object getPreviousValue() {
        return this.previousValue;
    }

    /**
     * builds RecurringOrderCustomFieldChangedMessagePayload with checking for non-null required values
     * @return RecurringOrderCustomFieldChangedMessagePayload
     */
    public RecurringOrderCustomFieldChangedMessagePayload build() {
        Objects.requireNonNull(name, RecurringOrderCustomFieldChangedMessagePayload.class + ": name is missing");
        Objects.requireNonNull(value, RecurringOrderCustomFieldChangedMessagePayload.class + ": value is missing");
        return new RecurringOrderCustomFieldChangedMessagePayloadImpl(name, value, previousValue);
    }

    /**
     * builds RecurringOrderCustomFieldChangedMessagePayload without checking for non-null required values
     * @return RecurringOrderCustomFieldChangedMessagePayload
     */
    public RecurringOrderCustomFieldChangedMessagePayload buildUnchecked() {
        return new RecurringOrderCustomFieldChangedMessagePayloadImpl(name, value, previousValue);
    }

    /**
     * factory method for an instance of RecurringOrderCustomFieldChangedMessagePayloadBuilder
     * @return builder
     */
    public static RecurringOrderCustomFieldChangedMessagePayloadBuilder of() {
        return new RecurringOrderCustomFieldChangedMessagePayloadBuilder();
    }

    /**
     * create builder for RecurringOrderCustomFieldChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringOrderCustomFieldChangedMessagePayloadBuilder of(
            final RecurringOrderCustomFieldChangedMessagePayload template) {
        RecurringOrderCustomFieldChangedMessagePayloadBuilder builder = new RecurringOrderCustomFieldChangedMessagePayloadBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        builder.previousValue = template.getPreviousValue();
        return builder;
    }

}
