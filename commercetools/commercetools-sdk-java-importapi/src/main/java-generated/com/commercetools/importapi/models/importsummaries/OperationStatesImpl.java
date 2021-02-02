
package com.commercetools.importapi.models.importsummaries;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OperationStatesImpl implements OperationStates {

    private Long validationFailed;

    private Long unresolved;

    private Long waitForMasterVariant;

    private Long imported;

    private Long delete;

    private Long deleted;

    private Long rejected;

    @JsonCreator
    OperationStatesImpl(@JsonProperty("ValidationFailed") final Long validationFailed,
            @JsonProperty("Unresolved") final Long unresolved,
            @JsonProperty("WaitForMasterVariant") final Long waitForMasterVariant,
            @JsonProperty("Imported") final Long imported, @JsonProperty("Delete") final Long delete,
            @JsonProperty("Deleted") final Long deleted, @JsonProperty("Rejected") final Long rejected) {
        this.validationFailed = validationFailed;
        this.unresolved = unresolved;
        this.waitForMasterVariant = waitForMasterVariant;
        this.imported = imported;
        this.delete = delete;
        this.deleted = deleted;
        this.rejected = rejected;
    }

    public OperationStatesImpl() {
    }

    /**
    *  <p>The number of import operations that are in the state <code>ValidationFailed</code>.</p>
    */
    public Long getValidationFailed() {
        return this.validationFailed;
    }

    /**
    *  <p>The number of import operations that are in the state <code>Unresolved</code>.</p>
    */
    public Long getUnresolved() {
        return this.unresolved;
    }

    /**
    *  <p>The number of import operations that are in the state <code>WaitForMasterVariant</code>.</p>
    */
    public Long getWaitForMasterVariant() {
        return this.waitForMasterVariant;
    }

    /**
    *  <p>The number of import operations that are in the state <code>Imported</code>.</p>
    */
    public Long getImported() {
        return this.imported;
    }

    /**
    *  <p>The number of import operations that are in the state <code>Delete</code>.</p>
    */
    public Long getDelete() {
        return this.delete;
    }

    /**
    *  <p>The number of import operations that are in the state <code>Deleted</code>.</p>
    */
    public Long getDeleted() {
        return this.deleted;
    }

    /**
    *  <p>The number of import operations that are in the state <code>Rejected</code>.</p>
    */
    public Long getRejected() {
        return this.rejected;
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

    public void setDelete(final Long delete) {
        this.delete = delete;
    }

    public void setDeleted(final Long deleted) {
        this.deleted = deleted;
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

        return new EqualsBuilder().append(validationFailed, that.validationFailed).append(unresolved,
            that.unresolved).append(waitForMasterVariant, that.waitForMasterVariant).append(imported,
                that.imported).append(delete, that.delete).append(deleted, that.deleted).append(rejected,
                    that.rejected).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(validationFailed).append(unresolved).append(
            waitForMasterVariant).append(imported).append(delete).append(deleted).append(rejected).toHashCode();
    }

}
