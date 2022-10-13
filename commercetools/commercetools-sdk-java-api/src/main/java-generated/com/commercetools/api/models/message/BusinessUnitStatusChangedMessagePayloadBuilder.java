
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitStatusChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitStatusChangedMessagePayload businessUnitStatusChangedMessagePayload = BusinessUnitStatusChangedMessagePayload.builder()
 *             .active(BusinessUnitStatus.ACTIVE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitStatusChangedMessagePayloadBuilder
        implements Builder<BusinessUnitStatusChangedMessagePayload> {

    private com.commercetools.api.models.business_unit.BusinessUnitStatus active;

    /**
     *  <p>Updated status of the Business Unit.</p>
     */

    public BusinessUnitStatusChangedMessagePayloadBuilder active(
            final com.commercetools.api.models.business_unit.BusinessUnitStatus active) {
        this.active = active;
        return this;
    }

    public com.commercetools.api.models.business_unit.BusinessUnitStatus getActive() {
        return this.active;
    }

    public BusinessUnitStatusChangedMessagePayload build() {
        Objects.requireNonNull(active, BusinessUnitStatusChangedMessagePayload.class + ": active is missing");
        return new BusinessUnitStatusChangedMessagePayloadImpl(active);
    }

    /**
     * builds BusinessUnitStatusChangedMessagePayload without checking for non null required values
     */
    public BusinessUnitStatusChangedMessagePayload buildUnchecked() {
        return new BusinessUnitStatusChangedMessagePayloadImpl(active);
    }

    public static BusinessUnitStatusChangedMessagePayloadBuilder of() {
        return new BusinessUnitStatusChangedMessagePayloadBuilder();
    }

    public static BusinessUnitStatusChangedMessagePayloadBuilder of(
            final BusinessUnitStatusChangedMessagePayload template) {
        BusinessUnitStatusChangedMessagePayloadBuilder builder = new BusinessUnitStatusChangedMessagePayloadBuilder();
        builder.active = template.getActive();
        return builder;
    }

}
