package com.commercetools.importapi.models.importsummaries;


import com.commercetools.importapi.models.importsummaries.OperationStatesImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = OperationStatesImpl.class)
public interface OperationStates  {

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
    *  <p>The number of import operations that are in the state <code>Delete</code>.</p>
    */
    @NotNull
    @JsonProperty("Delete")
    public Long getDelete();
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

    public void setValidationFailed(final Long validationFailed);
    
    public void setUnresolved(final Long unresolved);
    
    public void setResolved(final Long resolved);
    
    public void setWaitForMasterVariant(final Long waitForMasterVariant);
    
    public void setImported(final Long imported);
    
    public void setDelete(final Long delete);
    
    public void setDeleted(final Long deleted);
    
    public void setRejected(final Long rejected);
    
    public void setSkipped(final Long skipped);

    public static OperationStatesImpl of(){
        return new OperationStatesImpl();
    }
    

    public static OperationStatesImpl of(final OperationStates template) {
        OperationStatesImpl instance = new OperationStatesImpl();
        instance.setValidationFailed(template.getValidationFailed());
        instance.setUnresolved(template.getUnresolved());
        instance.setResolved(template.getResolved());
        instance.setWaitForMasterVariant(template.getWaitForMasterVariant());
        instance.setImported(template.getImported());
        instance.setDelete(template.getDelete());
        instance.setDeleted(template.getDeleted());
        instance.setRejected(template.getRejected());
        instance.setSkipped(template.getSkipped());
        return instance;
    }

    default <T> T withOperationStates(Function<OperationStates, T> helper) {
        return helper.apply(this);
    }
}
