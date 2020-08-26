package com.commercetools.importapi.models.errors;

import com.commercetools.importapi.models.errors.ErrorObject;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.importapi.models.errors.ResourceCreationError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ResourceCreationErrorBuilder {

    
    private String message;
    
    @Nullable
    private com.fasterxml.jackson.databind.JsonNode resource;

    public ResourceCreationErrorBuilder message( final String message) {
        this.message = message;
        return this;
    }
    
    public ResourceCreationErrorBuilder resource(@Nullable final com.fasterxml.jackson.databind.JsonNode resource) {
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

    public ResourceCreationError build() {
        return new ResourceCreationErrorImpl(message, resource);
    }

    public static ResourceCreationErrorBuilder of() {
        return new ResourceCreationErrorBuilder();
    }

    public static ResourceCreationErrorBuilder of(final ResourceCreationError template) {
        ResourceCreationErrorBuilder builder = new ResourceCreationErrorBuilder();
        builder.message = template.getMessage();
        builder.resource = template.getResource();
        return builder;
    }

}
