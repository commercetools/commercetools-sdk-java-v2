
package com.commercetools.api.models.business_unit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitSetContactEmailActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitSetContactEmailAction businessUnitSetContactEmailAction = BusinessUnitSetContactEmailAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitSetContactEmailActionBuilder implements Builder<BusinessUnitSetContactEmailAction> {

    @Nullable
    private String contactEmail;

    /**
     *  <p>Email to set. If <code>contactEmail</code> is absent or <code>null</code>, the existing contact email, if any, will be removed.</p>
     * @param contactEmail value to be set
     * @return Builder
     */

    public BusinessUnitSetContactEmailActionBuilder contactEmail(@Nullable final String contactEmail) {
        this.contactEmail = contactEmail;
        return this;
    }

    @Nullable
    public String getContactEmail() {
        return this.contactEmail;
    }

    /**
     * builds BusinessUnitSetContactEmailAction with checking for non-null required values
     * @return BusinessUnitSetContactEmailAction
     */
    public BusinessUnitSetContactEmailAction build() {
        return new BusinessUnitSetContactEmailActionImpl(contactEmail);
    }

    /**
     * builds BusinessUnitSetContactEmailAction without checking for non-null required values
     * @return BusinessUnitSetContactEmailAction
     */
    public BusinessUnitSetContactEmailAction buildUnchecked() {
        return new BusinessUnitSetContactEmailActionImpl(contactEmail);
    }

    public static BusinessUnitSetContactEmailActionBuilder of() {
        return new BusinessUnitSetContactEmailActionBuilder();
    }

    public static BusinessUnitSetContactEmailActionBuilder of(final BusinessUnitSetContactEmailAction template) {
        BusinessUnitSetContactEmailActionBuilder builder = new BusinessUnitSetContactEmailActionBuilder();
        builder.contactEmail = template.getContactEmail();
        return builder;
    }

}
