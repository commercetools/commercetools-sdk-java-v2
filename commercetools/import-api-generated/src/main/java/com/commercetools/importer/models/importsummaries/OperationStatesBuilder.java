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
   
   
   private Integer Accepted;
   
   
   private Integer ValidationFailed;
   
   
   private Integer Unresolved;
   
   
   private Integer Resolved;
   
   
   private Integer WaitForMasterVariant;
   
   
   private Integer Imported;
   
   
   private Integer Deleted;
   
   
   private Integer Rejected;
   
   
   private Integer Skipped;
   
   
   private Integer Expired;
   
   public OperationStatesBuilder Accepted( final Integer Accepted) {
      this.Accepted = Accepted;
      return this;
   }
   
   public OperationStatesBuilder ValidationFailed( final Integer ValidationFailed) {
      this.ValidationFailed = ValidationFailed;
      return this;
   }
   
   public OperationStatesBuilder Unresolved( final Integer Unresolved) {
      this.Unresolved = Unresolved;
      return this;
   }
   
   public OperationStatesBuilder Resolved( final Integer Resolved) {
      this.Resolved = Resolved;
      return this;
   }
   
   public OperationStatesBuilder WaitForMasterVariant( final Integer WaitForMasterVariant) {
      this.WaitForMasterVariant = WaitForMasterVariant;
      return this;
   }
   
   public OperationStatesBuilder Imported( final Integer Imported) {
      this.Imported = Imported;
      return this;
   }
   
   public OperationStatesBuilder Deleted( final Integer Deleted) {
      this.Deleted = Deleted;
      return this;
   }
   
   public OperationStatesBuilder Rejected( final Integer Rejected) {
      this.Rejected = Rejected;
      return this;
   }
   
   public OperationStatesBuilder Skipped( final Integer Skipped) {
      this.Skipped = Skipped;
      return this;
   }
   
   public OperationStatesBuilder Expired( final Integer Expired) {
      this.Expired = Expired;
      return this;
   }
   
   
   public Integer getAccepted(){
      return this.Accepted;
   }
   
   
   public Integer getValidationFailed(){
      return this.ValidationFailed;
   }
   
   
   public Integer getUnresolved(){
      return this.Unresolved;
   }
   
   
   public Integer getResolved(){
      return this.Resolved;
   }
   
   
   public Integer getWaitForMasterVariant(){
      return this.WaitForMasterVariant;
   }
   
   
   public Integer getImported(){
      return this.Imported;
   }
   
   
   public Integer getDeleted(){
      return this.Deleted;
   }
   
   
   public Integer getRejected(){
      return this.Rejected;
   }
   
   
   public Integer getSkipped(){
      return this.Skipped;
   }
   
   
   public Integer getExpired(){
      return this.Expired;
   }

   public OperationStates build() {
       return new OperationStatesImpl(Accepted, ValidationFailed, Unresolved, Resolved, WaitForMasterVariant, Imported, Deleted, Rejected, Skipped, Expired);
   }
   
   public static OperationStatesBuilder of() {
      return new OperationStatesBuilder();
   }
   
   public static OperationStatesBuilder of(final OperationStates template) {
      OperationStatesBuilder builder = new OperationStatesBuilder();
      builder.Accepted = template.getAccepted();
      builder.ValidationFailed = template.getValidationFailed();
      builder.Unresolved = template.getUnresolved();
      builder.Resolved = template.getResolved();
      builder.WaitForMasterVariant = template.getWaitForMasterVariant();
      builder.Imported = template.getImported();
      builder.Deleted = template.getDeleted();
      builder.Rejected = template.getRejected();
      builder.Skipped = template.getSkipped();
      builder.Expired = template.getExpired();
      return builder;
   }
   
}