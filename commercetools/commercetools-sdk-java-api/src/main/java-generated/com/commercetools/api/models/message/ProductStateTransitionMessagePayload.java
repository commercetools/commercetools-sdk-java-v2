
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.state.StateReference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductStateTransitionMessagePayloadImpl.class)
public interface ProductStateTransitionMessagePayload extends MessagePayload {

    String PRODUCT_STATE_TRANSITION = "ProductStateTransition";

    @NotNull
    @Valid
    @JsonProperty("state")
    public StateReference getState();

    @NotNull
    @JsonProperty("force")
    public Boolean getForce();

    public void setState(final StateReference state);

    public void setForce(final Boolean force);

    public static ProductStateTransitionMessagePayload of() {
        return new ProductStateTransitionMessagePayloadImpl();
    }

    public static ProductStateTransitionMessagePayload of(final ProductStateTransitionMessagePayload template) {
        ProductStateTransitionMessagePayloadImpl instance = new ProductStateTransitionMessagePayloadImpl();
        instance.setState(template.getState());
        instance.setForce(template.getForce());
        return instance;
    }

    public static ProductStateTransitionMessagePayloadBuilder builder() {
        return ProductStateTransitionMessagePayloadBuilder.of();
    }

    public static ProductStateTransitionMessagePayloadBuilder builder(
            final ProductStateTransitionMessagePayload template) {
        return ProductStateTransitionMessagePayloadBuilder.of(template);
    }

    default <T> T withProductStateTransitionMessagePayload(Function<ProductStateTransitionMessagePayload, T> helper) {
        return helper.apply(this);
    }
}
