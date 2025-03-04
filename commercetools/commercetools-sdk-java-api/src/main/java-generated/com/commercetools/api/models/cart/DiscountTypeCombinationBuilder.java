
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountTypeCombinationBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountTypeCombinationBuilder {

    public com.commercetools.api.models.cart.BestDealBuilder bestDealBuilder() {
        return com.commercetools.api.models.cart.BestDealBuilder.of();
    }

    public com.commercetools.api.models.cart.StackingBuilder stackingBuilder() {
        return com.commercetools.api.models.cart.StackingBuilder.of();
    }

    /**
     * factory method for an instance of DiscountTypeCombinationBuilder
     * @return builder
     */
    public static DiscountTypeCombinationBuilder of() {
        return new DiscountTypeCombinationBuilder();
    }

}
