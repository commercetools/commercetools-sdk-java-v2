
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitCustomFieldAddedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitCustomFieldAddedMessagePayload businessUnitCustomFieldAddedMessagePayload = BusinessUnitCustomFieldAddedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitCustomFieldAddedMessagePayloadBuilder
        implements Builder<BusinessUnitCustomFieldAddedMessagePayload> {

    private String name;

    private java.lang.Object value;

    /**
     *  <p>Name of the Custom Field that was added.</p>
     * @param name value to be set
     * @return Builder
     */

    public BusinessUnitCustomFieldAddedMessagePayloadBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>The added CustomFieldValue based on the FieldType.</p>
     * @param value value to be set
     * @return Builder
     */

    public BusinessUnitCustomFieldAddedMessagePayloadBuilder value(final java.lang.Object value) {
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
     *  <p>The added CustomFieldValue based on the FieldType.</p>
     * @return value
     */

    public java.lang.Object getValue() {
        return this.value;
    }

    /**
     * builds BusinessUnitCustomFieldAddedMessagePayload with checking for non-null required values
     * @return BusinessUnitCustomFieldAddedMessagePayload
     */
    public BusinessUnitCustomFieldAddedMessagePayload build() {
        Objects.requireNonNull(name, BusinessUnitCustomFieldAddedMessagePayload.class + ": name is missing");
        Objects.requireNonNull(value, BusinessUnitCustomFieldAddedMessagePayload.class + ": value is missing");
        return new BusinessUnitCustomFieldAddedMessagePayloadImpl(name, value);
    }

    /**
     * builds BusinessUnitCustomFieldAddedMessagePayload without checking for non-null required values
     * @return BusinessUnitCustomFieldAddedMessagePayload
     */
    public BusinessUnitCustomFieldAddedMessagePayload buildUnchecked() {
        return new BusinessUnitCustomFieldAddedMessagePayloadImpl(name, value);
    }

    /**
     * factory method for an instance of BusinessUnitCustomFieldAddedMessagePayloadBuilder
     * @return builder
     */
    public static BusinessUnitCustomFieldAddedMessagePayloadBuilder of() {
        return new BusinessUnitCustomFieldAddedMessagePayloadBuilder();
    }

    /**
     * create builder for BusinessUnitCustomFieldAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitCustomFieldAddedMessagePayloadBuilder of(
            final BusinessUnitCustomFieldAddedMessagePayload template) {
        BusinessUnitCustomFieldAddedMessagePayloadBuilder builder = new BusinessUnitCustomFieldAddedMessagePayloadBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
