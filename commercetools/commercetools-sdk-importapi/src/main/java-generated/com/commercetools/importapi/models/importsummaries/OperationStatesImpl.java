package com.commercetools.importapi.models.importsummaries;


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

    private Long accepted;

    private Long validationFailed;

    private Long unresolved;

    private Long resolved;

    private Long waitForMasterVariant;

    private Long imported;

    private Long deleted;

    private Long rejected;

    private Long skipped;

    private Long expired;

    @JsonCreator
    OperationStatesImpl(@JsonProperty("Accepted") final Long accepted, @JsonProperty("ValidationFailed") final Long validationFailed, @JsonProperty("Unresolved") final Long unresolved, @JsonProperty("Resolved") final Long resolved, @JsonProperty("WaitForMasterVariant") final Long waitForMasterVariant, @JsonProperty("Imported") final Long imported, @JsonProperty("Deleted") final Long deleted, @JsonProperty("Rejected") final Long rejected, @JsonProperty("Skipped") final Long skipped, @JsonProperty("Expired") final Long expired) {
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
    public Long getAccepted(){
        return this.accepted;
    }

    /**
    *  <p>The number of import operations that are in the state <code>ValidationFailed</code>.</p>
    */
    public Long getValidationFailed(){
        return this.validationFailed;
    }

    /**
    *  <p>The number of import operations that are in the state <code>Unresolved</code>.</p>
    */
    public Long getUnresolved(){
        return this.unresolved;
    }

    /**
    *  <p>The number of import operations that are in the state <code>Resolved</code>.</p>
    */
    public Long getResolved(){
        return this.resolved;
    }

    /**
    *  <p>The number of import operations that are in the state <code>WaitForMasterVariant</code>.</p>
    */
    public Long getWaitForMasterVariant(){
        return this.waitForMasterVariant;
    }

    /**
    *  <p>The number of import operations that are in the state <code>Imported</code>.</p>
    */
    public Long getImported(){
        return this.imported;
    }

    /**
    *  <p>The number of import operations that are in the state <code>Deleted</code>.</p>
    */
    public Long getDeleted(){
        return this.deleted;
    }

    /**
    *  <p>The number of import operations that are in the state <code>Rejected</code>.</p>
    */
    public Long getRejected(){
        return this.rejected;
    }

    /**
    *  <p>The number of import operations that are in the state <code>Skipped</code>.</p>
    */
    public Long getSkipped(){
        return this.skipped;
    }

    /**
    *  <p>The number of import operations that are in the state <code>Expired</code>.</p>
    */
    public Long getExpired(){
        return this.expired;
    }

    public void setAccepted(final Long accepted){
        this.accepted = accepted;
    }

    public void setValidationFailed(final Long validationFailed){
        this.validationFailed = validationFailed;
    }

    public void setUnresolved(final Long unresolved){
        this.unresolved = unresolved;
    }

    public void setResolved(final Long resolved){
        this.resolved = resolved;
    }

    public void setWaitForMasterVariant(final Long waitForMasterVariant){
        this.waitForMasterVariant = waitForMasterVariant;
    }

    public void setImported(final Long imported){
        this.imported = imported;
    }

    public void setDeleted(final Long deleted){
        this.deleted = deleted;
    }

    public void setRejected(final Long rejected){
        this.rejected = rejected;
    }

    public void setSkipped(final Long skipped){
        this.skipped = skipped;
    }

    public void setExpired(final Long expired){
        this.expired = expired;
    }

}
