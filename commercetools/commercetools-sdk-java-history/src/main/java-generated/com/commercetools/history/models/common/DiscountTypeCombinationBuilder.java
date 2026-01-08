
package com.commercetools.history.models.common;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountTypeCombinationBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountTypeCombinationBuilder {

    public com.commercetools.history.models.common.BestDealBuilder bestDealBuilder() {
        return com.commercetools.history.models.common.BestDealBuilder.of();
    }

    public com.commercetools.history.models.common.StackingBuilder stackingBuilder() {
        return com.commercetools.history.models.common.StackingBuilder.of();
    }

    /**
     * factory method for an instance of DiscountTypeCombinationBuilder
     * @return builder
     */
    public static DiscountTypeCombinationBuilder of() {
        return new DiscountTypeCombinationBuilder();
    }

}
