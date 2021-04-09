
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.change_value.FieldDefinitionOrderValue;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeFieldDefinitionOrderChangeImpl.class)
public interface ChangeFieldDefinitionOrderChange extends Change {

    String CHANGE_FIELD_DEFINITION_ORDER_CHANGE = "ChangeFieldDefinitionOrderChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>changeFieldDefinitionOrder</code> on types</p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public List<FieldDefinitionOrderValue> getPreviousValue();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public List<FieldDefinitionOrderValue> getNextValue();

    public void setChange(final String change);

    @JsonIgnore
    public void setPreviousValue(final FieldDefinitionOrderValue... previousValue);

    public void setPreviousValue(final List<FieldDefinitionOrderValue> previousValue);

    @JsonIgnore
    public void setNextValue(final FieldDefinitionOrderValue... nextValue);

    public void setNextValue(final List<FieldDefinitionOrderValue> nextValue);

    public static ChangeFieldDefinitionOrderChange of() {
        return new ChangeFieldDefinitionOrderChangeImpl();
    }

    public static ChangeFieldDefinitionOrderChange of(final ChangeFieldDefinitionOrderChange template) {
        ChangeFieldDefinitionOrderChangeImpl instance = new ChangeFieldDefinitionOrderChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static ChangeFieldDefinitionOrderChangeBuilder builder() {
        return ChangeFieldDefinitionOrderChangeBuilder.of();
    }

    public static ChangeFieldDefinitionOrderChangeBuilder builder(final ChangeFieldDefinitionOrderChange template) {
        return ChangeFieldDefinitionOrderChangeBuilder.of(template);
    }

    default <T> T withChangeFieldDefinitionOrderChange(Function<ChangeFieldDefinitionOrderChange, T> helper) {
        return helper.apply(this);
    }
}
