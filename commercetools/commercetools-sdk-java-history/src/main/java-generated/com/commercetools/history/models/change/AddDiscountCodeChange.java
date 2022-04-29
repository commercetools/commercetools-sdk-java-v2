
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
@JsonDeserialize(as = AddDiscountCodeChangeImpl.class)
public interface AddDiscountCodeChange extends Change {

    String ADD_DISCOUNT_CODE_CHANGE = "AddDiscountCodeChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>addDiscountCode</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public DiscountCodeInfo getNextValue();

    public void setChange(final String change);

    public void setNextValue(final DiscountCodeInfo nextValue);

    public static AddDiscountCodeChange of() {
        return new AddDiscountCodeChangeImpl();
    }

    public static AddDiscountCodeChange of(final AddDiscountCodeChange template) {
        AddDiscountCodeChangeImpl instance = new AddDiscountCodeChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static AddDiscountCodeChangeBuilder builder() {
        return AddDiscountCodeChangeBuilder.of();
    }

    public static AddDiscountCodeChangeBuilder builder(final AddDiscountCodeChange template) {
        return AddDiscountCodeChangeBuilder.of(template);
    }

    default <T> T withAddDiscountCodeChange(Function<AddDiscountCodeChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<AddDiscountCodeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<AddDiscountCodeChange>() {
            @Override
            public String toString() {
                return "TypeReference<AddDiscountCodeChange>";
            }
        };
    }
}
