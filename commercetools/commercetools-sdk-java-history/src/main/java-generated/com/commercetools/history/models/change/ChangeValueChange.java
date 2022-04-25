
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.ChangeValueChangeValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeValueChangeImpl.class)
public interface ChangeValueChange extends Change {

    String CHANGE_VALUE_CHANGE = "ChangeValueChange";

    /**
    *  <p>Update action for <code>changeValue</code> on cart discounts and product discounts</p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public ChangeValueChangeValue getNextValue();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public ChangeValueChangeValue getPreviousValue();

    public void setChange(final String change);

    public void setNextValue(final ChangeValueChangeValue nextValue);

    public void setPreviousValue(final ChangeValueChangeValue previousValue);

    public static ChangeValueChange of() {
        return new ChangeValueChangeImpl();
    }

    public static ChangeValueChange of(final ChangeValueChange template) {
        ChangeValueChangeImpl instance = new ChangeValueChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static ChangeValueChangeBuilder builder() {
        return ChangeValueChangeBuilder.of();
    }

    public static ChangeValueChangeBuilder builder(final ChangeValueChange template) {
        return ChangeValueChangeBuilder.of(template);
    }

    default <T> T withChangeValueChange(Function<ChangeValueChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChangeValueChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeValueChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeValueChange>";
            }
        };
    }
}
