
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = SetCartPredicateChangeImpl.class)
public interface SetCartPredicateChange extends Change {

    String SET_CART_PREDICATE_CHANGE = "SetCartPredicateChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>setCartPredicate</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("previousValue")
    public String getPreviousValue();

    @NotNull
    @JsonProperty("nextValue")
    public String getNextValue();

    public void setChange(final String change);

    public void setPreviousValue(final String previousValue);

    public void setNextValue(final String nextValue);

    public static SetCartPredicateChange of() {
        return new SetCartPredicateChangeImpl();
    }

    public static SetCartPredicateChange of(final SetCartPredicateChange template) {
        SetCartPredicateChangeImpl instance = new SetCartPredicateChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetCartPredicateChangeBuilder builder() {
        return SetCartPredicateChangeBuilder.of();
    }

    public static SetCartPredicateChangeBuilder builder(final SetCartPredicateChange template) {
        return SetCartPredicateChangeBuilder.of(template);
    }

    default <T> T withSetCartPredicateChange(Function<SetCartPredicateChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetCartPredicateChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetCartPredicateChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetCartPredicateChange>";
            }
        };
    }
}
