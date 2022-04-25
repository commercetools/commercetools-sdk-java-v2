
package com.commercetools.importapi.models.productvariants;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.TypedMoney;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>This type represents an attribute whose value is a set of money objects.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = MoneySetAttributeImpl.class)
public interface MoneySetAttribute extends Attribute {

    String MONEY_SET = "money-set";

    @NotNull
    @Valid
    @JsonProperty("value")
    public List<TypedMoney> getValue();

    @JsonIgnore
    public void setValue(final TypedMoney... value);

    public void setValue(final List<TypedMoney> value);

    public static MoneySetAttribute of() {
        return new MoneySetAttributeImpl();
    }

    public static MoneySetAttribute of(final MoneySetAttribute template) {
        MoneySetAttributeImpl instance = new MoneySetAttributeImpl();
        instance.setName(template.getName());
        instance.setValue(template.getValue());
        return instance;
    }

    public static MoneySetAttributeBuilder builder() {
        return MoneySetAttributeBuilder.of();
    }

    public static MoneySetAttributeBuilder builder(final MoneySetAttribute template) {
        return MoneySetAttributeBuilder.of(template);
    }

    default <T> T withMoneySetAttribute(Function<MoneySetAttribute, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<MoneySetAttribute> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<MoneySetAttribute>() {
            @Override
            public String toString() {
                return "TypeReference<MoneySetAttribute>";
            }
        };
    }
}
