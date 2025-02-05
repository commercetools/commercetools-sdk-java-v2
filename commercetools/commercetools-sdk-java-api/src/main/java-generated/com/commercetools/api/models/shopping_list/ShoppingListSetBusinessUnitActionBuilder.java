
package com.commercetools.api.models.shopping_list;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListSetBusinessUnitActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListSetBusinessUnitAction shoppingListSetBusinessUnitAction = ShoppingListSetBusinessUnitAction.builder()
 *             .businessUnit(businessUnitBuilder -> businessUnitBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShoppingListSetBusinessUnitActionBuilder implements Builder<ShoppingListSetBusinessUnitAction> {

    private com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit;

    /**
     *  <p>The Business Unit to assign to the Shopping List, which must have access to the Store that is set on the Shopping List.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */

    public ShoppingListSetBusinessUnitActionBuilder businessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder, com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder> builder) {
        this.businessUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>The Business Unit to assign to the Shopping List, which must have access to the Store that is set on the Shopping List.</p>
     * @param builder function to build the businessUnit value
     * @return Builder
     */

    public ShoppingListSetBusinessUnitActionBuilder withBusinessUnit(
            Function<com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder, com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier> builder) {
        this.businessUnit = builder
                .apply(com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>The Business Unit to assign to the Shopping List, which must have access to the Store that is set on the Shopping List.</p>
     * @param businessUnit value to be set
     * @return Builder
     */

    public ShoppingListSetBusinessUnitActionBuilder businessUnit(
            final com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier businessUnit) {
        this.businessUnit = businessUnit;
        return this;
    }

    /**
     *  <p>The Business Unit to assign to the Shopping List, which must have access to the Store that is set on the Shopping List.</p>
     * @return businessUnit
     */

    public com.commercetools.api.models.business_unit.BusinessUnitResourceIdentifier getBusinessUnit() {
        return this.businessUnit;
    }

    /**
     * builds ShoppingListSetBusinessUnitAction with checking for non-null required values
     * @return ShoppingListSetBusinessUnitAction
     */
    public ShoppingListSetBusinessUnitAction build() {
        Objects.requireNonNull(businessUnit, ShoppingListSetBusinessUnitAction.class + ": businessUnit is missing");
        return new ShoppingListSetBusinessUnitActionImpl(businessUnit);
    }

    /**
     * builds ShoppingListSetBusinessUnitAction without checking for non-null required values
     * @return ShoppingListSetBusinessUnitAction
     */
    public ShoppingListSetBusinessUnitAction buildUnchecked() {
        return new ShoppingListSetBusinessUnitActionImpl(businessUnit);
    }

    /**
     * factory method for an instance of ShoppingListSetBusinessUnitActionBuilder
     * @return builder
     */
    public static ShoppingListSetBusinessUnitActionBuilder of() {
        return new ShoppingListSetBusinessUnitActionBuilder();
    }

    /**
     * create builder for ShoppingListSetBusinessUnitAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListSetBusinessUnitActionBuilder of(final ShoppingListSetBusinessUnitAction template) {
        ShoppingListSetBusinessUnitActionBuilder builder = new ShoppingListSetBusinessUnitActionBuilder();
        builder.businessUnit = template.getBusinessUnit();
        return builder;
    }

}
