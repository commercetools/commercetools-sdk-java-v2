
package com.commercetools.ml.models.missing_data;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MissingPricesProductCountBuilder implements Builder<MissingPricesProductCount> {

    private Long total;

    private Long missingPrices;

    public MissingPricesProductCountBuilder total(final Long total) {
        this.total = total;
        return this;
    }

    public MissingPricesProductCountBuilder missingPrices(final Long missingPrices) {
        this.missingPrices = missingPrices;
        return this;
    }

    public Long getTotal() {
        return this.total;
    }

    public Long getMissingPrices() {
        return this.missingPrices;
    }

    public MissingPricesProductCount build() {
        Objects.requireNonNull(total, MissingPricesProductCount.class + ": total is missing");
        Objects.requireNonNull(missingPrices, MissingPricesProductCount.class + ": missingPrices is missing");
        return new MissingPricesProductCountImpl(total, missingPrices);
    }

    /**
     * builds MissingPricesProductCount without checking for non null required values
     */
    public MissingPricesProductCount buildUnchecked() {
        return new MissingPricesProductCountImpl(total, missingPrices);
    }

    public static MissingPricesProductCountBuilder of() {
        return new MissingPricesProductCountBuilder();
    }

    public static MissingPricesProductCountBuilder of(final MissingPricesProductCount template) {
        MissingPricesProductCountBuilder builder = new MissingPricesProductCountBuilder();
        builder.total = template.getTotal();
        builder.missingPrices = template.getMissingPrices();
        return builder;
    }

}
