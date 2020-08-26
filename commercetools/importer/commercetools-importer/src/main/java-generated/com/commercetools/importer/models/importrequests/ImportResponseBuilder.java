package com.commercetools.importer.models.importrequests;

import com.commercetools.importer.models.importoperations.ImportOperationStatus;
import com.commercetools.importer.models.importrequests.ImportResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ImportResponseBuilder {

    
    private java.util.List<com.commercetools.importer.models.importoperations.ImportOperationStatus> operationStatus;

    public ImportResponseBuilder operationStatus( final java.util.List<com.commercetools.importer.models.importoperations.ImportOperationStatus> operationStatus) {
        this.operationStatus = operationStatus;
        return this;
    }

    
    public java.util.List<com.commercetools.importer.models.importoperations.ImportOperationStatus> getOperationStatus(){
        return this.operationStatus;
    }

    public ImportResponse build() {
        return new ImportResponseImpl(operationStatus);
    }

    public static ImportResponseBuilder of() {
        return new ImportResponseBuilder();
    }

    public static ImportResponseBuilder of(final ImportResponse template) {
        ImportResponseBuilder builder = new ImportResponseBuilder();
        builder.operationStatus = template.getOperationStatus();
        return builder;
    }

}
