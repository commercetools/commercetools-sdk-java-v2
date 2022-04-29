
package com.commercetools.ml.models.missing_data;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MissingPricesVariantLevelImpl.class)
public interface MissingPricesVariantLevel extends MissingPricesProductCount {

    /**
    *  <p>Number of product variants scanned.</p>
    */
    @NotNull
    @JsonProperty("total")
    public Long getTotal();

    /**
    *  <p>Number of product variants missing prices.</p>
    */
    @NotNull
    @JsonProperty("missingPrices")
    public Long getMissingPrices();

    public void setTotal(final Long total);

    public void setMissingPrices(final Long missingPrices);

    public static MissingPricesVariantLevel of() {
        return new MissingPricesVariantLevelImpl();
    }

    public static MissingPricesVariantLevel of(final MissingPricesVariantLevel template) {
        MissingPricesVariantLevelImpl instance = new MissingPricesVariantLevelImpl();
        instance.setTotal(template.getTotal());
        instance.setMissingPrices(template.getMissingPrices());
        return instance;
    }

    public static MissingPricesVariantLevelBuilder builder() {
        return MissingPricesVariantLevelBuilder.of();
    }

    public static MissingPricesVariantLevelBuilder builder(final MissingPricesVariantLevel template) {
        return MissingPricesVariantLevelBuilder.of(template);
    }

    default <T> T withMissingPricesVariantLevel(Function<MissingPricesVariantLevel, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MissingPricesVariantLevel> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MissingPricesVariantLevel>() {
            @Override
            public String toString() {
                return "TypeReference<MissingPricesVariantLevel>";
            }
        };
    }
}
