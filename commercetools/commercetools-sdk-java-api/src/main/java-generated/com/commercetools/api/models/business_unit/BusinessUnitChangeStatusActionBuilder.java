
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
     */

    public BusinessUnitChangeStatusActionBuilder status(final String status) {
        this.status = status;
        return this;
    }

    public String getStatus() {
        return this.status;
    }

    public BusinessUnitChangeStatusAction build() {
        Objects.requireNonNull(status, BusinessUnitChangeStatusAction.class + ": status is missing");
        return new BusinessUnitChangeStatusActionImpl(status);
    }

    /**
     * builds BusinessUnitChangeStatusAction without checking for non null required values
     */
    public BusinessUnitChangeStatusAction buildUnchecked() {
        return new BusinessUnitChangeStatusActionImpl(status);
    }

    public static BusinessUnitChangeStatusActionBuilder of() {
        return new BusinessUnitChangeStatusActionBuilder();
    }

    public static BusinessUnitChangeStatusActionBuilder of(final BusinessUnitChangeStatusAction template) {
        BusinessUnitChangeStatusActionBuilder builder = new BusinessUnitChangeStatusActionBuilder();
        builder.status = template.getStatus();
        return builder;
    }

}
