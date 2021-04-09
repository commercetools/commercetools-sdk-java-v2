
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = VerifyEmailChangeImpl.class)
public interface VerifyEmailChange extends Change {

    String VERIFY_EMAIL_CHANGE = "VerifyEmailChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @JsonProperty("change")
    public String getChange();

    public void setChange(final String change);

    public static VerifyEmailChange of() {
        return new VerifyEmailChangeImpl();
    }

    public static VerifyEmailChange of(final VerifyEmailChange template) {
        VerifyEmailChangeImpl instance = new VerifyEmailChangeImpl();
        instance.setChange(template.getChange());
        return instance;
    }

    public static VerifyEmailChangeBuilder builder() {
        return VerifyEmailChangeBuilder.of();
    }

    public static VerifyEmailChangeBuilder builder(final VerifyEmailChange template) {
        return VerifyEmailChangeBuilder.of(template);
    }

    default <T> T withVerifyEmailChange(Function<VerifyEmailChange, T> helper) {
        return helper.apply(this);
    }
}
