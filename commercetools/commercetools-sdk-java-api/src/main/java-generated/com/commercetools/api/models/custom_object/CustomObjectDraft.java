
package com.commercetools.api.models.custom_object;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = CustomObjectDraftImpl.class)
public interface CustomObjectDraft {

    /**
    *  <p>Namespace to group CustomObjects.</p>
    */
    @NotNull
    @JsonProperty("container")
    public String getContainer();

    /**
    *  <p>User-defined unique identifier of the CustomObject within the defined <code>container</code>.</p>
    */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
    *  <p>JSON standard types Number, String, Boolean, Array, Object, and <a href="/../api/types">common API data types</a>.
    *  For values of type <a href="ctp:api:type:Reference">Reference</a> the integrity of the data is not guaranteed.
    *  If the referenced object is deleted, the platform does not delete the corresponding reference to it and the <code>value</code> points to a non-existing object in such case.</p>
    */
    @NotNull
    @JsonProperty("value")
    public Object getValue();

    /**
    *  <p>Current version of the CustomObject.</p>
    */

    @JsonProperty("version")
    public Long getVersion();

    public void setContainer(final String container);

    public void setKey(final String key);

    public void setValue(final Object value);

    public void setVersion(final Long version);

    public static CustomObjectDraft of() {
        return new CustomObjectDraftImpl();
    }

    public static CustomObjectDraft of(final CustomObjectDraft template) {
        CustomObjectDraftImpl instance = new CustomObjectDraftImpl();
        instance.setContainer(template.getContainer());
        instance.setKey(template.getKey());
        instance.setValue(template.getValue());
        instance.setVersion(template.getVersion());
        return instance;
    }

    public static CustomObjectDraftBuilder builder() {
        return CustomObjectDraftBuilder.of();
    }

    public static CustomObjectDraftBuilder builder(final CustomObjectDraft template) {
        return CustomObjectDraftBuilder.of(template);
    }

    default <T> T withCustomObjectDraft(Function<CustomObjectDraft, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<CustomObjectDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomObjectDraft>() {
            @Override
            public String toString() {
                return "TypeReference<CustomObjectDraft>";
            }
        };
    }
}
