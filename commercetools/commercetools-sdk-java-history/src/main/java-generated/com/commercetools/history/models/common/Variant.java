
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = VariantImpl.class)
public interface Variant {

    @NotNull
    @JsonProperty("id")
    public Integer getId();

    @NotNull
    @JsonProperty("sku")
    public String getSku();

    @NotNull
    @JsonProperty("key")
    public String getKey();

    public void setId(final Integer id);

    public void setSku(final String sku);

    public void setKey(final String key);

    public static Variant of() {
        return new VariantImpl();
    }

    public static Variant of(final Variant template) {
        VariantImpl instance = new VariantImpl();
        instance.setId(template.getId());
        instance.setSku(template.getSku());
        instance.setKey(template.getKey());
        return instance;
    }

    public static VariantBuilder builder() {
        return VariantBuilder.of();
    }

    public static VariantBuilder builder(final Variant template) {
        return VariantBuilder.of(template);
    }

    default <T> T withVariant(Function<Variant, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<Variant> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Variant>() {
            @Override
            public String toString() {
                return "TypeReference<Variant>";
            }
        };
    }
}
