
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.Transaction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = AddTransactionChangeImpl.class)
public interface AddTransactionChange extends Change {

    String ADD_TRANSACTION_CHANGE = "AddTransactionChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Update action for <code>addTransaction</code> on payments</p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public Transaction getNextValue();

    public void setChange(final String change);

    public void setNextValue(final Transaction nextValue);

    public static AddTransactionChange of() {
        return new AddTransactionChangeImpl();
    }

    public static AddTransactionChange of(final AddTransactionChange template) {
        AddTransactionChangeImpl instance = new AddTransactionChangeImpl();
        instance.setChange(template.getChange());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static AddTransactionChangeBuilder builder() {
        return AddTransactionChangeBuilder.of();
    }

    public static AddTransactionChangeBuilder builder(final AddTransactionChange template) {
        return AddTransactionChangeBuilder.of(template);
    }

    default <T> T withAddTransactionChange(Function<AddTransactionChange, T> helper) {
        return helper.apply(this);
    }
}
