package com.commercetools.importapi.models.importsummaries;


import com.commercetools.importapi.models.importsummaries.OperationStatesImpl;

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
    public Long getAccepted();
    /**
    *  <p>The number of import operations that are in the state <code>ValidationFailed</code>.</p>
    */
    @NotNull
    @JsonProperty("ValidationFailed")
    public Long getValidationFailed();
    /**
    *  <p>The number of import operations that are in the state <code>Unresolved</code>.</p>
    */
    @NotNull
    @JsonProperty("Unresolved")
    public Long getUnresolved();
    /**
    *  <p>The number of import operations that are in the state <code>Resolved</code>.</p>
    */
    @NotNull
    @JsonProperty("Resolved")
    public Long getResolved();
    /**
    *  <p>The number of import operations that are in the state <code>WaitForMasterVariant</code>.</p>
    */
    @NotNull
    @JsonProperty("WaitForMasterVariant")
    public Long getWaitForMasterVariant();
    /**
    *  <p>The number of import operations that are in the state <code>Imported</code>.</p>
    */
    @NotNull
    @JsonProperty("Imported")
    public Long getImported();
    /**
    *  <p>The number of import operations that are in the state <code>Deleted</code>.</p>
    */
    @NotNull
    @JsonProperty("Deleted")
    public Long getDeleted();
    /**
    *  <p>The number of import operations that are in the state <code>Rejected</code>.</p>
    */
    @NotNull
    @JsonProperty("Rejected")
    public Long getRejected();
    /**
    *  <p>The number of import operations that are in the state <code>Skipped</code>.</p>
    */
    @NotNull
    @JsonProperty("Skipped")
    public Long getSkipped();
    /**
    *  <p>The number of import operations that are in the state <code>Expired</code>.</p>
    */
    @NotNull
    @JsonProperty("Expired")
    public Long getExpired();

    public void setAccepted(final Long accepted);

    public void setValidationFailed(final Long validationFailed);

    public void setUnresolved(final Long unresolved);

    public void setResolved(final Long resolved);

    public void setWaitForMasterVariant(final Long waitForMasterVariant);

    public void setImported(final Long imported);

    public void setDeleted(final Long deleted);

    public void setRejected(final Long rejected);

    public void setSkipped(final Long skipped);

    public void setExpired(final Long expired);

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
