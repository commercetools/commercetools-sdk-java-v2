
package com.commercetools.importapi.models.customfields;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>A field with a money set value.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MoneySetFieldImpl.class)
public interface MoneySetField extends CustomField {

    String MONEY_SET = "MoneySet";

    @NotNull
    @Valid
    @JsonProperty("value")
    public List<Money> getValue();

    @JsonIgnore
    public void setValue(final Money... value);

    public void setValue(final List<Money> value);

    public static MoneySetField of() {
        return new MoneySetFieldImpl();
    }

    public static MoneySetField of(final MoneySetField template) {
        MoneySetFieldImpl instance = new MoneySetFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    public static MoneySetFieldBuilder builder() {
        return MoneySetFieldBuilder.of();
    }

    public static MoneySetFieldBuilder builder(final MoneySetField template) {
        return MoneySetFieldBuilder.of(template);
    }

    default <T> T withMoneySetField(Function<MoneySetField, T> helper) {
        return helper.apply(this);
    }
}
