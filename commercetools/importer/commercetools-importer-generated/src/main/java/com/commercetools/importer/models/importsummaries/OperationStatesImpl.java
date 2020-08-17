package com.commercetools.importer.models.importsummaries;


import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class OperationStatesImpl implements OperationStates {

    private Double accepted;
    
    private Double validationFailed;
    
    private Double unresolved;
    
    private Double resolved;
    
    private Double waitForMasterVariant;
    
    private Double imported;
    
    private Double deleted;
    
    private Double rejected;
    
    private Double skipped;
    
    private Double expired;

    @JsonCreator
    OperationStatesImpl(@JsonProperty("Accepted") final Double accepted, @JsonProperty("ValidationFailed") final Double validationFailed, @JsonProperty("Unresolved") final Double unresolved, @JsonProperty("Resolved") final Double resolved, @JsonProperty("WaitForMasterVariant") final Double waitForMasterVariant, @JsonProperty("Imported") final Double imported, @JsonProperty("Deleted") final Double deleted, @JsonProperty("Rejected") final Double rejected, @JsonProperty("Skipped") final Double skipped, @JsonProperty("Expired") final Double expired) {
        this.accepted = accepted;
        this.validationFailed = validationFailed;
        this.unresolved = unresolved;
        this.resolved = resolved;
        this.waitForMasterVariant = waitForMasterVariant;
        this.imported = imported;
        this.deleted = deleted;
        this.rejected = rejected;
        this.skipped = skipped;
        this.expired = expired;
    }
    public OperationStatesImpl() {
       
    }

    /**
    *  <p>The number of import operations that are in the state <code>Accepted</code>.</p>
    */
    public Double getAccepted(){
        return this.accepted;
    }
    
    /**
    *  <p>The number of import operations that are in the state <code>ValidationFailed</code>.</p>
    */
    public Double getValidationFailed(){
        return this.validationFailed;
    }
    
    /**
    *  <p>The number of import operations that are in the state <code>Unresolved</code>.</p>
    */
    public Double getUnresolved(){
        return this.unresolved;
    }
    
    /**
    *  <p>The number of import operations that are in the state <code>Resolved</code>.</p>
    */
    public Double getResolved(){
        return this.resolved;
    }
    
    /**
    *  <p>The number of import operations that are in the state <code>WaitForMasterVariant</code>.</p>
    */
    public Double getWaitForMasterVariant(){
        return this.waitForMasterVariant;
    }
    
    /**
    *  <p>The number of import operations that are in the state <code>Imported</code>.</p>
    */
    public Double getImported(){
        return this.imported;
    }
    
    /**
    *  <p>The number of import operations that are in the state <code>Deleted</code>.</p>
    */
    public Double getDeleted(){
        return this.deleted;
    }
    
    /**
    *  <p>The number of import operations that are in the state <code>Rejected</code>.</p>
    */
    public Double getRejected(){
        return this.rejected;
    }
    
    /**
    *  <p>The number of import operations that are in the state <code>Skipped</code>.</p>
    */
    public Double getSkipped(){
        return this.skipped;
    }
    
    /**
    *  <p>The number of import operations that are in the state <code>Expired</code>.</p>
    */
    public Double getExpired(){
        return this.expired;
    }

    public void setAccepted(final Double accepted){
        this.accepted = accepted;
    }
    
    public void setValidationFailed(final Double validationFailed){
        this.validationFailed = validationFailed;
    }
    
    public void setUnresolved(final Double unresolved){
        this.unresolved = unresolved;
    }
    
    public void setResolved(final Double resolved){
        this.resolved = resolved;
    }
    
    public void setWaitForMasterVariant(final Double waitForMasterVariant){
        this.waitForMasterVariant = waitForMasterVariant;
    }
    
    public void setImported(final Double imported){
        this.imported = imported;
    }
    
    public void setDeleted(final Double deleted){
        this.deleted = deleted;
    }
    
    public void setRejected(final Double rejected){
        this.rejected = rejected;
    }
    
    public void setSkipped(final Double skipped){
        this.skipped = skipped;
    }
    
    public void setExpired(final Double expired){
        this.expired = expired;
    }

}
