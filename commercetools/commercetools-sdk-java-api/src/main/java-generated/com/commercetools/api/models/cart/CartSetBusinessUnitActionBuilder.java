
package com.commercetools.api.models.cart;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetBusinessUnitActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetBusinessUnitAction cartSetBusinessUnitAction = CartSetBusinessUnitAction.builder()
 *             .businessUnit(businessUnitBuilder -> businessUnitBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetBusinessUnitActionBuilder implements Builder<CartSetBusinessUnitAction> {

    private com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit;

    /**
     *  <p>New Business Unit to assign to the Cart, which must have access to the Store that is set on the Cart.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */

    public CartSetBusinessUnitActionBuilder businessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder, com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder> builder) {
        this.businessUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>New Business Unit to assign to the Cart, which must have access to the Store that is set on the Cart.</p>
     * @param businessUnit value to be set
     * @return Builder
     */

    public CartSetBusinessUnitActionBuilder businessUnit(
            final com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit) {
        this.businessUnit = businessUnit;
        return this;
    }

    /**
     *  <p>New Business Unit to assign to the Cart, which must have access to the Store that is set on the Cart.</p>
     * @return businessUnit
     */

    public com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier getBusinessUnit() {
        return this.businessUnit;
    }

    /**
     * builds CartSetBusinessUnitAction with checking for non-null required values
     * @return CartSetBusinessUnitAction
     */
    public CartSetBusinessUnitAction build() {
        Objects.requireNonNull(businessUnit, CartSetBusinessUnitAction.class + ": businessUnit is missing");
        return new CartSetBusinessUnitActionImpl(businessUnit);
    }

    /**
     * builds CartSetBusinessUnitAction without checking for non-null required values
     * @return CartSetBusinessUnitAction
     */
    public CartSetBusinessUnitAction buildUnchecked() {
        return new CartSetBusinessUnitActionImpl(businessUnit);
    }

    /**
     * factory method for an instance of CartSetBusinessUnitActionBuilder
     * @return builder
     */
    public static CartSetBusinessUnitActionBuilder of() {
        return new CartSetBusinessUnitActionBuilder();
    }

    /**
     * create builder for CartSetBusinessUnitAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetBusinessUnitActionBuilder of(final CartSetBusinessUnitAction template) {
        CartSetBusinessUnitActionBuilder builder = new CartSetBusinessUnitActionBuilder();
        builder.businessUnit = template.getBusinessUnit();
        return builder;
    }

}
