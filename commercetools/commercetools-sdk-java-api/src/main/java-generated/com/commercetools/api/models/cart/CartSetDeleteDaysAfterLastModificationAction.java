package com.commercetools.api.models.cart;

import com.commercetools.api.models.cart.CartUpdateAction;
import com.commercetools.api.models.cart.CartSetDeleteDaysAfterLastModificationActionImpl;

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
@JsonDeserialize(as = CartSetDeleteDaysAfterLastModificationActionImpl.class)
public interface CartSetDeleteDaysAfterLastModificationAction extends CartUpdateAction {

    
    
    @JsonProperty("deleteDaysAfterLastModification")
    public Integer getDeleteDaysAfterLastModification();

    public void setDeleteDaysAfterLastModification(final Integer deleteDaysAfterLastModification);

    public static CartSetDeleteDaysAfterLastModificationActionImpl of(){
        return new CartSetDeleteDaysAfterLastModificationActionImpl();
    }
    

    public static CartSetDeleteDaysAfterLastModificationActionImpl of(final CartSetDeleteDaysAfterLastModificationAction template) {
        CartSetDeleteDaysAfterLastModificationActionImpl instance = new CartSetDeleteDaysAfterLastModificationActionImpl();
        instance.setDeleteDaysAfterLastModification(template.getDeleteDaysAfterLastModification());
        return instance;
    }

    default <T> T withCartSetDeleteDaysAfterLastModificationAction(Function<CartSetDeleteDaysAfterLastModificationAction, T> helper) {
        return helper.apply(this);
    }
}
