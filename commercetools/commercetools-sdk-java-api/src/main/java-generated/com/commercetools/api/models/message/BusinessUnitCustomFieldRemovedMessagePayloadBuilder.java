
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitCustomFieldRemovedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitCustomFieldRemovedMessagePayload businessUnitCustomFieldRemovedMessagePayload = BusinessUnitCustomFieldRemovedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitCustomFieldRemovedMessagePayloadBuilder
        implements Builder<BusinessUnitCustomFieldRemovedMessagePayload> {

    private String name;

    /**
     *  <p>Name of the Custom Field that was removed.</p>
     * @param name value to be set
     * @return Builder
     */

    public BusinessUnitCustomFieldRemovedMessagePayloadBuilder name(final String name) {
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
     * builds BusinessUnitCustomFieldRemovedMessagePayload with checking for non-null required values
     * @return BusinessUnitCustomFieldRemovedMessagePayload
     */
    public BusinessUnitCustomFieldRemovedMessagePayload build() {
        Objects.requireNonNull(name, BusinessUnitCustomFieldRemovedMessagePayload.class + ": name is missing");
        return new BusinessUnitCustomFieldRemovedMessagePayloadImpl(name);
    }

    /**
     * builds BusinessUnitCustomFieldRemovedMessagePayload without checking for non-null required values
     * @return BusinessUnitCustomFieldRemovedMessagePayload
     */
    public BusinessUnitCustomFieldRemovedMessagePayload buildUnchecked() {
        return new BusinessUnitCustomFieldRemovedMessagePayloadImpl(name);
    }

    /**
     * factory method for an instance of BusinessUnitCustomFieldRemovedMessagePayloadBuilder
     * @return builder
     */
    public static BusinessUnitCustomFieldRemovedMessagePayloadBuilder of() {
        return new BusinessUnitCustomFieldRemovedMessagePayloadBuilder();
    }

    /**
     * create builder for BusinessUnitCustomFieldRemovedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitCustomFieldRemovedMessagePayloadBuilder of(
            final BusinessUnitCustomFieldRemovedMessagePayload template) {
        BusinessUnitCustomFieldRemovedMessagePayloadBuilder builder = new BusinessUnitCustomFieldRemovedMessagePayloadBuilder();
        builder.name = template.getName();
        return builder;
    }

}
