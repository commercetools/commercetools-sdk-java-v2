
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = UnpublishChangeImpl.class)
public interface UnpublishChange extends Change {

    String UNPUBLISH_CHANGE = "UnpublishChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @JsonProperty("change")
    public String getChange();

    public void setChange(final String change);

    public static UnpublishChange of() {
        return new UnpublishChangeImpl();
    }

    public static UnpublishChange of(final UnpublishChange template) {
        UnpublishChangeImpl instance = new UnpublishChangeImpl();
        instance.setChange(template.getChange());
        return instance;
    }

    public static UnpublishChangeBuilder builder() {
        return UnpublishChangeBuilder.of();
    }

    public static UnpublishChangeBuilder builder(final UnpublishChange template) {
        return UnpublishChangeBuilder.of(template);
    }

    default <T> T withUnpublishChange(Function<UnpublishChange, T> helper) {
        return helper.apply(this);
    }
}
