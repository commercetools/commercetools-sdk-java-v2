
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
@JsonDeserialize(as = SetMetaKeywordsChangeImpl.class)
public interface SetMetaKeywordsChange extends Change {

    String SET_META_KEYWORDS_CHANGE = "SetMetaKeywordsChange";

    @NotNull
    @JsonProperty("type")
    public String getType();

    /**
    *  <p>Shape of the action for <code>setMetaKeywords</code></p>
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

    public static SetMetaKeywordsChange of() {
        return new SetMetaKeywordsChangeImpl();
    }

    public static SetMetaKeywordsChange of(final SetMetaKeywordsChange template) {
        SetMetaKeywordsChangeImpl instance = new SetMetaKeywordsChangeImpl();
        instance.setChange(template.getChange());
        instance.setPreviousValue(template.getPreviousValue());
        instance.setNextValue(template.getNextValue());
        return instance;
    }

    public static SetMetaKeywordsChangeBuilder builder() {
        return SetMetaKeywordsChangeBuilder.of();
    }

    public static SetMetaKeywordsChangeBuilder builder(final SetMetaKeywordsChange template) {
        return SetMetaKeywordsChangeBuilder.of(template);
    }

    default <T> T withSetMetaKeywordsChange(Function<SetMetaKeywordsChange, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<SetMetaKeywordsChange> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<SetMetaKeywordsChange>() {
            @Override
            public String toString() {
                return "TypeReference<SetMetaKeywordsChange>";
            }
        };
    }
}
