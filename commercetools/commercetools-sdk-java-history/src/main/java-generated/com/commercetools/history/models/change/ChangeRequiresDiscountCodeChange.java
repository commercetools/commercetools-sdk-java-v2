
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeRequiresDiscountCodeChangeImpl.class)
public interface ChangeRequiresDiscountCodeChange extends Change {

    String CHANGE_REQUIRES_DISCOUNT_CODE_CHANGE = "ChangeRequiresDiscountCodeChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>changeRequiresDiscountCode</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("previousValue")
    public Boolean getPreviousValue();

    @NotNull
    @JsonProperty("nextValue")
    public Boolean getNextValue();

    public void setChange(final String change);

    public void setPreviousValue(final Boolean previousValue);

    public void setNextValue(final Boolean nextValue);

    public static ChangeRequiresDiscountCodeChange of() {
        return new ChangeRequiresDiscountCodeChangeImpl();
    }

    public static ChangeRequiresDiscountCodeChange of(final ChangeRequiresDiscountCodeChange template) {
        ChangeRequiresDiscountCodeChangeImpl instance = new ChangeRequiresDiscountCodeChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static ChangeRequiresDiscountCodeChangeBuilder builder() {
        return ChangeRequiresDiscountCodeChangeBuilder.of();
    }

    public static ChangeRequiresDiscountCodeChangeBuilder builder(final ChangeRequiresDiscountCodeChange template) {
        return ChangeRequiresDiscountCodeChangeBuilder.of(template);
    }

    default <T> T withChangeRequiresDiscountCodeChange(Function<ChangeRequiresDiscountCodeChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChangeRequiresDiscountCodeChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeRequiresDiscountCodeChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeRequiresDiscountCodeChange>";
            }
        };
    }
}
