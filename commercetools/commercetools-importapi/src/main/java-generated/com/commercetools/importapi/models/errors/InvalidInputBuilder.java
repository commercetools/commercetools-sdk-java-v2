package com.commercetools.importapi.models.errors;

import com.commercetools.importapi.models.errors.ErrorObject;
import com.commercetools.importapi.models.errors.InvalidInput;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class InvalidInputBuilder {

    
    private String message;

    public InvalidInputBuilder message( final String message) {
        this.message = message;
        return this;
    }

    
    public String getMessage(){
        return this.message;
    }

    public InvalidInput build() {
        return new InvalidInputImpl(message);
    }

    public static InvalidInputBuilder of() {
        return new InvalidInputBuilder();
    }

    public static InvalidInputBuilder of(final InvalidInput template) {
        InvalidInputBuilder builder = new InvalidInputBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
