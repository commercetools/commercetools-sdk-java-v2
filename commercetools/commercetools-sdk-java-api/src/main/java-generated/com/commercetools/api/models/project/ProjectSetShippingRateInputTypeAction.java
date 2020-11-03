package com.commercetools.api.models.project;

import com.commercetools.api.models.project.ProjectUpdateAction;
import com.commercetools.api.models.project.ShippingRateInputType;
import com.commercetools.api.models.project.ProjectSetShippingRateInputTypeActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ProjectSetShippingRateInputTypeActionImpl.class)
public interface ProjectSetShippingRateInputTypeAction extends ProjectUpdateAction {

    /**
    *  <p>If not set, removes existing shippingRateInputType.</p>
    */
    @Valid
    @JsonProperty("shippingRateInputType")
    public ShippingRateInputType getShippingRateInputType();

    public void setShippingRateInputType(final ShippingRateInputType shippingRateInputType);

    public static ProjectSetShippingRateInputTypeActionImpl of(){
        return new ProjectSetShippingRateInputTypeActionImpl();
    }
    

    public static ProjectSetShippingRateInputTypeActionImpl of(final ProjectSetShippingRateInputTypeAction template) {
        ProjectSetShippingRateInputTypeActionImpl instance = new ProjectSetShippingRateInputTypeActionImpl();
        instance.setShippingRateInputType(template.getShippingRateInputType());
        return instance;
    }

    default <T> T withProjectSetShippingRateInputTypeAction(Function<ProjectSetShippingRateInputTypeAction, T> helper) {
        return helper.apply(this);
    }
}
