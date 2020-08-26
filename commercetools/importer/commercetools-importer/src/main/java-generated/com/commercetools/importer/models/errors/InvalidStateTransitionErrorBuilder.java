package com.commercetools.importer.models.errors;

import com.commercetools.importer.models.common.ProcessingState;
import com.commercetools.importer.models.errors.ErrorObject;
import com.commercetools.importer.models.errors.InvalidStateTransitionError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class InvalidStateTransitionErrorBuilder {

    
    private String message;
    
    
    private com.commercetools.importer.models.common.ProcessingState currentState;
    
    
    private com.commercetools.importer.models.common.ProcessingState newState;

    public InvalidStateTransitionErrorBuilder message( final String message) {
        this.message = message;
        return this;
    }
    
    public InvalidStateTransitionErrorBuilder currentState( final com.commercetools.importer.models.common.ProcessingState currentState) {
        this.currentState = currentState;
        return this;
    }
    
    public InvalidStateTransitionErrorBuilder newState( final com.commercetools.importer.models.common.ProcessingState newState) {
        this.newState = newState;
        return this;
    }

    
    public String getMessage(){
        return this.message;
    }
    
    
    public com.commercetools.importer.models.common.ProcessingState getCurrentState(){
        return this.currentState;
    }
    
    
    public com.commercetools.importer.models.common.ProcessingState getNewState(){
        return this.newState;
    }

    public InvalidStateTransitionError build() {
        return new InvalidStateTransitionErrorImpl(message, currentState, newState);
    }

    public static InvalidStateTransitionErrorBuilder of() {
        return new InvalidStateTransitionErrorBuilder();
    }

    public static InvalidStateTransitionErrorBuilder of(final InvalidStateTransitionError template) {
        InvalidStateTransitionErrorBuilder builder = new InvalidStateTransitionErrorBuilder();
        builder.message = template.getMessage();
        builder.currentState = template.getCurrentState();
        builder.newState = template.getNewState();
        return builder;
    }

}
