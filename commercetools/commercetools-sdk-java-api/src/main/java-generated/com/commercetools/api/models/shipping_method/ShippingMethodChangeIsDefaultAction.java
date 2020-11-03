package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.shipping_method.ShippingMethodUpdateAction;
import com.commercetools.api.models.shipping_method.ShippingMethodChangeIsDefaultActionImpl;

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
@JsonDeserialize(as = ShippingMethodChangeIsDefaultActionImpl.class)
public interface ShippingMethodChangeIsDefaultAction extends ShippingMethodUpdateAction {

    /**
    *  <p>Only one ShippingMethod in a project can be default.</p>
    */
    @NotNull
    @JsonProperty("isDefault")
    public Boolean getIsDefault();

    public void setIsDefault(final Boolean isDefault);

    public static ShippingMethodChangeIsDefaultActionImpl of(){
        return new ShippingMethodChangeIsDefaultActionImpl();
    }
    

    public static ShippingMethodChangeIsDefaultActionImpl of(final ShippingMethodChangeIsDefaultAction template) {
        ShippingMethodChangeIsDefaultActionImpl instance = new ShippingMethodChangeIsDefaultActionImpl();
        instance.setIsDefault(template.getIsDefault());
        return instance;
    }

    default <T> T withShippingMethodChangeIsDefaultAction(Function<ShippingMethodChangeIsDefaultAction, T> helper) {
        return helper.apply(this);
    }
}
