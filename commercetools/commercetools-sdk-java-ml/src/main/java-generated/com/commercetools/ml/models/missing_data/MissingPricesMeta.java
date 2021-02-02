
package com.commercetools.ml.models.missing_data;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MissingPricesMetaImpl.class)
public interface MissingPricesMeta {

    @NotNull
    @Valid
    @JsonProperty("productLevel")
    public MissingPricesProductLevel getProductLevel();

    @NotNull
    @Valid
    @JsonProperty("variantLevel")
    public MissingPricesVariantLevel getVariantLevel();

    public void setProductLevel(final MissingPricesProductLevel productLevel);

    public void setVariantLevel(final MissingPricesVariantLevel variantLevel);

    public static MissingPricesMeta of() {
        return new MissingPricesMetaImpl();
    }

    public static MissingPricesMeta of(final MissingPricesMeta template) {
        MissingPricesMetaImpl instance = new MissingPricesMetaImpl();
        instance.setProductLevel(template.getProductLevel());
        instance.setVariantLevel(template.getVariantLevel());
        return instance;
    }

    public static MissingPricesMetaBuilder builder() {
        return MissingPricesMetaBuilder.of();
    }

    public static MissingPricesMetaBuilder builder(final MissingPricesMeta template) {
        return MissingPricesMetaBuilder.of(template);
    }

    default <T> T withMissingPricesMeta(Function<MissingPricesMeta, T> helper) {
        return helper.apply(this);
    }
}
