
package com.commercetools.api.models.product_discount;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductDiscountValueRelativeBuilder implements Builder<ProductDiscountValueRelative> {

    private Long permyriad;

    public ProductDiscountValueRelativeBuilder permyriad(final Long permyriad) {
        this.permyriad = permyriad;
        return this;
    }

    public Long getPermyriad() {
        return this.permyriad;
    }

    public ProductDiscountValueRelative build() {
        Objects.requireNonNull(permyriad, ProductDiscountValueRelative.class + ": permyriad is missing");
        return new ProductDiscountValueRelativeImpl(permyriad);
    }

    /**
     * builds ProductDiscountValueRelative without checking for non null required values
     */
    public ProductDiscountValueRelative buildUnchecked() {
        return new ProductDiscountValueRelativeImpl(permyriad);
    }

    public static ProductDiscountValueRelativeBuilder of() {
        return new ProductDiscountValueRelativeBuilder();
    }

    public static ProductDiscountValueRelativeBuilder of(final ProductDiscountValueRelative template) {
        ProductDiscountValueRelativeBuilder builder = new ProductDiscountValueRelativeBuilder();
        builder.permyriad = template.getPermyriad();
        return builder;
    }

}
