
package com.commercetools.api.models.product;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.state.StateResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProductTransitionStateActionImpl.class)
public interface ProductTransitionStateAction extends ProductUpdateAction {

    String TRANSITION_STATE = "transitionState";

    @Valid
    @JsonProperty("state")
    public StateResourceIdentifier getState();

    @JsonProperty("force")
    public Boolean getForce();

    public void setState(final StateResourceIdentifier state);

    public void setForce(final Boolean force);

    public static ProductTransitionStateAction of() {
        return new ProductTransitionStateActionImpl();
    }

    public static ProductTransitionStateAction of(final ProductTransitionStateAction template) {
        ProductTransitionStateActionImpl instance = new ProductTransitionStateActionImpl();
        instance.setState(template.getState());
        instance.setForce(template.getForce());
        return instance;
    }

    public static ProductTransitionStateActionBuilder builder() {
        return ProductTransitionStateActionBuilder.of();
    }

    public static ProductTransitionStateActionBuilder builder(final ProductTransitionStateAction template) {
        return ProductTransitionStateActionBuilder.of(template);
    }

    default <T> T withProductTransitionStateAction(Function<ProductTransitionStateAction, T> helper) {
        return helper.apply(this);
    }
}
