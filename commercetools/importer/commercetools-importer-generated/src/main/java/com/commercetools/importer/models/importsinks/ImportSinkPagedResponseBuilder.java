package com.commercetools.importer.models.importsinks;

import com.commercetools.importer.models.importsinks.ImportSink;
import com.commercetools.importer.models.importsinks.ImportSinkPagedResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ImportSinkPagedResponseBuilder {

    
    private Double limit;
    
    
    private Double offset;
    
    
    private Double count;
    
    
    private java.util.List<com.commercetools.importer.models.importsinks.ImportSink> results;

    public ImportSinkPagedResponseBuilder limit( final Double limit) {
        this.limit = limit;
        return this;
    }
    
    public ImportSinkPagedResponseBuilder offset( final Double offset) {
        this.offset = offset;
        return this;
    }
    
    public ImportSinkPagedResponseBuilder count( final Double count) {
        this.count = count;
        return this;
    }
    
    public ImportSinkPagedResponseBuilder results( final java.util.List<com.commercetools.importer.models.importsinks.ImportSink> results) {
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
    
    
    public java.util.List<com.commercetools.importer.models.importsinks.ImportSink> getResults(){
        return this.results;
    }

    public ImportSinkPagedResponse build() {
        return new ImportSinkPagedResponseImpl(limit, offset, count, results);
    }

    public static ImportSinkPagedResponseBuilder of() {
        return new ImportSinkPagedResponseBuilder();
    }

    public static ImportSinkPagedResponseBuilder of(final ImportSinkPagedResponse template) {
        ImportSinkPagedResponseBuilder builder = new ImportSinkPagedResponseBuilder();
        builder.limit = template.getLimit();
        builder.offset = template.getOffset();
        builder.count = template.getCount();
        builder.results = template.getResults();
        return builder;
    }

}
