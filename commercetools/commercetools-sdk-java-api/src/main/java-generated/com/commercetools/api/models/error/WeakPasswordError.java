
package com.commercetools.api.models.error;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.WeakPasswordErrorImpl;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = WeakPasswordErrorImpl.class)
public interface WeakPasswordError extends ErrorObject {

    public static WeakPasswordError of() {
        return new WeakPasswordErrorImpl();
    }

    public static WeakPasswordError of(final WeakPasswordError template) {
        WeakPasswordErrorImpl instance = new WeakPasswordErrorImpl();
        instance.setMessage(template.getMessage());
        return instance;
    }

    public static WeakPasswordErrorBuilder builder() {
        return WeakPasswordErrorBuilder.of();
    }

    public static WeakPasswordErrorBuilder builder(final WeakPasswordError template) {
        return WeakPasswordErrorBuilder.of(template);
    }

    default <T> T withWeakPasswordError(Function<WeakPasswordError, T> helper) {
        return helper.apply(this);
    }
}
