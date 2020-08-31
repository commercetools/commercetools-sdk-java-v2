package com.commercetools.importapi.models.errors;

import com.commercetools.importapi.models.errors.ErrorObject;
import com.commercetools.importapi.models.errors.GenericError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class GenericErrorBuilder {

    
    private String message;

    public GenericErrorBuilder message( final String message) {
        this.message = message;
        return this;
    }

    
    public String getMessage(){
        return this.message;
    }

    public GenericError build() {
        return new GenericErrorImpl(message);
    }

    public static GenericErrorBuilder of() {
        return new GenericErrorBuilder();
    }

    public static GenericErrorBuilder of(final GenericError template) {
        GenericErrorBuilder builder = new GenericErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
