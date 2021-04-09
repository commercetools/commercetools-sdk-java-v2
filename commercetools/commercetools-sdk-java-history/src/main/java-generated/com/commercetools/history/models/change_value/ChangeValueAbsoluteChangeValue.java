
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Money;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Shape of the value for cart discounts absolute value.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeValueAbsoluteChangeValueImpl.class)
public interface ChangeValueAbsoluteChangeValue extends ChangeValueChangeValue {

    String ABSOLUTE = "absolute";

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @Valid
    @JsonProperty("money")
    public List<Money> getMoney();

    @JsonIgnore
    public void setMoney(final Money... money);

    public void setMoney(final List<Money> money);

    public static ChangeValueAbsoluteChangeValue of() {
        return new ChangeValueAbsoluteChangeValueImpl();
    }

    public static ChangeValueAbsoluteChangeValue of(final ChangeValueAbsoluteChangeValue template) {
        ChangeValueAbsoluteChangeValueImpl instance = new ChangeValueAbsoluteChangeValueImpl();
        instance.setMoney(template.getMoney());
        return instance;
    }

    public static ChangeValueAbsoluteChangeValueBuilder builder() {
        return ChangeValueAbsoluteChangeValueBuilder.of();
    }

    public static ChangeValueAbsoluteChangeValueBuilder builder(final ChangeValueAbsoluteChangeValue template) {
        return ChangeValueAbsoluteChangeValueBuilder.of(template);
    }

    default <T> T withChangeValueAbsoluteChangeValue(Function<ChangeValueAbsoluteChangeValue, T> helper) {
        return helper.apply(this);
    }
}
