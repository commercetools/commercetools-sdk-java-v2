package com.commercetools.importapi.models.importoperations;

import com.commercetools.importapi.models.importoperations.ImportOperation;
import com.commercetools.importapi.models.importoperations.ImportOperationPagedResponse;
import javax.annotation.Nullable;
import java.util.*;
import java.util.function.Function;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ImportOperationPagedResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ImportOperationPagedResponse importOperationPagedResponse = ImportOperationPagedResponse.builder()
 *             .limit(1)
 *             .offset(1)
 *             .count(1)
 *             .total(1)
 *             .plusResults(resultsBuilder -> resultsBuilder)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ImportOperationPagedResponseBuilder implements Builder<ImportOperationPagedResponse> {

    
    
    private Integer limit;
    
    
    
    private Long offset;
    
    
    
    private Long count;
    
    
    
    private Long total;
    
    
    
    private java.util.List<com.commercetools.importapi.models.importoperations.ImportOperation> results;

    
    /**
     *  <p>Number of results requested.</p>
     * @param limit value to be set
     * @return Builder
     */
    
    public ImportOperationPagedResponseBuilder limit( final Integer limit) {
        this.limit = limit;
        return this;
    }
    
    
    
    
    /**
     *  <p>Number of elements skipped.</p>
     * @param offset value to be set
     * @return Builder
     */
    
    public ImportOperationPagedResponseBuilder offset( final Long offset) {
        this.offset = offset;
        return this;
    }
    
    
    
    
    /**
     *  <p>The actual number of results returned.</p>
     * @param count value to be set
     * @return Builder
     */
    
    public ImportOperationPagedResponseBuilder count( final Long count) {
        this.count = count;
        return this;
    }
    
    
    
    
    /**
     *  <p>The total number of import operations matching the query.</p>
     * @param total value to be set
     * @return Builder
     */
    
    public ImportOperationPagedResponseBuilder total( final Long total) {
        this.total = total;
        return this;
    }
    
    
    
    /**
     *  <p>The array of Import Operations matching the query.</p>
     * @param results value to be set
     * @return Builder
     */
    
    public ImportOperationPagedResponseBuilder results( final com.commercetools.importapi.models.importoperations.ImportOperation ...results) {
        this.results = new ArrayList<>(Arrays.asList(results));
        return this;
    }
    
    /**
     *  <p>The array of Import Operations matching the query.</p>
     * @param results value to be set
     * @return Builder
     */
    
    public ImportOperationPagedResponseBuilder results( final java.util.List<com.commercetools.importapi.models.importoperations.ImportOperation> results) {
        this.results = results;
        return this;
    }
    
    /**
     *  <p>The array of Import Operations matching the query.</p>
     * @param results value to be set
     * @return Builder
     */
    
    public ImportOperationPagedResponseBuilder plusResults( final com.commercetools.importapi.models.importoperations.ImportOperation ...results) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.addAll(Arrays.asList(results));
        return this;
    }
    
    
    
    /**
     *  <p>The array of Import Operations matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */
    
    public ImportOperationPagedResponseBuilder plusResults(Function<com.commercetools.importapi.models.importoperations.ImportOperationBuilder, com.commercetools.importapi.models.importoperations.ImportOperationBuilder> builder) {
        if (this.results == null) {
            this.results = new ArrayList<>();
        }
        this.results.add(builder.apply(com.commercetools.importapi.models.importoperations.ImportOperationBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>The array of Import Operations matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */
    
    public ImportOperationPagedResponseBuilder withResults(Function<com.commercetools.importapi.models.importoperations.ImportOperationBuilder, com.commercetools.importapi.models.importoperations.ImportOperationBuilder> builder) {
        this.results = new ArrayList<>();
        this.results.add(builder.apply(com.commercetools.importapi.models.importoperations.ImportOperationBuilder.of()).build());
        return this;
    }
    
    /**
     *  <p>The array of Import Operations matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */
    
    public ImportOperationPagedResponseBuilder addResults(Function<com.commercetools.importapi.models.importoperations.ImportOperationBuilder, com.commercetools.importapi.models.importoperations.ImportOperation> builder) {
        return plusResults(builder.apply(com.commercetools.importapi.models.importoperations.ImportOperationBuilder.of()));
    }
    
    /**
     *  <p>The array of Import Operations matching the query.</p>
     * @param builder function to build the results value
     * @return Builder
     */
    
    public ImportOperationPagedResponseBuilder setResults(Function<com.commercetools.importapi.models.importoperations.ImportOperationBuilder, com.commercetools.importapi.models.importoperations.ImportOperation> builder) {
        return results(builder.apply(com.commercetools.importapi.models.importoperations.ImportOperationBuilder.of()));
    }
                    

    /**
     *  <p>Number of results requested.</p>
     * @return limit
     */
    
    
    public Integer getLimit(){
        return this.limit;
    }
    
    /**
     *  <p>Number of elements skipped.</p>
     * @return offset
     */
    
    
    public Long getOffset(){
        return this.offset;
    }
    
    /**
     *  <p>The actual number of results returned.</p>
     * @return count
     */
    
    
    public Long getCount(){
        return this.count;
    }
    
    /**
     *  <p>The total number of import operations matching the query.</p>
     * @return total
     */
    
    
    public Long getTotal(){
        return this.total;
    }
    
    /**
     *  <p>The array of Import Operations matching the query.</p>
     * @return results
     */
    
    
    public java.util.List<com.commercetools.importapi.models.importoperations.ImportOperation> getResults(){
        return this.results;
    }

    /**
     * builds ImportOperationPagedResponse with checking for non-null required values
     * @return ImportOperationPagedResponse
     */
    public ImportOperationPagedResponse build() {
        Objects.requireNonNull(limit, ImportOperationPagedResponse.class + ": limit is missing");
        Objects.requireNonNull(offset, ImportOperationPagedResponse.class + ": offset is missing");
        Objects.requireNonNull(count, ImportOperationPagedResponse.class + ": count is missing");
        Objects.requireNonNull(total, ImportOperationPagedResponse.class + ": total is missing");
        Objects.requireNonNull(results, ImportOperationPagedResponse.class + ": results is missing");
        return new ImportOperationPagedResponseImpl(limit, offset, count, total, results);
    }
    
    /**
     * builds ImportOperationPagedResponse without checking for non-null required values
     * @return ImportOperationPagedResponse
     */
    public ImportOperationPagedResponse buildUnchecked() {
        return new ImportOperationPagedResponseImpl(limit, offset, count, total, results);
    }

    /**
     * factory method for an instance of ImportOperationPagedResponseBuilder
     * @return builder 
     */
    public static ImportOperationPagedResponseBuilder of() {
        return new ImportOperationPagedResponseBuilder();
    }

    /**
     * create builder for ImportOperationPagedResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ImportOperationPagedResponseBuilder of(final ImportOperationPagedResponse template) {
        ImportOperationPagedResponseBuilder builder = new ImportOperationPagedResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.total = template.getTotal();
        builder.results = template.getResults();
        return builder;
    }

}
