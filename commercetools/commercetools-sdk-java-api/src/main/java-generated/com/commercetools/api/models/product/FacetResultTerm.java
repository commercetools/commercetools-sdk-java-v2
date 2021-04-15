
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = FacetResultTermImpl.class)
public interface FacetResultTerm {

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

    public static FacetResultTerm of() {
        return new FacetResultTermImpl();
    }

    public static FacetResultTerm of(final FacetResultTerm template) {
        FacetResultTermImpl instance = new FacetResultTermImpl();
        instance.setTerm(template.getTerm());
        instance.setCount(template.getCount());
        instance.setProductCount(template.getProductCount());
        return instance;
    }

    public static FacetResultTermBuilder builder() {
        return FacetResultTermBuilder.of();
    }

    public static FacetResultTermBuilder builder(final FacetResultTerm template) {
        return FacetResultTermBuilder.of(template);
    }

    default <T> T withFacetResultTerm(Function<FacetResultTerm, T> helper) {
        return helper.apply(this);
    }
}
