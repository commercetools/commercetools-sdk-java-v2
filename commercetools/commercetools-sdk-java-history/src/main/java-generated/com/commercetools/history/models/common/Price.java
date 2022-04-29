
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = PriceImpl.class)
public interface Price {

    @NotNull
    @JsonProperty("id")
    public String getId();

    @NotNull
    @Valid
    @JsonProperty("value")
    public Money getValue();

    public void setId(final String id);

    public void setValue(final Money value);

    public static Price of() {
        return new PriceImpl();
    }

    public static Price of(final Price template) {
        PriceImpl instance = new PriceImpl();
        instance.setId(template.getId());
        instance.setValue(template.getValue());
        return instance;
    }

    public static PriceBuilder builder() {
        return PriceBuilder.of();
    }

    public static PriceBuilder builder(final Price template) {
        return PriceBuilder.of(template);
    }

    default <T> T withPrice(Function<Price, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<Price> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<Price>() {
            @Override
            public String toString() {
                return "TypeReference<Price>";
            }
        };
    }
}
