
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
    *  <p>The number of resources in the <code>processing</code> state.</p>
    */
    @NotNull
    @JsonProperty("processing")
    public Long getProcessing();

    /**
    *  <p>The number of resources in the <code>validationFailed</code> state.</p>
    */
    @NotNull
    @JsonProperty("validationFailed")
    public Long getValidationFailed();

    /**
    *  <p>The number of resources in the <code>unresolved</code> state.</p>
    */
    @NotNull
    @JsonProperty("unresolved")
    public Long getUnresolved();

    /**
    *  <p>The number of resources in the <code>waitForMasterVariant</code> state.</p>
    */
    @NotNull
    @JsonProperty("waitForMasterVariant")
    public Long getWaitForMasterVariant();

    /**
    *  <p>The number of resources in the <code>imported</code> state.</p>
    */
    @NotNull
    @JsonProperty("imported")
    public Long getImported();

    /**
    *  <p>The number of resources in the <code>rejected</code> state.</p>
    */
    @NotNull
    @JsonProperty("rejected")
    public Long getRejected();

    public void setProcessing(final Long processing);

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
        instance.setProcessing(template.getProcessing());
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

    public static com.fasterxml.jackson.core.type.TypeReference<OperationStates> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OperationStates>() {
            @Override
            public String toString() {
                return "TypeReference<OperationStates>";
            }
        };
    }
}
