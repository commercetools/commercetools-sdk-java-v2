
package com.commercetools.api.models.me;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyCartAddDiscountCodeActionBuilder implements Builder<MyCartAddDiscountCodeAction> {

    private String code;

    public MyCartAddDiscountCodeActionBuilder code(final String code) {
        this.code = code;
        return this;
    }

    public String getCode() {
        return this.code;
    }

    public MyCartAddDiscountCodeAction build() {
        Objects.requireNonNull(code, MyCartAddDiscountCodeAction.class + ": code is missing");
        return new MyCartAddDiscountCodeActionImpl(code);
    }

    /**
     * builds MyCartAddDiscountCodeAction without checking for non null required values
     */
    public MyCartAddDiscountCodeAction buildUnchecked() {
        return new MyCartAddDiscountCodeActionImpl(code);
    }

    public static MyCartAddDiscountCodeActionBuilder of() {
        return new MyCartAddDiscountCodeActionBuilder();
    }

    public static MyCartAddDiscountCodeActionBuilder of(final MyCartAddDiscountCodeAction template) {
        MyCartAddDiscountCodeActionBuilder builder = new MyCartAddDiscountCodeActionBuilder();
        builder.code = template.getCode();
        return builder;
    }

}
