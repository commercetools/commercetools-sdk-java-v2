package com.commercetools.importer.models.errors;

import com.commercetools.importer.models.errors.ErrorObject;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.importer.models.errors.ResourceNotFoundError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ResourceNotFoundErrorBuilder {

    
    private String message;
    
    @Nullable
    private com.fasterxml.jackson.databind.JsonNode resource;

    public ResourceNotFoundErrorBuilder message( final String message) {
        this.message = message;
        return this;
    }
    
    public ResourceNotFoundErrorBuilder resource(@Nullable final com.fasterxml.jackson.databind.JsonNode resource) {
        this.resource = resource;
        return this;
    }

    
    public String getMessage(){
        return this.message;
    }
    
    @Nullable
    public com.fasterxml.jackson.databind.JsonNode getResource(){
        return this.resource;
    }

    public ResourceNotFoundError build() {
        return new ResourceNotFoundErrorImpl(message, resource);
    }

    public static ResourceNotFoundErrorBuilder of() {
        return new ResourceNotFoundErrorBuilder();
    }

    public static ResourceNotFoundErrorBuilder of(final ResourceNotFoundError template) {
        ResourceNotFoundErrorBuilder builder = new ResourceNotFoundErrorBuilder();
        builder.message = template.getMessage();
        builder.resource = template.getResource();
        return builder;
    }

}
