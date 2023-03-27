
package com.commercetools.api.models.business_unit;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitChangeNameActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitChangeNameAction businessUnitChangeNameAction = BusinessUnitChangeNameAction.builder()
 *             .name("{name}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitChangeNameActionBuilder implements Builder<BusinessUnitChangeNameAction> {

    private String name;

    /**
     *  <p>New name to set.</p>
     * @param name value to be set
     * @return Builder
     */

    public BusinessUnitChangeNameActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    /**
     *  <p>New name to set.</p>
     * @return name
     */

    public String getName() {
        return this.name;
    }

    /**
     * builds BusinessUnitChangeNameAction with checking for non-null required values
     * @return BusinessUnitChangeNameAction
     */
    public BusinessUnitChangeNameAction build() {
        Objects.requireNonNull(name, BusinessUnitChangeNameAction.class + ": name is missing");
        return new BusinessUnitChangeNameActionImpl(name);
    }

    /**
     * builds BusinessUnitChangeNameAction without checking for non-null required values
     * @return BusinessUnitChangeNameAction
     */
    public BusinessUnitChangeNameAction buildUnchecked() {
        return new BusinessUnitChangeNameActionImpl(name);
    }

    /**
     * factory method for an instance of BusinessUnitChangeNameActionBuilder
     * @return builder
     */
    public static BusinessUnitChangeNameActionBuilder of() {
        return new BusinessUnitChangeNameActionBuilder();
    }

    /**
     * create builder for BusinessUnitChangeNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitChangeNameActionBuilder of(final BusinessUnitChangeNameAction template) {
        BusinessUnitChangeNameActionBuilder builder = new BusinessUnitChangeNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
