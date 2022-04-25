
package com.commercetools.ml.models.missing_data;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.ml.models.common.ProductReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MissingPricesImpl.class)
public interface MissingPrices {

    @NotNull
    @Valid
    @JsonProperty("product")
    public ProductReference getProduct();

    /**
    *  <p>Id of the <code>ProductVariant</code>.</p>
    */
    @NotNull
    @JsonProperty("variantId")
    public Long getVariantId();

    public void setProduct(final ProductReference product);

    public void setVariantId(final Long variantId);

    public static MissingPrices of() {
        return new MissingPricesImpl();
    }

    public static MissingPrices of(final MissingPrices template) {
        MissingPricesImpl instance = new MissingPricesImpl();
        instance.setProduct(template.getProduct());
        instance.setVariantId(template.getVariantId());
        return instance;
    }

    public static MissingPricesBuilder builder() {
        return MissingPricesBuilder.of();
    }

    public static MissingPricesBuilder builder(final MissingPrices template) {
        return MissingPricesBuilder.of(template);
    }

    default <T> T withMissingPrices(Function<MissingPrices, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MissingPrices> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MissingPrices>() {
            @Override
            public String toString() {
                return "TypeReference<MissingPrices>";
            }
        };
    }
}
