
package com.commercetools.api.models.discount_code;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCodeSetMaxApplicationsActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeSetMaxApplicationsAction discountCodeSetMaxApplicationsAction = DiscountCodeSetMaxApplicationsAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountCodeSetMaxApplicationsActionBuilder implements Builder<DiscountCodeSetMaxApplicationsAction> {

    @Nullable
    private Long maxApplications;

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param maxApplications
     * @return Builder
     */

    public DiscountCodeSetMaxApplicationsActionBuilder maxApplications(@Nullable final Long maxApplications) {
        this.maxApplications = maxApplications;
        return this;
    }

    @Nullable
    public Long getMaxApplications() {
        return this.maxApplications;
    }

    public DiscountCodeSetMaxApplicationsAction build() {
        return new DiscountCodeSetMaxApplicationsActionImpl(maxApplications);
    }

    /**
     * builds DiscountCodeSetMaxApplicationsAction without checking for non null required values
     */
    public DiscountCodeSetMaxApplicationsAction buildUnchecked() {
        return new DiscountCodeSetMaxApplicationsActionImpl(maxApplications);
    }

    public static DiscountCodeSetMaxApplicationsActionBuilder of() {
        return new DiscountCodeSetMaxApplicationsActionBuilder();
    }

    public static DiscountCodeSetMaxApplicationsActionBuilder of(final DiscountCodeSetMaxApplicationsAction template) {
        DiscountCodeSetMaxApplicationsActionBuilder builder = new DiscountCodeSetMaxApplicationsActionBuilder();
        builder.maxApplications = template.getMaxApplications();
        return builder;
    }

}
