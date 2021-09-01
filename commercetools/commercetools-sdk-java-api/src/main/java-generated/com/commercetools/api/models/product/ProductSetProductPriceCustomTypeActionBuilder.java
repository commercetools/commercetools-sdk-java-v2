
package com.commercetools.api.models.product;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ProductSetProductPriceCustomTypeActionBuilder
        implements Builder<ProductSetProductPriceCustomTypeAction> {

    private String priceId;

    @Nullable
    private Boolean staged;

    @Nullable
    private com.commercetools.api.models.type.TypeResourceIdentifier type;

    @Nullable
    private com.commercetools.api.models.type.FieldContainer fields;

    public ProductSetProductPriceCustomTypeActionBuilder priceId(final String priceId) {
        this.priceId = priceId;
        return this;
    }

    public ProductSetProductPriceCustomTypeActionBuilder staged(@Nullable final Boolean staged) {
        this.staged = staged;
        return this;
    }

    public ProductSetProductPriceCustomTypeActionBuilder type(
            Function<com.commercetools.api.models.type.TypeResourceIdentifierBuilder, com.commercetools.api.models.type.TypeResourceIdentifierBuilder> builder) {
        this.type = builder.apply(com.commercetools.api.models.type.TypeResourceIdentifierBuilder.of()).build();
        return this;
    }

    public ProductSetProductPriceCustomTypeActionBuilder type(
            @Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
        this.type = type;
        return this;
    }

    public ProductSetProductPriceCustomTypeActionBuilder fields(
            Function<com.commercetools.api.models.type.FieldContainerBuilder, com.commercetools.api.models.type.FieldContainerBuilder> builder) {
        this.fields = builder.apply(com.commercetools.api.models.type.FieldContainerBuilder.of()).build();
        return this;
    }

    public ProductSetProductPriceCustomTypeActionBuilder fields(
            @Nullable final com.commercetools.api.models.type.FieldContainer fields) {
        this.fields = fields;
        return this;
    }

    public String getPriceId() {
        return this.priceId;
    }

    @Nullable
    public Boolean getStaged() {
        return this.staged;
    }

    @Nullable
    public com.commercetools.api.models.type.TypeResourceIdentifier getType() {
        return this.type;
    }

    @Nullable
    public com.commercetools.api.models.type.FieldContainer getFields() {
        return this.fields;
    }

    public ProductSetProductPriceCustomTypeAction build() {
        Objects.requireNonNull(priceId, ProductSetProductPriceCustomTypeAction.class + ": priceId is missing");
        return new ProductSetProductPriceCustomTypeActionImpl(priceId, staged, type, fields);
    }

    /**
     * builds ProductSetProductPriceCustomTypeAction without checking for non null required values
     */
    public ProductSetProductPriceCustomTypeAction buildUnchecked() {
        return new ProductSetProductPriceCustomTypeActionImpl(priceId, staged, type, fields);
    }

    public static ProductSetProductPriceCustomTypeActionBuilder of() {
        return new ProductSetProductPriceCustomTypeActionBuilder();
    }

    public static ProductSetProductPriceCustomTypeActionBuilder of(
            final ProductSetProductPriceCustomTypeAction template) {
        ProductSetProductPriceCustomTypeActionBuilder builder = new ProductSetProductPriceCustomTypeActionBuilder();
        builder.priceId = template.getPriceId();
        builder.staged = template.getStaged();
        builder.type = template.getType();
        builder.fields = template.getFields();
        return builder;
    }

}
