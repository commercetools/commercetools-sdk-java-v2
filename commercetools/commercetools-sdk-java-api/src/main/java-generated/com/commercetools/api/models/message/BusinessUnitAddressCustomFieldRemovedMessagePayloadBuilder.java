
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitAddressCustomFieldRemovedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAddressCustomFieldRemovedMessagePayload businessUnitAddressCustomFieldRemovedMessagePayload = BusinessUnitAddressCustomFieldRemovedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitAddressCustomFieldRemovedMessagePayloadBuilder
        implements Builder<BusinessUnitAddressCustomFieldRemovedMessagePayload> {

    private String name;

    /**
     *  <p>Name of the Custom Field that was removed.</p>
     * @param name value to be set
     * @return Builder
     */

    public BusinessUnitAddressCustomFieldRemovedMessagePayloadBuilder name(final String name) {
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
     * builds BusinessUnitAddressCustomFieldRemovedMessagePayload with checking for non-null required values
     * @return BusinessUnitAddressCustomFieldRemovedMessagePayload
     */
    public BusinessUnitAddressCustomFieldRemovedMessagePayload build() {
        Objects.requireNonNull(name, BusinessUnitAddressCustomFieldRemovedMessagePayload.class + ": name is missing");
        return new BusinessUnitAddressCustomFieldRemovedMessagePayloadImpl(name);
    }

    /**
     * builds BusinessUnitAddressCustomFieldRemovedMessagePayload without checking for non-null required values
     * @return BusinessUnitAddressCustomFieldRemovedMessagePayload
     */
    public BusinessUnitAddressCustomFieldRemovedMessagePayload buildUnchecked() {
        return new BusinessUnitAddressCustomFieldRemovedMessagePayloadImpl(name);
    }

    /**
     * factory method for an instance of BusinessUnitAddressCustomFieldRemovedMessagePayloadBuilder
     * @return builder
     */
    public static BusinessUnitAddressCustomFieldRemovedMessagePayloadBuilder of() {
        return new BusinessUnitAddressCustomFieldRemovedMessagePayloadBuilder();
    }

    /**
     * create builder for BusinessUnitAddressCustomFieldRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitAddressCustomFieldRemovedMessagePayloadBuilder of(
            final BusinessUnitAddressCustomFieldRemovedMessagePayload template) {
        BusinessUnitAddressCustomFieldRemovedMessagePayloadBuilder builder = new BusinessUnitAddressCustomFieldRemovedMessagePayloadBuilder();
        builder.name = template.getName();
        return builder;
    }

}
