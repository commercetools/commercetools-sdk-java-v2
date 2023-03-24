
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

    public static BusinessUnitDeletedMessagePayloadBuilder of() {
        return new BusinessUnitDeletedMessagePayloadBuilder();
    }

    public static BusinessUnitDeletedMessagePayloadBuilder of(final BusinessUnitDeletedMessagePayload template) {
        BusinessUnitDeletedMessagePayloadBuilder builder = new BusinessUnitDeletedMessagePayloadBuilder();
        return builder;
    }

}
