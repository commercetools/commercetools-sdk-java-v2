
package com.commercetools.ml.models.missing_data;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MissingAttributesBuilder implements Builder<MissingAttributes> {

    private com.commercetools.ml.models.common.ProductReference product;

    private com.commercetools.ml.models.common.ProductTypeReference productType;

    private Integer variantId;

    private java.util.List<String> missingAttributeValues;

    @Nullable
    private java.util.List<String> missingAttributeNames;

    @Nullable
    private com.commercetools.ml.models.missing_data.AttributeCount attributeCount;

    @Nullable
    private com.commercetools.ml.models.missing_data.AttributeCoverage attributeCoverage;

    public MissingAttributesBuilder product(
            Function<com.commercetools.ml.models.common.ProductReferenceBuilder, com.commercetools.ml.models.common.ProductReferenceBuilder> builder) {
        this.product = builder.apply(com.commercetools.ml.models.common.ProductReferenceBuilder.of()).build();
        return this;
    }

    public MissingAttributesBuilder product(final com.commercetools.ml.models.common.ProductReference product) {
        this.product = product;
        return this;
    }

    public MissingAttributesBuilder productType(
            Function<com.commercetools.ml.models.common.ProductTypeReferenceBuilder, com.commercetools.ml.models.common.ProductTypeReferenceBuilder> builder) {
        this.productType = builder.apply(com.commercetools.ml.models.common.ProductTypeReferenceBuilder.of()).build();
        return this;
    }

    public MissingAttributesBuilder productType(
            final com.commercetools.ml.models.common.ProductTypeReference productType) {
        this.productType = productType;
        return this;
    }

    public MissingAttributesBuilder variantId(final Integer variantId) {
        this.variantId = variantId;
        return this;
    }

    public MissingAttributesBuilder missingAttributeValues(final String... missingAttributeValues) {
        this.missingAttributeValues = new ArrayList<>(Arrays.asList(missingAttributeValues));
        return this;
    }

    public MissingAttributesBuilder missingAttributeValues(final java.util.List<String> missingAttributeValues) {
        this.missingAttributeValues = missingAttributeValues;
        return this;
    }

    public MissingAttributesBuilder missingAttributeNames(@Nullable final String... missingAttributeNames) {
        this.missingAttributeNames = new ArrayList<>(Arrays.asList(missingAttributeNames));
        return this;
    }

    public MissingAttributesBuilder missingAttributeNames(
            @Nullable final java.util.List<String> missingAttributeNames) {
        this.missingAttributeNames = missingAttributeNames;
        return this;
    }

    public MissingAttributesBuilder attributeCount(
            Function<com.commercetools.ml.models.missing_data.AttributeCountBuilder, com.commercetools.ml.models.missing_data.AttributeCountBuilder> builder) {
        this.attributeCount = builder.apply(com.commercetools.ml.models.missing_data.AttributeCountBuilder.of())
                .build();
        return this;
    }

    public MissingAttributesBuilder attributeCount(
            @Nullable final com.commercetools.ml.models.missing_data.AttributeCount attributeCount) {
        this.attributeCount = attributeCount;
        return this;
    }

    public MissingAttributesBuilder attributeCoverage(
            Function<com.commercetools.ml.models.missing_data.AttributeCoverageBuilder, com.commercetools.ml.models.missing_data.AttributeCoverageBuilder> builder) {
        this.attributeCoverage = builder.apply(com.commercetools.ml.models.missing_data.AttributeCoverageBuilder.of())
                .build();
        return this;
    }

    public MissingAttributesBuilder attributeCoverage(
            @Nullable final com.commercetools.ml.models.missing_data.AttributeCoverage attributeCoverage) {
        this.attributeCoverage = attributeCoverage;
        return this;
    }

    public com.commercetools.ml.models.common.ProductReference getProduct() {
        return this.product;
    }

    public com.commercetools.ml.models.common.ProductTypeReference getProductType() {
        return this.productType;
    }

    public Integer getVariantId() {
        return this.variantId;
    }

    public java.util.List<String> getMissingAttributeValues() {
        return this.missingAttributeValues;
    }

    @Nullable
    public java.util.List<String> getMissingAttributeNames() {
        return this.missingAttributeNames;
    }

    @Nullable
    public com.commercetools.ml.models.missing_data.AttributeCount getAttributeCount() {
        return this.attributeCount;
    }

    @Nullable
    public com.commercetools.ml.models.missing_data.AttributeCoverage getAttributeCoverage() {
        return this.attributeCoverage;
    }

    public MissingAttributes build() {
        Objects.requireNonNull(product, MissingAttributes.class + ": product is missing");
        Objects.requireNonNull(productType, MissingAttributes.class + ": productType is missing");
        Objects.requireNonNull(variantId, MissingAttributes.class + ": variantId is missing");
        Objects.requireNonNull(missingAttributeValues, MissingAttributes.class + ": missingAttributeValues is missing");
        return new MissingAttributesImpl(product, productType, variantId, missingAttributeValues, missingAttributeNames,
            attributeCount, attributeCoverage);
    }

    /**
     * builds MissingAttributes without checking for non null required values
     */
    public MissingAttributes buildUnchecked() {
        return new MissingAttributesImpl(product, productType, variantId, missingAttributeValues, missingAttributeNames,
            attributeCount, attributeCoverage);
    }

    public static MissingAttributesBuilder of() {
        return new MissingAttributesBuilder();
    }

    public static MissingAttributesBuilder of(final MissingAttributes template) {
        MissingAttributesBuilder builder = new MissingAttributesBuilder();
        builder.product = template.getProduct();
        builder.productType = template.getProductType();
        builder.variantId = template.getVariantId();
        builder.missingAttributeValues = template.getMissingAttributeValues();
        builder.missingAttributeNames = template.getMissingAttributeNames();
        builder.attributeCount = template.getAttributeCount();
        builder.attributeCoverage = template.getAttributeCoverage();
        return builder;
    }

}
