
package com.commercetools.api.models.custom_object;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * CustomObjectDraft
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomObjectDraft customObjectDraft = CustomObjectDraft.builder()
 *             .container("{container}")
 *             .key("{key}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CustomObjectDraftImpl.class)
public interface CustomObjectDraft extends io.vrap.rmf.base.client.Draft<CustomObjectDraft> {

    /**
     *  <p>Namespace to group CustomObjects.</p>
     * @return container
     */
    @NotNull
    @JsonProperty("container")
    public String getContainer();

    /**
     *  <p>User-defined unique identifier of the CustomObject within the defined <code>container</code>.</p>
     * @return key
     */
    @NotNull
    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>JSON standard types Number, String, Boolean, Array, Object, and common API data types. For values of type Reference the integrity of the data is not guaranteed. If the referenced object is deleted, the API does not delete the corresponding reference to it and the <code>value</code> points to a non-existing object in such case.</p>
     * @return value
     */
    @NotNull
    @JsonProperty("value")
    public Object getValue();

    /**
     *  <p>Current version of the CustomObject.</p>
     * @return version
     */

    @JsonProperty("version")
    public Long getVersion();

    /**
     *  <p>Namespace to group CustomObjects.</p>
     * @param container value to be set
     */

    public void setContainer(final String container);

    /**
     *  <p>User-defined unique identifier of the CustomObject within the defined <code>container</code>.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     *  <p>JSON standard types Number, String, Boolean, Array, Object, and common API data types. For values of type Reference the integrity of the data is not guaranteed. If the referenced object is deleted, the API does not delete the corresponding reference to it and the <code>value</code> points to a non-existing object in such case.</p>
     * @param value value to be set
     */

    public void setValue(final Object value);

    /**
     *  <p>Current version of the CustomObject.</p>
     * @param version value to be set
     */

    public void setVersion(final Long version);

    /**
     * factory method
     * @return instance of CustomObjectDraft
     */
    public static CustomObjectDraft of() {
        return new CustomObjectDraftImpl();
    }

    /**
     * factory method to create a shallow copy CustomObjectDraft
     * @param template instance to be copied
     * @return copy instance
     */
    public static CustomObjectDraft of(final CustomObjectDraft template) {
        CustomObjectDraftImpl instance = new CustomObjectDraftImpl();
        instance.setContainer(template.getContainer());
        instance.setKey(template.getKey());
        instance.setValue(template.getValue());
        instance.setVersion(template.getVersion());
        return instance;
    }

    /**
     * factory method to create a deep copy of CustomObjectDraft
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CustomObjectDraft deepCopy(@Nullable final CustomObjectDraft template) {
        if (template == null) {
            return null;
        }
        CustomObjectDraftImpl instance = new CustomObjectDraftImpl();
        instance.setContainer(template.getContainer());
        instance.setKey(template.getKey());
        instance.setValue(template.getValue());
        instance.setVersion(template.getVersion());
        return instance;
    }

    /**
     * builder factory method for CustomObjectDraft
     * @return builder
     */
    public static CustomObjectDraftBuilder builder() {
        return CustomObjectDraftBuilder.of();
    }

    /**
     * create builder for CustomObjectDraft instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CustomObjectDraftBuilder builder(final CustomObjectDraft template) {
        return CustomObjectDraftBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCustomObjectDraft(Function<CustomObjectDraft, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CustomObjectDraft> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CustomObjectDraft>() {
            @Override
            public String toString() {
                return "TypeReference<CustomObjectDraft>";
            }
        };
    }
}
