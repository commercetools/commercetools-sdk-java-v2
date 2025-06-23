
package com.commercetools.api.models.discount_group;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountGroupUpdateActionBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountGroupUpdateActionBuilder {

    public com.commercetools.api.models.discount_group.DiscountGroupSetDescriptionActionBuilder setDescriptionBuilder() {
        return com.commercetools.api.models.discount_group.DiscountGroupSetDescriptionActionBuilder.of();
    }

    public com.commercetools.api.models.discount_group.DiscountGroupSetKeyActionBuilder setKeyBuilder() {
        return com.commercetools.api.models.discount_group.DiscountGroupSetKeyActionBuilder.of();
    }

    public com.commercetools.api.models.discount_group.DiscountGroupSetNameActionBuilder setNameBuilder() {
        return com.commercetools.api.models.discount_group.DiscountGroupSetNameActionBuilder.of();
    }

    public com.commercetools.api.models.discount_group.DiscountGroupSetSortOrderActionBuilder setSortOrderBuilder() {
        return com.commercetools.api.models.discount_group.DiscountGroupSetSortOrderActionBuilder.of();
    }

    /**
     * factory method for an instance of DiscountGroupUpdateActionBuilder
     * @return builder
     */
    public static DiscountGroupUpdateActionBuilder of() {
        return new DiscountGroupUpdateActionBuilder();
    }

}
