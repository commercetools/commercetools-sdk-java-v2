
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitCustomFieldChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitCustomFieldChangedMessagePayload businessUnitCustomFieldChangedMessagePayload = BusinessUnitCustomFieldChangedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitCustomFieldChangedMessagePayloadBuilder
        implements Builder<BusinessUnitCustomFieldChangedMessagePayload> {

    private String name;

    private java.lang.Object value;

    @Nullable
    private java.lang.Object oldValue;

    /**
     *  <p>Name of the Custom Field that changed.</p>
     * @param name value to be set
     * @return Builder
     */

    public BusinessUnitCustomFieldChangedMessagePayloadBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetCustomFieldAction" rel="nofollow">Set CustomField</a> update action.</p>
     * @param value value to be set
     * @return Builder
     */

    public BusinessUnitCustomFieldChangedMessagePayloadBuilder value(final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetCustomFieldAction" rel="nofollow">Set CustomField</a> update action.</p>
     * @param oldValue value to be set
     * @return Builder
     */

    public BusinessUnitCustomFieldChangedMessagePayloadBuilder oldValue(@Nullable final java.lang.Object oldValue) {
        this.oldValue = oldValue;
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
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetCustomFieldAction" rel="nofollow">Set CustomField</a> update action.</p>
     * @return value
     */

    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:CustomFieldValue" rel="nofollow">CustomFieldValue</a> based on the <a href="https://docs.commercetools.com/apis/ctp:api:type:FieldType" rel="nofollow">FieldType</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnitSetCustomFieldAction" rel="nofollow">Set CustomField</a> update action.</p>
     * @return oldValue
     */

    @Nullable
    public java.lang.Object getOldValue() {
        return this.oldValue;
    }

    /**
     * builds BusinessUnitCustomFieldChangedMessagePayload with checking for non-null required values
     * @return BusinessUnitCustomFieldChangedMessagePayload
     */
    public BusinessUnitCustomFieldChangedMessagePayload build() {
        Objects.requireNonNull(name, BusinessUnitCustomFieldChangedMessagePayload.class + ": name is missing");
        Objects.requireNonNull(value, BusinessUnitCustomFieldChangedMessagePayload.class + ": value is missing");
        return new BusinessUnitCustomFieldChangedMessagePayloadImpl(name, value, oldValue);
    }

    /**
     * builds BusinessUnitCustomFieldChangedMessagePayload without checking for non-null required values
     * @return BusinessUnitCustomFieldChangedMessagePayload
     */
    public BusinessUnitCustomFieldChangedMessagePayload buildUnchecked() {
        return new BusinessUnitCustomFieldChangedMessagePayloadImpl(name, value, oldValue);
    }

    /**
     * factory method for an instance of BusinessUnitCustomFieldChangedMessagePayloadBuilder
     * @return builder
     */
    public static BusinessUnitCustomFieldChangedMessagePayloadBuilder of() {
        return new BusinessUnitCustomFieldChangedMessagePayloadBuilder();
    }

    /**
     * create builder for BusinessUnitCustomFieldChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitCustomFieldChangedMessagePayloadBuilder of(
            final BusinessUnitCustomFieldChangedMessagePayload template) {
        BusinessUnitCustomFieldChangedMessagePayloadBuilder builder = new BusinessUnitCustomFieldChangedMessagePayloadBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        builder.oldValue = template.getOldValue();
        return builder;
    }

}
