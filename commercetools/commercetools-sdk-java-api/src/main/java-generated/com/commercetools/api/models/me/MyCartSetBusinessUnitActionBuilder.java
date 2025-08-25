
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
     *  <p>New Business Unit to assign to the Cart, which must have access to the <span>Store</span> that is set on the Cart. Additionally, the authenticated user must be an <span>Associate</span> in the <span>Business Unit</span>.</p>
     * @param builder function to build the businessUnit value
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
     *  <p>New Business Unit to assign to the Cart, which must have access to the <span>Store</span> that is set on the Cart. Additionally, the authenticated user must be an <span>Associate</span> in the <span>Business Unit</span>.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */

    public MyCartSetBusinessUnitActionBuilder withBusinessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder, com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier> builder) {
        this.businessUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>New Business Unit to assign to the Cart, which must have access to the <span>Store</span> that is set on the Cart. Additionally, the authenticated user must be an <span>Associate</span> in the <span>Business Unit</span>.</p>
     * @param businessUnit value to be set
     * @return Builder
     */

    public MyCartSetBusinessUnitActionBuilder businessUnit(
            final com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit) {
        this.businessUnit = businessUnit;
        return this;
    }

    /**
     *  <p>New Business Unit to assign to the Cart, which must have access to the <span>Store</span> that is set on the Cart. Additionally, the authenticated user must be an <span>Associate</span> in the <span>Business Unit</span>.</p>
     * @return businessUnit
     */

    public com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier getBusinessUnit() {
        return this.businessUnit;
    }

    /**
     * builds MyCartSetBusinessUnitAction with checking for non-null required values
     * @return MyCartSetBusinessUnitAction
     */
    public MyCartSetBusinessUnitAction build() {
        Objects.requireNonNull(businessUnit, MyCartSetBusinessUnitAction.class + ": businessUnit is missing");
        return new MyCartSetBusinessUnitActionImpl(businessUnit);
    }

    /**
     * builds MyCartSetBusinessUnitAction without checking for non-null required values
     * @return MyCartSetBusinessUnitAction
     */
    public MyCartSetBusinessUnitAction buildUnchecked() {
        return new MyCartSetBusinessUnitActionImpl(businessUnit);
    }

    /**
     * factory method for an instance of MyCartSetBusinessUnitActionBuilder
     * @return builder
     */
    public static MyCartSetBusinessUnitActionBuilder of() {
        return new MyCartSetBusinessUnitActionBuilder();
    }

    /**
     * create builder for MyCartSetBusinessUnitAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartSetBusinessUnitActionBuilder of(final MyCartSetBusinessUnitAction template) {
        MyCartSetBusinessUnitActionBuilder builder = new MyCartSetBusinessUnitActionBuilder();
        builder.businessUnit = template.getBusinessUnit();
        return builder;
    }

}
