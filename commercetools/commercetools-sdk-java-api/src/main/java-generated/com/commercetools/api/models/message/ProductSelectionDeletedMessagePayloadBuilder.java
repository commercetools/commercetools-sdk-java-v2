
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ProductSelectionDeletedMessagePayloadBuilder implements Builder<ProductSelectionDeletedMessagePayload> {

    private com.commercetools.api.models.common.LocalizedString name;

    public ProductSelectionDeletedMessagePayloadBuilder name(
            Function<com.commercetools.api.models.common.LocalizedStringBuilder, com.commercetools.api.models.common.LocalizedStringBuilder> builder) {
        this.name = builder.apply(com.commercetools.api.models.common.LocalizedStringBuilder.of()).build();
        return this;
    }

    public ProductSelectionDeletedMessagePayloadBuilder name(
            final com.commercetools.api.models.common.LocalizedString name) {
        this.name = name;
        return this;
    }

    public com.commercetools.api.models.common.LocalizedString getName() {
        return this.name;
    }

    public ProductSelectionDeletedMessagePayload build() {
        Objects.requireNonNull(name, ProductSelectionDeletedMessagePayload.class + ": name is missing");
        return new ProductSelectionDeletedMessagePayloadImpl(name);
    }

    /**
     * builds ProductSelectionDeletedMessagePayload without checking for non null required values
     */
    public ProductSelectionDeletedMessagePayload buildUnchecked() {
        return new ProductSelectionDeletedMessagePayloadImpl(name);
    }

    public static ProductSelectionDeletedMessagePayloadBuilder of() {
        return new ProductSelectionDeletedMessagePayloadBuilder();
    }

    public static ProductSelectionDeletedMessagePayloadBuilder of(
            final ProductSelectionDeletedMessagePayload template) {
        ProductSelectionDeletedMessagePayloadBuilder builder = new ProductSelectionDeletedMessagePayloadBuilder();
        builder.name = template.getName();
        return builder;
    }

}
