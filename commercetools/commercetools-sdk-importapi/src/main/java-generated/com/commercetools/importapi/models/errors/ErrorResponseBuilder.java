package com.commercetools.importapi.models.errors;

import com.commercetools.importapi.models.errors.ErrorObject;
import com.commercetools.importapi.models.errors.ErrorResponse;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ErrorResponseBuilder {

    
    private Integer statusCode;
    
    
    private String message;
    
    @Nullable
    private String error;
    
    @Nullable
    private String error_description;
    
    @Nullable
    private java.util.List<com.commercetools.importapi.models.errors.ErrorObject> errors;

    public ErrorResponseBuilder statusCode( final Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    public ErrorResponseBuilder message( final String message) {
        this.message = message;
        return this;
    }
    
    public ErrorResponseBuilder error(@Nullable final String error) {
        this.error = error;
        return this;
    }
    
    public ErrorResponseBuilder error_description(@Nullable final String error_description) {
        this.error_description = error_description;
        return this;
    }
    
    public ErrorResponseBuilder errors(@Nullable final java.util.List<com.commercetools.importapi.models.errors.ErrorObject> errors) {
        this.errors = errors;
        return this;
    }

    
    public Integer getStatusCode(){
        return this.statusCode;
    }
    
    
    public String getMessage(){
        return this.message;
    }
    
    @Nullable
    public String getError(){
        return this.error;
    }
    
    @Nullable
    public String getError_description(){
        return this.error_description;
    }
    
    @Nullable
    public java.util.List<com.commercetools.importapi.models.errors.ErrorObject> getErrors(){
        return this.errors;
    }

    public ErrorResponse build() {
        return new ErrorResponseImpl(statusCode, message, error, error_description, errors);
    }

    public static ErrorResponseBuilder of() {
        return new ErrorResponseBuilder();
    }

    public static ErrorResponseBuilder of(final ErrorResponse template) {
        ErrorResponseBuilder builder = new ErrorResponseBuilder();
        builder.statusCode = template.getStatusCode();
        builder.message = template.getMessage();
        builder.error = template.getError();
        builder.error_description = template.getErrorDescription();
        builder.errors = template.getErrors();
        return builder;
    }

}
