
package com.commercetools.api.models.business_unit;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitChangeStatusActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitChangeStatusAction businessUnitChangeStatusAction = BusinessUnitChangeStatusAction.builder()
 *             .status("{status}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitChangeStatusActionBuilder implements Builder<BusinessUnitChangeStatusAction> {

    private String status;

    /**
     *  <p>New status to set.</p>
     * @param status value to be set
     * @return Builder
     */

    public BusinessUnitChangeStatusActionBuilder status(final String status) {
        this.status = status;
        return this;
    }

    /**
     *  <p>New status to set.</p>
     * @return status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * builds BusinessUnitChangeStatusAction with checking for non-null required values
     * @return BusinessUnitChangeStatusAction
     */
    public BusinessUnitChangeStatusAction build() {
        Objects.requireNonNull(status, BusinessUnitChangeStatusAction.class + ": status is missing");
        return new BusinessUnitChangeStatusActionImpl(status);
    }

    /**
     * builds BusinessUnitChangeStatusAction without checking for non-null required values
     * @return BusinessUnitChangeStatusAction
     */
    public BusinessUnitChangeStatusAction buildUnchecked() {
        return new BusinessUnitChangeStatusActionImpl(status);
    }

    /**
     * factory method for an instance of BusinessUnitChangeStatusActionBuilder
     * @return builder
     */
    public static BusinessUnitChangeStatusActionBuilder of() {
        return new BusinessUnitChangeStatusActionBuilder();
    }

    /**
     * create builder for BusinessUnitChangeStatusAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitChangeStatusActionBuilder of(final BusinessUnitChangeStatusAction template) {
        BusinessUnitChangeStatusActionBuilder builder = new BusinessUnitChangeStatusActionBuilder();
        builder.status = template.getStatus();
        return builder;
    }

}
