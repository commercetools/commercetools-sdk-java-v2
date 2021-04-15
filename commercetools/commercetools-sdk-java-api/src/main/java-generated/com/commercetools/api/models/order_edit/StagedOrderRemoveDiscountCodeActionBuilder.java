
package com.commercetools.api.models.order_edit;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderRemoveDiscountCodeActionBuilder {

    private com.commercetools.api.models.discount_code.DiscountCodeReference discountCode;

    public StagedOrderRemoveDiscountCodeActionBuilder discountCode(
            final com.commercetools.api.models.discount_code.DiscountCodeReference discountCode) {
        this.discountCode = discountCode;
        return this;
    }

    public com.commercetools.api.models.discount_code.DiscountCodeReference getDiscountCode() {
        return this.discountCode;
    }

    public StagedOrderRemoveDiscountCodeAction build() {
        return new StagedOrderRemoveDiscountCodeActionImpl(discountCode);
    }

    public static StagedOrderRemoveDiscountCodeActionBuilder of() {
        return new StagedOrderRemoveDiscountCodeActionBuilder();
    }

    public static StagedOrderRemoveDiscountCodeActionBuilder of(final StagedOrderRemoveDiscountCodeAction template) {
        StagedOrderRemoveDiscountCodeActionBuilder builder = new StagedOrderRemoveDiscountCodeActionBuilder();
        builder.discountCode = template.getDiscountCode();
        return builder;
    }

}
