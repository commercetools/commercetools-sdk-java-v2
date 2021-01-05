package com.commercetools.api.models.discount_code;

import com.commercetools.api.models.discount_code.DiscountCodeUpdateAction;
import com.commercetools.api.models.discount_code.DiscountCodeUpdateImpl;

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
@JsonDeserialize(as = DiscountCodeUpdateImpl.class)
public interface DiscountCodeUpdate extends com.commercetools.api.models.ResourceUpdate<DiscountCodeUpdate, DiscountCodeUpdateAction> {

    
    @NotNull
    @JsonProperty("version")
    public Long getVersion();
    
    @NotNull
    @Valid
    @JsonProperty("actions")
    public List<DiscountCodeUpdateAction> getActions();

    public void setVersion(final Long version);
    
    @JsonIgnore
    public void setActions(final DiscountCodeUpdateAction ...actions);
    public void setActions(final List<DiscountCodeUpdateAction> actions);

    public static DiscountCodeUpdate of(){
        return new DiscountCodeUpdateImpl();
    }
    

    public static DiscountCodeUpdate of(final DiscountCodeUpdate template) {
        DiscountCodeUpdateImpl instance = new DiscountCodeUpdateImpl();
        instance.setVersion(template.getVersion());
        instance.setActions(template.getActions());
        return instance;
    }

    public static DiscountCodeUpdateBuilder builder(){
        return DiscountCodeUpdateBuilder.of();
    }
    
    public static DiscountCodeUpdateBuilder builder(final DiscountCodeUpdate template){
        return DiscountCodeUpdateBuilder.of(template);
    }
    

    default <T> T withDiscountCodeUpdate(Function<DiscountCodeUpdate, T> helper) {
        return helper.apply(this);
    }
}
