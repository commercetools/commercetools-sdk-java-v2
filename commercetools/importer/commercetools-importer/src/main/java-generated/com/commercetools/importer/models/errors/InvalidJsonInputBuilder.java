package com.commercetools.importer.models.errors;

import com.commercetools.importer.models.errors.ErrorObject;
import com.commercetools.importer.models.errors.InvalidJsonInput;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class InvalidJsonInputBuilder {

    
    private String message;

    public InvalidJsonInputBuilder message( final String message) {
        this.message = message;
        return this;
    }

    
    public String getMessage(){
        return this.message;
    }

    public InvalidJsonInput build() {
        return new InvalidJsonInputImpl(message);
    }

    public static InvalidJsonInputBuilder of() {
        return new InvalidJsonInputBuilder();
    }

    public static InvalidJsonInputBuilder of(final InvalidJsonInput template) {
        InvalidJsonInputBuilder builder = new InvalidJsonInputBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
