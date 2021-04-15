
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = TermFacetResultImpl.class)
public interface TermFacetResult extends FacetResult {

    String TERMS = "terms";

    @NotNull
    @JsonProperty("dataType")
    public TermFacetResultType getDataType();

    @NotNull
    @JsonProperty("missing")
    public Long getMissing();

    @NotNull
    @JsonProperty("total")
    public Long getTotal();

    @NotNull
    @JsonProperty("other")
    public Long getOther();

    @NotNull
    @Valid
    @JsonProperty("terms")
    public List<FacetResultTerm> getTerms();

    public void setDataType(final TermFacetResultType dataType);

    public void setMissing(final Long missing);

    public void setTotal(final Long total);

    public void setOther(final Long other);

    @JsonIgnore
    public void setTerms(final FacetResultTerm... terms);

    public void setTerms(final List<FacetResultTerm> terms);

    public static TermFacetResult of() {
        return new TermFacetResultImpl();
    }

    public static TermFacetResult of(final TermFacetResult template) {
        TermFacetResultImpl instance = new TermFacetResultImpl();
        instance.setDataType(template.getDataType());
        instance.setMissing(template.getMissing());
        instance.setTotal(template.getTotal());
        instance.setOther(template.getOther());
        instance.setTerms(template.getTerms());
        return instance;
    }

    public static TermFacetResultBuilder builder() {
        return TermFacetResultBuilder.of();
    }

    public static TermFacetResultBuilder builder(final TermFacetResult template) {
        return TermFacetResultBuilder.of(template);
    }

    default <T> T withTermFacetResult(Function<TermFacetResult, T> helper) {
        return helper.apply(this);
    }
}
