
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeAttributeOrderByNameChangeImpl.class)
public interface ChangeAttributeOrderByNameChange extends Change {

    String CHANGE_ATTRIBUTE_ORDER_BY_NAME_CHANGE = "ChangeAttributeOrderByNameChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>changeAttributeOrderByName</code> on product types</p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @JsonProperty("previousValue")
    public List<String> getPreviousValue();

    @NotNull
    @JsonProperty("nextValue")
    public List<String> getNextValue();

    public void setChange(final String change);

    @JsonIgnore
    public void setPreviousValue(final String... previousValue);

    public void setPreviousValue(final List<String> previousValue);

    @JsonIgnore
    public void setNextValue(final String... nextValue);

    public void setNextValue(final List<String> nextValue);

    public static ChangeAttributeOrderByNameChange of() {
        return new ChangeAttributeOrderByNameChangeImpl();
    }

    public static ChangeAttributeOrderByNameChange of(final ChangeAttributeOrderByNameChange template) {
        ChangeAttributeOrderByNameChangeImpl instance = new ChangeAttributeOrderByNameChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static ChangeAttributeOrderByNameChangeBuilder builder() {
        return ChangeAttributeOrderByNameChangeBuilder.of();
    }

    public static ChangeAttributeOrderByNameChangeBuilder builder(final ChangeAttributeOrderByNameChange template) {
        return ChangeAttributeOrderByNameChangeBuilder.of(template);
    }

    default <T> T withChangeAttributeOrderByNameChange(Function<ChangeAttributeOrderByNameChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ChangeAttributeOrderByNameChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ChangeAttributeOrderByNameChange>() {
            @Override
            public String toString() {
                return "TypeReference<ChangeAttributeOrderByNameChange>";
            }
        };
    }
}
