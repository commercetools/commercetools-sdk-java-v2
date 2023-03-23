
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
     * @param name
     * @return Builder
     */

    public BusinessUnitNameChangedMessagePayloadBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public BusinessUnitNameChangedMessagePayload build() {
        Objects.requireNonNull(name, BusinessUnitNameChangedMessagePayload.class + ": name is missing");
        return new BusinessUnitNameChangedMessagePayloadImpl(name);
    }

    /**
     * builds BusinessUnitNameChangedMessagePayload without checking for non null required values
     */
    public BusinessUnitNameChangedMessagePayload buildUnchecked() {
        return new BusinessUnitNameChangedMessagePayloadImpl(name);
    }

    public static BusinessUnitNameChangedMessagePayloadBuilder of() {
        return new BusinessUnitNameChangedMessagePayloadBuilder();
    }

    public static BusinessUnitNameChangedMessagePayloadBuilder of(
            final BusinessUnitNameChangedMessagePayload template) {
        BusinessUnitNameChangedMessagePayloadBuilder builder = new BusinessUnitNameChangedMessagePayloadBuilder();
        builder.name = template.getName();
        return builder;
    }

}
