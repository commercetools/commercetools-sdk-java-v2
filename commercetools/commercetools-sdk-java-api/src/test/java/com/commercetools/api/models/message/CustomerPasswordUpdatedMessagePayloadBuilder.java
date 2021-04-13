package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.CustomerPasswordUpdatedMessagePayload;
import javax.annotation.Nullable;
import java.util.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerPasswordUpdatedMessagePayloadBuilder {

    
    
    private Boolean reset;

    
    public CustomerPasswordUpdatedMessagePayloadBuilder reset( final Boolean reset) {
        this.reset = reset;
        return this;
    }

    
    
    public Boolean getReset(){
        return this.reset;
    }

    public CustomerPasswordUpdatedMessagePayload build() {
        return new CustomerPasswordUpdatedMessagePayloadImpl(reset);
    }

    public static CustomerPasswordUpdatedMessagePayloadBuilder of() {
        return new CustomerPasswordUpdatedMessagePayloadBuilder();
    }

    public static CustomerPasswordUpdatedMessagePayloadBuilder of(final CustomerPasswordUpdatedMessagePayload template) {
        CustomerPasswordUpdatedMessagePayloadBuilder builder = new CustomerPasswordUpdatedMessagePayloadBuilder();
        builder.reset = template.getReset();
        return builder;
    }

}
