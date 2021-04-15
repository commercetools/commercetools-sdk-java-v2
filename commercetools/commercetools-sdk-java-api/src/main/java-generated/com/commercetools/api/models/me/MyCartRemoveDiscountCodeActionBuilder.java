
package com.commercetools.api.models.me;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyCartRemoveDiscountCodeActionBuilder {

    private com.commercetools.api.models.discount_code.DiscountCodeReference discountCode;

    public MyCartRemoveDiscountCodeActionBuilder discountCode(
            final com.commercetools.api.models.discount_code.DiscountCodeReference discountCode) {
        this.discountCode = discountCode;
        return this;
    }

    public com.commercetools.api.models.discount_code.DiscountCodeReference getDiscountCode() {
        return this.discountCode;
    }

    public MyCartRemoveDiscountCodeAction build() {
        return new MyCartRemoveDiscountCodeActionImpl(discountCode);
    }

    public static MyCartRemoveDiscountCodeActionBuilder of() {
        return new MyCartRemoveDiscountCodeActionBuilder();
    }

    public static MyCartRemoveDiscountCodeActionBuilder of(final MyCartRemoveDiscountCodeAction template) {
        MyCartRemoveDiscountCodeActionBuilder builder = new MyCartRemoveDiscountCodeActionBuilder();
        builder.discountCode = template.getDiscountCode();
        return builder;
    }

}
