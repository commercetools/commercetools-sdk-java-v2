
package com.commercetools.api.models.product_discount;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductDiscountValueRelativeDraftBuilder implements Builder<ProductDiscountValueRelativeDraft> {

    private Long permyriad;

    public ProductDiscountValueRelativeDraftBuilder permyriad(final Long permyriad) {
        this.permyriad = permyriad;
        return this;
    }

    public Long getPermyriad() {
        return this.permyriad;
    }

    public ProductDiscountValueRelativeDraft build() {
        Objects.requireNonNull(permyriad, ProductDiscountValueRelativeDraft.class + ": permyriad is missing");
        return new ProductDiscountValueRelativeDraftImpl(permyriad);
    }

    /**
     * builds ProductDiscountValueRelativeDraft without checking for non null required values
     */
    public ProductDiscountValueRelativeDraft buildUnchecked() {
        return new ProductDiscountValueRelativeDraftImpl(permyriad);
    }

    public static ProductDiscountValueRelativeDraftBuilder of() {
        return new ProductDiscountValueRelativeDraftBuilder();
    }

    public static ProductDiscountValueRelativeDraftBuilder of(final ProductDiscountValueRelativeDraft template) {
        ProductDiscountValueRelativeDraftBuilder builder = new ProductDiscountValueRelativeDraftBuilder();
        builder.permyriad = template.getPermyriad();
        return builder;
    }

}
