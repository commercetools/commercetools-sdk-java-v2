
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderRemoveDiscountCodeActionBuilder implements Builder<StagedOrderRemoveDiscountCodeAction> {

    private com.commercetools.api.models.discount_code.DiscountCodeReference discountCode;

    public StagedOrderRemoveDiscountCodeActionBuilder discountCode(
            Function<com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder, com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder> builder) {
        this.discountCode = builder.apply(com.commercetools.api.models.discount_code.DiscountCodeReferenceBuilder.of())
                .build();
        return this;
    }

    public StagedOrderRemoveDiscountCodeActionBuilder discountCode(
            final com.commercetools.api.models.discount_code.DiscountCodeReference discountCode) {
        this.discountCode = discountCode;
        return this;
    }

    public com.commercetools.api.models.discount_code.DiscountCodeReference getDiscountCode() {
        return this.discountCode;
    }

    public StagedOrderRemoveDiscountCodeAction build() {
        Objects.requireNonNull(discountCode, StagedOrderRemoveDiscountCodeAction.class + ": discountCode is missing");
        return new StagedOrderRemoveDiscountCodeActionImpl(discountCode);
    }

    /**
     * builds StagedOrderRemoveDiscountCodeAction without checking for non null required values
     */
    public StagedOrderRemoveDiscountCodeAction buildUnchecked() {
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
