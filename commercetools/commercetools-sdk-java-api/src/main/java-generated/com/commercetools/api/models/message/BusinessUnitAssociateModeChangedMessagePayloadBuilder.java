
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitAssociateModeChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitAssociateModeChangedMessagePayload businessUnitAssociateModeChangedMessagePayload = BusinessUnitAssociateModeChangedMessagePayload.builder()
 *             .associateMode(BusinessUnitAssociateMode.EXPLICIT)
 *             .oldAssociateMode(BusinessUnitAssociateMode.EXPLICIT)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitAssociateModeChangedMessagePayloadBuilder
        implements Builder<BusinessUnitAssociateModeChangedMessagePayload> {

    private com.commercetools.api.models.business_unit.BusinessUnitAssociateMode associateMode;

    private com.commercetools.api.models.business_unit.BusinessUnitAssociateMode oldAssociateMode;

    /**
     *  <p>BusinessUnitAssociateMode of the Business Unit after the Change Associate Mode update action.</p>
     * @param associateMode value to be set
     * @return Builder
     */

    public BusinessUnitAssociateModeChangedMessagePayloadBuilder associateMode(
            final com.commercetools.api.models.business_unit.BusinessUnitAssociateMode associateMode) {
        this.associateMode = associateMode;
        return this;
    }

    /**
     *  <p>BusinessUnitAssociateMode of the Business Unit before the Change Associate Mode update action.</p>
     * @param oldAssociateMode value to be set
     * @return Builder
     */

    public BusinessUnitAssociateModeChangedMessagePayloadBuilder oldAssociateMode(
            final com.commercetools.api.models.business_unit.BusinessUnitAssociateMode oldAssociateMode) {
        this.oldAssociateMode = oldAssociateMode;
        return this;
    }

    /**
     *  <p>BusinessUnitAssociateMode of the Business Unit after the Change Associate Mode update action.</p>
     * @return associateMode
     */

    public com.commercetools.api.models.business_unit.BusinessUnitAssociateMode getAssociateMode() {
        return this.associateMode;
    }

    /**
     *  <p>BusinessUnitAssociateMode of the Business Unit before the Change Associate Mode update action.</p>
     * @return oldAssociateMode
     */

    public com.commercetools.api.models.business_unit.BusinessUnitAssociateMode getOldAssociateMode() {
        return this.oldAssociateMode;
    }

    /**
     * builds BusinessUnitAssociateModeChangedMessagePayload with checking for non-null required values
     * @return BusinessUnitAssociateModeChangedMessagePayload
     */
    public BusinessUnitAssociateModeChangedMessagePayload build() {
        Objects.requireNonNull(associateMode,
            BusinessUnitAssociateModeChangedMessagePayload.class + ": associateMode is missing");
        Objects.requireNonNull(oldAssociateMode,
            BusinessUnitAssociateModeChangedMessagePayload.class + ": oldAssociateMode is missing");
        return new BusinessUnitAssociateModeChangedMessagePayloadImpl(associateMode, oldAssociateMode);
    }

    /**
     * builds BusinessUnitAssociateModeChangedMessagePayload without checking for non-null required values
     * @return BusinessUnitAssociateModeChangedMessagePayload
     */
    public BusinessUnitAssociateModeChangedMessagePayload buildUnchecked() {
        return new BusinessUnitAssociateModeChangedMessagePayloadImpl(associateMode, oldAssociateMode);
    }

    /**
     * factory method for an instance of BusinessUnitAssociateModeChangedMessagePayloadBuilder
     * @return builder
     */
    public static BusinessUnitAssociateModeChangedMessagePayloadBuilder of() {
        return new BusinessUnitAssociateModeChangedMessagePayloadBuilder();
    }

    /**
     * create builder for BusinessUnitAssociateModeChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitAssociateModeChangedMessagePayloadBuilder of(
            final BusinessUnitAssociateModeChangedMessagePayload template) {
        BusinessUnitAssociateModeChangedMessagePayloadBuilder builder = new BusinessUnitAssociateModeChangedMessagePayloadBuilder();
        builder.associateMode = template.getAssociateMode();
        builder.oldAssociateMode = template.getOldAssociateMode();
        return builder;
    }

}
