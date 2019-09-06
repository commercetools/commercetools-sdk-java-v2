package com.commercetools.models.Product;

import com.commercetools.models.Product.FacetResult;
import com.commercetools.models.Product.FacetResultTerm;
import com.commercetools.models.Product.FacetTypes;
import com.commercetools.models.Product.TermFacetResultType;
import java.lang.Long;
import com.commercetools.models.Product.TermFacetResult;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TermFacetResultBuilder {
   
   
   private java.lang.Long other;
   
   
   private java.lang.Long total;
   
   
   private java.util.List<com.commercetools.models.Product.FacetResultTerm> terms;
   
   
   private com.commercetools.models.Product.TermFacetResultType dataType;
   
   
   private java.lang.Long missing;
   
   public TermFacetResultBuilder other( final java.lang.Long other) {
      this.other = other;
      return this;
   }
   
   public TermFacetResultBuilder total( final java.lang.Long total) {
      this.total = total;
      return this;
   }
   
   public TermFacetResultBuilder terms( final java.util.List<com.commercetools.models.Product.FacetResultTerm> terms) {
      this.terms = terms;
      return this;
   }
   
   public TermFacetResultBuilder dataType( final com.commercetools.models.Product.TermFacetResultType dataType) {
      this.dataType = dataType;
      return this;
   }
   
   public TermFacetResultBuilder missing( final java.lang.Long missing) {
      this.missing = missing;
      return this;
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

   public TermFacetResult build() {
       return new TermFacetResultImpl(other, total, terms, dataType, missing);
   }
   
   public static TermFacetResultBuilder of() {
      return new TermFacetResultBuilder();
   }
   
   public static TermFacetResultBuilder of(final TermFacetResult template) {
      TermFacetResultBuilder builder = new TermFacetResultBuilder();
      builder.other = template.getOther();
      builder.total = template.getTotal();
      builder.terms = template.getTerms();
      builder.dataType = template.getDataType();
      builder.missing = template.getMissing();
      return builder;
   }
   
}