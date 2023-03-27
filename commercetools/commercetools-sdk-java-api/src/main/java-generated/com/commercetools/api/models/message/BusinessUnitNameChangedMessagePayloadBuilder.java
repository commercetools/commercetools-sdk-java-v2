
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitNameChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitNameChangedMessagePayload businessUnitNameChangedMessagePayload = BusinessUnitNameChangedMessagePayload.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitNameChangedMessagePayloadBuilder implements Builder<BusinessUnitNameChangedMessagePayload> {

    private String name;

    /**
     *  <p>Updated name of the Business Unit.</p>
     * @param name value to be set
     * @return Builder
     */

    public BusinessUnitNameChangedMessagePayloadBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>Updated name of the Business Unit.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     * builds BusinessUnitNameChangedMessagePayload with checking for non-null required values
     * @return BusinessUnitNameChangedMessagePayload
     */
    public BusinessUnitNameChangedMessagePayload build() {
        Objects.requireNonNull(name, BusinessUnitNameChangedMessagePayload.class + ": name is missing");
        return new BusinessUnitNameChangedMessagePayloadImpl(name);
    }

    /**
     * builds BusinessUnitNameChangedMessagePayload without checking for non-null required values
     * @return BusinessUnitNameChangedMessagePayload
     */
    public BusinessUnitNameChangedMessagePayload buildUnchecked() {
        return new BusinessUnitNameChangedMessagePayloadImpl(name);
    }

    /**
     * factory method for an instance of BusinessUnitNameChangedMessagePayloadBuilder
     * @return builder
     */
    public static BusinessUnitNameChangedMessagePayloadBuilder of() {
        return new BusinessUnitNameChangedMessagePayloadBuilder();
    }

    /**
     * create builder for BusinessUnitNameChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitNameChangedMessagePayloadBuilder of(
            final BusinessUnitNameChangedMessagePayload template) {
        BusinessUnitNameChangedMessagePayloadBuilder builder = new BusinessUnitNameChangedMessagePayloadBuilder();
        builder.name = template.getName();
        return builder;
    }

}
