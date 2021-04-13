
package com.commercetools.history.models.common;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ItemShippingDetailsImpl.class)
public interface ItemShippingDetails {

    @NotNull
    @Valid
    @JsonProperty("targets")
    public List<ItemShippingTarget> getTargets();

    /**
    *  <p>true if the quantity of the (custom) line item is equal to the sum of the sub-quantities in <code>targets</code>, <code>false</code> otherwise. A cart cannot be ordered when the value is <code>false</code>. The error InvalidItemShippingDetails will be triggered.</p>
    */
    @NotNull
    @JsonProperty("valid")
    public Boolean getValid();

    @JsonIgnore
    public void setTargets(final ItemShippingTarget... targets);

    public void setTargets(final List<ItemShippingTarget> targets);

    public void setValid(final Boolean valid);

    public static ItemShippingDetails of() {
        return new ItemShippingDetailsImpl();
    }

    public static ItemShippingDetails of(final ItemShippingDetails template) {
        ItemShippingDetailsImpl instance = new ItemShippingDetailsImpl();
        instance.setTargets(template.getTargets());
        instance.setValid(template.getValid());
        return instance;
    }

    public static ItemShippingDetailsBuilder builder() {
        return ItemShippingDetailsBuilder.of();
    }

    public static ItemShippingDetailsBuilder builder(final ItemShippingDetails template) {
        return ItemShippingDetailsBuilder.of(template);
    }

    default <T> T withItemShippingDetails(Function<ItemShippingDetails, T> helper) {
        return helper.apply(this);
    }
}
