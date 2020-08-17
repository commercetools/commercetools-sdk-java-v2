package com.commercetools.importer.models.importoperations;

import com.commercetools.importer.models.importoperations.ImportOperation;
import com.commercetools.importer.models.importoperations.ImportOperationPagedResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ImportOperationPagedResponseBuilder {

    
    private Double limit;
    
    
    private Double offset;
    
    
    private Double count;
    
    
    private java.util.List<com.commercetools.importer.models.importoperations.ImportOperation> results;

    public ImportOperationPagedResponseBuilder limit( final Double limit) {
        this.limit = limit;
        return this;
    }
    
    public ImportOperationPagedResponseBuilder offset( final Double offset) {
        this.offset = offset;
        return this;
    }
    
    public ImportOperationPagedResponseBuilder count( final Double count) {
        this.count = count;
        return this;
    }
    
    public ImportOperationPagedResponseBuilder results( final java.util.List<com.commercetools.importer.models.importoperations.ImportOperation> results) {
        this.results = results;
        return this;
    }

    
    public Double getLimit(){
        return this.limit;
    }
    
    
    public Double getOffset(){
        return this.offset;
    }
    
    
    public Double getCount(){
        return this.count;
    }
    
    
    public java.util.List<com.commercetools.importer.models.importoperations.ImportOperation> getResults(){
        return this.results;
    }

    public ImportOperationPagedResponse build() {
        return new ImportOperationPagedResponseImpl(limit, offset, count, results);
    }

    public static ImportOperationPagedResponseBuilder of() {
        return new ImportOperationPagedResponseBuilder();
    }

    public static ImportOperationPagedResponseBuilder of(final ImportOperationPagedResponse template) {
        ImportOperationPagedResponseBuilder builder = new ImportOperationPagedResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.results = template.getResults();
        return builder;
    }

}
