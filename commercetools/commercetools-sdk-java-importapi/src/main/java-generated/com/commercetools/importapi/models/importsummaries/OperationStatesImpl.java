
package com.commercetools.importapi.models.importsummaries;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class OperationStatesImpl implements OperationStates, ModelBase {

    private Long processing;

    private Long validationFailed;

    private Long unresolved;

    private Long waitForMasterVariant;

    private Long imported;

    private Long rejected;

    @JsonCreator
    OperationStatesImpl(@JsonProperty("processing") final Long processing,
            @JsonProperty("validationFailed") final Long validationFailed,
            @JsonProperty("unresolved") final Long unresolved,
            @JsonProperty("waitForMasterVariant") final Long waitForMasterVariant,
            @JsonProperty("imported") final Long imported, @JsonProperty("rejected") final Long rejected) {
        this.processing = processing;
        this.validationFailed = validationFailed;
        this.unresolved = unresolved;
        this.waitForMasterVariant = waitForMasterVariant;
        this.imported = imported;
        this.rejected = rejected;
    }

    public OperationStatesImpl() {
    }

    /**
    *  <p>The number of resources in the <code>processing</code> state.</p>
    */
    public Long getProcessing() {
        return this.processing;
    }

    /**
    *  <p>The number of resources in the <code>validationFailed</code> state.</p>
    */
    public Long getValidationFailed() {
        return this.validationFailed;
    }

    /**
    *  <p>The number of resources in the <code>unresolved</code> state.</p>
    */
    public Long getUnresolved() {
        return this.unresolved;
    }

    /**
    *  <p>The number of resources in the <code>waitForMasterVariant</code> state.</p>
    */
    public Long getWaitForMasterVariant() {
        return this.waitForMasterVariant;
    }

    /**
    *  <p>The number of resources in the <code>imported</code> state.</p>
    */
    public Long getImported() {
        return this.imported;
    }

    /**
    *  <p>The number of resources in the <code>rejected</code> state.</p>
    */
    public Long getRejected() {
        return this.rejected;
    }

    public void setProcessing(final Long processing) {
        this.processing = processing;
    }

    public void setValidationFailed(final Long validationFailed) {
        this.validationFailed = validationFailed;
    }

    public void setUnresolved(final Long unresolved) {
        this.unresolved = unresolved;
    }

    public void setWaitForMasterVariant(final Long waitForMasterVariant) {
        this.waitForMasterVariant = waitForMasterVariant;
    }

    public void setImported(final Long imported) {
        this.imported = imported;
    }

    public void setRejected(final Long rejected) {
        this.rejected = rejected;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OperationStatesImpl that = (OperationStatesImpl) o;

        return new EqualsBuilder().append(processing, that.processing)
                .append(validationFailed, that.validationFailed)
                .append(unresolved, that.unresolved)
                .append(waitForMasterVariant, that.waitForMasterVariant)
                .append(imported, that.imported)
                .append(rejected, that.rejected)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(processing)
                .append(validationFailed)
                .append(unresolved)
                .append(waitForMasterVariant)
                .append(imported)
                .append(rejected)
                .toHashCode();
    }

}
