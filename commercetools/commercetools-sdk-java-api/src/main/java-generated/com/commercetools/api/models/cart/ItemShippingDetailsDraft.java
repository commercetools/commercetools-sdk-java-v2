
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ItemShippingDetailsDraftImpl.class)
public interface ItemShippingDetailsDraft {

    /**
    *  <p>Used to capture one or more (custom) line item specific shipping addresses.
    *  By specifying sub-quantities, it is possible to set multiple shipping addresses for one line item.
    *  A cart can have <code>shippingDetails</code> where the <code>targets</code> sum does not match the quantity of the line item or custom line item.
    *  For the order creation and order updates the <code>targets</code> sum must match the quantity.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("targets")
    public List<ItemShippingTarget> getTargets();

    @JsonIgnore
    public void setTargets(final ItemShippingTarget... targets);

    public void setTargets(final List<ItemShippingTarget> targets);

    public static ItemShippingDetailsDraft of() {
        return new ItemShippingDetailsDraftImpl();
    }

    public static ItemShippingDetailsDraft of(final ItemShippingDetailsDraft template) {
        ItemShippingDetailsDraftImpl instance = new ItemShippingDetailsDraftImpl();
        instance.setTargets(template.getTargets());
        return instance;
    }

    public static ItemShippingDetailsDraftBuilder builder() {
        return ItemShippingDetailsDraftBuilder.of();
    }

    public static ItemShippingDetailsDraftBuilder builder(final ItemShippingDetailsDraft template) {
        return ItemShippingDetailsDraftBuilder.of(template);
    }

    default <T> T withItemShippingDetailsDraft(Function<ItemShippingDetailsDraft, T> helper) {
        return helper.apply(this);
    }
}
