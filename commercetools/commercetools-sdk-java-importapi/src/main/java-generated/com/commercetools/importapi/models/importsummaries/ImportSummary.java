
package com.commercetools.importapi.models.importsummaries;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Describes the status of an <a href="/import-container#importcontainer">ImportContainer</a> by the number of resources in each <a href="/processing-state#processingstate">Processing State</a>.
*  Can be used to monitor the import progress per <a href="/import-container">Import Container</a>.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ImportSummaryImpl.class)
public interface ImportSummary {

    /**
    *  <p>The import status of an <a href="/import-container#importcontainer">ImportContainer</a> given by the number of resources in each <a href="/processing-state#processingstate">Processing State</a>.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("states")
    public OperationStates getStates();

    /**
    *  <p>The total number of <a href="/import-operation#importoperation">ImportOperations</a> received for this Import Summary.</p>
    */
    @NotNull
    @JsonProperty("total")
    public Long getTotal();

    public void setStates(final OperationStates states);

    public void setTotal(final Long total);

    public static ImportSummary of() {
        return new ImportSummaryImpl();
    }

    public static ImportSummary of(final ImportSummary template) {
        ImportSummaryImpl instance = new ImportSummaryImpl();
        instance.setStates(template.getStates());
        instance.setTotal(template.getTotal());
        return instance;
    }

    public static ImportSummaryBuilder builder() {
        return ImportSummaryBuilder.of();
    }

    public static ImportSummaryBuilder builder(final ImportSummary template) {
        return ImportSummaryBuilder.of(template);
    }

    default <T> T withImportSummary(Function<ImportSummary, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ImportSummary> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ImportSummary>() {
            @Override
            public String toString() {
                return "TypeReference<ImportSummary>";
            }
        };
    }
}
