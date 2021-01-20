
package com.commercetools.importapi.models.customfields;

import java.io.IOException;
import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import com.commercetools.importapi.models.common.KeyReference;
import com.commercetools.importapi.models.customfields.CustomField;
import com.commercetools.importapi.models.customfields.ReferenceFieldImpl;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.Accessor;
import io.vrap.rmf.base.client.utils.Generated;

/**
*  <p>A field with a reference value.</p>
*/
@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ReferenceFieldImpl.class)
public interface ReferenceField extends CustomField {

    /**
    *  <p>References a resource by its key.</p>
    */
    @NotNull
    @Valid
    @JsonProperty("value")
    public KeyReference getValue();

    public void setValue(final KeyReference value);

    public static ReferenceField of() {
        return new ReferenceFieldImpl();
    }

    public static ReferenceField of(final ReferenceField template) {
        ReferenceFieldImpl instance = new ReferenceFieldImpl();
        instance.setValue(template.getValue());
        return instance;
    }

    public static ReferenceFieldBuilder builder() {
        return ReferenceFieldBuilder.of();
    }

    public static ReferenceFieldBuilder builder(final ReferenceField template) {
        return ReferenceFieldBuilder.of(template);
    }

    default <T> T withReferenceField(Function<ReferenceField, T> helper) {
        return helper.apply(this);
    }
}
