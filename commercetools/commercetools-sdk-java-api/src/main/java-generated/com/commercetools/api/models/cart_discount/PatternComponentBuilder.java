
package com.commercetools.api.models.cart_discount;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * PatternComponentBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PatternComponentBuilder {

    public com.commercetools.api.models.cart_discount.CountOnCustomLineItemUnitsBuilder countOnCustomLineItemUnitsBuilder() {
        return com.commercetools.api.models.cart_discount.CountOnCustomLineItemUnitsBuilder.of();
    }

    public com.commercetools.api.models.cart_discount.CountOnLineItemUnitsBuilder countOnLineItemUnitsBuilder() {
        return com.commercetools.api.models.cart_discount.CountOnLineItemUnitsBuilder.of();
    }

    /**
     * factory method for an instance of PatternComponentBuilder
     * @return builder
     */
    public static PatternComponentBuilder of() {
        return new PatternComponentBuilder();
    }

}
