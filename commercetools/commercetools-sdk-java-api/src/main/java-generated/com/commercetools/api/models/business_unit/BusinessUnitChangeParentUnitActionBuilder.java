
package com.commercetools.api.models.business_unit;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitChangeParentUnitActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitChangeParentUnitAction businessUnitChangeParentUnitAction = BusinessUnitChangeParentUnitAction.builder()
 *             .parentUnit(parentUnitBuilder -> parentUnitBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitChangeParentUnitActionBuilder implements Builder<BusinessUnitChangeParentUnitAction> {

    private com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier parentUnit;

    /**
     *  <p>New parent unit of the Business Unit.</p>
     * @return Builder
     */

    public BusinessUnitChangeParentUnitActionBuilder parentUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder, com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder> builder) {
        this.parentUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>New parent unit of the Business Unit.</p>
     * @param parentUnit
     * @return Builder
     */

    public BusinessUnitChangeParentUnitActionBuilder parentUnit(
            final com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier parentUnit) {
        this.parentUnit = parentUnit;
        return this;
    }

    public com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier getParentUnit() {
        return this.parentUnit;
    }

    public BusinessUnitChangeParentUnitAction build() {
        Objects.requireNonNull(parentUnit, BusinessUnitChangeParentUnitAction.class + ": parentUnit is missing");
        return new BusinessUnitChangeParentUnitActionImpl(parentUnit);
    }

    /**
     * builds BusinessUnitChangeParentUnitAction without checking for non null required values
     */
    public BusinessUnitChangeParentUnitAction buildUnchecked() {
        return new BusinessUnitChangeParentUnitActionImpl(parentUnit);
    }

    public static BusinessUnitChangeParentUnitActionBuilder of() {
        return new BusinessUnitChangeParentUnitActionBuilder();
    }

    public static BusinessUnitChangeParentUnitActionBuilder of(final BusinessUnitChangeParentUnitAction template) {
        BusinessUnitChangeParentUnitActionBuilder builder = new BusinessUnitChangeParentUnitActionBuilder();
        builder.parentUnit = template.getParentUnit();
        return builder;
    }

}
