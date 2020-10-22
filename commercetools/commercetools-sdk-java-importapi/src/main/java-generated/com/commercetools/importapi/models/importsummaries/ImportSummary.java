package com.commercetools.importapi.models.importsummaries;

import com.commercetools.importapi.models.importsummaries.OperationStates;
import com.commercetools.importapi.models.importsummaries.ImportSummaryImpl;

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

/**
*  <p>An import summary describes the states of import resources of a given import sink.</p>
*  <p>It is used to track the overall progress of import resources.</p>
*/
@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ImportSummaryImpl.class)
public interface ImportSummary  {

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

    public static ImportSummaryImpl of(){
        return new ImportSummaryImpl();
    }
    

    public static ImportSummaryImpl of(final ImportSummary template) {
        ImportSummaryImpl instance = new ImportSummaryImpl();
        instance.setStates(template.getStates());
        instance.setTotal(template.getTotal());
        return instance;
    }

    default <T extends Accessor<ImportSummary>> T withImportSummary(Function<ImportSummary, T> helper) {
        return helper.apply(this);
    }
}
