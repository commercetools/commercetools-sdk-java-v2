package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.QueryTimedOutError;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class QueryTimedOutErrorBuilder {

    
    private String message;

    public QueryTimedOutErrorBuilder message( final String message) {
        this.message = message;
        return this;
    }

    
    public String getMessage(){
        return this.message;
    }

    public QueryTimedOutError build() {
        return new QueryTimedOutErrorImpl(message);
    }

    public static QueryTimedOutErrorBuilder of() {
        return new QueryTimedOutErrorBuilder();
    }

    public static QueryTimedOutErrorBuilder of(final QueryTimedOutError template) {
        QueryTimedOutErrorBuilder builder = new QueryTimedOutErrorBuilder();
        builder.message = template.getMessage();
        return builder;
    }

}
