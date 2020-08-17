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

    
    private Double Accepted;
    
    
    private Double ValidationFailed;
    
    
    private Double Unresolved;
    
    
    private Double Resolved;
    
    
    private Double WaitForMasterVariant;
    
    
    private Double Imported;
    
    
    private Double Deleted;
    
    
    private Double Rejected;
    
    
    private Double Skipped;
    
    
    private Double Expired;

    public OperationStatesBuilder Accepted( final Double Accepted) {
        this.Accepted = Accepted;
        return this;
    }
    
    public OperationStatesBuilder ValidationFailed( final Double ValidationFailed) {
        this.ValidationFailed = ValidationFailed;
        return this;
    }
    
    public OperationStatesBuilder Unresolved( final Double Unresolved) {
        this.Unresolved = Unresolved;
        return this;
    }
    
    public OperationStatesBuilder Resolved( final Double Resolved) {
        this.Resolved = Resolved;
        return this;
    }
    
    public OperationStatesBuilder WaitForMasterVariant( final Double WaitForMasterVariant) {
        this.WaitForMasterVariant = WaitForMasterVariant;
        return this;
    }
    
    public OperationStatesBuilder Imported( final Double Imported) {
        this.Imported = Imported;
        return this;
    }
    
    public OperationStatesBuilder Deleted( final Double Deleted) {
        this.Deleted = Deleted;
        return this;
    }
    
    public OperationStatesBuilder Rejected( final Double Rejected) {
        this.Rejected = Rejected;
        return this;
    }
    
    public OperationStatesBuilder Skipped( final Double Skipped) {
        this.Skipped = Skipped;
        return this;
    }
    
    public OperationStatesBuilder Expired( final Double Expired) {
        this.Expired = Expired;
        return this;
    }

    
    public Double getAccepted(){
        return this.Accepted;
    }
    
    
    public Double getValidationFailed(){
        return this.ValidationFailed;
    }
    
    
    public Double getUnresolved(){
        return this.Unresolved;
    }
    
    
    public Double getResolved(){
        return this.Resolved;
    }
    
    
    public Double getWaitForMasterVariant(){
        return this.WaitForMasterVariant;
    }
    
    
    public Double getImported(){
        return this.Imported;
    }
    
    
    public Double getDeleted(){
        return this.Deleted;
    }
    
    
    public Double getRejected(){
        return this.Rejected;
    }
    
    
    public Double getSkipped(){
        return this.Skipped;
    }
    
    
    public Double getExpired(){
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
