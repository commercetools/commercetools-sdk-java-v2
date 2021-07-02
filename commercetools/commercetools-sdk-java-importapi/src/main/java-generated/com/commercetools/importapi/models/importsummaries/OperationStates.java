
package com.commercetools.importapi.models.importsummaries;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = OperationStatesImpl.class)
public interface OperationStates {

    /**
    *  <p>The number of resources in the <code>ValidationFailed</code> state.</p>
    */
    @NotNull
    @JsonProperty("ValidationFailed")
    public Long getValidationFailed();

    /**
    *  <p>The number of resources in the <code>Unresolved</code> state.</p>
    */
    @NotNull
    @JsonProperty("Unresolved")
    public Long getUnresolved();

    /**
    *  <p>The number of resources in the <code>WaitForMasterVariant</code> state.</p>
    */
    @NotNull
    @JsonProperty("WaitForMasterVariant")
    public Long getWaitForMasterVariant();

    /**
    *  <p>The number of resources in the <code>Imported</code> state.</p>
    */
    @NotNull
    @JsonProperty("Imported")
    public Long getImported();

    /**
    *  <p>The number of resources in the <code>Rejected</code> state.</p>
    */
    @NotNull
    @JsonProperty("Rejected")
    public Long getRejected();

    public void setValidationFailed(final Long validationFailed);

    public void setUnresolved(final Long unresolved);

    public void setWaitForMasterVariant(final Long waitForMasterVariant);

    public void setImported(final Long imported);

    public void setRejected(final Long rejected);

    public static OperationStates of() {
        return new OperationStatesImpl();
    }

    public static OperationStates of(final OperationStates template) {
        OperationStatesImpl instance = new OperationStatesImpl();
        instance.setValidationFailed(template.getValidationFailed());
        instance.setUnresolved(template.getUnresolved());
        instance.setWaitForMasterVariant(template.getWaitForMasterVariant());
        instance.setImported(template.getImported());
        instance.setRejected(template.getRejected());
        return instance;
    }

    public static OperationStatesBuilder builder() {
        return OperationStatesBuilder.of();
    }

    public static OperationStatesBuilder builder(final OperationStates template) {
        return OperationStatesBuilder.of(template);
    }

    default <T> T withOperationStates(Function<OperationStates, T> helper) {
        return helper.apply(this);
    }
}
