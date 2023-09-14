
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitAddressCustomFieldAddedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAddressCustomFieldAddedMessagePayload businessUnitAddressCustomFieldAddedMessagePayload = BusinessUnitAddressCustomFieldAddedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitAddressCustomFieldAddedMessagePayloadBuilder
        implements Builder<BusinessUnitAddressCustomFieldAddedMessagePayload> {

    private String name;

    private java.lang.Object value;

    /**
     *  <p>Name of the Custom Field that has been added.</p>
     * @param name value to be set
     * @return Builder
     */

    public BusinessUnitAddressCustomFieldAddedMessagePayloadBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>The added CustomFieldValue based on the FieldType.</p>
     * @param value value to be set
     * @return Builder
     */

    public BusinessUnitAddressCustomFieldAddedMessagePayloadBuilder value(final java.lang.Object value) {
        this.value = value;
        return this;
    }

    /**
     *  <p>Name of the Custom Field that has been added.</p>
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
     * builds BusinessUnitAddressCustomFieldAddedMessagePayload with checking for non-null required values
     * @return BusinessUnitAddressCustomFieldAddedMessagePayload
     */
    public BusinessUnitAddressCustomFieldAddedMessagePayload build() {
        Objects.requireNonNull(name, BusinessUnitAddressCustomFieldAddedMessagePayload.class + ": name is missing");
        Objects.requireNonNull(value, BusinessUnitAddressCustomFieldAddedMessagePayload.class + ": value is missing");
        return new BusinessUnitAddressCustomFieldAddedMessagePayloadImpl(name, value);
    }

    /**
     * builds BusinessUnitAddressCustomFieldAddedMessagePayload without checking for non-null required values
     * @return BusinessUnitAddressCustomFieldAddedMessagePayload
     */
    public BusinessUnitAddressCustomFieldAddedMessagePayload buildUnchecked() {
        return new BusinessUnitAddressCustomFieldAddedMessagePayloadImpl(name, value);
    }

    /**
     * factory method for an instance of BusinessUnitAddressCustomFieldAddedMessagePayloadBuilder
     * @return builder
     */
    public static BusinessUnitAddressCustomFieldAddedMessagePayloadBuilder of() {
        return new BusinessUnitAddressCustomFieldAddedMessagePayloadBuilder();
    }

    /**
     * create builder for BusinessUnitAddressCustomFieldAddedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitAddressCustomFieldAddedMessagePayloadBuilder of(
            final BusinessUnitAddressCustomFieldAddedMessagePayload template) {
        BusinessUnitAddressCustomFieldAddedMessagePayloadBuilder builder = new BusinessUnitAddressCustomFieldAddedMessagePayloadBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
