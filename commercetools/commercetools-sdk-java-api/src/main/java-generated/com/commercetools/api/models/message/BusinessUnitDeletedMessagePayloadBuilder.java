
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitDeletedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitDeletedMessagePayload businessUnitDeletedMessagePayload = BusinessUnitDeletedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitDeletedMessagePayloadBuilder implements Builder<BusinessUnitDeletedMessagePayload> {

    /**
     * builds BusinessUnitDeletedMessagePayload with checking for non-null required values
     * @return BusinessUnitDeletedMessagePayload
     */
    public BusinessUnitDeletedMessagePayload build() {
        return new BusinessUnitDeletedMessagePayloadImpl();
    }

    /**
     * builds BusinessUnitDeletedMessagePayload without checking for non-null required values
     * @return BusinessUnitDeletedMessagePayload
     */
    public BusinessUnitDeletedMessagePayload buildUnchecked() {
        return new BusinessUnitDeletedMessagePayloadImpl();
    }

    /**
     * factory method for an instance of BusinessUnitDeletedMessagePayloadBuilder
     * @return builder
     */
    public static BusinessUnitDeletedMessagePayloadBuilder of() {
        return new BusinessUnitDeletedMessagePayloadBuilder();
    }

    /**
     * create builder for BusinessUnitDeletedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitDeletedMessagePayloadBuilder of(final BusinessUnitDeletedMessagePayload template) {
        BusinessUnitDeletedMessagePayloadBuilder builder = new BusinessUnitDeletedMessagePayloadBuilder();
        return builder;
    }

}
