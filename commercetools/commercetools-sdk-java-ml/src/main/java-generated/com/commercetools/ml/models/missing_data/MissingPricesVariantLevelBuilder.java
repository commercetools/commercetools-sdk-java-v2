
package com.commercetools.ml.models.missing_data;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MissingPricesVariantLevelBuilder {

    private Long total;

    private Long missingPrices;

    public MissingPricesVariantLevelBuilder total(final Long total) {
        this.total = total;
        return this;
    }

    public MissingPricesVariantLevelBuilder missingPrices(final Long missingPrices) {
        this.missingPrices = missingPrices;
        return this;
    }

    public Long getTotal() {
        return this.total;
    }

    public Long getMissingPrices() {
        return this.missingPrices;
    }

    public MissingPricesVariantLevel build() {
        return new MissingPricesVariantLevelImpl(total, missingPrices);
    }

    public static MissingPricesVariantLevelBuilder of() {
        return new MissingPricesVariantLevelBuilder();
    }

    public static MissingPricesVariantLevelBuilder of(final MissingPricesVariantLevel template) {
        MissingPricesVariantLevelBuilder builder = new MissingPricesVariantLevelBuilder();
        builder.total = template.getTotal();
        builder.missingPrices = template.getMissingPrices();
        return builder;
    }

}
