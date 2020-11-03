package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.InvalidSubjectError;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class InvalidSubjectErrorBuilder {

    
    private String message;

    public InvalidSubjectErrorBuilder message( final String message) {
        this.message = message;
        return this;
    }

    
    public String getMessage(){
        return this.message;
    }

    public InvalidSubjectError build() {
        return new InvalidSubjectErrorImpl(message);
    }

    public static InvalidSubjectErrorBuilder of() {
        return new InvalidSubjectErrorBuilder();
    }

    public static InvalidSubjectErrorBuilder of(final InvalidSubjectError template) {
        InvalidSubjectErrorBuilder builder = new InvalidSubjectErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
