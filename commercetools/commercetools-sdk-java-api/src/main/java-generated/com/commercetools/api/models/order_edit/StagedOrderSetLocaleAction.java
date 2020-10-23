package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.commercetools.api.models.order_edit.StagedOrderSetLocaleActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;
import java.util.function.Function;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = StagedOrderSetLocaleActionImpl.class)
public interface StagedOrderSetLocaleAction extends StagedOrderUpdateAction {

    
    
    @JsonProperty("locale")
    public String getLocale();

    public void setLocale(final String locale);

    public static StagedOrderSetLocaleActionImpl of(){
        return new StagedOrderSetLocaleActionImpl();
    }
    

    public static StagedOrderSetLocaleActionImpl of(final StagedOrderSetLocaleAction template) {
        StagedOrderSetLocaleActionImpl instance = new StagedOrderSetLocaleActionImpl();
        instance.setLocale(template.getLocale());
        return instance;
    }

    default <T> T withStagedOrderSetLocaleAction(Function<StagedOrderSetLocaleAction, T> helper) {
        return helper.apply(this);
    }
}
