
package com.commercetools.history.models.change_value;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Shape of the value for <code>setValidFromAndUntil</code> action</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ValidFromAndUntilValueImpl.class)
public interface ValidFromAndUntilValue {

    @NotNull
    @JsonProperty("validFrom")
    public String getValidFrom();

    @NotNull
    @JsonProperty("validUntil")
    public String getValidUntil();

    public void setValidFrom(final String validFrom);

    public void setValidUntil(final String validUntil);

    public static ValidFromAndUntilValue of() {
        return new ValidFromAndUntilValueImpl();
    }

    public static ValidFromAndUntilValue of(final ValidFromAndUntilValue template) {
        ValidFromAndUntilValueImpl instance = new ValidFromAndUntilValueImpl();
        instance.setValidFrom(template.getValidFrom());
        instance.setValidUntil(template.getValidUntil());
        return instance;
    }

    public static ValidFromAndUntilValueBuilder builder() {
        return ValidFromAndUntilValueBuilder.of();
    }

    public static ValidFromAndUntilValueBuilder builder(final ValidFromAndUntilValue template) {
        return ValidFromAndUntilValueBuilder.of(template);
    }

    default <T> T withValidFromAndUntilValue(Function<ValidFromAndUntilValue, T> helper) {
        return helper.apply(this);
    }
}
