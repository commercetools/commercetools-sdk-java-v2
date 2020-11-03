package com.commercetools.importapi.models.orders;

import com.commercetools.importapi.models.orders.ItemShippingTarget;
import com.commercetools.importapi.models.orders.ItemShippingDetailsDraftImpl;

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
@JsonDeserialize(as = ItemShippingDetailsDraftImpl.class)
public interface ItemShippingDetailsDraft  {

    /**
    *  <p>Maps to <code>ItemShippingDetailsDraft.targets</code>.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("targets")
    public List<ItemShippingTarget> getTargets();

    @JsonIgnore
    public void setTargets(final ItemShippingTarget ...targets);
    public void setTargets(final List<ItemShippingTarget> targets);

    public static ItemShippingDetailsDraftImpl of(){
        return new ItemShippingDetailsDraftImpl();
    }
    

    public static ItemShippingDetailsDraftImpl of(final ItemShippingDetailsDraft template) {
        ItemShippingDetailsDraftImpl instance = new ItemShippingDetailsDraftImpl();
        instance.setTargets(template.getTargets());
        return instance;
    }

    default <T> T withItemShippingDetailsDraft(Function<ItemShippingDetailsDraft, T> helper) {
        return helper.apply(this);
    }
}
