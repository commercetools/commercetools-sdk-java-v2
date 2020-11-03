package com.commercetools.importapi.models.errors;

import com.commercetools.importapi.models.errors.ErrorObject;
import com.commercetools.importapi.models.errors.InvalidOperation;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class InvalidOperationBuilder {

    
    private String message;

    public InvalidOperationBuilder message( final String message) {
        this.message = message;
        return this;
    }

    
    public String getMessage(){
        return this.message;
    }

    public InvalidOperation build() {
        return new InvalidOperationImpl(message);
    }

    public static InvalidOperationBuilder of() {
        return new InvalidOperationBuilder();
    }

    public static InvalidOperationBuilder of(final InvalidOperation template) {
        InvalidOperationBuilder builder = new InvalidOperationBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
