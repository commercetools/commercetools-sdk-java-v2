
package com.commercetools.history.models.change;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AddDiscountCodeChangeBuilder {

    private String change;

    private com.commercetools.history.models.common.DiscountCodeInfo nextValue;

    public AddDiscountCodeChangeBuilder change(final String change) {
        this.change = change;
        return this;
    }

    public AddDiscountCodeChangeBuilder nextValue(
            final com.commercetools.history.models.common.DiscountCodeInfo nextValue) {
        this.nextValue = nextValue;
        return this;
    }

    public String getChange() {
        return this.change;
    }

    public com.commercetools.history.models.common.DiscountCodeInfo getNextValue() {
        return this.nextValue;
    }

    public AddDiscountCodeChange build() {
        return new AddDiscountCodeChangeImpl(change, nextValue);
    }

    public static AddDiscountCodeChangeBuilder of() {
        return new AddDiscountCodeChangeBuilder();
    }

    public static AddDiscountCodeChangeBuilder of(final AddDiscountCodeChange template) {
        AddDiscountCodeChangeBuilder builder = new AddDiscountCodeChangeBuilder();
        builder.change = template.getChange();
        builder.nextValue = template.getNextValue();
        return builder;
    }

}
