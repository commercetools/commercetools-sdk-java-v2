
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Reference;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeCartDiscountsChangeImpl.class)
public interface ChangeCartDiscountsChange extends Change {

    String CHANGE_CART_DISCOUNTS_CHANGE = "ChangeCartDiscountsChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>changeCartDiscounts</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public List<Reference> getPreviousValue();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public List<Reference> getNextValue();

    public void setChange(final String change);

    @JsonIgnore
    public void setPreviousValue(final Reference... previousValue);

    public void setPreviousValue(final List<Reference> previousValue);

    @JsonIgnore
    public void setNextValue(final Reference... nextValue);

    public void setNextValue(final List<Reference> nextValue);

    public static ChangeCartDiscountsChange of() {
        return new ChangeCartDiscountsChangeImpl();
    }

    public static ChangeCartDiscountsChange of(final ChangeCartDiscountsChange template) {
        ChangeCartDiscountsChangeImpl instance = new ChangeCartDiscountsChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static ChangeCartDiscountsChangeBuilder builder() {
        return ChangeCartDiscountsChangeBuilder.of();
    }

    public static ChangeCartDiscountsChangeBuilder builder(final ChangeCartDiscountsChange template) {
        return ChangeCartDiscountsChangeBuilder.of(template);
    }

    default <T> T withChangeCartDiscountsChange(Function<ChangeCartDiscountsChange, T> helper) {
        return helper.apply(this);
    }
}
