
package com.commercetools.api.models.product_discount;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductDiscountValueAbsoluteDraftBuilder implements Builder<ProductDiscountValueAbsoluteDraft> {

    private java.util.List<com.commercetools.api.models.common.Money> money;

    public ProductDiscountValueAbsoluteDraftBuilder money(final com.commercetools.api.models.common.Money... money) {
        this.money = new ArrayList<>(Arrays.asList(money));
        return this;
    }

    public ProductDiscountValueAbsoluteDraftBuilder money(
            final java.util.List<com.commercetools.api.models.common.Money> money) {
        this.money = money;
        return this;
    }

    public java.util.List<com.commercetools.api.models.common.Money> getMoney() {
        return this.money;
    }

    public ProductDiscountValueAbsoluteDraft build() {
        Objects.requireNonNull(money, ProductDiscountValueAbsoluteDraft.class + ": money is missing");
        return new ProductDiscountValueAbsoluteDraftImpl(money);
    }

    /**
     * builds ProductDiscountValueAbsoluteDraft without checking for non null required values
     */
    public ProductDiscountValueAbsoluteDraft buildUnchecked() {
        return new ProductDiscountValueAbsoluteDraftImpl(money);
    }

    public static ProductDiscountValueAbsoluteDraftBuilder of() {
        return new ProductDiscountValueAbsoluteDraftBuilder();
    }

    public static ProductDiscountValueAbsoluteDraftBuilder of(final ProductDiscountValueAbsoluteDraft template) {
        ProductDiscountValueAbsoluteDraftBuilder builder = new ProductDiscountValueAbsoluteDraftBuilder();
        builder.money = template.getMoney();
        return builder;
    }

}
