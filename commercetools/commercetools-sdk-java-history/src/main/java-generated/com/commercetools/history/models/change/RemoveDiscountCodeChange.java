
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.DiscountCodeInfo;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = RemoveDiscountCodeChangeImpl.class)
public interface RemoveDiscountCodeChange extends Change {

    String REMOVE_DISCOUNT_CODE_CHANGE = "RemoveDiscountCodeChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>removeDiscountCode</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public DiscountCodeInfo getPreviousValue();

    public void setChange(final String change);

    public void setPreviousValue(final DiscountCodeInfo previousValue);

    public static RemoveDiscountCodeChange of() {
        return new RemoveDiscountCodeChangeImpl();
    }

    public static RemoveDiscountCodeChange of(final RemoveDiscountCodeChange template) {
        RemoveDiscountCodeChangeImpl instance = new RemoveDiscountCodeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static RemoveDiscountCodeChangeBuilder builder() {
        return RemoveDiscountCodeChangeBuilder.of();
    }

    public static RemoveDiscountCodeChangeBuilder builder(final RemoveDiscountCodeChange template) {
        return RemoveDiscountCodeChangeBuilder.of(template);
    }

    default <T> T withRemoveDiscountCodeChange(Function<RemoveDiscountCodeChange, T> helper) {
        return helper.apply(this);
    }
}
