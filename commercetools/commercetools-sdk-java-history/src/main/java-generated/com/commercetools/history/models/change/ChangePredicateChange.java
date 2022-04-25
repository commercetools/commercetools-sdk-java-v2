
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangePredicateChangeImpl.class)
public interface ChangePredicateChange extends Change {

    String CHANGE_PREDICATE_CHANGE = "ChangePredicateChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>changePredicate</code></p>
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

    public static ChangePredicateChange of() {
        return new ChangePredicateChangeImpl();
    }

    public static ChangePredicateChange of(final ChangePredicateChange template) {
        ChangePredicateChangeImpl instance = new ChangePredicateChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static ChangePredicateChangeBuilder builder() {
        return ChangePredicateChangeBuilder.of();
    }

    public static ChangePredicateChangeBuilder builder(final ChangePredicateChange template) {
        return ChangePredicateChangeBuilder.of(template);
    }

    default <T> T withChangePredicateChange(Function<ChangePredicateChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChangePredicateChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangePredicateChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangePredicateChange>";
            }
        };
    }
}
