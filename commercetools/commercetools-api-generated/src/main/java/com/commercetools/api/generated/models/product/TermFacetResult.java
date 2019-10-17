package com.commercetools.api.generated.models.product;

import com.commercetools.api.generated.models.product.FacetResult;
import com.commercetools.api.generated.models.product.FacetResultTerm;
import com.commercetools.api.generated.models.product.FacetTypes;
import com.commercetools.api.generated.models.product.TermFacetResultType;
import com.commercetools.api.generated.models.product.TermFacetResultImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

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
      instance.setOther(template.getOther());
      instance.setTotal(template.getTotal());
      instance.setTerms(template.getTerms());
      instance.setDataType(template.getDataType());
      instance.setMissing(template.getMissing());
      return instance;
   }

}