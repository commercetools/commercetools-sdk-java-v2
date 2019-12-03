package com.commercetools.importer.models.importsummaries;


import com.commercetools.importer.models.importsummaries.OperationStates;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OperationStatesBuilder {
   
   
   private Integer Unresolved;
   
   
   private Integer WaitForMasterVariant;
   
   
   private Integer ValidationFailed;
   
   
   private Integer Skipped;
   
   
   private Integer Imported;
   
   
   private Integer Expired;
   
   
   private Integer Resolved;
   
   
   private Integer Rejected;
   
   
   private Integer Deleted;
   
   
   private Integer Accepted;
   
   public OperationStatesBuilder Unresolved( final Integer Unresolved) {
      this.Unresolved = Unresolved;
      return this;
   }
   
   public OperationStatesBuilder WaitForMasterVariant( final Integer WaitForMasterVariant) {
      this.WaitForMasterVariant = WaitForMasterVariant;
      return this;
   }
   
   public OperationStatesBuilder ValidationFailed( final Integer ValidationFailed) {
      this.ValidationFailed = ValidationFailed;
      return this;
   }
   
   public OperationStatesBuilder Skipped( final Integer Skipped) {
      this.Skipped = Skipped;
      return this;
   }
   
   public OperationStatesBuilder Imported( final Integer Imported) {
      this.Imported = Imported;
      return this;
   }
   
   public OperationStatesBuilder Expired( final Integer Expired) {
      this.Expired = Expired;
      return this;
   }
   
   public OperationStatesBuilder Resolved( final Integer Resolved) {
      this.Resolved = Resolved;
      return this;
   }
   
   public OperationStatesBuilder Rejected( final Integer Rejected) {
      this.Rejected = Rejected;
      return this;
   }
   
   public OperationStatesBuilder Deleted( final Integer Deleted) {
      this.Deleted = Deleted;
      return this;
   }
   
   public OperationStatesBuilder Accepted( final Integer Accepted) {
      this.Accepted = Accepted;
      return this;
   }
   
   
   public Integer getUnresolved(){
      return this.Unresolved;
   }
   
   
   public Integer getWaitForMasterVariant(){
      return this.WaitForMasterVariant;
   }
   
   
   public Integer getValidationFailed(){
      return this.ValidationFailed;
   }
   
   
   public Integer getSkipped(){
      return this.Skipped;
   }
   
   
   public Integer getImported(){
      return this.Imported;
   }
   
   
   public Integer getExpired(){
      return this.Expired;
   }
   
   
   public Integer getResolved(){
      return this.Resolved;
   }
   
   
   public Integer getRejected(){
      return this.Rejected;
   }
   
   
   public Integer getDeleted(){
      return this.Deleted;
   }
   
   
   public Integer getAccepted(){
      return this.Accepted;
   }

   public OperationStates build() {
       return new OperationStatesImpl(Unresolved, WaitForMasterVariant, ValidationFailed, Skipped, Imported, Expired, Resolved, Rejected, Deleted, Accepted);
   }
   
   public static OperationStatesBuilder of() {
      return new OperationStatesBuilder();
   }
   
   public static OperationStatesBuilder of(final OperationStates template) {
      OperationStatesBuilder builder = new OperationStatesBuilder();
      builder.Unresolved = template.getUnresolved();
      builder.WaitForMasterVariant = template.getWaitForMasterVariant();
      builder.ValidationFailed = template.getValidationFailed();
      builder.Skipped = template.getSkipped();
      builder.Imported = template.getImported();
      builder.Expired = template.getExpired();
      builder.Resolved = template.getResolved();
      builder.Rejected = template.getRejected();
      builder.Deleted = template.getDeleted();
      builder.Accepted = template.getAccepted();
      return builder;
   }
   
}