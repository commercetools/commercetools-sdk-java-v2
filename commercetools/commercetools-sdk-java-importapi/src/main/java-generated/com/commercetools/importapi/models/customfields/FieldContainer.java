
package com.commercetools.importapi.models.customfields;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>Maps the custom field names to the actual values.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = FieldContainerImpl.class)
public interface FieldContainer {

    /**
    *  <p>Mapping from the custom field name to the actual value.</p>
    */
    @NotNull
    @Valid
    @JsonAnyGetter
    public Map<String, CustomField> values();

    @JsonAnySetter
    public void setValue(String key, CustomField value);

    public static FieldContainer of() {
        return new FieldContainerImpl();
    }

    public static FieldContainer of(final FieldContainer template) {
        FieldContainerImpl instance = new FieldContainerImpl();
        return instance;
    }

    public static FieldContainerBuilder builder() {
        return FieldContainerBuilder.of();
    }

    public static FieldContainerBuilder builder(final FieldContainer template) {
        return FieldContainerBuilder.of(template);
    }

    default <T> T withFieldContainer(Function<FieldContainer, T> helper) {
        return helper.apply(this);
    }
}
