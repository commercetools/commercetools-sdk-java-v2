
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.history.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ChangeSlugChangeImpl.class)
public interface ChangeSlugChange extends Change {

    String CHANGE_SLUG_CHANGE = "ChangeSlugChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>changeSlug</code></p>
    */
    @NotNull
    @JsonProperty("change")
    public String getChange();

    @NotNull
    @Valid
    @JsonProperty("previousValue")
    public LocalizedString getPreviousValue();

    @NotNull
    @Valid
    @JsonProperty("nextValue")
    public LocalizedString getNextValue();

    public void setChange(final String change);

    public void setPreviousValue(final LocalizedString previousValue);

    public void setNextValue(final LocalizedString nextValue);

    public static ChangeSlugChange of() {
        return new ChangeSlugChangeImpl();
    }

    public static ChangeSlugChange of(final ChangeSlugChange template) {
        ChangeSlugChangeImpl instance = new ChangeSlugChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static ChangeSlugChangeBuilder builder() {
        return ChangeSlugChangeBuilder.of();
    }

    public static ChangeSlugChangeBuilder builder(final ChangeSlugChange template) {
        return ChangeSlugChangeBuilder.of(template);
    }

    default <T> T withChangeSlugChange(Function<ChangeSlugChange, T> helper) {
        return helper.apply(this);
    }
}
