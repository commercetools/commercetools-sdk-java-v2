package com.commercetools.api.models.product;

import com.commercetools.api.models.product.FacetResult;
import com.commercetools.api.models.product.FacetResultTerm;
import com.commercetools.api.models.product.FacetTypes;
import com.commercetools.api.models.product.TermFacetResultType;
import com.commercetools.api.models.product.TermFacetResultImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = TermFacetResultImpl.class)
public interface TermFacetResult extends FacetResult {

    
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
    
    public void setTerms(final List<FacetResultTerm> terms);

    public static TermFacetResultImpl of(){
        return new TermFacetResultImpl();
    }
    

    public static TermFacetResultImpl of(final TermFacetResult template) {
        TermFacetResultImpl instance = new TermFacetResultImpl();
        instance.setDataType(template.getDataType());
        instance.setMissing(template.getMissing());
        instance.setTotal(template.getTotal());
        instance.setOther(template.getOther());
        instance.setTerms(template.getTerms());
        return instance;
    }

    default <T extends Accessor<TermFacetResult>> T withTermFacetResult(Function<TermFacetResult, T> helper) {
        return helper.apply(this);
    }
}
