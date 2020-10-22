package com.commercetools.api.models.order_edit;

import com.commercetools.api.models.order_edit.OrderEditUpdateAction;
import com.commercetools.api.models.order_edit.OrderEditUpdateImpl;

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
@JsonDeserialize(as = OrderEditUpdateImpl.class)
public interface OrderEditUpdate  {

    
    @NotNull
    @JsonProperty("version")
    public Long getVersion();
    
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<OrderEditUpdateAction> getActions();
    
    
    @JsonProperty("dryRun")
    public Boolean getDryRun();

    public void setVersion(final Long version);
    
    public void setActions(final List<OrderEditUpdateAction> actions);
    
    public void setDryRun(final Boolean dryRun);

    public static OrderEditUpdateImpl of(){
        return new OrderEditUpdateImpl();
    }
    

    public static OrderEditUpdateImpl of(final OrderEditUpdate template) {
        OrderEditUpdateImpl instance = new OrderEditUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        instance.setDryRun(template.getDryRun());
        return instance;
    }

    default <T extends Accessor<OrderEditUpdate>> T withOrderEditUpdate(Function<OrderEditUpdate, T> helper) {
        return helper.apply(this);
    }
}
