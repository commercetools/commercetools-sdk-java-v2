
package com.commercetools.ml.models.missing_data;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MissingPricesMetaBuilder {

    private com.commercetools.ml.models.missing_data.MissingPricesProductLevel productLevel;

    private com.commercetools.ml.models.missing_data.MissingPricesVariantLevel variantLevel;

    public MissingPricesMetaBuilder productLevel(
            final com.commercetools.ml.models.missing_data.MissingPricesProductLevel productLevel) {
        this.productLevel = productLevel;
        return this;
    }

    public MissingPricesMetaBuilder variantLevel(
            final com.commercetools.ml.models.missing_data.MissingPricesVariantLevel variantLevel) {
        this.variantLevel = variantLevel;
        return this;
    }

    public com.commercetools.ml.models.missing_data.MissingPricesProductLevel getProductLevel() {
        return this.productLevel;
    }

    public com.commercetools.ml.models.missing_data.MissingPricesVariantLevel getVariantLevel() {
        return this.variantLevel;
    }

    public MissingPricesMeta build() {
        return new MissingPricesMetaImpl(productLevel, variantLevel);
    }

    public static MissingPricesMetaBuilder of() {
        return new MissingPricesMetaBuilder();
    }

    public static MissingPricesMetaBuilder of(final MissingPricesMeta template) {
        MissingPricesMetaBuilder builder = new MissingPricesMetaBuilder();
        builder.productLevel = template.getProductLevel();
        builder.variantLevel = template.getVariantLevel();
        return builder;
    }

}
