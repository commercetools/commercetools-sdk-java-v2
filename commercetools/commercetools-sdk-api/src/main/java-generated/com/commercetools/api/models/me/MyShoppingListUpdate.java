package com.commercetools.api.models.me;

import com.commercetools.api.models.me.MyShoppingListUpdateAction;
import com.commercetools.api.models.me.MyShoppingListUpdateImpl;

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
@JsonDeserialize(as = MyShoppingListUpdateImpl.class)
public interface MyShoppingListUpdate  {

    
    @NotNull
    @JsonProperty("version")
    public Long getVersion();
    
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<MyShoppingListUpdateAction> getActions();

    public void setVersion(final Long version);
    
    public void setActions(final List<MyShoppingListUpdateAction> actions);

    public static MyShoppingListUpdateImpl of(){
        return new MyShoppingListUpdateImpl();
    }
    

    public static MyShoppingListUpdateImpl of(final MyShoppingListUpdate template) {
        MyShoppingListUpdateImpl instance = new MyShoppingListUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

}
