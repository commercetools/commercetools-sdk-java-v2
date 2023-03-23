
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCartSetBusinessUnitActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartSetBusinessUnitAction myCartSetBusinessUnitAction = MyCartSetBusinessUnitAction.builder()
 *             .businessUnit(businessUnitBuilder -> businessUnitBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCartSetBusinessUnitActionBuilder implements Builder<MyCartSetBusinessUnitAction> {

    private com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit;

    /**
     *  <p>New Business Unit to assign to the Cart, which must have access to the Store that is set on the Cart. Additionally, the authenticated user must have Buyer access to the Business Unit.</p>
     * @return Builder
     */

    public MyCartSetBusinessUnitActionBuilder businessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder, com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder> builder) {
        this.businessUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>New Business Unit to assign to the Cart, which must have access to the Store that is set on the Cart. Additionally, the authenticated user must have Buyer access to the Business Unit.</p>
     * @param businessUnit
     * @return Builder
     */

    public MyCartSetBusinessUnitActionBuilder businessUnit(
            final com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit) {
        this.businessUnit = businessUnit;
        return this;
    }

    public com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier getBusinessUnit() {
        return this.businessUnit;
    }

    public MyCartSetBusinessUnitAction build() {
        Objects.requireNonNull(businessUnit, MyCartSetBusinessUnitAction.class + ": businessUnit is missing");
        return new MyCartSetBusinessUnitActionImpl(businessUnit);
    }

    /**
     * builds MyCartSetBusinessUnitAction without checking for non null required values
     */
    public MyCartSetBusinessUnitAction buildUnchecked() {
        return new MyCartSetBusinessUnitActionImpl(businessUnit);
    }

    public static MyCartSetBusinessUnitActionBuilder of() {
        return new MyCartSetBusinessUnitActionBuilder();
    }

    public static MyCartSetBusinessUnitActionBuilder of(final MyCartSetBusinessUnitAction template) {
        MyCartSetBusinessUnitActionBuilder builder = new MyCartSetBusinessUnitActionBuilder();
        builder.businessUnit = template.getBusinessUnit();
        return builder;
    }

}
