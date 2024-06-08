
package com.commercetools.api.models.type;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.common.LocalizedString;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 * TypeSetDescriptionAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypeSetDescriptionAction typeSetDescriptionAction = TypeSetDescriptionAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TypeSetDescriptionActionImpl.class)
public interface TypeSetDescriptionAction extends TypeUpdateAction {

    /**
     * discriminator value for TypeSetDescriptionAction
     */
    String SET_DESCRIPTION = "setDescription";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return description
     */
    @Valid
    @JsonProperty("description")
    public LocalizedString getDescription();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param description value to be set
     */

    public void setDescription(final LocalizedString description);

    /**
     * factory method
     * @return instance of TypeSetDescriptionAction
     */
    public static TypeSetDescriptionAction of() {
        return new TypeSetDescriptionActionImpl();
    }

    /**
     * factory method to create a shallow copy TypeSetDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static TypeSetDescriptionAction of(final TypeSetDescriptionAction template) {
        TypeSetDescriptionActionImpl instance = new TypeSetDescriptionActionImpl();
        instance.setDescription(template.getDescription());
        return instance;
    }

    /**
     * factory method to create a deep copy of TypeSetDescriptionAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TypeSetDescriptionAction deepCopy(@Nullable final TypeSetDescriptionAction template) {
        if (template == null) {
            return null;
        }
        TypeSetDescriptionActionImpl instance = new TypeSetDescriptionActionImpl();
        instance.setDescription(
            com.commercetools.api.models.common.LocalizedString.deepCopy(template.getDescription()));
        return instance;
    }

    /**
     * builder factory method for TypeSetDescriptionAction
     * @return builder
     */
    public static TypeSetDescriptionActionBuilder builder() {
        return TypeSetDescriptionActionBuilder.of();
    }

    /**
     * create builder for TypeSetDescriptionAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TypeSetDescriptionActionBuilder builder(final TypeSetDescriptionAction template) {
        return TypeSetDescriptionActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTypeSetDescriptionAction(Function<TypeSetDescriptionAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TypeSetDescriptionAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TypeSetDescriptionAction>() {
            @Override
            public String toString() {
                return "TypeReference<TypeSetDescriptionAction>";
            }
        };
    }
}
