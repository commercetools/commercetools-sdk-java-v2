package com.commercetools.importer.models.importsummaries;


import com.commercetools.importer.models.importsummaries.OperationStatesImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
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
@JsonDeserialize(as = OperationStatesImpl.class)
public interface OperationStates  {

    /**
    *  <p>The number of import operations that are in the state <code>Accepted</code>.</p>
    */
    @NotNull
    @JsonProperty("Accepted")
    public Double getAccepted();
    /**
    *  <p>The number of import operations that are in the state <code>ValidationFailed</code>.</p>
    */
    @NotNull
    @JsonProperty("ValidationFailed")
    public Double getValidationFailed();
    /**
    *  <p>The number of import operations that are in the state <code>Unresolved</code>.</p>
    */
    @NotNull
    @JsonProperty("Unresolved")
    public Double getUnresolved();
    /**
    *  <p>The number of import operations that are in the state <code>Resolved</code>.</p>
    */
    @NotNull
    @JsonProperty("Resolved")
    public Double getResolved();
    /**
    *  <p>The number of import operations that are in the state <code>WaitForMasterVariant</code>.</p>
    */
    @NotNull
    @JsonProperty("WaitForMasterVariant")
    public Double getWaitForMasterVariant();
    /**
    *  <p>The number of import operations that are in the state <code>Imported</code>.</p>
    */
    @NotNull
    @JsonProperty("Imported")
    public Double getImported();
    /**
    *  <p>The number of import operations that are in the state <code>Deleted</code>.</p>
    */
    @NotNull
    @JsonProperty("Deleted")
    public Double getDeleted();
    /**
    *  <p>The number of import operations that are in the state <code>Rejected</code>.</p>
    */
    @NotNull
    @JsonProperty("Rejected")
    public Double getRejected();
    /**
    *  <p>The number of import operations that are in the state <code>Skipped</code>.</p>
    */
    @NotNull
    @JsonProperty("Skipped")
    public Double getSkipped();
    /**
    *  <p>The number of import operations that are in the state <code>Expired</code>.</p>
    */
    @NotNull
    @JsonProperty("Expired")
    public Double getExpired();

    public void setAccepted(final Double accepted);
    
    public void setValidationFailed(final Double validationFailed);
    
    public void setUnresolved(final Double unresolved);
    
    public void setResolved(final Double resolved);
    
    public void setWaitForMasterVariant(final Double waitForMasterVariant);
    
    public void setImported(final Double imported);
    
    public void setDeleted(final Double deleted);
    
    public void setRejected(final Double rejected);
    
    public void setSkipped(final Double skipped);
    
    public void setExpired(final Double expired);

    public static OperationStatesImpl of(){
        return new OperationStatesImpl();
    }
    

    public static OperationStatesImpl of(final OperationStates template) {
        OperationStatesImpl instance = new OperationStatesImpl();
        instance.setAccepted(template.getAccepted());
        instance.setValidationFailed(template.getValidationFailed());
        instance.setUnresolved(template.getUnresolved());
        instance.setResolved(template.getResolved());
        instance.setWaitForMasterVariant(template.getWaitForMasterVariant());
        instance.setImported(template.getImported());
        instance.setDeleted(template.getDeleted());
        instance.setRejected(template.getRejected());
        instance.setSkipped(template.getSkipped());
        instance.setExpired(template.getExpired());
        return instance;
    }

}
