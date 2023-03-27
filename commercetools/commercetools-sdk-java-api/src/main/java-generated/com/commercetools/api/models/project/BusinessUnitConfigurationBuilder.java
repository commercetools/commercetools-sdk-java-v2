
package com.commercetools.api.models.project;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitConfigurationBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitConfiguration businessUnitConfiguration = BusinessUnitConfiguration.builder()
 *             .myBusinessUnitStatusOnCreation(BusinessUnitConfigurationStatus.ACTIVE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitConfigurationBuilder implements Builder<BusinessUnitConfiguration> {

    private com.commercetools.api.models.project.BusinessUnitConfigurationStatus myBusinessUnitStatusOnCreation;

    /**
     *  <p>Status of Business Units created using the My Business Unit endpoint.</p>
     * @param myBusinessUnitStatusOnCreation value to be set
     * @return Builder
     */

    public BusinessUnitConfigurationBuilder myBusinessUnitStatusOnCreation(
            final com.commercetools.api.models.project.BusinessUnitConfigurationStatus myBusinessUnitStatusOnCreation) {
        this.myBusinessUnitStatusOnCreation = myBusinessUnitStatusOnCreation;
        return this;
    }

    /**
     *  <p>Status of Business Units created using the My Business Unit endpoint.</p>
     * @return myBusinessUnitStatusOnCreation
     */

    public com.commercetools.api.models.project.BusinessUnitConfigurationStatus getMyBusinessUnitStatusOnCreation() {
        return this.myBusinessUnitStatusOnCreation;
    }

    /**
     * builds BusinessUnitConfiguration with checking for non-null required values
     * @return BusinessUnitConfiguration
     */
    public BusinessUnitConfiguration build() {
        Objects.requireNonNull(myBusinessUnitStatusOnCreation,
            BusinessUnitConfiguration.class + ": myBusinessUnitStatusOnCreation is missing");
        return new BusinessUnitConfigurationImpl(myBusinessUnitStatusOnCreation);
    }

    /**
     * builds BusinessUnitConfiguration without checking for non-null required values
     * @return BusinessUnitConfiguration
     */
    public BusinessUnitConfiguration buildUnchecked() {
        return new BusinessUnitConfigurationImpl(myBusinessUnitStatusOnCreation);
    }

    /**
     * factory method for an instance of BusinessUnitConfigurationBuilder
     * @return builder
     */
    public static BusinessUnitConfigurationBuilder of() {
        return new BusinessUnitConfigurationBuilder();
    }

    /**
     * create builder for BusinessUnitConfiguration instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitConfigurationBuilder of(final BusinessUnitConfiguration template) {
        BusinessUnitConfigurationBuilder builder = new BusinessUnitConfigurationBuilder();
        builder.myBusinessUnitStatusOnCreation = template.getMyBusinessUnitStatusOnCreation();
        return builder;
    }

}
