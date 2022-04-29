
package com.commercetools.history.models.label;

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
@JsonDeserialize(as = LocalizedLabelImpl.class)
public interface LocalizedLabel extends Label {

    String LOCALIZED_LABEL = "LocalizedLabel";

    @NotNull
    @JsonProperty("type")
    public String getType();

    @NotNull
    @Valid
    @JsonProperty("value")
    public LocalizedString getValue();

    public void setValue(final LocalizedString value);

    public static LocalizedLabel of() {
        return new LocalizedLabelImpl();
    }

    public static LocalizedLabel of(final LocalizedLabel template) {
        LocalizedLabelImpl instance = new LocalizedLabelImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    public static LocalizedLabelBuilder builder() {
        return LocalizedLabelBuilder.of();
    }

    public static LocalizedLabelBuilder builder(final LocalizedLabel template) {
        return LocalizedLabelBuilder.of(template);
    }

    default <T> T withLocalizedLabel(Function<LocalizedLabel, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<LocalizedLabel> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<LocalizedLabel>() {
            @Override
            public String toString() {
                return "TypeReference<LocalizedLabel>";
            }
        };
    }
}
