package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.state.StateReference;
import com.commercetools.api.models.message.ProductStateTransitionMessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductStateTransitionMessagePayloadBuilder {

    
    private com.commercetools.api.models.state.StateReference state;
    
    
    private Boolean force;

    public ProductStateTransitionMessagePayloadBuilder state( final com.commercetools.api.models.state.StateReference state) {
        this.state = state;
        return this;
    }
    
    public ProductStateTransitionMessagePayloadBuilder force( final Boolean force) {
        this.force = force;
        return this;
    }

    
    public com.commercetools.api.models.state.StateReference getState(){
        return this.state;
    }
    
    
    public Boolean getForce(){
        return this.force;
    }

    public ProductStateTransitionMessagePayload build() {
        return new ProductStateTransitionMessagePayloadImpl(state, force);
    }

    public static ProductStateTransitionMessagePayloadBuilder of() {
        return new ProductStateTransitionMessagePayloadBuilder();
    }

    public static ProductStateTransitionMessagePayloadBuilder of(final ProductStateTransitionMessagePayload template) {
        ProductStateTransitionMessagePayloadBuilder builder = new ProductStateTransitionMessagePayloadBuilder();
        builder.state = template.getState();
        builder.force = template.getForce();
        return builder;
    }

}
