package com.commercetools.models.product;

import com.commercetools.models.product.FacetResult;
import com.commercetools.models.product.FacetResultTerm;
import com.commercetools.models.product.FacetTypes;
import com.commercetools.models.product.TermFacetResultType;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TermFacetResultImpl implements TermFacetResult {

   private com.commercetools.models.product.FacetTypes type;
   
   private Long other;
   
   private Long total;
   
   private java.util.List<com.commercetools.models.product.FacetResultTerm> terms;
   
   private com.commercetools.models.product.TermFacetResultType dataType;
   
   private Long missing;

   @JsonCreator
   TermFacetResultImpl(@JsonProperty("other") final Long other, @JsonProperty("total") final Long total, @JsonProperty("terms") final java.util.List<com.commercetools.models.product.FacetResultTerm> terms, @JsonProperty("dataType") final com.commercetools.models.product.TermFacetResultType dataType, @JsonProperty("missing") final Long missing) {
      this.other = other;
      this.total = total;
      this.terms = terms;
      this.dataType = dataType;
      this.missing = missing;
      this.type = FacetTypes.findEnumViaJsonName("terms").get();
   }
   public TermFacetResultImpl() {
      
   }
   
   
   public com.commercetools.models.product.FacetTypes getType(){
      return this.type;
   }
   
   
   public Long getOther(){
      return this.other;
   }
   
   
   public Long getTotal(){
      return this.total;
   }
   
   
   public java.util.List<com.commercetools.models.product.FacetResultTerm> getTerms(){
      return this.terms;
   }
   
   
   public com.commercetools.models.product.TermFacetResultType getDataType(){
      return this.dataType;
   }
   
   
   public Long getMissing(){
      return this.missing;
   }

   public void setOther(final Long other){
      this.other = other;
   }
   
   public void setTotal(final Long total){
      this.total = total;
   }
   
   public void setTerms(final java.util.List<com.commercetools.models.product.FacetResultTerm> terms){
      this.terms = terms;
   }
   
   public void setDataType(final com.commercetools.models.product.TermFacetResultType dataType){
      this.dataType = dataType;
   }
   
   public void setMissing(final Long missing){
      this.missing = missing;
   }

}