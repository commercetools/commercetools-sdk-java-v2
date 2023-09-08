
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitAddressCustomFieldChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAddressCustomFieldChangedMessagePayload businessUnitAddressCustomFieldChangedMessagePayload = BusinessUnitAddressCustomFieldChangedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitAddressCustomFieldChangedMessagePayloadBuilder
        implements Builder<BusinessUnitAddressCustomFieldChangedMessagePayload> {

    private String name;

    private java.lang.Object value;

    @Nullable
    private java.lang.Object oldValue;

    /**
     *  <p>Name of the Custom Field that changed.</p>
     * @param name value to be set
     * @return Builder
     */

    public BusinessUnitAddressCustomFieldChangedMessagePayloadBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>CustomFieldValue based on the FieldType after the Set CustomField update action.</p>
     * @param value value to be set
     * @return Builder
     */

    public BusinessUnitAddressCustomFieldChangedMessagePayloadBuilder value(final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>CustomFieldValue based on the FieldType before the Set CustomField update action.</p>
     * @param oldValue value to be set
     * @return Builder
     */

    public BusinessUnitAddressCustomFieldChangedMessagePayloadBuilder oldValue(
            @Nullable final java.lang.Object oldValue) {
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
     *  <p>CustomFieldValue based on the FieldType after the Set CustomField update action.</p>
     * @return value
     */

    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     *  <p>CustomFieldValue based on the FieldType before the Set CustomField update action.</p>
     * @return oldValue
     */

    @Nullable
    public java.lang.Object getOldValue() {
        return this.oldValue;
    }

    /**
     * builds BusinessUnitAddressCustomFieldChangedMessagePayload with checking for non-null required values
     * @return BusinessUnitAddressCustomFieldChangedMessagePayload
     */
    public BusinessUnitAddressCustomFieldChangedMessagePayload build() {
        Objects.requireNonNull(name, BusinessUnitAddressCustomFieldChangedMessagePayload.class + ": name is missing");
        Objects.requireNonNull(value, BusinessUnitAddressCustomFieldChangedMessagePayload.class + ": value is missing");
        return new BusinessUnitAddressCustomFieldChangedMessagePayloadImpl(name, value, oldValue);
    }

    /**
     * builds BusinessUnitAddressCustomFieldChangedMessagePayload without checking for non-null required values
     * @return BusinessUnitAddressCustomFieldChangedMessagePayload
     */
    public BusinessUnitAddressCustomFieldChangedMessagePayload buildUnchecked() {
        return new BusinessUnitAddressCustomFieldChangedMessagePayloadImpl(name, value, oldValue);
    }

    /**
     * factory method for an instance of BusinessUnitAddressCustomFieldChangedMessagePayloadBuilder
     * @return builder
     */
    public static BusinessUnitAddressCustomFieldChangedMessagePayloadBuilder of() {
        return new BusinessUnitAddressCustomFieldChangedMessagePayloadBuilder();
    }

    /**
     * create builder for BusinessUnitAddressCustomFieldChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitAddressCustomFieldChangedMessagePayloadBuilder of(
            final BusinessUnitAddressCustomFieldChangedMessagePayload template) {
        BusinessUnitAddressCustomFieldChangedMessagePayloadBuilder builder = new BusinessUnitAddressCustomFieldChangedMessagePayloadBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        builder.oldValue = template.getOldValue();
        return builder;
    }

}
