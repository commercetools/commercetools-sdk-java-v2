
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeIsSearchableChangeImpl.class)
public interface ChangeIsSearchableChange extends Change {

    String CHANGE_IS_SEARCHABLE_CHANGE = "ChangeIsSearchableChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>changeIsSearchable</code> on product types</p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    /**
    *  <p>The name of the updated attribute.</p>
    */
    @NotNull
    @JsonProperty("attributeName")
    public String getAttributeName();

    @NotNull
    @JsonProperty("nextValue")
    public Boolean getNextValue();

    @NotNull
    @JsonProperty("previousValue")
    public Boolean getPreviousValue();

    public void setChange(final String change);

    public void setAttributeName(final String attributeName);

    public void setNextValue(final Boolean nextValue);

    public void setPreviousValue(final Boolean previousValue);

    public static ChangeIsSearchableChange of() {
        return new ChangeIsSearchableChangeImpl();
    }

    public static ChangeIsSearchableChange of(final ChangeIsSearchableChange template) {
        ChangeIsSearchableChangeImpl instance = new ChangeIsSearchableChangeImpl();
        instance.setChange(template.getChange());
        instance.setAttributeName(template.getAttributeName());
        instance.setNextValue(template.getNextValue());
        instance.setPreviousValue(template.getPreviousValue());
        return instance;
    }

    public static ChangeIsSearchableChangeBuilder builder() {
        return ChangeIsSearchableChangeBuilder.of();
    }

    public static ChangeIsSearchableChangeBuilder builder(final ChangeIsSearchableChange template) {
        return ChangeIsSearchableChangeBuilder.of(template);
    }

    default <T> T withChangeIsSearchableChange(Function<ChangeIsSearchableChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChangeIsSearchableChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeIsSearchableChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeIsSearchableChange>";
            }
        };
    }
}
