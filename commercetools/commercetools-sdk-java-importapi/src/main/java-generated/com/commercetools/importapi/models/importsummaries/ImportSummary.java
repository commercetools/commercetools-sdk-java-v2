
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
 <p>Describes the status of an ImportContainer by the number of resources in each Processing State. Can be used to monitor the import progress per Import Container.</p>

 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   ImportSummary importSummary = ImportSummary.builder()
           .states(statesBuilder -> statesBuilder)
           .total(1)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ImportSummaryImpl.class)
public interface ImportSummary {

    /**
     *  <p>The import status of an ImportContainer given by the number of resources in each Processing State.</p>
     */
    @NotNull
    @Valid
    @JsonProperty("states")
    public OperationStates getStates();

    /**
     *  <p>The total number of ImportOperations received for this Import Summary.</p>
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
