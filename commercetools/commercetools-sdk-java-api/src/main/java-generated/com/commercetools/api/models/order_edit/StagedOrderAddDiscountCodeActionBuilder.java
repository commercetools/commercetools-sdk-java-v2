
package com.commercetools.api.models.order_edit;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderAddDiscountCodeActionBuilder {

    private String code;

    public StagedOrderAddDiscountCodeActionBuilder code(final String code) {
        this.code = code;
        return this;
    }

    public String getCode() {
        return this.code;
    }

    public StagedOrderAddDiscountCodeAction build() {
        return new StagedOrderAddDiscountCodeActionImpl(code);
    }

    public static StagedOrderAddDiscountCodeActionBuilder of() {
        return new StagedOrderAddDiscountCodeActionBuilder();
    }

    public static StagedOrderAddDiscountCodeActionBuilder of(final StagedOrderAddDiscountCodeAction template) {
        StagedOrderAddDiscountCodeActionBuilder builder = new StagedOrderAddDiscountCodeActionBuilder();
        builder.code = template.getCode();
        return builder;
    }

}
