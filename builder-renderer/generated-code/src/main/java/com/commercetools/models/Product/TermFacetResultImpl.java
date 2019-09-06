package com.commercetools.models.Product;

import com.commercetools.models.Product.FacetResult;
import com.commercetools.models.Product.FacetResultTerm;
import com.commercetools.models.Product.FacetTypes;
import com.commercetools.models.Product.TermFacetResultType;
import java.lang.Long;
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

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class TermFacetResultImpl implements TermFacetResult {

   private com.commercetools.models.Product.FacetTypes type;
   
   private java.lang.Long other;
   
   private java.lang.Long total;
   
   private java.util.List<com.commercetools.models.Product.FacetResultTerm> terms;
   
   private com.commercetools.models.Product.TermFacetResultType dataType;
   
   private java.lang.Long missing;

   @JsonCreator
   TermFacetResultImpl(@JsonProperty("other") final java.lang.Long other, @JsonProperty("total") final java.lang.Long total, @JsonProperty("terms") final java.util.List<com.commercetools.models.Product.FacetResultTerm> terms, @JsonProperty("dataType") final com.commercetools.models.Product.TermFacetResultType dataType, @JsonProperty("missing") final java.lang.Long missing) {
      this.other = other;
      this.total = total;
      this.terms = terms;
      this.dataType = dataType;
      this.missing = missing;
      this.type = FacetTypes.findEnumViaJsonName("terms").get();
   }
   public TermFacetResultImpl() {
      
   }
   
   
   public com.commercetools.models.Product.FacetTypes getType(){
      return this.type;
   }
   
   
   public java.lang.Long getOther(){
      return this.other;
   }
   
   
   public java.lang.Long getTotal(){
      return this.total;
   }
   
   
   public java.util.List<com.commercetools.models.Product.FacetResultTerm> getTerms(){
      return this.terms;
   }
   
   
   public com.commercetools.models.Product.TermFacetResultType getDataType(){
      return this.dataType;
   }
   
   
   public java.lang.Long getMissing(){
      return this.missing;
   }

   public void setOther(final java.lang.Long other){
      this.other = other;
   }
   
   public void setTotal(final java.lang.Long total){
      this.total = total;
   }
   
   public void setTerms(final java.util.List<com.commercetools.models.Product.FacetResultTerm> terms){
      this.terms = terms;
   }
   
   public void setDataType(final com.commercetools.models.Product.TermFacetResultType dataType){
      this.dataType = dataType;
   }
   
   public void setMissing(final java.lang.Long missing){
      this.missing = missing;
   }

}