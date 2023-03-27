
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
     * @param active value to be set
     * @return Builder
     */

    public BusinessUnitStatusChangedMessagePayloadBuilder active(
            final com.commercetools.api.models.business_unit.BusinessUnitStatus active) {
        this.active = active;
        return this;
    }

    /**
     *  <p>Updated status of the Business Unit.</p>
     * @return active
     */

    public com.commercetools.api.models.business_unit.BusinessUnitStatus getActive() {
        return this.active;
    }

    /**
     * builds BusinessUnitStatusChangedMessagePayload with checking for non-null required values
     * @return BusinessUnitStatusChangedMessagePayload
     */
    public BusinessUnitStatusChangedMessagePayload build() {
        Objects.requireNonNull(active, BusinessUnitStatusChangedMessagePayload.class + ": active is missing");
        return new BusinessUnitStatusChangedMessagePayloadImpl(active);
    }

    /**
     * builds BusinessUnitStatusChangedMessagePayload without checking for non-null required values
     * @return BusinessUnitStatusChangedMessagePayload
     */
    public BusinessUnitStatusChangedMessagePayload buildUnchecked() {
        return new BusinessUnitStatusChangedMessagePayloadImpl(active);
    }

    /**
     * factory method for an instance of BusinessUnitStatusChangedMessagePayloadBuilder
     * @return builder
     */
    public static BusinessUnitStatusChangedMessagePayloadBuilder of() {
        return new BusinessUnitStatusChangedMessagePayloadBuilder();
    }

    /**
     * create builder for BusinessUnitStatusChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitStatusChangedMessagePayloadBuilder of(
            final BusinessUnitStatusChangedMessagePayload template) {
        BusinessUnitStatusChangedMessagePayloadBuilder builder = new BusinessUnitStatusChangedMessagePayloadBuilder();
        builder.active = template.getActive();
        return builder;
    }

}
