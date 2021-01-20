
package com.commercetools.ml.models.missing_data;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.ml.models.common.ProductReference;
import com.commercetools.ml.models.missing_data.MissingPrices;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MissingPricesBuilder {

    private com.commercetools.ml.models.common.ProductReference product;

    private Long variantId;

    public MissingPricesBuilder product(final com.commercetools.ml.models.common.ProductReference product) {
        this.product = product;
        return this;
    }

    public MissingPricesBuilder variantId(final Long variantId) {
        this.variantId = variantId;
        return this;
    }

    public com.commercetools.ml.models.common.ProductReference getProduct() {
        return this.product;
    }

    public Long getVariantId() {
        return this.variantId;
    }

    public MissingPrices build() {
        return new MissingPricesImpl(product, variantId);
    }

    public static MissingPricesBuilder of() {
        return new MissingPricesBuilder();
    }

    public static MissingPricesBuilder of(final MissingPrices template) {
        MissingPricesBuilder builder = new MissingPricesBuilder();
        builder.product = template.getProduct();
        builder.variantId = template.getVariantId();
        return builder;
    }

}
