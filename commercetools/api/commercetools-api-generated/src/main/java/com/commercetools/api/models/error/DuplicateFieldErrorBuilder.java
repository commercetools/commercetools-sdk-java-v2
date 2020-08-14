package com.commercetools.api.models.error;

import com.commercetools.api.models.common.Reference;
import com.commercetools.api.models.error.ErrorObject;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.error.DuplicateFieldError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DuplicateFieldErrorBuilder {

    
    private String message;
    
    @Nullable
    private String field;
    
    @Nullable
    private com.fasterxml.jackson.databind.JsonNode duplicateValue;
    
    @Nullable
    private com.commercetools.api.models.common.Reference conflictingResource;

    public DuplicateFieldErrorBuilder message( final String message) {
        this.message = message;
        return this;
    }
    
    public DuplicateFieldErrorBuilder field(@Nullable final String field) {
        this.field = field;
        return this;
    }
    
    public DuplicateFieldErrorBuilder duplicateValue(@Nullable final com.fasterxml.jackson.databind.JsonNode duplicateValue) {
        this.duplicateValue = duplicateValue;
        return this;
    }
    
    public DuplicateFieldErrorBuilder conflictingResource(@Nullable final com.commercetools.api.models.common.Reference conflictingResource) {
        this.conflictingResource = conflictingResource;
        return this;
    }

    
    public String getMessage(){
        return this.message;
    }
    
    @Nullable
    public String getField(){
        return this.field;
    }
    
    @Nullable
    public com.fasterxml.jackson.databind.JsonNode getDuplicateValue(){
        return this.duplicateValue;
    }
    
    @Nullable
    public com.commercetools.api.models.common.Reference getConflictingResource(){
        return this.conflictingResource;
    }

    public DuplicateFieldError build() {
        return new DuplicateFieldErrorImpl(message, field, duplicateValue, conflictingResource);
    }

    public static DuplicateFieldErrorBuilder of() {
        return new DuplicateFieldErrorBuilder();
    }

    public static DuplicateFieldErrorBuilder of(final DuplicateFieldError template) {
        DuplicateFieldErrorBuilder builder = new DuplicateFieldErrorBuilder();
        builder.message = template.getMessage();
        builder.field = template.getField();
        builder.duplicateValue = template.getDuplicateValue();
        builder.conflictingResource = template.getConflictingResource();
        return builder;
    }

}
