package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.AnonymousIdAlreadyInUseError;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class AnonymousIdAlreadyInUseErrorBuilder {

    
    private String message;

    public AnonymousIdAlreadyInUseErrorBuilder message( final String message) {
        this.message = message;
        return this;
    }

    
    public String getMessage(){
        return this.message;
    }

    public AnonymousIdAlreadyInUseError build() {
        return new AnonymousIdAlreadyInUseErrorImpl(message);
    }

    public static AnonymousIdAlreadyInUseErrorBuilder of() {
        return new AnonymousIdAlreadyInUseErrorBuilder();
    }

    public static AnonymousIdAlreadyInUseErrorBuilder of(final AnonymousIdAlreadyInUseError template) {
        AnonymousIdAlreadyInUseErrorBuilder builder = new AnonymousIdAlreadyInUseErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
