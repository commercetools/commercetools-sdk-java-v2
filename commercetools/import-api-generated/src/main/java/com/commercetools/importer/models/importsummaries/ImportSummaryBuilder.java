package com.commercetools.importer.models.importsummaries;

import com.commercetools.importer.models.importsummaries.OperationStates;
import com.commercetools.importer.models.importsummaries.ImportSummary;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ImportSummaryBuilder {
   
   
   private Integer total;
   
   
   private com.commercetools.importer.models.importsummaries.OperationStates states;
   
   public ImportSummaryBuilder total( final Integer total) {
      this.total = total;
      return this;
   }
   
   public ImportSummaryBuilder states( final com.commercetools.importer.models.importsummaries.OperationStates states) {
      this.states = states;
      return this;
   }
   
   
   public Integer getTotal(){
      return this.total;
   }
   
   
   public com.commercetools.importer.models.importsummaries.OperationStates getStates(){
      return this.states;
   }

   public ImportSummary build() {
       return new ImportSummaryImpl(total, states);
   }
   
   public static ImportSummaryBuilder of() {
      return new ImportSummaryBuilder();
   }
   
   public static ImportSummaryBuilder of(final ImportSummary template) {
      ImportSummaryBuilder builder = new ImportSummaryBuilder();
      builder.total = template.getTotal();
      builder.states = template.getStates();
      return builder;
   }
   
}