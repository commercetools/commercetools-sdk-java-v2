package com.commercetools.api.models.message;

import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.state.StateReference;
import com.commercetools.api.models.message.ProductStateTransitionMessagePayloadImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProductStateTransitionMessagePayloadImpl.class)
public interface ProductStateTransitionMessagePayload extends MessagePayload {

    
    @NotNull
    @Valid
    @JsonProperty("state")
    public StateReference getState();
    
    @NotNull
    @JsonProperty("force")
    public Boolean getForce();

    public void setState(final StateReference state);
    
    public void setForce(final Boolean force);

    public static ProductStateTransitionMessagePayloadImpl of(){
        return new ProductStateTransitionMessagePayloadImpl();
    }
    

    public static ProductStateTransitionMessagePayloadImpl of(final ProductStateTransitionMessagePayload template) {
        ProductStateTransitionMessagePayloadImpl instance = new ProductStateTransitionMessagePayloadImpl();
        instance.setState(template.getState());
        instance.setForce(template.getForce());
        return instance;
    }

}
