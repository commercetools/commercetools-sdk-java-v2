
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeCartPredicateChangeImpl.class)
public interface ChangeCartPredicateChange extends Change {

    String CHANGE_CART_PREDICATE_CHANGE = "ChangeCartPredicateChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>changeCartPredicate</code></p>
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

    public static ChangeCartPredicateChange of() {
        return new ChangeCartPredicateChangeImpl();
    }

    public static ChangeCartPredicateChange of(final ChangeCartPredicateChange template) {
        ChangeCartPredicateChangeImpl instance = new ChangeCartPredicateChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static ChangeCartPredicateChangeBuilder builder() {
        return ChangeCartPredicateChangeBuilder.of();
    }

    public static ChangeCartPredicateChangeBuilder builder(final ChangeCartPredicateChange template) {
        return ChangeCartPredicateChangeBuilder.of(template);
    }

    default <T> T withChangeCartPredicateChange(Function<ChangeCartPredicateChange, T> helper) {
        return helper.apply(this);
    }
}
