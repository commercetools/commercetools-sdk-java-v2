
package com.commercetools.api.models.business_unit;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitChangeAssociateModeActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitChangeAssociateModeAction businessUnitChangeAssociateModeAction = BusinessUnitChangeAssociateModeAction.builder()
 *             .associateMode(BusinessUnitAssociateMode.EXPLICIT)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitChangeAssociateModeActionBuilder implements Builder<BusinessUnitChangeAssociateModeAction> {

    private com.commercetools.api.models.business_unit.BusinessUnitAssociateMode associateMode;

    /**
     *  <p>The new value for <code>associateMode</code>.</p>
     * @param associateMode value to be set
     * @return Builder
     */

    public BusinessUnitChangeAssociateModeActionBuilder associateMode(
            final com.commercetools.api.models.business_unit.BusinessUnitAssociateMode associateMode) {
        this.associateMode = associateMode;
        return this;
    }

    /**
     *  <p>The new value for <code>associateMode</code>.</p>
     * @return associateMode
     */

    public com.commercetools.api.models.business_unit.BusinessUnitAssociateMode getAssociateMode() {
        return this.associateMode;
    }

    /**
     * builds BusinessUnitChangeAssociateModeAction with checking for non-null required values
     * @return BusinessUnitChangeAssociateModeAction
     */
    public BusinessUnitChangeAssociateModeAction build() {
        Objects.requireNonNull(associateMode,
            BusinessUnitChangeAssociateModeAction.class + ": associateMode is missing");
        return new BusinessUnitChangeAssociateModeActionImpl(associateMode);
    }

    /**
     * builds BusinessUnitChangeAssociateModeAction without checking for non-null required values
     * @return BusinessUnitChangeAssociateModeAction
     */
    public BusinessUnitChangeAssociateModeAction buildUnchecked() {
        return new BusinessUnitChangeAssociateModeActionImpl(associateMode);
    }

    /**
     * factory method for an instance of BusinessUnitChangeAssociateModeActionBuilder
     * @return builder
     */
    public static BusinessUnitChangeAssociateModeActionBuilder of() {
        return new BusinessUnitChangeAssociateModeActionBuilder();
    }

    /**
     * create builder for BusinessUnitChangeAssociateModeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitChangeAssociateModeActionBuilder of(
            final BusinessUnitChangeAssociateModeAction template) {
        BusinessUnitChangeAssociateModeActionBuilder builder = new BusinessUnitChangeAssociateModeActionBuilder();
        builder.associateMode = template.getAssociateMode();
        return builder;
    }

}
