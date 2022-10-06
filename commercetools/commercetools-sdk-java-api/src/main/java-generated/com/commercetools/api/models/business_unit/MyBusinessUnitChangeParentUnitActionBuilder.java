
package com.commercetools.api.models.business_unit;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyBusinessUnitChangeParentUnitActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyBusinessUnitChangeParentUnitAction myBusinessUnitChangeParentUnitAction = MyBusinessUnitChangeParentUnitAction.builder()
 *             .parentUnit(parentUnitBuilder -> parentUnitBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyBusinessUnitChangeParentUnitActionBuilder implements Builder<MyBusinessUnitChangeParentUnitAction> {

    private com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier parentUnit;

    /**
     *  <p>New parent unit of the Business Unit.</p>
     */

    public MyBusinessUnitChangeParentUnitActionBuilder parentUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder, com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder> builder) {
        this.parentUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>New parent unit of the Business Unit.</p>
     */

    public MyBusinessUnitChangeParentUnitActionBuilder parentUnit(
            final com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier parentUnit) {
        this.parentUnit = parentUnit;
        return this;
    }

    public com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier getParentUnit() {
        return this.parentUnit;
    }

    public MyBusinessUnitChangeParentUnitAction build() {
        Objects.requireNonNull(parentUnit, MyBusinessUnitChangeParentUnitAction.class + ": parentUnit is missing");
        return new MyBusinessUnitChangeParentUnitActionImpl(parentUnit);
    }

    /**
     * builds MyBusinessUnitChangeParentUnitAction without checking for non null required values
     */
    public MyBusinessUnitChangeParentUnitAction buildUnchecked() {
        return new MyBusinessUnitChangeParentUnitActionImpl(parentUnit);
    }

    public static MyBusinessUnitChangeParentUnitActionBuilder of() {
        return new MyBusinessUnitChangeParentUnitActionBuilder();
    }

    public static MyBusinessUnitChangeParentUnitActionBuilder of(final MyBusinessUnitChangeParentUnitAction template) {
        MyBusinessUnitChangeParentUnitActionBuilder builder = new MyBusinessUnitChangeParentUnitActionBuilder();
        builder.parentUnit = template.getParentUnit();
        return builder;
    }

}
