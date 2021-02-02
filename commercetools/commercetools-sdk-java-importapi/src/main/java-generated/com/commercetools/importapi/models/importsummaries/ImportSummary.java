
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
*  <p>An import summary describes the states of import resources of a given import sink.</p>
*  <p>It is used to track the overall progress of import resources.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ImportSummaryImpl.class)
public interface ImportSummary {

    /**
    *  <p>The states summary for this import summary.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("states")
    public OperationStates getStates();

    /**
    *  <p>The total number of import operations received for this import group.</p>
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
}
