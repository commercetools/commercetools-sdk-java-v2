package com.commercetools.importer.models.orders;

import com.commercetools.importer.models.orders.ItemShippingTarget;
import com.commercetools.importer.models.orders.ItemShippingDetailsDraftImpl;

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
@JsonDeserialize(as = ItemShippingDetailsDraftImpl.class)
public interface ItemShippingDetailsDraft  {

    /**
    *  <p>Maps to <code>ItemShippingDetailsDraft.targets</code>.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("targets")
    public List<ItemShippingTarget> getTargets();

    public void setTargets(final List<ItemShippingTarget> targets);

    public static ItemShippingDetailsDraftImpl of(){
        return new ItemShippingDetailsDraftImpl();
    }
    

    public static ItemShippingDetailsDraftImpl of(final ItemShippingDetailsDraft template) {
        ItemShippingDetailsDraftImpl instance = new ItemShippingDetailsDraftImpl();
        instance.setTargets(template.getTargets());
        return instance;
    }

}
