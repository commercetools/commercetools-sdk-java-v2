
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
import jakarta.validation.constraints.NotNull;

/**
 * TypeChangeNameAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     TypeChangeNameAction typeChangeNameAction = TypeChangeNameAction.builder()
 *             .name(nameBuilder -> nameBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changeName")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = TypeChangeNameActionImpl.class)
public interface TypeChangeNameAction extends TypeUpdateAction {

    /**
     * discriminator value for TypeChangeNameAction
     */
    String CHANGE_NAME = "changeName";

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @return name
     */
    @NotNull
    @Valid
    @JsonProperty("name")
    public LocalizedString getName();

    /**
     *  <p>New value to set. Must not be empty.</p>
     * @param name value to be set
     */

    public void setName(final LocalizedString name);

    /**
     * factory method
     * @return instance of TypeChangeNameAction
     */
    public static TypeChangeNameAction of() {
        return new TypeChangeNameActionImpl();
    }

    /**
     * factory method to create a shallow copy TypeChangeNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static TypeChangeNameAction of(final TypeChangeNameAction template) {
        TypeChangeNameActionImpl instance = new TypeChangeNameActionImpl();
        instance.setName(template.getName());
        return instance;
    }

    public TypeChangeNameAction copyDeep();

    /**
     * factory method to create a deep copy of TypeChangeNameAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static TypeChangeNameAction deepCopy(@Nullable final TypeChangeNameAction template) {
        if (template == null) {
            return null;
        }
        TypeChangeNameActionImpl instance = new TypeChangeNameActionImpl();
        instance.setName(com.commercetools.api.models.common.LocalizedString.deepCopy(template.getName()));
        return instance;
    }

    /**
     * builder factory method for TypeChangeNameAction
     * @return builder
     */
    public static TypeChangeNameActionBuilder builder() {
        return TypeChangeNameActionBuilder.of();
    }

    /**
     * create builder for TypeChangeNameAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static TypeChangeNameActionBuilder builder(final TypeChangeNameAction template) {
        return TypeChangeNameActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withTypeChangeNameAction(Function<TypeChangeNameAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<TypeChangeNameAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<TypeChangeNameAction>() {
            @Override
            public String toString() {
                return "TypeReference<TypeChangeNameAction>";
            }
        };
    }
}
