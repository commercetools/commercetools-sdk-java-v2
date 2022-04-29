
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ProjectSetShippingRateInputTypeActionImpl.class)
public interface ProjectSetShippingRateInputTypeAction extends ProjectUpdateAction {

    String SET_SHIPPING_RATE_INPUT_TYPE = "setShippingRateInputType";

    /**
    *  <p>Value to set. If empty, any existing value will be removed.</p>
    */
    @Valid
    @JsonProperty("shippingRateInputType")
    public ShippingRateInputType getShippingRateInputType();

    public void setShippingRateInputType(final ShippingRateInputType shippingRateInputType);

    public static ProjectSetShippingRateInputTypeAction of() {
        return new ProjectSetShippingRateInputTypeActionImpl();
    }

    public static ProjectSetShippingRateInputTypeAction of(final ProjectSetShippingRateInputTypeAction template) {
        ProjectSetShippingRateInputTypeActionImpl instance = new ProjectSetShippingRateInputTypeActionImpl();
        instance.setShippingRateInputType(template.getShippingRateInputType());
        return instance;
    }

    public static ProjectSetShippingRateInputTypeActionBuilder builder() {
        return ProjectSetShippingRateInputTypeActionBuilder.of();
    }

    public static ProjectSetShippingRateInputTypeActionBuilder builder(
            final ProjectSetShippingRateInputTypeAction template) {
        return ProjectSetShippingRateInputTypeActionBuilder.of(template);
    }

    default <T> T withProjectSetShippingRateInputTypeAction(Function<ProjectSetShippingRateInputTypeAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ProjectSetShippingRateInputTypeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ProjectSetShippingRateInputTypeAction>() {
            @Override
            public String toString() {
                return "TypeReference<ProjectSetShippingRateInputTypeAction>";
            }
        };
    }
}
