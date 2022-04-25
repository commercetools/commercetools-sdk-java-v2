
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = FacetTermImpl.class)
public interface FacetTerm {

    @NotNull
    @JsonProperty("term")
    public Object getTerm();

    @NotNull
    @JsonProperty("count")
    public Long getCount();

    @JsonProperty("productCount")
    public Long getProductCount();

    public void setTerm(final Object term);

    public void setCount(final Long count);

    public void setProductCount(final Long productCount);

    public static FacetTerm of() {
        return new FacetTermImpl();
    }

    public static FacetTerm of(final FacetTerm template) {
        FacetTermImpl instance = new FacetTermImpl();
        instance.setTerm(template.getTerm());
        instance.setCount(template.getCount());
        instance.setProductCount(template.getProductCount());
        return instance;
    }

    public static FacetTermBuilder builder() {
        return FacetTermBuilder.of();
    }

    public static FacetTermBuilder builder(final FacetTerm template) {
        return FacetTermBuilder.of(template);
    }

    default <T> T withFacetTerm(Function<FacetTerm, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<FacetTerm> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<FacetTerm>() {
            @Override
            public String toString() {
                return "TypeReference<FacetTerm>";
            }
        };
    }
}
