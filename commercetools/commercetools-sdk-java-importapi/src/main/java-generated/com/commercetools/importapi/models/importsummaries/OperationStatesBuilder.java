package com.commercetools.importapi.models.importsummaries;


import com.commercetools.importapi.models.importsummaries.OperationStates;
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

    
    private Long ValidationFailed;
    
    
    private Long Unresolved;
    
    
    private Long Resolved;
    
    
    private Long WaitForMasterVariant;
    
    
    private Long Imported;
    
    
    private Long Delete;
    
    
    private Long Deleted;
    
    
    private Long Rejected;
    
    
    private Long Skipped;

    public OperationStatesBuilder ValidationFailed( final Long ValidationFailed) {
        this.ValidationFailed = ValidationFailed;
        return this;
    }
    
    public OperationStatesBuilder Unresolved( final Long Unresolved) {
        this.Unresolved = Unresolved;
        return this;
    }
    
    public OperationStatesBuilder Resolved( final Long Resolved) {
        this.Resolved = Resolved;
        return this;
    }
    
    public OperationStatesBuilder WaitForMasterVariant( final Long WaitForMasterVariant) {
        this.WaitForMasterVariant = WaitForMasterVariant;
        return this;
    }
    
    public OperationStatesBuilder Imported( final Long Imported) {
        this.Imported = Imported;
        return this;
    }
    
    public OperationStatesBuilder Delete( final Long Delete) {
        this.Delete = Delete;
        return this;
    }
    
    public OperationStatesBuilder Deleted( final Long Deleted) {
        this.Deleted = Deleted;
        return this;
    }
    
    public OperationStatesBuilder Rejected( final Long Rejected) {
        this.Rejected = Rejected;
        return this;
    }
    
    public OperationStatesBuilder Skipped( final Long Skipped) {
        this.Skipped = Skipped;
        return this;
    }

    
    public Long getValidationFailed(){
        return this.ValidationFailed;
    }
    
    
    public Long getUnresolved(){
        return this.Unresolved;
    }
    
    
    public Long getResolved(){
        return this.Resolved;
    }
    
    
    public Long getWaitForMasterVariant(){
        return this.WaitForMasterVariant;
    }
    
    
    public Long getImported(){
        return this.Imported;
    }
    
    
    public Long getDelete(){
        return this.Delete;
    }
    
    
    public Long getDeleted(){
        return this.Deleted;
    }
    
    
    public Long getRejected(){
        return this.Rejected;
    }
    
    
    public Long getSkipped(){
        return this.Skipped;
    }

    public OperationStates build() {
        return new OperationStatesImpl(ValidationFailed, Unresolved, Resolved, WaitForMasterVariant, Imported, Delete, Deleted, Rejected, Skipped);
    }

    public static OperationStatesBuilder of() {
        return new OperationStatesBuilder();
    }

    public static OperationStatesBuilder of(final OperationStates template) {
        OperationStatesBuilder builder = new OperationStatesBuilder();
        builder.ValidationFailed = template.getValidationFailed();
        builder.Unresolved = template.getUnresolved();
        builder.Resolved = template.getResolved();
        builder.WaitForMasterVariant = template.getWaitForMasterVariant();
        builder.Imported = template.getImported();
        builder.Delete = template.getDelete();
        builder.Deleted = template.getDeleted();
        builder.Rejected = template.getRejected();
        builder.Skipped = template.getSkipped();
        return builder;
    }

}
