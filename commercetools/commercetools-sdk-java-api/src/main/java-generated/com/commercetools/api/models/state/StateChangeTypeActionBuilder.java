package com.commercetools.api.models.state;

import com.commercetools.api.models.state.StateTypeEnum;
import com.commercetools.api.models.state.StateUpdateAction;
import com.commercetools.api.models.state.StateChangeTypeAction;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class StateChangeTypeActionBuilder {

    
    private com.commercetools.api.models.state.StateTypeEnum type;

    public StateChangeTypeActionBuilder type( final com.commercetools.api.models.state.StateTypeEnum type) {
        this.type = type;
        return this;
    }

    
    public com.commercetools.api.models.state.StateTypeEnum getType(){
        return this.type;
    }

    public StateChangeTypeAction build() {
        return new StateChangeTypeActionImpl(type);
    }

    public static StateChangeTypeActionBuilder of() {
        return new StateChangeTypeActionBuilder();
    }

    public static StateChangeTypeActionBuilder of(final StateChangeTypeAction template) {
        StateChangeTypeActionBuilder builder = new StateChangeTypeActionBuilder();
        builder.type = template.getType();
        return builder;
    }

}
